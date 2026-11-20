package com.gameloft.diamondrush;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

// $VF: renamed from: h
public final class class_1 implements Runnable, PlayerListener {
   // $VF: renamed from: a int
   public static int field_5 = -1;
   // $VF: renamed from: b int
   public static int field_6 = -1;
   // $VF: renamed from: c int
   public static int field_7;
   // $VF: renamed from: d int
   public static int field_8;
   // $VF: renamed from: e int
   public static int field_9 = -1;
   // $VF: renamed from: a long
   public long field_10 = 0L;
   // $VF: renamed from: a javax.microedition.media.Player[]
   public static Player[] field_11;
   // $VF: renamed from: a boolean
   public static boolean field_12;
   // $VF: renamed from: b boolean
   public static boolean field_13;
   // $VF: renamed from: c boolean
   public static boolean field_14 = false;
   // $VF: renamed from: a java.io.ByteArrayInputStream
   public ByteArrayInputStream field_15;
   // $VF: renamed from: a java.io.InputStream
   public InputStream field_16;
   // $VF: renamed from: a byte[]
   public byte[] field_17;
   // $VF: renamed from: a java.lang.Thread
   public Thread field_18;

   private static void readFully(InputStream is, byte[] b) throws java.io.IOException {
      int off = 0;
      int len = b.length;
      while (off < len) {
         int count = is.read(b, off, len - off);
         if (count < 0) break;
         off += count;
      }
   }

   // $VF: renamed from: a (int) void
   public final void method_0(int var1) {
      if (field_11 == null) {
         field_11 = new Player[21];
      }

      try {
         int len = class_8.method_246(this.field_17, var1 * 8 + 4);
         byte[] var3 = new byte[len];
         if (this.field_16 != null) {
            readFully(this.field_16, var3);
         }
         this.field_15 = new ByteArrayInputStream(var3);
         field_11[var1] = Manager.createPlayer(this.field_15, "audio/midi");
         if (field_11[var1] != null) {
            field_11[var1].addPlayerListener(this);
            field_11[var1].realize();
            VolumeControl vc = (VolumeControl)field_11[var1].getControl("VolumeControl");
            if (vc != null) vc.setLevel(100);
         }
         this.field_15.close();
         this.field_15 = null;
      } catch (Exception var4) {
      }
   }

   // $VF: renamed from: a () void
   public final void method_1() {
      field_13 = false;
      this.field_18 = new Thread(this);
      this.field_18.setPriority(1);
      this.field_18.start();
   }

   // $VF: renamed from: b () void
   public final void method_2() {
      if (field_11 == null) {
         try {
            this.field_16 = javax.microedition.lcdui.ResourceLoader.open("/snd.f");
            if (this.field_16 != null) {
               this.field_16.read();
               this.field_17 = new byte[168];
               readFully(this.field_16, this.field_17);
            }
            return;
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }
   }

   // $VF: renamed from: c () void
   public final void method_3() {
      try {
         field_5 = -1;
         field_9 = -1;
         field_7 = 0;
         this.field_16.close();
         this.field_16 = null;
         this.field_17 = null;
         System.gc();
      } catch (Exception var2) {
      }
   }

   // $VF: renamed from: d () void
   public final void method_4() {
      if (field_11 != null) {
         this.method_8();
         int var1 = field_11.length;

         for (int var2 = 0; var2 < var1; var2++) {
            if (field_11[var2] != null) {
               field_11[var2].close();
               field_11[var2] = null;
            }
         }
      }

      field_11 = null;
      field_13 = true;
   }

   // $VF: renamed from: a (int) int
   private static int method_5(int var0) {
      switch (var0) {
         case 0:
         case 5:
         case 6:
         case 10:
         case 14:
            return 10;
         case 1:
         case 2:
         case 4:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
            return 30;
         case 3:
         case 7:
         case 8:
         case 9:
         case 11:
         case 12:
         case 13:
            return 20;
         default:
            return 0;
      }
   }

   // $VF: renamed from: a (int) boolean
   private static boolean method_6(int var0) {
      switch (var0) {
         case 0:
         case 5:
         case 6:
         case 7:
         case 8:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
            return false;
         case 1:
         case 2:
         case 3:
         case 4:
         case 9:
         default:
            return true;
      }
   }

   // $VF: renamed from: run () void
   public final synchronized void run() {
      while (!field_13) {
         try {
            this.wait();
         } catch (Exception var18) {
         }

         if (field_14) {
            try {
               if (method_6(field_5)) {
                  field_11[field_5].deallocate();
                  field_9 = -1;
               }

               field_5 = -1;
               field_14 = false;
            } catch (Exception var16) {
            } finally {
               field_7 = 0;
            }
         }

         if (field_6 != -1) {
            try {
               if (field_9 != -1 && field_6 != field_9) {
                  field_11[field_9].deallocate();
                  field_9 = -1;
               }

               if (field_9 == -1) {
                  field_11[field_6].prefetch();
                  field_9 = field_6;
               }

               field_11[field_6].start();
               field_5 = field_6;
               field_7 = field_8;
               this.field_10 = System.currentTimeMillis();
            } catch (Exception var14) {
            } finally {
               field_6 = -1;
            }
         }
      }
   }

   // $VF: renamed from: b (int) void
   public final synchronized void method_7(int var1) {
      if (field_12) {
         if (field_5 != -1) {
            if (field_7 >= method_5(var1) && (field_7 != method_5(var1) || Math.abs(System.currentTimeMillis() - this.field_10) <= 50L)) {
               return;
            }

            field_14 = true;
         } else {
            field_7 = 0;
         }

         int var2;
         if ((var2 = method_5(var1)) >= field_7) {
            field_6 = var1;
            field_8 = var2;
            this.notify();
         }
      }
   }

   // $VF: renamed from: e () void
   public final synchronized void method_8() {
      if (field_5 != -1) {
         field_14 = true;
      }

      this.notify();
   }

   // $VF: renamed from: a () boolean
   public static synchronized boolean method_9() {
      return field_5 != -1;
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (field_11 != null && field_5 != -1 && var2.equals("endOfMedia")) {
         this.method_8();
      }
   }
}
