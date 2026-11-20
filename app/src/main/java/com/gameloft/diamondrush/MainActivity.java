package com.gameloft.diamondrush;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

import javax.microedition.lcdui.ResourceLoader;
import javax.microedition.lcdui.game.GameCanvas;

public class MainActivity extends Activity {
    private static final String TAG = "DiamondRush";
    private GameView gameView;
    private GloftDIRU midlet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Fullscreen & Keep Screen On
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        ResourceLoader.appContext = getApplicationContext();

        // Cleanup any 0-byte corrupted RMS files from previous runs
        try {
            java.io.File rmsDir = new java.io.File(getFilesDir(), "rms");
            if (rmsDir.exists()) {
                java.io.File[] stores = rmsDir.listFiles();
                if (stores != null) {
                    for (java.io.File store : stores) {
                        java.io.File rec1 = new java.io.File(store, "1.rec");
                        if (rec1.exists() && rec1.length() == 0) {
                            Log.w(TAG, "Deleting corrupted 0-byte record: " + rec1.getAbsolutePath());
                            rec1.delete();
                        }
                    }
                }
            }
        } catch (Exception ignored) {}

        gameView = new GameView(this);
        setContentView(gameView);

        // Launch Game in background thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.i(TAG, "Initializing GloftDIRU...");
                    midlet = new GloftDIRU();
                    Log.i(TAG, "Starting GloftDIRU.startApp()...");
                    midlet.startApp();
                    Log.i(TAG, "startApp() returned successfully.");
                } catch (Throwable t) {
                    Log.e(TAG, "FATAL Exception during game startup", t);
                }
            }
        }, "DiamondRushInitThread").start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (midlet != null) {
            midlet.pauseApp();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (midlet != null) {
            try {
                midlet.startApp();
            } catch (Exception ignored) {}
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (GameCanvas.currentInstance != null) {
            int j2meKey = mapPhysicalKey(keyCode);
            if (j2meKey != 0) {
                GameCanvas.currentInstance.keyPressed(j2meKey);
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (GameCanvas.currentInstance != null) {
            int j2meKey = mapPhysicalKey(keyCode);
            if (j2meKey != 0) {
                GameCanvas.currentInstance.keyReleased(j2meKey);
                return true;
            }
        }
        return super.onKeyUp(keyCode, event);
    }

    private int mapPhysicalKey(int keyCode) {
        switch (keyCode) {
            // Numbers 0-9 & Numpad
            case KeyEvent.KEYCODE_0:
            case KeyEvent.KEYCODE_NUMPAD_0:
                return 48; // '0'
            case KeyEvent.KEYCODE_1:
            case KeyEvent.KEYCODE_NUMPAD_1:
                return 49; // '1'
            case KeyEvent.KEYCODE_2:
            case KeyEvent.KEYCODE_NUMPAD_2:
            case KeyEvent.KEYCODE_DPAD_UP:
            case KeyEvent.KEYCODE_W:
                return 50; // '2' (UP)
            case KeyEvent.KEYCODE_3:
            case KeyEvent.KEYCODE_NUMPAD_3:
                return 51; // '3'
            case KeyEvent.KEYCODE_4:
            case KeyEvent.KEYCODE_NUMPAD_4:
            case KeyEvent.KEYCODE_DPAD_LEFT:
            case KeyEvent.KEYCODE_A:
                return 52; // '4' (LEFT)
            case KeyEvent.KEYCODE_5:
            case KeyEvent.KEYCODE_NUMPAD_5:
            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_BUTTON_A:
            case KeyEvent.KEYCODE_SPACE:
            case KeyEvent.KEYCODE_ENTER:
                return 53; // '5' (ACTION / OK / DIG)
            case KeyEvent.KEYCODE_6:
            case KeyEvent.KEYCODE_NUMPAD_6:
            case KeyEvent.KEYCODE_DPAD_RIGHT:
            case KeyEvent.KEYCODE_D:
                return 54; // '6' (RIGHT)
            case KeyEvent.KEYCODE_7:
            case KeyEvent.KEYCODE_NUMPAD_7:
                return 55; // '7' (UP-LEFT)
            case KeyEvent.KEYCODE_8:
            case KeyEvent.KEYCODE_NUMPAD_8:
            case KeyEvent.KEYCODE_DPAD_DOWN:
            case KeyEvent.KEYCODE_S:
                return 56; // '8' (DOWN)
            case KeyEvent.KEYCODE_9:
            case KeyEvent.KEYCODE_NUMPAD_9:
                return 57; // '9' (UP-RIGHT)

            // Star (*) and Pound (#)
            case KeyEvent.KEYCODE_STAR:
            case KeyEvent.KEYCODE_NUMPAD_MULTIPLY:
                return 42; // '*' (Tool swap / suicide restart)
            case KeyEvent.KEYCODE_POUND:
                return 35; // '#' (Map status / checklist)

            // Soft Keys
            case KeyEvent.KEYCODE_BUTTON_B:
            case KeyEvent.KEYCODE_BUTTON_SELECT:
            case KeyEvent.KEYCODE_Q:
            case KeyEvent.KEYCODE_F1:
                return -6; // SoftKey Left (Menu)
            case KeyEvent.KEYCODE_BACK:
            case KeyEvent.KEYCODE_BUTTON_START:
            case KeyEvent.KEYCODE_E:
            case KeyEvent.KEYCODE_F2:
                return -7; // SoftKey Right (Pause / Back)

            default:
                return 0;
        }
    }

    // Custom SurfaceView for game rendering and Touch Controls
    public static class GameView extends SurfaceView implements SurfaceHolder.Callback, Runnable {
        private SurfaceHolder holder;
        private Thread renderThread;
        private volatile boolean running = false;

        // Render paints
        private Paint bitmapPaint;
        private Paint frameBorderPaint;
        private Paint panelBgPaint;

        // Button paints
        private Paint btnNormalPaint;
        private Paint btnPressedPaint;
        private Paint btnDiamondPressedPaint;
        private Paint btnBorderPaint;
        private Paint btnBorderGlowPaint;
        private Paint textPaint;
        private Paint subTextPaint;
        private Paint iconPaint;
        private Paint iconAccentPaint;
        private Paint iconDiamondPaint;
        private Paint cheatModalPaint;
        private Paint cheatItemPaint;
        private Vibrator vibrator;

        // Control mode: 0 = Full 3x4 Numpad, 1 = Adventure D-Pad + Quick Numpad
        private int controlMode = 0;

        // Cheat Menu State
        private boolean showCheatModal = false;
        private String cheatNotification = null;
        private long cheatNotificationTime = 0;

        // Bounding boxes
        private RectF rectGame = new RectF();
        private RectF rectPanel = new RectF();
        private RectF rectModeSwitch = new RectF();
        private RectF rectCheatBtn = new RectF();

        // Cheat Modal Buttons
        private RectF rectCheatGodMode = new RectF();
        private RectF rectCheatMaxLives = new RectF();
        private RectF rectCheatDiamonds = new RectF();
        private RectF rectCheatSkip = new RectF();
        private RectF rectCheatUnlock = new RectF();
        private RectF rectCheatGameloft = new RectF();
        private RectF rectCheatClose = new RectF();
        private RectF rectCheatModalBox = new RectF();

        // Control Buttons
        private static final int ICON_NONE = 0;
        private static final int ICON_UP = 1;
        private static final int ICON_DOWN = 2;
        private static final int ICON_LEFT = 3;
        private static final int ICON_RIGHT = 4;
        private static final int ICON_UP_LEFT = 5;
        private static final int ICON_UP_RIGHT = 6;
        private static final int ICON_DIAMOND = 7;
        private static final int ICON_PICKAXE = 8;
        private static final int ICON_COMPASS = 9;
        private static final int ICON_MAP = 10;
        private static final int ICON_HAMMER = 11;
        private static final int ICON_BOMB = 12;
        private static final int ICON_MENU = 13;
        private static final int ICON_PAUSE = 14;

        public static class HudButton {
            public int keyCode;
            public String label;
            public String subLabel;
            public int iconType;
            public RectF rect = new RectF();
            public boolean isPressed = false;

            public HudButton(int keyCode, String label, String subLabel, int iconType) {
                this.keyCode = keyCode;
                this.label = label;
                this.subLabel = subLabel;
                this.iconType = iconType;
            }
        }

        // Active Buttons list
        private List<HudButton> buttons = new ArrayList<HudButton>();

        // Predefined Button definitions
        private HudButton btn1 = new HudButton(49, "1", "HAMMER", ICON_HAMMER);
        private HudButton btn2 = new HudButton(50, "2", "UP", ICON_UP);
        private HudButton btn3 = new HudButton(51, "3", "BOMB", ICON_BOMB);
        private HudButton btn4 = new HudButton(52, "4", "LEFT", ICON_LEFT);
        private HudButton btn5 = new HudButton(53, "5", "OK", ICON_DIAMOND);
        private HudButton btn6 = new HudButton(54, "6", "RIGHT", ICON_RIGHT);
        private HudButton btn7 = new HudButton(55, "7", "UL", ICON_UP_LEFT);
        private HudButton btn8 = new HudButton(56, "8", "DOWN", ICON_DOWN);
        private HudButton btn9 = new HudButton(57, "9", "UR", ICON_UP_RIGHT);
        private HudButton btnStar = new HudButton(42, "*", "RESTART", ICON_PICKAXE);
        private HudButton btn0 = new HudButton(48, "0", "COMPASS", ICON_COMPASS);
        private HudButton btnPound = new HudButton(35, "#", "MAP", ICON_MAP);

        private HudButton btnSoftLeft = new HudButton(-6, "MENU", "", ICON_MENU);
        private HudButton btnSoftRight = new HudButton(-7, "PAUSE", "", ICON_PAUSE);

        // Virtual Screen Tap Action
        private boolean isScreenTapPressed = false;

        public GameView(Context context) {
            super(context);
            holder = getHolder();
            holder.addCallback(this);

            bitmapPaint = new Paint();
            bitmapPaint.setFilterBitmap(false);

            frameBorderPaint = new Paint();
            frameBorderPaint.setColor(0xFFDAA520); // Aztec Gold Border
            frameBorderPaint.setStyle(Paint.Style.STROKE);
            frameBorderPaint.setStrokeWidth(4f);

            panelBgPaint = new Paint();
            panelBgPaint.setColor(0x66101622); // Semi-transparent obsidian tint
            panelBgPaint.setStyle(Paint.Style.FILL);

            // Button Fill: Semi-transparent temple stone glassmorphism (transparan ~45%)
            btnNormalPaint = new Paint();
            btnNormalPaint.setColor(0x66222838);
            btnNormalPaint.setStyle(Paint.Style.FILL);

            // Button Pressed Fill: Glowing temple gold
            btnPressedPaint = new Paint();
            btnPressedPaint.setColor(0x99FFA000);
            btnPressedPaint.setStyle(Paint.Style.FILL);

            // Diamond Center Button Pressed: Glowing Cyan Diamond
            btnDiamondPressedPaint = new Paint();
            btnDiamondPressedPaint.setColor(0xAA00E5FF);
            btnDiamondPressedPaint.setStyle(Paint.Style.FILL);

            // Button Border: Ancient Temple Gold trim
            btnBorderPaint = new Paint();
            btnBorderPaint.setColor(0xCCDAA520);
            btnBorderPaint.setStyle(Paint.Style.STROKE);
            btnBorderPaint.setStrokeWidth(3f);

            btnBorderGlowPaint = new Paint();
            btnBorderGlowPaint.setColor(0xFFFFE57F);
            btnBorderGlowPaint.setStyle(Paint.Style.STROKE);
            btnBorderGlowPaint.setStrokeWidth(5f);

            textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            textPaint.setColor(0xFFFFF8E1); // Bright warm ivory
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setFakeBoldText(true);

            subTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            subTextPaint.setColor(0xFFFFD54F); // Gold amber
            subTextPaint.setTextAlign(Paint.Align.CENTER);
            subTextPaint.setTextSize(20f);

            iconPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            iconPaint.setColor(0xFFFFD54F);
            iconPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            iconPaint.setStrokeWidth(3f);

            iconAccentPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            iconAccentPaint.setColor(0xFFFF5252);
            iconAccentPaint.setStyle(Paint.Style.FILL_AND_STROKE);

            iconDiamondPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            iconDiamondPaint.setColor(0xFF00E5FF);
            iconDiamondPaint.setStyle(Paint.Style.FILL);

            cheatModalPaint = new Paint();
            cheatModalPaint.setColor(0xEE121824); // Frosted temple modal
            cheatModalPaint.setStyle(Paint.Style.FILL);

            cheatItemPaint = new Paint();
            cheatItemPaint.setColor(0x88243048);
            cheatItemPaint.setStyle(Paint.Style.FILL);

            vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);

            // Collect all buttons
            buttons.add(btnSoftLeft);
            buttons.add(btnSoftRight);
            buttons.add(btn1);
            buttons.add(btn2);
            buttons.add(btn3);
            buttons.add(btn4);
            buttons.add(btn5);
            buttons.add(btn6);
            buttons.add(btn7);
            buttons.add(btn8);
            buttons.add(btn9);
            buttons.add(btnStar);
            buttons.add(btn0);
            buttons.add(btnPound);
        }

        @Override
        public void surfaceCreated(SurfaceHolder h) {
            running = true;
            renderThread = new Thread(this, "GameRenderThread");
            renderThread.start();
        }

        @Override
        public void surfaceChanged(SurfaceHolder h, int format, int width, int height) {
            layoutControls(width, height);
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder h) {
            running = false;
            try {
                renderThread.join();
            } catch (Exception ignored) {}
        }

        private void layoutControls(int w, int h) {
            if (w <= 0 || h <= 0) return;

            // Target aspect ratio for game: 240x320 QVGA (0.75)
            int origW = 240;
            int origH = 320;

            // Top ~46% of height for the game canvas
            float maxGameH = h * 0.46f;
            float scale = Math.min((float) (w * 0.96f) / origW, maxGameH / origH);

            float renderW = origW * scale;
            float renderH = origH * scale;
            float gameLeft = (w - renderW) / 2f;
            float gameTop = 14f;

            rectGame.set(gameLeft, gameTop, gameLeft + renderW, gameTop + renderH);

            // Controller panel sits below the game screen
            float panelTop = gameTop + renderH + 8f;
            float panelBottom = h - 8f;
            rectPanel.set(8f, panelTop, w - 8f, panelBottom);

            float panelW = rectPanel.width();
            float panelH = rectPanel.height();

            // Header row in HUD (4 Items):
            // [ 📜 MENU ]  [ ⚡ CHEAT ]  [ 🔢 NUMPAD ]  [ ⏸ PAUSE ]
            float headerH = Math.min(panelH * 0.125f, 62f);
            float gap = 6f;
            float colW = (panelW - (gap * 5)) / 4f;
            float headerY = panelTop + 6f;

            btnSoftLeft.rect.set(rectPanel.left + gap, headerY, rectPanel.left + gap + colW, headerY + headerH);
            rectCheatBtn.set(rectPanel.left + gap * 2 + colW, headerY, rectPanel.left + gap * 2 + colW * 2, headerY + headerH);
            rectModeSwitch.set(rectPanel.left + gap * 3 + colW * 2, headerY, rectPanel.left + gap * 3 + colW * 3, headerY + headerH);
            btnSoftRight.rect.set(rectPanel.left + gap * 4 + colW * 3, headerY, rectPanel.left + gap * 4 + colW * 4, headerY + headerH);

            // Keypad area below header
            float gridTop = headerY + headerH + 8f;
            float gridH = panelBottom - gridTop;
            float gridW = panelW;

            if (controlMode == 0) {
                // ==========================================
                // MODE 0: FULL 3x4 ADVENTURE NUMPAD
                // ==========================================
                float gapX = 8f;
                float gapY = 8f;
                float cellW = (gridW - (gapX * 4)) / 3f;
                float cellH = (gridH - (gapY * 5)) / 4f;

                HudButton[][] grid = new HudButton[][] {
                    { btn1, btn2, btn3 },
                    { btn4, btn5, btn6 },
                    { btn7, btn8, btn9 },
                    { btnStar, btn0, btnPound }
                };

                for (int r = 0; r < 4; r++) {
                    for (int c = 0; c < 3; c++) {
                        float left = rectPanel.left + gapX + c * (cellW + gapX);
                        float top = gridTop + gapY + r * (cellH + gapY);
                        grid[r][c].rect.set(left, top, left + cellW, top + cellH);
                    }
                }
            } else {
                // ==========================================
                // MODE 1: ADVENTURE D-PAD + QUICK NUMPAD
                // ==========================================
                float dpadW = gridW * 0.52f;
                float btnSize = Math.min(dpadW / 3.1f, gridH / 3.2f);
                float dpadCenterX = rectPanel.left + dpadW * 0.48f;
                float dpadCenterY = gridTop + gridH * 0.52f;

                btn2.rect.set(dpadCenterX - btnSize / 2, dpadCenterY - btnSize * 1.5f,
                              dpadCenterX + btnSize / 2, dpadCenterY - btnSize * 0.5f);
                btn8.rect.set(dpadCenterX - btnSize / 2, dpadCenterY + btnSize * 0.5f,
                              dpadCenterX + btnSize / 2, dpadCenterY + btnSize * 1.5f);
                btn4.rect.set(dpadCenterX - btnSize * 1.5f, dpadCenterY - btnSize / 2,
                              dpadCenterX - btnSize * 0.5f, dpadCenterY + btnSize / 2);
                btn6.rect.set(dpadCenterX + btnSize * 0.5f, dpadCenterY - btnSize / 2,
                              dpadCenterX + btnSize * 1.5f, dpadCenterY + btnSize / 2);

                btn7.rect.set(dpadCenterX - btnSize * 1.5f, dpadCenterY - btnSize * 1.5f,
                              dpadCenterX - btnSize * 0.55f, dpadCenterY - btnSize * 0.55f);
                btn9.rect.set(dpadCenterX + btnSize * 0.55f, dpadCenterY - btnSize * 1.5f,
                              dpadCenterX + btnSize * 1.5f, dpadCenterY - btnSize * 0.55f);

                float rightW = gridW - dpadW;
                float actionCenterX = rectPanel.left + dpadW + rightW * 0.48f;
                float actionCenterY = dpadCenterY + btnSize * 0.15f;
                float actionR = btnSize * 1.15f;
                btn5.rect.set(actionCenterX - actionR, actionCenterY - actionR,
                              actionCenterX + actionR, actionCenterY + actionR);

                float toolW = (rightW - 16f) / 3f;
                float toolH = btnSize * 0.65f;
                float toolY = gridTop + 4f;

                btn1.rect.set(actionCenterX - toolW * 1.5f - 4f, toolY, actionCenterX - toolW * 0.5f - 4f, toolY + toolH);
                btnStar.rect.set(actionCenterX - toolW * 0.5f, toolY, actionCenterX + toolW * 0.5f, toolY + toolH);
                btn3.rect.set(actionCenterX + toolW * 0.5f + 4f, toolY, actionCenterX + toolW * 1.5f + 4f, toolY + toolH);

                float bottomToolY = actionCenterY + actionR + 10f;
                btn0.rect.set(actionCenterX - toolW * 1.1f, bottomToolY, actionCenterX - 6f, bottomToolY + toolH);
                btnPound.rect.set(actionCenterX + 6f, bottomToolY, actionCenterX + toolW * 1.1f, bottomToolY + toolH);
            }

            // Layout Cheat Modal
            float modalW = Math.min(w * 0.92f, 520f);
            float modalH = Math.min(h * 0.65f, 540f);
            float modalLeft = (w - modalW) / 2f;
            float modalTop = (h - modalH) / 2f;
            rectCheatModalBox.set(modalLeft, modalTop, modalLeft + modalW, modalTop + modalH);

            float itemH = (modalH - 100f) / 6f;
            float curY = modalTop + 55f;
            float padX = 20f;
            float curW = modalW - padX * 2;

            rectCheatGodMode.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 8f); curY += itemH;
            rectCheatMaxLives.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 8f); curY += itemH;
            rectCheatDiamonds.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 8f); curY += itemH;
            rectCheatSkip.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 8f); curY += itemH;
            rectCheatUnlock.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 8f); curY += itemH;
            rectCheatGameloft.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 8f); curY += itemH;
            rectCheatClose.set(modalLeft + padX * 2, modalTop + modalH - 42f, modalLeft + modalW - padX * 2, modalTop + modalH - 8f);
        }

        @Override
        public void run() {
            while (running) {
                Canvas c = null;
                try {
                    c = holder.lockCanvas();
                    if (c != null) {
                        renderGame(c);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (c != null) {
                        try {
                            holder.unlockCanvasAndPost(c);
                        } catch (Exception ignored) {}
                    }
                }

                try {
                    Thread.sleep(16); // ~60 FPS
                } catch (InterruptedException ignored) {}
            }
        }

        private void renderGame(Canvas c) {
            c.drawColor(0xFF0A0E17); // Dark temple backdrop

            int screenW = getWidth();
            int screenH = getHeight();
            if (rectGame.isEmpty() && screenW > 0 && screenH > 0) {
                layoutControls(screenW, screenH);
            }

            // Draw game screen backing & Aztec gold border
            Paint blackPaint = new Paint();
            blackPaint.setColor(0xFF000000);
            c.drawRect(rectGame, blackPaint);
            c.drawRect(rectGame, frameBorderPaint);

            // Double-buffer thread-safe copy: eliminates tearing & flickering 100%
            synchronized (GameCanvas.renderLock) {
                Bitmap gameBmp = GameCanvas.displayBitmap;
                if (gameBmp != null) {
                    Rect srcRect = new Rect(0, 0, gameBmp.getWidth(), gameBmp.getHeight());
                    c.drawBitmap(gameBmp, srcRect, rectGame, bitmapPaint);
                }
            }

            // Draw HUD Panel background
            c.drawRoundRect(rectPanel, 16, 16, panelBgPaint);

            // Draw Cheat Button (⚡ CHEAT)
            drawHeaderButton(c, rectCheatBtn, "⚡ CHEAT", 0xFFFFD700);

            // Draw Mode Switch Button (🔢 NUMPAD / 🎮 D-PAD)
            String modeStr = (controlMode == 0) ? "🔢 NUM" : "🎮 DPAD";
            drawHeaderButton(c, rectModeSwitch, modeStr, 0xFF00E5FF);

            // Draw All Active Touch Buttons
            for (HudButton b : buttons) {
                if (!b.rect.isEmpty()) {
                    drawHudButton(c, b);
                }
            }

            // Draw Cheat Notification Toast if active
            if (cheatNotification != null && System.currentTimeMillis() - cheatNotificationTime < 2500) {
                Paint toastBg = new Paint();
                toastBg.setColor(0xDD00E5FF);
                RectF toastRect = new RectF(rectGame.centerX() - 170, rectGame.top + 20, rectGame.centerX() + 170, rectGame.top + 70);
                c.drawRoundRect(toastRect, 12, 12, toastBg);
                Paint toastText = new Paint(Paint.ANTI_ALIAS_FLAG);
                toastText.setColor(0xFF0A121E);
                toastText.setTextSize(26);
                toastText.setFakeBoldText(true);
                toastText.setTextAlign(Paint.Align.CENTER);
                c.drawText(cheatNotification, toastRect.centerX(), toastRect.centerY() + 9, toastText);
            }

            // Draw Cheat Modal Overlay if open
            if (showCheatModal) {
                drawCheatModal(c);
            }
        }

        private void drawHeaderButton(Canvas c, RectF r, String label, int accentColor) {
            c.drawRoundRect(r, 12, 12, btnNormalPaint);
            Paint border = new Paint(btnBorderPaint);
            border.setColor(accentColor);
            c.drawRoundRect(r, 12, 12, border);

            textPaint.setTextSize(Math.max(18f, r.height() * 0.38f));
            float ty = r.centerY() - (textPaint.descent() + textPaint.ascent()) / 2f;
            c.drawText(label, r.centerX(), ty, textPaint);
        }

        private void drawCheatModal(Canvas c) {
            // Dark scrim background
            c.drawColor(0xBB000000);

            // Modal Box
            c.drawRoundRect(rectCheatModalBox, 20, 20, cheatModalPaint);
            c.drawRoundRect(rectCheatModalBox, 20, 20, frameBorderPaint);

            // Title
            textPaint.setTextSize(32f);
            textPaint.setColor(0xFFFFD700);
            c.drawText("👑 CHEAT MENU RAHASIA", rectCheatModalBox.centerX(), rectCheatModalBox.top + 38f, textPaint);
            textPaint.setColor(0xFFFFF8E1);

            // Cheat Options
            drawCheatOption(c, rectCheatGodMode, class_8.cheatGodMode ? "🛡️ GOD MODE: [ AKTIF ]" : "🛡️ GOD MODE: [ MATI ]", class_8.cheatGodMode);
            drawCheatOption(c, rectCheatMaxLives, "❤️ 99 LIVES & MAX POTION", false);
            drawCheatOption(c, rectCheatDiamonds, "💎 100% DIAMONDS LEVEL", false);
            drawCheatOption(c, rectCheatSkip, "⏩ SKIP / TAMATKAN LEVEL", false);
            drawCheatOption(c, rectCheatUnlock, "🗺️ UNLOCK SEMUA DUNIA", false);
            drawCheatOption(c, rectCheatGameloft, "⚙️ GAMELOFT DEV MENU", false);

            // Close button
            drawHeaderButton(c, rectCheatClose, "✖️ TUTUP MENU", 0xFFFF5252);
        }

        private void drawCheatOption(Canvas c, RectF r, String label, boolean active) {
            Paint fill = new Paint(cheatItemPaint);
            if (active) fill.setColor(0xAA009688);
            c.drawRoundRect(r, 10, 10, fill);
            c.drawRoundRect(r, 10, 10, active ? btnBorderGlowPaint : btnBorderPaint);

            textPaint.setTextSize(r.height() * 0.44f);
            float ty = r.centerY() - (textPaint.descent() + textPaint.ascent()) / 2f;
            c.drawText(label, r.centerX(), ty, textPaint);
        }

        private void drawHudButton(Canvas c, HudButton b) {
            RectF r = b.rect;
            if (r.isEmpty()) return;

            boolean isPressed = b.isPressed;
            boolean isDiamond = (b.iconType == ICON_DIAMOND);

            // Paint fill
            Paint fillPaint;
            if (isPressed) {
                fillPaint = isDiamond ? btnDiamondPressedPaint : btnPressedPaint;
            } else {
                fillPaint = btnNormalPaint;
            }

            c.drawRoundRect(r, 14, 14, fillPaint);
            c.drawRoundRect(r, 14, 14, isPressed ? btnBorderGlowPaint : btnBorderPaint);

            // Draw decorative Aztec corner accents
            drawCornerAccents(c, r);

            // Draw Icon & Labels
            float cx = r.centerX();
            float cy = r.centerY();
            float iconSize = Math.min(r.width(), r.height()) * 0.45f;

            switch (b.iconType) {
                case ICON_DIAMOND:
                    drawGleamingDiamond(c, cx, cy, iconSize * 1.25f, isPressed);
                    break;
                case ICON_PICKAXE:
                    drawPickaxeIcon(c, cx, cy - 4f, iconSize);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize);
                    break;
                case ICON_BOMB:
                    drawBombIcon(c, cx, cy - 4f, iconSize);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize);
                    break;
                case ICON_HAMMER:
                    drawHammerIcon(c, cx, cy - 4f, iconSize);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize);
                    break;
                case ICON_COMPASS:
                    drawCompassIcon(c, cx, cy - 4f, iconSize);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize);
                    break;
                case ICON_MAP:
                    drawMapIcon(c, cx, cy - 4f, iconSize);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize);
                    break;
                case ICON_UP:
                    drawArrowRune(c, cx, cy - 4f, iconSize, 0);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize);
                    break;
                case ICON_DOWN:
                    drawArrowRune(c, cx, cy - 4f, iconSize, 180);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize);
                    break;
                case ICON_LEFT:
                    drawArrowRune(c, cx, cy - 4f, iconSize, 270);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize);
                    break;
                case ICON_RIGHT:
                    drawArrowRune(c, cx, cy - 4f, iconSize, 90);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize);
                    break;
                case ICON_UP_LEFT:
                    drawArrowRune(c, cx, cy - 4f, iconSize * 0.85f, 315);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize * 0.85f);
                    break;
                case ICON_UP_RIGHT:
                    drawArrowRune(c, cx, cy - 4f, iconSize * 0.85f, 45);
                    drawButtonLabels(c, r, b.label, b.subLabel, iconSize * 0.85f);
                    break;
                case ICON_MENU:
                case ICON_PAUSE:
                    textPaint.setTextSize(Math.max(16f, r.height() * 0.38f));
                    float ty = cy - (textPaint.descent() + textPaint.ascent()) / 2f;
                    c.drawText(b.label, cx, ty, textPaint);
                    break;
                default:
                    textPaint.setTextSize(r.height() * 0.5f);
                    float dty = cy - (textPaint.descent() + textPaint.ascent()) / 2f;
                    c.drawText(b.label, cx, dty, textPaint);
                    break;
            }
        }

        private void drawCornerAccents(Canvas c, RectF r) {
            float len = 8f;
            Paint p = btnBorderPaint;
            // Top-left
            c.drawLine(r.left + 3, r.top + 7, r.left + 3 + len, r.top + 7, p);
            c.drawLine(r.left + 7, r.top + 3, r.left + 7, r.top + 3 + len, p);
            // Top-right
            c.drawLine(r.right - 3 - len, r.top + 7, r.right - 3, r.top + 7, p);
            c.drawLine(r.right - 7, r.top + 3, r.right - 7, r.top + 3 + len, p);
            // Bottom-left
            c.drawLine(r.left + 3, r.bottom - 7, r.left + 3 + len, r.bottom - 7, p);
            c.drawLine(r.left + 7, r.bottom - 3 - len, r.left + 7, r.bottom - 3, p);
            // Bottom-right
            c.drawLine(r.right - 3 - len, r.bottom - 7, r.right - 3, r.bottom - 7, p);
            c.drawLine(r.right - 7, r.bottom - 3 - len, r.right - 7, r.bottom - 3, p);
        }

        private void drawButtonLabels(Canvas c, RectF r, String label, String sub, float iconSize) {
            // Main number at bottom-right or corner
            textPaint.setTextSize(Math.max(18f, r.height() * 0.28f));
            float lx = r.right - 14f;
            float ly = r.bottom - 8f;
            textPaint.setTextAlign(Paint.Align.RIGHT);
            c.drawText(label, lx, ly, textPaint);
            textPaint.setTextAlign(Paint.Align.CENTER);

            // Sub text at bottom-left if available
            if (sub != null && sub.length() > 0) {
                subTextPaint.setTextSize(Math.max(14f, r.height() * 0.18f));
                subTextPaint.setTextAlign(Paint.Align.LEFT);
                c.drawText(sub, r.left + 12f, r.bottom - 8f, subTextPaint);
                subTextPaint.setTextAlign(Paint.Align.CENTER);
            }
        }

        // ==========================================
        // PROCEDURAL VECTOR ICONS - THEME GRAPHICS
        // ==========================================

        private void drawGleamingDiamond(Canvas c, float cx, float cy, float size, boolean pressed) {
            float r = size * 0.5f;

            Path path = new Path();
            path.moveTo(cx, cy - r);             // Top peak
            path.lineTo(cx + r * 0.9f, cy - r * 0.25f); // Upper right
            path.lineTo(cx, cy + r);             // Bottom tip
            path.lineTo(cx - r * 0.9f, cy - r * 0.25f); // Upper left
            path.close();

            iconDiamondPaint.setColor(pressed ? 0xFFFFFFFF : 0xFF00E5FF);
            c.drawPath(path, iconDiamondPaint);

            Paint linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            linePaint.setColor(0xFFE0F7FA);
            linePaint.setStyle(Paint.Style.STROKE);
            linePaint.setStrokeWidth(2.5f);

            c.drawLine(cx - r * 0.9f, cy - r * 0.25f, cx + r * 0.9f, cy - r * 0.25f, linePaint);
            c.drawLine(cx, cy - r, cx - r * 0.35f, cy - r * 0.25f, linePaint);
            c.drawLine(cx, cy - r, cx + r * 0.35f, cy - r * 0.25f, linePaint);
            c.drawLine(cx, cy + r, cx - r * 0.35f, cy - r * 0.25f, linePaint);
            c.drawLine(cx, cy + r, cx + r * 0.35f, cy - r * 0.25f, linePaint);

            textPaint.setTextSize(size * 0.35f);
            textPaint.setColor(0xFF003846);
            float ty = cy - (textPaint.descent() + textPaint.ascent()) / 2f + r * 0.2f;
            c.drawText("5 • OK", cx, ty, textPaint);
            textPaint.setColor(0xFFFFF8E1);
        }

        private void drawPickaxeIcon(Canvas c, float cx, float cy, float size) {
            float s = size * 0.45f;
            Paint p = iconPaint;
            p.setColor(0xFFFFD54F);
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(3.5f);

            c.drawLine(cx - s, cy + s, cx + s * 0.6f, cy - s * 0.6f, p);

            Path head = new Path();
            head.moveTo(cx + s * 0.1f, cy - s);
            head.quadTo(cx + s * 0.8f, cy - s * 0.8f, cx + s, cy - s * 0.1f);
            p.setColor(0xFFCFD8DC);
            c.drawPath(head, p);

            textPaint.setTextSize(size * 0.5f);
            c.drawText("*", cx - s * 0.8f, cy - s * 0.2f, textPaint);
        }

        private void drawBombIcon(Canvas c, float cx, float cy, float size) {
            float r = size * 0.32f;
            Paint p = iconPaint;
            p.setColor(0xFF37474F);
            p.setStyle(Paint.Style.FILL);
            c.drawCircle(cx, cy + r * 0.2f, r, p);

            p.setColor(0xFFFFB74D);
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(2.5f);
            c.drawLine(cx, cy - r * 0.8f, cx + r * 0.5f, cy - r * 1.3f, p);

            p.setColor(0xFFFF1744);
            p.setStyle(Paint.Style.FILL);
            c.drawCircle(cx + r * 0.5f, cy - r * 1.3f, 4f, p);
        }

        private void drawHammerIcon(Canvas c, float cx, float cy, float size) {
            float s = size * 0.4f;
            Paint p = iconPaint;
            p.setColor(0xFFFFB74D);
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(3.5f);
            c.drawLine(cx - s * 0.6f, cy + s, cx + s * 0.5f, cy - s * 0.2f, p);

            p.setColor(0xFF78909C);
            p.setStyle(Paint.Style.FILL_AND_STROKE);
            RectF head = new RectF(cx + s * 0.1f, cy - s * 0.8f, cx + s * 0.9f, cy + s * 0.1f);
            c.drawRoundRect(head, 4, 4, p);
        }

        private void drawCompassIcon(Canvas c, float cx, float cy, float size) {
            float r = size * 0.36f;
            Paint p = iconPaint;
            p.setColor(0xFFFFD54F);
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(2.5f);
            c.drawCircle(cx, cy, r, p);

            Path needle = new Path();
            needle.moveTo(cx, cy - r * 0.8f);
            needle.lineTo(cx + r * 0.3f, cy);
            needle.lineTo(cx, cy + r * 0.8f);
            needle.lineTo(cx - r * 0.3f, cy);
            needle.close();

            p.setColor(0xFFFF5252);
            p.setStyle(Paint.Style.FILL);
            c.drawPath(needle, p);
        }

        private void drawMapIcon(Canvas c, float cx, float cy, float size) {
            float w = size * 0.65f;
            float h = size * 0.5f;
            Paint p = iconPaint;
            p.setColor(0xFFFFE082);
            p.setStyle(Paint.Style.FILL_AND_STROKE);
            p.setStrokeWidth(2f);
            RectF scroll = new RectF(cx - w / 2, cy - h / 2, cx + w / 2, cy + h / 2);
            c.drawRoundRect(scroll, 6, 6, p);

            p.setColor(0xFF795548);
            c.drawLine(cx - w * 0.3f, cy, cx + w * 0.3f, cy, p);
            c.drawLine(cx, cy - h * 0.3f, cx, cy + h * 0.3f, p);
        }

        private void drawArrowRune(Canvas c, float cx, float cy, float size, float angleDeg) {
            c.save();
            c.rotate(angleDeg, cx, cy);

            float s = size * 0.35f;
            Path pth = new Path();
            pth.moveTo(cx, cy - s * 1.1f);
            pth.lineTo(cx + s * 0.8f, cy + s * 0.6f);
            pth.lineTo(cx, cy + s * 0.15f);
            pth.lineTo(cx - s * 0.8f, cy + s * 0.6f);
            pth.close();

            Paint p = iconPaint;
            p.setColor(0xFFFFD54F);
            p.setStyle(Paint.Style.FILL_AND_STROKE);
            p.setStrokeWidth(2f);
            c.drawPath(pth, p);

            c.restore();
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            int action = event.getActionMasked();
            int pointerCount = event.getPointerCount();

            // Handle touch if Cheat Modal is open
            if (showCheatModal) {
                if (action == MotionEvent.ACTION_DOWN) {
                    float tx = event.getX();
                    float ty = event.getY();

                    if (rectCheatGodMode.contains(tx, ty)) {
                        class_8.cheatGodMode = !class_8.cheatGodMode;
                        triggerVibrate();
                        showToast(class_8.cheatGodMode ? "GOD MODE: AKTIF" : "GOD MODE: NONAKTIF");
                        return true;
                    } else if (rectCheatMaxLives.contains(tx, ty)) {
                        class_8.applyCheatMaxLives();
                        triggerVibrate();
                        showToast("99 LIVES & TOOLS AKTIF!");
                        return true;
                    } else if (rectCheatDiamonds.contains(tx, ty)) {
                        class_8.applyCheatMaxDiamonds();
                        triggerVibrate();
                        showToast("100% DIAMONDS LEVEL!");
                        return true;
                    } else if (rectCheatSkip.contains(tx, ty)) {
                        class_8.applyCheatSkipLevel();
                        triggerVibrate();
                        showToast("LEVEL SELESAI (PASS)!");
                        showCheatModal = false;
                        return true;
                    } else if (rectCheatUnlock.contains(tx, ty)) {
                        class_8.applyCheatUnlockAllWorlds();
                        triggerVibrate();
                        showToast("SEMUA DUNIA TERBUKA!");
                        return true;
                    } else if (rectCheatGameloft.contains(tx, ty)) {
                        class_8.openGameloftCheatMenu();
                        triggerVibrate();
                        showToast("DEV CHEAT MENU AKTIF!");
                        showCheatModal = false;
                        return true;
                    } else if (rectCheatClose.contains(tx, ty) || !rectCheatModalBox.contains(tx, ty)) {
                        showCheatModal = false;
                        triggerVibrate();
                        return true;
                    }
                }
                return true;
            }

            if (GameCanvas.currentInstance == null) return true;

            // Check Mode switch & Cheat button on ACTION_DOWN
            if (action == MotionEvent.ACTION_DOWN) {
                float tx = event.getX();
                float ty = event.getY();
                if (rectCheatBtn.contains(tx, ty)) {
                    showCheatModal = true;
                    triggerVibrate();
                    return true;
                }
                if (rectModeSwitch.contains(tx, ty)) {
                    controlMode = (controlMode == 0) ? 1 : 0;
                    layoutControls(getWidth(), getHeight());
                    triggerVibrate();
                    return true;
                }
            }

            // Reset touch states for all active pointers
            boolean[] nextPressed = new boolean[buttons.size()];
            boolean nextScreenTap = false;

            if (action != MotionEvent.ACTION_UP && action != MotionEvent.ACTION_CANCEL) {
                for (int i = 0; i < pointerCount; i++) {
                    float px = event.getX(i);
                    float py = event.getY(i);

                    // Touch on game screen = Action 5 (OK / Dig / Jump)
                    if (rectGame.contains(px, py)) {
                        nextScreenTap = true;
                    }

                    // Touch on HUD buttons
                    for (int bIdx = 0; bIdx < buttons.size(); bIdx++) {
                        HudButton btn = buttons.get(bIdx);
                        if (!btn.rect.isEmpty() && btn.rect.contains(px, py)) {
                            nextPressed[bIdx] = true;
                        }
                    }
                }
            }

            // Dispatch Game Screen Tap as Key 5
            handleKeyChange(isScreenTapPressed, nextScreenTap, 53);
            isScreenTapPressed = nextScreenTap;

            // Dispatch Button key changes
            for (int bIdx = 0; bIdx < buttons.size(); bIdx++) {
                HudButton btn = buttons.get(bIdx);
                boolean wasPressed = btn.isPressed;
                boolean isNowPressed = nextPressed[bIdx];

                if (wasPressed != isNowPressed) {
                    btn.isPressed = isNowPressed;
                    handleKeyChange(wasPressed, isNowPressed, btn.keyCode);
                }
            }

            return true;
        }

        private void showToast(String msg) {
            cheatNotification = msg;
            cheatNotificationTime = System.currentTimeMillis();
        }

        private void triggerVibrate() {
            if (vibrator != null) {
                try { vibrator.vibrate(30); } catch (Exception ignored) {}
            }
        }

        private void handleKeyChange(boolean oldState, boolean newState, int keyCode) {
            if (GameCanvas.currentInstance == null) return;
            if (!oldState && newState) {
                GameCanvas.currentInstance.keyPressed(keyCode);
                if (vibrator != null) {
                    try { vibrator.vibrate(25); } catch (Exception ignored) {}
                }
            } else if (oldState && !newState) {
                GameCanvas.currentInstance.keyReleased(keyCode);
            }
        }
    }
}
