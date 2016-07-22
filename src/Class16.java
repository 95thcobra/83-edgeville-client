public class Class16 {
	int anInt145;
	int anInt144;
	int[] anIntArray147;
	int[] anIntArray146;
	float[][] aFloatArrayArray143;
	int[] anIntArray148;

	Class16() {
		Class109_Sub5.method513(24);
		anInt145 = Class109_Sub5.method513(16);
		anInt144 = Class109_Sub5.method513(24);
		anIntArray147 = new int[anInt144];
		final boolean var3 = Class109_Sub5.method512() != 0;
		int var2;
		int var4;
		int var7;
		if (var3) {
			var2 = 0;

			for (var4 = Class109_Sub5.method513(5) + 1; var2 < anInt144; ++var4) {
				final int var8 = Class109_Sub5.method513(Class3.method20(anInt144 - var2));

				for (var7 = 0; var7 < var8; ++var7)
					anIntArray147[var2++] = var4;
			}
		} else {
			final boolean var14 = Class109_Sub5.method512() != 0;

			for (var4 = 0; var4 < anInt144; ++var4)
				if (var14 && (Class109_Sub5.method512() == 0))
					anIntArray147[var4] = 0;
				else
					anIntArray147[var4] = Class109_Sub5.method513(5) + 1;
		}

		method78();
		var2 = Class109_Sub5.method513(4);
		if (var2 > 0) {
			final float var15 = Class109_Sub5.method516(Class109_Sub5.method513(32));
			final float var16 = Class109_Sub5.method516(Class109_Sub5.method513(32));
			var7 = Class109_Sub5.method513(4) + 1;
			final boolean var10 = Class109_Sub5.method512() != 0;
			int var6;
			if (var2 == 1)
				var6 = method81(anInt144, anInt145);
			else
				var6 = anInt144 * anInt145;

			anIntArray146 = new int[var6];

			int var5;
			for (var5 = 0; var5 < var6; ++var5)
				anIntArray146[var5] = Class109_Sub5.method513(var7);

			aFloatArrayArray143 = new float[anInt144][anInt145];
			int var1;
			int var9;
			float var12;
			if (var2 == 1)
				for (var5 = 0; var5 < anInt144; ++var5) {
					var12 = 0.0F;
					var9 = 1;

					for (var1 = 0; var1 < anInt145; ++var1) {
						final int var11 = (var5 / var9) % var6;
						final float var13 = (anIntArray146[var11] * var16) + var15 + var12;
						aFloatArrayArray143[var5][var1] = var13;
						if (var10)
							var12 = var13;

						var9 *= var6;
					}
				}
			else
				for (var5 = 0; var5 < anInt144; ++var5) {
					var12 = 0.0F;
					var9 = var5 * anInt145;

					for (var1 = 0; var1 < anInt145; ++var1) {
						final float var17 = (anIntArray146[var9] * var16) + var15 + var12;
						aFloatArrayArray143[var5][var1] = var17;
						if (var10)
							var12 = var17;

						++var9;
					}
				}
		}

	}

	void method78() {
		final int[] var1 = new int[anInt144];
		final int[] var5 = new int[33];

		int var2;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var2 = 0; var2 < anInt144; ++var2) {
			var3 = anIntArray147[var2];
			if (var3 != 0) {
				var8 = 1 << (32 - var3);
				var6 = var5[var3];
				var1[var2] = var6;
				int var9;
				if ((var6 & var8) != 0)
					var7 = var5[var3 - 1];
				else {
					var7 = var6 | var8;

					for (var4 = var3 - 1; var4 >= 1; --var4) {
						var9 = var5[var4];
						if (var9 != var6)
							break;

						var10 = 1 << (32 - var4);
						if ((var9 & var10) != 0) {
							var5[var4] = var5[var4 - 1];
							break;
						}

						var5[var4] = var9 | var10;
					}
				}

				var5[var3] = var7;

				for (var4 = var3 + 1; var4 <= 32; ++var4) {
					var9 = var5[var4];
					if (var9 == var6)
						var5[var4] = var7;
				}
			}
		}

		anIntArray148 = new int[8];
		int var11 = 0;

		for (var2 = 0; var2 < anInt144; ++var2) {
			var3 = anIntArray147[var2];
			if (var3 != 0) {
				var8 = var1[var2];
				var6 = 0;

				for (var7 = 0; var7 < var3; ++var7) {
					var4 = Integer.MIN_VALUE >>> var7;
					if ((var8 & var4) != 0) {
						if (anIntArray148[var6] == 0)
							anIntArray148[var6] = var11;

						var6 = anIntArray148[var6];
					} else
						++var6;

					if (var6 >= anIntArray148.length) {
						final int[] var12 = new int[anIntArray148.length * 2];

						for (var10 = 0; var10 < anIntArray148.length; ++var10)
							var12[var10] = anIntArray148[var10];

						anIntArray148 = var12;
					}

					var4 >>>= 1;
				}

				anIntArray148[var6] = ~var2;
				if (var6 >= var11)
					var11 = var6 + 1;
			}
		}

	}

	int method79() {
		int var1;
		for (var1 = 0; anIntArray148[var1] >= 0; var1 = Class109_Sub5.method512() != 0 ? anIntArray148[var1] : var1 + 1)
			;

		return ~anIntArray148[var1];
	}

	float[] method80() {
		return aFloatArrayArray143[method79()];
	}

	static int method81(final int var0, final int var1) {
		int var2 = (int) Math.pow(var0, 1.0D / var1) + 1;

		while (true) {
			int var3 = var2;
			int var4 = var1;

			int var5;
			for (var5 = 1; var4 > 1; var4 >>= 1) {
				if ((var4 & 1) != 0)
					var5 *= var3;

				var3 *= var3;
			}

			int var6;
			if (var4 == 1)
				var6 = var5 * var3;
			else
				var6 = var5;

			if (var6 <= var0)
				return var2;

			--var2;
		}
	}
}
