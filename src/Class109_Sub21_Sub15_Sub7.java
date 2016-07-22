public class Class109_Sub21_Sub15_Sub7 extends Class109_Sub21_Sub15 {
	int anInt1850 = 0;
	int anInt1867 = 0;
	byte aByte1862 = 0;
	boolean aBool1848 = false;
	byte[] aByteArray1872;
	int anInt1870;
	int[] anIntArray1855;
	int[] anIntArray1857;
	int[] anIntArray1851;
	int[] anIntArray1853;
	int[] anIntArray1854;
	int[] anIntArray1890;
	int[] anIntArray1875;
	byte[] aByteArray1856;
	byte[] aByteArray1888;
	byte[] aByteArray1869;
	int[] anIntArray1876;
	short[] aShortArray1861;
	short[] aShortArray1860;
	byte[] aByteArray1849;
	short[] aShortArray1865;
	short[] aShortArray1852;
	short[] aShortArray1884;
	short[] aShortArray1868;
	short[] aShortArray1858;
	short[] aShortArray1894;
	short[] aShortArray1871;
	byte[] aByteArray1874;
	short[] aShortArray1892;
	short[] aShortArray1864;
	int[][] anIntArrayArray1877;
	int[][] anIntArrayArray1878;
	Class19[] aClass19Array1880;
	Class28[] aClass28Array1879;
	Class19[] aClass19Array1881;
	public short aShort1882;
	public short aShort1883;
	int anInt1885;
	int anInt1886;
	int anInt1887;
	int anInt1873;
	int anInt1889;
	static int anInt1866 = 0;
	static int[] anIntArray1863 = new int[10000];
	static int[] anIntArray1891 = new int[10000];
	static int[] anIntArray1893;
	static int[] anIntArray1859;

	public static Class109_Sub21_Sub15_Sub7 method984(final Class104 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method387(var1, var2);
		return var3 == null ? null : new Class109_Sub21_Sub15_Sub7(var3);
	}

	Class109_Sub21_Sub15_Sub7(final byte[] var1) {
		if ((var1[var1.length - 1] == -1) && (var1[var1.length - 2] == -1))
			method985(var1);
		else
			method998(var1);

	}

	void method985(final byte[] var1) {
		final DataBuffer var2 = new DataBuffer(var1);
		final DataBuffer var49 = new DataBuffer(var1);
		final DataBuffer var8 = new DataBuffer(var1);
		final DataBuffer var4 = new DataBuffer(var1);
		final DataBuffer var37 = new DataBuffer(var1);
		final DataBuffer var7 = new DataBuffer(var1);
		final DataBuffer var55 = new DataBuffer(var1);
		var2.position = var1.length - 23;
		final int var25 = var2.method566();
		final int var6 = var2.method566();
		final int var10 = var2.method564();
		final int var11 = var2.method564();
		final int var12 = var2.method564();
		final int var43 = var2.method564();
		final int var14 = var2.method564();
		final int var41 = var2.method564();
		final int var15 = var2.method564();
		final int var16 = var2.method566();
		final int var17 = var2.method566();
		final int var18 = var2.method566();
		final int var34 = var2.method566();
		final int var21 = var2.method566();
		int var24 = 0;
		int var9 = 0;
		int var22 = 0;
		int var5;
		if (var10 > 0) {
			aByteArray1872 = new byte[var10];
			var2.position = 0;

			for (var5 = 0; var5 < var10; ++var5) {
				final byte var23 = aByteArray1872[var5] = var2.method612();
				if (var23 == 0)
					++var24;

				if ((var23 >= 1) && (var23 <= 3))
					++var9;

				if (var23 == 2)
					++var22;
			}
		}

		var5 = var10 + var25;
		final int var26 = var5;
		if (var11 == 1)
			var5 += var6;

		final int var38 = var5;
		var5 += var6;
		final int var27 = var5;
		if (var12 == 255)
			var5 += var6;

		final int var54 = var5;
		if (var14 == 1)
			var5 += var6;

		final int var31 = var5;
		if (var15 == 1)
			var5 += var25;

		final int var32 = var5;
		if (var43 == 1)
			var5 += var6;

		final int var33 = var5;
		var5 += var34;
		final int var30 = var5;
		if (var41 == 1)
			var5 += var6 * 2;

		final int var48 = var5;
		var5 += var21;
		final int var35 = var5;
		var5 += var6 * 2;
		final int var47 = var5;
		var5 += var16;
		final int var36 = var5;
		var5 += var17;
		final int var50 = var5;
		var5 += var18;
		final int var39 = var5;
		var5 += var24 * 6;
		final int var40 = var5;
		var5 += var9 * 6;
		final int var51 = var5;
		var5 += var9 * 6;
		final int var42 = var5;
		var5 += var9 * 2;
		final int var57 = var5;
		var5 += var9;
		final int var44 = var5;
		var5 += (var9 * 2) + (var22 * 2);
		anInt1850 = var25;
		anInt1867 = var6;
		anInt1870 = var10;
		anIntArray1855 = new int[var25];
		anIntArray1857 = new int[var25];
		anIntArray1851 = new int[var25];
		anIntArray1853 = new int[var6];
		anIntArray1854 = new int[var6];
		anIntArray1890 = new int[var6];
		if (var15 == 1)
			anIntArray1875 = new int[var25];

		if (var11 == 1)
			aByteArray1856 = new byte[var6];

		if (var12 == 255)
			aByteArray1888 = new byte[var6];
		else
			aByte1862 = (byte) var12;

		if (var43 == 1)
			aByteArray1869 = new byte[var6];

		if (var14 == 1)
			anIntArray1876 = new int[var6];

		if (var41 == 1)
			aShortArray1861 = new short[var6];

		if ((var41 == 1) && (var10 > 0))
			aByteArray1849 = new byte[var6];

		aShortArray1860 = new short[var6];
		if (var10 > 0) {
			aShortArray1865 = new short[var10];
			aShortArray1852 = new short[var10];
			aShortArray1884 = new short[var10];
			if (var9 > 0) {
				aShortArray1868 = new short[var9];
				aShortArray1858 = new short[var9];
				aShortArray1894 = new short[var9];
				aShortArray1871 = new short[var9];
				aByteArray1874 = new byte[var9];
				aShortArray1892 = new short[var9];
			}

			if (var22 > 0)
				aShortArray1864 = new short[var22];
		}

		var2.position = var10;
		var49.position = var47;
		var8.position = var36;
		var4.position = var50;
		var37.position = var31;
		int var52 = 0;
		int var29 = 0;
		int var53 = 0;

		int var3;
		int var19;
		int var20;
		int var28;
		int var45;
		for (var28 = 0; var28 < var25; ++var28) {
			var19 = var2.method564();
			var45 = 0;
			if ((var19 & 1) != 0)
				var45 = var49.method573();

			var20 = 0;
			if ((var19 & 2) != 0)
				var20 = var8.method573();

			var3 = 0;
			if ((var19 & 4) != 0)
				var3 = var4.method573();

			anIntArray1855[var28] = var52 + var45;
			anIntArray1857[var28] = var29 + var20;
			anIntArray1851[var28] = var53 + var3;
			var52 = anIntArray1855[var28];
			var29 = anIntArray1857[var28];
			var53 = anIntArray1851[var28];
			if (var15 == 1)
				anIntArray1875[var28] = var37.method564();
		}

		var2.position = var35;
		var49.position = var26;
		var8.position = var27;
		var4.position = var32;
		var37.position = var54;
		var7.position = var30;
		var55.position = var48;

		for (var28 = 0; var28 < var6; ++var28) {
			aShortArray1860[var28] = (short) var2.method566();
			if (var11 == 1)
				aByteArray1856[var28] = var49.method612();

			if (var12 == 255)
				aByteArray1888[var28] = var8.method612();

			if (var43 == 1)
				aByteArray1869[var28] = var4.method612();

			if (var14 == 1)
				anIntArray1876[var28] = var37.method564();

			if (var41 == 1)
				aShortArray1861[var28] = (short) (var7.method566() - 1);

			if ((aByteArray1849 != null) && (aShortArray1861[var28] != -1))
				aByteArray1849[var28] = (byte) (var55.method564() - 1);
		}

		var2.position = var33;
		var49.position = var38;
		var28 = 0;
		var19 = 0;
		var45 = 0;
		var20 = 0;

		int var46;
		for (var3 = 0; var3 < var6; ++var3) {
			var46 = var49.method564();
			if (var46 == 1) {
				var28 = var2.method573() + var20;
				var19 = var2.method573() + var28;
				var45 = var2.method573() + var19;
				var20 = var45;
				anIntArray1853[var3] = var28;
				anIntArray1854[var3] = var19;
				anIntArray1890[var3] = var45;
			}

			if (var46 == 2) {
				var19 = var45;
				var45 = var2.method573() + var20;
				var20 = var45;
				anIntArray1853[var3] = var28;
				anIntArray1854[var3] = var19;
				anIntArray1890[var3] = var45;
			}

			if (var46 == 3) {
				var28 = var45;
				var45 = var2.method573() + var20;
				var20 = var45;
				anIntArray1853[var3] = var28;
				anIntArray1854[var3] = var19;
				anIntArray1890[var3] = var45;
			}

			if (var46 == 4) {
				final int var56 = var28;
				var28 = var19;
				var19 = var56;
				var45 = var2.method573() + var20;
				var20 = var45;
				anIntArray1853[var3] = var28;
				anIntArray1854[var3] = var56;
				anIntArray1890[var3] = var45;
			}
		}

		var2.position = var39;
		var49.position = var40;
		var8.position = var51;
		var4.position = var42;
		var37.position = var57;
		var7.position = var44;

		for (var3 = 0; var3 < var10; ++var3) {
			var46 = aByteArray1872[var3] & 255;
			if (var46 == 0) {
				aShortArray1865[var3] = (short) var2.method566();
				aShortArray1852[var3] = (short) var2.method566();
				aShortArray1884[var3] = (short) var2.method566();
			}

			if (var46 == 1) {
				aShortArray1865[var3] = (short) var49.method566();
				aShortArray1852[var3] = (short) var49.method566();
				aShortArray1884[var3] = (short) var49.method566();
				aShortArray1868[var3] = (short) var8.method566();
				aShortArray1858[var3] = (short) var8.method566();
				aShortArray1894[var3] = (short) var8.method566();
				aShortArray1871[var3] = (short) var4.method566();
				aByteArray1874[var3] = var37.method612();
				aShortArray1892[var3] = (short) var7.method566();
			}

			if (var46 == 2) {
				aShortArray1865[var3] = (short) var49.method566();
				aShortArray1852[var3] = (short) var49.method566();
				aShortArray1884[var3] = (short) var49.method566();
				aShortArray1868[var3] = (short) var8.method566();
				aShortArray1858[var3] = (short) var8.method566();
				aShortArray1894[var3] = (short) var8.method566();
				aShortArray1871[var3] = (short) var4.method566();
				aByteArray1874[var3] = var37.method612();
				aShortArray1892[var3] = (short) var7.method566();
				aShortArray1864[var3] = (short) var7.method566();
			}

			if (var46 == 3) {
				aShortArray1865[var3] = (short) var49.method566();
				aShortArray1852[var3] = (short) var49.method566();
				aShortArray1884[var3] = (short) var49.method566();
				aShortArray1868[var3] = (short) var8.method566();
				aShortArray1858[var3] = (short) var8.method566();
				aShortArray1894[var3] = (short) var8.method566();
				aShortArray1871[var3] = (short) var4.method566();
				aByteArray1874[var3] = var37.method612();
				aShortArray1892[var3] = (short) var7.method566();
			}
		}

		var2.position = var5;
		var3 = var2.method564();
		if (var3 != 0) {
			new Class47();
			var2.method566();
			var2.method566();
			var2.method566();
			var2.method568();
		}

	}

	public Class109_Sub21_Sub15_Sub7(final Class109_Sub21_Sub15_Sub7[] var1, final int var2) {
		boolean var11 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var7 = false;
		boolean var6 = false;
		boolean var3 = false;
		anInt1850 = 0;
		anInt1867 = 0;
		anInt1870 = 0;
		aByte1862 = -1;

		Class109_Sub21_Sub15_Sub7 var8;
		int var10;
		for (var10 = 0; var10 < var2; ++var10) {
			var8 = var1[var10];
			if (var8 != null) {
				anInt1850 += var8.anInt1850;
				anInt1867 += var8.anInt1867;
				anInt1870 += var8.anInt1870;
				if (var8.aByteArray1888 != null)
					var4 = true;
				else {
					if (aByte1862 == -1)
						aByte1862 = var8.aByte1862;

					if (aByte1862 != var8.aByte1862)
						var4 = true;
				}

				var11 |= var8.aByteArray1856 != null;
				var5 |= var8.aByteArray1869 != null;
				var7 |= var8.anIntArray1876 != null;
				var6 |= var8.aShortArray1861 != null;
				var3 |= var8.aByteArray1849 != null;
			}
		}

		anIntArray1855 = new int[anInt1850];
		anIntArray1857 = new int[anInt1850];
		anIntArray1851 = new int[anInt1850];
		anIntArray1875 = new int[anInt1850];
		anIntArray1853 = new int[anInt1867];
		anIntArray1854 = new int[anInt1867];
		anIntArray1890 = new int[anInt1867];
		if (var11)
			aByteArray1856 = new byte[anInt1867];

		if (var4)
			aByteArray1888 = new byte[anInt1867];

		if (var5)
			aByteArray1869 = new byte[anInt1867];

		if (var7)
			anIntArray1876 = new int[anInt1867];

		if (var6)
			aShortArray1861 = new short[anInt1867];

		if (var3)
			aByteArray1849 = new byte[anInt1867];

		aShortArray1860 = new short[anInt1867];
		if (anInt1870 > 0) {
			aByteArray1872 = new byte[anInt1870];
			aShortArray1865 = new short[anInt1870];
			aShortArray1852 = new short[anInt1870];
			aShortArray1884 = new short[anInt1870];
			aShortArray1868 = new short[anInt1870];
			aShortArray1858 = new short[anInt1870];
			aShortArray1894 = new short[anInt1870];
			aShortArray1871 = new short[anInt1870];
			aByteArray1874 = new byte[anInt1870];
			aShortArray1892 = new short[anInt1870];
			aShortArray1864 = new short[anInt1870];
		}

		anInt1850 = 0;
		anInt1867 = 0;
		anInt1870 = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var8 = var1[var10];
			if (var8 != null) {
				int var9;
				for (var9 = 0; var9 < var8.anInt1867; ++var9) {
					if (var11 && (var8.aByteArray1856 != null))
						aByteArray1856[anInt1867] = var8.aByteArray1856[var9];

					if (var4)
						if (var8.aByteArray1888 != null)
							aByteArray1888[anInt1867] = var8.aByteArray1888[var9];
						else
							aByteArray1888[anInt1867] = var8.aByte1862;

					if (var5 && (var8.aByteArray1869 != null))
						aByteArray1869[anInt1867] = var8.aByteArray1869[var9];

					if (var7 && (var8.anIntArray1876 != null))
						anIntArray1876[anInt1867] = var8.anIntArray1876[var9];

					if (var6)
						if (var8.aShortArray1861 != null)
							aShortArray1861[anInt1867] = var8.aShortArray1861[var9];
						else
							aShortArray1861[anInt1867] = -1;

					if (var3)
						if ((var8.aByteArray1849 != null) && (var8.aByteArray1849[var9] != -1))
							aByteArray1849[anInt1867] = (byte) (var8.aByteArray1849[var9] + anInt1870);
						else
							aByteArray1849[anInt1867] = -1;

					aShortArray1860[anInt1867] = var8.aShortArray1860[var9];
					anIntArray1853[anInt1867] = method1006(var8, var8.anIntArray1853[var9]);
					anIntArray1854[anInt1867] = method1006(var8, var8.anIntArray1854[var9]);
					anIntArray1890[anInt1867] = method1006(var8, var8.anIntArray1890[var9]);
					++anInt1867;
				}

				for (var9 = 0; var9 < var8.anInt1870; ++var9) {
					final byte var12 = aByteArray1872[anInt1870] = var8.aByteArray1872[var9];
					if (var12 == 0) {
						aShortArray1865[anInt1870] = (short) method1006(var8, var8.aShortArray1865[var9]);
						aShortArray1852[anInt1870] = (short) method1006(var8, var8.aShortArray1852[var9]);
						aShortArray1884[anInt1870] = (short) method1006(var8, var8.aShortArray1884[var9]);
					}

					if ((var12 >= 1) && (var12 <= 3)) {
						aShortArray1865[anInt1870] = var8.aShortArray1865[var9];
						aShortArray1852[anInt1870] = var8.aShortArray1852[var9];
						aShortArray1884[anInt1870] = var8.aShortArray1884[var9];
						aShortArray1868[anInt1870] = var8.aShortArray1868[var9];
						aShortArray1858[anInt1870] = var8.aShortArray1858[var9];
						aShortArray1894[anInt1870] = var8.aShortArray1894[var9];
						aShortArray1871[anInt1870] = var8.aShortArray1871[var9];
						aByteArray1874[anInt1870] = var8.aByteArray1874[var9];
						aShortArray1892[anInt1870] = var8.aShortArray1892[var9];
					}

					if (var12 == 2)
						aShortArray1864[anInt1870] = var8.aShortArray1864[var9];

					++anInt1870;
				}
			}
		}

	}

	public void method986(final int var1) {
		final int var2 = anIntArray1893[var1];
		final int var3 = anIntArray1859[var1];

		for (int var4 = 0; var4 < anInt1850; ++var4) {
			final int var5 = ((anIntArray1851[var4] * var2) + (anIntArray1855[var4] * var3)) >> 16;
			anIntArray1851[var4] = ((anIntArray1851[var4] * var3) - (anIntArray1855[var4] * var2)) >> 16;
			anIntArray1855[var4] = var5;
		}

		method995();
	}

	public Class109_Sub21_Sub15_Sub7(final Class109_Sub21_Sub15_Sub7 var1, final boolean var2, final boolean var3,
			final boolean var4, final boolean var5) {
		anInt1850 = var1.anInt1850;
		anInt1867 = var1.anInt1867;
		anInt1870 = var1.anInt1870;
		int var6;
		if (var2) {
			anIntArray1855 = var1.anIntArray1855;
			anIntArray1857 = var1.anIntArray1857;
			anIntArray1851 = var1.anIntArray1851;
		} else {
			anIntArray1855 = new int[anInt1850];
			anIntArray1857 = new int[anInt1850];
			anIntArray1851 = new int[anInt1850];

			for (var6 = 0; var6 < anInt1850; ++var6) {
				anIntArray1855[var6] = var1.anIntArray1855[var6];
				anIntArray1857[var6] = var1.anIntArray1857[var6];
				anIntArray1851[var6] = var1.anIntArray1851[var6];
			}
		}

		if (var3)
			aShortArray1860 = var1.aShortArray1860;
		else {
			aShortArray1860 = new short[anInt1867];

			for (var6 = 0; var6 < anInt1867; ++var6)
				aShortArray1860[var6] = var1.aShortArray1860[var6];
		}

		if (!var4 && (var1.aShortArray1861 != null)) {
			aShortArray1861 = new short[anInt1867];

			for (var6 = 0; var6 < anInt1867; ++var6)
				aShortArray1861[var6] = var1.aShortArray1861[var6];
		} else
			aShortArray1861 = var1.aShortArray1861;

		aByteArray1869 = var1.aByteArray1869;
		anIntArray1853 = var1.anIntArray1853;
		anIntArray1854 = var1.anIntArray1854;
		anIntArray1890 = var1.anIntArray1890;
		aByteArray1856 = var1.aByteArray1856;
		aByteArray1888 = var1.aByteArray1888;
		aByteArray1849 = var1.aByteArray1849;
		aByte1862 = var1.aByte1862;
		aByteArray1872 = var1.aByteArray1872;
		aShortArray1865 = var1.aShortArray1865;
		aShortArray1852 = var1.aShortArray1852;
		aShortArray1884 = var1.aShortArray1884;
		aShortArray1868 = var1.aShortArray1868;
		aShortArray1858 = var1.aShortArray1858;
		aShortArray1894 = var1.aShortArray1894;
		aShortArray1871 = var1.aShortArray1871;
		aByteArray1874 = var1.aByteArray1874;
		aShortArray1892 = var1.aShortArray1892;
		aShortArray1864 = var1.aShortArray1864;
		anIntArray1875 = var1.anIntArray1875;
		anIntArray1876 = var1.anIntArray1876;
		anIntArrayArray1877 = var1.anIntArrayArray1877;
		anIntArrayArray1878 = var1.anIntArrayArray1878;
		aClass19Array1880 = var1.aClass19Array1880;
		aClass28Array1879 = var1.aClass28Array1879;
		aClass19Array1881 = var1.aClass19Array1881;
		aShort1882 = var1.aShort1882;
		aShort1883 = var1.aShort1883;
	}

	public Class109_Sub21_Sub15_Sub7 method987() {
		final Class109_Sub21_Sub15_Sub7 var1 = new Class109_Sub21_Sub15_Sub7();
		if (aByteArray1856 != null) {
			var1.aByteArray1856 = new byte[anInt1867];

			for (int var2 = 0; var2 < anInt1867; ++var2)
				var1.aByteArray1856[var2] = aByteArray1856[var2];
		}

		var1.anInt1850 = anInt1850;
		var1.anInt1867 = anInt1867;
		var1.anInt1870 = anInt1870;
		var1.anIntArray1855 = anIntArray1855;
		var1.anIntArray1857 = anIntArray1857;
		var1.anIntArray1851 = anIntArray1851;
		var1.anIntArray1853 = anIntArray1853;
		var1.anIntArray1854 = anIntArray1854;
		var1.anIntArray1890 = anIntArray1890;
		var1.aByteArray1888 = aByteArray1888;
		var1.aByteArray1869 = aByteArray1869;
		var1.aByteArray1849 = aByteArray1849;
		var1.aShortArray1860 = aShortArray1860;
		var1.aShortArray1861 = aShortArray1861;
		var1.aByte1862 = aByte1862;
		var1.aByteArray1872 = aByteArray1872;
		var1.aShortArray1865 = aShortArray1865;
		var1.aShortArray1852 = aShortArray1852;
		var1.aShortArray1884 = aShortArray1884;
		var1.aShortArray1868 = aShortArray1868;
		var1.aShortArray1858 = aShortArray1858;
		var1.aShortArray1894 = aShortArray1894;
		var1.aShortArray1871 = aShortArray1871;
		var1.aByteArray1874 = aByteArray1874;
		var1.aShortArray1892 = aShortArray1892;
		var1.aShortArray1864 = aShortArray1864;
		var1.anIntArray1875 = anIntArray1875;
		var1.anIntArray1876 = anIntArray1876;
		var1.anIntArrayArray1877 = anIntArrayArray1877;
		var1.anIntArrayArray1878 = anIntArrayArray1878;
		var1.aClass19Array1880 = aClass19Array1880;
		var1.aClass28Array1879 = aClass28Array1879;
		var1.aShort1882 = aShort1882;
		var1.aShort1883 = aShort1883;
		return var1;
	}

	public Class109_Sub21_Sub15_Sub7 method988(final int[][] var1, final int var2, final int var3, final int var4,
			final boolean var5, final int var6) {
		method996();
		int var10 = var2 + anInt1886;
		int var11 = var2 + anInt1887;
		int var9 = var4 + anInt1889;
		int var14 = var4 + anInt1873;
		if ((var10 >= 0) && (((var11 + 128) >> 7) < var1.length) && (var9 >= 0)
				&& (((var14 + 128) >> 7) < var1[0].length)) {
			var10 >>= 7;
			var11 = (var11 + 127) >> 7;
			var9 >>= 7;
			var14 = (var14 + 127) >> 7;
			if ((var1[var10][var9] == var3) && (var1[var11][var9] == var3) && (var1[var10][var14] == var3)
					&& (var1[var11][var14] == var3))
				return this;
			else {
				final Class109_Sub21_Sub15_Sub7 var8 = new Class109_Sub21_Sub15_Sub7();
				var8.anInt1850 = anInt1850;
				var8.anInt1867 = anInt1867;
				var8.anInt1870 = anInt1870;
				var8.anIntArray1855 = anIntArray1855;
				var8.anIntArray1851 = anIntArray1851;
				var8.anIntArray1853 = anIntArray1853;
				var8.anIntArray1854 = anIntArray1854;
				var8.anIntArray1890 = anIntArray1890;
				var8.aByteArray1856 = aByteArray1856;
				var8.aByteArray1888 = aByteArray1888;
				var8.aByteArray1869 = aByteArray1869;
				var8.aByteArray1849 = aByteArray1849;
				var8.aShortArray1860 = aShortArray1860;
				var8.aShortArray1861 = aShortArray1861;
				var8.aByte1862 = aByte1862;
				var8.aByteArray1872 = aByteArray1872;
				var8.aShortArray1865 = aShortArray1865;
				var8.aShortArray1852 = aShortArray1852;
				var8.aShortArray1884 = aShortArray1884;
				var8.aShortArray1868 = aShortArray1868;
				var8.aShortArray1858 = aShortArray1858;
				var8.aShortArray1894 = aShortArray1894;
				var8.aShortArray1871 = aShortArray1871;
				var8.aByteArray1874 = aByteArray1874;
				var8.aShortArray1892 = aShortArray1892;
				var8.aShortArray1864 = aShortArray1864;
				var8.anIntArray1875 = anIntArray1875;
				var8.anIntArray1876 = anIntArray1876;
				var8.anIntArrayArray1877 = anIntArrayArray1877;
				var8.anIntArrayArray1878 = anIntArrayArray1878;
				var8.aShort1882 = aShort1882;
				var8.aShort1883 = aShort1883;
				var8.anIntArray1857 = new int[var8.anInt1850];
				int var7;
				int var12;
				int var13;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0)
					for (var7 = 0; var7 < var8.anInt1850; ++var7) {
						var18 = anIntArray1855[var7] + var2;
						var12 = anIntArray1851[var7] + var4;
						var19 = var18 & 127;
						var13 = var12 & 127;
						var20 = var18 >> 7;
						var21 = var12 >> 7;
						var16 = ((var1[var20][var21] * (128 - var19)) + (var1[var20 + 1][var21] * var19)) >> 7;
						var17 = ((var1[var20][var21 + 1] * (128 - var19)) + (var1[var20 + 1][var21 + 1] * var19)) >> 7;
						var15 = ((var16 * (128 - var13)) + (var17 * var13)) >> 7;
						var8.anIntArray1857[var7] = (anIntArray1857[var7] + var15) - var3;
					}
				else
					for (var7 = 0; var7 < var8.anInt1850; ++var7) {
						var18 = (-anIntArray1857[var7] << 16) / anInt1576;
						if (var18 < var6) {
							var12 = anIntArray1855[var7] + var2;
							var19 = anIntArray1851[var7] + var4;
							var13 = var12 & 127;
							var20 = var19 & 127;
							var21 = var12 >> 7;
							var16 = var19 >> 7;
							var17 = ((var1[var21][var16] * (128 - var13)) + (var1[var21 + 1][var16] * var13)) >> 7;
							var15 = ((var1[var21][var16 + 1] * (128 - var13))
									+ (var1[var21 + 1][var16 + 1] * var13)) >> 7;
							final int var22 = ((var17 * (128 - var20)) + (var15 * var20)) >> 7;
							var8.anIntArray1857[var7] = anIntArray1857[var7]
									+ (((var22 - var3) * (var6 - var18)) / var6);
						}
					}

				var8.method995();
				return var8;
			}
		} else
			return this;
	}

	public void method989() {
		for (int var1 = 0; var1 < anInt1850; ++var1) {
			final int var2 = anIntArray1855[var1];
			anIntArray1855[var1] = anIntArray1851[var1];
			anIntArray1851[var1] = -var2;
		}

		method995();
	}

	public void method990() {
		for (int var1 = 0; var1 < anInt1850; ++var1) {
			anIntArray1855[var1] = -anIntArray1855[var1];
			anIntArray1851[var1] = -anIntArray1851[var1];
		}

		method995();
	}

	public void method991() {
		for (int var1 = 0; var1 < anInt1850; ++var1) {
			final int var2 = anIntArray1851[var1];
			anIntArray1851[var1] = anIntArray1855[var1];
			anIntArray1855[var1] = -var2;
		}

		method995();
	}

	public void method992(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1850; ++var4) {
			anIntArray1855[var4] += var1;
			anIntArray1857[var4] += var2;
			anIntArray1851[var4] += var3;
		}

		method995();
	}

	public void method993(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1850; ++var4) {
			anIntArray1855[var4] = (anIntArray1855[var4] * var1) / 128;
			anIntArray1857[var4] = (anIntArray1857[var4] * var2) / 128;
			anIntArray1851[var4] = (anIntArray1851[var4] * var3) / 128;
		}

		method995();
	}

	public void method994() {
		if (aClass19Array1880 == null) {
			aClass19Array1880 = new Class19[anInt1850];

			int var1;
			for (var1 = 0; var1 < anInt1850; ++var1)
				aClass19Array1880[var1] = new Class19();

			for (var1 = 0; var1 < anInt1867; ++var1) {
				final int var5 = anIntArray1853[var1];
				final int var8 = anIntArray1854[var1];
				final int var4 = anIntArray1890[var1];
				final int var9 = anIntArray1855[var8] - anIntArray1855[var5];
				final int var13 = anIntArray1857[var8] - anIntArray1857[var5];
				final int var10 = anIntArray1851[var8] - anIntArray1851[var5];
				final int var11 = anIntArray1855[var4] - anIntArray1855[var5];
				final int var6 = anIntArray1857[var4] - anIntArray1857[var5];
				final int var12 = anIntArray1851[var4] - anIntArray1851[var5];
				int var7 = (var13 * var12) - (var6 * var10);
				int var3 = (var10 * var11) - (var12 * var9);

				int var14;
				for (var14 = (var9 * var6) - (var11 * var13); (var7 > 8192) || (var3 > 8192) || (var14 > 8192)
						|| (var7 < -8192) || (var3 < -8192) || (var14 < -8192); var14 >>= 1) {
					var7 >>= 1;
					var3 >>= 1;
				}

				int var15 = (int) Math.sqrt((var7 * var7) + (var3 * var3) + (var14 * var14));
				if (var15 <= 0)
					var15 = 1;

				var7 = (var7 * 256) / var15;
				var3 = (var3 * 256) / var15;
				var14 = (var14 * 256) / var15;
				byte var16;
				if (aByteArray1856 == null)
					var16 = 0;
				else
					var16 = aByteArray1856[var1];

				if (var16 == 0) {
					Class19 var2 = aClass19Array1880[var5];
					var2.anInt184 += var7;
					var2.anInt183 += var3;
					var2.anInt180 += var14;
					++var2.anInt181;
					var2 = aClass19Array1880[var8];
					var2.anInt184 += var7;
					var2.anInt183 += var3;
					var2.anInt180 += var14;
					++var2.anInt181;
					var2 = aClass19Array1880[var4];
					var2.anInt184 += var7;
					var2.anInt183 += var3;
					var2.anInt180 += var14;
					++var2.anInt181;
				} else if (var16 == 1) {
					if (aClass28Array1879 == null)
						aClass28Array1879 = new Class28[anInt1867];

					final Class28 var17 = aClass28Array1879[var1] = new Class28();
					var17.anInt262 = var7;
					var17.anInt263 = var3;
					var17.anInt264 = var14;
				}
			}

		}
	}

	void method995() {
		aClass19Array1880 = null;
		aClass19Array1881 = null;
		aClass28Array1879 = null;
		aBool1848 = false;
	}

	void method996() {
		if (!aBool1848) {
			anInt1576 = 0;
			anInt1885 = 0;
			anInt1886 = 999999;
			anInt1887 = -999999;
			anInt1873 = -99999;
			anInt1889 = 99999;

			for (int var2 = 0; var2 < anInt1850; ++var2) {
				final int var3 = anIntArray1855[var2];
				final int var4 = anIntArray1857[var2];
				final int var1 = anIntArray1851[var2];
				if (var3 < anInt1886)
					anInt1886 = var3;

				if (var3 > anInt1887)
					anInt1887 = var3;

				if (var1 < anInt1889)
					anInt1889 = var1;

				if (var1 > anInt1873)
					anInt1873 = var1;

				if (-var4 > anInt1576)
					anInt1576 = -var4;

				if (var4 > anInt1885)
					anInt1885 = var4;
			}

			aBool1848 = true;
		}
	}

	static void method997(final Class109_Sub21_Sub15_Sub7 var0, final Class109_Sub21_Sub15_Sub7 var1, final int var2,
			final int var3, final int var4, final boolean var5) {
		var0.method996();
		var0.method994();
		var1.method996();
		var1.method994();
		++anInt1866;
		int var8 = 0;
		final int[] var14 = var1.anIntArray1855;
		final int var16 = var1.anInt1850;

		int var9;
		for (var9 = 0; var9 < var0.anInt1850; ++var9) {
			final Class19 var11 = var0.aClass19Array1880[var9];
			if (var11.anInt181 != 0) {
				final int var10 = var0.anIntArray1857[var9] - var3;
				if (var10 <= var1.anInt1885) {
					final int var12 = var0.anIntArray1855[var9] - var2;
					if ((var12 >= var1.anInt1886) && (var12 <= var1.anInt1887)) {
						final int var13 = var0.anIntArray1851[var9] - var4;
						if ((var13 >= var1.anInt1889) && (var13 <= var1.anInt1873))
							for (int var15 = 0; var15 < var16; ++var15) {
								final Class19 var7 = var1.aClass19Array1880[var15];
								if ((var12 == var14[var15]) && (var13 == var1.anIntArray1851[var15])
										&& (var10 == var1.anIntArray1857[var15]) && (var7.anInt181 != 0)) {
									if (var0.aClass19Array1881 == null)
										var0.aClass19Array1881 = new Class19[var0.anInt1850];

									if (var1.aClass19Array1881 == null)
										var1.aClass19Array1881 = new Class19[var16];

									Class19 var6 = var0.aClass19Array1881[var9];
									if (var6 == null)
										var6 = var0.aClass19Array1881[var9] = new Class19(var11);

									Class19 var17 = var1.aClass19Array1881[var15];
									if (var17 == null)
										var17 = var1.aClass19Array1881[var15] = new Class19(var7);

									var6.anInt184 += var7.anInt184;
									var6.anInt183 += var7.anInt183;
									var6.anInt180 += var7.anInt180;
									var6.anInt181 += var7.anInt181;
									var17.anInt184 += var11.anInt184;
									var17.anInt183 += var11.anInt183;
									var17.anInt180 += var11.anInt180;
									var17.anInt181 += var11.anInt181;
									++var8;
									anIntArray1863[var9] = anInt1866;
									anIntArray1891[var15] = anInt1866;
								}
							}
					}
				}
			}
		}

		if ((var8 >= 3) && var5) {
			for (var9 = 0; var9 < var0.anInt1867; ++var9)
				if ((anIntArray1863[var0.anIntArray1853[var9]] == anInt1866)
						&& (anIntArray1863[var0.anIntArray1854[var9]] == anInt1866)
						&& (anIntArray1863[var0.anIntArray1890[var9]] == anInt1866)) {
					if (var0.aByteArray1856 == null)
						var0.aByteArray1856 = new byte[var0.anInt1867];

					var0.aByteArray1856[var9] = 2;
				}

			for (var9 = 0; var9 < var1.anInt1867; ++var9)
				if ((anIntArray1891[var1.anIntArray1853[var9]] == anInt1866)
						&& (anIntArray1891[var1.anIntArray1854[var9]] == anInt1866)
						&& (anIntArray1891[var1.anIntArray1890[var9]] == anInt1866)) {
					if (var1.aByteArray1856 == null)
						var1.aByteArray1856 = new byte[var1.anInt1867];

					var1.aByteArray1856[var9] = 2;
				}

		}
	}

	void method998(final byte[] var1) {
		boolean var2 = false;
		boolean var31 = false;
		final DataBuffer var13 = new DataBuffer(var1);
		final DataBuffer var6 = new DataBuffer(var1);
		final DataBuffer var3 = new DataBuffer(var1);
		final DataBuffer var37 = new DataBuffer(var1);
		final DataBuffer var38 = new DataBuffer(var1);
		var13.position = var1.length - 18;
		final int var7 = var13.method566();
		final int var5 = var13.method566();
		final int var11 = var13.method564();
		final int var30 = var13.method564();
		final int var24 = var13.method564();
		final int var14 = var13.method564();
		final int var26 = var13.method564();
		final int var16 = var13.method564();
		final int var9 = var13.method566();
		final int var15 = var13.method566();
		final int var18 = var13.method566();
		final int var33 = var13.method566();
		final byte var4 = 0;
		int var45 = var4 + var7;
		final int var22 = var45;
		var45 += var5;
		final int var23 = var45;
		if (var24 == 255)
			var45 += var5;

		final int var25 = var45;
		if (var26 == 1)
			var45 += var5;

		final int var27 = var45;
		if (var30 == 1)
			var45 += var5;

		final int var39 = var45;
		if (var16 == 1)
			var45 += var7;

		final int var28 = var45;
		if (var14 == 1)
			var45 += var5;

		final int var35 = var45;
		var45 += var33;
		final int var34 = var45;
		var45 += var5 * 2;
		final int var19 = var45;
		var45 += var11 * 6;
		final int var21 = var45;
		var45 += var9;
		final int var17 = var45;
		var45 += var15;
		anInt1850 = var7;
		anInt1867 = var5;
		anInt1870 = var11;
		anIntArray1855 = new int[var7];
		anIntArray1857 = new int[var7];
		anIntArray1851 = new int[var7];
		anIntArray1853 = new int[var5];
		anIntArray1854 = new int[var5];
		anIntArray1890 = new int[var5];
		if (var11 > 0) {
			aByteArray1872 = new byte[var11];
			aShortArray1865 = new short[var11];
			aShortArray1852 = new short[var11];
			aShortArray1884 = new short[var11];
		}

		if (var16 == 1)
			anIntArray1875 = new int[var7];

		if (var30 == 1) {
			aByteArray1856 = new byte[var5];
			aByteArray1849 = new byte[var5];
			aShortArray1861 = new short[var5];
		}

		if (var24 == 255)
			aByteArray1888 = new byte[var5];
		else
			aByte1862 = (byte) var24;

		if (var14 == 1)
			aByteArray1869 = new byte[var5];

		if (var26 == 1)
			anIntArray1876 = new int[var5];

		aShortArray1860 = new short[var5];
		var13.position = var4;
		var6.position = var21;
		var3.position = var17;
		var37.position = var45;
		var38.position = var39;
		int var43 = 0;
		int var40 = 0;
		int var41 = 0;

		int var8;
		int var10;
		int var29;
		int var36;
		int var42;
		for (var8 = 0; var8 < var7; ++var8) {
			var29 = var13.method564();
			var42 = 0;
			if ((var29 & 1) != 0)
				var42 = var6.method573();

			var36 = 0;
			if ((var29 & 2) != 0)
				var36 = var3.method573();

			var10 = 0;
			if ((var29 & 4) != 0)
				var10 = var37.method573();

			anIntArray1855[var8] = var43 + var42;
			anIntArray1857[var8] = var40 + var36;
			anIntArray1851[var8] = var41 + var10;
			var43 = anIntArray1855[var8];
			var40 = anIntArray1857[var8];
			var41 = anIntArray1851[var8];
			if (var16 == 1)
				anIntArray1875[var8] = var38.method564();
		}

		var13.position = var34;
		var6.position = var27;
		var3.position = var23;
		var37.position = var28;
		var38.position = var25;

		for (var8 = 0; var8 < var5; ++var8) {
			aShortArray1860[var8] = (short) var13.method566();
			if (var30 == 1) {
				var29 = var6.method564();
				if ((var29 & 1) == 1) {
					aByteArray1856[var8] = 1;
					var2 = true;
				} else
					aByteArray1856[var8] = 0;

				if ((var29 & 2) == 2) {
					aByteArray1849[var8] = (byte) (var29 >> 2);
					aShortArray1861[var8] = aShortArray1860[var8];
					aShortArray1860[var8] = 127;
					if (aShortArray1861[var8] != -1)
						var31 = true;
				} else {
					aByteArray1849[var8] = -1;
					aShortArray1861[var8] = -1;
				}
			}

			if (var24 == 255)
				aByteArray1888[var8] = var3.method612();

			if (var14 == 1)
				aByteArray1869[var8] = var37.method612();

			if (var26 == 1)
				anIntArray1876[var8] = var38.method564();
		}

		var13.position = var35;
		var6.position = var22;
		var8 = 0;
		var29 = 0;
		var42 = 0;
		var36 = 0;

		int var12;
		int var44;
		for (var10 = 0; var10 < var5; ++var10) {
			var12 = var6.method564();
			if (var12 == 1) {
				var8 = var13.method573() + var36;
				var29 = var13.method573() + var8;
				var42 = var13.method573() + var29;
				var36 = var42;
				anIntArray1853[var10] = var8;
				anIntArray1854[var10] = var29;
				anIntArray1890[var10] = var42;
			}

			if (var12 == 2) {
				var29 = var42;
				var42 = var13.method573() + var36;
				var36 = var42;
				anIntArray1853[var10] = var8;
				anIntArray1854[var10] = var29;
				anIntArray1890[var10] = var42;
			}

			if (var12 == 3) {
				var8 = var42;
				var42 = var13.method573() + var36;
				var36 = var42;
				anIntArray1853[var10] = var8;
				anIntArray1854[var10] = var29;
				anIntArray1890[var10] = var42;
			}

			if (var12 == 4) {
				var44 = var8;
				var8 = var29;
				var29 = var44;
				var42 = var13.method573() + var36;
				var36 = var42;
				anIntArray1853[var10] = var8;
				anIntArray1854[var10] = var44;
				anIntArray1890[var10] = var42;
			}
		}

		var13.position = var19;

		for (var10 = 0; var10 < var11; ++var10) {
			aByteArray1872[var10] = 0;
			aShortArray1865[var10] = (short) var13.method566();
			aShortArray1852[var10] = (short) var13.method566();
			aShortArray1884[var10] = (short) var13.method566();
		}

		if (aByteArray1849 != null) {
			boolean var46 = false;

			for (var12 = 0; var12 < var5; ++var12) {
				var44 = aByteArray1849[var12] & 255;
				if (var44 != 255)
					if (((aShortArray1865[var44] & '\uffff') == anIntArray1853[var12])
							&& ((aShortArray1852[var44] & '\uffff') == anIntArray1854[var12])
							&& ((aShortArray1884[var44] & '\uffff') == anIntArray1890[var12]))
						aByteArray1849[var12] = -1;
					else
						var46 = true;
			}

			if (!var46)
				aByteArray1849 = null;
		}

		if (!var31)
			aShortArray1861 = null;

		if (!var2)
			aByteArray1856 = null;

	}

	static final int method999(int var0) {
		if (var0 < 2)
			var0 = 2;
		else if (var0 > 126)
			var0 = 126;

		return var0;
	}

	static {
		anIntArray1893 = Class109_Sub21_Sub14_Sub3.anIntArray1835;
		anIntArray1859 = Class109_Sub21_Sub14_Sub3.anIntArray1836;
	}

	public final Class109_Sub21_Sub15_Sub4 method1000(final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		method994();
		final int var12 = (int) Math.sqrt((var3 * var3) + (var4 * var4) + (var5 * var5));
		final int var13 = (var2 * var12) >> 8;
		final Class109_Sub21_Sub15_Sub4 var6 = new Class109_Sub21_Sub15_Sub4();
		var6.anIntArray1739 = new int[anInt1867];
		var6.anIntArray1753 = new int[anInt1867];
		var6.anIntArray1740 = new int[anInt1867];
		if ((anInt1870 > 0) && (aByteArray1849 != null)) {
			final int[] var8 = new int[anInt1870];

			int var11;
			for (var11 = 0; var11 < anInt1867; ++var11)
				if (aByteArray1849[var11] != -1)
					++var8[aByteArray1849[var11] & 255];

			var6.anInt1759 = 0;

			for (var11 = 0; var11 < anInt1870; ++var11)
				if ((var8[var11] > 0) && (aByteArray1872[var11] == 0))
					++var6.anInt1759;

			var6.anIntArray1758 = new int[var6.anInt1759];
			var6.anIntArray1747 = new int[var6.anInt1759];
			var6.anIntArray1726 = new int[var6.anInt1759];
			var11 = 0;

			int var7;
			for (var7 = 0; var7 < anInt1870; ++var7)
				if ((var8[var7] > 0) && (aByteArray1872[var7] == 0)) {
					var6.anIntArray1758[var11] = aShortArray1865[var7] & '\uffff';
					var6.anIntArray1747[var11] = aShortArray1852[var7] & '\uffff';
					var6.anIntArray1726[var11] = aShortArray1884[var7] & '\uffff';
					var8[var7] = var11++;
				} else
					var8[var7] = -1;

			var6.aByteArray1774 = new byte[anInt1867];

			for (var7 = 0; var7 < anInt1867; ++var7)
				if (aByteArray1849[var7] != -1)
					var6.aByteArray1774[var7] = (byte) var8[aByteArray1849[var7] & 255];
				else
					var6.aByteArray1774[var7] = -1;
		}

		for (int var9 = 0; var9 < anInt1867; ++var9) {
			byte var18;
			if (aByteArray1856 == null)
				var18 = 0;
			else
				var18 = aByteArray1856[var9];

			byte var17;
			if (aByteArray1869 == null)
				var17 = 0;
			else
				var17 = aByteArray1869[var9];

			short var14;
			if (aShortArray1861 == null)
				var14 = -1;
			else
				var14 = aShortArray1861[var9];

			if (var17 == -2)
				var18 = 3;

			if (var17 == -1)
				var18 = 2;

			Class19 var10;
			int var15;
			Class28 var19;
			if (var14 == -1) {
				if (var18 != 0) {
					if (var18 == 1) {
						var19 = aClass28Array1879[var9];
						var15 = var1 + (((var3 * var19.anInt262) + (var4 * var19.anInt263) + (var5 * var19.anInt264))
								/ (var13 + (var13 / 2)));
						var6.anIntArray1739[var9] = method1003(aShortArray1860[var9] & '\uffff', var15);
						var6.anIntArray1740[var9] = -1;
					} else if (var18 == 3) {
						var6.anIntArray1739[var9] = 128;
						var6.anIntArray1740[var9] = -1;
					} else
						var6.anIntArray1740[var9] = -2;
				} else {
					final int var16 = aShortArray1860[var9] & '\uffff';
					if ((aClass19Array1881 != null) && (aClass19Array1881[anIntArray1853[var9]] != null))
						var10 = aClass19Array1881[anIntArray1853[var9]];
					else
						var10 = aClass19Array1880[anIntArray1853[var9]];

					var15 = var1 + (((var3 * var10.anInt184) + (var4 * var10.anInt183) + (var5 * var10.anInt180))
							/ (var13 * var10.anInt181));
					var6.anIntArray1739[var9] = method1003(var16, var15);
					if ((aClass19Array1881 != null) && (aClass19Array1881[anIntArray1854[var9]] != null))
						var10 = aClass19Array1881[anIntArray1854[var9]];
					else
						var10 = aClass19Array1880[anIntArray1854[var9]];

					var15 = var1 + (((var3 * var10.anInt184) + (var4 * var10.anInt183) + (var5 * var10.anInt180))
							/ (var13 * var10.anInt181));
					var6.anIntArray1753[var9] = method1003(var16, var15);
					if ((aClass19Array1881 != null) && (aClass19Array1881[anIntArray1890[var9]] != null))
						var10 = aClass19Array1881[anIntArray1890[var9]];
					else
						var10 = aClass19Array1880[anIntArray1890[var9]];

					var15 = var1 + (((var3 * var10.anInt184) + (var4 * var10.anInt183) + (var5 * var10.anInt180))
							/ (var13 * var10.anInt181));
					var6.anIntArray1740[var9] = method1003(var16, var15);
				}
			} else if (var18 != 0) {
				if (var18 == 1) {
					var19 = aClass28Array1879[var9];
					var15 = var1 + (((var3 * var19.anInt262) + (var4 * var19.anInt263) + (var5 * var19.anInt264))
							/ (var13 + (var13 / 2)));
					var6.anIntArray1739[var9] = method999(var15);
					var6.anIntArray1740[var9] = -1;
				} else
					var6.anIntArray1740[var9] = -2;
			} else {
				if ((aClass19Array1881 != null) && (aClass19Array1881[anIntArray1853[var9]] != null))
					var10 = aClass19Array1881[anIntArray1853[var9]];
				else
					var10 = aClass19Array1880[anIntArray1853[var9]];

				var15 = var1 + (((var3 * var10.anInt184) + (var4 * var10.anInt183) + (var5 * var10.anInt180))
						/ (var13 * var10.anInt181));
				var6.anIntArray1739[var9] = method999(var15);
				if ((aClass19Array1881 != null) && (aClass19Array1881[anIntArray1854[var9]] != null))
					var10 = aClass19Array1881[anIntArray1854[var9]];
				else
					var10 = aClass19Array1880[anIntArray1854[var9]];

				var15 = var1 + (((var3 * var10.anInt184) + (var4 * var10.anInt183) + (var5 * var10.anInt180))
						/ (var13 * var10.anInt181));
				var6.anIntArray1753[var9] = method999(var15);
				if ((aClass19Array1881 != null) && (aClass19Array1881[anIntArray1890[var9]] != null))
					var10 = aClass19Array1881[anIntArray1890[var9]];
				else
					var10 = aClass19Array1880[anIntArray1890[var9]];

				var15 = var1 + (((var3 * var10.anInt184) + (var4 * var10.anInt183) + (var5 * var10.anInt180))
						/ (var13 * var10.anInt181));
				var6.anIntArray1740[var9] = method999(var15);
			}
		}

		method1004();
		var6.anInt1730 = anInt1850;
		var6.anIntArray1731 = anIntArray1855;
		var6.anIntArray1765 = anIntArray1857;
		var6.anIntArray1728 = anIntArray1851;
		var6.anInt1734 = anInt1867;
		var6.anIntArray1735 = anIntArray1853;
		var6.anIntArray1736 = anIntArray1854;
		var6.anIntArray1737 = anIntArray1890;
		var6.aByteArray1741 = aByteArray1888;
		var6.aByteArray1769 = aByteArray1869;
		var6.aByte1744 = aByte1862;
		var6.anIntArrayArray1749 = anIntArrayArray1877;
		var6.anIntArrayArray1750 = anIntArrayArray1878;
		var6.aShortArray1751 = aShortArray1861;
		return var6;
	}

	public void method1001(final short var1, final short var2) {
		if (aShortArray1861 != null)
			for (int var3 = 0; var3 < anInt1867; ++var3)
				if (aShortArray1861[var3] == var1)
					aShortArray1861[var3] = var2;
	}

	public void method1002(final short var1, final short var2) {
		for (int var3 = 0; var3 < anInt1867; ++var3)
			if (aShortArray1860[var3] == var1)
				aShortArray1860[var3] = var2;

	}

	static final int method1003(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	void method1004() {
		int var1;
		int var2;
		int var3;
		int[] var4;
		if (anIntArray1875 != null) {
			var4 = new int[256];
			var1 = 0;

			for (var2 = 0; var2 < anInt1850; ++var2) {
				var3 = anIntArray1875[var2];
				++var4[var3];
				if (var3 > var1)
					var1 = var3;
			}

			anIntArrayArray1877 = new int[var1 + 1][];

			for (var2 = 0; var2 <= var1; ++var2) {
				anIntArrayArray1877[var2] = new int[var4[var2]];
				var4[var2] = 0;
			}

			for (var2 = 0; var2 < anInt1850; anIntArrayArray1877[var3][var4[var3]++] = var2++)
				var3 = anIntArray1875[var2];

			anIntArray1875 = null;
		}

		if (anIntArray1876 != null) {
			var4 = new int[256];
			var1 = 0;

			for (var2 = 0; var2 < anInt1867; ++var2) {
				var3 = anIntArray1876[var2];
				++var4[var3];
				if (var3 > var1)
					var1 = var3;
			}

			anIntArrayArray1878 = new int[var1 + 1][];

			for (var2 = 0; var2 <= var1; ++var2) {
				anIntArrayArray1878[var2] = new int[var4[var2]];
				var4[var2] = 0;
			}

			for (var2 = 0; var2 < anInt1867; anIntArrayArray1878[var3][var4[var3]++] = var2++)
				var3 = anIntArray1876[var2];

			anIntArray1876 = null;
		}

	}

	public void method1005() {
		int var1;
		for (var1 = 0; var1 < anInt1850; ++var1)
			anIntArray1851[var1] = -anIntArray1851[var1];

		for (var1 = 0; var1 < anInt1867; ++var1) {
			final int var2 = anIntArray1853[var1];
			anIntArray1853[var1] = anIntArray1890[var1];
			anIntArray1890[var1] = var2;
		}

		method995();
	}

	final int method1006(final Class109_Sub21_Sub15_Sub7 var1, final int var2) {
		int var3 = -1;
		final int var4 = var1.anIntArray1855[var2];
		final int var6 = var1.anIntArray1857[var2];
		final int var7 = var1.anIntArray1851[var2];

		for (int var5 = 0; var5 < anInt1850; ++var5)
			if ((var4 == anIntArray1855[var5]) && (var6 == anIntArray1857[var5]) && (var7 == anIntArray1851[var5])) {
				var3 = var5;
				break;
			}

		if (var3 == -1) {
			anIntArray1855[anInt1850] = var4;
			anIntArray1857[anInt1850] = var6;
			anIntArray1851[anInt1850] = var7;
			if (var1.anIntArray1875 != null)
				anIntArray1875[anInt1850] = var1.anIntArray1875[var2];

			var3 = anInt1850++;
		}

		return var3;
	}

	Class109_Sub21_Sub15_Sub7() {
	}
}
