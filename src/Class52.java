public class Class52 {
	static Class104 aClass104_527;
	static int anInt531;
	public int anInt526;
	static Class52 aClass52_530 = new Class52(0);
	public static Class52 aClass52_529 = new Class52(1);
	static Class52 aClass52_528 = new Class52(2);

	Class52(final int var1) {
		anInt526 = var1;
	}

	static final void method254(final int var0, final int var1, final int var2, final int var3, final int var4) {
		int var5 = Class2.aClass42_17.method197(var0, var1, var2);
		int var6;
		int var8;
		int var9;
		int var10;
		int var15;
		int var18;
		if (var5 != 0) {
			var9 = Class2.aClass42_17.method223(var0, var1, var2, var5);
			var18 = (var9 >> 6) & 3;
			var10 = var9 & 31;
			var6 = var3;
			if (var5 > 0)
				var6 = var4;

			final int[] var7 = Class21.aClass109_Sub21_Sub14_Sub2_201.anIntArray1722;
			var8 = (4 * var1) + 24624 + ((103 - var2) * 2048);
			var15 = (var5 >> 14) & 32767;
			final Class109_Sub21_Sub10 var16 = Class28.method128(var15);
			if (var16.anInt1452 != -1) {
				final Class109_Sub21_Sub14_Sub1 var19 = Class87.aClass109_Sub21_Sub14_Sub1Array668[var16.anInt1452];
				if (var19 != null) {
					final int var20 = ((var16.anInt1440 * 4) - var19.anInt1713) / 2;
					final int var21 = ((var16.anInt1435 * 4) - var19.anInt1714) / 2;
					var19.method905((4 * var1) + 48 + var20, var21 + 48 + ((104 - var2 - var16.anInt1435) * 4));
				}
			} else {
				if ((var10 == 0) || (var10 == 2))
					if (var18 == 0) {
						var7[var8] = var6;
						var7[512 + var8] = var6;
						var7[1024 + var8] = var6;
						var7[1536 + var8] = var6;
					} else if (var18 == 1) {
						var7[var8] = var6;
						var7[var8 + 1] = var6;
						var7[2 + var8] = var6;
						var7[3 + var8] = var6;
					} else if (var18 == 2) {
						var7[var8 + 3] = var6;
						var7[3 + var8 + 512] = var6;
						var7[3 + var8 + 1024] = var6;
						var7[1536 + var8 + 3] = var6;
					} else if (var18 == 3) {
						var7[var8 + 1536] = var6;
						var7[1 + 1536 + var8] = var6;
						var7[2 + 1536 + var8] = var6;
						var7[3 + var8 + 1536] = var6;
					}

				if (var10 == 3)
					if (var18 == 0)
						var7[var8] = var6;
					else if (var18 == 1)
						var7[var8 + 3] = var6;
					else if (var18 == 2)
						var7[3 + var8 + 1536] = var6;
					else if (var18 == 3)
						var7[var8 + 1536] = var6;

				if (var10 == 2)
					if (var18 == 3) {
						var7[var8] = var6;
						var7[512 + var8] = var6;
						var7[var8 + 1024] = var6;
						var7[1536 + var8] = var6;
					} else if (var18 == 0) {
						var7[var8] = var6;
						var7[var8 + 1] = var6;
						var7[2 + var8] = var6;
						var7[3 + var8] = var6;
					} else if (var18 == 1) {
						var7[3 + var8] = var6;
						var7[var8 + 3 + 512] = var6;
						var7[3 + var8 + 1024] = var6;
						var7[3 + var8 + 1536] = var6;
					} else if (var18 == 2) {
						var7[var8 + 1536] = var6;
						var7[1 + 1536 + var8] = var6;
						var7[2 + 1536 + var8] = var6;
						var7[1536 + var8 + 3] = var6;
					}
			}
		}

		var5 = Class2.aClass42_17.method199(var0, var1, var2);
		if (var5 != 0) {
			var9 = Class2.aClass42_17.method223(var0, var1, var2, var5);
			var18 = (var9 >> 6) & 3;
			var10 = var9 & 31;
			var6 = (var5 >> 14) & 32767;
			final Class109_Sub21_Sub10 var23 = Class28.method128(var6);
			int var14;
			if (var23.anInt1452 != -1) {
				final Class109_Sub21_Sub14_Sub1 var17 = Class87.aClass109_Sub21_Sub14_Sub1Array668[var23.anInt1452];
				if (var17 != null) {
					var15 = ((var23.anInt1440 * 4) - var17.anInt1713) / 2;
					var14 = ((var23.anInt1435 * 4) - var17.anInt1714) / 2;
					var17.method905(var15 + (4 * var1) + 48, ((104 - var2 - var23.anInt1435) * 4) + 48 + var14);
				}
			} else if (var10 == 9) {
				var8 = 15658734;
				if (var5 > 0)
					var8 = 15597568;

				final int[] var13 = Class21.aClass109_Sub21_Sub14_Sub2_201.anIntArray1722;
				var14 = (var1 * 4) + 24624 + ((103 - var2) * 2048);
				if ((var18 != 0) && (var18 != 2)) {
					var13[var14] = var8;
					var13[1 + 512 + var14] = var8;
					var13[var14 + 1024 + 2] = var8;
					var13[1536 + var14 + 3] = var8;
				} else {
					var13[var14 + 1536] = var8;
					var13[var14 + 1024 + 1] = var8;
					var13[512 + var14 + 2] = var8;
					var13[var14 + 3] = var8;
				}
			}
		}

		var5 = Class2.aClass42_17.method211(var0, var1, var2);
		if (var5 != 0) {
			var9 = (var5 >> 14) & 32767;
			final Class109_Sub21_Sub10 var11 = Class28.method128(var9);
			if (var11.anInt1452 != -1) {
				final Class109_Sub21_Sub14_Sub1 var12 = Class87.aClass109_Sub21_Sub14_Sub1Array668[var11.anInt1452];
				if (var12 != null) {
					var6 = ((var11.anInt1440 * 4) - var12.anInt1713) / 2;
					final int var22 = ((var11.anInt1435 * 4) - var12.anInt1714) / 2;
					var12.method905(48 + (var1 * 4) + var6, var22 + (4 * (104 - var2 - var11.anInt1435)) + 48);
				}
			}
		}

	}

	static final void method255() {
		if (null != Class54.aClass4_535)
			Class54.aClass4_535.method34();

		if (null != Class102.aClass4_757)
			Class102.aClass4_757.method34();

	}

	static int method256(final Class109_Sub20 var0) {
		final Class109_Sub24 var1 = (Class109_Sub24) client.aClass116_1999
				.method429(((long) var0.anInt1148 << 32) + var0.anInt1147);
		return null != var1 ? var1.anInt1290 : var0.anInt1253;
	}
}
