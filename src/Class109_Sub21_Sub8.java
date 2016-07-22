public class Class109_Sub21_Sub8 extends Class109_Sub21 {
	public int anInt1409;
	public int anInt1410;
	public int anInt1411;
	public static Class120 aClass120_1412 = new Class120(64);

	void method712(final DataBuffer var1, final int var2) {
		if (var2 == 1) {
			anInt1409 = var1.readShort();
			anInt1410 = var1.method564();
			anInt1411 = var1.method564();
		}

	}

	static Class52[] method713() {
		return new Class52[] { Class52.aClass52_528, Class52.aClass52_529, Class52.aClass52_530 };
	}

	static final int method714(final int var0, int var1) {
		if (var0 == -2)
			return 12345678;
		else if (var0 == -1) {
			if (var1 < 2)
				var1 = 2;
			else if (var1 > 126)
				var1 = 126;

			return var1;
		} else {
			var1 = ((var0 & 127) * var1) / 128;
			if (var1 < 2)
				var1 = 2;
			else if (var1 > 126)
				var1 = 126;

			return var1 + (var0 & '\uff80');
		}
	}

	void method715(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method564();
			if (var2 == 0)
				return;

			method712(var1, var2);
		}
	}

	static final void method716(final Class109_Sub20 var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6) {
		if (client.aBool2049)
			client.anInt2110 = 32;
		else
			client.anInt2110 = 0;

		client.aBool2049 = false;
		int var7;
		if ((Class81.anInt636 == 1) || (!Class3.aBool22 && (Class81.anInt636 == 4)))
			if ((var5 >= var1) && (var5 < (var1 + 16)) && (var6 >= var2) && (var6 < (var2 + 16))) {
				var0.anInt1169 -= 4;
				Class71.method315(var0);
			} else if ((var5 >= var1) && (var5 < (var1 + 16)) && (var6 >= ((var3 + var2) - 16))
					&& (var6 < (var2 + var3))) {
				var0.anInt1169 += 4;
				Class71.method315(var0);
			} else if ((var5 >= (var1 - client.anInt2110)) && (var5 < (client.anInt2110 + 16 + var1))
					&& (var6 >= (16 + var2)) && (var6 < ((var3 + var2) - 16))) {
				var7 = ((var3 - 32) * var3) / var4;
				if (var7 < 8)
					var7 = 8;

				final int var9 = var6 - var2 - 16 - (var7 / 2);
				final int var8 = var3 - 32 - var7;
				var0.anInt1169 = (var9 * (var4 - var3)) / var8;
				Class71.method315(var0);
				client.aBool2049 = true;
			}

		if (client.anInt2168 != 0) {
			var7 = var0.anInt1162;
			if ((var5 >= (var1 - var7)) && (var6 >= var2) && (var5 < (16 + var1)) && (var6 <= (var2 + var3))) {
				var0.anInt1169 += client.anInt2168 * 45;
				Class71.method315(var0);
			}
		}

	}

	static void method717(final Class46[] var0, final int var1, final int var2, final int[] var3, final int[] var4) {
		if (var1 < var2) {
			int var9 = var1 - 1;
			int var10 = 1 + var2;
			final int var6 = (var2 + var1) / 2;
			final Class46 var11 = var0[var6];
			var0[var6] = var0[var1];
			var0[var1] = var11;

			while (var9 < var10) {
				boolean var12 = true;

				int var5;
				int var7;
				int var8;
				do {
					--var10;

					for (var5 = 0; var5 < 4; ++var5) {
						if (var3[var5] == 2) {
							var7 = var0[var10].anInt491;
							var8 = var11.anInt491;
						} else if (var3[var5] == 1) {
							var7 = var0[var10].anInt479;
							var8 = var11.anInt479;
							if ((var7 == -1) && (var4[var5] == 1))
								var7 = 2001;

							if ((var8 == -1) && (var4[var5] == 1))
								var8 = 2001;
						} else if (var3[var5] == 3) {
							var7 = var0[var10].method234() ? 1 : 0;
							var8 = var11.method234() ? 1 : 0;
						} else {
							var7 = var0[var10].anInt492;
							var8 = var11.anInt492;
						}

						if (var8 != var7) {
							if (((var4[var5] != 1) || (var7 <= var8)) && ((var4[var5] != 0) || (var7 >= var8)))
								var12 = false;
							break;
						}

						if (var5 == 3)
							var12 = false;
					}
				} while (var12);

				var12 = true;

				do {
					++var9;

					for (var5 = 0; var5 < 4; ++var5) {
						if (var3[var5] == 2) {
							var7 = var0[var9].anInt491;
							var8 = var11.anInt491;
						} else if (var3[var5] == 1) {
							var7 = var0[var9].anInt479;
							var8 = var11.anInt479;
							if ((var7 == -1) && (var4[var5] == 1))
								var7 = 2001;

							if ((var8 == -1) && (var4[var5] == 1))
								var8 = 2001;
						} else if (var3[var5] == 3) {
							var7 = var0[var9].method234() ? 1 : 0;
							var8 = var11.method234() ? 1 : 0;
						} else {
							var7 = var0[var9].anInt492;
							var8 = var11.anInt492;
						}

						if (var7 != var8) {
							if (((var4[var5] != 1) || (var7 >= var8)) && ((var4[var5] != 0) || (var7 <= var8)))
								var12 = false;
							break;
						}

						if (var5 == 3)
							var12 = false;
					}
				} while (var12);

				if (var9 < var10) {
					final Class46 var13 = var0[var9];
					var0[var9] = var0[var10];
					var0[var10] = var13;
				}
			}

			method717(var0, var1, var10, var3, var4);
			method717(var0, var10 + 1, var2, var3, var4);
		}

	}

	static final void method718() {
		int var0 = 64 + (LoginEncoder.anInt525 * 128);
		int var2 = (Class75.anInt614 * 128) + 64;
		int var3 = Class41.method174(var0, var2, Class77.anInt616) - Canvas_Sub1.anInt1597;
		if (Class109_Sub13.anInt1048 < var0) {
			Class109_Sub13.anInt1048 += ((Class17.anInt154 * (var0 - Class109_Sub13.anInt1048)) / 1000)
					+ Class109_Sub21_Sub2.anInt1307;
			if (Class109_Sub13.anInt1048 > var0)
				Class109_Sub13.anInt1048 = var0;
		}

		if (Class109_Sub13.anInt1048 > var0) {
			Class109_Sub13.anInt1048 -= Class109_Sub21_Sub2.anInt1307
					+ (((Class109_Sub13.anInt1048 - var0) * Class17.anInt154) / 1000);
			if (Class109_Sub13.anInt1048 < var0)
				Class109_Sub13.anInt1048 = var0;
		}

		if (Class24.anInt222 < var3) {
			Class24.anInt222 += Class109_Sub21_Sub2.anInt1307 + ((Class17.anInt154 * (var3 - Class24.anInt222)) / 1000);
			if (Class24.anInt222 > var3)
				Class24.anInt222 = var3;
		}

		if (Class24.anInt222 > var3) {
			Class24.anInt222 -= ((Class17.anInt154 * (Class24.anInt222 - var3)) / 1000) + Class109_Sub21_Sub2.anInt1307;
			if (Class24.anInt222 < var3)
				Class24.anInt222 = var3;
		}

		if (Class109_Sub21_Sub9.anInt1420 < var2) {
			Class109_Sub21_Sub9.anInt1420 += ((Class17.anInt154 * (var2 - Class109_Sub21_Sub9.anInt1420)) / 1000)
					+ Class109_Sub21_Sub2.anInt1307;
			if (Class109_Sub21_Sub9.anInt1420 > var2)
				Class109_Sub21_Sub9.anInt1420 = var2;
		}

		if (Class109_Sub21_Sub9.anInt1420 > var2) {
			Class109_Sub21_Sub9.anInt1420 -= Class109_Sub21_Sub2.anInt1307
					+ (((Class109_Sub21_Sub9.anInt1420 - var2) * Class17.anInt154) / 1000);
			if (Class109_Sub21_Sub9.anInt1420 < var2)
				Class109_Sub21_Sub9.anInt1420 = var2;
		}

		var0 = 64 + (Class3.anInt28 * 128);
		var2 = (Class21.anInt196 * 128) + 64;
		var3 = Class41.method174(var0, var2, Class77.anInt616) - Class52.anInt531;
		final int var5 = var0 - Class109_Sub13.anInt1048;
		final int var7 = var3 - Class24.anInt222;
		final int var4 = var2 - Class109_Sub21_Sub9.anInt1420;
		final int var9 = (int) Math.sqrt((var5 * var5) + (var4 * var4));
		int var10 = (int) (Math.atan2(var7, var9) * 325.949D) & 2047;
		final int var6 = (int) (Math.atan2(var5, var4) * -325.949D) & 2047;
		if (var10 < 128)
			var10 = 128;

		if (var10 > 383)
			var10 = 383;

		if (Class46.anInt490 < var10) {
			Class46.anInt490 += Class109_Sub11.anInt1036
					+ (((var10 - Class46.anInt490) * Class109_Sub21_Sub4.anInt1333) / 1000);
			if (Class46.anInt490 > var10)
				Class46.anInt490 = var10;
		}

		if (Class46.anInt490 > var10) {
			Class46.anInt490 -= ((Class109_Sub21_Sub4.anInt1333 * (Class46.anInt490 - var10)) / 1000)
					+ Class109_Sub11.anInt1036;
			if (Class46.anInt490 < var10)
				Class46.anInt490 = var10;
		}

		int var1 = var6 - Class109_Sub21_Sub1.anInt1298;
		if (var1 > 1024)
			var1 -= 2048;

		if (var1 < -1024)
			var1 += 2048;

		if (var1 > 0) {
			Class109_Sub21_Sub1.anInt1298 += ((Class109_Sub21_Sub4.anInt1333 * var1) / 1000) + Class109_Sub11.anInt1036;
			Class109_Sub21_Sub1.anInt1298 &= 2047;
		}

		if (var1 < 0) {
			Class109_Sub21_Sub1.anInt1298 -= ((-var1 * Class109_Sub21_Sub4.anInt1333) / 1000)
					+ Class109_Sub11.anInt1036;
			Class109_Sub21_Sub1.anInt1298 &= 2047;
		}

		int var8 = var6 - Class109_Sub21_Sub1.anInt1298;
		if (var8 > 1024)
			var8 -= 2048;

		if (var8 < -1024)
			var8 += 2048;

		if (((var8 < 0) && (var1 > 0)) || ((var8 > 0) && (var1 < 0)))
			Class109_Sub21_Sub1.anInt1298 = var6;

	}
}
