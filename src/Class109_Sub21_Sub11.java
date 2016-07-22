public class Class109_Sub21_Sub11 extends Class109_Sub21 {
	public static Class104 aClass104_1479;
	int anInt1480;
	public static Class104 aClass104_1481;
	static int anInt1493;
	static byte aByte1494;
	public static Class71 aClass71_1495;
	int anInt1490;
	public int anInt1483 = -1;
	int anInt1488 = 128;
	int anInt1489 = 128;
	int anInt1482 = 0;
	int anInt1491 = 0;
	int anInt1492 = 0;
	short[] aShortArray1496;
	short[] aShortArray1478;
	short[] aShortArray1486;
	short[] aShortArray1487;
	public static Class120 aClass120_1484 = new Class120(64);
	public static Class120 aClass120_1485 = new Class120(30);

	void method746(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method564();
			if (var2 == 0)
				return;

			method747(var1, var2);
		}
	}

	void method747(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			anInt1490 = var1.readShort();
		else if (var2 == 2)
			anInt1483 = var1.readShort();
		else if (var2 == 4)
			anInt1488 = var1.readShort();
		else if (var2 == 5)
			anInt1489 = var1.readShort();
		else if (var2 == 6)
			anInt1482 = var1.readShort();
		else if (var2 == 7)
			anInt1491 = var1.method564();
		else if (var2 == 8)
			anInt1492 = var1.method564();
		else {
			int var3;
			int var4;
			if (var2 == 40) {
				var4 = var1.method564();
				aShortArray1496 = new short[var4];
				aShortArray1478 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1496[var3] = (short) var1.readShort();
					aShortArray1478[var3] = (short) var1.readShort();
				}
			} else if (var2 == 41) {
				var4 = var1.method564();
				aShortArray1486 = new short[var4];
				aShortArray1487 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1486[var3] = (short) var1.readShort();
					aShortArray1487[var3] = (short) var1.readShort();
				}
			}
		}

	}

	public final Class109_Sub21_Sub15_Sub4 method748(final int var1) {
		Class109_Sub21_Sub15_Sub4 var2 = (Class109_Sub21_Sub15_Sub4) aClass120_1485.method438(anInt1480);
		if (var2 == null) {
			final Class109_Sub21_Sub15_Sub7 var3 = Class109_Sub21_Sub15_Sub7.method984(aClass104_1479, anInt1490, 0);
			if (var3 == null)
				return null;

			int var4;
			if (aShortArray1496 != null)
				for (var4 = 0; var4 < aShortArray1496.length; ++var4)
					var3.method1002(aShortArray1496[var4], aShortArray1478[var4]);

			if (null != aShortArray1486)
				for (var4 = 0; var4 < aShortArray1486.length; ++var4)
					var3.method1001(aShortArray1486[var4], aShortArray1487[var4]);

			var2 = var3.method1000(anInt1491 + 64, anInt1492 + 850, -30, -50, -30);
			aClass120_1485.method440(var2, anInt1480);
		}

		Class109_Sub21_Sub15_Sub4 var5;
		if ((anInt1483 != -1) && (var1 != -1))
			var5 = Class109_Sub21_Sub18.method849(anInt1483, 26137036).method710(var2, var1);
		else
			var5 = var2.method954(true);

		if ((anInt1488 != 128) || (anInt1489 != 128))
			var5.method946(anInt1488, anInt1489, anInt1488);

		if (anInt1482 != 0) {
			if (anInt1482 == 90)
				var5.method942();

			if (anInt1482 == 180) {
				var5.method942();
				var5.method942();
			}

			if (anInt1482 == 270) {
				var5.method942();
				var5.method942();
				var5.method942();
			}
		}

		return var5;
	}

	static final void method749() {
		int var0;
		int var4;
		int var5;
		int var6;
		int var35;
		int var39;
		if (client.incomingMessage == 127) {
			var35 = client.gameBuffer.method564();
			var39 = ((var35 >> 4) & 7) + Class8.anInt89;
			var4 = Class109_Sub21_Sub13.anInt1544 + (var35 & 7);
			var5 = client.gameBuffer.readShort();
			var6 = client.gameBuffer.readShort();
			var0 = client.gameBuffer.readShort();
			if ((var39 >= 0) && (var4 >= 0) && (var39 < 104) && (var4 < 104)) {
				final Class126 var40 = client.aClass126ArrayArrayArray2121[Class77.anInt616][var39][var4];
				if (null != var40) {
					for (Class109_Sub21_Sub15_Sub1 var12 = (Class109_Sub21_Sub15_Sub1) var40
							.method458(); null != var12; var12 = (Class109_Sub21_Sub15_Sub1) var40.method449())
						if ((var12.anInt1638 == (var5 & 32767)) && (var12.anInt1637 == var6)) {
							var12.anInt1637 = var0;
							break;
						}

					Class109_Sub21_Sub15_Sub3_Sub1.method1035(var39, var4);
				}
			}

		} else {
			int var8;
			int var16;
			int var41;
			if (client.incomingMessage == 25) {
				var35 = client.gameBuffer.readByteN();
				var39 = ((var35 >> 4) & 7) + Class8.anInt89;
				var4 = Class109_Sub21_Sub13.anInt1544 + (var35 & 7);
				var5 = client.gameBuffer.readShort();
				var6 = client.gameBuffer.readByteS();
				var0 = var6 >> 2;
				var8 = var6 & 3;
				var16 = client.anIntArray2030[var0];
				if ((var39 >= 0) && (var4 >= 0) && (var39 < 103) && (var4 < 103)) {
					if (var16 == 0) {
						final LoginEncoder var7 = Class2.aClass42_17.method193(Class77.anInt616, var39, var4);
						if (null != var7) {
							var41 = (var7.anInt516 >> 14) & 32767;
							if (var0 == 2) {
								var7.aClass109_Sub21_Sub15_519 = new Class109_Sub21_Sub15_Sub6(var41, 2, var8 + 4,
										Class77.anInt616, var39, var4, var5, false, var7.aClass109_Sub21_Sub15_519);
								var7.aClass109_Sub21_Sub15_523 = new Class109_Sub21_Sub15_Sub6(var41, 2, (1 + var8) & 3,
										Class77.anInt616, var39, var4, var5, false, var7.aClass109_Sub21_Sub15_523);
							} else
								var7.aClass109_Sub21_Sub15_519 = new Class109_Sub21_Sub15_Sub6(var41, var0, var8,
										Class77.anInt616, var39, var4, var5, false, var7.aClass109_Sub21_Sub15_519);
						}
					}

					if (var16 == 1) {
						final Class22 var36 = Class2.aClass42_17.method194(Class77.anInt616, var39, var4);
						if (var36 != null) {
							var41 = (var36.anInt212 >> 14) & 32767;
							if ((var0 != 4) && (var0 != 5)) {
								if (var0 == 6)
									var36.aClass109_Sub21_Sub15_213 = new Class109_Sub21_Sub15_Sub6(var41, 4, var8 + 4,
											Class77.anInt616, var39, var4, var5, false,
											var36.aClass109_Sub21_Sub15_213);
								else if (var0 == 7)
									var36.aClass109_Sub21_Sub15_213 = new Class109_Sub21_Sub15_Sub6(var41, 4,
											4 + ((var8 + 2) & 3), Class77.anInt616, var39, var4, var5, false,
											var36.aClass109_Sub21_Sub15_213);
								else if (var0 == 8) {
									var36.aClass109_Sub21_Sub15_213 = new Class109_Sub21_Sub15_Sub6(var41, 4, 4 + var8,
											Class77.anInt616, var39, var4, var5, false,
											var36.aClass109_Sub21_Sub15_213);
									var36.aClass109_Sub21_Sub15_207 = new Class109_Sub21_Sub15_Sub6(var41, 4,
											((var8 + 2) & 3) + 4, Class77.anInt616, var39, var4, var5, false,
											var36.aClass109_Sub21_Sub15_207);
								}
							} else
								var36.aClass109_Sub21_Sub15_213 = new Class109_Sub21_Sub15_Sub6(var41, 4, var8,
										Class77.anInt616, var39, var4, var5, false, var36.aClass109_Sub21_Sub15_213);
						}
					}

					if (var16 == 2) {
						final Class26 var37 = Class2.aClass42_17.method195(Class77.anInt616, var39, var4);
						if (var0 == 11)
							var0 = 10;

						if (var37 != null)
							var37.aClass109_Sub21_Sub15_230 = new Class109_Sub21_Sub15_Sub6(
									(var37.anInt238 >> 14) & 32767, var0, var8, Class77.anInt616, var39, var4, var5,
									false, var37.aClass109_Sub21_Sub15_230);
					}

					if (var16 == 3) {
						final Class23 var38 = Class2.aClass42_17.method196(Class77.anInt616, var39, var4);
						if (null != var38)
							var38.aClass109_Sub21_Sub15_217 = new Class109_Sub21_Sub15_Sub6(
									(var38.anInt218 >> 14) & 32767, 22, var8, Class77.anInt616, var39, var4, var5,
									false, var38.aClass109_Sub21_Sub15_217);
					}
				}

			} else if (client.incomingMessage == 239) {
				var35 = client.gameBuffer.method564();
				var39 = Class8.anInt89 + ((var35 >> 4) & 7);
				var4 = Class109_Sub21_Sub13.anInt1544 + (var35 & 7);
				var5 = client.gameBuffer.readShort();
				var6 = client.gameBuffer.method564();
				var0 = client.gameBuffer.readShort();
				if ((var39 >= 0) && (var4 >= 0) && (var39 < 104) && (var4 < 104)) {
					var39 = 64 + (128 * var39);
					var4 = 64 + (128 * var4);
					final Class109_Sub21_Sub15_Sub2 var11 = new Class109_Sub21_Sub15_Sub2(var5, Class77.anInt616, var39,
							var4, Class41.method174(var39, var4, Class77.anInt616) - var6, var0, client.anInt1979);
					client.aClass126_2104.method450(var11);
				}

			} else {
				int var15;
				int var20;
				int var22;
				if (client.incomingMessage == 95) {
					byte var3 = client.gameBuffer.method587();
					byte var9 = client.gameBuffer.method604();
					var4 = client.gameBuffer.readLEShort();
					var5 = client.gameBuffer.readByteN();
					var6 = var5 >> 2;
					var0 = var5 & 3;
					var8 = client.anIntArray2030[var6];
					var16 = client.gameBuffer.readLEShort();
					byte var23 = client.gameBuffer.method587();
					byte var17 = client.gameBuffer.method616();
					var22 = client.gameBuffer.readLEShort();
					var20 = client.gameBuffer.readByteN();
					var15 = Class8.anInt89 + ((var20 >> 4) & 7);
					final int var21 = Class109_Sub21_Sub13.anInt1544 + (var20 & 7);
					final int var26 = client.gameBuffer.readShort();
					Class109_Sub21_Sub15_Sub3_Sub2 var14;
					if (client.anInt2092 == var22)
						var14 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590;
					else
						var14 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var22];

					if (var14 != null) {
						final Class109_Sub21_Sub10 var18 = Class28.method128(var4);
						int var19;
						int var25;
						if ((var0 != 1) && (var0 != 3)) {
							var25 = var18.anInt1440;
							var19 = var18.anInt1435;
						} else {
							var25 = var18.anInt1435;
							var19 = var18.anInt1440;
						}

						final int var27 = (var25 >> 1) + var15;
						final int var28 = ((var25 + 1) >> 1) + var15;
						final int var29 = (var19 >> 1) + var21;
						final int var30 = ((1 + var19) >> 1) + var21;
						final int[][] var10 = Class27.anIntArrayArrayArray251[Class77.anInt616];
						final int var31 = (var10[var28][var30] + var10[var28][var29] + var10[var27][var29]
								+ var10[var27][var30]) >> 2;
						final int var33 = (var15 << 7) + (var25 << 6);
						final int var32 = (var19 << 6) + (var21 << 7);
						final Class109_Sub21_Sub15_Sub4 var34 = var18.method734(var6, var0, var10, var33, var31, var32);
						if (null != var34) {
							Class109_Sub21_Sub19.method888(Class77.anInt616, var15, var21, var8, -1, 0, 0, 1 + var16,
									var26 + 1);
							var14.anInt1935 = client.anInt1979 + var16;
							var14.anInt1948 = var26 + client.anInt1979;
							var14.aClass109_Sub21_Sub15_Sub4_1940 = var34;
							var14.anInt1937 = (var15 * 128) + (var25 * 64);
							var14.anInt1939 = (64 * var19) + (var21 * 128);
							var14.anInt1946 = var31;
							byte var13;
							if (var3 > var9) {
								var13 = var3;
								var3 = var9;
								var9 = var13;
							}

							if (var17 > var23) {
								var13 = var17;
								var17 = var23;
								var23 = var13;
							}

							var14.anInt1947 = var3 + var15;
							var14.anInt1936 = var15 + var9;
							var14.anInt1938 = var17 + var21;
							var14.anInt1944 = var21 + var23;
						}
					}
				}

				int var42;
				if (client.incomingMessage == 49) {
					var35 = client.gameBuffer.method564();
					var39 = Class8.anInt89 + ((var35 >> 4) & 7);
					var4 = Class109_Sub21_Sub13.anInt1544 + (var35 & 7);
					var5 = var39 + client.gameBuffer.method612();
					var6 = var4 + client.gameBuffer.method612();
					var0 = client.gameBuffer.method575();
					var8 = client.gameBuffer.readShort();
					var16 = client.gameBuffer.method564() * 4;
					var42 = client.gameBuffer.method564() * 4;
					var41 = client.gameBuffer.readShort();
					var22 = client.gameBuffer.readShort();
					var20 = client.gameBuffer.method564();
					var15 = client.gameBuffer.method564();
					if ((var39 >= 0) && (var4 >= 0) && (var39 < 104) && (var4 < 104) && (var5 >= 0) && (var6 >= 0)
							&& (var5 < 104) && (var6 < 104) && (var8 != '\uffff')) {
						var39 = (128 * var39) + 64;
						var4 = (128 * var4) + 64;
						var5 = (var5 * 128) + 64;
						var6 = (128 * var6) + 64;
						final Class109_Sub21_Sub15_Sub5 var24 = new Class109_Sub21_Sub15_Sub5(var8, Class77.anInt616,
								var39, var4, Class41.method174(var39, var4, Class77.anInt616) - var16,
								var41 + client.anInt1979, client.anInt1979 + var22, var20, var15, var0, var42);
						var24.method958(var5, var6, Class41.method174(var5, var6, Class77.anInt616) - var42,
								client.anInt1979 + var41);
						client.aClass126_2197.method450(var24);
					}

				} else if (client.incomingMessage == 241) {
					var35 = client.gameBuffer.method564();
					var39 = Class8.anInt89 + ((var35 >> 4) & 7);
					var4 = (var35 & 7) + Class109_Sub21_Sub13.anInt1544;
					var5 = client.gameBuffer.method564();
					var6 = var5 >> 2;
					var0 = var5 & 3;
					var8 = client.anIntArray2030[var6];
					if ((var39 >= 0) && (var4 >= 0) && (var39 < 104) && (var4 < 104))
						Class109_Sub21_Sub19.method888(Class77.anInt616, var39, var4, var8, -1, var6, var0, 0, -1);

				} else if (client.incomingMessage == 215) {
					var35 = client.gameBuffer.readShort();
					var39 = client.gameBuffer.readByteS();
					var4 = ((var39 >> 4) & 7) + Class8.anInt89;
					var5 = (var39 & 7) + Class109_Sub21_Sub13.anInt1544;
					var6 = client.gameBuffer.method584();
					var0 = var6 >> 2;
					var8 = var6 & 3;
					var16 = client.anIntArray2030[var0];
					if ((var4 >= 0) && (var5 >= 0) && (var4 < 104) && (var5 < 104))
						Class109_Sub21_Sub19.method888(Class77.anInt616, var4, var5, var16, var35, var0, var8, 0, -1);

				} else {
					Class109_Sub21_Sub15_Sub1 var2;
					if (client.incomingMessage == 205) {
						var35 = client.gameBuffer.method564();
						var39 = ((var35 >> 4) & 7) + Class8.anInt89;
						var4 = Class109_Sub21_Sub13.anInt1544 + (var35 & 7);
						var5 = client.gameBuffer.readShort();
						var6 = client.gameBuffer.readLEShortA();
						if ((var39 >= 0) && (var4 >= 0) && (var39 < 104) && (var4 < 104)) {
							var2 = new Class109_Sub21_Sub15_Sub1();
							var2.anInt1638 = var6;
							var2.anInt1637 = var5;
							if (client.aClass126ArrayArrayArray2121[Class77.anInt616][var39][var4] == null)
								client.aClass126ArrayArrayArray2121[Class77.anInt616][var39][var4] = new Class126();

							client.aClass126ArrayArrayArray2121[Class77.anInt616][var39][var4].method450(var2);
							Class109_Sub21_Sub15_Sub3_Sub1.method1035(var39, var4);
						}

					} else {
						if (client.incomingMessage == 116) {
							var35 = client.gameBuffer.method564();
							var39 = Class8.anInt89 + ((var35 >> 4) & 7);
							var4 = (var35 & 7) + Class109_Sub21_Sub13.anInt1544;
							var5 = client.gameBuffer.readShort();
							var6 = client.gameBuffer.method564();
							var0 = (var6 >> 4) & 15;
							var8 = var6 & 7;
							var16 = client.gameBuffer.method564();
							if ((var39 >= 0) && (var4 >= 0) && (var39 < 104) && (var4 < 104)) {
								var42 = 1 + var0;
								if ((Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1655[0] >= (var39
										- var42))
										&& (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1655[0] <= (var42
												+ var39))
										&& (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1706[0] >= (var4
												- var42))
										&& (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1706[0] <= (var42
												+ var4))
										&& (client.anInt2199 != 0) && (var8 > 0) && (client.anInt2212 < 50)) {
									client.anIntArray2213[client.anInt2212] = var5;
									client.anIntArray2214[client.anInt2212] = var8;
									client.anIntArray2248[client.anInt2212] = var16;
									client.aClass11Array2217[client.anInt2212] = null;
									client.anIntArray2216[client.anInt2212] = var0 + (var4 << 8) + (var39 << 16);
									++client.anInt2212;
								}
							}
						}

						if (client.incomingMessage == 83) {
							var35 = client.gameBuffer.readByteN();
							var39 = Class8.anInt89 + ((var35 >> 4) & 7);
							var4 = (var35 & 7) + Class109_Sub21_Sub13.anInt1544;
							var5 = client.gameBuffer.readLEShort();
							if ((var39 >= 0) && (var4 >= 0) && (var39 < 104) && (var4 < 104)) {
								final Class126 var1 = client.aClass126ArrayArrayArray2121[Class77.anInt616][var39][var4];
								if (var1 != null) {
									for (var2 = (Class109_Sub21_Sub15_Sub1) var1
											.method458(); null != var2; var2 = (Class109_Sub21_Sub15_Sub1) var1
													.method449())
										if (var2.anInt1638 == (var5 & 32767)) {
											var2.method413();
											break;
										}

									if (var1.method458() == null)
										client.aClass126ArrayArrayArray2121[Class77.anInt616][var39][var4] = null;

									Class109_Sub21_Sub15_Sub3_Sub1.method1035(var39, var4);
								}
							}

						}
					}
				}
			}
		}
	}
}
