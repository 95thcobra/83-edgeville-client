import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;

public final class client extends Applet_Sub1 {
	/**
	 *
	 */
	private static final long serialVersionUID = -7605435364324929618L;
	static Class109_Sub21_Sub14_Sub4_Sub1 aClass109_Sub21_Sub14_Sub4_Sub1_2021;
	static Class109_Sub21_Sub14_Sub2[] aClass109_Sub21_Sub14_Sub2Array2098;
	static int anInt2013;
	static int anInt2012;
	static int anInt2014;
	static int anInt2019;
	static int anInt2018;
	static int anInt2153;
	static int anInt2238;
	static int anInt2161;
	static boolean aBool1974 = false;
	static int anInt1970 = 1;
	static int anInt1971 = 0;
	static boolean aBool2218;
	static int anInt2224;
	static int anInt2041;
	static int anInt2145;
	static int anInt2128;
	static int anInt2028;
	static int anInt2089;
	static int anInt2162;
	static Class116 aClass116_1999;
	static int anInt2087;
	static int anInt2061;
	static int anInt2103;
	static int anInt2165;
	static int anInt2133;
	static Class109_Sub20 aClass109_Sub20_2044;
	static boolean aBool2209;
	static int anInt2158 = 0;
	static int anInt1989 = 0;
	static int anInt2140 = 0;
	static int anInt2163;
	static int anInt1994 = 0;
	static int anInt1995 = 0;
	static int anInt2204;
	static int anInt2054 = 0;
	static int anInt2223 = 0;
	static int anInt2093 = 0;
	static int anInt2205;
	static Class86 aClass86_1997;
	static int anInt2192;
	static int anInt2008;
	static int anInt2189;
	static String aString2015;
	static String aString2198;
	static int anInt1987 = 0;
	static int anInt2206;
	static int anInt2212;
	static int anInt2051 = 0;
	static Class74 aClass74_1973;
	static int anInt1972 = 0;
	static client aclient1968;
	static boolean aBool1986 = false;
	static long aLong2228;
	static int anInt2024;
	static int anInt2026;
	static Class41 aClass41_2059;
	static int anInt2180 = 0;
	static int anInt1993;
	static int anInt2155;
	static int anInt2050;
	static boolean aBool2171;
	static int anInt1979 = 0;
	static int anInt2168;
	static int anInt2016;
	static boolean aBool2020;
	static int anInt2045;
	static long aLong1980 = -1L;
	static int anInt2056;
	static boolean aBool2057;
	static long aLong2011;
	static int anInt1982 = -1;
	static int anInt2003 = -1;
	static boolean aBool1985 = true;
	static int anInt1984 = -1;
	static int anInt2090;
	static int anInt2043;
	static int anInt2137;
	static int anInt2076;
	static int anInt2077;
	static Class109_Sub20 aClass109_Sub20_2108;
	static boolean aBool2149;
	static boolean aBool2048;
	static int anInt2193;
	static int anInt2131;
	static int anInt2084;
	static int anInt2073;
	static int anInt2074;
	static boolean aBool2083;
	static int anInt2119;
	static int anInt2075;
	static int anInt2037;
	static int anInt2032;
	static int anInt2033;
	static int anInt2035;
	static int anInt2034;
	static int anInt2036;
	static int anInt2042;
	static int anInt2038;
	static int anInt2039;
	static int anInt2040;
	static int anInt2072;
	static int anInt2009;
	static boolean aBool1969 = true;
	static boolean aBool2065 = false;
	static boolean aBool2029 = true;
	static DataBuffer aClass109_Sub14_2031 = new DataBuffer(new byte[5000]);
	static Class49 aClass49_2176;
	static int anInt1978;
	static int loginStage;
	static int anInt2177;
	static int anInt2004;
	static int anInt2005;
	static Class109_Sub21_Sub15_Sub3_Sub1[] aClass109_Sub21_Sub15_Sub3_Sub1Array2006;
	static int anInt2007;
	static int[] anIntArray2175;
	static Class109_Sub14_Sub1 secureBuffer;
	static Class109_Sub14_Sub1 loginBuffer;
	static Class109_Sub14_Sub1 aClass109_Sub14_Sub1_2211;
	static int anInt2022;
	static int anInt2023;
	static int anInt2025;
	static int anInt2027;
	static Class138[] aClass138Array2159;
	static boolean aBool2141;
	static int[][][] anIntArrayArrayArray1996;
	static int[] anIntArray2030;
	static int anInt1977;
	static int anInt2046;
	static int anInt2172;
	static int anInt2233;
	static boolean aBool2049;
	static int anInt2110;
	static int anInt1991;
	static int anInt2052;
	static int anInt2053;
	static int anInt2164;
	static int anInt2055;
	static int anInt2247;
	static int anInt2058;
	static int anInt2178;
	static int anInt2157;
	static int[] anIntArray2148;
	static int[] anIntArray2062;
	static int[] anIntArray2063;
	static int[] anIntArray2064;
	static int[] anIntArray2001;
	static int[] anIntArray2047;
	static int[] anIntArray2067;
	static String[] aStringArray2068;
	static int[][] anIntArrayArray2069;
	static int anInt2070;
	static int anInt2071;
	static int anInt1988;
	static int anInt2078;
	static int anInt2079;
	static int anInt2080;
	static int anInt2081;
	static int anInt2225;
	static int anInt2085;
	static Class109_Sub21_Sub15_Sub3_Sub2[] aClass109_Sub21_Sub15_Sub3_Sub2Array2086;
	static int[] anIntArray2134;
	static int[] anIntArray2186;
	static DataBuffer[] aClass109_Sub14Array2091;
	static int anInt2092;
	static int anInt2154;
	static int[] anIntArray2095;
	static int[] anIntArray2096;
	static String[] aStringArray2151;
	static boolean[] aBoolArray1990;
	static int[] anIntArray2099;
	static int anInt2100;
	static Class126[][][] aClass126ArrayArrayArray2121;
	static Class126 aClass126_2102;
	static Class126 aClass126_2197;
	static Class126 aClass126_2104;
	static int[] anIntArray2105;
	static int[] anIntArray2106;
	static int[] anIntArray2107;
	static int anInt2136;
	static boolean aBool2109;
	static int[] anIntArray2111;
	static int[] anIntArray2112;
	static int[] anIntArray2113;
	static int[] anIntArray2114;
	static String[] aStringArray1975;
	static String[] aStringArray2123;
	static int anInt2117;
	static int anInt2118;
	static int anInt2120;
	static int anInt2196;
	static String aString2122;
	static int anInt2124;
	static int anInt2125;
	static String aString2126;
	static String aString2127;
	static Class116 aClass116_2129;
	static int anInt2130;
	static int anInt1981;
	static int anInt2135;
	static int anInt2235;
	static boolean aBool1983;
	static boolean aBool2138;
	static boolean aBool2139;
	static Class109_Sub20 aClass109_Sub20_2150;
	static Class109_Sub20 aClass109_Sub20_2082;
	static Class109_Sub20 aClass109_Sub20_2142;
	static int anInt2143;
	static int anInt2144;
	static int anInt2219;
	static int anInt2167;
	static int anInt2115;
	static int anInt2017;
	static boolean aBool2152;
	static int[] anIntArray1992;
	static int[] anIntArray2156;
	static int[] anIntArray2146;
	static int anInt2160;
	static int[] anIntArray2166;
	static String[] aStringArray2060;
	static Class126 aClass126_2169;
	static Class126 aClass126_2170;
	static Class126 aClass126_2088;
	static int anInt2173;
	static int anInt2174;
	static boolean[] aBoolArray2116;
	static boolean[] aBoolArray2002;
	static boolean[] aBoolArray2220;
	static int[] anIntArray2241;
	static int[] anIntArray2179;
	static int[] anIntArray2222;
	static int[] anIntArray2181;
	static int anInt2182;
	static boolean aBool2184;
	static int anInt2185;
	static int anInt2231;
	static int[] anIntArray2187;
	static String aString2190;
	static long[] aLongArray2191;
	static int[] anIntArray2194;
	static int[] anIntArray2195;
	static int anInt2000;
	static int[] anIntArray2201;
	static int[] anIntArray2202;
	static Class109_Sub21_Sub14_Sub2[] aClass109_Sub21_Sub14_Sub2Array2203;
	static int anInt2207;
	static int anInt2208;
	static int anInt2210;
	static int anInt2199;
	static int[] anIntArray2213;
	static int[] anIntArray2214;
	static int[] anIntArray2248;
	static int[] anIntArray2216;
	static Class11[] aClass11Array2217;
	static boolean[] aBoolArray2200;
	static int[] anIntArray1976;
	static int[] anIntArray2221;
	static int[] anIntArray2183;
	static int[] anIntArray2188;
	static short aShort2147;
	static short aShort2066;
	static short aShort2226;
	static short aShort2227;
	static short aShort1998;
	static short aShort2229;
	static short aShort2230;
	static short aShort2094;
	static int anInt2232;
	static int anInt2097;
	static int anInt2234;
	static int anInt2101;
	static int anInt2236;
	static int anInt2237;
	static Class33[] aClass33Array2239;
	static Class119 aClass119_2240;
	static int anInt2132;
	static Class36[] aClass36Array2242;
	static Class96 aClass96_2243;
	static int anInt2244;
	static int anInt2245;
	static Class134[] aClass134Array2246;

	@Override
	protected final void method1055(final byte var1) {
	}

	static final boolean method1058() {
      if(null == Class48.aClass82_506)
		return false;
	else {
         int var2;
         String var13;
         try {
            int var0 = Class48.aClass82_506.method340();
            if(var0 == 0)
				return false;

            if(anInt2013 == -1) {
               Class48.aClass82_506.method341(aClass109_Sub14_Sub1_2211.data, 0, 1);
               aClass109_Sub14_Sub1_2211.position = 0;
               anInt2013 = aClass109_Sub14_Sub1_2211.method842();
               anInt2012 = Class107.anIntArray801[anInt2013];
               --var0;
            }

            if(anInt2012 == -1) {
               if(var0 <= 0)
				return false;

               Class48.aClass82_506.method341(aClass109_Sub14_Sub1_2211.data, 0, 1);
               anInt2012 = aClass109_Sub14_Sub1_2211.data[0] & 255;
               --var0;
            }

            if(anInt2012 == -2) {
               if(var0 <= 1)
				return false;

               Class48.aClass82_506.method341(aClass109_Sub14_Sub1_2211.data, 0, 2);
               aClass109_Sub14_Sub1_2211.position = 0;
               anInt2012 = aClass109_Sub14_Sub1_2211.method566();
               var0 -= 2;
            }

            if(var0 < anInt2012)
				return false;

            aClass109_Sub14_Sub1_2211.position = 0;
            Class48.aClass82_506.method341(aClass109_Sub14_Sub1_2211.data, 0, anInt2012);
            anInt2014 = 0;
            anInt2019 = anInt2018;
            anInt2018 = anInt2153 * -1;
            anInt2153 = anInt2013 * -1;
            if(anInt2013 == 244) {
               anInt2238 = 1;
               anInt2161 = anInt2131;
               anInt2013 = -1;
               return true;
            }

            int var1;
            int var3;
            Class109_Sub13 var46;
            if(anInt2013 == 66) {
               var1 = aClass109_Sub14_Sub1_2211.method566();
               var2 = aClass109_Sub14_Sub1_2211.method599();
               var3 = aClass109_Sub14_Sub1_2211.method585();
               var46 = (Class109_Sub13)aClass116_2129.method429(var2);
               if(var46 != null)
				method1064(var46, var1 != var46.anInt1050);

               Class25.method113(var2, var1, var3);
               anInt2013 = -1;
               return true;
            }

            int var5;
            int var6;
            long var7;
            if(anInt2013 == 196) {
               var1 = aClass109_Sub14_Sub1_2211.method592();
               if(var1 == '\uffff')
				var1 = -1;

               var2 = aClass109_Sub14_Sub1_2211.method566();
               if(var2 == '\uffff')
				var2 = -1;

               var3 = aClass109_Sub14_Sub1_2211.method611();
               var5 = aClass109_Sub14_Sub1_2211.method599();

               for(var6 = var1; var6 <= var2; ++var6) {
                  var7 = var6 + ((long)var5 << 32);
                  final Class109 var48 = aClass116_1999.method429(var7);
                  if(null != var48)
					var48.method413();

                  aClass116_1999.method430(new Class109_Sub24(var3), var7);
               }

               anInt2013 = -1;
               return true;
            }

            Class109_Sub20 var10;
            if(anInt2013 == 192) {
               var1 = aClass109_Sub14_Sub1_2211.method575();
               var2 = aClass109_Sub14_Sub1_2211.method568();
               var10 = Class83.method345(var2);
               if((var10.anInt1192 != var1) || (var1 == -1)) {
                  var10.anInt1192 = var1;
                  var10.anInt1267 = 0;
                  var10.anInt1268 = 0;
                  Class71.method315(var10);
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 179) {
               for(var1 = 0; var1 < aClass109_Sub21_Sub15_Sub3_Sub2Array2086.length; ++var1)
				if(null != aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var1])
					aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var1].anInt1683 = -1;

               for(var1 = 0; var1 < aClass109_Sub21_Sub15_Sub3_Sub1Array2006.length; ++var1)
				if(null != aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var1])
					aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var1].anInt1683 = -1;

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 134) {
               var1 = aClass109_Sub14_Sub1_2211.method592();
               var2 = aClass109_Sub14_Sub1_2211.method599();
               var10 = Class83.method345(var2);
               if((null != var10) && (var10.anInt1229 == 0)) {
                  if(var1 > (var10.anInt1171 - var10.anInt1163))
					var1 = var10.anInt1171 - var10.anInt1163;

                  if(var1 < 0)
					var1 = 0;

                  if(var1 != var10.anInt1169) {
                     var10.anInt1169 = var1;
                     Class71.method315(var10);
                  }
               }

               anInt2013 = -1;
               return true;
            }

            String var11;
            if(anInt2013 == 131) {
               var1 = aClass109_Sub14_Sub1_2211.method608();
               var11 = aClass109_Sub14_Sub1_2211.method602();
               var3 = aClass109_Sub14_Sub1_2211.method585();
               if((var3 >= 1) && (var3 <= 8)) {
                  if(var11.equalsIgnoreCase("null"))
					var11 = null;

                  aStringArray2151[var3 - 1] = var11;
                  aBoolArray1990[var3 - 1] = var1 == 0;
               }

               anInt2013 = -1;
               return true;
            }

            Class109_Sub20 var56;
            if(anInt2013 == 55) {
               var1 = aClass109_Sub14_Sub1_2211.method566();
               var2 = aClass109_Sub14_Sub1_2211.method568();
               var3 = aClass109_Sub14_Sub1_2211.method566();
               var5 = aClass109_Sub14_Sub1_2211.method559();
               var56 = Class83.method345(var2);
               if((var56.anInt1273 != var5) || (var1 != var56.anInt1193) || (var3 != var56.anInt1199)) {
                  var56.anInt1273 = var5;
                  var56.anInt1193 = var1;
                  var56.anInt1199 = var3;
                  Class71.method315(var56);
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 139) {
               final Class46 var67 = new Class46();
               var67.aString487 = aClass109_Sub14_Sub1_2211.method602();
               var67.anInt492 = aClass109_Sub14_Sub1_2211.method566();
               var2 = aClass109_Sub14_Sub1_2211.method568();
               var67.anInt480 = var2;
               Class82.method343(45);
               Class48.aClass82_506.method338();
               Class48.aClass82_506 = null;
               if(var67.method234() != aBool1974) {
                  aBool1974 = var67.method234();
                  Class50.method249(var67.method234());
               }

               Class109_Sub9.aString998 = var67.aString487;
               anInt1970 = var67.anInt492;
               anInt1971 = var67.anInt480;
               Class20.anInt188 = anInt1972 == 0?'\uaa4a':'\u9c40' + var67.anInt492;
               Class2.anInt18 = anInt1972 == 0?443:var67.anInt492 + '\uc350';
               Class33.anInt323 = Class20.anInt188;
               anInt2013 = -1;
               return false;
            }

            if(anInt2013 == 14) {
               Class44.method227();
               var1 = aClass109_Sub14_Sub1_2211.method564();
               var2 = aClass109_Sub14_Sub1_2211.method584();
               var3 = aClass109_Sub14_Sub1_2211.method614();
               anIntArray2107[var2] = var3;
               anIntArray2105[var2] = var1;
               anIntArray2106[var2] = 1;

               for(var5 = 0; var5 < 98; ++var5)
				if(var3 >= Class91.anIntArray689[var5])
					anIntArray2106[var2] = 2 + var5;

               anIntArray2146[(++anInt2224 - 1) & 31] = var2;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 147) {
               aBool2218 = false;

               for(var1 = 0; var1 < 5; ++var1)
				aBoolArray2200[var1] = false;

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 113) {
               aBool2218 = true;
               LoginEncoder.anInt525 = aClass109_Sub14_Sub1_2211.method564();
               Class75.anInt614 = aClass109_Sub14_Sub1_2211.method564();
               Canvas_Sub1.anInt1597 = aClass109_Sub14_Sub1_2211.method566();
               Class109_Sub21_Sub2.anInt1307 = aClass109_Sub14_Sub1_2211.method564();
               Class17.anInt154 = aClass109_Sub14_Sub1_2211.method564();
               if(Class17.anInt154 >= 100) {
                  Class109_Sub13.anInt1048 = (LoginEncoder.anInt525 * 128) + 64;
                  Class109_Sub21_Sub9.anInt1420 = 64 + (Class75.anInt614 * 128);
                  Class24.anInt222 = Class41.method174(Class109_Sub13.anInt1048, Class109_Sub21_Sub9.anInt1420, Class77.anInt616) - Canvas_Sub1.anInt1597;
               }

               anInt2013 = -1;
               return true;
            }

            int var14;
            if(anInt2013 == 194) {
               var1 = aClass109_Sub14_Sub1_2211.method568();
               var2 = aClass109_Sub14_Sub1_2211.method566();
               if(var1 < -70000)
				var2 += '\u8000';

               if(var1 >= 0)
				var10 = Class83.method345(var1);
			else
				var10 = null;

               for(; aClass109_Sub14_Sub1_2211.position < anInt2012; Class109_Sub10.method536(var2, var5, var6 - 1, var14)) {
                  var5 = aClass109_Sub14_Sub1_2211.method574();
                  var6 = aClass109_Sub14_Sub1_2211.method566();
                  var14 = 0;
                  if(var6 != 0) {
                     var14 = aClass109_Sub14_Sub1_2211.method564();
                     if(var14 == 255)
						var14 = aClass109_Sub14_Sub1_2211.method568();
                  }

                  if((var10 != null) && (var5 >= 0) && (var5 < var10.anIntArray1149.length)) {
                     var10.anIntArray1149[var5] = var6;
                     var10.anIntArray1264[var5] = var14;
                  }
               }

               if(var10 != null)
				Class71.method315(var10);

               Class44.method227();
               anIntArray2156[(++anInt2145 - 1) & 31] = var2 & 32767;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 20) {
               for(var1 = 0; var1 < Class122.anInt847; ++var1) {
                  final Class109_Sub21_Sub2 var64 = Class109_Sub21_Sub7.method711(var1);
                  if(null != var64) {
                     Class106.anIntArray797[var1] = 0;
                     Class106.anIntArray798[var1] = 0;
                  }
               }

               Class44.method227();
               anInt2041 += 32;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 10) {
               var1 = aClass109_Sub14_Sub1_2211.method592();
               var2 = aClass109_Sub14_Sub1_2211.method568();
               var10 = Class83.method345(var2);
               if((var10.anInt1188 != 2) || (var10.anInt1189 != var1)) {
                  var10.anInt1188 = 2;
                  var10.anInt1189 = var1;
                  Class71.method315(var10);
               }

               anInt2013 = -1;
               return true;
            }

            int var15;
            boolean var45;
            boolean var47;
            if(anInt2013 == 93) {
               var13 = aClass109_Sub14_Sub1_2211.method602();
               var2 = aClass109_Sub14_Sub1_2211.method566();
               final byte var49 = aClass109_Sub14_Sub1_2211.method612();
               var45 = false;
               if(var49 == -128)
				var45 = true;

               if(var45) {
                  if(Class109_Sub21_Sub17.anInt1589 == 0) {
                     anInt2013 = -1;
                     return true;
                  }

                  var47 = false;

                  for(var6 = 0; (var6 < Class109_Sub21_Sub17.anInt1589) && (!Class53.aClass109_Sub7Array532[var6].aString969.equals(var13) || (Class53.aClass109_Sub7Array532[var6].anInt967 != var2)); ++var6)
					;

                  if(var6 < Class109_Sub21_Sub17.anInt1589) {
                     while(var6 < (Class109_Sub21_Sub17.anInt1589 - 1)) {
                        Class53.aClass109_Sub7Array532[var6] = Class53.aClass109_Sub7Array532[var6 + 1];
                        ++var6;
                     }

                     --Class109_Sub21_Sub17.anInt1589;
                     Class53.aClass109_Sub7Array532[Class109_Sub21_Sub17.anInt1589] = null;
                  }
               } else {
                  aClass109_Sub14_Sub1_2211.method602();
                  final Class109_Sub7 var62 = new Class109_Sub7();
                  var62.aString969 = var13;
                  var62.aString968 = Class6.method39(var62.aString969, Class95.aClass113_708);
                  var62.anInt967 = var2;
                  var62.aByte971 = var49;

                  for(var14 = Class109_Sub21_Sub17.anInt1589 - 1; var14 >= 0; --var14) {
                     var15 = Class53.aClass109_Sub7Array532[var14].aString968.compareTo(var62.aString968);
                     if(var15 == 0) {
                        Class53.aClass109_Sub7Array532[var14].anInt967 = var2;
                        Class53.aClass109_Sub7Array532[var14].aByte971 = var49;
                        if(var13.equals(Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aString1931))
							Class109_Sub21_Sub11.aByte1494 = var49;

                        anInt2162 = anInt2131;
                        anInt2013 = -1;
                        return true;
                     }

                     if(var15 < 0)
						break;
                  }

                  if(Class109_Sub21_Sub17.anInt1589 >= Class53.aClass109_Sub7Array532.length) {
                     anInt2013 = -1;
                     return true;
                  }

                  for(var15 = Class109_Sub21_Sub17.anInt1589 - 1; var15 > var14; --var15)
					Class53.aClass109_Sub7Array532[var15 + 1] = Class53.aClass109_Sub7Array532[var15];

                  if(Class109_Sub21_Sub17.anInt1589 == 0)
					Class53.aClass109_Sub7Array532 = new Class109_Sub7[100];

                  Class53.aClass109_Sub7Array532[var14 + 1] = var62;
                  ++Class109_Sub21_Sub17.anInt1589;
                  if(var13.equals(Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aString1931))
					Class109_Sub21_Sub11.aByte1494 = var49;
               }

               anInt2162 = anInt2131;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 168) {
               Class59.method275();
               anInt2013 = -1;
               return false;
            }

            if(anInt2013 == 154) {
               Class8.anInt89 = aClass109_Sub14_Sub1_2211.method585();
               Class109_Sub21_Sub13.anInt1544 = aClass109_Sub14_Sub1_2211.method584();
               anInt2013 = -1;
               return true;
            }

            long var18;
            Class109_Sub20 var68;
            int var71;
            if(anInt2013 == 250) {
               var1 = anInt2012 + aClass109_Sub14_Sub1_2211.position;
               var2 = aClass109_Sub14_Sub1_2211.method566();
               var3 = aClass109_Sub14_Sub1_2211.method566();
               if(var2 != anInt2128) {
                  anInt2128 = var2;
                  Class109_Sub21_Sub13.method766(false);
                  var5 = anInt2128;
                  if(Class108.method412(var5)) {
                     final Class109_Sub20[] var60 = Class109_Sub20.aClass109_Sub20ArrayArray1150[var5];

                     for(var14 = 0; var14 < var60.length; ++var14) {
                        var68 = var60[var14];
                        if(var68 != null) {
                           var68.anInt1267 = 0;
                           var68.anInt1268 = 0;
                        }
                     }
                  }

                  Class87.method351(anInt2128);

                  for(var6 = 0; var6 < 100; ++var6)
					aBoolArray2116[var6] = true;
               }

               Class109_Sub13 var70;
               for(; var3-- > 0; var70.aBool1046 = true) {
                  var5 = aClass109_Sub14_Sub1_2211.method568();
                  var6 = aClass109_Sub14_Sub1_2211.method566();
                  var14 = aClass109_Sub14_Sub1_2211.method564();
                  var70 = (Class109_Sub13)aClass116_2129.method429(var5);
                  if((var70 != null) && (var6 != var70.anInt1050)) {
                     method1064(var70, true);
                     var70 = null;
                  }

                  if(null == var70)
					var70 = Class25.method113(var5, var6, var14);
               }

               for(var46 = (Class109_Sub13)aClass116_2129.method432(); var46 != null; var46 = (Class109_Sub13)aClass116_2129.method433())
				if(var46.aBool1046)
					var46.aBool1046 = false;
				else
					method1064(var46, true);

               aClass116_1999 = new Class116(512);

               while(aClass109_Sub14_Sub1_2211.position < var1) {
                  var5 = aClass109_Sub14_Sub1_2211.method568();
                  var6 = aClass109_Sub14_Sub1_2211.method566();
                  var14 = aClass109_Sub14_Sub1_2211.method566();
                  var15 = aClass109_Sub14_Sub1_2211.method568();

                  for(var71 = var6; var71 <= var14; ++var71) {
                     var18 = var71 + ((long)var5 << 32);
                     aClass116_1999.method430(new Class109_Sub24(var15), var18);
                  }
               }

               anInt2013 = -1;
               return true;
            }

            boolean var42;
            if(anInt2013 == 129) {
               anInt2028 = 0;
               anInt2089 = 0;
               aClass109_Sub14_Sub1_2211.method843();
               var1 = aClass109_Sub14_Sub1_2211.method844(1);
               if(var1 != 0) {
                  var2 = aClass109_Sub14_Sub1_2211.method844(2);
                  if(var2 == 0)
					anIntArray2186[++anInt2089 - 1] = 2047;
				else if(var2 == 1) {
                     var3 = aClass109_Sub14_Sub1_2211.method844(3);
                     Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.method896(var3, false);
                     var5 = aClass109_Sub14_Sub1_2211.method844(1);
                     if(var5 == 1)
						anIntArray2186[++anInt2089 - 1] = 2047;
                  } else if(var2 == 2) {
                     var3 = aClass109_Sub14_Sub1_2211.method844(3);
                     Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.method896(var3, true);
                     var5 = aClass109_Sub14_Sub1_2211.method844(3);
                     Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.method896(var5, true);
                     var6 = aClass109_Sub14_Sub1_2211.method844(1);
                     if(var6 == 1)
						anIntArray2186[++anInt2089 - 1] = 2047;
                  } else if(var2 == 3) {
                     var3 = aClass109_Sub14_Sub1_2211.method844(1);
                     var5 = aClass109_Sub14_Sub1_2211.method844(7);
                     Class77.anInt616 = aClass109_Sub14_Sub1_2211.method844(2);
                     var6 = aClass109_Sub14_Sub1_2211.method844(1);
                     if(var6 == 1)
						anIntArray2186[++anInt2089 - 1] = 2047;

                     var14 = aClass109_Sub14_Sub1_2211.method844(7);
                     Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.method895(var5, var14, var3 == 1);
                  }
               }

               Class109_Sub21_Sub13.method767();

               Class109_Sub21_Sub15_Sub3_Sub2 var65;
               for(; aClass109_Sub14_Sub1_2211.method846(anInt2012) >= 11; var65.method895(Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1655[0] + var6, var71 + Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1706[0], var15 == 1)) {
                  var1 = aClass109_Sub14_Sub1_2211.method844(11);
                  if(var1 == 2047)
					break;

                  var42 = false;
                  if(aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var1] == null) {
                     aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var1] = new Class109_Sub21_Sub15_Sub3_Sub2();
                     if(null != aClass109_Sub14Array2091[var1])
						aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var1].method1037(aClass109_Sub14Array2091[var1]);

                     var42 = true;
                  }

                  anIntArray2134[++anInt2087 - 1] = var1;
                  var65 = aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var1];
                  var65.anInt1700 = anInt1979;
                  var5 = aClass109_Sub14_Sub1_2211.method844(1);
                  if(var5 == 1)
					anIntArray2186[++anInt2089 - 1] = var1;

                  var6 = aClass109_Sub14_Sub1_2211.method844(5);
                  if(var6 > 15)
					var6 -= 32;

                  var14 = anIntArray2099[aClass109_Sub14_Sub1_2211.method844(3)];
                  if(var42)
					var65.anInt1680 = var65.anInt1654 = var14;

                  var15 = aClass109_Sub14_Sub1_2211.method844(1);
                  var71 = aClass109_Sub14_Sub1_2211.method844(5);
                  if(var71 > 15)
					var71 -= 32;
               }

               aClass109_Sub14_Sub1_2211.method845();
               Class23.method103();

               for(var1 = 0; var1 < anInt2028; ++var1) {
                  var2 = anIntArray2095[var1];
                  if(anInt1979 != aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var2].anInt1700)
					aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var2] = null;
               }

               if(aClass109_Sub14_Sub1_2211.position != anInt2012)
				throw new RuntimeException(aClass109_Sub14_Sub1_2211.position + "," + anInt2012);

               for(var1 = 0; var1 < anInt2087; ++var1)
				if(aClass109_Sub21_Sub15_Sub3_Sub2Array2086[anIntArray2134[var1]] == null)
					throw new RuntimeException(var1 + "," + anInt2087);

               anInt2013 = -1;
               return true;
            }

            String var43;
            String var50;
            if(anInt2013 == 206) {
               for(; aClass109_Sub14_Sub1_2211.position < anInt2012;) {
                  var1 = aClass109_Sub14_Sub1_2211.method564();
                  var42 = (var1 & 1) == 1;
                  var50 = aClass109_Sub14_Sub1_2211.method602();
                  var43 = aClass109_Sub14_Sub1_2211.method602();
                  aClass109_Sub14_Sub1_2211.method602();

                  for(var6 = 0; var6 < anInt2132; ++var6) {
                     final Class36 var74 = aClass36Array2242[var6];
                     if(var42) {
                        if(var43.equals(var74.aString338)) {
                           var74.aString338 = var50;
                           var74.aString337 = var43;
                           var10 = null;
                           break;
                        }
                     } else if(var50.equals(var74.aString338)) {
                        var74.aString338 = var50;
                        var74.aString337 = var43;
                        var10 = null;
                        break;
                     }
                  }
               }

               anInt2161 = anInt2131;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 30) {
               var1 = aClass109_Sub14_Sub1_2211.method568();
               var2 = aClass109_Sub14_Sub1_2211.method566();
               var10 = Class83.method345(var1);
               if((var10.anInt1188 != 1) || (var10.anInt1189 != var2)) {
                  var10.anInt1188 = 1;
                  var10.anInt1189 = var2;
                  Class71.method315(var10);
               }

               anInt2013 = -1;
               return true;
            }

            boolean var41;
            if(anInt2013 == 43) {
               var41 = aClass109_Sub14_Sub1_2211.method564() == 1;
               if(var41) {
                  Class104.aLong790 = Class109_Sub21_Sub15.method829(856674336) - aClass109_Sub14_Sub1_2211.method613();
                  Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924 = new Class136(aClass109_Sub14_Sub1_2211, true);
               } else
				Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924 = null;

               anInt2061 = anInt2131;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 56) {
               var1 = aClass109_Sub14_Sub1_2211.method591();
               final byte var51 = aClass109_Sub14_Sub1_2211.method612();
               Class106.anIntArray797[var1] = var51;
               if(var51 != Class106.anIntArray798[var1]) {
                  Class106.anIntArray798[var1] = var51;
                  Class47.method244(var1);
               }

               anIntArray1992[(++anInt2041 - 1) & 31] = var1;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 29) {
               for(var1 = 0; var1 < Class106.anIntArray798.length; ++var1)
				if(Class106.anIntArray797[var1] != Class106.anIntArray798[var1]) {
                     Class106.anIntArray798[var1] = Class106.anIntArray797[var1];
                     Class47.method244(var1);
                     anIntArray1992[(++anInt2041 - 1) & 31] = var1;
                  }

               anInt2013 = -1;
               return true;
            }

            if((anInt2013 == 116) || (anInt2013 == 127) || (anInt2013 == 95) || (anInt2013 == 239) || (anInt2013 == 49) || (anInt2013 == 83) || (anInt2013 == 205) || (anInt2013 == 25) || (anInt2013 == 241) || (anInt2013 == 215)) {
               Class109_Sub21_Sub11.method749();
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 117) {
               Class109_Sub7.method524(true);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 136) {
               var1 = aClass109_Sub14_Sub1_2211.method611();
               var2 = aClass109_Sub14_Sub1_2211.method614();
               final Class109_Sub13 var58 = (Class109_Sub13)aClass116_2129.method429(var1);
               var46 = (Class109_Sub13)aClass116_2129.method429(var2);
               if(var46 != null)
				method1064(var46, (var58 == null) || (var58.anInt1050 != var46.anInt1050));

               if(null != var58) {
                  var58.method413();
                  aClass116_2129.method430(var58, var2);
               }

               var56 = Class83.method345(var1);
               if(null != var56)
				Class71.method315(var56);

               var56 = Class83.method345(var2);
               if(var56 != null) {
                  Class71.method315(var56);
                  Class9.method53(Class109_Sub20.aClass109_Sub20ArrayArray1150[var56.anInt1148 >>> 16], var56, true);
               }

               if(anInt2128 != -1) {
                  var14 = anInt2128;
                  if(Class108.method412(var14))
					Class56.method268(Class109_Sub20.aClass109_Sub20ArrayArray1150[var14], 1);
               }

               anInt2013 = -1;
               return true;
            }

            Class109_Sub20 var44;
            if(anInt2013 == 224) {
               var1 = aClass109_Sub14_Sub1_2211.method568();
               var2 = aClass109_Sub14_Sub1_2211.method592();
               if(var2 == '\uffff')
				var2 = -1;

               var3 = aClass109_Sub14_Sub1_2211.method614();
               var44 = Class83.method345(var1);
               Class109_Sub21_Sub5 var53;
               if(!var44.aBool1146) {
                  if(var2 == -1) {
                     var44.anInt1188 = 0;
                     anInt2013 = -1;
                     return true;
                  }

                  var53 = Class109_Sub23.method660(var2);
                  var44.anInt1188 = 4;
                  var44.anInt1189 = var2;
                  var44.anInt1273 = var53.anInt1352;
                  var44.anInt1193 = var53.anInt1353;
                  var44.anInt1199 = (var53.anInt1351 * 100) / var3;
                  Class71.method315(var44);
               } else {
                  var44.anInt1265 = var2;
                  var44.anInt1266 = var3;
                  var53 = Class109_Sub23.method660(var2);
                  var44.anInt1273 = var53.anInt1352;
                  var44.anInt1193 = var53.anInt1353;
                  var44.anInt1198 = var53.anInt1354;
                  var44.anInt1194 = var53.anInt1355;
                  var44.anInt1244 = var53.anInt1346;
                  var44.anInt1199 = var53.anInt1351;
                  if(var53.anInt1378 == 1)
					var44.anInt1203 = 1;
				else
					var44.anInt1203 = 2;

                  if(var44.anInt1240 > 0)
					var44.anInt1199 = (var44.anInt1199 * 32) / var44.anInt1240;
				else if(var44.anInt1274 > 0)
					var44.anInt1199 = (var44.anInt1199 * 32) / var44.anInt1274;

                  Class71.method315(var44);
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 178) {
               Class137.method483(false);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 16) {
               var1 = aClass109_Sub14_Sub1_2211.method566();
               var2 = aClass109_Sub14_Sub1_2211.method568();
               var3 = (var1 >> 10) & 31;
               var5 = (var1 >> 5) & 31;
               var6 = var1 & 31;
               var14 = (var5 << 11) + (var3 << 19) + (var6 << 3);
               var68 = Class83.method345(var2);
               if(var68.anInt1220 != var14) {
                  var68.anInt1220 = var14;
                  Class71.method315(var68);
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 200) {
               Class8.anInt89 = aClass109_Sub14_Sub1_2211.method564();
               Class109_Sub21_Sub13.anInt1544 = aClass109_Sub14_Sub1_2211.method564();

               for(var1 = Class8.anInt89; var1 < (Class8.anInt89 + 8); ++var1)
				for(var2 = Class109_Sub21_Sub13.anInt1544; var2 < (8 + Class109_Sub21_Sub13.anInt1544); ++var2)
					if(aClass126ArrayArrayArray2121[Class77.anInt616][var1][var2] != null) {
                        aClass126ArrayArrayArray2121[Class77.anInt616][var1][var2] = null;
                        Class109_Sub21_Sub15_Sub3_Sub1.method1035(var1, var2);
                     }

               for(Class109_Sub11 var66 = (Class109_Sub11)aClass126_2102.method458(); null != var66; var66 = (Class109_Sub11)aClass126_2102.method449())
				if((var66.anInt1028 >= Class8.anInt89) && (var66.anInt1028 < (Class8.anInt89 + 8)) && (var66.anInt1029 >= Class109_Sub21_Sub13.anInt1544) && (var66.anInt1029 < (8 + Class109_Sub21_Sub13.anInt1544)) && (Class77.anInt616 == var66.anInt1038))
					var66.anInt1035 = 0;

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 153) {
               Class44.method227();
               anInt2103 = aClass109_Sub14_Sub1_2211.method575();
               anInt2165 = anInt2131;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 246) {
               var41 = aClass109_Sub14_Sub1_2211.method584() == 1;
               var2 = aClass109_Sub14_Sub1_2211.method611();
               var10 = Class83.method345(var2);
               if(var10.aBool1167 != var41) {
                  var10.aBool1167 = var41;
                  Class71.method315(var10);
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 140) {
               Class44.method227();
               anInt2133 = aClass109_Sub14_Sub1_2211.method564();
               anInt2165 = anInt2131;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 202) {
               var1 = aClass109_Sub14_Sub1_2211.method568();
               var2 = aClass109_Sub14_Sub1_2211.method594();
               var3 = aClass109_Sub14_Sub1_2211.method593();
               var44 = Class83.method345(var1);
               if((var44.anInt1210 != var2) || (var3 != var44.anInt1157) || (var44.anInt1152 != 0) || (var44.anInt1153 != 0)) {
                  var44.anInt1210 = var2;
                  var44.anInt1157 = var3;
                  var44.anInt1152 = 0;
                  var44.anInt1153 = 0;
                  Class71.method315(var44);
                  Class53.method257(var44);
                  if(var44.anInt1229 == 0)
					Class9.method53(Class109_Sub20.aClass109_Sub20ArrayArray1150[var1 >> 16], var44, false);
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 184) {
               var1 = aClass109_Sub14_Sub1_2211.method566();
               final Class109_Sub12 var63 = (Class109_Sub12)Class109_Sub12.aClass116_1043.method429(var1);
               if(var63 != null)
				var63.method413();

               anIntArray2156[(++anInt2145 - 1) & 31] = var1 & 32767;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 230) {
               var1 = aClass109_Sub14_Sub1_2211.method564();
               var2 = aClass109_Sub14_Sub1_2211.method564();
               var3 = aClass109_Sub14_Sub1_2211.method585();
               Class77.anInt616 = var2 >> 1;
               Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.method895(var3, var1, (var2 & 1) == 1);
               anInt2013 = -1;
               return true;
            }

            Class109_Sub20 var59;
            if(anInt2013 == 7) {
               var1 = aClass109_Sub14_Sub1_2211.method568();
               var59 = Class83.method345(var1);

               for(var3 = 0; var3 < var59.anIntArray1149.length; ++var3) {
                  var59.anIntArray1149[var3] = -1;
                  var59.anIntArray1149[var3] = 0;
               }

               Class71.method315(var59);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 65) {
               var1 = aClass109_Sub14_Sub1_2211.method568();
               final Class109_Sub13 var61 = (Class109_Sub13)aClass116_2129.method429(var1);
               if(null != var61)
				method1064(var61, true);

               if(aClass109_Sub20_2044 != null) {
                  Class71.method315(aClass109_Sub20_2044);
                  aClass109_Sub20_2044 = null;
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 160) {
               var1 = aClass109_Sub14_Sub1_2211.method592();
               if(var1 == '\uffff')
				var1 = -1;

               Class82.method344(var1);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 88) {
               var1 = aClass109_Sub14_Sub1_2211.method567();
               var2 = aClass109_Sub14_Sub1_2211.method591();
               if(var2 == '\uffff')
				var2 = -1;

               if((anInt2207 != 0) && (var2 != -1)) {
                  Class104_Sub1.method644(Class123.aClass104_Sub1_850, var2, 0, anInt2207, false);
                  aBool2209 = true;
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 31) {
               var1 = aClass109_Sub14_Sub1_2211.method599();
               var59 = Class83.method345(var1);
               var59.anInt1188 = 3;
               var59.anInt1189 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aClass96_1929.method364();
               Class71.method315(var59);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 175) {
               var1 = aClass109_Sub14_Sub1_2211.method592();
               var2 = aClass109_Sub14_Sub1_2211.method566();
               var3 = aClass109_Sub14_Sub1_2211.method614();
               var44 = Class83.method345(var3);
               var44.anInt1201 = var2 + (var1 << 16);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 137) {
               anInt2158 = aClass109_Sub14_Sub1_2211.method564();
               if(anInt2158 == 1)
				anInt1989 = aClass109_Sub14_Sub1_2211.method566();

               if((anInt2158 >= 2) && (anInt2158 <= 6)) {
                  if(anInt2158 == 2) {
                     anInt1994 = 64;
                     anInt1995 = 64;
                  }

                  if(anInt2158 == 3) {
                     anInt1994 = 0;
                     anInt1995 = 64;
                  }

                  if(anInt2158 == 4) {
                     anInt1994 = 128;
                     anInt1995 = 64;
                  }

                  if(anInt2158 == 5) {
                     anInt1994 = 64;
                     anInt1995 = 0;
                  }

                  if(anInt2158 == 6) {
                     anInt1994 = 64;
                     anInt1995 = 128;
                  }

                  anInt2158 = 2;
                  anInt2054 = aClass109_Sub14_Sub1_2211.method566();
                  anInt2223 = aClass109_Sub14_Sub1_2211.method566();
                  anInt2093 = aClass109_Sub14_Sub1_2211.method564();
               }

               if(anInt2158 == 10)
				anInt2140 = aClass109_Sub14_Sub1_2211.method566();

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 162) {
               var1 = aClass109_Sub14_Sub1_2211.method564();
               if(aClass109_Sub14_Sub1_2211.method564() == 0) {
                  aClass134Array2246[var1] = new Class134();
                  aClass109_Sub14_Sub1_2211.position += 18;
               } else {
                  --aClass109_Sub14_Sub1_2211.position;
                  aClass134Array2246[var1] = new Class134(aClass109_Sub14_Sub1_2211, false);
               }

               anInt2163 = anInt2131;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 138) {
               if(anInt2128 != -1) {
                  var1 = anInt2128;
                  if(Class108.method412(var1))
					Class56.method268(Class109_Sub20.aClass109_Sub20ArrayArray1150[var1], 0);
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 167) {
               var13 = aClass109_Sub14_Sub1_2211.method602();
               final Object[] var57 = new Object[var13.length() + 1];

               for(var3 = var13.length() - 1; var3 >= 0; --var3)
				if(var13.charAt(var3) == 115)
					var57[1 + var3] = aClass109_Sub14_Sub1_2211.method602();
				else
					var57[var3 + 1] = new Integer(aClass109_Sub14_Sub1_2211.method568());

               var57[0] = new Integer(aClass109_Sub14_Sub1_2211.method568());
               final Class109_Sub9 var54 = new Class109_Sub9();
               var54.anObjectArray997 = var57;
               Class109_Sub13.method551(var54, 200000);
               anInt2013 = -1;
               return true;
            }

            long var21;
            long var23;
            boolean var25;
            int var28;
            String var29;
            if(anInt2013 == 204) {
               var13 = aClass109_Sub14_Sub1_2211.method602();
               var21 = aClass109_Sub14_Sub1_2211.method613();
               var23 = aClass109_Sub14_Sub1_2211.method566();
               var7 = aClass109_Sub14_Sub1_2211.method567();
               final Class89 var9 = (Class89)Class33.method151(Class109_Sub21_Sub15_Sub6.method980(), aClass109_Sub14_Sub1_2211.method564());
               var18 = var7 + (var23 << 32);
               var25 = false;

               for(int var26 = 0; var26 < 100; ++var26)
				if(var18 == aLongArray2191[var26]) {
                     var25 = true;
                     break;
                  }

               if(var9.aBool674 && Class109_Sub11.method541(var13))
				var25 = true;

               if(!var25 && (anInt2085 == 0)) {
                  aLongArray2191[anInt2192] = var18;
                  anInt2192 = (1 + anInt2192) % 100;
                  final String var76 = Class109_Sub21_Sub14_Sub4.method1013(Class35.method158(Class48.method245(aClass109_Sub14_Sub1_2211)));
                  if(var9.anInt678 != -1) {
                     var28 = var9.anInt678;
                     var29 = "<img=" + var28 + ">";
                     Class109_Sub21_Sub4.method683(9, var29 + var13, var76, Class67.method302(var21));
                  } else
					Class109_Sub21_Sub4.method683(9, var13, var76, Class67.method302(var21));
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 9) {
               var1 = aClass109_Sub14_Sub1_2211.method564();
               var2 = aClass109_Sub14_Sub1_2211.method564();
               var3 = aClass109_Sub14_Sub1_2211.method564();
               var5 = aClass109_Sub14_Sub1_2211.method564();
               aBoolArray2200[var1] = true;
               anIntArray1976[var1] = var2;
               anIntArray2221[var1] = var3;
               anIntArray2183[var1] = var5;
               anIntArray2188[var1] = 0;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 5) {
               aClass109_Sub14_Sub1_2211.position += 28;
               if(aClass109_Sub14_Sub1_2211.method581())
				Class109_Sub21_Sub16.method835(aClass109_Sub14_Sub1_2211, aClass109_Sub14_Sub1_2211.position - 28);

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 53) {
               anInt2204 = aClass109_Sub14_Sub1_2211.method564();
               if(anInt2204 == 255)
				anInt2204 = 0;

               anInt2205 = aClass109_Sub14_Sub1_2211.method564();
               if(anInt2205 == 255)
				anInt2205 = 0;

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 216) {
               var1 = aClass109_Sub14_Sub1_2211.method568();
               aClass86_1997 = Class109_Sub21_Sub11.aClass71_1495.method312(var1);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 59) {
               var13 = aClass109_Sub14_Sub1_2211.method602();
               var21 = aClass109_Sub14_Sub1_2211.method566();
               var23 = aClass109_Sub14_Sub1_2211.method567();
               final Class89 var73 = (Class89)Class33.method151(Class109_Sub21_Sub15_Sub6.method980(), aClass109_Sub14_Sub1_2211.method564());
               final long var30 = var23 + (var21 << 32);
               boolean var77 = false;

               for(int var33 = 0; var33 < 100; ++var33)
				if(aLongArray2191[var33] == var30) {
                     var77 = true;
                     break;
                  }

               if(Class109_Sub11.method541(var13))
				var77 = true;

               if(!var77 && (anInt2085 == 0)) {
                  aLongArray2191[anInt2192] = var30;
                  anInt2192 = (anInt2192 + 1) % 100;
                  final String var78 = Class109_Sub21_Sub14_Sub4.method1013(Class35.method158(Class48.method245(aClass109_Sub14_Sub1_2211)));
                  byte var75;
                  if(var73.aBool680)
					var75 = 7;
				else
					var75 = 3;

                  if(var73.anInt678 != -1) {
                     var28 = var73.anInt678;
                     var29 = "<img=" + var28 + ">";
                     Applet_Sub1.method1053(var75, var29 + var13, var78);
                  } else
					Applet_Sub1.method1053(var75, var13, var78);
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 186) {
               aBool2218 = true;
               Class3.anInt28 = aClass109_Sub14_Sub1_2211.method564();
               Class21.anInt196 = aClass109_Sub14_Sub1_2211.method564();
               Class52.anInt531 = aClass109_Sub14_Sub1_2211.method566();
               Class109_Sub11.anInt1036 = aClass109_Sub14_Sub1_2211.method564();
               Class109_Sub21_Sub4.anInt1333 = aClass109_Sub14_Sub1_2211.method564();
               if(Class109_Sub21_Sub4.anInt1333 >= 100) {
                  var1 = 64 + (Class3.anInt28 * 128);
                  var2 = (Class21.anInt196 * 128) + 64;
                  var3 = Class41.method174(var1, var2, Class77.anInt616) - Class52.anInt531;
                  var5 = var1 - Class109_Sub13.anInt1048;
                  var6 = var3 - Class24.anInt222;
                  var14 = var2 - Class109_Sub21_Sub9.anInt1420;
                  var15 = (int)Math.sqrt((var5 * var5) + (var14 * var14));
                  Class46.anInt490 = (int)(Math.atan2(var6, var15) * 325.949D) & 2047;
                  Class109_Sub21_Sub1.anInt1298 = (int)(Math.atan2(var5, var14) * -325.949D) & 2047;
                  if(Class46.anInt490 < 128)
					Class46.anInt490 = 128;

                  if(Class46.anInt490 > 383)
					Class46.anInt490 = 383;
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 249) {
               var1 = aClass109_Sub14_Sub1_2211.method599();
               var2 = aClass109_Sub14_Sub1_2211.method559();
               Class106.anIntArray797[var2] = var1;
               if(Class106.anIntArray798[var2] != var1) {
                  Class106.anIntArray798[var2] = var1;
                  Class47.method244(var2);
               }

               anIntArray1992[(++anInt2041 - 1) & 31] = var2;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 108) {
               var1 = aClass109_Sub14_Sub1_2211.method592();
               anInt2128 = var1;
               Class109_Sub21_Sub13.method766(false);
               if(Class108.method412(var1)) {
                  final Class109_Sub20[] var55 = Class109_Sub20.aClass109_Sub20ArrayArray1150[var1];

                  for(var3 = 0; var3 < var55.length; ++var3) {
                     var44 = var55[var3];
                     if(null != var44) {
                        var44.anInt1267 = 0;
                        var44.anInt1268 = 0;
                     }
                  }
               }

               Class87.method351(anInt2128);

               for(var2 = 0; var2 < 100; ++var2)
				aBoolArray2116[var2] = true;

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 39) {
               var13 = aClass109_Sub14_Sub1_2211.method602();
               Class41.aString371 = var13;

               try {
                  var11 = aclient1968.getParameter(Class98.aClass98_723.aString733);
                  var50 = aclient1968.getParameter(Class98.aClass98_730.aString733);
                  var43 = var11 + "settings=" + var13 + "; version=1; path=/; domain=" + var50;
                  if(var13.length() == 0)
					var43 = var43 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
				else
					var43 = var43 + "; Expires=" + Class33.method147(Class109_Sub21_Sub15.method829(1025884574) + 94608000000L) + "; Max-Age=" + 94608000L;

                  Class73.method327(aclient1968, "document.cookie=\"" + var43 + "\"");
               } catch (final Throwable var38) {
                  ;
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 64) {
               Class105.method411(aClass109_Sub14_Sub1_2211);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 114) {
               anInt2008 = aClass109_Sub14_Sub1_2211.method564();
               anInt2189 = aClass109_Sub14_Sub1_2211.method564();
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 208) {
               anInt2162 = anInt2131;
               if(anInt2012 == 0) {
                  aString2015 = null;
                  aString2198 = null;
                  Class109_Sub21_Sub17.anInt1589 = 0;
                  Class53.aClass109_Sub7Array532 = null;
                  anInt2013 = -1;
                  return true;
               }

               aString2198 = aClass109_Sub14_Sub1_2211.method602();
               final long var35 = aClass109_Sub14_Sub1_2211.method613();
               aString2015 = Class32.method141(var35);
               Class109_Sub12.aByte1044 = aClass109_Sub14_Sub1_2211.method612();
               var3 = aClass109_Sub14_Sub1_2211.method564();
               if(var3 == 255) {
                  anInt2013 = -1;
                  return true;
               }

               Class109_Sub21_Sub17.anInt1589 = var3;
               final Class109_Sub7[] var4 = new Class109_Sub7[100];

               for(var6 = 0; var6 < Class109_Sub21_Sub17.anInt1589; ++var6) {
                  var4[var6] = new Class109_Sub7();
                  var4[var6].aString969 = aClass109_Sub14_Sub1_2211.method602();
                  var4[var6].aString968 = Class6.method39(var4[var6].aString969, Class95.aClass113_708);
                  var4[var6].anInt967 = aClass109_Sub14_Sub1_2211.method566();
                  var4[var6].aByte971 = aClass109_Sub14_Sub1_2211.method612();
                  aClass109_Sub14_Sub1_2211.method602();
                  if(var4[var6].aString969.equals(Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aString1931))
					Class109_Sub21_Sub11.aByte1494 = var4[var6].aByte971;
               }

               var47 = false;
               var15 = Class109_Sub21_Sub17.anInt1589;

               while(var15 > 0) {
                  var47 = true;
                  --var15;

                  for(var71 = 0; var71 < var15; ++var71)
					if(var4[var71].aString968.compareTo(var4[var71 + 1].aString968) > 0) {
                        final Class109_Sub7 var72 = var4[var71];
                        var4[var71] = var4[1 + var71];
                        var4[var71 + 1] = var72;
                        var47 = false;
                     }

                  if(var47)
					break;
               }

               Class53.aClass109_Sub7Array532 = var4;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 201) {
               anInt1987 = aClass109_Sub14_Sub1_2211.method592() * 30;
               anInt2165 = anInt2131;
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 6) {
               for(; aClass109_Sub14_Sub1_2211.position < anInt2012;) {
                  var41 = aClass109_Sub14_Sub1_2211.method564() == 1;
                  var11 = aClass109_Sub14_Sub1_2211.method602();
                  var50 = aClass109_Sub14_Sub1_2211.method602();
                  var5 = aClass109_Sub14_Sub1_2211.method566();
                  var6 = aClass109_Sub14_Sub1_2211.method564();
                  var14 = aClass109_Sub14_Sub1_2211.method564();
                  final boolean var69 = (var14 & 2) != 0;
                  final boolean var17 = (var14 & 1) != 0;
                  if(var5 > 0) {
                     aClass109_Sub14_Sub1_2211.method602();
                     aClass109_Sub14_Sub1_2211.method564();
                     aClass109_Sub14_Sub1_2211.method568();
                  }

                  aClass109_Sub14_Sub1_2211.method602();

                  for(int var32 = 0; var32 < anInt2237; ++var32) {
                     final Class33 var34 = aClass33Array2239[var32];
                     if(!var41) {
                        if(var11.equals(var34.aString317)) {
                           if(var5 != var34.anInt319) {
                              var25 = true;

                              for(Class110_Sub1 var27 = (Class110_Sub1)aClass119_2240.method437(); null != var27; var27 = (Class110_Sub1)aClass119_2240.method435())
								if(var27.aString897.equals(var11))
									if((var5 != 0) && (var27.aShort898 == 0)) {
                                       var27.method415();
                                       var25 = false;
                                    } else if((var5 == 0) && (var27.aShort898 != 0)) {
                                       var27.method415();
                                       var25 = false;
                                    }

                              if(var25)
								aClass119_2240.method436(new Class110_Sub1(var11, var5));

                              var34.anInt319 = var5;
                           }

                           var34.aString318 = var50;
                           var34.anInt320 = var6;
                           var34.aBool321 = var69;
                           var34.aBool325 = var17;
                           var11 = null;
                           break;
                        }
                     } else if(var50.equals(var34.aString317)) {
                        var34.aString317 = var11;
                        var34.aString318 = var50;
                        var11 = null;
                        break;
                     }
                  }
               }

               anInt2238 = 2;
               anInt2161 = anInt2131;
               var41 = false;
               var2 = anInt2237;

               while(var2 > 0) {
                  var41 = true;
                  --var2;

                  for(var3 = 0; var3 < var2; ++var3) {
                     var45 = false;
                     final Class33 var52 = aClass33Array2239[var3];
                     final Class33 var20 = aClass33Array2239[var3 + 1];
                     if((var52.anInt319 != anInt1970) && (anInt1970 == var20.anInt319))
						var45 = true;

                     if(!var45 && (var52.anInt319 == 0) && (var20.anInt319 != 0))
						var45 = true;

                     if(!var45 && !var52.aBool321 && var20.aBool321)
						var45 = true;

                     if(!var45 && !var52.aBool325 && var20.aBool325)
						var45 = true;

                     if(var45) {
                        final Class33 var16 = aClass33Array2239[var3];
                        aClass33Array2239[var3] = aClass33Array2239[1 + var3];
                        aClass33Array2239[var3 + 1] = var16;
                        var41 = false;
                     }
                  }

                  if(var41)
					break;
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 79) {
               var1 = aClass109_Sub14_Sub1_2211.method574();
               var42 = aClass109_Sub14_Sub1_2211.method564() == 1;
               var50 = "";
               var45 = false;
               if(var42) {
                  var50 = aClass109_Sub14_Sub1_2211.method602();
                  if(Class109_Sub11.method541(var50))
					var45 = true;
               }

               final String var12 = aClass109_Sub14_Sub1_2211.method602();
               if(!var45)
				Applet_Sub1.method1053(var1, var50, var12);

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 38) {
               var1 = aClass109_Sub14_Sub1_2211.method566();
               var2 = aClass109_Sub14_Sub1_2211.method564();
               var3 = aClass109_Sub14_Sub1_2211.method566();
               if((anInt2210 != 0) && (var2 != 0) && (anInt2212 < 50)) {
                  anIntArray2213[anInt2212] = var1;
                  anIntArray2214[anInt2212] = var2;
                  anIntArray2248[anInt2212] = var3;
                  aClass11Array2217[anInt2212] = null;
                  anIntArray2216[anInt2212] = 0;
                  ++anInt2212;
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 155) {
               anInt2206 = aClass109_Sub14_Sub1_2211.method564();
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 35) {
               var13 = aClass109_Sub14_Sub1_2211.method602();
               var11 = Class109_Sub21_Sub14_Sub4.method1013(Class35.method158(Class48.method245(aClass109_Sub14_Sub1_2211)));
               Applet_Sub1.method1053(6, var13, var11);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 229) {
               Class8.anInt89 = aClass109_Sub14_Sub1_2211.method564();
               Class109_Sub21_Sub13.anInt1544 = aClass109_Sub14_Sub1_2211.method585();

               while(aClass109_Sub14_Sub1_2211.position < anInt2012) {
                  anInt2013 = aClass109_Sub14_Sub1_2211.method564();
                  Class109_Sub21_Sub11.method749();
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 133) {
               Class109_Sub7.method524(false);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 170) {
               Class48.aClass52_501 = Class2.method17(aClass109_Sub14_Sub1_2211.method564());
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 47) {
               Class137.method483(true);
               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 157) {
               var1 = aClass109_Sub14_Sub1_2211.method568();
               var11 = aClass109_Sub14_Sub1_2211.method602();
               var10 = Class83.method345(var1);
               if(!var11.equals(var10.aString1205)) {
                  var10.aString1205 = var11;
                  Class71.method315(var10);
               }

               anInt2013 = -1;
               return true;
            }

            if(anInt2013 == 33) {
               var1 = aClass109_Sub14_Sub1_2211.method568();
               var2 = aClass109_Sub14_Sub1_2211.method566();
               if(var1 < -70000)
				var2 += '\u8000';

               if(var1 >= 0)
				var10 = Class83.method345(var1);
			else
				var10 = null;

               if(var10 != null)
				for(var5 = 0; var5 < var10.anIntArray1149.length; ++var5) {
                     var10.anIntArray1149[var5] = 0;
                     var10.anIntArray1264[var5] = 0;
                  }

               Class37.method163(var2);
               var5 = aClass109_Sub14_Sub1_2211.method566();

               for(var6 = 0; var6 < var5; ++var6) {
                  var14 = aClass109_Sub14_Sub1_2211.method592();
                  var15 = aClass109_Sub14_Sub1_2211.method584();
                  if(var15 == 255)
					var15 = aClass109_Sub14_Sub1_2211.method568();

                  if((var10 != null) && (var6 < var10.anIntArray1149.length)) {
                     var10.anIntArray1149[var6] = var14;
                     var10.anIntArray1264[var6] = var15;
                  }

                  Class109_Sub10.method536(var2, var6, var14 - 1, var15);
               }

               if(var10 != null)
				Class71.method315(var10);

               Class44.method227();
               anIntArray2156[(++anInt2145 - 1) & 31] = var2 & 32767;
               anInt2013 = -1;
               return true;
            }

            Class47.method237("" + anInt2013 + "," + anInt2018 + "," + anInt2019 + "," + anInt2012, (Throwable)null);
            Class59.method275();
         } catch (final IOException var39) {
            if(anInt2016 > 0)
				Class59.method275();
			else {
               Class82.method343(40);
               Class109_Sub6.aClass82_962 = Class48.aClass82_506;
               Class48.aClass82_506 = null;
            }
         } catch (final Exception var40) {
            var13 = "" + anInt2013 + "," + anInt2018 + "," + anInt2019 + "," + anInt2012 + "," + (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1655[0] + Class41.anInt375) + "," + (Class113.anInt822 + Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1706[0]) + ",";

            for(var2 = 0; (var2 < anInt2012) && (var2 < 50); ++var2)
				var13 = var13 + aClass109_Sub14_Sub1_2211.data[var2] + ",";

            Class47.method237(var13, var40);
            Class59.method275();
         }

         return true;
      }
   }

	@Override
	public final void init() {
		if (method1041()) {
			final Class98[] var1 = Class81.method336();

			for (final Class98 var3 : var1) {
				final String var4 = getParameter(var3.aString733);
				if (var4 != null)
					switch (Integer.parseInt(var3.aString733)) {
					case 1:
						Class53.anInt533 = Integer.parseInt(var4);
						break;
					case 2:
						Class109_Sub21_Sub2.anInt1303 = Integer.parseInt(var4);
						break;
					case 3:
						Class109_Sub12.aString1039 = var4;
						break;
					case 4:
						anInt1971 = Integer.parseInt(var4);
						break;
					case 5:
						anInt2051 = Integer.parseInt(var4);
					case 6:
					case 10:
					case 11:
					default:
						break;
					case 7:
						RuntimeException_Sub1.aClass90_1900 = Class109_Sub21_Sub10.method738(Integer.parseInt(var4));
						break;
					case 8:
						if (var4.equalsIgnoreCase("true"))
							;
						break;
					case 9:
						aClass74_1973 = (Class74) Class33.method151(Class109_Sub21_Sub15_Sub3.method894(),
								Integer.parseInt(var4));
						if (aClass74_1973 == Class74.aClass74_605)
							Class95.aClass113_708 = Class113.aClass113_813;
						else
							Class95.aClass113_708 = Class113.aClass113_818;
						break;
					case 12:
						anInt1970 = Integer.parseInt(var4);
						break;
					case 13:
						Class41.aString371 = var4;
						break;
					case 14:
						if (var4.equalsIgnoreCase("true"))
							aBool1974 = true;
						else
							aBool1974 = false;
						break;
					case 15:
						anInt1972 = Integer.parseInt(var4);
					}
			}

			method1063();
			Class109_Sub9.aString998 = getCodeBase().getHost();
			final String var6 = RuntimeException_Sub1.aClass90_1900.aString687;
			final byte var7 = 0;

			try {
				Class109_Sub11.method543("oldschool", var6, var7, 16);
			} catch (final Exception var5) {
				Class47.method237((String) null, var5);
			}

			aclient1968 = this;
			method1046(765, 503, 83);
		}
	}

	@Override
	protected final void method1044(final int var1) {
		Class20.anInt188 = anInt1972 == 0 ? '\uaa4a' : '\u9c40' + anInt1970;
		Class2.anInt18 = anInt1972 == 0 ? 443 : anInt1970 + '\uc350';
		Class33.anInt323 = Class20.anInt188;
		Class67.aShortArray582 = Class94.aShortArray707;
		Class96.aShortArrayArray715 = Class94.aShortArrayArray704;
		Class44.aShortArray452 = Class94.aShortArray705;
		Class109_Sub21_Sub16.aShortArrayArray1586 = Class94.aShortArrayArray706;
		if (Class71.aString597.toLowerCase().indexOf("microsoft") != -1) {
			Class63.anIntArray565[186] = 57;
			Class63.anIntArray565[187] = 27;
			Class63.anIntArray565[188] = 71;
			Class63.anIntArray565[189] = 26;
			Class63.anIntArray565[190] = 72;
			Class63.anIntArray565[191] = 73;
			Class63.anIntArray565[192] = 58;
			Class63.anIntArray565[219] = 42;
			Class63.anIntArray565[220] = 74;
			Class63.anIntArray565[221] = 43;
			Class63.anIntArray565[222] = 59;
			Class63.anIntArray565[223] = 28;
		} else {
			Class63.anIntArray565[44] = 71;
			Class63.anIntArray565[45] = 26;
			Class63.anIntArray565[46] = 72;
			Class63.anIntArray565[47] = 73;
			Class63.anIntArray565[59] = 57;
			Class63.anIntArray565[61] = 27;
			Class63.anIntArray565[91] = 42;
			Class63.anIntArray565[92] = 74;
			Class63.anIntArray565[93] = 43;
			Class63.anIntArray565[192] = 28;
			Class63.anIntArray565[222] = 58;
			Class63.anIntArray565[520] = 59;
		}

		final Canvas var2 = Class109_Sub21_Sub10.aCanvas1472;
		var2.setFocusTraversalKeysEnabled(false);
		var2.addKeyListener(Class63.aClass63_573);
		var2.addFocusListener(Class63.aClass63_573);
		final Canvas var3 = Class109_Sub21_Sub10.aCanvas1472;
		var3.addMouseListener(Class81.aClass81_644);
		var3.addMouseMotionListener(Class81.aClass81_644);
		var3.addFocusListener(Class81.aClass81_644);
		Class109_Sub21_Sub1.aClass66_1297 = Class62.method283();
		if (Class109_Sub21_Sub1.aClass66_1297 != null)
			Class109_Sub21_Sub1.aClass66_1297.method293(Class109_Sub21_Sub10.aCanvas1472, (byte) -103);

		Class109_Sub21_Sub3.aClass68_1320 = new Class68(255, Class77.aClass130_617, Class77.aClass130_618, 500000);
		Class132 var4 = null;
		Class21 var5 = new Class21();

		try {
			var4 = Class1.method12("", aClass74_1973.aString610, false);
			final byte[] var6 = new byte[(int) var4.method476()];

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) {
				var8 = var4.method477(var6, var7, var6.length - var7);
				if (var8 == -1)
					throw new IOException();
			}

			var5 = new Class21(new DataBuffer(var6));
		} catch (final Exception var11) {
			;
		}

		try {
			if (null != var4)
				var4.method475();
		} catch (final Exception var10) {
			;
		}

		Class50.aClass21_513 = var5;
		Class109_Sub21_Sub9.aClipboard1416 = getToolkit().getSystemClipboard();
		final String var12 = Class32.aString316;
		Class69.anApplet593 = this;
		Class69.aString592 = var12;
		if (anInt1972 != 0)
			aBool1986 = true;

		Class109_Sub12.method545(Class50.aClass21_513.anInt200);
	}

	@Override
	protected final void method1048(final int var1) {
		boolean var2;
		label223: {
			try {
				if (Class93.anInt703 == 2) {
					if (Class66.aClass109_Sub19_580 == null) {
						Class66.aClass109_Sub19_580 = Class109_Sub19.method634(Class27.aClass104_260, Class75.anInt613,
								Class109_Sub21_Sub15_Sub3_Sub1.anInt1926);
						if (null == Class66.aClass109_Sub19_580) {
							var2 = false;
							break label223;
						}
					}

					if (null == Class31.aClass17_309)
						Class31.aClass17_309 = new Class17(Class93.aClass104_699, Class93.aClass104_700);

					if (Class93.aClass109_Sub4_Sub3_701.method854(Class66.aClass109_Sub19_580, Class93.aClass104_702,
							Class31.aClass17_309, 22050)) {
						Class93.aClass109_Sub4_Sub3_701.method879();
						Class93.aClass109_Sub4_Sub3_701.method852(Class79.anInt628);
						Class93.aClass109_Sub4_Sub3_701.method857(Class66.aClass109_Sub19_580, Class25.aBool224);
						Class93.anInt703 = 0;
						Class66.aClass109_Sub19_580 = null;
						Class31.aClass17_309 = null;
						Class27.aClass104_260 = null;
						var2 = true;
						break label223;
					}
				}
			} catch (final Exception var20) {
				var20.printStackTrace();
				Class93.aClass109_Sub4_Sub3_701.method858();
				Class93.anInt703 = 0;
				Class66.aClass109_Sub19_580 = null;
				Class31.aClass17_309 = null;
				Class27.aClass104_260 = null;
			}

			var2 = false;
		}

		if (var2 && aBool2209 && (null != Class102.aClass4_757))
			Class102.aClass4_757.method23();

		if ((anInt2180 == 10) || (anInt2180 == 20) || (anInt2180 == 30))
			if ((0L != aLong2228) && (Class109_Sub21_Sub15.method829(1596568979) > aLong2228))
				Class109_Sub12.method545(Class58.method271());
			else if (aBool1964)
				Class26.method119();

		final Dimension var5 = method1052();
		if ((var5.width != Class70.anInt595) || (var5.height != Class109_Sub21_Sub15.anInt1574) || aBool1952) {
			Class109_Sub4_Sub4.method886();
			aLong2228 = Class109_Sub21_Sub15.method829(-349643229) + 500L;
			aBool1952 = false;
		}

		boolean var6 = false;
		int var7;
		if (aBool1961) {
			aBool1961 = false;
			var6 = true;

			for (var7 = 0; var7 < 100; ++var7)
				aBoolArray2116[var7] = true;
		}

		if (var6)
			Class54.method261();

		if (anInt2180 == 0) {
			var7 = Class5.anInt61;
			final String var8 = Class5.aString62;
			Color var9 = null;

			try {
				final Graphics var10 = Class109_Sub21_Sub10.aCanvas1472.getGraphics();
				if (Class29.aFont269 == null) {
					Class29.aFont269 = new Font("Helvetica", 1, 13);
					Class26.aFontMetrics240 = Class109_Sub21_Sub10.aCanvas1472.getFontMetrics(Class29.aFont269);
				}

				if (var6) {
					var10.setColor(Color.black);
					var10.fillRect(0, 0, LoginEncoder.anInt524, Class109_Sub21_Sub15_Sub5.anInt1815);
				}

				if (null == var9)
					var9 = new Color(140, 17, 17);

				try {
					if (null == Class109_Sub10.anImage1025)
						Class109_Sub10.anImage1025 = Class109_Sub21_Sub10.aCanvas1472.createImage(304, 34);

					final Graphics var11 = Class109_Sub10.anImage1025.getGraphics();
					var11.setColor(var9);
					var11.drawRect(0, 0, 303, 33);
					var11.fillRect(2, 2, 3 * var7, 30);
					var11.setColor(Color.black);
					var11.drawRect(1, 1, 301, 31);
					var11.fillRect((var7 * 3) + 2, 2, 300 - (3 * var7), 30);
					var11.setFont(Class29.aFont269);
					var11.setColor(Color.white);
					var11.drawString(var8, (304 - Class26.aFontMetrics240.stringWidth(var8)) / 2, 22);
					var10.drawImage(Class109_Sub10.anImage1025, (LoginEncoder.anInt524 / 2) - 152,
							(Class109_Sub21_Sub15_Sub5.anInt1815 / 2) - 18, (ImageObserver) null);
				} catch (final Exception var16) {
					final int var12 = (LoginEncoder.anInt524 / 2) - 152;
					final int var13 = (Class109_Sub21_Sub15_Sub5.anInt1815 / 2) - 18;
					var10.setColor(var9);
					var10.drawRect(var12, var13, 303, 33);
					var10.fillRect(2 + var12, var13 + 2, var7 * 3, 30);
					var10.setColor(Color.black);
					var10.drawRect(1 + var12, var13 + 1, 301, 31);
					var10.fillRect((3 * var7) + 2 + var12, var13 + 2, 300 - (var7 * 3), 30);
					var10.setFont(Class29.aFont269);
					var10.setColor(Color.white);
					var10.drawString(var8, var12 + ((304 - Class26.aFontMetrics240.stringWidth(var8)) / 2), var13 + 22);
				}
			} catch (final Exception var17) {
				Class109_Sub21_Sub10.aCanvas1472.repaint();
			}
		} else if (anInt2180 == 5)
			Class109_Sub21_Sub15_Sub3.method901(Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334,
					aClass109_Sub21_Sub14_Sub4_Sub1_2021, Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503,
					var6);
		else if ((anInt2180 != 10) && (anInt2180 != 11)) {
			if (anInt2180 == 20)
				Class109_Sub21_Sub15_Sub3.method901(Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334,
						aClass109_Sub21_Sub14_Sub4_Sub1_2021, Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503,
						var6);
			else if (anInt2180 == 25) {
				if (anInt2027 == 1) {
					if (anInt2023 > anInt2024)
						anInt2024 = anInt2023;

					var7 = ((anInt2024 * 50) - (anInt2023 * 50)) / anInt2024;
					Class35.method157("Loading - please wait." + "<br>" + " (" + var7 + "%" + ")", false);
				} else if (anInt2027 == 2) {
					if (anInt2025 > anInt2026)
						anInt2026 = anInt2025;

					var7 = (((anInt2026 * 50) - (anInt2025 * 50)) / anInt2026) + 50;
					Class35.method157("Loading - please wait." + "<br>" + " (" + var7 + "%" + ")", false);
				} else
					Class35.method157("Loading - please wait.", false);
			} else if (anInt2180 == 30)
				Class29.method130();
			else if (anInt2180 == 40)
				Class35.method157("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			else if (anInt2180 == 45)
				Class35.method157("Please wait...", false);
		} else
			Class109_Sub21_Sub15_Sub3.method901(Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334,
					aClass109_Sub21_Sub14_Sub4_Sub1_2021, Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503,
					var6);

		Graphics var14;
		int var15;
		if ((anInt2180 == 30) && (anInt2182 == 0) && !var6)
			try {
				var14 = Class109_Sub21_Sub10.aCanvas1472.getGraphics();

				for (var15 = 0; var15 < anInt2173; ++var15)
					if (aBoolArray2002[var15]) {
						Class44.aClass8_453.method49(var14, anIntArray2241[var15], anIntArray2179[var15],
								anIntArray2222[var15], anIntArray2181[var15], 1505727884);
						aBoolArray2002[var15] = false;
					}
			} catch (final Exception var19) {
				Class109_Sub21_Sub10.aCanvas1472.repaint();
			}
		else if (anInt2180 > 0)
			try {
				var14 = Class109_Sub21_Sub10.aCanvas1472.getGraphics();
				Class44.aClass8_453.method50(var14, 0, 0, (byte) 1);

				for (var15 = 0; var15 < anInt2173; ++var15)
					aBoolArray2002[var15] = false;
			} catch (final Exception var18) {
				Class109_Sub21_Sub10.aCanvas1472.repaint();
			}

	}

	@Override
	protected final void method1049(final byte var1) {
		if (aClass41_2059 != null)
			aClass41_2059.aBool377 = false;

		aClass41_2059 = null;
		if (null != Class48.aClass82_506) {
			Class48.aClass82_506.method338();
			Class48.aClass82_506 = null;
		}

		Class24.method110();
		if (Class81.aClass81_644 != null) {
			final Class81 var2 = Class81.aClass81_644;
			synchronized (var2) {
				Class81.aClass81_644 = null;
			}
		}

		Class109_Sub21_Sub1.aClass66_1297 = null;
		if (Class102.aClass4_757 != null)
			Class102.aClass4_757.method32();

		if (Class54.aClass4_535 != null)
			Class54.aClass4_535.method32();

		if (null != Class87.aClass82_669)
			Class87.aClass82_669.method338();

		final Object var8 = Class105.anObject796;
		synchronized (var8) {
			if (Class105.anInt794 != 0) {
				Class105.anInt794 = 1;

				try {
					Class105.anObject796.wait();
				} catch (final InterruptedException var5) {
					;
				}
			}
		}

		Class48.method247();
	}

	void method1059() {
		if (anInt2180 != 1000) {
			final boolean var1 = Class8.method52();
			if (!var1)
				method1060();

		}
	}

	void method1060() {
		if (Class102.anInt744 >= 4) {
			method1050("js5crc");
			anInt2180 = 1000;
		} else {
			if (Class102.anInt764 >= 4) {
				if (anInt2180 <= 5) {
					method1050("js5io");
					anInt2180 = 1000;
					return;
				}

				anInt1993 = 3000;
				Class102.anInt764 = 3;
			}

			if ((--anInt1993 + 1) <= 0)
				try {
					if (anInt2155 == 0) {
						Class109_Sub13.aClass86_1051 = Class109_Sub21_Sub11.aClass71_1495
								.method313(Class109_Sub9.aString998, Class33.anInt323);
						++anInt2155;
					}

					if (anInt2155 == 1) {
						if (Class109_Sub13.aClass86_1051.anInt664 == 2) {
							method1061(-1);
							return;
						}

						if (Class109_Sub13.aClass86_1051.anInt664 == 1)
							++anInt2155;
					}

					if (anInt2155 == 2) {
						Class4.aClass82_47 = new Class82((Socket) Class109_Sub13.aClass86_1051.anObject662,
								Class109_Sub21_Sub11.aClass71_1495);
						final DataBuffer var1 = new DataBuffer(5);
						var1.writeByte(15);
						var1.writeInt(83);
						Class4.aClass82_47.method342(var1.data, 0, 5);
						++anInt2155;
						Class17.aLong153 = Class109_Sub21_Sub15.method829(1486007814);
					}

					if (anInt2155 == 3)
						if ((anInt2180 > 5) && (Class4.aClass82_47.method340() <= 0)) {
							if ((Class109_Sub21_Sub15.method829(1104145786) - Class17.aLong153) > 30000L) {
								method1061(-2);
								return;
							}
						} else {
							final int var2 = Class4.aClass82_47.method339();
							if (var2 != 0) {
								method1061(var2);
								return;
							}

							++anInt2155;
						}

					if (anInt2155 == 4) {
						final Class82 var10 = Class4.aClass82_47;
						final boolean var3 = anInt2180 > 20;
						if (Class87.aClass82_669 != null) {
							try {
								Class87.aClass82_669.method338();
							} catch (final Exception var8) {
								;
							}

							Class87.aClass82_669 = null;
						}

						Class87.aClass82_669 = var10;
						Class109_Sub21_Sub15_Sub2.method893(var3);
						Class102.aClass109_Sub14_756.position = 0;
						Class88.aClass109_Sub21_Sub18_671 = null;
						Class102.aClass109_Sub14_747 = null;
						Class102.anInt752 = 0;

						while (true) {
							Class109_Sub21_Sub18 var4 = (Class109_Sub21_Sub18) Class102.aClass116_748.method432();
							if (var4 == null)
								while (true) {
									var4 = (Class109_Sub21_Sub18) Class102.aClass116_753.method432();
									if (var4 == null) {
										if (Class102.aByte762 != 0)
											try {
												final DataBuffer var11 = new DataBuffer(4);
												var11.writeByte(4);
												var11.writeByte(Class102.aByte762);
												var11.writeShort(0);
												Class87.aClass82_669.method342(var11.data, 0, 4);
											} catch (final IOException var7) {
												try {
													Class87.aClass82_669.method338();
												} catch (final Exception var6) {
													;
												}

												++Class102.anInt764;
												Class87.aClass82_669 = null;
											}

										Class102.anInt746 = 0;
										Class102.aLong745 = Class109_Sub21_Sub15.method829(902934575);
										Class109_Sub13.aClass86_1051 = null;
										Class4.aClass82_47 = null;
										anInt2155 = 0;
										anInt2050 = 0;
										return;
									}

									Class102.aClass111_750.method417(var4);
									Class102.aClass116_751.method430(var4, var4.aLong802);
									++Class102.anInt761;
									--Class102.anInt754;
								}

							Class102.aClass116_758.method430(var4, var4.aLong802);
							++Class102.anInt765;
							--Class102.anInt760;
						}
					}
				} catch (final IOException var9) {
					method1061(-3);
				}
		}
	}

	void method1061(final int var1) {
		Class109_Sub13.aClass86_1051 = null;
		Class4.aClass82_47 = null;
		anInt2155 = 0;
		if (Class33.anInt323 == Class20.anInt188)
			Class33.anInt323 = Class2.anInt18;
		else
			Class33.anInt323 = Class20.anInt188;

		++anInt2050;
		if ((anInt2050 < 2) || ((var1 != 7) && (var1 != 9))) {
			if ((anInt2050 >= 2) && (var1 == 6)) {
				method1050("js5connect_outofdate");
				anInt2180 = 1000;
			} else if (anInt2050 >= 4)
				if (anInt2180 <= 5) {
					method1050("js5connect");
					anInt2180 = 1000;
				} else
					anInt1993 = 3000;
		} else if (anInt2180 <= 5) {
			method1050("js5connect_full");
			anInt2180 = 1000;
		} else
			anInt1993 = 3000;

	}

	static void method1062() {
		if (aBool2171) {
			final Class109_Sub20 var1 = Class112.method423(Class20.anInt193, anInt2124);
			if ((null != var1) && (null != var1.anObjectArray1237)) {
				final Class109_Sub9 var0 = new Class109_Sub9();
				var0.aClass109_Sub20_996 = var1;
				var0.anObjectArray997 = var1.anObjectArray1237;
				Class109_Sub13.method551(var0, 200000);
			}

			aBool2171 = false;
			Class71.method315(var1);
		}
	}

	@Override
	protected final void method1047(final int var1) {
		++anInt1979;
		method1059();

		while (true) {
			final Class126 var2 = Class105.aClass126_793;
			Class109_Sub17 var3;
			synchronized (var2) {
				var3 = (Class109_Sub17) Class105.aClass126_795.method453();
			}

			if (null == var3) {
				Class109_Sub9.method532();
				Class52.method255();
				final Class63 var32 = Class63.aClass63_573;
				int var5;
				synchronized (var32) {
					++Class63.anInt574;
					Class63.anInt571 = Class63.anInt563;
					Class63.anInt568 = 0;
					if (Class63.anInt566 >= 0)
						while (Class63.anInt566 != Class63.anInt567) {
							var5 = Class63.anIntArray569[Class63.anInt567];
							Class63.anInt567 = (Class63.anInt567 + 1) & 127;
							if (var5 < 0)
								Class63.aBoolArray562[~var5] = false;
							else {
								if (!Class63.aBoolArray562[var5]
										&& (Class63.anInt568 < (Class63.anIntArray575.length - 1)))
									Class63.anIntArray575[++Class63.anInt568 - 1] = var5;

								Class63.aBoolArray562[var5] = true;
							}
						}
					else {
						for (var5 = 0; var5 < 112; ++var5)
							Class63.aBoolArray562[var5] = false;

						Class63.anInt566 = Class63.anInt567;
					}

					Class63.anInt563 = Class63.anInt564;
				}

				Class27.method124();
				int var7;
				if (Class109_Sub21_Sub1.aClass66_1297 != null) {
					var7 = Class109_Sub21_Sub1.aClass66_1297.method297((byte) -86);
					anInt2168 = var7;
				}

				if (anInt2180 == 0) {
					Class109_Sub9.method531();
					Class47.method240();
				} else if (anInt2180 == 5) {
					Class26.method115(this);
					Class109_Sub9.method531();
					Class37.aClass57_356.method269(1653058328);

					for (var7 = 0; var7 < 32; ++var7)
						aLongArray1949[var7] = 0L;

					for (var7 = 0; var7 < 32; ++var7)
						aLongArray1958[var7] = 0L;

					Class26.anInt241 = 0;
				} else if ((anInt2180 != 10) && (anInt2180 != 11)) {
					if (anInt2180 == 20) {
						Class26.method115(this);
						LoginEncoder.method253();
					} else if (anInt2180 == 25)
						Class109_Sub10.method540();
				} else
					Class26.method115(this);

				if (anInt2180 == 30) {
					if (anInt1987 > 1)
						--anInt1987;

					if (anInt2016 > 0)
						--anInt2016;

					if (aBool2020) {
						aBool2020 = false;
						if (anInt2016 > 0)
							Class59.method275();
						else {
							Class82.method343(40);
							Class109_Sub6.aClass82_962 = Class48.aClass82_506;
							Class48.aClass82_506 = null;
						}
					} else {
						if (!aBool2109) {
							aStringArray1975[0] = "Cancel";
							aStringArray2123[0] = "";
							anIntArray2113[0] = 1006;
							anInt2045 = 1;
						}

						for (var7 = 0; (var7 < 100) && method1058(); ++var7)
							;

						if (anInt2180 == 30) {
							while (Class109_Sub21_Sub2.method667()) {
								secureBuffer.method840(246);
								secureBuffer.writeByte(0);
								var7 = secureBuffer.position;
								Class88.method353(secureBuffer);
								secureBuffer.method562(secureBuffer.position - var7);
							}

							final Object var34 = aClass41_2059.anObject372;
							int var8;
							int var9;
							int var10;
							int var11;
							int var12;
							int var13;
							int var14;
							synchronized (var34) {
								if (!aBool1969)
									aClass41_2059.anInt373 = 0;
								else if ((Class81.anInt643 != 0) || (aClass41_2059.anInt373 >= 40)) {
									secureBuffer.method840(118);
									secureBuffer.writeByte(0);
									var5 = secureBuffer.position;
									var8 = 0;

									for (var9 = 0; (var9 < aClass41_2059.anInt373)
											&& ((secureBuffer.position - var5) < 240); ++var9) {
										++var8;
										var10 = aClass41_2059.anIntArray374[var9];
										if (var10 < 0)
											var10 = 0;
										else if (var10 > 502)
											var10 = 502;

										var11 = aClass41_2059.anIntArray376[var9];
										if (var11 < 0)
											var11 = 0;
										else if (var11 > 764)
											var11 = 764;

										var12 = (765 * var10) + var11;
										if ((aClass41_2059.anIntArray374[var9] == -1)
												&& (aClass41_2059.anIntArray376[var9] == -1)) {
											var11 = -1;
											var10 = -1;
											var12 = 524287;
										}

										if ((anInt1982 == var11) && (var10 == anInt2003)) {
											if (anInt1984 < 2047)
												++anInt1984;
										} else {
											var13 = var11 - anInt1982;
											anInt1982 = var11;
											var14 = var10 - anInt2003;
											anInt2003 = var10;
											if ((anInt1984 < 8) && (var13 >= -32) && (var13 <= 31) && (var14 >= -32)
													&& (var14 <= 31)) {
												var13 += 32;
												var14 += 32;
												secureBuffer
														.writeShort(var14 + (var13 << 6) + (anInt1984 << 12));
												anInt1984 = 0;
											} else if (anInt1984 < 8) {
												secureBuffer
														.writeTriByte(8388608 + (anInt1984 << 19) + var12);
												anInt1984 = 0;
											} else {
												secureBuffer
														.writeInt(var12 + -1073741824 + (anInt1984 << 19));
												anInt1984 = 0;
											}
										}
									}

									secureBuffer.method562(secureBuffer.position - var5);
									if (var8 >= aClass41_2059.anInt373)
										aClass41_2059.anInt373 = 0;
									else {
										aClass41_2059.anInt373 -= var8;

										for (var9 = 0; var9 < aClass41_2059.anInt373; ++var9) {
											aClass41_2059.anIntArray376[var9] = aClass41_2059.anIntArray376[var9
													+ var8];
											aClass41_2059.anIntArray374[var9] = aClass41_2059.anIntArray374[var8
													+ var9];
										}
									}
								}
							}

							if ((Class81.anInt643 == 1) || (!Class3.aBool22 && (Class81.anInt643 == 4))
									|| (Class81.anInt643 == 2)) {
								long var16 = (Class81.aLong632 - aLong1980) / 50L;
								if (var16 > 4095L)
									var16 = 4095L;

								aLong1980 = Class81.aLong632;
								var8 = Class81.anInt639;
								if (var8 < 0)
									var8 = 0;
								else if (var8 > Class109_Sub21_Sub15_Sub5.anInt1815)
									var8 = Class109_Sub21_Sub15_Sub5.anInt1815;

								var9 = Class81.anInt645;
								if (var9 < 0)
									var9 = 0;
								else if (var9 > LoginEncoder.anInt524)
									var9 = LoginEncoder.anInt524;

								var10 = (int) var16;
								secureBuffer.method840(89);
								secureBuffer.writeShort((Class81.anInt643 == 2 ? 1 : 0) + (var10 << 1));
								secureBuffer.writeShort(var9);
								secureBuffer.writeShort(var8);
							}

							if (Class63.anInt568 > 0) {
								secureBuffer.method840(83);
								secureBuffer.writeShort(0);
								var7 = secureBuffer.position;
								final long var18 = Class109_Sub21_Sub15.method829(-497399717);

								for (var9 = 0; var9 < Class63.anInt568; ++var9) {
									long var20 = var18 - aLong2011;
									if (var20 > 16777215L)
										var20 = 16777215L;

									aLong2011 = var18;
									secureBuffer.method595((int) var20);
									secureBuffer.writeByte(Class63.anIntArray575[var9]);
								}

								secureBuffer.method605(secureBuffer.position - var7);
							}

							if (anInt2056 > 0)
								--anInt2056;

							if (Class63.aBoolArray562[96] || Class63.aBoolArray562[97] || Class63.aBoolArray562[98]
									|| Class63.aBoolArray562[99])
								aBool2057 = true;

							if (aBool2057 && (anInt2056 <= 0)) {
								anInt2056 = 20;
								aBool2057 = false;
								secureBuffer.method840(88);
								secureBuffer.writeShort(anInt2052);
								secureBuffer.method590(anInt1991);
							}

							if (Class113.aBool816 && !aBool1985) {
								aBool1985 = true;
								secureBuffer.method840(106);
								secureBuffer.writeByte(1);
							}

							if (!Class113.aBool816 && aBool1985) {
								aBool1985 = false;
								secureBuffer.method840(106);
								secureBuffer.writeByte(0);
							}

							if (aBool2065 && (anInt2022 != Class77.anInt616))
								Class2.method19(Class109_Sub21_Sub11.anInt1493, Class27.anInt259, Class77.anInt616,
										Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1655[0],
										Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1706[0]);
							else if (anInt2090 != Class77.anInt616) {
								anInt2090 = Class77.anInt616;
								Class35.method155(Class77.anInt616);
							}

							if (anInt2180 == 30) {
								for (Class109_Sub11 var35 = (Class109_Sub11) aClass126_2102
										.method458(); var35 != null; var35 = (Class109_Sub11) aClass126_2102
												.method449()) {
									if (var35.anInt1035 > 0)
										--var35.anInt1035;

									Class109_Sub21_Sub10 var22;
									boolean var38;
									if (var35.anInt1035 == 0) {
										if (var35.anInt1030 >= 0) {
											var8 = var35.anInt1030;
											var9 = var35.anInt1033;
											var22 = Class28.method128(var8);
											if (var9 == 11)
												var9 = 10;

											if ((var9 >= 5) && (var9 <= 8))
												var9 = 4;

											var38 = var22.method727(var9);
											if (!var38)
												continue;
										}

										Class35.method156(var35.anInt1038, var35.anInt1027, var35.anInt1028,
												var35.anInt1029, var35.anInt1030, var35.anInt1031, var35.anInt1033);
										var35.method413();
									} else {
										if (var35.anInt1034 > 0)
											--var35.anInt1034;

										if ((var35.anInt1034 == 0) && (var35.anInt1028 >= 1) && (var35.anInt1029 >= 1)
												&& (var35.anInt1028 <= 102) && (var35.anInt1029 <= 102)) {
											if (var35.anInt1032 >= 0) {
												var8 = var35.anInt1032;
												var9 = var35.anInt1026;
												var22 = Class28.method128(var8);
												if (var9 == 11)
													var9 = 10;

												if ((var9 >= 5) && (var9 <= 8))
													var9 = 4;

												var38 = var22.method727(var9);
												if (!var38)
													continue;
											}

											Class35.method156(var35.anInt1038, var35.anInt1027, var35.anInt1028,
													var35.anInt1029, var35.anInt1032, var35.anInt1037, var35.anInt1026);
											var35.anInt1034 = -1;
											if ((var35.anInt1030 == var35.anInt1032) && (var35.anInt1030 == -1))
												var35.method413();
											else if ((var35.anInt1032 == var35.anInt1030)
													&& (var35.anInt1037 == var35.anInt1031)
													&& (var35.anInt1026 == var35.anInt1033))
												var35.method413();
										}
									}
								}

								for (var7 = 0; var7 < anInt2212; ++var7) {
									--anIntArray2248[var7];
									if (anIntArray2248[var7] >= -10) {
										Class11 var31 = aClass11Array2217[var7];
										if (null == var31) {
											var31 = Class11.method58(Class70.aClass104_Sub1_594, anIntArray2213[var7],
													0);
											if (null == var31)
												continue;

											anIntArray2248[var7] += var31.method61();
											aClass11Array2217[var7] = var31;
										}

										if (anIntArray2248[var7] < 0) {
											if (anIntArray2216[var7] != 0) {
												var9 = (anIntArray2216[var7] & 255) * 128;
												var10 = (anIntArray2216[var7] >> 16) & 255;
												var11 = (64 + (var10 * 128))
														- Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710;
												if (var11 < 0)
													var11 = -var11;

												var12 = (anIntArray2216[var7] >> 8) & 255;
												var13 = (64 + (128 * var12))
														- Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653;
												if (var13 < 0)
													var13 = -var13;

												var14 = (var13 + var11) - 128;
												if (var14 > var9) {
													anIntArray2248[var7] = -100;
													continue;
												}

												if (var14 < 0)
													var14 = 0;

												var8 = ((var9 - var14) * anInt2199) / var9;
											} else
												var8 = anInt2210;

											if (var8 > 0) {
												final Class109_Sub3_Sub1 var6 = var31.method59()
														.method768(Class49.aClass7_510);
												final Class109_Sub4_Sub2 var41 = Class109_Sub4_Sub2.method787(var6, 100,
														var8);
												var41.method789(anIntArray2214[var7] - 1);
												Class6.aClass109_Sub4_Sub1_81.method743(var41);
											}

											anIntArray2248[var7] = -100;
										}
									} else {
										--anInt2212;

										for (var5 = var7; var5 < anInt2212; ++var5) {
											anIntArray2213[var5] = anIntArray2213[var5 + 1];
											aClass11Array2217[var5] = aClass11Array2217[var5 + 1];
											anIntArray2214[var5] = anIntArray2214[1 + var5];
											anIntArray2248[var5] = anIntArray2248[1 + var5];
											anIntArray2216[var5] = anIntArray2216[var5 + 1];
										}

										--var7;
									}
								}

								if (aBool2209) {
									boolean var39;
									if (Class93.anInt703 != 0)
										var39 = true;
									else
										var39 = Class93.aClass109_Sub4_Sub3_701.method859();

									if (!var39) {
										if ((anInt2207 != 0) && (anInt2208 != -1))
											Class104_Sub1.method644(Class46.aClass104_Sub1_486, anInt2208, 0, anInt2207,
													false);

										aBool2209 = false;
									}
								}

								++anInt2014;
								if (anInt2014 > 750) {
									if (anInt2016 > 0)
										Class59.method275();
									else {
										Class82.method343(40);
										Class109_Sub6.aClass82_962 = Class48.aClass82_506;
										Class48.aClass82_506 = null;
									}
								} else {
									for (var7 = -1; var7 < anInt2087; ++var7) {
										if (var7 == -1)
											var5 = 2047;
										else
											var5 = anIntArray2134[var7];

										final Class109_Sub21_Sub15_Sub3_Sub2 var4 = aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var5];
										if (var4 != null)
											Class37.method162(var4);
									}

									Class47.method239();
									Class80.method335();
									++anInt2043;
									if (anInt2076 != 0) {
										anInt2137 += 20;
										if (anInt2137 >= 400)
											anInt2076 = 0;
									}

									if (null != Class39.aClass109_Sub20_368) {
										++anInt2077;
										if (anInt2077 >= 15) {
											Class71.method315(Class39.aClass109_Sub20_368);
											Class39.aClass109_Sub20_368 = null;
										}
									}

									final Class109_Sub20 var37 = Class109_Sub13.aClass109_Sub20_1052;
									final Class109_Sub20 var33 = Class109_Sub21_Sub15_Sub6.aClass109_Sub20_1837;
									Class109_Sub13.aClass109_Sub20_1052 = null;
									Class109_Sub21_Sub15_Sub6.aClass109_Sub20_1837 = null;
									aClass109_Sub20_2108 = null;
									aBool2149 = false;
									aBool2048 = false;
									anInt2193 = 0;

									while (true) {
										while (Class53.method259() && (anInt2193 < 128))
											if ((anInt2135 >= 2) && Class63.aBoolArray562[82]
													&& (Class3.anInt23 == 66)) {
												final String var36 = Class57_Sub2.method626();
												Class109_Sub21_Sub9.aClipboard1416
														.setContents(new StringSelection(var36), (ClipboardOwner) null);
											} else {
												anIntArray2195[anInt2193] = Class3.anInt23;
												anIntArray2194[anInt2193] = Class66.aChar578;
												++anInt2193;
											}

										var8 = anInt2128;
										var9 = LoginEncoder.anInt524;
										var10 = Class109_Sub21_Sub15_Sub5.anInt1815;
										if (Class108.method412(var8))
											Class33.method153(Class109_Sub20.aClass109_Sub20ArrayArray1150[var8], -1, 0,
													0, var9, var10, 0, 0);

										++anInt2131;

										while (true) {
											Class109_Sub9 var23;
											Class109_Sub20 var24;
											Class109_Sub20 var25;
											do {
												var23 = (Class109_Sub9) aClass126_2170.method453();
												if (null == var23)
													while (true) {
														do {
															var23 = (Class109_Sub9) aClass126_2088.method453();
															if (var23 == null)
																while (true) {
																	do {
																		var23 = (Class109_Sub9) aClass126_2169
																				.method453();
																		if (var23 == null) {
																			Class21.method99();
																			if (null != aClass109_Sub20_2082)
																				Class109_Sub21_Sub2.method669();

																			if (Class21.aClass109_Sub20_202 != null) {
																				Class71.method315(
																						Class21.aClass109_Sub20_202);
																				++anInt2084;
																				if (Class81.anInt636 != 0) {
																					if ((anInt2084 >= 5)
																							&& ((Class81.anInt637 > (5
																									+ anInt2080))
																									|| (Class81.anInt637 < (anInt2080
																											- 5))
																									|| (Class81.anInt638 > (5
																											+ anInt2081))
																									|| (Class81.anInt638 < (anInt2081
																											- 5))))
																						aBool2083 = true;
																				} else {
																					if (aBool2083) {
																						if ((Class21.aClass109_Sub20_202 == Class100.aClass109_Sub20_734)
																								&& (anInt2079 != anInt2225)) {
																							final Class109_Sub20 var42 = Class21.aClass109_Sub20_202;
																							byte var40 = 0;
																							if ((anInt1981 == 1)
																									&& (var42.anInt1151 == 206))
																								var40 = 1;

																							if (var42.anIntArray1149[anInt2225] <= 0)
																								var40 = 0;

																							if (Class28.method129(
																									Class52.method256(
																											var42))) {
																								var13 = anInt2079;
																								var14 = anInt2225;
																								var42.anIntArray1149[var14] = var42.anIntArray1149[var13];
																								var42.anIntArray1264[var14] = var42.anIntArray1264[var13];
																								var42.anIntArray1149[var13] = -1;
																								var42.anIntArray1264[var13] = 0;
																							} else if (var40 == 1) {
																								var13 = anInt2079;
																								var14 = anInt2225;

																								while (var13 != var14)
																									if (var13 > var14) {
																										var42.method647(
																												var13 - 1,
																												var13);
																										--var13;
																									} else if (var13 < var14) {
																										var42.method647(
																												1 + var13,
																												var13);
																										++var13;
																									}
																							} else
																								var42.method647(
																										anInt2225,
																										anInt2079);

																							secureBuffer
																									.method840(6);
																							secureBuffer
																									.method589(
																											anInt2079);
																							secureBuffer
																									.writeShort(
																											anInt2225);
																							secureBuffer
																									.method610(var40);
																							secureBuffer
																									.method596(
																											Class21.aClass109_Sub20_202.anInt1148);
																						}
																					} else if (((anInt2136 == 1)
																							|| Class109_Sub17.method631(
																									anInt2045 - 1))
																							&& (anInt2045 > 2))
																						Class77.method330(anInt2080,
																								anInt2081);
																					else if (anInt2045 > 0)
																						Class62.method287(anInt2080,
																								anInt2081);

																					anInt2077 = 10;
																					Class81.anInt643 = 0;
																					Class21.aClass109_Sub20_202 = null;
																				}
																			}

																			if (Class42.anInt396 != -1) {
																				var11 = Class42.anInt396;
																				var12 = Class42.anInt410;
																				secureBuffer
																						.method840(177);
																				secureBuffer.writeByte(5);
																				secureBuffer.writeShort(
																						var12 + Class113.anInt822);
																				secureBuffer.method590(
																						Class41.anInt375 + var11);
																				secureBuffer
																						.method610(
																								Class63.aBoolArray562[82]
																										? (Class63.aBoolArray562[81]
																												? 2 : 1)
																										: 0);
																				Class42.anInt396 = -1;
																				anInt2073 = Class81.anInt645;
																				anInt2074 = Class81.anInt639;
																				anInt2076 = 1;
																				anInt2137 = 0;
																				anInt2204 = var11;
																				anInt2205 = var12;
																			}

																			if (Class109_Sub13.aClass109_Sub20_1052 != var37) {
																				if (null != var37)
																					Class71.method315(var37);

																				if (null != Class109_Sub13.aClass109_Sub20_1052)
																					Class71.method315(
																							Class109_Sub13.aClass109_Sub20_1052);
																			}

																			if ((Class109_Sub21_Sub15_Sub6.aClass109_Sub20_1837 != var33)
																					&& (anInt2120 == anInt2119)) {
																				if (null != var33)
																					Class71.method315(var33);

																				if (null != Class109_Sub21_Sub15_Sub6.aClass109_Sub20_1837)
																					Class71.method315(
																							Class109_Sub21_Sub15_Sub6.aClass109_Sub20_1837);
																			}

																			if (null != Class109_Sub21_Sub15_Sub6.aClass109_Sub20_1837) {
																				if (anInt2119 < anInt2120) {
																					++anInt2119;
																					if (anInt2119 == anInt2120)
																						Class71.method315(
																								Class109_Sub21_Sub15_Sub6.aClass109_Sub20_1837);
																				}
																			} else if (anInt2119 > 0)
																				--anInt2119;

																			Class31.method135();
																			if (aBool2218)
																				Class109_Sub21_Sub8.method718();

																			for (var11 = 0; var11 < 5; ++var11)
																				++anIntArray2188[var11];

																			var11 = Class55.method263();
																			var12 = Class63.anInt574;
																			if ((var11 > 15000) && (var12 > 15000)) {
																				anInt2016 = 250;
																				Class81.anInt631 = 14500;
																				secureBuffer.method840(95);
																			}

																			++anInt2075;
																			if (anInt2075 > 500) {
																				anInt2075 = 0;
																				var14 = (int) (Math.random() * 8.0D);
																				if ((var14 & 1) == 1)
																					anInt2037 += anInt2032;

																				if ((var14 & 2) == 2)
																					anInt2033 += anInt2034;

																				if ((var14 & 4) == 4)
																					anInt2035 += anInt2036;
																			}

																			if (anInt2037 < -50)
																				anInt2032 = 2;

																			if (anInt2037 > 50)
																				anInt2032 = -2;

																			if (anInt2033 < -55)
																				anInt2034 = 2;

																			if (anInt2033 > 55)
																				anInt2034 = -2;

																			if (anInt2035 < -40)
																				anInt2036 = 1;

																			if (anInt2035 > 40)
																				anInt2036 = -1;

																			++anInt2042;
																			if (anInt2042 > 500) {
																				anInt2042 = 0;
																				var14 = (int) (Math.random() * 8.0D);
																				if ((var14 & 1) == 1)
																					anInt2038 += anInt2039;

																				if ((var14 & 2) == 2)
																					anInt2040 += anInt2072;
																			}

																			if (anInt2038 < -60)
																				anInt2039 = 2;

																			if (anInt2038 > 60)
																				anInt2039 = -2;

																			if (anInt2040 < -20)
																				anInt2072 = 1;

																			if (anInt2040 > 10)
																				anInt2072 = -1;

																			for (Class110_Sub1 var26 = (Class110_Sub1) aClass119_2240
																					.method437(); var26 != null; var26 = (Class110_Sub1) aClass119_2240
																							.method435())
																				if (var26.anInt899 < ((Class109_Sub21_Sub15
																						.method829(552112061) / 1000L)
																						- 5L)) {
																					if (var26.aShort898 > 0)
																						Applet_Sub1.method1053(5, "",
																								var26.aString897
																										+ " has logged in.");

																					if (var26.aShort898 == 0)
																						Applet_Sub1.method1053(5, "",
																								var26.aString897
																										+ " has logged out.");

																					var26.method415();
																				}

																			++anInt2009;
																			if (anInt2009 > 50)
																				secureBuffer
																						.method840(132);

																			try {
																				if ((null != Class48.aClass82_506)
																						&& (secureBuffer.position > 0)) {
																					Class48.aClass82_506.method342(
																							secureBuffer.data,
																							0,
																							secureBuffer.position);
																					secureBuffer.position = 0;
																					anInt2009 = 0;
																					return;
																				}
																			} catch (final IOException var28) {
																				if (anInt2016 > 0)
																					Class59.method275();
																				else {
																					Class82.method343(40);
																					Class109_Sub6.aClass82_962 = Class48.aClass82_506;
																					Class48.aClass82_506 = null;
																				}

																				return;
																			}

																			return;
																		}

																		var24 = var23.aClass109_Sub20_996;
																		if (var24.anInt1147 < 0)
																			break;

																		var25 = Class83.method345(var24.anInt1166);
																	} while ((var25 == null)
																			|| (null == var25.aClass109_Sub20Array1272)
																			|| (var24.anInt1147 >= var25.aClass109_Sub20Array1272.length)
																			|| (var24 != var25.aClass109_Sub20Array1272[var24.anInt1147]));

																	Class109_Sub13.method551(var23, 200000);
																}

															var24 = var23.aClass109_Sub20_996;
															if (var24.anInt1147 < 0)
																break;

															var25 = Class83.method345(var24.anInt1166);
														} while ((null == var25)
																|| (var25.aClass109_Sub20Array1272 == null)
																|| (var24.anInt1147 >= var25.aClass109_Sub20Array1272.length)
																|| (var24 != var25.aClass109_Sub20Array1272[var24.anInt1147]));

														Class109_Sub13.method551(var23, 200000);
													}

												var24 = var23.aClass109_Sub20_996;
												if (var24.anInt1147 < 0)
													break;

												var25 = Class83.method345(var24.anInt1166);
											} while ((null == var25) || (null == var25.aClass109_Sub20Array1272)
													|| (var24.anInt1147 >= var25.aClass109_Sub20Array1272.length)
													|| (var25.aClass109_Sub20Array1272[var24.anInt1147] != var24));

											Class109_Sub13.method551(var23, 200000);
										}
									}
								}
							}
						}
					}
				} else if ((anInt2180 == 40) || (anInt2180 == 45))
					LoginEncoder.method253();

				return;
			}

			var3.aClass104_Sub1_1102.method639(var3.aClass68_1099, (int) var3.aLong802, var3.aByteArray1100, false);
		}
	}

	static {
		aClass49_2176 = Class49.aClass49_508;
		anInt1978 = 0;
		anInt2155 = 0;
		anInt1993 = 0;
		anInt2050 = 0;
		loginStage = 0;
		anInt2177 = 0;
		anInt2004 = 0;
		anInt2005 = 0;
		aClass109_Sub21_Sub15_Sub3_Sub1Array2006 = new Class109_Sub21_Sub15_Sub3_Sub1['\u8000'];
		anInt2007 = 0;
		anIntArray2175 = new int['\u8000'];
		secureBuffer = new Class109_Sub14_Sub1(5000);
		loginBuffer = new Class109_Sub14_Sub1(5000);
		aClass109_Sub14_Sub1_2211 = new Class109_Sub14_Sub1(5000);
		anInt2012 = 0;
		anInt2013 = 0;
		anInt2014 = 0;
		anInt2009 = 0;
		anInt2016 = 0;
		anInt2153 = 0;
		anInt2018 = 0;
		anInt2019 = 0;
		aBool2020 = false;
		anInt2022 = 0;
		anInt2023 = 0;
		anInt2024 = 1;
		anInt2025 = 0;
		anInt2026 = 1;
		anInt2027 = 0;
		aClass138Array2159 = new Class138[4];
		aBool2141 = false;
		anIntArrayArrayArray1996 = new int[4][13][13];
		anIntArray2030 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		anInt2037 = 0;
		anInt2032 = 2;
		anInt2033 = 0;
		anInt2034 = 2;
		anInt2035 = 0;
		anInt2036 = 1;
		anInt2075 = 0;
		anInt2038 = 0;
		anInt2039 = 2;
		anInt2040 = 0;
		anInt2072 = 1;
		anInt2042 = 0;
		anInt2043 = 0;
		anInt1977 = 2301979;
		anInt2046 = 5063219;
		anInt2172 = 3353893;
		anInt2233 = 7759444;
		aBool2049 = false;
		anInt2110 = 0;
		anInt1991 = 128;
		anInt2052 = 0;
		anInt2053 = 0;
		anInt2164 = 0;
		anInt2055 = 0;
		anInt2247 = 0;
		anInt2056 = 0;
		aBool2057 = false;
		anInt2058 = 0;
		anInt2178 = 0;
		anInt2157 = 50;
		anIntArray2148 = new int[anInt2157];
		anIntArray2062 = new int[anInt2157];
		anIntArray2063 = new int[anInt2157];
		anIntArray2064 = new int[anInt2157];
		anIntArray2001 = new int[anInt2157];
		anIntArray2047 = new int[anInt2157];
		anIntArray2067 = new int[anInt2157];
		aStringArray2068 = new String[anInt2157];
		anIntArrayArray2069 = new int[104][104];
		anInt2070 = 0;
		anInt2071 = -1;
		anInt1988 = -1;
		anInt2073 = 0;
		anInt2074 = 0;
		anInt2137 = 0;
		anInt2076 = 0;
		anInt2077 = 0;
		anInt2078 = 0;
		anInt2079 = 0;
		anInt2080 = 0;
		anInt2081 = 0;
		anInt2225 = 0;
		aBool2083 = false;
		anInt2084 = 0;
		anInt2085 = 0;
		aClass109_Sub21_Sub15_Sub3_Sub2Array2086 = new Class109_Sub21_Sub15_Sub3_Sub2[2048];
		anInt2087 = 0;
		anIntArray2134 = new int[2048];
		anInt2089 = 0;
		anIntArray2186 = new int[2048];
		aClass109_Sub14Array2091 = new DataBuffer[2048];
		anInt2092 = -1;
		anInt2154 = 0;
		anInt2028 = 0;
		anIntArray2095 = new int[1000];
		anIntArray2096 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		aStringArray2151 = new String[8];
		aBoolArray1990 = new boolean[8];
		anIntArray2099 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		anInt2100 = -1;
		aClass126ArrayArrayArray2121 = new Class126[4][104][104];
		aClass126_2102 = new Class126();
		aClass126_2197 = new Class126();
		aClass126_2104 = new Class126();
		anIntArray2105 = new int[25];
		anIntArray2106 = new int[25];
		anIntArray2107 = new int[25];
		anInt2136 = 0;
		aBool2109 = false;
		anInt2045 = 0;
		anIntArray2111 = new int[500];
		anIntArray2112 = new int[500];
		anIntArray2113 = new int[500];
		anIntArray2114 = new int[500];
		aStringArray1975 = new String[500];
		aStringArray2123 = new String[500];
		anInt2117 = -1;
		anInt2118 = -1;
		anInt2119 = 0;
		anInt2120 = 50;
		anInt2196 = 0;
		aString2122 = null;
		aBool2171 = false;
		anInt2124 = -1;
		anInt2125 = -1;
		aString2126 = null;
		aString2127 = null;
		anInt2128 = -1;
		aClass116_2129 = new Class116(8);
		anInt2130 = 0;
		anInt1981 = 0;
		aClass109_Sub20_2044 = null;
		anInt2133 = 0;
		anInt2103 = 0;
		anInt2135 = 0;
		anInt2235 = -1;
		aBool1983 = false;
		aBool2138 = false;
		aBool2139 = false;
		aClass109_Sub20_2150 = null;
		aClass109_Sub20_2082 = null;
		aClass109_Sub20_2142 = null;
		anInt2143 = 0;
		anInt2144 = 0;
		aClass109_Sub20_2108 = null;
		aBool2048 = false;
		anInt2219 = -1;
		anInt2167 = -1;
		aBool2149 = false;
		anInt2115 = -1;
		anInt2017 = -1;
		aBool2152 = false;
		anInt2131 = 1;
		anIntArray1992 = new int[32];
		anInt2041 = 0;
		anIntArray2156 = new int[32];
		anInt2145 = 0;
		anIntArray2146 = new int[32];
		anInt2224 = 0;
		anInt2160 = 0;
		anInt2161 = 0;
		anInt2162 = 0;
		anInt2163 = 0;
		anInt2061 = 0;
		anInt2165 = 0;
		anIntArray2166 = new int[2000];
		aStringArray2060 = new String[1000];
		anInt2168 = 0;
		aClass126_2169 = new Class126();
		aClass126_2170 = new Class126();
		aClass126_2088 = new Class126();
		aClass116_1999 = new Class116(512);
		anInt2173 = 0;
		anInt2174 = -2;
		aBoolArray2116 = new boolean[100];
		aBoolArray2002 = new boolean[100];
		aBoolArray2220 = new boolean[100];
		anIntArray2241 = new int[100];
		anIntArray2179 = new int[100];
		anIntArray2222 = new int[100];
		anIntArray2181 = new int[100];
		anInt2182 = 0;
		aLong2228 = 0L;
		aBool2184 = true;
		anInt2185 = 765;
		anInt2231 = 503;
		anIntArray2187 = new int[] { 16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215 };
		anInt2008 = 0;
		anInt2189 = 0;
		aString2190 = "";
		aLongArray2191 = new long[100];
		anInt2192 = 0;
		anInt2193 = 0;
		anIntArray2194 = new int[128];
		anIntArray2195 = new int[128];
		aLong2011 = -1L;
		aString2015 = null;
		aString2198 = null;
		anInt2090 = -1;
		anInt2000 = 0;
		anIntArray2201 = new int[1000];
		anIntArray2202 = new int[1000];
		aClass109_Sub21_Sub14_Sub2Array2203 = new Class109_Sub21_Sub14_Sub2[1000];
		anInt2204 = 0;
		anInt2205 = 0;
		anInt2206 = 0;
		anInt2207 = 255;
		anInt2208 = -1;
		aBool2209 = false;
		anInt2210 = 127;
		anInt2199 = 127;
		anInt2212 = 0;
		anIntArray2213 = new int[50];
		anIntArray2214 = new int[50];
		anIntArray2248 = new int[50];
		anIntArray2216 = new int[50];
		aClass11Array2217 = new Class11[50];
		aBool2218 = false;
		aBoolArray2200 = new boolean[5];
		anIntArray1976 = new int[5];
		anIntArray2221 = new int[5];
		anIntArray2183 = new int[5];
		anIntArray2188 = new int[5];
		aShort2147 = 256;
		aShort2066 = 205;
		aShort2226 = 256;
		aShort2227 = 320;
		aShort1998 = 1;
		aShort2229 = 32767;
		aShort2230 = 1;
		aShort2094 = 32767;
		anInt2232 = 0;
		anInt2097 = 0;
		anInt2234 = 0;
		anInt2101 = 0;
		anInt2236 = 0;
		anInt2237 = 0;
		anInt2238 = 0;
		aClass33Array2239 = new Class33[400];
		aClass119_2240 = new Class119();
		anInt2132 = 0;
		aClass36Array2242 = new Class36[400];
		aClass96_2243 = new Class96();
		anInt2244 = -1;
		anInt2245 = -1;
		aClass134Array2246 = new Class134[8];
	}

	static final void method1063() {
		Class42.aBool430 = false;
		aBool2065 = false;
	}

	static final void method1064(final Class109_Sub13 var0, final boolean var1) {
		final int var2 = var0.anInt1050;
		final int var6 = (int) var0.aLong802;
		var0.method413();
		if (var1)
			Class88.method352(var2);

		for (Class109_Sub24 var4 = (Class109_Sub24) aClass116_1999
				.method432(); null != var4; var4 = (Class109_Sub24) aClass116_1999.method433())
			if (((var4.aLong802 >> 48) & 65535L) == var2)
				var4.method413();

		final Class109_Sub20 var7 = Class83.method345(var6);
		if (null != var7)
			Class71.method315(var7);

		int var5;
		for (var5 = 0; var5 < anInt2045; ++var5)
			if (Class20.method90(anIntArray2113[var5])) {
				if (var5 < (anInt2045 - 1))
					for (int var3 = var5; var3 < (anInt2045 - 1); ++var3) {
						aStringArray1975[var3] = aStringArray1975[1 + var3];
						aStringArray2123[var3] = aStringArray2123[1 + var3];
						anIntArray2113[var3] = anIntArray2113[1 + var3];
						anIntArray2114[var3] = anIntArray2114[var3 + 1];
						anIntArray2111[var3] = anIntArray2111[var3 + 1];
						anIntArray2112[var3] = anIntArray2112[var3 + 1];
					}

				--anInt2045;
			}

		if (anInt2128 != -1) {
			var5 = anInt2128;
			if (Class108.method412(var5))
				Class56.method268(Class109_Sub20.aClass109_Sub20ArrayArray1150[var5], 1);
		}

	}
}
