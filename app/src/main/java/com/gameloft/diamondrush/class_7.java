package com.gameloft.diamondrush;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $VF: renamed from: a
public final class class_7 {
   // $VF: renamed from: a int[]
   public static int[] field_68 = new int[4096];
   // $VF: renamed from: a byte[]
   public byte[] field_69;
   // $VF: renamed from: b byte[]
   public byte[] field_70;
   // $VF: renamed from: a short[]
   public short[] field_71;
   // $VF: renamed from: c byte[]
   public byte[] field_72;
   // $VF: renamed from: d byte[]
   public byte[] field_73;
   // $VF: renamed from: e byte[]
   public byte[] field_74;
   // $VF: renamed from: b short[]
   public short[] field_75;
   // $VF: renamed from: f byte[]
   public byte[] field_76;
   // $VF: renamed from: a int[][]
   public int[][] field_77;
   // $VF: renamed from: b int[][]
   public int[][] field_78;
   // $VF: renamed from: a int
   public int field_79;
   // $VF: renamed from: b int
   public int field_80;
   // $VF: renamed from: a boolean
   public boolean field_81;
   // $VF: renamed from: a short
   public short field_82;
   // $VF: renamed from: g byte[]
   public byte[] field_83;
   // $VF: renamed from: c short[]
   public short[] field_84;
   // $VF: renamed from: a javax.microedition.lcdui.Image[][]
   public Image[][] field_85;
   // $VF: renamed from: c int
   public static int field_86;
   // $VF: renamed from: d int
   public static int field_87;
   // $VF: renamed from: h byte[]
   public static byte[] field_88;
   // $VF: renamed from: e int
   public int field_89 = 0;
   // $VF: renamed from: f int
   public static int field_90 = -1;
   // $VF: renamed from: g int
   public static int field_91 = -1;

   // $VF: renamed from: a (byte[], int) void
   public final void method_45(byte[] var1, int var2) {
      try {
         System.gc();
         var2 += 6;
         short var5;
         if ((var5 = (short)((var1[var2++] & 255) | ((var1[var2++] & 255) << 8))) > 0) {
            this.field_69 = new byte[var5 << 1];
            System.arraycopy(var1, var2, this.field_69, 0, this.field_69.length);
            var2 += this.field_69.length;
         }

         short var6;
         if ((var6 = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8))) > 0) {
            this.field_73 = new byte[var6 << 2];
            System.arraycopy(var1, var2, this.field_73, 0, this.field_73.length);
            var2 += this.field_73.length;
         }

         short var7;
         if ((var7 = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8))) > 0) {
            this.field_70 = new byte[var7];
            this.field_71 = new short[var7];

            for (int var8 = 0; var8 < var7; var8++) {
               this.field_70[var8] = var1[var2++];
               int var115 = ++var2;
               var2++;
               this.field_71[var8] = (short)((var1[var115] & 255) + ((var1[var2++] & 255) << 8));
            }

            int var53 = var7 << 2;
            this.field_72 = new byte[var53];

            for (int var9 = 0; var9 < var53; var9++) {
               this.field_72[var9] = var1[var2++];
            }
         }

         short var54;
         if ((var54 = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8))) > 0) {
            this.field_76 = new byte[var54 * 5];
            System.arraycopy(var1, var2, this.field_76, 0, this.field_76.length);
            var2 += this.field_76.length;
         }

         short var55;
         if ((var55 = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8))) > 0) {
            this.field_74 = new byte[var55];
            this.field_75 = new short[var55];

            for (int var10 = 0; var10 < var55; var10++) {
               this.field_74[var10] = var1[var2++];
               int var118 = ++var2;
               var2++;
               this.field_75[var10] = (short)((var1[var118] & 255) + ((var1[var2++] & 255) << 8));
            }
         }

         if (var5 <= 0) {
            System.gc();
         } else {
            short var56 = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8));
            this.field_79 = var1[var2++] & 255;
            int var11 = var1[var2++] & 255;
            this.field_78 = new int[16][];

            for (int var12 = 0; var12 < this.field_79; var12++) {
               this.field_78[var12] = new int[var11];
               switch (var56) {
                  case -30584:
                     for (int var60 = 0; var60 < var11; var60++) {
                        int var66;
                        if ((
                              (var66 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8) + ((var1[var2++] & 255) << 16) + ((var1[var2++] & 255) << 24))
                                 & 0xFF000000
                           )
                           != -16777216) {
                           this.field_81 = true;
                        }

                        this.field_78[var12][var60] = var66;
                     }
                     break;
                  case 17476:
                     for (int var59 = 0; var59 < var11; var59++) {
                        int var65;
                        if (((var65 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8)) & 61440) != 61440) {
                           this.field_81 = true;
                        }

                        this.field_78[var12][var59] = (var65 & 61440) << 16
                           | (var65 & 61440) << 12
                           | (var65 & 3840) << 12
                           | (var65 & 3840) << 8
                           | (var65 & 240) << 8
                           | (var65 & 240) << 4
                           | (var65 & 15) << 4
                           | var65 & 15;
                     }
                     break;
                  case 21781:
                     for (int var58 = 0; var58 < var11; var58++) {
                        int var64 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8);
                        int var69 = -16777216;
                        if ((var64 & 32768) != 32768) {
                           var69 = 0;
                           this.field_81 = true;
                        }

                        this.field_78[var12][var58] = var69 | (var64 & 31744) << 9 | (var64 & 992) << 6 | (var64 & 31) << 3;
                     }
                     break;
                  case 25861:
                     for (int var13 = 0; var13 < var11; var13++) {
                        int var14 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8);
                        int var15 = -16777216;
                        if (var14 == 63519) {
                           var15 = 0;
                           this.field_81 = true;
                        }

                        this.field_78[var12][var13] = var15 | (var14 & 63488) << 8 | (var14 & 2016) << 5 | (var14 & 31) << 3;
                     }
               }
            }

            this.field_82 = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8));
            if (var5 > 0) {
               this.field_84 = new short[var5];
               short var57 = 0;
               int var61 = var2;

               for (int var67 = 0; var67 < var5; var67++) {
                  short var70 = (short)((var1[var61++] & 255) + ((var1[var61++] & 255) << 8));
                  this.field_84[var67] = (short)var57;
                  var61 += var70;
                  var57 += var70;
               }

               this.field_83 = new byte[var57];

               for (int var68 = 0; var68 < var5; var68++) {
                  short var71 = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8));
                  System.arraycopy(var1, var2, this.field_83, this.field_84[var68] & 65535, var71);
                  var2 += var71;
               }
            }

            System.gc();
         }
      } catch (Exception var16) {
         var16.printStackTrace();
      }
   }

   // $VF: renamed from: a (int, int, int, int) void
   public final void method_46(int var1, int var2, int var3, int var4) {
      if (this.field_69 != null) {
         if (var3 == -1) {
            var3 = (this.field_69.length >> 1) - 1;
         }

         if (this.field_85 == null) {
            this.field_85 = new Image[this.field_79][];
         }

         if (this.field_85[var1] == null) {
            this.field_85[var1] = new Image[this.field_69.length >> 1];
         }

         if (var4 >= 0) {
            for (int var5 = var2; var5 <= var3; var5++) {
               this.field_85[var1][var5] = this.field_85[var4][var5];
            }
         } else {
            int var14 = this.field_80;
            this.field_80 = var1;
            System.gc();

            for (int var6 = var2; var6 <= var3; var6++) {
               int var7 = var6 << 1;
               int var8 = this.field_69[var7] & 255;
               int var9 = this.field_69[var7 + 1] & 255;
               int[] var10;
               if (var8 > 0 && var9 > 0 && (var10 = this.method_56(var6)) != null) {
                  boolean var11 = false;
                  int var12 = var8 * var9;

                  for (int var13 = 0; var13 < var12; var13++) {
                     if ((var10[var13] & 0xFF000000) != -16777216) {
                        var11 = true;
                        break;
                     }
                  }

                  this.field_85[var1][var6] = Image.createRGBImage(var10, var8, var9, var11);
               }
            }

            System.gc();
            this.field_80 = var14;
         }

         System.gc();
      }
   }

   // $VF: renamed from: a (int) void
   public final void method_47(int var1) {
      if (this.field_69 != null) {
         if (this.field_85 != null) {
            if (this.field_85[var1] != null) {
               for (int var2 = 0; var2 < this.field_85[var1].length; var2++) {
                  this.field_85[var1][var2] = null;
               }

               this.field_85[var1] = null;
               this.field_79--;
            }
         }
      }
   }

   public final String toString() {
      new String();
      Object var1 = null;
      int var2 = 0;

      for (int var3 = 0; var3 < this.field_69.length / 2; var3++) {
         var2 += 2 * (this.field_69[2 * var3] & 255) * (this.field_69[2 * var3 + 1] & 255);
      }

      return "raw/full: " + this.field_83.length + "/" + var2;
   }

   // $VF: renamed from: a (int, int) int
   public final int method_48(int var1, int var2) {
      return this.field_76[(this.field_75[var1] + var2) * 5 + 1] & 0xFF;
   }

   // $VF: renamed from: a (int) int
   public final int method_49(int var1) {
      return this.field_74[var1] & 0xFF;
   }

   // $VF: renamed from: b (int) int
   public final int method_50(int var1) {
      return this.field_70[var1] & 0xFF;
   }

   // $VF: renamed from: a (java.lang.String) int
   public final int method_51(String var1) {
      int var2 = 1;
      int var3 = var1.length();

      for (int var4 = var1.indexOf(10); var4 != -1; var4 = var4 < var3 - 1 ? var1.indexOf(10, var4 + 1) : -1) {
         var2++;
      }

      return this.field_89 * (var2 - 1) + this.field_69[1] * var2;
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int) void
   public final void method_52(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = (this.field_75[var2] + var3) * 5;
      int var10 = this.field_76[var9] & 255;
      if ((var6 & 32) != 0) {
         var7 = (var6 & 1) != 0 ? var7 + this.field_76[var9 + 2] : var7 - this.field_76[var9 + 2];
         var8 = (var6 & 2) != 0 ? var8 + this.field_76[var9 + 3] : var8 - this.field_76[var9 + 3];
      }

      this.method_53(var1, var10, var4 - var7, var5 - var8, var6 ^ this.field_76[var9 + 4] & 15, var7, var8);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int) void
   public final void method_53(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = this.field_70[var2] & 255;

      for (int var9 = 0; var9 < var8; var9++) {
         this.method_54(var1, var2, var9, var3, var4, var5);
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
   public final void method_54(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = this.field_71[var2] + var3 << 2;
      int var8 = this.field_73[var7 + 3] & 255;
      int var9 = this.field_73[var7] & 255;
      var4 = (var6 & 1) != 0 ? var4 - this.field_73[var7 + 1] : var4 + this.field_73[var7 + 1];
      var5 = (var6 & 2) != 0 ? var5 - this.field_73[var7 + 2] : var5 + this.field_73[var7 + 2];
      if ((var6 & 1) != 0) {
         var4 -= this.field_69[var9 << 1] & 255;
      }

      if ((var6 & 2) != 0) {
         var5 -= this.field_69[(var9 << 1) + 1] & 255;
      }

      this.method_55(var1, var9, var4, var5, var6 ^ var8 & 15);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   public final void method_55(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 << 1;
      int var7 = this.field_69[var6] & 255;
      int var8 = this.field_69[var6 + 1] & 255;
      if (var7 > 0 && var8 > 0) {
         Image var9 = null;
         if (this.field_85 != null && this.field_85[this.field_80] != null) {
            var9 = this.field_85[this.field_80][var2];
         }

         if (var9 == null) {
            int[] var10;
            if ((var10 = this.method_56(var2)) == null) {
               return;
            }

            var9 = Image.createRGBImage(var10, var7, var8, this.field_81);
         }

         var7 = var9.getWidth();
         var8 = var9.getHeight();
         Graphics var10000;
         Image var10001;
         byte var10002;
         byte var10003;
         int var10004;
         int var10005;
         byte var10006;
         if ((var5 & 1) != 0) {
            if ((var5 & 2) != 0) {
               var10000 = var1;
               var10001 = var9;
               var10002 = 0;
               var10003 = 0;
               var10004 = var7;
               var10005 = var8;
               var10006 = 3;
            } else {
               var10000 = var1;
               var10001 = var9;
               var10002 = 0;
               var10003 = 0;
               var10004 = var7;
               var10005 = var8;
               var10006 = 2;
            }
         } else if ((var5 & 2) != 0) {
            var10000 = var1;
            var10001 = var9;
            var10002 = 0;
            var10003 = 0;
            var10004 = var7;
            var10005 = var8;
            var10006 = 1;
         } else {
            var10000 = var1;
            var10001 = var9;
            var10002 = 0;
            var10003 = 0;
            var10004 = var7;
            var10005 = var8;
            var10006 = 0;
         }

         var10000.drawRegion(var10001, var10002, var10003, var10004, var10005, var10006, var3, var4, 0);
      }
   }

   // $VF: renamed from: a (int) int[]
   private int[] method_56(int var1) {
      if (this.field_83 != null && this.field_84 != null) {
         int var2 = var1 << 1;
         int var3 = this.field_69[var2] & 255;
         int var4 = this.field_69[var2 + 1] & 255;
         int[] var5 = field_68;
         int[] var6;
         if ((var6 = this.field_78[this.field_80]) == null) {
            return null;
         }

         byte[] var7 = this.field_83;
         int var8 = this.field_84[var1] & '\uffff';
         int var9 = 0;
         int var10 = var3 * var4;
         if (this.field_82 != 10225) {
            if (this.field_82 == 5632) {
               while (var9 < var10) {
                  var5[var9++] = var6[var7[var8] >> 4 & 15];
                  var5[var9++] = var6[var7[var8] & 15];
                  var8++;
               }
            } else if (this.field_82 == 1024) {
               while (var9 < var10) {
                  var5[var9++] = var6[var7[var8] >> 6 & 3];
                  var5[var9++] = var6[var7[var8] >> 4 & 3];
                  var5[var9++] = var6[var7[var8] >> 2 & 3];
                  var5[var9++] = var6[var7[var8] & 3];
                  var8++;
               }
            } else if (this.field_82 == 512) {
               while (var9 < var10) {
                  var5[var9++] = var6[var7[var8] >> 7 & 1];
                  var5[var9++] = var6[var7[var8] >> 6 & 1];
                  var5[var9++] = var6[var7[var8] >> 5 & 1];
                  var5[var9++] = var6[var7[var8] >> 4 & 1];
                  var5[var9++] = var6[var7[var8] >> 3 & 1];
                  var5[var9++] = var6[var7[var8] >> 2 & 1];
                  var5[var9++] = var6[var7[var8] >> 1 & 1];
                  var5[var9++] = var6[var7[var8] & 1];
                  var8++;
               }
            } else if (this.field_82 == 22018) {
               while (var9 < var10) {
                  var5[var9++] = var6[var7[var8++] & 0xFF];
               }
            } else if (this.field_82 == 22258) {
               while (var9 < var10) {
                  int var26;
                  if ((var26 = var7[var8++] & 255) > 127) {
                     var26 -= 128;

                     while (var26-- > 0) {
                        var5[var9++] = var6[var7[var8++] & 0xFF];
                     }
                  } else {
                     int var28 = var6[var7[var8++] & 0xFF];

                     while (var26-- > 0) {
                        var5[var9++] = var28;
                     }
                  }
               }
            }
         } else {
            while (var9 < var10) {
               int var11;
               if ((var11 = var7[var8++] & 255) > 127) {
                  int var12 = var7[var8++] & 255;
                  int var13 = var6[var12];
                  var11 -= 128;

                  while (var11-- > 0) {
                     var5[var9++] = var13;
                  }
               } else {
                  var5[var9++] = var6[var11];
               }
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   public final void method_57(String var1) {
      field_86 = 0;
      field_87 = this.field_69[1] & 255;
      int var2 = 0;
      int var3 = field_90 >= 0 ? field_90 : 0;
      int var4 = field_91 >= 0 ? field_91 : var1.length();

      for (int var5 = var3; var5 < var4; var5++) {
         int var10;
         int var11;
         label69: {
            char var6;
            if ((var6 = var1.charAt(var5)) > 32) {
               var10 = field_88[var6] & 255;
            } else {
               if (var6 == 32) {
                  var10 = var2;
                  var11 = this.field_69[0] & 255;
                  break label69;
               }

               if (var6 == 10) {
                  if (var2 > field_86) {
                     field_86 = var2;
                  }

                  var2 = 0;
                  field_87 = field_87 + this.field_89 + (this.field_69[1] & 255);
                  continue;
               }

               if (var6 == 1) {
                  var5++;
                  continue;
               }

               if (var6 != 2) {
                  continue;
               }

               var10 = var1.charAt(++var5);
            }

            var6 = (char)var10;
            int var10002;
            if (var10 >= this.method_50(0)) {
               int var7 = var6 - this.method_50(0);
               var10 = var2;
               var11 = this.field_72[(var7 << 2) + 2] & 255;
               var10002 = this.field_72[var7 << 2] & 255;
            } else {
               int var9 = (this.field_73[var6 << 2] & 255) << 1;
               var10 = var2;
               var11 = this.field_69[var9] & 255;
               var10002 = this.field_73[(var6 << 2) + 1];
            }

            var11 -= var10002;
         }

         var2 = var10 + var11 + this.field_73[1];
      }

      if (var2 > field_86) {
         field_86 = var2;
      }

      if (field_86 > 0) {
         field_86 = field_86 - this.field_73[1];
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) void
   public final void method_58(Graphics var1, String var2, int var3, int var4, int var5) {
      var4 -= this.field_73[2];
      label76:
      if ((var5 & 43) != 0) {
         label74: {
            this.method_57(var2);
            int var10000;
            int var10001;
            if ((var5 & 8) != 0) {
               var10000 = var3;
               var10001 = field_86;
            } else {
               if ((var5 & 1) == 0) {
                  break label74;
               }

               var10000 = var3;
               var10001 = field_86 >> 1;
            }

            var3 = var10000 - var10001;
         }

         int var17;
         int var20;
         if ((var5 & 32) != 0) {
            var17 = var4;
            var20 = field_87;
         } else {
            if ((var5 & 2) == 0) {
               break label76;
            }

            var17 = var4;
            var20 = field_87 >> 1;
         }

         var4 = var17 - var20;
      }

      int var6 = var3;
      int var7 = var4;
      int var8 = this.field_80;
      int var9 = field_90 >= 0 ? field_90 : 0;
      int var10 = field_91 >= 0 ? field_91 : var2.length();

      for (int var11 = var9; var11 < var10; var11++) {
         int var19;
         int var22;
         label81: {
            char var12;
            if ((var12 = var2.charAt(var11)) > 32) {
               var19 = field_88[var12] & 255;
            } else {
               if (var12 == 32) {
                  var19 = var6;
                  var22 = this.field_69[0] & 255;
                  break label81;
               }

               if (var12 == 10) {
                  var6 = var3;
                  var7 += this.field_89 + (this.field_69[1] & 255);
                  continue;
               }

               if (var12 == 1) {
                  this.field_80 = var2.charAt(++var11);
                  continue;
               }

               if (var12 != 2) {
                  continue;
               }

               var19 = var2.charAt(++var11);
            }

            var12 = (char)var19;
            int var10002;
            if (var19 >= this.method_50(0)) {
               int var13 = var12 - this.method_50(0);
               this.method_53(var1, var13, var6, var7, 0, 0, 0);
               var19 = var6;
               var22 = this.field_72[(var13 << 2) + 2] & 255;
               var10002 = this.field_72[var13 << 2] & 255;
            } else {
               int var16 = (this.field_73[var12 << 2] & 255) << 1;
               this.method_54(var1, 0, var12, var6, var7, 0);
               var19 = var6;
               var22 = this.field_69[var16] & 255;
               var10002 = this.field_73[(var12 << 2) + 1];
            }

            var22 -= var10002;
         }

         var6 = var19 + var22 + this.field_73[1];
      }

      this.field_80 = var8;
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) void
   public final void method_59(Graphics var1, String var2, int var3, int var4, int var5) {
      int var6 = 0;
      int var7 = var2.length();
      int[] var8 = new int[100];

      for (int var9 = 0; var9 < var7; var9++) {
         if (var2.charAt(var9) == '\n') {
            var8[var6++] = var9;
         }
      }

      int var12;
      label33: {
         var8[var6++] = var7;
         var12 = this.field_89 + (this.field_69[1] & 255);
         int var14;
         int var10000;
         if ((var5 & 32) != 0) {
            var10000 = var4;
            var14 = var12 * (var6 - 1);
         } else {
            if ((var5 & 2) == 0) {
               break label33;
            }

            var10000 = var4;
            var14 = var12 * (var6 - 1) >> 1;
         }

         var4 = var10000 - var14;
      }

      for (int var10 = 0; var10 < var6; var10++) {
         field_90 = var10 > 0 ? var8[var10 - 1] + 1 : 0;
         field_91 = var8[var10];
         this.method_58(var1, var2, var3, var4 + var10 * var12, var5);
      }

      field_90 = -1;
      field_91 = -1;
   }

   // $VF: renamed from: a (boolean) void
   public final void method_60(boolean var1) {
      this.field_69 = null;
      this.field_70 = null;
      this.field_71 = null;
      this.field_72 = null;
      this.field_73 = null;
      this.field_74 = null;
      this.field_75 = null;
      this.field_76 = null;
      if (this.field_77 != null) {
         for (int var2 = 0; var2 < this.field_77.length; var2++) {
            this.field_77[var2] = null;
         }

         this.field_77 = (int[][])null;
      }

      if (this.field_78 != null) {
         for (int var4 = 0; var4 < this.field_78.length; var4++) {
            this.field_78[var4] = null;
         }

         this.field_78 = (int[][])null;
      }

      this.field_83 = null;
      this.field_84 = null;
      if (var1 && this.field_85 != null) {
         for (int var5 = 0; var5 < this.field_85.length; var5++) {
            if (this.field_85[var5] != null) {
               for (int var3 = 0; var3 < this.field_85[var5].length; var3++) {
                  this.field_85[var5][var3] = null;
               }
            }
         }

         this.field_85 = (Image[][])null;
      }
   }
}
