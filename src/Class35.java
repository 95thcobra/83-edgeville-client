import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

public class Class35 {
	static Class2 aClass2_334;
	public static int[] anIntArray336;
	static Map aMap332 = new HashMap();
	static Class125 aClass125_331 = new Class125(1024);
	static Class121 aClass121_333 = new Class121();
	static int anInt335 = 0;

	public static Class109_Sub21_Sub11 method154(final int var0) {
		Class109_Sub21_Sub11 var1 = (Class109_Sub21_Sub11) Class109_Sub21_Sub11.aClass120_1484.method438(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class109_Sub21_Sub11.aClass104_1481.method387(13, var0);
			var1 = new Class109_Sub21_Sub11();
			var1.anInt1480 = var0;
			if (null != var2)
				var1.method746(new DataBuffer(var2));

			Class109_Sub21_Sub11.aClass120_1484.method440(var1, var0);
			return var1;
		}
	}

	static final void method155(final int var0) {
		final int[] var1 = Class21.aClass109_Sub21_Sub14_Sub2_201.anIntArray1722;
		final int var5 = var1.length;

		int var4;
		for (var4 = 0; var4 < var5; ++var4)
			var1[var4] = 0;

		int var3;
		int var6;
		for (var4 = 1; var4 < 103; ++var4) {
			var6 = 24628 + (2048 * (103 - var4));

			for (var3 = 1; var3 < 103; ++var3) {
				if ((Class27.aByteArrayArrayArray243[var0][var3][var4] & 24) == 0)
					Class2.aClass42_17.method208(var1, var6, 512, var0, var3, var4);

				if ((var0 < 3) && ((Class27.aByteArrayArrayArray243[var0 + 1][var3][var4] & 8) != 0))
					Class2.aClass42_17.method208(var1, var6, 512, 1 + var0, var3, var4);

				var6 += 4;
			}
		}

		var4 = (((238 + (int) (Math.random() * 20.0D)) - 10) << 16)
				+ (((238 + (int) (Math.random() * 20.0D)) - 10) << 8) + ((238 + (int) (Math.random() * 20.0D)) - 10);
		var6 = ((238 + (int) (Math.random() * 20.0D)) - 10) << 16;
		Class21.aClass109_Sub21_Sub14_Sub2_201.method908();

		int var2;
		for (var3 = 1; var3 < 103; ++var3)
			for (var2 = 1; var2 < 103; ++var2) {
				if ((Class27.aByteArrayArrayArray243[var0][var2][var3] & 24) == 0)
					Class52.method254(var0, var2, var3, var4, var6);

				if ((var0 < 3) && ((Class27.aByteArrayArrayArray243[var0 + 1][var2][var3] & 8) != 0))
					Class52.method254(var0 + 1, var2, var3, var4, var6);
			}

		client.anInt2000 = 0;

		for (var3 = 0; var3 < 104; ++var3)
			for (var2 = 0; var2 < 104; ++var2) {
				int var12 = Class2.aClass42_17.method211(Class77.anInt616, var3, var2);
				if (var12 != 0) {
					var12 = (var12 >> 14) & 32767;
					final int var11 = Class28.method128(var12).anInt1451;
					if (var11 >= 0) {
						int var8 = var3;
						int var9 = var2;
						if ((var11 != 22) && (var11 != 29) && (var11 != 34) && (var11 != 36) && (var11 != 46)
								&& (var11 != 47) && (var11 != 48)) {
							final int[][] var7 = client.aClass138Array2159[Class77.anInt616].anIntArrayArray892;

							for (int var13 = 0; var13 < 10; ++var13) {
								final int var10 = (int) (Math.random() * 4.0D);
								if ((var10 == 0) && (var8 > 0) && (var8 > (var3 - 3))
										&& ((var7[var8 - 1][var9] & 19136776) == 0))
									--var8;

								if ((var10 == 1) && (var8 < 103) && (var8 < (3 + var3))
										&& ((var7[1 + var8][var9] & 19136896) == 0))
									++var8;

								if ((var10 == 2) && (var9 > 0) && (var9 > (var2 - 3))
										&& ((var7[var8][var9 - 1] & 19136770) == 0))
									--var9;

								if ((var10 == 3) && (var9 < 103) && (var9 < (var2 + 3))
										&& ((var7[var8][var9 + 1] & 19136800) == 0))
									++var9;
							}
						}

						client.aClass109_Sub21_Sub14_Sub2Array2203[client.anInt2000] = Class77.aClass109_Sub21_Sub14_Sub2Array615[var11];
						client.anIntArray2201[client.anInt2000] = var8;
						client.anIntArray2202[client.anInt2000] = var9;
						++client.anInt2000;
					}
				}
			}

		Class44.aClass8_453.method51();
	}

	static final void method156(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6) {
		if ((var2 >= 1) && (var3 >= 1) && (var2 <= 102) && (var3 <= 102)) {
			if (client.aBool2065 && (Class77.anInt616 != var0))
				return;

			int var16 = 0;
			if (var1 == 0)
				var16 = Class2.aClass42_17.method197(var0, var2, var3);

			if (var1 == 1)
				var16 = Class2.aClass42_17.method198(var0, var2, var3);

			if (var1 == 2)
				var16 = Class2.aClass42_17.method199(var0, var2, var3);

			if (var1 == 3)
				var16 = Class2.aClass42_17.method211(var0, var2, var3);

			int var10;
			if (var16 != 0) {
				var10 = Class2.aClass42_17.method223(var0, var2, var3, var16);
				final int var36 = (var16 >> 14) & 32767;
				final int var35 = var10 & 31;
				final int var37 = (var10 >> 6) & 3;
				Class109_Sub21_Sub10 var13;
				if (var1 == 0) {
					Class2.aClass42_17.method190(var0, var2, var3);
					var13 = Class28.method128(var36);
					if (var13.anInt1438 != 0)
						client.aClass138Array2159[var0].method493(var2, var3, var35, var37, var13.aBool1450);
				}

				if (var1 == 1)
					Class2.aClass42_17.method222(var0, var2, var3);

				if (var1 == 2) {
					Class2.aClass42_17.method191(var0, var2, var3);
					var13 = Class28.method128(var36);
					if (((var2 + var13.anInt1440) > 103) || ((var3 + var13.anInt1440) > 103)
							|| ((var2 + var13.anInt1435) > 103) || ((var13.anInt1435 + var3) > 103))
						return;

					if (var13.anInt1438 != 0)
						client.aClass138Array2159[var0].method492(var2, var3, var13.anInt1440, var13.anInt1435, var37,
								var13.aBool1450);
				}

				if (var1 == 3) {
					Class2.aClass42_17.method192(var0, var2, var3);
					var13 = Class28.method128(var36);
					if (var13.anInt1438 == 1)
						client.aClass138Array2159[var0].method490(var2, var3);
				}
			}

			if (var4 >= 0) {
				var10 = var0;
				if ((var0 < 3) && ((Class27.aByteArrayArrayArray243[1][var2][var3] & 2) == 2))
					var10 = var0 + 1;

				final Class42 var34 = Class2.aClass42_17;
				final Class138 var32 = client.aClass138Array2159[var0];
				final Class109_Sub21_Sub10 var11 = Class28.method128(var4);
				int var19;
				int var24;
				if ((var5 != 1) && (var5 != 3)) {
					var24 = var11.anInt1440;
					var19 = var11.anInt1435;
				} else {
					var24 = var11.anInt1435;
					var19 = var11.anInt1440;
				}

				int var18;
				int var25;
				if ((var2 + var24) <= 104) {
					var18 = var2 + (var24 >> 1);
					var25 = ((1 + var24) >> 1) + var2;
				} else {
					var18 = var2;
					var25 = 1 + var2;
				}

				int var9;
				int var22;
				if ((var19 + var3) <= 104) {
					var22 = var3 + (var19 >> 1);
					var9 = var3 + ((var19 + 1) >> 1);
				} else {
					var22 = var3;
					var9 = 1 + var3;
				}

				final int[][] var26 = Class27.anIntArrayArrayArray251[var10];
				final int var27 = (var26[var25][var9] + var26[var18][var22] + var26[var25][var22]
						+ var26[var18][var9]) >> 2;
				final int var31 = (var24 << 6) + (var2 << 7);
				final int var28 = (var3 << 7) + (var19 << 6);
				int var29 = 1073741824 + (var3 << 7) + var2 + (var4 << 14);
				if (var11.anInt1424 == 0)
					var29 -= Integer.MIN_VALUE;

				int var21 = var6 + (var5 << 6);
				if (var11.anInt1463 == 1)
					var21 += 256;

				Object var12;
				if (var6 == 22) {
					if ((var11.anInt1446 == -1) && (null == var11.anIntArray1464))
						var12 = var11.method734(22, var5, var26, var31, var27, var28);
					else
						var12 = new Class109_Sub21_Sub15_Sub6(var4, 22, var5, var10, var2, var3, var11.anInt1446, true,
								(Class109_Sub21_Sub15) null);

					var34.method182(var0, var2, var3, var27, (Class109_Sub21_Sub15) var12, var29, var21);
					if (var11.anInt1438 == 1)
						var32.method487(var2, var3);
				} else if ((var6 != 10) && (var6 != 11)) {
					if (var6 >= 12) {
						if ((var11.anInt1446 == -1) && (var11.anIntArray1464 == null))
							var12 = var11.method734(var6, var5, var26, var31, var27, var28);
						else
							var12 = new Class109_Sub21_Sub15_Sub6(var4, var6, var5, var10, var2, var3, var11.anInt1446,
									true, (Class109_Sub21_Sub15) null);

						var34.method185(var0, var2, var3, var27, 1, 1, (Class109_Sub21_Sub15) var12, 0, var29, var21);
						if (var11.anInt1438 != 0)
							var32.method486(var2, var3, var24, var19, var11.aBool1450);
					} else if (var6 == 0) {
						if ((var11.anInt1446 == -1) && (var11.anIntArray1464 == null))
							var12 = var11.method734(0, var5, var26, var31, var27, var28);
						else
							var12 = new Class109_Sub21_Sub15_Sub6(var4, 0, var5, var10, var2, var3, var11.anInt1446,
									true, (Class109_Sub21_Sub15) null);

						var34.method183(var0, var2, var3, var27, (Class109_Sub21_Sub15) var12,
								(Class109_Sub21_Sub15) null, Class27.anIntArray248[var5], 0, var29, var21);
						if (var11.anInt1438 != 0)
							var32.method485(var2, var3, var6, var5, var11.aBool1450);
					} else if (var6 == 1) {
						if ((var11.anInt1446 == -1) && (null == var11.anIntArray1464))
							var12 = var11.method734(1, var5, var26, var31, var27, var28);
						else
							var12 = new Class109_Sub21_Sub15_Sub6(var4, 1, var5, var10, var2, var3, var11.anInt1446,
									true, (Class109_Sub21_Sub15) null);

						var34.method183(var0, var2, var3, var27, (Class109_Sub21_Sub15) var12,
								(Class109_Sub21_Sub15) null, Class27.anIntArray249[var5], 0, var29, var21);
						if (var11.anInt1438 != 0)
							var32.method485(var2, var3, var6, var5, var11.aBool1450);
					} else {
						int var8;
						Object var30;
						if (var6 == 2) {
							var8 = (var5 + 1) & 3;
							Object var23;
							if ((var11.anInt1446 == -1) && (var11.anIntArray1464 == null)) {
								var23 = var11.method734(2, var5 + 4, var26, var31, var27, var28);
								var30 = var11.method734(2, var8, var26, var31, var27, var28);
							} else {
								var23 = new Class109_Sub21_Sub15_Sub6(var4, 2, var5 + 4, var10, var2, var3,
										var11.anInt1446, true, (Class109_Sub21_Sub15) null);
								var30 = new Class109_Sub21_Sub15_Sub6(var4, 2, var8, var10, var2, var3, var11.anInt1446,
										true, (Class109_Sub21_Sub15) null);
							}

							var34.method183(var0, var2, var3, var27, (Class109_Sub21_Sub15) var23,
									(Class109_Sub21_Sub15) var30, Class27.anIntArray248[var5],
									Class27.anIntArray248[var8], var29, var21);
							if (var11.anInt1438 != 0)
								var32.method485(var2, var3, var6, var5, var11.aBool1450);
						} else if (var6 == 3) {
							if ((var11.anInt1446 == -1) && (null == var11.anIntArray1464))
								var12 = var11.method734(3, var5, var26, var31, var27, var28);
							else
								var12 = new Class109_Sub21_Sub15_Sub6(var4, 3, var5, var10, var2, var3, var11.anInt1446,
										true, (Class109_Sub21_Sub15) null);

							var34.method183(var0, var2, var3, var27, (Class109_Sub21_Sub15) var12,
									(Class109_Sub21_Sub15) null, Class27.anIntArray249[var5], 0, var29, var21);
							if (var11.anInt1438 != 0)
								var32.method485(var2, var3, var6, var5, var11.aBool1450);
						} else if (var6 == 9) {
							if ((var11.anInt1446 == -1) && (var11.anIntArray1464 == null))
								var12 = var11.method734(var6, var5, var26, var31, var27, var28);
							else
								var12 = new Class109_Sub21_Sub15_Sub6(var4, var6, var5, var10, var2, var3,
										var11.anInt1446, true, (Class109_Sub21_Sub15) null);

							var34.method185(var0, var2, var3, var27, 1, 1, (Class109_Sub21_Sub15) var12, 0, var29,
									var21);
							if (var11.anInt1438 != 0)
								var32.method486(var2, var3, var24, var19, var11.aBool1450);
						} else if (var6 == 4) {
							if ((var11.anInt1446 == -1) && (var11.anIntArray1464 == null))
								var12 = var11.method734(4, var5, var26, var31, var27, var28);
							else
								var12 = new Class109_Sub21_Sub15_Sub6(var4, 4, var5, var10, var2, var3, var11.anInt1446,
										true, (Class109_Sub21_Sub15) null);

							var34.method184(var0, var2, var3, var27, (Class109_Sub21_Sub15) var12,
									(Class109_Sub21_Sub15) null, Class27.anIntArray248[var5], 0, 0, 0, var29, var21);
						} else {
							int var7;
							if (var6 == 5) {
								var8 = 16;
								var7 = var34.method197(var0, var2, var3);
								if (var7 != 0)
									var8 = Class28.method128((var7 >> 14) & 32767).anInt1448;

								if ((var11.anInt1446 == -1) && (null == var11.anIntArray1464))
									var30 = var11.method734(4, var5, var26, var31, var27, var28);
								else
									var30 = new Class109_Sub21_Sub15_Sub6(var4, 4, var5, var10, var2, var3,
											var11.anInt1446, true, (Class109_Sub21_Sub15) null);

								var34.method184(var0, var2, var3, var27, (Class109_Sub21_Sub15) var30,
										(Class109_Sub21_Sub15) null, Class27.anIntArray248[var5], 0,
										Class27.anIntArray250[var5] * var8, var8 * Class27.anIntArray247[var5], var29,
										var21);
							} else if (var6 == 6) {
								var8 = 8;
								var7 = var34.method197(var0, var2, var3);
								if (var7 != 0)
									var8 = Class28.method128((var7 >> 14) & 32767).anInt1448 / 2;

								if ((var11.anInt1446 == -1) && (null == var11.anIntArray1464))
									var30 = var11.method734(4, var5 + 4, var26, var31, var27, var28);
								else
									var30 = new Class109_Sub21_Sub15_Sub6(var4, 4, var5 + 4, var10, var2, var3,
											var11.anInt1446, true, (Class109_Sub21_Sub15) null);

								var34.method184(var0, var2, var3, var27, (Class109_Sub21_Sub15) var30,
										(Class109_Sub21_Sub15) null, 256, var5, Class27.anIntArray252[var5] * var8,
										var8 * Class27.anIntArray253[var5], var29, var21);
							} else if (var6 == 7) {
								var7 = (2 + var5) & 3;
								if ((var11.anInt1446 == -1) && (var11.anIntArray1464 == null))
									var12 = var11.method734(4, 4 + var7, var26, var31, var27, var28);
								else
									var12 = new Class109_Sub21_Sub15_Sub6(var4, 4, 4 + var7, var10, var2, var3,
											var11.anInt1446, true, (Class109_Sub21_Sub15) null);

								var34.method184(var0, var2, var3, var27, (Class109_Sub21_Sub15) var12,
										(Class109_Sub21_Sub15) null, 256, var7, 0, 0, var29, var21);
							} else if (var6 == 8) {
								var8 = 8;
								var7 = var34.method197(var0, var2, var3);
								if (var7 != 0)
									var8 = Class28.method128((var7 >> 14) & 32767).anInt1448 / 2;

								final int var20 = (var5 + 2) & 3;
								Object var33;
								if ((var11.anInt1446 == -1) && (null == var11.anIntArray1464)) {
									var30 = var11.method734(4, 4 + var5, var26, var31, var27, var28);
									var33 = var11.method734(4, var20 + 4, var26, var31, var27, var28);
								} else {
									var30 = new Class109_Sub21_Sub15_Sub6(var4, 4, 4 + var5, var10, var2, var3,
											var11.anInt1446, true, (Class109_Sub21_Sub15) null);
									var33 = new Class109_Sub21_Sub15_Sub6(var4, 4, var20 + 4, var10, var2, var3,
											var11.anInt1446, true, (Class109_Sub21_Sub15) null);
								}

								var34.method184(var0, var2, var3, var27, (Class109_Sub21_Sub15) var30,
										(Class109_Sub21_Sub15) var33, 256, var5, var8 * Class27.anIntArray252[var5],
										Class27.anIntArray253[var5] * var8, var29, var21);
							}
						}
					}
				} else {
					if ((var11.anInt1446 == -1) && (var11.anIntArray1464 == null))
						var12 = var11.method734(10, var5, var26, var31, var27, var28);
					else
						var12 = new Class109_Sub21_Sub15_Sub6(var4, 10, var5, var10, var2, var3, var11.anInt1446, true,
								(Class109_Sub21_Sub15) null);

					if (var12 != null)
						var34.method185(var0, var2, var3, var27, var24, var19, (Class109_Sub21_Sub15) var12,
								var6 == 11 ? 256 : 0, var29, var21);

					if (var11.anInt1438 != 0)
						var32.method486(var2, var3, var24, var19, var11.aBool1450);
				}
			}
		}

	}

	static final void method157(final String var0, final boolean var1) {
		final byte var2 = 4;
		final int var3 = var2 + 6;
		final int var4 = var2 + 6;
		final int var5 = Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503.method1011(var0, 250);
		final int var6 = Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503.method1012(var0, 250) * 13;
		Class109_Sub21_Sub14.method773(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 0);
		Class109_Sub21_Sub14.method775(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215);
		Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503.method1017(var0, var3, var4, var5, var6, 16777215, -1,
				1, 1, 0);
		Class44.method231(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2);
		if (var1)
			try {
				final Graphics var7 = Class109_Sub21_Sub10.aCanvas1472.getGraphics();
				Class44.aClass8_453.method50(var7, 0, 0, (byte) 1);
			} catch (final Exception var8) {
				Class109_Sub21_Sub10.aCanvas1472.repaint();
			}
		else
			Class20.method96(var3, var4, var5, var6);

	}

	public static String method158(final String var0) {
		final int var1 = var0.length();
		final char[] var5 = new char[var1];
		byte var4 = 2;

		for (int var2 = 0; var2 < var1; ++var2) {
			char var3 = var0.charAt(var2);
			if (var4 == 0)
				var3 = Character.toLowerCase(var3);
			else if ((var4 == 2) || Character.isUpperCase(var3))
				var3 = Class9.method54(var3);

			if (Character.isLetter(var3))
				var4 = 0;
			else if ((var3 != 46) && (var3 != 63) && (var3 != 33)) {
				if (Character.isSpaceChar(var3)) {
					if (var4 != 2)
						var4 = 1;
				} else
					var4 = 1;
			} else
				var4 = 2;

			var5[var2] = var3;
		}

		return new String(var5);
	}
}
