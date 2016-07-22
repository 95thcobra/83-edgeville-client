public final class Class109_Sub21_Sub15_Sub5 extends Class109_Sub21_Sub15 {
	static Class104_Sub1 aClass104_Sub1_1812;
	static int[] anIntArray1813;
	protected static int anInt1815;
	boolean aBool1805 = false;
	double aDouble1793;
	double aDouble1800;
	double aDouble1801;
	double aDouble1799;
	int anInt1807;
	int anInt1810;
	int anInt1802 = 0;
	int anInt1811 = 0;
	int anInt1794;
	int anInt1806;
	int anInt1790;
	int anInt1791;
	int anInt1792;
	int anInt1814;
	int anInt1795;
	int anInt1796;
	int anInt1797;
	int anInt1798;
	int anInt1788;
	Class109_Sub21_Sub7 aClass109_Sub21_Sub7_1809;
	double aDouble1789;
	double aDouble1803;
	double aDouble1804;
	double aDouble1808;

	static final String method956(final int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3)
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);

		return var1.length() > 9
				? " " + Class109_Sub11.method544('\uff80') + var1.substring(0, var1.length() - 8) + "M" + " " + " ("
						+ var1 + ")" + "</col>"
				: (var1.length() > 6
						? " " + Class109_Sub11.method544(16777215) + var1.substring(0, var1.length() - 4) + "K" + " "
								+ " (" + var1 + ")" + "</col>"
						: " " + Class109_Sub11.method544(16776960) + var1 + "</col>");
	}

	final void method957(final int var1) {
		aBool1805 = true;
		aDouble1793 += var1 * aDouble1789;
		aDouble1800 += var1 * aDouble1803;
		aDouble1801 += (aDouble1799 * var1) + (0.5D * aDouble1808 * var1 * var1);
		aDouble1799 += var1 * aDouble1808;
		anInt1807 = ((int) (Math.atan2(aDouble1789, aDouble1803) * 325.949D) + 1024) & 2047;
		anInt1810 = (int) (Math.atan2(aDouble1799, aDouble1804) * 325.949D) & 2047;
		if (aClass109_Sub21_Sub7_1809 != null) {
			anInt1802 += var1;

			while (true) {
				do {
					do {
						if (anInt1802 <= aClass109_Sub21_Sub7_1809.anIntArray1396[anInt1811])
							return;

						anInt1802 -= aClass109_Sub21_Sub7_1809.anIntArray1396[anInt1811];
						++anInt1811;
					} while (anInt1811 < aClass109_Sub21_Sub7_1809.anIntArray1401.length);

					anInt1811 -= aClass109_Sub21_Sub7_1809.anInt1395;
				} while ((anInt1811 >= 0) && (anInt1811 < aClass109_Sub21_Sub7_1809.anIntArray1401.length));

				anInt1811 = 0;
			}
		}
	}

	Class109_Sub21_Sub15_Sub5(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, final int var10, final int var11) {
		anInt1794 = var1;
		anInt1806 = var2;
		anInt1790 = var3;
		anInt1791 = var4;
		anInt1792 = var5;
		anInt1814 = var6;
		anInt1795 = var7;
		anInt1796 = var8;
		anInt1797 = var9;
		anInt1798 = var10;
		anInt1788 = var11;
		aBool1805 = false;
		final int var12 = Class35.method154(anInt1794).anInt1483;
		if (var12 != -1)
			aClass109_Sub21_Sub7_1809 = Class109_Sub21_Sub18.method849(var12, 602507873);
		else
			aClass109_Sub21_Sub7_1809 = null;

	}

	final void method958(final int var1, final int var2, final int var3, final int var4) {
		double var5;
		if (!aBool1805) {
			var5 = var1 - anInt1790;
			final double var7 = var2 - anInt1791;
			final double var9 = Math.sqrt((var7 * var7) + (var5 * var5));
			aDouble1793 = ((anInt1797 * var5) / var9) + anInt1790;
			aDouble1800 = ((anInt1797 * var7) / var9) + anInt1791;
			aDouble1801 = anInt1792;
		}

		var5 = (1 + anInt1795) - var4;
		aDouble1789 = (var1 - aDouble1793) / var5;
		aDouble1803 = (var2 - aDouble1800) / var5;
		aDouble1804 = Math.sqrt((aDouble1789 * aDouble1789) + (aDouble1803 * aDouble1803));
		if (!aBool1805)
			aDouble1799 = -aDouble1804 * Math.tan(0.02454369D * anInt1796);

		aDouble1808 = (2.0D * (var3 - aDouble1801 - (aDouble1799 * var5))) / (var5 * var5);
	}

	@Override
	protected final Class109_Sub21_Sub15_Sub4 method827(final byte var1) {
		final Class109_Sub21_Sub11 var2 = Class35.method154(anInt1794);
		final Class109_Sub21_Sub15_Sub4 var3 = var2.method748(anInt1811);
		if (null == var3)
			return null;
		else {
			var3.method944(anInt1810);
			return var3;
		}
	}

	static final void method959(final String var0, final int var1) {
		client.secureBuffer.method840(29);
		final Class109_Sub14_Sub1 var2 = client.secureBuffer;
		final int var3 = var0.length() + 1;
		var2.writeByte(1 + var3);
		client.secureBuffer.writeString(var0);
		client.secureBuffer.method583(var1);
	}
}
