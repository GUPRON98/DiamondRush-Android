package com.gameloft.diamondrush;

import javax.microedition.lcdui.Graphics;

// $VF: renamed from: b
public final class class_6 {
   // $VF: renamed from: a byte[][]
   public static byte[][] field_59;
   // $VF: renamed from: a byte
   public static byte field_60 = 0;
   // $VF: renamed from: b byte
   public static byte field_61 = 4;
   // $VF: renamed from: a int
   public static int field_62 = 0;
   // $VF: renamed from: b byte[][]
   public static byte[][] field_63;
   // $VF: renamed from: c byte
   public static byte field_64 = 0;
   // $VF: renamed from: d byte
   public static byte field_65 = 2;
   // $VF: renamed from: a boolean
   public static boolean field_66 = false;
   // $VF: renamed from: b int
   public static int field_67 = 0;

   // $VF: renamed from: a (int) void
   public static void method_42(int var0) {
      field_60 = (byte)(field_60 + field_61);
      if (field_60 > 24) {
         field_60 = 0;

         for (int var1 = 12; var1 >= 1; var1--) {
            for (int var2 = 0; var2 < 12; var2++) {
               field_59[var2][var1] = field_59[var2][var1 - 1];
            }
         }

         method_43(var0);
      }

      if (field_66) {
         field_64 = (byte)(field_64 + field_65);
         if (field_64 > 24) {
            field_64 = 0;

            for (int var3 = 12; var3 >= 1; var3--) {
               for (int var4 = 0; var4 < 12; var4++) {
                  field_63[var4][var3] = field_63[var4][var3 - 1];
               }
            }

            method_43(var0);
         }
      }
   }

   // $VF: renamed from: b (int) void
   public static void method_43(int var0) {
      for (int var1 = 0; var1 < 12; var1++) {
         field_59[var1][0] = 0;
      }

      if (field_66) {
         for (int var4 = 0; var4 < 12; var4++) {
            field_63[var4][0] = 0;
         }
      }

      int var2 = 0;

      for (int var3 = 0; var3 < var0; var3++) {
         int var5;
         do {
            var5 = class_4.method_24(0, 12);
         } while (field_59[var5][0] != 0);

         var2 = class_4.method_24(1, 3);
         field_59[var5][0] = (byte)var2;
      }

      if (field_66) {
         for (int var9 = 0; var9 < var0; var9++) {
            int var6;
            do {
               var6 = class_4.method_24(0, 12);
            } while (field_63[var6][0] != 0);

            var2 = class_4.method_24(1, 3);
            field_63[var6][0] = (byte)var2;
         }
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public static void method_44(Graphics var0) {
      for (int var1 = 0; var1 < 12; var1++) {
         for (int var2 = 0; var2 < 13; var2++) {
            class_7 var10000;
            Graphics var10001;
            int var10002;
            if (field_59[var1][var2] == 1) {
               var10000 = class_8.field_324[class_8.method_151(2)];
               var10001 = var0;
               var10002 = field_62;
            } else {
               if (field_59[var1][var2] != 2) {
                  continue;
               }

               var10000 = class_8.field_324[class_8.method_151(2)];
               var10001 = var0;
               var10002 = 0;
            }

            var10000.method_53(var10001, var10002, var1 * 24, (var2 - 1) * 24 + field_60, 0, 0, 0);
         }
      }

      if (field_66) {
         for (int var3 = 0; var3 < 12; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
               if (field_63[var3][var4] == 1 || field_63[var3][var4] == 2) {
                  class_8.field_324[class_8.method_151(2)].method_53(var0, 0, var3 * 24, (var4 - 1) * 24 + field_64, 0, 0, 0);
               }
            }
         }
      }

      field_62 = (field_62 + 1) % field_67;
   }
}
