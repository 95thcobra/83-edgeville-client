public class Class28 {
	int anInt262;
	int anInt263;
	int anInt264;
	static Class104_Sub1 aClass104_Sub1_265;

	public static byte[] method127(final CharSequence var0) {
		final int var1 = var0.length();
		final byte[] var4 = new byte[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			final char var3 = var0.charAt(var2);
			if (((var3 > 0) && (var3 < 128)) || ((var3 >= 160) && (var3 <= 255)))
				var4[var2] = (byte) var3;
			else if (var3 == 8364)
				var4[var2] = -128;
			else if (var3 == 8218)
				var4[var2] = -126;
			else if (var3 == 402)
				var4[var2] = -125;
			else if (var3 == 8222)
				var4[var2] = -124;
			else if (var3 == 8230)
				var4[var2] = -123;
			else if (var3 == 8224)
				var4[var2] = -122;
			else if (var3 == 8225)
				var4[var2] = -121;
			else if (var3 == 710)
				var4[var2] = -120;
			else if (var3 == 8240)
				var4[var2] = -119;
			else if (var3 == 352)
				var4[var2] = -118;
			else if (var3 == 8249)
				var4[var2] = -117;
			else if (var3 == 338)
				var4[var2] = -116;
			else if (var3 == 381)
				var4[var2] = -114;
			else if (var3 == 8216)
				var4[var2] = -111;
			else if (var3 == 8217)
				var4[var2] = -110;
			else if (var3 == 8220)
				var4[var2] = -109;
			else if (var3 == 8221)
				var4[var2] = -108;
			else if (var3 == 8226)
				var4[var2] = -107;
			else if (var3 == 8211)
				var4[var2] = -106;
			else if (var3 == 8212)
				var4[var2] = -105;
			else if (var3 == 732)
				var4[var2] = -104;
			else if (var3 == 8482)
				var4[var2] = -103;
			else if (var3 == 353)
				var4[var2] = -102;
			else if (var3 == 8250)
				var4[var2] = -101;
			else if (var3 == 339)
				var4[var2] = -100;
			else if (var3 == 382)
				var4[var2] = -98;
			else if (var3 == 376)
				var4[var2] = -97;
			else
				var4[var2] = 63;
		}

		return var4;
	}

	public static Class109_Sub21_Sub10 method128(final int var0) {
		Class109_Sub21_Sub10 var1 = (Class109_Sub21_Sub10) Class109_Sub21_Sub10.aClass120_1454.method438(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class109_Sub21_Sub10.aClass104_1473.method387(6, var0);
			var1 = new Class109_Sub21_Sub10();
			var1.anInt1431 = var0;
			if (var2 != null)
				var1.method731(new DataBuffer(var2));

			var1.method725();
			if (var1.aBool1462) {
				var1.anInt1438 = 0;
				var1.aBool1450 = false;
			}

			Class109_Sub21_Sub10.aClass120_1454.method440(var1, var0);
			return var1;
		}
	}

	public static boolean method129(final int var0) {
		return ((var0 >> 29) & 1) != 0;
	}
}
