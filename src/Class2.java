public class Class2 {
	int anInt12;
	int anInt13;
	int anInt14;
	String aString15;
	int anInt16;
	static Class42 aClass42_17;
	static int anInt18;

	public static Class52 method17(final int var0) {
		final Class52[] var1 = Class109_Sub21_Sub8.method713();

		for (final Class52 var3 : var1) {
			if (var0 == var3.anInt526)
				return var3;
		}

		return null;
	}

	static final int method18(final int var0, final int var1, final int var2, final int var3) {
		final int var4 = (65536 - Class109_Sub21_Sub14_Sub3.anIntArray1836[(var2 * 1024) / var3]) >> 1;
		return ((var4 * var1) >> 16) + ((var0 * (65536 - var4)) >> 16);
	}

	static final void method19(final int var0, final int var1, final int var2, final int var3, final int var4) {
		if ((Class109_Sub21_Sub11.anInt1493 != var0) || (Class27.anInt259 != var1)
				|| ((var2 != client.anInt2022) && client.aBool2065)) {
			Class109_Sub21_Sub11.anInt1493 = var0;
			Class27.anInt259 = var1;
			client.anInt2022 = var2;
			if (!client.aBool2065)
				client.anInt2022 = 0;

			Class82.method343(25);
			Class35.method157("Loading - please wait.", true);
			int var9 = Class41.anInt375;
			int var10 = Class113.anInt822;
			Class41.anInt375 = (var0 - 6) * 8;
			Class113.anInt822 = (var1 - 6) * 8;
			final int var12 = Class41.anInt375 - var9;
			final int var8 = Class113.anInt822 - var10;
			var9 = Class41.anInt375;
			var10 = Class113.anInt822;

			int var5;
			int var7;
			for (var5 = 0; var5 < '\u8000'; ++var5) {
				final Class109_Sub21_Sub15_Sub3_Sub1 var6 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var5];
				if (null != var6) {
					for (var7 = 0; var7 < 10; ++var7) {
						var6.anIntArray1655[var7] -= var12;
						var6.anIntArray1706[var7] -= var8;
					}

					var6.anInt1710 -= 128 * var12;
					var6.anInt1653 -= var8 * 128;
				}
			}

			for (var5 = 0; var5 < 2048; ++var5) {
				final Class109_Sub21_Sub15_Sub3_Sub2 var23 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var5];
				if (var23 != null) {
					for (var7 = 0; var7 < 10; ++var7) {
						var23.anIntArray1655[var7] -= var12;
						var23.anIntArray1706[var7] -= var8;
					}

					var23.anInt1710 -= var12 * 128;
					var23.anInt1653 -= var8 * 128;
				}
			}

			Class77.anInt616 = var2;
			Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.method895(var3, var4, false);
			byte var22 = 0;
			byte var16 = 104;
			byte var24 = 1;
			if (var12 < 0) {
				var22 = 103;
				var16 = -1;
				var24 = -1;
			}

			byte var14 = 0;
			byte var19 = 104;
			byte var17 = 1;
			if (var8 < 0) {
				var14 = 103;
				var19 = -1;
				var17 = -1;
			}

			for (int var13 = var22; var16 != var13; var13 += var24)
				for (int var20 = var14; var20 != var19; var20 += var17) {
					final int var21 = var12 + var13;
					final int var15 = var20 + var8;

					for (int var18 = 0; var18 < 4; ++var18)
						if ((var21 >= 0) && (var15 >= 0) && (var21 < 104) && (var15 < 104))
							client.aClass126ArrayArrayArray2121[var18][var13][var20] = client.aClass126ArrayArrayArray2121[var18][var21][var15];
						else
							client.aClass126ArrayArrayArray2121[var18][var13][var20] = null;
				}

			for (Class109_Sub11 var11 = (Class109_Sub11) client.aClass126_2102
					.method458(); null != var11; var11 = (Class109_Sub11) client.aClass126_2102.method449()) {
				var11.anInt1028 -= var12;
				var11.anInt1029 -= var8;
				if ((var11.anInt1028 < 0) || (var11.anInt1029 < 0) || (var11.anInt1028 >= 104)
						|| (var11.anInt1029 >= 104))
					var11.method413();
			}

			if (client.anInt2204 != 0) {
				client.anInt2204 -= var12;
				client.anInt2205 -= var8;
			}

			client.anInt2212 = 0;
			client.aBool2218 = false;
			client.anInt2090 = -1;
			client.aClass126_2104.method456();
			client.aClass126_2197.method456();
		}
	}
}
