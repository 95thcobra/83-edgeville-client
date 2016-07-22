import java.util.Random;

public class Class18 {
	Class15 aClass15_164;
	Class15 aClass15_156;
	Class15 aClass15_157;
	Class15 aClass15_158;
	Class15 aClass15_159;
	Class15 aClass15_160;
	Class15 aClass15_161;
	Class15 aClass15_162;
	int anInt166 = 0;
	int anInt168 = 100;
	int anInt170 = 500;
	int anInt171 = 0;
	Class14 aClass14_163;
	Class15 aClass15_174;
	static int[] anIntArray173 = new int['\u8000'];
	static int[] anIntArray167;
	static int[] anIntArray172;
	static int[] anIntArray175;
	static int[] anIntArray176;
	static int[] anIntArray177;
	static int[] anIntArray169;
	static int[] anIntArray179;
	int[] anIntArray178 = new int[] { 0, 0, 0, 0, 0 };
	int[] anIntArray155 = new int[] { 0, 0, 0, 0, 0 };
	int[] anIntArray165 = new int[] { 0, 0, 0, 0, 0 };

	final int[] method86(final int var1, final int var2) {
		Class64.method289(anIntArray172, 0, var1);
		if (var2 < 10)
			return anIntArray172;
		else {
			final double var3 = var1 / (var2 + 0.0D);
			aClass15_164.method75();
			aClass15_156.method75();
			int var13 = 0;
			int var11 = 0;
			int var12 = 0;
			if (aClass15_157 != null) {
				aClass15_157.method75();
				aClass15_158.method75();
				var13 = (int) (((aClass15_157.anInt136 - aClass15_157.anInt133) * 32.768D) / var3);
				var11 = (int) ((aClass15_157.anInt133 * 32.768D) / var3);
			}

			int var5 = 0;
			int var14 = 0;
			int var15 = 0;
			if (aClass15_159 != null) {
				aClass15_159.method75();
				aClass15_160.method75();
				var5 = (int) (((aClass15_159.anInt136 - aClass15_159.anInt133) * 32.768D) / var3);
				var14 = (int) ((aClass15_159.anInt133 * 32.768D) / var3);
			}

			int var6;
			for (var6 = 0; var6 < 5; ++var6)
				if (anIntArray178[var6] != 0) {
					anIntArray175[var6] = 0;
					anIntArray176[var6] = (int) (anIntArray165[var6] * var3);
					anIntArray177[var6] = (anIntArray178[var6] << 14) / 100;
					anIntArray169[var6] = (int) (((aClass15_164.anInt136 - aClass15_164.anInt133) * 32.768D
							* Math.pow(1.0057929410678534D, anIntArray155[var6])) / var3);
					anIntArray179[var6] = (int) ((aClass15_164.anInt133 * 32.768D) / var3);
				}

			int var7;
			int var9;
			int var16;
			int var17;
			for (var6 = 0; var6 < var1; ++var6) {
				var9 = aClass15_164.method76(var1);
				var16 = aClass15_156.method76(var1);
				if (aClass15_157 != null) {
					var7 = aClass15_157.method76(var1);
					var17 = aClass15_158.method76(var1);
					var9 += method88(var12, var17, aClass15_157.anInt132) >> 1;
					var12 += ((var7 * var13) >> 16) + var11;
				}

				if (aClass15_159 != null) {
					var7 = aClass15_159.method76(var1);
					var17 = aClass15_160.method76(var1);
					var16 = (var16 * ((method88(var15, var17, aClass15_159.anInt132) >> 1) + '\u8000')) >> 15;
					var15 += ((var7 * var5) >> 16) + var14;
				}

				for (var7 = 0; var7 < 5; ++var7)
					if (anIntArray178[var7] != 0) {
						var17 = var6 + anIntArray176[var7];
						if (var17 < var1) {
							anIntArray172[var17] += method88(anIntArray175[var7], (var16 * anIntArray177[var7]) >> 15,
									aClass15_164.anInt132);
							anIntArray175[var7] += ((var9 * anIntArray169[var7]) >> 16) + anIntArray179[var7];
						}
					}
			}

			int var18;
			if (aClass15_161 != null) {
				aClass15_161.method75();
				aClass15_162.method75();
				var6 = 0;
				boolean var20 = true;

				for (var7 = 0; var7 < var1; ++var7) {
					var17 = aClass15_161.method76(var1);
					var18 = aClass15_162.method76(var1);
					if (var20)
						var9 = aClass15_161.anInt133 + (((aClass15_161.anInt136 - aClass15_161.anInt133) * var17) >> 8);
					else
						var9 = aClass15_161.anInt133 + (((aClass15_161.anInt136 - aClass15_161.anInt133) * var18) >> 8);

					var6 += 256;
					if (var6 >= var9) {
						var6 = 0;
						var20 = !var20;
					}

					if (var20)
						anIntArray172[var7] = 0;
				}
			}

			if ((anInt166 > 0) && (anInt168 > 0)) {
				var6 = (int) (anInt166 * var3);

				for (var9 = var6; var9 < var1; ++var9)
					anIntArray172[var9] += (anIntArray172[var9 - var6] * anInt168) / 100;
			}

			if ((aClass14_163.anIntArray131[0] > 0) || (aClass14_163.anIntArray131[1] > 0)) {
				aClass15_174.method75();
				var6 = aClass15_174.method76(var1 + 1);
				var9 = aClass14_163.method73(0, var6 / 65536.0F);
				var16 = aClass14_163.method73(1, var6 / 65536.0F);
				if (var1 >= (var9 + var16)) {
					var7 = 0;
					var17 = var16;
					if (var16 > (var1 - var9))
						var17 = var1 - var9;

					int var8;
					while (var7 < var17) {
						var18 = (int) (((long) anIntArray172[var7 + var9] * (long) Class14.anInt130) >> 16);

						for (var8 = 0; var8 < var9; ++var8)
							var18 += (int) (((long) anIntArray172[(var7 + var9) - 1 - var8]
									* (long) Class14.anIntArrayArray128[0][var8]) >> 16);

						for (var8 = 0; var8 < var7; ++var8)
							var18 -= (int) (((long) anIntArray172[var7 - 1 - var8]
									* (long) Class14.anIntArrayArray128[1][var8]) >> 16);

						anIntArray172[var7] = var18;
						var6 = aClass15_174.method76(var1 + 1);
						++var7;
					}

					var17 = 128;

					while (true) {
						if (var17 > (var1 - var9))
							var17 = var1 - var9;

						int var10;
						while (var7 < var17) {
							var8 = (int) (((long) anIntArray172[var7 + var9] * (long) Class14.anInt130) >> 16);

							for (var10 = 0; var10 < var9; ++var10)
								var8 += (int) (((long) anIntArray172[(var7 + var9) - 1 - var10]
										* (long) Class14.anIntArrayArray128[0][var10]) >> 16);

							for (var10 = 0; var10 < var16; ++var10)
								var8 -= (int) (((long) anIntArray172[var7 - 1 - var10]
										* (long) Class14.anIntArrayArray128[1][var10]) >> 16);

							anIntArray172[var7] = var8;
							var6 = aClass15_174.method76(var1 + 1);
							++var7;
						}

						if (var7 >= (var1 - var9)) {
							while (var7 < var1) {
								var8 = 0;

								for (var10 = (var7 + var9) - var1; var10 < var9; ++var10)
									var8 += (int) (((long) anIntArray172[(var7 + var9) - 1 - var10]
											* (long) Class14.anIntArrayArray128[0][var10]) >> 16);

								for (var10 = 0; var10 < var16; ++var10)
									var8 -= (int) (((long) anIntArray172[var7 - 1 - var10]
											* (long) Class14.anIntArrayArray128[1][var10]) >> 16);

								anIntArray172[var7] = var8;
								aClass15_174.method76(var1 + 1);
								++var7;
							}
							break;
						}

						var9 = aClass14_163.method73(0, var6 / 65536.0F);
						var16 = aClass14_163.method73(1, var6 / 65536.0F);
						var17 += 128;
					}
				}
			}

			for (var6 = 0; var6 < var1; ++var6) {
				if (anIntArray172[var6] < -32768)
					anIntArray172[var6] = -32768;

				if (anIntArray172[var6] > 32767)
					anIntArray172[var6] = 32767;
			}

			return anIntArray172;
		}
	}

	final void method87(final DataBuffer var1) {
		aClass15_164 = new Class15();
		aClass15_164.method77(var1);
		aClass15_156 = new Class15();
		aClass15_156.method77(var1);
		int var2 = var1.method564();
		if (var2 != 0) {
			--var1.position;
			aClass15_157 = new Class15();
			aClass15_157.method77(var1);
			aClass15_158 = new Class15();
			aClass15_158.method77(var1);
		}

		var2 = var1.method564();
		if (var2 != 0) {
			--var1.position;
			aClass15_159 = new Class15();
			aClass15_159.method77(var1);
			aClass15_160 = new Class15();
			aClass15_160.method77(var1);
		}

		var2 = var1.method564();
		if (var2 != 0) {
			--var1.position;
			aClass15_161 = new Class15();
			aClass15_161.method77(var1);
			aClass15_162 = new Class15();
			aClass15_162.method77(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			final int var4 = var1.method574();
			if (var4 == 0)
				break;

			anIntArray178[var3] = var4;
			anIntArray155[var3] = var1.method573();
			anIntArray165[var3] = var1.method574();
		}

		anInt166 = var1.method574();
		anInt168 = var1.method574();
		anInt170 = var1.readShort();
		anInt171 = var1.readShort();
		aClass14_163 = new Class14();
		aClass15_174 = new Class15();
		aClass14_163.method72(var1, aClass15_174);
	}

	static {
		final Random var1 = new Random(0L);

		int var0;
		for (var0 = 0; var0 < '\u8000'; ++var0)
			anIntArray173[var0] = (var1.nextInt() & 2) - 1;

		anIntArray167 = new int['\u8000'];

		for (var0 = 0; var0 < '\u8000'; ++var0)
			anIntArray167[var0] = (int) (Math.sin(var0 / 5215.1903D) * 16384.0D);

		anIntArray172 = new int[220500];
		anIntArray175 = new int[5];
		anIntArray176 = new int[5];
		anIntArray177 = new int[5];
		anIntArray169 = new int[5];
		anIntArray179 = new int[5];
	}

	final int method88(final int var1, final int var2, final int var3) {
		return var3 == 1 ? ((var1 & 32767) < 16384 ? var2 : -var2)
				: (var3 == 2 ? (anIntArray167[var1 & 32767] * var2) >> 14
						: (var3 == 3 ? (((var1 & 32767) * var2) >> 14) - var2
								: (var3 == 4 ? anIntArray173[(var1 / 2607) & 32767] * var2 : 0)));
	}
}
