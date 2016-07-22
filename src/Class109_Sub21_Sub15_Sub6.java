import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class109_Sub21_Sub15_Sub6 extends Class109_Sub21_Sub15 {
	static Class109_Sub20 aClass109_Sub20_1837;
	static Class104_Sub1 aClass104_Sub1_1847;
	int anInt1845;
	int anInt1844;
	int anInt1838;
	int anInt1839;
	int anInt1840;
	int anInt1841;
	Class109_Sub21_Sub7 aClass109_Sub21_Sub7_1842;
	int anInt1846;
	int anInt1843;

	static final void method978(final String var0) {
		if (null != var0)
			if (((client.anInt2237 < 200) || (client.anInt2154 == 1)) && (client.anInt2237 < 400)) {
				final String var3 = Class6.method39(var0, Class95.aClass113_708);
				if (null != var3) {
					int var1;
					String var4;
					String var5;
					for (var1 = 0; var1 < client.anInt2237; ++var1) {
						final Class33 var2 = client.aClass33Array2239[var1];
						var4 = Class6.method39(var2.aString317, Class95.aClass113_708);
						if ((null != var4) && var4.equals(var3)) {
							Applet_Sub1.method1053(30, "", var0 + " is already on your friend list");
							return;
						}

						if (var2.aString318 != null) {
							var5 = Class6.method39(var2.aString318, Class95.aClass113_708);
							if ((var5 != null) && var5.equals(var3)) {
								Applet_Sub1.method1053(30, "", var0 + " is already on your friend list");
								return;
							}
						}
					}

					for (var1 = 0; var1 < client.anInt2132; ++var1) {
						final Class36 var8 = client.aClass36Array2242[var1];
						var4 = Class6.method39(var8.aString338, Class95.aClass113_708);
						if ((var4 != null) && var4.equals(var3)) {
							Applet_Sub1.method1053(30, "", "Please remove " + var0 + " from your ignore list first");
							return;
						}

						if (var8.aString337 != null) {
							var5 = Class6.method39(var8.aString337, Class95.aClass113_708);
							if ((null != var5) && var5.equals(var3)) {
								Applet_Sub1.method1053(30, "",
										"Please remove " + var0 + " from your ignore list first");
								return;
							}
						}
					}

					if (Class6.method39(Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aString1931,
							Class95.aClass113_708).equals(var3))
						Applet_Sub1.method1053(30, "", "You can\'t add yourself to your own friend list");
					else {
						client.secureBuffer.method840(128);
						final Class109_Sub14_Sub1 var6 = client.secureBuffer;
						final int var7 = var0.length() + 1;
						var6.writeByte(var7);
						client.secureBuffer.writeString(var0);
					}
				}
			} else
				Applet_Sub1.method1053(30, "",
						"Your friend list is full. Max of 200 for free users, and 400 for members");
	}

	public static void method979(final String var0, final boolean var1, final boolean var2) {
		Class49.method248(var0, var1, "openjs", var2);
	}

	Class109_Sub21_Sub15_Sub6(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final boolean var8, final Class109_Sub21_Sub15 var9) {
		anInt1845 = var1;
		anInt1844 = var2;
		anInt1838 = var3;
		anInt1839 = var4;
		anInt1840 = var5;
		anInt1841 = var6;
		if (var7 != -1) {
			aClass109_Sub21_Sub7_1842 = Class109_Sub21_Sub18.method849(var7, -555118487);
			anInt1846 = 0;
			anInt1843 = client.anInt1979 - 1;
			if ((aClass109_Sub21_Sub7_1842.anInt1404 == 0) && (null != var9)
					&& (var9 instanceof Class109_Sub21_Sub15_Sub6)) {
				final Class109_Sub21_Sub15_Sub6 var10 = (Class109_Sub21_Sub15_Sub6) var9;
				if (var10.aClass109_Sub21_Sub7_1842 == aClass109_Sub21_Sub7_1842) {
					anInt1846 = var10.anInt1846;
					anInt1843 = var10.anInt1843;
					return;
				}
			}

			if (var8 && (aClass109_Sub21_Sub7_1842.anInt1395 != -1)) {
				anInt1846 = (int) (Math.random() * aClass109_Sub21_Sub7_1842.anIntArray1401.length);
				anInt1843 -= (int) (Math.random() * aClass109_Sub21_Sub7_1842.anIntArray1396[anInt1846]);
			}
		}

	}

	public static Class89[] method980() {
		return new Class89[] { Class89.aClass89_675, Class89.aClass89_681, Class89.aClass89_673, Class89.aClass89_676,
				Class89.aClass89_679 };
	}

	@Override
	protected final Class109_Sub21_Sub15_Sub4 method827(final byte var1) {
		if (aClass109_Sub21_Sub7_1842 != null) {
			int var5 = client.anInt1979 - anInt1843;
			if ((var5 > 100) && (aClass109_Sub21_Sub7_1842.anInt1395 > 0))
				var5 = 100;

			label63: {
				do {
					do {
						if (var5 <= aClass109_Sub21_Sub7_1842.anIntArray1396[anInt1846])
							break label63;

						var5 -= aClass109_Sub21_Sub7_1842.anIntArray1396[anInt1846];
						++anInt1846;
					} while (anInt1846 < aClass109_Sub21_Sub7_1842.anIntArray1401.length);

					anInt1846 -= aClass109_Sub21_Sub7_1842.anInt1395;
				} while ((anInt1846 >= 0) && (anInt1846 < aClass109_Sub21_Sub7_1842.anIntArray1401.length));

				aClass109_Sub21_Sub7_1842 = null;
			}

			anInt1843 = client.anInt1979 - var5;
		}

		Class109_Sub21_Sub10 var6 = Class28.method128(anInt1845);
		if (null != var6.anIntArray1464)
			var6 = var6.method732();

		if (null == var6)
			return null;
		else {
			int var3;
			int var7;
			if ((anInt1838 != 1) && (anInt1838 != 3)) {
				var7 = var6.anInt1440;
				var3 = var6.anInt1435;
			} else {
				var7 = var6.anInt1435;
				var3 = var6.anInt1440;
			}

			final int var8 = anInt1840 + (var7 >> 1);
			final int var9 = anInt1840 + ((var7 + 1) >> 1);
			final int var10 = anInt1841 + (var3 >> 1);
			final int var11 = ((1 + var3) >> 1) + anInt1841;
			final int[][] var2 = Class27.anIntArrayArrayArray251[anInt1839];
			final int var12 = (var2[var9][var11] + var2[var8][var11] + var2[var8][var10] + var2[var9][var10]) >> 2;
			final int var13 = (var7 << 6) + (anInt1840 << 7);
			final int var4 = (var3 << 6) + (anInt1841 << 7);
			return var6.method728(anInt1844, anInt1838, var2, var13, var12, var4, aClass109_Sub21_Sub7_1842, anInt1846);
		}
	}

	static String method981(Throwable var0) throws IOException {
		String var8;
		if (var0 instanceof RuntimeException_Sub1) {
			final RuntimeException_Sub1 var7 = (RuntimeException_Sub1) var0;
			var8 = var7.aString1898 + " | ";
			var0 = var7.aThrowable1896;
		} else
			var8 = "";

		final StringWriter var12 = new StringWriter();
		final PrintWriter var9 = new PrintWriter(var12);
		var0.printStackTrace(var9);
		var9.close();
		final String var1 = var12.toString();
		final BufferedReader var2 = new BufferedReader(new StringReader(var1));
		final String var11 = var2.readLine();

		while (true)
			while (true) {
				String var3 = var2.readLine();
				if (var3 == null) {
					var8 = var8 + "| " + var11;
					return var8;
				}

				final int var4 = var3.indexOf(40);
				final int var5 = var3.indexOf(41, 1 + var4);
				if ((var4 >= 0) && (var5 >= 0)) {
					String var6 = var3.substring(var4 + 1, var5);
					final int var10 = var6.indexOf(".java:");
					if (var10 >= 0) {
						var6 = var6.substring(0, var10) + var6.substring(5 + var10);
						var8 = var8 + var6 + '\u0020';
						continue;
					}

					var3 = var3.substring(0, var4);
				}

				var3 = var3.trim();
				var3 = var3.substring(var3.lastIndexOf(32) + 1);
				var3 = var3.substring(var3.lastIndexOf(9) + 1);
				var8 = var8 + var3 + '\u0020';
			}
	}

	public static final Class109_Sub21_Sub14_Sub2 method982(final int var0, final int var1, final int var2,
			final int var3, int var4, final boolean var5) {
		if (var1 == -1)
			var4 = 0;
		else if ((var4 == 2) && (var1 != 1))
			var4 = 1;

		final long var8 = ((long) var3 << 42) + ((long) var4 << 40) + ((long) var2 << 38) + ((long) var1 << 16) + var0;
		Class109_Sub21_Sub14_Sub2 var6;
		if (!var5) {
			var6 = (Class109_Sub21_Sub14_Sub2) Class109_Sub21_Sub5.aClass120_1343.method438(var8);
			if (null != var6)
				return var6;
		}

		Class109_Sub21_Sub5 var7 = Class109_Sub23.method660(var0);
		if ((var1 > 1) && (null != var7.anIntArray1373)) {
			int var11 = -1;

			for (int var10 = 0; var10 < 10; ++var10)
				if ((var1 >= var7.anIntArray1360[var10]) && (var7.anIntArray1360[var10] != 0))
					var11 = var7.anIntArray1373[var10];

			if (var11 != -1)
				var7 = Class109_Sub23.method660(var11);
		}

		final Class109_Sub21_Sub15_Sub4 var12 = var7.method689(1);
		if (var12 == null)
			return null;
		else {
			Class109_Sub21_Sub14_Sub2 var16 = null;
			if (var7.anInt1376 != -1) {
				var16 = method982(var7.anInt1356, 10, 1, 0, 0, true);
				if (null == var16)
					return null;
			} else if (var7.anInt1383 != -1) {
				var16 = method982(var7.anInt1382, var1, var2, var3, 0, false);
				if (null == var16)
					return null;
			}

			final int[] var20 = Class109_Sub21_Sub14.anIntArray1558;
			final int var18 = Class109_Sub21_Sub14.anInt1553;
			final int var19 = Class109_Sub21_Sub14.anInt1554;
			final int[] var15 = new int[4];
			Class109_Sub21_Sub14.method770(var15);
			var6 = new Class109_Sub21_Sub14_Sub2(36, 32);
			Class109_Sub21_Sub14.method777(var6.anIntArray1722, 36, 32);
			Class109_Sub21_Sub14.method783();
			Class109_Sub21_Sub14_Sub3.method973();
			Class109_Sub21_Sub14_Sub3.method961(16, 16);
			Class109_Sub21_Sub14_Sub3.aBool1818 = false;
			int var17 = var7.anInt1351;
			if (var5)
				var17 = (int) (1.5D * var17);
			else if (var2 == 2)
				var17 = (int) (var17 * 1.04D);

			final int var13 = (Class109_Sub21_Sub14_Sub3.anIntArray1835[var7.anInt1352] * var17) >> 16;
			final int var14 = (Class109_Sub21_Sub14_Sub3.anIntArray1836[var7.anInt1352] * var17) >> 16;
			var12.method937();
			var12.method947(0, var7.anInt1353, var7.anInt1354, var7.anInt1352, var7.anInt1355,
					(var12.anInt1576 / 2) + var13 + var7.anInt1346, var14 + var7.anInt1346);
			if (var7.anInt1383 != -1)
				var16.method919(0, 0);

			if (var2 >= 1)
				var6.method926(1);

			if (var2 >= 2)
				var6.method926(16777215);

			if (var3 != 0)
				var6.method913(var3);

			Class109_Sub21_Sub14.method777(var6.anIntArray1722, 36, 32);
			if (var7.anInt1376 != -1)
				var16.method919(0, 0);

			if ((var4 == 1) || ((var4 == 2) && (var7.anInt1378 == 1))) {
				final Class109_Sub21_Sub14_Sub4_Sub1 var21 = Class109_Sub21_Sub1.aClass109_Sub21_Sub14_Sub4_Sub1_1296;
				String var22;
				if (var1 < 100000)
					var22 = "<col=ffff00>" + var1 + "</col>";
				else if (var1 < 10000000)
					var22 = "<col=ffffff>" + (var1 / 1000) + "K" + "</col>";
				else
					var22 = "<col=00ff80>" + (var1 / 1000000) + "M" + "</col>";

				var21.method1014(var22, 0, 9, 16776960, 1);
			}

			if (!var5)
				Class109_Sub21_Sub5.aClass120_1343.method440(var6, var8);

			Class109_Sub21_Sub14.method777(var20, var18, var19);
			Class109_Sub21_Sub14.method771(var15);
			Class109_Sub21_Sub14_Sub3.method973();
			Class109_Sub21_Sub14_Sub3.aBool1818 = true;
			return var6;
		}
	}

	public static void method983(final Class104 var0, final Class104 var1, final boolean var2,
			final Class109_Sub21_Sub14_Sub4_Sub1 var3) {
		Class109_Sub21_Sub5.aClass104_1338 = var0;
		Class109_Sub21_Sub5.aClass104_1379 = var1;
		Class109_Sub17.aBool1103 = var2;
		Class109_Sub21_Sub5.anInt1340 = Class109_Sub21_Sub5.aClass104_1338.method401(10);
		Class109_Sub21_Sub1.aClass109_Sub21_Sub14_Sub4_Sub1_1296 = var3;
	}
}
