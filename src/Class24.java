public class Class24 {
	static Class109_Sub21_Sub14_Sub2[] aClass109_Sub21_Sub14_Sub2Array221;
	static int anInt222;

	public static int method104(final String var0) {
		return var0.length() + 2;
	}

	static final void method105(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final Class42 var6, final Class138 var7) {
		if (client.aBool2065 && ((Class27.aByteArrayArrayArray243[0][var1][var2] & 2) == 0)) {
			if ((Class27.aByteArrayArrayArray243[var0][var1][var2] & 16) != 0)
				return;

			int var11;
			if ((Class27.aByteArrayArrayArray243[var0][var1][var2] & 8) != 0)
				var11 = 0;
			else if ((var0 > 0) && ((Class27.aByteArrayArrayArray243[1][var1][var2] & 2) != 0))
				var11 = var0 - 1;
			else
				var11 = var0;

			if (var11 != client.anInt2022)
				return;
		}

		if (var0 < Class27.anInt245)
			Class27.anInt245 = var0;

		final Class109_Sub21_Sub10 var9 = Class28.method128(var3);
		int var16;
		int var17;
		if ((var4 != 1) && (var4 != 3)) {
			var16 = var9.anInt1440;
			var17 = var9.anInt1435;
		} else {
			var16 = var9.anInt1435;
			var17 = var9.anInt1440;
		}

		int var18;
		int var19;
		if ((var1 + var16) <= 104) {
			var18 = var1 + (var16 >> 1);
			var19 = var1 + ((1 + var16) >> 1);
		} else {
			var18 = var1;
			var19 = 1 + var1;
		}

		int var21;
		int var22;
		if ((var17 + var2) <= 104) {
			var21 = var2 + (var17 >> 1);
			var22 = ((1 + var17) >> 1) + var2;
		} else {
			var21 = var2;
			var22 = var2 + 1;
		}

		final int[][] var23 = Class27.anIntArrayArrayArray251[var0];
		final int var12 = (var23[var19][var22] + var23[var19][var21] + var23[var18][var21] + var23[var18][var22]) >> 2;
		final int var24 = (var1 << 7) + (var16 << 6);
		final int var26 = (var17 << 6) + (var2 << 7);
		int var14 = 1073741824 + (var2 << 7) + var1 + (var3 << 14);
		if (var9.anInt1424 == 0)
			var14 -= Integer.MIN_VALUE;

		int var10 = (var4 << 6) + var5;
		if (var9.anInt1463 == 1)
			var10 += 256;

		if (var9.method730())
			Class1.method16(var0, var1, var2, var9, var4);

		Object var13;
		if (var5 == 22) {
			if (!client.aBool2065 || (var9.anInt1424 != 0) || (var9.anInt1438 == 1) || var9.aBool1461) {
				if ((var9.anInt1446 == -1) && (var9.anIntArray1464 == null))
					var13 = var9.method733(22, var4, var23, var24, var12, var26);
				else
					var13 = new Class109_Sub21_Sub15_Sub6(var3, 22, var4, var0, var1, var2, var9.anInt1446, true,
							(Class109_Sub21_Sub15) null);

				var6.method182(var0, var1, var2, var12, (Class109_Sub21_Sub15) var13, var14, var10);
				if ((var9.anInt1438 == 1) && (var7 != null))
					var7.method487(var1, var2);

			}
		} else {
			int var27;
			if ((var5 != 10) && (var5 != 11)) {
				if (var5 >= 12) {
					if ((var9.anInt1446 == -1) && (null == var9.anIntArray1464))
						var13 = var9.method733(var5, var4, var23, var24, var12, var26);
					else
						var13 = new Class109_Sub21_Sub15_Sub6(var3, var5, var4, var0, var1, var2, var9.anInt1446, true,
								(Class109_Sub21_Sub15) null);

					var6.method185(var0, var1, var2, var12, 1, 1, (Class109_Sub21_Sub15) var13, 0, var14, var10);
					if ((var5 >= 12) && (var5 <= 17) && (var5 != 13) && (var0 > 0))
						Class33.anIntArrayArrayArray322[var0][var1][var2] |= 2340;

					if ((var9.anInt1438 != 0) && (null != var7))
						var7.method486(var1, var2, var16, var17, var9.aBool1450);

				} else if (var5 == 0) {
					if ((var9.anInt1446 == -1) && (null == var9.anIntArray1464))
						var13 = var9.method733(0, var4, var23, var24, var12, var26);
					else
						var13 = new Class109_Sub21_Sub15_Sub6(var3, 0, var4, var0, var1, var2, var9.anInt1446, true,
								(Class109_Sub21_Sub15) null);

					var6.method183(var0, var1, var2, var12, (Class109_Sub21_Sub15) var13, (Class109_Sub21_Sub15) null,
							Class27.anIntArray248[var4], 0, var14, var10);
					if (var4 == 0) {
						if (var9.aBool1443) {
							Class27.aByteArrayArrayArray257[var0][var1][var2] = 50;
							Class27.aByteArrayArrayArray257[var0][var1][var2 + 1] = 50;
						}

						if (var9.aBool1445)
							Class33.anIntArrayArrayArray322[var0][var1][var2] |= 585;
					} else if (var4 == 1) {
						if (var9.aBool1443) {
							Class27.aByteArrayArrayArray257[var0][var1][1 + var2] = 50;
							Class27.aByteArrayArrayArray257[var0][1 + var1][1 + var2] = 50;
						}

						if (var9.aBool1445)
							Class33.anIntArrayArrayArray322[var0][var1][var2 + 1] |= 1170;
					} else if (var4 == 2) {
						if (var9.aBool1443) {
							Class27.aByteArrayArrayArray257[var0][var1 + 1][var2] = 50;
							Class27.aByteArrayArrayArray257[var0][1 + var1][var2 + 1] = 50;
						}

						if (var9.aBool1445)
							Class33.anIntArrayArrayArray322[var0][var1 + 1][var2] |= 585;
					} else if (var4 == 3) {
						if (var9.aBool1443) {
							Class27.aByteArrayArrayArray257[var0][var1][var2] = 50;
							Class27.aByteArrayArrayArray257[var0][var1 + 1][var2] = 50;
						}

						if (var9.aBool1445)
							Class33.anIntArrayArrayArray322[var0][var1][var2] |= 1170;
					}

					if ((var9.anInt1438 != 0) && (var7 != null))
						var7.method485(var1, var2, var5, var4, var9.aBool1450);

					if (var9.anInt1448 != 16)
						var6.method203(var0, var1, var2, var9.anInt1448);

				} else if (var5 == 1) {
					if ((var9.anInt1446 == -1) && (var9.anIntArray1464 == null))
						var13 = var9.method733(1, var4, var23, var24, var12, var26);
					else
						var13 = new Class109_Sub21_Sub15_Sub6(var3, 1, var4, var0, var1, var2, var9.anInt1446, true,
								(Class109_Sub21_Sub15) null);

					var6.method183(var0, var1, var2, var12, (Class109_Sub21_Sub15) var13, (Class109_Sub21_Sub15) null,
							Class27.anIntArray249[var4], 0, var14, var10);
					if (var9.aBool1443)
						if (var4 == 0)
							Class27.aByteArrayArrayArray257[var0][var1][var2 + 1] = 50;
						else if (var4 == 1)
							Class27.aByteArrayArrayArray257[var0][1 + var1][1 + var2] = 50;
						else if (var4 == 2)
							Class27.aByteArrayArrayArray257[var0][1 + var1][var2] = 50;
						else if (var4 == 3)
							Class27.aByteArrayArrayArray257[var0][var1][var2] = 50;

					if ((var9.anInt1438 != 0) && (var7 != null))
						var7.method485(var1, var2, var5, var4, var9.aBool1450);

				} else {
					int var8;
					Object var20;
					if (var5 == 2) {
						var8 = (var4 + 1) & 3;
						Object var28;
						if ((var9.anInt1446 == -1) && (null == var9.anIntArray1464)) {
							var28 = var9.method733(2, var4 + 4, var23, var24, var12, var26);
							var20 = var9.method733(2, var8, var23, var24, var12, var26);
						} else {
							var28 = new Class109_Sub21_Sub15_Sub6(var3, 2, var4 + 4, var0, var1, var2, var9.anInt1446,
									true, (Class109_Sub21_Sub15) null);
							var20 = new Class109_Sub21_Sub15_Sub6(var3, 2, var8, var0, var1, var2, var9.anInt1446, true,
									(Class109_Sub21_Sub15) null);
						}

						var6.method183(var0, var1, var2, var12, (Class109_Sub21_Sub15) var28,
								(Class109_Sub21_Sub15) var20, Class27.anIntArray248[var4], Class27.anIntArray248[var8],
								var14, var10);
						if (var9.aBool1445)
							if (var4 == 0) {
								Class33.anIntArrayArrayArray322[var0][var1][var2] |= 585;
								Class33.anIntArrayArrayArray322[var0][var1][var2 + 1] |= 1170;
							} else if (var4 == 1) {
								Class33.anIntArrayArrayArray322[var0][var1][1 + var2] |= 1170;
								Class33.anIntArrayArrayArray322[var0][1 + var1][var2] |= 585;
							} else if (var4 == 2) {
								Class33.anIntArrayArrayArray322[var0][1 + var1][var2] |= 585;
								Class33.anIntArrayArrayArray322[var0][var1][var2] |= 1170;
							} else if (var4 == 3) {
								Class33.anIntArrayArrayArray322[var0][var1][var2] |= 1170;
								Class33.anIntArrayArrayArray322[var0][var1][var2] |= 585;
							}

						if ((var9.anInt1438 != 0) && (var7 != null))
							var7.method485(var1, var2, var5, var4, var9.aBool1450);

						if (var9.anInt1448 != 16)
							var6.method203(var0, var1, var2, var9.anInt1448);

					} else if (var5 == 3) {
						if ((var9.anInt1446 == -1) && (var9.anIntArray1464 == null))
							var13 = var9.method733(3, var4, var23, var24, var12, var26);
						else
							var13 = new Class109_Sub21_Sub15_Sub6(var3, 3, var4, var0, var1, var2, var9.anInt1446, true,
									(Class109_Sub21_Sub15) null);

						var6.method183(var0, var1, var2, var12, (Class109_Sub21_Sub15) var13,
								(Class109_Sub21_Sub15) null, Class27.anIntArray249[var4], 0, var14, var10);
						if (var9.aBool1443)
							if (var4 == 0)
								Class27.aByteArrayArrayArray257[var0][var1][var2 + 1] = 50;
							else if (var4 == 1)
								Class27.aByteArrayArrayArray257[var0][var1 + 1][1 + var2] = 50;
							else if (var4 == 2)
								Class27.aByteArrayArrayArray257[var0][var1 + 1][var2] = 50;
							else if (var4 == 3)
								Class27.aByteArrayArrayArray257[var0][var1][var2] = 50;

						if ((var9.anInt1438 != 0) && (var7 != null))
							var7.method485(var1, var2, var5, var4, var9.aBool1450);

					} else if (var5 == 9) {
						if ((var9.anInt1446 == -1) && (null == var9.anIntArray1464))
							var13 = var9.method733(var5, var4, var23, var24, var12, var26);
						else
							var13 = new Class109_Sub21_Sub15_Sub6(var3, var5, var4, var0, var1, var2, var9.anInt1446,
									true, (Class109_Sub21_Sub15) null);

						var6.method185(var0, var1, var2, var12, 1, 1, (Class109_Sub21_Sub15) var13, 0, var14, var10);
						if ((var9.anInt1438 != 0) && (null != var7))
							var7.method486(var1, var2, var16, var17, var9.aBool1450);

						if (var9.anInt1448 != 16)
							var6.method203(var0, var1, var2, var9.anInt1448);

					} else if (var5 == 4) {
						if ((var9.anInt1446 == -1) && (null == var9.anIntArray1464))
							var13 = var9.method733(4, var4, var23, var24, var12, var26);
						else
							var13 = new Class109_Sub21_Sub15_Sub6(var3, 4, var4, var0, var1, var2, var9.anInt1446, true,
									(Class109_Sub21_Sub15) null);

						var6.method184(var0, var1, var2, var12, (Class109_Sub21_Sub15) var13,
								(Class109_Sub21_Sub15) null, Class27.anIntArray248[var4], 0, 0, 0, var14, var10);
					} else if (var5 == 5) {
						var8 = 16;
						var27 = var6.method197(var0, var1, var2);
						if (var27 != 0)
							var8 = Class28.method128((var27 >> 14) & 32767).anInt1448;

						if ((var9.anInt1446 == -1) && (null == var9.anIntArray1464))
							var20 = var9.method733(4, var4, var23, var24, var12, var26);
						else
							var20 = new Class109_Sub21_Sub15_Sub6(var3, 4, var4, var0, var1, var2, var9.anInt1446, true,
									(Class109_Sub21_Sub15) null);

						var6.method184(var0, var1, var2, var12, (Class109_Sub21_Sub15) var20,
								(Class109_Sub21_Sub15) null, Class27.anIntArray248[var4], 0,
								var8 * Class27.anIntArray250[var4], var8 * Class27.anIntArray247[var4], var14, var10);
					} else if (var5 == 6) {
						var8 = 8;
						var27 = var6.method197(var0, var1, var2);
						if (var27 != 0)
							var8 = Class28.method128((var27 >> 14) & 32767).anInt1448 / 2;

						if ((var9.anInt1446 == -1) && (null == var9.anIntArray1464))
							var20 = var9.method733(4, var4 + 4, var23, var24, var12, var26);
						else
							var20 = new Class109_Sub21_Sub15_Sub6(var3, 4, var4 + 4, var0, var1, var2, var9.anInt1446,
									true, (Class109_Sub21_Sub15) null);

						var6.method184(var0, var1, var2, var12, (Class109_Sub21_Sub15) var20,
								(Class109_Sub21_Sub15) null, 256, var4, var8 * Class27.anIntArray252[var4],
								Class27.anIntArray253[var4] * var8, var14, var10);
					} else if (var5 == 7) {
						var27 = (var4 + 2) & 3;
						if ((var9.anInt1446 == -1) && (var9.anIntArray1464 == null))
							var13 = var9.method733(4, var27 + 4, var23, var24, var12, var26);
						else
							var13 = new Class109_Sub21_Sub15_Sub6(var3, 4, var27 + 4, var0, var1, var2, var9.anInt1446,
									true, (Class109_Sub21_Sub15) null);

						var6.method184(var0, var1, var2, var12, (Class109_Sub21_Sub15) var13,
								(Class109_Sub21_Sub15) null, 256, var27, 0, 0, var14, var10);
					} else if (var5 == 8) {
						var8 = 8;
						var27 = var6.method197(var0, var1, var2);
						if (var27 != 0)
							var8 = Class28.method128((var27 >> 14) & 32767).anInt1448 / 2;

						final int var15 = (2 + var4) & 3;
						Object var30;
						if ((var9.anInt1446 == -1) && (null == var9.anIntArray1464)) {
							var20 = var9.method733(4, 4 + var4, var23, var24, var12, var26);
							var30 = var9.method733(4, 4 + var15, var23, var24, var12, var26);
						} else {
							var20 = new Class109_Sub21_Sub15_Sub6(var3, 4, 4 + var4, var0, var1, var2, var9.anInt1446,
									true, (Class109_Sub21_Sub15) null);
							var30 = new Class109_Sub21_Sub15_Sub6(var3, 4, 4 + var15, var0, var1, var2, var9.anInt1446,
									true, (Class109_Sub21_Sub15) null);
						}

						var6.method184(var0, var1, var2, var12, (Class109_Sub21_Sub15) var20,
								(Class109_Sub21_Sub15) var30, 256, var4, Class27.anIntArray252[var4] * var8,
								Class27.anIntArray253[var4] * var8, var14, var10);
					}
				}
			} else {
				if ((var9.anInt1446 == -1) && (null == var9.anIntArray1464))
					var13 = var9.method733(10, var4, var23, var24, var12, var26);
				else
					var13 = new Class109_Sub21_Sub15_Sub6(var3, 10, var4, var0, var1, var2, var9.anInt1446, true,
							(Class109_Sub21_Sub15) null);

				if ((var13 != null) && var6.method185(var0, var1, var2, var12, var16, var17,
						(Class109_Sub21_Sub15) var13, var5 == 11 ? 256 : 0, var14, var10) && var9.aBool1443) {
					var27 = 15;
					if (var13 instanceof Class109_Sub21_Sub15_Sub4) {
						var27 = ((Class109_Sub21_Sub15_Sub4) var13).method939() / 4;
						if (var27 > 30)
							var27 = 30;
					}

					for (int var25 = 0; var25 <= var16; ++var25)
						for (int var29 = 0; var29 <= var17; ++var29)
							if (var27 > Class27.aByteArrayArrayArray257[var0][var1 + var25][var2 + var29])
								Class27.aByteArrayArrayArray257[var0][var1 + var25][var29 + var2] = (byte) var27;
				}

				if ((var9.anInt1438 != 0) && (var7 != null))
					var7.method486(var1, var2, var16, var17, var9.aBool1450);

			}
		}
	}

	public static boolean method106(final int var0) {
		return ((var0 >> 28) & 1) != 0;
	}

	static final void method107() {
		for (int var0 = 0; var0 < client.anInt2089; ++var0) {
			final int var2 = client.anIntArray2186[var0];
			final Class109_Sub21_Sub15_Sub3_Sub1 var1 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var2];
			final int var5 = client.gameBuffer.method564();
			int var3;
			int var4;
			if ((var5 & 16) != 0) {
				var3 = client.gameBuffer.readByteN();
				var4 = client.gameBuffer.method564();
				var1.method898(var3, var4, client.anInt1979);
				var1.anInt1674 = client.anInt1979 + 300;
				var1.anInt1675 = client.gameBuffer.readLEShort();
				var1.anInt1662 = client.gameBuffer.readShort();
			}

			if ((var5 & 2) != 0) {
				var1.anInt1688 = client.gameBuffer.readShort();
				var3 = client.gameBuffer.method614();
				var1.anInt1692 = var3 >> 16;
				var1.anInt1691 = client.anInt1979 + (var3 & '\uffff');
				var1.anInt1676 = 0;
				var1.anInt1701 = 0;
				if (var1.anInt1691 > client.anInt1979)
					var1.anInt1676 = -1;

				if (var1.anInt1688 == '\uffff')
					var1.anInt1688 = -1;
			}

			if ((var5 & 128) != 0) {
				var1.aClass109_Sub21_Sub13_1925 = Class122.method444(client.gameBuffer.readLEShort());
				var1.anInt1656 = var1.aClass109_Sub21_Sub13_1925.anInt1514;
				var1.anInt1686 = var1.aClass109_Sub21_Sub13_1925.anInt1537;
				var1.anInt1660 = var1.aClass109_Sub21_Sub13_1925.anInt1520;
				var1.anInt1661 = var1.aClass109_Sub21_Sub13_1925.anInt1521;
				var1.anInt1678 = var1.aClass109_Sub21_Sub13_1925.anInt1522;
				var1.anInt1696 = var1.aClass109_Sub21_Sub13_1925.anInt1543;
				var1.anInt1657 = var1.aClass109_Sub21_Sub13_1925.anInt1517;
				var1.anInt1658 = var1.aClass109_Sub21_Sub13_1925.anInt1529;
				var1.anInt1659 = var1.aClass109_Sub21_Sub13_1925.anInt1519;
			}

			if ((var5 & 64) != 0) {
				var3 = client.gameBuffer.readByteN();
				var4 = client.gameBuffer.method584();
				var1.method898(var3, var4, client.anInt1979);
				var1.anInt1674 = client.anInt1979 + 300;
				var1.anInt1675 = client.gameBuffer.readLEShort();
				var1.anInt1662 = client.gameBuffer.readLEShortA();
			}

			if ((var5 & 32) != 0) {
				var3 = client.gameBuffer.readLEShortA();
				if (var3 == '\uffff')
					var3 = -1;

				var4 = client.gameBuffer.method564();
				if ((var3 == var1.anInt1683) && (var3 != -1)) {
					final int var6 = Class109_Sub21_Sub18.method849(var3, -52588102).anInt1404;
					if (var6 == 1) {
						var1.anInt1684 = 0;
						var1.anInt1685 = 0;
						var1.anInt1689 = var4;
						var1.anInt1687 = 0;
					}

					if (var6 == 2)
						var1.anInt1687 = 0;
				} else if ((var3 == -1) || (var1.anInt1683 == -1)
						|| (Class109_Sub21_Sub18.method849(var3, 1551758411).anInt1390 >= Class109_Sub21_Sub18
								.method849(var1.anInt1683, 1523569296).anInt1390)) {
					var1.anInt1683 = var3;
					var1.anInt1684 = 0;
					var1.anInt1685 = 0;
					var1.anInt1689 = var4;
					var1.anInt1687 = 0;
					var1.anInt1709 = var1.anInt1705;
				}
			}

			if ((var5 & 4) != 0) {
				var1.anInt1664 = client.gameBuffer.readShortA();
				var1.anInt1665 = client.gameBuffer.readLEShortA();
			}

			if ((var5 & 8) != 0) {
				var1.anInt1677 = client.gameBuffer.readShortA();
				if (var1.anInt1677 == '\uffff')
					var1.anInt1677 = -1;
			}

			if ((var5 & 1) != 0) {
				var1.aString1702 = client.gameBuffer.method602();
				var1.anInt1668 = 100;
			}
		}

	}

	static void method108(final int var0, final int var1) {
		final int[] var2 = new int[4];
		final int[] var4 = new int[4];
		var2[0] = var0;
		var4[0] = var1;
		int var3 = 1;

		for (int var5 = 0; var5 < 4; ++var5)
			if (Class46.anIntArray484[var5] != var0) {
				var2[var3] = Class46.anIntArray484[var5];
				var4[var3] = Class46.anIntArray483[var5];
				++var3;
			}

		Class46.anIntArray484 = var2;
		Class46.anIntArray483 = var4;
		Class109_Sub21_Sub8.method717(Class46.aClass46Array485, 0, Class46.aClass46Array485.length - 1,
				Class46.anIntArray484, Class46.anIntArray483);
	}

	static int method109(final int var0) {
		final Class109_Sub21_Sub9 var1 = (Class109_Sub21_Sub9) Class35.aClass125_331.method448(var0);
		return var1 == null ? -1
				: (var1.aClass109_Sub21_1280 == Class35.aClass121_333.aClass109_Sub21_846 ? -1
						: ((Class109_Sub21_Sub9) var1.aClass109_Sub21_1280).anInt1419);
	}

	public static void method110() {
		if (Class63.aClass63_573 != null) {
			final Class63 var0 = Class63.aClass63_573;
			synchronized (var0) {
				Class63.aClass63_573 = null;
			}
		}

	}

	static final int method111(final int var0, int var1, final int var2) {
		if (var2 > 179)
			var1 /= 2;

		if (var2 > 192)
			var1 /= 2;

		if (var2 > 217)
			var1 /= 2;

		if (var2 > 243)
			var1 /= 2;

		final int var3 = (var2 / 2) + ((var1 / 32) << 7) + ((var0 / 4) << 10);
		return var3;
	}
}
