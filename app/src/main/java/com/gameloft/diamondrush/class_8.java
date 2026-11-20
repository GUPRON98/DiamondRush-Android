package com.gameloft.diamondrush;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.rms.RecordStore;

// $VF: renamed from: i
public final class class_8 extends GameCanvas implements Runnable {
   // $VF: renamed from: a i
   public static class_8 field_95;
   // $VF: renamed from: a int
   public int field_96 = 40;
   // $VF: renamed from: b int
   public int field_97;
   // $VF: renamed from: a boolean
   public boolean field_98 = false;
   // $VF: renamed from: b boolean
   public boolean field_99;
   // $VF: renamed from: c int
   public int field_100 = 0;
   // $VF: renamed from: d int
   public int field_101 = class_0.field_0[this.field_100];
   // $VF: renamed from: a java.lang.String
   public String field_102 = "";
   // $VF: renamed from: c boolean
   public boolean field_103 = true;
   // $VF: renamed from: e int
   public int field_104 = 0;
   // $VF: renamed from: f int
   public int field_105 = 0;
   // $VF: renamed from: g int
   public int field_106 = 0;
   // $VF: renamed from: h int
   public int field_107 = this.field_105;
   // $VF: renamed from: i int
   public int field_108 = this.field_106;
   // $VF: renamed from: b java.lang.String
   public String field_109 = "";
   // $VF: renamed from: c java.lang.String
   public String field_110 = "";
   // $VF: renamed from: j int
   public int field_111 = -1;
   // $VF: renamed from: d boolean
   public boolean field_112 = false;
   // $VF: renamed from: e boolean
   public boolean field_113 = true;
   // $VF: renamed from: a byte
   public byte field_114 = 0;
   // $VF: renamed from: k int
   public int field_115 = 0;
   // $VF: renamed from: l int
   public int field_116 = 0;
   // $VF: renamed from: m int
   public int field_117 = 0;
   // $VF: renamed from: n int
   public int field_118 = 0;
   // $VF: renamed from: o int
   public int field_119 = 0;
   // $VF: renamed from: p int
   public int field_120 = 0;
   // $VF: renamed from: q int
   public int field_121 = 0;
   // $VF: renamed from: a boolean[]
   public static boolean[] field_122 = new boolean[]{true, false, false};
   // $VF: renamed from: r int
   public int field_123 = 0;
   // $VF: renamed from: b boolean[]
   public static boolean[] field_124 = new boolean[]{false, false, false};
   // $VF: renamed from: f boolean
   public boolean field_125 = false;
   // $VF: renamed from: s int
   public int field_126 = -1;
   // $VF: renamed from: t int
   public int field_127 = 10;
   // $VF: renamed from: u int
   public int field_128 = 10;
   // $VF: renamed from: v int
   public int field_129 = 0;
   // $VF: renamed from: w int
   public int field_130 = 0;
   // $VF: renamed from: x int
   public int field_131 = 0;
   // $VF: renamed from: y int
   public int field_132 = 0;
   // $VF: renamed from: z int
   public int field_133 = 0;
   // $VF: renamed from: g boolean
   public boolean field_134 = false;
   // $VF: renamed from: A int
   public int field_135 = 0;
   // $VF: renamed from: B int
   public int field_136 = -1;
   // $VF: renamed from: C int
   public int field_137 = -1;
   // $VF: renamed from: D int
   public int field_138 = 0;
   // $VF: renamed from: E int
   public int field_139 = 0;
   // $VF: renamed from: F int
   public int field_140 = 0;
   // $VF: renamed from: G int
   public int field_141 = 0;
   // $VF: renamed from: H int
   public int field_142 = 0;
   // $VF: renamed from: h boolean
   public boolean field_143 = false;
   // $VF: renamed from: i boolean
   public boolean field_144 = false;
   // $VF: renamed from: I int
   public int field_145 = 0;
   // $VF: renamed from: J int
   public int field_146 = 0;
   // $VF: renamed from: K int
   public int field_147 = 0;
   // $VF: renamed from: L int
   public int field_148 = 0;
   // $VF: renamed from: M int
   public int field_149 = 0;
   // $VF: renamed from: N int
   public int field_150 = 0;
   // $VF: renamed from: O int
   public int field_151 = 0;
   // $VF: renamed from: b byte
   public byte field_152 = 1;
   // $VF: renamed from: c byte
   public byte field_153 = 1;
   // $VF: renamed from: d byte
   public byte field_154 = 3;
   // $VF: renamed from: e byte
   public byte field_155 = 3;
   // $VF: renamed from: f byte
   public byte field_156 = 2;
   // $VF: renamed from: g byte
   public byte field_157 = 0;
   // $VF: renamed from: j boolean
   public boolean field_158 = false;
   // $VF: renamed from: P int
   public int field_159;
   // $VF: renamed from: Q int
   public int field_160;
   // $VF: renamed from: R int
   public int field_161;
   // $VF: renamed from: a byte[]
   public static byte[] field_162 = new byte[16];
   // $VF: renamed from: b byte[]
   public static byte[] field_163 = new byte[8];
   // $VF: renamed from: c byte[]
   public static byte[] field_164 = new byte[8];
   // $VF: renamed from: S int
   public int field_165;
   // $VF: renamed from: T int
   public int field_166;
   // $VF: renamed from: h byte
   public byte field_167;
   // $VF: renamed from: k boolean
   public static boolean field_168;
   // $VF: renamed from: U int
   public int field_169;
   // $VF: renamed from: V int
   public int field_170 = 0;
   // $VF: renamed from: W int
   public static int field_171;
   // $VF: renamed from: l boolean
   public boolean field_172 = true;
   // $VF: renamed from: m boolean
   public boolean field_173;
   // $VF: renamed from: X int
   public int field_174;
   // $VF: renamed from: Y int
   public int field_175;
   // $VF: renamed from: d byte[]
   public static byte[] field_176;
   // $VF: renamed from: i byte
   public byte field_177 = 0;
   // $VF: renamed from: Z int
   public int field_178 = 0;
   // $VF: renamed from: aa int
   public int field_179;
   // $VF: renamed from: ab int
   public int field_180;
   // $VF: renamed from: ac int
   public int field_181;
   // $VF: renamed from: n boolean
   public boolean field_182;
   // $VF: renamed from: ad int
   public int field_183;
   // $VF: renamed from: ae int
   public int field_184;
   // $VF: renamed from: af int
   public int field_185;
   // $VF: renamed from: ag int
   public int field_186;
   // $VF: renamed from: ah int
   public int field_187;
   // $VF: renamed from: ai int
   public int field_188;
   // $VF: renamed from: o boolean
   public boolean field_189 = false;
   // $VF: renamed from: p boolean
   public boolean field_190 = false;
   // $VF: renamed from: q boolean
   public boolean field_191 = false;
   // $VF: renamed from: r boolean
   public boolean field_192 = false;
   // $VF: renamed from: aj int
   public int field_193;
   // $VF: renamed from: ak int
   public int field_194;
   // $VF: renamed from: e byte[]
   public static byte[] field_195;
   // $VF: renamed from: al int
   public int field_196;
   // $VF: renamed from: am int
   public int field_197;
   // $VF: renamed from: an int
   public int field_198;
   // $VF: renamed from: j byte
   public byte field_199 = 0;
   // $VF: renamed from: k byte
   public byte field_200 = 0;
   // $VF: renamed from: ao int
   public int field_201;
   // $VF: renamed from: ap int
   public int field_202;
   // $VF: renamed from: aq int
   public int field_203;
   // $VF: renamed from: ar int
   public int field_204;
   // $VF: renamed from: as int
   public int field_205;
   // $VF: renamed from: at int
   public int field_206;
   // $VF: renamed from: au int
   public int field_207;
   // $VF: renamed from: av int
   public int field_208;
   // $VF: renamed from: aw int
   public int field_209;
   // $VF: renamed from: ax int
   public int field_210;
   // $VF: renamed from: ay int
   public int field_211;
   // $VF: renamed from: az int
   public int field_212;
   // $VF: renamed from: aA int
   public int field_213;
   // $VF: renamed from: aB int
   public int field_214;
   // $VF: renamed from: aC int
   public int field_215;
   // $VF: renamed from: aD int
   public int field_216;
   // $VF: renamed from: aE int
   public int field_217;
   // $VF: renamed from: aF int
   public int field_218;
   // $VF: renamed from: aG int
   public int field_219;
   // $VF: renamed from: aH int
   public int field_220;
   // $VF: renamed from: aI int
   public int field_221;
   // $VF: renamed from: aJ int
   public int field_222;
   // $VF: renamed from: aK int
   public int field_223;
   // $VF: renamed from: aL int
   public int field_224;
   // $VF: renamed from: l byte
   public static byte field_225 = 0;
   // $VF: renamed from: aM int
   public int field_226;
   // $VF: renamed from: m byte
   public static byte field_227 = field_225;
   // $VF: renamed from: s boolean
   public boolean field_228 = false;
   // $VF: renamed from: aN int
   public static int field_229;
   // $VF: renamed from: aO int
   public static int field_230;
   // $VF: renamed from: a long
   public long field_231;
   // $VF: renamed from: t boolean
   public boolean field_232;
   // $VF: renamed from: aP int
   public int field_233;
   // $VF: renamed from: aQ int
   public int field_234;
   // $VF: renamed from: aR int
   public int field_235;
   // $VF: renamed from: aS int
   public int field_236;
   // $VF: renamed from: aT int
   public int field_237;
   // $VF: renamed from: u boolean
   public boolean field_238;
   // $VF: renamed from: aU int
   public int field_239;
   // $VF: renamed from: aV int
   public int field_240;
   // $VF: renamed from: v boolean
   public boolean field_241;
   // $VF: renamed from: n byte
   public byte field_242;
   // $VF: renamed from: aW int
   public int field_243;
   // $VF: renamed from: b long
   public long field_244;
   // $VF: renamed from: aX int
   public int field_245;
   // $VF: renamed from: aY int
   public int field_246 = 0;
   // $VF: renamed from: aZ int
   public int field_247;
   // $VF: renamed from: ba int
   public int field_248 = 0;
   // $VF: renamed from: bb int
   public int field_249;
   // $VF: renamed from: bc int
   public int field_250;
   // $VF: renamed from: bd int
   public int field_251;
   // $VF: renamed from: be int
   public int field_252;
   // $VF: renamed from: bf int
   public int field_253;
   // $VF: renamed from: o byte
   public byte field_254;
   // $VF: renamed from: bg int
   public int field_255;
   // $VF: renamed from: bh int
   public int field_256;
   // $VF: renamed from: bi int
   public int field_257;
   // $VF: renamed from: bj int
   public int field_258;
   // $VF: renamed from: bk int
   public int field_259;
   // $VF: renamed from: bl int
   public int field_260;
   // $VF: renamed from: bm int
   public int field_261 = -1;
   // $VF: renamed from: w boolean
   public boolean field_262;
   // $VF: renamed from: bn int
   public int field_263;
   // $VF: renamed from: d java.lang.String
   public String field_264;
   // $VF: renamed from: x boolean
   public boolean field_265;
   // $VF: renamed from: bo int
   public int field_266;
   // $VF: renamed from: bp int
   public int field_267;
   // $VF: renamed from: bq int
   public int field_268;
   // $VF: renamed from: br int
   public int field_269;
   // $VF: renamed from: bs int
   public int field_270;
   // $VF: renamed from: bt int
   public int field_271;
   // $VF: renamed from: bu int
   public int field_272;
   // $VF: renamed from: bv int
   public int field_273;
   // $VF: renamed from: bw int
   public int field_274;
   // $VF: renamed from: bx int
   public int field_275;
   // $VF: renamed from: by int
   public int field_276;
   // $VF: renamed from: bz int
   public int field_277;
   // $VF: renamed from: bA int
   public int field_278;
   // $VF: renamed from: bB int
   public int field_279;
   // $VF: renamed from: bC int
   public int field_280;
   // $VF: renamed from: y boolean
   public boolean field_281;
   // $VF: renamed from: bD int
   public int field_282 = 0;
   // $VF: renamed from: bE int
   public int field_283;
   // $VF: renamed from: bF int
   public int field_284;
   // $VF: renamed from: bG int
   public int field_285;
   // $VF: renamed from: bH int
   public int field_286;
   // $VF: renamed from: bI int
   public int field_287;
   // $VF: renamed from: bJ int
   public int field_288;
   // $VF: renamed from: bK int
   public int field_289;
   // $VF: renamed from: bL int
   public int field_290;
   // $VF: renamed from: bM int
   public int field_291;
   // $VF: renamed from: bN int
   public int field_292;
   // $VF: renamed from: bO int
   public int field_293;
   // $VF: renamed from: bP int
   public int field_294;
   // $VF: renamed from: bQ int
   public int field_295;
   // $VF: renamed from: bR int
   public int field_296;
   // $VF: renamed from: bS int
   public int field_297;
   // $VF: renamed from: bT int
   public int field_298;
   // $VF: renamed from: bU int
   public int field_299;
   // $VF: renamed from: bV int
   public int field_300;
   // $VF: renamed from: bW int
   public int field_301 = 0;
   // $VF: renamed from: bX int
   public int field_302 = 0;
   // $VF: renamed from: bY int
   public int field_303 = 0;
   // $VF: renamed from: bZ int
   public int field_304 = 0;
   // $VF: renamed from: ca int
   public int field_305 = 0;
   // $VF: renamed from: cb int
   public int field_306 = 0;
   // $VF: renamed from: z boolean
   public boolean field_307;
   // $VF: renamed from: cc int
   public int field_308;
   // $VF: renamed from: cd int
   public int field_309;
   // $VF: renamed from: a java.io.InputStream
   public InputStream field_310;
   // $VF: renamed from: p byte
   public byte field_311;
   // $VF: renamed from: q byte
   public byte field_312;
   // $VF: renamed from: A boolean
   public boolean field_313 = false;
   // $VF: renamed from: ce int
   public int field_314;
   // $VF: renamed from: cf int
   public int field_315;
   // $VF: renamed from: cg int
   public int field_316;
   // $VF: renamed from: ch int
   public int field_317;
   // $VF: renamed from: a javax.microedition.lcdui.Graphics
   public Graphics field_318;
   // $VF: renamed from: a javax.microedition.lcdui.Image
   public static Image field_319;
   // $VF: renamed from: b javax.microedition.lcdui.Image
   public static Image field_320;
   // $VF: renamed from: c javax.microedition.lcdui.Image
   public static Image field_321;
   // $VF: renamed from: a javax.microedition.lcdui.Image[][]
   public static Image[][] field_322;
   // $VF: renamed from: b javax.microedition.lcdui.Image[][]
   public static Image[][] field_323;
   // $VF: renamed from: a a[]
   public static class_7[] field_324;
   // $VF: renamed from: a a
   public static class_7 field_325;
   // $VF: renamed from: f byte[]
   public static byte[] field_326;
   // $VF: renamed from: a g[]
   public static class_2[] field_327;
   // $VF: renamed from: b a
   public static class_7 field_328;
   // $VF: renamed from: g byte[]
   public static byte[] field_329 = new byte[]{0, 0, -1, 0, 1, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0};
   // $VF: renamed from: h byte[]
   public static byte[] field_330 = new byte[]{0, 3, 4, 1, 2, 5, 6};
   // $VF: renamed from: c long
   public long field_331;
   // $VF: renamed from: d long
   public long field_332;
   // $VF: renamed from: B boolean
   public boolean field_333 = false;
   // $VF: renamed from: i byte[]
   public static byte[] field_334 = null;
   // $VF: renamed from: j byte[]
   public static byte[] field_335 = null;
   // $VF: renamed from: a int[][]
   public static int[][] field_336;
   // $VF: renamed from: b int[][]
   public static int[][] field_337;
   // $VF: renamed from: a byte[][]
   public static byte[][] field_338;
   // $VF: renamed from: b byte[][]
   public static byte[][] field_339;
   // $VF: renamed from: c byte[][]
   public static byte[][] field_340;
   // $VF: renamed from: k byte[]
   public static byte[] field_341;
   // $VF: renamed from: C boolean
   public boolean field_342;
   // $VF: renamed from: ci int
   public int field_343;
   // $VF: renamed from: cj int
   public int field_344;
   // $VF: renamed from: ck int
   public int field_345;
   // $VF: renamed from: cl int
   public int field_346;
   // $VF: renamed from: l byte[]
   public static byte[] field_347;
   // $VF: renamed from: m byte[]
   public static byte[] field_348;
   // $VF: renamed from: cm int
   public static int field_349;
   // $VF: renamed from: cn int
   public static int field_350;
   // $VF: renamed from: n byte[]
   public static byte[] field_351;
   // $VF: renamed from: c int[][]
   public static int[][] field_352;
   // $VF: renamed from: d int[][]
   public static int[][] field_353;
   // $VF: renamed from: d byte[][]
   public static byte[][] field_354;
   // $VF: renamed from: e byte[][]
   public static byte[][] field_355;
   // $VF: renamed from: o byte[]
   public static byte[] field_356;
   // $VF: renamed from: a h
   public final class_1 field_357;
   // $VF: renamed from: a c
   public class_5 field_358 = null;
   // $VF: renamed from: a c[]
   public static class_5[] field_359 = null;
   // $VF: renamed from: p byte[]
   public static byte[] field_360 = null;
   // $VF: renamed from: a java.lang.Thread
   public final Thread field_361;
   // $VF: renamed from: a GloftDIRU
   public static GloftDIRU field_362;
   // $VF: renamed from: co int
   public int field_363 = -1;
   // $VF: renamed from: cp int
   public int field_364 = -1;
   // $VF: renamed from: cq int
   public int field_365;
   // $VF: renamed from: cr int
   public int field_366;
   // $VF: renamed from: cs int
   public int field_367;
   // $VF: renamed from: c a
   public static class_7 field_368;
   // $VF: renamed from: ct int
   public int field_369;
   // $VF: renamed from: r byte
   public byte field_370 = 0;
   // $VF: renamed from: D boolean
   public static boolean field_371 = false;
   // $VF: renamed from: e long
   public long field_372;
   // $VF: renamed from: f long
   public long field_373;
   // $VF: renamed from: g long
   public long field_374;
   // $VF: renamed from: E boolean
   public boolean field_375 = false;
   // $VF: renamed from: F boolean
   public boolean field_376 = false;
   // $VF: renamed from: G boolean
   public boolean field_377 = false;
   // $VF: renamed from: H boolean
   public boolean field_378 = false;
   // $VF: renamed from: I boolean
   public boolean field_379 = false;
   // $VF: renamed from: J boolean
   public boolean field_380 = false;
   // $VF: renamed from: K boolean
   public boolean field_381 = false;
   // $VF: renamed from: L boolean
   public boolean field_382 = false;
   // $VF: renamed from: M boolean
   public boolean field_383 = false;
   // $VF: renamed from: cu int
   public int field_384 = -1;
   // $VF: renamed from: cv int
   public int field_385;
   // $VF: renamed from: cw int
   public int field_386;
   // $VF: renamed from: N boolean
   public boolean field_387;
   // $VF: renamed from: O boolean
   public boolean field_388 = false;
   // $VF: renamed from: cx int
   public int field_389;
   // $VF: renamed from: cy int
   public int field_390;
   // $VF: renamed from: P boolean
   public boolean field_391 = false;
   // $VF: renamed from: Q boolean
   public boolean field_392 = false;
   // $VF: renamed from: cz int
   public int field_393;
   // $VF: renamed from: cA int
   public int field_394;
   // $VF: renamed from: R boolean
   public boolean field_395;
   // $VF: renamed from: S boolean
   public boolean field_396;
   // $VF: renamed from: cB int
   public int field_397;
   // $VF: renamed from: d javax.microedition.lcdui.Image
   public static Image field_398 = null;
   // $VF: renamed from: b javax.microedition.lcdui.Graphics
   public static Graphics field_399 = null;
   // $VF: renamed from: cC int
   public static int field_400 = 0;
   // $VF: renamed from: cD int
   public static int field_401 = 0;
   // $VF: renamed from: cE int
   public static int field_402 = -1;
   // $VF: renamed from: cF int
   public static int field_403 = -1;
   // $VF: renamed from: cG int
   public static int field_404 = -1;
   // $VF: renamed from: cH int
   public static int field_405 = -1;
   // $VF: renamed from: cI int
   public int field_406;
   // $VF: renamed from: cJ int
   public int field_407;
   // $VF: renamed from: cK int
   public int field_408;
   // $VF: renamed from: cL int
   public int field_409;
   // $VF: renamed from: e javax.microedition.lcdui.Image
   public static Image field_410 = null;
   // $VF: renamed from: cM int
   public static int field_411 = 0;
   // $VF: renamed from: cN int
   public static int field_412 = 0;
   // $VF: renamed from: cO int
   public static int field_413 = 0;
   // $VF: renamed from: cP int
   public int field_414 = -1;
   // $VF: renamed from: cQ int
   public int field_415 = -1;
   // $VF: renamed from: cR int
   public int field_416 = -1;
   // $VF: renamed from: cS int
   public int field_417 = -1;
   // $VF: renamed from: cT int
   public int field_418 = -1;
   // $VF: renamed from: cU int
   public int field_419 = -1;
   // $VF: renamed from: cV int
   public int field_420 = -1;
   // $VF: renamed from: T boolean
   public boolean field_421 = true;
   // $VF: renamed from: h long
   public long field_422;
   // $VF: renamed from: cW int
   public int field_423;
   // $VF: renamed from: cX int
   public int field_424;
   // $VF: renamed from: cY int
   public int field_425;
   // $VF: renamed from: cZ int
   public int field_426 = 2;
   // $VF: renamed from: da int
   public int field_427 = 0;
   // $VF: renamed from: db int
   public int field_428;
   // $VF: renamed from: dc int
   public int field_429 = 3;
   // $VF: renamed from: dd int
   public int field_430 = -1;
   // $VF: renamed from: i long
   public long field_431 = 0L;
   // $VF: renamed from: de int
   public int field_432 = -1;
   // $VF: renamed from: f javax.microedition.lcdui.Image
   public static Image field_433 = null;
   // $VF: renamed from: U boolean
   public static boolean field_434 = false;
   // $VF: renamed from: V boolean
   public static boolean field_435 = true;
   // $VF: renamed from: j long
   public long field_436 = 0L;
   // $VF: renamed from: W boolean
   public boolean field_437;
   // $VF: renamed from: X boolean
   public boolean field_438;
   // $VF: renamed from: Y boolean
   public boolean field_439;
   // $VF: renamed from: Z boolean
   public boolean field_440;
   // $VF: renamed from: aa boolean
   public boolean field_441 = false;
   // $VF: renamed from: df int
   public int field_442 = 0;
   // $VF: renamed from: a int[]
   public int[] field_443 = new int[]{0, 0, 0, 0, 0};
   // $VF: renamed from: s byte
   public static byte field_444 = 0;
   // $VF: renamed from: b int[]
   public static final int[] field_445 = new int[]{512, 16384, 131072, 131072, 4096};
   // $VF: renamed from: dg int
   public static int field_446 = 0;
   // $VF: renamed from: dh int
   public static int field_447 = 0;
   // $VF: renamed from: di int
   public static int field_448 = 0;
   // $VF: renamed from: t byte
   public byte field_449;
   // $VF: renamed from: u byte
   public byte field_450;
   // $VF: renamed from: ab boolean
   public boolean field_451 = false;
   // $VF: renamed from: q byte[]
   public static byte[] field_452 = new byte[16];
   // $VF: renamed from: r byte[]
   public static byte[] field_453 = new byte[16];
   // $VF: renamed from: k long
   public long field_454 = 0L;
   // $VF: renamed from: ac boolean
   public boolean field_455;
   // $VF: renamed from: dj int
   public int field_456 = 0;
   // $VF: renamed from: ad boolean
   public boolean field_457;
   // $VF: renamed from: l long
   public long field_458 = 0L;
   // $VF: renamed from: m long
   public long field_459 = 0L;
   // $VF: renamed from: ae boolean
   public boolean field_460 = false;
   // $VF: renamed from: af boolean
   public boolean field_461 = false;
   // $VF: renamed from: n long
   public long field_462;
   // $VF: renamed from: ag boolean
   public boolean field_463;
   // $VF: renamed from: ah boolean
   public boolean field_464;
   // $VF: renamed from: ai boolean
   public boolean field_465;
   // $VF: renamed from: aj boolean
   public boolean field_466 = false;
   // $VF: renamed from: e java.lang.String
   public String field_467;
   // $VF: renamed from: dk int
   public int field_468 = 0;
   // $VF: renamed from: dl int
   public int field_469;
   // $VF: renamed from: dm int
   public int field_470;
   // $VF: renamed from: dn int
   public int field_471;
   // $VF: renamed from: ak boolean
   public static boolean field_472 = false;
   // $VF: renamed from: do int
   public static int field_473;
   // $VF: renamed from: dp int
   public static int field_474;
   // $VF: renamed from: dq int
   public static int field_475;
   // $VF: renamed from: dr int
   public static int field_476;
   // $VF: renamed from: a e
   public class_3 field_477;
   // $VF: renamed from: al boolean
   public boolean field_478 = false;
   // $VF: renamed from: am boolean
   public boolean field_479 = true;
   // $VF: renamed from: ds int
   public int field_480 = -1;
   // $VF: renamed from: dt int
   public int field_481;
   // $VF: renamed from: du int
   public int field_482;
   // $VF: renamed from: v byte
   public byte field_483;
   // $VF: renamed from: dv int
   public int field_484;
   // $VF: renamed from: dw int
   public int field_485;
   // $VF: renamed from: dx int
   public int field_486;
   // $VF: renamed from: dy int
   public int field_487;
   // $VF: renamed from: dz int
   public int field_488;
   // $VF: renamed from: w byte
   public byte field_489;
   // $VF: renamed from: dA int
   public int field_490;
   // $VF: renamed from: dB int
   public int field_491 = -1;
   // $VF: renamed from: x byte
   public byte field_492 = 3;
   // $VF: renamed from: y byte
   public byte field_493;
   // $VF: renamed from: dC int
   public int field_494;
   // $VF: renamed from: dD int
   public int field_495;
   // $VF: renamed from: dE int
   public int field_496;
   // $VF: renamed from: z byte
   public byte field_497;
   // $VF: renamed from: dF int
   public int field_498;
   // $VF: renamed from: dG int
   public int field_499;
   // $VF: renamed from: dH int
   public int field_500;
   // $VF: renamed from: A byte
   public byte field_501;
   // $VF: renamed from: dI int
   public int field_502;
   // $VF: renamed from: dJ int
   public int field_503;
   // $VF: renamed from: d a
   public static class_7 field_504;
   // $VF: renamed from: e int[][]
   public static int[][] field_505;
   // $VF: renamed from: a long[]
   public static long[] field_506 = new long[15];
   // $VF: renamed from: b long[]
   public static long[] field_507 = new long[15];
   // $VF: renamed from: f int[][]
   public static int[][] field_508;
   // $VF: renamed from: c long[]
   public static long[] field_509;
   // $VF: renamed from: d long[]
   public static long[] field_510;
   // $VF: renamed from: an boolean
   public static boolean field_511;
   // $VF: renamed from: dK int
   public int field_512;
   // $VF: renamed from: dL int
   public int field_513;
   // $VF: renamed from: a long[][]
   public static long[][] field_514;
   // $VF: renamed from: a java.lang.StringBuffer
   public static StringBuffer field_515;
   // $VF: renamed from: b java.lang.StringBuffer
   public static StringBuffer field_516;
   // $VF: renamed from: c java.lang.StringBuffer
   public static StringBuffer field_517;
   // $VF: renamed from: g javax.microedition.lcdui.Image
   public static Image field_518;
   // $VF: renamed from: c javax.microedition.lcdui.Graphics
   public static Graphics field_519;
   // $VF: renamed from: dM int
   public int field_520 = 100;
   // $VF: renamed from: dN int
   public int field_521;
   // $VF: renamed from: dO int
   public int field_522;
   // $VF: renamed from: dP int
   public int field_523;
   // $VF: renamed from: dQ int
   public int field_524;
   // $VF: renamed from: dR int
   public int field_525;
   // $VF: renamed from: dS int
   public int field_526;
   // $VF: renamed from: dT int
   public int field_527;
   // $VF: renamed from: dU int
   public int field_528;
   // $VF: renamed from: dV int
   public int field_529;
   // $VF: renamed from: dW int
   public int field_530;
   // $VF: renamed from: ao boolean
   public boolean field_531 = true;
   // $VF: renamed from: ap boolean
   public boolean field_532;
   // $VF: renamed from: dX int
   public int field_533;
   // $VF: renamed from: dY int
   public int field_534;
   // $VF: renamed from: dZ int
   public int field_535;
   // $VF: renamed from: ea int
   public int field_536;
   // $VF: renamed from: eb int
   public static int field_537;
   // $VF: renamed from: ec int
   public int field_538;
   // $VF: renamed from: ed int
   public int field_539;
   // $VF: renamed from: ee int
   public int field_540;
   // $VF: renamed from: ef int
   public int field_541;
   // $VF: renamed from: eg int
   public int field_542;
   // $VF: renamed from: eh int
   public int field_543;
   // $VF: renamed from: ei int
   public int field_544;
   // $VF: renamed from: ej int
   public int field_545;
   // $VF: renamed from: aq boolean
   public boolean field_546 = true;
   // $VF: renamed from: ar boolean
   public boolean field_547 = true;
   // $VF: renamed from: as boolean
   public boolean field_548 = true;
   // $VF: renamed from: c int[]
   public int[] field_549;
   // $VF: renamed from: ek int
   public int field_550;
   // $VF: renamed from: el int
   public int field_551;
   // $VF: renamed from: em int
   public int field_552 = 2;
   // $VF: renamed from: en int
   public int field_553;
   // $VF: renamed from: eo int
   public int field_554 = 2;
   // $VF: renamed from: at boolean
   public boolean field_555;
   // $VF: renamed from: au boolean
   public boolean field_556 = true;
   // $VF: renamed from: av boolean
   public boolean field_557 = true;
   // $VF: renamed from: o long
   public long field_558 = 0L;
   // $VF: renamed from: ep int
   public int field_559 = -1;
   // $VF: renamed from: f java.lang.String
   public String field_560;
   // $VF: renamed from: d java.lang.StringBuffer
   public StringBuffer field_561 = new StringBuffer();
   // $VF: renamed from: aw boolean
   public boolean field_562 = true;
   // $VF: renamed from: ax boolean
   public boolean field_563 = true;
   // $VF: renamed from: eq int
   public int field_564;
   // $VF: renamed from: er int
   public int field_565;
   // $VF: renamed from: a short[][]
   public static final short[][] field_566 = new short[][]{
      {0, 0, 1, 1, 6, 3, 2, 2, 3, 4, 4, 5, 5, 6},
      {0, 25, 1, 26, 2, 2, 6, 4, 3, 49, 4, 27, 5, 6},
      {0, 28, 1, 29, 2, 30, 3, 31},
      {0, 32, 1, 33},
      {0, 45, 1, 46},
      {0, 33, 1, 50},
      {0, 25, 4, 27},
      {0, 101, 1, 100}
   };
   // $VF: renamed from: d int[]
   public static final int[] field_567 = new int[]{28, 29, 30};
   // $VF: renamed from: g int[][]
   public static final int[][] field_568 = new int[][]{
      {8, 9, 10, 11, 12, 14, 15, 16, 17, 20, 21, 22, 23},
      {8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 20, 21, 22},
      {8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 47}
   };
   // $VF: renamed from: a java.lang.String[]
   public static String[] field_569;
   // $VF: renamed from: s byte[]
   public static byte[] field_570 = null;
   // $VF: renamed from: b java.lang.String[]
   public static final String[] field_571 = new String[]{"/w0.bin", "/w1.bin", "/w2.bin"};
   // $VF: renamed from: es int
   public static int field_572 = 0;
   // $VF: renamed from: p long
   public long field_573 = System.currentTimeMillis();
   // $VF: renamed from: g java.lang.String
   public String field_574;
   // $VF: renamed from: et int
   public int field_575;
   // $VF: renamed from: eu int
   public int field_576;
   // $VF: renamed from: ev int
   public int field_577;
   // $VF: renamed from: ew int
   public int field_578;

   public class_8(GloftDIRU var1) {
      super(false);
      field_95 = this;
      this.field_211 = -1;
      this.field_213 = -1;
      this.field_215 = -1;
      field_327 = new class_2[6];
      field_324 = new class_7[61];
      this.method_363();
      field_322 = new Image[33][];
      field_323 = new Image[2][];
      field_362 = var1;
      this.field_357 = new class_1();
      field_168 = true;
      this.setFullScreenMode(true);
      this.method_98();
      this.field_361 = new Thread(this);
      this.field_361.start();
   }

   // $VF: renamed from: a (int, int, int) void
   private void method_63(int var1, int var2, int var3) {
      this.field_213 = -1;
      this.field_216 = -1;
      this.field_215 = -1;
      class_2 var4;
      int var5;
      if ((var5 = (var4 = field_327[(this.field_236 & 16384) == 0 ? 0 : 3]).field_25) != 40) {
         if (var5 != 48) {
            if (var5 != 47) {
               if (this.field_244 <= 0L && this.field_243 == 0 && this.field_257 == 0 && this.field_200 != 6 && (this.field_236 & 112) == 0
                  || this.field_237 > 0) {
                  this.field_250++;
                  this.method_64((byte)(this.field_242 - var1));
                  if (this.field_260 == 0 && this.field_242 == 0) {
                     this.field_458 = 0L;
                     this.field_363 = this.field_283;
                     this.field_364 = this.field_284;
                     field_368 = null;
                  }

                  this.field_236 = this.field_236 & -113 | var2;
                  this.method_436(5);
                  switch (var2) {
                     case 16:
                        this.field_193 = this.field_194 = 0;
                        this.field_237 = 5;
                        field_338[this.field_233][this.field_234] = 9;
                        this.field_236 = this.field_236 & -113 | 0;
                        field_337[this.field_233][this.field_234] = 138412032;
                        field_340[this.field_233][this.field_234] = 24;
                        return;
                     case 64:
                        this.method_214(1000);
                        return;
                  }

                  this.method_214(10);
                  if (var3 != 0) {
                     byte var6 = (byte)var3;

                     do {
                        int var7 = this.field_233 - field_329[var6];
                        int var8 = this.field_234 - field_329[var6 + 8];
                        if (field_338[var7][var8] < 0 && (byte)(field_336[var7][var8] & 0xFF) < 0) {
                           this.field_233 = var7;
                           this.field_234 = var8;
                           this.field_235 = 18;
                           this.field_199 = 0;
                           this.field_236 = this.field_236 & -8 | var6 | 2048;
                           return;
                        }
                     } while ((var6 = var6 >= 4 ? 1 : (byte)(var6 + 1)) != var3);
                  }
               }
            }
         }
      }
   }

   // ==========================================
   // CHEAT EXTENSIONS
   // ==========================================
   public static boolean cheatGodMode = false;

   public static void applyCheatMaxLives() {
      if (field_334 != null) {
         field_334[3] = 99; // 99 Lives
         field_334[8] = 8;  // 8 Hearts max health
         field_334[9] = 8;  // Blue potion x8
         field_334[1] |= 0x0F; // Unlock Tools
         field_334[2] |= 0x0F;
      }
      if (field_95 != null) {
         field_95.field_242 = 8;
         field_95.field_441 = true;
      }
   }

   public static void applyCheatMaxDiamonds() {
      if (field_95 != null) {
         int target = field_95.field_248 > 0 ? field_95.field_248 : 50;
         field_95.field_247 = target;
         field_95.field_249 = target;
      }
   }

   public static void applyCheatSkipLevel() {
      if (field_95 != null) {
         field_95.field_441 = true;
         field_95.method_225();
      }
   }

   public static void applyCheatUnlockAllWorlds() {
      if (field_95 != null) {
         field_95.field_395 = true;
         field_95.field_396 = true;
         for (int var2 = 0; var2 <= 2; var2++) {
            int var3 = field_95.method_124(var2);
            if (var2 == 2) {
               var3++;
            }
            for (int var4 = 0; var4 <= var3; var4++) {
               field_95.method_119(var2, var4, (byte)2);
            }
         }
      }
   }

   public static void openGameloftCheatMenu() {
      if (field_95 != null) {
         field_171 = 0;
         field_225 = 24;
         field_95.field_393 = field_334 != null ? field_334[8] : 4;
         field_95.field_394 = field_334 != null ? field_334[9] : 0;
         field_95.field_395 = false;
         field_95.field_396 = false;
      }
   }

   // $VF: renamed from: a (byte) void
   private void method_64(byte var1) {
      if (cheatGodMode) {
         this.field_242 = (byte)(field_334 != null && field_334[8] > 0 ? field_334[8] : 8);
         this.method_98();
         return;
      }
      label14: {
         this.field_242 = var1;
         class_8 var10000;
         byte var10001;
         if (this.field_242 <= 0) {
            var10000 = this;
            var10001 = 0;
         } else {
            if (this.field_242 <= field_334[8]) {
               break label14;
            }

            var10000 = this;
            var10001 = field_334[8];
         }

         var10000.field_242 = var10001;
      }

      this.method_98();
   }

   // $VF: renamed from: a (int) void
   public final void method_65(int var1) {
      this.field_267 = this.field_266;
      this.field_265 = false;
      this.field_268 = 0;
      this.field_266 = var1;
      this.field_423 = 0;
      if (var1 >= 0) {
         this.method_174();
      }
   }

   // $VF: renamed from: a (int) boolean
   public static boolean method_66(int var0) {
      return (field_171 & var0) != 0;
   }

   public final void keyPressed(int var1) {
      int var2 = method_370(var1);
      field_171 |= var2;
      this.field_99 = false;
   }

   public final void keyReleased(int var1) {
      field_171 = field_171 & ~method_370(var1);
      this.field_99 = true;
   }

   // $VF: renamed from: g () void
   private void method_67() {
      this.field_231 = System.currentTimeMillis();
      field_229 = 0;
      field_230 = 0;
      this.field_178 = 0;
   }

   // $VF: renamed from: a (long) void
   private static void method_68(long var0) {
      if (var0 > 0L) {
         System.currentTimeMillis();

         try {
            Thread.sleep(var0);
         } catch (Exception var5) {
         }
      }
   }

   // $VF: renamed from: run () void
   public final void run() {
      this.field_231 = System.currentTimeMillis();
      this.method_67();
      this.method_113();

      while (!this.field_307) {
         Thread.yield();
         if (!this.field_460) {
            this.field_372 = System.currentTimeMillis();

            try {
               this.method_69();
            } catch (Exception var2) {
               var2.printStackTrace();
               method_68(5000L);
            }

            if (this.field_307) {
               break;
            }

            if (field_225 != 2) {
               field_229++;
            }

            this.field_373 = System.currentTimeMillis();
            if (this.field_374 > 65L) {
               method_68(100L - this.field_374 - this.field_373);
               this.field_232 = true;
               this.field_374 = 0L;
            } else {
               this.method_134(this.getGraphics());
               this.flushGraphics();
               this.field_232 = false;
               if (field_225 != 2) {
                  field_230++;
               }

               this.field_374 = Math.abs(System.currentTimeMillis() - this.field_372);
               method_68(50L - (System.currentTimeMillis() - this.field_372));
            }
         }
      }

      this.method_97();
      this.field_357.method_4();
      field_362.method_61();
   }

   // $VF: renamed from: h () void
   private void method_69() throws Exception {
      this.method_439();
      this.method_220();
      switch (field_225) {
         case 0:
            field_327[0] = new class_2(method_357("/ui.f", 0), 0, 0, null);
            field_327[0].method_10(0);
            field_225 = 6;
            this.method_67();
            return;
         case 1:
            this.method_239();
            return;
         case 2:
         case 12:
            return;
         case 3:
            this.field_307 = true;
            return;
         case 4:
         case 10:
         case 13:
         case 14:
         case 18:
         case 19:
         case 23:
         case 24:
         case 25:
         case 26:
         case 30:
         case 32:
         case 33:
         case 34:
         default:
            break;
         case 5:
            if (this.field_333 && this.field_270 <= 5) {
               this.method_115(this.field_270++);

               for (int var5 = 0; var5 < 3; var5++) {
                  field_124[var5] = false;
               }

               for (int var6 = 1; var6 < 3; var6++) {
                  field_122[var6] = false;
               }

               this.method_67();
               if (this.field_270 == 5) {
                  this.field_383 = true;
                  this.field_382 = true;
                  this.field_381 = true;
                  this.field_202 = 0;
                  this.field_203 = 13;
                  field_171 = 0;
               }
            } else {
               this.method_80();
            }

            this.method_67();
            return;
         case 6:
            if (field_229 < 60) {
               field_327[0].method_14();
               return;
            }

            field_569 = method_79("/lang.f", 115);
            method_445();
            field_324[18] = method_357("/ui.f", 3);
            this.method_97();
            this.method_65(3);
            field_225 = 7;
            return;
         case 7:
            if (this.field_265) {
               field_225 = 8;
               this.field_270 = 0;
               this.field_269 = 32;
               return;
            }
            break;
         case 8:
            android.util.Log.i("DiamondRush", "Loading case 8, step: " + this.field_270);
            this.method_78(this.field_270++);
            this.method_67();
            return;
         case 9:
            try {
               if (field_335 != null && field_335.length > 0 && (field_335[0] & 1) == 0) {
                  this.field_478 = true;
               }

               this.method_111();
               int var1 = this.field_269 == 8 ? this.field_270 : this.field_270 - 24;
               this.method_172(var1);
               var1++;
               this.field_270++;
               this.field_438 = true;
               if (var1 == 8) {
                  if (this.field_375) {
                     field_225 = 4;
                     if (this.field_266 == -1) {
                        this.field_226 = 0;
                        this.method_65(0);
                     } else {
                        this.field_226 = 2;
                     }
                  } else {
                     field_225 = 30;
                     this.field_375 = true;
                  }

                  this.field_357.method_7(19);
               }
            } catch (Exception var3) {
               android.util.Log.e("DiamondRush", "Exception in loading case 9: " + var3.getMessage(), var3);
            }

            this.method_67();
            return;
         case 11:
            this.field_379 = true;
            this.field_377 = true;
            field_225 = 5;
            this.field_392 = true;
            this.method_67();
            return;
         case 15:
            this.method_76();
            return;
         case 16:
            this.field_333 = true;
            this.method_88();
            field_171 = 0;
            return;
         case 17:
            this.method_253();
            return;
         case 20:
            if (field_229 > 30) {
               this.field_313 = true;
               this.field_379 = true;
               this.field_377 = true;
               this.method_411();
               return;
            }
            break;
         case 21:
            this.method_428(this.field_270++);
            this.method_67();
            return;
         case 22:
            this.method_437();
            return;
         case 27:
            this.method_77();
            return;
         case 28:
            try {
               this.method_73(this.field_270);
               this.field_270++;
               if (this.field_270 == 11) {
                  field_225 = 27;
               }
            } catch (Exception var2) {
            }

            this.method_67();
            return;
         case 29:
            this.method_71();
            break;
         case 31:
            return;
         case 35:
            this.method_252(this.field_270++);
            this.method_67();
            if (this.field_270 == 12) {
               field_225 = 17;
               this.field_226 = 0;
               this.method_436(15);
               return;
            }
      }
   }

   // $VF: renamed from: i () void
   private void method_70() {
      label25: {
         class_8 var10000;
         byte var10001;
         if (this.field_151 >= this.field_154) {
            var10000 = this;
            var10001 = -1;
         } else {
            if (this.field_151 > -this.field_154) {
               break label25;
            }

            var10000 = this;
            var10001 = 1;
         }

         var10000.field_152 = var10001;
      }

      label19: {
         this.field_151 = this.field_151 + this.field_152 * this.field_156;
         class_8 var1;
         byte var2;
         if (this.field_150 >= this.field_155) {
            var1 = this;
            var2 = -1;
         } else {
            if (this.field_151 > -this.field_155) {
               break label19;
            }

            var1 = this;
            var2 = 1;
         }

         var1.field_153 = var2;
      }

      this.field_150 = this.field_150 + this.field_153 * this.field_157;
   }

   // $VF: renamed from: j () void
   private void method_71() {
      switch (this.field_148) {
         case 0:
            if (System.currentTimeMillis() - this.field_231 >= 3000L) {
               this.field_148++;
               this.method_67();
               return;
            }
            break;
         case 1:
            class_8 var10000;
            boolean var10001;
            if (field_229 % 6 >= 3) {
               this.field_149 += 1677721;
               var10000 = this;
               var10001 = false;
            } else {
               var10000 = this;
               var10001 = true;
            }

            var10000.field_562 = var10001;
            if (System.currentTimeMillis() - this.field_231 >= 5000L) {
               this.field_148++;
               this.field_562 = true;
               this.method_67();
               return;
            }
            break;
         case 2:
            this.method_70();
            if (System.currentTimeMillis() - this.field_231 >= 10000L) {
               this.field_150 = 0;
               this.field_151 = 0;
               this.method_67();
               this.field_148++;
               return;
            }
            break;
         case 3:
            if (System.currentTimeMillis() - this.field_231 >= 1000L) {
               this.field_148++;
               return;
            }
            break;
         case 4:
            if (System.currentTimeMillis() - this.field_231 >= 1000L) {
               this.field_148++;
               return;
            }
            break;
         case 5:
            if (System.currentTimeMillis() - this.field_231 >= 1000L) {
               this.field_148++;
               return;
            }
            break;
         case 6:
            if (System.currentTimeMillis() - this.field_231 >= 1000L) {
               this.field_148++;
               this.method_67();
               return;
            }
            break;
         case 7:
            if (System.currentTimeMillis() - this.field_231 >= 1000L) {
               class_6.field_59 = new byte[12][13];
               this.field_148++;
               class_6.method_43(3);
               this.field_357.method_7(19);
               this.method_67();
               return;
            }
            break;
         case 8:
            class_6.method_42(3);
            this.field_562 = true;
            if (System.currentTimeMillis() - this.field_231 >= 15000L) {
               this.field_148++;
               this.method_67();
               return;
            }
            break;
         case 9:
            this.field_562 = true;
            class_6.method_42(3);
            if (System.currentTimeMillis() - this.field_231 >= 12000L) {
               this.field_148++;
               this.method_67();
               return;
            }
            break;
         case 10:
            this.method_97();
            this.method_65(0);
            field_225 = 22;
            this.field_226 = 0;
            this.field_357.method_8();
      }
   }

   // $VF: renamed from: k () void
   private void method_72() {
      this.field_376 = false;
      method_96(field_324[17], true);
      field_324[17] = null;
      int var1 = class_3.field_29.length;

      for (int var2 = 0; var2 < var1; var2++) {
         class_3.field_29[var2] = null;
      }

      class_3.field_29 = null;
      method_96(field_324[10], true);
      field_324[10] = null;
      method_96(field_324[46], true);
      field_324[46] = null;
      method_96(field_324[55], true);
      field_324[55] = null;
      field_322[8] = null;
      method_96(field_324[59], true);
      field_322[3] = null;
      method_96(field_324[17], true);
      field_324[17] = null;
      System.gc();
   }

   // $VF: renamed from: c (int) void
   private void method_73(int var1) {
      switch (var1) {
         case 0:
            if (this.field_380) {
               this.method_94();
               return;
            }
            break;
         case 1:
            if (this.field_377) {
               this.method_410();
               return;
            }
            break;
         case 2:
            if (this.field_382) {
               this.method_117();
               return;
            }
            break;
         case 3:
            if (this.field_381) {
               System.gc();
               this.field_381 = false;
               return;
            }
            break;
         case 4:
            this.method_97();
            class_3.field_29 = method_359("/demoui.f", 0);
            if (field_324[10] == null) {
               field_324[10] = method_357("/mmv.f", 0);
            }

            if (field_324[46] == null) {
               field_324[46] = method_357("/mmv.f", 5);
            }

            this.field_119 = 240 - method_405(field_324[10], 0) >> 1;
            this.field_120 = 320 - method_404(field_324[10], 0) - 48 >> 1;
            return;
         case 5:
            if (field_324[55] == null) {
               field_324[55] = method_357("/mmv.f", 4);
               this.field_117 = method_316(field_324[55], 0);
               field_328 = field_324[55];
            }

            if (field_324[18] == null) {
               field_324[18] = method_357("/ui.f", 3);
               return;
            }
            break;
         case 6:
            if (field_324[54] == null) {
               field_324[54] = method_357("/mmv.f", 1);
            }

            this.field_129 = method_405(field_324[54], 0) >> 1;
            this.field_130 = method_404(field_324[54], 0) >> 1;
            return;
         case 7:
            if (field_324[53] == null) {
               field_324[53] = method_357("/mmv.f", 2);
               return;
            }
            break;
         case 8:
            if (field_324[52] == null) {
               field_324[52] = method_357("/mmv.f", 3);
               return;
            }
            break;
         case 9:
            try {
               class_7 var6 = method_358("/" + 0 + ".f", 3, 0);
               field_322[8] = var6.field_85[0];
               (var6 = method_358("/cm.f", 2, 0)).method_46(0, 0, -1, -1);
               var6.method_46(1, 0, 0, -1);
               field_324[59] = var6;
               class_6.field_67 = var6.field_85[0].length;
               var6.field_83 = null;
               if (field_324[17] == null) {
                  field_324[17] = method_357("/ms.f", 0);
               }

               return;
            } catch (Exception var4) {
               return;
            }
         case 10:
            if (field_324[9] == null) {
               field_324[9] = method_357("/cm.f", 7);
            }

            this.field_132 = method_316(field_324[9], 5);
            byte var2 = field_334[2];

            for (int var3 = 0; var3 < 3; var3++) {
               if ((var2 & 1 << var3) != 0) {
                  field_124[var3] = true;
               }
            }

            label88: {
               this.field_127 = 10;
               this.field_128 = 10;
               boolean[] var10000;
               byte var10001;
               boolean var10002;
               if (((var2 = field_334[1]) & 1) != 0) {
                  var10000 = field_122;
                  var10001 = 1;
                  var10002 = true;
               } else {
                  if (method_246(field_334, 6) >= class_0.field_1[1]) {
                     field_334[1] = (byte)(field_334[1] | 1);
                     this.method_112();
                     this.field_121 = 1;
                     this.field_104 = 1;
                     break label88;
                  }

                  var10000 = field_122;
                  var10001 = 1;
                  var10002 = false;
               }

               var10000[var10001] = var10002;
            }

            label82: {
               boolean[] var8;
               byte var9;
               boolean var10;
               if ((var2 & 2) != 0) {
                  var8 = field_122;
                  var9 = 2;
                  var10 = true;
               } else {
                  if (method_246(field_334, 6) >= class_0.field_1[2]) {
                     field_334[1] = (byte)(field_334[1] | 2);
                     this.method_112();
                     this.field_121 = 2;
                     this.field_104 = 2;
                     break label82;
                  }

                  var8 = field_122;
                  var9 = 2;
                  var10 = false;
               }

               var8[var9] = var10;
            }

            this.field_105 = class_0.field_3[this.field_104 << 1];
            this.field_106 = class_0.field_3[(this.field_104 << 1) + 1];
            this.field_107 = this.field_105;
            this.field_108 = this.field_106;
            this.method_74();
            this.field_113 = true;
            this.field_562 = true;
      }
   }

   // $VF: renamed from: l () void
   private void method_74() {
      class_8 var10000;
      StringBuffer var10001;
      String var10002;
      if (this.field_104 == 3) {
         var10000 = this;
         var10001 = new StringBuffer();
         var10002 = field_569[82];
      } else if (method_75(this.field_104)) {
         var10000 = this;
         var10001 = new StringBuffer();
         var10002 = field_569[82];
      } else {
         var10000 = this;
         var10001 = new StringBuffer().append(class_0.field_1[this.field_104]).append(" ");
         var10002 = field_569[114].toLowerCase();
      }

      var10000.field_109 = var10001.append(var10002).append(" ").append(field_569[79]).toString();
      String[] var3;
      byte var4;
      switch (this.field_104) {
         case 0:
            var10000 = this;
            var3 = field_569;
            var4 = 28;
            break;
         case 1:
            var10000 = this;
            var3 = field_569;
            var4 = 29;
            break;
         case 2:
            var10000 = this;
            var3 = field_569;
            var4 = 30;
            break;
         case 3:
            var10000 = this;
            var3 = field_569;
            var4 = 31;
            break;
         default:
            return;
      }

      var10000.field_110 = var3[var4];
   }

   // $VF: renamed from: b (int) boolean
   private static boolean method_75(int var0) {
      return var0 != 0 && var0 != 3 ? method_246(field_334, 6) >= class_0.field_1[var0] : true;
   }

   // $VF: renamed from: m () void
   private void method_76() {
      if (this.field_146 > 0 || this.field_147 > 0) {
         StringBuffer var1 = new StringBuffer();
         if (this.field_146 > 0) {
            label29: {
               var1.append(field_569[92]).append("\n");
               byte[] var10000;
               byte var10001;
               byte var10002;
               byte var10003;
               switch (this.field_146) {
                  case 1:
                     var1.append(field_569[29]);
                     var10000 = field_334;
                     var10001 = 2;
                     var10002 = field_334[2];
                     var10003 = 8;
                     break;
                  case 2:
                     var1.append(field_569[30]);
                     field_334[2] = (byte)(field_334[2] | 8);
                     var10000 = field_334;
                     var10001 = 2;
                     var10002 = field_334[2];
                     var10003 = 16;
                     break;
                  default:
                     break label29;
               }

               var10000[var10001] = (byte)(var10002 | var10003);
            }

            this.method_112();
            this.field_146 = 0;
         }

         if (this.field_147 > 0) {
            if (var1.length() > 0) {
               var1.append("\n\n");
            }

            var1.append(field_569[99]).append("\n").append(field_569[85 + this.field_147 - 1]);
            this.field_147 = 0;
         }

         if (var1.length() > 0) {
            this.method_440(var1.toString(), -1, -1, 5000, 4273165, 0);
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_77() {
      if (!this.field_232) {
         this.field_107 = this.field_105;
         this.field_108 = this.field_106;
      }

      if (this.field_112) {
         field_171 = 0;
         int var1 = this.field_115 - this.field_105;
         int var2 = this.field_116 - this.field_106;
         this.field_105 = this.field_105 + var1 / (8 - this.field_114);
         this.field_106 = this.field_106 + var2 / (8 - this.field_114);
         this.field_114++;
         if (this.field_114 == 8) {
            this.field_105 = this.field_115;
            this.field_106 = this.field_116;
            this.field_112 = false;
            this.field_114 = 0;
            this.field_113 = true;
            this.method_74();
            return;
         }
      } else {
         label32:
         switch (this.field_111) {
            case -1:
               break;
            case 4:
               switch (this.field_104) {
                  case 0:
                     this.field_376 = true;
                     this.field_377 = true;
                     this.field_357.method_8();
                     this.field_202 = 0;
                     this.field_158 = false;
                     field_225 = 15;
                     field_537 = this.method_121(this.field_202);
                     this.method_411();
                     break label32;
                  case 1:
                     if (method_75(this.field_104)) {
                        this.field_376 = true;
                        this.field_377 = true;
                        this.field_357.method_8();
                        this.field_202 = 1;
                        this.field_203 = 0;
                        field_225 = 15;
                        field_537 = this.method_121(this.field_202);
                        this.method_411();
                        this.field_182 = true;
                        this.field_158 = false;
                        if (field_334[9] < 1) {
                           field_334[9] = 1;
                        }
                     }
                     break label32;
                  case 2:
                     if (method_75(this.field_104)) {
                        this.field_376 = true;
                        this.field_377 = true;
                        this.field_357.method_8();
                        this.field_202 = 2;
                        this.field_203 = 0;
                        this.field_158 = false;
                        field_225 = 15;
                        field_537 = this.method_121(this.field_202);
                        this.method_411();
                        this.field_182 = true;
                        if (field_334[9] < 2) {
                           field_334[9] = 2;
                        }
                     }
                     break label32;
                  case 3:
                     field_225 = 18;
                  default:
                     break label32;
               }
            default:
               byte var3;
               if ((var3 = class_0.field_4[this.field_111][this.field_104]) != -1) {
                  this.field_104 = var3;
                  this.field_112 = true;
                  this.field_115 = class_0.field_3[this.field_104 * 2];
                  this.field_116 = class_0.field_3[this.field_104 * 2 + 1];
               }
         }

         this.field_111 = -1;
      }
   }

   // $VF: renamed from: d (int) void
   private void method_78(int var1) {
      if (var1 < 21) {
         if (var1 == 0) {
            this.field_357.method_2();
         }

         this.field_357.method_0(var1);
         if (var1 == 20) {
            this.field_357.method_3();
         }

         System.gc();
      } else {
         switch (var1) {
            case 21:
               field_324[9] = method_357("/cm.f", 7);
               return;
            case 22:
               field_324[0] = method_357("/ui.f", 2);
               return;
            case 23:
               field_323[0] = method_360("/demoui.f", 0, 0);
               field_323[1] = method_360("/demoui.f", 0, 1);
               return;
            case 24:
               this.field_357.method_1();
               field_225 = 9;
               this.method_65(-1);
               field_515 = new StringBuffer(field_569[8]);
               field_515.delete(field_515.length() - 1, field_515.length());
               field_516 = new StringBuffer(field_569[20]);
               field_516.delete(field_516.length() - 1, field_516.length());
               field_517 = new StringBuffer("1");
         }
      }
   }

   // $VF: renamed from: a (java.lang.String, int) java.lang.String[]
   public static String[] method_79(String var0, int var1) {
      byte[] var2 = method_362(var0, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      String[] var6 = new String[var1];

      while (var5 < var1) {
         if (var2[var3 + var4] == 0) {
            try {
               var6[var5] = new String(var2, var3, var4, "ISO-8859-1");
            } catch (Exception var8) {
               var8.printStackTrace();
            }

            var3 += var4 + 1;
            var4 = 0;
            var5++;
         } else {
            var4++;
         }
      }

      return var6;
   }

   // $VF: renamed from: o () void
   private void method_80() {
      try {
         int var1 = this.field_270;
         if (this.field_333) {
            var1 -= 5;
         }

         this.field_270++;
         switch (var1) {
            case 0:
               if (this.field_383) {
                  this.method_112();
               }

               return;
            case 1:
               if (this.field_382) {
                  this.method_117();
               }

               return;
            case 2:
               if (this.field_381) {
                  System.gc();
                  this.field_381 = false;
               }

               return;
            case 3:
               field_324[41].method_47(1);
               field_324[41].method_47(2);
               return;
            case 4:
               if (this.field_379) {
                  this.method_97();
               }

               return;
            case 5:
               if (this.field_377) {
                  this.method_410();
               }

               return;
            case 6:
               label173: {
                  int var11;
                  class_8 var10000;
                  int var10001;
                  if ((var11 = method_105()) < 1) {
                     var10000 = this;
                     var10001 = var11;
                  } else {
                     if ((this.field_170 + 9) % 9 >= 1) {
                        break label173;
                     }

                     var10000 = this;
                     var10001 = 1;
                  }

                  var10000.field_170 = var10001;
               }

               method_406(this.field_170 % 9);
               return;
            case 7:
               this.method_109();
               return;
            case 8:
               method_148();
               this.method_132();
               return;
            case 9:
               this.method_299();
               return;
            case 10:
               String var10 = "/" + this.field_202 + ".f";
               this.field_310 = javax.microedition.lcdui.ResourceLoader.open(var10);
               this.field_308 = this.field_310.read();
               field_351 = new byte[this.field_308 << 3];
               this.field_310.read(field_351);
               return;
            default:
               int var2;
               if ((var2 = var1 - 10 - 1) < 4) {
                  this.method_99(var2);
                  this.field_271 = 0;
               } else {
                  var2 -= 4;
                  if (var2 >= 0 && var2 < 43) {
                     this.method_102(var2);
                  } else {
                     var2 -= 43;
                     if (var2 >= 0 && var2 < 8) {
                        this.method_100(var2);
                        if (var2 == 7) {
                           this.field_310.close();
                           this.field_310 = null;
                           System.gc();
                        }
                     } else {
                        var2 -= 8;
                        if (var2 >= 0 && var2 < 16) {
                           if (var2 < field_359.length) {
                              field_359[var2] = new class_5(this);
                              field_359[var2].method_37(field_360[var2]);
                           }

                           if (var2 == 15 && field_359.length >= 16) {
                              for (int var14 = 16; var14 < field_359.length; var14++) {
                                 field_359[var14] = new class_5(this);
                                 field_359[var14].method_37(field_360[var14]);
                              }
                           }
                        } else {
                           var2 -= 16;
                           if (var2 >= 0 && var2 < 3) {
                              switch (this.field_177) {
                                 case 1:
                                    this.method_104(var2);
                                    if (var2 == 2) {
                                       this.field_310.close();
                                       this.field_310 = null;
                                    }

                                    return;
                                 case 2:
                                 default:
                                    return;
                                 case 3:
                                    if (var2 > 0) {
                                       return;
                                    }

                                    class_7 var13 = method_358("/mmv.f", 1, 0);
                                    field_322[31] = var13.field_85[0];
                                    field_327[5] = new class_2(method_357("/mm1.f", 0), 0, 0, null);
                                    field_327[5].method_10(0);
                                    return;
                                 case 4:
                                    if (var2 >= 2) {
                                       return;
                                    }

                                    this.method_103(var2);
                                    class_7 var12 = method_358("/mmv.f", 3, 0);
                                    field_322[32] = var12.field_85[0];
                                    field_324[20] = method_358("/gen0.f", 7, 0);
                                    if (var2 == 1) {
                                       this.field_310.close();
                                       this.field_310 = null;
                                    }

                                    return;
                                 case 5:
                                    class_7 var3 = method_358("/mmv.f", 2, 0);
                                    field_322[30] = var3.field_85[0];
                                    field_324[20] = method_358("/gen0.f", 7, 0);
                                    field_327[5] = new class_2(method_357("/b1.f", 0), 0, 0, null);
                                    field_327[5].method_10(10);
                              }
                           } else {
                              var2 -= 3;
                              switch (var2) {
                                 case 0:
                                    field_351 = null;
                                    this.method_82(
                                       field_324[12] != null
                                          || field_322[6] != null
                                          || field_324[58] != null
                                          || this.field_177 == 1
                                          || this.field_177 == 4
                                          || this.field_177 == 5
                                    );
                                    return;
                                 case 1:
                                    this.field_331 = 0L;
                                    this.field_332 = 0L;
                                    this.field_272 = 0;
                                    this.field_170++;
                                    method_106(this.field_170 < 3 ? this.field_170 : 3);
                                    this.method_112();
                                    return;
                                 case 2:
                                    field_352 = new int[this.field_208][this.field_209];
                                    field_354 = new byte[this.field_208][this.field_209];
                                    field_355 = new byte[this.field_208][this.field_209];
                                    field_353 = new int[this.field_208][this.field_209];
                                    if (field_348 != null) {
                                       field_356 = new byte[field_348.length];
                                       return;
                                    }
                                    break;
                                 case 3:
                                    this.method_373();
                                    return;
                                 case 4:
                                    this.field_260 = 0;
                                    this.field_165 = this.field_166 = 0;
                                    this.method_349();
                                    return;
                                 case 5:
                                    this.field_263 = field_229 + 60;
                                    this.field_264 = field_569[38] + "\n" + this.field_159 + " " + field_569[39];
                                    this.method_98();
                                    return;
                                 case 6:
                                    method_96(field_325, true);
                                    field_325 = null;
                                    System.gc();
                                    return;
                                 case 7:
                                    this.field_333 = false;
                                    field_326 = null;
                                    System.gc();
                                    this.field_357.method_7(16 + this.field_202);
                                    field_225 = 1;
                              }
                           }
                        }
                     }
                  }
               }
         }
      } catch (Exception var4) {
      }
   }

   // $VF: renamed from: a () int
   private static int method_81() {
      return field_334[8] - 4;
   }

   // $VF: renamed from: a (boolean) void
   private void method_82(boolean var1) {
      try {
         InputStream var2;
         byte[] var4 = new byte[(var2 = javax.microedition.lcdui.ResourceLoader.open("/o.f")).read() << 3];
         var2.read(var4);
         byte[] var6 = new byte[method_247(var4, 4)];
         var2.read(var6);
         if (!var1) {
            var2.close();
            var2 = null;
            System.gc();
         }

         class_7 var7;
         (var7 = new class_7()).method_45(var6, 0);
         this.field_384 = method_81();
         var7.method_46(this.field_384, 0, -1, -1);
         var7.field_80 = this.field_384;
         var7.field_83 = null;
         field_327[0] = new class_2(var7, 0, 0, null);
         System.gc();
         if (var1) {
            var6 = new byte[method_247(var4, 12)];
            var2.read(var6);
            var2.close();
            System.gc();
            (var7 = new class_7()).method_45(var6, 0);
            var7.method_46(0, 0, -1, -1);
            var7.field_83 = null;
            field_327[3] = new class_2(var7, 0, 0, null);
            System.gc();
         }
      } catch (Exception var8) {
      }
   }

   // $VF: renamed from: b () int
   private int method_83() {
      return field_566[this.field_266][this.field_268 << 1];
   }

   // $VF: renamed from: p () void
   private void method_84() {
      field_324[41].field_80 = 0;
      this.field_265 = true;
      switch (this.field_266) {
         case 0:
            this.method_91();
            return;
         case 1:
            this.method_87();
            return;
         case 2:
            this.method_89();
            return;
         case 3:
            this.method_90();
            return;
         case 5:
            this.method_86();
         case 4:
         case 6:
         default:
            return;
         case 7:
            this.method_85();
      }
   }

   // $VF: renamed from: q () void
   private void method_85() {
      switch (this.method_83()) {
         case 0:
            if (this.field_267 == 0) {
               field_225 = 4;
            }

            this.method_65(this.field_267);
            break;
         case 1:
            switch (this.field_226) {
               case 1:
                  this.method_88();
               case 2:
               default:
                  break;
               case 3:
                  field_225 = 15;
                  this.field_379 = true;
                  this.field_377 = true;
                  this.method_411();
                  break;
               case 4:
                  this.method_97();
                  field_225 = 9;
                  this.field_269 = 8;
                  this.method_65(-1);
                  this.field_270 = 0;
                  break;
               case 5:
                  field_225 = 3;
                  this.field_357.method_4();
                  field_362.notifyDestroyed();
            }
      }

      this.field_226 = -1;
   }

   // $VF: renamed from: r () void
   private void method_86() {
      byte var10000;
      byte var10001;
      byte var10002;
      switch (this.method_83()) {
         case 0:
            class_1.field_12 = !class_1.field_12;
            byte var1;
            if (class_1.field_12) {
               var1 = 32;
               this.method_436(0);
            } else {
               this.field_357.method_8();
               this.field_357.method_8();
               var1 = 33;
            }

            var10000 = 5;
            var10001 = 0;
            var10002 = var1;
            break;
         case 1:
            field_168 = !field_168;
            byte var2 = 51;
            if (field_168) {
               var2 = 50;
               method_265(200);
            }

            var10000 = 5;
            var10001 = 1;
            var10002 = var2;
            break;
         default:
            return;
      }

      method_435(var10000, var10001, var10002);
   }

   // $VF: renamed from: s () void
   private void method_87() {
      switch (this.method_83()) {
         case 0:
            field_225 = 1;
            field_518 = null;
            field_433 = null;
            return;
         case 1:
            this.method_65(7);
            this.field_226 = 1;
            return;
         case 2:
            this.method_65(5);
            return;
         case 3:
            if (this.field_203 != 13 || this.field_202 != 0) {
               this.method_65(7);
               this.field_226 = 3;
               return;
            }
            break;
         case 4:
            this.method_65(7);
            this.field_226 = 4;
            return;
         case 5:
            this.method_65(7);
            this.field_226 = 5;
            return;
         case 6:
            field_225 = 33;
            this.field_562 = true;
            return;
         default:
            this.field_265 = false;
      }
   }

   // $VF: renamed from: t () void
   private void method_88() {
      class_8 var10000;
      byte var10001;
      if (this.field_333) {
         var10000 = this;
         var10001 = 97;
      } else {
         var10000 = this;
         var10001 = 92;
      }

      var10000.field_269 = var10001;
      this.field_270 = 0;
      this.field_379 = true;
      this.field_241 = false;
      field_225 = 11;
      this.field_236 = this.field_200 = this.field_199 = 0;
      this.field_213 = this.field_214 = -1;
      this.field_244 = 0L;
   }

   // $VF: renamed from: u () void
   private void method_89() {
      switch (this.method_83()) {
         case 0:
            this.field_357.method_8();
            this.field_202 = 0;
            this.field_158 = false;
            field_225 = 15;
            field_537 = this.method_121(this.field_202);
            this.field_377 = true;
            this.method_411();
            return;
         case 1:
            this.field_357.method_8();
            this.field_202 = 1;
            this.field_203 = 0;
            field_225 = 15;
            field_537 = this.method_121(this.field_202);
            this.field_377 = true;
            this.method_411();
            this.field_182 = true;
            this.field_158 = false;
            if (field_334[9] < 1) {
               field_334[9] = 1;
               return;
            }
            break;
         case 2:
            this.field_357.method_8();
            this.field_202 = 2;
            this.field_203 = 0;
            this.field_158 = false;
            field_225 = 15;
            field_537 = this.method_121(this.field_202);
            this.field_377 = true;
            this.method_411();
            this.field_182 = true;
            if (field_334[9] < 2) {
               field_334[9] = 2;
            }

            if (field_334[8] < 8) {
               field_334[8] = 8;
               return;
            }
            break;
         case 3:
            this.method_65(4);
            return;
         default:
            field_225 = 3;
            this.field_357.method_4();
            field_362.method_61();
      }
   }

   // $VF: renamed from: v () void
   private void method_90() {
      byte var1;
      label12: {
         var1 = 0;
         byte var10000;
         switch (this.method_83()) {
            case 0:
               class_1.field_12 = true;
               var10000 = 32;
               break;
            case 1:
               class_1.field_12 = false;
               var10000 = 33;
               break;
            default:
               break label12;
         }

         var1 = var10000;
      }

      this.field_226 = 0;
      method_435(5, 0, var1);
   }

   // $VF: renamed from: w () void
   private void method_91() {
      switch (this.method_83()) {
         case 1:
            this.field_357.method_8();
            this.method_111();
            if (field_334 != null && method_107()) {
               this.field_170 = 0;
               this.field_382 = true;
               this.field_182 = true;
               this.field_270 = 0;
               field_225 = 28;
               return;
            }
         case 0:
            this.field_357.method_8();
            if (!method_107()) {
               this.method_221();
               return;
            }

            this.field_391 = true;
            this.field_333 = false;
            field_225 = 31;
            return;
         case 2:
            this.method_65(5);
            this.field_357.method_8();
            return;
         case 3:
            field_225 = 33;
            this.field_357.method_8();
            this.field_562 = true;
            return;
         case 4:
            field_225 = 22;
            this.field_226 = 0;
            this.field_357.method_8();
            return;
         case 5:
            this.method_65(7);
            this.field_226 = 5;
            return;
         case 6:
            field_225 = 10;
            return;
         default:
            this.field_265 = false;
      }
   }

   // $VF: renamed from: x () void
   private void method_92() {
      this.field_268--;
      if (this.field_268 < 0) {
         this.field_268 = (field_566[this.field_266].length >> 1) - 1;
      }
   }

   // $VF: renamed from: y () void
   private void method_93() {
      this.field_268 = (this.field_268 + 1) % (field_566[this.field_266].length >> 1);
   }

   // $VF: renamed from: z () void
   private void method_94() {
      this.field_380 = false;
      if (field_359 != null) {
         int var1 = field_359.length;

         for (int var2 = 0; var2 < var1; var2++) {
            method_95(field_359[var2]);
            field_359[var2] = null;
         }
      }

      field_359 = null;
      method_96(field_324[42], true);
      method_96(field_324[43], true);
      System.gc();
   }

   // $VF: renamed from: a (c) void
   private static void method_95(class_5 var0) {
      if (var0 != null) {
         if (class_5.field_43 != null) {
            for (int var1 = 0; var1 < class_5.field_43.length; var1++) {
               method_96(class_5.field_43[var1], true);
               class_5.field_43[var1] = null;
            }
         }

         if (var0.field_44 != null) {
            for (int var2 = 0; var2 < var0.field_44.length; var2++) {
               var0.field_44[var2] = null;
            }

            var0.field_44 = (byte[][])null;
         }

         var0.field_47 = null;
      }
   }

   // $VF: renamed from: a (a, boolean) void
   private static void method_96(class_7 var0, boolean var1) {
      if (var0 != null) {
         var0.method_60(var1);
      }
   }

   // $VF: renamed from: A () void
   private void method_97() {
      this.field_379 = false;
      this.field_173 = true;
      this.field_342 = false;
      this.field_468 = 0;
      this.field_467 = null;
      field_348 = null;
      field_347 = null;
      this.field_174 = 0;
      this.field_175 = 0;
      field_176 = null;
      field_195 = null;
      this.field_310 = null;
      field_351 = null;
      field_518 = null;
      field_519 = null;
      field_399 = null;
      field_398 = null;
      field_360 = null;
      field_341 = null;
      if (field_359 != null) {
         int var1 = field_359.length;

         for (int var2 = 0; var2 < var1; var2++) {
            method_95(field_359[var2]);
            field_359[var2] = null;
         }
      }

      field_359 = null;
      if (this.field_358 != null) {
         method_95(this.field_358);
         this.field_358 = null;
      }

      if (field_322 != null) {
         for (int var4 = 0; var4 < 33; var4++) {
            if (field_322[var4] != null) {
               int var7 = field_322[var4].length;

               for (int var3 = 0; var3 < var7; var3++) {
                  field_322[var4][var3] = null;
               }

               field_322[var4] = null;
            }
         }
      }

      method_96(field_504, true);
      System.gc();
      if (field_324 != null) {
         for (int var5 = 0; var5 < 61; var5++) {
            if (var5 != 41 && var5 != 0 && var5 != 9 && var5 != 18) {
               method_96(field_324[var5], true);
               field_324[var5] = null;
            }
         }
      }

      if (field_327 != null) {
         for (int var6 = 0; var6 < 6; var6++) {
            if (field_327[var6] != null) {
               method_96(field_327[var6].field_24, true);
               field_327[var6].field_24 = null;
               field_327[var6] = null;
            }
         }
      }

      field_337 = (int[][])null;
      field_336 = (int[][])null;
      field_339 = (byte[][])null;
      field_338 = (byte[][])null;
      field_340 = (byte[][])null;
      field_352 = (int[][])null;
      field_353 = (int[][])null;
      field_354 = (byte[][])null;
      field_355 = (byte[][])null;
      field_356 = null;
      this.field_331 = 0L;
      this.field_272 = 0;
      this.field_211 = -1;
      this.field_213 = -1;
      this.field_215 = -1;
      this.field_216 = -1;
      field_328 = null;
      this.field_289 = -1;
      this.field_264 = null;
      this.field_492 = 3;
      field_505 = (int[][])null;
      field_508 = (int[][])null;
      field_506 = null;
      field_509 = null;
      field_507 = null;
      field_510 = null;
      this.field_479 = false;
      this.field_480 = -1;
      this.field_481 = 0;
      this.field_482 = 0;
      this.field_483 = 0;
      this.field_486 = 0;
      this.field_487 = 0;
      this.field_488 = 0;
      this.field_489 = 0;
      this.field_490 = 0;
      this.field_491 = -1;
      this.field_158 = false;
      field_195 = null;
      method_173();
      System.gc();
   }

   // $VF: renamed from: B () void
   private void method_98() {
      this.field_173 = true;
   }

   // $VF: renamed from: e (int) void
   private void method_99(int var1) throws Exception {
      class_7 var4;
      label20: {
         byte[] var3 = new byte[method_247(field_351, var1 * 8 + 4)];
         this.field_310.read(var3);
         (var4 = new class_7()).method_45(var3, 0);
         var4.method_46(0, 0, -1, -1);
         Object var10000;
         byte var10001;
         Object var10002;
         switch (var1) {
            case 0:
               if ((this.field_332 & 1L) == 0L) {
                  break label20;
               }

               var10000 = field_324;
               var10001 = 60;
               var10002 = var4;
               break;
            case 1:
               if ((this.field_332 & 2L) == 0L) {
                  break label20;
               }

               var10000 = field_324;
               var10001 = 16;
               var10002 = var4;
               break;
            case 2:
               field_322[0] = null;
               var10000 = field_324;
               var10001 = 42;
               var10002 = var4;
               break;
            case 3:
               var10000 = field_322;
               var10001 = 8;
               var10002 = var4.field_85[0];
               break;
            default:
               break label20;
         }

         ((Object[])var10000)[var10001] = var10002;
      }

      var4.field_83 = null;
   }

   // $VF: renamed from: f (int) void
   private void method_100(int var1) {
      try {
         if (var1 == 0) {
            this.field_310.close();
            this.field_310 = null;
            System.gc();
            this.field_310 = javax.microedition.lcdui.ResourceLoader.open("/cm.f");
            this.field_308 = this.field_310.read();
            field_351 = new byte[this.field_308 << 3];
            this.field_310.read(field_351);
         }

         class_7 var4;
         label34: {
            Object var10000;
            byte var10001;
            Object var10002;
            label33: {
               byte[] var3 = new byte[method_247(field_351, var1 * 8 + 4)];
               this.field_310.read(var3);
               (var4 = new class_7()).method_45(var3, 0);
               var4.method_46(0, 0, -1, -1);
               switch (var1) {
                  case 0:
                     var10000 = field_322;
                     var10001 = 11;
                     break;
                  case 1:
                     switch (this.field_202) {
                        case 1:
                        case 2:
                           if (this.field_202 != 0) {
                              var4.method_46(this.field_202, 0, -1, -1);
                              var4.method_47(0);
                              var4.field_80 = this.field_202;
                           }
                        default:
                           var10000 = field_324;
                           var10001 = 56;
                           var10002 = var4;
                           break label33;
                     }
                  case 2:
                     var4.method_46(1, 0, 0, -1);
                     var10000 = field_324;
                     var10001 = 59;
                     var10002 = var4;
                     break label33;
                  case 3:
                     field_324[13] = var4;
                     this.method_101();
                     break label34;
                  case 4:
                     var10000 = field_322;
                     var10001 = 5;
                     break;
                  case 5:
                     var10000 = field_322;
                     var10001 = 18;
                     break;
                  case 6:
                     field_324[43] = var4;
                     var10000 = field_322;
                     var10001 = 20;
                     var10002 = null;
                     break label33;
                  default:
                     break label34;
               }

               var10002 = var4.field_85[0];
            }

            ((Object[])var10000)[var10001] = var10002;
         }

         var4.field_83 = null;
      } catch (Exception var5) {
      }
   }

   // $VF: renamed from: C () void
   private void method_101() {
      if ((this.field_332 & 1L) == 0L) {
         for (int var1 = 0; var1 < 5; var1++) {
            field_324[13].field_85[0][var1] = null;
         }
      }
   }

   // $VF: renamed from: g (int) void
   private void method_102(int var1) {
      try {
         if (var1 % 10 == 0) {
            this.field_310.close();
            this.field_310 = null;
            StringBuffer var2 = new StringBuffer("/gen").append(this.field_271).append(".f");
            this.field_310 = javax.microedition.lcdui.ResourceLoader.open(var2.toString());
            this.field_308 = this.field_310.read();
            field_351 = new byte[this.field_308 << 3];
            this.field_310.read(field_351);
            this.field_309 = 0;
            this.field_271++;
         }

         int var9 = var1 - (this.field_271 - 1) * 10;
         int var3 = method_247(field_351, var9 * 8 + 4);
         if ((this.field_331 & 1L << var1) == 0L) {
            this.field_309 += var3;
            return;
         }

         if (this.field_309 != 0) {
            this.field_310.skip(this.field_309);
            this.field_309 = 0;
         }

         byte[] var4 = new byte[var3];
         this.field_310.read(var4);
         class_7 var5;
         (var5 = new class_7()).method_45(var4, 0);
         if ((var1 != 28 || this.field_463) && (var1 != 24 || this.field_465)) {
            var5.method_46(0, 0, -1, -1);
         }

         byte var6;
         byte var7;
         label103: {
            var6 = -1;
            var7 = -1;
            byte var10000;
            switch (var1) {
               case 0:
                  var6 = 33;
                  break label103;
               case 1:
                  var6 = 34;
                  break label103;
               case 2:
                  if (this.field_463) {
                     field_322[24] = var5.field_85[0];
                  }

                  if (this.field_464) {
                     var5.method_46(1, 0, -1, -1);
                     field_322[25] = var5.field_85[1];
                  }
                  break label103;
               case 3:
                  var6 = 7;
                  break label103;
               case 4:
               case 21:
                  if (this.field_202 != 2) {
                     var6 = 3;
                  }
                  break label103;
               case 5:
                  var6 = 58;
                  break label103;
               case 6:
                  var10000 = 21;
                  break;
               case 7:
                  if (this.field_202 == 2) {
                     var5.field_85 = (Image[][])null;
                     var5.method_46(1, 0, -1, -1);
                     var5.field_80 = 1;
                  }

                  var6 = 20;
                  break label103;
               case 8:
                  var6 = 5;
                  break label103;
               case 9:
                  var6 = 12;
                  break label103;
               case 10:
                  field_327[4] = new class_2(var5, 0, 0, null);
                  field_327[4].method_10(0);
                  break label103;
               case 11:
                  var6 = 11;
                  break label103;
               case 12:
                  var10000 = 10;
                  break;
               case 13:
                  var6 = 1;
                  break label103;
               case 14:
                  var10000 = 6;
                  break;
               case 15:
               case 17:
                  if ((this.field_272 & 2) != 0) {
                     if (this.field_202 == 2) {
                        var5.field_85 = (Image[][])null;
                        var5.method_46(2, 0, -1, -1);
                        var5.field_80 = 2;
                     }

                     var6 = 4;
                  }

                  if ((this.field_272 & 1) != 0) {
                     field_324[21] = new class_7();
                     field_324[21].method_45(var4, 0);
                     field_324[21].method_46(1, 0, -1, -1);
                     field_324[21].field_80 = 1;
                     field_324[21].field_83 = null;
                  }
                  break label103;
               case 16:
               case 18:
                  var6 = 37;
                  break label103;
               case 19:
                  var10000 = 7;
                  break;
               case 20:
                  var10000 = 13;
                  break;
               case 22:
                  var6 = 8;
                  break label103;
               case 23:
                  var6 = 30;
                  break label103;
               case 24:
                  field_322[15] = null;
                  var5.method_46(1, 0, -1, -1);
                  var6 = 57;
                  field_322[14] = null;
                  break label103;
               case 25:
                  var10000 = 17;
                  break;
               case 26:
                  field_504 = var5;
                  break label103;
               case 27:
                  var10000 = 19;
                  break;
               case 28:
                  if (this.field_464) {
                     var5.method_46(1, 0, -1, -1);
                  }

                  var6 = 45;
                  break label103;
               case 29:
                  var10000 = 26;
                  break;
               case 30:
                  var6 = 15;
                  break label103;
               case 31:
                  var10000 = 29;
                  break;
               case 32:
                  var6 = 32;
                  break label103;
               case 33:
                  var6 = 22;
                  break label103;
               case 34:
                  var6 = 27;
                  break label103;
               case 35:
                  var6 = 28;
                  break label103;
               case 36:
                  var6 = 35;
                  break label103;
               case 37:
                  var6 = 29;
                  break label103;
               case 38:
                  var6 = 36;
                  break label103;
               case 39:
                  var6 = 6;
                  break label103;
               case 40:
                  var6 = 2;
                  break label103;
               case 41:
                  var6 = 38;
                  break label103;
               case 42:
                  var6 = 39;
               default:
                  break label103;
            }

            var7 = var10000;
         }

         if (var6 != -1) {
            field_324[var6] = var5;
         }

         if (var7 != -1) {
            field_322[var7] = var5.field_85[0];
         }

         var5.field_83 = null;
      } catch (IOException var8) {
      }
   }

   // $VF: renamed from: h (int) void
   private void method_103(int var1) {
      try {
         if (var1 == 0) {
            this.field_310 = javax.microedition.lcdui.ResourceLoader.open("/b0.f");
            this.field_308 = this.field_310.read();
            field_351 = new byte[this.field_308 * 8];
            this.field_310.read(field_351);
         }

         byte[] var3 = new byte[method_247(field_351, var1 * 8 + 4)];
         this.field_310.read(var3);
         class_7 var4;
         (var4 = new class_7()).method_45(var3, 0);
         var4.method_46(0, 0, -1, -1);
         var4.field_83 = null;
         switch (var1) {
            case 0:
               field_327[5] = new class_2(var4, 0, 0, null);
               break;
            case 1:
               field_324[40] = var4;
            default:
               return;
         }
      } catch (Exception var5) {
      }
   }

   // $VF: renamed from: i (int) void
   private void method_104(int var1) {
      try {
         if (var1 == 0) {
            this.field_310 = javax.microedition.lcdui.ResourceLoader.open("/mm0.f");
            this.field_308 = this.field_310.read();
            field_351 = new byte[this.field_308 * 8];
            this.field_310.read(field_351);
         }

         byte[] var3 = new byte[method_247(field_351, var1 * 8 + 4)];
         this.field_310.read(var3);
         class_7 var4;
         (var4 = new class_7()).method_45(var3, 0);
         var4.method_46(0, 0, -1, -1);
         var4.field_83 = null;
         switch (var1) {
            case 0:
               field_327[1] = new class_2(var4, 0, 0, null);
               field_327[1].method_10(2);
            default:
               return;
            case 1:
               field_327[2] = new class_2(var4, 0, 0, null);
               field_327[2].method_10(0);
               break;
            case 2:
               field_322[27] = var4.field_85[0];
         }
      } catch (Exception var5) {
      }
   }

   // $VF: renamed from: c () int
   private static int method_105() {
      byte var0;
      return var0 = field_334[12];
   }

   // $VF: renamed from: j (int) void
   private static void method_106(int var0) {
      field_334[12] = (byte)var0;
   }

   // $VF: renamed from: a () boolean
   private static boolean method_107() {
      return field_334 == null ? false : field_334[13] != 0;
   }

   // $VF: renamed from: b (boolean) void
   private void method_108(boolean var1) {
      field_334[13] = (byte)(var1 ? 1 : 0);
      this.method_112();
   }

   // $VF: renamed from: D () void
   private void method_109() {
      this.field_248 = this.method_128(this.field_202, this.field_203);
   }

   // $VF: renamed from: E () void
   private void method_110() {
      this.field_378 = false;
      this.method_116();
      this.method_120(this.field_202, field_537);
      this.method_127(this.field_202, this.field_203, this.field_249 + this.method_126(this.field_202, this.field_203));
      this.method_112();
   }

   // $VF: renamed from: F () void
   private void method_111() {
      try {
         RecordStore var1;
         field_334 = (var1 = RecordStore.openRecordStore("DiamondRush", true)).getRecord(1);
         this.field_386 = field_334.length;
         var1.closeRecordStore();
      } catch (Exception var2) {
      }
   }

   // $VF: renamed from: G () void
   private void method_112() {
      this.field_383 = false;

      try {
         RecordStore var1;
         if ((var1 = RecordStore.openRecordStore("DiamondRush", true)).getNumRecords() == 0) {
            var1.addRecord(field_334, 0, this.field_386);
         } else {
            var1.setRecord(1, field_334, 0, this.field_386);
         }

         var1.closeRecordStore();
      } catch (Exception var2) {
      }
   }

   // $VF: renamed from: H () void
   private void method_113() {
      RecordStore var1 = null;

      try {
         var1 = RecordStore.openRecordStore("Preferences", false);
      } catch (Exception var5) {
      }

      field_335 = new byte[1];
      if (var1 == null) {
         try {
            var1 = RecordStore.openRecordStore("Preferences", true);
            field_335[0] = 0;
            this.field_385 = field_335.length;
            var1.closeRecordStore();
            this.method_114();
         } catch (Exception var3) {
         }
      } else {
         try {
            field_335 = var1.getRecord(1);
            this.field_385 = field_335.length;
            var1.closeRecordStore();
         } catch (Exception var4) {
         }
      }
   }

   // $VF: renamed from: I () void
   private void method_114() {
      try {
         RecordStore var1;
         if ((var1 = RecordStore.openRecordStore("Preferences", true)).getNumRecords() == 0) {
            var1.addRecord(field_335, 0, this.field_385);
         } else {
            var1.setRecord(1, field_335, 0, this.field_385);
         }

         var1.closeRecordStore();
      } catch (Exception var2) {
      }
   }

   // $VF: renamed from: k (int) void
   private void method_115(int var1) {
      try {
         String var2 = null;
         switch (var1) {
            case 0:
            case 1:
               RecordStore var3 = null;

               try {
                  var3 = RecordStore.openRecordStore("DiamondRush", false);
               } catch (Exception var17) {
               }

               if (var3 == null) {
                  this.field_387 = true;
               } else {
                  this.field_387 = false;
                  var3.closeRecordStore();
               }

               if (var1 != 0) {
                  field_334 = new byte[1000];
                  field_334[3] = 5;
                  field_334[8] = 4;
                  field_334[9] = 0;
                  field_334[10] = 0;
                  this.field_386 = 14;
                  this.field_386 += 6;
               }

               return;
            case 2:
               var2 = "/map_angkor.out";
            case 3:
               if (var2 == null) {
                  var2 = "/map_scotland.out";
               }
            case 4:
               if (var2 == null) {
                  var2 = "/map_tibet.out";
               }

               this.field_310 = javax.microedition.lcdui.ResourceLoader.open(field_571[var1 - 2]);
               this.field_310.read();
               int var4 = var1 - 2;
               int var5 = this.field_386;
               field_334[14 + var4 * 2] = (byte)(this.field_386 & 0xFF);
               field_334[14 + var4 * 2 + 1] = (byte)(this.field_386 >> 8);
               int var6 = this.field_310.read();
               field_334[this.field_386++] = (byte)var6;
               field_334[this.field_386++] = 0;
               this.method_412();
               this.method_429(var2);
               field_334[this.field_386++] = (byte)this.field_520;
               this.method_410();
               this.field_386 += var6 << 1;

               label90:
               for (int var7 = 0; var7 < var6; var7++) {
                  int var8 = this.field_386;
                  field_334[var5 + 3 + var7 * 2] = (byte)(var8 & 0xFF);
                  field_334[var5 + 3 + var7 * 2 + 1] = (byte)(var8 >> 8);
                  byte var9 = 0;
                  byte var10 = 0;
                  int var11 = method_369(this.field_310);
                  int var12 = method_369(this.field_310);
                  byte[] var13 = new byte[var11 * var12];
                  this.field_310.read(var13);
                  int var14 = 0;

                  while (var14 < var12) {
                     for (int var20 = 0; var20 < var11; var20++) {
                        if (var13[var20 + var14 * var11] == 2) {
                           var10++;
                        }
                     }
                     var14++;
                  }

                  field_334[0] = (byte)(field_334[0] + var10);
                     field_334[this.field_386++] = 0;
                     field_334[this.field_386++] = var10;
                     field_334[this.field_386++] = 0;
                     this.field_310.skip(var11 * var12);
                     var14 = this.field_386;
                     this.field_386 += 2;
                     this.field_310.read(var13);

                     for (int var15 = 0; var15 < var12; var15++) {
                        for (int var16 = 0; var16 < var11; var16++) {
                           if (var13[var16 + var15 * var11] == 14 || var13[var16 + var15 * var11] == 33) {
                              field_334[this.field_386++] = (byte)var16;
                              field_334[this.field_386++] = (byte)var15;
                              var9++;
                           }
                        }
                     }

                     field_334[var14] = 0;
                     field_334[var14 + 1] = var9;
                  }

                  this.field_310.close();
                  this.field_310 = null;
                  System.gc();
                  break;
            case 5:
         }
      } catch (Exception var18) {
      }
   }

   // $VF: renamed from: J () void
   private void method_116() {
      field_334[3] = (byte)this.field_201;
      field_334[11] = this.field_370;
   }

   // $VF: renamed from: K () void
   private void method_117() {
      this.field_382 = false;
      this.field_201 = field_334[3];
      this.field_370 = field_334[11];
      this.field_247 = method_246(field_334, 4);
   }

   // $VF: renamed from: a (int, int) byte
   private byte method_118(int var1, int var2) {
      int var3 = this.method_125(var1, var2);
      return field_334[var3 + 2];
   }

   // $VF: renamed from: a (int, int, byte) void
   private void method_119(int var1, int var2, byte var3) {
      int var4 = this.method_125(var1, var2);
      field_334[var4 + 2] = (byte)(field_334[var4 + 2] | var3);
   }

   // $VF: renamed from: a (int, int) void
   private void method_120(int var1, int var2) {
      int var3 = method_122(var1) + 1;
      if (field_334[var3] < var2) {
         field_334[var3] = (byte)var2;
      }
   }

   // $VF: renamed from: b (int) int
   private int method_121(int var1) {
      int var2;
      return (var2 = method_122(var1) + 1) >= 0 && var2 <= field_334.length ? field_334[method_122(var1) + 1] : 0;
   }

   // $VF: renamed from: c (int) int
   private static int method_122(int var0) {
      byte var10000;
      if (var0 < 0) {
         var10000 = 0;
      } else {
         if (var0 < 3) {
            return method_246(field_334, 14 + var0 * 2);
         }

         var10000 = 2;
      }

      byte var1 = var10000;
      return method_246(field_334, 14 + var1 * 2);
   }

   // $VF: renamed from: d (int) int
   private int method_123(int var1) {
      try {
         return field_334[method_122(var1) + 0];
      } catch (Exception var3) {
         return 0;
      }
   }

   // $VF: renamed from: e (int) int
   private int method_124(int var1) {
      return field_334[method_122(var1) + 2];
   }

   // $VF: renamed from: a (int, int) int
   private int method_125(int var1, int var2) {
      return method_246(field_334, method_122(var1) + 3 + var2 * 2);
   }

   // $VF: renamed from: b (int, int) int
   private int method_126(int var1, int var2) {
      return field_334[this.method_125(var1, var2) + 0];
   }

   // $VF: renamed from: b (int, int, int) void
   private void method_127(int var1, int var2, int var3) {
      field_334[this.method_125(var1, var2) + 0] = (byte)var3;
   }

   // $VF: renamed from: c (int, int) int
   private int method_128(int var1, int var2) {
      return field_334[this.method_125(var1, var2) + 1];
   }

   // $VF: renamed from: a (int, int, int, int) void
   private void method_129(int var1, int var2, int var3, int var4) {
      int var5 = this.method_125(var1, var2);
      byte var6 = field_334[var5 + 4];

      for (int var7 = 0; var7 < var6; var7++) {
         if (field_334[var5 + 5 + 2 * var7 + 0] == var3 && field_334[var5 + 5 + 2 * var7 + 1] == var4) {
            field_334[var5 + 5 + 2 * var7 + 0] = 0;
            field_334[var5 + 5 + 2 * var7 + 1] = 0;
            field_334[var5 + 3]++;
            return;
         }
      }
   }

   // $VF: renamed from: a (int, int, int, int) boolean
   private boolean method_130(int var1, int var2, int var3, int var4) {
      int var5 = this.method_125(var1, var2);
      byte var6 = field_334[var5 + 4];

      for (int var7 = 0; var7 < var6; var7++) {
         if (field_334[var5 + 5 + 2 * var7 + 0] == var3 && field_334[var5 + 5 + 2 * var7 + 1] == var4) {
            return false;
         }
      }

      return true;
   }

   // $VF: renamed from: L () void
   private void method_131() {
      this.field_183 = 13;
      this.field_185 = 4;
      this.field_188 = 408;
      this.field_177 = 5;
      this.field_331 |= 128L;
      this.field_331 |= 8L;
      this.field_457 = false;
      this.field_138 = 16;
      this.field_139 = 16;
      this.field_140 = 19;
      this.field_141 = 18;
   }

   // $VF: renamed from: M () void
   private void method_132() throws Exception {
      field_402 = -1;
      field_371 = false;
      this.field_103 = true;
      this.field_210 = 0;
      this.field_258 = 0;
      this.field_331 = 0L;
      this.field_332 = 0L;
      this.field_160 = 0;
      this.field_161 = 0;
      this.field_177 = 0;
      this.field_388 = (this.method_118(this.field_202, this.field_203) & 2) != 0;
      this.field_346 = 0;
      switch (this.field_202) {
         case 0:
            if (this.field_203 == 5) {
               this.field_177 = 1;
               this.field_179 = 816;
               this.field_180 = 0;
            } else if (this.field_203 == 13) {
               this.field_177 = 2;
               this.field_192 = false;
            } else if (this.field_203 == 8) {
               this.field_177 = 4;
               this.field_183 = 0;
               this.field_185 = 3;
               this.field_186 = 0;
               this.field_184 = 0;
               this.field_144 = false;
               this.field_331 |= 8L;
               this.field_331 |= 1024L;
               this.field_138 = 2;
               this.field_139 = 12;
               this.field_140 = 15;
               this.field_141 = 5;
            }
            break;
         case 1:
            if (this.field_203 == 9) {
               this.method_131();
            }
            break;
         case 2:
            if (this.field_203 == 10) {
               this.method_284();
               this.field_187 = 360;
               this.field_177 = 3;
               this.field_331 |= 128L;
               this.field_331 |= 8L;
            }
      }

      this.field_189 = false;
      this.field_190 = false;
      this.field_191 = false;
      this.field_159 = 0;
      this.field_252 = -1;
      this.field_253 = -1;
      this.field_254 = 0;
      this.field_255 = 0;
      this.field_256 = 0;
      this.field_257 = 0;
      this.field_197 = 70;
      this.field_242 = field_334[8];
      this.field_200 = 0;
      this.field_247 = 0;
      this.field_250 = 0;
      this.field_251 = 0;
      this.field_249 = 0;
      this.field_243 = 0;
      this.field_236 = 0;
      this.field_237 = 0;
      this.field_239 = 0;
      this.field_240 = 0;
      field_349 = -1;
      field_348 = null;
      field_347 = null;
      this.field_310 = javax.microedition.lcdui.ResourceLoader.open(field_571[this.field_202]);
      this.field_310.read();
      boolean var2 = false;

      while (!var2) {
         int var3 = this.field_310.read();
         int var4 = 0;
         byte[] var1 = new byte[4];

         while (var4 < var3 && !var2) {
            this.field_310.read(var1);
            int var5 = method_246(var1, 0);
            int var6 = method_246(var1, 2);
            if (var4 != this.field_203) {
               this.field_310.skip(var5 * var6 * 3);
            } else {
               this.field_208 = var5;
               this.field_209 = var6;
               field_338 = (byte[][])null;
               field_340 = (byte[][])null;
               field_336 = (int[][])null;
               System.gc();
               field_338 = new byte[this.field_208][this.field_209];
               field_340 = new byte[this.field_208][this.field_209];
               field_336 = new int[this.field_208][this.field_209];
               var1 = new byte[this.field_208 * this.field_209];
               this.field_310.read(var1);

               for (int var7 = 0; var7 < this.field_208; var7++) {
                  for (int var8 = 0; var8 < this.field_209; var8++) {
                     field_338[var7][var8] = var1[var7 + var8 * this.field_208];
                  }
               }

               field_339 = new byte[this.field_208][this.field_209];
               field_337 = new int[this.field_208][this.field_209];
               this.field_310.read(var1);

               for (int var10 = 0; var10 < this.field_208; var10++) {
                  for (int var12 = 0; var12 < this.field_209; var12++) {
                     field_337[var10][var12] = var1[var10 + var12 * this.field_208];
                  }
               }

               this.field_310.read(var1);

               for (int var11 = 0; var11 < this.field_208; var11++) {
                  for (int var13 = 0; var13 < this.field_209; var13++) {
                     field_336[var11][var13] = var1[var11 + var13 * this.field_208];
                  }
               }

               var1 = null;
               var2 = true;
            }

            var4++;
         }
      }

      this.field_310.close();
      this.field_310 = null;
      this.field_204 = this.field_206 = 0;
      this.field_205 = this.field_207 = 0;
      this.method_288();
      System.gc();
   }

   // $VF: renamed from: N () void
   private void method_133() {
      int var1 = this.field_533;
      int var2 = this.field_534;
      long var3;
      int var5 = method_413(var3 = field_514[var1][var2], (byte)6, (byte)5);
      int var6 = method_413(var3, (byte)11, (byte)3);
      int var7 = 14;
      if (this.field_203 >= this.field_520) {
         this.method_119(this.field_202, this.field_203, (byte)2);
      }

      if (var6 > 1) {
         int var8 = 0;

         while (var8 < var6) {
            int var9 = method_413(var3, (byte)var7, (byte)4);
            var7 += 4;
            int var10 = method_413(var3, (byte)var7, (byte)4);
            long var11;
            int var14;
            if (method_413(var11 = field_514[var9][var10], (byte)3, (byte)3) == 1 && (var14 = method_413(var11, (byte)6, (byte)5)) > var5) {
               field_537 = var14;
               this.field_389 = var1;
               this.field_390 = var2;
               this.method_119(this.field_202, field_537, (byte)64);
               this.field_451 = true;
            }

            var8++;
            var7 += 4;
         }
      } else {
         field_537 = this.field_203;
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   private void method_134(Graphics var1) {
      try {
         this.field_318 = var1;
         this.field_318.setClip(0, 0, 240, 320);
         switch (field_225) {
            case 0:
            case 3:
            case 11:
            case 13:
            case 14:
            case 19:
            case 23:
            case 26:
            case 32:
            default:
               break;
            case 1:
               this.method_155();
               break;
            case 2:
               this.method_177();
               break;
            case 4:
               this.method_143();
               break;
            case 5:
               if (!this.field_392) {
                  this.field_318.setClip(0, 293, 240, 27);
                  this.method_180();
                  this.field_318.setClip(0, 0, 240, 320);
               } else {
                  this.method_180();
               }

               if (field_326 != null && this.field_392) {
                  this.method_407();
               }
               break;
            case 6:
               this.method_210();
               break;
            case 7:
               this.method_177();
               break;
            case 8:
            case 9:
            case 21:
            case 35:
               this.method_180();
               break;
            case 10:
               this.method_367(this.field_318);
               break;
            case 12:
               this.method_145();
               break;
            case 15:
               this.method_415();
               break;
            case 16:
               this.method_180();
               break;
            case 17:
               this.method_245();
               break;
            case 18:
               this.method_431();
               this.field_562 = true;
               field_225 = 25;
               this.field_559 = this.field_100;
               this.field_560 = field_569[110] + " " + method_246(field_334, 4) + " " + field_569[109];
            case 25:
               this.method_434();
               break;
            case 20:
               method_408(this.field_318, field_324[41], field_569[48], 120, 180, 3, 20, true);
               break;
            case 22:
               this.method_438();
               break;
            case 24:
               this.method_141();
               break;
            case 27:
               this.method_139();
               break;
            case 28:
               this.field_269 = 11;
               this.method_180();
               break;
            case 29:
               this.method_138();
               break;
            case 30:
               this.method_144(this.field_318, true);
               if (field_229 % 20 >= 10) {
                  field_324[41].method_58(this.field_318, field_569[82], 120, 250, 17);
               }
               break;
            case 31:
               if (this.field_391) {
                  this.field_391 = false;
                  this.field_318.setColor(0);
                  this.field_318.fillRect(0, 0, 240, 320);
                  field_324[41].field_89 = 5;
                  field_324[41].method_59(this.field_318, method_444(field_569[this.field_387 ? 69 : 68], 220), 120, 160, 3);
                  this.method_179();
                  this.method_178();
               }
               break;
            case 33:
               this.method_135();
               break;
            case 34:
               this.method_142();
         }

         this.method_443();
      } catch (Throwable var3) {
      }
   }

   // $VF: renamed from: O () void
   private void method_135() {
      if (this.field_562) {
         this.field_318.setColor(0);
         this.field_318.setClip(0, 0, 240, 320);
         this.field_318.fillRect(0, 0, 240, 320);
         field_324[41].field_89 = 3;
         String var1 = method_444(
            field_569[4]
               + "\n\n"
               + field_569[103]
               + "\n"
               + field_569[104]
               + "\n"
               + field_569[105]
               + "\n\n"
               + field_569[106]
               + "\n\n"
               + field_569[107]
               + "\n\n"
               + field_569[108],
            235
         );
         field_324[41].method_59(this.field_318, var1, 120, 10, 17);
         this.method_178();
         this.field_562 = false;
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, boolean, int, int) void
   private void method_136(Graphics var1, boolean var2, int var3, int var4) {
      var1.setClip(0, 0, 240, 320);
      byte var5 = 0;
      byte var6 = 0;
      if (var3 != 0 || var4 != 0) {
         var5 -= 24;
         var6 -= 24;
      }

      byte var9 = var6;
      boolean var10 = false;

      while (var9 < 320) {
         for (byte var11 = var5; var11 < 240; var11 += 24) {
            var1.drawImage(field_322[8][0], var11 + var3, var9 + var4, 0);
         }

         var9 += 24;
      }

      field_324[10].method_53(var1, 0, this.field_119 + var3, this.field_120 + var4, 0, 0, 0);
      if (var2) {
         for (byte var13 = 0; var13 < 320; var13 += 24) {
            for (byte var14 = 0; var14 < 240; var14 += 24) {
               field_324[17].method_53(var1, 16, var14, var13, 0, 0, 0);
            }
         }
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, boolean) void
   private void method_137(Graphics var1, boolean var2) {
      this.method_136(var1, var2, 0, 0);
   }

   // $VF: renamed from: P () void
   private void method_138() {
      if (this.field_562) {
         this.method_136(this.field_318, false, this.field_150, this.field_151);
         field_324[17].method_53(this.field_318, 11, 120 + class_0.field_2[6] + this.field_150, 136 + class_0.field_2[7] + this.field_151, 0, 0, 0);
         int var1 = 0;

         for (int var2 = 0; var2 < 3; var2++) {
            var1 = 52 + var2;
            field_324[var1]
               .method_53(
                  this.field_318,
                  0,
                  class_0.field_2[var2 << 1] + 120 - this.field_129 + this.field_150,
                  class_0.field_2[(var2 << 1) + 1] + 136 - this.field_130 + this.field_151,
                  0,
                  0,
                  0
               );
         }
      }

      switch (this.field_148) {
         case 1:
            if (!this.field_562) {
               this.field_318.setColor(this.field_149);
               this.field_318.fillRect(0, 0, 240, 320);

               for (int var7 = 0; var7 < 3; var7++) {
                  int var5 = 52 + var7;
                  field_324[var5]
                     .method_53(
                        this.field_318, 0, class_0.field_2[var7 << 1] + 120 - this.field_129, class_0.field_2[(var7 << 1) + 1] + 136 - this.field_130, 0, 0, 0
                     );
               }
            }
            break;
         case 2:
            return;
         case 3:
            return;
         case 4:
            return;
         case 5:
            return;
         case 6:
            return;
         case 7:
            return;
         case 8:
            class_6.method_44(this.field_318);
            return;
         case 9:
         case 10:
            class_6.method_44(this.field_318);
            int var4 = field_324[41].field_89;
            field_324[41].field_89 = 3;
            String var6 = method_444(field_569[40] + "\n" + field_569[97], 220);
            field_324[41].method_57(var6);
            method_432(
               this.field_318, (240 - class_7.field_86 >> 1) - 3, (320 - class_7.field_87 >> 1) - 3, class_7.field_86 + 6, class_7.field_87 + 6, 7096587, 0
            );
            field_324[41].method_59(this.field_318, var6, 120, 160, 3);
            field_324[41].field_89 = var4;
      }
   }

   // $VF: renamed from: Q () void
   private void method_139() {
      if (!this.field_562 && !this.field_113) {
         this.field_318.setClip(this.field_107 + 120, this.field_108 + 136, 14, 22);
         field_324[10].method_53(this.field_318, 0, this.field_119, this.field_120, 0, 0, 0);
      } else {
         this.field_318.setClip(0, 0, 240, 320);
         this.method_137(this.field_318, false);
         field_324[17].method_53(this.field_318, 11, 120 + class_0.field_2[6], 136 + class_0.field_2[7], 0, 0, 0);
         this.method_178();
         this.method_179();
         field_324[41].method_58(this.field_318, field_569[27].toLowerCase(), 222, 311, 10);
         this.field_562 = false;
      }

      if (this.field_121 != 0) {
         this.field_113 = false;
         this.field_562 = true;

         for (int var1 = 0; var1 < this.field_121; var1++) {
            if (method_75(var1)) {
               field_324[10].method_53(this.field_318, var1 + 1, this.field_119, this.field_120, 0, 0, 0);
            }
         }

         this.field_318.setClip(0, 0, 240, 320);
         if (this.field_133 < this.field_132) {
            field_324[9]
               .method_52(
                  this.field_318, 5, this.field_133, class_0.field_2[this.field_121 << 1] + 120 - 12, class_0.field_2[(this.field_121 << 1) + 1] + 124, 0, 0, 0
               );
            this.field_133++;
         } else {
            if (this.field_118 % this.field_117 >= this.field_117 >> 1) {
               field_324[10].method_53(this.field_318, this.field_121 + 1, this.field_119, this.field_120, 0, 0, 0);
               this.field_123++;
            }

            if (this.field_123 >= 15) {
               field_122[this.field_121] = true;
               this.field_123 = 0;
               this.field_121 = 0;
               this.field_133 = 0;
               this.method_74();
               this.field_113 = true;
               this.field_562 = false;
            }
         }
      } else {
         for (int var8 = 0; var8 < 3; var8++) {
            if (field_122[var8]) {
               field_324[10].method_53(this.field_318, var8 + 1, this.field_119, this.field_120, 0, 0, 0);
            }
         }
      }

      for (int var2 = 0; var2 < 3; var2++) {
         if (field_124[var2]) {
            int var9 = 52 + var2;
            if (this.field_126 != var2) {
               field_324[var9]
                  .method_53(
                     this.field_318, 0, class_0.field_2[var2 << 1] + 120 - this.field_129, class_0.field_2[(var2 << 1) + 1] + 136 - this.field_130, 0, 0, 0
                  );
            }
         }
      }

      if (this.field_126 != -1) {
         this.field_562 = true;
         if (this.method_140(this.field_126)) {
            this.field_126 = -1;
            if (field_124[0] && field_124[1] && field_124[2]) {
               this.method_67();
               this.field_562 = true;
               this.field_134 = true;
               field_225 = 29;
            }
         }
      } else {
         this.field_118 = this.field_118 % this.field_117;
         this.field_318.setClip(this.field_105 + 120, 136 + this.field_106, 14, 22);
         field_324[55].method_52(this.field_318, 0, this.field_118, 120 + this.field_105, 136 + this.field_106, 0, 0, 0);
         this.field_118++;
         if (this.field_113) {
            int var10 = field_324[41].field_89;
            field_324[41].field_89 = 1;
            String var3 = method_444(this.field_109 + "\n" + this.field_110, 220);
            field_324[41].method_57(var3);
            int var4 = (240 - class_7.field_86 >> 1) - 3;
            int var5 = 250 - (class_7.field_87 >> 1) - 3;
            int var6 = class_7.field_86 + 6;
            int var7 = class_7.field_87 + 6;
            this.field_318.setClip(var4, var5, var6, var7);
            method_432(this.field_318, var4, var5, var6, var7, 7096587, 0);
            field_324[41].method_59(this.field_318, var3, 120, 250, 3);
            field_324[41].field_89 = var10;
            this.field_113 = false;
         }
      }
   }

   // $VF: renamed from: c (int) boolean
   private boolean method_140(int var1) {
      int var2;
      int var3;
      int var4;
      int var6;
      label49: {
         var2 = 52 + var1;
         var3 = class_0.field_2[var1 << 1] + 120;
         int var5 = (var4 = class_0.field_2[(var1 << 1) + 1] + 136) - this.field_128;
         var6 = var3 - this.field_127;
         if (var5 < 0) {
            this.field_128 -= 2;
            if (this.field_128 > var4) {
               break label49;
            }
         } else {
            if (var5 <= 0) {
               break label49;
            }

            this.field_128 += 2;
            if (this.field_128 < var4) {
               break label49;
            }
         }

         this.field_128 = var4;
      }

      label41: {
         if (var6 < 0) {
            this.field_127 -= 3;
            if (this.field_127 > var3) {
               break label41;
            }
         } else {
            if (var6 <= 0) {
               break label41;
            }

            this.field_127 += 3;
            if (this.field_127 < var3) {
               break label41;
            }
         }

         this.field_127 = var3;
      }

      field_324[var2].method_53(this.field_318, 0, this.field_127 - this.field_129, this.field_128 - this.field_130, 0, 0, 0);
      if (this.field_127 == var3 && this.field_128 == var4) {
         this.field_127 = var3;
         this.field_128 = var4;
         if (this.field_131 < 20) {
            if (this.field_131 % 2 == 1) {
               int var7 = 838860;
               this.field_318.setColor(0 + var7 * this.field_131);
               this.field_318.fillRect(0, 0, 240, 320);
            }

            this.field_131++;
            return false;
         } else if (this.field_133 < this.field_132) {
            field_324[9].method_52(this.field_318, 5, this.field_133, class_0.field_2[var1 << 1] + 120 - 12, class_0.field_2[(var1 << 1) + 1] + 124, 0, 0, 0);
            this.field_133++;
            return false;
         } else {
            this.field_133 = 0;
            this.field_131 = 0;
            return true;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: R () void
   private void method_141() {
      String var1 = null;
      class_7 var2;
      (var2 = field_324[41]).field_89 = 15;
      this.field_318.setColor(0);
      this.field_318.fillRect(0, 0, 240, 320);

      for (int var3 = 0; var3 < 6; var3++) {
         byte var4;
         label45: {
            var4 = -1;
            String var10000;
            switch (var3) {
               case 0:
                  var4 = 60;
                  var10000 = " 6 - Add " + String.valueOf(this.field_247);
                  break;
               case 1:
                  var4 = 61;
                  var10000 = " 7 - Add " + String.valueOf(this.field_249);
                  break;
               case 2:
                  var4 = 62;
                  var10000 = " 8 - x " + String.valueOf(this.field_394) + (this.field_394 >= 4 ? " blue potion" : "");
                  break;
               case 3:
                  var4 = 63;
                  var10000 = " 9 - " + field_569[this.field_395 ? 66 : 67];
                  break;
               case 4:
                  var4 = 64;
                  var10000 = " 0 - " + field_569[this.field_396 ? 66 : 67];
                  break;
               case 5:
                  var4 = -1;
                  var10000 = "5 to activate lang cheat";
                  break;
               default:
                  break label45;
            }

            var1 = var10000;
         }

         int var5 = var3 * 35;
         if (var4 >= 0) {
            var2.method_58(this.field_318, field_569[var4], 110, var5, 17);
         }

         var5 += var2.field_89;
         var2.method_58(this.field_318, field_569[65], 110, var5, 24);
         var2.method_58(this.field_318, var1, 110, var5, 20);
      }

      var1 = "Pound - Pass levels ";
      StringBuffer var9;
      String var10001;
      if (this.field_441) {
         var9 = new StringBuffer().append(var1);
         var10001 = "on";
      } else {
         var9 = new StringBuffer().append(var1);
         var10001 = "off";
      }

      var1 = var9.append(var10001).toString();
      var2.method_58(this.field_318, var1, 110, 290, 17);
      this.method_178();
      this.method_179();
   }

   // $VF: renamed from: S () void
   private void method_142() {
      class_7 var2;
      (var2 = field_324[41]).field_89 = 2;
      this.field_318.setColor(0);
      this.field_318.fillRect(0, 0, 240, 320);
      String var1;
      switch (this.field_442) {
         case 0:
            var1 = "Mix";
            var2.method_59(this.field_318, field_569[this.field_443[0]], 10, 5, 20);
            break;
         case 1:
            var1 = "Tips";
            method_406(this.field_443[1]);
            this.method_407();
            break;
         default:
            var1 = "";
      }

      var2.field_89 = 2;
      var2.method_58(this.field_318, var1, 40, 308, 20);
      var2.method_58(this.field_318, "" + this.field_443[this.field_442], 120, 308, 20);
      var2.method_59(this.field_318, "Use up, down, left and right to navigate", 10, 280, 20);
      this.method_178();
      this.method_179();
   }

   // $VF: renamed from: T () void
   private void method_143() {
      this.method_177();
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics, boolean) void
   private void method_144(Graphics var1, boolean var2) {
      var1.drawImage(field_320, 0, 0, 20);
      var1.drawImage(field_319, 0, 0, 20);
      if (var2) {
         var1.drawImage(field_321, 120, 319, 33);
      }
   }

   // $VF: renamed from: U () void
   private void method_145() {
      this.field_318.setColor(0);
      this.field_318.fillRect(0, 0, 240, 320);
      class_7 var1;
      (var1 = field_324[41]).method_58(this.field_318, field_569[35], 120, 50, 17);
      class_7 var10000;
      Graphics var10001;
      String var10002;
      byte var10003;
      short var10004;
      byte var10005;
      if (this.field_177 == 2) {
         var10000 = var1;
         var10001 = this.field_318;
         var10002 = field_569[26];
         var10003 = 0;
         var10004 = 320;
         var10005 = 36;
      } else {
         var1.method_58(this.field_318, field_569[1], 0, 320, 36);
         String var2 = field_569[111] + " " + (method_246(field_334, 4) < 500 ? method_246(field_334, 4) : 500) + " " + field_569[109];
         var10000 = var1;
         var10001 = this.field_318;
         var10002 = var2;
         var10003 = 120;
         var10004 = 160;
         var10005 = 17;
      }

      var10000.method_58(var10001, var10002, var10003, var10004, var10005);
      this.method_193();
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics) void
   private void method_146(Graphics var1) {
      Graphics var10000;
      int var10001;
      int var10002;
      int var10003;
      int var10004;
      label19: {
         int var2 = this.field_204 % field_400;
         int var3 = this.field_205 % field_401;
         int var4 = (this.field_204 + 240) % field_400;
         int var5 = (this.field_205 + 240) % field_401;
         if (var4 > var2) {
            if (var5 > var3) {
               var10000 = var1;
               var10001 = var2;
               var10002 = var3;
               var10003 = 0;
               var10004 = 0;
               break label19;
            }

            method_147(var1, var2, var3, 0, 0);
            var10000 = var1;
            var10001 = var2;
            var10002 = 0;
            var10003 = 0;
         } else {
            if (var5 > var3) {
               method_147(var1, var2, var3, 0, 0);
               var10000 = var1;
               var10001 = 0;
               var10002 = var3;
               var10003 = 240 - var4;
               var10004 = 0;
               break label19;
            }

            method_147(var1, var2, var3, 0, 0);
            method_147(var1, var2, 0, 0, 240 - var5);
            method_147(var1, 0, var3, 240 - var4, 0);
            var10000 = var1;
            var10001 = 0;
            var10002 = 0;
            var10003 = 240 - var4;
         }

         var10004 = 240 - var5;
      }

      method_147(var10000, var10001, var10002, var10003, var10004);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private static void method_147(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.drawImage(field_398, var3 - var1, var4 - var2, 0);
   }

   // $VF: renamed from: V () void
   private static void method_148() {
      field_400 = 264;
      field_401 = 264;
      field_398 = Image.createImage(field_400, field_401);
      field_399 = field_398.getGraphics();
   }

   // $VF: renamed from: b (int, int) void
   private void method_149(int var1, int var2) {
      int var3 = this.field_204 - this.field_204 % 24;
      int var4 = this.field_205 - this.field_205 % 24;
      int var5 = this.field_204 + field_400 - 24 - (this.field_204 + field_400 - 24) % 24;
      int var6 = this.field_205 + field_401 - 24 - (this.field_205 + field_401 - 24) % 24;
      int var7 = var1 * 24;
      int var8 = var2 * 24;
      if (var7 >= var3 && var7 <= var5 && var8 >= var4 && var8 <= var6) {
         int var9 = field_336[var1][var2] & 0xFF;
         if (field_338[var1][var2] < 80) {
            if (var9 == 4 || var9 == 16 || var9 == 15) {
               this.method_150(var1, var2);
               return;
            }

            field_399.drawImage(field_322[8][0], var7 % field_400, var8 % field_401, 0);
         }
      }
   }

   // $VF: renamed from: c (int, int) void
   private void method_150(int var1, int var2) {
      int var3 = this.field_204 - this.field_204 % 24;
      int var4 = this.field_205 - this.field_205 % 24;
      int var5 = this.field_204 + field_400 - 24 - (this.field_204 + field_400 - 24) % 24;
      int var6 = this.field_205 + field_401 - 24 - (this.field_205 + field_401 - 24) % 24;
      int var7 = var1 * 24;
      int var8 = var2 * 24;
      if (var7 >= var3 && var7 <= var5 && var8 >= var4 && var8 <= var6) {
         this.method_152(var7, var8, var7, var8, false);
      }
   }

   // $VF: renamed from: a (int) int
   public static int method_151(int var0) {
      switch (var0) {
         case 0:
            return 42;
         case 1:
            return 60;
         case 2:
            field_324[59].field_80 = 0;
            return 59;
         case 3:
            field_324[59].field_80 = 1;
            return 59;
         case 4:
            return 56;
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 17:
         case 18:
         case 19:
         case 21:
         default:
            return -1;
         case 14:
            field_324[57].field_80 = 1;
            return 57;
         case 15:
            field_324[57].field_80 = 0;
            return 57;
         case 16:
            return 58;
         case 20:
            return 43;
         case 22:
            field_324[45].field_80 = 0;
            return 45;
         case 23:
            field_324[45].field_80 = 1;
            return 45;
      }
   }

   // $VF: renamed from: a (int, int, int, int, boolean) void
   private void method_152(int var1, int var2, int var3, int var4, boolean var5) {
      Graphics var6 = null;
      int var9 = 0;
      int var10 = 0;
      var6 = field_399;
      int var7 = field_400;
      int var8 = field_401;
      var9 = var1 % var7;
      var10 = var2 % var8;
      this.field_276 = var10 - 24;
      this.field_286 = var2 / 24 - 1;

      for (int var11 = var2; var11 <= var4; var11 += 24) {
         this.field_275 = var9 - 24;
         this.field_285 = var1 / 24 - 1;
         this.field_276 += 24;
         this.field_286++;
         if (this.field_276 >= var8) {
            this.field_276 = 0;
         }

         for (int var12 = var1; var12 <= var3; var12 += 24) {
            this.field_275 += 24;
            this.field_285++;
            if (this.field_275 >= var7) {
               this.field_275 = 0;
            }

            if (this.field_285 >= 0 && this.field_285 < this.field_208 && this.field_286 >= 0 && this.field_286 < this.field_209) {
               this.field_287 = field_338[this.field_285][this.field_286];
               this.field_288 = field_336[this.field_285][this.field_286] & 0xFF;
               if (this.field_287 < 80 && !var5) {
                  var6.drawImage(field_322[8][0], this.field_275, this.field_276, 0);
               }

               label125:
               if (this.field_288 > -1 && this.field_288 < 38) {
                  class_8 var10000;
                  int var10001;
                  switch (this.field_288) {
                     case 4:
                        this.field_217 = 20;
                        this.field_218 = 7;
                        this.field_292 = this.field_293 = 0;
                        break label125;
                     case 15:
                        if (this.field_314 != 0) {
                           break label125;
                        }

                        this.field_217 = 14;
                        var10000 = this;
                        var10001 = 0 + this.field_314 * 5 / 10;
                        break;
                     case 16:
                        if (this.field_314 != 9) {
                           break label125;
                        }

                        this.field_217 = 15;
                        this.field_218 = 4 - this.field_314 * 5 / 10;
                        if (this.field_218 >= 0) {
                           break label125;
                        }

                        var10000 = this;
                        var10001 = 0;
                        break;
                     case 27:
                        this.field_217 = 21;
                        this.field_218 = 0;
                        this.field_292 = this.field_293 = 0;
                     default:
                        break label125;
                  }

                  var10000.field_218 = var10001;
               }

               if (this.field_217 != -1) {
                  if (field_322[this.field_217] == null) {
                     field_324[method_151(this.field_217)]
                        .method_53(var6, this.field_218, this.field_275 + this.field_292, this.field_276 + this.field_293, this.field_294, 0, 0);
                  } else {
                     var6.drawImage(field_322[this.field_217][this.field_218], this.field_275 + this.field_292, this.field_276 + this.field_293, this.field_294);
                  }

                  this.field_294 = 0;
                  this.field_217 = -1;
                  this.field_292 = this.field_293 = 0;
               }

               if (this.field_287 != -1 && !var5) {
                  label108: {
                     byte var13;
                     class_8 var17;
                     int var18;
                     if ((var13 = (byte)(this.field_287 - 80)) >= 0) {
                        this.field_219 = 0;
                        var17 = this;
                        var18 = var13;
                     } else {
                        switch (this.field_287) {
                           case 0:
                              if (field_339[this.field_285][this.field_286] == 0 && (field_505 == null || field_505[this.field_285][this.field_286] == 0)) {
                                 this.method_194();
                              }
                              break label108;
                           case 1:
                              if (field_339[this.field_285][this.field_286] == 0 && (field_505 == null || field_505[this.field_285][this.field_286] == 0)) {
                                 this.method_194();
                                 this.field_220 = this.field_220 - this.field_296;
                                 this.field_293 = 0;
                              }
                              break label108;
                           case 10:
                              field_324[16].method_53(var6, 0, this.field_275, this.field_276, 0, 0, 0);
                              break label108;
                           case 34:
                              if (this.field_314 != 9) {
                                 break label108;
                              }

                              this.field_219 = 14;
                              var17 = this;
                              var18 = 0 + this.field_314 * 5 / 10;
                              break;
                           case 35:
                              if (this.field_314 == 0) {
                                 this.field_219 = 15;
                                 this.field_220 = 4 - this.field_314 * 5 / 10;
                                 if (this.field_220 < 0) {
                                    var17 = this;
                                    var18 = 0;
                                    break;
                                 }
                              }
                           default:
                              break label108;
                        }
                     }

                     var17.field_220 = var18;
                  }

                  if (this.field_219 != -1) {
                     if (field_322[this.field_219] == null) {
                        field_324[method_151(this.field_219)]
                           .method_53(var6, this.field_220, this.field_275 + this.field_292, this.field_276 + this.field_293, this.field_294, 0, 0);
                     } else {
                        var6.drawImage(
                           field_322[this.field_219][this.field_220], this.field_275 + this.field_292, this.field_276 + this.field_293, this.field_294
                        );
                     }

                     this.field_219 = -1;
                     this.field_294 = 0;
                     this.field_292 = this.field_293 = 0;
                  }
               }

               if (this.field_177 == 2) {
                  this.method_183(var6);
               }
            }
         }
      }
   }

   // $VF: renamed from: c (javax.microedition.lcdui.Graphics) void
   private void method_153(Graphics var1) {
      for (int var2 = -1; var2 < 12; var2++) {
         for (int var3 = -1; var3 < 12; var3++) {
            this.field_285 = var3 + this.field_406;
            this.field_286 = var2 + this.field_407;
            if (this.field_285 >= 0 && this.field_285 < this.field_208 && this.field_286 >= 0 && this.field_286 < this.field_209) {
               this.field_287 = field_338[this.field_285][this.field_286];
               this.field_288 = field_336[this.field_285][this.field_286] & 0xFF;
               this.field_275 = var3 * 24 - this.field_408;
               this.field_276 = var2 * 24 - this.field_409;
               this.method_154();
               label163:
               if (this.field_288 > -1 && this.field_288 < 38) {
                  label168: {
                     class_8 var10000;
                     switch (this.field_288) {
                        case 3:
                           int var4;
                           if ((var4 = (field_336[this.field_285][this.field_286] >> 8) - 1) >= 0) {
                              this.field_217 = 12;
                              this.field_218 = (byte)var4;
                           }
                           break label168;
                        case 4:
                           if (field_336[this.field_285][this.field_286] >> 8 >= this.field_210) {
                              this.method_166();
                           }
                           break label168;
                        case 5:
                        case 28:
                           this.field_217 = 11;
                           this.field_218 = 0;
                           break label168;
                        case 6:
                           this.method_197();
                           if (this.field_276 + 24 < 240) {
                              var1.clipRect(this.field_275, this.field_276, 24, 24);
                           }
                           break label168;
                        case 7:
                           this.method_202();
                           break label168;
                        case 8:
                        case 9:
                           this.method_201();
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 36:
                        default:
                           break label168;
                        case 14:
                        case 33:
                           this.method_167(this.field_288);
                           break label168;
                        case 15:
                           if (this.field_314 != 0 && this.field_314 <= 5) {
                              this.field_217 = 14;
                              this.field_218 = 0 + this.field_314 * 5 / 10;
                           }
                           break label168;
                        case 16:
                           if (this.field_314 != 9 && this.field_314 >= 5) {
                              this.field_217 = 15;
                              this.field_218 = 4 - this.field_314 * 5 / 10;
                              if (this.field_218 < 0) {
                                 this.field_218 = 0;
                              }
                           }
                           break label168;
                        case 34:
                           field_324[27].method_52(var1, 2, 0, this.field_275, this.field_276, 0, 0, 0);
                           break label168;
                        case 35:
                           var10000 = this;
                           break;
                        case 37:
                           field_324[27].method_52(var1, 2, 0, this.field_275, this.field_276, 0, 0, 0);
                           var10000 = this;
                     }

                     var10000.method_159();
                  }

                  if (this.field_217 != -1) {
                     if (field_322[this.field_217] == null) {
                        field_324[method_151(this.field_217)]
                           .method_53(var1, this.field_218, this.field_275 + this.field_292, this.field_276 + this.field_293, this.field_294, 0, 0);
                     } else {
                        var1.drawImage(
                           field_322[this.field_217][this.field_218], this.field_275 + this.field_292, this.field_276 + this.field_293, this.field_294
                        );
                     }

                     this.field_294 = 0;
                     this.field_217 = -1;
                     var1.setClip(0, -this.field_259, 240, 240);
                  } else {
                     if (field_328 == null) {
                        break label163;
                     }

                     if (this.field_289 != -1) {
                        field_328.method_52(var1, this.field_289, this.field_290, this.field_275 + this.field_292, this.field_276 + this.field_293, 0, 0, 0);
                        this.field_289 = -1;
                     }

                     field_328 = null;
                  }

                  this.field_292 = this.field_293 = 0;
               }

               if (this.field_287 != -1) {
                  byte var7;
                  label153:
                  if ((var7 = (byte)(this.field_287 - 80)) < 0) {
                     int var5 = field_337[this.field_285][this.field_286];
                     class_8 var8;
                     switch (this.field_287) {
                        case 0:
                           if ((field_337[this.field_285][this.field_286] & -2147483648) == 0) {
                              break label153;
                           }
                        case 8:
                           var8 = this;
                           break;
                        case 1:
                           if ((field_337[this.field_285][this.field_286] & -2147483648) != 0 || this.field_296 != 0) {
                              var8 = this;
                              break;
                           }
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 10:
                        case 13:
                        case 15:
                        case 17:
                        case 20:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 29:
                        case 31:
                        case 33:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        default:
                           break label153;
                        case 9:
                           this.method_194();
                           if ((field_337[this.field_285][this.field_286] & 264241152) == 138412032) {
                              this.field_292 = this.field_292 + this.field_193;
                              this.field_293 = this.field_293 + this.field_194;
                           }
                           break label153;
                        case 11:
                           this.method_199();
                           break label153;
                        case 12:
                           this.method_163();
                           break label153;
                        case 14:
                           this.method_203();
                           break label153;
                        case 16:
                           this.method_204();
                           break label153;
                        case 18:
                           this.method_169();
                           break label153;
                        case 19:
                           this.method_196((byte)this.field_287);
                           break label153;
                        case 21:
                           this.method_160();
                           break label153;
                        case 22:
                           field_328 = field_324[12];
                           this.field_290 = 1;
                           this.method_171((byte)22);
                           break label153;
                        case 23:
                           field_328 = field_324[12];
                           this.field_290 = 0;
                           this.method_171((byte)23);
                           break label153;
                        case 28:
                           this.method_209();
                           break label153;
                        case 30:
                           field_328 = field_324[20];
                           this.field_289 = 0;
                           this.field_290 = 0 + (var5 - 1) * 7 / 16;
                           break label153;
                        case 32:
                           this.method_200();
                           break label153;
                        case 34:
                           if (this.field_314 != 9 && this.field_314 >= 5) {
                              this.field_219 = 14;
                              this.field_220 = 0 + this.field_314 * 5 / 10;
                           }
                           break label153;
                        case 35:
                           if (this.field_314 != 0 && this.field_314 <= 5) {
                              this.field_219 = 15;
                              this.field_220 = 4 - this.field_314 * 5 / 10;
                              if (this.field_220 < 0) {
                                 this.field_220 = 0;
                              }
                           }
                           break label153;
                        case 36:
                           this.method_170();
                           break label153;
                        case 37:
                           this.field_219 = 17;
                           this.field_220 = 0 + (var5 - 1) * 3 / 8;
                           break label153;
                        case 43:
                           this.method_196((byte)this.field_287);
                           break label153;
                        case 44:
                           this.method_162();
                           this.field_290 = 0;
                           break label153;
                        case 45:
                           this.method_205();
                           break label153;
                        case 46:
                           this.method_161();
                           break label153;
                        case 47:
                           var8 = this;
                           break;
                        case 48:
                           this.method_157();
                           break label153;
                        case 49:
                           this.method_195();
                           break label153;
                     }

                     var8.method_194();
                  }

                  if (this.field_219 != -1) {
                     if (field_322[this.field_219] == null) {
                        field_324[method_151(this.field_219)]
                           .method_53(var1, this.field_220, this.field_275 + this.field_292, this.field_276 + this.field_293, this.field_294, 0, 0);
                     } else {
                        var1.drawImage(
                           field_322[this.field_219][this.field_220], this.field_275 + this.field_292, this.field_276 + this.field_293, this.field_294
                        );
                     }

                     this.field_219 = -1;
                     this.field_294 = 0;
                  } else {
                     if (field_328 == null) {
                        continue;
                     }

                     if (this.field_285 == this.field_363 && this.field_286 == this.field_364) {
                        field_368 = field_328;
                        this.field_369 = this.field_289;
                        this.field_367 = this.field_290;
                        this.field_366 = this.field_275 + this.field_292;
                        this.field_365 = this.field_276 + this.field_293;
                     }

                     if (this.field_289 != -1) {
                        field_328.method_52(
                           var1, this.field_289, this.field_290, this.field_275 + this.field_292, this.field_276 + this.field_293, this.field_291, 0, 0
                        );
                        this.field_289 = -1;
                     } else {
                        field_328.method_53(var1, this.field_290, this.field_275 + this.field_292, this.field_276 + this.field_293, this.field_291, 0, 0);
                     }

                     field_328 = null;
                     this.field_291 = 0;
                  }

                  this.field_292 = this.field_293 = 0;
               }
            }
         }
      }
   }

   // $VF: renamed from: W () void
   private void method_154() {
      this.field_318.setClip(0, 0, 240, 240);
   }

   // $VF: renamed from: X () void
   private void method_155() {
      Graphics var1 = this.field_318;
      int var2 = field_229;
      this.field_295 = (this.field_236 & 4096) == 0 ? this.field_200 : 0;
      var1.translate(0, 40);
      this.field_259 = 0;
      this.method_154();
      if (this.field_258 > 0) {
         this.field_259 = this.field_258 * var2 % ((this.field_258 >> 1) + 1) % 12;
      }

      if (this.field_259 > this.field_205) {
         this.field_259 = this.field_205;
      }

      this.field_205 = this.field_205 - this.field_259;
      this.field_406 = this.field_204 / 24;
      this.field_407 = this.field_205 / 24;
      this.field_408 = this.field_204 % 24;
      this.field_409 = this.field_205 % 24;
      this.field_296 = (var2 & 63) >> 1;
      if (this.field_296 >= 4) {
         this.field_296 = 0;
      }

      int var3 = this.field_204 - this.field_408;
      int var4 = this.field_205 - this.field_409;
      int var5 = this.field_204 + field_400 - 24 - (this.field_204 + field_400 - 24) % 24;
      int var6 = this.field_205 + field_401 - 24 - (this.field_205 + field_401 - 24) % 24;
      if (field_402 == -1) {
         this.method_152(var3, var4, var5, var6, false);
         field_402 = var3;
         field_403 = var5;
         field_404 = var4;
         field_405 = var6;
      }

      if (field_402 != var3) {
         int var7;
         int var10000;
         if (field_402 < var3) {
            var7 = field_403 + 24;
            var10000 = var5;
         } else {
            var7 = var3;
            var10000 = field_402 - 24;
         }

         int var8 = var10000;
         this.method_152(var7, var4, var8, var6, false);
         field_402 = var3;
         field_403 = var5;
      }

      if (field_404 != var4) {
         int var36;
         int var43;
         if (field_404 < var4) {
            var36 = field_405 + 24;
            var43 = var6;
         } else {
            var36 = var4;
            var43 = field_404 - 24;
         }

         int var38 = var43;
         this.method_152(var3, var36, var5, var38, false);
         field_404 = var4;
         field_405 = var6;
      }

      this.method_146(var1);
      this.method_154();
      this.method_153(var1);
      if (field_371) {
         var1.setColor(0);
         var1.fillRect(0, 0, 240, 320);
         this.method_193();
         if (field_410 != null) {
            var1.drawImage(field_410, field_411, field_412, field_413);
         }

         if (this.field_165 != this.field_166) {
            int var48 = this.field_165;

            while (true) {
               var3 = var48;
               if (var48 == this.field_166) {
                  break;
               }

               var4 = field_162[var3 << 1] * 24 - this.field_204;
               var5 = field_162[(var3 << 1) + 1] * 24 - this.field_205;
               class_7 var49;
               Graphics var52;
               byte var55;
               int var57;
               if (field_164[var3] < 0) {
                  class_7 var35;
                  var49 = var35 = field_324[2];
                  var52 = var1;
                  var55 = 0;
                  var57 = method_206(var35, 0, field_163[var3]);
               } else {
                  var49 = field_324[9];
                  var52 = var1;
                  var55 = field_164[var3];
                  var57 = field_163[var3];
               }

               var49.method_52(var52, var55, var57, var4, var5, 0, 0, 0);
               var48 = ++var3 & 7;
            }
         }

         this.field_318.setClip(0, 0, 240, 320);
         var1.translate(0, -40);
         this.method_168();
      } else {
         this.method_193();
         if (this.field_158) {
            this.method_165(this.field_408, this.field_409);
         }

         if (field_410 != null) {
            var1.drawImage(field_410, field_411, field_412, field_413);
         }

         if (this.field_196 > 0) {
            this.method_156();
         }

         if (this.field_177 != 0) {
            this.method_181();
         }

         for (int var17 = -1; var17 < 12; var17++) {
            for (int var24 = -1; var24 < 12; var24++) {
               int var37 = var24 + this.field_406;
               int var39 = var17 + this.field_407;
               if (var37 >= 0 && var37 < this.field_208 && var39 >= 0 && var39 < this.field_209) {
                  var5 = field_336[var37][var39] & 0xFF;
                  byte var33 = field_338[var37][var39];
                  if (var5 < 38 || var5 >= 80) {
                     int var10;
                     int var11;
                     label284: {
                        var10 = var24 * 24 - this.field_408;
                        var11 = var17 * 24 - this.field_409;
                        class_7 var44;
                        Graphics var10001;
                        int var10002;
                        int var10003;
                        if (var5 >= 20 && var5 < 26) {
                           int var42 = var5 - 20;
                           var44 = field_324[3];
                           var10001 = var1;
                           var10002 = var42;
                           var10003 = (var2 >> 2) % (field_324[3].field_74[var42] & 255);
                        } else {
                           switch (var5) {
                              case 31:
                                 int var13 = field_336[var37][var39] >> 8;
                                 class_7 var14 = field_324[15];
                                 int var15 = (field_229 >> 1) % (var14.field_74[var13] & 255);
                                 var14.method_52(this.field_318, var13, var15, var10, var11, 0, 0, 0);
                                 break;
                              case 32:
                                 field_324[16].method_52(this.field_318, 0, field_336[var37][var39] >> 8 & 0xFF, var10, var11, 0, 0, 0);
                                 break;
                              case 36:
                                 int var12 = (field_336[var37][var39] >> 8) - 1;
                                 var12 = (0 + var12 * 7) / 16;
                                 field_324[20].method_52(var1, 0, var12, var10, var11, 0, 0, 0);
                                 break;
                              default:
                                 byte var16;
                                 if ((var16 = (byte)(var5 - 80)) >= 0) {
                                    field_324[42].method_53(var1, var16, var10, var11, 0, 0, 0);
                                 }
                           }

                           int var41;
                           if ((var41 = (field_336[var37][var39] & -268435456) >> 28) <= 0) {
                              break label284;
                           }

                           var44 = field_324[13];
                           var10001 = var1;
                           var10002 = 0;
                           var10003 = var41;
                        }

                        var44.method_52(var10001, var10002, var10003, var10, var11, 0, 0, 0);
                     }

                     if (var33 == 54) {
                        field_324[7].method_52(var1, 0, method_206(field_324[7], 0, field_337[var37][var39]), var10, var11, 0, 0, 0);
                     }
                  }
               }
            }
         }

         if (this.field_281) {
            var3 = (this.field_279 - this.field_406) * 24 - this.field_408 + this.field_277;
            var4 = (this.field_280 - this.field_407 + 1) * 24 - this.field_409 + this.field_278;
            var1.drawImage(field_324[13].field_85[0][0 + this.field_282], var3, var4, 0);
            this.field_281 = false;
         }

         if (this.field_211 != -1) {
            var1.drawImage(field_322[13][0], this.field_273 + -12, this.field_274 + -24 + 2, 3);
            var1.drawImage(field_322[this.field_211][this.field_212], this.field_273 + -12, this.field_274 + -24, 3);
         }

         if (this.field_165 != this.field_166) {
            int var45 = this.field_165;

            while (true) {
               var3 = var45;
               if (var45 == this.field_166) {
                  break;
               }

               var4 = field_162[var3 << 1] * 24 - this.field_204;
               var5 = field_162[(var3 << 1) + 1] * 24 - this.field_205;
               class_7 var46;
               Graphics var50;
               byte var53;
               int var56;
               if (field_164[var3] < 0) {
                  class_7 var34;
                  var46 = var34 = field_324[2];
                  var50 = var1;
                  var53 = 0;
                  var56 = method_206(var34, 0, field_163[var3]);
               } else {
                  var46 = field_324[9];
                  var50 = var1;
                  var53 = field_164[var3];
                  var56 = field_163[var3];
               }

               var46.method_52(var50, var53, var56, var4, var5, 0, 0, 0);
               var45 = ++var3 & 7;
            }
         }

         this.field_205 = this.field_205 + this.field_259;
         if (this.field_241) {
            method_408(var1, field_324[41], field_569[40], 120, 160, 17, 19, false);
         }

         if (this.field_263 > field_229 && this.field_177 != 2) {
            if (!this.field_466 && !this.field_125) {
               var4 = (var3 = this.field_263 - field_229) < 20 ? (var3 - 10) * 240 / 20 : (var3 >= 50 ? (60 - var3) * 240 / 15 : 120);
               var5 = 240 - var4;
               method_408(var1, field_324[41], field_569[field_567[this.field_202]], var4, 15, 17, 20, false);
               method_408(var1, field_324[41], field_569[field_568[this.field_202][this.field_203]], var5, 50, 17, 20, false);
               if (this.field_159 > 0) {
                  method_408(var1, field_324[41], this.field_264, 120, 190, 17, 5, true);
               }
            }
         } else if (this.field_178 > field_229 && this.field_370 <= 2) {
            method_408(var1, field_324[41], field_569[36], 120, 230, 33, 20, false);
         } else if (this.field_178 == field_229 && this.field_370 <= 2) {
            this.field_370++;
            this.method_116();
         }

         label213: {
            class_8 var47;
            Graphics var51;
            byte var54;
            switch (this.field_177) {
               case 3:
                  if (this.field_183 == -1 || this.field_183 == 15) {
                     break label213;
                  }

                  var47 = this;
                  var51 = var1;
                  var54 = 5;
                  break;
               case 4:
                  this.method_186();
                  break label213;
               case 5:
                  if (this.field_183 != -1 && this.field_183 != 15 && this.field_183 != 13 && this.field_183 != 12) {
                     var47 = this;
                     var51 = var1;
                     var54 = 4;
                     break;
                  }
               default:
                  break label213;
            }

            var47.method_187(var51, var54);
         }

         var1.translate(0, -40);
         var1.setClip(0, 0, 240, 320);
         if (this.field_358 == null) {
            this.method_168();
         }

         if (this.field_467 != null) {
            this.field_173 = true;
            method_408(var1, field_324[41], this.field_467, 120, 263, 33, 4, true);
         }

         if (this.field_358 != null && !field_371) {
            this.field_173 = true;
            this.field_358.method_28(var1);
         }

         if (this.field_260 > 0) {
            this.field_173 = true;
            var1.setColor(0);
            var1.fillRect(0, 0, 240, this.field_260);
            var1.fillRect(0, 320 - this.field_260, 240, this.field_260);
            var1.translate(0, 40);
            this.method_193();
            if (field_410 != null) {
               var1.drawImage(field_410, field_411, field_412, field_413);
            }

            if (field_368 != null) {
               if (this.field_369 != -1) {
                  field_368.method_52(
                     var1,
                     this.field_369,
                     this.field_367,
                     (this.field_363 - this.field_406) * 24 - this.field_408,
                     (this.field_364 - this.field_407) * 24 - this.field_409,
                     this.field_291,
                     0,
                     0
                  );
               } else {
                  field_368.method_53(var1, this.field_367, this.field_366, this.field_365, this.field_291, 0, 0);
               }
            }

            var1.translate(0, -40);
         }
      }
   }

   // $VF: renamed from: Y () void
   private void method_156() {
      int var1 = this.field_205 - 24;
      int var2 = this.field_205 + 320;
      int var3 = this.field_204;
      int var4 = this.field_204 + 240;
      int var5 = (field_229 >> 1) % field_324[2].method_49(1);

      for (byte var6 = 0; var6 < field_195.length; var6 += 3) {
         int var7 = 0;
         byte var8;
         int var9;
         if ((var9 = (var8 = field_195[var6 + 2]) * 24) > var1 && var9 < var2) {
            byte var10 = field_195[var6 + 0];
            byte var11 = field_195[var6 + 1];
            int var12 = var10 * 24;
            int var13 = var11 * 24 + 24;
            if (var12 >= var3 && var12 <= var4 || var13 >= var3 && var13 <= var4 || var12 <= var3 && var13 >= var4) {
               int var14 = var12 - var3;
               int var15 = var10 + (var10 != 0 ? -1 : 0);
               boolean var16 = true;
               if (field_338[var15][var8] == 48 && (field_337[var15][var8] & 8) != 0) {
                  var14 -= 12;
                  var16 = false;
                  if ((field_337[var15][var8 + 1] & 7) == 3) {
                     var7 = -field_339[var15][var8 + 1];
                  } else {
                     var14 -= -field_339[var15][var8 + 1];
                  }
               }

               int var17 = var13 - var3;
               var15 = var11 + (var11 < this.field_208 - 1 ? 1 : 0);
               boolean var18 = true;
               if (field_338[var15][var8] == 48 && (field_337[var15][var8] & 8) != 0) {
                  var17 += 12;
                  var18 = false;
                  if ((field_337[var15][var8 + 1] & 7) == 3) {
                     var7 = -field_339[var15][var8 + 1];
                  } else {
                     var17 += -field_339[var15][var8 + 1];
                  }
               }

               int var19 = var9 - this.field_205 + 10 + var7;
               this.field_318.setColor(1820159);
               this.field_318.drawLine(var14, var19, var17, var19);
               var19 += 2;
               this.field_318.drawLine(var14, var19, var17, var19);
               var19--;
               this.field_318.setColor(14153215);
               this.field_318.drawLine(var14, var19, var17, var19);
               class_7 var10000;
               Graphics var10001;
               byte var10002;
               int var10003;
               int var10004;
               int var10005;
               byte var10006;
               if (var16) {
                  var10000 = field_324[2];
                  var10001 = this.field_318;
                  var10002 = 1;
                  var10003 = var5;
                  var10004 = var14;
                  var10005 = var19;
                  var10006 = 1;
               } else {
                  if (!var18) {
                     continue;
                  }

                  var10000 = field_324[2];
                  var10001 = this.field_318;
                  var10002 = 1;
                  var10003 = var5;
                  var10004 = var17;
                  var10005 = var19;
                  var10006 = 0;
               }

               var10000.method_52(var10001, var10002, var10003, var10004, var10005, var10006, 0, 0);
            }
         }
      }
   }

   // $VF: renamed from: Z () void
   private void method_157() {
      int var1;
      if (((var1 = field_337[this.field_285][this.field_286]) & 8) == 0) {
         field_328 = field_324[32];
         int var2 = var1 & 7;
         boolean var3;
         class_8 var10000;
         int var10001;
         if ((!(var3 = (var1 & 16) == 0) || var2 != 2) && (var3 || var2 != 4)) {
            var10000 = this;
            var10001 = var3 ? 1 : 0;
         } else {
            var10000 = this;
            var10001 = 2;
         }

         var10000.field_290 = var10001;
         byte var4 = field_339[this.field_285][this.field_286];
         this.field_292 = var4 * field_329[var2];
         this.field_293 = var4 * field_329[var2 + 8];
      }
   }

   // $VF: renamed from: aa () void
   private void method_158() {
      if ((field_337[this.field_285][this.field_286] & 7) == 1 && (field_336[this.field_285][this.field_286] & 0xFF) == 35) {
         this.field_292 = 0;
         this.field_293 = field_339[this.field_285][this.field_286];
      }
   }

   // $VF: renamed from: ab () void
   private void method_159() {
      field_328 = field_324[30];
      this.field_289 = 1;
      this.field_290 = method_206(field_328, 1, field_229 % method_316(field_328, 1));
   }

   // $VF: renamed from: ac () void
   private void method_160() {
      int var1 = field_337[this.field_285][this.field_286] & 7;
      field_328 = field_324[29];
      class_8 var3;
      int var5;
      if ((field_337[this.field_285][this.field_286] & 8) == 0) {
         label26: {
            byte var10001;
            switch (var1) {
               case 1:
                  var3 = this;
                  var10001 = 2;
                  break;
               case 2:
                  var3 = this;
                  var10001 = 1;
                  break;
               case 3:
               default:
                  break label26;
               case 4:
                  var3 = this;
                  var10001 = 0;
            }

            var3.field_290 = var10001;
         }

         this.field_292 = field_339[this.field_285][this.field_286] * field_329[var1];
         var3 = this;
         var5 = field_339[this.field_285][this.field_286] * field_329[8 + var1];
      } else {
         label21: {
            byte var6;
            switch (var1) {
               case 1:
                  var3 = this;
                  var6 = 14;
                  break;
               case 2:
                  var3 = this;
                  var6 = 13;
                  break;
               case 3:
               default:
                  break label21;
               case 4:
                  var3 = this;
                  var6 = 12;
            }

            var3.field_289 = var6;
         }

         this.field_290 = method_206(field_328, this.field_289, field_339[this.field_285][this.field_286]);
         int var2 = (field_328.field_75[this.field_289] + this.field_290) * 5;
         this.field_292 = field_328.field_76[var2 + 2];
         var3 = this;
         var5 = field_328.field_76[var2 + 3];
      }

      var3.field_293 = var5;
   }

   // $VF: renamed from: ad () void
   private void method_161() {
      field_328 = field_324[29];
      this.field_289 = field_337[this.field_285][this.field_286] & 31;
      class_8 var10000;
      int var10001;
      if (this.field_289 != 8 && this.field_289 != 9) {
         int var4 = (field_337[this.field_285][this.field_286] & 8160) >> 5;
         int var2 = method_206(field_328, this.field_289, var4);
         this.field_290 = var2;
         int var3 = (field_328.field_75[this.field_289] + var2) * 5;
         this.field_292 = field_328.field_76[var3 + 2];
         var10000 = this;
         var10001 = field_328.field_76[var3 + 3];
      } else {
         this.field_290 = 0;
         int var1 = (field_328.field_75[this.field_289] + 0) * 5;
         this.field_292 = field_328.field_76[var1 + 2];
         var10000 = this;
         var10001 = -field_339[this.field_285][this.field_286];
      }

      var10000.field_293 = var10001;
   }

   // $VF: renamed from: ae () void
   private void method_162() {
      this.field_289 = (field_337[this.field_285][this.field_286] & 56) >> 3;
      field_328 = field_324[27];
      class_8 var10000;
      int var10001;
      switch (this.field_289) {
         case 1:
            var10000 = this;
            var10001 = (field_339[this.field_285][this.field_286] >> 1) % field_324[27].method_49(1);
            break;
         case 3:
            this.field_290 = 0;
            this.field_293 = -field_339[this.field_285][this.field_286];
            return;
         default:
            var10000 = this;
            var10001 = field_339[this.field_285][this.field_286];
      }

      var10000.field_290 = var10001;
   }

   // $VF: renamed from: af () void
   private void method_163() {
      this.method_164(this.field_275, this.field_276, false);
   }

   // $VF: renamed from: a (int, int, boolean) void
   private void method_164(int var1, int var2, boolean var3) {
      Image[] var4 = field_322[18];
      byte var5 = 0;
      if (var3) {
         var5 = -5;
      }

      this.field_318.drawImage(var4[1], var1 + 6, var2 + var5, 0);
      this.field_318.drawImage(var4[0], var1 + 3, var2 + 7, 0);
      if (!var3) {
         int var7 = 0;
         if (this.field_159 < 10) {
            var7 = field_324[0].field_85[0][0].getWidth() >> 1;
            var7++;
         }

         method_211(this.field_318, var1 + 19 - var7, var2 + 13, this.field_159, field_324[0].field_85[0], 0);
      }
   }

   // $VF: renamed from: d (int, int) void
   private void method_165(int var1, int var2) {
      Graphics var3 = this.field_318;

      for (int var4 = 0; var4 < 12; var4++) {
         for (int var5 = 0; var5 < 12; var5++) {
            int var7 = var5 + this.field_204 / 24;
            int var8 = var4 + this.field_205 / 24;
            if (var7 >= 0 && var7 < this.field_208 && var8 >= 0 && var8 < this.field_209) {
               int var6 = field_505[var7][var8];
               int var10 = var5 * 24 - var1;
               int var11 = var4 * 24 - var2;
               byte var12 = 0;
               if (var6 > 0) {
                  byte var10000 = 0;

                  while (true) {
                     byte var13 = var10000;
                     if (var10000 > 2) {
                        break;
                     }

                     if (method_376(var6, var13, (byte)0, (byte)3) != 0) {
                        if ((var12 = (byte)(method_376(var6, var13, (byte)7, (byte)2) << 3)) > 0) {
                           byte var18;
                           var12 = method_378(method_376(var6, var13, (byte)0, (byte)3), (byte)45, (byte)2) <= 1
                              ? (var18 = (byte)(var12 - 24))
                              : (byte)(24 - var12);
                           this.method_154();
                           var3.clipRect(var10, var11 + (var13 << 3), 24, 8);
                        }

                        int var14;
                        int var15;
                        int var16 = ((var15 = (var14 = this.method_399(var7, var8, var6, var13)) >> 1) == 7 ? field_229 >> 3 : field_229) & 1;
                        if (var15 == 15) {
                           field_504.method_53(var3, var14 + this.field_397, var10 + var12 - 8, var11 + (var13 << 3) + 8, 36, 0, 0);
                           this.field_397++;
                           if (this.field_397 > 2) {
                              this.field_397 = 0;
                           }
                        } else {
                           label100: {
                              class_7 var19;
                              Graphics var10001;
                              int var10002;
                              int var10003;
                              int var10004;
                              if (var15 != 14 && var15 != 11) {
                                 if (var15 == 8 && var13 == 0 && field_505[var7][var8 - 1] > 0) {
                                    field_504.method_53(var3, 33, var10 + var12, var11, 20, 0, 0);
                                    var13 = 3;
                                    break label100;
                                 }

                                 var19 = field_504;
                                 var10001 = var3;
                                 var10002 = var14 + var16;
                                 var10003 = var10 + var12;
                                 var10004 = var11 + (var13 << 3);
                              } else {
                                 var19 = field_504;
                                 var10001 = var3;
                                 var10002 = var14 + var16;
                                 var10003 = var10 + var12;
                                 var10004 = var11;
                              }

                              var19.method_53(var10001, var10002, var10003, var10004, 20, 0, 0);
                              this.method_154();
                           }
                        }
                     }

                     var10000 = (byte)(var13 + 1);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: ag () void
   private void method_166() {
      this.field_217 = 20;
      class_8 var10000;
      int var10001;
      if (field_336[this.field_285][this.field_286] >> 8 >= this.field_210) {
         var10000 = this;
         var10001 = 0 + (field_229 >> 1) % 7;
      } else {
         var10000 = this;
         var10001 = 7;
      }

      var10000.field_218 = var10001;
   }

   // $VF: renamed from: l (int) void
   private void method_167(int var1) {
      int var2;
      if ((var2 = field_336[this.field_285][this.field_286] >> 8) == 255) {
         var2 = 0;
      }

      int var3 = 14 == var1 ? 8 : 22;
      if (field_324[var3] != null) {
         field_324[var3].method_52(this.field_318, 0, var2, this.field_275, this.field_276, 0, 0, 0);
      }
   }

   // $VF: renamed from: ah () void
   private void method_168() {
      boolean var1 = false;
      Graphics var2 = this.field_318;
      class_7 var3;
      if ((var3 = field_324[0]) != null) {
         var2.translate(120, 320);
         class_7 var10000;
         if (!this.field_173 && field_225 != 2) {
            var1 = true;
            var2.setClip(-120, -320, 240, 320);
            var10000 = var3;
         } else {
            var3.method_53(var2, 0, 0, 0, 0, 0, 0);
            if (this.field_421) {
               var3.method_53(var2, 19, 0, 0, 0, 0, 0);
            }

            var10000 = var3;
         }

         var10000.method_53(var2, 1, 0, 0, 0, 0, 0);
         if (this.field_182) {
            var3.method_53(var2, 2, 0, 0, 0, 0, 0);
            var3.method_53(var2, 3 + this.field_181, 0, 0, 0, 0, 0);
         }

         if (var1) {
            var2.setClip(-120, -320, 240, 320);
         }

         if (this.field_159 > 0) {
            this.field_422 = System.currentTimeMillis();
         } else if (System.currentTimeMillis() - this.field_422 < 1500L) {
            method_408(var2, field_324[41], field_569[34], 0, -55, 33, 5, true);
         }

         if (this.field_242 != this.field_414 || this.field_173 || this.field_242 <= 1) {
            Image[] var4 = field_324[0].field_85[0];
            int var5 = 0;
            int var6 = this.field_242 <= 1 ? 1 : 0;
            int var7 = -11 - (field_334[8] - 4) * var4[11 + var6].getWidth() / 2;
            var2.drawImage(var4[11 + var6], var7, -29, 0);
            var5 = 0 + var4[11 + var6].getWidth();
            int var8 = var4[15].getWidth();

            for (int var9 = 0; var9 < field_334[8]; var9++) {
               Graphics var11;
               Image[] var10001;
               byte var10002;
               if ((this.field_242 > 1 || var9 != 0 || (field_229 >> 2 & 1) != 0) && (var9 >= this.field_242 || this.field_242 <= 1)) {
                  var11 = var2;
                  var10001 = var4;
                  var10002 = 13;
               } else {
                  var11 = var2;
                  var10001 = var4;
                  var10002 = 15;
               }

               var11.drawImage(var10001[var10002 + var6], var7 + var5, -29, 0);
               var5 += var8;
            }

            var2.drawImage(var4[17 + var6], var7 + var5, -29, 0);
            this.field_414 = this.field_242;
         }

         if (this.field_415 != this.field_247 || this.field_418 != this.field_159 || this.field_173) {
            if (this.field_159 > 0) {
               method_212(var2, 70, -12, "" + this.field_247 + "/" + (this.field_159 + this.field_247), field_324[0].field_85[0], 0);
            } else {
               method_211(var2, 70, -12, this.field_247, field_324[0].field_85[0], 0);
            }
         }

         if (this.field_416 != this.field_249 || this.field_173) {
            this.field_416 = this.field_249;
            method_211(var2, 107, -12, this.field_249, field_324[0].field_85[0], 0);
         }

         if (this.field_417 != this.field_201 || this.field_173) {
            this.field_417 = this.field_201;
            method_211(var2, -25, -12, this.field_201, field_324[0].field_85[0], 0);
         }

         var2.translate(-120, -320);
         var2.translate(120, 0);
         if (this.field_173 || field_225 == 2) {
            var3.method_53(var2, 20, 0, 0, 0, 0, 0);
         }

         if (this.field_415 != this.field_247 || this.field_418 != this.field_159 || this.field_173) {
            this.method_164(-53, 8, this.field_159 <= 0);
         }

         if (this.field_419 != this.field_239 || this.field_420 != this.field_240 || this.field_173 || field_225 == 2) {
            var3.method_53(var2, 21, 0, 0, 0, 0, 0);
            method_211(var2, 55, 15, this.field_239, field_324[0].field_85[0], 0);
            method_211(var2, 87, 15, this.field_240, field_324[0].field_85[0], 0);
            this.field_419 = this.field_239;
            this.field_420 = this.field_240;
         }

         var2.translate(-120, 0);
         this.field_415 = this.field_247;
         this.field_418 = this.field_159;
         this.field_173 = false;
      }
   }

   // $VF: renamed from: ai () void
   private void method_169() {
      field_328 = field_324[6];
      this.field_289 = 0;
      class_8 var10000;
      byte var10001;
      if (this.field_314 == 0) {
         var10000 = this;
         var10001 = 0;
      } else if (this.field_314 == 9) {
         var10000 = this;
         var10001 = 2;
      } else {
         var10000 = this;
         var10001 = (byte)(this.field_315 < 0 ? 1 : 3);
      }

      var10000.field_290 = var10001;
   }

   // $VF: renamed from: aj () void
   private void method_170() {
      int var1 = field_337[this.field_285][this.field_286] == 1 ? 1 : 0;
      class_7 var2;
      (var2 = field_324[5]).method_52(this.field_318, var1, (field_229 >> 1) % var2.method_49(var1), this.field_275, this.field_276, 0, 0, 0);
   }

   // $VF: renamed from: b (byte) void
   private void method_171(byte var1) {
      class_2 var2 = field_327[4];
      if (var1 == 23) {
         var2.field_19 = this.field_275;
         var2.field_23 |= 1;
      } else {
         var2.field_23 &= -2;
         var2.field_19 = this.field_275 + 24;
      }

      var2.field_20 = this.field_276;
      var2.method_11();
      var2.method_13(this.field_318);
   }

   // $VF: renamed from: m (int) void
   private void method_172(int var1) {
      switch (var1) {
         case 0:
            method_445();
            System.gc();
            return;
         case 1:
            return;
         case 2:
            field_324[41].field_89 = 15;
            return;
         case 3:
            return;
         case 4:
            return;
         case 5:
            return;
         case 6:
            if (field_319 == null) {
               field_319 = method_361("/spl.f", 0);
            }

            if (field_320 == null) {
               field_320 = method_361("/spl.f", 1);
            }

            if (field_321 == null) {
               field_321 = method_361("/spl.f", 2);
               return;
            }
            break;
         case 7:
            if (field_324[18] == null) {
               field_324[18] = method_357("/ui.f", 3);
            }
      }
   }

   // $VF: renamed from: ak () void
   private static void method_173() {
      field_319 = null;
      field_320 = null;
      field_321 = null;
      field_518 = null;
      field_433 = null;
      field_519 = null;
      System.gc();
   }

   // $VF: renamed from: al () void
   private void method_174() {
      this.field_424 = field_566[this.field_266].length >> 1;
      this.field_425 = 0;

      for (int var1 = 0; var1 < this.field_424; var1++) {
         int var2 = method_364(field_324[41], field_569[field_566[this.field_266][var1 * 2 + 1]], 0);
         if ((this.field_266 != 0 || var1 != 3) && var2 > this.field_425) {
            this.field_425 = var2;
         }
      }

      this.field_428 = 0;
      this.field_423 = 0;
   }

   // $VF: renamed from: e (int, int) void
   private void method_175(int var1, int var2) {
      if (field_225 == 4) {
         this.method_144(this.field_318, false);

         for (int var3 = var1 - 1; var3 < var2 - 2; var3++) {
            field_324[18].method_53(this.field_318, 4, var3 % 2, var3, 0, 0, 0);
         }
      }

      if (field_225 == 2) {
         this.field_318.setColor(0);
         this.field_318.fillRect(0, var1 - 1, 240, var2 - 2 - (var1 - 1));
      }

      this.field_318.setColor(16777215);
      this.field_318.drawLine(0, var1 - 1 - 1, 240, var1 - 1 - 1);
      this.field_318.drawLine(0, var2 - 1, 240, var2 - 1);
      this.field_318.setColor(0);
      this.field_318.drawLine(0, var1 - 1 - 2, 240, var1 - 1 - 2);
      this.field_318.drawLine(0, var2 - 2, 240, var2 - 2);
   }

   // $VF: renamed from: am () void
   private void method_176() {
      this.field_438 = false;
      this.field_437 = method_107();
   }

   // $VF: renamed from: an () void
   private void method_177() {
      if (this.field_438) {
         this.method_176();
      }

      int var1;
      var1 = (var1 = 320 - (this.field_424 * 15 + 1 + 2)) + (!this.field_437 && this.field_266 == 0 ? 15 : 0);
      int var2 = 320;
      this.field_318.setClip(0, 0, 240, 320);
      if (field_225 == 2 && field_434 && field_435) {
         this.field_421 = false;
         this.method_155();
         this.field_421 = true;
         field_435 = false;
      }

      if (field_225 == 7 || field_225 == 2) {
         int var3 = var1 - (160 - (320 - var1) / 2);
         var1 -= var3;
         var2 = 320 - var3;
      }

      if (this.field_266 == 7) {
         field_324[41].method_58(this.field_318, field_569[this.field_226 == 5 ? 102 : 113], 120, var1 - 20, 17);
      }

      if (field_225 == 7) {
         Graphics var10000;
         byte var10001;
         int var10002;
         short var10003;
         short var10004;
         if (this.field_432 != -1 && !field_434) {
            int var16 = var1 + this.field_432 * 15;
            this.field_318.setColor(0);
            var10000 = this.field_318;
            var10001 = 0;
            var10002 = var16;
            var10003 = 240;
            var10004 = 16;
         } else {
            this.field_318.setColor(0);
            var10000 = this.field_318;
            var10001 = 0;
            var10002 = 0;
            var10003 = 240;
            var10004 = 320;
         }

         var10000.fillRect(var10001, var10002, var10003, var10004);
      }

      long var17 = System.currentTimeMillis();
      if (this.field_430 >= 0 && var17 - this.field_431 > 100L) {
         this.field_430++;
         this.field_431 = var17;
      }

      if (this.field_432 != -1 && !field_434) {
         int var5 = this.field_266 == 0 && this.field_432 > 1 && !this.field_437 ? 15 : 0;
         int var6 = var1 + this.field_432 * 15 - var5;
         this.field_318.setClip(0, var6, 240, 16);
      }

      if (this.field_432 != this.field_268 || field_434) {
         this.method_175(var1, var2);
      }

      for (int var18 = 0; var18 < this.field_424; var18++) {
         if ((this.field_432 == -1 || var18 == this.field_432 || var18 == this.field_268 || field_434) && (this.field_266 != 0 || var18 != 1 || this.field_437)
            )
          {
            int var20;
            int var7 = (var20 = var1 + var18 * 15) + 7;
            if (this.field_266 == 0 && var18 > 1 && !this.field_437) {
               var20 -= 15;
               var7 -= 15;
            }

            byte var8 = 0;
            if (var18 == 2 && this.field_266 == 0) {
               var8 = 1;
            }

            label208: {
               Graphics var25;
               int var28;
               int var30;
               short var31;
               byte var32;
               label288: {
                  if (this.field_177 == 2 && var18 == 4 && this.field_266 == 1) {
                     var8 = 0;
                     if (var18 != this.field_268) {
                        this.field_318.setColor(13421772);
                        var25 = this.field_318;
                        var28 = 0;
                        var30 = var7 - 7 + 1;
                        var31 = 240;
                        var32 = 14;
                        break label288;
                     }

                     var25 = this.field_318;
                     var28 = 6710886;
                  } else {
                     if (var18 != this.field_268) {
                        break label208;
                     }

                     var25 = this.field_318;
                     var28 = 13540096;
                  }

                  var25.setColor(var28);
                  var25 = this.field_318;
                  var28 = 0;
                  var30 = var7 - 7;
                  var31 = 240;
                  var32 = 16;
               }

               var25.fillRect(var28, var30, var31, var32);
            }

            byte var11 = 0;
            boolean var14 = false;
            field_324[41].method_57(field_569[field_566[this.field_266][var18 * 2 + 1]]);
            int var9 = class_7.field_86;
            int var10 = class_7.field_86;
            int var12 = var18 == 2 && this.field_266 == 0 ? 152 : 210;
            if (var9 > var12) {
               var14 = true;
               var9 = var12;
            }

            int var13 = 120 - var9 / 2;
            if (var14) {
               var11 = (byte)(var18 == this.field_268 ? this.field_427 : 0);
               this.field_318.setClip(var13, var20, var9, 15);
            }

            field_324[41].field_80 = var8;
            field_324[41].method_58(this.field_318, field_569[field_566[this.field_266][var18 * 2 + 1]], 120 - var9 / 2 - var11, var7 + 1, 6);
            if (var14) {
               this.field_318.setClip(0, 0, 240, 320);
            }

            if (var18 == this.field_268) {
               this.field_318.setColor(16777215);
               field_324[18].method_53(this.field_318, 2, 120 - var9 / 2 - 8, var7, 0, 0, 10);
               field_324[18].method_53(this.field_318, 2, 120 + var9 / 2 + 8, var7, 0, 0, 6);
            }

            if (var18 == this.field_268 && var14 && this.field_423 % 2 == 0) {
               this.field_427 = this.field_427 + this.field_426;
               if (this.field_427 < -5 || this.field_427 + var12 - 5 > var10) {
                  this.field_426 = -this.field_426;
                  this.field_427 = this.field_427 + this.field_426;
               }
            }
         }
      }

      this.field_432 = this.field_268;
      this.field_423++;
      class_8 var26;
      int var29;
      if (this.field_429 < 0) {
         var26 = this;
         var29 = 3;
      } else {
         var26 = this;
         var29 = this.field_429 - 1;
      }

      var26.field_429 = var29;
      if (this.field_429 == 0 && this.field_428 + 1 < this.field_424) {
         this.field_428++;
      }

      this.field_318.setClip(0, 0, 240, 320);
      if (this.field_266 == 0 && this.field_478) {
         int var19;
         if ((var19 = this.field_423 % 20) >= 10) {
            field_324[18].method_53(this.field_318, 1, 1, var1 + 30 + 7 - (this.field_437 ? 0 : 15), 0, 0, 6);
         } else if (this.field_268 != 2) {
            if (field_433 == null) {
               int var21 = var1 + 30 + 1 - (this.field_437 ? 0 : 15);
               field_433 = Image.createImage(28, 14);
               Graphics var22;
               (var22 = field_433.getGraphics()).translate(-1, -var21);
               this.method_144(var22, false);
               var22.translate(1, var21);

               for (int var23 = 0; var23 < 14; var23++) {
                  field_324[18].method_53(var22, 4, (var21 + var23 + 1) % 2, var23, 0, 0, 0);
               }
            }

            this.field_318.drawImage(field_433, 1, var1 + 30 + 1 - (this.field_437 ? 0 : 15), 0);
         }
      }

      if (this.field_266 != 0 && this.field_266 != 3 && this.field_266 != 1 && this.field_266 != 7) {
         this.method_178();
      }

      this.method_179();
      field_434 = false;
      if (this.field_430 == 2) {
         if (field_225 == 2) {
            field_434 = true;
            field_435 = true;
         }

         this.field_430 = -1;
         this.field_173 = true;
         this.field_432 = -1;
         this.method_84();
      }
   }

   // $VF: renamed from: a () void
   public final void method_178() {
      field_324[18].method_53(this.field_318, 0, 223, 308, 0, 0, 0);
   }

   // $VF: renamed from: b () void
   public final void method_179() {
      field_324[18].method_53(this.field_318, 3, 2, 308, 0, 0, 0);
   }

   // $VF: renamed from: ao () void
   private void method_180() {
      Graphics var1 = this.field_318;
      this.field_318.setColor(0);
      var1.fillRect(0, 0, 240, 320);
      int var2;
      if ((var2 = (this.field_270 + 1) * 230 / this.field_269) > 230) {
         var2 = 230;
      }

      var1.setColor(13540096);
      this.field_318.fillRect(5, 310, var2, 6);
      var1.setColor(16554500);
      this.field_318.drawRoundRect(4, 309, 231, 6, 2, 2);
      field_324[41].field_80 = 0;
      field_324[41].method_58(this.field_318, field_569[37], 120, 293, 1);
   }

   // $VF: renamed from: ap () void
   private void method_181() {
      switch (this.field_177) {
         case 1:
            this.method_189();
            return;
         case 2:
            this.method_191();
            this.method_182();
            return;
         case 3:
            this.method_185();
            return;
         case 4:
            this.method_188();
            return;
         case 5:
            this.method_184();
      }
   }

   // $VF: renamed from: aq () void
   private void method_182() {
      if (this.field_204 + 240 > 1440 && this.field_205 + 320 > 48) {
         if (field_324[10] == null) {
            field_324[10] = method_357("/mmv.f", 0);
         }

         class_7 var1 = field_324[10];
         if (this.method_301(60, 3) || this.method_301(61, 3)) {
            var1.method_53(this.field_318, 1, 1440 - this.field_204, 48 - this.field_205, 0, 0, 0);
         }
      }

      if (this.field_233 > 55 && this.field_103) {
         field_327[0].method_13(this.field_318);
      }
   }

   // $VF: renamed from: d (javax.microedition.lcdui.Graphics) void
   private void method_183(Graphics var1) {
      if (field_324[10] == null) {
         field_324[10] = method_357("/mmv.f", 0);
      }

      if (this.field_285 >= 60 && this.field_285 < 65 && this.field_286 >= 2 && this.field_286 < 7) {
         field_324[10].method_53(var1, 4 + (this.field_286 - 2) * 5 + this.field_285 - 60, this.field_275, this.field_276, 0, 0, 0);
      }
   }

   // $VF: renamed from: ar () void
   private void method_184() {
      if (this.field_183 != -1) {
         class_2 var1;
         (var1 = field_327[5]).field_19 = this.field_188 - this.field_204;
         var1.field_20 = 504 - this.field_205;
         var1.method_11();
         var1.method_13(this.field_318);
         if (this.field_183 == 12) {
            int var2 = this.field_188 - this.field_204 + field_229 * this.field_184 % 48;
            int var3 = field_327[5].field_20 + 24;
            field_324[7].method_52(this.field_318, 0, field_229 % field_324[7].method_49(1), var2, var3, 0, 0, 0);
            this.method_271(var2, var3);
         }
      }
   }

   // $VF: renamed from: as () void
   private void method_185() {
      if (this.field_177 == 3 && field_229 >= this.field_459 + 80L) {
         for (int var1 = 14; var1 <= 21; var1++) {
            field_337[var1][15] = 0;
            field_336[var1][15] = -1;
            field_338[var1][15] = 44;
            field_339[var1][15] = 0;
            field_340[var1][15] = 24;
         }

         this.field_459 = 0L;
      }

      if (this.field_183 != 15) {
         if (this.field_204 + 240 + 48 >= this.field_187 && this.field_205 + 320 + 48 >= 504) {
            class_2 var3;
            (var3 = field_327[5]).field_19 = this.field_187 - this.field_204;
            var3.field_20 = 504 - this.field_205;
            var3.method_11();
            var3.method_13(this.field_318);
         }

         if (this.field_183 == 12) {
            int var4 = this.field_187 - this.field_204 + field_229 * this.field_184 % 48;
            int var2 = field_327[5].field_20 + 24;
            field_324[7].method_52(this.field_318, 0, field_229 % field_324[7].method_49(0), var4, var2, 0, 0, 0);
            this.method_271(var4, var2);
         }
      }
   }

   // $VF: renamed from: at () void
   private void method_186() {
      Graphics var1 = this.field_318;
      class_2 var2 = field_327[5];
      if (this.field_183 == 7) {
         int var3 = var2.field_19 + field_229 * this.field_184 % 48;
         int var4 = var2.field_20;
         if (this.field_142 == 10) {
            var4 -= 144;
         }

         field_324[7].method_52(var1, 1, field_229 % field_324[7].method_49(1), var3, var4, 0, 0, 0);
         this.method_271(var3, var4);
      } else {
         if (this.field_183 != 8 && this.field_183 != 0) {
            this.method_187(var1, 3);
         }
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int) void
   private void method_187(Graphics var1, int var2) {
      int var3 = var2 * 14 + 2;
      int var4 = 240 - var3 >> 1;
      if (this.field_185 > 0) {
         var1.setColor(0);
         var1.fillRect(var4, 5, var3, 12);
         var1.setColor(3913615);

         for (int var5 = 0; var5 < this.field_185; var5++) {
            var1.fillRect(var4 + 2 + var5 * 14, 7, 12, 8);
         }
      }
   }

   // $VF: renamed from: au () void
   private void method_188() {
      Graphics var1;
      class_2 var2;
      class_2 var3;
      int var4;
      label58: {
         var1 = this.field_318;
         var2 = field_327[5];
         var3 = field_327[4];
         int var10000;
         switch (this.field_183) {
            case 1:
               var10000 = this.field_184 * 1;
               break;
            case 2:
            case 7:
               var10000 = 40;
               break;
            case 3:
               var10000 = 40;
               break;
            case 4:
               var10000 = 40 - (this.field_184 * 2 << 1);
               break;
            case 5:
               var4 = 15 + this.field_184 * 18;
               this.field_439 = false;
               break label58;
            case 6:
            case 8:
            default:
               var10000 = -1000;
               break;
            case 9:
               var10000 = 15 + this.field_184 * 18;
               break;
            case 10:
               var10000 = 15 + this.field_184 * 18;
               break;
            case 11:
               var10000 = 15 + this.field_184 * 18;
         }

         var4 = var10000;
      }

      label53: {
         var2.field_19 = (10 + this.field_186 * (2 + (this.field_186 > 0 ? 1 : 0))) * 24 - this.field_204;
         class_2 var8;
         int var10001;
         if (this.field_183 == 5) {
            int var5 = var2.field_20;
            var2.field_20 = 256 - this.field_205 - this.field_145 - 15;
            if (this.method_278() != 3) {
               break label53;
            }

            var8 = var2;
            var10001 = var5;
         } else {
            var8 = var2;
            var10001 = 256 - var4 - this.field_205;
         }

         var8.field_20 = var10001;
      }

      var2.method_13(var1);
      if (this.field_144) {
         var3.field_20 = 96 - this.field_205;
         var3.field_19 = (this.method_277() + 1) * 24 - this.field_204;
         var3.method_13(var1);
      }

      for (int var7 = 0; var7 < 3; var7++) {
         int var6;
         if ((var6 = (var7 * (2 + (var7 > 0 ? 1 : 0)) + 10) * 24 - this.field_204) < 240 && var6 > -48 && this.field_205 > -80) {
            field_324[40].method_53(var1, 1, var6, 216 - this.field_205, 0, 0, 0);
         }
      }
   }

   // $VF: renamed from: av () void
   private void method_189() {
      int var1 = field_229;
      class_2 var2 = field_327[2];
      if (this.field_205 + this.field_259 < 1008 && this.field_205 + this.field_259 > 592) {
         var2.field_19 = 240 - this.field_204;
         var2.field_20 = 1008 - this.field_205;
         var2.method_11();
         var2.method_13(this.field_318);
         var2.field_19 = 336 - this.field_204;
         var2.field_20 = 1008 - this.field_205;
         var2.method_11();
         var2.field_23 = 1;
         var2.method_13(this.field_318);
      }

      if (this.field_258 > 10) {
         this.method_190();
      }

      int var5 = this.field_209 * 24 - this.field_179 - this.field_205;
      int var6;
      int var7 = var6 = 168 - this.field_204;
      int var8 = var6 + 240;

      while (var6 <= -24) {
         var6 += 24;
      }

      class_2 var9 = field_327[1];
      if ((this.field_179 >= 816 || var9.field_25 == 2) && this.field_179 > 816) {
         for (int var10 = var5 + 20; var10 < 320; var10 += 24) {
            for (int var11 = var6; var11 < var8; var11 += 24) {
               var9.field_24.method_52(this.field_318, 1, ((var1 >> 1) + var11 + var10) % 2, var11, var10, 0, 0, 0);
            }
         }
      }

      if (var2.field_25 == 2) {
         var9.field_23 = 0;
         var9.field_19 = var7 + 120;
         var9.field_20 = var5;
         var9.method_11();
         var9.method_13(this.field_318);
         var9.field_23 = 1;
         var9.method_13(this.field_318);
         this.method_192();
      }
   }

   // $VF: renamed from: aw () void
   private void method_190() {
      for (byte var1 = 3; var1 < 13; var1 += 2) {
         int var2;
         int var3 = ((var2 = 10 * (2 * var1 / 5 + 1)) + field_229 / var2) * var1 % 240;
         int var4 = 320 / var2 * field_229 % 320;
         this.field_318.drawImage(field_322[27][var1 & 1], var3, var4, 0);
      }
   }

   // $VF: renamed from: ax () void
   private void method_191() {
      if (this.field_192 && this.field_358 == null && this.field_261 == -1) {
         field_324[15].method_52(this.field_318, 0, field_229 >> 1 & 3, this.field_273, this.field_274 - 24, 0, 0, 0);
      }
   }

   // $VF: renamed from: ay () void
   private void method_192() {
      Graphics var1 = this.field_318;
      int var3 = (field_229 << 3) % 160;
      int var2 = (field_229 / 160 & 1) == 0 ? 160 - var3 : 0 + var3;
      var1.setColor(255, var2, 0);
      var1.drawRect(0, 0, 239, 319);
   }

   // $VF: renamed from: az () void
   private void method_193() {
      if (!this.field_342) {
         int var1 = this.field_233;
         int var2 = this.field_234;
         int var3 = field_229;
         int var4 = this.field_236 & 7;
         int var5 = (this.field_236 & 16384) == 0 ? 0 : 3;
         class_2 var6 = field_327[var5];
         boolean var7 = this.method_213();
         int var8 = (this.field_236 & 2048) == 0 ? this.field_295 : this.field_236 & 7;
         if (this.field_103) {
            this.field_273 = var1 * 24 + field_329[var8] * this.field_235 - this.field_204;
            this.field_274 = var2 * 24 + field_329[var8 + 8] * this.field_235 - this.field_205;
            if ((this.field_244 <= 0L || (var3 >> 1 & 1) == 0) && this.field_237 <= 0) {
               var6.field_19 = this.field_273;
               var6.field_20 = this.field_274;
               if (field_505 != null && var7 && var4 != 1 && var4 != 3 && field_505[var1][var2 + 1] != 0 && method_347(var1, var2 + 1)) {
                  int var9;
                  int var10 = (var9 = (var3 >> 1) + var1) % 4;
                  if ((var9 / 4 & 1) == 1) {
                     var10 = 4 - var10;
                  }

                  var6.field_20 += var10;
               }

               var6.method_11();
               var6.method_13(this.field_318);
               int var14 = var6.field_25;
               field_371 = var6.field_25 == 47 && var6.field_26 == 0;
               switch (var14) {
                  case 17:
                  case 18:
                     if (var6.field_26 == 0) {
                        this.field_318.drawImage(field_322[this.field_213][this.field_214], var6.field_19, var6.field_20 - 12, 0);
                     }
                     break;
                  case 40:
                  case 47:
                  case 48:
                     if (var6.field_26 > (var14 == 40 ? 13 : 6) || var14 == 47) {
                        try {
                           byte var16 = 0;
                           if (this.field_213 == 30 || this.field_213 == 31 || this.field_213 == 32) {
                              var16 = -2;
                           }

                           if (field_322[this.field_213] == null) {
                              field_324[method_151(this.field_213)]
                                 .method_53(this.field_318, this.field_214, var6.field_19 + var16, var6.field_20 - 24, 0, 0, 0);
                           } else {
                              this.field_318.drawImage(field_322[this.field_213][this.field_214], var6.field_19 + var16, var6.field_20 - 24, 0);
                           }
                        } catch (Exception var13) {
                        }

                        if (this.field_215 > 0) {
                           method_211(this.field_318, var6.field_19 + 24, var6.field_20 - 10, this.field_215, field_324[0].field_85[0], 0);
                        }
                     }
               }
            }

            if (var7 && field_338[var1][var2] == 0) {
               int var15 = field_337[var1][var2] & 7;
               byte var17 = field_339[var1][var2];

               try {
                  field_324[method_151(1)]
                     .method_53(
                        this.field_318,
                        0 + (field_337[var1][var2] & 56),
                        var1 * 24 - this.field_204 + field_329[var15] * var17,
                        var2 * 24 - this.field_205 + field_329[var15 + 8] * var17,
                        0,
                        0,
                        0
                     );
                  return;
               } catch (Exception var12) {
               }
            }
         }
      }
   }

   // $VF: renamed from: aA () void
   private void method_194() {
      int var1 = this.field_285;
      int var2 = this.field_286;
      int var3 = this.field_286 + 1;
      this.field_277 = 0;
      this.field_278 = 0;
      this.field_281 = false;
      int var4;
      int var6 = (var4 = field_337[var1][var2]) & 7;
      byte var5 = field_339[var1][var2];
      if (var4 == -1) {
         var4 = -1;
      }

      this.field_292 = this.field_292 + var5 * field_329[var6];
      this.field_293 = this.field_293 + var5 * field_329[var6 + 8];
      boolean var7 = field_505 != null && field_505[var1][var2] != 0;
      switch (this.field_287) {
         case 0:
            int var8 = (var4 & 56) >> 3;
            int var9 = (var4 & 28672) >> 12;
            boolean var10 = (var4 & 65536) == 0;
            if (!var7 && var6 == 0 && method_347(var1, var3)) {
               var4 = var4 & -28673 | var9 << 12;
               if (var10) {
                  var4 &= -65537;
               } else {
                  var4 |= 65536;
                  var9 = -var9;
               }

               this.field_292 = var9;
            } else {
               var4 &= -28673;
            }

            field_337[var1][var2] = var4;
            this.field_219 = 1;
            this.field_220 = 0 + var8;
            break;
         case 1:
            this.field_219 = 2;
            this.field_220 = 0 + this.field_296;
            break;
         case 2:
            this.method_198();
            break;
         case 4:
            this.field_219 = 24;
            this.field_220 = 0 + this.field_296;
            break;
         case 5:
            this.field_219 = 25;
            this.field_220 = 0 + this.field_296;
            break;
         case 6:
            this.field_219 = 5;
            this.field_220 = 0;
            break;
         case 7:
            this.field_219 = 5;
            this.field_220 = 1;
            break;
         case 8:
            this.field_219 = 16;
            this.field_220 = 0 + (field_229 >> 1 & 1);
            break;
         case 9:
            field_328 = field_324[(var4 & 264241152) >> 22];
            this.field_290 = 0;
            break;
         case 47:
            field_328 = field_324[30];
            this.field_289 = 0;
            this.field_290 = method_206(field_328, 0, field_229 % method_316(field_328, 0));
      }

      if (var7 || field_505 != null && field_505[var1][var3] != 0 && method_347(var1, var3)) {
         int var22;
         int var23 = (var22 = (field_229 >> 1) + var1) % 4;
         if ((var22 / 4 & 1) == 1) {
            var23 = 4 - var23;
         }

         this.field_293 += var23;
      }

      if ((
            (var4 & 512) != 0
               || field_338[var1 - field_329[var6]][var3] < 0
                  && method_347(var1, var3)
                  && (field_337[var1][var3] & 7) == 0
                  && var1 != this.field_255
                  && var2 != this.field_256
         )
         && (this.field_236 & 8) == 0) {
         this.field_293 += var5 * var5 / 24;
         if (this.field_287 != 9) {
            this.field_292 = this.field_292 + -1 + field_229 % 3;
         }
      }

      if ((var4 & 512) != 0) {
         this.field_292 = -this.field_292;
      }

      if (this.field_287 == 0) {
         this.field_282 = ((var4 & 448) >> 6) - 1;
         if (this.field_282 >= 0 && this.field_282 < 5) {
            this.field_281 = true;
            class_8 var10000;
            byte var10001;
            switch (var4 & 7) {
               case 2:
                  var10000 = this;
                  var10001 = -24;
                  break;
               case 4:
                  var10000 = this;
                  var10001 = 24;
                  break;
               default:
                  var10000 = this;
                  var10001 = 0;
            }

            var10000.field_277 = var10001;
            this.field_278 = 13;
            this.field_279 = this.field_285;
            this.field_280 = this.field_286 - 1;
         }
      }

      this.method_158();
   }

   // $VF: renamed from: aB () void
   private void method_195() {
      int var1 = this.field_285;
      int var2 = this.field_286;
      int var3 = field_337[var1][var2];
      byte var4 = field_339[var1][var2];
      int var5 = var3 & 7;
      this.field_292 = var4 * field_329[var5];
      this.field_293 = var4 * field_329[var5 + 8];
      field_328 = field_324[38];
      int var6;
      class_8 var10000;
      int var10001;
      if (((var6 = (var3 & 28672) >> 12) != 2 && var6 != 4 && var5 != 2 && var5 != 4 || field_338[var1 - 1][var2] < 0 || field_338[var1 + 1][var2] < 0)
         && (var6 != 1 && var6 != 3 && var5 != 1 && var5 != 3 || field_338[var1][var2 - 1] < 0 || field_338[var1][var2 + 1] < 0)) {
         if (var5 != 1 && var5 != 3) {
            var10000 = this;
            var10001 = 0;
         } else {
            var10000 = this;
            var10001 = var5 - 1;
         }

         var10000.field_289 = var10001;
         var10000 = this;
         var10001 = (field_229 >> 1) % field_328.method_49(this.field_289);
      } else {
         this.field_289 = 1;
         var10000 = this;
         var10001 = 0;
      }

      var10000.field_290 = var10001;
      this.method_158();
   }

   // $VF: renamed from: c (byte) void
   private void method_196(byte var1) {
      class_8 var7;
      int var9;
      class_7 var10002;
      int var10003;
      label33: {
         int var2 = field_337[this.field_285][this.field_286];
         byte var3 = field_339[this.field_285][this.field_286];
         int var4 = var2 & 7;
         this.field_292 = var3 * field_329[var4];
         this.field_293 = var3 * field_329[var4 + 8];
         int var5 = var1 == 19 ? 4 : 21;
         field_328 = field_324[var5];
         if (this.field_202 == 1) {
            byte var10001;
            if ((var2 & 248) >> 3 > 0) {
               var7 = this;
               var10001 = 2;
            } else {
               var7 = this;
               var10001 = 0;
            }

            var7.field_289 = var10001;
            var7 = this;
            var9 = field_229;
            var10002 = field_328;
         } else {
            label30: {
               if ((var2 & 248) >> 3 > 0) {
                  var7 = this;
                  var9 = 4;
               } else {
                  this.field_289 = var4 - 1;
                  if (this.field_289 >= 0) {
                     break label30;
                  }

                  var7 = this;
                  var9 = ((var2 & 28672) >> 12) - 1;
               }

               var7.field_289 = var9;
            }

            var7 = this;
            var9 = field_229 >> 1;
            var10002 = field_328;
            if (this.field_289 < 0) {
               var10003 = 0;
               break label33;
            }
         }

         var10003 = this.field_289;
      }

      var7.field_290 = var9 % var10002.method_49(var10003);
      this.method_158();
   }

   // $VF: renamed from: aC () void
   private void method_197() {
      label44: {
         int var1 = this.field_285;
         int var2 = this.field_286;
         this.field_217 = 26;
         this.field_218 = 0;
         class_8 var10000;
         int var10001;
         if (method_347(var1, var2) && field_339[var1][var2] <= 12) {
            var10000 = this;
            var10001 = -(field_339[var1][var2] - 12);
         } else if (this.method_301(var1, var2)) {
            if ((this.field_236 & 4096) == 0) {
               if (this.field_235 > 12) {
                  break label44;
               }

               var10000 = this;
               var10001 = -(this.field_235 - 12);
            } else {
               var10000 = this;
               var10001 = 12;
            }
         } else {
            if (this.method_301(var1 - 1, var2)
               ? this.field_295 != 4 || this.field_235 <= 12
               : !this.method_301(var1 + 1, var2) || this.field_295 != 2 || this.field_235 <= 12) {
               break label44;
            }

            var10000 = this;
            var10001 = this.field_235 - 12;
         }

         var10000.field_293 = var10001;
      }

      this.field_293 += 24;
      this.field_294 = 36;
   }

   // $VF: renamed from: aD () void
   private void method_198() {
      int var1 = field_336[this.field_285][this.field_286] & 0xFF;
      int var2 = field_336[this.field_285][this.field_286] >> 8;
      if (var1 != 14 && var1 != 33 || var2 > 11) {
         this.field_219 = 3;
         this.field_220 = 0 + this.field_296;
         class_8 var10000;
         class_7[] var10001;
         byte var10002;
         if (var1 == 14) {
            var10000 = this;
            var10001 = field_324;
            var10002 = 8;
         } else {
            if (var1 != 33) {
               return;
            }

            var10000 = this;
            var10001 = field_324;
            var10002 = 22;
         }

         var10000.field_293 = -(var10001[var10002].method_49(0) - var2);
      }
   }

   // $VF: renamed from: aE () void
   private void method_199() {
      int var1 = this.field_285;
      int var2 = this.field_286;
      this.field_219 = 6;
      int var3;
      if ((var3 = (field_337[var1][var2] & 3840) >> 8) >= 4) {
         this.field_219 = -1;
      } else {
         class_8 var10000;
         int var10001;
         if (var3 == 0) {
            var10000 = this;
            var10001 = 0 + (field_229 >> 1) % 3;
         } else {
            var10000 = this;
            var10001 = 3 + var3 - 1;
         }

         var10000.field_220 = var10001;
         int var4 = field_337[var1][var2] & 7;
         this.field_292 = field_339[var1][var2] * field_329[var4] + 2;
         this.field_293 = field_339[var1][var2] * field_329[var4 + 8] + 2;
         if ((field_337[var1][var2] & 16) == 0) {
            switch (var4) {
               case 1:
                  this.field_292 += 4;
                  return;
               case 2:
                  var10000 = this;
                  var10001 = this.field_293 + 4;
                  break;
               case 3:
                  this.field_292 -= 4;
                  return;
               case 4:
                  var10000 = this;
                  var10001 = this.field_293 - 4;
                  break;
               default:
                  return;
            }

            var10000.field_293 = var10001;
         } else {
            switch (var4) {
               case 1:
                  this.field_292 -= 4;
                  return;
               case 2:
                  var10000 = this;
                  var10001 = this.field_293 - 4;
                  break;
               case 3:
                  this.field_292 += 4;
                  return;
               case 4:
                  var10000 = this;
                  var10001 = this.field_293 + 4;
                  break;
               default:
                  return;
            }

            var10000.field_293 = var10001;
         }
      }
   }

   // $VF: renamed from: aF () void
   private void method_200() {
      this.field_318.setColor(13883367);
      byte var3 = field_339[this.field_285][this.field_286];
      int var1;
      int var2;
      class_8 var10000;
      byte var10001;
      if ((field_337[this.field_285][this.field_286] & 1) != 0) {
         var1 = this.field_275;
         var2 = this.field_275 + 24 - var3;
         var10000 = this;
         var10001 = 0;
      } else {
         var1 = this.field_275 + 24;
         var2 = this.field_275 + var3;
         var10000 = this;
         var10001 = 1;
      }

      var10000.field_290 = var10001;
      this.field_318.drawLine(var1, this.field_276 + 12, var2, this.field_276 + 12);
      if (var3 > 0) {
         field_327[0].field_24.method_55(this.field_318, this.field_290, var2, this.field_276 + 12 - 2, 0);
      }
   }

   // $VF: renamed from: aG () void
   private void method_201() {
      int var1 = field_336[this.field_285][this.field_286] >> 8;
      this.field_217 = this.field_288 == 9 ? 22 : 23;
      class_8 var10000;
      byte var10001;
      if ((var1 & 512) != 0) {
         var10000 = this;
         if (this.field_288 == 9) {
         }

         var10001 = (byte)(1 + (field_229 >> 2) % 6);
      } else if ((var1 & 256) != 0) {
         var10000 = this;
         var10001 = 1;
      } else {
         var10000 = this;
         var10001 = 0;
      }

      var10000.field_218 = var10001;
   }

   // $VF: renamed from: aH () void
   private void method_202() {
      int var1 = this.field_285;
      int var2 = this.field_286;
      int var4;
      if ((var4 = ((field_336[var1][var2] >> 8 & 240) >> 4) - 1) < 0) {
         var4 = 0;
      }

      if ((field_336[var1][var2 - 1] & 0xFF) != 9 && (field_336[var1][var2 - 1] & 0xFF) != 8) {
         field_324[56].method_53(this.field_318, var4, this.field_275, this.field_276, 0, 0, 0);
      }

      this.field_217 = 4;
      this.field_218 = (byte)(var4 + 3);
   }

   // $VF: renamed from: aI () void
   private void method_203() {
      int var1 = field_229;
      int var2 = field_337[this.field_285][this.field_286];
      byte var3;
      if ((var3 = field_339[this.field_285][this.field_286]) > 24) {
         var3 = 24;
      }

      int var4 = var2 & 7;
      this.field_292 = var3 * field_329[var4];
      this.field_293 = var3 * field_329[var4 + 8];
      if ((var2 & 8) == 0) {
         this.field_219 = 10;
         this.field_220 = (var1 >> 1) % 3;
         if (var4 != 3) {
            int var5 = (var1 >> 1) % 5;
            this.field_318.drawImage(field_322[10][3 + var5], this.field_275 + this.field_292 - var5 * 4, this.field_276 + this.field_293 + 24, 36);
            return;
         }
      } else {
         this.field_219 = 10;
         this.field_220 = 2 - (var1 >> 1) % 3;
         if (var4 != 3) {
            int var6 = (var1 >> 1) % 5;
            this.field_318.drawImage(field_322[10][8 + var6], this.field_275 + 24 - 12 + this.field_292 + var6 * 3, this.field_276 + this.field_293 + 24, 36);
            if ((var1 >> 1 & 1) == 0 && field_338[this.field_285 - 1][this.field_286] >= 0) {
               this.field_292--;
               this.field_293++;
            }
         }
      }
   }

   // $VF: renamed from: aJ () void
   private void method_204() {
      if (field_338[this.field_285][this.field_286 + 1] != 16) {
         int var1 = field_337[this.field_285][this.field_286];
         class_7 var2;
         field_328 = var2 = field_324[1];
         byte var3 = field_339[this.field_285][this.field_286];
         int var4 = 36 - var3;
         int var5 = 0;
         this.field_289 = (var1 & 7) == 4 ? 1 : 0;
         if (var3 != 0) {
            for (int var6 = 0; var4 > 0; var5 = var6++) {
               var4 -= var2.method_48(this.field_289, var6);
            }
         }

         this.field_290 = var5;
         int var7 = (var2.field_75[this.field_289] + var5) * 5;
         this.field_292 = var2.field_76[var7 + 2];
      }
   }

   // $VF: renamed from: aK () void
   private void method_205() {
      int var1 = field_337[this.field_285][this.field_286];
      field_328 = field_324[28];
      this.field_289 = var1 & 15;
      int var2 = (field_337[this.field_285][this.field_286] & 2088960) >> 13;
      if (this.field_289 == 10) {
         int var3 = var2;
         int var4 = 0;
         int var6 = field_328.method_49(this.field_289);
         int var10000 = 0;

         while (true) {
            int var5 = var10000;
            if (var3 <= 0) {
               this.field_290 = var4;
               break;
            }

            var3 -= field_328.method_48(this.field_289, var5);
            var4 = var5;
            var10000 = (var5 + 1) % var6;
         }
      } else {
         int var7 = method_206(field_328, this.field_289, var2);
         this.field_290 = var7;
         int var8 = (field_328.field_75[this.field_289] + var7) * 5;
         this.field_292 = field_328.field_76[var8 + 2];
         this.field_293 = field_328.field_76[var8 + 3];
      }

      this.method_158();
   }

   // $VF: renamed from: a (a, int, int) int
   private static int method_206(class_7 var0, int var1, int var2) {
      int var3 = 0;

      for (int var4 = 0; var2 > 0; var3 = var4++) {
         var2 -= var0.method_48(var1, var4);
      }

      return var3;
   }

   // $VF: renamed from: b (a, int, int) int
   private static int method_207(class_7 var0, int var1, int var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var2; var4++) {
         var3 += var0.method_48(var1, var4);
      }

      return var3;
   }

   // $VF: renamed from: aL () void
   private void method_208() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      field_340[var1][var2] = 24;
      int var3 = (field_337[var1][var2] & 7168) >> 10;
      int var4 = field_337[var1][var2] & 15;
      int var5 = 0;
      boolean var6 = (field_336[var1][var2] & 0xFF) == 35;
      if (var4 == 10) {
         var5 = 100;
      } else {
         int var7 = field_324[28].method_49(var4);

         for (int var8 = 0; var8 < var7; var8++) {
            var5 += field_324[28].method_48(var4, var8);
         }
      }

      int var16 = (field_337[var1][var2] & 2088960) >> 13;
      field_337[var1][var2] = field_337[var1][var2] & -2088961 | ++var16 << 13;
      byte[] var10000;
      int var10001;
      byte var10002;
      if (var4 >= 4 && var4 <= 9) {
         var10000 = field_339[var1];
         var10001 = var2;
         var10002 = 12;
      } else {
         var10000 = field_339[var1];
         var10001 = var2;
         var10002 = 0;
      }

      var10000[var10001] = var10002;
      if (var16 > var5 >> 1) {
         if (!var6) {
            if (this.method_301(var1, var2) && var4 != 10) {
               byte var21;
               switch (var4) {
                  case 4:
                  case 5:
                     var21 = 1;
                     break;
                  case 6:
                     var21 = 2;
                     break;
                  case 7:
                  case 8:
                     var21 = 3;
                     break;
                  case 9:
                     var21 = 4;
                     break;
                  default:
                     var21 = field_330[this.field_236 & 7];
               }

               byte var18 = var21;
               this.method_63(1, 48, var18);
            }

            if (this.method_346(var1, var2)) {
               field_338[var1][var2] = -1;
               this.method_338(var1, var2);
               return;
            }
         }

         if (var16 >= var5) {
            method_348(var1, var2);
            int var10 = this.method_327(var1, var2, this.field_233, this.field_234, true);
            boolean var11 = false;
            switch (var4) {
               case 0:
               case 3:
               case 4:
               case 7:
               case 9:
                  var11 = true;
               case 1:
               case 2:
               case 5:
               case 6:
               case 8:
               default:
                  boolean var12 = var10 == 4;
                  int var9;
                  int var13;
                  int var14;
                  if (var11 != var12) {
                     var9 = var12 ? 3 : 2;
                     var13 = var1;
                     var14 = var2;
                  } else {
                     label156: {
                        var13 = var1 - field_329[var10];
                        var14 = var2 - field_329[8 + var10];
                        byte var22;
                        if (var12) {
                           if (this.method_301(var13, var14) && var4 != 0) {
                              var9 = 0;
                              var13 = var1;
                              var14 = var2;
                              break label156;
                           }

                           switch (var10) {
                              case 1:
                                 var22 = 4;
                                 break;
                              case 2:
                              default:
                                 var22 = 0;
                                 break;
                              case 3:
                                 var22 = 7;
                                 break;
                              case 4:
                                 var22 = 9;
                           }
                        } else {
                           if (this.method_301(var13, var14) && var4 != 1) {
                              var9 = 1;
                              var13 = var1;
                              var14 = var2;
                              break label156;
                           }

                           switch (var10) {
                              case 1:
                                 var22 = 5;
                                 break;
                              case 2:
                                 var22 = 6;
                                 break;
                              case 3:
                                 var22 = 8;
                                 break;
                              default:
                                 var22 = 1;
                           }
                        }

                        var9 = var22;
                     }
                  }

                  if (field_338[var13][var14] >= 0 || var6) {
                     if (var13 != var1 || var14 != var2) {
                        var9 = 0;
                     }

                     var13 = var1;
                     var14 = var2;
                  }

                  field_338[var1][var2] = -1;
                  field_339[var13][var14] = 0;
                  field_337[var13][var14] = var3 << 10 | var9;
                  field_337[var13][var14] = field_337[var13][var14] & -2088961;
                  field_338[var13][var14] = 45;
            }
         }
      }

      if (var6) {
         if (!this.method_301(var1, var2) || var4 == 10) {
            return;
         }
      } else {
         int var19 = var1;
         int var20 = var2;
         switch (var4) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
               break;
            case 4:
            case 5:
               var20++;
               break;
            case 6:
               var19--;
               break;
            case 7:
            case 8:
               var20--;
               break;
            case 9:
               var19++;
               break;
            case 10:
               var19 = -1;
               var20 = -1;
         }

         if (!this.method_301(var19, var20)) {
            return;
         }
      }

      this.method_63(1, 48, field_330[this.field_236 & 7]);
   }

   // $VF: renamed from: aM () void
   private void method_209() {
      byte var1 = -1;
      byte var2 = 3;
      int var3;
      if (((var3 = field_337[this.field_285][this.field_286]) & 7) == 3) {
         var1 = 1;
         var2 = 0;
      }

      int var4;
      int var10000;
      if ((var3 & 8) == 0) {
         var4 = this.field_222;
         var10000 = this.field_221;
      } else {
         var4 = this.field_224;
         var10000 = this.field_223;
      }

      int var5 = var10000;

      for (int var6 = 0; var6 < var4; var6++) {
         field_324[11].method_53(this.field_318, var2 + var6 * var1, this.field_275 + 3, this.field_276 + var1 * (var5 - var6 * 24), 0, 0, 0);
      }

      class_7 var7;
      Graphics var10001;
      int var10002;
      int var10003;
      int var10004;
      if (var1 == 1) {
         var7 = field_324[42];
         var10001 = this.field_318;
         var10002 = field_338[this.field_285][this.field_286 - 1] - 80;
         var10003 = this.field_275;
         var10004 = this.field_276 - 24;
      } else {
         var7 = field_324[42];
         var10001 = this.field_318;
         var10002 = field_338[this.field_285][this.field_286 + 1] - 80;
         var10003 = this.field_275;
         var10004 = this.field_276 + 24;
      }

      var7.method_53(var10001, var10002, var10003, var10004, 0, 0, 0);
   }

   // $VF: renamed from: aN () void
   private void method_210() {
      class_2 var1 = field_327[0];
      this.field_318.setColor(0);
      this.field_318.fillRect(0, 0, 240, 320);
      var1.field_20 = 136;
      int var3 = 0;
      if (field_229 > 30) {
         var1.field_19 = 139;
         var1.method_10(1);
         int var4;
         if ((var4 = (field_229 - 30) * 4) > 29) {
            var4 = 29;
            class_7 var10000;
            Graphics var10001;
            byte var10002;
            short var10003;
            int var10004;
            if (field_229 < 42) {
               int var5 = 42 - field_229;
               var3 = 0 + var5 * var5 % ((var5 >> 1) + 1);
               var10000 = var1.field_24;
               var10001 = this.field_318;
               var10002 = 10;
               var10003 = 138;
               var10004 = 136 + var3;
            } else {
               var10000 = var1.field_24;
               var10001 = this.field_318;
               var10002 = 4;
               var10003 = 138;
               var10004 = 136;
            }

            var10000.method_53(var10001, var10002, var10003, var10004, 0, 0, 0);
            var1.field_26 = 0;
         } else {
            var1.field_24.method_53(this.field_318, 10, 138, 136, 0, 0, 0);
         }

         var1.field_20 = 136 + var4;
      } else {
         var1.field_19 = field_229 * 4 - 1 + 18;
      }

      var1.field_20 += var3;
      var1.method_13(this.field_318);
      var1.field_24.method_53(this.field_318, 5, 138, 160 + var3, 0, 0, 0);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, javax.microedition.lcdui.Image[], int) void
   private static void method_211(Graphics var0, int var1, int var2, int var3, Image[] var4, int var5) {
      if (var3 == 0) {
         Image var8 = field_324[0].field_85[0][0];
         var0.drawImage(var8, var1, var2, 24);
      } else {
         while (var3 > 0) {
            int var6 = var3 % 10;
            var3 /= 10;
            Image var7 = var4[var6 + var5];
            var1 -= var7.getWidth();
            var0.drawImage(var7, var1, var2, 0);
         }
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, java.lang.String, javax.microedition.lcdui.Image[], int) void
   private static void method_212(Graphics var0, int var1, int var2, String var3, Image[] var4, int var5) {
      for (int var8 = var3.length() - 1; var8 >= 0; var8--) {
         char var7;
         if ((var7 = var3.charAt(var8)) == '/') {
            var7 = ':';
         }

         var7 = (char)(var7 - '0');
         Image var6 = var4[var7 + var5];
         var0.drawImage(var6, var1, var2, 24);
         var1 -= var6.getWidth();
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_213() {
      return this.field_233 > 0 && this.field_233 < this.field_208 - 1 && this.field_234 > 0 && this.field_234 < this.field_209 - 1;
   }

   // $VF: renamed from: n (int) void
   private void method_214(int var1) {
      int var2 = field_327[0].field_25;
      if (field_327[0].field_25 != 19 && (this.field_236 & 16384) == 0 && (this.field_236 & 2048) == 0) {
         if (this.method_213()) {
            int var3;
            if ((var3 = field_505 == null ? 0 : method_376(field_505[this.field_233][this.field_234], (byte)0, (byte)3, (byte)4)) != 8 && var3 != 7) {
               label49:
               if (field_338[this.field_233][this.field_234 + 1] < 0 || field_338[this.field_233][this.field_234 + 1] == 14) {
                  byte var10000;
                  switch (var1) {
                     case 0:
                        var10000 = 0;
                        break;
                     case 1:
                        var10000 = 35;
                        break;
                     case 2:
                        var10000 = 2;
                        break;
                     case 3:
                        var10000 = 34;
                        break;
                     case 4:
                     case 5:
                     case 6:
                     case 7:
                     case 8:
                     case 9:
                     case 10:
                     case 11:
                     case 12:
                     case 13:
                     case 15:
                     case 17:
                     case 18:
                     case 19:
                     case 24:
                     case 25:
                     case 26:
                     case 27:
                     case 28:
                     case 29:
                     case 30:
                     case 31:
                     case 32:
                     case 33:
                     case 34:
                     case 35:
                     case 36:
                     case 37:
                     case 38:
                     case 39:
                     case 40:
                     case 41:
                     case 43:
                     default:
                        break label49;
                     case 14:
                        var10000 = 28;
                        break;
                     case 16:
                        var10000 = 29;
                        break;
                     case 20:
                        var10000 = 30;
                        break;
                     case 21:
                        var10000 = 32;
                        break;
                     case 22:
                        var10000 = 31;
                        break;
                     case 23:
                        var10000 = 33;
                        break;
                     case 42:
                        var10000 = 46;
                        break;
                     case 44:
                        var10000 = 45;
                  }

                  var1 = var10000;
               }
            } else {
               switch (var1) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  case 11:
                  case 24:
                  case 25:
                  case 26:
                  case 27:
                     var1 = 36 + (this.field_236 & 7) - 1;
                  case 10:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 20:
                  case 21:
                  case 22:
                  case 23:
               }
            }
         }

         if (var1 == 1000) {
            field_327[3].method_10(0);
            this.field_236 |= 16384;
         } else {
            field_327[0].method_10(var1);
         }

         if (var2 != var1) {
            this.field_197 = 70;
         }
      }
   }

   // $VF: renamed from: aO () void
   private void method_215() {
      if (method_66(32944)) {
         field_171 = 0;
         this.field_562 = true;
         this.method_217(this.field_100);
      } else if (method_66(64)) {
         field_171 = 0;
         field_225 = 27;
         this.field_562 = true;
         this.field_113 = true;
         field_171 = 0;
      } else {
         label24: {
            class_8 var10000;
            byte var10001;
            if (method_66(4097)) {
               var10000 = this;
               var10001 = -1;
            } else {
               if (!method_66(262146)) {
                  break label24;
               }

               var10000 = this;
               var10001 = 1;
            }

            var10000.method_218(var10001);
         }

         field_171 = 0;
         class_8 var2;
         String[] var3;
         byte var10002;
         if (method_216(this.field_100) == 0) {
            this.field_101 = -1;
            var2 = this;
            var3 = field_569;
            var10002 = 81;
         } else {
            this.field_101 = class_0.field_0[this.field_100];
            this.field_561.delete(0, this.field_561.length());
            this.field_561.append(this.field_101);
            var2 = this;
            var3 = field_569;
            var10002 = 90;
         }

         var2.field_102 = var3[var10002];
         this.field_562 = true;
      }
   }

   // $VF: renamed from: f (int) int
   private static int method_216(int var0) {
      byte var1;
      if ((var1 = field_334[8]) >= 4 + var0 + 1) {
         return 0;
      } else {
         return method_246(field_334, 4) < class_0.field_0[var0] ? -1 : 1;
      }
   }

   // $VF: renamed from: o (int) void
   private void method_217(int var1) {
      this.field_559 = -1;
      switch (method_216(var1)) {
         case -1:
            this.field_102 = field_569[89];
            return;
         case 0:
            this.field_102 = field_569[81];
            return;
         case 1:
            this.field_247 = method_246(field_334, 4) - class_0.field_0[this.field_100];
            this.field_560 = null;
            System.gc();
            this.field_560 = field_569[110] + " " + this.field_247 + " " + field_569[109];
            field_334[4] = (byte)(this.field_247 & 0xFF);
            field_334[5] = (byte)(this.field_247 >> 8 & 0xFF);
            field_334[8] = (byte)(4 + var1 + 1);
            this.method_112();
            this.field_101 = -1;
            this.field_102 = field_569[81];
            this.field_440 = true;
            this.method_440(field_569[91], -1, -1, 5000, 4273165, 0);
      }
   }

   // $VF: renamed from: p (int) void
   private void method_218(int var1) {
      this.field_100 += var1;
      if (this.field_100 < 0) {
         this.field_100 = 3;
      }

      if (this.field_100 == 4) {
         this.field_100 = 0;
      }
   }

   // $VF: renamed from: aP () void
   private void method_219() {
      if (method_66(64)) {
         field_225 = 4;
         this.method_65(4);
      }

      field_171 = 0;
   }

   // $VF: renamed from: aQ () void
   private void method_220() {
      if (field_171 == 0) {
         this.field_199 = 0;
      } else if (method_442()) {
         this.method_441(true);
         field_171 = 0;
      } else {
         label91: {
            byte var10000;
            label90: {
               switch (field_225) {
                  case 1:
                     if (this.field_125 || this.field_466) {
                        field_171 = 0;
                     }

                     field_227 = field_225;
                     this.method_223();
                     this.method_230();
                     break label91;
                  case 2:
                  case 7:
                  case 32:
                     this.method_231();
                  case 3:
                  case 5:
                  case 6:
                  case 8:
                  case 9:
                  case 10:
                  case 11:
                  case 13:
                  case 14:
                  case 16:
                  case 18:
                  case 19:
                  case 21:
                  case 22:
                  case 23:
                  case 28:
                  case 29:
                  default:
                     break label91;
                  case 4:
                     this.method_231();
                     break label91;
                  case 12:
                     this.method_229();
                     break label91;
                  case 15:
                     this.method_427();
                     break label91;
                  case 17:
                  case 20:
                     if (!method_66(32944)) {
                        break label91;
                     }

                     if (this.field_226 == 5) {
                        this.method_256();
                        this.method_97();
                     }

                     this.field_228 = true;
                     break;
                  case 24:
                     this.method_226();
                     break label91;
                  case 25:
                     this.method_215();
                     break label91;
                  case 26:
                     this.method_219();
                     break label91;
                  case 27:
                     field_227 = field_225;
                     this.method_223();
                     this.method_224();
                     break label91;
                  case 30:
                     if (!method_66(32784)) {
                        break label91;
                     }

                     field_225 = 4;
                     if (this.field_266 == -1) {
                        this.field_226 = 0;
                        this.method_65(0);
                     } else {
                        this.field_226 = 2;
                     }

                     var10000 = 0;
                     break label90;
                  case 31:
                     if (method_66(64)) {
                        this.field_270 = 0;
                        this.field_269 = 8;
                        field_225 = 9;
                        this.method_65(-1);
                     } else if (method_66(32944)) {
                        this.method_221();
                     }
                     break;
                  case 33:
                     this.method_222();
                     break label91;
                  case 34:
                     this.method_228();
                     break label91;
               }

               var10000 = 0;
            }

            field_171 = var10000;
         }

         if (!this.field_99) {
            if ((this.field_236 & 7) != 0) {
               this.field_97 = 10;
            }
         }
      }
   }

   // $VF: renamed from: aR () void
   private void method_221() {
      this.field_333 = true;
      field_225 = 16;
      this.field_270 = 0;
      this.field_269 = 6;
      this.field_201 = 0;
      this.field_249 = 0;
      this.field_247 = 0;
      this.field_182 = false;
      this.field_170 = 0;
      field_537 = 0;
   }

   // $VF: renamed from: aS () void
   private void method_222() {
      if (method_66(64)) {
         if (this.field_266 == 0) {
            field_225 = 4;
            this.method_65(0);
            this.field_357.method_7(19);
         }

         if (this.field_266 == 1) {
            field_225 = 2;
            field_434 = true;
            this.field_173 = true;
            this.method_65(1);
         }
      }
   }

   // $VF: renamed from: aT () void
   private void method_223() {
      if (field_444 < field_445.length && method_66(field_445[field_444])) {
         field_171 = 0;
         field_444++;
         if (field_444 == field_445.length) {
            field_171 = 0;
            field_225 = 24;
            this.field_393 = field_334[8];
            this.field_394 = field_334[9];
            this.field_395 = false;
            this.field_396 = false;
            return;
         }
      } else {
         byte var10000;
         if (method_66(field_445[0])) {
            field_171 = 0;
            var10000 = 1;
         } else {
            var10000 = 0;
         }

         field_444 = var10000;
      }
   }

   // $VF: renamed from: aU () void
   private void method_224() {
      if (this.field_126 == -1 && this.field_121 == 0) {
         label30: {
            class_8 var10000;
            byte var10001;
            if (method_66(32944)) {
               var10000 = this;
               var10001 = 4;
            } else {
               if (method_66(64)) {
                  this.method_97();
                  field_225 = 9;
                  this.field_269 = 8;
                  this.method_65(-1);
                  this.field_270 = 0;
                  break label30;
               }

               if (method_66(4097)) {
                  var10000 = this;
                  var10001 = 0;
               } else if (method_66(262146)) {
                  var10000 = this;
                  var10001 = 2;
               } else if (method_66(16388)) {
                  var10000 = this;
                  var10001 = 3;
               } else {
                  if (!method_66(65544)) {
                     break label30;
                  }

                  var10000 = this;
                  var10001 = 1;
               }
            }

            var10000.field_111 = var10001;
         }

         field_171 = 0;
      } else {
         field_171 = 0;
      }
   }

   // $VF: renamed from: aV () void
   private void method_225() {
      if (this.field_202 == 0 && this.field_203 == 13) {
         this.field_358 = null;
         this.field_233 = 60;
         this.field_234 = 3;
      } else {
         this.field_556 = method_66(524288);
         this.field_313 = !this.field_556;
         this.field_251 = 0;
         this.field_250 = 0;
         this.field_241 = true;
         this.field_233 = this.field_208 + 5 + 1;
      }
   }

   // $VF: renamed from: aW () void
   private void method_226() {
      boolean var1 = false;
      if (method_66(512)) {
         this.field_441 = !this.field_441;
      } else if (method_66(65536)) {
         this.field_247 += 50;
      } else if (method_66(131072)) {
         this.field_249 += 5;
      } else if (method_66(262144)) {
         if (field_227 != 1) {
            label79: {
               this.field_394 <<= 1;
               class_8 var10000;
               byte var10001;
               if (this.field_394 == 0) {
                  var10000 = this;
                  var10001 = 1;
               } else {
                  if (this.field_394 <= 8) {
                     break label79;
                  }

                  var10000 = this;
                  var10001 = 0;
               }

               var10000.field_394 = var10001;
            }

            if (this.field_394 > 2) {
               field_334[10] = 1;
            } else {
               field_334[10] = 0;
            }
         }
      } else if (method_66(524288)) {
         this.field_395 = !this.field_395;
      } else if (method_66(32768)) {
         field_225 = 34;
      } else if (method_66(1024)) {
         this.field_396 = !this.field_396;
      } else {
         label113: {
            if (!method_66(64)) {
               if (!method_66(32944)) {
                  break label113;
               }

               field_334[8] = (byte)this.field_393;
               field_334[9] = (byte)this.field_394;
               if (this.field_395 || this.field_396) {
                  for (int var2 = 0; var2 <= 2; var2++) {
                     int var3 = this.method_124(var2);
                     if (var2 == 2) {
                        var3++;
                     }

                     for (int var4 = 0; var4 <= var3; var4++) {
                        this.method_119(var2, var4, (byte)2);
                        this.method_119(var2, var4, (byte)64);
                     }

                     this.method_120(var2, var3);
                  }

                  if (this.field_396) {
                     for (int var5 = 0; var5 <= 2; var5++) {
                        int var6 = this.method_123(var5);
                        if (var5 == 0) {
                           var6--;
                        }

                        for (int var7 = this.method_124(var5); var7 < var6; var7++) {
                           this.method_119(var5, var7, (byte)2);
                           this.method_119(var5, var7, (byte)64);
                        }

                        this.method_120(var5, var6 - 1);
                     }
                  }
               }

               this.method_250();
               this.method_251();
               this.method_112();
            }

            var1 = true;
         }
      }

      if (var1) {
         this.method_227();
      }

      field_171 = 0;
   }

   // $VF: renamed from: aX () void
   private void method_227() {
      field_225 = field_227;
      if (field_227 == 27) {
         this.field_562 = true;
         this.field_113 = true;
      } else if (field_227 == 1) {
         this.method_98();
      }

      field_171 = 0;
   }

   // $VF: renamed from: aY () void
   private void method_228() {
      byte var1 = 0;
      int var2 = 0;
      if (method_66(33008)) {
         this.method_227();
         method_96(field_325, true);
         field_325 = null;
      }

      if (method_66(4097)) {
         this.field_442--;
         if (this.field_442 < 0) {
            this.field_442 = 0;
         }
      }

      if (method_66(262146)) {
         this.field_442++;
         if (this.field_442 >= 2) {
            this.field_442 = 1;
         }
      }

      var2 = this.field_443[this.field_442];
      if (method_66(16388)) {
         var2--;
      }

      if (method_66(65544)) {
         var2++;
      }

      if (var2 < 0) {
         var2 = 0;
      }

      label35: {
         byte var10000;
         switch (this.field_442) {
            case 0:
               var10000 = 115;
               break;
            case 1:
               var10000 = 9;
               break;
            default:
               break label35;
         }

         var1 = var10000;
      }

      if (var2 >= var1) {
         var2 = var1 - 1;
      }

      this.field_443[this.field_442] = var2;
      field_171 = 0;
   }

   // $VF: renamed from: aZ () void
   private void method_229() {
      if (method_66(32944)) {
         this.field_201 = 5;
         field_334[3] = (byte)this.field_201;
         if (this.field_177 == 2) {
            this.method_88();
         } else {
            method_248(4, -500);
            field_225 = 15;
            this.field_379 = true;
            this.field_377 = true;
            this.method_411();
         }
      }
   }

   // $VF: renamed from: ba () void
   private void method_230() {
      if (cheatGodMode && this.field_242 < 8) {
         this.field_242 = (byte)(field_334 != null && field_334[8] > 0 ? field_334[8] : 8);
      }
      if (this.field_441 && (method_66(524288) || method_66(131072))) {
         this.method_225();
      }

      if ((this.field_346 == 0 || method_66(32944))
         && this.field_198 == 0
         && !this.field_241
         && this.field_242 > 0
         && field_327[0].field_25 != 19
         && !this.field_342) {
         if (this.field_358 != null) {
            if (method_66(32784)) {
               this.field_358.method_27();
            } else if (method_66(32944)) {
               this.field_358.field_55 = true;
            }

            field_171 = 0;
         } else {
            if (this.field_237 > 0) {
               boolean var1 = true;
               if (method_66(4097)) {
                  this.field_194 = -5;
               } else if (method_66(262146)) {
                  this.field_194 = 5;
               } else if (method_66(16388)) {
                  this.field_193 = -5;
               } else if (method_66(65544)) {
                  this.field_193 = 5;
               } else if (!method_66(32784)) {
                  if (method_66(32944)) {
                     this.method_293();
                     field_171 = 0;
                  } else {
                     var1 = false;
                  }
               }

               if (var1) {
                  this.field_237--;
                  if (this.field_237 == 0) {
                     if ((byte)(field_336[this.field_233][this.field_234] & 0xFF) < 0) {
                        field_336[this.field_233][this.field_234] = 32;
                     }

                     if (field_338[this.field_233][this.field_234] == 9) {
                        field_338[this.field_233][this.field_234] = -1;
                     }

                     this.field_244 = 40L;
                     this.field_235 = 0;
                     this.field_236 = this.field_236 & -113 | 0;
                     this.method_214(this.method_264());
                  }

                  field_171 = 0;
                  return;
               }
            } else {
               if (method_66(4097)) {
                  this.field_199 = 1;
               } else if (method_66(262146)) {
                  this.field_199 = 3;
               } else if (method_66(16388)) {
                  this.field_199 = 4;
               } else if (method_66(65544)) {
                  this.field_199 = 2;
               } else if (!method_66(32784)) {
                  if (method_66(256)) {
                     this.field_211 = -1;
                     int var22 = field_327[0].field_25;
                     if (field_327[0].field_25 == 36 + (this.field_236 & 7) - 1) {
                        if ((field_336[this.field_233][this.field_234] & 0xFF) == 4) {
                           this.method_350();
                        } else {
                           this.method_436(2);
                           this.method_214(19);
                        }
                     }

                     switch (var22) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 34:
                        case 35:
                           if ((field_336[this.field_233][this.field_234] & 0xFF) == 4) {
                              this.method_350();
                           } else {
                              this.method_436(2);
                              this.method_214(19);
                           }
                     }
                  } else if (method_66(32944)) {
                     this.method_293();
                     field_171 = 0;
                  }
               } else {
                  field_171 = 0;
                  if (this.field_297 == this.field_233 && this.field_298 == this.field_234 && (field_336[this.field_233][this.field_234] & 0xFF) == 4) {
                     this.method_436(9);
                     this.method_350();
                  } else {
                     int var21;
                     if ((var21 = field_505 == null ? 0 : method_376(field_505[this.field_233][this.field_234], (byte)0, (byte)3, (byte)4)) != 8 && var21 != 7) {
                        int var2 = this.field_236 & 7;
                        int var3 = -1;
                        byte var4 = -1;
                        boolean var5 = false;
                        if (field_334[9] >= 2) {
                           int var6 = 0;

                           for (int var7 = 0; var7 < 2; var7++) {
                              byte var8;
                              if ((var8 = (byte)(var7 == 0 ? 1 : -1)) > 0 && this.field_233 < this.field_208 - 3 || var8 < 0 && this.field_233 > 3) {
                                 for (int var9 = 1; var9 <= 3; var9++) {
                                    int var26;
                                    label451: {
                                       int var10 = this.field_233 + var8 * var9;
                                       byte var11 = field_338[var10][this.field_234];
                                       if ((field_336[var10][this.field_234] & 0xFF) != 7 || (field_336[var10][this.field_234] >> 8 & 240) != 0) {
                                          if (var11 == 48 && (field_337[var10][this.field_234] & 8) != 0) {
                                             continue;
                                          }

                                          switch (var11) {
                                             case -1:
                                                continue;
                                             case 11:
                                             case 19:
                                             case 43:
                                                label350: {
                                                   byte var10001;
                                                   if (var8 > 0) {
                                                      var26 = var6;
                                                      var10001 = 2;
                                                   } else {
                                                      if (var8 >= 0) {
                                                         break label350;
                                                      }

                                                      var26 = var6;
                                                      var10001 = 4;
                                                   }

                                                   var6 = var26 | var10001;
                                                }
                                             case 0:
                                             case 1:
                                             case 8:
                                             case 9:
                                             case 14:
                                             case 47:
                                             case 48:
                                                if (var9 == 1) {
                                                   var26 = 4;
                                                   break label451;
                                                }

                                                if (var4 >= 0) {
                                                   var5 = true;
                                                   var4 = (byte)(var6 == 2 ? 2 : (var6 == 4 ? 4 : -1));
                                                   var26 = 4;
                                                   break label451;
                                                }

                                                var4 = (byte)(var8 > 0 ? 2 : 4);
                                          }
                                       }

                                       var26 = 4;
                                    }

                                    var9 = var26;
                                 }
                              }
                           }
                        }

                        if (field_334[9] >= 1) {
                           this.field_199 = 5;
                           int var23 = 0;
                           int[] var24 = new int[]{0, 1, 0, -1, 1, 1, -1, -1, 0, 2, 0, -2};
                           int[] var25 = new int[]{-1, 0, 1, 0, -1, 1, 1, -1, -2, 0, 2, 0};
                           int[] var13 = new int[]{0, 0, 0, 0, 3, 6, 12, 9, 1, 2, 4, 8};

                           for (int var14 = 0; var14 < var24.length; var14++) {
                              int var15 = this.field_233 + var24[var14];
                              int var16 = this.field_234 + var25[var14];
                              if (var15 >= 0 && var15 < this.field_208 && var16 >= 0 && var16 < this.field_209) {
                                 int var17;
                                 boolean var18;
                                 int var19;
                                 boolean var20;
                                 label316: {
                                    var17 = field_337[var15][var16] & 7;
                                    var18 = false;
                                    var19 = -1;
                                    var20 = false;
                                    switch (field_338[var15][var16]) {
                                       case 9:
                                       case 18:
                                       case 30:
                                          if (var13[var14] == 0) {
                                             var20 = true;
                                          }
                                          break label316;
                                       case 19:
                                       case 43:
                                          if ((field_337[var15][var16] & 248) != 0) {
                                             break label316;
                                          }
                                          break;
                                       case 45:
                                          if ((field_337[var15][var16] & 15) == 10) {
                                             break label316;
                                          }
                                          break;
                                       case 46:
                                       case 49:
                                       case 50:
                                          if (var13[var14] == 0) {
                                             var23++;
                                             var20 = true;
                                          }
                                       default:
                                          break label316;
                                    }

                                    var18 = true;
                                 }

                                 if (var18) {
                                    label307: {
                                       int var27;
                                       if (var13[var14] == 0) {
                                          var27 = var14 + 1;
                                       } else {
                                          if (field_339[var15][var16] < 12) {
                                             break label307;
                                          }

                                          if ((var13[var14] & 1) == 0 || var17 != 3) {
                                             if ((var13[var14] & 8) == 0 || var17 != 2) {
                                                break label307;
                                             }

                                             if (var25[var14] == 0) {
                                                var27 = 4;
                                             } else if (var25[var14] < 0) {
                                                var27 = 1;
                                             } else {
                                                if (var25[var14] <= 0) {
                                                   break label307;
                                                }

                                                var27 = 3;
                                             }
                                          } else if (var24[var14] == 0) {
                                             var27 = 1;
                                          } else if (var24[var14] < 0) {
                                             var27 = 4;
                                          } else {
                                             if (var24[var14] <= 0) {
                                                break label307;
                                             }

                                             var27 = 2;
                                          }
                                       }

                                       var19 = var27;
                                    }

                                    if (var19 != -1) {
                                       var20 = true;
                                       var23++;
                                    }
                                 }

                                 if (var20) {
                                    if (var23 == 0) {
                                       if (var2 == var14 + 1) {
                                          var3 = var2;
                                       } else if (var3 < 0) {
                                          var3 = var14 + 1;
                                       }
                                    } else {
                                       if (var23 != 1) {
                                          var3 = var2;
                                          break;
                                       }

                                       var3 = var19;
                                    }
                                 }
                              }
                           }
                        }

                        label443: {
                           class_8 var28;
                           int var29;
                           int var10002;
                           if (var3 > 0 && var4 == var2) {
                              this.field_199 = 6;
                              var28 = this;
                              var29 = this.field_236 & -8;
                              var10002 = var2;
                           } else if (var3 > 0 && var4 < 0 && !var5) {
                              var28 = this;
                              var29 = this.field_236 & -8;
                              var10002 = var3;
                           } else {
                              label454: {
                                 if (var3 >= 0 || var4 <= 0 || var5) {
                                    if (var5 && (var2 == 2 || var2 == 4)) {
                                       this.field_199 = 6;
                                       var28 = this;
                                       var29 = this.field_236 & -8;
                                       var10002 = var2;
                                       break label454;
                                    }

                                    if (!var5 || var4 <= 0) {
                                       break label443;
                                    }
                                 }

                                 this.field_199 = 6;
                                 var28 = this;
                                 var29 = this.field_236 & -8;
                                 var10002 = var4;
                              }
                           }

                           var28.field_236 = var29 | var10002;
                        }

                        if (this.field_199 == 6
                           && (field_336[this.field_233][this.field_234] & 0xFF) == 2
                           && field_336[this.field_233][this.field_234] >> 8 == 1) {
                           this.field_211 = -1;
                           this.method_290(this.field_233, this.field_234, (byte)2);
                        }
                     }
                  }
               }

               if (this.field_199 != 5 && this.field_200 == 0 && this.field_97 == 0 && this.field_199 != (this.field_236 & 7)) {
                  this.field_236 |= 4096;
               }
            }
         }
      } else {
         field_171 = 0;
      }
   }

   // $VF: renamed from: bb () void
   private void method_231() {
      if (this.field_430 >= 0 && this.field_430 <= 2) {
         field_171 = 0;
      } else {
         if (method_66(4097)) {
            if (System.currentTimeMillis() - this.field_436 < 300L) {
               return;
            }

            this.method_92();
            if (this.field_266 == 0 && this.field_268 == 1 && !this.field_437) {
               this.method_92();
            }
         } else if (method_66(262146)) {
            if (System.currentTimeMillis() - this.field_436 < 300L) {
               return;
            }

            this.method_93();
            if (this.field_266 == 0 && this.field_268 == 1 && !this.field_437) {
               this.method_93();
            }
         } else if (method_66(32944)) {
            if (this.field_430 < 0 || this.field_430 > 2) {
               this.field_430 = 0;
               this.field_431 = System.currentTimeMillis();
            }
         } else if (method_66(64)) {
            this.method_232();
         }

         field_171 = 0;
      }
   }

   // $VF: renamed from: bc () void
   private void method_232() {
      switch (this.field_266) {
         case -1:
            return;
         case 0:
         case 1:
         case 3:
         default:
            break;
         case 2:
            field_225 = 9;
            this.method_65(0);
            this.field_269 = 8;
            this.field_270 = 0;
            return;
         case 4:
            this.method_65(2);
            break;
         case 5:
            field_434 = true;
            field_435 = false;
            if (field_225 == 2) {
               this.method_65(1);
               this.method_98();
               field_435 = true;
            }

            if (field_225 == 4) {
               this.method_65(0);
               this.method_436(19);
               return;
            }
      }
   }

   // $VF: renamed from: f (int, int) void
   private void method_233(int var1, int var2) {
      int[] var3;
      int[] var4;
      boolean var5;
      boolean var6;
      boolean var7;
      label119: {
         var3 = new int[]{0, 1, -1, 0, 0};
         var4 = new int[]{0, 0, 0, 1, -1};
         var5 = false;
         var6 = field_334[9] >= 8;
         var7 = false;
         boolean var10000;
         switch (field_338[var1][var2]) {
            case 0:
               var7 = true;
               break label119;
            case 9:
               if ((this.field_236 & 8192) == 0) {
                  this.field_236 |= 8192;
                  var5 = true;
                  this.method_234(var1, var2);
               }
               break label119;
            case 10:
               if (this.field_492 == 3 && field_337[var1][var2] <= 0) {
                  var5 = true;
                  field_337[var1][var2] = 1;
                  this.method_149(var1, var2);
               }
               break label119;
            case 16:
               var5 = true;
               var7 = true;
               break label119;
            case 18:
               var10000 = this.method_235();
               break;
            case 30:
               var5 = true;
               if (field_337[var1][var2] == 0) {
                  this.method_436(11);
                  field_337[var1][var2] = 1;
               }
               break label119;
            default:
               if (field_338[var1][var2] - 80 < 0 && ((field_336[var1][var2] & 0xFF) != 7 || (field_336[var1][var2] >> 8 & 240) != 0)) {
                  break label119;
               }

               var7 = true;
               var10000 = true;
         }

         var5 = var10000;
      }

      if (var7) {
         method_265(200);
         this.method_436(6);
         this.method_214(41 + (this.field_236 & 7) - 1);
      }

      if (!var5) {
         for (int var9 = 0; var9 < 5; var9++) {
            int var10 = var1 + var3[var9];
            int var11 = var2 + var4[var9];
            if (var10 >= 0 && var10 < this.field_208 && var11 >= 0 && var11 < this.field_209) {
               byte var8 = field_338[var10][var11];
               boolean var12 = false;
               boolean var13 = false;
               switch (var8) {
                  case 1:
                     if (var10 == this.field_233 - field_329[this.field_236 & 7] && var11 == this.field_234 - field_329[(this.field_236 & 7) + 8]) {
                        var13 = true;
                     }
                     break;
                  case 19:
                  case 43:
                  case 45:
                  case 46:
                  case 49:
                     int var14;
                     byte var15 = (var14 = field_337[var10][var11] & 7) == 0 ? 0 : field_339[var10][var11];
                     boolean var16 = var8 != 49 && var8 != 46;
                     if (method_353(var1, var2, 0, 0, var10, var11, var14, var15)) {
                        var13 = true;
                        var12 = var16;
                     }

                     if (var13) {
                        this.method_436(10);
                     }
               }

               if (var6 && var13 && (var10 != this.field_233 || var11 != this.field_234)) {
                  if (this.method_243(var10, var11)) {
                     this.field_236 |= 8192;
                  }
               } else if (var12) {
                  this.field_236 |= 8192;
                  if (var8 == 45) {
                     int var17;
                     if ((var17 = (field_337[var10][var11] & 7168) >> 10) == 3) {
                        field_338[var10][var11] = -1;
                        this.method_338(var10, var11);
                     } else {
                        field_337[var10][var11] = 10 | ++var17 << 10;
                        field_337[var10][var11] = field_337[var10][var11] & -249 | 120;
                        field_339[var10][var11] = 0;
                     }
                  } else {
                     this.method_236(var8, var10, var11);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: g (int, int) void
   private void method_234(int var1, int var2) {
      if (!method_241(var1, var2)) {
         method_348(var1, var2);
         int var3 = this.method_301(var1, var2 - 1) ? 2 : 1;
         switch ((field_337[var1][var2] & 264241152) >> 22) {
            case 34:
               field_338[var1][var2] = 1;
               this.method_150(var1, var2);
               return;
            case 35:
               field_338[var1][var2] = 45;
               field_337[var1][var2] = field_337[var1][var2] & -16 | 10;
               return;
            case 36:
               field_338[var1][var2] = 46;
               field_337[var1][var2] = 0;
               field_339[var1][var2] = 0;
            case 38:
            default:
               return;
            case 37:
               byte[] var10000;
               int var10001;
               byte var10002;
               if ((field_337[var1][var2] & 268435456) != 0) {
                  var10000 = field_338[var1];
                  var10001 = var2;
                  var10002 = 43;
               } else {
                  var10000 = field_338[var1];
                  var10001 = var2;
                  var10002 = 19;
               }

               var10000[var10001] = var10002;
               field_337[var1][var2] = var3;
               this.method_236(19, var1, var2);
               return;
            case 39:
               field_338[var1][var2] = 49;
               field_337[var1][var2] = var3;
         }
      }
   }

   // $VF: renamed from: c () boolean
   private boolean method_235() {
      if (this.field_492 == 3) {
         int var1 = field_336[this.field_233][this.field_234] & 0xFF;
         if (this.field_315 == 0 && var1 != 15 && var1 != 16) {
            this.method_436(0);
            class_8 var10000;
            byte var10001;
            if (this.field_314 <= 0) {
               var10000 = this;
               var10001 = 1;
            } else {
               var10000 = this;
               var10001 = -1;
            }

            var10000.field_315 = var10001;
         }

         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: c (int, int, int) void
   private void method_236(int var1, int var2, int var3) {
      int var4 = field_337[var2][var3];
      if (var1 == 43 && (var4 & 248) == 0) {
         if ((var4 & 98304) == 0) {
            field_338[var2][var3] = -1;
            this.method_338(var2, var3);
            return;
         }

         int var5;
         int var6;
         var4 = ((var6 = ((var5 = var4 - 32768) & -16646145 | var2 << 17) & -2130706433 | var3 << 24) & 7) != 1 && (var6 & 7) != 3
            ? var6 & 2147483647
            : var6 | -2147483648;
      }

      var4 = var4 & -249 | 120;
      field_337[var2][var3] = var4;
   }

   // $VF: renamed from: bd () void
   private void method_237() {
      int var2 = field_336[this.field_283][this.field_284] >> 8;
      int[] var10000;
      int var10001;
      int var10002;
      if (++var2 >= 16) {
         var10000 = field_336[this.field_283];
         var10001 = this.field_284;
         var10002 = -1;
      } else {
         field_340[this.field_283][this.field_284] = 24;
         var10000 = field_336[this.field_283];
         var10001 = this.field_284;
         var10002 = var2 << 8 | 36;
      }

      var10000[var10001] = var10002;
   }

   // $VF: renamed from: h (int, int) void
   private void method_238(int var1, int var2) {
      switch (field_338[var1][var2]) {
         case 0:
            this.method_436(11);
         case 19:
         case 43:
         case 45:
         case 46:
            field_336[var1][var2] = -1;
            this.method_338(var1, var2);
            return;
         case 48:
            field_336[var1][var2] = -1;
            this.method_338(var1, var2);
            int var3 = var2 + 1;
            if (field_338[var1][var3] != 48) {
               var3 = -1;
            }

            field_338[var1][var3] = -1;
            this.method_338(var1, var3);
            int var4 = (field_337[var1][var2] >> 24) * 3;
            field_195[var4 + 2] = -1;
            return;
         default:
            field_336[var1][var2] = -1;
      }
   }

   // $VF: renamed from: be () void
   private void method_239() {
      if (this.field_98) {
         this.field_96--;
      }

      if ((this.field_125 || this.field_466) && field_229 > 140) {
         if (this.field_466) {
            this.method_250();
         }

         this.field_125 = false;
         this.field_466 = false;
         this.field_380 = true;
         this.field_270 = 0;
         this.method_67();
         this.field_378 = true;
         field_225 = 28;
      }

      boolean var1 = this.method_213();
      if (this.field_479) {
         this.field_479 = false;
         if (this.field_484 < this.field_485) {
            int var2 = method_380((byte)this.field_484, (byte)13, (byte)7);
            int var3 = method_380((byte)this.field_484, (byte)20, (byte)7);
            this.method_403(var2, var3);
            this.field_484++;
         } else {
            this.field_484 = 0;
            this.field_485 = 0;
         }
      }

      if (field_327[4] != null) {
         field_327[4].method_14();
      }

      if (this.field_258 > 0) {
         this.field_258--;
      }

      if (this.field_468 > 0) {
         this.field_468--;
         if (this.field_468 == 0) {
            this.field_467 = null;
         }
      }

      if (this.field_165 != this.field_166) {
         int var10000 = this.field_165;

         while (true) {
            int var10 = var10000;
            if (var10000 == this.field_166) {
               break;
            }

            field_163[var10]++;
            int var14 = field_164[var10] < 0 ? method_316(field_324[2], 0) : field_324[9].method_49(field_164[var10]);
            if (field_163[var10] >= var14) {
               this.field_165++;
               this.field_165 &= 7;
            }

            var10000 = var10 + 1 & 7;
         }
      }

      if (this.field_177 != 0) {
         this.method_269();
         if (field_225 != 1) {
            return;
         }
      }

      if ((field_229 & 15) == 0) {
         this.method_268();
      }

      if (this.field_315 != 0 && (field_229 >> 1 & 1) == 0) {
         this.field_314 = this.field_314 + this.field_315;
         if (this.field_314 != 0 && this.field_314 != 9) {
            if (this.field_314 == 5) {
               int var12 = this.field_209 - 1;
               int var16 = this.field_208 - 1;

               for (int var22 = 1; var22 < var12; var22++) {
                  for (int var26 = 1; var26 < var16; var26++) {
                     boolean var8;
                     label447: {
                        int var6 = field_336[var26][var22] & 0xFF;
                        byte var7 = field_338[var26][var22];
                        var8 = false;
                        if (var6 == 15) {
                           this.method_238(var26, var22);
                           field_338[var26][var22] = 34;
                        } else if (var6 == 16) {
                           this.method_238(var26, var22);
                           field_338[var26][var22] = 35;
                        } else {
                           int[] var29;
                           int var10001;
                           byte var10002;
                           if (var7 == 34) {
                              var29 = field_336[var26];
                              var10001 = var22;
                              var10002 = 15;
                           } else {
                              if (var7 != 35) {
                                 break label447;
                              }

                              var29 = field_336[var26];
                              var10001 = var22;
                              var10002 = 16;
                           }

                           var29[var10001] = var10002;
                           field_338[var26][var22] = -1;
                           this.method_400(var26, var22);
                        }

                        var8 = true;
                     }

                     if (var8) {
                        method_348(var26, var22);
                     }
                  }
               }
            }
         } else {
            this.field_315 = 0;

            for (int var11 = 1; var11 < this.field_209 - 1; var11++) {
               for (int var15 = 1; var15 < this.field_208 - 1; var15++) {
                  int var4 = field_336[var15][var11] & 0xFF;
                  byte var5 = field_338[var15][var11];
                  if (var4 == 15 || var4 == 16 || var5 == 34 || var5 == 35) {
                     this.method_150(var15, var11);
                  }
               }
            }
         }
      }

      this.field_244--;
      if (this.field_243 > 0 && --this.field_243 == 0) {
         this.method_258();
      }

      if (this.field_235 <= 0 && this.field_238) {
         this.field_238 = false;
         this.method_436(9);

         try {
            Thread.sleep(100L);
         } catch (InterruptedException var9) {
         }

         this.method_349();
      }

      if (field_324[11] != null) {
         this.method_267();
      }

      if (this.field_257 != 0 && this.field_255 != 0) {
         this.method_266();
      }

      this.method_307();
      if (this.field_196 > 0) {
         this.method_242();
      }

      this.method_384();
      if (this.field_346 != 0) {
         this.method_304();
      }

      if (this.field_358 != null) {
         this.field_197 = 70;
         if (this.field_358.method_35() && this.field_358.method_32() == null) {
            this.field_358 = null;
         }

         if (this.field_358 != null) {
            this.field_358.method_33();
         }
      } else if (this.field_261 != -1) {
         this.method_302(this.field_261);
         this.field_261 = -1;
         this.field_199 = 0;
      }

      label422: {
         class_8 var31;
         byte var35;
         if (this.field_237 > 0) {
            if (field_338[this.field_233][this.field_234] < 0) {
               byte var38;
               if (field_338[this.field_233][this.field_234 + 1] == 9 && (field_337[this.field_233][this.field_234 + 1] & 7) == 3) {
                  this.field_234++;
                  var31 = this;
                  var35 = (byte)(this.field_236 & -8);
                  var38 = 3;
               } else if (field_338[this.field_233 - 1][this.field_234 + 1] == 9 && (field_337[this.field_233 - 1][this.field_234 + 1] & 7) == 3) {
                  this.field_234++;
                  this.field_233--;
                  var31 = this;
                  var35 = (byte)(this.field_236 & -8);
                  var38 = 3;
               } else if (field_338[this.field_233 + 1][this.field_234 + 1] == 9 && (field_337[this.field_233 + 1][this.field_234 + 1] & 7) == 3) {
                  this.field_234++;
                  this.field_233++;
                  var31 = this;
                  var35 = (byte)(this.field_236 & -8);
                  var38 = 3;
               } else {
                  var31 = this;
                  var35 = (byte)(this.field_236 & -8);
                  var38 = 0;
               }

               var31.field_236 = var35 | var38;
            }

            var31 = this;
            var35 = field_339[this.field_233][this.field_234];
         } else {
            if ((this.field_200 == 0 || this.field_235 <= 0 && this.field_200 != 5) && !this.field_241 && (this.field_236 & 112) == 0 && this.field_213 == -1) {
               this.field_200 = this.field_199;
               boolean var13 = false;
               if (this.field_198 > 0) {
                  this.field_200 = 2;
                  this.field_198--;
                  if (this.field_198 == 0) {
                     this.method_261(this.field_233 - 1, this.field_234);
                     this.field_199 = 0;
                     field_171 = 0;
                  }
               } else if (var1) {
                  method_348(this.field_233, this.field_234);
               }

               label299:
               switch (this.field_200) {
                  case 0:
                     this.field_236 &= -9;
                     boolean var27 = false;
                     switch (field_327[0].field_25) {
                        default:
                           if ((this.field_236 & 16384) == 0) {
                              var27 = true;
                           }
                        case 0:
                        case 2:
                        case 10:
                        case 11:
                        case 12:
                        case 34:
                        case 35:
                        case 40:
                        case 48:
                           if (var27) {
                              int var28;
                              if ((var28 = 0 + (this.field_236 & 7) - 1) < 0) {
                                 var28 = 0;
                              }

                              this.method_214(var28);
                           }

                           byte var37;
                           if (this.field_358 == null) {
                              var31 = this;
                              var37 = 6;
                           } else {
                              var31 = this;
                              var37 = 0;
                           }

                           var31.field_245 = var37;
                           if (this.field_235 > 0) {
                              this.field_235 -= 6;
                           }
                           break label299;
                     }
                  case 3:
                     this.field_236 &= -9;
                  case 1:
                  case 2:
                  case 4:
                     if (field_327[0].field_25 != 40 && field_327[0].field_25 != 48) {
                        if ((this.field_236 & 4096) == 0) {
                           var13 = this.method_291(-field_329[this.field_200], -field_329[this.field_200 + 8], false);
                           var1 = this.method_213();
                           if (var13) {
                              this.field_96 = 40;
                              this.field_98 = false;
                              int var18;
                              if ((var18 = this.field_200 - 1) < 0) {
                                 var18 = 0;
                              }

                              if ((this.field_236 & 8) != 0) {
                                 if (this.field_200 == 2) {
                                    this.method_214(8);
                                 } else {
                                    this.method_214(9);
                                 }
                              } else {
                                 this.method_214(4 + var18);
                              }
                           }
                        } else {
                           this.field_236 = this.field_236 & -8 | this.field_200;
                           this.field_235 = 18;
                           int var19;
                           if ((var19 = this.field_200 - 1) < 0) {
                              var19 = 0;
                           }

                           this.method_214(0 + var19);
                        }
                     }
                     break;
                  case 5:
                     this.field_235 = 0;
                     int var23 = this.field_236 & 7;
                     if (this.method_213()) {
                        this.method_214(13 + var23 - 1);
                     }
                     break;
                  case 6:
                     int var17 = (this.field_236 & 7) == 2 ? 1 : -1;
                     if (var1 && field_338[this.field_233 + var17][this.field_234] < 0) {
                        this.method_214(var17 == -1 ? 22 : 20);
                        field_338[this.field_233 + var17][this.field_234] = 32;
                        field_339[this.field_233 + var17][this.field_234] = 18;
                        field_337[this.field_233 + var17][this.field_234] = 4 | (var17 > 0 ? 1 : 0);
                        field_340[this.field_233 + var17][this.field_234] = 30;
                        this.field_235 = 72;
                        this.field_199 = 0;
                     }
               }

               if (var1) {
                  byte var20 = field_338[this.field_233][this.field_234 - 1];
                  if (!var13
                     && this.field_200 != 5
                     && this.field_235 <= 0
                     && (var20 == 0 || var20 == 9 || var20 == 8 || var20 == 48)
                     && (field_336[this.field_233][this.field_234] & 0xFF) != 35) {
                     int var24 = 0;
                     if (field_505 != null) {
                        var24 = method_376(field_505[this.field_233][this.field_234], (byte)0, (byte)3, (byte)4);
                     }

                     if (!this.field_158 || var24 == 0 && var24 != 3) {
                        if ((this.field_236 & 8) == 0 && field_327[0].field_25 != 11 && field_327[0].field_25 != 10 && field_327[0].field_25 != 12) {
                           this.method_214(11);
                        }

                        this.field_98 = true;
                        if (this.field_96 <= 0) {
                           this.field_96 = 40;
                           this.field_244 = 0L;
                           this.method_63(field_334[8], 32, 0);
                           return;
                        }
                     }
                  }
               }

               if (var13) {
                  this.field_262 = false;
               } else if (var1 && (field_229 & 31) == 0) {
                  boolean var21 = field_338[this.field_233][this.field_234 - 1] == 0;

                  for (int var25 = 1; !var21 && var25 <= 4; var25++) {
                     var21 |= this.method_291(field_329[var25], field_329[var25 + 8], true);
                  }

                  if (!var21) {
                     if (this.field_262) {
                        this.method_214(19);
                     } else {
                        this.field_262 = true;
                     }
                  }
               }
               break label422;
            }

            if (this.field_241 && this.field_235 <= 0) {
               byte var36;
               if (this.field_556) {
                  var31 = this;
                  var36 = this.field_311;
               } else {
                  var31 = this;
                  var36 = this.field_312;
               }

               var31.field_200 = var36;
               this.field_236 = this.field_236 & -8 | this.field_200;
               this.field_233 = this.field_233 + -field_329[this.field_200];
               this.field_234 = this.field_234 + -field_329[this.field_200 + 8];
               var1 = this.method_213();
               this.field_235 = 18;
               if (field_327[0].field_25 != 4) {
                  this.method_214(4 + this.field_200 - 1);
               }
            }

            if ((this.field_236 & 112) > 32 && (this.field_236 & 2048) == 0) {
               break label422;
            }

            this.field_235 -= 6;
            if (this.field_235 > 0) {
               break label422;
            }

            this.field_236 &= -4209;
            var31 = this;
            var35 = 0;
         }

         var31.field_235 = var35;
      }

      if (this.field_346 == 0) {
         if (this.field_342) {
            this.field_345 = 8;
            if (this.method_303()) {
               this.method_257(this.field_297, this.field_298, 5);
               this.field_342 = false;
            }
         } else if (this.field_358 == null) {
            if (field_472 && this.field_200 != 0) {
               field_472 = false;
               this.field_197 = 0;
            }

            if (!field_472) {
               this.method_288();
            }
         } else {
            this.field_204 = this.field_206;
            this.field_205 = this.field_207;
         }
      }

      if (this.field_200 != 0 && var1) {
         this.field_172 = field_338[this.field_233][this.field_234 + 1] >= 0;
      }

      this.method_263();
      if (this.field_241 && (this.field_233 < -5 || this.field_233 > this.field_208 + 5 || this.field_234 < -5 || this.field_234 > this.field_209 + 5)) {
         this.method_94();
         if (!this.field_556 && this.field_203 < this.field_520) {
            field_225 = 20;
            this.field_270 = 0;
            this.method_249();
            this.method_133();
            method_248(6, this.field_249);
            this.method_110();
         } else {
            this.field_270 = 0;
            this.field_269 = 12;
            field_225 = 35;
         }

         this.method_67();
         this.field_226 = -1;
      }
   }

   // $VF: renamed from: a (int, int, int, int) byte
   private byte method_240(int var1, int var2, int var3, int var4) {
      int var5 = var1 + var2;
      if ((var1 > 0 && var3 == 0 || var1 < var3 && var3 > 0) && (field_338[var5][var4] < 0 || field_338[var5][var4] == 31 || method_244(var5, var4) >= 0)) {
         do {
            var1 = var5;
            var5 += var2;
         } while (
            (var1 > 0 && var3 == 0 || var1 < var3 && var3 > 0) && (field_338[var5][var4] < 0 || method_244(var5, var4) >= 0 || field_338[var5][var4] == 31)
         );
      }

      return (byte)var1;
   }

   // $VF: renamed from: a (int, int) boolean
   private static boolean method_241(int var0, int var1) {
      if (field_195 == null) {
         return false;
      }

      for (byte var2 = 0; var2 < field_195.length; var2 += 3) {
         if (field_195[var2 + 2] == var1 && (field_195[var2 + 0] - 1 == var0 || field_195[var2 + 1] + 1 == var0)) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: bf () void
   private void method_242() {
      int var1 = this.field_208 - 1;

      for (byte var2 = 0; var2 < field_195.length; var2 += 3) {
         byte var3;
         if ((var3 = field_195[var2 + 2]) > 0) {
            byte var4 = field_195[var2 + 1];
            byte var5 = field_195[var2 + 0];
            var5 = field_195[var2 + 0] = this.method_240(var5, -1, 0, var3);
            var4 = field_195[var2 + 1] = this.method_240(var4, 1, var1, var3);

            for (int var6 = var5; var6 <= var4; var6++) {
               this.method_243(var6, var3);
            }
         }
      }
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_243(int var1, int var2) {
      int var3 = method_244(var1, var2);
      int var4 = 0;
      if (var3 >= 0) {
         if (var3 == 37 && field_338[var1][var2] == 43) {
            var4 = 268435456;
         }

         method_348(var1, var2);
         field_338[var1][var2] = 9;
         field_337[var1][var2] = field_337[var1][var2] & -264241153 | var3 << 22 | var4;
         this.method_257(var1, var2, 1);
      }

      int var5 = (this.field_236 & 16384) == 0 ? 0 : 3;
      class_2 var6 = field_327[var5];
      if (this.method_301(var1, var2) && this.field_237 <= 0 && var6.field_25 != 40 && var6.field_25 != 48 && var6.field_25 != 47) {
         this.method_63(0, 16, 0);
      }

      return var3 >= 0;
   }

   // $VF: renamed from: d (int, int) int
   private static int method_244(int var0, int var1) {
      if (field_338[var0][var1] < 0) {
         return -1;
      }

      switch (field_338[var0][var1]) {
         case 1:
            return 34;
         case 19:
         case 43:
            return 37;
         case 45:
            return 35;
         case 46:
            return 36;
         case 49:
            return 39;
         default:
            return -1;
      }
   }

   // $VF: renamed from: bg () void
   private void method_245() {
      label125: {
         int var1;
         class_7 var2;
         Graphics var3;
         label129: {
            label130: {
               var1 = this.field_226;
               var2 = field_324[41];
               var3 = this.field_318;
               this.field_318.setColor(2496263);
               var3.fillRect(0, 0, 240, 320);
               switch (var1) {
                  case 0:
                     break label129;
                  case 1:
                     break label130;
                  case 2:
                     break;
                  case 5:
                     if (this.field_251 == 0) {
                        if ((this.field_450 & 32) != 0) {
                           var3.drawImage(field_322[5][0], 200, 237, 0);
                           if (var1 == 5) {
                              class_7 var6;
                              int var7 = (var6 = field_324[9]).method_49(0);
                              if (field_229 < var7 * 2) {
                                 var6.method_52(var3, 0, field_229 * 2, 200, 237, 0, 0, 0);
                              }
                           }
                        }

                        var3.drawImage(field_322[28][0], 180, 254, 0);
                     }
                  case 4:
                     int var4;
                     if (var1 != 4 || (var4 = -100 + field_229 * 10) > 0) {
                        var4 = 0;
                     }

                     field_327[0].field_24.method_52(var3, 12, 0, 7 + var4, 243, 0, 0, 0);
                     var2.method_59(var3, field_569[44], 120, 243, 17);
                     String var13 = String.valueOf(this.field_251);
                     var2.method_59(var3, var13, 120, 255, 17);
                     if (this.field_250 == 0) {
                        if ((this.field_450 & 16) != 0) {
                           var3.drawImage(field_322[5][0], 200, 179, 0);
                           if (var1 == 4) {
                              class_7 var17;
                              int var8 = (var17 = field_324[9]).method_49(0);
                              if (field_229 < var8 * 2) {
                                 var17.method_52(var3, 0, field_229 >> 1, 200, 179, 0, 0, 0);
                              }
                           }
                        }

                        var3.drawImage(field_322[28][0], 180, 196, 0);
                     }
                  case 3:
                     int var9;
                     if (var1 != 3 || (var9 = -100 + field_229 * 10) > 0) {
                        var9 = 0;
                     }

                     field_327[0].field_24.method_52(var3, 10, 0, 7 + var9, 189, 0, 0, 0);
                     var2.method_59(var3, field_569[43], 120, 185, 17);
                     String var14 = String.valueOf(this.field_250);
                     var2.method_59(var3, var14, 120, 197, 17);
                     if (this.field_249 == this.field_248) {
                        if ((this.field_450 & 8) != 0) {
                           var3.drawImage(field_322[5][0], 200, 121, 0);
                           if (var1 == 3) {
                              class_7 var18;
                              int var21 = (var18 = field_324[9]).method_49(0);
                              if (field_229 < var21 * 2) {
                                 var18.method_52(var3, 0, field_229 >> 1, 200, 121, 0, 0, 0);
                              }
                           }
                        }

                        var3.drawImage(field_322[28][0], 180, 138, 0);
                     }
                     break;
                  default:
                     break label125;
               }

               int var10;
               if (var1 != 2 || (var10 = -100 + field_229 * 10) > 0) {
                  var10 = 0;
               }

               field_324[method_151(3)].method_53(var3, 0, 7 + var10, 127, 0, 0, 0);
               var2.method_59(var3, field_569[114], 120, 127, 17);
               String var15 = this.field_249 + "/" + this.field_248;
               var2.method_59(var3, var15, 120, 139, 17);
               if (this.field_247 == this.field_246) {
                  if ((this.field_450 & 4) != 0) {
                     var3.drawImage(field_322[5][0], 200, 63, 0);
                     if (var1 == 2) {
                        class_7 var19;
                        int var22 = (var19 = field_324[9]).method_49(0);
                        if (field_229 < var22 >> 1) {
                           var19.method_52(var3, 0, field_229 * 2, 200, 63, 0, 0, 0);
                        }
                     }
                  }

                  var3.drawImage(field_322[28][0], 180, 80, 0);
               }
            }

            int var11;
            if (var1 != 1 || (var11 = -100 + field_229 * 10) > 0) {
               var11 = 0;
            }

            field_324[method_151(2)].method_53(var3, 0, 7 + var11, 69, 0, 0, 0);
            var2.method_59(var3, field_569[109], 120, 69, 17);
            int var20;
            if (var1 != 1 || (var20 = field_229 >> 1) > this.field_247) {
               var20 = this.field_247;
            }

            String var16 = var20 + "/" + this.field_246;
            var2.method_59(var3, var16, 120, 81, 17);
         }

         int var5;
         int var12;
         label84: {
            if (var1 == 0) {
               var5 = (var12 = -100 + field_229 * 10) - 240;
               if (var12 > 0) {
                  var12 = 0;
               }

               if (var5 <= 0) {
                  break label84;
               }
            } else {
               var12 = 0;
            }

            var5 = 0;
         }

         var2.method_58(var3, field_569[field_568[this.field_202][this.field_203]], 120 + var12, 10, 17);
         var2.method_58(var3, field_569[41], 120 + var5, 25, 17);
      }

      field_324[41].method_58(this.field_318, field_569[this.field_226 == 5 ? 98 : 53], 5, 318, 36);
   }

   // $VF: renamed from: a (byte[], int) int
   public static int method_246(byte[] var0, int var1) {
      return var0[var1] & 0xFF | (var0[var1 + 1] & 0xFF) << 8;
   }

   // $VF: renamed from: b (byte[], int) int
   public static int method_247(byte[] var0, int var1) {
      return var0[var1] & 0xFF | (var0[var1 + 1] & 0xFF) << 8 | (var0[var1 + 2] & 0xFF) << 16 | (var0[var1 + 3] & 0xFF) << 24;
   }

   // $VF: renamed from: e (int, int) int
   private static int method_248(int var0, int var1) {
      int var2;
      if ((var2 = method_246(field_334, var0) + var1) < 0) {
         var2 = 0;
      }

      field_334[var0] = (byte)(var2 & 0xFF);
      field_334[var0 + 1] = (byte)(var2 >> 8 & 0xFF);
      return var2;
   }

   // $VF: renamed from: bh () void
   private void method_249() {
      for (int var1 = 0; var1 < this.field_174; var1++) {
         this.method_129(this.field_202, this.field_203, field_176[var1 << 1] & 255, field_176[(var1 << 1) + 1] & 255);
      }
   }

   // $VF: renamed from: d () int
   private int method_250() {
      return method_248(4, this.field_247);
   }

   // $VF: renamed from: e () int
   private int method_251() {
      return method_248(6, this.field_249);
   }

   // $VF: renamed from: q (int) void
   private void method_252(int var1) {
      switch (var1) {
         case 0:
            field_446 = 0;
            field_447 = 0;
            field_448 = 0;
            this.field_449 = this.method_118(this.field_202, this.field_203);
            this.field_450 = 0;
            return;
         case 1:
            field_446 = method_246(field_334, 4);
            field_446 = field_446 + this.field_247;
            this.field_228 = false;
            return;
         case 2:
            field_334[4] = (byte)(field_446 & 0xFF);
            field_334[5] = (byte)(field_446 >> 8 & 0xFF);
            return;
         case 3:
            field_447 = method_246(field_334, 6);
            field_447 = field_447 + this.field_249;
            return;
         case 4:
            field_334[6] = (byte)(field_447 & 0xFF);
            field_334[7] = (byte)(field_447 >> 8 & 0xFF);
            return;
         case 5:
            field_448 = field_334[2];
            this.field_146 = 0;
            if ((field_448 & 8) == 0 && field_447 >= class_0.field_1[1]) {
               this.field_146 = 1;
               return;
            }

            if ((field_448 & 16) == 0 && field_447 >= class_0.field_1[2]) {
               this.field_146 = 2;
               return;
            }
            break;
         case 6:
            try {
               field_322[28] = method_359("/ui.f", 4);
               return;
            } catch (Exception var4) {
               return;
            }
         case 7:
            this.method_119(this.field_202, this.field_203, (byte)2);
            this.field_147 = 0;
            return;
         case 8:
            int var2;
            int var3 = var2 = (field_448 & 224) >> 5;

            while (var3 < 4 && field_446 >= class_0.field_0[var3]) {
               var3++;
            }

            if (var2 < var3) {
               field_334[2] = (byte)(field_334[2] & -225);
               field_334[2] = (byte)(field_334[2] | var3 << 5 & 224);
               this.method_112();
               this.field_147 = var3;
            }
         case 9:
            this.method_249();
            return;
         case 10:
            this.method_67();
            System.gc();
            return;
         case 11:
            if (this.field_201 < 99 && this.field_247 == this.field_246 && (this.field_449 & 4) == 0) {
               this.method_119(this.field_202, this.field_203, (byte)4);
               this.field_450 = (byte)(this.field_450 | 4);
               this.field_201++;
            }

            if (this.field_201 < 99 && this.field_249 == this.field_248 && (this.field_449 & 8) == 0) {
               this.method_119(this.field_202, this.field_203, (byte)8);
               this.field_450 = (byte)(this.field_450 | 8);
               this.field_201++;
            }

            if (this.field_201 < 99 && this.field_250 == 0 && (this.field_449 & 16) == 0) {
               this.method_119(this.field_202, this.field_203, (byte)16);
               this.field_450 = (byte)(this.field_450 | 16);
               this.field_201++;
            }

            if (this.field_201 < 99 && this.field_251 == 0 && (this.field_449 & 32) == 0) {
               this.method_119(this.field_202, this.field_203, (byte)32);
               this.field_450 = (byte)(this.field_450 | 32);
               this.field_201++;
            }

            this.method_255();
            this.method_110();
            this.field_378 = false;
            this.field_377 = true;
      }
   }

   // $VF: renamed from: bi () void
   private void method_253() {
      switch (this.field_226) {
         case 0:
            if (field_229 > 40 || this.field_228) {
               this.field_226++;
               this.method_67();
               return;
            }
            break;
         case 1:
            if (field_229 > this.field_247 << 1 && field_229 > 40 || this.field_228) {
               this.field_226++;
               this.method_67();
               return;
            }
            break;
         case 2:
            if (field_229 > 40 || this.field_228) {
               this.field_226++;
               this.method_67();
               return;
            }
            break;
         case 3:
            if (field_229 > 10 || this.field_228) {
               this.field_226++;
               this.method_67();
               return;
            }
            break;
         case 4:
            if (field_229 > 10 || this.field_228) {
               this.field_226++;
               this.method_67();
               this.field_228 = false;
            }
         case 5:
      }
   }

   // $VF: renamed from: a (int) long
   private long method_254(int var1) {
      for (int var2 = 0; var2 < 12; var2++) {
         for (int var3 = 0; var3 < 12; var3++) {
            long var4;
            if ((var4 = field_514[var2][var3]) != 0L && method_413(var4, (byte)6, (byte)5) == var1) {
               return var4;
            }
         }
      }

      return -1L;
   }

   // $VF: renamed from: bj () void
   private void method_255() {
      long var1 = this.method_254(this.field_203);
      if ((this.field_203 == 0 || method_413(var1, (byte)11, (byte)3) > 1) && var1 >= 0L && (this.method_118(this.field_202, this.field_203 + 1) & 64) == 0) {
         field_537 = this.field_203 + 1;
         this.method_119(this.field_202, field_537, (byte)64);
         this.field_451 = true;
      } else {
         field_537 = this.field_203;
      }
   }

   // $VF: renamed from: bk () void
   private void method_256() {
      this.method_411();
   }

   // $VF: renamed from: d (int, int, int) void
   private void method_257(int var1, int var2, int var3) {
      int var4 = this.field_166 << 1;
      field_162[var4] = (byte)var1;
      field_162[var4 + 1] = (byte)var2;
      field_164[this.field_166] = (byte)var3;
      field_163[this.field_166] = 0;
      this.field_166 = this.field_166 + 1 & 7;
   }

   // $VF: renamed from: bl () void
   private void method_258() {
      this.field_201--;
      this.field_251++;
      if (this.field_201 >= 0) {
         this.method_350();
         this.field_242 = field_334[8];
         this.method_98();
         this.field_236 = 0;
         this.field_237 = 0;
         this.field_199 = this.field_200 = 0;
      } else {
         field_225 = 12;
      }
   }

   // $VF: renamed from: r (int) void
   private void method_259(int var1) {
      if (var1 >= 0) {
         byte var2 = field_452[var1];
         byte var3 = field_453[var1];
         int var4 = field_336[var2][var3] & 0xFF;
         int var5;
         if (((var5 = field_336[var2][var3] >> 8) & 240) == 0) {
            if (var4 != 7 || (var5 & 0xFF00) >> 8 != var1) {
               System.out.println("!!!!!!!!!!!!!! door missing");
            }

            int var6 = var5 & 15;
            if (--var6 == 0) {
               var5 = var5 & -241 | 16;
               this.method_300(var2, var3 - 1, 1, 0, 1);
               this.method_300(var2, var3 - 1, -1, 0, 1);
               int var7 = field_336[var2][var3 - 1] >> 8 | 512;
               field_336[var2][var3 - 1] = var7 << 8 | field_336[var2][var3 - 1] & 0xFF;
               field_340[var2][var3] = 24;
            } else {
               var5 = var5 & -16 | var6;
            }

            field_336[var2][var3] = var5 << 8 | var4;
            this.method_436(8);
         }
      }
   }

   // $VF: renamed from: i (int, int) void
   private static void method_260(int var0, int var1) {
      int var2;
      if (((var2 = field_336[var0][var1] >> 8) & 240) == 0) {
         var2 |= 16;
         field_336[var0][var1] = var2 << 8 | 7;
         field_340[var0][var1] = 24;
      }
   }

   // $VF: renamed from: j (int, int) void
   private void method_261(int var1, int var2) {
      int var3 = field_336[var1][var2] >> 8;
      if ((field_336[var1][var2] & 0xFF) == 7) {
         if ((var3 & 240) != 0) {
            if (field_338[var1][var2] != 32) {
               this.method_436(14);
               var3 &= -241;
               field_336[var1][var2] = var3 << 8 | 7;
               this.method_300(var1, var2 - 1, 1, 0, 0);
               this.method_300(var1, var2 - 1, -1, 0, 0);
               if (this.method_301(var1, var2)) {
                  this.field_244 = 0L;
                  this.field_257 = 0;
                  this.method_63(field_334[8], 48, 0);
                  this.method_436(2);
               } else {
                  switch (field_338[var1][var2]) {
                     case 0:
                     case 1:
                     case 19:
                     case 43:
                     case 45:
                        field_338[var1][var2] = -1;
                        this.method_149(var1, var2);
                        this.method_338(var1, var2);
                  }
               }

               field_340[var1][var2] = 24;
            }
         }
      }
   }

   // $VF: renamed from: s (int) void
   private void method_262(int var1) {
      if (var1 >= 0) {
         this.method_261(field_452[var1], field_453[var1]);
      }
   }

   // $VF: renamed from: bm () void
   private void method_263() {
      int var1 = (this.field_236 & 16384) == 0 ? 0 : 3;
      class_2 var2 = field_327[var1];
      int var3 = -1;
      boolean var4 = true;
      boolean var5 = false;
      boolean var6;
      if (var6 = var2.method_12()) {
         this.field_236 &= -8193;
      }

      label220: {
         int var15;
         if (var1 == 3) {
            if (!var6) {
               break label220;
            }

            this.field_236 &= -18433;
            var15 = this.method_264();
         } else {
            label215: {
               byte var10000;
               switch (var2.field_25) {
                  case 0:
                     var5 = true;
                     var15 = 0;
                     break label215;
                  case 1:
                  case 3:
                     if (var6) {
                        var3 = 0 + (this.field_236 & 7) - 1;
                     }

                     var5 = true;
                     break label220;
                  case 2:
                     var5 = true;
                     var15 = 2;
                     break label215;
                  case 4:
                  case 6:
                     if (!this.field_172) {
                        break label220;
                     }

                     var15 = var2.field_25;
                     break label215;
                  case 5:
                     if (this.field_172) {
                        break label220;
                     }

                     var15 = 24;
                     break label215;
                  case 7:
                     if (this.field_172) {
                        break label220;
                     }

                     var15 = 25;
                     break label215;
                  case 8:
                     if (this.field_172) {
                        break label220;
                     }

                     var15 = 26;
                     break label215;
                  case 9:
                     if (this.field_172) {
                        break label220;
                     }

                     var15 = 27;
                     break label215;
                  case 10:
                     if (!var6) {
                        this.field_244 = 40L;
                        break label220;
                     }

                     this.field_236 &= -2049;
                     var15 = this.method_264();
                     break label215;
                  case 11:
                     if (field_338[this.field_233][this.field_234 - 1] != -1) {
                        if (var6 && field_338[this.field_233][this.field_234 - 1] != -1) {
                           this.field_244 = 0L;
                           this.method_63(field_334[8], 32, 0);
                        }
                        break label220;
                     }

                     var10000 = 0;
                     break;
                  case 12:
                     if (this.field_260 < 160) {
                        this.field_260 += 12;
                     }
                     break label220;
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 28:
                  case 29:
                     if (!var6) {
                        if ((this.field_236 & 8192) == 0 && var2.field_26 == 2 && var2.field_27 == 0) {
                           int var11 = this.field_233 - field_329[this.field_236 & 7];
                           int var14 = this.field_234 - field_329[(this.field_236 & 7) + 8];
                           if (field_334[9] >= 8 && var2.field_26 == 2 && var2.field_27 == 0) {
                              this.method_257(var11, var14, -1);
                           }

                           this.method_233(var11, var14);
                           this.field_199 = 0;
                           field_171 = 0;
                        }
                        break label220;
                     }

                     field_171 = 0;
                     this.field_200 = 0;
                     this.field_235 = 0;
                     var10000 = 0;
                     break;
                  case 17:
                  case 18:
                     if (var6) {
                        var3 = 0 + (this.field_236 & 7) - 1;
                        this.field_235 = 0;
                     } else if (var2.field_26 > 0 && this.field_213 != -1) {
                        int var10 = (this.field_236 & 7) == 2 ? this.field_233 + 1 : this.field_233 - 1;
                        int var12 = field_336[var10][this.field_234] >> 8;
                        int var9 = field_336[var10][this.field_234] & 0xFF;
                        var12 |= 256;
                        if (var9 == 9) {
                           this.field_239--;
                        } else {
                           this.field_240--;
                        }

                        field_336[var10][this.field_234] = var12 << 8 | var9;
                        this.method_259(var12 & 0xFF);
                        this.field_213 = this.field_215 = -1;
                     }
                     break label220;
                  case 19:
                     if (var6) {
                        var4 = false;
                        this.method_258();
                     }
                     break label220;
                  case 20:
                  case 21:
                  case 22:
                  case 23:
                  case 30:
                  case 31:
                  case 32:
                  case 33:
                     if (var6) {
                        var4 = false;
                        field_171 = 0;
                     }
                     break label220;
                  case 24:
                     if (!this.field_172) {
                        break label220;
                     }

                     var15 = 5;
                     break label215;
                  case 25:
                     if (!this.field_172) {
                        break label220;
                     }

                     var15 = 7;
                     break label215;
                  case 26:
                     if (this.field_172) {
                        break label220;
                     }

                     var15 = 8;
                     break label215;
                  case 27:
                     if (this.field_172) {
                        break label220;
                     }

                     var15 = 9;
                     break label215;
                  case 34:
                     var5 = true;
                     var15 = 34;
                     break label215;
                  case 35:
                     var5 = true;
                     var15 = 35;
                     break label215;
                  case 36:
                  case 37:
                  case 38:
                  case 39:
                     if (!var6) {
                        break label220;
                     }

                     var10000 = 4;
                     break;
                  case 40:
                  case 48:
                     this.field_235 = 0;
                     this.field_199 = this.field_200 = 0;
                     if (var2.field_27 == 0) {
                        if (var2.field_26 == (var2.field_25 == 40 ? 12 : 6)) {
                           this.method_436(4);
                        }

                        if (var2.field_26 == (var2.field_25 == 40 ? 13 : 6)) {
                           this.method_324();
                        }
                     }

                     if (var2.method_12()) {
                        this.field_454 = System.currentTimeMillis();
                        var3 = 0 + (this.field_236 & 7) - 1;
                        this.field_213 = this.field_214 = this.field_215 = -1;
                     }
                     break label220;
                  case 41:
                  case 42:
                  case 43:
                  case 44:
                  case 45:
                  case 46:
                     if (var6) {
                        var3 = 0 + (this.field_236 & 7) - 1;
                        this.field_200 = this.field_199 = 0;
                        this.field_235 = 0;
                        field_171 = 0;
                     }
                     break label220;
                  case 47:
                     this.field_235 = 0;
                     this.field_199 = this.field_200 = 0;
                     if ((field_229 & 1) == 0) {
                        int var7 = this.field_233 - 2 + field_229 % 5;
                        int var8 = this.field_234 - 2 + field_229 % 3;
                        if (var7 == this.field_233 && (var8 == this.field_234 || var8 == this.field_234 - 1)) {
                           var7 += (field_229 >> 1 & 1) == 0 ? 1 : -1;
                        }

                        this.method_257(var7, var8, field_229 * 3 % 5);
                     }

                     if (var6) {
                        var3 = 0 + (this.field_236 & 7) - 1;
                        this.field_213 = this.field_214 = this.field_215 = -1;
                     }
                     break label220;
                  default:
                     var10000 = 36;
               }

               var15 = var10000 + (this.field_236 & 7) - 1;
            }
         }

         var3 = var15;
      }

      class_8 var16;
      int var10001;
      if (var5) {
         var16 = this;
         var10001 = this.field_197 - 1;
      } else {
         var16 = this;
         var10001 = 70;
      }

      var16.field_197 = var10001;
      if (var3 != -1) {
         this.method_214(var3);
      }

      if (var4) {
         var2.method_14();
      }

      this.field_97 = this.field_97 > 0 ? --this.field_97 : 0;
   }

   // $VF: renamed from: f () int
   private int method_264() {
      int var1 = 0;
      if (this.field_242 <= 0) {
         this.method_436(2);
         var1 = 12;
         this.field_243 = 80;
      } else {
         var1 = 0 + (this.field_236 & 7) - 1;
         this.field_236 = this.field_236 & -113 | 0;
         this.field_244 = 40L;
      }

      this.field_200 = 0;
      return var1;
   }

   // $VF: renamed from: t (int) void
   private static void method_265(int var0) {
      if (field_168) {
         field_362.field_94.vibrate(var0);
      }
   }

   // $VF: renamed from: bn () void
   private void method_266() {
      if (this.field_254 <= 0) {
         int var1 = this.field_257 > 0 ? 1 : -1;
         this.field_257 -= var1;
         if (this.field_257 != 0) {
            if (field_338[this.field_255][this.field_256] == 48) {
               int var2 = field_337[this.field_255][this.field_256];
               int var3 = this.field_256 + ((var2 & 8) == 0 ? -1 : 1);
               if (field_338[this.field_255 + var1][var3] >= 0) {
                  int var10000 = this.field_233;

                  while (true) {
                     int var4 = var10000 - var1;
                     if (field_338[var4][this.field_234] != 32) {
                        this.field_257 = 0;
                        return;
                     }

                     field_338[var4][this.field_234] = -1;
                     var10000 = var4;
                  }
               }

               field_338[this.field_255 + var1][var3] = field_338[this.field_255][var3];
               field_338[this.field_255][var3] = -1;
               field_337[this.field_255 + var1][var3] = field_337[this.field_255][var3];
               field_339[this.field_255][var3] = this.field_254;
            }

            field_338[this.field_255 + var1][this.field_256] = field_338[this.field_255][this.field_256];
            field_338[this.field_255][this.field_256] = -1;
            this.method_149(this.field_255, this.field_256);
            this.field_255 += var1;
            field_337[this.field_255][this.field_256] = this.field_252 | -2147483648;
            this.field_254 = 18;
            field_339[this.field_255][this.field_256] = this.field_254;
         } else {
            if (field_338[this.field_255][this.field_256] == 48) {
               int var5 = field_337[this.field_255][this.field_256];
               int var6 = this.field_256 + ((var5 & 8) == 0 ? -1 : 1);
               field_339[this.field_255][var6] = 0;
            } else {
               field_337[this.field_255][this.field_256] = this.field_253;
            }

            field_339[this.field_255][this.field_256] = 0;
            this.field_253 = -1;
            this.method_150(this.field_255, this.field_256);
         }

         method_348(this.field_255 - var1, this.field_256);
      } else {
         this.field_254 = (byte)(this.field_254 - 6);
         field_339[this.field_255][this.field_256] = this.field_254;
         if ((this.field_257 == 1 || this.field_257 == -1) && this.field_254 <= 6 && (this.field_236 & 112) == 0) {
            this.method_214((this.field_236 & 7) == 4 ? 23 : 21);
         }
      }
   }

   // $VF: renamed from: bo () void
   private void method_267() {
      int var1;
      class_8 var10000;
      int var10001;
      if ((var1 = field_229 % 89) < 15) {
         var10000 = this;
         var10001 = 0;
      } else if (var1 < 45) {
         var10000 = this;
         var10001 = 48 * (var1 - 15) / 30;
      } else if (var1 < 60) {
         var10000 = this;
         var10001 = 48;
      } else {
         var10000 = this;
         var10001 = 48 - 48 * (var1 - 60) / 30;
      }

      var10000.field_221 = var10001;
      this.field_222 = this.field_221 > 0 ? (this.field_221 - 1) / 24 + 2 : 1;
      if ((var1 = field_229 % 44) < 7) {
         var10000 = this;
         var10001 = 0;
      } else if (var1 < 22) {
         var10000 = this;
         var10001 = 48 * (var1 - 7) / 15;
      } else if (var1 < 30) {
         var10000 = this;
         var10001 = 48;
      } else {
         var10000 = this;
         var10001 = 48 - 48 * (var1 - 30) / 15;
      }

      var10000.field_223 = var10001;
      this.field_224 = this.field_223 > 0 ? (this.field_223 - 1) / 24 + 2 : 1;
   }

   // $VF: renamed from: bp () void
   private void method_268() {
      int var1 = field_341[this.field_210 << 1] - this.field_233;
      int var2 = field_341[(this.field_210 << 1) + 1] - this.field_234;
      if (this.field_177 == 2 && this.field_210 == 2) {
         var1 = 10;
         var2 = -8;
      }

      class_8 var10000;
      byte var10001;
      if (var2 == 0) {
         if (var1 < 0) {
            var10000 = this;
            var10001 = 12;
         } else {
            var10000 = this;
            var10001 = 4;
         }
      } else if (var1 == 0) {
         if (var2 < 0) {
            var10000 = this;
            var10001 = 0;
         } else {
            var10000 = this;
            var10001 = 8;
         }
      } else {
         int var3;
         if ((var3 = var1 * 128 / var2) > 0) {
            if (var3 < 128) {
               if (var1 > 0) {
                  var10000 = this;
                  var10001 = 7;
               } else {
                  var10000 = this;
                  var10001 = 15;
               }
            } else if (var3 > 128) {
               if (var1 > 0) {
                  var10000 = this;
                  var10001 = 5;
               } else {
                  var10000 = this;
                  var10001 = 13;
               }
            } else if (var1 > 0) {
               var10000 = this;
               var10001 = 6;
            } else {
               var10000 = this;
               var10001 = 14;
            }
         } else if (var3 > -128) {
            if (var1 < 0) {
               var10000 = this;
               var10001 = 9;
            } else {
               var10000 = this;
               var10001 = 1;
            }
         } else if (var3 < -128) {
            if (var1 < 0) {
               var10000 = this;
               var10001 = 11;
            } else {
               var10000 = this;
               var10001 = 3;
            }
         } else if (var1 < 0) {
            var10000 = this;
            var10001 = 10;
         } else {
            var10000 = this;
            var10001 = 2;
         }
      }

      var10000.field_181 = var10001;
   }

   // $VF: renamed from: bq () void
   private void method_269() {
      switch (this.field_177) {
         case 1:
            this.method_286();
            return;
         case 2:
            this.method_287();
            this.method_270();
            return;
         case 3:
            this.method_285();
            return;
         case 4:
            this.method_281();
            return;
         case 5:
            this.method_272();
      }
   }

   // $VF: renamed from: br () void
   private void method_270() {
      if (this.method_301(61, 3) && this.field_235 == 6) {
         this.method_257(this.field_233, this.field_234, 5);
         this.field_103 = false;
      }

      if (this.field_358 == null && (this.method_301(60, 3) || this.method_301(61, 3))) {
         this.method_108(true);
         this.field_383 = true;
         this.method_410();
         this.method_97();
         this.field_202 = 0;
         this.field_203 = 0;
         this.method_88();
      }

      if (this.field_216 == 2) {
         field_336[11][50] = -1;
      }
   }

   // $VF: renamed from: k (int, int) void
   private void method_271(int var1, int var2) {
      for (int var3 = -1; var3 < 2; var3++) {
         for (int var4 = -1; var4 < 2; var4++) {
            int var5 = (this.field_204 + var1) / 24 + var4;
            int var6 = (this.field_205 + var2) / 24 + var3;
            if (this.method_301(var5, var6)) {
               this.method_63(1, 48, 0);
            }
         }
      }
   }

   // $VF: renamed from: bs () void
   private void method_272() {
      class_2 var1 = field_327[5];
      class_2 var9;
      if (this.field_183 == 12) {
         if (this.field_184++ > 100) {
            this.field_183 = 15;
            this.method_338(11, 11);
         } else {
            this.field_357.method_7(7);
         }

         var9 = var1;
      } else {
         if (this.field_183 == -1) {
            if (this.field_233 * 24 >= 360) {
               this.field_183 = 10;
               var1.method_10(10);
               return;
            }

            return;
         }

         if (this.field_183 == 15 || this.field_183 == -1) {
            return;
         }

         byte var2 = -1;
         int var3 = this.field_233 * 24 + 12;
         int var4 = this.field_234 * 24;
         int var5 = this.field_188 + 24;
         if (this.field_183 == 13) {
            var2 = 13;
            if (var3 > var5) {
               this.field_457 = true;
            }
         }

         int var6 = this.field_185 > 0 && field_229 % this.field_185 == 0 ? 2 : 1;
         if (this.field_183 == 6 || this.field_183 == 7) {
            var6 = (field_229 & 11) == 0 ? 2 : var6;
         }

         if (!this.field_455 && (this.field_183 == 0 || this.field_183 == 1)) {
            class_8 var10;
            int var10001;
            if (this.field_183 == 0) {
               this.field_456 = 36;
               this.field_456 = ~this.field_456;
               var10 = this;
               var10001 = this.field_456 + 1;
            } else {
               var10 = this;
               var10001 = 36;
            }

            var10.field_456 = var10001;
            if (var4 < 504 && (var3 == var5 + this.field_456 || field_229 % 76 == 0)) {
               this.field_455 = true;
            }
         }

         while (var6-- > 0) {
            label300: {
               switch (this.field_183) {
                  case 0:
                     if (var4 >= 504 && var5 > 360) {
                        if (var3 < var5) {
                           var2 = 6;
                           this.field_183 = 6;
                        } else {
                           this.field_188--;
                        }
                     } else if (this.field_455) {
                        var2 = 2;
                        this.field_183 = 2;
                     } else if (var5 <= 360) {
                        var2 = 1;
                        this.field_183 = 1;
                     } else {
                        this.field_188--;
                     }
                     break label300;
                  case 1:
                     if (var4 >= 504 && var5 < 504) {
                        if (var3 < var5) {
                           this.field_188++;
                        } else {
                           var2 = 7;
                           this.field_183 = 7;
                        }
                     } else if (this.field_455) {
                        var2 = 3;
                        this.field_183 = 3;
                     } else if (var5 >= 504) {
                        var2 = 0;
                        this.field_183 = 0;
                     } else {
                        this.field_188++;
                     }
                     break label300;
                  case 2:
                     if (var1.field_26 == 5 && var1.field_27 == 0) {
                        this.field_258 = 30;
                     }

                     if (var1.method_12()) {
                        var2 = 10;
                        this.field_183 = 10;
                        this.field_455 = false;
                        this.field_456 = 0;
                     }

                     if (var1.field_26 < 7 || var4 >= 504 || var3 != var5 + this.field_456) {
                        break label300;
                     }
                     break;
                  case 3:
                     if (var1.field_26 == 5 && var1.field_27 == 0) {
                        this.field_258 = 30;
                     }

                     if (var1.method_12()) {
                        var2 = 11;
                        this.field_183 = 11;
                        this.field_455 = false;
                        this.field_456 = 0;
                     }

                     if (var1.field_26 < 7 || var4 >= 504 || var3 != var5 + this.field_456) {
                        break label300;
                     }
                     break;
                  case 4:
                  case 5:
                     if (var1.method_12()) {
                        this.field_183 = var2 = (byte)(this.field_183 == 4 ? 0 : 1);
                     }

                     this.field_455 = false;
                     this.field_456 = 0;
                     break label300;
                  case 6:
                     if (var4 >= 504) {
                        if (var3 >= var5 - 48) {
                           var2 = 8;
                           this.field_183 = 8;
                        } else {
                           this.field_188 -= 2;
                        }
                     } else if (var5 >= 360) {
                        var2 = 0;
                        this.field_183 = 0;
                     }
                     break label300;
                  case 7:
                     if (var4 >= 504) {
                        if (var3 <= var5 + 48) {
                           var2 = 9;
                           this.field_183 = 9;
                        } else {
                           this.field_188 += 2;
                        }
                     } else if (var5 <= 504) {
                        var2 = 1;
                        this.field_183 = 1;
                     }
                     break label300;
                  case 8:
                     if (var1.method_12()) {
                        var2 = 10;
                        this.field_183 = 10;
                     }

                     if (var1.field_26 < 4 || var4 < 504 || var3 < var5 - 48 || var3 > var5) {
                        break label300;
                     }
                     break;
                  case 9:
                     if (var1.method_12()) {
                        var2 = 11;
                        this.field_183 = 11;
                     }

                     if (var1.field_26 < 4 || var4 < 504 || var3 < var5 || var3 > var5 + 48) {
                        break label300;
                     }
                     break;
                  case 10:
                  case 11:
                     label349: {
                        class_8 var12;
                        byte var14;
                        if (var3 > var5 && var5 < 504) {
                           var12 = this;
                           var14 = 1;
                        } else {
                           if (var3 >= var5 || var5 <= 360) {
                              break label349;
                           }

                           var12 = this;
                           var14 = 0;
                        }

                        var2 = var14;
                        var12.field_183 = var14;
                     }

                     this.field_455 = false;
                     this.field_456 = 0;
                  case 12:
                  default:
                     break label300;
                  case 13:
                     if (var1.method_12()) {
                        var2 = 0;
                        this.field_183 = 0;
                        this.field_457 = false;
                     } else if (this.field_457) {
                        var1.method_14();
                     }
                     break label300;
               }

               this.method_63(1, 48, 0);
            }

            if (var4 >= 504 && var3 >= var5 - 24 && var3 <= var5 - 24) {
               this.method_63(1, 48, field_330[this.field_236 & 7]);
            }
         }

         if ((this.field_183 == 8 || this.field_183 == 9) && var1.field_26 == 5) {
            this.method_283();
         }

         if (this.field_183 != 6 && this.field_183 != 7) {
            for (int var7 = 21; var7 < 23; var7++) {
               for (int var8 = var5 / 24 - 1; var8 < var5 / 24 - 2 + 4; var8++) {
                  if (field_338[var8][var7] == 0) {
                     label214:
                     if ((field_337[var8][var7] & 7) == 3 && this.field_183 != 13) {
                        this.field_185--;
                        class_8 var13;
                        byte var15;
                        switch (this.field_183) {
                           case 0:
                           case 2:
                           case 4:
                           case 8:
                           case 10:
                              var13 = this;
                              var15 = 4;
                              break;
                           case 1:
                           case 3:
                           case 5:
                           case 9:
                           case 11:
                              var13 = this;
                              var15 = 5;
                              break;
                           case 6:
                           case 7:
                           default:
                              break label214;
                        }

                        var2 = var15;
                        var13.field_183 = var15;
                     }

                     field_338[var8][var7] = -1;
                     this.method_149(var8, var7);
                     field_338[var8][var7] = 30;
                     field_340[var8][var7] = 24;
                     field_337[var8][var7] = 4;
                     this.method_436(14);
                  }
               }
            }
         }

         if (this.field_185 <= 0) {
            this.field_183 = 12;
            this.field_184 = 0;
            var2 = 12;
         }

         if (var2 != -1) {
            var1.method_10(var2);
            return;
         }

         var9 = var1;
      }

      var9.method_14();
   }

   // $VF: renamed from: bt () void
   private void method_273() {
      int var1 = this.method_277();
      if (this.field_233 == var1 || this.field_233 == var1 + 1) {
         class_2 var2;
         int var3 = (var2 = field_327[5]).field_20 + -40;
         int var4 = var2.field_20 + 256;
         int var5 = (var2.field_24.field_75[var2.field_25] + var2.field_26) * 5;
         var5 = (var2.field_24.field_76[var5 + 3] << 0) * 1 / 1;
         var3 -= var5;
         var4 -= var5;
         int var6 = field_327[0].field_20;
         if (field_327[0].field_20 > var3 && var6 < var4 && !this.field_143) {
            this.method_63(1, 48, this.field_233 == var1 ? 4 : 2);
         }
      }
   }

   // $VF: renamed from: l (int, int) void
   private static void method_274(int var0, int var1) {
      if (var0 >= 0 && var1 >= 0) {
         field_338[var0][var1] = -1;
         field_338[var0 + 1][var1] = -1;
      }
   }

   // $VF: renamed from: m (int, int) void
   private static void method_275(int var0, int var1) {
      if (var0 >= 0 && var1 >= 0) {
         field_338[var0][var1] = 50;
         field_338[var0 + 1][var1] = 50;
      }
   }

   // $VF: renamed from: c (int, int) boolean
   private boolean method_276(int var1, int var2) {
      boolean var3 = false;

      for (int var4 = var1; var4 <= var1 + 1; var4++) {
         for (int var5 = var2; var5 >= var2 - 1; var5--) {
            if (field_338[var4][var5] == 0) {
               this.method_238(var4, var5);
               method_348(var4, var5);
               field_338[var4][var5] = -1;
               this.method_149(var4, var5);
               var3 = true;
            }
         }
      }

      return var3;
   }

   // $VF: renamed from: g () int
   private int method_277() {
      int var1 = this.field_186 > 0 ? 1 : 0;
      return 10 + this.field_186 * (2 + var1);
   }

   // $VF: renamed from: h () int
   private int method_278() {
      class_2 var1;
      int var2 = (var1 = field_327[5]).field_20 + -40;
      int var3 = (var1.field_24.field_75[var1.field_25] + var1.field_26) * 5;
      var3 = (var1.field_24.field_76[var3 + 3] << 0) * 1 / 1;
      int var4;
      var2 = (var4 = var2 - var3) + this.field_205;
      return this.field_209 * var2 / (this.field_209 * 24);
   }

   // $VF: renamed from: d () boolean
   private boolean method_279() {
      int var1 = this.method_277();
      int var2 = this.method_278();
      boolean var3 = false;

      for (int var4 = var1; var4 <= var1 + 1; var4++) {
         for (int var5 = var2; var5 <= 10; var5++) {
            if (field_338[var4][var5] == 0) {
               this.method_238(var4, var5);
               method_348(var4, var5);
               field_338[var4][var5] = -1;
               this.method_149(var4, var5);
               var3 = true;
            }
         }
      }

      return var3;
   }

   // $VF: renamed from: i () int
   private int method_280() {
      int var1;
      int var2 = (var1 = this.field_233 - 10) / 3;
      if (var1 == var2 * 3 + 2) {
         var2 += field_229 % 50 / 25;
      }

      return var2;
   }

   // $VF: renamed from: bu () void
   private void method_281() {
      if (this.field_183 == 5) {
         if (this.field_439) {
            return;
         }

         this.field_439 = true;
      }

      class_2 var1 = field_327[5];
      this.field_184++;
      byte var2 = -1;
      class_2 var3 = field_327[4];
      byte var4 = -1;
      int var5 = this.method_277();
      if (field_338[this.field_139][2] == -1) {
         field_338[this.field_139][2] = 31;
      }

      if (field_338[this.field_140][2] == -1) {
         field_338[this.field_140][2] = 31;
      }

      switch (this.field_183) {
         case 0:
            if (this.field_233 >= 10) {
               this.field_183 = 6;
               this.field_184 = 0;
            }
            break;
         case 1:
            boolean var14 = false;
            if (this.field_184 > 40) {
               this.field_183 = 2;
               this.field_184 = 0;
            } else if (this.field_184 > 20) {
               this.method_276(var5, 8);
               method_275(var5, 8);
               this.field_136 = var5;
               this.field_137 = 8;
            }
            break;
         case 2:
            boolean var13 = false;
            if (this.method_276(var5, 8)) {
               this.field_185--;
               this.field_142 = this.field_183;
               method_274(this.field_136, this.field_137);
               this.field_136 = -1;
               this.field_137 = -1;
               this.field_142 = this.field_183;
               this.field_183 = 3;
               var2 = 3;
               this.method_436(10);
            }

            if (this.field_184 > 15 && var1.field_25 != 6) {
               var2 = 6;
            }

            if (this.field_184 > 30) {
               this.field_183 = 4;
               this.field_184 = 0;
               var2 = 0;
               method_274(this.field_136, this.field_137);
               this.field_136 = -1;
               this.field_137 = -1;
            }
            break;
         case 3:
            boolean var12 = false;
            if (this.field_184 > 40) {
               if (this.field_185 > 0) {
                  if (this.field_142 == 10) {
                     this.field_183 = 9;
                     this.field_184 = 0;
                  } else if (this.field_142 == 2 || this.field_142 == 1) {
                     this.field_183 = 4;
                     this.field_184 = 0;
                     var2 = 2;
                  }
               } else {
                  this.field_183 = 7;
                  this.field_184 = 0;
               }
            }
            break;
         case 4:
            label109: {
               int var7 = this.field_185 <= 1 ? 5 : 10;
               byte var10000;
               if (this.field_184 >= var7) {
                  this.field_183 = 5;
                  this.field_184 = 0;
                  var10000 = 4;
               } else {
                  if (this.field_184 <= var7 >> 1 || var1.field_25 == 1) {
                     break label109;
                  }

                  var10000 = 1;
               }

               var2 = var10000;
            }

            this.method_279();
            this.method_273();
            break;
         case 5:
            int var8 = var1.field_20 + -40;
            int var9 = (var1.field_24.field_75[var1.field_25] + var1.field_26) * 5;
            var9 = (var1.field_24.field_76[var9 + 3] << 0) * 1 / 1;
            if ((var8 = var8 - var9) <= 72 - this.field_205 + 40) {
               this.field_145 = 0;
               this.method_283();
               this.field_183 = 10;
               this.field_136 = var5;
               this.field_137 = 4;
               method_275(this.field_136, this.field_137);
            }

            this.method_279();
            this.method_273();
            break;
         case 6:
            if (this.field_184 > 10) {
               this.field_183 = 1;
               var2 = 2;
               this.field_184 = 0;
            }
            break;
         case 7:
            method_274(this.field_136, this.field_137);
            this.field_136 = -1;
            this.field_137 = -1;
            if (this.field_184 > 80) {
               this.field_183 = 8;
               this.method_330();
            }

            if ((this.field_184 & 111) == 1) {
               this.method_436(7);
            }
         case 8:
         default:
            break;
         case 9:
            this.field_184 -= 2;
            this.method_273();
            int var10 = var1.field_20 + -40;
            int var11 = (var1.field_24.field_75[var1.field_25] + var1.field_26) * 5;
            var11 = (var1.field_24.field_76[var11 + 3] << 0) * 1 / 1;
            if ((var10 = var10 - var11) >= 240 - this.field_205 + 40) {
               this.field_183 = 6;
               this.field_184 = 0;
               this.field_186 = this.method_280();
            }
            break;
         case 10:
            this.field_184--;
            this.method_273();
            this.field_135++;
            if (this.field_135 == 28) {
               var2 = 7;
            }

            if (this.field_135 >= 50) {
               this.field_135 = 0;
               this.field_183 = 11;
               method_274(this.field_136, this.field_137);
               this.field_136 = -1;
               this.field_137 = -1;
               var2 = 8;
               var4 = 2;
               this.field_144 = true;
            }
            break;
         case 11:
            this.field_184--;
            this.field_135++;
            if (this.field_135 >= 12) {
               this.field_135 = 0;
               this.field_183 = 9;
               var2 = 4;
               this.field_143 = false;
               this.field_144 = false;
            } else if (!this.field_143) {
               this.method_282();
            }
      }

      if (var2 == -1) {
         var1.method_14();
      } else {
         var1.method_10(var2);
      }

      if (this.field_144) {
         if (var4 == -1) {
            var3.method_14();
            return;
         }

         var3.method_10(var4);
      }
   }

   // $VF: renamed from: bv () void
   private void method_282() {
      int var1 = this.method_277();
      if (this.field_234 == 4 && this.field_233 >= var1 - 3 && this.field_233 <= var1 + 4) {
         this.method_63(1, 64, this.field_233 == var1 ? 4 : 2);
         this.field_143 = true;
      }
   }

   // $VF: renamed from: bw () void
   private void method_283() {
      this.field_258 = 30;
      if (field_338[this.field_139][this.field_141] == -1) {
         field_338[this.field_139][this.field_138] = 0;
         method_348(this.field_139, this.field_138);
      }

      if (field_338[this.field_140][this.field_141] == -1) {
         field_338[this.field_140][this.field_138] = 0;
         method_348(this.field_140, this.field_138);
      }
   }

   // $VF: renamed from: bx () void
   private void method_284() {
      this.field_183 = -1;
      this.field_185 = 5;
   }

   // $VF: renamed from: by () void
   private void method_285() {
      class_2 var1 = field_327[5];
      int var2 = this.field_283;
      int var3 = this.field_284;
      int var4 = this.field_233 - 8;
      int var5 = this.field_233 + 8;
      int var6 = this.field_234 + 8;
      int var7 = this.field_234 - 8;

      for (int var8 = 15; var8 <= 22; var8++) {
         for (int var9 = 14; var9 <= 21; var9++) {
            if ((var9 <= var4 || var9 >= var5 || var8 <= var6 || var8 >= var7) && field_338[var9][var8] == 44) {
               this.field_283 = var9;
               this.field_284 = var8;
               this.method_317();
            }
         }
      }

      this.field_283 = var2;
      this.field_284 = var3;
      if (this.field_242 == 0) {
         this.method_284();
      }

      class_2 var20;
      if (this.field_183 == 12) {
         if (this.field_184++ > 100) {
            this.field_183 = 15;
            this.method_338(11, 11);
         } else {
            this.field_357.method_7(7);
         }

         var20 = var1;
      } else {
         if (this.field_183 == -1) {
            if (this.field_233 * 24 >= 336) {
               this.field_183 = 0;
               var1.method_10(0);
               return;
            }

            return;
         }

         if (this.field_183 == 15 || this.field_183 == -1) {
            return;
         }

         byte var17 = -1;
         int var18 = this.field_233 * 24 + 12;
         int var10 = this.field_234 * 24;
         int var11 = this.field_187 + 24;
         if (this.field_458 == 0L && this.field_242 != 0) {
            this.field_458 = field_229 + class_4.method_24(340, 441);
         }

         int var12 = this.field_185 > 0 && field_229 % this.field_185 == 0 ? 2 : 1;
         if (this.field_183 == 10 || this.field_183 == 11) {
            var12 = (field_229 & 11) == 0 ? 2 : var12;
         }

         while (var12-- > 0) {
            switch (this.field_183) {
               case 0:
                  if (var11 > 360) {
                     var17 = 4;
                     this.field_183 = 4;
                  } else {
                     var17 = 5;
                     this.field_183 = 5;
                  }
                  break;
               case 1:
                  if (var11 < 504) {
                     var17 = 5;
                     this.field_183 = 5;
                  } else {
                     var17 = 4;
                     this.field_183 = 4;
                  }
                  break;
               case 2:
                  if (var1.method_12()) {
                     if (field_229 > this.field_458) {
                        var17 = 13;
                        this.field_183 = 13;
                     } else {
                        var17 = 4;
                        this.field_183 = 4;
                     }
                  }
                  break;
               case 3:
                  if (var1.method_12()) {
                     if (field_229 > this.field_458) {
                        var17 = 14;
                        this.field_183 = 14;
                     } else {
                        var17 = 5;
                        this.field_183 = 5;
                     }
                  }
                  break;
               case 4:
                  if (field_229 > this.field_458) {
                     var17 = 13;
                     this.field_183 = 13;
                  } else {
                     if (var10 >= 504 && var18 < var11 && this.field_187 - 48 >= 360) {
                        var17 = 10;
                        this.field_183 = 10;
                     }

                     if (var11 <= 360) {
                        var17 = 5;
                        this.field_183 = 5;
                     }

                     if (this.field_183 == 4) {
                        this.field_187--;
                     }
                  }
                  break;
               case 5:
                  if (field_229 > this.field_458) {
                     var17 = 14;
                     this.field_183 = 14;
                  } else {
                     if (var10 >= 504 && var18 > var11 && this.field_187 + 48 <= 504) {
                        var17 = 11;
                        this.field_183 = 11;
                     }

                     if (var11 >= 504) {
                        var17 = 4;
                        this.field_183 = 4;
                     }

                     if (this.field_183 == 5) {
                        this.field_187++;
                     }
                  }
                  break;
               case 6:
               case 7:
               case 13:
               case 14:
                  byte var14;
                  byte var15;
                  byte var16;
                  label272: {
                     var14 = 0;
                     var15 = 0;
                     var16 = 0;
                     byte var22;
                     switch (this.field_183) {
                        case 6:
                        case 13:
                           var14 = 4;
                           var15 = 2;
                           var22 = 1;
                           break;
                        case 7:
                        case 14:
                           var14 = 5;
                           var15 = 1;
                           var22 = 2;
                           break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        default:
                           break label272;
                     }

                     var16 = var22;
                  }

                  if (var1.field_26 == 5 && var1.field_27 == 0) {
                     class_8 var23;
                     byte var10001;
                     if (this.field_183 != 13 && this.field_183 != 14) {
                        var23 = this;
                        var10001 = 10;
                     } else {
                        var23 = this;
                        var10001 = 80;
                     }

                     var23.field_258 = var10001;
                  }

                  if (var1.method_12()) {
                     if (this.field_183 == 13 || this.field_183 == 14) {
                        this.field_459 = field_229 + 40;
                        this.field_458 = field_229 + class_4.method_24(340, 441);
                     }

                     var17 = var14;
                     this.field_183 = var14;
                  }

                  if (var1.field_26 >= 5 && var10 >= 504 && var18 >= var11 - var15 * 24 && var18 <= var11 + var16 * 24) {
                     this.method_63(1, 48, 4);
                  }
               case 8:
               case 9:
               case 12:
               default:
                  break;
               case 10:
                  if (var1.method_12()) {
                     this.field_258 = 10;
                     var11 = this.field_187 + 24;
                     if (field_229 > this.field_458) {
                        var17 = 13;
                        this.field_183 = 13;
                     } else if (var10 >= 504) {
                        if (var18 >= var11 - 48) {
                           var17 = 6;
                           this.field_183 = 6;
                        }
                     } else {
                        var17 = 4;
                        this.field_183 = 4;
                     }
                  } else {
                     this.field_187 -= 2;
                  }
                  break;
               case 11:
                  if (var1.method_12()) {
                     this.field_258 = 10;
                     var11 = this.field_187 + 24;
                     if (field_229 > this.field_458) {
                        var17 = 14;
                        this.field_183 = 14;
                     } else if (var10 >= 504) {
                        if (var18 <= var11 + 48) {
                           var17 = 7;
                           this.field_183 = 7;
                        }
                     } else {
                        var17 = 5;
                        this.field_183 = 5;
                     }
                  } else {
                     this.field_187 += 2;
                  }
            }

            if (var10 >= 504 && var18 >= var11 - 24 && var18 <= var11 + 24) {
               this.method_63(1, 48, field_330[this.field_236 & 7]);
            }

            if (this.field_185 <= 0) {
               this.field_183 = 12;
               this.field_184 = 0;
               return;
            }
         }

         label239:
         if (this.field_314 == 5) {
            int[] var24;
            byte var26;
            if (this.field_315 <= 0) {
               if (this.field_185 <= 2) {
                  field_338[10][16] = 45;
                  field_340[10][16] = 24;
                  field_339[10][16] = 0;
                  field_337[10][16] = 0;
               }

               field_338[26][19] = 45;
               field_340[26][19] = 24;
               field_339[26][19] = 0;
               var24 = field_337[26];
               var26 = 19;
            } else {
               field_338[10][19] = 45;
               field_340[10][19] = 24;
               field_339[10][19] = 0;
               field_337[10][19] = 0;
               if (this.field_185 > 2) {
                  break label239;
               }

               field_338[26][16] = 45;
               field_340[26][16] = 24;
               field_339[26][16] = 0;
               var24 = field_337[26];
               var26 = 16;
            }

            var24[var26] = 0;
         }

         if (this.field_183 != 10 && this.field_183 != 11) {
            for (int var13 = 21; var13 < 23; var13++) {
               for (int var19 = var11 / 24 - 1; var19 < var11 / 24 - 2 + 4; var19++) {
                  if (field_338[var19][var13] == 9) {
                     label222:
                     if ((field_337[var19][var13] & 7) == 3) {
                        this.field_185--;
                        class_8 var25;
                        byte var27;
                        switch (this.field_183) {
                           case 0:
                           case 2:
                           case 4:
                           case 6:
                              var25 = this;
                              var27 = 2;
                              break;
                           case 1:
                           case 3:
                           case 5:
                           case 7:
                              var25 = this;
                              var27 = 3;
                              break;
                           default:
                              break label222;
                        }

                        var17 = var27;
                        var25.field_183 = var27;
                     }

                     field_338[var19][var13] = -1;
                     this.method_149(var19, var13);
                     field_338[var19][var13] = 30;
                     field_340[var19][var13] = 24;
                     field_337[var19][var13] = 4;
                     this.method_436(14);
                  }
               }
            }
         }

         if (var17 != -1) {
            var1.method_10(var17);
            return;
         }

         var20 = var1;
      }

      var20.method_14();
   }

   // $VF: renamed from: bz () void
   private void method_286() {
      if (field_338[18][63] == 0 && field_339[18][63] <= 0 && this.field_180 == 0) {
         this.field_258 = 120;
         this.field_180++;
      }

      label60: {
         class_2 var10000;
         byte var10001;
         if (this.field_180 == 3) {
            if (field_327[2].field_25 != 0) {
               if (field_327[2].field_25 == 1 && field_327[2].method_12()) {
                  field_327[2].method_10(2);
                  if (this.field_234 == this.field_209 - 4) {
                     this.field_179 = 817;
                  }
               }
               break label60;
            }

            var10000 = field_327[2];
            var10001 = 1;
         } else {
            if (field_327[2].field_25 == 0) {
               break label60;
            }

            var10000 = field_327[2];
            var10001 = 0;
         }

         var10000.method_10(var10001);
      }

      field_327[2].method_14();
      if (field_327[2].field_25 == 2) {
         field_327[1].method_14();
         if (this.field_258 == 10) {
            this.field_258 = 60;
         }

         if (field_327[1].field_25 == 0) {
            if ((this.field_358 == null || this.field_179 < 46) && this.field_179 < 1704) {
               this.field_179++;
               int var1 = this.field_209 * 24 - (this.field_205 + 320 - 80);
               if (this.field_179 < var1) {
                  this.field_179 = var1;
               }
            }

            if (this.field_209 * 24 - this.field_179 <= this.field_234 * 24 + 18 && this.field_233 < 17) {
               this.method_63(field_334[8], 64, 1);
               return;
            }
         } else if (field_327[1].method_12()) {
            field_327[1].method_10(0);
         }
      }
   }

   // $VF: renamed from: bA () void
   private void method_287() {
      if (field_336 != null && this.method_213() && (field_336[this.field_233][this.field_234] & 0xFF) == 0) {
         int var1;
         if ((var1 = field_336[this.field_233][this.field_234] >> 8) == 13) {
            this.field_189 = true;
         } else if (var1 == 16) {
            this.field_190 = true;
         }
      }

      if (!this.field_191 && this.field_235 <= 0 && this.method_301(46, 7)) {
         this.field_192 = true;
         this.field_191 = true;
      }
   }

   // $VF: renamed from: c () void
   public final void method_288() {
      byte var1;
      int var4;
      int var5;
      label58: {
         var1 = (this.field_236 & 4096) == 0 ? this.field_200 : 0;
         int var2 = this.field_233 * 24 + this.field_235 * field_329[var1];
         var4 = 24 * this.field_208 - 240;
         var5 = 24 * this.field_209 - 240;
         class_8 var10000;
         int var10001;
         if (var2 < this.field_206 + 96) {
            this.field_206 = this.field_206 - 96 + var2 >> 1;
            if (this.field_206 >= 0) {
               break label58;
            }

            var10000 = this;
            var10001 = 0;
         } else {
            if (var2 <= this.field_206 + 120) {
               break label58;
            }

            this.field_206 = this.field_206 - 120 + var2 >> 1;
            if (this.field_206 <= var4) {
               break label58;
            }

            var10000 = this;
            var10001 = var4;
         }

         var10000.field_206 = var10001;
      }

      int var6;
      if ((var6 = this.field_234 * 24 + this.field_235 * field_329[var1 + 8] + 40) < this.field_207 + 96) {
         this.field_207 = this.field_207 - 96 + var6 >> 1;
         if (this.field_207 < 0) {
            this.field_207 = 0;
         }
      }

      if (var6 > this.field_207 + 160) {
         this.field_207 = this.field_207 - 160 + var6 >> 1;
         if (this.field_207 > var5) {
            this.field_207 = var5;
         }
      }

      label45: {
         this.field_204 = this.field_206;
         this.field_205 = this.field_207;
         class_8 var7;
         int var9;
         if (this.field_204 < 0) {
            var7 = this;
            var9 = 0;
         } else {
            if (this.field_204 <= var4) {
               break label45;
            }

            var7 = this;
            var9 = var4;
         }

         var7.field_204 = var9;
      }

      class_8 var8;
      class_8 var10;
      int var10002;
      if (this.field_205 < 0) {
         var8 = this;
         var10 = this;
         var10002 = 0;
      } else {
         if (this.field_205 <= var5) {
            return;
         }

         var8 = this;
         var10 = this;
         var10002 = var5;
      }

      var8.field_205 = var10.field_207 = var10002;
   }

   // $VF: renamed from: a (int, int, boolean, byte) void
   private void method_289(int var1, int var2, boolean var3, byte var4) {
      int var5 = var3 ? var1 + 1 : var1 - 1;
      int var6 = field_337[var1][var2];
      field_338[var5][var2] = var4;
      field_338[var1][var2] = -1;
      field_339[var5][var2] = 18;
      int var10000;
      short var10001;
      if (var3) {
         var10000 = (var6 & -8 | 2) & -3073;
         var10001 = 1024;
      } else {
         var10000 = (var6 & -8 | 4) & -3073;
         var10001 = 2048;
      }

      var6 = var10000 | var10001;
      field_337[var5][var2] = var6 & -513 | -2147483648;
      method_348(var5, var2);
      this.method_149(var1, var2);
   }

   // $VF: renamed from: b (int, int, byte) void
   private void method_290(int var1, int var2, byte var3) {
      if ((field_336[var1][var2] & 0xFF) == var3) {
         field_336[var1][var2] = -1;
         this.method_290(var1 - 1, var2, var3);
         this.method_290(var1 + 1, var2, var3);
         this.method_290(var1, var2 - 1, var3);
         this.method_290(var1, var2 + 1, var3);
      }
   }

   // $VF: renamed from: a (int, int, boolean) boolean
   private boolean method_291(int var1, int var2, boolean var3) {
      boolean var4 = false;
      int var5 = this.field_236;
      int var6 = this.field_233;
      int var7 = this.field_234;
      byte var8 = this.field_200;
      boolean var9 = this.field_241;
      int var10 = this.field_245;
      int var11 = this.field_235;
      int var12 = this.field_243;
      int var10000;
      byte var10001;
      if (var1 > 0) {
         var10000 = var5 & -8;
         var10001 = 2;
      } else if (var1 < 0) {
         var10000 = var5 & -8;
         var10001 = 4;
      } else if (var2 < 0) {
         var10000 = var5 & -8;
         var10001 = 1;
      } else {
         var10000 = var5 & -8;
         var10001 = 3;
      }

      var5 = var10000 | var10001;
      int var13 = var6 + var1;
      int var14 = var7 + var2;
      boolean var15 = false;
      boolean var16 = false;
      class_8 var37 = null, var38 = null;
      if (var13 >= 0 && var13 < this.field_208 && var14 >= 0 && var14 < this.field_209) {
         if (field_505 != null && field_505[var13][var14] != 0 && field_334[10] == 0) {
            var15 = false;
            var4 = true;
         }

         label326: {
            boolean var36;
            switch ((byte)(field_336[var13][var14] & 0xFF)) {
               case 1:
                  if (!var3) {
                     this.field_258 = 120;
                     this.field_180++;
                     this.method_290(var13, var14, (byte)1);
                  }
                  break label326;
               case 2:
                  if (var3) {
                     break label326;
                  }

                  label321: {
                     label320: {
                        var16 = true;
                        switch (field_336[var13][var14] >> 8) {
                           case 0:
                              if (field_334[9] >= 1) {
                                 this.field_211 = 7;
                                 var38 = this;
                                 var10001 = 0;
                                 break label321;
                              }

                              var37 = this;
                              break;
                           case 1:
                              if (field_334[9] >= 2) {
                                 var37 = this;
                                 var10001 = 7;
                                 break label320;
                              }

                              var37 = this;
                              break;
                           default:
                              break label326;
                        }

                        var10001 = 13;
                     }

                     var37.field_211 = var10001;
                     var38 = this;
                     var10001 = 1;
                  }

                  var38.field_212 = var10001;
                  break label326;
               case 3:
                  if (field_336[var13][var14] >> 8 < 3) {
                     var15 = true;
                     break label326;
                  }

                  var15 = false;
                  var36 = true;
                  break;
               case 4:
                  int var18;
                  if (!var3 && (var18 = (field_336[var13][var14] & -256) >> 8) >= this.field_210) {
                     this.field_238 = true;
                     this.field_210 = var18 + 1;
                     this.field_178 = field_229 + 13;
                  }
                  break label326;
               case 5:
                  var15 = true;
                  if (!var3) {
                     var9 = true;
                     this.field_556 = true;
                  }
               case 6:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               case 17:
               case 18:
               case 20:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 26:
               case 27:
               default:
                  break label326;
               case 7:
                  if ((field_336[var13][var14] >> 8 & 240) >> 4 >= 2) {
                     break label326;
                  }

                  var36 = true;
                  break;
               case 19:
                  if (var3) {
                     break label326;
                  }

                  int var19 = var13 + 3;
                  int var20 = var14;

                  while (field_338[var19][var20] != 39) {
                     var20--;
                  }

                  if (!this.field_158) {
                     this.method_374();
                  }

                  this.field_158 = true;
                  this.field_479 = false;
                  if (field_505 == null) {
                     field_505 = new int[this.field_208][this.field_209];
                  }

                  this.method_375((byte)field_337[var19][var20], (byte)var19, (byte)var20, (byte)0);
                  this.method_403(var19, var20);
                  var19 = var13;

                  while (true) {
                     if ((field_336[var19][++var20] & 0xFF) != 19) {
                        break label326;
                     }

                     field_336[var19][var20] = -1;
                  }
               case 28:
                  if (!var3) {
                     var9 = true;
                     this.field_556 = false;
                  }
                  break label326;
            }

            var4 = var36;
         }

         if (!var4) {
            byte var30;
            switch (var30 = field_338[var13][var14]) {
               case -1:
                  label359: {
                     boolean var40;
                     if (var13 != 0 && var14 != 0 && var13 != this.field_208 - 1 && var14 != this.field_209 - 1) {
                        if ((
                              var1 != 0 && field_338[var13][var7 + 1] == 0 && (field_337[var13][var7 + 1] & 7) == 3
                                 || this.field_221 >= 24
                                    && (
                                       field_338[var13][var14 - 1] == 28 && (field_337[var13][var14 - 1] & 8) == 0
                                          || field_338[var13][var14 + 1] == 28 && (field_337[var13][var14 + 1] & 8) == 0
                                    )
                                 || this.field_223 >= 24 && (field_338[var13][var14 - 1] == 28 || field_338[var13][var14 + 1] == 28)
                           )
                           && !var3) {
                           var8 = 0;
                           break label359;
                        }

                        var40 = true;
                     } else {
                        var40 = true;
                     }

                     var15 = var40;
                  }

                  var5 &= -9;
                  break;
               case 0:
               case 8:
               case 9:
               case 47:
                  int var32 = var6 + (var1 << 1);
                  int var33 = var7 + (var2 << 1);
                  if (this.field_177 == 4) {
                     int var22 = this.method_277();
                     if (var32 == var22 || var32 == var22 + 1) {
                        int var23 = this.method_278();
                        if (var33 >= var23) {
                           var5 |= 8;
                           this.method_214((var5 & 7) == 2 ? 8 : 9);
                           return false;
                        }
                     }
                  }

                  var10--;
                  int var34 = field_336[var32][var33] & 0xFF;
                  int var35 = field_336[var32][var33] >> 8;
                  byte var24 = field_338[var13][var7 + 1];
                  if ((var10 < 0 || var3)
                     && var1 != 0
                     && method_312(var32, var33)
                     && (var34 != 7 || (var35 & 240) != 0)
                     && (var24 != 19 && var24 != 45 && var24 != 49 && var24 != 43 || (field_336[var13][var7 + 1] & 0xFF) == 35)) {
                     if (!var3) {
                        this.method_289(var13, var14, var1 > 0, var30);
                     }

                     var15 = true;
                     var5 |= 8;
                  } else {
                     if (var1 != 0) {
                        var5 |= 8;
                     }

                     var8 = 0;
                     field_337[var13][var14] = field_337[var13][var14] & -8 | 0;
                  }
                  break;
               case 1:
               case 2:
               case 4:
               case 5:
               case 6:
               case 7:
               case 11:
               case 14:
               case 19:
               case 24:
               case 26:
               case 27:
               case 33:
               case 40:
               case 41:
               case 42:
               case 43:
               case 45:
               case 50:
               case 51:
               case 52:
               case 53:
                  var15 = true;
                  break;
               case 3:
               case 12:
               case 13:
               case 15:
               case 16:
               case 17:
               case 18:
               case 20:
               case 21:
               case 22:
               case 23:
               case 25:
               case 29:
               case 30:
               case 32:
               case 36:
               case 37:
               case 38:
               case 39:
               case 44:
               case 46:
               default:
                  var1 = 0;
                  var15 = false;
                  if (this.field_200 == 4 || this.field_200 == 2) {
                     this.method_214(0 + this.field_200 - 1);
                  }
                  break;
               case 10:
                  if (this.field_492 == 3) {
                     if (!var3 && field_337[var13][var14] <= 0) {
                        field_337[var13][var14] = 1;
                     }

                     var15 = true;
                  }
                  break;
               case 28:
                  var8 = 0;
                  var5 &= -9;
                  break;
               case 31:
               case 49:
                  var15 = false;
                  break;
               case 34:
               case 35:
                  var15 = var3;
                  break;
               case 48:
                  int var31 = var6 + (var1 << 1);
                  int var21 = var7 + (var2 << 1);
                  var10--;
                  byte var25;
                  byte var39;
                  if ((field_337[var13][var14] & 8) != 0) {
                     var25 = 0;
                     var39 = 1;
                  } else {
                     var25 = -1;
                     var39 = 0;
                  }

                  byte var26 = var39;
                  if ((var10 < 0 || var3)
                     && var1 != 0
                     && field_338[var31][var21 + var25] < 0
                     && field_338[var31][var21 + var26] < 0
                     && field_338[var13][var14 + var26 + 1] >= 0) {
                     if (!var3) {
                        field_338[var31][var21 + var25] = var30;
                        field_338[var31][var21 + var26] = var30;
                        field_338[var13][var14 + var25] = -1;
                        field_338[var13][var14 + var26] = -1;
                        field_337[var31][var21 + var25] = field_337[var13][var14 + var25];
                        field_337[var31][var21 + var26] = field_337[var13][var14 + var26] & -16 | (var1 > 0 ? 2 : 4);
                        field_339[var31][var21 + var26] = 18;
                        field_340[var31][var21 + var25 - 1] = 48;
                        field_340[var31][var21 + var25 - 1] = 48;
                        field_340[var31][var21 + var25 - 1] = 48;
                        method_348(var31, var21 + var26);
                     }

                     var15 = true;
                     var5 |= 8;
                  } else {
                     if (var1 != 0) {
                        var5 |= 8;
                     }

                     var8 = 0;
                  }
            }
         }
      } else {
         var15 = true;
      }

      if (!var3 && var15 && !var16) {
         this.field_211 = -1;
      }

      if (var15 && var12 == 0) {
         var11 = 18;
         var6 += var1;
         var7 += var2;
         if ((var5 & 8) == 0 && !var3) {
            this.method_214(4 + var8 - 1);
         }
      } else if (var1 != 0 && !var3) {
         var5 |= 8;
      }

      if ((var5 & 8) != 0 && !var3) {
         this.method_214((var5 & 7) == 2 ? 8 : 9);
      }

      if (!var3) {
         this.field_236 = var5;
         this.field_233 = var6;
         this.field_234 = var7;
         this.field_200 = var8;
         this.field_241 = var9;
         this.field_245 = var10;
         this.field_235 = var11;
         this.field_243 = var12;
      }

      return var15;
   }

   // $VF: renamed from: d () void
   public static void method_292() {
      field_225 = 3;
   }

   // $VF: renamed from: bB () void
   private void method_293() {
      field_225 = 2;
      field_434 = true;
      this.method_65(1);
      this.method_98();
      if (field_324[18] == null) {
         field_324[18] = method_357("/ui.f", 3);
      }
   }

   // $VF: renamed from: e () void
   public final void method_294() {
      this.field_462 = System.currentTimeMillis() - this.field_231;
      this.field_460 = true;
      System.out.println(class_1.method_9());
      if ((field_225 == 30 || field_225 == 4) && class_1.method_9()) {
         this.field_461 = true;
      }

      this.field_357.method_8();
   }

   public final void showNotify() {
      if (this.field_460) {
         this.method_295();
      }
   }

   public final void hideNotify() {
      if (!this.field_460) {
         this.method_294();
      }
   }

   // $VF: renamed from: f () void
   public final void method_295() {
      this.field_460 = false;
      field_434 = true;
      field_435 = true;
      this.field_99 = true;
      field_171 = 0;
      this.field_430 = -1;
      if (this.field_266 == 7) {
         this.field_268 = 0;
      }

      this.field_231 = System.currentTimeMillis() - this.field_462;
      class_8 var10000;
      switch (field_225) {
         case 0:
         case 6:
         case 12:
         case 22:
            return;
         case 1:
            this.method_98();
            if (field_371) {
               return;
            }

            if (this.field_358 != null) {
               return;
            }

            if (this.field_198 != 0) {
               return;
            }

            if (this.field_241) {
               return;
            }

            if (this.field_242 <= 0) {
               return;
            }

            if (field_327[0].field_25 == 19) {
               return;
            }

            if (this.field_342) {
               return;
            }

            this.method_293();
            return;
         case 2:
            field_518 = null;
            this.field_173 = true;
            if (this.field_266 == 1) {
               this.field_268 = 0;
               return;
            }

            return;
         case 3:
         case 13:
         case 14:
         case 24:
         case 29:
         case 32:
         default:
            return;
         case 4:
         case 30:
            if (this.field_461) {
               this.field_357.method_7(19);
               return;
            }

            return;
         case 5:
            this.field_392 = true;
            return;
         case 7:
            this.field_268 = 1;
            return;
         case 8:
            return;
         case 9:
         case 28:
            return;
         case 10:
            field_435 = false;
            return;
         case 11:
            this.field_270 = 6;
            return;
         case 15:
            var10000 = this;
            break;
         case 16:
            this.field_201 = 0;
            this.field_249 = 0;
            this.field_182 = false;
            this.field_170 = 0;
            this.field_333 = true;
            return;
         case 17:
            return;
         case 18:
         case 25:
         case 26:
            var10000 = this;
            break;
         case 19:
            return;
         case 20:
            return;
         case 21:
            this.method_411();
            return;
         case 23:
            return;
         case 27:
            this.field_562 = true;
            this.field_113 = true;
            return;
         case 31:
            this.field_391 = true;
            return;
         case 33:
            var10000 = this;
      }

      var10000.field_562 = true;
   }

   // $VF: renamed from: bC () void
   private void method_296() {
      if (this.field_158) {
         for (int var1 = 0; var1 < this.field_208; var1++) {
            for (int var2 = 0; var2 < this.field_209; var2++) {
               if (field_338[var1][var2] == 38) {
                  this.method_375((byte)field_337[var1][var2], (byte)var1, (byte)var2, (byte)0);
                  this.field_485++;
               }
            }
         }
      }
   }

   // $VF: renamed from: n (int, int) void
   private void method_297(int var1, int var2) {
      this.field_331 |= 4194304L;
      field_336[var1][var2] = field_336[var1][var2] & -256;
      field_336[var1][var2] = field_336[var1][var2] | 14;
   }

   // $VF: renamed from: e () boolean
   private boolean method_298() {
      return this.field_177 == 4 || this.field_177 == 5 || this.field_177 == 3;
   }

   // $VF: renamed from: bD () void
   private void method_299() {
      Hashtable var1 = new Hashtable();
      Hashtable var2 = new Hashtable();
      Hashtable var3 = new Hashtable();
      this.field_174 = 0;
      this.field_175 = 0;
      int var4 = 0;
      this.field_246 = 0;
      this.field_272 = 0;
      int var5 = 0;
      int var6 = 0;
      this.field_463 = false;
      this.field_464 = false;
      this.field_465 = false;
      this.field_196 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < this.field_208; var8++) {
         for (int var9 = 0; var9 < this.field_209; var9++) {
            field_339[var8][var9] = 0;
            field_340[var8][var9] = 0;
            int var10 = field_336[var8][var9];
            int var11 = field_337[var8][var9];
            byte var12 = field_338[var8][var9];
            if (var10 != -1) {
               label373:
               switch (var10 & 0xFF) {
                  case 0:
                     var7++;
                     field_336[var8][var9] = var11 << 8 | var10 & 0xFF;
                     break;
                  case 2:
                     this.field_331 |= 1048576L;
                     switch (var11) {
                        case 0:
                        case 1:
                           this.field_331 |= 524288L;
                        default:
                           field_336[var8][var9] = var11 << 8 | 2;
                           break label373;
                     }
                  case 3:
                     field_340[var8][var9] = 127;
                     if (var11 > 0) {
                        field_336[var8][var9] = var11 + 1 << 8 | 3;
                     }
                     break;
                  case 4:
                     var5++;
                     this.field_331 |= 16L;
                     field_336[var8][var9] = var11 << 8 | var10 & 0xFF;
                     break;
                  case 5:
                     this.field_311 = (byte)var11;
                     break;
                  case 6:
                     Integer var34 = new Integer(var11);
                     Integer var40;
                     var40 = (var40 = (Integer)var1.get(var34)) == null ? new Integer(1) : new Integer(var40 + 1);
                     var1.put(var34, var40);
                     this.field_331 |= 536870912L;
                     field_336[var8][var9] = var11 << 8 | 6;
                     break;
                  case 7:
                     if (var11 != -1) {
                        field_452[var11] = (byte)var8;
                        field_453[var11] = (byte)var9;
                     }

                     field_336[var8][var9] = var11 << 8 | var10;
                     break;
                  case 8:
                     this.field_464 = true;
                  case 9:
                     if ((var10 & 0xFF) != 8) {
                        this.field_463 = true;
                     }

                     this.field_331 |= 268435456L;
                     Integer var33 = new Integer(var11);
                     Integer var38;
                     var38 = (var38 = (Integer)var1.get(var33)) == null ? new Integer(1) : new Integer(var38 + 1);
                     var1.put(var33, var38);
                     field_336[var8][var9] = var11 << 8 | var10;
                     break;
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 15:
                  case 16:
                  case 18:
                  case 20:
                  case 21:
                  case 22:
                  case 23:
                  case 24:
                  case 25:
                  case 27:
                  case 29:
                  case 32:
                  default:
                     if (var10 >= 20 && var10 < 26) {
                        field_336[var8][var9] = var10;
                        class_8 var10000;
                        long var10001;
                        long var10002;
                        switch (this.field_202) {
                           case 0:
                              var10000 = this;
                              var10001 = this.field_331;
                              var10002 = 16L;
                              break;
                           case 1:
                              var10000 = this;
                              var10001 = this.field_331;
                              var10002 = 2097152L;
                              break;
                           default:
                              break label373;
                        }

                        var10000.field_331 = var10001 | var10002;
                     } else if (var10 < 80 && var10 > -1) {
                        field_336[var8][var9] = -1;
                     }
                     break;
                  case 14:
                  case 33:
                     if (!this.method_298()) {
                        field_336[var8][var9] = 33;
                     }

                     this.field_331 = this.field_331 | 1L << ((field_336[var8][var9] & 0xFF) == 14 ? 22 : 33);
                     if (this.method_130(this.field_202, this.field_203, var8, var9)) {
                        if (this.method_298()) {
                           field_338[var8][var9] = 41;
                           field_337[var8][var9] = 10;
                           this.field_246 += 10;
                        } else {
                           field_338[var8][var9] = -1;
                           field_336[var8][var9] = field_336[var8][var9] | 256;
                        }
                     }
                     break;
                  case 17:
                     int var13;
                     if ((var13 = field_336[var8][var9 - 1] & 0xFF) == 14 || var13 == 33) {
                        field_336[var8][var9 - 1] = 0xFF00 | var13;
                     }

                     byte var14;
                     switch (var14 = field_338[var8][var9 - 1]) {
                        case 19:
                        case 36:
                        case 43:
                        case 45:
                        case 46:
                        case 49:
                           Integer var15 = new Integer(var11);
                           Integer var16;
                           var16 = (var16 = (Integer)var2.get(var15)) == null ? new Integer(1) : new Integer(var16 + 1);
                           var2.put(var15, var16);
                           field_336[var8][var9] = -1;
                           Integer var17 = (Integer)var3.get(var15);
                           if (var14 == 36) {
                              if (var17 == null) {
                                 var3.put(var15, new Integer(58));
                              }
                           } else {
                              var3.put(var15, new Integer(57));
                              if (this.field_177 == 4) {
                                 var3.put(var15, new Integer(93));
                              } else if (this.field_177 == 5) {
                                 var3.put(var15, new Integer(94));
                              } else if (this.field_177 == 3) {
                                 var3.put(var15, new Integer(95));
                              }
                           }
                           break;
                        default:
                           field_336[var8][var9] = var11 << 8 | 17;
                     }

                     if (var11 >= 0) {
                        var6 |= 1 << var11;
                     }
                     break;
                  case 28:
                     this.field_312 = (byte)var11;
                     break;
                  case 30:
                     this.field_331 |= 1073741824L;
                     var7++;
                  case 1:
                  case 26:
                     field_336[var8][var9] = var11 << 8 | var10 & 0xFF;
                     break;
                  case 31:
                     this.field_331 |= 1073741824L;
                     field_336[var8][var9] = var11 << 8 | 31;
                  case 19:
                     field_336[var8][var9] = var11 << 8 | 19;
                     break;
                  case 34:
                     this.field_331 |= 17179869184L;
               }
            }

            byte[] var45;
            int var50;
            byte var55;
            switch (var12) {
               case 1:
                  this.field_246++;
                  field_340[var8][var9] = 48;
                  field_337[var8][var9] = 0;
                  continue;
               case 3:
               case 9:
               case 13:
               case 15:
               case 17:
               case 20:
               case 21:
               case 25:
               case 29:
               case 32:
               case 50:
               case 54:
               case 55:
               case 56:
               case 57:
               case 58:
               case 59:
               case 60:
               case 61:
               case 62:
               case 63:
               case 64:
               case 65:
               case 66:
               case 67:
               case 68:
               case 69:
               case 70:
               case 71:
               case 72:
               case 73:
               case 74:
               case 75:
               case 76:
               case 77:
               case 78:
               default:
                  if (var12 >= 80 || var12 <= -1) {
                     continue;
                  }

                  var45 = field_338[var8];
                  var50 = var9;
                  var55 = -1;
                  break;
               case 6:
                  var4++;
                  this.method_297(var8, var9);
               case 7:
                  this.field_331 |= 16L;
                  field_337[var8][var9] = 0;
                  continue;
               case 8:
                  this.field_331 |= 32L;
                  this.field_331 |= 8L;
               case 4:
                  if (var12 != 8) {
                     this.method_297(var8, var9);
                  }
               case 5:
                  this.field_331 |= 4L;
               case 2:
                  var4++;
               case 0:
                  field_340[var8][var9] = 48;
                  field_337[var8][var9] = 0;
                  this.field_332 |= 1L;
                  continue;
               case 10:
                  field_337[var8][var9] = 0;
                  this.field_332 |= 2L;
                  continue;
               case 11:
                  field_337[var8][var9] = var11 == 1 ? 16 : 0;
                  field_340[var8][var9] = 48;
                  this.field_331 |= 16384L;
                  continue;
               case 12:
                  this.field_160 = var8;
                  this.field_161 = var9;
                  this.field_159 = var11;
                  continue;
               case 14:
                  this.field_331 |= 4096L;
                  field_337[var8][var9] = field_337[var8][var9] == 4 ? 8 : 0;
                  var45 = field_340[var8];
                  var50 = var9;
                  var55 = 24;
                  break;
               case 16:
                  if (field_338[var8][var9 + 1] != 16) {
                     field_338[var8][var9 - 1] = 16;
                     field_337[var8][var9 - 1] = var11;
                  }

                  this.field_331 |= 8192L;
                  continue;
               case 18:
                  this.field_314 = 0;
                  this.field_315 = 0;
                  this.field_331 |= 549755813888L;
                  this.field_331 |= 128L;
                  continue;
               case 19:
                  this.field_331 = this.field_331 | 1L << (this.field_202 == 1 ? 17 : 15);
                  this.field_272 |= 2;
                  var45 = field_340[var8];
                  var50 = var9;
                  var55 = 48;
                  break;
               case 22:
               case 23:
                  this.field_331 |= 512L;
                  this.field_331 |= 1024L;
                  var45 = field_340[var8];
                  var50 = var9;
                  var55 = 48;
                  break;
               case 26:
                  this.field_331 |= 1099511627776L;
               case 24:
               case 27:
                  var7++;
                  var4++;
                  this.field_331 |= 1073741824L;
                  this.field_331 |= 524288L;
                  this.method_297(var8, var9);
                  continue;
               case 28:
                  this.field_331 |= 2048L;
                  if (var11 > 10) {
                     field_337[var8][var9] = field_337[var8][var9] / 11;
                     field_337[var8][var9] = field_337[var8][var9] | 8;
                  }

                  var45 = field_340[var8];
                  var50 = var9;
                  var55 = 24;
                  break;
               case 30:
                  this.field_331 |= 128L;
                  field_337[var8][var9] = 0;
               case 31:
               case 33:
               case 51:
               case 52:
               case 53:
                  continue;
               case 34:
                  field_338[var8][var9] = -1;
                  field_336[var8][var9] = 15;
                  this.field_331 |= 16777216L;
                  continue;
               case 35:
                  field_338[var8][var9] = 35;
                  field_336[var8][var9] = -1;
                  this.field_331 |= 16777216L;
                  this.field_465 = true;
                  continue;
               case 36:
                  if (field_337[var8][var9] != 1) {
                     field_337[var8][var9] = 0;
                  }

                  this.field_331 |= 256L;
                  continue;
               case 37:
                  this.field_331 |= 33554432L;
                  field_337[var8][var9] = 0;
                  continue;
               case 38:
                  this.field_158 = true;
                  this.field_331 |= 67108864L;
                  field_336[var8][var9] = 27;
                  this.field_331 |= 64L;
                  continue;
               case 39:
                  this.field_158 = true;
                  this.field_331 |= 67108864L;
                  continue;
               case 40:
                  this.field_331 |= 1073741824L;
                  var7++;
                  this.field_158 = true;
                  this.field_331 |= 134217728L;
                  this.method_297(var8, var9);
                  var4++;
                  continue;
               case 41:
                  if (field_337[var8][var9] <= 0) {
                     field_337[var8][var9] = 1;
                  }

                  this.field_246 = this.field_246 + field_337[var8][var9];
                  continue;
               case 42:
                  var7++;
                  var4++;
                  this.field_331 |= 2147483648L;
                  this.field_331 |= 1073741824L;
                  this.method_297(var8, var9);
                  continue;
               case 43:
                  this.field_331 = this.field_331 | 1L << (this.field_202 == 1 ? 17 : 15);
                  this.field_272 |= 1;
                  field_337[var8][var9] = var11 & -98305 | 65536;
                  var45 = field_340[var8];
                  var50 = var9;
                  var55 = 48;
                  break;
               case 44:
                  field_340[var8][var9] = 24;
                  field_337[var8][var9] = 0;
                  this.field_331 |= 17179869184L;
                  continue;
               case 45:
                  field_337[var8][var9] = 0;
                  field_340[var8][var9] = 24;
                  this.field_331 |= 34359738368L;
                  continue;
               case 46:
                  field_337[var8][var9] = 0;
                  field_340[var8][var9] = 24;
                  field_339[var8][var9] = 0;
                  this.field_331 |= 137438953472L;
                  continue;
               case 47:
                  field_340[var8][var9] = 48;
                  field_337[var8][var9] = 0;
                  this.field_331 |= 8388608L;
                  continue;
               case 48:
                  if ((var11 & 7) == 4) {
                     field_337[var8][var9] = 16;
                  } else {
                     field_337[var8][var9] = 0;
                  }
                  this.field_196++;
                  this.field_331 |= 1099511627776L;
                  this.field_331 |= 4294967296L;
                  int var29 = var9 - 1;
                  field_338[var8][var29] = 48;
                  field_337[var8][var29] = 8;
                  method_348(var8, var29);
                  continue;
               case 49:
                  this.field_331 |= 2199023255552L;
                  var45 = field_340[var8];
                  var50 = var9;
                  var55 = 48;
                  break;
               case 79:
                  this.field_233 = 0;
                  this.field_234 = var9;
                  this.field_198 = var8;
                  field_338[var8][var9] = -1;
                  this.field_204 = this.field_206 = 0;
                  this.field_205 = this.field_207 = this.field_234 * 24 - 160;
                  continue;
            }

            var45[var50] = var55;
         }
      }

      field_176 = new byte[var4 << 1];

      for (int var22 = 0; var22 < field_176.length; var22++) {
         field_176[var22] = 0;
      }

      field_359 = new class_5[var7];
      field_360 = new byte[var7];
      int var23 = 0;
      field_341 = new byte[(var5 + 1) * 2];
      int var24 = 31;

      while (var24 >= 0 && (var6 & 1 << var24) == 0) {
         var24--;
      }

      if (++var24 > 0) {
         field_348 = new byte[var24];
         field_347 = new byte[var24];
      }

      if (this.field_196 > 0) {
         field_195 = new byte[this.field_196 * 3];
      }

      int var26 = 0;

      for (int var27 = 0; var27 < this.field_209; var27++) {
         for (int var28 = 0; var28 < this.field_208; var28++) {
            label324: {
               int var30 = field_336[var28][var27] & 0xFF;
               int var31 = field_336[var28][var27] >> 8;
               byte[] var47;
               int var52;
               byte var57;
               switch (var30) {
                  case 0:
                  case 30:
                     var47 = field_360;
                     var52 = var23++;
                     var57 = (byte)var31;
                     break;
                  case 4:
                     int var18 = var31;
                     field_341[var18 * 2] = (byte)var28;
                     var47 = field_341;
                     var52 = var18 * 2 + 1;
                     var57 = (byte)var27;
                     break;
                  case 5:
                     field_341[var5 * 2] = (byte)var28;
                     var47 = field_341;
                     var52 = var5 * 2 + 1;
                     var57 = (byte)var27;
                     break;
                  case 7:
                     Integer var35 = (Integer)var1.get(new Integer(var31));
                     var31 <<= 8;
                     if (var35 != null) {
                        var31 = var31 & -16 | var35;
                     }

                     boolean var42 = (field_336[var28][var27 - 1] & 0xFF) == 17;
                     boolean var44 = (field_336[var28][var27 + 1] & 0xFF) == 17
                        && (field_336[var28 + 1][var27] & 0xFF) != 26
                        && (field_336[var28 - 1][var27] & 0xFF) != 26;
                     if (var42 || var44) {
                        var31 = var31 & -241 | 48;
                        field_340[var28][var27] = 24;
                        if (var42) {
                           field_336[var28][var27 - 1] = -1;
                        }
                     }

                     field_336[var28][var27] = var31 << 8 | var30;
                     break label324;
                  case 17:
                     if (var31 != -1) {
                        Integer var19 = new Integer(var31);
                        Integer var20;
                        if ((var20 = (Integer)var2.get(var19)) == null) {
                           var20 = new Integer(0);
                        }

                        field_348[var31] = var20.byteValue();
                        Integer var21;
                        if ((var21 = (Integer)var3.get(var19)) == null) {
                           var21 = new Integer(59);
                        }

                        var47 = field_347;
                        var52 = var31;
                        var57 = var21.byteValue();
                        break;
                     }
                  default:
                     break label324;
               }

               var47[var52] = var57;
            }

            byte[] var49;
            int var54;
            byte var59;
            switch (field_338[var28][var27]) {
               case 24:
                  var49 = field_360;
                  var54 = var23++;
                  var59 = 22;
                  break;
               case 26:
                  var49 = field_360;
                  var54 = var23++;
                  var59 = 25;
                  break;
               case 27:
                  var49 = field_360;
                  var54 = var23++;
                  var59 = 23;
                  break;
               case 40:
                  var49 = field_360;
                  var54 = var23++;
                  var59 = 24;
                  break;
               case 42:
                  var49 = field_360;
                  var54 = var23++;
                  var59 = 11;
                  break;
               case 48:
                  if ((field_337[var28][var27] & 8) != 0) {
                     int var36 = var28 + ((field_337[var28][var27 + 1] & 16) == 0 ? 1 : -1);
                     int var43 = var26 * 3;
                     if (method_244(var36, var27) >= 0) {
                        field_195[var43 + 0] = (byte)var36;
                        field_195[var43 + 1] = (byte)var36;
                        var49 = field_195;
                        var54 = var43 + 2;
                        var59 = (byte)var27;
                     } else {
                        var49 = field_195;
                        var54 = var43 + 2;
                        var59 = -1;
                     }

                     var49[var54] = var59;
                     field_337[var28][var27] = field_337[var28][var27] & 16777215 | var26 << 24;
                     var26++;
                  }
               default:
                  continue;
            }

            var49[var54] = var59;
         }
      }

      field_336[this.field_198 - 2][this.field_234] = -193 << 8 | 7;
      if ((this.field_331 & 4294967296L) != 0L || field_334[9] >= 8) {
         this.field_331 |= 1099511627776L;
         this.field_331 |= 2L;
         this.field_331 |= 1L;
         if ((this.field_331 & 131072L) != 0L) {
            this.field_331 |= 262144L;
         }

         if ((this.field_331 & 32768L) != 0L) {
            this.field_331 |= 65536L;
         }

         if ((this.field_331 & 34359738368L) != 0L) {
            this.field_331 |= 68719476736L;
         }

         if ((this.field_331 & 137438953472L) != 0L) {
            this.field_331 |= 274877906944L;
         }

         if ((this.field_331 & 2199023255552L) != 0L) {
            this.field_331 |= 4398046511104L;
         }
      }
   }

   // $VF: renamed from: a (int, int, int, int, int) void
   private void method_300(int var1, int var2, int var3, int var4, int var5) {
      if (var1 + var3 > 0 && var1 + var3 < this.field_208 && var2 + var4 > 0 && var2 + var4 < this.field_209) {
         int var6 = var3;
         int var7 = var4;
         int var9;
         switch (var9 = field_336[var1 + var3][var2 + var4] & 0xFF) {
            case 8:
            case 9:
               int var8 = field_336[var1 + var3][var2 + var4] >> 8;
               var8 = var5 == 1 ? var8 | 512 : var8 & -513;
               field_336[var1 + var3][var2 + var4] = var8 << 8 | var9;
               this.method_300(var1 + var3, var2 + var4, var6, var7, var5);
               this.method_300(var1 + var3, var2 + var4, 0, 1, var5);
         }
      }
   }

   // $VF: renamed from: d (int, int) boolean
   private boolean method_301(int var1, int var2) {
      return var1 == this.field_233 && var2 == this.field_234;
   }

   // $VF: renamed from: u (int) void
   private void method_302(int var1) {
      this.field_199 = this.field_200 = 0;

      for (int var2 = 0; var2 < field_360.length; var2++) {
         if (field_360[var2] == var1) {
            this.field_358 = field_359[var2];
         }
      }

      this.field_358.method_29();
   }

   // $VF: renamed from: f () boolean
   private boolean method_303() {
      label61: {
         if (this.field_204 < this.field_343) {
            this.field_204 = this.field_204 + this.field_345;
            if (this.field_204 <= this.field_343) {
               break label61;
            }
         } else {
            if (this.field_204 <= this.field_343) {
               break label61;
            }

            this.field_204 = this.field_204 - this.field_345;
            if (this.field_204 >= this.field_343) {
               break label61;
            }
         }

         this.field_204 = this.field_343;
      }

      label53: {
         if (this.field_205 < this.field_344) {
            this.field_205 = this.field_205 + this.field_345;
            if (this.field_205 <= this.field_344) {
               break label53;
            }
         } else {
            if (this.field_205 <= this.field_344) {
               break label53;
            }

            this.field_205 = this.field_205 - this.field_345;
            if (this.field_205 >= this.field_344) {
               break label53;
            }
         }

         this.field_205 = this.field_344;
      }

      boolean var1;
      boolean var2;
      label45: {
         var1 = false;
         var2 = false;
         if (this.field_204 < 0) {
            this.field_204 = 0;
         } else if (this.field_204 > this.field_208 * 24 - 240) {
            this.field_204 = this.field_208 * 24 - 240;
         } else if (this.field_204 != this.field_343) {
            break label45;
         }

         var1 = true;
      }

      label39: {
         if (this.field_205 < 0) {
            this.field_205 = 0;
         } else if (this.field_205 > this.field_209 * 24 - 320 + 80) {
            this.field_205 = this.field_209 * 24 - 320 + 80;
         } else if (this.field_205 != this.field_344) {
            break label39;
         }

         var2 = true;
      }

      if (var1 && var2) {
         this.field_206 = this.field_204;
         this.field_207 = this.field_205;
         this.field_197 = 70;
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: bE () void
   private void method_304() {
      switch (this.field_346) {
         case 1:
            this.field_345 = 8;
            if (this.method_303()) {
               this.field_346 = 2;
               this.field_471 = 40;
               return;
            }
            break;
         case 2:
            this.field_471--;
            if (this.field_471 == 30) {
               if ((field_336[this.field_469][this.field_470] >> 8 & 240) != 0) {
                  this.method_261(this.field_469, this.field_470);
                  return;
               }
            } else if (this.field_471 == 0) {
               this.field_346 = 3;
               this.field_343 = this.field_233 * 24 - 108;
               this.field_344 = this.field_234 * 24 - 108;
               this.field_345 = 5;
               this.field_467 = field_569[field_347[field_349]];
               field_324[41].method_51(this.field_467);
               this.field_468 = 80;
               return;
            }
            break;
         case 3:
            if (this.method_303()) {
               this.field_471 = 20;
               this.field_346 = 4;
               this.field_197 = 0;
               return;
            }
            break;
         case 4:
            this.field_471--;
            if (this.field_471 == 0) {
               this.field_197 = 0;
               this.field_346 = 0;
               field_472 = true;
            }
      }
   }

   // $VF: renamed from: v (int) void
   private void method_305(int var1) {
      this.method_436(1);
      int var2 = this.field_208 - 1;
      int var3 = this.field_209 - 1;

      for (int var4 = 1; var4 < var3; var4++) {
         for (int var5 = 1; var5 < var2; var5++) {
            if ((field_336[var5][var4] & 0xFF) == 17 && field_336[var5][var4] >> 8 == var1) {
               int var6;
               int var7;
               label32: {
                  var6 = -1;
                  var7 = -1;
                  int var10000;
                  if (field_338[var5][var4] == 18) {
                     var6 = var5;
                     var10000 = var4;
                  } else {
                     switch (field_336[var5][var4 - 1] & 0xFF) {
                        case 7:
                           if ((field_336[var5][var4 - 1] >> 8 & 240) == 0) {
                              break label32;
                           }
                        case 14:
                        case 33:
                           var6 = var5;
                           var10000 = var4 - 1;
                           break;
                        default:
                           break label32;
                     }
                  }

                  var7 = var10000;
               }

               if (var6 != -1) {
                  this.field_469 = var6;
                  this.field_470 = var7;
                  this.field_343 = 24 * var6 - 108;
                  this.field_344 = 24 * var7 - 108;
               }
            }
         }
      }
   }

   // $VF: renamed from: w (int) void
   private void method_306(int var1) {
      this.method_436(8);
      int var2 = this.field_208 - 1;
      int var3 = this.field_209 - 1;

      for (int var4 = 1; var4 < var3; var4++) {
         for (int var5 = 1; var5 < var2; var5++) {
            if ((field_336[var5][var4] & 0xFF) == 17 && field_336[var5][var4] >> 8 == var1) {
               int var6;
               switch (var6 = field_336[var5][var4 - 1] & 0xFF) {
                  case 7:
                     method_260(var5, var4 - 1);
                     break;
                  case 14:
                  case 33:
                     field_336[var5][var4 - 1] = 0 | var6;
               }
            }
         }
      }
   }

   // $VF: renamed from: bF () void
   private void method_307() {
      int var2 = this.field_233 - 8;
      int var3 = this.field_233 + 8;
      int var4 = this.field_234 + 8;
      int var5 = this.field_234 - 8;
      byte var6 = 0;
      if (field_327[4] != null) {
         int var7 = field_327[4].field_26;
         var6 = (byte)(field_327[4].field_26 == 0 ? 0 : (var7 <= 10 ? 1 : (var7 <= 20 ? 2 : 3)));
      }

      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 > this.field_208 - 2) {
         var3 = this.field_208 - 2;
      }

      if (var5 < 1) {
         var5 = 1;
      }

      if (var4 > this.field_209 - 2) {
         var4 = this.field_209 - 2;
      }

      class_8 var10000 = this;
      int var10001 = var4;

      while (true) {
         var10000.field_284 = var10001;
         if (this.field_284 < var5) {
            return;
         }

         var10000 = this;
         var10001 = var2;

         while (true) {
            var10000.field_283 = var10001;
            if (this.field_283 > var3) {
               var10000 = this;
               var10001 = this.field_284 - 1;
               break;
            }

            boolean var9 = this.field_257 != 0 && this.field_283 == this.field_255 && this.field_284 == this.field_256;
            label195:
            if (field_340[this.field_283][this.field_284] > 0 && !var9) {
               label192: {
                  field_340[this.field_283][this.field_284] = (byte)(field_340[this.field_283][this.field_284] - 6);
                  switch ((byte)(field_336[this.field_283][this.field_284] & 0xFF)) {
                     case 0:
                        if (this.field_358 == null && this.field_261 == -1 && this.method_301(this.field_283, this.field_284) && this.field_235 <= 6) {
                           this.field_261 = field_336[this.field_283][this.field_284] >> 8;
                           field_336[this.field_283][this.field_284] = -1;
                        }
                     case 1:
                     case 4:
                     case 5:
                     case 10:
                     case 11:
                     case 12:
                     case 13:
                     case 15:
                     case 16:
                     case 17:
                     case 18:
                     case 19:
                     case 20:
                     case 21:
                     case 22:
                     case 23:
                     case 24:
                     case 25:
                     case 27:
                     case 28:
                     case 29:
                     case 31:
                     case 34:
                     default:
                        break label192;
                     case 2:
                        switch (field_336[this.field_283][this.field_284] >> 8) {
                           case 0:
                              if (field_338[this.field_283 - 1][this.field_284] != 30
                                 && field_338[this.field_283 + 1][this.field_284] != 30
                                 && field_338[this.field_283][this.field_284 - 1] != 30
                                 && field_338[this.field_283][this.field_284 + 1] != 30) {
                                 this.field_211 = -1;
                                 this.method_290(this.field_283, this.field_284, (byte)2);
                              }
                           default:
                              break label192;
                        }
                     case 3:
                        this.method_344();
                        break label192;
                     case 6:
                        this.method_319();
                        break label192;
                     case 7:
                        this.method_343();
                        break label192;
                     case 8:
                        var10000 = this;
                        break;
                     case 9:
                        var10000 = this;
                        break;
                     case 14:
                        this.method_345(14);
                        break label192;
                     case 26:
                        this.method_322();
                        break label192;
                     case 30:
                        if (this.field_358 == null && this.field_261 == -1 && this.method_301(this.field_283, this.field_284) && this.field_235 <= 0) {
                           this.field_261 = field_336[this.field_283][this.field_284] >> 8;
                           field_336[this.field_283][this.field_284] = -1;
                        }
                        break label192;
                     case 32:
                        this.method_318();
                        break label192;
                     case 33:
                        this.method_345(33);
                        break label192;
                     case 35:
                     case 37:
                        if (this.field_283 != this.field_255 || this.field_284 != this.field_256 || this.field_257 == 0) {
                           this.method_310();
                        }
                        break label192;
                     case 36:
                        this.method_237();
                        break label192;
                  }

                  var10000.method_342();
               }

               if ((field_336[this.field_283][this.field_284] & -268435456) >> 28 > 0) {
                  this.method_329();
               }

               byte var16;
               switch (field_338[this.field_283][this.field_284]) {
                  case 0:
                     this.method_354();
                     break label195;
                  case 1:
                     this.method_354();
                     break label195;
                  case 2:
                     this.method_325(2);
                  case 3:
                  case 12:
                  case 13:
                  case 15:
                  case 17:
                  case 18:
                  case 20:
                  case 25:
                  case 29:
                  case 31:
                  case 33:
                  case 34:
                  case 35:
                  case 38:
                  case 39:
                  default:
                     break label195;
                  case 4:
                     this.method_325(4);
                     break label195;
                  case 5:
                     this.method_325(5);
                     break label195;
                  case 6:
                     this.method_325(6);
                     break label195;
                  case 7:
                     this.method_325(7);
                     break label195;
                  case 8:
                     this.method_354();
                     break label195;
                  case 9:
                     label171:
                     if ((field_337[this.field_283][this.field_284] & 264241152) == 138412032) {
                        label176: {
                           field_340[this.field_283][this.field_284] = 24;
                           if (this.field_193 > 0) {
                              var10000 = this;
                              var16 = (byte)(this.field_193 - 1);
                           } else {
                              if (this.field_193 >= 0) {
                                 break label176;
                              }

                              var10000 = this;
                              var16 = (byte)(this.field_193 + 1);
                           }

                           var10000.field_193 = var16;
                        }

                        if (this.field_194 > 0) {
                           var10000 = this;
                           var16 = (byte)(this.field_194 - 1);
                        } else {
                           if (this.field_194 >= 0) {
                              break label171;
                           }

                           var10000 = this;
                           var16 = (byte)(this.field_194 + 1);
                        }

                        var10000.field_194 = var16;
                     }

                     this.method_354();
                     break label195;
                  case 10:
                     this.method_335();
                     break label195;
                  case 11:
                     this.method_334();
                     break label195;
                  case 14:
                     this.method_339();
                     break label195;
                  case 16:
                     this.method_340();
                     break label195;
                  case 19:
                     this.method_328((byte)19);
                     break label195;
                  case 21:
                     this.method_337();
                     break label195;
                  case 22:
                     var10000 = this;
                     var16 = 22;
                     break;
                  case 23:
                     var10000 = this;
                     var16 = 23;
                     break;
                  case 24:
                     this.method_331(24);
                     break label195;
                  case 26:
                     this.method_331(26);
                     break label195;
                  case 27:
                     this.method_331(27);
                     break label195;
                  case 28:
                     this.method_341();
                     break label195;
                  case 30:
                     this.method_332();
                     break label195;
                  case 32:
                     this.method_336();
                     break label195;
                  case 36:
                     this.method_321();
                     break label195;
                  case 37:
                     this.method_333();
                     break label195;
                  case 40:
                     this.method_325(40);
                     break label195;
                  case 41:
                     this.method_325(41);
                     break label195;
                  case 42:
                     this.method_325(42);
                     break label195;
                  case 43:
                     this.method_328((byte)43);
                     break label195;
                  case 44:
                     this.method_317();
                     break label195;
                  case 45:
                     this.method_208();
                     break label195;
                  case 46:
                     this.method_315();
                     break label195;
                  case 47:
                     this.method_354();
                     this.method_314();
                     break label195;
                  case 48:
                     if ((field_337[this.field_283][this.field_284] & 8) == 0) {
                        this.method_309((byte)48);
                     } else {
                        this.method_308();
                     }
                     break label195;
                  case 49:
                     this.method_328((byte)49);
                     break label195;
                  case 50:
                     if (this.field_235 < 12 && this.method_301(this.field_283, this.field_284) && !this.field_143) {
                        this.method_63(1, 48, field_330[this.field_236 & 7]);
                     }
                     break label195;
                  case 51:
                     this.method_325(51);
                     break label195;
                  case 52:
                     this.method_325(52);
                     break label195;
                  case 53:
                     this.method_325(53);
                     break label195;
                  case 54:
                     this.method_320();
                     break label195;
               }

               var10000.method_323(var16, var6);
            }

            var10000 = this;
            var10001 = this.field_283 + 1;
         }
      }
   }

   // $VF: renamed from: bG () void
   private void method_308() {
      int var1;
      int var2;
      int var7;
      label21: {
         var1 = this.field_283;
         var2 = this.field_284;
         int var3 = this.field_284 + 1;
         int var4;
         switch ((var4 = field_337[var1][var3]) & 7) {
            case 2:
               var7 = var1;
               break;
            case 4:
               var7 = var1 + 1;
               break label21;
            default:
               if ((var4 & 16) == 0) {
                  var7 = var1 + 1;
                  break label21;
               }

               var7 = var1;
         }

         var7 -= 1;
      }

      int var5 = var7;
      int var6 = (field_337[var1][var2] >> 24) * 3;
      byte[] var8;
      int var10001;
      byte var10002;
      if (field_338[var5][var2] < 0) {
         field_195[var6 + 2] = (byte)var2;
         field_195[var6 + 1] = (byte)var5;
         var8 = field_195;
         var10001 = var6 + 0;
         var10002 = (byte)var5;
      } else {
         var8 = field_195;
         var10001 = var6 + 2;
         var10002 = -1;
      }

      var8[var10001] = var10002;
   }

   // $VF: renamed from: d (byte) void
   private void method_309(byte var1) {
      int var2 = this.field_283;
      int var3 = this.field_284;
      if (field_339[var2][var3] == 6 && (field_336[var2][var3] & 0xFF) == 6) {
         this.method_259(field_336[var2][var3] >> 8);
      }

      if (field_339[var2][var3] <= 0) {
         int var4;
         label42: {
            int var5;
            int var10000;
            if ((var5 = (var4 = field_337[var2][var3]) & 7) == 2) {
               var10000 = var4 | 16;
            } else {
               if (var5 != 4) {
                  break label42;
               }

               var10000 = var4 & -17;
            }

            var4 = var10000;
         }

         int var6 = var3 + 1;
         if (field_338[var2][var6] < 0 && (!this.method_301(var2, var6) || this.field_243 != 0)) {
            field_338[var2][var3 - 1] = -1;
            field_338[var2][var6] = var1;
            field_337[var2][var6] = var4 & -8 | 3;
            field_337[var2][var3] = field_337[var2][var3 - 1] | 8;
            field_339[var2][var6] = 18;
            int var7 = var3 - 2;
            field_340[var2 - 1][var7] = 48;
            field_340[var2][var7] = 48;
            field_340[var2 + 1][var7] = 48;
            method_348(var2, var3);
            if (var1 == 48) {
               this.method_308();
            }
         } else {
            if ((var4 & 7) == 3 && this.method_301(var2, var3 + 1)) {
               this.method_63(2, 48, 0);
            }

            field_337[var2][var3] = var4 & -8 | 0;
         }
      } else {
         field_339[var2][var3] = (byte)(field_339[var2][var3] - 6);
      }

      field_340[var2][var3] = 24;
      field_340[var2][var3 - 1] = 24;
   }

   // $VF: renamed from: bH () void
   private void method_310() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      field_340[var1][var2] = 24;
      byte[] var8;
      int var10;
      byte var12;
      if (field_339[var1][var2] <= 0) {
         int var3;
         int var4;
         byte var5;
         label64: {
            var3 = var2 - 1;
            var4 = var2 + 1;
            if ((var5 = (byte)(field_336[var1][var3] & 0xFF)) != 34 && var5 != 37) {
               if (var5 == 35 || !method_311(var1, var3)) {
                  break label64;
               }

               field_339[var1][var3] = 18;
               field_336[var1][var3] = 35;
            } else {
               field_336[var1][var3] = 37;
            }
         }

         byte var6 = field_338[var1][var2];
         if (field_338[var1][var3] < 0 && !this.method_301(var1, var3) && var5 == 35 && var6 != 32 && var6 != 21 && field_338[var1][var2] != -1) {
            field_339[var1][var3] = 18;
            field_338[var1][var3] = field_338[var1][var2];
            field_337[var1][var3] = field_337[var1][var2] & -8 | 1;
            field_338[var1][var2] = -1;
            this.method_149(var1, var2);
         } else {
            this.method_150(var1, var2);
         }

         if ((field_336[var1][var4] & 0xFF) != 35 && field_338[var1][var4] != 47) {
            if (field_336[var1][var2] == 37) {
               field_336[var1][var2] = 34;
            } else {
               field_336[var1][var2] = -1;
            }
         }

         field_340[var1][var3] = 24;
         if (field_338[var1][var2] >= 0) {
            return;
         }

         var8 = field_339[var1];
         var10 = var2;
         var12 = 18;
      } else {
         var8 = field_339[var1];
         var10 = var2;
         var12 = (byte)(var8[var2] - 6);
      }

      var8[var10] = var12;
   }

   // $VF: renamed from: e (int, int) boolean
   private static boolean method_311(int var0, int var1) {
      byte var2 = field_338[var0][var1];
      int var3 = field_336[var0][var1] & 0xFF;
      return var2 < 80
         && var2 != 30
         && var2 != 10
         && var2 != 37
         && var2 != 34
         && var2 != 35
         && var3 != 14
         && var3 != 33
         && var3 != 15
         && var3 != 4
         && var3 != 16;
   }

   // $VF: renamed from: f (int, int) boolean
   private static boolean method_312(int var0, int var1) {
      byte var2 = field_338[var0][var1];
      int var3 = field_336[var0][var1] & 0xFF;
      return var2 == -1 && var3 != 14 && var3 != 33 && var3 != 5 && var3 != 28;
   }

   // $VF: renamed from: g (int, int) boolean
   private static boolean method_313(int var0, int var1) {
      byte var2 = field_338[var0][var1];
      int var3 = field_336[var0][var1] & 0xFF;
      return var2 == -1 && var3 != 14 && var3 != 33 && var3 != 4 && var3 != 32 && (var3 != 7 || (field_336[var0][var1] >> 8 & 240) != 0);
   }

   // $VF: renamed from: bI () void
   private void method_314() {
      int var1 = this.field_284 - 1;
      boolean var2 = field_505 != null && field_505[this.field_283][this.field_284] != 0 && field_505[this.field_283][this.field_284 - 1] == 0;
      if ((field_337[this.field_283][this.field_284] & 7) == 0
         && (field_336[this.field_283][var1] & 0xFF) != 35
         && method_311(this.field_283, var1)
         && (!this.method_301(this.field_283 - 1, this.field_284) && !this.method_301(this.field_283 + 1, this.field_284) || (this.field_236 & 8) == 0)
         && (field_338[this.field_283][this.field_284 + 1] >= 0 || var2)) {
         field_336[this.field_283][var1] = 35;
         field_339[this.field_283][var1] = 18;
         field_340[this.field_283][var1] = 24;
      }
   }

   // $VF: renamed from: bJ () void
   private void method_315() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      int var3 = field_337[var1][var2] & 31;
      int var4 = (field_337[var1][var2] & 8160) >> 5;
      int var5 = method_316(field_324[29], var3);
      if ((field_336[var1][var2] & 0xFF) == 35) {
         if (++var4 > var5) {
            var4 = 0;
         }

         field_337[var1][var2] = 0 | var4 << 5;
      } else if (field_338[var1][var2 + 1] < 0 && var3 != 8 && var3 != 9) {
         byte var17;
         switch (var3) {
            case 0:
            case 2:
            case 4:
            case 6:
               var17 = 8;
               break;
            case 1:
            case 3:
            case 5:
            default:
               var17 = 9;
         }

         byte var12 = var17;
         field_339[var1][var2 + 1] = 18;
         field_338[var1][var2 + 1] = 46;
         field_338[var1][var2] = -1;
         field_337[var1][var2 + 1] = var12;
         method_348(var1, var2);
      } else {
         if (var3 != 8 && var3 != 9) {
            if (this.method_346(var1, var2)) {
               field_338[var1][var2] = -1;
               this.method_338(var1, var2);
               method_348(var1, var2);
               return;
            }

            if (!this.method_301(var1 - 1, var2) && !this.method_301(var1 + 1, var2) && !this.method_301(var1, var2 - 1)) {
               int var7 = this.field_236 & 7;
               label203:
               if (this.field_233 == var1
                  && this.field_235 == 6
                  && (var7 == 4 || var7 == 2)
                  && this.field_234 < var2
                  && field_338[var1][var2 - 1] < 0
                  && var2 * 24 <= this.field_205 + 320 - 80) {
                  byte var16;
                  switch (var3) {
                     case 0:
                     case 2:
                        var16 = 6;
                        break;
                     case 1:
                     case 3:
                        var16 = 7;
                        break;
                     default:
                        break label203;
                  }

                  var3 = var16;
                  var4 = 0;
               } else if (this.field_234 != var2
                  || this.field_235 != 6
                  || var7 != 1 && var7 != 3
                  || var3 < 0
                  || var3 > 3
                  || (this.field_233 >= var1 || field_338[var1 - 1][var2] >= 0 || var1 * 24 >= this.field_204 + 240)
                     && (this.field_233 <= var1 || field_338[var1 + 1][var2] >= 0 || (var1 + 1) * 24 <= this.field_204)) {
                  label175: {
                     var4++;
                     byte[] var14;
                     int var10001;
                     switch (var3) {
                        case 4:
                           int var8 = var1 - 1;
                           if (field_338[var8][var2] >= 0 || var4 != method_207(field_324[29], 4, 1)) {
                              break label175;
                           }

                           field_338[var8][var2] = 21;
                           field_337[var8][var2] = 4;
                           field_339[var8][var2] = 18;
                           var14 = field_340[var8];
                           var10001 = var2;
                           break;
                        case 5:
                           int var9 = var1 + 1;
                           if (field_338[var9][var2] >= 0 || var4 != method_207(field_324[29], 5, 1)) {
                              break label175;
                           }

                           field_338[var9][var2] = 21;
                           field_337[var9][var2] = 2;
                           field_339[var9][var2] = 18;
                           var14 = field_340[var9];
                           var10001 = var2;
                           break;
                        case 6:
                        case 7:
                           int var10 = var2 - 1;
                           if (field_338[var1][var10] < 0 && var4 == method_207(field_324[29], var3, 1)) {
                              field_338[var1][var10] = 21;
                              field_337[var1][var10] = 1;
                              field_339[var1][var10] = 18;
                              var14 = field_340[var1];
                              var10001 = var10;
                              break;
                           }
                        default:
                           break label175;
                     }

                     var14[var10001] = 24;
                  }

                  label143:
                  if (var4 > var5) {
                     var4 = 0;
                     int var15;
                     switch (this.method_327(var1, var2, this.field_233, this.field_234, false)) {
                        case 1:
                           if (this.field_233 == var1 && var3 != 6 && var3 != 7 && var2 * 24 <= this.field_205 + 320 - 80) {
                              var3 = var3 == 2 ? 6 : 7;
                              break label143;
                           }

                           var3 = this.field_233 < var1 ? 2 : 3;
                           break label143;
                        case 2:
                           var15 = this.field_234 == var2 && var3 != 5 && (var1 + 1) * 24 > this.field_204 ? 5 : 1;
                           break;
                        case 3:
                        default:
                           var15 = this.field_233 < var1 ? 0 : 1;
                           break;
                        case 4:
                           var15 = this.field_234 == var2 && var3 != 4 && var1 * 24 < this.field_204 + 240 ? 4 : 0;
                     }

                     var3 = var15;
                  }
               } else {
                  var3 = this.field_233 < var1 ? 4 : 5;
                  var4 = 0;
               }
            } else {
               label213: {
                  byte var10000;
                  if (this.field_234 == var2 - 1) {
                     var10000 = 17;
                  } else if (this.field_233 == var1 - 1) {
                     var10000 = 16;
                  } else {
                     if (this.field_233 != var1 + 1) {
                        break label213;
                     }

                     var10000 = 15;
                  }

                  var3 = var10000;
               }

               var4 = 0;
            }

            field_340[var1][var2] = 24;
            field_337[var1][var2] = var3 & 31 | var4 << 5;
         } else {
            field_339[var1][var2] = (byte)(field_339[var1][var2] - 6);
            if (field_339[var1][var2] < 0) {
               if (field_338[var1][var2 + 1] < 0) {
                  field_339[var1][var2 + 1] = 18;
                  field_338[var1][var2 + 1] = 46;
                  field_338[var1][var2] = -1;
                  field_337[var1][var2 + 1] = var3;
                  method_348(var1, var2);
                  return;
               }

               var3 = var3 == 8 ? 10 : 11;
               field_337[var1][var2] = var3;
               field_339[var1][var2] = 0;
               return;
            }

            if (method_353(var1, var2, 3, field_339[var1][var2], this.field_233, this.field_234, this.field_236 & 7, this.field_235)) {
               this.method_63(1, 48, field_337[var1][var2] & 7);
               return;
            }
         }
      }
   }

   // $VF: renamed from: a (a, int) int
   private static int method_316(class_7 var0, int var1) {
      int var2 = 0;
      int var3 = var0.field_74[var1] & 255;

      for (int var4 = 0; var4 < var3; var4++) {
         var2 += var0.field_76[(var0.field_75[var1] + var4) * 5 + 1] & 255;
      }

      return var2;
   }

   // $VF: renamed from: bK () void
   private void method_317() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      field_340[var1][var2] = 24;
      byte[] var10000;
      int var10001;
      byte var10002;
      switch ((field_337[var1][var2] & 56) >> 3) {
         case 0:
            if ((this.field_233 != var1 || (var2 + 1) * 24 <= this.field_205 || this.field_177 == 3)
               && (this.field_177 != 3 || this.field_459 == 0L || field_229 < this.field_459 + (21 - var1))) {
               return;
            }

            int var6 = var2 + 1;

            while (true) {
               byte var7 = field_338[var1][var6];
               if (this.field_234 == var6 || var7 >= 80 || var7 == 30 || var7 == 34 || var7 == 35 || var7 == 0) {
                  if (this.field_234 == var6 || this.field_177 == 3) {
                     field_337[var1][var2] = field_337[var1][var2] & -57 | 8;
                     field_339[var1][var2] = 10;
                     return;
                  }

                  return;
               }

               var6++;
            }
         case 1:
            field_339[var1][var2]--;
            if (field_339[var1][var2] <= 0) {
               field_336[var1][var2] = 34;
               field_337[var1][var2] = field_337[var1][var2] & -64 | 24 | 3;
               field_339[var1][var2] = 0;
               return;
            }

            return;
         case 2:
         default:
            return;
         case 3:
            if (field_339[var1][var2] > 0) {
               field_339[var1][var2] = (byte)(field_339[var1][var2] - 5);
               return;
            }

            boolean var4 = this.method_301(var1, var2 + 1);
            boolean var5 = false;
            if (var4 || field_338[var1][var2 + 1] >= 0 || this.field_158 && field_505[var1][var2 + 1] != 0) {
               if (var4) {
                  this.method_63(1, 48, 0);
                  var5 = true;
               } else {
                  var5 = true;
                  switch (field_338[var1][var2 + 1]) {
                     case 10:
                        field_336[var1][var2 + 1] = 32;
                        this.method_149(var1, var2 + 1);
                        var5 = false;
                        break;
                     case 18:
                        this.method_235();
                        break;
                     case 19:
                     case 43:
                     case 45:
                     case 46:
                     case 49:
                        this.method_338(var1, var2 + 1);
                        field_338[var1][var2 + 1] = -1;
                        break;
                     case 21:
                        var5 = false;
                        break;
                     case 30:
                        this.method_436(11);
                        field_337[var1][var2 + 1] = 1;
                        break;
                     default:
                        this.method_436(14);
                  }
               }
            }

            if (var5) {
               field_337[var1][var2] = field_337[var1][var2] & -64 | 32;
               field_339[var1][var2] = 0;
               return;
            }

            field_338[var1][var2] = -1;
            field_338[var1][var2 + 1] = 44;
            field_337[var1][var2 + 1] = field_337[var1][var2];
            var10000 = field_339[var1];
            var10001 = var2 + 1;
            var10002 = 19;
            break;
         case 4:
            if ((field_229 & 1) != 0) {
               return;
            }

            field_339[var1][var2]++;
            if (field_339[var1][var2] != field_324[27].method_49(4)) {
               return;
            }

            var10000 = field_338[var1];
            var10001 = var2;
            var10002 = -1;
      }

      var10000[var10001] = var10002;
      method_348(var1, var2);
   }

   // $VF: renamed from: bL () void
   private void method_318() {
      int var1 = field_336[this.field_283][this.field_284] >> 8 & 0xFF;
      if ((field_229 & 1) == 0) {
         var1++;
      } else if (var1 == 1) {
         this.method_149(this.field_283, this.field_284);
      }

      int[] var10000;
      int var10001;
      int var10002;
      if (var1 == field_324[16].method_49(0)) {
         var10000 = field_336[this.field_283];
         var10001 = this.field_284;
         var10002 = -1;
      } else {
         var10000 = field_336[this.field_283];
         var10001 = this.field_284;
         var10002 = var1 << 8 | 32;
      }

      var10000[var10001] = var10002;
      field_340[this.field_283][this.field_284] = 24;
   }

   // $VF: renamed from: bM () void
   private void method_319() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      int var3 = field_336[var1][var2] >> 8;
      boolean var4 = method_347(var1, var2) || field_338[var1][var2] == 47 || field_338[var1][var2] == 48;
      byte var5 = field_339[var1][var2];
      if (!var4 && this.method_301(var1, var2)) {
         var4 = true;
         var5 = (byte)((this.field_236 & 4096) != 0 ? 0 : this.field_235);
      }

      if (var4 && var5 < 12) {
         this.method_259(var3);
      } else {
         this.method_262(var3);
      }
   }

   // $VF: renamed from: bN () void
   private void method_320() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      int var3 = field_337[var1][var2];
      class_7 var4 = field_324[7];
      var3++;
      int var5 = method_316(var4, 0);
      if (var3 >= var5) {
         field_338[var1][var2] = -1;
         method_348(var1, var2);
      } else {
         if (var3 == 1) {
            this.method_436(7);
            method_348(var1, var2);
         } else if (var3 == var5 >> 1) {
            for (int var6 = -1; var6 < 2; var6++) {
               for (int var7 = -1; var7 < 2; var7++) {
                  int var8;
                  int var9;
                  label38: {
                     var8 = var1 + var7;
                     var9 = var2 + var6;
                     int[] var10000;
                     int var10001;
                     byte var10002;
                     switch (field_338[var8][var9]) {
                        case 8:
                           field_338[var8][var9] = 54;
                           var10000 = field_337[var8];
                           var10001 = var9;
                           var10002 = 0;
                           break;
                        case 10:
                           if (this.field_492 != 3) {
                              break label38;
                           }
                        case 30:
                        case 37:
                           var10000 = field_337[var8];
                           var10001 = var9;
                           var10002 = 1;
                           break;
                        case 16:
                        case 19:
                        case 43:
                        case 49:
                           field_338[var8][var9] = -1;
                           this.method_338(var8, var9);
                           field_340[var8][var9] = 24;
                        default:
                           break label38;
                     }

                     var10000[var10001] = var10002;
                     method_348(var8, var9);
                  }

                  if (this.method_301(var8, var9)) {
                     this.method_63(1, 64, 0);
                  }
               }
            }
         }

         field_337[var1][var2] = var3;
         field_340[var1][var2] = 24;
      }
   }

   // $VF: renamed from: bO () void
   private void method_321() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      if (field_337[var1][var2] == 0) {
         if (field_338[var1][var2 - 1] == 11) {
            field_337[var1][var2] = 1;
            this.method_330();
            return;
         }
      } else if (this.method_301(var1, var2 - 1)) {
         this.method_63(1, 64, 0);
      }
   }

   // $VF: renamed from: bP () void
   private void method_322() {
      if (this.field_235 <= 6 && this.method_301(this.field_283, this.field_284)) {
         field_171 = 0;
         this.field_199 = 0;
         field_349 = field_336[this.field_283][this.field_284] >> 8;
         this.method_261(this.field_233 + field_329[this.field_236 & 7], this.field_234);
         if (field_349 >= 0 && field_349 < field_348.length) {
            this.method_436(1);
            this.field_346 = 1;
            this.method_305(field_349);
         } else {
            field_349 = -1;
         }

         field_336[this.field_283][this.field_284] = -1;
      }
   }

   // $VF: renamed from: o (int, int) void
   private void method_323(int var1, int var2) {
      int var3 = this.field_283;
      int var4 = this.field_284;
      int var5 = var1 == 23 ? -1 : 1;
      field_340[var3][var4] = 24;
      if (this.field_234 == var4) {
         for (int var6 = 0; var6 <= var2; var6++) {
            int var7 = var3 + var6 * var5;
            if (this.field_233 == var7) {
               this.method_63(1, 64, 0);
            }
         }
      }
   }

   // $VF: renamed from: bQ () void
   private void method_324() {
      boolean var1 = false;
      byte var2 = -1;
      boolean var3 = false;
      switch (this.field_216) {
         case 2:
            this.field_249++;
            var3 = true;
            var2 = 0;
         case 3:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 25:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         default:
            break;
         case 4:
            var2 = 2;
            this.field_239++;
            break;
         case 5:
            this.field_240++;
            var2 = 1;
            break;
         case 6:
            this.field_201++;
            field_355[this.field_233][this.field_234] = -1;
            field_353[this.field_233][this.field_234] = field_353[this.field_233][this.field_234] | 256;
            var2 = 0;
            this.method_129(this.field_202, this.field_203, this.field_233, this.field_234);
            break;
         case 7:
            this.method_64((byte)127);
            var2 = 4;
            break;
         case 24:
            var3 = true;
            var1 = true;
            this.field_261 = 22;
            break;
         case 26:
            var1 = true;
            this.field_261 = 25;
            var3 = true;
            break;
         case 27:
            var3 = true;
            var1 = true;
            this.field_261 = 23;
            break;
         case 40:
            var3 = true;
            var1 = true;
            this.field_261 = 24;
            break;
         case 41:
            if (this.method_298()) {
               this.field_466 = true;
               this.method_67();
            }

            this.field_247 = this.field_247 + this.field_215;
            this.field_159 = this.field_159 - this.field_215;
            if (this.field_159 <= 0 && !this.method_298()) {
               field_338[this.field_160][this.field_161] = -1;
               this.field_159 = 0;
            }

            var2 = 3;
            break;
         case 42:
            var3 = true;
            var1 = true;
            this.field_182 = true;
            this.field_261 = 11;
            break;
         case 51:
         case 52:
         case 53:
            this.method_129(this.field_202, this.field_203, this.field_233, this.field_234);
            var2 = 0;
            var1 = true;
            this.method_67();
            this.field_125 = true;
            class_8 var10000;
            byte var10001;
            if (this.field_216 == 53) {
               var10000 = this;
               var10001 = 0;
            } else if (this.field_216 == 51) {
               var10000 = this;
               var10001 = 1;
            } else {
               var10000 = this;
               var10001 = 2;
            }

            var10000.field_126 = var10001;
            field_334[2] = (byte)(field_334[2] | 1 << this.field_126);
            this.method_112();
      }

      if (var1) {
         this.method_214(47);
      }

      if (var2 != -1) {
         this.method_257(this.field_233, this.field_234 - 1, var2);
      }

      if (var3) {
         field_176[this.field_174 << 1] = (byte)this.field_233;
         field_176[(this.field_174 << 1) + 1] = (byte)this.field_234;
         this.field_174++;
      }

      this.method_98();
      this.field_216 = -1;
   }

   // $VF: renamed from: x (int) void
   private void method_325(int var1) {
      int var2 = this.field_283;
      int var3 = this.field_284;
      if (this.field_235 <= 0 && this.method_301(var2, var3)) {
         int var4;
         if ((var4 = field_336[var2][var3] & 0xFF) != 14 && var4 != 33 || field_336[var2][var3] >> 8 != 255) {
            label37: {
               this.field_216 = var1;
               class_8 var10000;
               byte var10001;
               switch (var1) {
                  case 2:
                     this.field_213 = 3;
                     var10000 = this;
                     var10001 = 0;
                     break;
                  case 4:
                     this.field_213 = 24;
                     var10000 = this;
                     var10001 = 0;
                     break;
                  case 5:
                     this.field_213 = 25;
                     var10000 = this;
                     var10001 = 0;
                     break;
                  case 6:
                     if (this.field_201 >= 99) {
                        field_338[var2][var3] = 7;
                        field_337[var2][var3] = 0;
                        this.method_325(7);
                        break label37;
                     }

                     this.field_213 = 5;
                     var10000 = this;
                     var10001 = 0;
                     break;
                  case 7:
                     if (this.field_242 == field_334[8]) {
                        field_338[var2][var3] = 41;
                        field_337[var2][var3] = 10;
                        this.field_246 += 10;
                        this.method_325(41);
                        break label37;
                     }

                     this.field_213 = 5;
                     var10000 = this;
                     var10001 = 1;
                     break;
                  case 40:
                     this.field_213 = 19;
                     this.field_214 = 0;
                     field_338[this.field_283][this.field_284] = -1;
                     this.field_216 = 40;
                     field_334[10] = 1;
                     break label37;
                  case 41:
                     this.field_213 = 2;
                     this.field_214 = 0;
                     this.field_215 = field_337[this.field_283][this.field_284];
                     break label37;
                  case 42:
                     this.field_213 = 29;
                     var10000 = this;
                     var10001 = 0;
                     break;
                  case 51:
                     this.field_213 = 30;
                     var10000 = this;
                     var10001 = 0;
                     break;
                  case 52:
                     this.field_213 = 31;
                     var10000 = this;
                     var10001 = 0;
                     break;
                  case 53:
                     this.field_213 = 32;
                     var10000 = this;
                     var10001 = 0;
                     break;
                  default:
                     break label37;
               }

               var10000.field_214 = var10001;
            }

            field_338[var2][var3] = -1;
            this.method_98();
         }
      }
   }

   // $VF: renamed from: h (int, int) boolean
   private boolean method_326(int var1, int var2) {
      return field_338[var1][var2] == 28
         || this.field_221 >= 24
            && (
               field_338[var1][var2 - 1] == 28 && (field_337[var1][var2 - 1] & 8) == 0
                  || field_338[var1][var2 + 1] == 28 && (field_337[var1][var2 + 1] & 8) == 0
            )
         || this.field_223 >= 24 && (field_338[var1][var2 - 1] == 28 || field_338[var1][var2 + 1] == 28);
   }

   // $VF: renamed from: a (int, int, int, int, boolean) int
   private int method_327(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1 - var3;
      int var7 = var2 - var4;
      int var8 = var6 > 0 ? var6 : -var6;
      int var9 = var7 > 0 ? var7 : -var7;
      byte var10 = 0;
      if (var8 > var9) {
         label79: {
            byte var10000;
            if (var6 > 0) {
               var10000 = 4;
            } else {
               if (var6 >= 0) {
                  break label79;
               }

               var10000 = 2;
            }

            var10 = var10000;
         }

         if (var10 != 0 && (!method_313(var1 - field_329[var10], var2) || this.method_326(var1 - field_329[var10], var2))) {
            var10 = 0;
         }
      }

      if (var10 == 0) {
         label66: {
            byte var12;
            if (var7 > 0) {
               var12 = 1;
            } else {
               if (var7 >= 0) {
                  break label66;
               }

               var12 = 3;
            }

            var10 = var12;
         }

         int var11 = var2 - field_329[8 + var10];
         if (var5 && var10 != 0 && (!method_313(var1, var11) || this.field_158 && field_505[var1][var11] != 0 || this.method_326(var1, var11))) {
            label50: {
               var10 = 0;
               byte var13;
               if (var6 > 0) {
                  var13 = 4;
               } else {
                  if (var6 >= 0) {
                     break label50;
                  }

                  var13 = 2;
               }

               var10 = var13;
            }

            if (var10 != 0 && field_338[var1 - field_329[var10]][var2] >= 0) {
               var10 = 0;
            }
         }
      }

      return var10;
   }

   // $VF: renamed from: e (byte) void
   private void method_328(byte var1) {
      int var2 = this.field_283;
      int var3 = this.field_284;
      int var4 = field_337[var2][var3];
      byte var5 = field_339[var2][var3];
      int var6 = 0;
      int var7 = 0;
      boolean var8 = (field_336[var2][var3] & 0xFF) == 35;
      boolean var9 = var1 == 43 && (var4 & 3840) != 0;
      if (!var8 && this.method_346(var2, var3)) {
         field_338[var2][var3] = -1;
         this.method_338(var2, var3);
      } else {
         int var10;
         label121: {
            var10 = var4 & 7;
            byte[] var19;
            int var20;
            byte var10002;
            if (var5 <= 0) {
               if (!var8 || var5 > 6) {
                  method_348(var2, var3);
                  if (var9) {
                     var5 = 18;
                     int var18 = this.method_327(var2, var3, this.field_233, this.field_234, true);
                     var4 = var4 & -8 | var18;
                     var10 = var18;
                     var6 = -field_329[var18];
                     var7 = -field_329[var18 + 8];
                     if (var18 == 0) {
                        var5 = 0;
                        var7 = 0;
                        var6 = 0;
                     }

                     var4 -= 256;
                  } else {
                     label146: {
                        if ((var4 & 16646144) != 0 && (var4 & 248) == 0) {
                           int var17 = (var4 & 16646144) >> 17;
                           int var12 = (var4 & 2130706432) >> 24;
                           if (var2 == var17 && var3 == var12) {
                              int var14;
                              var10 = ((var14 = var4 & -16646145) & -2147483648) == 0 ? 2 : 1;
                              var4 = var14 & -8 | var10;
                              break label146;
                           }

                           var5 = 21;
                           int var13 = this.method_327(var2, var3, var17, var12, true);
                           var4 = var4 & -8 | var13;
                           var6 = -field_329[var13];
                           var7 = -field_329[var13 + 8];
                           var10 = var13;
                           if (var13 != 0) {
                              break label146;
                           }

                           var5 = 0;
                        } else {
                           if (var10 == 0) {
                              var5 = 21;
                              int var11 = (var4 & 28672) >> 12;
                              var4 = var4 & -8 | var11;
                              var10 = var11;
                              var6 = -field_329[var11];
                              var7 = -field_329[var11 + 8];
                              if (!method_313(var2 + var6, var3 + var7)) {
                                 var7 = 0;
                                 var6 = 0;
                                 var5 = 0;
                              }
                              break label146;
                           }

                           var5 = 21;
                           var6 = -field_329[var10];
                           var7 = -field_329[var10 + 8];
                           if (method_313(var2 + var6, var3 + var7)) {
                              break label146;
                           }

                           label106: {
                              int var10000;
                              short var10001;
                              switch (var10) {
                                 case 1:
                                    var10000 = var4 & -28673;
                                    var10001 = 12288;
                                    break;
                                 case 2:
                                    var10000 = var4 & -28673;
                                    var10001 = 16384;
                                    break;
                                 case 3:
                                    var10000 = var4 & -28673;
                                    var10001 = 4096;
                                    break;
                                 case 4:
                                    var10000 = var4 & -28673;
                                    var10001 = 8192;
                                    break;
                                 default:
                                    break label106;
                              }

                              var4 = var10000 | var10001;
                           }

                           var4 = var4 & -8 | 0;
                           var10 = 0;
                        }

                        var7 = 0;
                        var6 = 0;
                     }
                  }
               } else if (var5 < 0) {
                  field_339[var2][var3] = 0;
               }

               if ((var4 & 248) == 0) {
                  field_338[var2][var3] = -1;
                  field_338[var2 + var6][var3 + var7] = var1;
                  field_340[var2 + var6][var3 + var7] = 48;
                  field_339[var2 + var6][var3 + var7] = var5;
                  field_337[var2 + var6][var3 + var7] = var4;
                  break label121;
               }

               if ((field_229 & 3) == 0) {
                  var4 = var4 & -249 | (var4 & 248) - 8;
                  if (var1 == 43 && (var4 & 248) == 0) {
                     var4 = var4 & -3841 | 3072;
                  }
               }

               var19 = field_339[var2];
               var20 = var3;
               var10002 = 0;
            } else {
               if (var5 < 0) {
                  field_339[var2][var3] = 0;
               }

               var5 = (byte)(var5 - 3);
               var19 = field_339[var2];
               var20 = var3;
               var10002 = var5;
            }

            var19[var20] = var10002;
         }

         if ((var4 & 248) == 0
            && (field_327[0].field_25 < 13 || field_327[0].field_25 > 16)
            && method_353(
               var2, var3, var10, field_339[var2][var3], this.field_233, this.field_234, (this.field_236 & 4096) == 0 ? this.field_200 : 0, this.field_235
            )) {
            this.method_63(1, 48, var10);
            if (var9) {
               var4 &= -3841;
            }
         }

         field_337[var2][var3] = var4;
      }
   }

   // $VF: renamed from: bR () void
   private void method_329() {
      int var1;
      if ((var1 = (field_336[this.field_283][this.field_284] & -268435456) >> 28) == 0) {
         this.method_436(10);
      }

      if ((field_229 & 1) == 0) {
         var1++;
      }

      int[] var10000;
      int var10001;
      int var10002;
      if (var1 >= field_324[13].method_49(0)) {
         var10000 = field_336[this.field_283];
         var10001 = this.field_284;
         var10002 = field_336[this.field_283][this.field_284] & 268435455;
      } else {
         var10000 = field_336[this.field_283];
         var10001 = this.field_284;
         var10002 = field_336[this.field_283][this.field_284] & 268435455 | var1 << 28;
      }

      var10000[var10001] = var10002;
      method_348(this.field_283, this.field_284);
   }

   // $VF: renamed from: bS () void
   private void method_330() {
      if (this.field_177 != 3 && this.field_177 != 4 && this.field_177 != 5 || this.field_185 <= 0) {
         if (field_349 >= 0) {
            field_348[field_349]--;
            if (field_348[field_349] == 0) {
               this.method_306(field_349);
            }
         }
      }
   }

   // $VF: renamed from: y (int) void
   private void method_331(int var1) {
      if ((field_336[this.field_283][this.field_284] & 0xFF) != 14 || field_336[this.field_283][this.field_284] >> 8 != 255) {
         if (this.method_301(this.field_283, this.field_284) && (field_327[0].field_25 == 40 || field_327[0].field_25 == 48)) {
            label22: {
               field_338[this.field_283][this.field_284] = -1;
               class_8 var10000;
               byte var10001;
               switch (var1) {
                  case 24:
                     field_334[9] = 1;
                     this.field_213 = 7;
                     this.field_214 = 0;
                     var10000 = this;
                     var10001 = 24;
                     break;
                  case 25:
                  default:
                     break label22;
                  case 26:
                     field_334[9] = 8;
                     this.field_213 = 7;
                     this.field_214 = 2;
                     var10000 = this;
                     var10001 = 26;
                     break;
                  case 27:
                     field_334[9] = 2;
                     this.field_213 = 7;
                     this.field_214 = 1;
                     var10000 = this;
                     var10001 = 27;
               }

               var10000.field_216 = var10001;
            }

            this.method_129(this.field_202, this.field_203, this.field_283, this.field_284);
         }
      }
   }

   // $VF: renamed from: bT () void
   private void method_332() {
      int var1;
      if ((var1 = field_337[this.field_283][this.field_284]) > 0) {
         int var2 = this.field_283;
         int var3 = this.field_284;
         if (var1 == 4) {
            for (int var4 = 1; var4 < 5; var4++) {
               byte var5 = field_329[var4];
               byte var6 = field_329[var4 + 8];
               if (field_338[var2 + var5][var3 + var6] == 30) {
                  field_337[var2 + var5][var3 + var6]++;
                  field_340[var2 + var5][var3 + var6] = 24;
               }
            }
         } else if (var1 >= 16) {
            field_338[var2][var3] = -1;
            method_348(var2, var3);
         }

         field_337[var2][var3] = var1 + 1;
         field_340[var2][var3] = 24;
      }
   }

   // $VF: renamed from: bU () void
   private void method_333() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      int var3;
      if ((var3 = field_337[var1][var2]) > 0) {
         if (var3 >= 8) {
            this.method_400(var1, var2);
            field_338[var1][var2] = -1;
            method_348(var1, var2);
         }

         field_337[var1][var2] = var3 + 1;
         field_340[var1][var2] = 24;
      }
   }

   // $VF: renamed from: bV () void
   private void method_334() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      int var3;
      if ((var3 = (field_337[var1][var2] & 3840) >> 8) != 0) {
         if (var3 >= 4) {
            field_338[var1][var2] = -1;
         } else if ((field_229 >> 1 & 1) == 0) {
            field_337[var1][var2] = field_337[var1][var2] + 256;
         }
      } else if (field_505 != null && field_505[var1][var2] != 0) {
         field_337[var1][var2] = field_337[var1][var2] & -3841 | 256;
      } else if (field_339[var1][var2] <= 4) {
         label162: {
            int var4 = field_337[var1][var2];
            field_340[var1][var2] = 24;
            boolean var5 = (var4 & 16) != 0;
            int var6;
            int[] var13;
            int var10001;
            int var10002;
            int var10003;
            if ((var6 = var4 & 7) != 0) {
               byte var7;
               byte var8;
               byte var9;
               byte var10;
               byte var11;
               byte var12;
               label153: {
                  var7 = 0;
                  var8 = 0;
                  var9 = 0;
                  var10 = 0;
                  var11 = 0;
                  var12 = 0;
                  byte var10000;
                  switch (var6) {
                     case 1:
                        var7 = (byte)(var5 ? -1 : 1);
                        var11 = (byte)(var5 ? 4 : 2);
                        var12 = (byte)(var5 ? 2 : 4);
                        var10 = -1;
                        break label153;
                     case 2:
                        var8 = (byte)(var5 ? -1 : 1);
                        var11 = (byte)(var5 ? 1 : 3);
                        var12 = (byte)(var5 ? 3 : 1);
                        var10000 = 1;
                        break;
                     case 3:
                        var7 = (byte)(var5 ? 1 : -1);
                        var11 = (byte)(var5 ? 2 : 4);
                        var12 = (byte)(var5 ? 4 : 2);
                        var10 = 1;
                        break label153;
                     case 4:
                        var8 = (byte)(var5 ? 1 : -1);
                        var11 = (byte)(var5 ? 3 : 1);
                        var12 = (byte)(var5 ? 1 : 3);
                        var10000 = -1;
                        break;
                     default:
                        break label153;
                  }

                  var9 = var10000;
               }

               if (method_313(var1 + var9, var2 + var10) && method_313(var1 + var7, var2 + var8) && method_313(var1 + var7 - var9, var2 + var8 - var10)) {
                  if (field_339[var1][var2] <= 0) {
                     field_337[var1 + var9][var2 + var10] = var4;
                     field_338[var1 + var9][var2 + var10] = 11;
                     field_338[var1][var2] = -1;
                     field_339[var1 + var9][var2 + var10] = 18;
                  }
                  break label162;
               }

               if (method_313(var1 + var7, var2 + var8)) {
                  field_337[var1 + var7][var2 + var8] = var4 & -8 | var11;
                  field_338[var1 + var7][var2 + var8] = 11;
                  field_338[var1][var2] = -1;
                  field_339[var1 + var7][var2 + var8] = 18;
                  break label162;
               }

               if (method_313(var1 + var9, var2 + var10)) {
                  if (field_339[var1][var2] <= 0) {
                     field_337[var1 + var9][var2 + var10] = var4;
                     field_338[var1 + var9][var2 + var10] = 11;
                     field_338[var1][var2] = -1;
                     field_339[var1 + var9][var2 + var10] = 18;
                  }
                  break label162;
               }

               var13 = field_337[var1];
               var10001 = var2;
               var10002 = var4 & -8;
               var10003 = var12;
            } else {
               label159: {
                  if (field_338[var1 - 1][var2] >= 0) {
                     var13 = field_337[var1];
                     var10001 = var2;
                     var10002 = var4 & -8 | (var5 ? 1 : 3);
                  } else {
                     if (field_338[var1][var2 + 1] < 0) {
                        break label159;
                     }

                     var13 = field_337[var1];
                     var10001 = var2;
                     var10002 = var4 & -8 | (var5 ? 2 : 4);
                  }

                  var13[var10001] = var10002;
               }

               if (field_338[var1 + 1][var2] >= 0) {
                  field_337[var1][var2] = var4 & -8 | (var5 ? 3 : 1);
               }

               if (field_338[var1][var2 + 1] < 0) {
                  break label162;
               }

               var13 = field_337[var1];
               var10001 = var2;
               var10002 = var4 & -8;
               var10003 = var5 ? 4 : 2;
            }

            var13[var10001] = var10002 | var10003;
         }

         method_348(var1, var2);
      }

      if (this.method_301(var1, var2)) {
         this.method_63(1, 64, 0);
      }

      if (field_339[var1][var2] > 0) {
         field_339[var1][var2] = (byte)(field_339[var1][var2] - 5);
      }
   }

   // $VF: renamed from: bW () void
   private void method_335() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      if (field_337[var1][var2] > 0) {
         field_338[var1][var2] = -1;
         field_336[var1][var2] = 32;
         method_348(var1, var2);
         this.method_400(var1, var2);
         field_340[var1][var2] = 24;
      }
   }

   // $VF: renamed from: bX () void
   private void method_336() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      field_340[var1][var2] = 24;
      byte[] var10000;
      int var10001;
      byte var10002;
      if (field_339[var1][var2] == 0) {
         int var4;
         byte var5;
         boolean var7;
         int var3;
         var4 = ((var3 = field_337[var1][var2]) & 1) == 0 ? -1 : 1;
         var5 = field_338[var1 + var4][var2];
         int var6 = field_336[var1 + var4][var2] & 0xFF;
         var7 = false;
         int var8;
         label63:
         if ((var8 = var3 >> 1) <= 0) {
            var7 = true;
         } else if (var5 < 0 && var6 != 14 && var6 != 33) {
            field_337[var1 + var4][var2] = var8 - 1 << 1 | var3 & 1;
            field_340[var1 + var4][var2] = 30;
            field_339[var1 + var4][var2] = 18;
            var5 = 32;
         } else if (var5 != 32) {
            int var9 = field_337[var1 + var4][var2];
            int var10 = 0;
            if (var5 != 48 || (var9 & 8) == 0) {
               switch (var5) {
                  case 1:
                  case 2:
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                     var10 = -var4;
                  case 0:
                  case 8:
                  case 9:
                  case 11:
                  case 14:
                  case 19:
                  case 43:
                  case 47:
                  case 48:
                  case 49:
                     this.method_436(12);
                     this.field_254 = 0;
                     this.field_257 = this.field_233 - (var1 + var4) + var10;
                     this.field_255 = var1 + var4;
                     this.field_256 = var2;
                     if (this.field_253 == -1) {
                        switch (var5) {
                           case 0:
                           case 8:
                           case 9:
                           case 47:
                              int var11;
                              var9 = (var11 = var9 & -28673) & -513;
                           default:
                              this.field_253 = var9;
                        }
                     }

                     if (this.field_257 < 0) {
                        this.field_252 = var9 & -8 | 4;
                     } else {
                        this.field_252 = var9 & -8 | 2;
                     }
                     break;
                  case 3:
                  case 10:
                  case 12:
                  case 13:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 20:
                  case 21:
                  case 22:
                  case 23:
                  case 24:
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                  case 29:
                  case 30:
                  case 31:
                  case 32:
                  case 33:
                  case 34:
                  case 35:
                  case 36:
                  case 37:
                  case 38:
                  case 39:
                  case 40:
                  case 41:
                  case 42:
                  case 44:
                  case 45:
                  case 46:
                  default:
                     if (var5 == -1) {
                        break;
                     }
                     break label63;
               }
            }
         }

         if (var7) {
            for (int var12 = 1; var12 <= 3; var12++) {
               if (field_338[this.field_233 + var4 * var12][this.field_234] == 32) {
                  field_338[this.field_233 + var4 * var12][this.field_234] = -1;
               }
            }
         }

         var10000 = field_338[var1 + var4];
         var10001 = var2;
         var10002 = var5;
      } else {
         var10000 = field_339[var1];
         var10001 = var2;
         var10002 = (byte)(var10000[var2] - 6);
      }

      var10000[var10001] = var10002;
      method_348(var1, var2);
   }

   // $VF: renamed from: bY () void
   private void method_337() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      int var3 = field_337[var1][var2] & 7;
      if ((field_337[var1][var2] & 8) != 0) {
         byte var13;
         switch (var3) {
            case 2:
               var13 = 13;
               break;
            case 4:
               var13 = 12;
               break;
            default:
               var13 = 14;
         }

         byte var11 = var13;
         if (field_339[var1][var2] < method_316(field_324[29], var11) && (field_336[this.field_283][this.field_284] & 0xFF) != 35) {
            field_339[var1][var2]++;
         } else {
            field_338[var1][var2] = -1;
            method_348(var1, var2);
         }

         field_340[var1][var2] = 24;
      } else {
         if (this.method_301(var1, var2) || this.method_301(var1 + field_329[var3], var2 + field_329[8 + var3]) && field_339[var1][var2] <= this.field_235) {
            this.method_63(1, 48, 0);
         }

         byte[] var12;
         int var14;
         byte var15;
         if (field_339[var1][var2] <= 0) {
            int var4 = var1 - field_329[var3];
            int var5 = var2 - field_329[var3 + 8];
            byte var6 = 24;
            if (var3 == 4) {
               var6 = 12;
            }

            if (field_338[var4][var5] < 0) {
               field_338[var4][var5] = 21;
               field_337[var4][var5] = field_337[var1][var2];
               field_339[var4][var5] = var6;
               var12 = field_338[var1];
               var14 = var2;
               var15 = -1;
            } else if (field_338[var4][var5] == 21) {
               int var7 = field_337[var4][var5] & 7;
               int var8 = var4 - field_329[var7];
               int var9 = var5 - field_329[var7 + 8];
               field_338[var1][var2] = -1;
               method_348(var1, var2);
               int var10 = field_337[var1][var2];
               if (field_338[var8][var9] < 0) {
                  field_338[var8][var9] = 21;
                  field_337[var8][var9] = field_337[var4][var5];
                  field_339[var8][var9] = 18;
               }

               field_338[var4][var5] = 21;
               field_337[var4][var5] = var10;
               var12 = field_339[var4];
               var14 = var5;
               var15 = 18;
            } else {
               switch (field_338[var4][var5]) {
                  case 10:
                  case 30:
                     if (field_337[var4][var5] < 1) {
                        field_337[var4][var5] = 1;
                     }
                     break;
                  case 19:
                  case 43:
                  case 45:
                  case 46:
                     field_338[var4][var5] = -1;
                     this.method_338(var4, var5);
               }

               field_337[var1][var2] = field_337[var1][var2] | 8;
               var12 = field_339[var1];
               var14 = var2;
               var15 = 0;
            }

            var12[var14] = var15;
            var12 = field_340[var4];
            var14 = var5;
            var15 = 48;
         } else {
            var12 = field_339[var1];
            var14 = var2;
            var15 = (byte)(var12[var2] - 12);
         }

         var12[var14] = var15;
      }
   }

   // $VF: renamed from: p (int, int) void
   private void method_338(int var1, int var2) {
      field_336[var1][var2] = field_336[var1][var2] & 268435455 | 268435456;
      this.method_330();
   }

   // $VF: renamed from: bZ () void
   private void method_339() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      int var3;
      int var4 = ((var3 = field_337[var1][var2]) & 0xFF00) >> 8;
      int var5 = (var3 & 8) != 0 ? 4 : 2;
      if (var4 >= 20) {
         if (method_313(var1, var2 + 1)
            || var5 == 4
               && (field_338[var1 - 1][var2] < 0 || field_338[var1 - 1][var2] == 16 || field_338[var1 - 1][var2] == 19 || field_338[var1 - 1][var2] == 43)
            || var5 == 2
               && (field_338[var1 + 1][var2] < 0 || field_338[var1 + 1][var2] == 16 || field_338[var1 + 1][var2] == 19 || field_338[var1 + 1][var2] == 43)) {
            field_337[var1][var2] = var3 & -65281 | 4864;
         }
      } else {
         label79: {
            byte[] var10000;
            int var10001;
            byte var10002;
            if (var4 > 0) {
               field_337[var1][var2] = var3 & -65281 | var4 - 1 << 8;
               var10000 = field_340[var1];
               var10001 = var2;
               var10002 = 24;
            } else {
               byte var6;
               if ((var6 = field_339[var1][var2]) <= 0) {
                  int var7 = var1;
                  int var8 = var2;
                  if (method_313(var1, var2 + 1)) {
                     var8 = var2 + 1;
                     var5 = 3;
                  } else {
                     label110: {
                        if (var5 == 4) {
                           if (method_313(var1 - 1, var2)) {
                              var7 = var1 - 1;
                              break label110;
                           }

                           var5 = 0;
                           if (field_338[var1 - 1][var2] == 16 || field_338[var1 - 1][var2] == 19 || field_338[var1 - 1][var2] == 43) {
                              break label110;
                           }
                        } else {
                           if (method_313(var1 + 1, var2)) {
                              var7 = var1 + 1;
                              break label110;
                           }

                           var5 = 0;
                           if (field_338[var1 + 1][var2] == 16 || field_338[var1 + 1][var2] == 19 || field_338[var1 + 1][var2] == 43) {
                              break label110;
                           }
                        }

                        var3 = var3 & -65281 | 5120;
                     }
                  }

                  if (var7 != var1 || var8 != var2) {
                     field_338[var7][var8] = 14;
                     method_348(var7, var8);
                     field_338[var1][var2] = -1;
                     field_339[var7][var8] = 18;
                  }

                  field_337[var7][var8] = var3 & -8 | var5;
                  break label79;
               }

               var10000 = field_339[var1];
               var10001 = var2;
               var10002 = (byte)(var6 - 6);
            }

            var10000[var10001] = var10002;
         }
      }

      if (this.method_301(var1, var2)) {
         this.method_63(1, 48, var5);
      }
   }

   // $VF: renamed from: ca () void
   private void method_340() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      byte var3;
      byte var10000;
      if (field_338[var1][var2 + 1] != 16) {
         var3 = 0;
         var10000 = -1;
      } else {
         var3 = 1;
         var10000 = 0;
      }

      byte var4 = var10000;
      byte var5 = field_339[var1][var2 + var3];
      int var6;
      int var7 = ((var6 = field_337[var1][var2 + var3]) & 7) == 4 ? 4 : 2;
      boolean var8 = this.method_301(var1 - field_329[var7], var2 + var3) || this.method_301(var1 - field_329[var7], var2 + var4);
      if (var5 <= 0 && var8 && this.field_235 <= 12) {
         var5 = 36;
      } else if (var5 > 0) {
         if (var3 == 0) {
            var5--;
         }

         if ((var5 == 11 || var3 == 0 && var5 < 11) && var8) {
            this.method_63(1, 48, var6 & 7);
         }

         field_340[var1][var2] = 24;
      }

      if (this.method_346(var1, var2)) {
         this.method_436(14);
         field_338[var1][var2 + var4] = -1;
         this.method_338(var1, var2 + var4);
         field_338[var1][var2 + var3] = -1;
         this.method_338(var1, var2 + var3);
      } else {
         field_337[var1][var2 + var4] = var6;
         field_337[var1][var2 + var3] = var6;
         if (var3 == 0) {
            field_339[var1][var2 + var4] = var5;
            field_339[var1][var2 + var3] = var5;
         }
      }
   }

   // $VF: renamed from: cb () void
   private void method_341() {
      int var1;
      int var2 = ((var1 = field_337[this.field_283][this.field_284]) & 7) == 3 ? 1 : -1;
      int var3 = (var1 & 8) == 0 ? this.field_222 : this.field_224;
      int var5 = this.field_284 + (var3 - 1) * var2;
      if (this.method_301(this.field_283, var5)) {
         this.method_63(2, 48, field_330[this.field_236 & 7]);
      }

      switch (field_338[this.field_283][var5]) {
         default:
            this.method_338(this.field_283, var5);
            field_338[this.field_283][var5] = -1;
            method_348(this.field_283, var5);
            this.method_149(this.field_283, var5);
         case -1:
         case 28:
         case 32:
            field_340[this.field_283][this.field_284] = 24;
      }
   }

   // $VF: renamed from: cc () void
   private void method_342() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      int var3 = field_336[var1][var2] >> 8;
      int var4 = field_336[var1][var2] & 0xFF;
      if ((var3 & 256) == 0
         && (var4 == 9 && this.field_239 > 0 || var4 == 8 && this.field_240 > 0)
         && this.field_234 == var2
         && (this.field_233 == var1 - 1 || this.field_233 == var1 + 1)) {
         int var5 = field_327[0].field_25;
         if (field_327[0].field_25 != 18 && var5 != 17 && this.field_235 <= 6) {
            this.field_200 = this.field_199 = 0;
            class_8 var10000;
            byte var10001;
            if (this.field_233 == var1 - 1) {
               this.field_236 = this.field_236 & -8 | 2;
               var10000 = this;
               var10001 = 18;
            } else {
               this.field_236 = this.field_236 & -8 | 4;
               var10000 = this;
               var10001 = 17;
            }

            var10000.method_214(var10001);
            if (var4 == 9) {
               var10000 = this;
               var10001 = 24;
            } else {
               var10000 = this;
               var10001 = 25;
            }

            var10000.field_213 = var10001;
            this.field_214 = 0;
         }
      }
   }

   // $VF: renamed from: cd () void
   private void method_343() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      int var3;
      int var4;
      if ((var4 = ((var3 = field_336[var1][var2] >> 8) & 240) >> 4) != 0) {
         if (field_229 % 3 == 0 && var4 < 3) {
            var3 = var3 & -241 | var4 + 1 << 4;
            if (var4 == 2) {
               int var5;
               if ((var5 = field_336[var1][var2 - 1] & 0xFF) == 9 || var5 == 8) {
                  int var6 = field_336[var1][var2 - 1] >> 8 & -513;
                  field_336[var1][var2 - 1] = var6 << 8 | var5;
               }

               this.method_300(var1, var2 - 1, 1, 0, 0);
               this.method_300(var1, var2 - 1, -1, 0, 0);
            }

            field_340[var1][var2] = 24;
         }

         field_336[var1][var2] = var3 << 8 | 7;
      }
   }

   // $VF: renamed from: ce () void
   private void method_344() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      int var3;
      if ((var3 = field_336[var1][var2] >> 8) >= 6) {
         field_340[var1][var2] = 0;
      } else {
         label36:
         switch (var3) {
            case -1:
               if (Math.abs(this.field_233 - var1) < 4 && Math.abs(this.field_234 - var2) < 4) {
                  var3 = 3;
               }
            case 0:
            case 1:
               break;
            case 2:
               switch (this.field_200) {
                  case 1:
                     if (!this.method_301(var1, var2 - 1)) {
                        break label36;
                     }
                     break;
                  case 2:
                     if (!this.method_301(var1 + 1, var2)) {
                        break label36;
                     }
                     break;
                  case 3:
                     if (!this.method_301(var1, var2 + 1)) {
                        break label36;
                     }
                     break;
                  case 4:
                     if (!this.method_301(var1 - 1, var2)) {
                        break label36;
                     }
                     break;
                  default:
                     break label36;
               }

               var3 = 3;
               break;
            default:
               if ((field_229 & 1) == 0) {
                  var3++;
               }
         }

         field_340[var1][var2] = 24;
         field_336[var1][var2] = var3 << 8 | 3;
      }
   }

   // $VF: renamed from: z (int) void
   private void method_345(int var1) {
      int var2 = this.field_283;
      int var3 = this.field_284;
      int var4 = field_336[var2][var3] >> 8;
      field_336[var2][var3] = var4 << 8 | var1;
      if (field_339[var2][var3] <= 0) {
         if (var4 == 0) {
            if (this.method_301(var2, var3) && this.field_235 <= 0) {
               this.field_236 &= -2049;
               field_336[var2][var3] = 256 | var1;
               class_8 var10000;
               byte var10001;
               if (Math.abs(this.field_454 - System.currentTimeMillis()) >= 5000L) {
                  var10000 = this;
                  var10001 = 40;
               } else {
                  var10000 = this;
                  var10001 = 48;
               }

               var10000.method_214(var10001);
               this.method_436(3);
               return;
            }
         } else if ((field_229 >> 1 & 1) == 0 && field_324[var1 == 14 ? 8 : 22] != null && var4 < field_324[var1 == 14 ? 8 : 22].method_49(0) - 1) {
            field_336[var2][var3] = var4 + 1 << 8 | var1;
            field_340[var2][var3] = 24;
         }
      }
   }

   // $VF: renamed from: i (int, int) boolean
   private boolean method_346(int var1, int var2) {
      int var3 = var2 - 1;
      int var4 = var1 - 1;
      int var5 = var1 + 1;
      return field_339[var1][var3] <= 6
            && (
               method_347(var1, var3) && ((field_337[var1][var3] & 7) == 3 || field_338[var1][var2] != 16 && field_338[var1][var3] != 1)
                  || field_338[var1][var3] == 46
                  || field_338[var1][var3] == 14
                  || field_338[var1][var3] == 48
            )
         || field_339[var5][var2] <= 0 && field_338[var5][var2] == 14 && (field_337[var5][var2] & 8) != 0 && (field_337[var5][var2] & 7) != 3
         || field_339[var4][var2] <= 0 && field_338[var4][var2] == 14 && (field_337[var4][var2] & 8) == 0 && (field_337[var4][var2] & 7) != 3;
   }

   // $VF: renamed from: j (int, int) boolean
   private static boolean method_347(int var0, int var1) {
      if (field_338[var0][var1] >= 0) {
         switch (field_338[var0][var1]) {
            case 0:
            case 1:
            case 8:
            case 9:
               return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
         }
      }

      return false;
   }

   // $VF: renamed from: q (int, int) void
   private static void method_348(int var0, int var1) {
      int var2 = var0 - 1;
      int var3 = var0 + 1;
      int var4 = var1 - 1;
      int var5 = var1 + 1;
      field_340[var2][var4] = 48;
      field_340[var0][var4] = 48;
      field_340[var3][var4] = 48;
      field_340[var2][var1] = 48;
      field_340[var0][var1] = 48;
      field_340[var3][var1] = 48;
      field_340[var2][var5] = 48;
      field_340[var0][var5] = 48;
      field_340[var3][var5] = 48;
   }

   // $VF: renamed from: cf () void
   private void method_349() {
      this.field_167 = field_334[10];
      this.field_317 = this.field_315;
      this.field_316 = this.field_314;
      this.field_169 = this.field_159;
      this.field_304 = this.field_210;
      this.field_302 = this.field_247;
      this.field_303 = this.field_249;
      this.field_297 = this.field_233;
      this.field_298 = this.field_234;
      this.field_299 = this.field_239;
      this.field_300 = this.field_240;
      this.field_301 = this.field_198;
      this.field_175 = this.field_174;
      this.field_305 = this.field_180;
      this.field_306 = this.field_179;
      field_350 = field_349;
      if (field_348 != null) {
         System.arraycopy(field_348, 0, field_356, 0, field_348.length);
      }

      for (int var1 = 0; var1 < this.field_208; var1++) {
         System.arraycopy(field_337[var1], 0, field_352[var1], 0, this.field_209);
         System.arraycopy(field_339[var1], 0, field_354[var1], 0, this.field_209);
         System.arraycopy(field_338[var1], 0, field_355[var1], 0, this.field_209);
         System.arraycopy(field_336[var1], 0, field_353[var1], 0, this.field_209);
      }

      this.method_371();
   }

   // $VF: renamed from: cg () void
   private void method_350() {
      label102: {
         field_402 = -1;
         this.field_213 = this.field_214 = this.field_215 = -1;
         this.field_255 = 0;
         this.field_256 = 0;
         this.field_342 = true;
         this.field_343 = this.field_297 * 24 - 120;
         this.field_344 = this.field_298 * 24 - 160 + 40;
         this.field_260 = 0;
         int[] var10000;
         byte var10001;
         if (this.field_189) {
            this.field_261 = 15;
            this.field_189 = false;
            field_353[37][7] = -1;
            var10000 = field_353[39];
            var10001 = 5;
         } else {
            if (!this.field_190) {
               break label102;
            }

            this.field_261 = 17;
            this.field_190 = false;
            field_353[46][7] = -1;
            var10000 = field_353[50];
            var10001 = 7;
         }

         var10000[var10001] = -1;
      }

      this.field_192 = false;
      this.field_197 = 70;
      field_334[10] = this.field_167;
      this.field_159 = this.field_169;
      this.field_315 = this.field_317;
      this.field_314 = this.field_316;
      this.field_210 = this.field_304;
      this.field_249 = this.field_303;
      this.field_247 = this.field_302;
      field_327[0].method_10(2);
      this.field_236 = 2;
      this.field_258 = 0;
      this.field_233 = this.field_297;
      this.field_234 = this.field_298;
      this.field_239 = this.field_299;
      this.field_240 = this.field_300;
      this.field_174 = this.field_175;
      switch (this.field_177) {
         case 1:
            this.field_179 = this.field_306;
            this.field_180 = this.field_305;
         case 2:
         default:
            break;
         case 3:
            this.field_185 = 5;
            break;
         case 4:
            this.field_183 = 0;
            this.field_186 = 0;
            this.field_185 = 3;
            this.field_144 = false;
            break;
         case 5:
            this.method_131();
      }

      field_349 = field_350;
      if (field_348 != null) {
         System.arraycopy(field_356, 0, field_348, 0, field_348.length);
      }

      for (int var1 = 0; var1 < this.field_208; var1++) {
         System.arraycopy(field_352[var1], 0, field_337[var1], 0, this.field_209);
         System.arraycopy(field_354[var1], 0, field_339[var1], 0, this.field_209);
         System.arraycopy(field_355[var1], 0, field_338[var1], 0, this.field_209);
         System.arraycopy(field_353[var1], 0, field_336[var1], 0, this.field_209);
      }

      int var7 = this.field_209 - 1;

      for (int var2 = 1; var2 < var7; var2++) {
         int var3 = this.field_208 - 1;

         for (int var4 = 1; var4 < var3; var4++) {
            byte var5 = field_338[var4][var2];
            int var6 = field_336[var4][var2] & 0xFF;
            if (var5 > -1 && var5 < 80 || var6 > -1 && var6 < 80) {
               method_348(var4, var2);
            }
         }
      }

      if (field_327[2] != null) {
         field_327[2].method_10(0);
         field_338[18][63] = -1;
      }

      this.field_198 = this.field_301;
      this.method_98();
      if (this.field_158) {
         this.method_372();
      }

      if (field_195 != null) {
         for (int var8 = 0; var8 < this.field_209; var8++) {
            for (int var9 = 0; var9 < this.field_208; var9++) {
               if (field_338[var9][var8] == 48) {
                  this.field_283 = var9;
                  this.field_284 = var8;
                  if ((field_337[var9][var8] & 8) == 0) {
                     this.method_309((byte)48);
                  } else {
                     this.method_308();
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (short, short, byte, int) void
   public static void method_351(short var0, short var1, byte var2, int var3) {
      field_338[var0][var1] = var2;
      field_337[var0][var1] = var3;
   }

   // $VF: renamed from: b (int, int, int, int) boolean
   private static boolean method_352(int var0, int var1, int var2, int var3) {
      return Math.abs(var0 - var2) < 24 && Math.abs(var1 - var3) < 24;
   }

   // $VF: renamed from: a (int, int, int, int, int, int, int, int) boolean
   private static boolean method_353(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field_474 = 0;
      field_473 = 0;
      field_476 = 100;
      field_475 = 100;
      if (Math.abs(var0 - var4) <= 1 && Math.abs(var1 - var5) <= 1) {
         field_473 = var0 * 24 + field_329[var2] * var3;
         field_474 = var1 * 24 + field_329[8 + var2] * var3;
         field_475 = var4 * 24 + field_329[var6] * var7;
         field_476 = var5 * 24 + field_329[8 + var6] * var7;
         return method_352(field_473, field_474, field_475, field_476);
      } else {
         return false;
      }
   }

   // $VF: renamed from: ch () void
   private void method_354() {
      int var1 = this.field_283;
      int var2 = this.field_284;
      byte var3 = field_339[var1][var2];
      int var4 = field_337[var1][var2];
      byte var5 = field_338[var1][var2];
      boolean var10 = field_505 != null && field_505[var1][var2] != 0;
      int var11 = var4 & 7;
      byte var6;
      byte var7;
      int var10000;
      if (var10 && field_505[var1][var2] != 3) {
         var6 = -1;
         var7 = 1;
         var10000 = var2 - 1;
      } else {
         var6 = 1;
         var7 = 3;
         var10000 = var2 + 1;
      }

      int var8 = var10000;
      byte var12 = (this.field_236 & 4096) == 0 ? this.field_200 : 0;
      boolean var13 = method_353(var1, var2, var11, var3, this.field_233, this.field_234, var12, this.field_235);
      if (var5 == 1 && var13) {
         this.method_355(var1, var2);
      } else {
         boolean var14 = (field_336[var1][var2] & 0xFF) == 35;
         if (field_338[var1][var8] == 9 && var3 <= 0) {
            byte var16 = (byte)(field_336[var1][var8] & 0xFF);
            int var17;
            if ((var17 = (field_337[var1][var8] & 264241152) >> 22) != 34) {
               if (var17 == 33) {
                  if (var16 == -1) {
                     field_336[var1][var8] = 32;
                  }

                  this.field_233 = var1;
                  this.field_234 = var8;
                  field_338[var1][var8] = -1;
                  this.field_235 = 0;
                  this.field_237 = 0;
                  this.method_63(2, 48, 0);
               } else if (field_338[var1][var8] == 19
                  || field_338[var1][var8] == 43
                  || field_338[var1][var8] == 45
                  || field_338[var1][var8] == 46
                  || field_338[var1][var8] == 49
                  || field_338[var1][var8] == 11) {
                  field_338[var1][var8] = -1;
                  this.method_338(var1, var8);
               }
            }
         }

         if (var3 <= 0 && !var14) {
            if (var11 == var7 && this.method_301(var1, var8) && method_312(var1, var8)) {
               if ((var5 == 0 || var5 == 9) && var6 > 0) {
                  this.method_63(2, 48, 0);
               } else if (var5 == 1) {
                  field_337[var1][var8] = var4 & -8 | 3;
                  field_339[var1][var8] = 18;
                  field_338[var1][var8] = 1;
                  field_338[var1][var2] = -1;
                  this.method_149(var1, var2);
               } else if (var5 == 8) {
                  var4 &= -4063233;
               }

               field_337[var1][var2] = var4 & -8 | 0;
            } else if ((method_312(var1, var8) || field_338[var1][var8] == 21)
               && (!this.method_301(var1, var2) || this.field_237 > 0)
               && (
                  !this.method_301(var1, var8) && !method_352(field_473, field_474, field_475, field_476 - 1)
                     || this.field_237 > 0
                     || this.field_243 != 0
                     || var5 != 0 && var11 == var7
               )) {
               if (var6 <= 0 && (field_505 == null || field_505[var1][var8] == 0)) {
                  var4 = var4 & -4063240 | 0;
                  field_337[var1][var2] = var4;
                  field_339[var1][var8] = 0;
               } else {
                  int var27;
                  var4 = (var27 = var4 + 131072) & -8 | var7;
                  field_337[var1][var8] = var4 | -2147483648;
                  field_339[var1][var8] = 18;
                  field_338[var1][var8] = var5;
                  field_338[var1][var2] = -1;
                  method_348(var1, var2);
                  field_340[var1][var2 + 2 * var6] = 24;
                  this.method_149(var1, var2);
               }
            } else if (method_347(var1, var8)) {
               if (var6 < 0 && (field_505 == null || field_505[var1][var8] == 0) && field_338[var1][var2 + 1] < 0) {
                  field_337[var1][var2 + 1] = var4 & -8 | 3;
                  field_337[var1][var2 + 1] = field_337[var1][var2 + 1] | -2147483648;
                  field_338[var1][var2 + 1] = var5;
                  field_339[var1][var2 + 1] = 18;
                  field_338[var1][var2] = -1;
               } else if (field_339[var1][var8] <= 0) {
                  if ((var4 & 4063232) >> 17 >= 2) {
                     if (var5 == 8) {
                        field_338[var1][var2] = 54;
                        field_337[var1][var2] = 0;
                        method_348(var1, var2);
                        return;
                     }

                     if (field_338[var1][var8] == 8) {
                        field_338[var1][var8] = 54;
                        field_337[var1][var8] = 0;
                        method_348(var1, var8);
                        return;
                     }
                  }

                  label464: {
                     var4 &= -4063233;
                     short var37;
                     if (method_312(var1 - 1, var2) && method_312(var1 - 1, var8) && !this.method_301(var1 - 1, var2)) {
                        field_339[var1][var2] = (byte)(((var4 & 28672) >> 12) + 1);
                        field_340[var1][var2] = 24;
                        var10000 = (var4 & -8 | 4) & -3073;
                        var37 = 2048;
                     } else {
                        if (!method_312(var1 + 1, var2) || !method_312(var1 + 1, var8) || this.method_301(var1 + 1, var2)) {
                           break label464;
                        }

                        field_339[var1][var2] = (byte)(((var4 & 28672) >> 12) + 1);
                        field_340[var1][var2] = 24;
                        var10000 = (var4 & -8 | 2) & -3073;
                        var37 = 1024;
                     }

                     var4 = var10000 | var37 | 512;
                  }

                  field_337[var1][var2] = var4;
               }
            } else if (var5 == 8) {
               if ((var4 & 4063232) >> 17 >= 2) {
                  field_338[var1][var2] = 54;
                  field_337[var1][var2] = 0;
                  method_348(var1, var2);
                  return;
               }

               var4 &= -4063233;
            } else {
               var4 = (var4 & -3073 | 0) & -4063233 & -8;
               field_337[var1][var2] = var4;
            }
         } else if (!var14) {
            if ((var4 & 512) == 0) {
               if (var11 == 3 && (field_336[var1][var2] & 0xFF) == 6 && var3 <= 12) {
                  var3 = (byte)(var3 - (field_229 & 1));
                  field_340[var1][var2] = 24;
               } else {
                  var3 = (byte)(var3 - 6);
               }

               if (var3 == 0 || var3 == 12) {
                  label310: {
                     int var10001;
                     switch (var4 & 3072) {
                        case 1024:
                           var10000 = var4 & -57;
                           var10001 = var4 + 8;
                           break;
                        case 2048:
                           var10000 = var4 & -57;
                           var10001 = var4 - 8;
                           break;
                        default:
                           break label310;
                     }

                     var4 = var10000 | var10001 & 56;
                  }

                  if (var3 == 0) {
                     if ((field_336[var1][var2] & 0xFF) == 6) {
                        var4 &= -449;
                     }

                     if (var11 == var7) {
                        if ((var5 == 0 || var5 == 9) && var6 > 0 && !method_312(var1, var2 + 1)) {
                           method_265(200);
                           this.method_436(14);
                           this.field_258 = 10;
                           if (var5 == 9 && this.field_237 > 0 && this.method_301(var1, var2)) {
                              this.method_63(1, 0, 0);
                              this.method_98();
                           }

                           if (!method_347(var1, var2 + 1)) {
                              var4 = var4 & -449 | 64;
                           }
                        }

                        field_340[var1][var2] = 30;
                        if (!this.method_301(var1, var8)) {
                           var4 = var4 & -8 | 0;
                        }
                     }
                  }
               }

               field_339[var1][var2] = var3;
               field_337[var1][var2] = var4;
            } else {
               byte var29;
               byte var31;
               label292: {
                  var29 = 0;
                  var31 = 0;
                  byte var35;
                  if (var11 == 4) {
                     var35 = -1;
                  } else {
                     if (var11 != 2) {
                        break label292;
                     }

                     var35 = 1;
                  }

                  var29 = var35;
               }

               if (method_312(var1, var8) && !this.method_301(var1, var8)) {
                  if ((var3 = (byte)(var3 - 6)) <= 0) {
                     var3 = 0;
                     int var26;
                     var4 = (var26 = var4 & -513) & -8 | 0;
                  }

                  field_339[var1][var2] = var3;
                  field_337[var1][var2] = var4;
                  field_340[var1][var2] = 24;
               } else if (method_312(var1 + var29, var2)
                  && !this.method_301(var1 + var29, var2)
                  && method_312(var1 + var29, var8)
                  && !this.method_301(var1 + var29, var8)
                  && (field_337[var1][var8] & 512) == 0) {
                  if (var3 >= 6 || (field_229 & 3) == 0) {
                     var3++;
                  }

                  if (var3 >= 12) {
                     var4 &= -513;
                     if (var29 != 0) {
                        var3 = 6;
                        field_338[var1][var2] = -1;
                        if (method_312(var1 + var29, var8)) {
                           var3 = 12;
                           var4 = var4 & -8 | var7;
                           var31 = var6;
                        }
                     } else {
                        var4 = var4 & -8 | 0;
                        var3 = 0;
                     }

                     field_337[var1 + var29][var2 + var31] = var4 | -2147483648;
                     field_339[var1 + var29][var2 + var31] = var3;
                     field_338[var1 + var29][var2 + var31] = var5;
                     method_348(var1, var2);
                     field_340[var1][var2 + 2 * var6] = 24;
                  } else {
                     field_339[var1][var2] = var3;
                     field_337[var1][var2] = var4;
                     field_340[var1][var2] = 24;
                  }
               } else {
                  if ((var3 = (byte)(var3 - 6)) <= 0) {
                     var3 = 0;
                     int var25;
                     var4 = (var25 = var4 & -513) & -8 | 0;
                  }

                  field_339[var1][var2] = var3;
                  field_337[var1][var2] = var4;
                  field_340[var1][var2] = 24;
                  this.method_150(var1, var2);
               }
            }
         }

         int var30 = var4 & 536870912;
         byte var32 = field_339[var1][var2];
         int var18 = var4 & 1073741824;
         int var19 = 0;
         if (var30 == 0 && var32 != 0 || var18 == 0 && var10) {
            this.method_149(var1, var2);
         }

         if (var30 != 0 && var32 == 0 || var18 != 0 && !var10) {
            this.method_150(var1, var2);
         }

         var19 = (var4 & 512) != 0
            ? 1
            : (
               var32 != 0 || var30 != 0
                  ? 2
                  : (
                     var10
                        ? 3
                        : (
                           field_336[var1][var2] > -1 && field_336[var1][var2] < 38
                              ? 4
                              : (
                                 (method_312(var1 - 1, var2) || method_312(var1 + 1, var2))
                                       && method_347(var1, var2 + 1)
                                       && (field_337[var1][var2 + 1] & 7) == 0
                                       && var1 != this.field_255
                                       && var2 != this.field_256
                                    ? 6
                                    : 0
                              )
                        )
                  )
            );
         var4 = ((var4 & -536870913 | (var32 != 0 ? 536870912 : 0)) & -1073741825 | (var10 ? 1073741824 : 0)) & 2147483647
            | (var19 != 0 ? Integer.MIN_VALUE : 0);
         field_337[var1][var2] = var4;
         int var20;
         if ((var20 = ((field_337[var1][var2] & 448) >> 6) - 1) >= 0 && var20 < 5) {
            field_337[var1][var2] = field_337[var1][var2] & -449 | field_337[var1][var2] + 64 & 448;
         }
      }
   }

   // $VF: renamed from: r (int, int) void
   private void method_355(int var1, int var2) {
      this.method_257(var1, var2, 3);
      this.field_247++;
      field_338[var1][var2] = -1;
      this.field_159--;
      this.field_257 = 0;
      if (this.field_159 == 0) {
         field_338[this.field_160][this.field_161] = -1;
      }

      if (field_338[var1][var2 - 1] == -1) {
         this.method_149(var1, var2 - 1);
      }

      this.method_149(var1, var2);
      this.method_98();
   }

   // $VF: renamed from: a (java.lang.String, int, int, int) a
   private static class_7 method_356(String var0, int var1, int var2, int var3) {
      class_7 var4 = null;

      try {
         var4 = new class_7();
         byte[] var5 = method_362(var0, var1);
         var4.method_45(var5, 0);

         for (int var6 = var2; var6 <= var3; var6++) {
            var4.method_46(var6, 0, -1, -1);
         }

         var4.field_80 = var2;
         var4.field_83 = null;
         System.gc();
      } catch (Exception var7) {
      }

      return var4;
   }

   // $VF: renamed from: a (java.lang.String, int) a
   public static class_7 method_357(String var0, int var1) {
      return method_358(var0, var1, 0);
   }

   // $VF: renamed from: a (java.lang.String, int, int) a
   private static class_7 method_358(String var0, int var1, int var2) {
      return method_356(var0, var1, var2, var2);
   }

   // $VF: renamed from: a (java.lang.String, int) javax.microedition.lcdui.Image[]
   private static Image[] method_359(String var0, int var1) {
      return method_360(var0, var1, 0);
   }

   // $VF: renamed from: a (java.lang.String, int, int) javax.microedition.lcdui.Image[]
   private static Image[] method_360(String var0, int var1, int var2) {
      class_7 var3 = null;

      try {
         var3 = new class_7();
         byte[] var4 = method_362(var0, var1);
         var3.method_45(var4, 0);
         var3.method_46(var2, 0, -1, -1);
         method_96(var3, false);
         System.gc();
      } catch (Exception var5) {
      }

      return var3.field_85[var2];
   }

   // $VF: renamed from: a (java.lang.String, int) javax.microedition.lcdui.Image
   private static Image method_361(String var0, int var1) {
      Image var2 = null;

      try {
         byte[] var3;
         var2 = Image.createImage(var3 = method_362(var0, var1), 0, var3.length);
         System.gc();
      } catch (Exception var4) {
      }

      return var2;
   }

   // $VF: renamed from: a (java.lang.String, int) byte[]
   public static byte[] method_362(String var0, int var1) {
      try {
         InputStream var3 = javax.microedition.lcdui.ResourceLoader.open(var0);
         if (var3 == null) {
             android.util.Log.e("DiamondRush", "Asset not found: " + var0);
             return null;
         }
         int count = var3.read() & 0xFF;
         int headerLen = count << 3;
         byte[] header = new byte[headerLen];
         int read = 0;
         while (read < headerLen) {
             int r = var3.read(header, read, headerLen - read);
             if (r == -1) break;
             read += r;
         }
         int var5 = method_247(header, var1 << 3);
         int var6 = method_247(header, (var1 << 3) + 4);

         long toSkip = var5;
         while (toSkip > 0) {
             long skipped = var3.skip(toSkip);
             if (skipped <= 0) {
                 if (var3.read() == -1) break;
                 toSkip--;
             } else {
                 toSkip -= skipped;
             }
         }

         byte[] var2 = new byte[var6];
         read = 0;
         while (read < var6) {
             int r = var3.read(var2, read, var6 - read);
             if (r == -1) break;
             read += r;
         }
         var3.close();
         return var2;
      } catch (Exception var7) {
         android.util.Log.e("DiamondRush", "Error reading " + var0, var7);
         return null;
      }
   }

   // $VF: renamed from: ci () void
   private void method_363() {
      if (class_7.field_88 == null) {
         InputStream var1 = javax.microedition.lcdui.ResourceLoader.open("/mc");
         class_7.field_88 = new byte[256];

         try {
            var1.read(class_7.field_88);
            var1.close();
            return;
         } catch (Exception var3) {
         }
      }
   }

   // $VF: renamed from: a (a, java.lang.String, int) int
   public static final int method_364(class_7 var0, String var1, int var2) {
      int var3;
      if (var2 != -1 && (var3 = var1.indexOf(10)) != -1) {
         var1 = var1.substring(0, var3);
      }

      if ((var3 = var1.indexOf(125)) != -1) {
         var1 = var1.substring(0, var3);
      }

      var0.method_57(var1);
      return class_7.field_86;
   }

   // $VF: renamed from: a (a) int
   public static int method_365(class_7 var0) {
      return var0.field_89 + (var0.field_69[1] & 0xFF);
   }

   // $VF: renamed from: b (int) void
   public static void method_366(int var0) {
      class_3.field_36 = var0;
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) boolean
   private boolean method_367(Graphics var1) {
      class_3.field_35++;
      switch (class_3.field_36) {
         case 0:
            this.method_97();
            this.field_477 = new class_3();
            this.method_368();
            this.field_357.method_8();
            method_366(1);
            this.field_478 = false;
            break;
         case 1:
            class_3.method_18();
            field_435 = false;
            break;
         case 2:
            class_3.method_23();
            this.method_97();
            field_225 = 9;
            this.field_269 = 8;
            this.field_270 = 0;
            break;
         case 3:
            this.field_477.method_22(var1);
            break;
         case 4:
            method_366(0);
            this.field_477 = null;
            System.gc();
            return false;
      }

      return true;
   }

   // $VF: renamed from: cj () void
   private void method_368() {
      if ((field_335[0] & 1) == 0) {
         this.field_478 = true;
         field_335[0] = (byte)(field_335[0] | 1);
         this.method_114();
      }
   }

   // $VF: renamed from: a (java.io.InputStream) int
   private static int method_369(InputStream var0) throws IOException {
      return var0.read() & 0xFF | (var0.read() & 0xFF) << 8;
   }

   // $VF: renamed from: g (int) int
   private static int method_370(int var0) {
      if (var0 < 0) {
         var0 = Math.abs(var0);
      }

      switch (var0) {
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 4;
         case 4:
            return 8;
         case 5:
            return 16;
         case 6:
            return 32;
         case 7:
            return 64;
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         default:
            return 0;
         case 23:
            return 128;
         case 35:
            return 512;
         case 42:
            return 256;
         case 48:
            return 1024;
         case 49:
            return 2048;
         case 50:
            return 4096;
         case 51:
            return 8192;
         case 52:
            return 16384;
         case 53:
            return 32768;
         case 54:
            return 65536;
         case 55:
            return 131072;
         case 56:
            return 262144;
         case 57:
            return 524288;
      }
   }

   // $VF: renamed from: ck () void
   private void method_371() {
      if (this.field_158) {
         if (field_508 == null) {
            field_508 = new int[this.field_208][this.field_209];
         }

         for (int var1 = 0; var1 < this.field_208; var1++) {
            System.arraycopy(field_505[var1], 0, field_508[var1], 0, this.field_209);
         }

         if (field_509 == null) {
            field_509 = new long[15];
         }

         System.arraycopy(field_506, 0, field_509, 0, field_506.length);
         if (field_510 == null) {
            field_510 = new long[15];
         }

         System.arraycopy(field_507, 0, field_510, 0, field_507.length);
         this.field_493 = this.field_492;
         this.field_494 = this.field_480;
         this.field_495 = this.field_481;
         this.field_496 = this.field_482;
         this.field_497 = this.field_483;
         this.field_498 = this.field_486;
         this.field_499 = this.field_487;
         this.field_500 = this.field_488;
         this.field_501 = this.field_489;
         this.field_502 = this.field_490;
         this.field_503 = this.field_491;
         field_511 = this.field_479;
         this.field_512 = this.field_484;
         this.field_513 = this.field_485;
      }
   }

   // $VF: renamed from: cl () void
   private void method_372() {
      this.field_479 = field_511;
      this.field_484 = this.field_512;
      this.field_485 = this.field_513;

      for (int var1 = 0; var1 < this.field_208; var1++) {
         System.arraycopy(field_508[var1], 0, field_505[var1], 0, this.field_209);
      }

      System.arraycopy(field_509, 0, field_506, 0, field_506.length);
      System.arraycopy(field_510, 0, field_507, 0, field_507.length);
      this.field_492 = this.field_493;
      this.field_480 = this.field_494;
      this.field_481 = this.field_495;
      this.field_482 = this.field_496;
      this.field_483 = this.field_497;
      this.field_486 = this.field_498;
      this.field_487 = this.field_499;
      this.field_488 = this.field_500;
      this.field_489 = this.field_501;
      this.field_490 = this.field_502;
      this.field_491 = this.field_503;
   }

   // $VF: renamed from: cm () void
   private void method_373() {
      if (this.field_158) {
         this.method_374();
         field_505 = new int[this.field_208][this.field_209];
         this.method_296();
      }
   }

   // $VF: renamed from: cn () void
   private void method_374() {
      if (this.field_158) {
         field_506 = new long[15];
         field_509 = new long[15];
         field_507 = new long[15];
         field_510 = new long[15];
         this.field_492 = 3;
         this.field_479 = true;
         this.field_480 = -1;
         this.field_481 = 0;
         this.field_482 = 0;
         this.field_483 = 0;
         this.field_486 = 0;
         this.field_487 = 0;
         this.field_488 = 0;
         this.field_489 = 0;
         this.field_490 = 0;
         this.field_491 = -1;
         this.field_484 = 0;
         this.field_485 = 0;
      }
   }

   // $VF: renamed from: a (byte, byte, byte, byte) byte
   private byte method_375(byte var1, byte var2, byte var3, byte var4) {
      byte var10000 = 0;

      while (true) {
         byte var5 = var10000;
         if (var10000 >= 15 || method_380(var5, (byte)0, (byte)4) == 0) {
            if (var5 < 15) {
               this.method_381(var5, (byte)1, (byte)0, (byte)4);
               this.method_381(var5, var4, (byte)4, (byte)2);
               this.method_381(var5, var1, (byte)6, (byte)7);
               this.method_381(var5, var1, (byte)27, (byte)7);
               this.method_381(var5, var2, (byte)13, (byte)7);
               this.method_381(var5, var3, (byte)20, (byte)7);
               return var5;
            } else {
               return -1;
            }
         }

         var10000 = (byte)(var5 + 1);
      }
   }

   // $VF: renamed from: a (int, byte, byte, byte) int
   private static int method_376(int var0, byte var1, byte var2, byte var3) {
      int var4;
      return (var4 = var0 >>> var1 * 9 + var2) & ~(-1 << var3);
   }

   // $VF: renamed from: a (int, int, byte, byte, byte, byte) void
   private void method_377(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      int var7;
      int var8 = method_376(var7 = field_505[var1][var2], var3, var5, var6);
      byte var9 = (byte)(var3 * 9 + var5);
      var8 <<= var9;
      var7 ^= var8;
      int var10 = var4 << var9;
      var7 |= var10;
      field_505[var1][var2] = var7;
      field_340[var1][var2] = 24;
      field_340[var1][var2 + 1] = 24;
   }

   // $VF: renamed from: a (int, byte, byte) int
   private static int method_378(int var0, byte var1, byte var2) {
      return (int)(field_506[var0 - 1] >>> var1 & ~(-1L << var2));
   }

   // $VF: renamed from: a (int, byte, byte, byte) void
   private void method_379(int var1, byte var2, byte var3, byte var4) {
      long var5 = method_378(var1, var3, var4);
      long var7 = field_506[--var1];
      var5 <<= var3;
      var7 ^= var5;
      long var9;
      var9 = (var9 = var2) << var3;
      var7 |= var9;
      field_506[var1] = var7;
   }

   // $VF: renamed from: a (byte, byte, byte) int
   private static int method_380(byte var0, byte var1, byte var2) {
      long var3;
      return (int)((var3 = field_507[var0]) >>> var1 & ~(-1L << var2));
   }

   // $VF: renamed from: a (byte, byte, byte, byte) void
   private void method_381(byte var1, byte var2, byte var3, byte var4) {
      long var5 = method_380(var1, var3, var4);
      long var7 = field_507[var1];
      var5 <<= var3;
      var7 ^= var5;
      int var9 = var2 << var3;
      var7 |= var9;
      field_507[var1] = var7;
   }

   // $VF: renamed from: b (int, int) byte
   private byte method_382(int var1, int var2) {
      byte var10000 = 0;

      while (true) {
         byte var3 = var10000;
         if (var10000 >= 15) {
            return -1;
         }

         if (var1 == method_380(var3, (byte)13, (byte)7) && var2 == method_380(var3, (byte)20, (byte)7)) {
            return var3;
         }

         var10000 = (byte)(var3 + 1);
      }
   }

   // $VF: renamed from: a (int, int, byte) byte
   private byte method_383(int var1, int var2, byte var3) {
      byte var4;
      if ((var4 = this.method_382(var1, var2)) < 0) {
         return -1;
      }

      this.method_381(var4, var3, (byte)0, (byte)4);
      byte var10000;
      switch (var3) {
         case 1:
            var10000 = 38;
            break;
         case 2:
            var10000 = 39;
            break;
         case 3:
            var10000 = 39;
            break;
         default:
            return var4;
      }

      return var10000;
   }

   // $VF: renamed from: co () void
   private void method_384() {
      if (this.field_158) {
         if (this.field_480 >= 0 && this.field_491 >= 0) {
            this.field_480++;
            this.method_387();
         }

         switch (this.field_492) {
            case 1:
               this.field_492 = 2;
               return;
            case 2:
               byte var10000 = 1;

               while (true) {
                  byte var1 = var10000;
                  if (var10000 > 15) {
                     break;
                  }

                  switch (method_378(var1, (byte)28, (byte)3)) {
                     case 1:
                     case 6:
                     case 7:
                        this.method_393(var1);
                        break;
                     case 2:
                        if (this.field_491 >= 0) {
                           this.field_491++;
                           this.method_388(var1);
                        }
                        break;
                     case 3:
                        method_385(var1);
                     case 4:
                     case 5:
                  }

                  var10000 = (byte)(var1 + 1);
               }
            case 3:
            default:
               break;
            case 4:
               this.method_386();
               this.field_492 = 2;
               return;
            case 5:
               this.method_402(this.field_486, this.field_487);
         }
      }
   }

   // $VF: renamed from: f (byte) void
   private static void method_385(byte var0) {
      field_506[var0 - 1] = 0L;
   }

   // $VF: renamed from: cp () void
   private void method_386() {
      byte var10000 = 0;

      while (true) {
         byte var1 = var10000;
         if (var10000 >= 15) {
            return;
         }

         if (method_380(var1, (byte)0, (byte)4) == 3) {
            int var2;
            int var3;
            byte var5;
            byte var6;
            label23: {
               label22: {
                  var2 = method_380(var1, (byte)13, (byte)7);
                  var3 = method_380(var1, (byte)20, (byte)7);
                  int var4 = method_380(var1, (byte)4, (byte)2);
                  field_507[var1] = 0L;
                  var5 = 0;
                  var6 = 0;
                  switch (var4) {
                     case 0:
                        var3++;
                        var5 = 0;
                        var10000 = 0;
                        break label22;
                     case 1:
                        var2++;
                        var10000 = 1;
                        break;
                     case 2:
                        var2--;
                        var10000 = -1;
                        break;
                     default:
                        break label23;
                  }

                  var5 = var10000;
                  var10000 = 2;
               }

               var6 = var10000;
            }

            this.method_398(var2, var3, (byte)7, var5, var6, this.method_382(var2, var3));
         }

         var10000 = (byte)(var1 + 1);
      }
   }

   // $VF: renamed from: cq () void
   private void method_387() {
      class_8 var17;
      byte var10001;
      byte var10002;
      byte var10003;
      byte var10004;
      int var1 = method_378(this.field_489, (byte)14, (byte)6);
      int var2 = method_378(this.field_489, (byte)20, (byte)6);
      label201:
      switch (method_378(this.field_489, (byte)47, (byte)2)) {
         case 0:
            this.method_379(this.field_489, (byte)1, (byte)47, (byte)2);
            byte var11 = (byte)method_378(this.field_489, (byte)49, (byte)5);
            byte var13 = (byte)method_378(this.field_489, (byte)45, (byte)2);
            int var14 = 0;
            if (var13 != 0) {
               if (var13 == 2) {
                  while (
                     var1 >= this.field_486
                        && (byte)(field_338[var1 + 1][var2] - 80) < 0
                        && field_338[var1 + 1][var2] != 10
                        && field_338[var1 + 1][var2] != 37
                        && field_338[var1 + 1][var2] != 34
                        && field_338[var1 + 1][var2] != 35
                  ) {
                     var1++;
                  }
               } else {
                  while (
                     var1 <= this.field_486
                        && (byte)(field_338[var1 + 1][var2] - 80) < 0
                        && field_338[var1 + 1][var2] != 10
                        && field_338[var1 + 1][var2] != 37
                        && field_338[var1 + 1][var2] != 34
                        && field_338[var1 + 1][var2] != 35
                  ) {
                     var1++;
                  }
               }
            } else if ((byte)(field_338[var1 + 1][var2] - 80) < 0
               && field_338[var1 + 1][var2] != 10
               && field_338[var1 + 1][var2] != 37
               && field_338[var1 + 1][var2] != 34
               && field_338[var1 + 1][var2] != 35) {
               while (
                  (byte)(field_338[var1 + 1][var2] - 80) < 0
                     && field_338[var1 + 1][var2] != 10
                     && field_338[var1 + 1][var2] != 37
                     && field_338[var1 + 1][var2] != 34
                     && field_338[var1 + 1][var2] != 35
               ) {
                  var1++;
               }
            } else {
               while (var14 < var11) {
                  var14++;
                  if ((byte)(field_338[var1][var2] - 80) < 0
                     && field_338[var1][var2] != 10
                     && field_338[var1][var2] != 37
                     && field_338[var1][var2] != 34
                     && field_338[var1][var2] != 35) {
                     var14 = var11;
                  } else {
                     var1--;
                  }
               }
            }

            if (this.field_488 != 2 && var1 <= this.field_486) {
               while (
                  (byte)(field_338[var1 + 1][var2] - 80) < 0
                     && field_338[var1 + 1][var2] != 10
                     && field_338[var1 + 1][var2] != 37
                     && field_338[var1 + 1][var2] != 34
                     && field_338[var1 + 1][var2] != 35
               ) {
                  var1++;
               }
            }

            this.method_379(this.field_489, (byte)var1, (byte)14, (byte)6);
            byte var18 = 1;

            while (true) {
               byte var16 = var18;
               if ((byte)(field_338[var1 - var16][var2] - 80) >= 0
                  || field_338[var1 - var16][var2] == 10
                  || field_338[var1 - var16][var2] == 37
                  || field_338[var1 - var16][var2] == 34
                  || field_338[var1 - var16][var2] == 35) {
                  var17 = this;
                  var10001 = this.field_489;
                  var10002 = var16;
                  var10003 = 49;
                  var10004 = 5;
                  break label201;
               }

               var18 = (byte)(var16 + 1);
            }
         case 1:
            if (var2 == this.field_490) {
               this.field_480 = -1;
               this.field_491 = -1;
               method_385(this.field_489);
               this.field_492 = 4;
               return;
            }

            byte var4 = (byte)method_378(this.field_489, (byte)49, (byte)5);
            if (this.field_480 != 0 && this.field_480 % var4 == 0) {
               this.field_480 = 0;
               byte var5;
               if ((var5 = (byte)method_378(this.field_489, (byte)26, (byte)2)) >= 0) {
                  byte var10000 = 0;

                  while (true) {
                     byte var6 = var10000;
                     if (var10000 >= var4) {
                        if (var5 == 2) {
                           this.method_379(this.field_489, (byte)0, (byte)47, (byte)2);
                           this.method_379(this.field_489, (byte)0, (byte)26, (byte)2);
                           var2++;
                           var17 = this;
                           var10001 = this.field_489;
                           var10002 = (byte)var2;
                           var10003 = 20;
                           var10004 = 6;
                        } else {
                           var17 = this;
                           var10001 = this.field_489;
                           var10002 = ++var5;
                           var10003 = 26;
                           var10004 = 2;
                        }
                        break label201;
                     }

                     method_397(var1 - var6, var2, var5);
                     byte var7 = var5;
                     int var8 = var2;
                     if (++var7 > 2) {
                        var7 = 0;
                        var8++;
                     }

                     int var9 = method_376(field_505[var1 - var6][var8], var7, (byte)3, (byte)4);
                     if (var8 == this.field_490 && var5 == 2 ? var9 != 0 && var9 != 3 : var9 != 12 && var9 != 9) {
                        this.method_377(var1 - var6, var8, var7, (byte)7, (byte)3, (byte)4);
                     }

                     var10000 = (byte)(var6 + 1);
                  }
               }
            }

            return;
         default:
            return;
      }

      var17.method_379(var10001, var10002, var10003, var10004);
   }

   // $VF: renamed from: g (byte) void
   private void method_388(byte var1) {
      int var2 = method_378(var1, (byte)14, (byte)6);
      int var3 = method_378(var1, (byte)20, (byte)6);
      int var4 = method_378(var1, (byte)0, (byte)7);
      int var5 = method_378(var1, (byte)7, (byte)7);
      int var6 = method_378(var1, (byte)47, (byte)2);
      byte var7;
      byte var8 = (byte)method_380(var7 = (byte)method_378(var1, (byte)54, (byte)3), (byte)6, (byte)7);
      switch (var6) {
         case 0:
            this.method_379(var1, (byte)1, (byte)47, (byte)2);
            this.method_379(var1, (byte)(--var3), (byte)20, (byte)6);
            boolean var20 = false;
            if ((byte)(field_338[var2][var3] - 80) < 0
               && field_338[var2][var3] != 10
               && field_338[var2][var3] != 37
               && field_338[var2][var3] != 34
               && field_338[var2][var3] != 35) {
               while (
                  (byte)(field_338[var2 + 1][var3] - 80) < 0
                     && field_338[var2 + 1][var3] != 10
                     && field_338[var2 + 1][var3] != 37
                     && field_338[var2 + 1][var3] != 34
                     && field_338[var2 + 1][var3] != 35
               ) {
                  var2++;
               }
            } else {
               while (
                  (byte)(field_338[var2][var3] - 80) >= 0
                     || field_338[var2][var3] == 10
                     || field_338[var2][var3] == 37
                     || field_338[var2][var3] == 34
                     || field_338[var2][var3] == 35
               ) {
                  var2 += -1;
               }
            }

            this.method_379(var1, (byte)var2, (byte)14, (byte)6);
            byte var32 = 1;

            while (true) {
               byte var21 = var32;
               if ((byte)(field_338[var2 - var21][var3] - 80) >= 0
                  || field_338[var2 - var21][var3] == 10
                  || field_338[var2 - var21][var3] == 37
                  || field_338[var2 - var21][var3] == 34
                  || field_338[var2 - var21][var3] == 35) {
                  this.method_379(var1, var21, (byte)49, (byte)5);
                  var8 = (byte)(var8 - var21);
                  byte var24 = 0;
                  this.field_483 = 0;
                  if (var8 < 0) {
                     int var25;
                     var25 = (var25 = -var8) * 3;
                     byte var29 = 0;
                     int var15;
                     if ((var15 = var21 + var8) * 3 - var21 != 0 && (var15 = var15 * 3) <= var21 * 3 / 2) {
                        var29 = 1;
                     }

                     var25 /= var21;
                     this.field_483 = (byte)var25;
                     this.field_483 += var29;
                     if (this.field_483 > 2) {
                        this.method_379(var1, (byte)1, (byte)57, (byte)1);
                     }

                     var24 = (byte)Math.abs(var8);
                     var8 = 0;
                  }

                  if ((var5 = var5 + (var21 - var24)) > var4) {
                     int var28 = var4 - var5;
                     var5 += var28;
                     var8 = (byte)(var8 - var28);
                  }

                  this.method_379(var1, (byte)var5, (byte)7, (byte)7);
                  this.method_381(var7, var8, (byte)6, (byte)7);
                  return;
               }

               var32 = (byte)(var21 + 1);
            }
         case 1:
            byte var9 = (byte)method_378(var1, (byte)49, (byte)5);
            if (this.field_491 != 0 && this.field_491 % var9 == 0) {
               this.field_491 = 0;
               byte var10 = (byte)method_378(var1, (byte)26, (byte)2);
               byte var11 = (byte)method_378(var1, (byte)57, (byte)1);
               if (var10 >= 0) {
                  if (var11 != 1) {
                     byte var10000 = 0;

                     while (true) {
                        byte var12 = var10000;
                        if (var10000 >= var9) {
                           if (this.field_481 > 0) {
                              var12 = var10;
                              int var13 = var3;
                              if (++var12 > 2) {
                                 var12 = 0;
                                 var13++;
                              }

                              var10000 = 0;

                              while (true) {
                                 byte var14 = var10000;
                                 if (var10000 >= var9) {
                                    break;
                                 }

                                 if ((byte)(field_338[var2 - var14][var13] - 80) < 0
                                    && field_338[var2 - var14][var13] != 10
                                    && field_338[var2 - var14][var13] != 37
                                    && field_338[var2 - var14][var13] != 34
                                    && field_338[var2 - var14][var13] != 35) {
                                    this.method_377(var2 - var14, var13, var12, (byte)8, (byte)3, (byte)4);
                                 }

                                 var10000 = (byte)(var14 + 1);
                              }
                           }

                           this.field_481++;
                           break;
                        }

                        this.method_377(var2 - var12, var3, var10, (byte)7, (byte)3, (byte)4);
                        this.method_379(var1, var10, (byte)43, (byte)2);
                        this.method_377(var2 - var12, var3, var10, var1, (byte)0, (byte)3);
                        var10000 = (byte)(var12 + 1);
                     }
                  }

                  if (var11 == 1 || (var5 >= var4 || var8 == 0) && var10 == this.field_483) {
                     if (var11 == 1) {
                        this.method_379(var1, (byte)0, (byte)57, (byte)1);
                     }

                     this.method_379(var1, (byte)3, (byte)28, (byte)3);
                     if (var8 == 0) {
                        this.method_381(var7, (byte)3, (byte)0, (byte)4);
                        this.method_379(var1, (byte)5, (byte)28, (byte)3);
                        if (this.field_480 == -1) {
                           this.field_491 = -1;
                           this.field_492 = 4;
                        }

                        return;
                     }
                  }

                  if (var10 == 0) {
                     this.method_379(var1, (byte)0, (byte)47, (byte)2);
                     this.method_379(var1, (byte)2, (byte)26, (byte)2);
                     return;
                  }

                  this.method_379(var1, --var10, (byte)26, (byte)2);
                  return;
               }
            }
      }
   }

   // $VF: renamed from: a (byte, int, int, byte, byte, byte, boolean) byte
   private byte method_389(byte var1, int var2, int var3, byte var4, byte var5, byte var6, boolean var7) {
      byte var8 = 0;
      if ((byte)(field_338[var2 + var6][var3] - 80) < 0
         && field_338[var2 + var6][var3] != 10
         && field_338[var2 + var6][var3] != 37
         && field_338[var2 + var6][var3] != 34
         && field_338[var2 + var6][var3] != 35) {
         var8 = var6;
         if (var4 != var6) {
            this.method_379(var1, var6 < 0 ? 2 : var6, (byte)45, (byte)2);
         }

         var2 += var6;
         this.method_379(var1, (byte)var2, (byte)31, (byte)6);
         this.method_377(var2, var3, var5, var1, (byte)0, (byte)3);
         if (var7) {
            method_397(var2, var3, var5);
         } else {
            int var9 = 0;
            byte var10 = 0;
            int var11 = method_378(var1, (byte)28, (byte)3);
            byte var10000;
            if (var6 > 0) {
               var9 = var11 == 6 && this.field_486 == var2 && this.field_487 == var3 ? 11 : 4;
               var10000 = 9;
            } else {
               var9 = var11 == 6 && this.field_486 == var2 && this.field_487 == var3 ? 14 : 5;
               var10000 = 12;
            }

            var10 = var10000;
            class_8 var16;
            int var10001;
            int var10002;
            byte var10003;
            int var10004;
            if ((byte)(field_338[var2][var3 + 1] - 80) < 0
               && field_338[var2 + var6][var3] != 10
               && field_338[var2 + var6][var3] != 37
               && field_338[var2 + var6][var3] != 34
               && field_338[var2 + var6][var3] != 35) {
               var16 = this;
               var10001 = var2;
               var10002 = var3;
               var10003 = var5;
               var10004 = var10;
            } else {
               var16 = this;
               var10001 = var2;
               var10002 = var3;
               var10003 = var5;
               var10004 = var9;
            }

            var16.method_377(var10001, var10002, var10003, (byte)var10004, (byte)3, (byte)4);
         }
      } else {
         var8 = -2;
      }

      return var8;
   }

   // $VF: renamed from: d (int) boolean
   private boolean method_390(int var1) {
      return var1 != -1 && method_391(var1, (byte)6, (byte)1) == 1;
   }

   // $VF: renamed from: a (int, byte, byte) byte
   private static byte method_391(int var0, byte var1, byte var2) {
      return (byte)(var0 >>> var1 & ~(16777215 << var2));
   }

   // $VF: renamed from: a (int, int, int) boolean
   private static boolean method_392(int var0, int var1, int var2) {
      boolean var3 = true;
      boolean var10000 = true;

      label75:
      while (true) {
         boolean var4 = var10000;

         while (var4) {
            var4 = true;
            var0 -= var2;
            if (var2 == 0) {
               if ((byte)(field_338[var0 - 1][var1] - 80) >= 0
                  || field_338[var0 - 1][var1] == 10
                  || field_338[var0 - 1][var1] == 37
                  || field_338[var0 - 1][var1] == 34
                  || field_338[var0 - 1][var1] == 35 && (byte)(field_338[var0 + 1][var1] - 80) >= 0
                  || field_338[var0 + 1][var1] == 10
                  || field_338[var0 + 1][var1] == 37
                  || field_338[var0 + 1][var1] == 34
                  || field_338[var0 + 1][var1] == 35) {
                  var3 = true;
                  var10000 = false;
                  continue label75;
               }
            } else {
               if ((byte)(field_338[var0][var1 + 1] - 80) < 0
                  && field_338[var0][var1 + 1] != 10
                  && field_338[var0][var1 + 1] != 37
                  && field_338[var0][var1 + 1] != 34
                  && field_338[var0][var1 + 1] != 35) {
                  var4 = false;
               }

               if ((byte)(field_338[var0][var1] - 80) >= 0
                  || field_338[var0][var1] == 10
                  || field_338[var0][var1] == 37
                  || field_338[var0][var1] == 34
                  || field_338[var0][var1] == 35) {
                  var3 = var4;
                  var10000 = false;
                  continue label75;
               }

               if (!var4) {
                  return var4;
               }
            }
         }

         return var3;
      }
   }

   // $VF: renamed from: h (byte) void
   private void method_393(byte var1) {
      int var2 = method_378(var1, (byte)31, (byte)6);
      int var3 = method_378(var1, (byte)37, (byte)6);
      byte var4 = (byte)method_378(var1, (byte)43, (byte)2);
      byte var5 = (byte)method_376(field_505[var2][var3], var4, (byte)7, (byte)2);
      byte var6 = (byte)method_378(var1, (byte)45, (byte)2);
      boolean var8 = (byte)method_378(var1, (byte)28, (byte)3) == 7;
      byte var9 = 0;
      if (var6 > 1) {
         var6 = -1;
      }

      if (var5 == 0) {
         byte var10 = (byte)(var4 + 1);
         int var11 = var3;
         if (var4 == 2) {
            var10 = 0;
            var11 = var3 + 1;
         }

         if (method_376(field_505[var2][var11], var10, (byte)3, (byte)4) == 7) {
            this.field_481 = 1;
            if (var8) {
               method_385(var1);
               this.field_492 = 3;
               this.field_479 = true;
               return;
            }

            int var12;
            if ((var12 = var10 - 1) < 0) {
               var12 = 2;
            }

            this.field_491 = 0;
            byte var13 = (byte)method_376(field_505[var2][var11], var10, (byte)0, (byte)3);
            byte var14 = (byte)method_378(var1, (byte)54, (byte)3);
            this.method_379(var13, var14, (byte)54, (byte)3);
            this.method_379(var13, (byte)2, (byte)28, (byte)3);
            this.method_379(var13, (byte)0, (byte)47, (byte)2);
            this.method_379(var13, (byte)var12, (byte)26, (byte)2);
            this.method_379(var13, (byte)var2, (byte)14, (byte)6);
            this.method_379(var13, (byte)var11, (byte)20, (byte)6);
            this.method_379(var13, (byte)0, (byte)57, (byte)1);
            method_385(var1);
            return;
         }
      }

      if (var4 == 2 && var5 == 0) {
         if ((byte)(field_338[var2][var3 + 1] - 80) < 0
            && field_338[var2][var3 + 1] != 10
            && field_338[var2][var3 + 1] != 37
            && field_338[var2][var3 + 1] != 34
            && field_338[var2][var3 + 1] != 35) {
            if (var6 != 0) {
               var6 = 0;
               this.method_379(var1, (byte)0, (byte)45, (byte)2);
            }
         } else {
            label89: {
               class_8 var10000;
               byte var10001;
               int var10002;
               int var10003;
               byte var10004;
               byte var10005;
               byte var10006;
               if (var6 == 0) {
                  if (var8) {
                     method_397(var2, var3, var4);
                  } else {
                     this.method_377(var2, var3, var4, (byte)15, (byte)3, (byte)4);
                  }

                  if ((var9 = this.method_389(var1, var2, var3, var6, var4, (byte)1, var8)) >= 0) {
                     if ((byte)(field_338[var2 + -1][var3] - 80) < 0
                        && field_338[var2 + -1][var3] != 10
                        && field_338[var2 + -1][var3] != 37
                        && field_338[var2 + -1][var3] != 34
                        && field_338[var2 + -1][var3] != 35) {
                        this.method_398(var2 - 1, var3, (byte)(var8 ? 7 : 5), (byte)-1, (byte)2, (byte)method_378(var1, (byte)54, (byte)3));
                     }
                     break label89;
                  }

                  var10000 = this;
                  var10001 = var1;
                  var10002 = var2;
                  var10003 = var3;
                  var10004 = var6;
                  var10005 = var4;
                  var10006 = -1;
               } else {
                  var10000 = this;
                  var10001 = var1;
                  var10002 = var2;
                  var10003 = var3;
                  var10004 = var6;
                  var10005 = var4;
                  var10006 = var6;
               }

               var9 = var10000.method_389(var10001, var10002, var10003, var10004, var10005, var10006, var8);
            }

            if (var9 == -2) {
               int var15 = field_337[var2][var3 + 1];
               class_8 var16;
               byte var17;
               byte var18;
               byte var19;
               byte var20;
               if (this.method_390(var15) && method_392(var2, var3, var6)) {
                  this.field_481 = 0;
                  this.field_491 = 0;
                  this.method_379(var1, (byte)2, (byte)28, (byte)3);
                  this.method_379(var1, method_391(var15, (byte)0, (byte)6), (byte)0, (byte)7);
                  this.method_379(var1, (byte)2, (byte)26, (byte)2);
                  this.method_379(var1, (byte)var2, (byte)14, (byte)6);
                  var16 = this;
                  var17 = var1;
                  var18 = (byte)(var3 + 1);
                  var19 = 20;
                  var20 = 6;
               } else {
                  var16 = this;
                  var17 = var1;
                  var18 = 3;
                  var19 = 28;
                  var20 = 3;
               }

               var16.method_379(var17, var18, var19, var20);
               var2 += var6;
            } else {
               var6 = var9;
               var2 += var6;
            }
         }
      }

      if (var9 != -2) {
         switch (var6) {
            case -1:
            case 1:
               this.method_394(var2, var3, var4, var5);
               break;
            case 0:
               this.method_395(var1, var2, var3, var4, var8);
               return;
         }
      }
   }

   // $VF: renamed from: a (int, int, byte, byte) void
   private void method_394(int var1, int var2, byte var3, byte var4) {
      if (++var4 > 2) {
         var4 = 0;
      }

      this.method_377(var1, var2, var3, var4, (byte)7, (byte)2);
   }

   // $VF: renamed from: a (byte, int, int, byte, boolean) void
   private void method_395(byte var1, int var2, int var3, byte var4, boolean var5) {
      if (!var5 && method_376(field_505[var2][var3], var4, (byte)3, (byte)4) == 0) {
         this.method_377(var2, var3, var4, (byte)3, (byte)3, (byte)4);
      }

      if (++var4 > 2) {
         var4 = 0;
         this.method_379(var1, (byte)(++var3), (byte)37, (byte)6);
      }

      this.method_379(var1, var4, (byte)43, (byte)2);
      class_8 var10000;
      int var10001;
      int var10002;
      byte var10003;
      byte var10004;
      if (var5) {
         var10000 = this;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
         var10004 = 6;
      } else {
         this.method_377(var2, var3, var4, var1, (byte)0, (byte)3);
         var10000 = this;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
         var10004 = 0;
      }

      var10000.method_377(var10001, var10002, var10003, var10004, (byte)3, (byte)4);
   }

   // $VF: renamed from: s (int, int) void
   private void method_396(int var1, int var2) {
      this.field_492 = 1;
      this.method_398(var1, var2 + 1, (byte)0, (byte)0, (byte)0, this.method_382(var1, var2));
   }

   // $VF: renamed from: c (int, int, byte) void
   private static void method_397(int var0, int var1, byte var2) {
      int var3 = field_505[var0][var1];
      byte var4 = (byte)(var2 * 9);
      int var5;
      var5 = ((var5 = var3 >>> var4) & 511) << var4;
      var3 ^= var5;
      field_505[var0][var1] = var3;
      field_340[var0][var1] = 24;
   }

   // $VF: renamed from: a (int, int, byte, byte, byte, byte) byte
   private byte method_398(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      byte var10000 = 1;

      while (true) {
         byte var7 = var10000;
         if (var10000 > 15 || method_378(var7, (byte)28, (byte)3) == 0) {
            field_506[var7 - 1] = 0L;
            if (var3 == 7) {
               method_397(var1, var2, var5);
               this.method_379(var7, (byte)7, (byte)28, (byte)3);
            } else {
               this.method_379(var7, (byte)1, (byte)28, (byte)3);
               this.method_379(var7, var6, (byte)54, (byte)3);
               this.method_377(var1, var2, var5, var7, (byte)0, (byte)3);
               this.method_377(var1, var2, var5, var3, (byte)3, (byte)4);
            }

            this.method_379(var7, (byte)var1, (byte)31, (byte)6);
            this.method_379(var7, (byte)var2, (byte)37, (byte)6);
            this.method_379(var7, var5, (byte)43, (byte)2);
            if (var4 < 0) {
               var4 = 2;
            }

            this.method_379(var7, var4, (byte)45, (byte)2);
            return var7;
         }

         var10000 = (byte)(var7 + 1);
      }
   }

   // $VF: renamed from: a (int, int, int, byte) int
   private int method_399(int var1, int var2, int var3, byte var4) {
      byte var5;
      int var6 = method_378(var5 = (byte)method_376(var3, var4, (byte)0, (byte)3), (byte)31, (byte)6);
      int var7 = method_378(var5, (byte)37, (byte)6);
      int var8 = method_378(var5, (byte)43, (byte)2);
      int var9 = method_376(var3, var4, (byte)3, (byte)4);
      if (var6 == var1 && var7 == var2 && var8 == var4) {
         byte var10000;
         switch (var9) {
            case 4:
               var10000 = 1;
               break;
            case 5:
               var10000 = 2;
               break;
            default:
               return var9 << 1;
         }

         byte var10 = var10000;
         return var10 << 1;
      } else {
         switch (var9) {
            case 6:
               method_397(var1, var2, var4);
            default:
               return var9 << 1;
         }
      }
   }

   // $VF: renamed from: t (int, int) void
   private void method_400(int var1, int var2) {
      if (this.field_158) {
         this.field_488 = field_505[var1 - 1][var2] != 0 ? -1 : (field_505[var1 + 1][var2] != 0 ? 1 : 0);
         if (this.field_488 == 0) {
            this.field_488 = field_505[var1][var2 - 1] != 0 ? 2 : 0;
         }

         if (this.field_488 != 0) {
            this.field_492 = 5;
            this.method_436(13);
            this.field_486 = var1;
            this.field_487 = var2;
         }
      }
   }

   // $VF: renamed from: f (int, int) int
   private int method_401(int var1, int var2) {
      byte var3 = 0;
      boolean var4 = true;
      int var5 = 0;
      int var6 = this.field_488;
      int var7 = 0;

      while (true) {
         int var8 = 0;

         while (
            field_505[var1 + var6][var2 - 1] != 0 && (byte)(field_338[var1][var2] - 80) >= 0
               || field_338[var1][var2] == 10
               || field_338[var1][var2] == 37
               || field_338[var1][var2] == 34
               || field_338[var1][var2] == 35
         ) {
            var1 += var6;
         }

         int var10000 = 0;

         while (true) {
            var5 = var10000;
            if ((byte)(field_338[var1 + var5][var2] - 80) >= 0
               || field_338[var1 + var5][var2] == 10
               || field_338[var1 + var5][var2] == 37
               || field_338[var1 + var5][var2] == 34
               || field_338[var1 + var5][var2] == 35) {
               var5 = Math.abs(var5);
               var7 += var5;
               var2++;

               while (field_505[var1][var2] == 0) {
                  var1 += var6;
                  if (var8 >= var5 || var1 < 0 || var1 == this.field_208) {
                     if (var7 > 0) {
                        this.method_379(var3, (byte)var7, (byte)7, (byte)7);
                     }

                     return var7;
                  }

                  var8++;
               }
               break;
            }

            if (var4) {
               var4 = false;
               var3 = this.method_398(var1, var2, (byte)8, (byte)-2, (byte)2, (byte)0);
               this.method_379(var3, (byte)5, (byte)28, (byte)3);
               this.method_379(var3, (byte)var1, (byte)14, (byte)6);
               this.method_379(var3, (byte)var2, (byte)20, (byte)6);
            }

            this.method_377(var1 + var5, var2, (byte)2, var3, (byte)0, (byte)3);
            var10000 = var5 + var6;
         }
      }
   }

   // $VF: renamed from: u (int, int) void
   private void method_402(int var1, int var2) {
      class_8 var18 = this;
      this.field_480 = 0;
      int var3 = 0;
      int[] var10000;
      int var10001;
      if (this.field_488 > 1) {
         var10000 = field_505[var1];
         var10001 = var2 - 1;
      } else {
         var10000 = field_505[var1 + this.field_488];
         var10001 = var2;
      }

      var3 = var10000[var10001];
      this.field_489 = (byte)method_376(var3, (byte)2, (byte)0, (byte)3);
      this.method_379(this.field_489, (byte)0, (byte)47, (byte)2);
      int var4 = method_378(this.field_489, (byte)7, (byte)7);
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      switch (this.field_488) {
         case 2:
            var5 = (byte)0;
            var6 = var1;
            var7 = var2;
            var8 = var4;
            var9 = var2 - 1;
            this.field_486 = this.field_487 = -1;
            break;
         default:
            var5 = this.field_488;
            var6 = var1 + var5;
            var5 = (byte)(var5 < 0 ? 1 : 2);
            var7 = var2 + 1;
            var8 = var4 - this.method_401(var6, var7);
            var9 = var2;
            this.field_486 = var1;
            this.field_487 = var2;
      }

      byte var10;
      label30: {
         int var10002;
         byte var10003;
         byte var10004;
         byte var10005;
         label29: {
            this.method_379(this.field_489, (byte)var5, (byte)45, (byte)2);
            this.field_490 = var7;
            this.method_375((byte)var8, (byte)var6, (byte)var9, (byte)var5);
            var10 = this.method_382(var6, var9);
            this.method_381(var10, (byte)2, (byte)0, (byte)4);
            this.field_492 = 1;
            switch (this.field_488) {
               case -1:
                  var18 = this;
                  var10001 = var6 + 1;
                  var10002 = var2;
                  var10003 = 11;
                  var10004 = 1;
                  break;
               case 0:
               default:
                  break label30;
               case 1:
                  var18 = this;
                  var10001 = var6 - 1;
                  var10002 = var2;
                  var10003 = 14;
                  var10004 = -1;
                  break;
               case 2:
                  var18 = this;
                  var10001 = var6;
                  var10002 = var2;
                  var10003 = 3;
                  var10004 = 0;
                  var10005 = 0;
                  break label29;
            }

            var10005 = 2;
         }

         var10 = var18.method_398(var10001, var10002, var10003, var10004, var10005, var10);
      }

      this.method_379(var10, (byte)6, (byte)28, (byte)3);
      this.field_488 = 0;
   }

   // $VF: renamed from: v (int, int) void
   private void method_403(int var1, int var2) {
      if (this.method_383(var1, var2, (byte)2) > 0) {
         field_338[var1][var2] = -1;
         this.method_396(var1, var2);
      }
   }

   // $VF: renamed from: b (a, int) int
   private static int method_404(class_7 var0, int var1) {
      int var2 = (var1 << 2) + 3;
      return var0.field_72[var2] & 0xFF;
   }

   // $VF: renamed from: c (a, int) int
   private static int method_405(class_7 var0, int var1) {
      int var2 = (var1 << 2) + 2;
      return var0.field_72[var2] & 0xFF;
   }

   // $VF: renamed from: A (int) void
   private static void method_406(int var0) {
      try {
         field_325 = var0 <= 5 ? method_357("/tips.f", var0) : null;
         ByteArrayInputStream var1;
         int var2 = (var1 = new ByteArrayInputStream(method_362("/tipst.f", 0))).read();
         var0 %= var2;
         byte[] var3 = new byte[(var2 + 1) * 2];
         var1.read(var3);
         int var4 = method_246(var3, var0 << 1);
         int var5 = method_246(var3, var0 + 1 << 1);
         var1.skip(var4);
         field_326 = new byte[var5 - var4];
         var1.read(field_326);
         var1.close();
      } catch (Exception var6) {
      }
   }

   // $VF: renamed from: cr () void
   private void method_407() {
      field_324[41].field_89 = 5;
      int var22 = 0;
      var22++;
      byte var2 = field_326[0];
      this.field_392 = false;
      Graphics var3 = this.field_318;
      this.field_318.setColor(798521);
      var3.fillRoundRect(20, 60, 200, 200, 8, 8);
      var3.setColor(13540096);
      var3.drawRoundRect(20, 60, 200, 200, 8, 8);
      int var4 = 0;
      boolean var5 = true;

      for (int var6 = 0; var6 <= var2; var6++) {
         if (var6 == var2) {
            if (!var5) {
               return;
            }

            var5 = false;
            var6 = -1;
            var22 = 1;
            var4 -= 4;
            var4 = 60 + (200 - var4 >> 1);
         } else {
            label35: {
               byte var7;
               int var27;
               int var10000;
               if ((var7 = field_326[var22++]) == 0) {
                  var22 += 2;
                  var22 += 2;
                  int var10 = method_246(field_326, var22);
                  var22 += 2;
                  int var11 = var22;
                  var22 += var10;
                  byte var12 = field_326[var22++];
                  int var13 = var22;
                  var22 += var12;
                  var4 -= 3;
                  var10000 = var4;
                  var27 = this.method_409(var3, field_326, field_324[41], var11, var10, var5 ? -1 : var4, field_325, var13, 192);
               } else {
                  int var21 = var22 + 2;
                  var22 = var21 + 2;
                  int var25 = field_326[var22++] & 255;
                  if (field_325 == null) {
                     break label35;
                  }

                  if (!var5) {
                     field_325.method_53(var3, var25, (240 - field_325.field_72[(var25 << 2) + 2] & 0xFF) >> 1, var4, 0, 0, 0);
                  }

                  var10000 = var4;
                  var27 = field_325.field_72[(var25 << 2) + 3] & 255;
               }

               var4 = var10000 + var27;
            }

            var4 += 4;
         }
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, a, java.lang.String, int, int, int, int, boolean) void
   private static void method_408(Graphics var0, class_7 var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      var1.field_89 = var6;
      if (var2.endsWith("\n")) {
         var2 = var2.substring(0, var2.length() - 1);
      }

      int var8;
      int var9;
      int var10;
      int var11;
      label31: {
         var2 = method_444(var2, 230);
         var8 = method_364(var1, var2, var7 ? -1 : 0);
         var9 = var1.method_51(var2);
         var10 = var3;
         var11 = var4;
         int var10000;
         int var10001;
         if ((var5 & 32) != 0) {
            var10000 = var11;
            var10001 = var9;
         } else {
            if ((var5 & 2) == 0) {
               break label31;
            }

            var10000 = var11;
            var10001 = var9 >> 1;
         }

         var11 = var10000 - var10001;
      }

      label25: {
         int var13;
         int var14;
         if ((var5 & 8) != 0) {
            var13 = var10;
            var14 = var8;
         } else {
            if ((var5 & 1) == 0) {
               break label25;
            }

            var13 = var10;
            var14 = var8 >> 1;
         }

         var10 = var13 - var14;
      }

      var0.setColor(798521);
      var0.fillRoundRect(var10 - 5, var11 - 5, var8 + 10, var9 + 10, 10, 10);
      var0.setColor(13540096);
      var0.drawRoundRect(var10 - 5, var11 - 5, var8 + 10, var9 + 10, 10, 10);
      var1.method_59(var0, var2, var3, var4, var5);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, byte[], a, int, int, int, a, int, int) int
   private int method_409(Graphics var1, byte[] var2, class_7 var3, int var4, int var5, int var6, class_7 var7, int var8, int var9) {
      int var10 = 0;
      var6 -= var3.field_73[2];
      int var11 = var3.field_89 + (var3.field_69[1] & 255);
      int var12 = 0;
      int var13 = var6;
      boolean var14 = var6 != -1;
      int var15 = var3.field_80;
      int var16 = var4;
      boolean var17 = true;
      int var18 = var4;
      int var19 = 0;

      for (int var21 = var4; var21 <= var4 + var5; var21++) {
         int var22 = 10;
         if (var21 < var4 + var5) {
            var22 = var2[var21] & 255;
         }

         if (var17 && var12 > var9) {
            var12 = var19;
            var2[var18] = 10;
            var21 = var18 - 1;
         } else if (var22 == 10) {
            if (var17 && var14) {
               var12 = 120 - (var12 >> 1);
               var21 = var16 - 1;
               var10 = 0;
            } else {
               var12 = 0;
               var16 = var21 + 1;
               var13 += var11;
               var11 = var3.field_89 + (var3.field_69[1] & 255);
            }

            if (var14) {
               var17 = !var17;
            }
         } else {
            int var28;
            int var30;
            label105: {
               byte[] var10000;
               if (var22 > 32) {
                  if (var22 == 64 && var7 != null) {
                     if (!var17 && var14) {
                        var7.method_53(var1, var2[var10 + var8], var12, var13, 0, 0, 0);
                     }

                     var12 += method_405(var7, var2[var10 + var8]);
                     int var23;
                     if ((var23 = method_404(var7, var2[var10 + var8])) > var11) {
                        var11 = var23;
                     }

                     var10++;
                     continue;
                  }

                  var10000 = class_7.field_88;
                  var30 = var22;
               } else {
                  if (var22 == 32) {
                     var18 = var21;
                     var19 = var12;
                     var28 = var12;
                     var30 = var3.field_69[0] & 255;
                     break label105;
                  }

                  if (var22 == 1) {
                     var3.field_80 = var2[++var21];
                     continue;
                  }

                  if (var22 != 2) {
                     continue;
                  }

                  var21++;
                  var10000 = var2;
                  var30 = var21;
               }

               int var10002;
               if ((var22 = var10000[var30] & 255) >= var3.method_50(0)) {
                  int var26 = var22 - var3.method_50(0);
                  if (!var17 && var14) {
                     var3.method_53(var1, var26, var12, var13, 0, 0, 0);
                  }

                  var28 = var12;
                  var30 = var3.field_72[(var26 << 2) + 2] & 255;
                  var10002 = var3.field_72[var26 << 2] & 255;
               } else {
                  int var27 = (var3.field_73[var22 << 2] & 255) << 1;
                  if (!var17 && var14) {
                     var3.method_54(var1, 0, var22, var12, var13, 0);
                  }

                  var28 = var12;
                  var30 = var3.field_69[var27] & 255;
                  var10002 = var3.field_73[(var22 << 2) + 1];
               }

               var30 -= var10002;
            }

            var12 = var28 + var30 + var3.field_73[1];
         }
      }

      var3.field_80 = var15;
      return var13 - var6;
   }

   // $VF: renamed from: cs () void
   private void method_410() {
      this.field_377 = false;
      method_96(field_324[23], true);
      field_324[23] = null;
      method_96(field_324[24], true);
      field_324[24] = null;
      method_96(field_324[25], true);
      field_324[25] = null;
      method_96(field_324[26], true);
      field_324[26] = null;
      method_96(field_324[17], true);
      field_324[17] = null;
      this.field_549 = null;
      field_518 = null;
      field_519 = null;
      System.gc();
   }

   // $VF: renamed from: ct () void
   private void method_411() {
      this.method_67();
      this.field_557 = true;
      this.field_562 = true;
      this.field_531 = true;
      field_225 = 21;
      this.field_270 = 0;
      this.field_269 = 14;
      this.field_520 = 100;
      if (this.field_203 > this.method_121(this.field_202)) {
         this.field_203 = this.method_121(this.field_202);
      }

      this.method_412();
   }

   // $VF: renamed from: cu () void
   private void method_412() {
      field_514 = new long[12][12];
      this.field_549 = new int[20];
   }

   // $VF: renamed from: a (long, byte, byte) int
   private static int method_413(long var0, byte var2, byte var3) {
      long var4;
      return (int)((var4 = var0 >>> var2) & ~(-1L << var3));
   }

   // $VF: renamed from: a (int, int, int, byte, byte) void
   private void method_414(int var1, int var2, int var3, byte var4, byte var5) {
      long var6;
      long var8 = (long)method_413(var6 = field_514[var1][var2], var4, var5) << var4;
      var6 ^= var8;
      long var10;
      var10 = (var10 = var3) << var4;
      var6 |= var10;
      field_514[var1][var2] = var6;
   }

   // $VF: renamed from: cv () void
   private void method_415() {
      if (this.field_557) {
         field_518 = Image.createImage(186, 226);
      }

      if (this.field_562) {
         this.field_562 = false;
         this.field_563 = true;
         this.method_425();
         this.method_424();
      }

      if (this.field_563) {
         this.field_318.drawImage(field_518, 27, 56, 0);
         this.method_426();
         this.method_420();
         this.method_416();
         this.method_417();
      }

      if (this.field_563 && this.field_533 == this.field_535 && this.field_534 == this.field_536) {
         this.field_563 = false;
      }
   }

   // $VF: renamed from: cw () void
   private void method_416() {
      int var3;
      class_7 var10000;
      Graphics var10001;
      StringBuffer var10002;
      int var10003;
      if ((var3 = method_413(field_514[this.field_533][this.field_534], (byte)6, (byte)5)) < this.field_520) {
         var10000 = field_324[41];
         var10001 = this.field_318;
         var10002 = new StringBuffer().append(field_515.toString());
         var10003 = var3;
      } else {
         var10000 = field_324[41];
         var10001 = this.field_318;
         var10002 = new StringBuffer().append(field_516.toString());
         var10003 = var3 - this.field_520;
      }

      var10000.method_58(var10001, var10002.append(var10003 + 1).toString(), 8, 45, 6);
   }

   // $VF: renamed from: cx () void
   private void method_417() {
      if (this.field_533 == this.field_535 && this.field_534 == this.field_536) {
         int var3 = method_413(field_514[this.field_533][this.field_534], (byte)6, (byte)5);
         int var4 = 0;
         var4 = this.method_126(this.field_202, var3);
         int var5 = this.method_128(this.field_202, var3);
         if (var4 > var5) {
            var4 = var5;
         }

         field_517.delete(0, field_517.length());
         field_517.append(var4);
         field_517.append('/');
         field_517.append(var5);
         field_324[41].method_57(field_517.toString());
         int var7 = class_7.field_86 + 6 + 14;
         int var9 = 37 + this.field_533 * 13 + 6;
         int var10 = 73 + this.field_534 * 13 + 6;
         int var11 = var9 - (var7 >> 1) + 0;
         int var12;
         if ((var12 = var10 - 17 + -31) <= 63) {
            var12 = 63;
            if ((var11 = var9 + 20) + var7 >= 200) {
               var11 = var9 - var7 + -20;
            }
         }

         if (var11 <= 35) {
            var11 = 35;
         }

         if (var11 + var7 >= 200) {
            var11 = 150;
         }

         method_432(this.field_318, var11, var12, var7, 17, 37042, 0);
         field_324[41].method_58(this.field_318, field_517.toString(), var11 + 2, var12 + 2 - 1, 20);
         if (field_324[17] != null) {
            field_324[17].method_53(this.field_318, 10, var11 + var7 - 2 - 14, var12 + 2 - 1, 0, 0, 0);
         }
      }
   }

   // $VF: renamed from: cy () void
   private void method_418() {
      this.field_553 = 0;
      this.field_550 = 0;
      this.field_551 = 0;
      this.field_548 = false;
      this.field_547 = true;
      this.field_546 = false;
      this.field_552 = 2;
      this.field_554 = 2;
      this.field_555 = false;
   }

   // $VF: renamed from: g () boolean
   private boolean method_419() {
      boolean var1 = false;
      int var2 = this.field_550 >> 1;
      class_8 var10000;
      int var10001;
      if (this.field_552 < 0) {
         var10000 = this;
         var10001 = 2;
      } else {
         var10000 = this;
         var10001 = this.field_552 - 1;
      }

      var10000.field_552 = var10001;
      if (this.field_535 == 0 && this.field_536 == 0) {
         this.field_535 = this.field_533;
         this.field_536 = this.field_534;
      }

      if (this.field_552 == 0) {
         boolean var23;
         if (this.field_551 == var2) {
            var23 = true;
         } else {
            this.field_551++;
            var23 = false;
         }

         var1 = var23;
      }

      int var5;
      int var8;
      byte var9;
      label109: {
         var5 = method_413(field_514[this.field_533][this.field_534], (byte)3, (byte)3);
         var8 = method_413(field_514[this.field_535][this.field_536], (byte)3, (byte)3);
         var9 = 0;
         boolean var10 = false;
         byte var24;
         switch (var5 != 1 && var8 != 1 ? var5 : 1) {
            case 0:
               var24 = 2;
               break;
            case 1:
               var24 = 8;
               break;
            default:
               break label109;
         }

         var9 = var24;
      }

      int var11 = 0;
      int var12 = this.field_555 ? var2 - 1 : 0;

      for (int var13 = this.field_555 ? -1 : 1; var11 < this.field_551; var12 += var13) {
         int var14 = var12 * 2;
         field_324[17].method_53(this.field_318, var9, this.field_549[var14], this.field_549[var14 + 1], 0, 0, 0);
         var11++;
      }

      byte var15;
      byte var20;
      label98: {
         var20 = 0;
         var15 = 0;
         byte var25;
         switch (var5) {
            case 0:
               var15 = 0;
               var25 = 0;
               break;
            case 1:
               var15 = 2;
               var25 = 9;
               break;
            default:
               break label98;
         }

         var20 = var25;
      }

      int var16 = this.field_533 * 13 + var15 + 37;
      int var17 = this.field_534 * 13 + var15 + 73;
      field_324[17].method_53(this.field_318, var20, var16, var17, 0, 0, 0);
      int var18 = this.field_532 ? 7 : 6;
      field_324[17].method_53(this.field_318, var18, var16 + 6, var17 + 6, 0, 0, 0);
      boolean var19 = true;
      if (var11 == var2) {
         if (this.field_554 < 0) {
            var10000 = this;
            var10001 = 2;
         } else {
            var10000 = this;
            var10001 = this.field_554 - 1;
         }

         var10000.field_554 = var10001;
         if (this.field_554 == 0) {
            this.field_554 = 1;
            var19 = false;
         }
      }

      label92:
      if (!var19) {
         byte var27;
         switch (var8) {
            case 0:
               var15 = 0;
               var27 = 0;
               break;
            case 1:
               var15 = 2;
               var27 = 9;
               break;
            default:
               break label92;
         }

         var20 = var27;
      } else {
         label87: {
            byte var28;
            switch (var8) {
               case 0:
                  var15 = 0;
                  var28 = 1;
                  break;
               case 1:
                  var15 = 2;
                  var28 = 5;
                  break;
               default:
                  break label87;
            }

            var20 = var28;
         }
      }

      var16 = this.field_535 * 13 + var15 + 37;
      var17 = this.field_536 * 13 + var15 + 73;
      field_324[17].method_53(this.field_318, var20, var16, var17, 0, 0, 0);
      if (!var19) {
         boolean var29;
         if (this.field_553 == field_324[9].method_49(0)) {
            this.field_553--;
            this.field_548 = true;
            var29 = true;
         } else {
            var29 = false;
         }

         var1 = var29;
         if (!this.field_388) {
            field_324[9].method_53(this.field_318, this.field_553, var16, var17, 0, 0, 0);
         }

         this.field_553++;
      }

      return var1;
   }

   // $VF: renamed from: cz () void
   private void method_420() {
      int var1 = 37 + this.field_533 * 13 + 6;
      int var2 = 73 + this.field_534 * 13 + 6;
      if (this.field_533 != this.field_535 || this.field_534 != this.field_536) {
         int var6 = 37 + this.field_535 * 13 + 6;
         int var4 = 73 + this.field_536 * 13 + 6;
         if ((this.method_118(this.field_202, this.field_203 + 1) & 2) != 0 && this.field_203 + 1 == field_537 || this.field_203 == field_537) {
            this.field_546 = true;
         }

         if (!this.field_546) {
            this.field_546 = this.method_419();
            if (this.field_546) {
               this.field_562 = true;
               return;
            }
         } else if (this.method_421(var1, var2, var6, var4)) {
            this.field_533 = this.field_535;
            this.field_534 = this.field_536;
            return;
         }
      } else if (this.field_563) {
         int var3 = this.field_532 ? 7 : 6;
         field_324[17].method_53(this.field_318, var3, var1, var2, 0, 0, 0);
      }
   }

   // $VF: renamed from: c (int, int, int, int) boolean
   private boolean method_421(int var1, int var2, int var3, int var4) {
      if (this.field_531) {
         this.field_531 = false;
         this.field_522 = var1;
         this.field_523 = var2;
         this.field_524 = 0;
         this.field_525 = var3 - var1;
         this.field_526 = var4 - var2;
         this.field_527 = 0;
         this.field_528 = 0;
         this.field_529 = 10;
         this.field_530 = 10;
      }

      if (this.field_525 < 0) {
         this.field_529 = -10;
         this.field_525 = -this.field_525;
      }

      if (this.field_526 < 0) {
         this.field_530 = -10;
         this.field_526 = -this.field_526;
      }

      this.field_532 = this.field_529 <= 0;
      int var5 = this.field_532 ? 7 : 6;
      if (this.field_526 <= this.field_525) {
         this.field_527 = 2 * this.field_525;
         this.field_528 = 2 * this.field_526;
         if (this.field_529 < 0 && this.field_522 <= var3 || this.field_529 > 0 && this.field_522 >= var3) {
            var3 = 37 + this.field_535 * 13 + 6;
            var4 = 73 + this.field_536 * 13 + 6;
            field_324[17].method_53(this.field_318, var5, var3, var4, 0, 0, 0);
            this.field_531 = true;
            return true;
         }

         field_324[17].method_53(this.field_318, var5, this.field_522, this.field_523, 0, 0, 0);
         this.field_522 = this.field_522 + this.field_529;
         this.field_524 = this.field_524 + this.field_528;
         if (this.field_524 <= this.field_525) {
            return false;
         }

         this.field_523 = this.field_523 + this.field_530;
      } else {
         this.field_527 = 2 * this.field_526;
         this.field_528 = 2 * this.field_525;
         if (this.field_530 < 0 && this.field_523 <= var4 || this.field_530 > 0 && this.field_523 >= var4) {
            var3 = 37 + this.field_535 * 13 + 6;
            var4 = 73 + this.field_536 * 13 + 6;
            field_324[17].method_53(this.field_318, var5, var3, var4, 0, 0, 0);
            this.field_531 = true;
            return true;
         }

         field_324[17].method_53(this.field_318, var5, this.field_522, this.field_523, 0, 0, 0);
         this.field_523 = this.field_523 + this.field_530;
         this.field_524 = this.field_524 + this.field_528;
         if (this.field_524 <= this.field_526) {
            return false;
         }

         this.field_522 = this.field_522 + this.field_529;
      }

      this.field_524 = this.field_524 - this.field_527;
      return false;
   }

   // $VF: renamed from: a (int, int, long, int, int) void
   private void method_422(int var1, int var2, long var3, int var5, int var6) {
      int var7 = method_413(var3, (byte)6, (byte)5);
      this.field_521 |= 1 << var7;
      int var8 = method_413(var3, (byte)11, (byte)3);
      int var9 = 14;
      int var10 = 0;

      while (var10 < var8) {
         int var11 = 37 + var1 * 13;
         int var12 = 73 + var2 * 13;
         int var13 = method_413(var3, (byte)var9, (byte)4);
         var9 += 4;
         int var14 = method_413(var3, (byte)var9, (byte)4);
         int var15 = var13;
         int var16 = var14;
         long var17;
         int var19 = method_413(var17 = field_514[var15][var16], (byte)6, (byte)5);
         int var20 = this.field_521;
         label83:
         if ((var20 = this.field_521 & 1 << var19) <= 0) {
            var15 = 37 + var15 * 13;
            var16 = 73 + var16 * 13;
            var11 += 6;
            var12 += 6;
            var15 += 6;
            var16 += 6;
            this.field_538 = var11;
            this.field_539 = var12;
            this.field_540 = 0;
            this.field_541 = var15 - var11;
            this.field_542 = var16 - var12;
            this.field_543 = 0;
            this.field_544 = 0;
            this.field_545 = 1;
            byte var21 = 1;
            byte var22 = 1;
            if (this.field_541 < 0) {
               var21 = -1;
               this.field_541 = -this.field_541;
            }

            if (this.field_542 < 0) {
               var22 = -1;
               this.field_542 = -this.field_542;
            }

            byte var23 = 0;
            int var24 = method_413(var17, (byte)0, (byte)3);
            int var25 = method_413(var17, (byte)3, (byte)3);
            if (var5 == 1) {
               var25 = var5;
            }

            if (var6 == 1) {
               if (var25 == 1) {
                  break label83;
               }

               var24 = var6;
            }

            if (!this.field_548 && var19 == field_537) {
               var24 = 1;
            }

            label94:
            if (var24 == 0) {
               byte var10000;
               switch (var25) {
                  case 0:
                     var10000 = 2;
                     break;
                  case 1:
                     var10000 = 8;
                     break;
                  default:
                     break label94;
               }

               var23 = var10000;
            } else {
               label89: {
                  byte var35;
                  switch (var25) {
                     case 0:
                        var35 = 3;
                        break;
                     case 1:
                        var35 = 4;
                        break;
                     default:
                        break label89;
                  }

                  var23 = var35;
               }
            }

            if (this.field_542 <= this.field_541) {
               this.field_543 = this.field_541 << 1;
               this.field_544 = this.field_542 << 1;

               while (true) {
                  if (this.field_545 % 8 == 0) {
                     field_324[17].method_53(field_519, var23, this.field_538 - 27, this.field_539 - 56, 0, 0, 0);
                     if (this.field_547) {
                        this.method_423(var7, var19);
                     }
                  }

                  if (this.field_538 == var15) {
                     break;
                  }

                  this.field_538 += var21;
                  this.field_540 = this.field_540 + this.field_544;
                  if (this.field_540 > this.field_541) {
                     this.field_539 += var22;
                     this.field_540 = this.field_540 - this.field_543;
                  }

                  this.field_545++;
               }
            } else {
               this.field_543 = 2 * this.field_542;
               this.field_544 = 2 * this.field_541;

               while (true) {
                  if (this.field_545 % 8 == 0) {
                     field_324[17].method_53(field_519, var23, this.field_538 - 27, this.field_539 - 56, 0, 0, 0);
                     if (this.field_547) {
                        this.method_423(var7, var19);
                     }
                  }

                  if (this.field_539 == var16) {
                     break;
                  }

                  this.field_539 += var22;
                  this.field_540 = this.field_540 + this.field_544;
                  if (this.field_540 > this.field_542) {
                     this.field_538 += var21;
                     this.field_540 = this.field_540 - this.field_543;
                  }

                  this.field_545++;
               }
            }
         }

         var10++;
         var9 += 4;
      }
   }

   // $VF: renamed from: w (int, int) void
   private void method_423(int var1, int var2) {
      class_8 var10000;
      if (!this.field_556) {
         int var5 = method_413(field_514[this.field_389][this.field_390], (byte)6, (byte)5);
         if ((var2 != field_537 || var1 != var5) && (var1 != field_537 || var2 != var5)) {
            return;
         }

         if (var1 == field_537 && var2 == var5) {
            this.field_555 = true;
         }

         var10000 = this;
      } else {
         if ((var2 != field_537 || var1 != field_537 - 1) && (var1 != field_537 || var2 != field_537 - 1)) {
            return;
         }

         if (var1 == field_537 && var2 == field_537 - 1) {
            this.field_555 = true;
         }

         var10000 = this;
      }

      var10000.field_549[this.field_550++] = this.field_538;
      this.field_549[this.field_550++] = this.field_539;
   }

   // $VF: renamed from: cA () void
   private void method_424() {
      this.field_521 = 0;
      if ((this.method_118(this.field_202, this.field_203 + 1) & 2) != 0 && this.field_203 + 1 == field_537 || this.field_203 == field_537) {
         this.field_547 = false;
         this.field_548 = true;
      }

      for (int var1 = 0; var1 < 12; var1++) {
         for (int var2 = 0; var2 < 12; var2++) {
            long var3 = field_514[var1][var2];
            boolean var5 = false;
            if (var3 != 0L) {
               int var6;
               int var7;
               int var8;
               int var9;
               byte var10;
               byte var11;
               var6 = method_413(var3, (byte)3, (byte)3);
               var7 = method_413(var3, (byte)6, (byte)5);
               var8 = !this.field_548 && var7 == field_537 && var7 != 0 ? 1 : method_413(var3, (byte)0, (byte)3);
               var9 = -1;
               var10 = -1;
               var11 = -1;
               label80:
               if (var8 == 0) {
                  var5 = this.method_126(this.field_202, var7) == this.method_128(this.field_202, var7);
                  int var10000;
                  switch (var6) {
                     case 0:
                        var10 = 17;
                        var11 = 0;
                        var10000 = method_413(var3, (byte)11, (byte)3) > 2 ? 13 : 0;
                        break;
                     case 1:
                        var10 = 18;
                        var11 = 2;
                        var10000 = 9;
                        break;
                     default:
                        break label80;
                  }

                  var9 = var10000;
               } else {
                  switch (var6) {
                     case 0:
                        var11 = 0;
                        var9 = 1;
                     case 1:
                  }
               }

               this.method_422(var1, var2, var3, var6, var8);
               if (var11 != -1 && var9 != -1) {
                  if (var5 && var10 != -1) {
                     field_324[17].method_53(field_519, var10, var1 * 13 + var11 + 37 - 27, var2 * 13 + var11 + 73 - 56, 0, 0, 0);
                  }

                  byte var12;
                  label70: {
                     field_324[17].method_53(field_519, var9, var1 * 13 + var11 + 37 - 27, var2 * 13 + var11 + 73 - 56, 0, 0, 0);
                     var12 = -1;
                     byte var13;
                     switch (this.field_202) {
                        case 0:
                           if (var7 != 8) {
                              break label70;
                           }

                           var13 = 52;
                           break;
                        case 1:
                           if (var7 != 9) {
                              break label70;
                           }

                           var13 = 53;
                           break;
                        case 2:
                           if (var7 == 10) {
                              var13 = 54;
                              break;
                           }
                        default:
                           break label70;
                     }

                     var12 = var13;
                  }

                  if (var12 != -1) {
                     field_324[var12].method_53(field_519, 0, var1 * 13 + -8 + 37 - 27, var2 * 13 + -8 + 73 - 56, 0, 0, 0);
                  }
               }
            }
         }
      }

      this.field_547 = false;
   }

   // $VF: renamed from: cB () void
   private void method_425() {
      int var1;
      int var2;
      int var3;
      byte var4;
      byte var5;
      label22: {
         this.field_318.setClip(0, 0, 240, 320);
         var1 = 0;
         var2 = 0;
         var3 = 0;
         var4 = -1;
         var5 = 0;
         byte var10000;
         switch (this.field_202) {
            case 0:
               var1 = 939282;
               var2 = 3111750;
               var3 = 8635434;
               var5 = 24;
               var10000 = 28;
               break;
            case 1:
               var1 = 869201;
               var2 = 4022666;
               var3 = 5873874;
               var5 = 25;
               var10000 = 29;
               break;
            case 2:
               var1 = 5210510;
               var2 = 3711421;
               var3 = 7469567;
               var5 = 26;
               var10000 = 30;
               break;
            default:
               break label22;
         }

         var4 = var10000;
      }

      this.field_318.setColor(var1);
      this.field_318.fillRect(0, 0, 240, 320);
      field_324[var5].method_53(this.field_318, 0, 120, 0, 0, 0, 0);
      field_324[41].method_58(this.field_318, field_569[var4], 8, 6, 20);
      field_519 = field_518.getGraphics();
      field_519.setColor(var1);
      field_519.fillRect(0, 0, 186, 226);
      field_324[23].method_53(field_519, 0, 93, 113, 0, 0, 0);
      this.field_318.setColor(var2);
      this.field_318.fillRoundRect(2, 282, 236, 22, 8, 8);
      this.field_318.setColor(var3);
      this.field_318.drawRoundRect(2, 282, 236, 22, 8, 8);
      this.method_178();
      this.method_179();
      field_324[41].method_58(this.field_318, field_569[96], 222, 311, 10);
      if (field_324[17] != null) {
         field_324[17].method_53(this.field_318, 12, 11, 284, 0, 0, 0);
         field_324[17].method_53(this.field_318, 10, 155, 285, 0, 0, 0);
         field_324[17].method_53(this.field_318, 11, 80, 285, 0, 0, 0);
      }

      field_517.delete(0, field_517.length());
      field_517.append(this.field_201);
      field_324[41].method_58(this.field_318, field_517.toString(), 39, 285, 20);
      field_517.delete(0, field_517.length());
      field_517.append(method_246(field_334, 4));
      field_324[41].method_58(this.field_318, field_517.toString(), 100, 285, 20);
      field_517.delete(0, field_517.length());
      int var6 = method_246(field_334, 6);
      byte var8 = field_334[0];
      if (var6 >= var8) {
         field_517.append(var6).append("/").append(var6);
      } else {
         field_517.append(var6).append("/").append(var8);
      }

      field_324[41].method_58(this.field_318, field_517.toString(), 175, 285, 20);
      this.field_557 = false;
   }

   // $VF: renamed from: cC () void
   private void method_426() {
      int var1;
      int var2;
      label13: {
         var1 = 0;
         var2 = 0;
         int var10000;
         switch (this.field_202) {
            case 0:
               var1 = 3111750;
               var10000 = 8635434;
               break;
            case 1:
               var1 = 4022666;
               var10000 = 5873874;
               break;
            case 2:
               var1 = 3711421;
               var10000 = 7469567;
               break;
            default:
               break label13;
         }

         var2 = var10000;
      }

      this.field_318.setColor(var1);
      this.field_318.fillRoundRect(2, 34, 236, 22, 8, 8);
      this.field_318.setColor(var2);
      this.field_318.drawRoundRect(2, 34, 236, 22, 8, 8);
   }

   // $VF: renamed from: cD () void
   private void method_427() {
      if (this.field_533 == this.field_535 && this.field_534 == this.field_536) {
         byte var1 = -1;
         if (method_66(4097)) {
            var1 = 2;
         } else if (method_66(262146)) {
            var1 = 3;
         } else if (method_66(16388)) {
            var1 = 4;
         } else if (method_66(65544)) {
            var1 = 1;
         } else {
            if (method_66(32944)) {
               if (System.currentTimeMillis() - this.field_558 < 2000L) {
                  return;
               }

               int var16 = method_413(field_514[this.field_533][this.field_534], (byte)6, (byte)5);
               this.method_97();
               this.method_410();
               System.gc();
               this.field_203 = var16;
               this.method_88();
               field_171 = 0;
               return;
            }

            if (method_66(64)) {
               this.field_379 = true;
               this.field_377 = true;
               this.field_381 = true;
               this.field_270 = 0;
               field_225 = 28;
               field_171 = 0;
               return;
            }
         }

         field_171 = 0;
         if (var1 != -1) {
            int var2 = this.field_533;
            int var3 = this.field_534;
            long var4;
            int var6 = method_413(var4 = field_514[var2][var3], (byte)11, (byte)3);
            int var7 = 14;
            int var8 = -1;
            int var9 = -1;
            int var10 = 0;

            while (var10 < var6) {
               int var11 = method_413(var4, (byte)var7, (byte)4);
               var7 += 4;
               int var12 = method_413(var4, (byte)var7, (byte)4);
               label118:
               if (method_413(field_514[var11][var12], (byte)0, (byte)3) != 1) {
                  int var10000;
                  switch (var1) {
                     case 1:
                        if (var11 <= var2) {
                           break label118;
                        }

                        if (var8 >= 0) {
                           var9 = var10;
                           break label118;
                        }

                        var10000 = var10;
                        break;
                     case 2:
                        if (var12 >= var3) {
                           break label118;
                        }

                        if (var8 >= 0) {
                           var9 = var10;
                           break label118;
                        }

                        var10000 = var10;
                        break;
                     case 3:
                        if (var12 <= var3) {
                           break label118;
                        }

                        if (var8 >= 0) {
                           var9 = var10;
                           break label118;
                        }

                        var10000 = var10;
                        break;
                     case 4:
                        if (var11 < var2) {
                           if (var8 < 0) {
                              var10000 = var10;
                              break;
                           } else {
                              var9 = var10;
                           }
                        }
                     default:
                        break label118;
                  }

                  var8 = var10000;
               }

               var10++;
               var7 += 4;
            }

            if (var8 != -1) {
               var10 = -1;
               if (var9 == -1) {
                  var10 = var8;
               } else {
                  label138: {
                     int var29;
                     label92: {
                        var7 = 14 + var8 * 2 * 4;
                        int var25 = method_413(var4, (byte)var7, (byte)4);
                        var7 += 4;
                        int var27 = method_413(var4, (byte)var7, (byte)4);
                        var7 = 14 + var9 * 2 * 4;
                        int var13 = method_413(var4, (byte)var7, (byte)4);
                        var7 += 4;
                        int var14 = method_413(var4, (byte)var7, (byte)4);
                        switch (var1) {
                           case 1:
                           case 4:
                              if (var3 == var27) {
                                 var29 = var8;
                                 break label92;
                              }

                              if (var3 != var14) {
                                 var29 = Math.abs(var2 - var25) > Math.abs(var2 - var13) ? var8 : var9;
                                 break label92;
                              }
                              break;
                           case 2:
                           case 3:
                              if (var2 == var25) {
                                 var29 = var8;
                                 break label92;
                              }

                              if (var2 != var13 && var25 > var13) {
                                 var29 = var8;
                                 break label92;
                              }
                              break;
                           default:
                              break label138;
                        }

                        var29 = var9;
                     }

                     var10 = var29;
                  }
               }

               if (var10 != -1) {
                  var7 = 14 + var10 * 2 * 4;
                  int var26 = method_413(var4, (byte)var7, (byte)4);
                  var7 += 4;
                  int var28 = method_413(var4, (byte)var7, (byte)4);
                  if (method_413(field_514[var26][var28], (byte)0, (byte)3) == 0) {
                     this.field_535 = var26;
                     this.field_536 = var28;
                     this.field_563 = true;
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: B (int) void
   private void method_428(int var1) {
      try {
         switch (var1) {
            case 0:
               if (this.field_378) {
                  this.method_110();
                  return;
               }
               break;
            case 1:
               if (this.field_379) {
                  this.method_97();
                  return;
               }
               break;
            case 2:
               if (this.field_376) {
                  this.method_72();
                  return;
               }
               break;
            case 3:
               if (this.field_377) {
                  this.method_410();
                  return;
               }
               break;
            case 4:
               field_324[41].field_80 = 0;
               field_517.delete(0, field_517.length());
               switch (this.field_202) {
                  case 0:
                     field_517.append("/map_angkor.out");
                     break;
                  case 1:
                     field_517.append("/map_scotland.out");
                     break;
                  case 2:
                     field_517.append("/map_tibet.out");
               }

               field_514 = new long[12][12];
               this.field_549 = new int[20];
               this.method_429(field_517.toString());
               return;
            case 5:
               field_324[17] = method_357("/ms.f", 0);
               field_324[23] = method_357("/ms.f", 1);
               return;
            case 6:
               class_7[] var10000;
               byte var10001;
               String var10002;
               byte var10003;
               switch (this.field_202) {
                  case 0:
                     var10000 = field_324;
                     var10001 = 24;
                     var10002 = "/ms.f";
                     var10003 = 2;
                     break;
                  case 1:
                     var10000 = field_324;
                     var10001 = 25;
                     var10002 = "/ms.f";
                     var10003 = 3;
                     break;
                  case 2:
                     var10000 = field_324;
                     var10001 = 26;
                     var10002 = "/ms.f";
                     var10003 = 4;
                     break;
                  default:
                     return;
               }

               var10000[var10001] = method_357(var10002, var10003);
               return;
            case 7:
               if (field_324[54] == null) {
                  field_324[54] = method_357("/mmv.f", 1);
               }

               this.field_129 = method_405(field_324[54], 0) >> 1;
               this.field_130 = method_404(field_324[54], 0) >> 1;
               return;
            case 8:
               if (field_324[53] == null) {
                  field_324[53] = method_357("/mmv.f", 2);
                  return;
               }
               break;
            case 9:
               if (field_324[52] == null) {
                  field_324[52] = method_357("/mmv.f", 3);
                  return;
               }
               break;
            case 10:
               if (this.field_451) {
                  this.method_418();
                  return;
               }
            case 11:
            case 12:
            case 13:
            default:
               break;
            case 14:
               if (this.field_313) {
                  this.field_313 = false;
               }

               this.method_430();
               field_225 = 15;
         }
      } catch (Exception var3) {
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   private void method_429(String var1) throws IOException {
      InputStream var2;
      int var3 = ((byte)(var2 = javax.microedition.lcdui.ResourceLoader.open(var1)).read() & 255) + ((byte)var2.read() & 255) * 256;
      int var4 = var2.read();
      field_326 = new byte[var3];
      var2.read(field_326);
      var2.close();
      int var5 = 0;

      for (int var6 = 0; var6 < var4; var6++) {
         byte var7 = field_326[var5++];
         byte var8 = field_326[var5++];
         byte var9 = field_326[var5++];
         byte var10 = field_326[var5++];
         if (var9 == 1 && var10 < this.field_520) {
            this.field_520 = var10;
         }

         byte var11 = field_326[var5++];
         this.method_414(var7, var8, 1, (byte)0, (byte)3);
         this.method_414(var7, var8, var9, (byte)3, (byte)3);
         this.method_414(var7, var8, var10, (byte)6, (byte)5);
         this.method_414(var7, var8, var11, (byte)11, (byte)3);
         byte var12 = 14;

         for (int var13 = 0; var13 < var11; var13++) {
            byte var14 = field_326[var5++];
            this.method_414(var7, var8, var14, var12, (byte)4);
            var12 = (byte)(var12 + 4);
            byte var15 = field_326[var5++];
            this.method_414(var7, var8, var15, var12, (byte)4);
            var12 = (byte)(var12 + 4);
         }
      }

      field_326 = null;
      System.gc();
   }

   // $VF: renamed from: cE () void
   private void method_430() {
      this.field_533 = -1;
      if (!this.field_451) {
         this.field_203 = field_537;
      }

      this.field_451 = false;

      for (int var1 = 0; var1 < 12; var1++) {
         for (int var2 = 0; var2 < 12; var2++) {
            long var3;
            if ((var3 = field_514[var1][var2]) != 0L) {
               int var5 = method_413(var3, (byte)6, (byte)5);
               class_8 var10000;
               int var10001;
               int var10002;
               byte var10003;
               if ((this.method_118(this.field_202, var5) & 64) == 0 && var5 != 0) {
                  var10000 = this;
                  var10001 = var1;
                  var10002 = var2;
                  var10003 = 1;
               } else {
                  var10000 = this;
                  var10001 = var1;
                  var10002 = var2;
                  var10003 = 0;
               }

               var10000.method_414(var10001, var10002, var10003, (byte)0, (byte)3);
               if (var5 == this.field_203) {
                  this.field_533 = var1;
                  this.field_534 = var2;
               }

               if (var5 == field_537) {
                  this.field_535 = var1;
                  this.field_536 = var2;
               }

               this.field_532 = false;
            }
         }
      }
   }

   // $VF: renamed from: cF () void
   private void method_431() {
      field_324[17] = method_357("/ms.f", 0);
      this.method_215();
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int) void
   public static final void method_432(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var0.getClipX();
      int var8 = var0.getClipY();
      int var9 = var0.getClipWidth();
      int var10 = var0.getClipHeight();
      var0.setClip(var1, var2, var3, var4);
      var0.setColor(var5);
      var0.fillRect(var1, var2, var3, var4);
      var0.setClip(var1 - 3, var2, var3 + 6, var4);

      for (int var11 = var2; var11 <= var2 + var4; var11 += 8) {
         var0.drawImage(field_323[var6][7], var1, var11, 24);
         var0.drawImage(field_323[var6][5], var1 + var3, var11, 20);
      }

      var0.setClip(var1, var2 - 3, var3, var4 + 6);

      for (int var12 = var1; var12 <= var1 + var3; var12 += 8) {
         var0.drawImage(field_323[var6][4], var12, var2, 36);
         var0.drawImage(field_323[var6][6], var12, var2 + var4, 20);
      }

      var0.setClip(var1 - 3, var2 - 3, var3 + 6, var4 + 6);
      var0.drawImage(field_323[var6][0], var1, var2, 40);
      var0.drawImage(field_323[var6][1], var1 + var3, var2, 36);
      var0.drawImage(field_323[var6][2], var1, var2 + var4, 24);
      var0.drawImage(field_323[var6][3], var1 + var3, var2 + var4, 20);
      var0.setClip(var7, var8, var9, var10);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int, int) void
   public static final void method_433(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var0.getClipX();
      int var10 = var0.getClipY();
      int var11 = var0.getClipWidth();
      int var12 = var0.getClipHeight();
      method_432(var0, var1, var2, var3, var4, var5, var6);
      method_432(var0, var1 + 10, var2 - 3 - var8, var7, var8, var5, var6);
      var0.setClip(var1 + 10 - 3, var2 - 3, var7 + 6, 3);
      var0.setColor(var5);
      var0.fillRect(var1 + 10 - 3, var2 - 3, var7 + 6, 3);
      var0.drawImage(field_323[var6][3], var1 + 10, var2 - 3, 24);
      var0.drawImage(field_323[var6][2], var1 + 10 + var7, var2 - 3, 20);
      var0.setClip(var9, var10, var11, var12);
   }

   // $VF: renamed from: cG () void
   private void method_434() {
      if (this.field_100 != this.field_559 || this.field_562) {
         if (this.field_100 != this.field_559) {
            this.field_562 = true;
         }

         this.field_318.setClip(0, 0, 240, 320);
         if (this.field_562) {
            this.method_137(this.field_318, true);
            this.field_318.setColor(0);
            this.field_318.fillRect(0, 0, 240, 15);
            this.field_318.setColor(16777215);
            this.field_318.drawLine(0, 15, 240, 15);
            field_324[41].method_58(this.field_318, field_569[72], 120, 0, 17);
            method_432(this.field_318, 10, 35, 220, 90, 4273165, 0);
            if (this.field_101 != -1) {
               field_324[41].method_59(this.field_318, method_444(this.field_102, 200), 120, 280, 17);
            }

            if (this.field_440) {
               this.field_440 = false;
               field_324[41].method_58(this.field_318, this.field_102, 120, 191, 1);
            }

            field_324[41].method_59(this.field_318, this.field_560, 120, 260, 17);
            this.method_178();
            this.method_179();
            this.field_562 = false;
         }

         if (this.field_100 != this.field_559) {
            this.field_318.setColor(4273165);
            this.field_318.fillRect(20, 43 + (this.field_559 >= 0 ? this.field_559 : this.field_100) * 20 + 2, 7, 9);
         }

         field_324[17].method_53(this.field_318, 14, 20, 43 + this.field_100 * 20 + 2, 0, 0, 0);
         method_432(this.field_318, 10, 155, 220, 70, 4273165, 0);
         class_7 var10000;
         Graphics var10001;
         String var10002;
         byte var10003;
         short var10004;
         if (this.field_101 != -1) {
            String var1 = field_569[74] + " " + this.field_561.toString() + "\n" + field_569[42];
            field_324[41].field_89 = 0;
            var10000 = field_324[41];
            var10001 = this.field_318;
            var10002 = var1;
            var10003 = 120;
            var10004 = 185;
         } else {
            var10000 = field_324[41];
            var10001 = this.field_318;
            var10002 = this.field_102;
            var10003 = 120;
            var10004 = 191;
         }

         var10000.method_59(var10001, var10002, var10003, var10004, 1);
         int var10 = 0;

         for (int var2 = 0; var2 < 4; var2++) {
            var10 = 43 + 20 * var2;
            field_324[46].method_53(this.field_318, 0 + var2, 27, var10, 0, 0, 0);
            field_324[41].method_58(this.field_318, field_569[85 + var2], 53, var10, 0);
         }

         Image[] var12;
         int var3 = (var12 = field_324[0].field_85[0])[11].getWidth();
         int var4 = var12[15].getWidth();
         this.field_318.drawImage(var12[11], 100, 160, 0);

         for (int var7 = 0; var7 < 8; var7++) {
            int var8 = var7 >= 4 ? 13 : 15;
            this.field_318.drawImage(var12[var8], 100 + var3, 160, 0);
            var3 += var4;
         }

         int var14 = this.field_100;
         int var15 = var3;
         var3 -= var4 * 4;

         for (int var9 = 0; var9 <= var14; var9++) {
            this.field_318.drawImage(var12[15], 100 + var3, 160, 0);
            var3 += var4;
         }

         this.field_318.drawImage(var12[17], 100 + var15, 160, 0);
         if (this.field_100 != this.field_559) {
            this.field_559 = this.field_100;
         }
      }
   }

   // $VF: renamed from: a (int, int, short) void
   private static void method_435(int var0, int var1, short var2) {
      for (byte var3 = 0; var3 < field_566[var0].length; var3 += 2) {
         if (var1 == field_566[var0][var3]) {
            field_566[var0][var3 + 1] = var2;
            return;
         }
      }
   }

   // $VF: renamed from: C (int) void
   private void method_436(int var1) {
      this.field_357.method_7(var1);
   }

   // $VF: renamed from: cH () void
   private void method_437() {
      switch (this.field_226) {
         case 0:
            this.field_564 = 0;
            this.field_565 = 0;
            this.field_226 = 1;
            return;
         case 1:
            field_570 = method_362("/cr.f", 0);
            int var4 = 0;

            while (var4 < field_570.length) {
               if (field_570[var4] == 92 && field_570[var4 + 1] == 110) {
                  field_570[var4++] = 10;
                  field_570[var4++] = 32;
               } else {
                  var4++;
               }
            }

            var4 = 0;

            while (field_570[var4] != 36) {
               var4++;
            }

            for (int var8 = 0; var8 < GloftDIRU.field_92.length; var4++) {
               field_570[var4] = GloftDIRU.field_92[var8];
               var8++;
            }

            this.field_226 = 2;
            return;
         case 2:
            label87: {
               class_8 var10000;
               int var10001;
               label86: {
                  byte var10002;
                  label85: {
                     if (method_66(4097)) {
                        boolean var2 = false;
                        if (this.field_564 >= 240) {
                           this.field_564 -= 3;
                           if (this.field_564 >= 240) {
                              break label87;
                           }

                           var10000 = this;
                           var10001 = 240;
                           break label86;
                        }
                     } else {
                        if (method_66(262146)) {
                           var10000 = this;
                           var10001 = this.field_564;
                           var10002 = 3;
                           break label85;
                        }

                        if (method_66(64)) {
                           if (this.field_134) {
                              this.field_270 = 0;
                              this.field_269 = 8;
                              field_225 = 9;
                              this.field_134 = false;
                           } else {
                              this.field_226 = 3;
                           }
                           break label87;
                        }
                     }

                     var10000 = this;
                     var10001 = this.field_564;
                     var10002 = 1;
                  }

                  var10001 += var10002;
               }

               var10000.field_564 = var10001;
            }

            int var7 = -this.field_564;

            int var1;
            for (var1 = 0; var1 < field_570.length && var7 <= -340; var1++) {
               if (field_570[var1] == 10) {
                  var7 += 17;
               }
            }

            this.field_565 = var1;
            if (this.field_565 >= field_570.length) {
               this.field_565 = 0;
               this.field_564 = 0;
               return;
            }
            break;
         case 3:
            field_570 = null;
            System.gc();
            field_225 = 4;
            this.field_226 = 2;
            this.method_65(0);
            this.field_357.method_7(19);
      }
   }

   // $VF: renamed from: cI () void
   private void method_438() {
      if (this.field_226 == 2) {
         Graphics var1 = this.field_318;
         this.field_318.setColor(0, 0, 0);
         var1.fillRect(0, 0, 240, 320);
         int var2 = 0;
         byte var3 = -17;
         int var4 = this.field_565;
         int var5 = this.field_565;
         int var7 = 0;
         var7 = this.field_564 >= 340 ? -(this.field_564 % 17) : 340 - this.field_564 - 17;

         while (var4 < field_570.length && var3 < 340) {
            if (field_570[var4] == 10) {
               field_324[41].field_80 = 0;
               this.method_409(var1, field_570, field_324[41], var5, var4 - var5, var3 + var7, null, 0, 234);
               var3 += 17;
               var5 = var4 + 1;
            }

            var4++;
         }

         var2 = 0;

         for (int var8 = 6; var8 > 0; var8--) {
            var1.setColor(0);
            var1.fillRect(0, var2, 240, var8);
            var1.fillRect(0, 320 - var2 - var8, 240, var8);
            var2 += var8 + 1;
         }

         this.method_178();
      }
   }

   // $VF: renamed from: cJ () void
   private void method_439() {
      if (field_572 > 0) {
         field_572 = (int)(field_572 - (System.currentTimeMillis() - this.field_573));
         this.field_573 = System.currentTimeMillis();
         if (field_572 <= 0) {
            this.method_441(true);
         }
      }
   }

   // $VF: renamed from: a (java.lang.String, int, int, int, int, int) void
   private void method_440(String var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_573 = System.currentTimeMillis();
      field_572 = var4;
      this.field_575 = var2;
      this.field_576 = var3;
      this.field_574 = method_444(var1, 220);
      this.field_577 = var5;
      this.field_578 = var6;
   }

   // $VF: renamed from: c (boolean) void
   private void method_441(boolean var1) {
      field_572 = 0;
      if (var1) {
         this.field_562 = true;
      }
   }

   // $VF: renamed from: h () boolean
   private static boolean method_442() {
      return field_572 > 0;
   }

   // $VF: renamed from: cK () void
   private void method_443() {
      class_7 var1 = field_324[41];
      if (field_572 > 0) {
         int var2 = var1.field_89;
         var1.field_89 = 3;
         var1.method_57(this.field_574);
         int var3 = class_7.field_87;
         int var4 = class_7.field_86;
         if (this.field_575 == -1) {
            this.field_575 = 240 - var4 >> 1;
         }

         if (this.field_576 == -1) {
            this.field_576 = 320 - var3 >> 1;
         }

         this.field_318.setClip(this.field_575 - 6, this.field_576 - 3, var4 + 12, var3 + 6);
         method_432(this.field_318, this.field_575 - 6, this.field_576 - 3, var4 + 12, var3 + 6, this.field_577, this.field_578);
         var1.method_59(this.field_318, this.field_574, this.field_575, this.field_576, 0);
         var1.field_89 = var2;
      }
   }

   // $VF: renamed from: a (java.lang.String, int) java.lang.String
   public static String method_444(String var0, int var1) {
      class_7 var2 = field_324[41];
      int var4 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      StringBuffer var9 = new StringBuffer(var0);

      for (int var10 = 0; var10 <= var9.length(); var10++) {
         int var11 = 10;
         if (var10 < var9.length()) {
            var11 = var9.charAt(var10) & 255;
         }

         if (var4 > var1 && var6 != var8) {
            var4 = var7;
            var9.setCharAt(var6, '\n');
            var10 = var6 - 1;
            var8 = var6;
         } else {
            int var10000;
            if (var11 == 10) {
               var10000 = 0;
            } else {
               int var16;
               if (var11 > 32) {
                  if (var11 == 64) {
                     var4 += 14;
                     continue;
                  }

                  var11 = class_7.field_88[var11] & 255;
                  int var10002;
                  if (var11 >= var2.method_50(0)) {
                     int var12 = var11 - var2.method_50(0);
                     var10000 = var4;
                     var16 = var2.field_72[(var12 << 2) + 2] & 255;
                     var10002 = var2.field_72[var12 << 2] & 255;
                  } else {
                     int var14 = (var2.field_73[var11 << 2] & 255) << 1;
                     var10000 = var4;
                     var16 = var2.field_69[var14] & 255;
                     var10002 = var2.field_73[(var11 << 2) + 1];
                  }

                  var16 -= var10002;
               } else {
                  if (var11 != 32) {
                     continue;
                  }

                  var6 = var10;
                  var7 = var4;
                  var10000 = var4;
                  var16 = var2.field_69[0] & 255;
               }

               var10000 += var16 + var2.field_73[1];
            }

            var4 = var10000;
         }
      }

      return var9.toString();
   }

   // $VF: renamed from: cL () void
   private static void method_445() {
      if (field_324[41] != null) {
         field_324[41] = null;
         System.gc();
      }

      field_324[41] = new class_7();
      byte[] var0 = method_362("/ui.f", 1);
      field_324[41].method_45(var0, 0);
      field_324[41].method_46(0, 0, -1, -1);
      field_324[41].method_46(1, 0, -1, -1);
      field_324[41].method_46(2, 0, -1, -1);
      field_324[41].field_83 = null;
   }
}
