public class Class109_Sub4_Sub3 extends Class109_Sub4 {
	int anInt1602 = 256;
	boolean aBool1620;
	long aLong1624;
	int anInt1623;
	int anInt1613;
	long aLong1610;
	int anInt1603 = 1000000;
	int[] anIntArray1604 = new int[16];
	int[] anIntArray1608 = new int[16];
	int[] anIntArray1606 = new int[16];
	int[] anIntArray1607 = new int[16];
	int[] anIntArray1605 = new int[16];
	int[] anIntArray1601 = new int[16];
	int[] anIntArray1609 = new int[16];
	int[] anIntArray1611 = new int[16];
	int[] anIntArray1612 = new int[16];
	int[] anIntArray1614 = new int[16];
	int[] anIntArray1615 = new int[16];
	int[] anIntArray1616 = new int[16];
	int[] anIntArray1617 = new int[16];
	int[] anIntArray1627 = new int[16];
	int[] anIntArray1619 = new int[16];
	Class109_Sub18[][] aClass109_Sub18ArrayArray1626 = new Class109_Sub18[16][128];
	Class109_Sub18[][] aClass109_Sub18ArrayArray1621 = new Class109_Sub18[16][128];
	Class103 aClass103_1625 = new Class103();
	Class109_Sub4_Sub4 aClass109_Sub4_Sub4_1622 = new Class109_Sub4_Sub4(this);
	Class116 aClass116_1618 = new Class116(128);

	public synchronized void method852(final int var1) {
		anInt1602 = var1;
	}

	void method853(final int var1) {
		if ((anIntArray1614[var1] & 4) != 0)
			for (Class109_Sub18 var2 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628
					.method458(); var2 != null; var2 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628
							.method449())
				if (var1 == var2.anInt1116)
					var2.anInt1108 = 0;

	}

	public synchronized boolean method854(final Class109_Sub19 var1, final Class104 var2, final Class17 var3,
			final int var4) {
		var1.method636();
		boolean var5 = true;
		final int[] var10 = new int[] { var4 };

		for (Class109_Sub22 var7 = (Class109_Sub22) var1.aClass116_1126
				.method432(); var7 != null; var7 = (Class109_Sub22) var1.aClass116_1126.method433()) {
			final int var9 = (int) var7.aLong802;
			Class109_Sub16 var6 = (Class109_Sub16) aClass116_1618.method429(var9);
			if (null == var6) {
				var6 = Class109_Sub21_Sub13.method757(var2, var9, -912682884);
				if (var6 == null) {
					var5 = false;
					continue;
				}

				aClass116_1618.method430(var6, var9);
			}

			if (!var6.method630(var3, var7.aByteArray1281, var10))
				var5 = false;
		}

		if (var5)
			var1.method635();

		return var5;
	}

	int method855() {
		return anInt1602;
	}

	synchronized void method856() {
		for (Class109_Sub16 var1 = (Class109_Sub16) aClass116_1618
				.method432(); var1 != null; var1 = (Class109_Sub16) aClass116_1618.method433())
			var1.method413();

	}

	public synchronized void method857(final Class109_Sub19 var1, final boolean var2) {
		method858();
		aClass103_1625.method371(var1.aByteArray1127);
		aBool1620 = var2;
		aLong1624 = 0L;
		final int var3 = aClass103_1625.method370();

		for (int var4 = 0; var4 < var3; ++var4) {
			aClass103_1625.method374(var4);
			aClass103_1625.method376(var4);
			aClass103_1625.method384(var4);
		}

		anInt1623 = aClass103_1625.method379();
		anInt1613 = aClass103_1625.anIntArray769[anInt1623];
		aLong1610 = aClass103_1625.method378(anInt1613);
	}

	public synchronized void method858() {
		aClass103_1625.method372();
		method870();
	}

	public synchronized boolean method859() {
		return aClass103_1625.method383();
	}

	public synchronized void method860(final int var1, final int var2) {
		method861(var1, var2);
	}

	void method861(final int var1, final int var2) {
		anIntArray1607[var1] = var2;
		anIntArray1601[var1] = var2 & -128;
		method862(var1, var2);
	}

	void method862(final int var1, final int var2) {
		if (var2 != anIntArray1605[var1]) {
			anIntArray1605[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3)
				aClass109_Sub18ArrayArray1621[var1][var3] = null;
		}

	}

	void method863(final int var1, final int var2, final int var3) {
		method881(var1, var2);
		if ((anIntArray1614[var1] & 2) != 0)
			for (Class109_Sub18 var6 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628
					.method455(); var6 != null; var6 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628
							.method457())
				if ((var6.anInt1116 == var1) && (var6.anInt1120 < 0)) {
					aClass109_Sub18ArrayArray1626[var1][var6.anInt1109] = null;
					aClass109_Sub18ArrayArray1626[var1][var2] = var6;
					final int var7 = var6.anInt1104 + ((var6.anInt1107 * var6.anInt1114) >> 12);
					var6.anInt1104 += (var2 - var6.anInt1109) << 8;
					var6.anInt1107 = var7 - var6.anInt1104;
					var6.anInt1114 = 4096;
					var6.anInt1109 = var2;
					return;
				}

		final Class109_Sub16 var9 = (Class109_Sub16) aClass116_1618.method429(anIntArray1605[var1]);
		if (null != var9) {
			final Class109_Sub3_Sub1 var5 = var9.aClass109_Sub3_Sub1Array1090[var2];
			if (var5 != null) {
				final Class109_Sub18 var4 = new Class109_Sub18();
				var4.anInt1116 = var1;
				var4.aClass109_Sub16_1105 = var9;
				var4.aClass109_Sub3_Sub1_1106 = var5;
				var4.aClass101_1111 = var9.aClass101Array1093[var2];
				var4.anInt1112 = var9.aByteArray1094[var2];
				var4.anInt1109 = var2;
				var4.anInt1110 = ((var3 * var3 * var9.anInt1092 * var9.aByteArray1098[var2]) + 1024) >> 11;
				var4.anInt1113 = var9.aByteArray1096[var2] & 255;
				var4.anInt1104 = (var2 << 8) - (var9.aShortArray1091[var2] & 32767);
				var4.anInt1115 = 0;
				var4.anInt1118 = 0;
				var4.anInt1117 = 0;
				var4.anInt1120 = -1;
				var4.anInt1119 = 0;
				if (anIntArray1617[var1] == 0)
					var4.aClass109_Sub4_Sub2_1122 = Class109_Sub4_Sub2.method817(var5, method872(var4), method880(var4),
							method873(var4));
				else {
					var4.aClass109_Sub4_Sub2_1122 = Class109_Sub4_Sub2.method817(var5, method872(var4), 0,
							method873(var4));
					method864(var4, var9.aShortArray1091[var2] < 0);
				}

				if (var9.aShortArray1091[var2] < 0)
					var4.aClass109_Sub4_Sub2_1122.method789(-1);

				if (var4.anInt1112 >= 0) {
					final Class109_Sub18 var8 = aClass109_Sub18ArrayArray1621[var1][var4.anInt1112];
					if ((var8 != null) && (var8.anInt1120 < 0)) {
						aClass109_Sub18ArrayArray1626[var1][var8.anInt1109] = null;
						var8.anInt1120 = 0;
					}

					aClass109_Sub18ArrayArray1621[var1][var4.anInt1112] = var4;
				}

				aClass109_Sub4_Sub4_1622.aClass126_1628.method450(var4);
				aClass109_Sub18ArrayArray1626[var1][var2] = var4;
			}
		}
	}

	void method864(final Class109_Sub18 var1, final boolean var2) {
		int var3 = var1.aClass109_Sub3_Sub1_1106.aByteArray1550.length;
		int var5;
		if (var2 && var1.aClass109_Sub3_Sub1_1106.aBool1551) {
			final int var4 = (var3 + var3) - var1.aClass109_Sub3_Sub1_1106.anInt1548;
			var5 = (int) (((long) anIntArray1617[var1.anInt1116] * (long) var4) >> 6);
			var3 <<= 8;
			if (var5 >= var3) {
				var5 = (var3 + var3) - 1 - var5;
				var1.aClass109_Sub4_Sub2_1122.method819(true);
			}
		} else
			var5 = (int) (((long) var3 * (long) anIntArray1617[var1.anInt1116]) >> 6);

		var1.aClass109_Sub4_Sub2_1122.method820(var5);
	}

	void method865() {
	}

	void method866(final int var1, final int var2) {
		anIntArray1609[var1] = var2;
	}

	void method867(final int var1) {
		for (Class109_Sub18 var2 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628
				.method458(); null != var2; var2 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628.method449())
			if ((var1 < 0) || (var2.anInt1116 == var1)) {
				if (var2.aClass109_Sub4_Sub2_1122 != null) {
					var2.aClass109_Sub4_Sub2_1122.method797(Class122.anInt848 / 100);
					if (var2.aClass109_Sub4_Sub2_1122.method816())
						aClass109_Sub4_Sub4_1622.aClass109_Sub4_Sub1_1630.method743(var2.aClass109_Sub4_Sub2_1122);

					var2.method633();
				}

				if (var2.anInt1120 < 0)
					aClass109_Sub18ArrayArray1626[var2.anInt1116][var2.anInt1109] = null;

				var2.method413();
			}

	}

	void method868(int var1) {
		if (var1 >= 0) {
			anIntArray1604[var1] = 12800;
			anIntArray1608[var1] = 8192;
			anIntArray1606[var1] = 16383;
			anIntArray1609[var1] = 8192;
			anIntArray1611[var1] = 0;
			anIntArray1612[var1] = 8192;
			method876(var1);
			method853(var1);
			anIntArray1614[var1] = 0;
			anIntArray1615[var1] = 32767;
			anIntArray1616[var1] = 256;
			anIntArray1617[var1] = 0;
			method882(var1, 8192);
		} else
			for (var1 = 0; var1 < 16; ++var1)
				method868(var1);
	}

	void method869(final int var1) {
		for (Class109_Sub18 var2 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628
				.method458(); null != var2; var2 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628.method449())
			if (((var1 < 0) || (var1 == var2.anInt1116)) && (var2.anInt1120 < 0)) {
				aClass109_Sub18ArrayArray1626[var2.anInt1116][var2.anInt1109] = null;
				var2.anInt1120 = 0;
			}

	}

	void method870() {
		method867(-1);
		method868(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1)
			anIntArray1605[var1] = anIntArray1607[var1];

		for (var1 = 0; var1 < 16; ++var1)
			anIntArray1601[var1] = anIntArray1607[var1] & -128;

	}

	void method871(final int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			method881(var3, var4);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			if (var5 > 0)
				method863(var3, var4, var5);
			else
				method881(var3, var4);

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			method877();
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			if (var4 == 0)
				anIntArray1601[var3] = (var5 << 14) + (anIntArray1601[var3] & -2080769);

			if (var4 == 32)
				anIntArray1601[var3] = (anIntArray1601[var3] & -16257) + (var5 << 7);

			if (var4 == 1)
				anIntArray1611[var3] = (anIntArray1611[var3] & -16257) + (var5 << 7);

			if (var4 == 33)
				anIntArray1611[var3] = var5 + (anIntArray1611[var3] & -128);

			if (var4 == 5)
				anIntArray1612[var3] = (anIntArray1612[var3] & -16257) + (var5 << 7);

			if (var4 == 37)
				anIntArray1612[var3] = (anIntArray1612[var3] & -128) + var5;

			if (var4 == 7)
				anIntArray1604[var3] = (anIntArray1604[var3] & -16257) + (var5 << 7);

			if (var4 == 39)
				anIntArray1604[var3] = var5 + (anIntArray1604[var3] & -128);

			if (var4 == 10)
				anIntArray1608[var3] = (var5 << 7) + (anIntArray1608[var3] & -16257);

			if (var4 == 42)
				anIntArray1608[var3] = var5 + (anIntArray1608[var3] & -128);

			if (var4 == 11)
				anIntArray1606[var3] = (var5 << 7) + (anIntArray1606[var3] & -16257);

			if (var4 == 43)
				anIntArray1606[var3] = var5 + (anIntArray1606[var3] & -128);

			if (var4 == 64)
				if (var5 >= 64)
					anIntArray1614[var3] |= 1;
				else
					anIntArray1614[var3] &= -2;

			if (var4 == 65)
				if (var5 >= 64)
					anIntArray1614[var3] |= 2;
				else {
					method876(var3);
					anIntArray1614[var3] &= -3;
				}

			if (var4 == 99)
				anIntArray1615[var3] = (anIntArray1615[var3] & 127) + (var5 << 7);

			if (var4 == 98)
				anIntArray1615[var3] = (anIntArray1615[var3] & 16256) + var5;

			if (var4 == 101)
				anIntArray1615[var3] = (var5 << 7) + 16384 + (anIntArray1615[var3] & 127);

			if (var4 == 100)
				anIntArray1615[var3] = (anIntArray1615[var3] & 16256) + 16384 + var5;

			if (var4 == 120)
				method867(var3);

			if (var4 == 121)
				method868(var3);

			if (var4 == 123)
				method869(var3);

			int var6;
			if (var4 == 6) {
				var6 = anIntArray1615[var3];
				if (var6 == 16384)
					anIntArray1616[var3] = (var5 << 7) + (anIntArray1616[var3] & -16257);
			}

			if (var4 == 38) {
				var6 = anIntArray1615[var3];
				if (var6 == 16384)
					anIntArray1616[var3] = (anIntArray1616[var3] & -128) + var5;
			}

			if (var4 == 16)
				anIntArray1617[var3] = (var5 << 7) + (anIntArray1617[var3] & -16257);

			if (var4 == 48)
				anIntArray1617[var3] = (anIntArray1617[var3] & -128) + var5;

			if (var4 == 81)
				if (var5 >= 64)
					anIntArray1614[var3] |= 4;
				else {
					method853(var3);
					anIntArray1614[var3] &= -5;
				}

			if (var4 == 17)
				method882(var3, (var5 << 7) + (anIntArray1627[var3] & -16257));

			if (var4 == 49)
				method882(var3, (anIntArray1627[var3] & -128) + var5);

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			method862(var3, var4 + anIntArray1601[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			method865();
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = ((var1 >> 8) & 127) + ((var1 >> 9) & 16256);
			method866(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255)
				method870();
		}
	}

	int method872(final Class109_Sub18 var1) {
		int var2 = ((var1.anInt1114 * var1.anInt1107) >> 12) + var1.anInt1104;
		var2 += (anIntArray1616[var1.anInt1116] * (anIntArray1609[var1.anInt1116] - 8192)) >> 12;
		final Class101 var3 = var1.aClass101_1111;
		int var4;
		if ((var3.anInt738 > 0) && ((var3.anInt741 > 0) || (anIntArray1611[var1.anInt1116] > 0))) {
			var4 = var3.anInt741 << 2;
			final int var5 = var3.anInt743 << 1;
			if (var1.anInt1124 < var5)
				var4 = (var4 * var1.anInt1124) / var5;

			var4 += anIntArray1611[var1.anInt1116] >> 7;
			final double var6 = Math.sin((var1.anInt1121 & 511) * 0.01227184630308513D);
			var2 += (int) (var6 * var4);
		}

		var4 = (int) (((var1.aClass109_Sub3_Sub1_1106.anInt1549 * 256 * Math.pow(2.0D, var2 * 3.255208333333333E-4D))
				/ Class122.anInt848) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	int method873(final Class109_Sub18 var1) {
		final int var2 = anIntArray1608[var1.anInt1116];
		return var2 < 8192 ? ((var2 * var1.anInt1113) + 32) >> 6
				: 16384 - ((((128 - var1.anInt1113) * (16384 - var2)) + 32) >> 6);
	}

	@Override
	protected synchronized Class109_Sub4 method509() {
		return aClass109_Sub4_Sub4_1622;
	}

	@Override
	protected synchronized int method506() {
		return 0;
	}

	@Override
	protected synchronized void method508(final int[] var1, int var2, int var3) {
		if (aClass103_1625.method383()) {
			final int var7 = (aClass103_1625.anInt773 * anInt1603) / Class122.anInt848;

			do {
				final long var4 = ((long) var7 * (long) var3) + aLong1624;
				if ((aLong1610 - var4) >= 0L) {
					aLong1624 = var4;
					break;
				}

				final int var6 = (int) (((var7 + (aLong1610 - aLong1624)) - 1L) / var7);
				aLong1624 += (long) var6 * (long) var7;
				aClass109_Sub4_Sub4_1622.method508(var1, var2, var6);
				var2 += var6;
				var3 -= var6;
				method874();
			} while (aClass103_1625.method383());
		}

		aClass109_Sub4_Sub4_1622.method508(var1, var2, var3);
	}

	@Override
	protected synchronized void method510(int var1) {
		if (aClass103_1625.method383()) {
			final int var2 = (aClass103_1625.anInt773 * anInt1603) / Class122.anInt848;

			do {
				final long var3 = ((long) var2 * (long) var1) + aLong1624;
				if ((aLong1610 - var3) >= 0L) {
					aLong1624 = var3;
					break;
				}

				final int var5 = (int) (((var2 + (aLong1610 - aLong1624)) - 1L) / var2);
				aLong1624 += (long) var2 * (long) var5;
				aClass109_Sub4_Sub4_1622.method510(var5);
				var1 -= var5;
				method874();
			} while (aClass103_1625.method383());
		}

		aClass109_Sub4_Sub4_1622.method510(var1);
	}

	void method874() {
		int var1 = anInt1623;
		int var2 = anInt1613;

		long var3;
		for (var3 = aLong1610; anInt1613 == var2; var3 = aClass103_1625.method378(var2)) {
			while (aClass103_1625.anIntArray769[var1] == var2) {
				aClass103_1625.method374(var1);
				final int var5 = aClass103_1625.method375(var1);
				if (var5 == 1) {
					aClass103_1625.method373();
					aClass103_1625.method384(var1);
					if (aClass103_1625.method380()) {
						if (!aBool1620 || (var2 == 0)) {
							method870();
							aClass103_1625.method372();
							return;
						}

						aClass103_1625.method381(var3);
					}
					break;
				}

				if ((var5 & 128) != 0)
					method871(var5);

				aClass103_1625.method376(var1);
				aClass103_1625.method384(var1);
			}

			var1 = aClass103_1625.method379();
			var2 = aClass103_1625.anIntArray769[var1];
		}

		anInt1623 = var1;
		anInt1613 = var2;
		aLong1610 = var3;
	}

	boolean method875(final Class109_Sub18 var1, final int[] var2, final int var3, final int var4) {
		var1.anInt1123 = Class122.anInt848 / 100;
		if ((var1.anInt1120 < 0)
				|| ((var1.aClass109_Sub4_Sub2_1122 != null) && !var1.aClass109_Sub4_Sub2_1122.method799())) {
			int var5 = var1.anInt1114;
			if (var5 > 0) {
				var5 -= (int) ((16.0D * Math.pow(2.0D, anIntArray1612[var1.anInt1116] * 4.921259842519685E-4D)) + 0.5D);
				if (var5 < 0)
					var5 = 0;

				var1.anInt1114 = var5;
			}

			var1.aClass109_Sub4_Sub2_1122.method818(method872(var1));
			final Class101 var6 = var1.aClass101_1111;
			boolean var9 = false;
			++var1.anInt1124;
			var1.anInt1121 += var6.anInt738;
			final double var7 = 5.086263020833333E-6D
					* (((var1.anInt1109 - 60) << 8) + ((var1.anInt1114 * var1.anInt1107) >> 12));
			if (var6.anInt740 > 0)
				if (var6.anInt742 > 0)
					var1.anInt1115 += (int) ((128.0D * Math.pow(2.0D, var6.anInt742 * var7)) + 0.5D);
				else
					var1.anInt1115 += 128;

			if (var6.aByteArray737 != null) {
				if (var6.anInt735 > 0)
					var1.anInt1118 += (int) ((128.0D * Math.pow(2.0D, var6.anInt735 * var7)) + 0.5D);
				else
					var1.anInt1118 += 128;

				while ((var1.anInt1117 < (var6.aByteArray737.length - 2))
						&& (var1.anInt1118 > ((var6.aByteArray737[var1.anInt1117 + 2] & 255) << 8)))
					var1.anInt1117 += 2;

				if ((var1.anInt1117 == (var6.aByteArray737.length - 2))
						&& (var6.aByteArray737[var1.anInt1117 + 1] == 0))
					var9 = true;
			}

			if ((var1.anInt1120 >= 0) && (var6.aByteArray736 != null) && ((anIntArray1614[var1.anInt1116] & 1) == 0)
					&& ((var1.anInt1112 < 0)
							|| (var1 != aClass109_Sub18ArrayArray1621[var1.anInt1116][var1.anInt1112]))) {
				if (var6.anInt739 > 0)
					var1.anInt1120 += (int) ((128.0D * Math.pow(2.0D, var7 * var6.anInt739)) + 0.5D);
				else
					var1.anInt1120 += 128;

				while ((var1.anInt1119 < (var6.aByteArray736.length - 2))
						&& (var1.anInt1120 > ((var6.aByteArray736[2 + var1.anInt1119] & 255) << 8)))
					var1.anInt1119 += 2;

				if ((var6.aByteArray736.length - 2) == var1.anInt1119)
					var9 = true;
			}

			if (var9) {
				var1.aClass109_Sub4_Sub2_1122.method797(var1.anInt1123);
				if (null != var2)
					var1.aClass109_Sub4_Sub2_1122.method508(var2, var3, var4);
				else
					var1.aClass109_Sub4_Sub2_1122.method510(var4);

				if (var1.aClass109_Sub4_Sub2_1122.method816())
					aClass109_Sub4_Sub4_1622.aClass109_Sub4_Sub1_1630.method743(var1.aClass109_Sub4_Sub2_1122);

				var1.method633();
				if (var1.anInt1120 >= 0) {
					var1.method413();
					if ((var1.anInt1112 > 0) && (var1 == aClass109_Sub18ArrayArray1621[var1.anInt1116][var1.anInt1112]))
						aClass109_Sub18ArrayArray1621[var1.anInt1116][var1.anInt1112] = null;
				}

				return true;
			} else {
				var1.aClass109_Sub4_Sub2_1122.method796(var1.anInt1123, method880(var1), method873(var1));
				return false;
			}
		} else {
			var1.method633();
			var1.method413();
			if ((var1.anInt1112 > 0) && (var1 == aClass109_Sub18ArrayArray1621[var1.anInt1116][var1.anInt1112]))
				aClass109_Sub18ArrayArray1621[var1.anInt1116][var1.anInt1112] = null;

			return true;
		}
	}

	void method876(final int var1) {
		if ((anIntArray1614[var1] & 2) != 0)
			for (Class109_Sub18 var2 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628
					.method458(); null != var2; var2 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628
							.method449())
				if ((var1 == var2.anInt1116) && (null == aClass109_Sub18ArrayArray1626[var1][var2.anInt1109])
						&& (var2.anInt1120 < 0))
					var2.anInt1120 = 0;

	}

	void method877() {
	}

	boolean method878(final Class109_Sub18 var1) {
		if (null == var1.aClass109_Sub4_Sub2_1122) {
			if (var1.anInt1120 >= 0) {
				var1.method413();
				if ((var1.anInt1112 > 0) && (aClass109_Sub18ArrayArray1621[var1.anInt1116][var1.anInt1112] == var1))
					aClass109_Sub18ArrayArray1621[var1.anInt1116][var1.anInt1112] = null;
			}

			return true;
		} else
			return false;
	}

	public synchronized void method879() {
		for (Class109_Sub16 var1 = (Class109_Sub16) aClass116_1618
				.method432(); null != var1; var1 = (Class109_Sub16) aClass116_1618.method433())
			var1.method629();

	}

	int method880(final Class109_Sub18 var1) {
		final Class101 var2 = var1.aClass101_1111;
		int var3 = (4096 + (anIntArray1604[var1.anInt1116] * anIntArray1606[var1.anInt1116])) >> 13;
		var3 = ((var3 * var3) + 16384) >> 15;
		var3 = (16384 + (var3 * var1.anInt1110)) >> 15;
		var3 = (128 + (var3 * anInt1602)) >> 8;
		if (var2.anInt740 > 0)
			var3 = (int) ((var3 * Math.pow(0.5D, var1.anInt1115 * 1.953125E-5D * var2.anInt740)) + 0.5D);

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.aByteArray737 != null) {
			var5 = var1.anInt1118;
			var4 = var2.aByteArray737[var1.anInt1117 + 1];
			if (var1.anInt1117 < (var2.aByteArray737.length - 2)) {
				var7 = (var2.aByteArray737[var1.anInt1117] & 255) << 8;
				var6 = (var2.aByteArray737[var1.anInt1117 + 2] & 255) << 8;
				var4 += ((var2.aByteArray737[var1.anInt1117 + 3] - var4) * (var5 - var7)) / (var6 - var7);
			}

			var3 = (32 + (var4 * var3)) >> 6;
		}

		if ((var1.anInt1120 > 0) && (var2.aByteArray736 != null)) {
			var5 = var1.anInt1120;
			var4 = var2.aByteArray736[1 + var1.anInt1119];
			if (var1.anInt1119 < (var2.aByteArray736.length - 2)) {
				var7 = (var2.aByteArray736[var1.anInt1119] & 255) << 8;
				var6 = (var2.aByteArray736[var1.anInt1119 + 2] & 255) << 8;
				var4 += ((var2.aByteArray736[3 + var1.anInt1119] - var4) * (var5 - var7)) / (var6 - var7);
			}

			var3 = (32 + (var3 * var4)) >> 6;
		}

		return var3;
	}

	void method881(final int var1, final int var2) {
		final Class109_Sub18 var3 = aClass109_Sub18ArrayArray1626[var1][var2];
		if (var3 != null) {
			aClass109_Sub18ArrayArray1626[var1][var2] = null;
			if ((anIntArray1614[var1] & 2) != 0) {
				for (Class109_Sub18 var4 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628
						.method458(); var4 != null; var4 = (Class109_Sub18) aClass109_Sub4_Sub4_1622.aClass126_1628
								.method449())
					if ((var3.anInt1116 == var4.anInt1116) && (var4.anInt1120 < 0) && (var4 != var3)) {
						var3.anInt1120 = 0;
						break;
					}
			} else
				var3.anInt1120 = 0;

		}
	}

	void method882(final int var1, final int var2) {
		anIntArray1627[var1] = var2;
		anIntArray1619[var1] = (int) ((2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * var2)) + 0.5D);
	}

	@Override
	protected synchronized Class109_Sub4 method505() {
		return null;
	}

	public Class109_Sub4_Sub3() {
		method870();
	}
}
