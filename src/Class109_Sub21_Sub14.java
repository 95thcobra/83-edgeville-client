public class Class109_Sub21_Sub14 extends Class109_Sub21 {
	protected static int anInt1557 = 0;
	public static int anInt1555 = 0;
	protected static int anInt1552 = 0;
	public static int anInt1556 = 0;
	public static int[] anIntArray1558;
	public static int anInt1553;
	public static int anInt1554;

	public static void method769(final int var0, final int var1, final int var2, final int var3) {
		if (anInt1557 < var0)
			anInt1557 = var0;

		if (anInt1555 < var1)
			anInt1555 = var1;

		if (anInt1552 > var2)
			anInt1552 = var2;

		if (anInt1556 > var3)
			anInt1556 = var3;

	}

	public static void method770(final int[] var0) {
		var0[0] = anInt1557;
		var0[1] = anInt1555;
		var0[2] = anInt1552;
		var0[3] = anInt1556;
	}

	public static void method771(final int[] var0) {
		anInt1557 = var0[0];
		anInt1555 = var0[1];
		anInt1552 = var0[2];
		anInt1556 = var0[3];
	}

	public static void method772(int var0, int var1, int var2, int var3, int var4, final int var5) {
		if (var0 < anInt1557) {
			var2 -= anInt1557 - var0;
			var0 = anInt1557;
		}

		if (var1 < anInt1555) {
			var3 -= anInt1555 - var1;
			var1 = anInt1555;
		}

		if ((var0 + var2) > anInt1552)
			var2 = anInt1552 - var0;

		if ((var1 + var3) > anInt1556)
			var3 = anInt1556 - var1;

		var4 = ((((var4 & 16711935) * var5) >> 8) & 16711935) + ((((var4 & '\uff00') * var5) >> 8) & '\uff00');
		final int var8 = 256 - var5;
		final int var7 = anInt1553 - var2;
		int var10 = var0 + (var1 * anInt1553);

		for (int var6 = 0; var6 < var3; ++var6) {
			for (int var9 = -var2; var9 < 0; ++var9) {
				int var11 = anIntArray1558[var10];
				var11 = ((((var11 & 16711935) * var8) >> 8) & 16711935)
						+ ((((var11 & '\uff00') * var8) >> 8) & '\uff00');
				anIntArray1558[var10++] = var4 + var11;
			}

			var10 += var7;
		}

	}

	public static void method773(int var0, int var1, int var2, int var3, final int var4) {
		if (var0 < anInt1557) {
			var2 -= anInt1557 - var0;
			var0 = anInt1557;
		}

		if (var1 < anInt1555) {
			var3 -= anInt1555 - var1;
			var1 = anInt1555;
		}

		if ((var0 + var2) > anInt1552)
			var2 = anInt1552 - var0;

		if ((var1 + var3) > anInt1556)
			var3 = anInt1556 - var1;

		final int var8 = anInt1553 - var2;
		int var7 = var0 + (var1 * anInt1553);

		for (int var6 = -var3; var6 < 0; ++var6) {
			for (int var5 = -var2; var5 < 0; ++var5)
				anIntArray1558[var7++] = var4;

			var7 += var8;
		}

	}

	public static void method774(int var0, int var1, int var2, int var3, final int var4, final int var5) {
		int var6 = 0;
		final int var8 = 65536 / var3;
		if (var0 < anInt1557) {
			var2 -= anInt1557 - var0;
			var0 = anInt1557;
		}

		if (var1 < anInt1555) {
			var6 += (anInt1555 - var1) * var8;
			var3 -= anInt1555 - var1;
			var1 = anInt1555;
		}

		if ((var0 + var2) > anInt1552)
			var2 = anInt1552 - var0;

		if ((var1 + var3) > anInt1556)
			var3 = anInt1556 - var1;

		final int var14 = anInt1553 - var2;
		int var9 = var0 + (var1 * anInt1553);

		for (int var7 = -var3; var7 < 0; ++var7) {
			final int var10 = (65536 - var6) >> 8;
			final int var11 = var6 >> 8;
			final int var12 = (((((var4 & 16711935) * var10) + ((var5 & 16711935) * var11)) & -16711936)
					+ ((((var4 & '\uff00') * var10) + ((var5 & '\uff00') * var11)) & 16711680)) >>> 8;

			for (int var13 = -var2; var13 < 0; ++var13)
				anIntArray1558[var9++] = var12;

			var9 += var14;
			var6 += var8;
		}

	}

	public static void method775(final int var0, final int var1, final int var2, final int var3, final int var4) {
		method784(var0, var1, var2, var4);
		method784(var0, (var1 + var3) - 1, var2, var4);
		method782(var0, var1, var3, var4);
		method782((var0 + var2) - 1, var1, var3, var4);
	}

	public static void method776(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		method778(var0, var1, var2, var4, var5);
		method778(var0, (var1 + var3) - 1, var2, var4, var5);
		if (var3 >= 3) {
			method779(var0, var1 + 1, var3 - 2, var4, var5);
			method779((var0 + var2) - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	public static void method777(final int[] var0, final int var1, final int var2) {
		anIntArray1558 = var0;
		anInt1553 = var1;
		anInt1554 = var2;
		method785(0, 0, var1, var2);
	}

	static void method778(int var0, final int var1, int var2, final int var3, final int var4) {
		if ((var1 >= anInt1555) && (var1 < anInt1556)) {
			if (var0 < anInt1557) {
				var2 -= anInt1557 - var0;
				var0 = anInt1557;
			}

			if ((var0 + var2) > anInt1552)
				var2 = anInt1552 - var0;

			final int var9 = 256 - var4;
			final int var6 = ((var3 >> 16) & 255) * var4;
			final int var10 = ((var3 >> 8) & 255) * var4;
			final int var11 = (var3 & 255) * var4;
			int var5 = var0 + (var1 * anInt1553);

			for (int var7 = 0; var7 < var2; ++var7) {
				final int var12 = ((anIntArray1558[var5] >> 16) & 255) * var9;
				final int var13 = ((anIntArray1558[var5] >> 8) & 255) * var9;
				final int var14 = (anIntArray1558[var5] & 255) * var9;
				final int var8 = (((var6 + var12) >> 8) << 16) + (((var10 + var13) >> 8) << 8) + ((var11 + var14) >> 8);
				anIntArray1558[var5++] = var8;
			}

		}
	}

	static void method779(final int var0, int var1, int var2, final int var3, final int var4) {
		if ((var0 >= anInt1557) && (var0 < anInt1552)) {
			if (var1 < anInt1555) {
				var2 -= anInt1555 - var1;
				var1 = anInt1555;
			}

			if ((var1 + var2) > anInt1556)
				var2 = anInt1556 - var1;

			final int var8 = 256 - var4;
			final int var7 = ((var3 >> 16) & 255) * var4;
			final int var10 = ((var3 >> 8) & 255) * var4;
			final int var11 = (var3 & 255) * var4;
			int var5 = var0 + (var1 * anInt1553);

			for (int var12 = 0; var12 < var2; ++var12) {
				final int var13 = ((anIntArray1558[var5] >> 16) & 255) * var8;
				final int var9 = ((anIntArray1558[var5] >> 8) & 255) * var8;
				final int var14 = (anIntArray1558[var5] & 255) * var8;
				final int var6 = (((var7 + var13) >> 8) << 16) + (((var10 + var9) >> 8) << 8) + ((var11 + var14) >> 8);
				anIntArray1558[var5] = var6;
				var5 += anInt1553;
			}

		}
	}

	public static void method780(int var0, int var1, int var2, int var3, final int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0)
				method784(var0, var1, var2 + 1, var4);
			else
				method784(var0 + var2, var1, -var2 + 1, var4);

		} else if (var2 == 0) {
			if (var3 >= 0)
				method782(var0, var1, var3 + 1, var4);
			else
				method782(var0, var1 + var3, -var3 + 1, var4);

		} else {
			if ((var2 + var3) < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += '\u8000';
				var3 <<= 16;
				var5 = (int) Math.floor(((double) var3 / (double) var2) + 0.5D);
				var2 += var0;
				if (var0 < anInt1557) {
					var1 += var5 * (anInt1557 - var0);
					var0 = anInt1557;
				}

				if (var2 >= anInt1552)
					var2 = anInt1552 - 1;

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if ((var6 >= anInt1555) && (var6 < anInt1556))
						anIntArray1558[var0 + (var6 * anInt1553)] = var4;

					var1 += var5;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += '\u8000';
				var2 <<= 16;
				var5 = (int) Math.floor(((double) var2 / (double) var3) + 0.5D);
				var3 += var1;
				if (var1 < anInt1555) {
					var0 += var5 * (anInt1555 - var1);
					var1 = anInt1555;
				}

				if (var3 >= anInt1556)
					var3 = anInt1556 - 1;

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if ((var6 >= anInt1557) && (var6 < anInt1552))
						anIntArray1558[var6 + (var1 * anInt1553)] = var4;

					var0 += var5;
					++var1;
				}
			}

		}
	}

	public static void method781(int var0, int var1, final int var2, final int[] var3, final int[] var4) {
		int var5 = var0 + (var1 * anInt1553);

		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; ++var0)
				anIntArray1558[var6++] = var2;

			var5 += anInt1553;
		}

	}

	public static void method782(final int var0, int var1, int var2, final int var3) {
		if ((var0 >= anInt1557) && (var0 < anInt1552)) {
			if (var1 < anInt1555) {
				var2 -= anInt1555 - var1;
				var1 = anInt1555;
			}

			if ((var1 + var2) > anInt1556)
				var2 = anInt1556 - var1;

			final int var4 = var0 + (var1 * anInt1553);

			for (int var5 = 0; var5 < var2; ++var5)
				anIntArray1558[var4 + (var5 * anInt1553)] = var3;

		}
	}

	public static void method783() {
		int var0 = 0;

		int var1;
		for (var1 = (anInt1553 * anInt1554) - 7; var0 < var1; anIntArray1558[var0++] = 0) {
			anIntArray1558[var0++] = 0;
			anIntArray1558[var0++] = 0;
			anIntArray1558[var0++] = 0;
			anIntArray1558[var0++] = 0;
			anIntArray1558[var0++] = 0;
			anIntArray1558[var0++] = 0;
			anIntArray1558[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; anIntArray1558[var0++] = 0)
			;

	}

	public static void method784(int var0, final int var1, int var2, final int var3) {
		if ((var1 >= anInt1555) && (var1 < anInt1556)) {
			if (var0 < anInt1557) {
				var2 -= anInt1557 - var0;
				var0 = anInt1557;
			}

			if ((var0 + var2) > anInt1552)
				var2 = anInt1552 - var0;

			final int var4 = var0 + (var1 * anInt1553);

			for (int var5 = 0; var5 < var2; ++var5)
				anIntArray1558[var4 + var5] = var3;

		}
	}

	public static void method785(int var0, int var1, int var2, int var3) {
		if (var0 < 0)
			var0 = 0;

		if (var1 < 0)
			var1 = 0;

		if (var2 > anInt1553)
			var2 = anInt1553;

		if (var3 > anInt1554)
			var3 = anInt1554;

		anInt1557 = var0;
		anInt1555 = var1;
		anInt1552 = var2;
		anInt1556 = var3;
	}

	public static void method786() {
		anInt1557 = 0;
		anInt1555 = 0;
		anInt1552 = anInt1553;
		anInt1556 = anInt1554;
	}
}
