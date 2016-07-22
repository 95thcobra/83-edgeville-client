public final class Class80 {
	static char[] aCharArray630 = new char[] { '\u005f', '\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066',
			'\u0067', '\u0068', '\u0069', '\u006a', '\u006b', '\u006c', '\u006d', '\u006e', '\u006f', '\u0070',
			'\u0071', '\u0072', '\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078', '\u0079', '\u007a',
			'\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039' };

	static final void method333(final Class109_Sub21_Sub14_Sub1 var0) {
		final short var1 = 256;

		int var2;
		for (var2 = 0; var2 < Class3.anIntArray25.length; ++var2)
			Class3.anIntArray25[var2] = 0;

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int) (Math.random() * 128.0D * var1);
			Class3.anIntArray25[var3] = (int) (Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < (var1 - 1); ++var3)
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = (var3 << 7) + var4;
					Class109_Sub8.anIntArray995[var5] = (Class3.anIntArray25[128 + var5] + Class3.anIntArray25[var5 - 1]
							+ Class3.anIntArray25[var5 + 1] + Class3.anIntArray25[var5 - 128]) / 4;
				}

			final int[] var7 = Class3.anIntArray25;
			Class3.anIntArray25 = Class109_Sub8.anIntArray995;
			Class109_Sub8.anIntArray995 = var7;
		}

		if (var0 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var0.anInt1714; ++var3)
				for (var4 = 0; var4 < var0.anInt1713; ++var4)
					if (var0.aByteArray1711[var2++] != 0) {
						var5 = 16 + var4 + var0.anInt1715;
						final int var6 = var3 + 16 + var0.anInt1717;
						final int var8 = (var6 << 7) + var5;
						Class3.anIntArray25[var8] = 0;
					}
		}

	}

	static final String[] method334(final String[] var0) {
		final String[] var1 = new String[5];

		for (int var2 = 0; var2 < 5; ++var2) {
			var1[var2] = var2 + ": ";
			if ((var0 != null) && (null != var0[var2]))
				var1[var2] = var1[var2] + var0[var2];
		}

		return var1;
	}

	static final void method335() {
		int var0;
		int var1;
		for (var0 = -1; var0 < client.anInt2087; ++var0) {
			if (var0 == -1)
				var1 = 2047;
			else
				var1 = client.anIntArray2134[var0];

			final Class109_Sub21_Sub15_Sub3_Sub2 var2 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var1];
			if ((null != var2) && (var2.anInt1668 > 0)) {
				--var2.anInt1668;
				if (var2.anInt1668 == 0)
					var2.aString1702 = null;
			}
		}

		for (var0 = 0; var0 < client.anInt2007; ++var0) {
			var1 = client.anIntArray2175[var0];
			final Class109_Sub21_Sub15_Sub3_Sub1 var3 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var1];
			if ((null != var3) && (var3.anInt1668 > 0)) {
				--var3.anInt1668;
				if (var3.anInt1668 == 0)
					var3.aString1702 = null;
			}
		}

	}
}
