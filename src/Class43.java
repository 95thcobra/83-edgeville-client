public class Class43 {
	Class109_Sub6 aClass109_Sub6_437 = null;
	int anInt439 = -1;
	boolean aBool444 = false;
	int[] anIntArray434;
	int[] anIntArray441;
	int[] anIntArray438;
	int[] anIntArray442;
	static int[] anIntArray440 = new int[500];
	static int[] anIntArray435 = new int[500];
	static int[] anIntArray436 = new int[500];
	static int[] anIntArray443 = new int[500];

	Class43(final byte[] var1, final Class109_Sub6 var2) {
		aClass109_Sub6_437 = var2;
		final DataBuffer var5 = new DataBuffer(var1);
		final DataBuffer var9 = new DataBuffer(var1);
		var5.position = 2;
		final int var6 = var5.method564();
		int var7 = -1;
		int var3 = 0;
		var9.position = var5.position + var6;

		int var4;
		for (var4 = 0; var4 < var6; ++var4) {
			final int var8 = var5.method564();
			if (var8 > 0) {
				if (aClass109_Sub6_437.anIntArray966[var4] != 0)
					for (int var10 = var4 - 1; var10 > var7; --var10)
						if (aClass109_Sub6_437.anIntArray966[var10] == 0) {
							anIntArray440[var3] = var10;
							anIntArray435[var3] = 0;
							anIntArray436[var3] = 0;
							anIntArray443[var3] = 0;
							++var3;
							break;
						}

				anIntArray440[var3] = var4;
				short var11 = 0;
				if (aClass109_Sub6_437.anIntArray966[var4] == 3)
					var11 = 128;

				if ((var8 & 1) != 0)
					anIntArray435[var3] = var9.method573();
				else
					anIntArray435[var3] = var11;

				if ((var8 & 2) != 0)
					anIntArray436[var3] = var9.method573();
				else
					anIntArray436[var3] = var11;

				if ((var8 & 4) != 0)
					anIntArray443[var3] = var9.method573();
				else
					anIntArray443[var3] = var11;

				var7 = var4;
				++var3;
				if (aClass109_Sub6_437.anIntArray966[var4] == 5)
					aBool444 = true;
			}
		}

		if (var9.position != var1.length)
			throw new RuntimeException();
		else {
			anInt439 = var3;
			anIntArray434 = new int[var3];
			anIntArray441 = new int[var3];
			anIntArray438 = new int[var3];
			anIntArray442 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				anIntArray434[var4] = anIntArray440[var4];
				anIntArray441[var4] = anIntArray435[var4];
				anIntArray438[var4] = anIntArray436[var4];
				anIntArray442[var4] = anIntArray443[var4];
			}

		}
	}
}
