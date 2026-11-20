package com.gameloft.diamondrush;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $VF: renamed from: e
public final class class_3 {
   // $VF: renamed from: a javax.microedition.lcdui.Image[]
   public static Image[] field_29;
   // $VF: renamed from: a a
   public static class_7 field_30;
   // $VF: renamed from: b a
   public static class_7 field_31;
   // $VF: renamed from: a java.lang.String[]
   public static String[] field_32;
   // $VF: renamed from: b java.lang.String[]
   public static String[] field_33;
   // $VF: renamed from: a int
   public static int field_34;
   // $VF: renamed from: b int
   public static int field_35;
   // $VF: renamed from: c int
   public static int field_36;
   // $VF: renamed from: a boolean
   public boolean field_37;
   // $VF: renamed from: d int
   public int field_38;

   public class_3() {
      field_29 = new Image[5];
      field_32 = new String[5];
   }

   // $VF: renamed from: a (java.lang.String) void
   private static void method_17(String var0) {
      if (var0 != null) {
         try {
            class_8.field_362.platformRequest(var0);
         } catch (Exception var2) {
         }
      }
   }

   // $VF: renamed from: a () void
   public static void method_18() {
      field_31 = class_8.field_324[41];
      field_31.field_89 = 1;
      field_30 = class_8.method_357("/tips.f", 0);
      if (field_33 == null) {
         boolean var0 = false;
         field_33 = class_8.method_79("/lang_IGA.f", 15);
         field_33[7] = class_8.method_444(field_33[7], 170);
         field_33[8] = class_8.method_444(field_33[8], 170);
         field_33[9] = class_8.method_444(field_33[9], 170);
      }

      int var3 = 10;

      for (int var1 = 0; var3 <= 14; var1++) {
         field_32[var1] = class_8.field_362.getAppProperty(field_33[var3]);
         if (field_32[var1] != null && (field_32[var1].compareTo("no") == 0 || field_32[var1].compareTo("") == 0)) {
            field_32[var1] = null;
         }

         var3++;
      }

      field_33[3] = field_33[3] + "\n\u0001\u0001" + field_33[4] + "\n\u0001\u0000" + field_33[5];
      field_33[7] = new String("\u0001\u0000" + field_33[7]);

      try {
         for (int var4 = 0; var4 < 4; var4++) {
            field_29[var4] = Image.createImage("/ad" + (var4 + 1));
         }

         class_8.field_327[0] = new class_2(class_8.method_357("/ui.f", 0), 0, 0, null);
      } catch (Exception var2) {
      }

      field_34 = 0;
      class_8.method_366(3);
   }

   // $VF: renamed from: a (int) void
   private static void method_19(int var0) {
      field_34 += var0;
      if (field_34 == 3 && field_32[field_34] == null) {
         field_34 += var0;
      }

      byte var10000;
      if (field_34 < 0) {
         var10000 = 4;
      } else {
         if (field_34 != 5) {
            return;
         }

         var10000 = 0;
      }

      field_34 = var10000;
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int) void
   private static void method_20(Graphics var0, int var1) {
      if (field_32[field_34] != null) {
         if (field_35 % 30 >= 15) {
            String[] var10000;
            byte var10001;
            if (field_34 >= 3) {
               var10000 = field_33;
               var10001 = 8;
            } else {
               var10000 = field_33;
               var10001 = 9;
            }

            String var2 = var10000[var10001];
            field_31.method_57(var2);
            int var3 = class_7.field_86 + 2;
            int var4 = field_31.method_51(var2);
            int var6;
            if (var1 != 0) {
               var6 = 320 + var1 >> 1;
               var10001 = (byte)((var4 >> 1) + 4);
            } else {
               var6 = 160;
               var10001 = (byte)(var4 >> 1);
            }

            int var5 = var6 - var10001;
            var0.setClip(0, 0, 240, 320);
            var0.setColor(16711680);
            var0.fillRect(120 - (var3 >> 1) - 4, var5 - 4, var3 + 8, var4 + 8);
            field_31.method_59(var0, var2, 120, var5, 1);
         }
      }
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics) void
   private static void method_21(Graphics var0) {
      byte var10 = 99;
      short var12 = 189;
      var0.setClip(0, 0, 240, 320);

      for (int var13 = 0; var13 < 16; var13++) {
         var0.setColor(var10 << 16 | 0 | var12);
         var0.fillRect(0, 160 + 160 * var13 / 16, 240, 21);
         var0.fillRect(0, 160 - 160 * (var13 + 1) / 16, 240, 21);
         var10 -= 4;
         var12 -= 8;
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void method_22(Graphics var1) {
      method_21(var1);
      int var2 = 0;
      if (field_34 != 3) {
         class_2 var3;
         (var3 = class_8.field_327[0]).field_24.method_53(var1, 11, 120, 15, 0, 0, 0);
      }

      int var10000;
      switch (field_34) {
         case 3:
            var1.drawImage(field_29[field_34], 120, 15, 17);
            field_31.method_59(var1, field_33[3], 120, 160, 3);
            field_31.method_57(field_33[3]);
            var10000 = 160 + (class_7.field_87 >> 1) + 4;
            break;
         case 4:
            field_31.method_59(var1, "\n\u0001\u0002" + field_33[6], 120, 35, 17);
            field_31.method_59(var1, field_33[7], 120, 160, 3);
            field_31.method_57(field_33[7]);
            var10000 = 160 + (class_7.field_87 >> 1) + 4;
            break;
         default:
            var1.drawImage(field_29[field_34], 120, 240, 33);
            field_31.method_59(var1, field_33[field_34], 120, 242, 17);
            var10000 = 0;
      }

      var2 = var10000;
      class_8.field_95.method_178();
      if (field_32[field_34] != null) {
         class_8.field_95.method_179();
      }

      method_20(var1, var2);
      if (class_8.method_66(16388)) {
         method_19(-1);
      } else if (class_8.method_66(65544)) {
         method_19(1);
      } else if (class_8.method_66(32944)) {
         method_17(field_32[field_34]);
      } else if (class_8.method_66(64)) {
         class_8.field_95.method_65(0);
         field_36 = 2;
         class_8.field_171 = 0;
      }

      field_30.method_52(var1, class_8.method_66(16388) ? 2 : 0, field_35 % field_30.method_49(0), 20 + this.field_38, 160, 0, 0, 0);
      field_30.method_52(var1, class_8.method_66(65544) ? 3 : 1, field_35 % field_30.method_49(1), 220 - this.field_38, 160, 0, 0, 0);
      this.field_38 = this.field_38 + (this.field_37 ? -1 : 1);
      if (this.field_38 > 3 || this.field_38 < 1) {
         this.field_37 = !this.field_37;
      }

      class_8.field_171 = 0;
   }

   // $VF: renamed from: b () void
   public static void method_23() {
      boolean var0 = false;
      int var1 = field_29.length;

      for (int var2 = 0; var2 < var1; var2++) {
         field_29[var2] = null;
      }

      field_29 = null;
      var1 = field_32.length;

      for (int var3 = 0; var3 < var1; var3++) {
         field_32[var3] = null;
      }

      field_32 = null;
      var1 = field_33.length;

      for (int var4 = 0; var4 < var1; var4++) {
         field_33[var4] = null;
      }

      field_33 = null;
      field_31 = null;
      field_30 = null;
      field_36 = 0;
      System.gc();
   }
}
