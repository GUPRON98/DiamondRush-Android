package com.gameloft.diamondrush;

import javax.microedition.lcdui.Graphics;

// $VF: renamed from: g
public final class class_2 {
   // $VF: renamed from: a int
   public int field_19;
   // $VF: renamed from: b int
   public int field_20;
   // $VF: renamed from: c int
   public int field_21;
   // $VF: renamed from: d int
   public int field_22;
   // $VF: renamed from: e int
   public int field_23;
   // $VF: renamed from: a a
   public class_7 field_24;
   // $VF: renamed from: f int
   public int field_25;
   // $VF: renamed from: g int
   public int field_26;
   // $VF: renamed from: h int
   public int field_27;
   // $VF: renamed from: a g
   public class_2 field_28;

   public class_2() {
   }

   public class_2(class_7 var1, int var2, int var3, class_2 var4) {
      this.field_19 = var2 << 0;
      this.field_20 = var3 << 0;
      this.field_24 = var1;
      this.field_28 = var4;
   }

   // $VF: renamed from: a (int) void
   public final void method_10(int var1) {
      if (var1 != this.field_25) {
         this.field_25 = var1;
         this.field_26 = 0;
         this.field_27 = 0;
         this.field_21 = 0;
         this.field_22 = 0;
      }
   }

   // $VF: renamed from: a () void
   public final void method_11() {
      int var1 = (this.field_24.field_75[this.field_25] + this.field_26) * 5;
      this.field_21 = (this.field_24.field_76[var1 + 2] << 0) * 1 / 1;
      if ((this.field_23 & 1) != 0) {
         this.field_21 = -this.field_21;
      }

      this.field_22 = (this.field_24.field_76[var1 + 3] << 0) * 1 / 1;
      if ((this.field_23 & 2) != 0) {
         this.field_22 = -this.field_22;
      }

      this.field_19 = this.field_19 + this.field_21;
      this.field_20 = this.field_20 + this.field_22;
   }

   // $VF: renamed from: a () boolean
   public final boolean method_12() {
      int var1;
      return this.field_26 != this.field_24.method_49(this.field_25) - 1
         ? false
         : (var1 = this.field_24.method_48(this.field_25, this.field_26)) == 0 || this.field_27 == var1 - 1;
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void method_13(Graphics var1) {
      if (this.field_24 != null) {
         int var2 = this.field_19;
         int var3 = this.field_20;
         class_2 var10000 = this;

         class_2 var4;
         while ((var4 = var10000.field_28) != null) {
            var2 += var4.field_19;
            var3 += var4.field_20;
            var10000 = var4;
         }

         var2 = method_15(var2) + 0;
         var3 = method_16(var3) + 0;
         if (this.field_27 >= 0) {
            this.field_24.method_52(var1, this.field_25, this.field_26, var2, var3, this.field_23, 0, 0);
         } else if (this.field_25 >= 0) {
            this.field_24.method_55(var1, this.field_25, var2, var3, this.field_23);
         } else {
            if (this.field_26 >= 0) {
               this.field_24.method_53(var1, this.field_26, var2, var3, this.field_23, 0, 0);
            }
         }
      }
   }

   // $VF: renamed from: b () void
   public final void method_14() {
      if (this.field_24 != null) {
         if (this.field_27 >= 0) {
            int var1;
            if ((var1 = this.field_24.method_48(this.field_25, this.field_26)) != 0) {
               this.field_27++;
               if (var1 <= this.field_27) {
                  this.field_27 = 0;
                  this.field_26++;
                  if (this.field_26 >= this.field_24.method_49(this.field_25)) {
                     this.field_26 = 0;
                     this.field_21 = 0;
                     this.field_22 = 0;
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (int) int
   private static int method_15(int var0) {
      return (var0 >> 0) * 1 / 1;
   }

   // $VF: renamed from: b (int) int
   private static int method_16(int var0) {
      return (var0 >> 0) * 1 / 1;
   }
}
