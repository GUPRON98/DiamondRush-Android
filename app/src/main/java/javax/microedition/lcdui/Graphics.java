package javax.microedition.lcdui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;

public class Graphics {
    public static final int HCENTER = 1;
    public static final int VCENTER = 2;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int TOP = 16;
    public static final int BOTTOM = 32;
    public static final int BASELINE = 64;

    public static final int SOLID = 0;
    public static final int DOTTED = 1;

    private Image image;
    private Canvas canvas;
    private Paint paint;
    private int currentColor = 0xFF000000;
    private int transX = 0;
    private int transY = 0;
    private Rect clipRect = new Rect(0, 0, 240, 320);
    private int baseSaveCount;

    public Graphics(Image img) {
        this.image = img;
        this.canvas = new Canvas(img.getBitmap());
        this.paint = new Paint();
        this.paint.setStyle(Paint.Style.FILL);
        this.clipRect.set(0, 0, img.getWidth(), img.getHeight());
        this.baseSaveCount = this.canvas.save();
    }

    public void setColor(int rgb) {
        this.currentColor = 0xFF000000 | (rgb & 0xFFFFFF);
        this.paint.setColor(this.currentColor);
    }

    public void setColor(int r, int g, int b) {
        setColor(((r & 0xFF) << 16) | ((g & 0xFF) << 8) | (b & 0xFF));
    }

    public int getColor() {
        return this.currentColor;
    }

    public void fillRect(int x, int y, int width, int height) {
        if (width <= 0 || height <= 0) return;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(currentColor);
        canvas.drawRect(x + transX, y + transY, x + transX + width, y + transY + height, paint);
    }

    public void drawRect(int x, int y, int width, int height) {
        if (width < 0 || height < 0) return;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(currentColor);
        canvas.drawRect(x + transX, y + transY, x + transX + width, y + transY + height, paint);
        paint.setStyle(Paint.Style.FILL);
    }

    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        drawRect(x, y, width, height);
    }

    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        fillRect(x, y, width, height);
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(currentColor);
        canvas.drawLine(x1 + transX, y1 + transY, x2 + transX, y2 + transY, paint);
        paint.setStyle(Paint.Style.FILL);
    }

    public void translate(int x, int y) {
        this.transX += x;
        this.transY += y;
    }

    public int getTranslateX() { return transX; }
    public int getTranslateY() { return transY; }

    public void setClip(int x, int y, int width, int height) {
        int left = x + transX;
        int top = y + transY;
        int right = left + width;
        int bottom = top + height;
        clipRect.set(left, top, right, bottom);

        try {
            canvas.restoreToCount(baseSaveCount);
            baseSaveCount = canvas.save();
            canvas.clipRect(left, top, right, bottom);
        } catch (Throwable ignored) {}
    }

    public void clipRect(int x, int y, int width, int height) {
        int left = x + transX;
        int top = y + transY;
        int right = left + width;
        int bottom = top + height;
        clipRect.intersect(left, top, right, bottom);

        try {
            canvas.restoreToCount(baseSaveCount);
            baseSaveCount = canvas.save();
            canvas.clipRect(clipRect.left, clipRect.top, clipRect.right, clipRect.bottom);
        } catch (Throwable ignored) {}
    }

    public int getClipX() { return clipRect.left - transX; }
    public int getClipY() { return clipRect.top - transY; }
    public int getClipWidth() { return clipRect.width(); }
    public int getClipHeight() { return clipRect.height(); }

    public void drawImage(Image img, int x, int y, int anchor) {
        if (img == null || img.getBitmap() == null) return;
        Bitmap b = img.getBitmap();
        int w = b.getWidth();
        int h = b.getHeight();

        int posX = x + transX;
        int posY = y + transY;

        if ((anchor & HCENTER) != 0) posX -= w / 2;
        else if ((anchor & RIGHT) != 0) posX -= w;

        if ((anchor & VCENTER) != 0) posY -= h / 2;
        else if ((anchor & BOTTOM) != 0) posY -= h;

        canvas.drawBitmap(b, posX, posY, null);
    }

    public void drawRegion(Image src, int x_src, int y_src, int width, int height,
                           int transform, int x_dest, int y_dest, int anchor) {
        if (src == null || src.getBitmap() == null || width <= 0 || height <= 0) return;
        Bitmap srcBmp = src.getBitmap();

        int destX = x_dest + transX;
        int destY = y_dest + transY;

        int outW = width;
        int outH = height;
        if (transform == 5 || transform == 6 || transform == 7 || transform == 4) {
            outW = height;
            outH = width;
        }

        if ((anchor & HCENTER) != 0) destX -= outW / 2;
        else if ((anchor & RIGHT) != 0) destX -= outW;

        if ((anchor & VCENTER) != 0) destY -= outH / 2;
        else if ((anchor & BOTTOM) != 0) destY -= outH;

        if (transform == 0) {
            Rect srcRect = new Rect(x_src, y_src, x_src + width, y_src + height);
            Rect destRect = new Rect(destX, destY, destX + width, destY + height);
            canvas.drawBitmap(srcBmp, srcRect, destRect, null);
            return;
        }

        Matrix m = new Matrix();
        m.postTranslate(-x_src, -y_src);

        switch (transform) {
            case 2: // MIRROR
                m.postScale(-1, 1);
                m.postTranslate(width, 0);
                break;
            case 1: // MIRROR_ROT180
                m.postScale(1, -1);
                m.postTranslate(0, height);
                break;
            case 3: // ROT180
                m.postRotate(180);
                m.postTranslate(width, height);
                break;
            case 5: // ROT90
                m.postRotate(90);
                m.postTranslate(height, 0);
                break;
            case 6: // ROT270
                m.postRotate(270);
                m.postTranslate(0, width);
                break;
            case 7: // MIRROR_ROT90
                m.postScale(-1, 1);
                m.postTranslate(width, 0);
                m.postRotate(90);
                m.postTranslate(height, 0);
                break;
            case 4: // MIRROR_ROT270
                m.postScale(-1, 1);
                m.postTranslate(width, 0);
                m.postRotate(270);
                m.postTranslate(0, width);
                break;
        }

        m.postTranslate(destX, destY);

        canvas.save();
        canvas.clipRect(destX, destY, destX + outW, destY + outH);
        canvas.drawBitmap(srcBmp, m, null);
        canvas.restore();
    }
}
