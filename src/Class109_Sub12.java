public class Class109_Sub12 extends Class109 {
	static String aString1039;
	static Class104_Sub1 aClass104_Sub1_1042;
	static byte aByte1044;
	int[] anIntArray1040 = new int[] { -1 };
	int[] anIntArray1041 = new int[] { 0 };
	static Class116 aClass116_1043 = new Class116(32);

	static void method545(final int var0) {
		client.aLong2228 = 0L;
		if (var0 >= 2)
			client.aBool2184 = true;
		else
			client.aBool2184 = false;

		Class109_Sub4_Sub4.method886();
		if (client.anInt2180 >= 25)
			Class21.method100();

		Applet_Sub1.aBool1961 = true;
	}

	static void method546(final int var0, final byte[] var1, final Class68 var2) {
		final Class109_Sub17 var3 = new Class109_Sub17();
		var3.anInt1101 = 0;
		var3.aLong802 = var0;
		var3.aByteArray1100 = var1;
		var3.aClass68_1099 = var2;
		final Class126 var4 = Class105.aClass126_793;
		synchronized (var4) {
			Class105.aClass126_793.method450(var3);
		}

		Class26.method120();
	}

	static void method547(final Class109_Sub21_Sub7 var0, final int var1, final int var2, final int var3) {
		if ((client.anInt2212 < 50) && (client.anInt2199 != 0))
			if ((var0.anIntArray1397 != null) && (var1 < var0.anIntArray1397.length)) {
				final int var5 = var0.anIntArray1397[var1];
				if (var5 != 0) {
					final int var6 = var5 >> 8;
					final int var4 = (var5 >> 4) & 7;
					final int var7 = var5 & 15;
					client.anIntArray2213[client.anInt2212] = var6;
					client.anIntArray2214[client.anInt2212] = var4;
					client.anIntArray2248[client.anInt2212] = 0;
					client.aClass11Array2217[client.anInt2212] = null;
					final int var8 = (var2 - 64) / 128;
					final int var9 = (var3 - 64) / 128;
					client.anIntArray2216[client.anInt2212] = (var9 << 8) + (var8 << 16) + var7;
					++client.anInt2212;
				}
			}
	}
}
