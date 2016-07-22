import java.util.Random;

public abstract class Class109_Sub21_Sub14_Sub4 extends Class109_Sub21_Sub14 {
	public static Class109_Sub21_Sub14_Sub1[] aClass109_Sub21_Sub14_Sub1Array1910;
	int[] anIntArray1912;
	public int anInt1907 = 0;
	byte[] aByteArray1911;
	static int anInt1919 = 0;
	static int anInt1904 = 256;
	static int anInt1908 = -1;
	static int anInt1913 = -1;
	static int anInt1914 = -1;
	static int anInt1901 = -1;
	static int anInt1916 = 0;
	static int anInt1917 = 0;
	static int anInt1920 = 0;
	static Random aRandom1921 = new Random();
	static String[] aStringArray1922 = new String[100];
	byte[][] aByteArrayArray1902 = new byte[256][];
	int[] anIntArray1915;
	int[] anIntArray1906;
	int[] anIntArray1903;
	int[] anIntArray1918;
	int anInt1905;
	int anInt1909;

	static void method1008(final byte[] var0, int var1, int var2, int var3, int var4, final int var5) {
		int var6 = var1 + (var2 * anInt1553);
		int var10 = anInt1553 - var3;
		int var7 = 0;
		int var8 = 0;
		int var9;
		if (var2 < anInt1555) {
			var9 = anInt1555 - var2;
			var4 -= var9;
			var2 = anInt1555;
			var8 += var9 * var3;
			var6 += var9 * anInt1553;
		}

		if ((var2 + var4) > anInt1556)
			var4 -= (var2 + var4) - anInt1556;

		if (var1 < anInt1557) {
			var9 = anInt1557 - var1;
			var3 -= var9;
			var1 = anInt1557;
			var8 += var9;
			var6 += var9;
			var7 += var9;
			var10 += var9;
		}

		if ((var1 + var3) > anInt1552) {
			var9 = (var1 + var3) - anInt1552;
			var3 -= var9;
			var7 += var9;
			var10 += var9;
		}

		if ((var3 > 0) && (var4 > 0))
			method1028(anIntArray1558, var0, var5, var8, var6, var3, var4, var10, var7);
	}

	void method1009(final byte[] var1) {
		anIntArray1912 = new int[256];
		int var5;
		if (var1.length == 257) {
			for (var5 = 0; var5 < anIntArray1912.length; ++var5)
				anIntArray1912[var5] = var1[var5] & 255;

			anInt1907 = var1[256] & 255;
		} else {
			var5 = 0;

			for (int var8 = 0; var8 < 256; ++var8)
				anIntArray1912[var8] = var1[var5++] & 255;

			final int[] var9 = new int[256];
			final int[] var6 = new int[256];

			int var7;
			for (var7 = 0; var7 < 256; ++var7)
				var9[var7] = var1[var5++] & 255;

			for (var7 = 0; var7 < 256; ++var7)
				var6[var7] = var1[var5++] & 255;

			final byte[][] var3 = new byte[256][];

			int var2;
			for (int var4 = 0; var4 < 256; ++var4) {
				var3[var4] = new byte[var9[var4]];
				byte var10 = 0;

				for (var2 = 0; var2 < var3[var4].length; ++var2) {
					var10 += var1[var5++];
					var3[var4][var2] = var10;
				}
			}

			final byte[][] var11 = new byte[256][];

			int var14;
			for (var14 = 0; var14 < 256; ++var14) {
				var11[var14] = new byte[var9[var14]];
				byte var13 = 0;

				for (int var12 = 0; var12 < var11[var14].length; ++var12) {
					var13 += var1[var5++];
					var11[var14][var12] = var13;
				}
			}

			aByteArray1911 = new byte[65536];

			for (var14 = 0; var14 < 256; ++var14)
				if ((var14 != 32) && (var14 != 160))
					for (var2 = 0; var2 < 256; ++var2)
						if ((var2 != 32) && (var2 != 160))
							aByteArray1911[(var14 << 8) + var2] = (byte) method1034(var3, var11, var6, anIntArray1912,
									var9, var14, var2);

			anInt1907 = var6[32] + var9[32];
		}

	}

	public int method1010(final String var1) {
		if (var1 == null)
			return 0;
		else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); ++var5) {
				char var6 = var1.charAt(var5);
				if (var6 == 60)
					var2 = var5;
				else {
					if ((var6 == 62) && (var2 != -1)) {
						final String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt"))
							var6 = 60;
						else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img="))
									try {
										final String var8 = var7.substring(4);
										final int var9 = Class50.method252(var8, 10, true);
										var4 += aClass109_Sub21_Sub14_Sub1Array1910[var9].anInt1712;
										var3 = -1;
									} catch (final Exception var12) {
										;
									}
								continue;
							}

							var6 = 62;
						}
					}

					if (var6 == 160)
						var6 = 32;

					if (var2 == -1) {
						var4 += anIntArray1912[(char) (Class109_Sub15.method624(var6) & 255)];
						if ((aByteArray1911 != null) && (var3 != -1))
							var4 += aByteArray1911[(var3 << 8) + var6];

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	public int method1011(final String var1, final int var2) {
		final int var3 = method1031(var1, new int[] { var2 }, aStringArray1922);
		int var6 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			final int var5 = method1010(aStringArray1922[var4]);
			if (var5 > var6)
				var6 = var5;
		}

		return var6;
	}

	public int method1012(final String var1, final int var2) {
		return method1031(var1, new int[] { var2 }, aStringArray1922);
	}

	public static String method1013(final String var0) {
		final int var1 = var0.length();
		int var6 = 0;

		for (int var2 = 0; var2 < var1; ++var2) {
			final char var5 = var0.charAt(var2);
			if ((var5 == 60) || (var5 == 62))
				var6 += 3;
		}

		final StringBuilder var3 = new StringBuilder(var1 + var6);

		for (int var7 = 0; var7 < var1; ++var7) {
			final char var4 = var0.charAt(var7);
			if (var4 == 60)
				var3.append("<lt>");
			else if (var4 == 62)
				var3.append("<gt>");
			else
				var3.append(var4);
		}

		return var3.toString();
	}

	public void method1014(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method1022(var4, var5);
			method1024(var1, var2, var3);
		}
	}

	public void method1015(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method1022(var4, var5);
			method1024(var1, var2 - method1010(var1), var3);
		}
	}

	public void method1016(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method1022(var4, var5);
			method1024(var1, var2 - (method1010(var1) / 2), var3);
		}
	}

	public int method1017(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, int var9, int var10) {
		if (var1 == null)
			return 0;
		else {
			method1022(var6, var7);
			if (var10 == 0)
				var10 = anInt1907;

			int[] var12 = new int[] { var4 };
			if ((var5 < (anInt1905 + anInt1909 + var10)) && (var5 < (var10 + var10)))
				var12 = null;

			final int var14 = method1031(var1, var12, aStringArray1922);
			if ((var9 == 3) && (var14 == 1))
				var9 = 1;

			int var11;
			int var13;
			if (var9 == 0)
				var13 = var3 + anInt1905;
			else if (var9 == 1)
				var13 = var3 + anInt1905 + ((var5 - anInt1905 - anInt1909 - ((var14 - 1) * var10)) / 2);
			else if (var9 == 2)
				var13 = (var3 + var5) - anInt1909 - ((var14 - 1) * var10);
			else {
				var11 = (var5 - anInt1905 - anInt1909 - ((var14 - 1) * var10)) / (var14 + 1);
				if (var11 < 0)
					var11 = 0;

				var13 = var3 + anInt1905 + var11;
				var10 += var11;
			}

			for (var11 = 0; var11 < var14; ++var11) {
				if (var8 == 0)
					method1024(aStringArray1922[var11], var2, var13);
				else if (var8 == 1)
					method1024(aStringArray1922[var11], var2 + ((var4 - method1010(aStringArray1922[var11])) / 2),
							var13);
				else if (var8 == 2)
					method1024(aStringArray1922[var11], (var2 + var4) - method1010(aStringArray1922[var11]), var13);
				else if (var11 == (var14 - 1))
					method1024(aStringArray1922[var11], var2, var13);
				else {
					method1023(aStringArray1922[var11], var4);
					method1024(aStringArray1922[var11], var2, var13);
					anInt1919 = 0;
				}

				var13 += var10;
			}

			return var14;
		}
	}

	public void method1018(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method1022(var4, var5);
			final int[] var8 = new int[var1.length()];

			for (int var7 = 0; var7 < var1.length(); ++var7)
				var8[var7] = (int) (Math.sin((var7 / 2.0D) + (var6 / 5.0D)) * 5.0D);

			method1025(var1, var2 - (method1010(var1) / 2), var3, (int[]) null, var8);
		}
	}

	public void method1019(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method1022(var4, var5);
			final int[] var7 = new int[var1.length()];
			final int[] var9 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); ++var8) {
				var7[var8] = (int) (Math.sin((var8 / 5.0D) + (var6 / 5.0D)) * 5.0D);
				var9[var8] = (int) (Math.sin((var8 / 3.0D) + (var6 / 5.0D)) * 5.0D);
			}

			method1025(var1, var2 - (method1010(var1) / 2), var3, var7, var9);
		}
	}

	abstract void method1020(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	public void method1021(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method1022(var4, var5);
			aRandom1921.setSeed(var6);
			anInt1904 = 192 + (aRandom1921.nextInt() & 31);
			final int[] var7 = new int[var1.length()];
			int var9 = 0;

			for (int var8 = 0; var8 < var1.length(); ++var8) {
				var7[var8] = var9;
				if ((aRandom1921.nextInt() & 3) == 0)
					++var9;
			}

			method1025(var1, var2, var3, var7, (int[]) null);
		}
	}

	void method1022(final int var1, final int var2) {
		anInt1908 = -1;
		anInt1913 = -1;
		anInt1914 = var2;
		anInt1901 = var2;
		anInt1916 = var1;
		anInt1917 = var1;
		anInt1904 = 256;
		anInt1919 = 0;
		anInt1920 = 0;
	}

	void method1023(final String var1, final int var2) {
		int var3 = 0;
		boolean var6 = false;

		for (int var5 = 0; var5 < var1.length(); ++var5) {
			final char var4 = var1.charAt(var5);
			if (var4 == 60)
				var6 = true;
			else if (var4 == 62)
				var6 = false;
			else if (!var6 && (var4 == 32))
				++var3;
		}

		if (var3 > 0)
			anInt1919 = ((var2 - method1010(var1)) << 8) / var3;

	}

	void method1024(final String var1, int var2, int var3) {
		var3 -= anInt1907;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6)
			if (var1.charAt(var6) != 0) {
				char var7 = (char) (Class109_Sub15.method624(var1.charAt(var6)) & 255);
				if (var7 == 60)
					var4 = var6;
				else {
					int var10;
					if ((var7 == 62) && (var4 != -1)) {
						final String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt"))
							var7 = 60;
						else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img="))
									try {
										final String var9 = var8.substring(4);
										var10 = Class50.method252(var9, 10, true);
										final Class109_Sub21_Sub14_Sub1 var12 = aClass109_Sub21_Sub14_Sub1Array1910[var10];
										var12.method905(var2, (var3 + anInt1907) - var12.anInt1716);
										var2 += var12.anInt1712;
										var5 = -1;
									} catch (final Exception var16) {
										;
									}
								else
									method1033(var8);
								continue;
							}

							var7 = 62;
						}
					}

					if (var7 == 160)
						var7 = 32;

					if (var4 == -1) {
						if ((aByteArray1911 != null) && (var5 != -1))
							var2 += aByteArray1911[(var5 << 8) + var7];

						final int var14 = anIntArray1903[var7];
						var10 = anIntArray1918[var7];
						if (var7 != 32) {
							if (anInt1904 == 256) {
								if (anInt1901 != -1)
									method1008(aByteArrayArray1902[var7], var2 + anIntArray1915[var7] + 1,
											var3 + anIntArray1906[var7] + 1, var14, var10, anInt1901);

								method1020(aByteArrayArray1902[var7], var2 + anIntArray1915[var7],
										var3 + anIntArray1906[var7], var14, var10, anInt1917);
							} else {
								if (anInt1901 != -1)
									method1029(aByteArrayArray1902[var7], var2 + anIntArray1915[var7] + 1,
											var3 + anIntArray1906[var7] + 1, var14, var10, anInt1901, anInt1904);

								method1030(aByteArrayArray1902[var7], var2 + anIntArray1915[var7],
										var3 + anIntArray1906[var7], var14, var10, anInt1917, anInt1904);
							}
						} else if (anInt1919 > 0) {
							anInt1920 += anInt1919;
							var2 += anInt1920 >> 8;
							anInt1920 &= 255;
						}

						final int var15 = anIntArray1912[var7];
						if (anInt1908 != -1)
							method784(var2, var3 + (int) (anInt1907 * 0.7D), var15, anInt1908);

						if (anInt1913 != -1)
							method784(var2, var3 + anInt1907 + 1, var15, anInt1913);

						var2 += var15;
						var5 = var7;
					}
				}
			}

	}

	void method1025(final String var1, int var2, int var3, final int[] var4, final int[] var5) {
		var3 -= anInt1907;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); ++var9)
			if (var1.charAt(var9) != 0) {
				char var10 = (char) (Class109_Sub15.method624(var1.charAt(var9)) & 255);
				if (var10 == 60)
					var6 = var9;
				else {
					int var12;
					int var13;
					int var15;
					if ((var10 == 62) && (var6 != -1)) {
						final String var11 = var1.substring(var6 + 1, var9);
						var6 = -1;
						if (var11.equals("lt"))
							var10 = 60;
						else {
							if (!var11.equals("gt")) {
								if (var11.startsWith("img="))
									try {
										if (var4 != null)
											var12 = var4[var8];
										else
											var12 = 0;

										if (var5 != null)
											var13 = var5[var8];
										else
											var13 = 0;

										++var8;
										final String var14 = var11.substring(4);
										var15 = Class50.method252(var14, 10, true);
										final Class109_Sub21_Sub14_Sub1 var17 = aClass109_Sub21_Sub14_Sub1Array1910[var15];
										var17.method905(var2 + var12, ((var3 + anInt1907) - var17.anInt1716) + var13);
										var2 += var17.anInt1712;
										var7 = -1;
									} catch (final Exception var21) {
										;
									}
								else
									method1033(var11);
								continue;
							}

							var10 = 62;
						}
					}

					if (var10 == 160)
						var10 = 32;

					if (var6 == -1) {
						if ((aByteArray1911 != null) && (var7 != -1))
							var2 += aByteArray1911[(var7 << 8) + var10];

						final int var19 = anIntArray1903[var10];
						var12 = anIntArray1918[var10];
						if (var4 != null)
							var13 = var4[var8];
						else
							var13 = 0;

						if (var5 != null)
							var15 = var5[var8];
						else
							var15 = 0;

						++var8;
						if (var10 != 32) {
							if (anInt1904 == 256) {
								if (anInt1901 != -1)
									method1008(aByteArrayArray1902[var10], var2 + anIntArray1915[var10] + 1 + var13,
											var3 + anIntArray1906[var10] + 1 + var15, var19, var12, anInt1901);

								method1020(aByteArrayArray1902[var10], var2 + anIntArray1915[var10] + var13,
										var3 + anIntArray1906[var10] + var15, var19, var12, anInt1917);
							} else {
								if (anInt1901 != -1)
									method1029(aByteArrayArray1902[var10], var2 + anIntArray1915[var10] + 1 + var13,
											var3 + anIntArray1906[var10] + 1 + var15, var19, var12, anInt1901,
											anInt1904);

								method1030(aByteArrayArray1902[var10], var2 + anIntArray1915[var10] + var13,
										var3 + anIntArray1906[var10] + var15, var19, var12, anInt1917, anInt1904);
							}
						} else if (anInt1919 > 0) {
							anInt1920 += anInt1919;
							var2 += anInt1920 >> 8;
							anInt1920 &= 255;
						}

						final int var20 = anIntArray1912[var10];
						if (anInt1908 != -1)
							method784(var2, var3 + (int) (anInt1907 * 0.7D), var20, anInt1908);

						if (anInt1913 != -1)
							method784(var2, var3 + anInt1907, var20, anInt1913);

						var2 += var20;
						var7 = var10;
					}
				}
			}

	}

	static void method1026(final int[] var0, final byte[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, int var9) {
		var2 = ((((var2 & 16711935) * var9) & -16711936) + (((var2 & '\uff00') * var9) & 16711680)) >> 8;
		var9 = 256 - var9;

		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var10 = -var5; var10 < 0; ++var10)
				if (var1[var3++] != 0) {
					final int var12 = var0[var4];
					var0[var4++] = (((((var12 & 16711935) * var9) & -16711936)
							+ (((var12 & '\uff00') * var9) & 16711680)) >> 8) + var2;
				} else
					++var4;

			var4 += var7;
			var3 += var8;
		}

	}

	int method1027(char var1) {
		if (var1 == 160)
			var1 = 32;

		return anIntArray1912[Class109_Sub15.method624(var1) & 255];
	}

	static void method1028(final int[] var0, final byte[] var1, final int var2, int var3, int var4, int var5,
			final int var6, final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			for (var11 = var5; var11 < 0; ++var11)
				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

			var4 += var7;
			var3 += var8;
		}

	}

	static void method1029(final byte[] var0, int var1, int var2, int var3, int var4, final int var5, final int var6) {
		int var7 = var1 + (var2 * anInt1553);
		int var11 = anInt1553 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < anInt1555) {
			var10 = anInt1555 - var2;
			var4 -= var10;
			var2 = anInt1555;
			var9 += var10 * var3;
			var7 += var10 * anInt1553;
		}

		if ((var2 + var4) > anInt1556)
			var4 -= (var2 + var4) - anInt1556;

		if (var1 < anInt1557) {
			var10 = anInt1557 - var1;
			var3 -= var10;
			var1 = anInt1557;
			var9 += var10;
			var7 += var10;
			var8 += var10;
			var11 += var10;
		}

		if ((var1 + var3) > anInt1552) {
			var10 = (var1 + var3) - anInt1552;
			var3 -= var10;
			var8 += var10;
			var11 += var10;
		}

		if ((var3 > 0) && (var4 > 0))
			method1026(anIntArray1558, var0, var5, var9, var7, var3, var4, var11, var8, var6);
	}

	abstract void method1030(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	int method1031(final String var1, final int[] var2, final String[] var3) {
		if (var1 == null)
			return 0;
		else {
			int var4 = 0;
			int var5 = 0;
			final StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			final int var13 = var1.length();

			for (int var14 = 0; var14 < var13; ++var14) {
				char var15 = var1.charAt(var14);
				if (var15 == 60)
					var10 = var14;
				else {
					if ((var15 == 62) && (var10 != -1)) {
						final String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('\u003c');
						var6.append(var16);
						var6.append('\u003e');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += method1027('\u003c');
							if ((aByteArray1911 != null) && (var11 != -1))
								var4 += aByteArray1911[(var11 << 8) + 60];

							var11 = 60;
						} else if (var16.equals("gt")) {
							var4 += method1027('\u003e');
							if ((aByteArray1911 != null) && (var11 != -1))
								var4 += aByteArray1911[(var11 << 8) + 62];

							var11 = 62;
						} else if (var16.startsWith("img="))
							try {
								final String var17 = var16.substring(4);
								final int var18 = Class50.method252(var17, 10, true);
								var4 += aClass109_Sub21_Sub14_Sub1Array1910[var18].anInt1712;
								var11 = 0;
							} catch (final Exception var22) {
								;
							}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += method1027(var15);
							if ((aByteArray1911 != null) && (var11 != -1))
								var4 += aByteArray1911[(var11 << 8) + var15];

							var11 = var15;
						}

						if (var15 == 32) {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if ((var2 != null) && (var4 > var2[var12 < var2.length ? var12 : var2.length - 1])
								&& (var7 >= 0)) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == 45) {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			final String var21 = var6.toString();
			if (var21.length() > var5)
				var3[var12++] = var21.substring(var5, var21.length());

			return var12;
		}
	}

	public void method1032(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		if (var1 != null) {
			method1022(var4, var5);
			double var10 = 7.0D - (var7 / 8.0D);
			if (var10 < 0.0D)
				var10 = 0.0D;

			final int[] var8 = new int[var1.length()];

			for (int var9 = 0; var9 < var1.length(); ++var9)
				var8[var9] = (int) (Math.sin((var9 / 1.5D) + (var6 / 1.0D)) * var10);

			method1025(var1, var2 - (method1010(var1) / 2), var3, (int[]) null, var8);
		}
	}

	void method1033(final String var1) {
		try {
			if (var1.startsWith("col="))
				anInt1917 = Class109_Sub21_Sub15_Sub3.method902(var1.substring(4), 16);
			else if (var1.equals("/col"))
				anInt1917 = anInt1916;
			else if (var1.startsWith("str="))
				anInt1908 = Class109_Sub21_Sub15_Sub3.method902(var1.substring(4), 16);
			else if (var1.equals("str"))
				anInt1908 = 8388608;
			else if (var1.equals("/str"))
				anInt1908 = -1;
			else if (var1.startsWith("u="))
				anInt1913 = Class109_Sub21_Sub15_Sub3.method902(var1.substring(2), 16);
			else if (var1.equals("u"))
				anInt1913 = 0;
			else if (var1.equals("/u"))
				anInt1913 = -1;
			else if (var1.startsWith("shad="))
				anInt1901 = Class109_Sub21_Sub15_Sub3.method902(var1.substring(5), 16);
			else if (var1.equals("shad"))
				anInt1901 = 0;
			else if (var1.equals("/shad"))
				anInt1901 = anInt1914;
			else if (var1.equals("br"))
				method1022(anInt1916, anInt1914);
		} catch (final Exception var3) {
			;
		}

	}

	Class109_Sub21_Sub14_Sub4(final byte[] var1, final int[] var2, final int[] var3, final int[] var4, final int[] var5,
			final int[] var6, final byte[][] var7) {
		anIntArray1915 = var2;
		anIntArray1906 = var3;
		anIntArray1903 = var4;
		anIntArray1918 = var5;
		method1009(var1);
		aByteArrayArray1902 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if ((anIntArray1906[var10] < var8) && (anIntArray1918[var10] != 0))
				var8 = anIntArray1906[var10];

			if ((anIntArray1906[var10] + anIntArray1918[var10]) > var9)
				var9 = anIntArray1906[var10] + anIntArray1918[var10];
		}

		anInt1905 = anInt1907 - var8;
		anInt1909 = var9 - anInt1907;
	}

	static int method1034(final byte[][] var0, final byte[][] var1, final int[] var2, final int[] var3,
			final int[] var4, final int var5, final int var6) {
		final int var7 = var2[var5];
		final int var18 = var7 + var4[var5];
		final int var9 = var2[var6];
		final int var11 = var9 + var4[var6];
		int var10 = var7;
		if (var9 > var7)
			var10 = var9;

		int var17 = var18;
		if (var11 < var18)
			var17 = var11;

		int var8 = var3[var5];
		if (var3[var6] < var8)
			var8 = var3[var6];

		final byte[] var12 = var1[var5];
		final byte[] var14 = var0[var6];
		int var13 = var10 - var7;
		int var15 = var10 - var9;

		for (int var19 = var10; var19 < var17; ++var19) {
			final int var16 = var12[var13++] + var14[var15++];
			if (var16 < var8)
				var8 = var16;
		}

		return -var8;
	}

	Class109_Sub21_Sub14_Sub4(final byte[] var1) {
		method1009(var1);
	}
}
