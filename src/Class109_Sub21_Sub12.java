public class Class109_Sub21_Sub12 extends Class109_Sub21 {
	static Class109_Sub21_Sub14_Sub4_Sub1 aClass109_Sub21_Sub14_Sub4_Sub1_1503;
	public static Class104 aClass104_1506;
	static int anInt1507;
	public String aString1501 = "null";
	public int anInt1508 = 0;
	public char aChar1499;
	public char aChar1500;
	public int anInt1502;
	public int[] anIntArray1504;
	public String[] aStringArray1505;
	public int[] anIntArray1497;
	public static Class120 aClass120_1498 = new Class120(64);

	static final void method750(final Class109_Sub21_Sub15_Sub3 var0) {
		if (var0.anInt1686 != 0) {
			int var1;
			int var3;
			if ((var0.anInt1677 != -1) && (var0.anInt1677 < '\u8000')) {
				final Class109_Sub21_Sub15_Sub3_Sub1 var4 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var0.anInt1677];
				if (null != var4) {
					var1 = var0.anInt1710 - var4.anInt1710;
					var3 = var0.anInt1653 - var4.anInt1653;
					if ((var1 != 0) || (var3 != 0))
						var0.anInt1680 = (int) (Math.atan2(var1, var3) * 325.949D) & 2047;
				}
			}

			int var5;
			if (var0.anInt1677 >= '\u8000') {
				var5 = var0.anInt1677 - '\u8000';
				if (client.anInt2092 == var5)
					var5 = 2047;

				final Class109_Sub21_Sub15_Sub3_Sub2 var2 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var5];
				if (var2 != null) {
					var3 = var0.anInt1710 - var2.anInt1710;
					final int var6 = var0.anInt1653 - var2.anInt1653;
					if ((var3 != 0) || (var6 != 0))
						var0.anInt1680 = (int) (Math.atan2(var3, var6) * 325.949D) & 2047;
				}
			}

			if (((var0.anInt1664 != 0) || (var0.anInt1665 != 0)) && ((var0.anInt1705 == 0) || (var0.anInt1708 > 0))) {
				var5 = var0.anInt1710 - ((var0.anInt1664 * 64) - (Class41.anInt375 * 64) - (Class41.anInt375 * 64));
				var1 = var0.anInt1653 - ((var0.anInt1665 * 64) - (Class113.anInt822 * 64) - (Class113.anInt822 * 64));
				if ((var5 != 0) || (var1 != 0))
					var0.anInt1680 = (int) (Math.atan2(var5, var1) * 325.949D) & 2047;

				var0.anInt1664 = 0;
				var0.anInt1665 = 0;
			}

			var5 = (var0.anInt1680 - var0.anInt1654) & 2047;
			if (var5 != 0) {
				++var0.anInt1703;
				boolean var7;
				if (var5 > 1024) {
					var0.anInt1654 -= var0.anInt1686;
					var7 = true;
					if ((var5 < var0.anInt1686) || (var5 > (2048 - var0.anInt1686))) {
						var0.anInt1654 = var0.anInt1680;
						var7 = false;
					}

					if ((var0.anInt1657 == var0.anInt1663) && ((var0.anInt1703 > 25) || var7))
						if (var0.anInt1658 != -1)
							var0.anInt1663 = var0.anInt1658;
						else
							var0.anInt1663 = var0.anInt1660;
				} else {
					var0.anInt1654 += var0.anInt1686;
					var7 = true;
					if ((var5 < var0.anInt1686) || (var5 > (2048 - var0.anInt1686))) {
						var0.anInt1654 = var0.anInt1680;
						var7 = false;
					}

					if ((var0.anInt1663 == var0.anInt1657) && ((var0.anInt1703 > 25) || var7))
						if (var0.anInt1659 != -1)
							var0.anInt1663 = var0.anInt1659;
						else
							var0.anInt1663 = var0.anInt1660;
				}

				var0.anInt1654 &= 2047;
			} else
				var0.anInt1703 = 0;

		}
	}

	public void method751(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method564();
			if (var2 == 0)
				return;

			method752(var1, var2);
		}
	}

	void method752(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			aChar1499 = (char) var1.method564();
		else if (var2 == 2)
			aChar1500 = (char) var1.method564();
		else if (var2 == 3)
			aString1501 = var1.method602();
		else if (var2 == 4)
			anInt1502 = var1.readInt();
		else {
			int var3;
			if (var2 == 5) {
				anInt1508 = var1.readShort();
				anIntArray1504 = new int[anInt1508];
				aStringArray1505 = new String[anInt1508];

				for (var3 = 0; var3 < anInt1508; ++var3) {
					anIntArray1504[var3] = var1.readInt();
					aStringArray1505[var3] = var1.method602();
				}
			} else if (var2 == 6) {
				anInt1508 = var1.readShort();
				anIntArray1504 = new int[anInt1508];
				anIntArray1497 = new int[anInt1508];

				for (var3 = 0; var3 < anInt1508; ++var3) {
					anIntArray1504[var3] = var1.readInt();
					anIntArray1497[var3] = var1.readInt();
				}
			}
		}

	}

	static final void method753(final Class109_Sub21_Sub15_Sub3 var0, final int var1) {
		Class109_Sub18.method632(var0.anInt1710, var0.anInt1653, var1);
	}

	public static int method754(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = (var2 << 1) | (var0 & 1);
			var0 >>>= 1;
		}

		return var2;
	}

	static void method755(final int var0, final boolean var1, final int var2, final boolean var3) {
		if (Class46.aClass46Array485 != null)
			Class109_Sub21_Sub15_Sub3.method903(0, Class46.aClass46Array485.length - 1, var0, var1, var2, var3);

	}

	public static int method756(final CharSequence var0) {
		final int var1 = var0.length();
		int var3 = 0;

		for (int var2 = 0; var2 < var1; ++var2)
			var3 = ((var3 << 5) - var3) + Class109_Sub15.method624(var0.charAt(var2));

		return var3;
	}
}
