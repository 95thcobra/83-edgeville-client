public class Class96 {
	public static short[][] aShortArrayArray715;
	static int[] anIntArray716 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	public static Class120 aClass120_709 = new Class120(260);
	int[] anIntArray712;
	int[] anIntArray710;
	public boolean aBool717;
	int anInt711;
	long aLong714;
	long aLong713;

	public void method357(int[] var1, final int[] var2, final boolean var3, final int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5)
				for (int var7 = 0; var7 < Class109_Sub21_Sub4.anInt1323; ++var7) {
					final Class109_Sub21_Sub4 var6 = Class109_Sub21_Sub16.method834(var7);
					if ((var6 != null) && !var6.aBool1321 && (((var3 ? 7 : 0) + var5) == var6.anInt1325)) {
						var1[anIntArray716[var5]] = var7 + 256;
						break;
					}
				}
		}

		anIntArray712 = var1;
		anIntArray710 = var2;
		aBool717 = var3;
		anInt711 = var4;
		method362();
	}

	public void method358(final int var1, final boolean var2) {
		if ((var1 != 1) || !aBool717) {
			int var3 = anIntArray712[anIntArray716[var1]];
			if (var3 != 0) {
				var3 -= 256;

				Class109_Sub21_Sub4 var4;
				do {
					if (!var2) {
						--var3;
						if (var3 < 0)
							var3 = Class109_Sub21_Sub4.anInt1323 - 1;
					} else {
						++var3;
						if (var3 >= Class109_Sub21_Sub4.anInt1323)
							var3 = 0;
					}

					var4 = Class109_Sub21_Sub16.method834(var3);
				} while ((var4 == null) || var4.aBool1321 || (var4.anInt1325 != ((aBool717 ? 7 : 0) + var1)));

				anIntArray712[anIntArray716[var1]] = var3 + 256;
				method362();
			}
		}
	}

	public void method359(final int var1, final boolean var2) {
		int var3 = anIntArray710[var1];
		if (!var2)
			do {
				--var3;
				if (var3 < 0)
					var3 = aShortArrayArray715[var1].length - 1;
			} while (!Class65.method290(var1, var3));
		else
			do {
				++var3;
				if (var3 >= aShortArrayArray715[var1].length)
					var3 = 0;
			} while (!Class65.method290(var1, var3));

		anIntArray710[var1] = var3;
		method362();
	}

	public void method360(final boolean var1) {
		if (var1 != aBool717)
			method357((int[]) null, anIntArray710, var1, -1);
	}

	public void method361(final DataBuffer var1) {
		var1.writeByte(aBool717 ? 1 : 0);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			final int var3 = anIntArray712[anIntArray716[var2]];
			if (var3 == 0)
				var1.writeByte(-1);
			else
				var1.writeByte(var3 - 256);
		}

		for (var2 = 0; var2 < 5; ++var2)
			var1.writeByte(anIntArray710[var2]);

	}

	void method362() {
		final long var1 = aLong714;
		final int var4 = anIntArray712[5];
		final int var5 = anIntArray712[9];
		anIntArray712[5] = var5;
		anIntArray712[9] = var4;
		aLong714 = 0L;

		int var3;
		for (var3 = 0; var3 < 12; ++var3) {
			aLong714 <<= 4;
			if (anIntArray712[var3] >= 256)
				aLong714 += anIntArray712[var3] - 256;
		}

		if (anIntArray712[0] >= 256)
			aLong714 += (anIntArray712[0] - 256) >> 4;

		if (anIntArray712[1] >= 256)
			aLong714 += (anIntArray712[1] - 256) >> 8;

		for (var3 = 0; var3 < 5; ++var3) {
			aLong714 <<= 3;
			aLong714 += anIntArray710[var3];
		}

		aLong714 <<= 1;
		aLong714 += aBool717 ? 1 : 0;
		anIntArray712[5] = var4;
		anIntArray712[9] = var5;
		if ((0L != var1) && (aLong714 != var1))
			aClass120_709.method441(var1);

	}

	Class109_Sub21_Sub15_Sub7 method363() {
		if (anInt711 != -1)
			return Class122.method444(anInt711).method762();
		else {
			boolean var1 = false;

			int var5;
			for (int var3 = 0; var3 < 12; ++var3) {
				var5 = anIntArray712[var3];
				if ((var5 >= 256) && (var5 < 512) && !Class109_Sub21_Sub16.method834(var5 - 256).method681())
					var1 = true;

				if ((var5 >= 512) && !Class109_Sub23.method660(var5 - 512).method691(aBool717))
					var1 = true;
			}

			if (var1)
				return null;
			else {
				final Class109_Sub21_Sub15_Sub7[] var6 = new Class109_Sub21_Sub15_Sub7[12];
				var5 = 0;

				int var2;
				for (int var8 = 0; var8 < 12; ++var8) {
					var2 = anIntArray712[var8];
					Class109_Sub21_Sub15_Sub7 var4;
					if ((var2 >= 256) && (var2 < 512)) {
						var4 = Class109_Sub21_Sub16.method834(var2 - 256).method678();
						if (null != var4)
							var6[var5++] = var4;
					}

					if (var2 >= 512) {
						var4 = Class109_Sub23.method660(var2 - 512).method686(aBool717);
						if (null != var4)
							var6[var5++] = var4;
					}
				}

				final Class109_Sub21_Sub15_Sub7 var7 = new Class109_Sub21_Sub15_Sub7(var6, var5);

				for (var2 = 0; var2 < 5; ++var2) {
					if (anIntArray710[var2] < aShortArrayArray715[var2].length)
						var7.method1002(Class67.aShortArray582[var2], aShortArrayArray715[var2][anIntArray710[var2]]);

					if (anIntArray710[var2] < Class109_Sub21_Sub16.aShortArrayArray1586[var2].length)
						var7.method1002(Class44.aShortArray452[var2],
								Class109_Sub21_Sub16.aShortArrayArray1586[var2][anIntArray710[var2]]);
				}

				return var7;
			}
		}
	}

	public int method364() {
		return anInt711 == -1
				? (anIntArray710[0] << 25) + (anIntArray710[4] << 20) + (anIntArray712[0] << 15)
						+ (anIntArray712[8] << 10) + (anIntArray712[11] << 5) + anIntArray712[1]
				: 305419896 + Class122.method444(anInt711).anInt1512;
	}

	public Class109_Sub21_Sub15_Sub4 method365(final Class109_Sub21_Sub7 var1, final int var2,
			final Class109_Sub21_Sub7 var3, final int var4) {
		if (anInt711 != -1)
			return Class122.method444(anInt711).method761(var1, var2, var3, var4);
		else {
			long var6 = aLong714;
			int[] var8 = anIntArray712;
			if ((null != var1) && ((var1.anInt1402 >= 0) || (var1.anInt1403 >= 0))) {
				var8 = new int[12];

				for (int var9 = 0; var9 < 12; ++var9)
					var8[var9] = anIntArray712[var9];

				if (var1.anInt1402 >= 0) {
					var6 += (var1.anInt1402 - anIntArray712[5]) << 8;
					var8[5] = var1.anInt1402;
				}

				if (var1.anInt1403 >= 0) {
					var6 += (var1.anInt1403 - anIntArray712[3]) << 16;
					var8[3] = var1.anInt1403;
				}
			}

			Class109_Sub21_Sub15_Sub4 var12 = (Class109_Sub21_Sub15_Sub4) aClass120_709.method438(var6);
			if (null == var12) {
				boolean var5 = false;

				int var10;
				for (int var13 = 0; var13 < 12; ++var13) {
					var10 = var8[var13];
					if ((var10 >= 256) && (var10 < 512) && !Class109_Sub21_Sub16.method834(var10 - 256).method679())
						var5 = true;

					if ((var10 >= 512) && !Class109_Sub23.method660(var10 - 512).method699(aBool717))
						var5 = true;
				}

				if (var5) {
					if (-1L != aLong713)
						var12 = (Class109_Sub21_Sub15_Sub4) aClass120_709.method438(aLong713);

					if (null == var12)
						return null;
				}

				if (null == var12) {
					final Class109_Sub21_Sub15_Sub7[] var16 = new Class109_Sub21_Sub15_Sub7[12];
					var10 = 0;

					int var15;
					for (int var17 = 0; var17 < 12; ++var17) {
						var15 = var8[var17];
						Class109_Sub21_Sub15_Sub7 var14;
						if ((var15 >= 256) && (var15 < 512)) {
							var14 = Class109_Sub21_Sub16.method834(var15 - 256).method680();
							if (null != var14)
								var16[var10++] = var14;
						}

						if (var15 >= 512) {
							var14 = Class109_Sub23.method660(var15 - 512).method695(aBool717);
							if (var14 != null)
								var16[var10++] = var14;
						}
					}

					final Class109_Sub21_Sub15_Sub7 var11 = new Class109_Sub21_Sub15_Sub7(var16, var10);

					for (var15 = 0; var15 < 5; ++var15) {
						if (anIntArray710[var15] < aShortArrayArray715[var15].length)
							var11.method1002(Class67.aShortArray582[var15],
									aShortArrayArray715[var15][anIntArray710[var15]]);

						if (anIntArray710[var15] < Class109_Sub21_Sub16.aShortArrayArray1586[var15].length)
							var11.method1002(Class44.aShortArray452[var15],
									Class109_Sub21_Sub16.aShortArrayArray1586[var15][anIntArray710[var15]]);
					}

					var12 = var11.method1000(64, 850, -30, -50, -30);
					aClass120_709.method440(var12, var6);
					aLong713 = var6;
				}
			}

			if ((null == var1) && (null == var3))
				return var12;
			else {
				Class109_Sub21_Sub15_Sub4 var18;
				if ((null != var1) && (null != var3))
					var18 = var1.method708(var12, var2, var3, var4);
				else if (null != var1)
					var18 = var1.method706(var12, var2);
				else
					var18 = var3.method706(var12, var4);

				return var18;
			}
		}
	}
}
