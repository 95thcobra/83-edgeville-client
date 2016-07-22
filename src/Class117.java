public class Class117 {
	int[] anIntArray835;

	public int method434(final int var1) {
		final int var2 = (anIntArray835.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			final int var4 = anIntArray835[var3 + var3 + 1];
			if (var4 == -1)
				return -1;

			if (anIntArray835[var3 + var3] == var1)
				return var4;

			var3 = (var3 + 1) & var2;
		}
	}

	public Class117(final int[] var1) {
		int var3;
		for (var3 = 1; var3 <= (var1.length + (var1.length >> 1)); var3 <<= 1)
			;

		anIntArray835 = new int[var3 + var3];

		int var2;
		for (var2 = 0; var2 < (var3 + var3); ++var2)
			anIntArray835[var2] = -1;

		int var4;
		for (var2 = 0; var2 < var1.length; anIntArray835[var4 + var4 + 1] = var2++) {
			for (var4 = var1[var2] & (var3 - 1); anIntArray835[var4 + var4 + 1] != -1; var4 = (var4 + 1) & (var3 - 1))
				;

			anIntArray835[var4 + var4] = var1[var2];
		}

	}
}
