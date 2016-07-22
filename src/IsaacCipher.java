public final class IsaacCipher {
	static int[] anIntArray560;
	int anInt556;
	int anInt559;
	int anInt554;
	int anInt558;
	int[] anIntArray555 = new int[256];
	int[] anIntArray557 = new int[256];

	final int method279() {
		if (!Loader.ISAAC_ENABLED) {
			return 0;
		}
		
		if ((--anInt556 + 1) == 0) {
			method280();
			anInt556 = 255;
		}

		return anIntArray557[anInt556];
	}

	final void method280() {
		anInt554 += ++anInt559;

		for (int var1 = 0; var1 < 256; ++var1) {
			final int var3 = anIntArray555[var1];
			if ((var1 & 2) == 0) {
				if ((var1 & 1) == 0)
					anInt558 ^= anInt558 << 13;
				else
					anInt558 ^= anInt558 >>> 6;
			} else if ((var1 & 1) == 0)
				anInt558 ^= anInt558 << 2;
			else
				anInt558 ^= anInt558 >>> 16;

			anInt558 += anIntArray555[(128 + var1) & 255];
			int var2;
			anIntArray555[var1] = var2 = anInt554 + anIntArray555[(var3 & 1020) >> 2] + anInt558;
			anIntArray557[var1] = anInt554 = anIntArray555[((var2 >> 8) & 1020) >> 2] + var3;
		}

	}

	final void method281() {
		int var1 = -1640531527;
		int var7 = -1640531527;
		int var2 = -1640531527;
		int var4 = -1640531527;
		int var8 = -1640531527;
		int var3 = -1640531527;
		int var6 = -1640531527;
		int var9 = -1640531527;

		int var5;
		for (var5 = 0; var5 < 4; ++var5) {
			var9 ^= var6 << 11;
			var8 += var9;
			var6 += var3;
			var6 ^= var3 >>> 2;
			var4 += var6;
			var3 += var8;
			var3 ^= var8 << 8;
			var2 += var3;
			var8 += var4;
			var8 ^= var4 >>> 16;
			var7 += var8;
			var4 += var2;
			var4 ^= var2 << 10;
			var1 += var4;
			var2 += var7;
			var2 ^= var7 >>> 4;
			var9 += var2;
			var7 += var1;
			var7 ^= var1 << 8;
			var6 += var7;
			var1 += var9;
			var1 ^= var9 >>> 9;
			var3 += var1;
			var9 += var6;
		}

		for (var5 = 0; var5 < 256; var5 += 8) {
			var9 += anIntArray557[var5];
			var6 += anIntArray557[var5 + 1];
			var3 += anIntArray557[2 + var5];
			var8 += anIntArray557[3 + var5];
			var4 += anIntArray557[4 + var5];
			var2 += anIntArray557[5 + var5];
			var7 += anIntArray557[var5 + 6];
			var1 += anIntArray557[7 + var5];
			var9 ^= var6 << 11;
			var8 += var9;
			var6 += var3;
			var6 ^= var3 >>> 2;
			var4 += var6;
			var3 += var8;
			var3 ^= var8 << 8;
			var2 += var3;
			var8 += var4;
			var8 ^= var4 >>> 16;
			var7 += var8;
			var4 += var2;
			var4 ^= var2 << 10;
			var1 += var4;
			var2 += var7;
			var2 ^= var7 >>> 4;
			var9 += var2;
			var7 += var1;
			var7 ^= var1 << 8;
			var6 += var7;
			var1 += var9;
			var1 ^= var9 >>> 9;
			var3 += var1;
			var9 += var6;
			anIntArray555[var5] = var9;
			anIntArray555[1 + var5] = var6;
			anIntArray555[2 + var5] = var3;
			anIntArray555[var5 + 3] = var8;
			anIntArray555[var5 + 4] = var4;
			anIntArray555[var5 + 5] = var2;
			anIntArray555[6 + var5] = var7;
			anIntArray555[var5 + 7] = var1;
		}

		for (var5 = 0; var5 < 256; var5 += 8) {
			var9 += anIntArray555[var5];
			var6 += anIntArray555[var5 + 1];
			var3 += anIntArray555[2 + var5];
			var8 += anIntArray555[var5 + 3];
			var4 += anIntArray555[4 + var5];
			var2 += anIntArray555[5 + var5];
			var7 += anIntArray555[6 + var5];
			var1 += anIntArray555[7 + var5];
			var9 ^= var6 << 11;
			var8 += var9;
			var6 += var3;
			var6 ^= var3 >>> 2;
			var4 += var6;
			var3 += var8;
			var3 ^= var8 << 8;
			var2 += var3;
			var8 += var4;
			var8 ^= var4 >>> 16;
			var7 += var8;
			var4 += var2;
			var4 ^= var2 << 10;
			var1 += var4;
			var2 += var7;
			var2 ^= var7 >>> 4;
			var9 += var2;
			var7 += var1;
			var7 ^= var1 << 8;
			var6 += var7;
			var1 += var9;
			var1 ^= var9 >>> 9;
			var3 += var1;
			var9 += var6;
			anIntArray555[var5] = var9;
			anIntArray555[1 + var5] = var6;
			anIntArray555[var5 + 2] = var3;
			anIntArray555[3 + var5] = var8;
			anIntArray555[4 + var5] = var4;
			anIntArray555[var5 + 5] = var2;
			anIntArray555[var5 + 6] = var7;
			anIntArray555[var5 + 7] = var1;
		}

		method280();
		anInt556 = 256;
	}

	IsaacCipher(final int[] var1) {
		for (int var2 = 0; var2 < var1.length; ++var2)
			anIntArray557[var2] = var1[var2];

		method281();
	}

	public static void method282() {
		Class109_Sub21_Sub5.aClass120_1341.method439();
		Class109_Sub21_Sub5.aClass120_1342.method439();
		Class109_Sub21_Sub5.aClass120_1343.method439();
	}
}
