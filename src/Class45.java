public final class Class45 {
	boolean aBool467 = true;
	int anInt468;
	int anInt469;
	int anInt470;
	int anInt471;
	int[] anIntArray462;
	int[] anIntArray457;
	int[] anIntArray459;
	int[] anIntArray478;
	int[] anIntArray466;
	int[] anIntArray465;
	int[] anIntArray460;
	int[] anIntArray461;
	int[] anIntArray458;
	int[] anIntArray475;
	static int[] anIntArray472 = new int[6];
	static int[] anIntArray473 = new int[6];
	static int[] anIntArray474 = new int[6];
	static int[] anIntArray464 = new int[6];
	static int[] anIntArray476 = new int[6];
	static int[][] anIntArrayArray477 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 },
			{ 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 },
			{ 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	static int[][] anIntArrayArray463 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 },
			{ 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 },
			{ 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 },
			{ 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
			{ 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 },
			{ 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 },
			{ 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 },
			{ 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	Class45(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11, final int var12,
			final int var13, final int var14, final int var15, final int var16, final int var17, final int var18,
			final int var19) {
		if ((var6 != var7) || (var6 != var8) || (var6 != var9))
			aBool467 = false;

		anInt468 = var1;
		anInt469 = var2;
		anInt470 = var18;
		anInt471 = var19;
		final short var28 = 128;
		final int var21 = var28 / 2;
		final int var25 = var28 / 4;
		final int var31 = (var28 * 3) / 4;
		final int[] var32 = anIntArrayArray477[var1];
		final int var29 = var32.length;
		anIntArray462 = new int[var29];
		anIntArray457 = new int[var29];
		anIntArray459 = new int[var29];
		final int[] var30 = new int[var29];
		final int[] var37 = new int[var29];
		final int var23 = var4 * var28;
		final int var20 = var5 * var28;

		int var22;
		int var24;
		int var26;
		int var27;
		int var33;
		int var35;
		for (int var34 = 0; var34 < var29; ++var34) {
			var26 = var32[var34];
			if (((var26 & 1) == 0) && (var26 <= 8))
				var26 = ((var26 - var2 - var2 - 1) & 7) + 1;

			if ((var26 > 8) && (var26 <= 12))
				var26 = ((var26 - 9 - var2) & 3) + 9;

			if ((var26 > 12) && (var26 <= 16))
				var26 = ((var26 - 13 - var2) & 3) + 13;

			if (var26 == 1) {
				var24 = var23;
				var22 = var20;
				var33 = var6;
				var27 = var10;
				var35 = var14;
			} else if (var26 == 2) {
				var24 = var23 + var21;
				var22 = var20;
				var33 = (var6 + var7) >> 1;
				var27 = (var10 + var11) >> 1;
				var35 = (var14 + var15) >> 1;
			} else if (var26 == 3) {
				var24 = var23 + var28;
				var22 = var20;
				var33 = var7;
				var27 = var11;
				var35 = var15;
			} else if (var26 == 4) {
				var24 = var23 + var28;
				var22 = var20 + var21;
				var33 = (var7 + var8) >> 1;
				var27 = (var11 + var12) >> 1;
				var35 = (var15 + var16) >> 1;
			} else if (var26 == 5) {
				var24 = var23 + var28;
				var22 = var20 + var28;
				var33 = var8;
				var27 = var12;
				var35 = var16;
			} else if (var26 == 6) {
				var24 = var23 + var21;
				var22 = var20 + var28;
				var33 = (var8 + var9) >> 1;
				var27 = (var12 + var13) >> 1;
				var35 = (var16 + var17) >> 1;
			} else if (var26 == 7) {
				var24 = var23;
				var22 = var20 + var28;
				var33 = var9;
				var27 = var13;
				var35 = var17;
			} else if (var26 == 8) {
				var24 = var23;
				var22 = var20 + var21;
				var33 = (var9 + var6) >> 1;
				var27 = (var13 + var10) >> 1;
				var35 = (var17 + var14) >> 1;
			} else if (var26 == 9) {
				var24 = var23 + var21;
				var22 = var20 + var25;
				var33 = (var6 + var7) >> 1;
				var27 = (var10 + var11) >> 1;
				var35 = (var14 + var15) >> 1;
			} else if (var26 == 10) {
				var24 = var23 + var31;
				var22 = var20 + var21;
				var33 = (var7 + var8) >> 1;
				var27 = (var11 + var12) >> 1;
				var35 = (var15 + var16) >> 1;
			} else if (var26 == 11) {
				var24 = var23 + var21;
				var22 = var20 + var31;
				var33 = (var8 + var9) >> 1;
				var27 = (var12 + var13) >> 1;
				var35 = (var16 + var17) >> 1;
			} else if (var26 == 12) {
				var24 = var23 + var25;
				var22 = var20 + var21;
				var33 = (var9 + var6) >> 1;
				var27 = (var13 + var10) >> 1;
				var35 = (var17 + var14) >> 1;
			} else if (var26 == 13) {
				var24 = var23 + var25;
				var22 = var20 + var25;
				var33 = var6;
				var27 = var10;
				var35 = var14;
			} else if (var26 == 14) {
				var24 = var23 + var31;
				var22 = var20 + var25;
				var33 = var7;
				var27 = var11;
				var35 = var15;
			} else if (var26 == 15) {
				var24 = var23 + var31;
				var22 = var20 + var31;
				var33 = var8;
				var27 = var12;
				var35 = var16;
			} else {
				var24 = var23 + var25;
				var22 = var20 + var31;
				var33 = var9;
				var27 = var13;
				var35 = var17;
			}

			anIntArray462[var34] = var24;
			anIntArray457[var34] = var33;
			anIntArray459[var34] = var22;
			var30[var34] = var27;
			var37[var34] = var35;
		}

		final int[] var36 = anIntArrayArray463[var1];
		var26 = var36.length / 4;
		anIntArray478 = new int[var26];
		anIntArray466 = new int[var26];
		anIntArray465 = new int[var26];
		anIntArray460 = new int[var26];
		anIntArray461 = new int[var26];
		anIntArray458 = new int[var26];
		if (var3 != -1)
			anIntArray475 = new int[var26];

		var24 = 0;

		for (var22 = 0; var22 < var26; ++var22) {
			var33 = var36[var24];
			var27 = var36[var24 + 1];
			var35 = var36[var24 + 2];
			int var38 = var36[var24 + 3];
			var24 += 4;
			if (var27 < 4)
				var27 = (var27 - var2) & 3;

			if (var35 < 4)
				var35 = (var35 - var2) & 3;

			if (var38 < 4)
				var38 = (var38 - var2) & 3;

			anIntArray478[var22] = var27;
			anIntArray466[var22] = var35;
			anIntArray465[var22] = var38;
			if (var33 == 0) {
				anIntArray460[var22] = var30[var27];
				anIntArray461[var22] = var30[var35];
				anIntArray458[var22] = var30[var38];
				if (anIntArray475 != null)
					anIntArray475[var22] = -1;
			} else {
				anIntArray460[var22] = var37[var27];
				anIntArray461[var22] = var37[var35];
				anIntArray458[var22] = var37[var38];
				if (anIntArray475 != null)
					anIntArray475[var22] = var3;
			}
		}

		var22 = var6;
		var33 = var7;
		if (var7 < var6)
			var22 = var7;

		if (var7 > var7)
			var33 = var7;

		if (var8 < var22)
			var22 = var8;

		if (var8 > var33)
			var33 = var8;

		if (var9 < var22)
			var22 = var9;

		if (var9 > var33)
			var33 = var9;

		var22 /= 14;
		var33 /= 14;
	}
}
