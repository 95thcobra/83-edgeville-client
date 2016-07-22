public class Class42 {
	int anInt385 = 0;
	int anInt384 = 0;
	static int anInt409;
	static boolean aBool419 = false;
	static int anInt406 = 0;
	static int anInt407 = 0;
	static int anInt408 = 0;
	public static int anInt396 = -1;
	public static int anInt410 = -1;
	static int anInt400;
	static int anInt401;
	static int anInt432;
	static int anInt402;
	static int anInt403;
	static boolean[][] aBoolArrayArray427;
	static int anInt398;
	static int anInt399;
	static int anInt405;
	static int anInt388;
	static int anInt397;
	static int anInt391 = 0;
	static int anInt423;
	static int anInt394;
	static int anInt393;
	static int anInt395;
	static int anInt390 = 0;
	public static boolean aBool430 = true;
	static Class26[] aClass26Array404 = new Class26[100];
	static int anInt412 = 4;
	static int[] anIntArray428;
	static Class37[][] aClass37ArrayArray414;
	static Class37[] aClass37Array415;
	static Class126 aClass126_416;
	static int[] anIntArray417;
	static int[] anIntArray418;
	static int[] anIntArray389;
	static int[] anIntArray420;
	static int[] anIntArray425;
	static int[] anIntArray422;
	static int[] anIntArray392;
	static boolean[][][][] aBoolArrayArrayArrayArray426;
	static int anInt411;
	static int anInt431;
	static int anInt421;
	static int anInt433;
	static int anInt378;
	static int anInt429;
	Class26[] aClass26Array386 = new Class26[5000];
	int[][] anIntArrayArray424 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	int[][] anIntArrayArray413 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
			{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
			{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
			{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	int anInt379;
	int anInt380;
	int anInt381;
	Class109_Sub8[][][] aClass109_Sub8ArrayArrayArray383;
	int[][][] anIntArrayArrayArray387;
	int[][][] anIntArrayArrayArray382;

	public void method176() {
		int var1;
		int var2;
		for (var1 = 0; var1 < anInt379; ++var1)
			for (var2 = 0; var2 < anInt380; ++var2)
				for (int var3 = 0; var3 < anInt381; ++var3)
					aClass109_Sub8ArrayArrayArray383[var1][var2][var3] = null;

		for (var1 = 0; var1 < anInt412; ++var1) {
			for (var2 = 0; var2 < anIntArray428[var1]; ++var2)
				aClass37ArrayArray414[var1][var2] = null;

			anIntArray428[var1] = 0;
		}

		for (var1 = 0; var1 < anInt385; ++var1)
			aClass26Array386[var1] = null;

		anInt385 = 0;

		for (var1 = 0; var1 < aClass26Array404.length; ++var1)
			aClass26Array404[var1] = null;

	}

	public void method177(final int var1) {
		anInt384 = var1;

		for (int var3 = 0; var3 < anInt380; ++var3)
			for (int var2 = 0; var2 < anInt381; ++var2)
				if (aClass109_Sub8ArrayArrayArray383[var1][var3][var2] == null)
					aClass109_Sub8ArrayArrayArray383[var1][var3][var2] = new Class109_Sub8(var1, var3, var2);

	}

	public void method178(final int var1, final int var2, final int var3, final int var4,
			final Class109_Sub21_Sub15 var5, final int var6, final Class109_Sub21_Sub15 var7,
			final Class109_Sub21_Sub15 var8) {
		final Class48 var9 = new Class48();
		var9.aClass109_Sub21_Sub15_499 = var5;
		var9.anInt497 = (var2 * 128) + 64;
		var9.anInt505 = (var3 * 128) + 64;
		var9.anInt498 = var4;
		var9.anInt503 = var6;
		var9.aClass109_Sub21_Sub15_500 = var7;
		var9.aClass109_Sub21_Sub15_496 = var8;
		int var12 = 0;
		final Class109_Sub8 var10 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var10 != null)
			for (int var11 = 0; var11 < var10.anInt982; ++var11)
				if (((var10.aClass26Array987[var11].anInt242 & 256) == 256)
						&& (var10.aClass26Array987[var11].aClass109_Sub21_Sub15_230 instanceof Class109_Sub21_Sub15_Sub4)) {
					final Class109_Sub21_Sub15_Sub4 var13 = (Class109_Sub21_Sub15_Sub4) var10.aClass26Array987[var11].aClass109_Sub21_Sub15_230;
					var13.method937();
					if (var13.anInt1576 > var12)
						var12 = var13.anInt1576;
				}

		var9.anInt502 = var12;
		if (aClass109_Sub8ArrayArrayArray383[var1][var2][var3] == null)
			aClass109_Sub8ArrayArrayArray383[var1][var2][var3] = new Class109_Sub8(var1, var2, var3);

		aClass109_Sub8ArrayArrayArray383[var1][var2][var3].aClass48_984 = var9;
	}

	public static void method179(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7) {
		final Class37 var8 = new Class37();
		var8.anInt343 = var2 / 128;
		var8.anInt340 = var3 / 128;
		var8.anInt341 = var4 / 128;
		var8.anInt339 = var5 / 128;
		var8.anInt342 = var1;
		var8.anInt346 = var2;
		var8.anInt344 = var3;
		var8.anInt345 = var4;
		var8.anInt357 = var5;
		var8.anInt347 = var6;
		var8.anInt348 = var7;
		aClass37ArrayArray414[var0][anIntArray428[var0]++] = var8;
	}

	public void method180(final int var1, final int var2, final int var3, final int var4) {
		final Class109_Sub8 var5 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var5 != null)
			aClass109_Sub8ArrayArrayArray383[var1][var2][var3].anInt986 = var4;
	}

	void method181() {
		final int var1 = anIntArray428[anInt391];
		final Class37[] var3 = aClass37ArrayArray414[anInt391];
		anInt409 = 0;

		for (int var5 = 0; var5 < var1; ++var5) {
			final Class37 var6 = var3[var5];
			int var2;
			int var7;
			int var8;
			int var9;
			boolean var13;
			if (var6.anInt342 == 1) {
				var7 = (var6.anInt343 - anInt388) + 25;
				if ((var7 >= 0) && (var7 <= 50)) {
					var8 = (var6.anInt341 - anInt397) + 25;
					if (var8 < 0)
						var8 = 0;

					var9 = (var6.anInt339 - anInt397) + 25;
					if (var9 > 50)
						var9 = 50;

					var13 = false;

					while (var8 <= var9)
						if (aBoolArrayArray427[var7][var8++]) {
							var13 = true;
							break;
						}

					if (var13) {
						var2 = anInt398 - var6.anInt346;
						if (var2 > 32)
							var6.anInt349 = 1;
						else {
							if (var2 >= -32)
								continue;

							var6.anInt349 = 2;
							var2 = -var2;
						}

						var6.anInt352 = ((var6.anInt345 - anInt405) << 8) / var2;
						var6.anInt353 = ((var6.anInt357 - anInt405) << 8) / var2;
						var6.anInt354 = ((var6.anInt347 - anInt399) << 8) / var2;
						var6.anInt355 = ((var6.anInt348 - anInt399) << 8) / var2;
						aClass37Array415[anInt409++] = var6;
					}
				}
			} else if (var6.anInt342 == 2) {
				var7 = (var6.anInt341 - anInt397) + 25;
				if ((var7 >= 0) && (var7 <= 50)) {
					var8 = (var6.anInt343 - anInt388) + 25;
					if (var8 < 0)
						var8 = 0;

					var9 = (var6.anInt340 - anInt388) + 25;
					if (var9 > 50)
						var9 = 50;

					var13 = false;

					while (var8 <= var9)
						if (aBoolArrayArray427[var8++][var7]) {
							var13 = true;
							break;
						}

					if (var13) {
						var2 = anInt405 - var6.anInt345;
						if (var2 > 32)
							var6.anInt349 = 3;
						else {
							if (var2 >= -32)
								continue;

							var6.anInt349 = 4;
							var2 = -var2;
						}

						var6.anInt350 = ((var6.anInt346 - anInt398) << 8) / var2;
						var6.anInt351 = ((var6.anInt344 - anInt398) << 8) / var2;
						var6.anInt354 = ((var6.anInt347 - anInt399) << 8) / var2;
						var6.anInt355 = ((var6.anInt348 - anInt399) << 8) / var2;
						aClass37Array415[anInt409++] = var6;
					}
				}
			} else if (var6.anInt342 == 4) {
				var7 = var6.anInt347 - anInt399;
				if (var7 > 128) {
					var8 = (var6.anInt341 - anInt397) + 25;
					if (var8 < 0)
						var8 = 0;

					var9 = (var6.anInt339 - anInt397) + 25;
					if (var9 > 50)
						var9 = 50;

					if (var8 <= var9) {
						int var4 = (var6.anInt343 - anInt388) + 25;
						if (var4 < 0)
							var4 = 0;

						var2 = (var6.anInt340 - anInt388) + 25;
						if (var2 > 50)
							var2 = 50;

						boolean var12 = false;

						label188: for (int var10 = var4; var10 <= var2; ++var10)
							for (int var11 = var8; var11 <= var9; ++var11)
								if (aBoolArrayArray427[var10][var11]) {
									var12 = true;
									break label188;
								}

						if (var12) {
							var6.anInt349 = 5;
							var6.anInt350 = ((var6.anInt346 - anInt398) << 8) / var7;
							var6.anInt351 = ((var6.anInt344 - anInt398) << 8) / var7;
							var6.anInt352 = ((var6.anInt345 - anInt405) << 8) / var7;
							var6.anInt353 = ((var6.anInt357 - anInt405) << 8) / var7;
							aClass37Array415[anInt409++] = var6;
						}
					}
				}
			}
		}

	}

	public void method182(final int var1, final int var2, final int var3, final int var4,
			final Class109_Sub21_Sub15 var5, final int var6, final int var7) {
		if (var5 != null) {
			final Class23 var8 = new Class23();
			var8.aClass109_Sub21_Sub15_217 = var5;
			var8.anInt220 = (var2 * 128) + 64;
			var8.anInt216 = (var3 * 128) + 64;
			var8.anInt219 = var4;
			var8.anInt218 = var6;
			var8.anInt215 = var7;
			if (aClass109_Sub8ArrayArrayArray383[var1][var2][var3] == null)
				aClass109_Sub8ArrayArrayArray383[var1][var2][var3] = new Class109_Sub8(var1, var2, var3);

			aClass109_Sub8ArrayArrayArray383[var1][var2][var3].aClass23_980 = var8;
		}
	}

	public void method183(final int var1, final int var2, final int var3, final int var4,
			final Class109_Sub21_Sub15 var5, final Class109_Sub21_Sub15 var6, final int var7, final int var8,
			final int var9, final int var10) {
		if ((var5 != null) || (var6 != null)) {
			final LoginEncoder var11 = new LoginEncoder();
			var11.anInt516 = var9;
			var11.anInt522 = var10;
			var11.anInt515 = (var2 * 128) + 64;
			var11.anInt520 = (var3 * 128) + 64;
			var11.anInt521 = var4;
			var11.aClass109_Sub21_Sub15_519 = var5;
			var11.aClass109_Sub21_Sub15_523 = var6;
			var11.anInt517 = var7;
			var11.anInt518 = var8;

			for (int var12 = var1; var12 >= 0; --var12)
				if (aClass109_Sub8ArrayArrayArray383[var12][var2][var3] == null)
					aClass109_Sub8ArrayArrayArray383[var12][var2][var3] = new Class109_Sub8(var12, var2, var3);

			aClass109_Sub8ArrayArrayArray383[var1][var2][var3].aClass51_978 = var11;
		}
	}

	public void method184(final int var1, final int var2, final int var3, final int var4,
			final Class109_Sub21_Sub15 var5, final Class109_Sub21_Sub15 var6, final int var7, final int var8,
			final int var9, final int var10, final int var11, final int var12) {
		if (var5 != null) {
			final Class22 var13 = new Class22();
			var13.anInt212 = var11;
			var13.anInt214 = var12;
			var13.anInt205 = (var2 * 128) + 64;
			var13.anInt204 = (var3 * 128) + 64;
			var13.anInt211 = var4;
			var13.aClass109_Sub21_Sub15_213 = var5;
			var13.aClass109_Sub21_Sub15_207 = var6;
			var13.anInt206 = var7;
			var13.anInt210 = var8;
			var13.anInt208 = var9;
			var13.anInt209 = var10;

			for (int var14 = var1; var14 >= 0; --var14)
				if (aClass109_Sub8ArrayArrayArray383[var14][var2][var3] == null)
					aClass109_Sub8ArrayArrayArray383[var14][var2][var3] = new Class109_Sub8(var14, var2, var3);

			aClass109_Sub8ArrayArrayArray383[var1][var2][var3].aClass22_979 = var13;
		}
	}

	public boolean method185(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final Class109_Sub21_Sub15 var7, final int var8, final int var9, final int var10) {
		if (var7 == null)
			return true;
		else {
			final int var11 = (var2 * 128) + (64 * var5);
			final int var12 = (var3 * 128) + (64 * var6);
			return method188(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
		}
	}

	public boolean method186(final int var1, final int var2, final int var3, final int var4, final int var5,
			final Class109_Sub21_Sub15 var6, final int var7, final int var8, final boolean var9) {
		if (var6 == null)
			return true;
		else {
			int var13 = var2 - var5;
			int var10 = var3 - var5;
			int var11 = var2 + var5;
			int var12 = var3 + var5;
			if (var9) {
				if ((var7 > 640) && (var7 < 1408))
					var12 += 128;

				if ((var7 > 1152) && (var7 < 1920))
					var11 += 128;

				if ((var7 > 1664) || (var7 < 384))
					var10 -= 128;

				if ((var7 > 128) && (var7 < 896))
					var13 -= 128;
			}

			var13 /= 128;
			var10 /= 128;
			var11 /= 128;
			var12 /= 128;
			return method188(var1, var13, var10, (var11 - var13) + 1, (var12 - var10) + 1, var2, var3, var4, var6, var7,
					true, var8, 0);
		}
	}

	public boolean method187(final int var1, final int var2, final int var3, final int var4, final int var5,
			final Class109_Sub21_Sub15 var6, final int var7, final int var8, final int var9, final int var10,
			final int var11, final int var12) {
		return var6 == null ? true
				: method188(var1, var9, var10, (var11 - var9) + 1, (var12 - var10) + 1, var2, var3, var4, var6, var7,
						true, var8, 0);
	}

	boolean method188(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final Class109_Sub21_Sub15 var9, final int var10, final boolean var11,
			final int var12, final int var13) {
		int var15;
		for (int var14 = var2; var14 < (var2 + var4); ++var14)
			for (var15 = var3; var15 < (var3 + var5); ++var15) {
				if ((var14 < 0) || (var15 < 0) || (var14 >= anInt380) || (var15 >= anInt381))
					return false;

				final Class109_Sub8 var16 = aClass109_Sub8ArrayArrayArray383[var1][var14][var15];
				if ((var16 != null) && (var16.anInt982 >= 5))
					return false;
			}

		final Class26 var17 = new Class26();
		var17.anInt238 = var12;
		var17.anInt242 = var13;
		var17.anInt227 = var1;
		var17.anInt228 = var6;
		var17.anInt233 = var7;
		var17.anInt236 = var8;
		var17.aClass109_Sub21_Sub15_230 = var9;
		var17.anInt231 = var10;
		var17.anInt232 = var2;
		var17.anInt234 = var3;
		var17.anInt239 = (var2 + var4) - 1;
		var17.anInt235 = (var3 + var5) - 1;

		for (var15 = var2; var15 < (var2 + var4); ++var15)
			for (int var18 = var3; var18 < (var3 + var5); ++var18) {
				int var20 = 0;
				if (var15 > var2)
					++var20;

				if (var15 < ((var2 + var4) - 1))
					var20 += 4;

				if (var18 > var3)
					var20 += 8;

				if (var18 < ((var3 + var5) - 1))
					var20 += 2;

				for (int var19 = var1; var19 >= 0; --var19)
					if (aClass109_Sub8ArrayArrayArray383[var19][var15][var18] == null)
						aClass109_Sub8ArrayArrayArray383[var19][var15][var18] = new Class109_Sub8(var19, var15, var18);

				final Class109_Sub8 var21 = aClass109_Sub8ArrayArrayArray383[var1][var15][var18];
				var21.aClass26Array987[var21.anInt982] = var17;
				var21.anIntArray990[var21.anInt982] = var20;
				var21.anInt985 |= var20;
				++var21.anInt982;
			}

		if (var11)
			aClass26Array386[anInt385++] = var17;

		return true;
	}

	void method189(final Class26 var1) {
		for (int var2 = var1.anInt232; var2 <= var1.anInt239; ++var2)
			for (int var6 = var1.anInt234; var6 <= var1.anInt235; ++var6) {
				final Class109_Sub8 var3 = aClass109_Sub8ArrayArrayArray383[var1.anInt227][var2][var6];
				if (var3 != null) {
					int var5;
					for (var5 = 0; var5 < var3.anInt982; ++var5)
						if (var3.aClass26Array987[var5] == var1) {
							--var3.anInt982;

							for (int var7 = var5; var7 < var3.anInt982; ++var7) {
								var3.aClass26Array987[var7] = var3.aClass26Array987[var7 + 1];
								var3.anIntArray990[var7] = var3.anIntArray990[var7 + 1];
							}

							var3.aClass26Array987[var3.anInt982] = null;
							break;
						}

					var3.anInt985 = 0;

					for (var5 = 0; var5 < var3.anInt982; ++var5)
						var3.anInt985 |= var3.anIntArray990[var5];
				}
			}

	}

	public void method190(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var4 != null)
			var4.aClass51_978 = null;
	}

	public void method191(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var4 != null)
			for (int var6 = 0; var6 < var4.anInt982; ++var6) {
				final Class26 var5 = var4.aClass26Array987[var6];
				if ((((var5.anInt238 >> 29) & 3) == 2) && (var5.anInt232 == var2) && (var5.anInt234 == var3)) {
					method189(var5);
					return;
				}
			}
	}

	public void method192(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var4 != null)
			var4.aClass23_980 = null;
	}

	public LoginEncoder method193(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		return var4 == null ? null : var4.aClass51_978;
	}

	public Class22 method194(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		return var4 == null ? null : var4.aClass22_979;
	}

	public Class26 method195(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var4 == null)
			return null;
		else {
			for (int var5 = 0; var5 < var4.anInt982; ++var5) {
				final Class26 var6 = var4.aClass26Array987[var5];
				if ((((var6.anInt238 >> 29) & 3) == 2) && (var6.anInt232 == var2) && (var6.anInt234 == var3))
					return var6;
			}

			return null;
		}
	}

	public Class23 method196(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		return (var4 != null) && (var4.aClass23_980 != null) ? var4.aClass23_980 : null;
	}

	public int method197(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		return (var4 != null) && (var4.aClass51_978 != null) ? var4.aClass51_978.anInt516 : 0;
	}

	public int method198(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		return (var4 != null) && (var4.aClass22_979 != null) ? var4.aClass22_979.anInt212 : 0;
	}

	public int method199(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var4 == null)
			return 0;
		else {
			for (int var5 = 0; var5 < var4.anInt982; ++var5) {
				final Class26 var6 = var4.aClass26Array987[var5];
				if ((((var6.anInt238 >> 29) & 3) == 2) && (var6.anInt232 == var2) && (var6.anInt234 == var3))
					return var6.anInt238;
			}

			return 0;
		}
	}

	boolean method200(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6) {
		int var9;
		int var10;
		if ((var2 == var3) && (var4 == var5)) {
			if (!method225(var1, var2, var4))
				return false;
			else {
				var10 = var2 << 7;
				var9 = var4 << 7;
				return method215(var10 + 1, anIntArrayArrayArray382[var1][var2][var4] - var6, var9 + 1)
						&& method215((var10 + 128) - 1, anIntArrayArrayArray382[var1][var2 + 1][var4] - var6, var9 + 1)
						&& method215((var10 + 128) - 1, anIntArrayArrayArray382[var1][var2 + 1][var4 + 1] - var6,
								(var9 + 128) - 1)
						&& method215(var10 + 1, anIntArrayArrayArray382[var1][var2][var4 + 1] - var6, (var9 + 128) - 1);
			}
		} else {
			for (var10 = var2; var10 <= var3; ++var10)
				for (var9 = var4; var9 <= var5; ++var9)
					if (anIntArrayArrayArray387[var1][var10][var9] == -anInt400)
						return false;

			var10 = (var2 << 7) + 1;
			var9 = (var4 << 7) + 2;
			final int var8 = anIntArrayArrayArray382[var1][var2][var4] - var6;
			if (!method215(var10, var8, var9))
				return false;
			else {
				final int var7 = (var3 << 7) - 1;
				if (!method215(var7, var8, var9))
					return false;
				else {
					final int var11 = (var5 << 7) - 1;
					if (!method215(var10, var8, var11))
						return false;
					else if (!method215(var7, var8, var11))
						return false;
					else
						return true;
				}
			}
		}
	}

	public void method201(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt379; ++var4)
			for (int var7 = 0; var7 < anInt380; ++var7)
				for (int var8 = 0; var8 < anInt381; ++var8) {
					final Class109_Sub8 var10 = aClass109_Sub8ArrayArrayArray383[var4][var7][var8];
					if (var10 != null) {
						final LoginEncoder var12 = var10.aClass51_978;
						Class109_Sub21_Sub15_Sub7 var6;
						if ((var12 != null) && (var12.aClass109_Sub21_Sub15_519 instanceof Class109_Sub21_Sub15_Sub7)) {
							final Class109_Sub21_Sub15_Sub7 var5 = (Class109_Sub21_Sub15_Sub7) var12.aClass109_Sub21_Sub15_519;
							method220(var5, var4, var7, var8, 1, 1);
							if (var12.aClass109_Sub21_Sub15_523 instanceof Class109_Sub21_Sub15_Sub7) {
								var6 = (Class109_Sub21_Sub15_Sub7) var12.aClass109_Sub21_Sub15_523;
								method220(var6, var4, var7, var8, 1, 1);
								Class109_Sub21_Sub15_Sub7.method997(var5, var6, 0, 0, 0, false);
								var12.aClass109_Sub21_Sub15_523 = var6.method1000(var6.aShort1882, var6.aShort1883,
										var1, var2, var3);
							}

							var12.aClass109_Sub21_Sub15_519 = var5.method1000(var5.aShort1882, var5.aShort1883, var1,
									var2, var3);
						}

						for (int var11 = 0; var11 < var10.anInt982; ++var11) {
							final Class26 var14 = var10.aClass26Array987[var11];
							if ((var14 != null)
									&& (var14.aClass109_Sub21_Sub15_230 instanceof Class109_Sub21_Sub15_Sub7)) {
								final Class109_Sub21_Sub15_Sub7 var9 = (Class109_Sub21_Sub15_Sub7) var14.aClass109_Sub21_Sub15_230;
								method220(var9, var4, var7, var8, (var14.anInt239 - var14.anInt232) + 1,
										(var14.anInt235 - var14.anInt234) + 1);
								var14.aClass109_Sub21_Sub15_230 = var9.method1000(var9.aShort1882, var9.aShort1883,
										var1, var2, var3);
							}
						}

						final Class23 var13 = var10.aClass23_980;
						if ((var13 != null) && (var13.aClass109_Sub21_Sub15_217 instanceof Class109_Sub21_Sub15_Sub7)) {
							var6 = (Class109_Sub21_Sub15_Sub7) var13.aClass109_Sub21_Sub15_217;
							method202(var6, var4, var7, var8);
							var13.aClass109_Sub21_Sub15_217 = var6.method1000(var6.aShort1882, var6.aShort1883, var1,
									var2, var3);
						}
					}
				}

	}

	void method202(final Class109_Sub21_Sub15_Sub7 var1, final int var2, final int var3, final int var4) {
		Class109_Sub8 var5;
		Class109_Sub21_Sub15_Sub7 var6;
		if (var3 < anInt380) {
			var5 = aClass109_Sub8ArrayArrayArray383[var2][var3 + 1][var4];
			if ((var5 != null) && (var5.aClass23_980 != null)
					&& (var5.aClass23_980.aClass109_Sub21_Sub15_217 instanceof Class109_Sub21_Sub15_Sub7)) {
				var6 = (Class109_Sub21_Sub15_Sub7) var5.aClass23_980.aClass109_Sub21_Sub15_217;
				Class109_Sub21_Sub15_Sub7.method997(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < anInt380) {
			var5 = aClass109_Sub8ArrayArrayArray383[var2][var3][var4 + 1];
			if ((var5 != null) && (var5.aClass23_980 != null)
					&& (var5.aClass23_980.aClass109_Sub21_Sub15_217 instanceof Class109_Sub21_Sub15_Sub7)) {
				var6 = (Class109_Sub21_Sub15_Sub7) var5.aClass23_980.aClass109_Sub21_Sub15_217;
				Class109_Sub21_Sub15_Sub7.method997(var1, var6, 0, 0, 128, true);
			}
		}

		if ((var3 < anInt380) && (var4 < anInt381)) {
			var5 = aClass109_Sub8ArrayArrayArray383[var2][var3 + 1][var4 + 1];
			if ((var5 != null) && (var5.aClass23_980 != null)
					&& (var5.aClass23_980.aClass109_Sub21_Sub15_217 instanceof Class109_Sub21_Sub15_Sub7)) {
				var6 = (Class109_Sub21_Sub15_Sub7) var5.aClass23_980.aClass109_Sub21_Sub15_217;
				Class109_Sub21_Sub15_Sub7.method997(var1, var6, 128, 0, 128, true);
			}
		}

		if ((var3 < anInt380) && (var4 > 0)) {
			var5 = aClass109_Sub8ArrayArrayArray383[var2][var3 + 1][var4 - 1];
			if ((var5 != null) && (var5.aClass23_980 != null)
					&& (var5.aClass23_980.aClass109_Sub21_Sub15_217 instanceof Class109_Sub21_Sub15_Sub7)) {
				var6 = (Class109_Sub21_Sub15_Sub7) var5.aClass23_980.aClass109_Sub21_Sub15_217;
				Class109_Sub21_Sub15_Sub7.method997(var1, var6, 128, 0, -128, true);
			}
		}

	}

	public void method203(final int var1, final int var2, final int var3, final int var4) {
		final Class109_Sub8 var5 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var5 != null) {
			final Class22 var6 = var5.aClass22_979;
			if (var6 != null) {
				var6.anInt208 = (var6.anInt208 * var4) / 16;
				var6.anInt209 = (var6.anInt209 * var4) / 16;
			}
		}
	}

	static boolean method204(final int var0, final int var1, final int var2) {
		final int var3 = ((var2 * anInt402) + (var0 * anInt403)) >> 16;
		final int var6 = ((var2 * anInt403) - (var0 * anInt402)) >> 16;
		final int var4 = ((var1 * anInt401) + (var6 * anInt432)) >> 16;
		final int var7 = ((var1 * anInt432) - (var6 * anInt401)) >> 16;
		if ((var4 >= 50) && (var4 <= 3500)) {
			final int var5 = anInt378 + ((var3 * Class109_Sub21_Sub14_Sub3.anInt1822) / var4);
			final int var8 = anInt429 + ((var7 * Class109_Sub21_Sub14_Sub3.anInt1822) / var4);
			return (var5 >= anInt411) && (var5 <= anInt421) && (var8 >= anInt431) && (var8 <= anInt433);
		} else
			return false;
	}

	public void method205(final int var1, final int var2, final int var3) {
		aBool419 = true;
		anInt406 = var1;
		anInt407 = var2;
		anInt408 = var3;
		anInt396 = -1;
		anInt410 = -1;
	}

	public void method206(int var1, final int var2, int var3, final int var4, final int var5, final int var6) {
		if (var1 < 0)
			var1 = 0;
		else if (var1 >= (anInt380 * 128))
			var1 = (anInt380 * 128) - 1;

		if (var3 < 0)
			var3 = 0;
		else if (var3 >= (anInt381 * 128))
			var3 = (anInt381 * 128) - 1;

		++anInt400;
		anInt401 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var4];
		anInt432 = Class109_Sub21_Sub14_Sub3.anIntArray1836[var4];
		anInt402 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var5];
		anInt403 = Class109_Sub21_Sub14_Sub3.anIntArray1836[var5];
		aBoolArrayArray427 = aBoolArrayArrayArrayArray426[(var4 - 128) / 32][var5 / 64];
		anInt398 = var1;
		anInt399 = var2;
		anInt405 = var3;
		anInt388 = var1 / 128;
		anInt397 = var3 / 128;
		anInt391 = var6;
		anInt423 = anInt388 - 25;
		if (anInt423 < 0)
			anInt423 = 0;

		anInt394 = anInt397 - 25;
		if (anInt394 < 0)
			anInt394 = 0;

		anInt393 = anInt388 + 25;
		if (anInt393 > anInt380)
			anInt393 = anInt380;

		anInt395 = anInt397 + 25;
		if (anInt395 > anInt381)
			anInt395 = anInt381;

		method181();
		anInt390 = 0;

		int var7;
		int var8;
		int var12;
		Class109_Sub8[][] var13;
		for (var12 = anInt384; var12 < anInt379; ++var12) {
			var13 = aClass109_Sub8ArrayArrayArray383[var12];

			for (var7 = anInt423; var7 < anInt393; ++var7)
				for (var8 = anInt394; var8 < anInt395; ++var8) {
					final Class109_Sub8 var11 = var13[var7][var8];
					if (var11 != null)
						if ((var11.anInt986 > var6)
								|| (!aBoolArrayArray427[(var7 - anInt388) + 25][(var8 - anInt397) + 25]
										&& ((anIntArrayArrayArray382[var12][var7][var8] - var2) < 2000))) {
							var11.aBool991 = false;
							var11.aBool988 = false;
							var11.anInt983 = 0;
						} else {
							var11.aBool991 = true;
							var11.aBool988 = true;
							if (var11.anInt982 > 0)
								var11.aBool981 = true;
							else
								var11.aBool981 = false;

							++anInt390;
						}
				}
		}

		Class109_Sub8 var9;
		int var10;
		int var14;
		int var15;
		int var16;
		for (var12 = anInt384; var12 < anInt379; ++var12) {
			var13 = aClass109_Sub8ArrayArrayArray383[var12];

			for (var7 = -25; var7 <= 0; ++var7) {
				var8 = anInt388 + var7;
				var15 = anInt388 - var7;
				if ((var8 >= anInt423) || (var15 < anInt393))
					for (var16 = -25; var16 <= 0; ++var16) {
						var14 = anInt397 + var16;
						var10 = anInt397 - var16;
						if (var8 >= anInt423) {
							if (var14 >= anInt394) {
								var9 = var13[var8][var14];
								if ((var9 != null) && var9.aBool991)
									method207(var9, true);
							}

							if (var10 < anInt395) {
								var9 = var13[var8][var10];
								if ((var9 != null) && var9.aBool991)
									method207(var9, true);
							}
						}

						if (var15 < anInt393) {
							if (var14 >= anInt394) {
								var9 = var13[var15][var14];
								if ((var9 != null) && var9.aBool991)
									method207(var9, true);
							}

							if (var10 < anInt395) {
								var9 = var13[var15][var10];
								if ((var9 != null) && var9.aBool991)
									method207(var9, true);
							}
						}

						if (anInt390 == 0) {
							aBool419 = false;
							return;
						}
					}
			}
		}

		for (var12 = anInt384; var12 < anInt379; ++var12) {
			var13 = aClass109_Sub8ArrayArrayArray383[var12];

			for (var7 = -25; var7 <= 0; ++var7) {
				var8 = anInt388 + var7;
				var15 = anInt388 - var7;
				if ((var8 >= anInt423) || (var15 < anInt393))
					for (var16 = -25; var16 <= 0; ++var16) {
						var14 = anInt397 + var16;
						var10 = anInt397 - var16;
						if (var8 >= anInt423) {
							if (var14 >= anInt394) {
								var9 = var13[var8][var14];
								if ((var9 != null) && var9.aBool991)
									method207(var9, false);
							}

							if (var10 < anInt395) {
								var9 = var13[var8][var10];
								if ((var9 != null) && var9.aBool991)
									method207(var9, false);
							}
						}

						if (var15 < anInt393) {
							if (var14 >= anInt394) {
								var9 = var13[var15][var14];
								if ((var9 != null) && var9.aBool991)
									method207(var9, false);
							}

							if (var10 < anInt395) {
								var9 = var13[var15][var10];
								if ((var9 != null) && var9.aBool991)
									method207(var9, false);
							}
						}

						if (anInt390 == 0) {
							aBool419 = false;
							return;
						}
					}
			}
		}

		aBool419 = false;
	}

	void method207(final Class109_Sub8 var1, boolean var2) {
		aClass126_416.method450(var1);

		while (true) {
			Class109_Sub8 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Class109_Sub8[][] var8;
			Class109_Sub8 var9;
			int var11;
			int var16;
			int var17;
			int var18;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do
								do
									while (true) {
										LoginEncoder var10;
										Class26 var12;
										boolean var13;
										int var14;
										int var19;
										int var20;
										Class109_Sub8 var36;
										while (true) {
											do {
												var3 = (Class109_Sub8) aClass126_416.method453();
												if (var3 == null)
													return;
											} while (!var3.aBool988);

											var4 = var3.anInt973;
											var5 = var3.anInt994;
											var6 = var3.anInt976;
											var7 = var3.anInt975;
											var8 = aClass109_Sub8ArrayArrayArray383[var6];
											if (!var3.aBool991)
												break;

											if (var2) {
												if (var6 > 0) {
													var9 = aClass109_Sub8ArrayArrayArray383[var6 - 1][var4][var5];
													if ((var9 != null) && var9.aBool988)
														continue;
												}

												if ((var4 <= anInt388) && (var4 > anInt423)) {
													var9 = var8[var4 - 1][var5];
													if ((var9 != null) && var9.aBool988
															&& (var9.aBool991 || ((var3.anInt985 & 1) == 0)))
														continue;
												}

												if ((var4 >= anInt388) && (var4 < (anInt393 - 1))) {
													var9 = var8[var4 + 1][var5];
													if ((var9 != null) && var9.aBool988
															&& (var9.aBool991 || ((var3.anInt985 & 4) == 0)))
														continue;
												}

												if ((var5 <= anInt397) && (var5 > anInt394)) {
													var9 = var8[var4][var5 - 1];
													if ((var9 != null) && var9.aBool988
															&& (var9.aBool991 || ((var3.anInt985 & 8) == 0)))
														continue;
												}

												if ((var5 >= anInt397) && (var5 < (anInt395 - 1))) {
													var9 = var8[var4][var5 + 1];
													if ((var9 != null) && var9.aBool988
															&& (var9.aBool991 || ((var3.anInt985 & 2) == 0)))
														continue;
												}
											} else
												var2 = true;

											var3.aBool991 = false;
											if (var3.aClass109_Sub8_974 != null) {
												var9 = var3.aClass109_Sub8_974;
												if (var9.aClass38_972 != null) {
													if (!method225(0, var4, var5))
														method219(var9.aClass38_972, 0, anInt401, anInt432, anInt402,
																anInt403, var4, var5);
												} else if ((var9.aClass45_977 != null) && !method225(0, var4, var5))
													method224(var9.aClass45_977, anInt401, anInt432, anInt402, anInt403,
															var4, var5);

												var10 = var9.aClass51_978;
												if (var10 != null)
													var10.aClass109_Sub21_Sub15_519.method828(0, anInt401, anInt432,
															anInt402, anInt403, var10.anInt515 - anInt398,
															var10.anInt521 - anInt399, var10.anInt520 - anInt405,
															var10.anInt516);

												for (var11 = 0; var11 < var9.anInt982; ++var11) {
													var12 = var9.aClass26Array987[var11];
													if (var12 != null)
														var12.aClass109_Sub21_Sub15_230.method828(var12.anInt231,
																anInt401, anInt432, anInt402, anInt403,
																var12.anInt228 - anInt398, var12.anInt236 - anInt399,
																var12.anInt233 - anInt405, var12.anInt238);
												}
											}

											var13 = false;
											if (var3.aClass38_972 != null) {
												if (!method225(var7, var4, var5)) {
													var13 = true;
													if ((var3.aClass38_972.anInt361 != 12345678)
															|| (aBool419 && (var6 <= anInt406)))
														method219(var3.aClass38_972, var7, anInt401, anInt432, anInt402,
																anInt403, var4, var5);
												}
											} else if ((var3.aClass45_977 != null) && !method225(var7, var4, var5)) {
												var13 = true;
												method224(var3.aClass45_977, anInt401, anInt432, anInt402, anInt403,
														var4, var5);
											}

											var14 = 0;
											var11 = 0;
											final LoginEncoder var31 = var3.aClass51_978;
											final Class22 var15 = var3.aClass22_979;
											if ((var31 != null) || (var15 != null)) {
												if (anInt388 == var4)
													++var14;
												else if (anInt388 < var4)
													var14 += 2;

												if (anInt397 == var5)
													var14 += 3;
												else if (anInt397 > var5)
													var14 += 6;

												var11 = anIntArray417[var14];
												var3.anInt993 = anIntArray389[var14];
											}

											if (var31 != null) {
												if ((var31.anInt517 & anIntArray418[var14]) != 0) {
													if (var31.anInt517 == 16) {
														var3.anInt983 = 3;
														var3.anInt992 = anIntArray420[var14];
														var3.anInt989 = 3 - var3.anInt992;
													} else if (var31.anInt517 == 32) {
														var3.anInt983 = 6;
														var3.anInt992 = anIntArray425[var14];
														var3.anInt989 = 6 - var3.anInt992;
													} else if (var31.anInt517 == 64) {
														var3.anInt983 = 12;
														var3.anInt992 = anIntArray422[var14];
														var3.anInt989 = 12 - var3.anInt992;
													} else {
														var3.anInt983 = 9;
														var3.anInt992 = anIntArray392[var14];
														var3.anInt989 = 9 - var3.anInt992;
													}
												} else
													var3.anInt983 = 0;

												if (((var31.anInt517 & var11) != 0)
														&& !method213(var7, var4, var5, var31.anInt517))
													var31.aClass109_Sub21_Sub15_519.method828(0, anInt401, anInt432,
															anInt402, anInt403, var31.anInt515 - anInt398,
															var31.anInt521 - anInt399, var31.anInt520 - anInt405,
															var31.anInt516);

												if (((var31.anInt518 & var11) != 0)
														&& !method213(var7, var4, var5, var31.anInt518))
													var31.aClass109_Sub21_Sub15_523.method828(0, anInt401, anInt432,
															anInt402, anInt403, var31.anInt515 - anInt398,
															var31.anInt521 - anInt399, var31.anInt520 - anInt405,
															var31.anInt516);
											}

											if ((var15 != null) && !method214(var7, var4, var5,
													var15.aClass109_Sub21_Sub15_213.anInt1576))
												if ((var15.anInt206 & var11) != 0)
													var15.aClass109_Sub21_Sub15_213.method828(0, anInt401, anInt432,
															anInt402, anInt403,
															(var15.anInt205 - anInt398) + var15.anInt208,
															var15.anInt211 - anInt399,
															(var15.anInt204 - anInt405) + var15.anInt209,
															var15.anInt212);
												else if (var15.anInt206 == 256) {
													var16 = var15.anInt205 - anInt398;
													var17 = var15.anInt211 - anInt399;
													var18 = var15.anInt204 - anInt405;
													var19 = var15.anInt210;
													if ((var19 != 1) && (var19 != 2))
														var20 = var16;
													else
														var20 = -var16;

													int var21;
													if ((var19 != 2) && (var19 != 3))
														var21 = var18;
													else
														var21 = -var18;

													if (var21 < var20)
														var15.aClass109_Sub21_Sub15_213.method828(0, anInt401, anInt432,
																anInt402, anInt403, var16 + var15.anInt208, var17,
																var18 + var15.anInt209, var15.anInt212);
													else if (var15.aClass109_Sub21_Sub15_207 != null)
														var15.aClass109_Sub21_Sub15_207.method828(0, anInt401, anInt432,
																anInt402, anInt403, var16, var17, var18,
																var15.anInt212);
												}

											if (var13) {
												final Class23 var22 = var3.aClass23_980;
												if (var22 != null)
													var22.aClass109_Sub21_Sub15_217.method828(0, anInt401, anInt432,
															anInt402, anInt403, var22.anInt220 - anInt398,
															var22.anInt219 - anInt399, var22.anInt216 - anInt405,
															var22.anInt218);

												final Class48 var23 = var3.aClass48_984;
												if ((var23 != null) && (var23.anInt502 == 0)) {
													if (var23.aClass109_Sub21_Sub15_500 != null)
														var23.aClass109_Sub21_Sub15_500.method828(0, anInt401, anInt432,
																anInt402, anInt403, var23.anInt497 - anInt398,
																var23.anInt498 - anInt399, var23.anInt505 - anInt405,
																var23.anInt503);

													if (var23.aClass109_Sub21_Sub15_496 != null)
														var23.aClass109_Sub21_Sub15_496.method828(0, anInt401, anInt432,
																anInt402, anInt403, var23.anInt497 - anInt398,
																var23.anInt498 - anInt399, var23.anInt505 - anInt405,
																var23.anInt503);

													if (var23.aClass109_Sub21_Sub15_499 != null)
														var23.aClass109_Sub21_Sub15_499.method828(0, anInt401, anInt432,
																anInt402, anInt403, var23.anInt497 - anInt398,
																var23.anInt498 - anInt399, var23.anInt505 - anInt405,
																var23.anInt503);
												}
											}

											var16 = var3.anInt985;
											if (var16 != 0) {
												if ((var4 < anInt388) && ((var16 & 4) != 0)) {
													var36 = var8[var4 + 1][var5];
													if ((var36 != null) && var36.aBool988)
														aClass126_416.method450(var36);
												}

												if ((var5 < anInt397) && ((var16 & 2) != 0)) {
													var36 = var8[var4][var5 + 1];
													if ((var36 != null) && var36.aBool988)
														aClass126_416.method450(var36);
												}

												if ((var4 > anInt388) && ((var16 & 1) != 0)) {
													var36 = var8[var4 - 1][var5];
													if ((var36 != null) && var36.aBool988)
														aClass126_416.method450(var36);
												}

												if ((var5 > anInt397) && ((var16 & 8) != 0)) {
													var36 = var8[var4][var5 - 1];
													if ((var36 != null) && var36.aBool988)
														aClass126_416.method450(var36);
												}
											}
											break;
										}

										if (var3.anInt983 != 0) {
											var13 = true;

											for (var14 = 0; var14 < var3.anInt982; ++var14)
												if ((var3.aClass26Array987[var14].anInt237 != anInt400)
														&& ((var3.anIntArray990[var14]
																& var3.anInt983) == var3.anInt992)) {
													var13 = false;
													break;
												}

											if (var13) {
												var10 = var3.aClass51_978;
												if (!method213(var7, var4, var5, var10.anInt517))
													var10.aClass109_Sub21_Sub15_519.method828(0, anInt401, anInt432,
															anInt402, anInt403, var10.anInt515 - anInt398,
															var10.anInt521 - anInt399, var10.anInt520 - anInt405,
															var10.anInt516);

												var3.anInt983 = 0;
											}
										}

										if (!var3.aBool981)
											break;

										try {
											final int var33 = var3.anInt982;
											var3.aBool981 = false;
											var14 = 0;

											label563: for (var11 = 0; var11 < var33; ++var11) {
												var12 = var3.aClass26Array987[var11];
												if (var12.anInt237 != anInt400) {
													for (var24 = var12.anInt232; var24 <= var12.anInt239; ++var24)
														for (var16 = var12.anInt234; var16 <= var12.anInt235; ++var16) {
															var36 = var8[var24][var16];
															if (var36.aBool991) {
																var3.aBool981 = true;
																continue label563;
															}

															if (var36.anInt983 != 0) {
																var18 = 0;
																if (var24 > var12.anInt232)
																	++var18;

																if (var24 < var12.anInt239)
																	var18 += 4;

																if (var16 > var12.anInt234)
																	var18 += 8;

																if (var16 < var12.anInt235)
																	var18 += 2;

																if ((var18 & var36.anInt983) == var3.anInt989) {
																	var3.aBool981 = true;
																	continue label563;
																}
															}
														}

													aClass26Array404[var14++] = var12;
													var24 = anInt388 - var12.anInt232;
													var16 = var12.anInt239 - anInt388;
													if (var16 > var24)
														var24 = var16;

													var17 = anInt397 - var12.anInt234;
													var18 = var12.anInt235 - anInt397;
													if (var18 > var17)
														var12.anInt229 = var24 + var18;
													else
														var12.anInt229 = var24 + var17;
												}
											}

											while (var14 > 0) {
												var11 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var14; ++var24) {
													final Class26 var35 = aClass26Array404[var24];
													if (var35.anInt237 != anInt400)
														if (var35.anInt229 > var11) {
															var11 = var35.anInt229;
															var25 = var24;
														} else if (var35.anInt229 == var11) {
															var17 = var35.anInt228 - anInt398;
															var18 = var35.anInt233 - anInt405;
															var19 = aClass26Array404[var25].anInt228 - anInt398;
															var20 = aClass26Array404[var25].anInt233 - anInt405;
															if (((var17 * var17) + (var18 * var18)) > ((var19 * var19)
																	+ (var20 * var20)))
																var25 = var24;
														}
												}

												if (var25 == -1)
													break;

												final Class26 var34 = aClass26Array404[var25];
												var34.anInt237 = anInt400;
												if (!method200(var7, var34.anInt232, var34.anInt239, var34.anInt234,
														var34.anInt235, var34.aClass109_Sub21_Sub15_230.anInt1576))
													var34.aClass109_Sub21_Sub15_230.method828(var34.anInt231, anInt401,
															anInt432, anInt402, anInt403, var34.anInt228 - anInt398,
															var34.anInt236 - anInt399, var34.anInt233 - anInt405,
															var34.anInt238);

												for (var16 = var34.anInt232; var16 <= var34.anInt239; ++var16)
													for (var17 = var34.anInt234; var17 <= var34.anInt235; ++var17) {
														final Class109_Sub8 var26 = var8[var16][var17];
														if (var26.anInt983 != 0)
															aClass126_416.method450(var26);
														else if (((var16 != var4) || (var17 != var5)) && var26.aBool988)
															aClass126_416.method450(var26);
													}
											}

											if (!var3.aBool981)
												break;
										} catch (final Exception var28) {
											var3.aBool981 = false;
											break;
										}
									}
								while (!var3.aBool988);
							while (var3.anInt983 != 0);

							if ((var4 > anInt388) || (var4 <= anInt423))
								break;

							var9 = var8[var4 - 1][var5];
						} while ((var9 != null) && var9.aBool988);

						if ((var4 < anInt388) || (var4 >= (anInt393 - 1)))
							break;

						var9 = var8[var4 + 1][var5];
					} while ((var9 != null) && var9.aBool988);

					if ((var5 > anInt397) || (var5 <= anInt394))
						break;

					var9 = var8[var4][var5 - 1];
				} while ((var9 != null) && var9.aBool988);

				if ((var5 < anInt397) || (var5 >= (anInt395 - 1)))
					break;

				var9 = var8[var4][var5 + 1];
			} while ((var9 != null) && var9.aBool988);

			var3.aBool988 = false;
			--anInt390;
			final Class48 var32 = var3.aClass48_984;
			if ((var32 != null) && (var32.anInt502 != 0)) {
				if (var32.aClass109_Sub21_Sub15_500 != null)
					var32.aClass109_Sub21_Sub15_500.method828(0, anInt401, anInt432, anInt402, anInt403,
							var32.anInt497 - anInt398, var32.anInt498 - anInt399 - var32.anInt502,
							var32.anInt505 - anInt405, var32.anInt503);

				if (var32.aClass109_Sub21_Sub15_496 != null)
					var32.aClass109_Sub21_Sub15_496.method828(0, anInt401, anInt432, anInt402, anInt403,
							var32.anInt497 - anInt398, var32.anInt498 - anInt399 - var32.anInt502,
							var32.anInt505 - anInt405, var32.anInt503);

				if (var32.aClass109_Sub21_Sub15_499 != null)
					var32.aClass109_Sub21_Sub15_499.method828(0, anInt401, anInt432, anInt402, anInt403,
							var32.anInt497 - anInt398, var32.anInt498 - anInt399 - var32.anInt502,
							var32.anInt505 - anInt405, var32.anInt503);
			}

			if (var3.anInt993 != 0) {
				final Class22 var29 = var3.aClass22_979;
				if ((var29 != null) && !method214(var7, var4, var5, var29.aClass109_Sub21_Sub15_213.anInt1576))
					if ((var29.anInt206 & var3.anInt993) != 0)
						var29.aClass109_Sub21_Sub15_213.method828(0, anInt401, anInt432, anInt402, anInt403,
								(var29.anInt205 - anInt398) + var29.anInt208, var29.anInt211 - anInt399,
								(var29.anInt204 - anInt405) + var29.anInt209, var29.anInt212);
					else if (var29.anInt206 == 256) {
						var11 = var29.anInt205 - anInt398;
						var25 = var29.anInt211 - anInt399;
						var24 = var29.anInt204 - anInt405;
						var16 = var29.anInt210;
						if ((var16 != 1) && (var16 != 2))
							var17 = var11;
						else
							var17 = -var11;

						if ((var16 != 2) && (var16 != 3))
							var18 = var24;
						else
							var18 = -var24;

						if (var18 >= var17)
							var29.aClass109_Sub21_Sub15_213.method828(0, anInt401, anInt432, anInt402, anInt403,
									var11 + var29.anInt208, var25, var24 + var29.anInt209, var29.anInt212);
						else if (var29.aClass109_Sub21_Sub15_207 != null)
							var29.aClass109_Sub21_Sub15_207.method828(0, anInt401, anInt432, anInt402, anInt403, var11,
									var25, var24, var29.anInt212);
					}

				final LoginEncoder var27 = var3.aClass51_978;
				if (var27 != null) {
					if (((var27.anInt518 & var3.anInt993) != 0) && !method213(var7, var4, var5, var27.anInt518))
						var27.aClass109_Sub21_Sub15_523.method828(0, anInt401, anInt432, anInt402, anInt403,
								var27.anInt515 - anInt398, var27.anInt521 - anInt399, var27.anInt520 - anInt405,
								var27.anInt516);

					if (((var27.anInt517 & var3.anInt993) != 0) && !method213(var7, var4, var5, var27.anInt517))
						var27.aClass109_Sub21_Sub15_519.method828(0, anInt401, anInt432, anInt402, anInt403,
								var27.anInt515 - anInt398, var27.anInt521 - anInt399, var27.anInt520 - anInt405,
								var27.anInt516);
				}
			}

			Class109_Sub8 var30;
			if (var6 < (anInt379 - 1)) {
				var30 = aClass109_Sub8ArrayArrayArray383[var6 + 1][var4][var5];
				if ((var30 != null) && var30.aBool988)
					aClass126_416.method450(var30);
			}

			if (var4 < anInt388) {
				var30 = var8[var4 + 1][var5];
				if ((var30 != null) && var30.aBool988)
					aClass126_416.method450(var30);
			}

			if (var5 < anInt397) {
				var30 = var8[var4][var5 + 1];
				if ((var30 != null) && var30.aBool988)
					aClass126_416.method450(var30);
			}

			if (var4 > anInt388) {
				var30 = var8[var4 - 1][var5];
				if ((var30 != null) && var30.aBool988)
					aClass126_416.method450(var30);
			}

			if (var5 > anInt397) {
				var30 = var8[var4][var5 - 1];
				if ((var30 != null) && var30.aBool988)
					aClass126_416.method450(var30);
			}
		}
	}

	public void method208(final int[] var1, int var2, final int var3, final int var4, final int var5, final int var6) {
		final Class109_Sub8 var7 = aClass109_Sub8ArrayArrayArray383[var4][var5][var6];
		if (var7 != null) {
			final Class38 var16 = var7.aClass38_972;
			int var11;
			if (var16 != null) {
				final int var15 = var16.anInt365;
				if (var15 != 0)
					for (var11 = 0; var11 < 4; ++var11) {
						var1[var2] = var15;
						var1[var2 + 1] = var15;
						var1[var2 + 2] = var15;
						var1[var2 + 3] = var15;
						var2 += var3;
					}
			} else {
				final Class45 var10 = var7.aClass45_977;
				if (var10 != null) {
					var11 = var10.anInt468;
					final int var17 = var10.anInt469;
					final int var8 = var10.anInt470;
					final int var9 = var10.anInt471;
					final int[] var12 = anIntArrayArray424[var11];
					final int[] var13 = anIntArrayArray413[var17];
					int var14 = 0;
					int var18;
					if (var8 != 0)
						for (var18 = 0; var18 < 4; ++var18) {
							var1[var2] = var12[var13[var14++]] == 0 ? var8 : var9;
							var1[var2 + 1] = var12[var13[var14++]] == 0 ? var8 : var9;
							var1[var2 + 2] = var12[var13[var14++]] == 0 ? var8 : var9;
							var1[var2 + 3] = var12[var13[var14++]] == 0 ? var8 : var9;
							var2 += var3;
						}
					else
						for (var18 = 0; var18 < 4; ++var18) {
							if (var12[var13[var14++]] != 0)
								var1[var2] = var9;

							if (var12[var13[var14++]] != 0)
								var1[var2 + 1] = var9;

							if (var12[var13[var14++]] != 0)
								var1[var2 + 2] = var9;

							if (var12[var13[var14++]] != 0)
								var1[var2 + 3] = var9;

							var2 += var3;
						}

				}
			}
		}
	}

	static final int method209(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	boolean method210(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8) {
		if ((var2 < var3) && (var2 < var4) && (var2 < var5))
			return false;
		else if ((var2 > var3) && (var2 > var4) && (var2 > var5))
			return false;
		else if ((var1 < var6) && (var1 < var7) && (var1 < var8))
			return false;
		else if ((var1 > var6) && (var1 > var7) && (var1 > var8))
			return false;
		else {
			final int var9 = ((var2 - var3) * (var7 - var6)) - ((var1 - var6) * (var4 - var3));
			final int var11 = ((var2 - var5) * (var6 - var8)) - ((var1 - var8) * (var3 - var5));
			final int var10 = ((var2 - var4) * (var8 - var7)) - ((var1 - var7) * (var5 - var4));
			return ((var9 * var10) > 0) && ((var10 * var11) > 0);
		}
	}

	public int method211(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		return (var4 != null) && (var4.aClass23_980 != null) ? var4.aClass23_980.anInt218 : 0;
	}

	public void method212() {
		for (int var1 = 0; var1 < anInt385; ++var1) {
			final Class26 var2 = aClass26Array386[var1];
			method189(var2);
			aClass26Array386[var1] = null;
		}

		anInt385 = 0;
	}

	boolean method213(final int var1, final int var2, final int var3, final int var4) {
		if (!method225(var1, var2, var3))
			return false;
		else {
			final int var5 = var2 << 7;
			final int var7 = var3 << 7;
			final int var8 = anIntArrayArrayArray382[var1][var2][var3] - 1;
			final int var9 = var8 - 120;
			final int var6 = var8 - 230;
			final int var10 = var8 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > anInt398) {
						if (!method215(var5, var8, var7))
							return false;

						if (!method215(var5, var8, var7 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method215(var5, var9, var7))
							return false;

						if (!method215(var5, var9, var7 + 128))
							return false;
					}

					if (!method215(var5, var6, var7))
						return false;

					if (!method215(var5, var6, var7 + 128))
						return false;

					return true;
				}

				if (var4 == 2) {
					if (var7 < anInt405) {
						if (!method215(var5, var8, var7 + 128))
							return false;

						if (!method215(var5 + 128, var8, var7 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method215(var5, var9, var7 + 128))
							return false;

						if (!method215(var5 + 128, var9, var7 + 128))
							return false;
					}

					if (!method215(var5, var6, var7 + 128))
						return false;

					if (!method215(var5 + 128, var6, var7 + 128))
						return false;

					return true;
				}

				if (var4 == 4) {
					if (var5 < anInt398) {
						if (!method215(var5 + 128, var8, var7))
							return false;

						if (!method215(var5 + 128, var8, var7 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method215(var5 + 128, var9, var7))
							return false;

						if (!method215(var5 + 128, var9, var7 + 128))
							return false;
					}

					if (!method215(var5 + 128, var6, var7))
						return false;

					if (!method215(var5 + 128, var6, var7 + 128))
						return false;

					return true;
				}

				if (var4 == 8) {
					if (var7 > anInt405) {
						if (!method215(var5, var8, var7))
							return false;

						if (!method215(var5 + 128, var8, var7))
							return false;
					}

					if (var1 > 0) {
						if (!method215(var5, var9, var7))
							return false;

						if (!method215(var5 + 128, var9, var7))
							return false;
					}

					if (!method215(var5, var6, var7))
						return false;

					if (!method215(var5 + 128, var6, var7))
						return false;

					return true;
				}
			}

			return !method215(var5 + 64, var10, var7 + 64) ? false
					: (var4 == 16 ? method215(var5, var6, var7 + 128)
							: (var4 == 32 ? method215(var5 + 128, var6, var7 + 128)
									: (var4 == 64 ? method215(var5 + 128, var6, var7)
											: (var4 == 128 ? method215(var5, var6, var7) : true))));
		}
	}

	boolean method214(final int var1, final int var2, final int var3, final int var4) {
		if (!method225(var1, var2, var3))
			return false;
		else {
			final int var5 = var2 << 7;
			final int var6 = var3 << 7;
			return method215(var5 + 1, anIntArrayArrayArray382[var1][var2][var3] - var4, var6 + 1)
					&& method215((var5 + 128) - 1, anIntArrayArrayArray382[var1][var2 + 1][var3] - var4, var6 + 1)
					&& method215((var5 + 128) - 1, anIntArrayArrayArray382[var1][var2 + 1][var3 + 1] - var4,
							(var6 + 128) - 1)
					&& method215(var5 + 1, anIntArrayArrayArray382[var1][var2][var3 + 1] - var4, (var6 + 128) - 1);
		}
	}

	boolean method215(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt409; ++var4) {
			final Class37 var7 = aClass37Array415[var4];
			int var5;
			int var6;
			int var8;
			int var9;
			int var10;
			if (var7.anInt349 == 1) {
				var6 = var7.anInt346 - var1;
				if (var6 > 0) {
					var10 = var7.anInt345 + ((var7.anInt352 * var6) >> 8);
					var8 = var7.anInt357 + ((var7.anInt353 * var6) >> 8);
					var9 = var7.anInt347 + ((var7.anInt354 * var6) >> 8);
					var5 = var7.anInt348 + ((var7.anInt355 * var6) >> 8);
					if ((var3 >= var10) && (var3 <= var8) && (var2 >= var9) && (var2 <= var5))
						return true;
				}
			} else if (var7.anInt349 == 2) {
				var6 = var1 - var7.anInt346;
				if (var6 > 0) {
					var10 = var7.anInt345 + ((var7.anInt352 * var6) >> 8);
					var8 = var7.anInt357 + ((var7.anInt353 * var6) >> 8);
					var9 = var7.anInt347 + ((var7.anInt354 * var6) >> 8);
					var5 = var7.anInt348 + ((var7.anInt355 * var6) >> 8);
					if ((var3 >= var10) && (var3 <= var8) && (var2 >= var9) && (var2 <= var5))
						return true;
				}
			} else if (var7.anInt349 == 3) {
				var6 = var7.anInt345 - var3;
				if (var6 > 0) {
					var10 = var7.anInt346 + ((var7.anInt350 * var6) >> 8);
					var8 = var7.anInt344 + ((var7.anInt351 * var6) >> 8);
					var9 = var7.anInt347 + ((var7.anInt354 * var6) >> 8);
					var5 = var7.anInt348 + ((var7.anInt355 * var6) >> 8);
					if ((var1 >= var10) && (var1 <= var8) && (var2 >= var9) && (var2 <= var5))
						return true;
				}
			} else if (var7.anInt349 == 4) {
				var6 = var3 - var7.anInt345;
				if (var6 > 0) {
					var10 = var7.anInt346 + ((var7.anInt350 * var6) >> 8);
					var8 = var7.anInt344 + ((var7.anInt351 * var6) >> 8);
					var9 = var7.anInt347 + ((var7.anInt354 * var6) >> 8);
					var5 = var7.anInt348 + ((var7.anInt355 * var6) >> 8);
					if ((var1 >= var10) && (var1 <= var8) && (var2 >= var9) && (var2 <= var5))
						return true;
				}
			} else if (var7.anInt349 == 5) {
				var6 = var2 - var7.anInt347;
				if (var6 > 0) {
					var10 = var7.anInt346 + ((var7.anInt350 * var6) >> 8);
					var8 = var7.anInt344 + ((var7.anInt351 * var6) >> 8);
					var9 = var7.anInt345 + ((var7.anInt352 * var6) >> 8);
					var5 = var7.anInt357 + ((var7.anInt353 * var6) >> 8);
					if ((var1 >= var10) && (var1 <= var8) && (var3 >= var9) && (var3 <= var5))
						return true;
				}
			}
		}

		return false;
	}

	static {
		anIntArray428 = new int[anInt412];
		aClass37ArrayArray414 = new Class37[anInt412][500];
		anInt409 = 0;
		aClass37Array415 = new Class37[500];
		aClass126_416 = new Class126();
		anIntArray417 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		anIntArray418 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		anIntArray389 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
		anIntArray420 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		anIntArray425 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		anIntArray422 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		anIntArray392 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		aBoolArrayArrayArrayArray426 = new boolean[8][32][51][51];
	}

	public void method216(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, final int var10, final int var11,
			final int var12, final int var13, final int var14, final int var15, final int var16, final int var17,
			final int var18, final int var19, final int var20) {
		int var21;
		Class38 var22;
		if (var4 == 0) {
			var22 = new Class38(var11, var12, var13, var14, -1, var19, false);

			for (var21 = var1; var21 >= 0; --var21)
				if (aClass109_Sub8ArrayArrayArray383[var21][var2][var3] == null)
					aClass109_Sub8ArrayArrayArray383[var21][var2][var3] = new Class109_Sub8(var21, var2, var3);

			aClass109_Sub8ArrayArrayArray383[var1][var2][var3].aClass38_972 = var22;
		} else if (var4 != 1) {
			final Class45 var23 = new Class45(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12,
					var13, var14, var15, var16, var17, var18, var19, var20);

			for (var21 = var1; var21 >= 0; --var21)
				if (aClass109_Sub8ArrayArrayArray383[var21][var2][var3] == null)
					aClass109_Sub8ArrayArrayArray383[var21][var2][var3] = new Class109_Sub8(var21, var2, var3);

			aClass109_Sub8ArrayArrayArray383[var1][var2][var3].aClass45_977 = var23;
		} else {
			var22 = new Class38(var15, var16, var17, var18, var6, var20,
					(var7 == var8) && (var7 == var9) && (var7 == var10));

			for (var21 = var1; var21 >= 0; --var21)
				if (aClass109_Sub8ArrayArrayArray383[var21][var2][var3] == null)
					aClass109_Sub8ArrayArrayArray383[var21][var2][var3] = new Class109_Sub8(var21, var2, var3);

			aClass109_Sub8ArrayArrayArray383[var1][var2][var3].aClass38_972 = var22;
		}
	}

	public static void method217(final int[] var0, final int var1, final int var2, final int var3, final int var4) {
		anInt411 = 0;
		anInt431 = 0;
		anInt421 = var3;
		anInt433 = var4;
		anInt378 = var3 / 2;
		anInt429 = var4 / 2;
		final boolean[][][][] var9 = new boolean[9][32][53][53];

		int var6;
		int var7;
		int var8;
		int var10;
		int var11;
		int var13;
		for (var6 = 128; var6 <= 384; var6 += 32)
			for (var11 = 0; var11 < 2048; var11 += 64) {
				anInt401 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var6];
				anInt432 = Class109_Sub21_Sub14_Sub3.anIntArray1836[var6];
				anInt402 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var11];
				anInt403 = Class109_Sub21_Sub14_Sub3.anIntArray1836[var11];
				var7 = (var6 - 128) / 32;
				var10 = var11 / 64;

				for (int var5 = -26; var5 <= 26; ++var5)
					for (var8 = -26; var8 <= 26; ++var8) {
						var13 = var5 * 128;
						final int var14 = var8 * 128;
						boolean var12 = false;

						for (int var15 = -var1; var15 <= var2; var15 += 128)
							if (method204(var13, var0[var7] + var15, var14)) {
								var12 = true;
								break;
							}

						var9[var7][var10][var5 + 25 + 1][var8 + 25 + 1] = var12;
					}
			}

		for (var6 = 0; var6 < 8; ++var6)
			for (var11 = 0; var11 < 32; ++var11)
				for (var7 = -25; var7 < 25; ++var7)
					for (var10 = -25; var10 < 25; ++var10) {
						boolean var16 = false;

						label103: for (var8 = -1; var8 <= 1; ++var8)
							for (var13 = -1; var13 <= 1; ++var13) {
								if (var9[var6][var11][var7 + var8 + 25 + 1][var10 + var13 + 25 + 1]) {
									var16 = true;
									break label103;
								}

								if (var9[var6][(var11 + 1) % 31][var7 + var8 + 25 + 1][var10 + var13 + 25 + 1]) {
									var16 = true;
									break label103;
								}

								if (var9[var6 + 1][var11][var7 + var8 + 25 + 1][var10 + var13 + 25 + 1]) {
									var16 = true;
									break label103;
								}

								if (var9[var6 + 1][(var11 + 1) % 31][var7 + var8 + 25 + 1][var10 + var13 + 25 + 1]) {
									var16 = true;
									break label103;
								}
							}

						aBoolArrayArrayArrayArray426[var6][var11][var7 + 25][var10 + 25] = var16;
					}

	}

	public void method218(final int var1, final int var2) {
		final Class109_Sub8 var3 = aClass109_Sub8ArrayArrayArray383[0][var1][var2];

		for (int var5 = 0; var5 < 3; ++var5) {
			final Class109_Sub8 var6 = aClass109_Sub8ArrayArrayArray383[var5][var1][var2] = aClass109_Sub8ArrayArrayArray383[var5
					+ 1][var1][var2];
			if (var6 != null) {
				--var6.anInt976;

				for (int var7 = 0; var7 < var6.anInt982; ++var7) {
					final Class26 var4 = var6.aClass26Array987[var7];
					if ((((var4.anInt238 >> 29) & 3) == 2) && (var4.anInt232 == var1) && (var4.anInt234 == var2))
						--var4.anInt227;
				}
			}
		}

		if (aClass109_Sub8ArrayArrayArray383[0][var1][var2] == null)
			aClass109_Sub8ArrayArrayArray383[0][var1][var2] = new Class109_Sub8(0, var1, var2);

		aClass109_Sub8ArrayArrayArray383[0][var1][var2].aClass109_Sub8_974 = var3;
		aClass109_Sub8ArrayArrayArray383[3][var1][var2] = null;
	}

	void method219(final Class38 var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - anInt398;
		int var11;
		int var26 = var11 = (var8 << 7) - anInt405;
		int var12;
		int var13 = var12 = var10 + 128;
		int var27;
		int var28 = var27 = var26 + 128;
		int var25 = anIntArrayArrayArray382[var2][var7][var8] - anInt399;
		int var21 = anIntArrayArrayArray382[var2][var7 + 1][var8] - anInt399;
		int var29 = anIntArrayArrayArray382[var2][var7 + 1][var8 + 1] - anInt399;
		final int var24 = anIntArrayArrayArray382[var2][var7][var8 + 1] - anInt399;
		int var22 = ((var26 * var5) + (var10 * var6)) >> 16;
		var26 = ((var26 * var6) - (var10 * var5)) >> 16;
		var10 = var22;
		var22 = ((var25 * var4) - (var26 * var3)) >> 16;
		var26 = ((var25 * var3) + (var26 * var4)) >> 16;
		var25 = var22;
		if (var26 >= 50) {
			var22 = ((var11 * var5) + (var13 * var6)) >> 16;
			var11 = ((var11 * var6) - (var13 * var5)) >> 16;
			var13 = var22;
			var22 = ((var21 * var4) - (var11 * var3)) >> 16;
			var11 = ((var21 * var3) + (var11 * var4)) >> 16;
			var21 = var22;
			if (var11 >= 50) {
				var22 = ((var28 * var5) + (var12 * var6)) >> 16;
				var28 = ((var28 * var6) - (var12 * var5)) >> 16;
				var12 = var22;
				var22 = ((var29 * var4) - (var28 * var3)) >> 16;
				var28 = ((var29 * var3) + (var28 * var4)) >> 16;
				var29 = var22;
				if (var28 >= 50) {
					var22 = ((var27 * var5) + (var9 * var6)) >> 16;
					var27 = ((var27 * var6) - (var9 * var5)) >> 16;
					var9 = var22;
					var22 = ((var24 * var4) - (var27 * var3)) >> 16;
					var27 = ((var24 * var3) + (var27 * var4)) >> 16;
					if (var27 >= 50) {
						final int var23 = Class109_Sub21_Sub14_Sub3.anInt1823
								+ ((var10 * Class109_Sub21_Sub14_Sub3.anInt1822) / var26);
						final int var30 = Class109_Sub21_Sub14_Sub3.anInt1824
								+ ((var25 * Class109_Sub21_Sub14_Sub3.anInt1822) / var26);
						final int var19 = Class109_Sub21_Sub14_Sub3.anInt1823
								+ ((var13 * Class109_Sub21_Sub14_Sub3.anInt1822) / var11);
						final int var16 = Class109_Sub21_Sub14_Sub3.anInt1824
								+ ((var21 * Class109_Sub21_Sub14_Sub3.anInt1822) / var11);
						final int var17 = Class109_Sub21_Sub14_Sub3.anInt1823
								+ ((var12 * Class109_Sub21_Sub14_Sub3.anInt1822) / var28);
						final int var14 = Class109_Sub21_Sub14_Sub3.anInt1824
								+ ((var29 * Class109_Sub21_Sub14_Sub3.anInt1822) / var28);
						final int var18 = Class109_Sub21_Sub14_Sub3.anInt1823
								+ ((var9 * Class109_Sub21_Sub14_Sub3.anInt1822) / var27);
						final int var15 = Class109_Sub21_Sub14_Sub3.anInt1824
								+ ((var22 * Class109_Sub21_Sub14_Sub3.anInt1822) / var27);
						Class109_Sub21_Sub14_Sub3.anInt1819 = 0;
						int var20;
						if ((((var17 - var18) * (var16 - var15)) - ((var14 - var15) * (var19 - var18))) > 0) {
							Class109_Sub21_Sub14_Sub3.aBool1820 = false;
							if ((var17 < 0) || (var18 < 0) || (var19 < 0)
									|| (var17 > Class109_Sub21_Sub14_Sub3.anInt1827)
									|| (var18 > Class109_Sub21_Sub14_Sub3.anInt1827)
									|| (var19 > Class109_Sub21_Sub14_Sub3.anInt1827))
								Class109_Sub21_Sub14_Sub3.aBool1820 = true;

							if (aBool419 && method210(anInt407, anInt408, var14, var15, var16, var17, var18, var19)) {
								anInt396 = var7;
								anInt410 = var8;
							}

							if (var1.anInt364 == -1) {
								if (var1.anInt361 != 12345678)
									Class109_Sub21_Sub14_Sub3.method974(var14, var15, var16, var17, var18, var19,
											var1.anInt361, var1.anInt366, var1.anInt360);
							} else if (!aBool430) {
								if (var1.aBool363)
									Class109_Sub21_Sub14_Sub3.method970(var14, var15, var16, var17, var18, var19,
											var1.anInt361, var1.anInt366, var1.anInt360, var10, var13, var9, var25,
											var21, var22, var26, var11, var27, var1.anInt364);
								else
									Class109_Sub21_Sub14_Sub3.method970(var14, var15, var16, var17, var18, var19,
											var1.anInt361, var1.anInt366, var1.anInt360, var12, var9, var13, var29,
											var22, var21, var28, var27, var11, var1.anInt364);
							} else {
								var20 = Class109_Sub21_Sub14_Sub3.anInterface3_1833.method7(var1.anInt364, -1621034666);
								Class109_Sub21_Sub14_Sub3.method974(var14, var15, var16, var17, var18, var19,
										method209(var20, var1.anInt361), method209(var20, var1.anInt366),
										method209(var20, var1.anInt360));
							}
						}

						if ((((var23 - var19) * (var15 - var16)) - ((var30 - var16) * (var18 - var19))) > 0) {
							Class109_Sub21_Sub14_Sub3.aBool1820 = false;
							if ((var23 < 0) || (var19 < 0) || (var18 < 0)
									|| (var23 > Class109_Sub21_Sub14_Sub3.anInt1827)
									|| (var19 > Class109_Sub21_Sub14_Sub3.anInt1827)
									|| (var18 > Class109_Sub21_Sub14_Sub3.anInt1827))
								Class109_Sub21_Sub14_Sub3.aBool1820 = true;

							if (aBool419 && method210(anInt407, anInt408, var30, var16, var15, var23, var19, var18)) {
								anInt396 = var7;
								anInt410 = var8;
							}

							if (var1.anInt364 == -1) {
								if (var1.anInt362 != 12345678)
									Class109_Sub21_Sub14_Sub3.method974(var30, var16, var15, var23, var19, var18,
											var1.anInt362, var1.anInt360, var1.anInt366);
							} else if (!aBool430)
								Class109_Sub21_Sub14_Sub3.method970(var30, var16, var15, var23, var19, var18,
										var1.anInt362, var1.anInt360, var1.anInt366, var10, var13, var9, var25, var21,
										var22, var26, var11, var27, var1.anInt364);
							else {
								var20 = Class109_Sub21_Sub14_Sub3.anInterface3_1833.method7(var1.anInt364, -1143377249);
								Class109_Sub21_Sub14_Sub3.method974(var30, var16, var15, var23, var19, var18,
										method209(var20, var1.anInt362), method209(var20, var1.anInt360),
										method209(var20, var1.anInt366));
							}
						}

					}
				}
			}
		}
	}

	void method220(final Class109_Sub21_Sub15_Sub7 var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		boolean var7 = true;
		int var11 = var3;
		final int var12 = var3 + var5;
		final int var15 = var4 - 1;
		final int var17 = var4 + var6;

		for (int var9 = var2; var9 <= (var2 + 1); ++var9)
			if (var9 != anInt379) {
				for (int var8 = var11; var8 <= var12; ++var8)
					if ((var8 >= 0) && (var8 < anInt380))
						for (int var16 = var15; var16 <= var17; ++var16)
							if ((var16 >= 0) && (var16 < anInt381) && (!var7 || (var8 >= var12) || (var16 >= var17)
									|| ((var16 < var4) && (var8 != var3)))) {
								final Class109_Sub8 var10 = aClass109_Sub8ArrayArrayArray383[var9][var8][var16];
								if (var10 != null) {
									final int var20 = ((anIntArrayArrayArray382[var9][var8][var16]
											+ anIntArrayArrayArray382[var9][var8 + 1][var16]
											+ anIntArrayArrayArray382[var9][var8][var16 + 1]
											+ anIntArrayArrayArray382[var9][var8 + 1][var16 + 1]) / 4)
											- ((anIntArrayArrayArray382[var2][var3][var4]
													+ anIntArrayArrayArray382[var2][var3 + 1][var4]
													+ anIntArrayArrayArray382[var2][var3][var4 + 1]
													+ anIntArrayArrayArray382[var2][var3 + 1][var4 + 1]) / 4);
									final LoginEncoder var22 = var10.aClass51_978;
									if (var22 != null) {
										Class109_Sub21_Sub15_Sub7 var23;
										if (var22.aClass109_Sub21_Sub15_519 instanceof Class109_Sub21_Sub15_Sub7) {
											var23 = (Class109_Sub21_Sub15_Sub7) var22.aClass109_Sub21_Sub15_519;
											Class109_Sub21_Sub15_Sub7.method997(var1, var23,
													((var8 - var3) * 128) + ((1 - var5) * 64), var20,
													((var16 - var4) * 128) + ((1 - var6) * 64), var7);
										}

										if (var22.aClass109_Sub21_Sub15_523 instanceof Class109_Sub21_Sub15_Sub7) {
											var23 = (Class109_Sub21_Sub15_Sub7) var22.aClass109_Sub21_Sub15_523;
											Class109_Sub21_Sub15_Sub7.method997(var1, var23,
													((var8 - var3) * 128) + ((1 - var5) * 64), var20,
													((var16 - var4) * 128) + ((1 - var6) * 64), var7);
										}
									}

									for (int var13 = 0; var13 < var10.anInt982; ++var13) {
										final Class26 var14 = var10.aClass26Array987[var13];
										if ((var14 != null)
												&& (var14.aClass109_Sub21_Sub15_230 instanceof Class109_Sub21_Sub15_Sub7)) {
											final Class109_Sub21_Sub15_Sub7 var18 = (Class109_Sub21_Sub15_Sub7) var14.aClass109_Sub21_Sub15_230;
											final int var19 = (var14.anInt239 - var14.anInt232) + 1;
											final int var21 = (var14.anInt235 - var14.anInt234) + 1;
											Class109_Sub21_Sub15_Sub7.method997(var1, var18,
													((var14.anInt232 - var3) * 128) + ((var19 - var5) * 64), var20,
													((var14.anInt234 - var4) * 128) + ((var21 - var6) * 64), var7);
										}
									}
								}
							}

				--var11;
				var7 = false;
			}

	}

	public void method221(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var4 != null)
			var4.aClass48_984 = null;
	}

	public Class42(final int var1, final int var2, final int var3, final int[][][] var4) {
		anInt379 = var1;
		anInt380 = var2;
		anInt381 = var3;
		aClass109_Sub8ArrayArrayArray383 = new Class109_Sub8[var1][var2][var3];
		anIntArrayArrayArray387 = new int[var1][var2 + 1][var3 + 1];
		anIntArrayArrayArray382 = var4;
		method176();
	}

	public void method222(final int var1, final int var2, final int var3) {
		final Class109_Sub8 var4 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var4 != null)
			var4.aClass22_979 = null;
	}

	public int method223(final int var1, final int var2, final int var3, final int var4) {
		final Class109_Sub8 var5 = aClass109_Sub8ArrayArrayArray383[var1][var2][var3];
		if (var5 == null)
			return -1;
		else if ((var5.aClass51_978 != null) && (var5.aClass51_978.anInt516 == var4))
			return var5.aClass51_978.anInt522 & 255;
		else if ((var5.aClass22_979 != null) && (var5.aClass22_979.anInt212 == var4))
			return var5.aClass22_979.anInt214 & 255;
		else if ((var5.aClass23_980 != null) && (var5.aClass23_980.anInt218 == var4))
			return var5.aClass23_980.anInt215 & 255;
		else {
			for (int var6 = 0; var6 < var5.anInt982; ++var6)
				if (var5.aClass26Array987[var6].anInt238 == var4)
					return var5.aClass26Array987[var6].anInt242 & 255;

			return -1;
		}
	}

	void method224(final Class45 var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7) {
		int var8 = var1.anIntArray462.length;

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) {
			var12 = var1.anIntArray462[var9] - anInt398;
			var10 = var1.anIntArray457[var9] - anInt399;
			var11 = var1.anIntArray459[var9] - anInt405;
			var13 = ((var11 * var4) + (var12 * var5)) >> 16;
			var11 = ((var11 * var5) - (var12 * var4)) >> 16;
			var12 = var13;
			var13 = ((var10 * var3) - (var11 * var2)) >> 16;
			var11 = ((var10 * var2) + (var11 * var3)) >> 16;
			if (var11 < 50)
				return;

			if (var1.anIntArray475 != null) {
				Class45.anIntArray474[var9] = var12;
				Class45.anIntArray464[var9] = var13;
				Class45.anIntArray476[var9] = var11;
			}

			Class45.anIntArray472[var9] = Class109_Sub21_Sub14_Sub3.anInt1823
					+ ((var12 * Class109_Sub21_Sub14_Sub3.anInt1822) / var11);
			Class45.anIntArray473[var9] = Class109_Sub21_Sub14_Sub3.anInt1824
					+ ((var13 * Class109_Sub21_Sub14_Sub3.anInt1822) / var11);
		}

		Class109_Sub21_Sub14_Sub3.anInt1819 = 0;
		var8 = var1.anIntArray478.length;

		for (var9 = 0; var9 < var8; ++var9) {
			var12 = var1.anIntArray478[var9];
			var10 = var1.anIntArray466[var9];
			var11 = var1.anIntArray465[var9];
			var13 = Class45.anIntArray472[var12];
			final int var18 = Class45.anIntArray472[var10];
			final int var14 = Class45.anIntArray472[var11];
			final int var15 = Class45.anIntArray473[var12];
			final int var16 = Class45.anIntArray473[var10];
			final int var17 = Class45.anIntArray473[var11];
			if ((((var13 - var18) * (var17 - var16)) - ((var15 - var16) * (var14 - var18))) > 0) {
				Class109_Sub21_Sub14_Sub3.aBool1820 = false;
				if ((var13 < 0) || (var18 < 0) || (var14 < 0) || (var13 > Class109_Sub21_Sub14_Sub3.anInt1827)
						|| (var18 > Class109_Sub21_Sub14_Sub3.anInt1827)
						|| (var14 > Class109_Sub21_Sub14_Sub3.anInt1827))
					Class109_Sub21_Sub14_Sub3.aBool1820 = true;

				if (aBool419 && method210(anInt407, anInt408, var15, var16, var17, var13, var18, var14)) {
					anInt396 = var6;
					anInt410 = var7;
				}

				if ((var1.anIntArray475 != null) && (var1.anIntArray475[var9] != -1)) {
					if (!aBool430) {
						if (var1.aBool467)
							Class109_Sub21_Sub14_Sub3.method970(var15, var16, var17, var13, var18, var14,
									var1.anIntArray460[var9], var1.anIntArray461[var9], var1.anIntArray458[var9],
									Class45.anIntArray474[0], Class45.anIntArray474[1], Class45.anIntArray474[3],
									Class45.anIntArray464[0], Class45.anIntArray464[1], Class45.anIntArray464[3],
									Class45.anIntArray476[0], Class45.anIntArray476[1], Class45.anIntArray476[3],
									var1.anIntArray475[var9]);
						else
							Class109_Sub21_Sub14_Sub3.method970(var15, var16, var17, var13, var18, var14,
									var1.anIntArray460[var9], var1.anIntArray461[var9], var1.anIntArray458[var9],
									Class45.anIntArray474[var12], Class45.anIntArray474[var10],
									Class45.anIntArray474[var11], Class45.anIntArray464[var12],
									Class45.anIntArray464[var10], Class45.anIntArray464[var11],
									Class45.anIntArray476[var12], Class45.anIntArray476[var10],
									Class45.anIntArray476[var11], var1.anIntArray475[var9]);
					} else {
						final int var19 = Class109_Sub21_Sub14_Sub3.anInterface3_1833.method7(var1.anIntArray475[var9],
								-255444401);
						Class109_Sub21_Sub14_Sub3.method974(var15, var16, var17, var13, var18, var14,
								method209(var19, var1.anIntArray460[var9]), method209(var19, var1.anIntArray461[var9]),
								method209(var19, var1.anIntArray458[var9]));
					}
				} else if (var1.anIntArray460[var9] != 12345678)
					Class109_Sub21_Sub14_Sub3.method974(var15, var16, var17, var13, var18, var14,
							var1.anIntArray460[var9], var1.anIntArray461[var9], var1.anIntArray458[var9]);
			}
		}

	}

	boolean method225(final int var1, final int var2, final int var3) {
		final int var4 = anIntArrayArrayArray387[var1][var2][var3];
		if (var4 == -anInt400)
			return false;
		else if (var4 == anInt400)
			return true;
		else {
			final int var5 = var2 << 7;
			final int var6 = var3 << 7;
			if (method215(var5 + 1, anIntArrayArrayArray382[var1][var2][var3], var6 + 1)
					&& method215((var5 + 128) - 1, anIntArrayArrayArray382[var1][var2 + 1][var3], var6 + 1)
					&& method215((var5 + 128) - 1, anIntArrayArrayArray382[var1][var2 + 1][var3 + 1], (var6 + 128) - 1)
					&& method215(var5 + 1, anIntArrayArrayArray382[var1][var2][var3 + 1], (var6 + 128) - 1)) {
				anIntArrayArrayArray387[var1][var2][var3] = anInt400;
				return true;
			} else {
				anIntArrayArrayArray387[var1][var2][var3] = -anInt400;
				return false;
			}
		}
	}
}
