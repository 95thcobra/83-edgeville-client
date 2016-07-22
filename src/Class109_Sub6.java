public class Class109_Sub6 extends Class109 {
	static Class82 aClass82_962;
	int anInt965;
	int anInt963;
	int[] anIntArray966;
	int[][] anIntArrayArray964;

	public static int method521(final int var0) {
		return (var0 >> 11) & 63;
	}

	Class109_Sub6(final int var1, final byte[] var2) {
		anInt965 = var1;
		final DataBuffer var3 = new DataBuffer(var2);
		anInt963 = var3.method564();
		anIntArray966 = new int[anInt963];
		anIntArrayArray964 = new int[anInt963][];

		int var5;
		for (var5 = 0; var5 < anInt963; ++var5)
			anIntArray966[var5] = var3.method564();

		for (var5 = 0; var5 < anInt963; ++var5)
			anIntArrayArray964[var5] = new int[var3.method564()];

		for (var5 = 0; var5 < anInt963; ++var5)
			for (int var4 = 0; var4 < anIntArrayArray964[var5].length; ++var4)
				anIntArrayArray964[var5][var4] = var3.method564();

	}

	public static Class109_Sub21_Sub1 method522(final int var0) {
		Class109_Sub21_Sub1 var1 = (Class109_Sub21_Sub1) Class109_Sub21_Sub1.aClass120_1292.method438(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class109_Sub21_Sub1.aClass104_1294.method387(1, var0);
			var1 = new Class109_Sub21_Sub1();
			if (null != var2)
				var1.method662(new DataBuffer(var2), var0);

			var1.method661();
			Class109_Sub21_Sub1.aClass120_1292.method440(var1, var0);
			return var1;
		}
	}

	static final void method523(final Class109_Sub21_Sub15_Sub3 var0, final int var1, final int var2, final int var3) {
		if ((var0 != null) && var0.method897(1969071428)) {
			Class109_Sub21_Sub13 var4;
			if (var0 instanceof Class109_Sub21_Sub15_Sub3_Sub1) {
				var4 = ((Class109_Sub21_Sub15_Sub3_Sub1) var0).aClass109_Sub21_Sub13_1925;
				if (var4.anIntArray1516 != null)
					var4 = var4.method763();

				if (var4 == null)
					return;
			}

			int var6;
			if (var1 < client.anInt2087) {
				var6 = 30;
				final Class109_Sub21_Sub15_Sub3_Sub2 var5 = (Class109_Sub21_Sub15_Sub3_Sub2) var0;
				if (var5.aBool1928)
					return;

				if ((var5.anInt1930 != -1) || (var5.anInt1942 != -1)) {
					Class109_Sub21_Sub12.method753(var0, 15 + var0.anInt1652);
					if (client.anInt2071 > -1) {
						if (var5.anInt1930 != -1) {
							Class38.aClass109_Sub21_Sub14_Sub2Array359[var5.anInt1930]
									.method919((var2 + client.anInt2071) - 12, (client.anInt1988 + var3) - var6);
							var6 += 25;
						}

						if (var5.anInt1942 != -1) {
							Class24.aClass109_Sub21_Sub14_Sub2Array221[var5.anInt1942]
									.method919((var2 + client.anInt2071) - 12, (var3 + client.anInt1988) - var6);
							var6 += 25;
						}
					}
				}

				if ((var1 >= 0) && (client.anInt2158 == 10) && (client.anInt2140 == client.anIntArray2134[var1])) {
					Class109_Sub21_Sub12.method753(var0, var0.anInt1652 + 15);
					if (client.anInt2071 > -1)
						Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub2Array1332[1]
								.method919((var2 + client.anInt2071) - 12, (var3 + client.anInt1988) - var6);
				}
			} else {
				var4 = ((Class109_Sub21_Sub15_Sub3_Sub1) var0).aClass109_Sub21_Sub13_1925;
				if (var4.anIntArray1516 != null)
					var4 = var4.method763();

				if ((var4.anInt1533 >= 0) && (var4.anInt1533 < Class24.aClass109_Sub21_Sub14_Sub2Array221.length)) {
					Class109_Sub21_Sub12.method753(var0, 15 + var0.anInt1652);
					if (client.anInt2071 > -1)
						Class24.aClass109_Sub21_Sub14_Sub2Array221[var4.anInt1533]
								.method919((var2 + client.anInt2071) - 12, (client.anInt1988 + var3) - 30);
				}

				if ((client.anInt2158 == 1) && (client.anInt1989 == client.anIntArray2175[var1 - client.anInt2087])
						&& ((client.anInt1979 % 20) < 10)) {
					Class109_Sub21_Sub12.method753(var0, var0.anInt1652 + 15);
					if (client.anInt2071 > -1)
						Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub2Array1332[0]
								.method919((var2 + client.anInt2071) - 12, (var3 + client.anInt1988) - 28);
				}
			}

			if ((var0.aString1702 != null)
					&& ((var1 >= client.anInt2087)
							|| (!var0.aBool1667
									&& ((client.anInt2008 == 4)
											|| (!var0.aBool1666 && ((client.anInt2008 == 0) || (client.anInt2008 == 3)
													|| ((client.anInt2008 == 1) && Applet_Sub1.method1054(
															((Class109_Sub21_Sub15_Sub3_Sub2) var0).aString1931,
															false)))))))) {
				Class109_Sub21_Sub12.method753(var0, var0.anInt1652);
				if ((client.anInt2071 > -1) && (client.anInt2178 < client.anInt2157)) {
					client.anIntArray2064[client.anInt2178] = Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334
							.method1010(var0.aString1702) / 2;
					client.anIntArray2063[client.anInt2178] = Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.anInt1907;
					client.anIntArray2148[client.anInt2178] = client.anInt2071;
					client.anIntArray2062[client.anInt2178] = client.anInt1988;
					client.anIntArray2001[client.anInt2178] = var0.anInt1669;
					client.anIntArray2047[client.anInt2178] = var0.anInt1670;
					client.anIntArray2067[client.anInt2178] = var0.anInt1668;
					client.aStringArray2068[client.anInt2178] = var0.aString1702;
					++client.anInt2178;
				}
			}

			if (var0.anInt1674 > client.anInt1979) {
				Class109_Sub21_Sub12.method753(var0, var0.anInt1652 + 15);
				if (client.anInt2071 > -1) {
					if (var1 < client.anInt2087)
						var6 = 30;
					else {
						final Class109_Sub21_Sub13 var8 = ((Class109_Sub21_Sub15_Sub3_Sub1) var0).aClass109_Sub21_Sub13_1925;
						var6 = var8.anInt1535;
					}

					int var7 = (var0.anInt1675 * var6) / var0.anInt1662;
					if (var7 > var6)
						var7 = var6;
					else if ((var7 == 0) && (var0.anInt1675 > 0))
						var7 = 1;

					Class109_Sub21_Sub14.method773((var2 + client.anInt2071) - (var6 / 2),
							(client.anInt1988 + var3) - 3, var7, 5, '\uff00');
					Class109_Sub21_Sub14.method773(var7 + ((var2 + client.anInt2071) - (var6 / 2)),
							(var3 + client.anInt1988) - 3, var6 - var7, 5, 16711680);
				}
			}

			for (var6 = 0; var6 < 4; ++var6)
				if (var0.anIntArray1673[var6] > client.anInt1979) {
					Class109_Sub21_Sub12.method753(var0, var0.anInt1652 / 2);
					if (client.anInt2071 > -1) {
						if (var6 == 1)
							client.anInt1988 -= 20;

						if (var6 == 2) {
							client.anInt2071 -= 15;
							client.anInt1988 -= 10;
						}

						if (var6 == 3) {
							client.anInt2071 += 15;
							client.anInt1988 -= 10;
						}

						Class37.aClass109_Sub21_Sub14_Sub2Array358[var0.anIntArray1672[var6]]
								.method919((var2 + client.anInt2071) - 12, (client.anInt1988 + var3) - 12);
						client.aClass109_Sub21_Sub14_Sub4_Sub1_2021.method1016(
								Integer.toString(var0.anIntArray1671[var6]), (client.anInt2071 + var2) - 1,
								3 + client.anInt1988 + var3, 16777215, 0);
					}
				}

		}
	}
}
