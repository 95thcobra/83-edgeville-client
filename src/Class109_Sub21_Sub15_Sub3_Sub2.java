public final class Class109_Sub21_Sub15_Sub3_Sub2 extends Class109_Sub21_Sub15_Sub3 {
	int anInt1934;
	int anInt1936;
	int anInt1937;
	int anInt1938;
	int anInt1939;
	static Class109_Sub21_Sub14_Sub1[] aClass109_Sub21_Sub14_Sub1Array1943;
	int anInt1944;
	int anInt1946;
	int anInt1947;
	int anInt1930 = -1;
	int anInt1942 = -1;
	int anInt1932 = 0;
	int anInt1933 = 0;
	int anInt1935 = 0;
	int anInt1948 = 0;
	boolean aBool1941 = false;
	int anInt1945 = 0;
	boolean aBool1928 = false;
	String aString1931;
	Class96 aClass96_1929;
	Class109_Sub21_Sub15_Sub4 aClass109_Sub21_Sub15_Sub4_1940;

	final void method1037(final DataBuffer var1) {
		var1.position = 0;
		final int var8 = var1.method564();
		anInt1930 = var1.method612();
		anInt1942 = var1.method612();
		int var6 = -1;
		anInt1945 = 0;
		final int[] var2 = new int[12];

		int var4;
		int var5;
		for (int var3 = 0; var3 < 12; ++var3) {
			var4 = var1.method564();
			if (var4 == 0)
				var2[var3] = 0;
			else {
				var5 = var1.method564();
				var2[var3] = (var4 << 8) + var5;
				if ((var3 == 0) && (var2[0] == '\uffff')) {
					var6 = var1.method566();
					break;
				}

				if (var2[var3] >= 512) {
					final int var7 = Class109_Sub23.method660(var2[var3] - 512).anInt1380;
					if (var7 != 0)
						anInt1945 = var7;
				}
			}
		}

		final int[] var9 = new int[5];

		for (var4 = 0; var4 < 5; ++var4) {
			var5 = var1.method564();
			if ((var5 < 0) || (var5 >= Class96.aShortArrayArray715[var4].length))
				var5 = 0;

			var9[var4] = var5;
		}

		anInt1657 = var1.method566();
		if (anInt1657 == '\uffff')
			anInt1657 = -1;

		anInt1658 = var1.method566();
		if (anInt1658 == '\uffff')
			anInt1658 = -1;

		anInt1659 = anInt1658;
		anInt1660 = var1.method566();
		if (anInt1660 == '\uffff')
			anInt1660 = -1;

		anInt1661 = var1.method566();
		if (anInt1661 == '\uffff')
			anInt1661 = -1;

		anInt1678 = var1.method566();
		if (anInt1678 == '\uffff')
			anInt1678 = -1;

		anInt1696 = var1.method566();
		if (anInt1696 == '\uffff')
			anInt1696 = -1;

		anInt1679 = var1.method566();
		if (anInt1679 == '\uffff')
			anInt1679 = -1;

		aString1931 = var1.method602();
		if (this == Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590)
			RuntimeException_Sub1.aString1897 = aString1931;

		anInt1932 = var1.method564();
		anInt1933 = var1.method566();
		aBool1928 = var1.method564() == 1;
		if ((client.anInt1972 == 0) && (client.anInt2135 >= 2))
			aBool1928 = false;

		if (aClass96_1929 == null)
			aClass96_1929 = new Class96();

		aClass96_1929.method357(var2, var9, var8 == 1, var6);
	}

	static void method1038() {
		client.aLong1980 = -1L;
		client.anInt1984 = -1;
		client.aClass41_2059.anInt373 = 0;
		Class113.aBool816 = true;
		client.aBool1985 = true;
		client.aLong2011 = -1L;
		Class1.method15();
		client.secureBuffer.position = 0;
		client.aClass109_Sub14_Sub1_2211.position = 0;
		client.anInt2013 = -1;
		client.anInt2153 = 1;
		client.anInt2018 = -1;
		client.anInt2019 = -1;
		client.anInt2014 = 0;
		client.anInt1987 = 0;
		client.anInt2016 = 0;
		client.anInt2158 = 0;
		client.anInt2045 = 0;
		client.aBool2109 = false;
		Class81.anInt631 = 0;
		Class35.aMap332.clear();
		Class35.aClass125_331.method447();
		Class35.aClass121_333.method443();
		Class35.anInt335 = 0;
		client.anInt2196 = 0;
		client.aBool2171 = false;
		client.anInt2212 = 0;
		client.anInt2037 = (int) (Math.random() * 100.0D) - 50;
		client.anInt2033 = (int) (Math.random() * 110.0D) - 55;
		client.anInt2035 = (int) (Math.random() * 80.0D) - 40;
		client.anInt2038 = (int) (Math.random() * 120.0D) - 60;
		client.anInt2040 = (int) (Math.random() * 30.0D) - 20;
		client.anInt2052 = ((int) (Math.random() * 20.0D) - 10) & 2047;
		client.anInt2206 = 0;
		client.anInt2090 = -1;
		client.anInt2204 = 0;
		client.anInt2205 = 0;
		client.aClass49_2176 = Class49.aClass49_508;
		client.anInt2087 = 0;
		client.anInt2007 = 0;

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var1] = null;
			client.aClass109_Sub14Array2091[var1] = null;
		}

		for (var1 = 0; var1 < '\u8000'; ++var1)
			client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var1] = null;

		Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[2047] = new Class109_Sub21_Sub15_Sub3_Sub2();
		client.anInt2100 = -1;
		client.aClass126_2197.method456();
		client.aClass126_2104.method456();

		for (var1 = 0; var1 < 4; ++var1)
			for (int var2 = 0; var2 < 104; ++var2)
				for (int var3 = 0; var3 < 104; ++var3)
					client.aClass126ArrayArrayArray2121[var1][var2][var3] = null;

		client.aClass126_2102 = new Class126();
		client.anInt2238 = 0;
		client.anInt2237 = 0;
		client.anInt2132 = 0;

		for (var1 = 0; var1 < Class122.anInt847; ++var1) {
			final Class109_Sub21_Sub2 var0 = Class109_Sub21_Sub7.method711(var1);
			if (var0 != null) {
				Class106.anIntArray797[var1] = 0;
				Class106.anIntArray798[var1] = 0;
			}
		}

		for (var1 = 0; var1 < client.anIntArray2166.length; ++var1)
			client.anIntArray2166[var1] = -1;

		client.anInt2235 = -1;
		if (client.anInt2128 != -1)
			Class88.method352(client.anInt2128);

		for (Class109_Sub13 var4 = (Class109_Sub13) client.aClass116_2129
				.method432(); var4 != null; var4 = (Class109_Sub13) client.aClass116_2129.method433())
			client.method1064(var4, true);

		client.anInt2128 = -1;
		client.aClass116_2129 = new Class116(8);
		client.aClass109_Sub20_2044 = null;
		client.aBool2109 = false;
		client.anInt2045 = 0;
		client.aClass96_2243.method357((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);

		for (var1 = 0; var1 < 8; ++var1) {
			client.aStringArray2151[var1] = null;
			client.aBoolArray1990[var1] = false;
		}

		Class66.method292();
		client.aBool2029 = true;

		for (var1 = 0; var1 < 100; ++var1)
			client.aBoolArray2116[var1] = true;

		Class21.method100();
		client.aString2015 = null;
		Class109_Sub21_Sub17.anInt1589 = 0;
		Class53.aClass109_Sub7Array532 = null;

		for (var1 = 0; var1 < 8; ++var1)
			client.aClass134Array2246[var1] = new Class134();

		Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924 = null;
	}

	@Override
	final boolean method897(final int var1) {
		return aClass96_1929 != null;
	}

	@Override
	protected final Class109_Sub21_Sub15_Sub4 method827(final byte var1) {
		if (null == aClass96_1929)
			return null;
		else {
			final Class109_Sub21_Sub7 var3 = (anInt1683 != -1) && (anInt1689 == 0)
					? Class109_Sub21_Sub18.method849(anInt1683, 1013382101) : null;
			final Class109_Sub21_Sub7 var5 = (anInt1663 != -1) && !aBool1941
					&& ((anInt1663 != anInt1657) || (var3 == null))
							? Class109_Sub21_Sub18.method849(anInt1663, -69562687) : null;
			Class109_Sub21_Sub15_Sub4 var4 = aClass96_1929.method365(var3, anInt1684, var5, anInt1681);
			if (null == var4)
				return null;
			else {
				var4.method937();
				anInt1652 = var4.anInt1576;
				Class109_Sub21_Sub15_Sub4 var2;
				Class109_Sub21_Sub15_Sub4[] var6;
				if (!aBool1941 && (anInt1688 != -1) && (anInt1676 != -1)) {
					var2 = Class35.method154(anInt1688).method748(anInt1676);
					if (null != var2) {
						var2.method935(0, -anInt1692, 0);
						var6 = new Class109_Sub21_Sub15_Sub4[] { var4, var2 };
						var4 = new Class109_Sub21_Sub15_Sub4(var6, 2);
					}
				}

				if (!aBool1941 && (aClass109_Sub21_Sub15_Sub4_1940 != null)) {
					if (client.anInt1979 >= anInt1948)
						aClass109_Sub21_Sub15_Sub4_1940 = null;

					if ((client.anInt1979 >= anInt1935) && (client.anInt1979 < anInt1948)) {
						var2 = aClass109_Sub21_Sub15_Sub4_1940;
						var2.method935(anInt1937 - anInt1710, anInt1946 - anInt1934, anInt1939 - anInt1653);
						if (anInt1680 == 512) {
							var2.method942();
							var2.method942();
							var2.method942();
						} else if (anInt1680 == 1024) {
							var2.method942();
							var2.method942();
						} else if (anInt1680 == 1536)
							var2.method942();

						var6 = new Class109_Sub21_Sub15_Sub4[] { var4, var2 };
						var4 = new Class109_Sub21_Sub15_Sub4(var6, 2);
						if (anInt1680 == 512)
							var2.method942();
						else if (anInt1680 == 1024) {
							var2.method942();
							var2.method942();
						} else if (anInt1680 == 1536) {
							var2.method942();
							var2.method942();
							var2.method942();
						}

						var2.method935(anInt1710 - anInt1937, anInt1934 - anInt1946, anInt1653 - anInt1939);
					}
				}

				var4.aBool1754 = true;
				return var4;
			}
		}
	}

	public static int method1039(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}
}
