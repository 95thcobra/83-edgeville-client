public class Class67 {
	public static short[] aShortArray582;
	int[] anIntArray581;
	byte[] aByteArray583;
	int[] anIntArray584;

	public int method299(final byte[] var1, final int var2, final byte[] var3, int var4, int var5) {
		if (var5 == 0)
			return 0;
		else {
			int var6 = 0;
			var5 += var4;
			int var8 = var2;

			while (true) {
				final byte var9 = var1[var8];
				if (var9 < 0)
					var6 = anIntArray584[var6];
				else
					++var6;

				int var7;
				if ((var7 = anIntArray584[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 64) != 0)
					var6 = anIntArray584[var6];
				else
					++var6;

				if ((var7 = anIntArray584[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 32) != 0)
					var6 = anIntArray584[var6];
				else
					++var6;

				if ((var7 = anIntArray584[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 16) != 0)
					var6 = anIntArray584[var6];
				else
					++var6;

				if ((var7 = anIntArray584[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 8) != 0)
					var6 = anIntArray584[var6];
				else
					++var6;

				if ((var7 = anIntArray584[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 4) != 0)
					var6 = anIntArray584[var6];
				else
					++var6;

				if ((var7 = anIntArray584[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 2) != 0)
					var6 = anIntArray584[var6];
				else
					++var6;

				if ((var7 = anIntArray584[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 1) != 0)
					var6 = anIntArray584[var6];
				else
					++var6;

				if ((var7 = anIntArray584[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				++var8;
			}

			return (1 + var8) - var2;
		}
	}

	static final int method300() {
		if (Class50.aClass21_513.aBool194)
			return Class77.anInt616;
		else {
			int var1 = 3;
			if (Class46.anInt490 < 310) {
				int var2 = Class109_Sub13.anInt1048 >> 7;
				int var3 = Class109_Sub21_Sub9.anInt1420 >> 7;
				final int var5 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 >> 7;
				final int var4 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 >> 7;
				if ((Class27.aByteArrayArrayArray243[Class77.anInt616][var2][var3] & 4) != 0)
					var1 = Class77.anInt616;

				int var6;
				if (var5 > var2)
					var6 = var5 - var2;
				else
					var6 = var2 - var5;

				int var8;
				if (var4 > var3)
					var8 = var4 - var3;
				else
					var8 = var3 - var4;

				int var0;
				int var7;
				if (var6 > var8) {
					var7 = (var8 * 65536) / var6;
					var0 = '\u8000';

					while (var5 != var2) {
						if (var2 < var5)
							++var2;
						else if (var2 > var5)
							--var2;

						if ((Class27.aByteArrayArrayArray243[Class77.anInt616][var2][var3] & 4) != 0)
							var1 = Class77.anInt616;

						var0 += var7;
						if (var0 >= 65536) {
							var0 -= 65536;
							if (var3 < var4)
								++var3;
							else if (var3 > var4)
								--var3;

							if ((Class27.aByteArrayArrayArray243[Class77.anInt616][var2][var3] & 4) != 0)
								var1 = Class77.anInt616;
						}
					}
				} else {
					var7 = (65536 * var6) / var8;
					var0 = '\u8000';

					while (var3 != var4) {
						if (var3 < var4)
							++var3;
						else if (var3 > var4)
							--var3;

						if ((Class27.aByteArrayArrayArray243[Class77.anInt616][var2][var3] & 4) != 0)
							var1 = Class77.anInt616;

						var0 += var7;
						if (var0 >= 65536) {
							var0 -= 65536;
							if (var2 < var5)
								++var2;
							else if (var2 > var5)
								--var2;

							if ((Class27.aByteArrayArrayArray243[Class77.anInt616][var2][var3] & 4) != 0)
								var1 = Class77.anInt616;
						}
					}
				}
			}

			if ((Class27.aByteArrayArrayArray243[Class77.anInt616][Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 >> 7][Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 >> 7]
					& 4) != 0)
				var1 = Class77.anInt616;

			return var1;
		}
	}

	public Class67(final byte[] var1) {
		final int var13 = var1.length;
		anIntArray581 = new int[var13];
		aByteArray583 = var1;
		final int[] var4 = new int[33];
		anIntArray584 = new int[8];
		int var7 = 0;

		for (int var8 = 0; var8 < var13; ++var8) {
			final byte var2 = var1[var8];
			if (var2 != 0) {
				final int var11 = 1 << (32 - var2);
				final int var5 = var4[var2];
				anIntArray581[var8] = var5;
				int var3;
				int var9;
				int var10;
				int var12;
				if ((var5 & var11) != 0)
					var12 = var4[var2 - 1];
				else {
					var12 = var5 | var11;

					for (var3 = var2 - 1; var3 >= 1; --var3) {
						var9 = var4[var3];
						if (var9 != var5)
							break;

						var10 = 1 << (32 - var3);
						if ((var9 & var10) != 0) {
							var4[var3] = var4[var3 - 1];
							break;
						}

						var4[var3] = var9 | var10;
					}
				}

				var4[var2] = var12;

				for (var3 = var2 + 1; var3 <= 32; ++var3)
					if (var4[var3] == var5)
						var4[var3] = var12;

				var3 = 0;

				for (var9 = 0; var9 < var2; ++var9) {
					var10 = Integer.MIN_VALUE >>> var9;
					if ((var5 & var10) != 0) {
						if (anIntArray584[var3] == 0)
							anIntArray584[var3] = var7;

						var3 = anIntArray584[var3];
					} else
						++var3;

					if (var3 >= anIntArray584.length) {
						final int[] var6 = new int[anIntArray584.length * 2];

						for (int var14 = 0; var14 < anIntArray584.length; ++var14)
							var6[var14] = anIntArray584[var14];

						anIntArray584 = var6;
					}

					var10 >>>= 1;
				}

				anIntArray584[var3] = ~var8;
				if (var3 >= var7)
					var7 = var3 + 1;
			}
		}

	}

	public int method301(final byte[] var1, int var2, int var3, final byte[] var4, final int var5) {
		int var6 = 0;
		int var9 = var5 << 3;

		for (var3 += var2; var2 < var3; ++var2) {
			final int var11 = var1[var2] & 255;
			final int var12 = anIntArray581[var11];
			final byte var13 = aByteArray583[var11];
			if (var13 == 0)
				throw new RuntimeException("");

			int var7 = var9 >> 3;
			int var10 = var9 & 7;
			var6 &= -var10 >> 31;
			final int var8 = var7 + (((var10 + var13) - 1) >> 3);
			var10 += 24;
			var4[var7] = (byte) (var6 |= var12 >>> var10);
			if (var7 < var8) {
				++var7;
				var10 -= 8;
				var4[var7] = (byte) (var6 = var12 >>> var10);
				if (var7 < var8) {
					++var7;
					var10 -= 8;
					var4[var7] = (byte) (var6 = var12 >>> var10);
					if (var7 < var8) {
						++var7;
						var10 -= 8;
						var4[var7] = (byte) (var6 = var12 >>> var10);
						if (var7 < var8) {
							++var7;
							var10 -= 8;
							var4[var7] = (byte) (var6 = var12 << -var10);
						}
					}
				}
			}

			var9 += var13;
		}

		return ((7 + var9) >> 3) - var5;
	}

	public static String method302(long var0) {
		if ((var0 > 0L) && (var0 < 6582952005840035281L)) {
			if ((var0 % 37L) == 0L)
				return null;
			else {
				int var5 = 0;

				for (long var6 = var0; 0L != var6; var6 /= 37L)
					++var5;

				StringBuilder var2;
				char var3;
				for (var2 = new StringBuilder(var5); 0L != var0; var2.append(var3)) {
					final long var8 = var0;
					var0 /= 37L;
					var3 = Class80.aCharArray630[(int) (var8 - (37L * var0))];
					if (var3 == 95) {
						final int var4 = var2.length() - 1;
						var2.setCharAt(var4, Character.toUpperCase(var2.charAt(var4)));
						var3 = 160;
					}
				}

				var2.reverse();
				var2.setCharAt(0, Character.toUpperCase(var2.charAt(0)));
				return var2.toString();
			}
		} else
			return null;
	}
}
