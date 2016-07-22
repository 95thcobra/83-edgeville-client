import java.io.File;

public final class Class38 {
	static Class109_Sub21_Sub14_Sub2[] aClass109_Sub21_Sub14_Sub2Array359;
	boolean aBool363 = true;
	int anInt362;
	int anInt360;
	int anInt361;
	int anInt366;
	int anInt364;
	int anInt365;

	public static String method164(final CharSequence var0) {
		long var1 = 0L;
		final int var5 = var0.length();

		for (int var4 = 0; var4 < var5; ++var4) {
			var1 *= 37L;
			final char var6 = var0.charAt(var4);
			if ((var6 >= 65) && (var6 <= 90))
				var1 += (var6 + 1) - 65;
			else if ((var6 >= 97) && (var6 <= 122))
				var1 += (var6 + 1) - 97;
			else if ((var6 >= 48) && (var6 <= 57))
				var1 += (27 + var6) - 48;

			if (var1 >= 177917621779460413L)
				break;
		}

		while ((0L == (var1 % 37L)) && (0L != var1))
			var1 /= 37L;

		String var3 = Class67.method302(var1);
		if (null == var3)
			var3 = "";

		return var3;
	}

	static final void method165(final Class109_Sub20[] var0, final int var1) {
		for (final Class109_Sub20 element : var0) {
			final Class109_Sub20 var3 = element;
			if ((null != var3) && (var1 == var3.anInt1166) && (!var3.aBool1146 || !Class104.method408(var3))) {
				int var4;
				if (var3.anInt1229 == 0) {
					if (!var3.aBool1146 && Class104.method408(var3) && (Class109_Sub13.aClass109_Sub20_1052 != var3))
						continue;

					method165(var0, var3.anInt1148);
					if (null != var3.aClass109_Sub20Array1272)
						method165(var3.aClass109_Sub20Array1272, var3.anInt1148);

					final Class109_Sub13 var7 = (Class109_Sub13) client.aClass116_2129.method429(var3.anInt1148);
					if (null != var7) {
						var4 = var7.anInt1050;
						if (Class108.method412(var4))
							method165(Class109_Sub20.aClass109_Sub20ArrayArray1150[var4], -1);
					}
				}

				if (var3.anInt1229 == 6) {
					if ((var3.anInt1192 != -1) || (var3.anInt1158 != -1)) {
						final boolean var6 = Class1.method13(var3);
						if (var6)
							var4 = var3.anInt1158;
						else
							var4 = var3.anInt1192;

						if (var4 != -1) {
							final Class109_Sub21_Sub7 var5 = Class109_Sub21_Sub18.method849(var4, 1133820674);

							for (var3.anInt1268 += client.anInt2043; var3.anInt1268 > var5.anIntArray1396[var3.anInt1267]; Class71
									.method315(var3)) {
								var3.anInt1268 -= var5.anIntArray1396[var3.anInt1267];
								++var3.anInt1267;
								if (var3.anInt1267 >= var5.anIntArray1401.length) {
									var3.anInt1267 -= var5.anInt1395;
									if ((var3.anInt1267 < 0) || (var3.anInt1267 >= var5.anIntArray1401.length))
										var3.anInt1267 = 0;
								}
							}
						}
					}

					if ((var3.anInt1201 != 0) && !var3.aBool1146) {
						int var8 = var3.anInt1201 >> 16;
						var4 = (var3.anInt1201 << 16) >> 16;
						var8 *= client.anInt2043;
						var4 *= client.anInt2043;
						var3.anInt1273 = (var8 + var3.anInt1273) & 2047;
						var3.anInt1193 = (var4 + var3.anInt1193) & 2047;
						Class71.method315(var3);
					}
				}
			}
		}

	}

	public static int method166(int var0) {
		var0 = ((var0 >>> 1) & 1431655765) + (var0 & 1431655765);
		var0 = (var0 & 858993459) + ((var0 >>> 2) & 858993459);
		var0 = (var0 + (var0 >>> 4)) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	static final void method167(final int var0, final int var1, final int var2, final int var3) {
		client.anInt2178 = 0;
		boolean var9 = false;
		int var10 = -1;

		int var7;
		for (var7 = -1; var7 < (client.anInt2007 + client.anInt2087); ++var7) {
			Object var4;
			if (var7 == -1)
				var4 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590;
			else if (var7 < client.anInt2087) {
				var4 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[client.anIntArray2134[var7]];
				if (client.anIntArray2134[var7] == client.anInt2100) {
					var9 = true;
					var10 = var7;
					continue;
				}
			} else
				var4 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[client.anIntArray2175[var7 - client.anInt2087]];

			Class109_Sub6.method523((Class109_Sub21_Sub15_Sub3) var4, var7, var0, var1);
		}

		if (var9)
			Class109_Sub6.method523(client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[client.anInt2100], var10, var0,
					var1);

		for (var7 = 0; var7 < client.anInt2178; ++var7) {
			final int var11 = client.anIntArray2148[var7];
			int var8 = client.anIntArray2062[var7];
			final int var12 = client.anIntArray2064[var7];
			final int var13 = client.anIntArray2063[var7];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var15 = 0; var15 < var7; ++var15)
					if (((2 + var8) > (client.anIntArray2062[var15] - client.anIntArray2063[var15]))
							&& ((var8 - var13) < (client.anIntArray2062[var15] + 2))
							&& ((var11 - var12) < (client.anIntArray2148[var15] + client.anIntArray2064[var15]))
							&& ((var12 + var11) > (client.anIntArray2148[var15] - client.anIntArray2064[var15]))
							&& ((client.anIntArray2062[var15] - client.anIntArray2063[var15]) < var8)) {
						var8 = client.anIntArray2062[var15] - client.anIntArray2063[var15];
						var14 = true;
					}
			}

			client.anInt2071 = client.anIntArray2148[var7];
			client.anInt1988 = client.anIntArray2062[var7] = var8;
			final String var16 = client.aStringArray2068[var7];
			if (client.anInt2130 == 0) {
				int var6 = 16776960;
				if (client.anIntArray2001[var7] < 6)
					var6 = client.anIntArray2187[client.anIntArray2001[var7]];

				if (client.anIntArray2001[var7] == 6)
					var6 = (client.anInt2070 % 20) < 10 ? 16711680 : 16776960;

				if (client.anIntArray2001[var7] == 7)
					var6 = (client.anInt2070 % 20) < 10 ? 255 : '\uffff';

				if (client.anIntArray2001[var7] == 8)
					var6 = (client.anInt2070 % 20) < 10 ? '\ub000' : 8454016;

				int var5;
				if (client.anIntArray2001[var7] == 9) {
					var5 = 150 - client.anIntArray2067[var7];
					if (var5 < 50)
						var6 = (var5 * 1280) + 16711680;
					else if (var5 < 100)
						var6 = 16776960 - ((var5 - 50) * 327680);
					else if (var5 < 150)
						var6 = ((var5 - 100) * 5) + '\uff00';
				}

				if (client.anIntArray2001[var7] == 10) {
					var5 = 150 - client.anIntArray2067[var7];
					if (var5 < 50)
						var6 = (5 * var5) + 16711680;
					else if (var5 < 100)
						var6 = 16711935 - (327680 * (var5 - 50));
					else if (var5 < 150)
						var6 = (((var5 - 100) * 327680) + 255) - ((var5 - 100) * 5);
				}

				if (client.anIntArray2001[var7] == 11) {
					var5 = 150 - client.anIntArray2067[var7];
					if (var5 < 50)
						var6 = 16777215 - (var5 * 327685);
					else if (var5 < 100)
						var6 = '\uff00' + ((var5 - 50) * 327685);
					else if (var5 < 150)
						var6 = 16777215 - (327680 * (var5 - 100));
				}

				if (client.anIntArray2047[var7] == 0)
					Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1016(var16, client.anInt2071 + var0,
							client.anInt1988 + var1, var6, 0);

				if (client.anIntArray2047[var7] == 1)
					Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1018(var16, client.anInt2071 + var0,
							var1 + client.anInt1988, var6, 0, client.anInt2070);

				if (client.anIntArray2047[var7] == 2)
					Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1019(var16, client.anInt2071 + var0,
							var1 + client.anInt1988, var6, 0, client.anInt2070);

				if (client.anIntArray2047[var7] == 3)
					Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1032(var16, client.anInt2071 + var0,
							client.anInt1988 + var1, var6, 0, client.anInt2070, 150 - client.anIntArray2067[var7]);

				if (client.anIntArray2047[var7] == 4) {
					var5 = ((150 - client.anIntArray2067[var7])
							* (Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1010(var16) + 100)) / 150;
					Class109_Sub21_Sub14.method769((var0 + client.anInt2071) - 50, var1, client.anInt2071 + var0 + 50,
							var1 + var3);
					Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1014(var16,
							(50 + var0 + client.anInt2071) - var5, client.anInt1988 + var1, var6, 0);
					Class109_Sub21_Sub14.method785(var0, var1, var0 + var2, var1 + var3);
				}

				if (client.anIntArray2047[var7] == 5) {
					var5 = 150 - client.anIntArray2067[var7];
					int var17 = 0;
					if (var5 < 25)
						var17 = var5 - 25;
					else if (var5 > 125)
						var17 = var5 - 125;

					Class109_Sub21_Sub14.method769(var0,
							(client.anInt1988 + var1)
									- Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.anInt1907 - 1,
							var2 + var0, var1 + client.anInt1988 + 5);
					Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1016(var16, client.anInt2071 + var0,
							var17 + var1 + client.anInt1988, var6, 0);
					Class109_Sub21_Sub14.method785(var0, var1, var2 + var0, var3 + var1);
				}
			} else
				Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1016(var16, client.anInt2071 + var0,
						client.anInt1988 + var1, 16776960, 0);
		}

	}

	Class38(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final boolean var7) {
		anInt362 = var1;
		anInt360 = var2;
		anInt361 = var3;
		anInt366 = var4;
		anInt364 = var5;
		anInt365 = var6;
		aBool363 = var7;
	}

	static void method168(final File var0) {
		Class54.aFile536 = var0;
		if (!Class54.aFile536.exists())
			throw new RuntimeException("");
		else
			Class54.aBool537 = true;
	}

	static void method169(final int var0) {
		Class35.aClass2_334 = new Class2();
		Class35.aClass2_334.anInt16 = client.anIntArray2111[var0];
		Class35.aClass2_334.anInt12 = client.anIntArray2112[var0];
		Class35.aClass2_334.anInt13 = client.anIntArray2113[var0];
		Class35.aClass2_334.anInt14 = client.anIntArray2114[var0];
		Class35.aClass2_334.aString15 = client.aStringArray1975[var0];
	}

	public static int method170(final byte[] var0, final int var1) {
		int var2 = -1;

		for (int var3 = 0; var3 < var1; ++var3)
			var2 = (var2 >>> 8) ^ DataBuffer.anIntArray1056[(var2 ^ var0[var3]) & 255];

		var2 = ~var2;
		return var2;
	}
}
