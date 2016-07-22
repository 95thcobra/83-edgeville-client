import java.util.Iterator;

public class Class57_Sub2 extends Class57 {
	int anInt1086 = 256;
	int anInt1085 = 1;
	long aLong1083 = Class109_Sub21_Sub15.method829(1375155712);
	int anInt1088;
	int anInt1087 = 0;
	long[] aLongArray1084 = new long[10];

	@Override
	int method270(final int var1, final int var2, final byte var3) {
		final int var4 = anInt1086;
		final int var6 = anInt1085;
		anInt1086 = 300;
		anInt1085 = 1;
		aLong1083 = Class109_Sub21_Sub15.method829(386271761);
		if (0L == aLongArray1084[anInt1088]) {
			anInt1086 = var4;
			anInt1085 = var6;
		} else if (aLong1083 > aLongArray1084[anInt1088])
			anInt1086 = (int) (var1 * 2560 / (aLong1083 - aLongArray1084[anInt1088]));

		if (anInt1086 < 25)
			anInt1086 = 25;

		if (anInt1086 > 256) {
			anInt1086 = 256;
			anInt1085 = (int) (var1 - ((aLong1083 - aLongArray1084[anInt1088]) / 10L));
		}

		if (anInt1085 > var1)
			anInt1085 = var1;

		aLongArray1084[anInt1088] = aLong1083;
		anInt1088 = (anInt1088 + 1) % 10;
		int var5;
		if (anInt1085 > 1)
			for (var5 = 0; var5 < 10; ++var5)
				if (aLongArray1084[var5] != 0L)
					aLongArray1084[var5] += anInt1085;

		if (anInt1085 < var2)
			anInt1085 = var2;

		Class94.method356(anInt1085);

		for (var5 = 0; anInt1087 < 256; anInt1087 += anInt1086)
			++var5;

		anInt1087 &= 255;
		return var5;
	}

	static final void method625(final boolean var0) {
		while (true) {
			if (client.aClass109_Sub14_Sub1_2211.method846(client.anInt2012) >= 27) {
				final int var2 = client.aClass109_Sub14_Sub1_2211.method844(15);
				if (var2 != 32767) {
					boolean var4 = false;
					if (null == client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var2]) {
						client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var2] = new Class109_Sub21_Sub15_Sub3_Sub1();
						var4 = true;
					}

					final Class109_Sub21_Sub15_Sub3_Sub1 var1 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var2];
					client.anIntArray2175[++client.anInt2007 - 1] = var2;
					var1.anInt1700 = client.anInt1979;
					int var3;
					if (var0) {
						var3 = client.aClass109_Sub14_Sub1_2211.method844(8);
						if (var3 > 127)
							var3 -= 256;
					} else {
						var3 = client.aClass109_Sub14_Sub1_2211.method844(5);
						if (var3 > 15)
							var3 -= 32;
					}

					int var5;
					if (var0) {
						var5 = client.aClass109_Sub14_Sub1_2211.method844(8);
						if (var5 > 127)
							var5 -= 256;
					} else {
						var5 = client.aClass109_Sub14_Sub1_2211.method844(5);
						if (var5 > 15)
							var5 -= 32;
					}

					final int var7 = client.aClass109_Sub14_Sub1_2211.method844(1);
					if (var7 == 1)
						client.anIntArray2186[++client.anInt2089 - 1] = var2;

					final int var6 = client.aClass109_Sub14_Sub1_2211.method844(1);
					var1.aClass109_Sub21_Sub13_1925 = Class122
							.method444(client.aClass109_Sub14_Sub1_2211.method844(14));
					final int var8 = client.anIntArray2099[client.aClass109_Sub14_Sub1_2211.method844(3)];
					if (var4)
						var1.anInt1680 = var1.anInt1654 = var8;

					var1.anInt1656 = var1.aClass109_Sub21_Sub13_1925.anInt1514;
					var1.anInt1686 = var1.aClass109_Sub21_Sub13_1925.anInt1537;
					if (var1.anInt1686 == 0)
						var1.anInt1654 = 0;

					var1.anInt1660 = var1.aClass109_Sub21_Sub13_1925.anInt1520;
					var1.anInt1661 = var1.aClass109_Sub21_Sub13_1925.anInt1521;
					var1.anInt1678 = var1.aClass109_Sub21_Sub13_1925.anInt1522;
					var1.anInt1696 = var1.aClass109_Sub21_Sub13_1925.anInt1543;
					var1.anInt1657 = var1.aClass109_Sub21_Sub13_1925.anInt1517;
					var1.anInt1658 = var1.aClass109_Sub21_Sub13_1925.anInt1529;
					var1.anInt1659 = var1.aClass109_Sub21_Sub13_1925.anInt1519;
					var1.method895(var5 + Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1655[0],
							Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anIntArray1706[0] + var3,
							var6 == 1);
					continue;
				}
			}

			client.aClass109_Sub14_Sub1_2211.method845();
			return;
		}
	}

	@Override
	public void method269(final int var1) {
		for (int var2 = 0; var2 < 10; ++var2)
			aLongArray1084[var2] = 0L;

	}

	Class57_Sub2() {
		for (int var1 = 0; var1 < 10; ++var1)
			aLongArray1084[var1] = aLong1083;

	}

	static String method626() {
		String var0 = "";

		Class109_Sub21_Sub9 var2;
		for (final Iterator var1 = Class35.aClass125_331.iterator(); var1
				.hasNext(); var0 = var0 + var2.aString1421 + '\u003a' + var2.aString1417 + '\n')
			var2 = (Class109_Sub21_Sub9) var1.next();

		return var0;
	}

	public static int method627(final CharSequence var0, final int var1, final int var2, final byte[] var3,
			final int var4) {
		final int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			final char var7 = var0.charAt(var6 + var1);
			if (((var7 <= 0) || (var7 >= 128)) && ((var7 < 160) || (var7 > 255))) {
				if (var7 == 8364)
					var3[var6 + var4] = -128;
				else if (var7 == 8218)
					var3[var4 + var6] = -126;
				else if (var7 == 402)
					var3[var6 + var4] = -125;
				else if (var7 == 8222)
					var3[var6 + var4] = -124;
				else if (var7 == 8230)
					var3[var4 + var6] = -123;
				else if (var7 == 8224)
					var3[var4 + var6] = -122;
				else if (var7 == 8225)
					var3[var6 + var4] = -121;
				else if (var7 == 710)
					var3[var6 + var4] = -120;
				else if (var7 == 8240)
					var3[var6 + var4] = -119;
				else if (var7 == 352)
					var3[var6 + var4] = -118;
				else if (var7 == 8249)
					var3[var6 + var4] = -117;
				else if (var7 == 338)
					var3[var4 + var6] = -116;
				else if (var7 == 381)
					var3[var6 + var4] = -114;
				else if (var7 == 8216)
					var3[var4 + var6] = -111;
				else if (var7 == 8217)
					var3[var6 + var4] = -110;
				else if (var7 == 8220)
					var3[var6 + var4] = -109;
				else if (var7 == 8221)
					var3[var4 + var6] = -108;
				else if (var7 == 8226)
					var3[var4 + var6] = -107;
				else if (var7 == 8211)
					var3[var6 + var4] = -106;
				else if (var7 == 8212)
					var3[var6 + var4] = -105;
				else if (var7 == 732)
					var3[var4 + var6] = -104;
				else if (var7 == 8482)
					var3[var4 + var6] = -103;
				else if (var7 == 353)
					var3[var4 + var6] = -102;
				else if (var7 == 8250)
					var3[var6 + var4] = -101;
				else if (var7 == 339)
					var3[var4 + var6] = -100;
				else if (var7 == 382)
					var3[var6 + var4] = -98;
				else if (var7 == 376)
					var3[var4 + var6] = -97;
				else
					var3[var6 + var4] = 63;
			} else
				var3[var6 + var4] = (byte) var7;
		}

		return var5;
	}

	static byte[] method628(final byte[] var0) {
		final int var1 = var0.length;
		final byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}
}
