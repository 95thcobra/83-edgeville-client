public class Class109_Sub21_Sub15_Sub4 extends Class109_Sub21_Sub15 {
	int anInt1730 = 0;
	int anInt1734 = 0;
	int anInt1759 = 0;
	int[] anIntArray1731;
	int[] anIntArray1728;
	int[] anIntArray1735;
	int[] anIntArray1736;
	int[] anIntArray1737;
	int[] anIntArray1739;
	int[] anIntArray1753;
	int[] anIntArray1740;
	byte[] aByteArray1741;
	byte[] aByteArray1769;
	byte[] aByteArray1774;
	short[] aShortArray1751;
	byte aByte1744 = 0;
	int[] anIntArray1758;
	int[] anIntArray1747;
	int[] anIntArray1726;
	int[][] anIntArrayArray1749;
	int[][] anIntArrayArray1750;
	public boolean aBool1754 = false;
	int[] anIntArray1765;
	int anInt1752;
	int anInt1764;
	int anInt1733;
	int anInt1756;
	int anInt1755;
	static int anInt1776;
	static int anInt1777;
	static int anInt1778;
	public static int anInt1782 = 0;
	static byte[] aByteArray1727 = new byte[1];
	static byte[] aByteArray1729 = new byte[1];
	static Class109_Sub21_Sub15_Sub4 aClass109_Sub21_Sub15_Sub4_1787 = new Class109_Sub21_Sub15_Sub4();
	static Class109_Sub21_Sub15_Sub4 aClass109_Sub21_Sub15_Sub4_1732 = new Class109_Sub21_Sub15_Sub4();
	static boolean[] aBoolArray1757 = new boolean[4096];
	static boolean[] aBoolArray1742 = new boolean[4096];
	static int[] anIntArray1783 = new int[4096];
	static int[] anIntArray1760 = new int[4096];
	static int[] anIntArray1780 = new int[4096];
	static int[] anIntArray1762 = new int[4096];
	static int[] anIntArray1738 = new int[4096];
	static int[] anIntArray1748 = new int[4096];
	static int[] anIntArray1766 = new int[1600];
	static int[][] anIntArrayArray1767 = new int[1600][512];
	static int[] anIntArray1768 = new int[12];
	static int[][] anIntArrayArray1770 = new int[12][2000];
	static int[] anIntArray1761 = new int[2000];
	static int[] anIntArray1771 = new int[2000];
	static int[] anIntArray1746 = new int[12];
	static int[] anIntArray1773 = new int[10];
	static int[] anIntArray1779 = new int[10];
	static int[] anIntArray1775 = new int[10];
	public static boolean aBool1745 = false;
	public static int anInt1763 = 0;
	public static int anInt1781 = 0;
	public static int[] anIntArray1772 = new int[1000];
	static int[] anIntArray1784;
	static int[] anIntArray1785;
	static int[] anIntArray1786;
	static int[] anIntArray1743;

	public Class109_Sub21_Sub15_Sub4 method934(final int[][] var1, final int var2, final int var3, final int var4,
			final boolean var5, final int var6) {
		method937();
		int var10 = var2 - anInt1733;
		int var12 = var2 + anInt1733;
		int var8 = var4 - anInt1733;
		int var9 = var4 + anInt1733;
		if ((var10 >= 0) && (((var12 + 128) >> 7) < var1.length) && (var8 >= 0)
				&& (((var9 + 128) >> 7) < var1[0].length)) {
			var10 >>= 7;
			var12 = (var12 + 127) >> 7;
			var8 >>= 7;
			var9 = (var9 + 127) >> 7;
			if ((var1[var10][var8] == var3) && (var1[var12][var8] == var3) && (var1[var10][var9] == var3)
					&& (var1[var12][var9] == var3))
				return this;
			else {
				Class109_Sub21_Sub15_Sub4 var7;
				if (var5) {
					var7 = new Class109_Sub21_Sub15_Sub4();
					var7.anInt1730 = anInt1730;
					var7.anInt1734 = anInt1734;
					var7.anInt1759 = anInt1759;
					var7.anIntArray1731 = anIntArray1731;
					var7.anIntArray1728 = anIntArray1728;
					var7.anIntArray1735 = anIntArray1735;
					var7.anIntArray1736 = anIntArray1736;
					var7.anIntArray1737 = anIntArray1737;
					var7.anIntArray1739 = anIntArray1739;
					var7.anIntArray1753 = anIntArray1753;
					var7.anIntArray1740 = anIntArray1740;
					var7.aByteArray1741 = aByteArray1741;
					var7.aByteArray1769 = aByteArray1769;
					var7.aByteArray1774 = aByteArray1774;
					var7.aShortArray1751 = aShortArray1751;
					var7.aByte1744 = aByte1744;
					var7.anIntArray1758 = anIntArray1758;
					var7.anIntArray1747 = anIntArray1747;
					var7.anIntArray1726 = anIntArray1726;
					var7.anIntArrayArray1749 = anIntArrayArray1749;
					var7.anIntArrayArray1750 = anIntArrayArray1750;
					var7.aBool1754 = aBool1754;
					var7.anIntArray1765 = new int[var7.anInt1730];
				} else
					var7 = this;

				int var11;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var21;
				int var22;
				if (var6 == 0)
					for (var11 = 0; var11 < var7.anInt1730; ++var11) {
						var22 = anIntArray1731[var11] + var2;
						var14 = anIntArray1728[var11] + var4;
						var13 = var22 & 127;
						var16 = var14 & 127;
						var19 = var22 >> 7;
						var21 = var14 >> 7;
						var15 = ((var1[var19][var21] * (128 - var13)) + (var1[var19 + 1][var21] * var13)) >> 7;
						var17 = ((var1[var19][var21 + 1] * (128 - var13)) + (var1[var19 + 1][var21 + 1] * var13)) >> 7;
						var18 = ((var15 * (128 - var16)) + (var17 * var16)) >> 7;
						var7.anIntArray1765[var11] = (anIntArray1765[var11] + var18) - var3;
					}
				else
					for (var11 = 0; var11 < var7.anInt1730; ++var11) {
						var22 = (-anIntArray1765[var11] << 16) / anInt1576;
						if (var22 < var6) {
							var14 = anIntArray1731[var11] + var2;
							var13 = anIntArray1728[var11] + var4;
							var16 = var14 & 127;
							var19 = var13 & 127;
							var21 = var14 >> 7;
							var15 = var13 >> 7;
							var17 = ((var1[var21][var15] * (128 - var16)) + (var1[var21 + 1][var15] * var16)) >> 7;
							var18 = ((var1[var21][var15 + 1] * (128 - var16))
									+ (var1[var21 + 1][var15 + 1] * var16)) >> 7;
							final int var20 = ((var17 * (128 - var19)) + (var18 * var19)) >> 7;
							var7.anIntArray1765[var11] = anIntArray1765[var11]
									+ (((var20 - var3) * (var6 - var22)) / var6);
						}
					}

				var7.anInt1752 = 0;
				return var7;
			}
		} else
			return this;
	}

	public void method935(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1730; ++var4) {
			anIntArray1731[var4] += var1;
			anIntArray1765[var4] += var2;
			anIntArray1728[var4] += var3;
		}

		anInt1752 = 0;
	}

	Class109_Sub21_Sub15_Sub4 method936(final boolean var1, final Class109_Sub21_Sub15_Sub4 var2, final byte[] var3) {
		var2.anInt1730 = anInt1730;
		var2.anInt1734 = anInt1734;
		var2.anInt1759 = anInt1759;
		if ((var2.anIntArray1731 == null) || (var2.anIntArray1731.length < anInt1730)) {
			var2.anIntArray1731 = new int[anInt1730 + 100];
			var2.anIntArray1765 = new int[anInt1730 + 100];
			var2.anIntArray1728 = new int[anInt1730 + 100];
		}

		int var4;
		for (var4 = 0; var4 < anInt1730; ++var4) {
			var2.anIntArray1731[var4] = anIntArray1731[var4];
			var2.anIntArray1765[var4] = anIntArray1765[var4];
			var2.anIntArray1728[var4] = anIntArray1728[var4];
		}

		if (var1)
			var2.aByteArray1769 = aByteArray1769;
		else {
			var2.aByteArray1769 = var3;
			if (aByteArray1769 == null)
				for (var4 = 0; var4 < anInt1734; ++var4)
					var2.aByteArray1769[var4] = 0;
			else
				for (var4 = 0; var4 < anInt1734; ++var4)
					var2.aByteArray1769[var4] = aByteArray1769[var4];
		}

		var2.anIntArray1735 = anIntArray1735;
		var2.anIntArray1736 = anIntArray1736;
		var2.anIntArray1737 = anIntArray1737;
		var2.anIntArray1739 = anIntArray1739;
		var2.anIntArray1753 = anIntArray1753;
		var2.anIntArray1740 = anIntArray1740;
		var2.aByteArray1741 = aByteArray1741;
		var2.aByteArray1774 = aByteArray1774;
		var2.aShortArray1751 = aShortArray1751;
		var2.aByte1744 = aByte1744;
		var2.anIntArray1758 = anIntArray1758;
		var2.anIntArray1747 = anIntArray1747;
		var2.anIntArray1726 = anIntArray1726;
		var2.anIntArrayArray1749 = anIntArrayArray1749;
		var2.anIntArrayArray1750 = anIntArrayArray1750;
		var2.aBool1754 = aBool1754;
		var2.anInt1752 = 0;
		return var2;
	}

	public void method937() {
		if (anInt1752 != 1) {
			anInt1752 = 1;
			anInt1576 = 0;
			anInt1764 = 0;
			anInt1733 = 0;

			for (int var3 = 0; var3 < anInt1730; ++var3) {
				final int var4 = anIntArray1731[var3];
				final int var2 = anIntArray1765[var3];
				final int var5 = anIntArray1728[var3];
				if (-var2 > anInt1576)
					anInt1576 = -var2;

				if (var2 > anInt1764)
					anInt1764 = var2;

				final int var1 = (var4 * var4) + (var5 * var5);
				if (var1 > anInt1733)
					anInt1733 = var1;
			}

			anInt1733 = (int) (Math.sqrt(anInt1733) + 0.99D);
			anInt1756 = (int) (Math.sqrt((anInt1733 * anInt1733) + (anInt1576 * anInt1576)) + 0.99D);
			anInt1755 = anInt1756 + (int) (Math.sqrt((anInt1733 * anInt1733) + (anInt1764 * anInt1764)) + 0.99D);
		}
	}

	void method938() {
		if (anInt1752 != 2) {
			anInt1752 = 2;
			anInt1733 = 0;

			for (int var2 = 0; var2 < anInt1730; ++var2) {
				final int var3 = anIntArray1731[var2];
				final int var4 = anIntArray1765[var2];
				final int var5 = anIntArray1728[var2];
				final int var1 = (var3 * var3) + (var5 * var5) + (var4 * var4);
				if (var1 > anInt1733)
					anInt1733 = var1;
			}

			anInt1733 = (int) (Math.sqrt(anInt1733) + 0.99D);
			anInt1756 = anInt1733;
			anInt1755 = anInt1733 + anInt1733;
		}
	}

	public int method939() {
		method937();
		return anInt1733;
	}

	public void method940(final Class109_Sub21_Sub17 var1, final int var2, final Class109_Sub21_Sub17 var3,
			final int var4, final int[] var5) {
		if (var2 != -1)
			if ((var5 != null) && (var4 != -1)) {
				final Class43 var10 = var1.aClass43Array1588[var2];
				final Class43 var8 = var3.aClass43Array1588[var4];
				final Class109_Sub6 var6 = var10.aClass109_Sub6_437;
				anInt1776 = 0;
				anInt1777 = 0;
				anInt1778 = 0;
				byte var11 = 0;
				int var13 = var11 + 1;
				int var12 = var5[var11];

				int var7;
				int var9;
				for (var9 = 0; var9 < var10.anInt439; ++var9) {
					for (var7 = var10.anIntArray434[var9]; var7 > var12; var12 = var5[var13++])
						;

					if ((var7 != var12) || (var6.anIntArray966[var7] == 0))
						method941(var6.anIntArray966[var7], var6.anIntArrayArray964[var7], var10.anIntArray441[var9],
								var10.anIntArray438[var9], var10.anIntArray442[var9]);
				}

				anInt1776 = 0;
				anInt1777 = 0;
				anInt1778 = 0;
				var11 = 0;
				var13 = var11 + 1;
				var12 = var5[var11];

				for (var9 = 0; var9 < var8.anInt439; ++var9) {
					for (var7 = var8.anIntArray434[var9]; var7 > var12; var12 = var5[var13++])
						;

					if ((var7 == var12) || (var6.anIntArray966[var7] == 0))
						method941(var6.anIntArray966[var7], var6.anIntArrayArray964[var7], var8.anIntArray441[var9],
								var8.anIntArray438[var9], var8.anIntArray442[var9]);
				}

				anInt1752 = 0;
			} else
				method953(var1, var2);
	}

	void method941(final int var1, final int[] var2, final int var3, final int var4, final int var5) {
		final int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var11 = 0;
			anInt1776 = 0;
			anInt1777 = 0;
			anInt1778 = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				final int var9 = var2[var8];
				if (var9 < anIntArrayArray1749.length) {
					final int[] var10 = anIntArrayArray1749[var9];

					for (var7 = 0; var7 < var10.length; ++var7) {
						var12 = var10[var7];
						anInt1776 += anIntArray1731[var12];
						anInt1777 += anIntArray1765[var12];
						anInt1778 += anIntArray1728[var12];
						++var11;
					}
				}
			}

			if (var11 > 0) {
				anInt1776 = (anInt1776 / var11) + var3;
				anInt1777 = (anInt1777 / var11) + var4;
				anInt1778 = (anInt1778 / var11) + var5;
			} else {
				anInt1776 = var3;
				anInt1777 = var4;
				anInt1778 = var5;
			}

		} else {
			int var13;
			int[] var14;
			if (var1 == 1)
				for (var11 = 0; var11 < var6; ++var11) {
					var8 = var2[var11];
					if (var8 < anIntArrayArray1749.length) {
						var14 = anIntArrayArray1749[var8];

						for (var13 = 0; var13 < var14.length; ++var13) {
							var7 = var14[var13];
							anIntArray1731[var7] += var3;
							anIntArray1765[var7] += var4;
							anIntArray1728[var7] += var5;
						}
					}
				}
			else if (var1 == 2)
				for (var11 = 0; var11 < var6; ++var11) {
					var8 = var2[var11];
					if (var8 < anIntArrayArray1749.length) {
						var14 = anIntArrayArray1749[var8];

						for (var13 = 0; var13 < var14.length; ++var13) {
							var7 = var14[var13];
							anIntArray1731[var7] -= anInt1776;
							anIntArray1765[var7] -= anInt1777;
							anIntArray1728[var7] -= anInt1778;
							var12 = (var3 & 255) * 8;
							final int var16 = (var4 & 255) * 8;
							final int var17 = (var5 & 255) * 8;
							int var15;
							int var18;
							int var19;
							if (var17 != 0) {
								var18 = anIntArray1784[var17];
								var19 = anIntArray1785[var17];
								var15 = ((anIntArray1765[var7] * var18) + (anIntArray1731[var7] * var19)) >> 16;
								anIntArray1765[var7] = ((anIntArray1765[var7] * var19)
										- (anIntArray1731[var7] * var18)) >> 16;
								anIntArray1731[var7] = var15;
							}

							if (var12 != 0) {
								var18 = anIntArray1784[var12];
								var19 = anIntArray1785[var12];
								var15 = ((anIntArray1765[var7] * var19) - (anIntArray1728[var7] * var18)) >> 16;
								anIntArray1728[var7] = ((anIntArray1765[var7] * var18)
										+ (anIntArray1728[var7] * var19)) >> 16;
								anIntArray1765[var7] = var15;
							}

							if (var16 != 0) {
								var18 = anIntArray1784[var16];
								var19 = anIntArray1785[var16];
								var15 = ((anIntArray1728[var7] * var18) + (anIntArray1731[var7] * var19)) >> 16;
								anIntArray1728[var7] = ((anIntArray1728[var7] * var19)
										- (anIntArray1731[var7] * var18)) >> 16;
								anIntArray1731[var7] = var15;
							}

							anIntArray1731[var7] += anInt1776;
							anIntArray1765[var7] += anInt1777;
							anIntArray1728[var7] += anInt1778;
						}
					}
				}
			else if (var1 == 3)
				for (var11 = 0; var11 < var6; ++var11) {
					var8 = var2[var11];
					if (var8 < anIntArrayArray1749.length) {
						var14 = anIntArrayArray1749[var8];

						for (var13 = 0; var13 < var14.length; ++var13) {
							var7 = var14[var13];
							anIntArray1731[var7] -= anInt1776;
							anIntArray1765[var7] -= anInt1777;
							anIntArray1728[var7] -= anInt1778;
							anIntArray1731[var7] = (anIntArray1731[var7] * var3) / 128;
							anIntArray1765[var7] = (anIntArray1765[var7] * var4) / 128;
							anIntArray1728[var7] = (anIntArray1728[var7] * var5) / 128;
							anIntArray1731[var7] += anInt1776;
							anIntArray1765[var7] += anInt1777;
							anIntArray1728[var7] += anInt1778;
						}
					}
				}
			else if (var1 == 5)
				if ((anIntArrayArray1750 != null) && (aByteArray1769 != null))
					for (var11 = 0; var11 < var6; ++var11) {
						var8 = var2[var11];
						if (var8 < anIntArrayArray1750.length) {
							var14 = anIntArrayArray1750[var8];

							for (var13 = 0; var13 < var14.length; ++var13) {
								var7 = var14[var13];
								var12 = (aByteArray1769[var7] & 255) + (var3 * 8);
								if (var12 < 0)
									var12 = 0;
								else if (var12 > 255)
									var12 = 255;

								aByteArray1769[var7] = (byte) var12;
							}
						}
					}
		}
	}

	public void method942() {
		for (int var1 = 0; var1 < anInt1730; ++var1) {
			final int var2 = anIntArray1731[var1];
			anIntArray1731[var1] = anIntArray1728[var1];
			anIntArray1728[var1] = -var2;
		}

		anInt1752 = 0;
	}

	public void method943() {
		for (int var1 = 0; var1 < anInt1730; ++var1) {
			anIntArray1731[var1] = -anIntArray1731[var1];
			anIntArray1728[var1] = -anIntArray1728[var1];
		}

		anInt1752 = 0;
	}

	public void method944(final int var1) {
		final int var2 = anIntArray1784[var1];
		final int var4 = anIntArray1785[var1];

		for (int var3 = 0; var3 < anInt1730; ++var3) {
			final int var5 = ((anIntArray1765[var3] * var4) - (anIntArray1728[var3] * var2)) >> 16;
			anIntArray1728[var3] = ((anIntArray1765[var3] * var2) + (anIntArray1728[var3] * var4)) >> 16;
			anIntArray1765[var3] = var5;
		}

		anInt1752 = 0;
	}

	public void method945() {
		for (int var1 = 0; var1 < anInt1730; ++var1) {
			final int var2 = anIntArray1728[var1];
			anIntArray1728[var1] = anIntArray1731[var1];
			anIntArray1731[var1] = -var2;
		}

		anInt1752 = 0;
	}

	public void method946(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1730; ++var4) {
			anIntArray1731[var4] = (anIntArray1731[var4] * var1) / 128;
			anIntArray1765[var4] = (anIntArray1765[var4] * var2) / 128;
			anIntArray1728[var4] = (anIntArray1728[var4] * var3) / 128;
		}

		anInt1752 = 0;
	}

	public final void method947(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		anIntArray1766[0] = -1;
		if ((anInt1752 != 2) && (anInt1752 != 1))
			method938();

		final int var8 = Class109_Sub21_Sub14_Sub3.anInt1823;
		final int var9 = Class109_Sub21_Sub14_Sub3.anInt1824;
		final int var12 = anIntArray1784[var2];
		final int var13 = anIntArray1785[var2];
		final int var14 = anIntArray1784[var3];
		final int var15 = anIntArray1785[var3];
		final int var16 = anIntArray1784[var4];
		final int var17 = anIntArray1785[var4];
		final int var18 = ((var6 * var16) + (var7 * var17)) >> 16;

		for (int var19 = 0; var19 < anInt1730; ++var19) {
			int var20 = anIntArray1731[var19];
			int var21 = anIntArray1765[var19];
			int var22 = anIntArray1728[var19];
			int var23;
			if (var3 != 0) {
				var23 = ((var21 * var14) + (var20 * var15)) >> 16;
				var21 = ((var21 * var15) - (var20 * var14)) >> 16;
				var20 = var23;
			}

			if (var2 != 0) {
				var23 = ((var22 * var12) + (var20 * var13)) >> 16;
				var22 = ((var22 * var13) - (var20 * var12)) >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = ((var21 * var17) - (var22 * var16)) >> 16;
			var22 = ((var21 * var16) + (var22 * var17)) >> 16;
			anIntArray1780[var19] = var22 - var18;
			anIntArray1783[var19] = var8 + ((var20 * Class109_Sub21_Sub14_Sub3.anInt1822) / var22);
			anIntArray1760[var19] = var9 + ((var23 * Class109_Sub21_Sub14_Sub3.anInt1822) / var22);
			if (anInt1759 > 0) {
				anIntArray1762[var19] = var20;
				anIntArray1738[var19] = var23;
				anIntArray1748[var19] = var22;
			}
		}

		try {
			method949(false, false, 0);
		} catch (final Exception var25) {
			;
		}

	}

	public final void method948(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8) {
		anIntArray1766[0] = -1;
		if ((anInt1752 != 2) && (anInt1752 != 1))
			method938();

		final int var9 = Class109_Sub21_Sub14_Sub3.anInt1823;
		final int var10 = Class109_Sub21_Sub14_Sub3.anInt1824;
		final int var13 = anIntArray1784[var2];
		final int var14 = anIntArray1785[var2];
		final int var15 = anIntArray1784[var3];
		final int var16 = anIntArray1785[var3];
		final int var17 = anIntArray1784[var4];
		final int var18 = anIntArray1785[var4];
		final int var19 = ((var6 * var17) + (var7 * var18)) >> 16;

		for (int var20 = 0; var20 < anInt1730; ++var20) {
			int var21 = anIntArray1731[var20];
			int var22 = anIntArray1765[var20];
			int var23 = anIntArray1728[var20];
			int var24;
			if (var3 != 0) {
				var24 = ((var22 * var15) + (var21 * var16)) >> 16;
				var22 = ((var22 * var16) - (var21 * var15)) >> 16;
				var21 = var24;
			}

			if (var2 != 0) {
				var24 = ((var23 * var13) + (var21 * var14)) >> 16;
				var23 = ((var23 * var14) - (var21 * var13)) >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = ((var22 * var18) - (var23 * var17)) >> 16;
			var23 = ((var22 * var17) + (var23 * var18)) >> 16;
			anIntArray1780[var20] = var23 - var19;
			anIntArray1783[var20] = var9 + ((var21 * Class109_Sub21_Sub14_Sub3.anInt1822) / var8);
			anIntArray1760[var20] = var10 + ((var24 * Class109_Sub21_Sub14_Sub3.anInt1822) / var8);
			if (anInt1759 > 0) {
				anIntArray1762[var20] = var21;
				anIntArray1738[var20] = var24;
				anIntArray1748[var20] = var23;
			}
		}

		try {
			method949(false, false, 0);
		} catch (final Exception var26) {
			;
		}

	}

	@Override
	void method828(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9) {
		anIntArray1766[0] = -1;
		if (anInt1752 != 1)
			method937();

		final int var10 = ((var8 * var5) - (var6 * var4)) >> 16;
		final int var11 = ((var7 * var2) + (var10 * var3)) >> 16;
		final int var12 = (anInt1733 * var3) >> 16;
		final int var13 = var11 + var12;
		if ((var13 > 50) && (var11 < 3500)) {
			final int var14 = ((var8 * var4) + (var6 * var5)) >> 16;
			int var15 = (var14 - anInt1733) * Class109_Sub21_Sub14_Sub3.anInt1822;
			if ((var15 / var13) < Class109_Sub21_Sub14_Sub3.anInt1816) {
				int var16 = (var14 + anInt1733) * Class109_Sub21_Sub14_Sub3.anInt1822;
				if ((var16 / var13) > Class109_Sub21_Sub14_Sub3.anInt1834) {
					final int var17 = ((var7 * var3) - (var10 * var2)) >> 16;
					final int var18 = (anInt1733 * var2) >> 16;
					int var19 = (var17 + var18) * Class109_Sub21_Sub14_Sub3.anInt1822;
					if ((var19 / var13) > Class109_Sub21_Sub14_Sub3.anInt1829) {
						final int var20 = var18 + ((anInt1576 * var3) >> 16);
						int var21 = (var17 - var20) * Class109_Sub21_Sub14_Sub3.anInt1822;
						if ((var21 / var13) < Class109_Sub21_Sub14_Sub3.anInt1830) {
							final int var22 = var12 + ((anInt1576 * var2) >> 16);
							boolean var23 = false;
							boolean var24 = false;
							if ((var11 - var22) <= 50)
								var24 = true;

							final boolean var25 = var24 || (anInt1759 > 0);
							boolean var26 = false;
							int var27;
							int var28;
							int var29;
							if ((var9 > 0) && aBool1745) {
								var27 = var11 - var12;
								if (var27 <= 50)
									var27 = 50;

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var27;
								} else {
									var16 /= var13;
									var15 /= var27;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var27;
								} else {
									var19 /= var13;
									var21 /= var27;
								}

								var28 = anInt1763 - Class109_Sub21_Sub14_Sub3.anInt1823;
								var29 = anInt1781 - Class109_Sub21_Sub14_Sub3.anInt1824;
								if ((var28 > var15) && (var28 < var16) && (var29 > var21) && (var29 < var19))
									if (aBool1754)
										anIntArray1772[anInt1782++] = var9;
									else
										var26 = true;
							}

							var27 = Class109_Sub21_Sub14_Sub3.anInt1823;
							var28 = Class109_Sub21_Sub14_Sub3.anInt1824;
							var29 = 0;
							int var30 = 0;
							if (var1 != 0) {
								var29 = anIntArray1784[var1];
								var30 = anIntArray1785[var1];
							}

							for (int var31 = 0; var31 < anInt1730; ++var31) {
								int var32 = anIntArray1731[var31];
								int var33 = anIntArray1765[var31];
								int var34 = anIntArray1728[var31];
								int var35;
								if (var1 != 0) {
									var35 = ((var34 * var29) + (var32 * var30)) >> 16;
									var34 = ((var34 * var30) - (var32 * var29)) >> 16;
									var32 = var35;
								}

								var32 += var6;
								var33 += var7;
								var34 += var8;
								var35 = ((var34 * var4) + (var32 * var5)) >> 16;
								var34 = ((var34 * var5) - (var32 * var4)) >> 16;
								var32 = var35;
								var35 = ((var33 * var3) - (var34 * var2)) >> 16;
								var34 = ((var33 * var2) + (var34 * var3)) >> 16;
								anIntArray1780[var31] = var34 - var11;
								if (var34 >= 50) {
									anIntArray1783[var31] = var27
											+ ((var32 * Class109_Sub21_Sub14_Sub3.anInt1822) / var34);
									anIntArray1760[var31] = var28
											+ ((var35 * Class109_Sub21_Sub14_Sub3.anInt1822) / var34);
								} else {
									anIntArray1783[var31] = -5000;
									var23 = true;
								}

								if (var25) {
									anIntArray1762[var31] = var32;
									anIntArray1738[var31] = var35;
									anIntArray1748[var31] = var34;
								}
							}

							try {
								method949(var23, var26, var9);
							} catch (final Exception var37) {
								;
							}

						}
					}
				}
			}
		}
	}

	final void method949(final boolean var1, boolean var2, final int var3) {
		if (anInt1755 < 1600) {
			int var7;
			for (var7 = 0; var7 < anInt1755; ++var7)
				anIntArray1766[var7] = 0;

			int var4;
			int var5;
			int var8;
			int var9;
			int var10;
			int var11;
			int var14;
			int var16;
			int var19;
			for (var7 = 0; var7 < anInt1734; ++var7)
				if (anIntArray1740[var7] != -2) {
					var9 = anIntArray1735[var7];
					var8 = anIntArray1736[var7];
					var10 = anIntArray1737[var7];
					var11 = anIntArray1783[var9];
					var4 = anIntArray1783[var8];
					var14 = anIntArray1783[var10];
					int var13;
					if (!var1 || ((var11 != -5000) && (var4 != -5000) && (var14 != -5000))) {
						if (var2 && method951(anInt1763, anInt1781, anIntArray1760[var9], anIntArray1760[var8],
								anIntArray1760[var10], var11, var4, var14)) {
							anIntArray1772[anInt1782++] = var3;
							var2 = false;
						}

						if ((((var11 - var4) * (anIntArray1760[var10] - anIntArray1760[var8]))
								- ((anIntArray1760[var9] - anIntArray1760[var8]) * (var14 - var4))) > 0) {
							aBoolArray1742[var7] = false;
							if ((var11 >= 0) && (var4 >= 0) && (var14 >= 0)
									&& (var11 <= Class109_Sub21_Sub14_Sub3.anInt1827)
									&& (var4 <= Class109_Sub21_Sub14_Sub3.anInt1827)
									&& (var14 <= Class109_Sub21_Sub14_Sub3.anInt1827))
								aBoolArray1757[var7] = false;
							else
								aBoolArray1757[var7] = true;

							var13 = ((anIntArray1780[var9] + anIntArray1780[var8] + anIntArray1780[var10]) / 3)
									+ anInt1756;
							anIntArrayArray1767[var13][anIntArray1766[var13]++] = var7;
						}
					} else {
						var13 = anIntArray1762[var9];
						var5 = anIntArray1762[var8];
						var19 = anIntArray1762[var10];
						int var15 = anIntArray1738[var9];
						var16 = anIntArray1738[var8];
						int var20 = anIntArray1738[var10];
						int var18 = anIntArray1748[var9];
						final int var12 = anIntArray1748[var8];
						int var21 = anIntArray1748[var10];
						var13 -= var5;
						var19 -= var5;
						var15 -= var16;
						var20 -= var16;
						var18 -= var12;
						var21 -= var12;
						final int var23 = (var15 * var21) - (var18 * var20);
						final int var22 = (var18 * var19) - (var13 * var21);
						final int var25 = (var13 * var20) - (var15 * var19);
						if (((var5 * var23) + (var16 * var22) + (var12 * var25)) > 0) {
							aBoolArray1742[var7] = true;
							final int var24 = ((anIntArray1780[var9] + anIntArray1780[var8] + anIntArray1780[var10])
									/ 3) + anInt1756;
							anIntArrayArray1767[var24][anIntArray1766[var24]++] = var7;
						}
					}
				}

			int[] var27;
			if (aByteArray1741 == null)
				for (var7 = anInt1755 - 1; var7 >= 0; --var7) {
					var9 = anIntArray1766[var7];
					if (var9 > 0) {
						var27 = anIntArrayArray1767[var7];

						for (var10 = 0; var10 < var9; ++var10)
							method950(var27[var10]);
					}
				}
			else {
				for (var7 = 0; var7 < 12; ++var7) {
					anIntArray1768[var7] = 0;
					anIntArray1746[var7] = 0;
				}

				for (var7 = anInt1755 - 1; var7 >= 0; --var7) {
					var9 = anIntArray1766[var7];
					if (var9 > 0) {
						var27 = anIntArrayArray1767[var7];

						for (var10 = 0; var10 < var9; ++var10) {
							var11 = var27[var10];
							final byte var28 = aByteArray1741[var11];
							var14 = anIntArray1768[var28]++;
							anIntArrayArray1770[var28][var14] = var11;
							if (var28 < 10)
								anIntArray1746[var28] += var7;
							else if (var28 == 10)
								anIntArray1761[var14] = var7;
							else
								anIntArray1771[var14] = var7;
						}
					}
				}

				var7 = 0;
				if ((anIntArray1768[1] > 0) || (anIntArray1768[2] > 0))
					var7 = (anIntArray1746[1] + anIntArray1746[2]) / (anIntArray1768[1] + anIntArray1768[2]);

				var9 = 0;
				if ((anIntArray1768[3] > 0) || (anIntArray1768[4] > 0))
					var9 = (anIntArray1746[3] + anIntArray1746[4]) / (anIntArray1768[3] + anIntArray1768[4]);

				var8 = 0;
				if ((anIntArray1768[6] > 0) || (anIntArray1768[8] > 0))
					var8 = (anIntArray1746[6] + anIntArray1746[8]) / (anIntArray1768[6] + anIntArray1768[8]);

				var11 = 0;
				var4 = anIntArray1768[10];
				int[] var17 = anIntArrayArray1770[10];
				int[] var26 = anIntArray1761;
				if (var11 == var4) {
					var11 = 0;
					var4 = anIntArray1768[11];
					var17 = anIntArrayArray1770[11];
					var26 = anIntArray1771;
				}

				if (var11 < var4)
					var10 = var26[var11];
				else
					var10 = -1000;

				for (var5 = 0; var5 < 10; ++var5) {
					while ((var5 == 0) && (var10 > var7)) {
						method950(var17[var11++]);
						if ((var11 == var4) && (var17 != anIntArrayArray1770[11])) {
							var11 = 0;
							var4 = anIntArray1768[11];
							var17 = anIntArrayArray1770[11];
							var26 = anIntArray1771;
						}

						if (var11 < var4)
							var10 = var26[var11];
						else
							var10 = -1000;
					}

					while ((var5 == 3) && (var10 > var9)) {
						method950(var17[var11++]);
						if ((var11 == var4) && (var17 != anIntArrayArray1770[11])) {
							var11 = 0;
							var4 = anIntArray1768[11];
							var17 = anIntArrayArray1770[11];
							var26 = anIntArray1771;
						}

						if (var11 < var4)
							var10 = var26[var11];
						else
							var10 = -1000;
					}

					while ((var5 == 5) && (var10 > var8)) {
						method950(var17[var11++]);
						if ((var11 == var4) && (var17 != anIntArrayArray1770[11])) {
							var11 = 0;
							var4 = anIntArray1768[11];
							var17 = anIntArrayArray1770[11];
							var26 = anIntArray1771;
						}

						if (var11 < var4)
							var10 = var26[var11];
						else
							var10 = -1000;
					}

					var19 = anIntArray1768[var5];
					final int[] var6 = anIntArrayArray1770[var5];

					for (var16 = 0; var16 < var19; ++var16)
						method950(var6[var16]);
				}

				while (var10 != -1000) {
					method950(var17[var11++]);
					if ((var11 == var4) && (var17 != anIntArrayArray1770[11])) {
						var11 = 0;
						var17 = anIntArrayArray1770[11];
						var4 = anIntArray1768[11];
						var26 = anIntArray1771;
					}

					if (var11 < var4)
						var10 = var26[var11];
					else
						var10 = -1000;
				}

			}
		}
	}

	final void method950(final int var1) {
		if (aBoolArray1742[var1])
			method955(var1);
		else {
			final int var3 = anIntArray1735[var1];
			final int var2 = anIntArray1736[var1];
			final int var4 = anIntArray1737[var1];
			Class109_Sub21_Sub14_Sub3.aBool1820 = aBoolArray1757[var1];
			if (aByteArray1769 == null)
				Class109_Sub21_Sub14_Sub3.anInt1819 = 0;
			else
				Class109_Sub21_Sub14_Sub3.anInt1819 = aByteArray1769[var1] & 255;

			if ((aShortArray1751 != null) && (aShortArray1751[var1] != -1)) {
				int var6;
				int var7;
				int var8;
				if ((aByteArray1774 != null) && (aByteArray1774[var1] != -1)) {
					final int var5 = aByteArray1774[var1] & 255;
					var6 = anIntArray1758[var5];
					var7 = anIntArray1747[var5];
					var8 = anIntArray1726[var5];
				} else {
					var6 = var3;
					var7 = var2;
					var8 = var4;
				}

				if (anIntArray1740[var1] == -1)
					Class109_Sub21_Sub14_Sub3.method976(anIntArray1760[var3], anIntArray1760[var2],
							anIntArray1760[var4], anIntArray1783[var3], anIntArray1783[var2], anIntArray1783[var4],
							anIntArray1739[var1], anIntArray1739[var1], anIntArray1739[var1], anIntArray1762[var6],
							anIntArray1762[var7], anIntArray1762[var8], anIntArray1738[var6], anIntArray1738[var7],
							anIntArray1738[var8], anIntArray1748[var6], anIntArray1748[var7], anIntArray1748[var8],
							aShortArray1751[var1]);
				else
					Class109_Sub21_Sub14_Sub3.method976(anIntArray1760[var3], anIntArray1760[var2],
							anIntArray1760[var4], anIntArray1783[var3], anIntArray1783[var2], anIntArray1783[var4],
							anIntArray1739[var1], anIntArray1753[var1], anIntArray1740[var1], anIntArray1762[var6],
							anIntArray1762[var7], anIntArray1762[var8], anIntArray1738[var6], anIntArray1738[var7],
							anIntArray1738[var8], anIntArray1748[var6], anIntArray1748[var7], anIntArray1748[var8],
							aShortArray1751[var1]);
			} else if (anIntArray1740[var1] == -1)
				Class109_Sub21_Sub14_Sub3.method967(anIntArray1760[var3], anIntArray1760[var2], anIntArray1760[var4],
						anIntArray1783[var3], anIntArray1783[var2], anIntArray1783[var4],
						anIntArray1786[anIntArray1739[var1]]);
			else
				Class109_Sub21_Sub14_Sub3.method974(anIntArray1760[var3], anIntArray1760[var2], anIntArray1760[var4],
						anIntArray1783[var3], anIntArray1783[var2], anIntArray1783[var4], anIntArray1739[var1],
						anIntArray1753[var1], anIntArray1740[var1]);

		}
	}

	final boolean method951(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8) {
		return (var2 < var3) && (var2 < var4) && (var2 < var5) ? false
				: ((var2 > var3) && (var2 > var4) && (var2 > var5) ? false
						: ((var1 < var6) && (var1 < var7) && (var1 < var8) ? false
								: (var1 <= var6) || (var1 <= var7) || (var1 <= var8)));
	}

	public Class109_Sub21_Sub15_Sub4 method952(final boolean var1) {
		if (!var1 && (aByteArray1727.length < anInt1734))
			aByteArray1727 = new byte[anInt1734 + 100];

		return method936(var1, aClass109_Sub21_Sub15_Sub4_1787, aByteArray1727);
	}

	public Class109_Sub21_Sub15_Sub4(final Class109_Sub21_Sub15_Sub4[] var1, final int var2) {
		boolean var5 = false;
		boolean var6 = false;
		boolean var8 = false;
		boolean var7 = false;
		anInt1730 = 0;
		anInt1734 = 0;
		anInt1759 = 0;
		aByte1744 = -1;

		int var3;
		Class109_Sub21_Sub15_Sub4 var4;
		for (var3 = 0; var3 < var2; ++var3) {
			var4 = var1[var3];
			if (var4 != null) {
				anInt1730 += var4.anInt1730;
				anInt1734 += var4.anInt1734;
				anInt1759 += var4.anInt1759;
				if (var4.aByteArray1741 != null)
					var5 = true;
				else {
					if (aByte1744 == -1)
						aByte1744 = var4.aByte1744;

					if (aByte1744 != var4.aByte1744)
						var5 = true;
				}

				var6 |= var4.aByteArray1769 != null;
				var8 |= var4.aShortArray1751 != null;
				var7 |= var4.aByteArray1774 != null;
			}
		}

		anIntArray1731 = new int[anInt1730];
		anIntArray1765 = new int[anInt1730];
		anIntArray1728 = new int[anInt1730];
		anIntArray1735 = new int[anInt1734];
		anIntArray1736 = new int[anInt1734];
		anIntArray1737 = new int[anInt1734];
		anIntArray1739 = new int[anInt1734];
		anIntArray1753 = new int[anInt1734];
		anIntArray1740 = new int[anInt1734];
		if (var5)
			aByteArray1741 = new byte[anInt1734];

		if (var6)
			aByteArray1769 = new byte[anInt1734];

		if (var8)
			aShortArray1751 = new short[anInt1734];

		if (var7)
			aByteArray1774 = new byte[anInt1734];

		if (anInt1759 > 0) {
			anIntArray1758 = new int[anInt1759];
			anIntArray1747 = new int[anInt1759];
			anIntArray1726 = new int[anInt1759];
		}

		anInt1730 = 0;
		anInt1734 = 0;
		anInt1759 = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			var4 = var1[var3];
			if (var4 != null) {
				int var9;
				for (var9 = 0; var9 < var4.anInt1734; ++var9) {
					anIntArray1735[anInt1734] = var4.anIntArray1735[var9] + anInt1730;
					anIntArray1736[anInt1734] = var4.anIntArray1736[var9] + anInt1730;
					anIntArray1737[anInt1734] = var4.anIntArray1737[var9] + anInt1730;
					anIntArray1739[anInt1734] = var4.anIntArray1739[var9];
					anIntArray1753[anInt1734] = var4.anIntArray1753[var9];
					anIntArray1740[anInt1734] = var4.anIntArray1740[var9];
					if (var5)
						if (var4.aByteArray1741 != null)
							aByteArray1741[anInt1734] = var4.aByteArray1741[var9];
						else
							aByteArray1741[anInt1734] = var4.aByte1744;

					if (var6 && (var4.aByteArray1769 != null))
						aByteArray1769[anInt1734] = var4.aByteArray1769[var9];

					if (var8)
						if (var4.aShortArray1751 != null)
							aShortArray1751[anInt1734] = var4.aShortArray1751[var9];
						else
							aShortArray1751[anInt1734] = -1;

					if (var7)
						if ((var4.aByteArray1774 != null) && (var4.aByteArray1774[var9] != -1))
							aByteArray1774[anInt1734] = (byte) (var4.aByteArray1774[var9] + anInt1759);
						else
							aByteArray1774[anInt1734] = -1;

					++anInt1734;
				}

				for (var9 = 0; var9 < var4.anInt1759; ++var9) {
					anIntArray1758[anInt1759] = var4.anIntArray1758[var9] + anInt1730;
					anIntArray1747[anInt1759] = var4.anIntArray1747[var9] + anInt1730;
					anIntArray1726[anInt1759] = var4.anIntArray1726[var9] + anInt1730;
					++anInt1759;
				}

				for (var9 = 0; var9 < var4.anInt1730; ++var9) {
					anIntArray1731[anInt1730] = var4.anIntArray1731[var9];
					anIntArray1765[anInt1730] = var4.anIntArray1765[var9];
					anIntArray1728[anInt1730] = var4.anIntArray1728[var9];
					++anInt1730;
				}
			}
		}

	}

	public void method953(final Class109_Sub21_Sub17 var1, final int var2) {
		if (anIntArrayArray1749 != null) {
			final Class43 var3 = var1.aClass43Array1588[var2];
			final Class109_Sub6 var4 = var3.aClass109_Sub6_437;
			anInt1776 = 0;
			anInt1777 = 0;
			anInt1778 = 0;

			for (int var5 = 0; var5 < var3.anInt439; ++var5) {
				final int var6 = var3.anIntArray434[var5];
				method941(var4.anIntArray966[var6], var4.anIntArrayArray964[var6], var3.anIntArray441[var5],
						var3.anIntArray438[var5], var3.anIntArray442[var5]);
			}

			anInt1752 = 0;
		}
	}

	Class109_Sub21_Sub15_Sub4() {
	}

	public Class109_Sub21_Sub15_Sub4 method954(final boolean var1) {
		if (!var1 && (aByteArray1729.length < anInt1734))
			aByteArray1729 = new byte[anInt1734 + 100];

		return method936(var1, aClass109_Sub21_Sub15_Sub4_1732, aByteArray1729);
	}

	final void method955(final int var1) {
		final int var2 = Class109_Sub21_Sub14_Sub3.anInt1823;
		final int var16 = Class109_Sub21_Sub14_Sub3.anInt1824;
		int var3 = 0;
		final int var5 = anIntArray1735[var1];
		final int var8 = anIntArray1736[var1];
		final int var10 = anIntArray1737[var1];
		final int var13 = anIntArray1748[var5];
		final int var9 = anIntArray1748[var8];
		final int var12 = anIntArray1748[var10];
		if (aByteArray1769 == null)
			Class109_Sub21_Sub14_Sub3.anInt1819 = 0;
		else
			Class109_Sub21_Sub14_Sub3.anInt1819 = aByteArray1769[var1] & 255;

		int var4;
		int var6;
		int var11;
		int var15;
		if (var13 >= 50) {
			anIntArray1773[var3] = anIntArray1783[var5];
			anIntArray1779[var3] = anIntArray1760[var5];
			anIntArray1775[var3++] = anIntArray1739[var1];
		} else {
			var4 = anIntArray1762[var5];
			var15 = anIntArray1738[var5];
			var11 = anIntArray1739[var1];
			if (var12 >= 50) {
				var6 = (50 - var13) * anIntArray1743[var12 - var13];
				anIntArray1773[var3] = var2 + (((var4 + (((anIntArray1762[var10] - var4) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1779[var3] = var16 + (((var15 + (((anIntArray1738[var10] - var15) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1775[var3++] = var11 + (((anIntArray1740[var1] - var11) * var6) >> 16);
			}

			if (var9 >= 50) {
				var6 = (50 - var13) * anIntArray1743[var9 - var13];
				anIntArray1773[var3] = var2 + (((var4 + (((anIntArray1762[var8] - var4) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1779[var3] = var16 + (((var15 + (((anIntArray1738[var8] - var15) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1775[var3++] = var11 + (((anIntArray1753[var1] - var11) * var6) >> 16);
			}
		}

		if (var9 >= 50) {
			anIntArray1773[var3] = anIntArray1783[var8];
			anIntArray1779[var3] = anIntArray1760[var8];
			anIntArray1775[var3++] = anIntArray1753[var1];
		} else {
			var4 = anIntArray1762[var8];
			var15 = anIntArray1738[var8];
			var11 = anIntArray1753[var1];
			if (var13 >= 50) {
				var6 = (50 - var9) * anIntArray1743[var13 - var9];
				anIntArray1773[var3] = var2 + (((var4 + (((anIntArray1762[var5] - var4) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1779[var3] = var16 + (((var15 + (((anIntArray1738[var5] - var15) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1775[var3++] = var11 + (((anIntArray1739[var1] - var11) * var6) >> 16);
			}

			if (var12 >= 50) {
				var6 = (50 - var9) * anIntArray1743[var12 - var9];
				anIntArray1773[var3] = var2 + (((var4 + (((anIntArray1762[var10] - var4) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1779[var3] = var16 + (((var15 + (((anIntArray1738[var10] - var15) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1775[var3++] = var11 + (((anIntArray1740[var1] - var11) * var6) >> 16);
			}
		}

		if (var12 >= 50) {
			anIntArray1773[var3] = anIntArray1783[var10];
			anIntArray1779[var3] = anIntArray1760[var10];
			anIntArray1775[var3++] = anIntArray1740[var1];
		} else {
			var4 = anIntArray1762[var10];
			var15 = anIntArray1738[var10];
			var11 = anIntArray1740[var1];
			if (var9 >= 50) {
				var6 = (50 - var12) * anIntArray1743[var9 - var12];
				anIntArray1773[var3] = var2 + (((var4 + (((anIntArray1762[var8] - var4) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1779[var3] = var16 + (((var15 + (((anIntArray1738[var8] - var15) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1775[var3++] = var11 + (((anIntArray1753[var1] - var11) * var6) >> 16);
			}

			if (var13 >= 50) {
				var6 = (50 - var12) * anIntArray1743[var13 - var12];
				anIntArray1773[var3] = var2 + (((var4 + (((anIntArray1762[var5] - var4) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1779[var3] = var16 + (((var15 + (((anIntArray1738[var5] - var15) * var6) >> 16))
						* Class109_Sub21_Sub14_Sub3.anInt1822) / 50);
				anIntArray1775[var3++] = var11 + (((anIntArray1739[var1] - var11) * var6) >> 16);
			}
		}

		var4 = anIntArray1773[0];
		var15 = anIntArray1773[1];
		var11 = anIntArray1773[2];
		var6 = anIntArray1779[0];
		final int var7 = anIntArray1779[1];
		final int var19 = anIntArray1779[2];
		Class109_Sub21_Sub14_Sub3.aBool1820 = false;
		int var14;
		int var17;
		int var18;
		int var20;
		if (var3 == 3) {
			if ((var4 < 0) || (var15 < 0) || (var11 < 0) || (var4 > Class109_Sub21_Sub14_Sub3.anInt1827)
					|| (var15 > Class109_Sub21_Sub14_Sub3.anInt1827) || (var11 > Class109_Sub21_Sub14_Sub3.anInt1827))
				Class109_Sub21_Sub14_Sub3.aBool1820 = true;

			if ((aShortArray1751 != null) && (aShortArray1751[var1] != -1)) {
				if ((aByteArray1774 != null) && (aByteArray1774[var1] != -1)) {
					var17 = aByteArray1774[var1] & 255;
					var14 = anIntArray1758[var17];
					var18 = anIntArray1747[var17];
					var20 = anIntArray1726[var17];
				} else {
					var14 = var5;
					var18 = var8;
					var20 = var10;
				}

				if (anIntArray1740[var1] == -1)
					Class109_Sub21_Sub14_Sub3.method976(var6, var7, var19, var4, var15, var11, anIntArray1739[var1],
							anIntArray1739[var1], anIntArray1739[var1], anIntArray1762[var14], anIntArray1762[var18],
							anIntArray1762[var20], anIntArray1738[var14], anIntArray1738[var18], anIntArray1738[var20],
							anIntArray1748[var14], anIntArray1748[var18], anIntArray1748[var20], aShortArray1751[var1]);
				else
					Class109_Sub21_Sub14_Sub3.method976(var6, var7, var19, var4, var15, var11, anIntArray1775[0],
							anIntArray1775[1], anIntArray1775[2], anIntArray1762[var14], anIntArray1762[var18],
							anIntArray1762[var20], anIntArray1738[var14], anIntArray1738[var18], anIntArray1738[var20],
							anIntArray1748[var14], anIntArray1748[var18], anIntArray1748[var20], aShortArray1751[var1]);
			} else if (anIntArray1740[var1] == -1)
				Class109_Sub21_Sub14_Sub3.method967(var6, var7, var19, var4, var15, var11,
						anIntArray1786[anIntArray1739[var1]]);
			else
				Class109_Sub21_Sub14_Sub3.method974(var6, var7, var19, var4, var15, var11, anIntArray1775[0],
						anIntArray1775[1], anIntArray1775[2]);
		}

		if (var3 == 4) {
			if ((var4 < 0) || (var15 < 0) || (var11 < 0) || (var4 > Class109_Sub21_Sub14_Sub3.anInt1827)
					|| (var15 > Class109_Sub21_Sub14_Sub3.anInt1827) || (var11 > Class109_Sub21_Sub14_Sub3.anInt1827)
					|| (anIntArray1773[3] < 0) || (anIntArray1773[3] > Class109_Sub21_Sub14_Sub3.anInt1827))
				Class109_Sub21_Sub14_Sub3.aBool1820 = true;

			if ((aShortArray1751 != null) && (aShortArray1751[var1] != -1)) {
				if ((aByteArray1774 != null) && (aByteArray1774[var1] != -1)) {
					var17 = aByteArray1774[var1] & 255;
					var14 = anIntArray1758[var17];
					var18 = anIntArray1747[var17];
					var20 = anIntArray1726[var17];
				} else {
					var14 = var5;
					var18 = var8;
					var20 = var10;
				}

				final short var21 = aShortArray1751[var1];
				if (anIntArray1740[var1] == -1) {
					Class109_Sub21_Sub14_Sub3.method976(var6, var7, var19, var4, var15, var11, anIntArray1739[var1],
							anIntArray1739[var1], anIntArray1739[var1], anIntArray1762[var14], anIntArray1762[var18],
							anIntArray1762[var20], anIntArray1738[var14], anIntArray1738[var18], anIntArray1738[var20],
							anIntArray1748[var14], anIntArray1748[var18], anIntArray1748[var20], var21);
					Class109_Sub21_Sub14_Sub3.method976(var6, var19, anIntArray1779[3], var4, var11, anIntArray1773[3],
							anIntArray1739[var1], anIntArray1739[var1], anIntArray1739[var1], anIntArray1762[var14],
							anIntArray1762[var18], anIntArray1762[var20], anIntArray1738[var14], anIntArray1738[var18],
							anIntArray1738[var20], anIntArray1748[var14], anIntArray1748[var18], anIntArray1748[var20],
							var21);
				} else {
					Class109_Sub21_Sub14_Sub3.method976(var6, var7, var19, var4, var15, var11, anIntArray1775[0],
							anIntArray1775[1], anIntArray1775[2], anIntArray1762[var14], anIntArray1762[var18],
							anIntArray1762[var20], anIntArray1738[var14], anIntArray1738[var18], anIntArray1738[var20],
							anIntArray1748[var14], anIntArray1748[var18], anIntArray1748[var20], var21);
					Class109_Sub21_Sub14_Sub3.method976(var6, var19, anIntArray1779[3], var4, var11, anIntArray1773[3],
							anIntArray1775[0], anIntArray1775[2], anIntArray1775[3], anIntArray1762[var14],
							anIntArray1762[var18], anIntArray1762[var20], anIntArray1738[var14], anIntArray1738[var18],
							anIntArray1738[var20], anIntArray1748[var14], anIntArray1748[var18], anIntArray1748[var20],
							var21);
				}
			} else if (anIntArray1740[var1] == -1) {
				var14 = anIntArray1786[anIntArray1739[var1]];
				Class109_Sub21_Sub14_Sub3.method967(var6, var7, var19, var4, var15, var11, var14);
				Class109_Sub21_Sub14_Sub3.method967(var6, var19, anIntArray1779[3], var4, var11, anIntArray1773[3],
						var14);
			} else {
				Class109_Sub21_Sub14_Sub3.method974(var6, var7, var19, var4, var15, var11, anIntArray1775[0],
						anIntArray1775[1], anIntArray1775[2]);
				Class109_Sub21_Sub14_Sub3.method974(var6, var19, anIntArray1779[3], var4, var11, anIntArray1773[3],
						anIntArray1775[0], anIntArray1775[2], anIntArray1775[3]);
			}
		}

	}

	static {
		anIntArray1784 = Class109_Sub21_Sub14_Sub3.anIntArray1835;
		anIntArray1785 = Class109_Sub21_Sub14_Sub3.anIntArray1836;
		anIntArray1786 = Class109_Sub21_Sub14_Sub3.anIntArray1832;
		anIntArray1743 = Class109_Sub21_Sub14_Sub3.anIntArray1831;
	}
}
