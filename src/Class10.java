public class Class10 {
	int anInt104 = Class109_Sub5.method513(16);
	int anInt99 = Class109_Sub5.method513(24);
	int anInt100 = Class109_Sub5.method513(24);
	int anInt101 = Class109_Sub5.method513(24) + 1;
	int anInt102 = Class109_Sub5.method513(6) + 1;
	int anInt103 = Class109_Sub5.method513(8);
	int[] anIntArray98;

	Class10() {
		final int[] var2 = new int[anInt102];

		int var3;
		for (var3 = 0; var3 < anInt102; ++var3) {
			int var4 = 0;
			final int var5 = Class109_Sub5.method513(3);
			final boolean var1 = Class109_Sub5.method512() != 0;
			if (var1)
				var4 = Class109_Sub5.method513(5);

			var2[var3] = (var4 << 3) | var5;
		}

		anIntArray98 = new int[anInt102 * 8];

		for (var3 = 0; var3 < (anInt102 * 8); ++var3)
			anIntArray98[var3] = (var2[var3 >> 3] & (1 << (var3 & 7))) != 0 ? Class109_Sub5.method513(8) : -1;

	}

	void method57(final float[] var1, final int var2, final boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; ++var4)
			var1[var4] = 0.0F;

		if (!var3) {
			var4 = Class109_Sub5.aClass16Array932[anInt103].anInt145;
			final int var7 = anInt100 - anInt99;
			final int var9 = var7 / anInt101;
			final int[] var15 = new int[var9];

			for (int var10 = 0; var10 < 8; ++var10) {
				int var12 = 0;

				while (var12 < var9) {
					int var13;
					int var14;
					if (var10 == 0) {
						var13 = Class109_Sub5.aClass16Array932[anInt103].method79();

						for (var14 = var4 - 1; var14 >= 0; --var14) {
							if ((var12 + var14) < var9)
								var15[var12 + var14] = var13 % anInt102;

							var13 /= anInt102;
						}
					}

					for (var13 = 0; var13 < var4; ++var13) {
						var14 = var15[var12];
						final int var16 = anIntArray98[(var14 * 8) + var10];
						if (var16 >= 0) {
							final int var17 = anInt99 + (var12 * anInt101);
							final Class16 var6 = Class109_Sub5.aClass16Array932[var16];
							int var8;
							if (anInt104 == 0) {
								var8 = anInt101 / var6.anInt145;

								for (int var18 = 0; var18 < var8; ++var18) {
									final float[] var11 = var6.method80();

									for (int var19 = 0; var19 < var6.anInt145; ++var19)
										var1[var17 + var18 + (var19 * var8)] += var11[var19];
								}
							} else {
								var8 = 0;

								while (var8 < anInt101) {
									final float[] var20 = var6.method80();

									for (int var5 = 0; var5 < var6.anInt145; ++var5) {
										var1[var17 + var8] += var20[var5];
										++var8;
									}
								}
							}
						}

						++var12;
						if (var12 >= var9)
							break;
					}
				}
			}

		}
	}
}
