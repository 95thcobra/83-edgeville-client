public class Class56 {
	static long aLong542;
	public static Class104 aClass104_543;
	static int anInt544;
	static long aLong545;

	public static String method267(final byte[] var0, final int var1, final int var2) {
		final StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < (var2 + var1); var4 += 3) {
			final int var6 = var0[var4] & 255;
			var3.append(Class85.aCharArray659[var6 >>> 2]);
			if (var4 < (var2 - 1)) {
				final int var5 = var0[1 + var4] & 255;
				var3.append(Class85.aCharArray659[((var6 & 3) << 4) | (var5 >>> 4)]);
				if (var4 < (var2 - 2)) {
					final int var7 = var0[var4 + 2] & 255;
					var3.append(Class85.aCharArray659[((var5 & 15) << 2) | (var7 >>> 6)])
							.append(Class85.aCharArray659[var7 & 63]);
				} else
					var3.append(Class85.aCharArray659[(var5 & 15) << 2]).append("=");
			} else
				var3.append(Class85.aCharArray659[(var6 & 3) << 4]).append("==");
		}

		return var3.toString();
	}

	static final void method268(final Class109_Sub20[] var0, final int var1) {
		for (final Class109_Sub20 var4 : var0) {
			if (var4 != null) {
				if (var4.anInt1229 == 0) {
					if (null != var4.aClass109_Sub20Array1272)
						method268(var4.aClass109_Sub20Array1272, var1);

					final Class109_Sub13 var3 = (Class109_Sub13) client.aClass116_2129.method429(var4.anInt1148);
					if (null != var3) {
						final int var5 = var3.anInt1050;
						if (Class108.method412(var5))
							method268(Class109_Sub20.aClass109_Sub20ArrayArray1150[var5], var1);
					}
				}

				Class109_Sub9 var6;
				if ((var1 == 0) && (null != var4.anObjectArray1252)) {
					var6 = new Class109_Sub9();
					var6.aClass109_Sub20_996 = var4;
					var6.anObjectArray997 = var4.anObjectArray1252;
					Class109_Sub13.method551(var6, 200000);
				}

				if ((var1 == 1) && (null != var4.anObjectArray1178)) {
					if (var4.anInt1147 >= 0) {
						final Class109_Sub20 var7 = Class83.method345(var4.anInt1148);
						if ((var7 == null) || (var7.aClass109_Sub20Array1272 == null)
								|| (var4.anInt1147 >= var7.aClass109_Sub20Array1272.length)
								|| (var7.aClass109_Sub20Array1272[var4.anInt1147] != var4))
							continue;
					}

					var6 = new Class109_Sub9();
					var6.aClass109_Sub20_996 = var4;
					var6.anObjectArray997 = var4.anObjectArray1178;
					Class109_Sub13.method551(var6, 200000);
				}
			}
		}

	}
}
