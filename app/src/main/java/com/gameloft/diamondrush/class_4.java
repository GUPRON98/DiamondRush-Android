package com.gameloft.diamondrush;

import java.util.Random;

// $VF: renamed from: d
public final class class_4 {
   // $VF: renamed from: a java.util.Random
   public static Random field_39 = new Random(System.currentTimeMillis());

   // $VF: renamed from: a (int, int) int
   public static int method_24(int var0, int var1) {
      return var0 + Math.abs(field_39.nextInt()) % (var1 - var0);
   }
}
