public class Class14 {
	static float[][] aFloatArrayArray129 = new float[2][8];
	static int[][] anIntArrayArray128 = new int[2][8];
	int[] anIntArray131 = new int[2];
	int[][][] anIntArrayArrayArray125 = new int[2][2][4];
	int[][][] anIntArrayArrayArray126 = new int[2][2][4];
	int[] anIntArray127 = new int[2];
	static float aFloat124;
	static int anInt130;

	float method69(final int var1, final int var2, final float var3) {
		float var4 = anIntArrayArrayArray126[var1][0][var2]
				+ (var3 * (anIntArrayArrayArray126[var1][1][var2] - anIntArrayArrayArray126[var1][0][var2]));
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	static float method70(final float var0) {
		final float var1 = 32.703197F * (float) Math.pow(2.0D, var0);
		return (var1 * 3.1415927F) / 11025.0F;
	}

	float method71(final int var1, final int var2, final float var3) {
		float var4 = anIntArrayArrayArray125[var1][0][var2]
				+ (var3 * (anIntArrayArrayArray125[var1][1][var2] - anIntArrayArrayArray125[var1][0][var2]));
		var4 *= 1.2207031E-4F;
		return method70(var4);
	}

	final void method72(final DataBuffer var1, final Class15 var2) {
		final int var3 = var1.method564();
		anIntArray131[0] = var3 >> 4;
		anIntArray131[1] = var3 & 15;
		if (var3 != 0) {
			anIntArray127[0] = var1.method566();
			anIntArray127[1] = var1.method566();
			final int var6 = var1.method564();

			int var4;
			int var5;
			for (var4 = 0; var4 < 2; ++var4)
				for (var5 = 0; var5 < anIntArray131[var4]; ++var5) {
					anIntArrayArrayArray125[var4][0][var5] = var1.method566();
					anIntArrayArrayArray126[var4][0][var5] = var1.method566();
				}

			for (var4 = 0; var4 < 2; ++var4)
				for (var5 = 0; var5 < anIntArray131[var4]; ++var5)
					if ((var6 & (1 << (var4 * 4) << var5)) != 0) {
						anIntArrayArrayArray125[var4][1][var5] = var1.method566();
						anIntArrayArrayArray126[var4][1][var5] = var1.method566();
					} else {
						anIntArrayArrayArray125[var4][1][var5] = anIntArrayArrayArray125[var4][0][var5];
						anIntArrayArrayArray126[var4][1][var5] = anIntArrayArrayArray126[var4][0][var5];
					}

			if ((var6 != 0) || (anIntArray127[1] != anIntArray127[0]))
				var2.method74(var1);
		} else {
			final int[] var7 = anIntArray127;
			anIntArray127[1] = 0;
			var7[0] = 0;
		}

	}

	int method73(final int var1, final float var2) {
		float var3;
		if (var1 == 0) {
			var3 = anIntArray127[0] + ((anIntArray127[1] - anIntArray127[0]) * var2);
			var3 *= 0.0030517578F;
			aFloat124 = (float) Math.pow(0.1D, var3 / 20.0F);
			anInt130 = (int) (aFloat124 * 65536.0F);
		}

		if (anIntArray131[var1] == 0)
			return 0;
		else {
			var3 = method69(var1, 0, var2);
			aFloatArrayArray129[var1][0] = -2.0F * var3 * (float) Math.cos(method71(var1, 0, var2));
			aFloatArrayArray129[var1][1] = var3 * var3;

			int var4;
			for (var4 = 1; var4 < anIntArray131[var1]; ++var4) {
				var3 = method69(var1, var4, var2);
				final float var5 = -2.0F * var3 * (float) Math.cos(method71(var1, var4, var2));
				final float var6 = var3 * var3;
				aFloatArrayArray129[var1][(var4 * 2) + 1] = aFloatArrayArray129[var1][(var4 * 2) - 1] * var6;
				aFloatArrayArray129[var1][var4 * 2] = (aFloatArrayArray129[var1][(var4 * 2) - 1] * var5)
						+ (aFloatArrayArray129[var1][(var4 * 2) - 2] * var6);

				for (int var7 = (var4 * 2) - 1; var7 >= 2; --var7)
					aFloatArrayArray129[var1][var7] += (aFloatArrayArray129[var1][var7 - 1] * var5)
							+ (aFloatArrayArray129[var1][var7 - 2] * var6);

				aFloatArrayArray129[var1][1] += (aFloatArrayArray129[var1][0] * var5) + var6;
				aFloatArrayArray129[var1][0] += var5;
			}

			if (var1 == 0)
				for (var4 = 0; var4 < (anIntArray131[0] * 2); ++var4)
					aFloatArrayArray129[0][var4] *= aFloat124;

			for (var4 = 0; var4 < (anIntArray131[var1] * 2); ++var4)
				anIntArrayArray128[var1][var4] = (int) (aFloatArrayArray129[var1][var4] * 65536.0F);

			return anIntArray131[var1] * 2;
		}
	}
}
