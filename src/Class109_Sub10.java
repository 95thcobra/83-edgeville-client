import java.awt.Image;

public final class Class109_Sub10 extends Class109 {
	int anInt1011;
	int anInt1012;
	int anInt1013;
	int anInt1014;
	int anInt1017;
	int anInt1021;
	Class109_Sub4_Sub2 aClass109_Sub4_Sub2_1022;
	Class109_Sub21_Sub10 aClass109_Sub21_Sub10_1023;
	static int[] anIntArray1024;
	protected static Image anImage1025;
	int anInt1016;
	int anInt1019;
	int anInt1018;
	int anInt1009;
	int[] anIntArray1015;
	Class109_Sub4_Sub2 aClass109_Sub4_Sub2_1010;
	static Class126 aClass126_1020 = new Class126();

	void method533() {
		final int var1 = anInt1016;
		final Class109_Sub21_Sub10 var2 = aClass109_Sub21_Sub10_1023.method732();
		if (var2 != null) {
			anInt1016 = var2.anInt1447;
			anInt1019 = var2.anInt1449 * 128;
			anInt1018 = var2.anInt1469;
			anInt1009 = var2.anInt1470;
			anIntArray1015 = var2.anIntArray1471;
		} else {
			anInt1016 = -1;
			anInt1019 = 0;
			anInt1018 = 0;
			anInt1009 = 0;
			anIntArray1015 = null;
		}

		if ((var1 != anInt1016) && (aClass109_Sub4_Sub2_1010 != null)) {
			Class6.aClass109_Sub4_Sub1_81.method739(aClass109_Sub4_Sub2_1010);
			aClass109_Sub4_Sub2_1010 = null;
		}

	}

	public static String method534(final CharSequence var0) {
		final int var1 = var0.length();
		final char[] var3 = new char[var1];

		for (int var2 = 0; var2 < var1; ++var2)
			var3[var2] = 42;

		final String var4 = new String(var3);
		return var4;
	}

	static final void method535(final long var0) {
		try {
			Thread.sleep(var0);
		} catch (final InterruptedException var3) {
			;
		}

	}

	static void method536(final int var0, final int var1, final int var2, final int var3) {
		Class109_Sub12 var4 = (Class109_Sub12) Class109_Sub12.aClass116_1043.method429(var0);
		if (var4 == null) {
			var4 = new Class109_Sub12();
			Class109_Sub12.aClass116_1043.method430(var4, var0);
		}

		if (var4.anIntArray1040.length <= var1) {
			final int[] var6 = new int[var1 + 1];
			final int[] var7 = new int[var1 + 1];

			int var5;
			for (var5 = 0; var5 < var4.anIntArray1040.length; ++var5) {
				var6[var5] = var4.anIntArray1040[var5];
				var7[var5] = var4.anIntArray1041[var5];
			}

			for (var5 = var4.anIntArray1040.length; var5 < var1; ++var5) {
				var6[var5] = -1;
				var7[var5] = 0;
			}

			var4.anIntArray1040 = var6;
			var4.anIntArray1041 = var7;
		}

		var4.anIntArray1040[var1] = var2;
		var4.anIntArray1041[var1] = var3;
	}

	public static final void method537(final int var0, final boolean var1, final int var2) {
		if ((var0 >= 8000) && (var0 <= '\ubb80')) {
			Class122.anInt848 = var0;
			Class31.aBool308 = var1;
			Class4.anInt43 = var2;
		} else
			throw new IllegalArgumentException();
	}

	static final void method538(final Class109_Sub20[] var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6, final int var7, final int var8) {
		Class109_Sub21_Sub14.method785(var2, var3, var4, var5);
		Class109_Sub21_Sub14_Sub3.method973();

		for (final Class109_Sub20 element : var0) {
			final Class109_Sub20 var13 = element;
			if ((null != var13) && ((var1 == var13.anInt1166)
					|| ((var1 == -1412584499) && (client.aClass109_Sub20_2082 == var13)))) {
				int var20;
				if (var8 == -1) {
					client.anIntArray2241[client.anInt2173] = var6 + var13.anInt1160;
					client.anIntArray2179[client.anInt2173] = var7 + var13.anInt1161;
					client.anIntArray2222[client.anInt2173] = var13.anInt1162;
					client.anIntArray2181[client.anInt2173] = var13.anInt1163;
					var20 = ++client.anInt2173 - 1;
				} else
					var20 = var8;

				var13.anInt1172 = var20;
				var13.anInt1246 = client.anInt1979;
				if (!var13.aBool1146 || !Class104.method408(var13)) {
					int var11;
					if (var13.anInt1151 > 0) {
						var11 = var13.anInt1151;
						if (var11 == 324) {
							if (client.anInt2244 == -1) {
								client.anInt2244 = var13.anInt1164;
								client.anInt2245 = var13.anInt1181;
							}

							if (client.aClass96_2243.aBool717)
								var13.anInt1164 = client.anInt2244;
							else
								var13.anInt1164 = client.anInt2245;
						} else if (var11 == 325) {
							if (client.anInt2244 == -1) {
								client.anInt2244 = var13.anInt1164;
								client.anInt2245 = var13.anInt1181;
							}

							if (client.aClass96_2243.aBool717)
								var13.anInt1164 = client.anInt2245;
							else
								var13.anInt1164 = client.anInt2244;
						} else if (var11 == 327) {
							var13.anInt1273 = 150;
							var13.anInt1193 = (int) (Math.sin(client.anInt1979 / 40.0D) * 256.0D) & 2047;
							var13.anInt1188 = 5;
							var13.anInt1189 = 0;
						} else if (var11 == 328) {
							var13.anInt1273 = 150;
							var13.anInt1193 = (int) (Math.sin(client.anInt1979 / 40.0D) * 256.0D) & 2047;
							var13.anInt1188 = 5;
							var13.anInt1189 = 1;
						}
					}

					var11 = var13.anInt1160 + var6;
					int var25 = var7 + var13.anInt1161;
					int var32 = var13.anInt1177;
					int var29;
					int var31;
					if (var13 == client.aClass109_Sub20_2082) {
						if ((var1 != -1412584499) && !var13.aBool1275) {
							Class27.aClass109_Sub20Array258 = var0;
							Class21.anInt203 = var6;
							Class27.anInt261 = var7;
							continue;
						}

						if (client.aBool2152 && client.aBool2048) {
							var31 = Class81.anInt637;
							var29 = Class81.anInt638;
							var31 -= client.anInt2143;
							var29 -= client.anInt2144;
							if (var31 < client.anInt2219)
								var31 = client.anInt2219;

							if ((var31 + var13.anInt1162) > (client.aClass109_Sub20_2142.anInt1162 + client.anInt2219))
								var31 = (client.anInt2219 + client.aClass109_Sub20_2142.anInt1162) - var13.anInt1162;

							if (var29 < client.anInt2167)
								var29 = client.anInt2167;

							if ((var13.anInt1163 + var29) > (client.aClass109_Sub20_2142.anInt1163 + client.anInt2167))
								var29 = (client.anInt2167 + client.aClass109_Sub20_2142.anInt1163) - var13.anInt1163;

							var11 = var31;
							var25 = var29;
						}

						if (!var13.aBool1275)
							var32 = 128;
					}

					int var24;
					int var26;
					int var28;
					int var33;
					int var34;
					int var36;
					if (var13.anInt1229 == 2) {
						var31 = var2;
						var29 = var3;
						var33 = var4;
						var34 = var5;
					} else if (var13.anInt1229 == 9) {
						var24 = var11;
						var28 = var25;
						var26 = var13.anInt1162 + var11;
						var36 = var25 + var13.anInt1163;
						if (var26 < var11) {
							var24 = var26;
							var26 = var11;
						}

						if (var36 < var25) {
							var28 = var36;
							var36 = var25;
						}

						++var26;
						++var36;
						var31 = var24 > var2 ? var24 : var2;
						var29 = var28 > var3 ? var28 : var3;
						var33 = var26 < var4 ? var26 : var4;
						var34 = var36 < var5 ? var36 : var5;
					} else {
						var24 = var13.anInt1162 + var11;
						var28 = var13.anInt1163 + var25;
						var31 = var11 > var2 ? var11 : var2;
						var29 = var25 > var3 ? var25 : var3;
						var33 = var24 < var4 ? var24 : var4;
						var34 = var28 < var5 ? var28 : var5;
					}

					if (!var13.aBool1146 || ((var31 < var33) && (var29 < var34))) {
						int var9;
						int var10;
						int var18;
						int var19;
						int var21;
						int var22;
						int var30;
						int var38;
						int var39;
						int var41;
						int var43;
						int var44;
						if (var13.anInt1151 != 0) {
							if (var13.anInt1151 == 1336) {
								if (client.aBool1986) {
									var25 += 15;
									Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503.method1015(
											"Fps:" + Applet_Sub1.anInt1956, var11 + var13.anInt1162, var25, 16776960,
											-1);
									var25 += 15;
									final Runtime var57 = Runtime.getRuntime();
									var28 = (int) ((var57.totalMemory() - var57.freeMemory()) / 1024L);
									var26 = 16776960;
									if ((var28 > '\u8000') && client.aBool2065)
										var26 = 16711680;

									if ((var28 > 65536) && !client.aBool2065)
										var26 = 16711680;

									Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503.method1015(
											"Mem:" + var28 + "k", var11 + var13.anInt1162, var25, var26, -1);
									var25 += 15;
								}
								continue;
							}

							if (var13.anInt1151 == 1337) {
								client.anInt2117 = var11;
								client.anInt2118 = var25;
								var26 = var13.anInt1162;
								var36 = var13.anInt1163;
								++client.anInt2070;
								Class44.method228(Class3.aClass3_19);
								boolean var59 = false;
								if (client.anInt2100 >= 0)
									for (var18 = 0; var18 < client.anInt2087; ++var18)
										if (client.anIntArray2134[var18] == client.anInt2100) {
											var59 = true;
											break;
										}

								if (var59)
									Class44.method228(Class3.aClass3_24);

								Class26.method117(true);
								Class44.method228(var59 ? Class3.aClass3_21 : Class3.aClass3_20);
								Class26.method117(false);

								for (Class109_Sub21_Sub15_Sub5 var54 = (Class109_Sub21_Sub15_Sub5) client.aClass126_2197
										.method458(); var54 != null; var54 = (Class109_Sub21_Sub15_Sub5) client.aClass126_2197
												.method449())
									if ((var54.anInt1806 == Class77.anInt616)
											&& (client.anInt1979 <= var54.anInt1795)) {
										if (client.anInt1979 >= var54.anInt1814) {
											if (var54.anInt1798 > 0) {
												final Class109_Sub21_Sub15_Sub3_Sub1 var14 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var54.anInt1798
														- 1];
												if ((var14 != null) && (var14.anInt1710 >= 0)
														&& (var14.anInt1710 < 13312) && (var14.anInt1653 >= 0)
														&& (var14.anInt1653 < 13312))
													var54.method958(var14.anInt1710, var14.anInt1653,
															Class41.method174(var14.anInt1710, var14.anInt1653,
																	var54.anInt1806) - var54.anInt1788,
															client.anInt1979);
											}

											if (var54.anInt1798 < 0) {
												var19 = -var54.anInt1798 - 1;
												Class109_Sub21_Sub15_Sub3_Sub2 var46;
												if (var19 == client.anInt2092)
													var46 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590;
												else
													var46 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var19];

												if ((var46 != null) && (var46.anInt1710 >= 0)
														&& (var46.anInt1710 < 13312) && (var46.anInt1653 >= 0)
														&& (var46.anInt1653 < 13312))
													var54.method958(var46.anInt1710, var46.anInt1653,
															Class41.method174(var46.anInt1710, var46.anInt1653,
																	var54.anInt1806) - var54.anInt1788,
															client.anInt1979);
											}

											var54.method957(client.anInt2043);
											Class2.aClass42_17.method186(Class77.anInt616, (int) var54.aDouble1793,
													(int) var54.aDouble1800, (int) var54.aDouble1801, 60, var54,
													var54.anInt1807, -1, false);
										}
									} else
										var54.method413();

								Class47.method238();
								Class109_Sub21_Sub10.method736(var11, var25, var26, var36, true);
								var24 = client.anInt2232;
								var28 = client.anInt2097;
								var26 = client.anInt2234;
								var36 = client.anInt2101;
								Class109_Sub21_Sub14.method785(var24, var28, var24 + var26, var28 + var36);
								Class109_Sub21_Sub14_Sub3.method973();
								if (!client.aBool2218) {
									var18 = client.anInt1991;
									if ((client.anInt2058 / 256) > var18)
										var18 = client.anInt2058 / 256;

									if (client.aBoolArray2200[4] && ((client.anIntArray2221[4] + 128) > var18))
										var18 = client.anIntArray2221[4] + 128;

									var38 = (client.anInt2052 + client.anInt2035) & 2047;
									var19 = Class19.anInt182;
									var41 = Class41.method174(
											Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710,
											Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653,
											Class77.anInt616) - 50;
									var30 = Class109_Sub21_Sub15.anInt1575;
									var9 = 600 + (var18 * 3);
									var22 = (2048 - var18) & 2047;
									var39 = (2048 - var38) & 2047;
									var43 = 0;
									var21 = 0;
									var10 = var9;
									int var23;
									int var42;
									if (var22 != 0) {
										var44 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var22];
										var23 = Class109_Sub21_Sub14_Sub3.anIntArray1836[var22];
										var42 = ((var23 * var21) - (var9 * var44)) >> 16;
										var10 = ((var21 * var44) + (var9 * var23)) >> 16;
										var21 = var42;
									}

									if (var39 != 0) {
										var44 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var39];
										var23 = Class109_Sub21_Sub14_Sub3.anIntArray1836[var39];
										var42 = ((var43 * var23) + (var10 * var44)) >> 16;
										var10 = ((var10 * var23) - (var43 * var44)) >> 16;
										var43 = var42;
									}

									Class109_Sub13.anInt1048 = var19 - var43;
									Class24.anInt222 = var41 - var21;
									Class109_Sub21_Sub9.anInt1420 = var30 - var10;
									Class46.anInt490 = var18;
									Class109_Sub21_Sub1.anInt1298 = var38;
								}

								if (!client.aBool2218)
									var18 = Class67.method300();
								else {
									if (Class50.aClass21_513.aBool194)
										var38 = Class77.anInt616;
									else {
										var19 = Class41.method174(Class109_Sub13.anInt1048,
												Class109_Sub21_Sub9.anInt1420, Class77.anInt616);
										if (((var19 - Class24.anInt222) < 800)
												&& ((Class27.aByteArrayArrayArray243[Class77.anInt616][Class109_Sub13.anInt1048 >> 7][Class109_Sub21_Sub9.anInt1420 >> 7]
														& 4) != 0))
											var38 = Class77.anInt616;
										else
											var38 = 3;
									}

									var18 = var38;
								}

								var38 = Class109_Sub13.anInt1048;
								var19 = Class24.anInt222;
								var41 = Class109_Sub21_Sub9.anInt1420;
								var30 = Class46.anInt490;
								var9 = Class109_Sub21_Sub1.anInt1298;

								for (var22 = 0; var22 < 5; ++var22)
									if (client.aBoolArray2200[var22]) {
										var39 = (int) (((Math.random() * ((client.anIntArray1976[var22] * 2) + 1))
												- client.anIntArray1976[var22]) + (Math
														.sin(client.anIntArray2188[var22]
																* (client.anIntArray2183[var22] / 100.0D))
														* client.anIntArray2221[var22]));
										if (var22 == 0)
											Class109_Sub13.anInt1048 += var39;

										if (var22 == 1)
											Class24.anInt222 += var39;

										if (var22 == 2)
											Class109_Sub21_Sub9.anInt1420 += var39;

										if (var22 == 3)
											Class109_Sub21_Sub1.anInt1298 = (Class109_Sub21_Sub1.anInt1298 + var39)
													& 2047;

										if (var22 == 4) {
											Class46.anInt490 += var39;
											if (Class46.anInt490 < 128)
												Class46.anInt490 = 128;

											if (Class46.anInt490 > 383)
												Class46.anInt490 = 383;
										}
									}

								var22 = Class81.anInt637;
								var39 = Class81.anInt638;
								if (Class81.anInt643 != 0) {
									var22 = Class81.anInt645;
									var39 = Class81.anInt639;
								}

								if ((var22 >= var24) && (var22 < (var26 + var24)) && (var39 >= var28)
										&& (var39 < (var28 + var36))) {
									Class109_Sub21_Sub15_Sub4.aBool1745 = true;
									Class109_Sub21_Sub15_Sub4.anInt1782 = 0;
									Class109_Sub21_Sub15_Sub4.anInt1763 = var22 - var24;
									Class109_Sub21_Sub15_Sub4.anInt1781 = var39 - var28;
								} else {
									Class109_Sub21_Sub15_Sub4.aBool1745 = false;
									Class109_Sub21_Sub15_Sub4.anInt1782 = 0;
								}

								Class52.method255();
								Class109_Sub21_Sub14.method773(var24, var28, var26, var36, 0);
								Class52.method255();
								var43 = Class109_Sub21_Sub14_Sub3.anInt1822;
								Class109_Sub21_Sub14_Sub3.anInt1822 = client.anInt2236;
								Class2.aClass42_17.method206(Class109_Sub13.anInt1048, Class24.anInt222,
										Class109_Sub21_Sub9.anInt1420, Class46.anInt490, Class109_Sub21_Sub1.anInt1298,
										var18);
								Class109_Sub21_Sub14_Sub3.anInt1822 = var43;
								Class52.method255();
								Class2.aClass42_17.method212();
								Class38.method167(var24, var28, var26, var36);
								if (client.anInt2158 == 2) {
									Class109_Sub18.method632(
											client.anInt1994 + ((client.anInt2054 - Class41.anInt375) << 7),
											((client.anInt2223 - Class113.anInt822) << 7) + client.anInt1995,
											client.anInt2093 * 2);
									if ((client.anInt2071 > -1) && ((client.anInt1979 % 20) < 10))
										Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub2Array1332[0].method919(
												(var24 + client.anInt2071) - 12, (var28 + client.anInt1988) - 28);
								}

								((Class20) Class109_Sub21_Sub14_Sub3.anInterface3_1833).method92(client.anInt2043);
								Class4.method33();
								Class109_Sub13.anInt1048 = var38;
								Class24.anInt222 = var19;
								Class109_Sub21_Sub9.anInt1420 = var41;
								Class46.anInt490 = var30;
								Class109_Sub21_Sub1.anInt1298 = var9;
								if (client.aBool2029 && (Class36.method161(true, false) == 0))
									client.aBool2029 = false;

								if (client.aBool2029) {
									Class109_Sub21_Sub14.method773(var24, var28, var26, var36, 0);
									Class35.method157("Loading - please wait.", false);
								}

								client.aBoolArray2116[var13.anInt1172] = true;
								Class109_Sub21_Sub14.method785(var2, var3, var4, var5);
								continue;
							}

							if (var13.anInt1151 == 1338) {
								Class47.method243(var13, var11, var25, var20);
								Class109_Sub21_Sub14.method785(var2, var3, var4, var5);
								continue;
							}

							if (var13.anInt1151 == 1339) {
								Class33.method145(var13, var11, var25);
								Class109_Sub21_Sub14.method785(var2, var3, var4, var5);
								continue;
							}
						}

						if (var13.anInt1229 == 0) {
							if (!var13.aBool1146 && Class104.method408(var13)
									&& (Class109_Sub13.aClass109_Sub20_1052 != var13))
								continue;

							if (!var13.aBool1146) {
								if (var13.anInt1169 > (var13.anInt1171 - var13.anInt1163))
									var13.anInt1169 = var13.anInt1171 - var13.anInt1163;

								if (var13.anInt1169 < 0)
									var13.anInt1169 = 0;
							}

							method538(var0, var13.anInt1148, var31, var29, var33, var34, var11 - var13.anInt1168,
									var25 - var13.anInt1169, var20);
							if (var13.aClass109_Sub20Array1272 != null)
								method538(var13.aClass109_Sub20Array1272, var13.anInt1148, var31, var29, var33, var34,
										var11 - var13.anInt1168, var25 - var13.anInt1169, var20);

							final Class109_Sub13 var35 = (Class109_Sub13) client.aClass116_2129
									.method429(var13.anInt1148);
							if (var35 != null) {
								var28 = var35.anInt1050;
								if (!Class108.method412(var28)) {
									if (var20 != -1)
										client.aBoolArray2116[var20] = true;
									else
										for (var26 = 0; var26 < 100; ++var26)
											client.aBoolArray2116[var26] = true;
								} else {
									Class27.aClass109_Sub20Array258 = null;
									method538(Class109_Sub20.aClass109_Sub20ArrayArray1150[var28], -1, var31, var29,
											var33, var34, var11, var25, var20);
									if (null != Class27.aClass109_Sub20Array258) {
										method538(Class27.aClass109_Sub20Array258, -1412584499, var31, var29, var33,
												var34, Class21.anInt203, Class27.anInt261, var20);
										Class27.aClass109_Sub20Array258 = null;
									}
								}
							}

							Class109_Sub21_Sub14.method785(var2, var3, var4, var5);
							Class109_Sub21_Sub14_Sub3.method973();
						}

						if (client.aBool2184 || client.aBoolArray2220[var20] || (client.anInt2182 > 1)) {
							int var37;
							if ((var13.anInt1229 == 0) && !var13.aBool1146 && (var13.anInt1171 > var13.anInt1163)) {
								var24 = var13.anInt1162 + var11;
								var28 = var13.anInt1169;
								var26 = var13.anInt1163;
								var36 = var13.anInt1171;
								Class109_Sub21_Sub16.aClass109_Sub21_Sub14_Sub1Array1577[0].method905(var24, var25);
								Class109_Sub21_Sub16.aClass109_Sub21_Sub14_Sub1Array1577[1].method905(var24,
										(var26 + var25) - 16);
								Class109_Sub21_Sub14.method773(var24, 16 + var25, 16, var26 - 32, client.anInt1977);
								var37 = ((var26 - 32) * var26) / var36;
								if (var37 < 8)
									var37 = 8;

								var18 = (var28 * (var26 - 32 - var37)) / (var36 - var26);
								Class109_Sub21_Sub14.method773(var24, 16 + var25 + var18, 16, var37, client.anInt2046);
								Class109_Sub21_Sub14.method782(var24, var18 + 16 + var25, var37, client.anInt2233);
								Class109_Sub21_Sub14.method782(1 + var24, var18 + var25 + 16, var37, client.anInt2233);
								Class109_Sub21_Sub14.method784(var24, var18 + 16 + var25, 16, client.anInt2233);
								Class109_Sub21_Sub14.method784(var24, var18 + 17 + var25, 16, client.anInt2233);
								Class109_Sub21_Sub14.method782(var24 + 15, 16 + var25 + var18, var37, client.anInt2172);
								Class109_Sub21_Sub14.method782(14 + var24, var18 + 17 + var25, var37 - 1,
										client.anInt2172);
								Class109_Sub21_Sub14.method784(var24, var18 + var25 + 15 + var37, 16, client.anInt2172);
								Class109_Sub21_Sub14.method784(var24 + 1, 14 + var25 + var18 + var37, 15,
										client.anInt2172);
							}

							if (var13.anInt1229 != 1)
								if (var13.anInt1229 == 2) {
									var24 = 0;

									for (var28 = 0; var28 < var13.anInt1241; ++var28)
										for (var26 = 0; var26 < var13.anInt1274; ++var26) {
											var36 = var11 + ((32 + var13.anInt1234) * var26);
											var37 = var25 + ((32 + var13.anInt1212) * var28);
											if (var24 < 20) {
												var36 += var13.anIntArray1213[var24];
												var37 += var13.anIntArray1214[var24];
											}

											if (var13.anIntArray1149[var24] <= 0) {
												if ((var13.anIntArray1215 != null) && (var24 < 20)) {
													final Class109_Sub21_Sub14_Sub2 var53 = var13.method650(var24);
													if (null != var53)
														var53.method919(var36, var37);
													else if (Class109_Sub20.aBool1145)
														Class71.method315(var13);
												}
											} else {
												var19 = var13.anIntArray1149[var24] - 1;
												if ((((var36 + 32) > var2) && (var36 < var4) && ((32 + var37) > var3)
														&& (var37 < var5))
														|| ((var13 == Class21.aClass109_Sub20_202)
																&& (client.anInt2079 == var24))) {
													Class109_Sub21_Sub14_Sub2 var45;
													if ((client.anInt2196 == 1) && (Class8_Sub2.anInt905 == var24)
															&& (var13.anInt1148 == Class77.anInt624))
														var45 = Class109_Sub21_Sub15_Sub6.method982(var19,
																var13.anIntArray1264[var24], 2, 0, 2, false);
													else
														var45 = Class109_Sub21_Sub15_Sub6.method982(var19,
																var13.anIntArray1264[var24], 1, 3153952, 2, false);

													if (null != var45) {
														if ((Class21.aClass109_Sub20_202 == var13)
																&& (var24 == client.anInt2079)) {
															var18 = Class81.anInt637 - client.anInt2080;
															var38 = Class81.anInt638 - client.anInt2081;
															if ((var18 < 5) && (var18 > -5))
																var18 = 0;

															if ((var38 < 5) && (var38 > -5))
																var38 = 0;

															if (client.anInt2084 < 5) {
																var18 = 0;
																var38 = 0;
															}

															var45.method932(var36 + var18, var37 + var38, 128);
															if (var1 != -1) {
																final Class109_Sub20 var15 = var0[var1 & '\uffff'];
																if (((var37 + var38) < Class109_Sub21_Sub14.anInt1555)
																		&& (var15.anInt1169 > 0)) {
																	var9 = (client.anInt2043
																			* (Class109_Sub21_Sub14.anInt1555 - var37
																					- var38))
																			/ 3;
																	if (var9 > (client.anInt2043 * 10))
																		var9 = client.anInt2043 * 10;

																	if (var9 > var15.anInt1169)
																		var9 = var15.anInt1169;

																	var15.anInt1169 -= var9;
																	client.anInt2081 += var9;
																	Class71.method315(var15);
																}

																if (((32 + var37
																		+ var38) > Class109_Sub21_Sub14.anInt1556)
																		&& (var15.anInt1169 < (var15.anInt1171
																				- var15.anInt1163))) {
																	var9 = (client.anInt2043 * ((32 + var37 + var38)
																			- Class109_Sub21_Sub14.anInt1556)) / 3;
																	if (var9 > (client.anInt2043 * 10))
																		var9 = client.anInt2043 * 10;

																	if (var9 > (var15.anInt1171 - var15.anInt1163
																			- var15.anInt1169))
																		var9 = var15.anInt1171 - var15.anInt1163
																				- var15.anInt1169;

																	var15.anInt1169 += var9;
																	client.anInt2081 -= var9;
																	Class71.method315(var15);
																}
															}
														} else if ((Class39.aClass109_Sub20_368 == var13)
																&& (client.anInt2078 == var24))
															var45.method932(var36, var37, 128);
														else
															var45.method919(var36, var37);
													} else
														Class71.method315(var13);
												}
											}

											++var24;
										}
								} else if (var13.anInt1229 == 3) {
									if (Class1.method13(var13)) {
										var24 = var13.anInt1180;
										if ((Class109_Sub13.aClass109_Sub20_1052 == var13) && (var13.anInt1175 != 0))
											var24 = var13.anInt1175;
									} else {
										var24 = var13.anInt1220;
										if ((Class109_Sub13.aClass109_Sub20_1052 == var13) && (var13.anInt1174 != 0))
											var24 = var13.anInt1174;
									}

									if (var32 == 0) {
										if (var13.aBool1176)
											Class109_Sub21_Sub14.method773(var11, var25, var13.anInt1162,
													var13.anInt1163, var24);
										else
											Class109_Sub21_Sub14.method775(var11, var25, var13.anInt1162,
													var13.anInt1163, var24);
									} else if (var13.aBool1176)
										Class109_Sub21_Sub14.method772(var11, var25, var13.anInt1162, var13.anInt1163,
												var24, 256 - (var32 & 255));
									else
										Class109_Sub21_Sub14.method776(var11, var25, var13.anInt1162, var13.anInt1163,
												var24, 256 - (var32 & 255));
								} else {
									Class109_Sub21_Sub14_Sub4_Sub1 var55;
									if (var13.anInt1229 == 4) {
										var55 = var13.method649();
										if (null == var55) {
											if (Class109_Sub20.aBool1145)
												Class71.method315(var13);
										} else {
											String var49 = var13.aString1205;
											if (Class1.method13(var13)) {
												var28 = var13.anInt1180;
												if ((Class109_Sub13.aClass109_Sub20_1052 == var13)
														&& (var13.anInt1175 != 0))
													var28 = var13.anInt1175;

												if (var13.aString1206.length() > 0)
													var49 = var13.aString1206;
											} else {
												var28 = var13.anInt1220;
												if ((var13 == Class109_Sub13.aClass109_Sub20_1052)
														&& (var13.anInt1174 != 0))
													var28 = var13.anInt1174;
											}

											if (var13.aBool1146 && (var13.anInt1265 != -1)) {
												final Class109_Sub21_Sub5 var60 = Class109_Sub23
														.method660(var13.anInt1265);
												var49 = var60.aString1372;
												if (null == var49)
													var49 = "null";

												if (((var60.anInt1378 == 1) || (var13.anInt1266 != 1))
														&& (var13.anInt1266 != -1))
													var49 = Class109_Sub11.method544(16748608) + var49 + "</col>" + " "
															+ '\u0078'
															+ Class109_Sub21_Sub15_Sub5.method956(var13.anInt1266);
											}

											if (var13 == client.aClass109_Sub20_2044) {
												var49 = "Please wait...";
												var28 = var13.anInt1220;
											}

											if (!var13.aBool1146)
												var49 = Class109_Sub13.method549(var49, var13);

											var55.method1017(var49, var11, var25, var13.anInt1162, var13.anInt1163,
													var28, var13.aBool1250 ? 0 : -1, var13.anInt1208, var13.anInt1209,
													var13.anInt1207);
										}
									} else if (var13.anInt1229 == 5) {
										Class109_Sub21_Sub14_Sub2 var56;
										if (!var13.aBool1146) {
											var56 = var13.method648(Class1.method13(var13));
											if (null != var56)
												var56.method919(var11, var25);
											else if (Class109_Sub20.aBool1145)
												Class71.method315(var13);
										} else {
											if (var13.anInt1265 != -1)
												var56 = Class109_Sub21_Sub15_Sub6.method982(var13.anInt1265,
														var13.anInt1266, var13.anInt1184, var13.anInt1185,
														var13.anInt1203, false);
											else
												var56 = var13.method648(false);

											if (null == var56) {
												if (Class109_Sub20.aBool1145)
													Class71.method315(var13);
											} else {
												var28 = var56.anInt1724;
												var26 = var56.anInt1719;
												if (!var13.aBool1183) {
													var36 = (var13.anInt1162 * 4096) / var28;
													if (var13.anInt1182 != 0)
														var56.method930((var13.anInt1162 / 2) + var11,
																(var13.anInt1163 / 2) + var25, var13.anInt1182, var36);
													else if (var32 != 0)
														var56.method921(var11, var25, var13.anInt1162, var13.anInt1163,
																256 - (var32 & 255));
													else if ((var28 == var13.anInt1162) && (var13.anInt1163 == var26))
														var56.method919(var11, var25);
													else
														var56.method928(var11, var25, var13.anInt1162, var13.anInt1163);
												} else {
													Class109_Sub21_Sub14.method769(var11, var25,
															var13.anInt1162 + var11, var25 + var13.anInt1163);
													var36 = ((var28 - 1) + var13.anInt1162) / var28;
													var37 = (var13.anInt1163 + (var26 - 1)) / var26;

													for (var18 = 0; var18 < var36; ++var18)
														for (var38 = 0; var38 < var37; ++var38)
															if (var13.anInt1182 != 0)
																var56.method930((var28 / 2) + (var28 * var18) + var11,
																		var25 + (var26 * var38) + (var26 / 2),
																		var13.anInt1182, 4096);
															else if (var32 != 0)
																var56.method932((var18 * var28) + var11,
																		(var38 * var26) + var25, 256 - (var32 & 255));
															else
																var56.method919((var28 * var18) + var11,
																		(var26 * var38) + var25);

													Class109_Sub21_Sub14.method785(var2, var3, var4, var5);
												}
											}
										}
									} else {
										Class109_Sub21_Sub5 var17;
										if (var13.anInt1229 == 6) {
											final boolean var52 = Class1.method13(var13);
											if (var52)
												var28 = var13.anInt1158;
											else
												var28 = var13.anInt1192;

											Class109_Sub21_Sub15_Sub4 var47 = null;
											var36 = 0;
											if (var13.anInt1265 != -1) {
												var17 = Class109_Sub23.method660(var13.anInt1265);
												if (null != var17) {
													var17 = var17.method690(var13.anInt1266);
													var47 = var17.method689(1);
													if (null != var47) {
														var47.method937();
														var36 = var47.anInt1576 / 2;
													} else
														Class71.method315(var13);
												}
											} else if (var13.anInt1188 == 5) {
												if (var13.anInt1189 == 0)
													var47 = client.aClass96_2243.method365((Class109_Sub21_Sub7) null,
															-1, (Class109_Sub21_Sub7) null, -1);
												else
													var47 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590
															.method827((byte) 120);
											} else if (var28 == -1) {
												var47 = var13.method655((Class109_Sub21_Sub7) null, -1, var52,
														Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aClass96_1929);
												if ((var47 == null) && Class109_Sub20.aBool1145)
													Class71.method315(var13);
											} else {
												final Class109_Sub21_Sub7 var50 = Class109_Sub21_Sub18.method849(var28,
														1841016873);
												var47 = var13.method655(var50, var13.anInt1267, var52,
														Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aClass96_1929);
												if ((null == var47) && Class109_Sub20.aBool1145)
													Class71.method315(var13);
											}

											Class109_Sub21_Sub14_Sub3.method961((var13.anInt1162 / 2) + var11,
													var25 + (var13.anInt1163 / 2));
											var37 = (var13.anInt1199
													* Class109_Sub21_Sub14_Sub3.anIntArray1835[var13.anInt1273]) >> 16;
											var18 = (var13.anInt1199
													* Class109_Sub21_Sub14_Sub3.anIntArray1836[var13.anInt1273]) >> 16;
											if (null != var47)
												if (!var13.aBool1146)
													var47.method947(0, var13.anInt1193, 0, var13.anInt1273, 0, var37,
															var18);
												else {
													var47.method937();
													if (var13.aBool1271)
														var47.method948(0, var13.anInt1193, var13.anInt1198,
																var13.anInt1273, var13.anInt1194,
																var36 + var37 + var13.anInt1244,
																var13.anInt1244 + var18, var13.anInt1199);
													else
														var47.method947(0, var13.anInt1193, var13.anInt1198,
																var13.anInt1273, var13.anInt1194,
																var37 + var36 + var13.anInt1244,
																var18 + var13.anInt1244);
												}

											Class109_Sub21_Sub14_Sub3.method960();
										} else {
											if (var13.anInt1229 == 7) {
												var55 = var13.method649();
												if (null == var55) {
													if (Class109_Sub20.aBool1145)
														Class71.method315(var13);
													continue;
												}

												var28 = 0;

												for (var26 = 0; var26 < var13.anInt1241; ++var26)
													for (var36 = 0; var36 < var13.anInt1274; ++var36) {
														if (var13.anIntArray1149[var28] > 0) {
															var17 = Class109_Sub23
																	.method660(var13.anIntArray1149[var28] - 1);
															String var27;
															if ((var17.anInt1378 != 1)
																	&& (var13.anIntArray1264[var28] == 1))
																var27 = Class109_Sub11.method544(16748608)
																		+ var17.aString1372 + "</col>";
															else
																var27 = Class109_Sub11.method544(16748608)
																		+ var17.aString1372 + "</col>" + " " + '\u0078'
																		+ Class109_Sub21_Sub15_Sub5
																				.method956(var13.anIntArray1264[var28]);

															var38 = var11 + (var36 * (var13.anInt1234 + 115));
															var19 = var25 + ((12 + var13.anInt1212) * var26);
															if (var13.anInt1208 == 0)
																var55.method1014(var27, var38, var19, var13.anInt1220,
																		var13.aBool1250 ? 0 : -1);
															else if (var13.anInt1208 == 1)
																var55.method1016(var27, var38 + (var13.anInt1162 / 2),
																		var19, var13.anInt1220,
																		var13.aBool1250 ? 0 : -1);
															else
																var55.method1015(var27, (var13.anInt1162 + var38) - 1,
																		var19, var13.anInt1220,
																		var13.aBool1250 ? 0 : -1);
														}

														++var28;
													}
											}

											if ((var13.anInt1229 == 8)
													&& (var13 == Class109_Sub21_Sub15_Sub6.aClass109_Sub20_1837)
													&& (client.anInt2119 == client.anInt2120)) {
												var24 = 0;
												var28 = 0;
												final Class109_Sub21_Sub14_Sub4_Sub1 var16 = Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503;
												String var40 = var13.aString1205;

												String var48;
												for (var40 = Class109_Sub13.method549(var40, var13); var40
														.length() > 0; var28 += 1 + var16.anInt1907) {
													var18 = var40.indexOf("<br>");
													if (var18 != -1) {
														var48 = var40.substring(0, var18);
														var40 = var40.substring(4 + var18);
													} else {
														var48 = var40;
														var40 = "";
													}

													var38 = var16.method1010(var48);
													if (var38 > var24)
														var24 = var38;
												}

												var24 += 6;
												var28 += 7;
												var18 = (var11 + var13.anInt1162) - 5 - var24;
												var38 = var13.anInt1163 + var25 + 5;
												if (var18 < (var11 + 5))
													var18 = var11 + 5;

												if ((var24 + var18) > var4)
													var18 = var4 - var24;

												if ((var38 + var28) > var5)
													var38 = var5 - var28;

												Class109_Sub21_Sub14.method773(var18, var38, var24, var28, 16777120);
												Class109_Sub21_Sub14.method775(var18, var38, var24, var28, 0);
												var40 = var13.aString1205;
												var19 = var16.anInt1907 + var38 + 2;

												for (var40 = Class109_Sub13.method549(var40, var13); var40
														.length() > 0; var19 += 1 + var16.anInt1907) {
													var41 = var40.indexOf("<br>");
													if (var41 != -1) {
														var48 = var40.substring(0, var41);
														var40 = var40.substring(var41 + 4);
													} else {
														var48 = var40;
														var40 = "";
													}

													var16.method1014(var48, 3 + var18, var19, 0, -1);
												}
											}

											if (var13.anInt1229 == 9)
												if (var13.anInt1257 == 1) {
													if (var13.aBool1179) {
														var24 = var11;
														var28 = var25 + var13.anInt1163;
														var26 = var11 + var13.anInt1162;
														var36 = var25;
													} else {
														var24 = var11;
														var28 = var25;
														var26 = var13.anInt1162 + var11;
														var36 = var13.anInt1163 + var25;
													}

													Class109_Sub21_Sub14.method780(var24, var28, var26, var36,
															var13.anInt1220);
												} else {
													var24 = var13.anInt1162 >= 0 ? var13.anInt1162 : -var13.anInt1162;
													var28 = var13.anInt1163 >= 0 ? var13.anInt1163 : -var13.anInt1163;
													var26 = var24;
													if (var24 < var28)
														var26 = var28;

													if (var26 != 0) {
														var36 = (var13.anInt1162 << 16) / var26;
														var37 = (var13.anInt1163 << 16) / var26;
														if (var37 <= var36)
															var36 = -var36;
														else
															var37 = -var37;

														var18 = (var13.anInt1257 * var37) >> 17;
														var38 = ((var37 * var13.anInt1257) + 1) >> 17;
														var19 = (var13.anInt1257 * var36) >> 17;
														var41 = ((var36 * var13.anInt1257) + 1) >> 17;
														var30 = var11 + var18;
														var9 = var11 - var38;
														var22 = (var11 + var13.anInt1162) - var38;
														var39 = var18 + var11 + var13.anInt1162;
														var43 = var19 + var25;
														var21 = var25 - var41;
														var10 = (var13.anInt1163 + var25) - var41;
														var44 = var19 + var13.anInt1163 + var25;
														Class109_Sub21_Sub14_Sub3.method964(var30, var9, var22);
														Class109_Sub21_Sub14_Sub3.method967(var43, var21, var10, var30,
																var9, var22, var13.anInt1220);
														Class109_Sub21_Sub14_Sub3.method964(var30, var22, var39);
														Class109_Sub21_Sub14_Sub3.method967(var43, var10, var44, var30,
																var22, var39, var13.anInt1220);
													}
												}
										}
									}
								}
						}
					}
				}
			}
		}

	}

	static char method539(final char var0) {
		if ((var0 >= 192) && (var0 <= 255)) {
			if ((var0 >= 192) && (var0 <= 198))
				return '\u0041';

			if (var0 == 199)
				return '\u0043';

			if ((var0 >= 200) && (var0 <= 203))
				return '\u0045';

			if ((var0 >= 204) && (var0 <= 207))
				return '\u0049';

			if ((var0 >= 210) && (var0 <= 214))
				return '\u004f';

			if ((var0 >= 217) && (var0 <= 220))
				return '\u0055';

			if (var0 == 221)
				return '\u0059';

			if (var0 == 223)
				return '\u0073';

			if ((var0 >= 224) && (var0 <= 230))
				return '\u0061';

			if (var0 == 231)
				return '\u0063';

			if ((var0 >= 232) && (var0 <= 235))
				return '\u0065';

			if ((var0 >= 236) && (var0 <= 239))
				return '\u0069';

			if ((var0 >= 242) && (var0 <= 246))
				return '\u006f';

			if ((var0 >= 249) && (var0 <= 252))
				return '\u0075';

			if ((var0 == 253) || (var0 == 255))
				return '\u0079';
		}

		if (var0 == 338)
			return '\u004f';
		else if (var0 == 339)
			return '\u006f';
		else if (var0 == 376)
			return '\u0059';
		else
			return var0;
	}

	static final void method540() {
		Class32.method142(false);
		client.anInt2023 = 0;
		boolean var9 = true;

		int var4;
		for (var4 = 0; var4 < Class109_Sub9.aByteArrayArray1006.length; ++var4) {
			if ((Class109_Sub21_Sub15_Sub5.anIntArray1813[var4] != -1)
					&& (Class109_Sub9.aByteArrayArray1006[var4] == null)) {
				Class109_Sub9.aByteArrayArray1006[var4] = Class109_Sub12.aClass104_Sub1_1042
						.method387(Class109_Sub21_Sub15_Sub5.anIntArray1813[var4], 0);
				if (null == Class109_Sub9.aByteArrayArray1006[var4]) {
					var9 = false;
					++client.anInt2023;
				}
			}

			if ((Class109_Sub21_Sub5.anIntArray1384[var4] != -1) && (null == Class50.aByteArrayArray514[var4])) {
				Class50.aByteArrayArray514[var4] = Class109_Sub12.aClass104_Sub1_1042
						.method390(Class109_Sub21_Sub5.anIntArray1384[var4], 0, Class53.anIntArrayArray534[var4]);
				if (null == Class50.aByteArrayArray514[var4]) {
					var9 = false;
					++client.anInt2023;
				}
			}
		}

		if (!var9)
			client.anInt2027 = 1;
		else {
			client.anInt2025 = 0;
			var9 = true;

			int var1;
			int var10;
			int var13;
			int var18;
			int var20;
			int var21;
			int var23;
			int var26;
			int var27;
			for (var4 = 0; var4 < Class109_Sub9.aByteArrayArray1006.length; ++var4) {
				final byte[] var17 = Class50.aByteArrayArray514[var4];
				if (var17 != null) {
					var1 = ((Class109_Sub21_Sub9.anIntArray1422[var4] >> 8) * 64) - Class41.anInt375;
					var10 = (64 * (Class109_Sub21_Sub9.anIntArray1422[var4] & 255)) - Class113.anInt822;
					if (client.aBool2141) {
						var1 = 10;
						var10 = 10;
					}

					boolean var7 = true;
					final DataBuffer var19 = new DataBuffer(var17);
					var20 = -1;

					label676: while (true) {
						var21 = var19.method574();
						if (var21 == 0) {
							var9 &= var7;
							break;
						}

						var20 += var21;
						var18 = 0;
						boolean var22 = false;

						while (true) {
							while (!var22) {
								var23 = var19.method574();
								if (var23 == 0)
									continue label676;

								var18 += var23 - 1;
								var26 = var18 & 63;
								var27 = (var18 >> 6) & 63;
								var13 = var19.method564() >> 2;
								final int var39 = var27 + var1;
								final int var28 = var26 + var10;
								if ((var39 > 0) && (var28 > 0) && (var39 < 103) && (var28 < 103)) {
									final Class109_Sub21_Sub10 var5 = Class28.method128(var20);
									if ((var13 != 22) || !client.aBool2065 || (var5.anInt1424 != 0)
											|| (var5.anInt1438 == 1) || var5.aBool1461) {
										if (!var5.method735()) {
											++client.anInt2025;
											var7 = false;
										}

										var22 = true;
									}
								}
							}

							var23 = var19.method574();
							if (var23 == 0)
								break;

							var19.method564();
						}
					}
				}
			}

			if (!var9)
				client.anInt2027 = 2;
			else {
				if (client.anInt2027 != 0)
					Class35.method157("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);

				Class52.method255();
				Class41.method173();
				Class52.method255();
				Class2.aClass42_17.method176();
				Class52.method255();
				System.gc();

				for (var4 = 0; var4 < 4; ++var4)
					client.aClass138Array2159[var4].method484();

				int var0;
				for (var4 = 0; var4 < 4; ++var4)
					for (var0 = 0; var0 < 104; ++var0)
						for (var1 = 0; var1 < 104; ++var1)
							Class27.aByteArrayArrayArray243[var4][var0][var1] = 0;

				Class52.method255();
				Class109_Sub8.method528();
				var4 = Class109_Sub9.aByteArrayArray1006.length;
				Class6.method41();
				Class32.method142(true);
				int var16;
				if (!client.aBool2141) {
					byte[] var25;
					for (var0 = 0; var0 < var4; ++var0) {
						var1 = ((Class109_Sub21_Sub9.anIntArray1422[var0] >> 8) * 64) - Class41.anInt375;
						var10 = (64 * (Class109_Sub21_Sub9.anIntArray1422[var0] & 255)) - Class113.anInt822;
						var25 = Class109_Sub9.aByteArrayArray1006[var0];
						if (null != var25) {
							Class52.method255();
							Class48.method246(var25, var1, var10, (Class109_Sub21_Sub11.anInt1493 * 8) - 48,
									(Class27.anInt259 * 8) - 48, client.aClass138Array2159);
						}
					}

					for (var0 = 0; var0 < var4; ++var0) {
						var1 = ((Class109_Sub21_Sub9.anIntArray1422[var0] >> 8) * 64) - Class41.anInt375;
						var10 = ((Class109_Sub21_Sub9.anIntArray1422[var0] & 255) * 64) - Class113.anInt822;
						var25 = Class109_Sub9.aByteArrayArray1006[var0];
						if ((var25 == null) && (Class27.anInt259 < 800)) {
							Class52.method255();
							Class29.method132(var1, var10, 64, 64);
						}
					}

					Class32.method142(true);

					for (var0 = 0; var0 < var4; ++var0) {
						final byte[] var24 = Class50.aByteArrayArray514[var0];
						if (var24 != null) {
							var10 = ((Class109_Sub21_Sub9.anIntArray1422[var0] >> 8) * 64) - Class41.anInt375;
							var16 = (64 * (Class109_Sub21_Sub9.anIntArray1422[var0] & 255)) - Class113.anInt822;
							Class52.method255();
							Class9.method56(var24, var10, var16, Class2.aClass42_17, client.aClass138Array2159);
						}
					}
				}

				int var30;
				int var33;
				int var50;
				if (client.aBool2141) {
					for (var0 = 0; var0 < 4; ++var0) {
						Class52.method255();

						for (var1 = 0; var1 < 13; ++var1)
							for (var10 = 0; var10 < 13; ++var10) {
								boolean var51 = false;
								var30 = client.anIntArrayArrayArray1996[var0][var1][var10];
								if (var30 != -1) {
									var50 = (var30 >> 24) & 3;
									var33 = (var30 >> 1) & 3;
									var20 = (var30 >> 14) & 1023;
									var21 = (var30 >> 3) & 2047;
									var18 = ((var20 / 8) << 8) + (var21 / 8);

									for (int var52 = 0; var52 < Class109_Sub21_Sub9.anIntArray1422.length; ++var52)
										if ((var18 == Class109_Sub21_Sub9.anIntArray1422[var52])
												&& (null != Class109_Sub9.aByteArrayArray1006[var52])) {
											Class40.method172(Class109_Sub9.aByteArrayArray1006[var52], var0, 8 * var1,
													8 * var10, var50, 8 * (var20 & 7), 8 * (var21 & 7), var33,
													client.aClass138Array2159);
											var51 = true;
											break;
										}
								}

								if (!var51) {
									var50 = var0;
									var33 = 8 * var1;
									var20 = 8 * var10;

									for (var21 = 0; var21 < 8; ++var21)
										for (var18 = 0; var18 < 8; ++var18)
											Class27.anIntArrayArrayArray251[var50][var21 + var33][var18 + var20] = 0;

									if (var33 > 0)
										for (var21 = 1; var21 < 8; ++var21)
											Class27.anIntArrayArrayArray251[var50][var33][var20
													+ var21] = Class27.anIntArrayArrayArray251[var50][var33 - 1][var21
															+ var20];

									if (var20 > 0)
										for (var21 = 1; var21 < 8; ++var21)
											Class27.anIntArrayArrayArray251[var50][var33
													+ var21][var20] = Class27.anIntArrayArrayArray251[var50][var21
															+ var33][var20 - 1];

									if ((var33 > 0) && (Class27.anIntArrayArrayArray251[var50][var33 - 1][var20] != 0))
										Class27.anIntArrayArrayArray251[var50][var33][var20] = Class27.anIntArrayArrayArray251[var50][var33
												- 1][var20];
									else if ((var20 > 0)
											&& (Class27.anIntArrayArrayArray251[var50][var33][var20 - 1] != 0))
										Class27.anIntArrayArrayArray251[var50][var33][var20] = Class27.anIntArrayArrayArray251[var50][var33][var20
												- 1];
									else if ((var33 > 0) && (var20 > 0)
											&& (Class27.anIntArrayArrayArray251[var50][var33 - 1][var20 - 1] != 0))
										Class27.anIntArrayArrayArray251[var50][var33][var20] = Class27.anIntArrayArrayArray251[var50][var33
												- 1][var20 - 1];
								}
							}
					}

					for (var0 = 0; var0 < 13; ++var0)
						for (var1 = 0; var1 < 13; ++var1) {
							var10 = client.anIntArrayArrayArray1996[0][var0][var1];
							if (var10 == -1)
								Class29.method132(8 * var0, var1 * 8, 8, 8);
						}

					Class32.method142(true);

					for (var0 = 0; var0 < 4; ++var0) {
						Class52.method255();

						for (var1 = 0; var1 < 13; ++var1)
							label517: for (var10 = 0; var10 < 13; ++var10) {
								var16 = client.anIntArrayArrayArray1996[var0][var1][var10];
								if (var16 != -1) {
									var30 = (var16 >> 24) & 3;
									var50 = (var16 >> 1) & 3;
									var33 = (var16 >> 14) & 1023;
									var20 = (var16 >> 3) & 2047;
									var21 = (var20 / 8) + ((var33 / 8) << 8);

									for (var18 = 0; var18 < Class109_Sub21_Sub9.anIntArray1422.length; ++var18)
										if ((Class109_Sub21_Sub9.anIntArray1422[var18] == var21)
												&& (null != Class50.aByteArrayArray514[var18])) {
											final byte[] var42 = Class50.aByteArrayArray514[var18];
											var23 = var1 * 8;
											var26 = 8 * var10;
											var27 = 8 * (var33 & 7);
											var13 = 8 * (var20 & 7);
											final Class42 var43 = Class2.aClass42_17;
											final Class138[] var35 = client.aClass138Array2159;
											final DataBuffer var49 = new DataBuffer(var42);
											int var40 = -1;

											while (true) {
												final int var41 = var49.method574();
												if (var41 == 0)
													continue label517;

												var40 += var41;
												int var29 = 0;

												while (true) {
													final int var6 = var49.method574();
													if (var6 == 0)
														break;

													var29 += var6 - 1;
													final int var12 = var29 & 63;
													final int var34 = (var29 >> 6) & 63;
													final int var37 = var29 >> 12;
													final int var44 = var49.method564();
													final int var45 = var44 >> 2;
													final int var46 = var44 & 3;
													if ((var37 == var30) && (var34 >= var27) && (var34 < (8 + var27))
															&& (var12 >= var13) && (var12 < (var13 + 8))) {
														final Class109_Sub21_Sub10 var48 = Class28.method128(var40);
														final int var31 = var23 + Class1.method14(var34 & 7, var12 & 7,
																var50, var48.anInt1440, var48.anInt1435, var46);
														final int var38 = var34 & 7;
														final int var14 = var12 & 7;
														int var3 = var48.anInt1440;
														int var2 = var48.anInt1435;
														int var11;
														if ((var46 & 1) == 1) {
															var11 = var3;
															var3 = var2;
															var2 = var11;
														}

														final int var8 = var50 & 3;
														int var15;
														if (var8 == 0)
															var15 = var14;
														else if (var8 == 1)
															var15 = 7 - var38 - (var3 - 1);
														else if (var8 == 2)
															var15 = 7 - var14 - (var2 - 1);
														else
															var15 = var38;

														var11 = var26 + var15;
														if ((var31 > 0) && (var11 > 0) && (var31 < 103)
																&& (var11 < 103)) {
															int var32 = var0;
															if ((Class27.aByteArrayArrayArray243[1][var31][var11]
																	& 2) == 2)
																var32 = var0 - 1;

															Class138 var36 = null;
															if (var32 >= 0)
																var36 = var35[var32];

															Class24.method105(var0, var31, var11, var40,
																	(var50 + var46) & 3, var45, var43, var36);
														}
													}
												}
											}
										}
								}
							}
					}
				}

				Class32.method142(true);
				Class41.method173();
				Class52.method255();
				DataBuffer.method618(Class2.aClass42_17, client.aClass138Array2159);
				Class32.method142(true);
				var0 = Class27.anInt245;
				if (var0 > Class77.anInt616)
					var0 = Class77.anInt616;

				if (var0 < (Class77.anInt616 - 1))
					var0 = Class77.anInt616 - 1;

				if (client.aBool2065)
					Class2.aClass42_17.method177(Class27.anInt245);
				else
					Class2.aClass42_17.method177(0);

				for (var1 = 0; var1 < 104; ++var1)
					for (var10 = 0; var10 < 104; ++var10)
						Class109_Sub21_Sub15_Sub3_Sub1.method1035(var1, var10);

				Class52.method255();

				for (Class109_Sub11 var53 = (Class109_Sub11) client.aClass126_2102
						.method458(); null != var53; var53 = (Class109_Sub11) client.aClass126_2102.method449())
					if (var53.anInt1035 == -1) {
						var53.anInt1034 = 0;
						Class33.method152(var53);
					} else
						var53.method413();

				Class109_Sub21_Sub10.aClass120_1427.method439();
				if (null != Class109_Sub21_Sub17.aFrame1587) {
					client.secureBuffer.method840(31);
					client.secureBuffer.writeInt(1057001181);
				}

				if (!client.aBool2141) {
					var1 = (Class109_Sub21_Sub11.anInt1493 - 6) / 8;
					var10 = (Class109_Sub21_Sub11.anInt1493 + 6) / 8;
					var16 = (Class27.anInt259 - 6) / 8;
					var30 = (Class27.anInt259 + 6) / 8;

					for (var50 = var1 - 1; var50 <= (1 + var10); ++var50)
						for (var33 = var16 - 1; var33 <= (var30 + 1); ++var33)
							if ((var50 < var1) || (var50 > var10) || (var33 < var16) || (var33 > var30)) {
								Class109_Sub12.aClass104_Sub1_1042.method400("m" + var50 + "_" + var33);
								Class109_Sub12.aClass104_Sub1_1042.method400("l" + var50 + "_" + var33);
							}
				}

				Class82.method343(30);
				Class52.method255();
				Class62.method285();
				client.secureBuffer.method840(117);
				Class47.method240();
			}
		}
	}
}
