import java.awt.Graphics;

public abstract class Class109_Sub21_Sub15_Sub3 extends Class109_Sub21_Sub15 {
	int anInt1654;
	int anInt1662;
	boolean aBool1666;
	int anInt1675;
	int anInt1680;
	int anInt1690;
	int anInt1691;
	int anInt1692;
	int anInt1693;
	int anInt1694;
	int anInt1695;
	int anInt1697;
	int anInt1698;
	int anInt1699;
	int anInt1683 = -1;
	int anInt1705 = 0;
	int anInt1709 = 0;
	int anInt1708 = 0;
	int anInt1710;
	int anInt1653;
	boolean aBool1704 = false;
	int anInt1656 = 1;
	int anInt1657 = -1;
	int anInt1658 = -1;
	int anInt1659 = -1;
	int anInt1660 = -1;
	int anInt1661 = -1;
	int anInt1678 = -1;
	int anInt1696 = -1;
	int anInt1679 = -1;
	String aString1702 = null;
	boolean aBool1667 = false;
	int anInt1668 = 100;
	int anInt1669 = 0;
	int anInt1670 = 0;
	int[] anIntArray1671 = new int[4];
	int[] anIntArray1672 = new int[4];
	int[] anIntArray1673 = new int[4];
	int anInt1674 = -1000;
	int anInt1677 = -1;
	int anInt1664 = 0;
	int anInt1665 = 0;
	int anInt1663 = -1;
	int anInt1681 = 0;
	int anInt1707 = 0;
	int anInt1684 = 0;
	int anInt1685 = 0;
	int anInt1689 = 0;
	int anInt1687 = 0;
	int anInt1688 = -1;
	int anInt1676 = 0;
	int anInt1701 = 0;
	int anInt1700 = 0;
	int anInt1652 = 200;
	int anInt1703 = 0;
	int anInt1686 = 32;
	int[] anIntArray1655 = new int[10];
	int[] anIntArray1706 = new int[10];
	boolean[] aBoolArray1682 = new boolean[10];

	public static Class74[] method894() {
		return new Class74[] { Class74.aClass74_607, Class74.aClass74_608, Class74.aClass74_605, Class74.aClass74_609,
				Class74.aClass74_611, Class74.aClass74_606 };
	}

	final void method895(final int var1, final int var2, final boolean var3) {
		if ((anInt1683 != -1) && (Class109_Sub21_Sub18.method849(anInt1683, 900768574).anInt1406 == 1))
			anInt1683 = -1;

		if (!var3) {
			final int var6 = var1 - anIntArray1655[0];
			final int var4 = var2 - anIntArray1706[0];
			if ((var6 >= -8) && (var6 <= 8) && (var4 >= -8) && (var4 <= 8)) {
				if (anInt1705 < 9)
					++anInt1705;

				for (int var5 = anInt1705; var5 > 0; --var5) {
					anIntArray1655[var5] = anIntArray1655[var5 - 1];
					anIntArray1706[var5] = anIntArray1706[var5 - 1];
					aBoolArray1682[var5] = aBoolArray1682[var5 - 1];
				}

				anIntArray1655[0] = var1;
				anIntArray1706[0] = var2;
				aBoolArray1682[0] = false;
				return;
			}
		}

		anInt1705 = 0;
		anInt1709 = 0;
		anInt1708 = 0;
		anIntArray1655[0] = var1;
		anIntArray1706[0] = var2;
		anInt1710 = (anIntArray1655[0] * 128) + (anInt1656 * 64);
		anInt1653 = (anIntArray1706[0] * 128) + (anInt1656 * 64);
	}

	final void method896(final int var1, final boolean var2) {
		int var3 = anIntArray1655[0];
		int var4 = anIntArray1706[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1)
			++var4;

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3)
			--var3;

		if (var1 == 4)
			++var3;

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6)
			--var4;

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if ((anInt1683 != -1) && (Class109_Sub21_Sub18.method849(anInt1683, 29794266).anInt1406 == 1))
			anInt1683 = -1;

		if (anInt1705 < 9)
			++anInt1705;

		for (int var5 = anInt1705; var5 > 0; --var5) {
			anIntArray1655[var5] = anIntArray1655[var5 - 1];
			anIntArray1706[var5] = anIntArray1706[var5 - 1];
			aBoolArray1682[var5] = aBoolArray1682[var5 - 1];
		}

		anIntArray1655[0] = var3;
		anIntArray1706[0] = var4;
		aBoolArray1682[0] = var2;
	}

	boolean method897(final int var1) {
		return false;
	}

	final void method898(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < 4; ++var4)
			if (anIntArray1673[var4] <= var3) {
				anIntArray1671[var4] = var1;
				anIntArray1672[var4] = var2;
				anIntArray1673[var4] = var3 + 70;
				return;
			}

	}

	final void method899() {
		anInt1705 = 0;
		anInt1709 = 0;
	}

	static void method900() {
		for (int var0 = 0; var0 < client.anInt2045; ++var0)
			if (Class20.method90(client.anIntArray2113[var0])) {
				if (var0 < (client.anInt2045 - 1))
					for (int var1 = var0; var1 < (client.anInt2045 - 1); ++var1) {
						client.aStringArray1975[var1] = client.aStringArray1975[1 + var1];
						client.aStringArray2123[var1] = client.aStringArray2123[var1 + 1];
						client.anIntArray2113[var1] = client.anIntArray2113[1 + var1];
						client.anIntArray2114[var1] = client.anIntArray2114[1 + var1];
						client.anIntArray2111[var1] = client.anIntArray2111[var1 + 1];
						client.anIntArray2112[var1] = client.anIntArray2112[var1 + 1];
					}

				--client.anInt2045;
			}

	}

	static void method901(final Class109_Sub21_Sub14_Sub4_Sub1 var0, final Class109_Sub21_Sub14_Sub4_Sub1 var1,
			final Class109_Sub21_Sub14_Sub4_Sub1 var2, final boolean var3) {
		if (var3) {
			Class5.anInt48 = (LoginEncoder.anInt524 - client.anInt2185) / 2;
			Class5.anInt71 = Class5.anInt48 + 202;
		}

		int var5;
		int var7;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var32;
		int var34;
		byte var36;
		int var37;
		if (Class5.aBool73) {
			if (null == Class3.aClass109_Sub21_Sub14_Sub2Array27)
				Class3.aClass109_Sub21_Sub14_Sub2Array27 = Class55.method265(Class28.aClass104_Sub1_265, "sl_back", "");

			if (Class31.aClass109_Sub21_Sub14_Sub1Array312 == null)
				Class31.aClass109_Sub21_Sub14_Sub1Array312 = Class50.method251(Class28.aClass104_Sub1_265, "sl_flags",
						"");

			if (Class21.aClass109_Sub21_Sub14_Sub1Array197 == null)
				Class21.aClass109_Sub21_Sub14_Sub1Array197 = Class50.method251(Class28.aClass104_Sub1_265, "sl_arrows",
						"");

			if (null == Class5.aClass109_Sub21_Sub14_Sub1Array51)
				Class5.aClass109_Sub21_Sub14_Sub1Array51 = Class50.method251(Class28.aClass104_Sub1_265, "sl_stars",
						"");

			Class109_Sub21_Sub14.method773(Class5.anInt48, 23, 765, 480, 0);
			Class109_Sub21_Sub14.method774(Class5.anInt48, 0, 125, 23, 12425273, 9135624);
			Class109_Sub21_Sub14.method774(Class5.anInt48 + 125, 0, 640, 23, 5197647, 2697513);
			var0.method1016("Select a world", 62 + Class5.anInt48, 15, 0, -1);
			if (null != Class5.aClass109_Sub21_Sub14_Sub1Array51) {
				Class5.aClass109_Sub21_Sub14_Sub1Array51[1].method905(Class5.anInt48 + 140, 1);
				var1.method1014("Members only world", Class5.anInt48 + 152, 10, 16777215, -1);
				Class5.aClass109_Sub21_Sub14_Sub1Array51[0].method905(140 + Class5.anInt48, 12);
				var1.method1014("Free world", Class5.anInt48 + 152, 21, 16777215, -1);
			}

			if (null != Class21.aClass109_Sub21_Sub14_Sub1Array197) {
				var32 = Class5.anInt48 + 280;
				if ((Class46.anIntArray484[0] == 0) && (Class46.anIntArray483[0] == 0))
					Class21.aClass109_Sub21_Sub14_Sub1Array197[2].method905(var32, 4);
				else
					Class21.aClass109_Sub21_Sub14_Sub1Array197[0].method905(var32, 4);

				if ((Class46.anIntArray484[0] == 0) && (Class46.anIntArray483[0] == 1))
					Class21.aClass109_Sub21_Sub14_Sub1Array197[3].method905(var32 + 15, 4);
				else
					Class21.aClass109_Sub21_Sub14_Sub1Array197[1].method905(15 + var32, 4);

				var0.method1014("World", var32 + 32, 17, 16777215, -1);
				var5 = 390 + Class5.anInt48;
				if ((Class46.anIntArray484[0] == 1) && (Class46.anIntArray483[0] == 0))
					Class21.aClass109_Sub21_Sub14_Sub1Array197[2].method905(var5, 4);
				else
					Class21.aClass109_Sub21_Sub14_Sub1Array197[0].method905(var5, 4);

				if ((Class46.anIntArray484[0] == 1) && (Class46.anIntArray483[0] == 1))
					Class21.aClass109_Sub21_Sub14_Sub1Array197[3].method905(var5 + 15, 4);
				else
					Class21.aClass109_Sub21_Sub14_Sub1Array197[1].method905(15 + var5, 4);

				var0.method1014("Players", 32 + var5, 17, 16777215, -1);
				var34 = Class5.anInt48 + 500;
				if ((Class46.anIntArray484[0] == 2) && (Class46.anIntArray483[0] == 0))
					Class21.aClass109_Sub21_Sub14_Sub1Array197[2].method905(var34, 4);
				else
					Class21.aClass109_Sub21_Sub14_Sub1Array197[0].method905(var34, 4);

				if ((Class46.anIntArray484[0] == 2) && (Class46.anIntArray483[0] == 1))
					Class21.aClass109_Sub21_Sub14_Sub1Array197[3].method905(15 + var34, 4);
				else
					Class21.aClass109_Sub21_Sub14_Sub1Array197[1].method905(15 + var34, 4);

				var0.method1014("Location", var34 + 32, 17, 16777215, -1);
				var7 = Class5.anInt48 + 610;
				if ((Class46.anIntArray484[0] == 3) && (Class46.anIntArray483[0] == 0))
					Class21.aClass109_Sub21_Sub14_Sub1Array197[2].method905(var7, 4);
				else
					Class21.aClass109_Sub21_Sub14_Sub1Array197[0].method905(var7, 4);

				if ((Class46.anIntArray484[0] == 3) && (Class46.anIntArray483[0] == 1))
					Class21.aClass109_Sub21_Sub14_Sub1Array197[3].method905(var7 + 15, 4);
				else
					Class21.aClass109_Sub21_Sub14_Sub1Array197[1].method905(var7 + 15, 4);

				var0.method1014("Type", 32 + var7, 17, 16777215, -1);
			}

			Class109_Sub21_Sub14.method773(708 + Class5.anInt48, 4, 50, 16, 0);
			var1.method1016("Cancel", Class5.anInt48 + 708 + 25, 16, 16777215, -1);
			var32 = 0;
			var5 = 33554432;
			var34 = client.anInt1971 & var5;

			for (var7 = 0; var7 < Class46.anInt481; ++var7) {
				final Class46 var8 = Class46.aClass46Array485[var7];
				if ((var34 == (var8.anInt480 & var5)) || ((var8.anInt480 & var5) == 0))
					++var32;
			}

			Class5.anInt75 = -1;
			if (null != Class3.aClass109_Sub21_Sub14_Sub2Array27) {
				var36 = 88;
				final byte var38 = 19;
				var37 = 765 / (var36 + 1);
				var11 = 480 / (var38 + 1);

				do {
					var12 = var11;
					var13 = var37;
					if (((var37 - 1) * var11) >= var32)
						--var37;

					if ((var37 * (var11 - 1)) >= var32)
						--var11;

					if ((var37 * (var11 - 1)) >= var32)
						--var11;
				} while ((var11 != var12) || (var13 != var37));

				var12 = (765 - (var37 * var36)) / (var37 + 1);
				if (var12 > 5)
					var12 = 5;

				var13 = (480 - (var38 * var11)) / (1 + var11);
				if (var13 > 5)
					var13 = 5;

				var14 = (765 - (var36 * var37) - (var12 * (var37 - 1))) / 2;
				var15 = (480 - (var11 * var38) - (var13 * (var11 - 1))) / 2;
				int var16 = var15 + 23;
				int var17 = Class5.anInt48 + var14;
				int var18 = 0;
				boolean var19 = false;

				int var20;
				for (var20 = 0; var20 < Class46.anInt481; ++var20) {
					final Class46 var21 = Class46.aClass46Array485[var20];
					if ((var34 == (var21.anInt480 & var5)) || ((var21.anInt480 & var5) == 0)) {
						boolean var22 = true;
						String var23 = Integer.toString(var21.anInt479);
						if (var21.anInt479 == -1) {
							var23 = "OFF";
							var22 = false;
						} else if (var21.anInt479 > 1980) {
							var23 = "FULL";
							var22 = false;
						}

						byte var24;
						if (var21.method236()) {
							if (var21.method234())
								var24 = 3;
							else
								var24 = 2;
						} else if (var21.method234())
							var24 = 1;
						else
							var24 = 0;

						if ((Class81.anInt637 >= var17) && (Class81.anInt638 >= var16)
								&& (Class81.anInt637 < (var36 + var17)) && (Class81.anInt638 < (var16 + var38))
								&& var22) {
							Class5.anInt75 = var20;
							Class3.aClass109_Sub21_Sub14_Sub2Array27[var24].method918(var17, var16, 128, 16777215);
							var19 = true;
						} else
							Class3.aClass109_Sub21_Sub14_Sub2Array27[var24].method914(var17, var16);

						if (null != Class31.aClass109_Sub21_Sub14_Sub1Array312)
							Class31.aClass109_Sub21_Sub14_Sub1Array312[(var21.method234() ? 8 : 0) + var21.anInt489]
									.method905(29 + var17, var16);

						var0.method1016(Integer.toString(var21.anInt492), 15 + var17, (var38 / 2) + var16 + 5, 0, -1);
						var1.method1016(var23, 60 + var17, 5 + var16 + (var38 / 2), 268435455, -1);
						var16 += var38 + var13;
						++var18;
						if (var18 >= var11) {
							var16 = var15 + 23;
							var17 += var12 + var36;
							var18 = 0;
						}
					}
				}

				if (var19) {
					var20 = var1.method1010(Class46.aClass46Array485[Class5.anInt75].aString488) + 6;
					final int var25 = var1.anInt1907 + 8;
					Class109_Sub21_Sub14.method773(Class81.anInt637 - (var20 / 2), Class81.anInt638 + 20 + 5, var20,
							var25, 16777120);
					Class109_Sub21_Sub14.method775(Class81.anInt637 - (var20 / 2), 5 + 20 + Class81.anInt638, var20,
							var25, 0);
					var1.method1016(Class46.aClass46Array485[Class5.anInt75].aString488, Class81.anInt637,
							20 + Class81.anInt638 + 5 + var1.anInt1907 + 4, 0, -1);
				}
			}

			try {
				final Graphics var40 = Class109_Sub21_Sub10.aCanvas1472.getGraphics();
				Class44.aClass8_453.method50(var40, 0, 0, (byte) 1);
			} catch (final Exception var29) {
				Class109_Sub21_Sub10.aCanvas1472.repaint();
			}

		} else {
			if (var3) {
				Class49.aClass109_Sub21_Sub14_Sub2_511.method914(Class5.anInt48, 0);
				Class8_Sub2.aClass109_Sub21_Sub14_Sub2_904.method914(382 + Class5.anInt48, 0);
				Class5.aClass109_Sub21_Sub14_Sub1_52
						.method905((382 + Class5.anInt48) - (Class5.aClass109_Sub21_Sub14_Sub1_52.anInt1713 / 2), 18);
			}

			if ((client.anInt2180 == 0) || (client.anInt2180 == 5)) {
				final byte var4 = 20;
				var0.method1016("RuneScape is loading - please wait...", 180 + Class5.anInt71, 245 - var4, 16777215,
						-1);
				var5 = 253 - var4;
				Class109_Sub21_Sub14.method775((Class5.anInt71 + 180) - 152, var5, 304, 34, 9179409);
				Class109_Sub21_Sub14.method775((180 + Class5.anInt71) - 151, var5 + 1, 302, 32, 0);
				Class109_Sub21_Sub14.method773((180 + Class5.anInt71) - 150, 2 + var5, Class5.anInt61 * 3, 30, 9179409);
				Class109_Sub21_Sub14.method773((Class5.anInt61 * 3) + ((Class5.anInt71 + 180) - 150), 2 + var5,
						300 - (Class5.anInt61 * 3), 30, 0);
				var0.method1016(Class5.aString62, Class5.anInt71 + 180, 276 - var4, 16777215, -1);
			}

			String var27;
			short var31;
			short var33;
			if (client.anInt2180 == 20) {
				Class5.aClass109_Sub21_Sub14_Sub1_59.method905(
						(180 + Class5.anInt71) - (Class5.aClass109_Sub21_Sub14_Sub1_59.anInt1713 / 2),
						271 - (Class5.aClass109_Sub21_Sub14_Sub1_59.anInt1714 / 2));
				var31 = 211;
				var0.method1016(Class5.aString64, 180 + Class5.anInt71, var31, 16776960, 0);
				var32 = var31 + 15;
				var0.method1016(Class5.aString65, Class5.anInt71 + 180, var32, 16776960, 0);
				var32 += 15;
				var0.method1016(Class5.aString66, 180 + Class5.anInt71, var32, 16776960, 0);
				var32 += 15;
				var32 += 10;
				if (Class5.anInt63 != 4) {
					var0.method1014("Login: ", (Class5.anInt71 + 180) - 110, var32, 16777215, 0);
					var33 = 200;

					for (var27 = Class5.aString67; var0.method1010(var27) > var33; var27 = var27.substring(0,
							var27.length() - 1))
						;

					var0.method1014(Class109_Sub21_Sub14_Sub4.method1013(var27), (Class5.anInt71 + 180) - 70, var32,
							16777215, 0);
					var32 += 15;
					var0.method1014("Password: " + Class109_Sub10.method534(Class5.aString68),
							(Class5.anInt71 + 180) - 108, var32, 16777215, 0);
					var32 += 15;
				}
			}

			int var35;
			if ((client.anInt2180 == 10) || (client.anInt2180 == 11)) {
				Class5.aClass109_Sub21_Sub14_Sub1_59.method905(Class5.anInt71, 171);
				short var6;
				if (Class5.anInt63 == 0) {
					var31 = 251;
					var0.method1016("Welcome to RuneScape", 180 + Class5.anInt71, var31, 16776960, 0);
					var32 = var31 + 30;
					var5 = (Class5.anInt71 + 180) - 80;
					var6 = 291;
					Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var5 - 73, var6 - 20);
					var0.method1017("New User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = 80 + 180 + Class5.anInt71;
					Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var5 - 73, var6 - 20);
					var0.method1017("Existing User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Class5.anInt63 == 1) {
					var0.method1016("Warning!", Class5.anInt71 + 180, 211, 16776960, 0);
					var31 = 236;
					var0.method1016(Class5.aString64, Class5.anInt71 + 180, var31, 16777215, 0);
					var32 = var31 + 15;
					var0.method1016(Class5.aString65, Class5.anInt71 + 180, var32, 16777215, 0);
					var32 += 15;
					var0.method1016(Class5.aString66, 180 + Class5.anInt71, var32, 16777215, 0);
					var32 += 15;
					var5 = (Class5.anInt71 + 180) - 80;
					var6 = 321;
					Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var5 - 73, var6 - 20);
					var0.method1016("Continue", var5, var6 + 5, 16777215, 0);
					var5 = 80 + 180 + Class5.anInt71;
					Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var5 - 73, var6 - 20);
					var0.method1016("Cancel", var5, var6 + 5, 16777215, 0);
				} else {
					short var9;
					if (Class5.anInt63 == 2) {
						var31 = 211;
						var0.method1016(Class5.aString64, Class5.anInt71 + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.method1016(Class5.aString65, Class5.anInt71 + 180, var32, 16776960, 0);
						var32 += 15;
						var0.method1016(Class5.aString66, 180 + Class5.anInt71, var32, 16776960, 0);
						var32 += 15;
						var32 += 10;
						var0.method1014("Login: ", (180 + Class5.anInt71) - 110, var32, 16777215, 0);
						var33 = 200;

						for (var27 = Class5.aString67; var0.method1010(var27) > var33; var27 = var27.substring(1))
							;

						var0.method1014(
								Class109_Sub21_Sub14_Sub4.method1013(var27)
										+ ((Class5.anInt76 == 0) & ((client.anInt1979 % 40) < 20)
												? Class109_Sub11.method544(16776960) + "|" : ""),
								(Class5.anInt71 + 180) - 70, var32, 16777215, 0);
						var32 += 15;
						var0.method1014(
								"Password: " + Class109_Sub10.method534(Class5.aString68)
										+ ((Class5.anInt76 == 1) & ((client.anInt1979 % 40) < 20)
												? Class109_Sub11.method544(16776960) + "|" : ""),
								(Class5.anInt71 + 180) - 108, var32, 16777215, 0);
						var32 += 15;
						var7 = (Class5.anInt71 + 180) - 80;
						var9 = 321;
						Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var7 - 73, var9 - 20);
						var0.method1016("Login", var7, var9 + 5, 16777215, 0);
						var7 = 80 + 180 + Class5.anInt71;
						Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var7 - 73, var9 - 20);
						var0.method1016("Cancel", var7, var9 + 5, 16777215, 0);
						var31 = 357;
						var1.method1016("Forgotten your password? <col=ffffff>Click here.", 180 + Class5.anInt71, var31,
								16776960, 0);
					} else if (Class5.anInt63 == 4) {
						var0.method1016("Authenticator", 180 + Class5.anInt71, 211, 16776960, 0);
						var31 = 236;
						var0.method1016(Class5.aString64, Class5.anInt71 + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.method1016(Class5.aString65, 180 + Class5.anInt71, var32, 16777215, 0);
						var32 += 15;
						var0.method1016(Class5.aString66, 180 + Class5.anInt71, var32, 16777215, 0);
						var32 += 15;
						var0.method1014(
								"PIN: " + Class109_Sub10.method534(Class40.aString370) + ((client.anInt1979 % 40) < 20
										? Class109_Sub11.method544(16776960) + "|" : ""),
								(180 + Class5.anInt71) - 108, var32, 16777215, 0);
						var32 -= 8;
						var0.method1014("Trust this computer", (180 + Class5.anInt71) - 9, var32, 16776960, 0);
						var32 += 15;
						var0.method1014("for 30 days: ", (180 + Class5.anInt71) - 9, var32, 16776960, 0);
						var5 = ((Class5.anInt71 + 180) - 9) + var0.method1010("for 30 days: ") + 15;
						var34 = var32 - var0.anInt1907;
						Class109_Sub21_Sub14_Sub1 var26;
						if (Class5.aBool70)
							var26 = Class33.aClass109_Sub21_Sub14_Sub1_324;
						else
							var26 = Class5.aClass109_Sub21_Sub14_Sub1_54;

						var26.method905(var5, var34);
						var32 += 15;
						var35 = (180 + Class5.anInt71) - 80;
						final short var10 = 321;
						Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var35 - 73, var10 - 20);
						var0.method1016("Continue", var35, var10 + 5, 16777215, 0);
						var35 = 180 + Class5.anInt71 + 80;
						Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var35 - 73, var10 - 20);
						var0.method1016("Cancel", var35, var10 + 5, 16777215, 0);
						var1.method1016("<u=ff>Can\'t Log In?</u>", 180 + Class5.anInt71, 36 + var10, 255, 0);
					} else if (Class5.anInt63 == 5) {
						var0.method1016("Forgotten your password?", Class5.anInt71 + 180, 201, 16776960, 0);
						var31 = 221;
						var2.method1016(Class5.aString64, 180 + Class5.anInt71, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.method1016(Class5.aString65, Class5.anInt71 + 180, var32, 16776960, 0);
						var32 += 15;
						var2.method1016(Class5.aString66, Class5.anInt71 + 180, var32, 16776960, 0);
						var32 += 15;
						var32 += 14;
						var0.method1014("Username/email: ", (180 + Class5.anInt71) - 145, var32, 16777215, 0);
						var33 = 174;

						for (var27 = Class5.aString67; var0.method1010(var27) > var33; var27 = var27.substring(1))
							;

						var0.method1014(
								Class109_Sub21_Sub14_Sub4.method1013(var27) + ((client.anInt1979 % 40) < 20
										? Class109_Sub11.method544(16776960) + "|" : ""),
								(Class5.anInt71 + 180) - 34, var32, 16777215, 0);
						var32 += 15;
						var7 = (180 + Class5.anInt71) - 80;
						var9 = 321;
						Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var7 - 73, var9 - 20);
						var0.method1016("Recover", var7, 5 + var9, 16777215, 0);
						var7 = 80 + Class5.anInt71 + 180;
						Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var7 - 73, var9 - 20);
						var0.method1016("Back", var7, var9 + 5, 16777215, 0);
					} else if (Class5.anInt63 == 6) {
						var31 = 211;
						var0.method1016(Class5.aString64, Class5.anInt71 + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.method1016(Class5.aString65, Class5.anInt71 + 180, var32, 16776960, 0);
						var32 += 15;
						var0.method1016(Class5.aString66, 180 + Class5.anInt71, var32, 16776960, 0);
						var32 += 15;
						var5 = Class5.anInt71 + 180;
						var6 = 321;
						Class5.aClass109_Sub21_Sub14_Sub1_49.method905(var5 - 73, var6 - 20);
						var0.method1016("Back", var5, var6 + 5, 16777215, 0);
					}
				}
			}

			if (Class5.anInt60 > 0) {
				var32 = Class5.anInt60;
				var33 = 256;
				Class5.anInt55 += 128 * var32;
				if (Class5.anInt55 > Class3.anIntArray25.length) {
					Class5.anInt55 -= Class3.anIntArray25.length;
					var34 = (int) (Math.random() * 12.0D);
					Class80.method333(Class78.aClass109_Sub21_Sub14_Sub1Array626[var34]);
				}

				var34 = 0;
				var7 = 128 * var32;
				var35 = 128 * (var33 - var32);

				for (var37 = 0; var37 < var35; ++var37) {
					var11 = Class109_Sub10.anIntArray1024[var7 + var34] - ((var32
							* Class3.anIntArray25[(var34 + Class5.anInt55) & (Class3.anIntArray25.length - 1)]) / 6);
					if (var11 < 0)
						var11 = 0;

					Class109_Sub10.anIntArray1024[var34++] = var11;
				}

				for (var37 = var33 - var32; var37 < var33; ++var37) {
					var11 = 128 * var37;

					for (var12 = 0; var12 < 128; ++var12) {
						var13 = (int) (Math.random() * 100.0D);
						if ((var13 < 50) && (var12 > 10) && (var12 < 118))
							Class109_Sub10.anIntArray1024[var11 + var12] = 255;
						else
							Class109_Sub10.anIntArray1024[var12 + var11] = 0;
					}
				}

				if (Class5.anInt58 > 0)
					Class5.anInt58 -= var32 * 4;

				if (Class5.anInt50 > 0)
					Class5.anInt50 -= var32 * 4;

				if ((Class5.anInt58 == 0) && (Class5.anInt50 == 0)) {
					var37 = (int) (Math.random() * (2000 / var32));
					if (var37 == 0)
						Class5.anInt58 = 1024;

					if (var37 == 1)
						Class5.anInt50 = 1024;
				}

				for (var37 = 0; var37 < (var33 - var32); ++var37)
					Class5.anIntArray56[var37] = Class5.anIntArray56[var37 + var32];

				for (var37 = var33 - var32; var37 < var33; ++var37) {
					Class5.anIntArray56[var37] = (int) ((Math.sin(Class5.anInt74 / 14.0D) * 16.0D)
							+ (Math.sin(Class5.anInt74 / 15.0D) * 14.0D) + (Math.sin(Class5.anInt74 / 16.0D) * 12.0D));
					++Class5.anInt74;
				}

				Class5.anInt57 += var32;
				var37 = ((client.anInt1979 & 1) + var32) / 2;
				if (var37 > 0) {
					for (var11 = 0; var11 < (Class5.anInt57 * 100); ++var11) {
						var12 = (int) (Math.random() * 124.0D) + 2;
						var13 = (int) (Math.random() * 128.0D) + 128;
						Class109_Sub10.anIntArray1024[(var13 << 7) + var12] = 192;
					}

					Class5.anInt57 = 0;
					var11 = 0;

					label630: while (true) {
						if (var11 >= var33) {
							var11 = 0;

							while (true) {
								if (var11 >= 128)
									break label630;

								var12 = 0;

								for (var13 = -var37; var13 < var33; ++var13) {
									var14 = 128 * var13;
									if ((var13 + var37) < var33)
										var12 += Class29.anIntArray268[(var37 * 128) + var14 + var11];

									if ((var13 - (var37 + 1)) >= 0)
										var12 -= Class29.anIntArray268[(var14 + var11) - ((var37 + 1) * 128)];

									if (var13 >= 0)
										Class109_Sub10.anIntArray1024[var14 + var11] = var12 / (1 + (2 * var37));
								}

								++var11;
							}
						}

						var12 = 0;
						var13 = 128 * var11;

						for (var14 = -var37; var14 < 128; ++var14) {
							if ((var37 + var14) < 128)
								var12 += Class109_Sub10.anIntArray1024[var13 + var14 + var37];

							if ((var14 - (1 + var37)) >= 0)
								var12 -= Class109_Sub10.anIntArray1024[(var13 + var14) - (1 + var37)];

							if (var14 >= 0)
								Class29.anIntArray268[var13 + var14] = var12 / ((2 * var37) + 1);
						}

						++var11;
					}
				}

				Class5.anInt60 = 0;
			}

			var31 = 256;
			if (Class5.anInt58 > 0) {
				for (var5 = 0; var5 < 256; ++var5)
					if (Class5.anInt58 > 768)
						Class109_Sub13.anIntArray1047[var5] = Class60.method277(Class68.anIntArray587[var5],
								Class109_Sub21_Sub15_Sub1.anIntArray1639[var5], 1024 - Class5.anInt58);
					else if (Class5.anInt58 > 256)
						Class109_Sub13.anIntArray1047[var5] = Class109_Sub21_Sub15_Sub1.anIntArray1639[var5];
					else
						Class109_Sub13.anIntArray1047[var5] = Class60.method277(
								Class109_Sub21_Sub15_Sub1.anIntArray1639[var5], Class68.anIntArray587[var5],
								256 - Class5.anInt58);
			} else if (Class5.anInt50 > 0) {
				for (var5 = 0; var5 < 256; ++var5)
					if (Class5.anInt50 > 768)
						Class109_Sub13.anIntArray1047[var5] = Class60.method277(Class68.anIntArray587[var5],
								IsaacCipher.anIntArray560[var5], 1024 - Class5.anInt50);
					else if (Class5.anInt50 > 256)
						Class109_Sub13.anIntArray1047[var5] = IsaacCipher.anIntArray560[var5];
					else
						Class109_Sub13.anIntArray1047[var5] = Class60.method277(IsaacCipher.anIntArray560[var5],
								Class68.anIntArray587[var5], 256 - Class5.anInt50);
			} else
				for (var5 = 0; var5 < 256; ++var5)
					Class109_Sub13.anIntArray1047[var5] = Class68.anIntArray587[var5];

			Class109_Sub21_Sub14.method785(Class5.anInt48, 9, Class5.anInt48 + 128, 7 + var31);
			Class49.aClass109_Sub21_Sub14_Sub2_511.method914(Class5.anInt48, 0);
			Class109_Sub21_Sub14.method786();
			var5 = 0;
			var34 = (Class44.aClass8_453.anInt90 * 9) + Class5.anInt48;

			for (var7 = 1; var7 < (var31 - 1); ++var7) {
				var35 = ((var31 - var7) * Class5.anIntArray56[var7]) / var31;
				var37 = 22 + var35;
				if (var37 < 0)
					var37 = 0;

				var5 += var37;

				for (var11 = var37; var11 < 128; ++var11) {
					var12 = Class109_Sub10.anIntArray1024[var5++];
					if (var12 != 0) {
						var13 = var12;
						var14 = 256 - var12;
						var12 = Class109_Sub13.anIntArray1047[var12];
						var15 = Class44.aClass8_453.anIntArray91[var34];
						Class44.aClass8_453.anIntArray91[var34++] = (((((var12 & '\uff00') * var13)
								+ (var14 * (var15 & '\uff00'))) & 16711680)
								+ (((var14 * (var15 & 16711935)) + (var13 * (var12 & 16711935))) & -16711936)) >> 8;
					} else
						++var34;
				}

				var34 += (Class44.aClass8_453.anInt90 + var37) - 128;
			}

			Class109_Sub21_Sub14.method785((765 + Class5.anInt48) - 128, 9, Class5.anInt48 + 765, var31 + 7);
			Class8_Sub2.aClass109_Sub21_Sub14_Sub2_904.method914(382 + Class5.anInt48, 0);
			Class109_Sub21_Sub14.method786();
			var5 = 0;
			var34 = Class5.anInt48 + 637 + 24 + (Class44.aClass8_453.anInt90 * 9);

			for (var7 = 1; var7 < (var31 - 1); ++var7) {
				var35 = (Class5.anIntArray56[var7] * (var31 - var7)) / var31;
				var37 = 103 - var35;
				var34 += var35;

				for (var11 = 0; var11 < var37; ++var11) {
					var12 = Class109_Sub10.anIntArray1024[var5++];
					if (var12 != 0) {
						var13 = var12;
						var14 = 256 - var12;
						var12 = Class109_Sub13.anIntArray1047[var12];
						var15 = Class44.aClass8_453.anIntArray91[var34];
						Class44.aClass8_453.anIntArray91[var34++] = ((((var14 * (var15 & '\uff00'))
								+ ((var12 & '\uff00') * var13)) & 16711680)
								+ ((((var12 & 16711935) * var13) + (var14 * (var15 & 16711935))) & -16711936)) >> 8;
					} else
						++var34;
				}

				var5 += 128 - var37;
				var34 += Class44.aClass8_453.anInt90 - var37 - var35;
			}

			Class5.aClass109_Sub21_Sub14_Sub1Array53[Class50.aClass21_513.aBool195 ? 1 : 0]
					.method905((Class5.anInt48 + 765) - 40, 463);
			if ((client.anInt2180 > 5) && (client.anInt2051 == 0))
				if (null != PacketDecoder1.aClass109_Sub21_Sub14_Sub1_690) {
					var32 = Class5.anInt48 + 5;
					var33 = 463;
					final byte var39 = 100;
					var36 = 35;
					PacketDecoder1.aClass109_Sub21_Sub14_Sub1_690.method905(var32, var33);
					var0.method1016("World" + " " + client.anInt1970, var32 + (var39 / 2), (var33 + (var36 / 2)) - 2,
							16777215, 0);
					if (null != Class109_Sub21_Sub19.aClass44_1635)
						var1.method1016("Loading...", (var39 / 2) + var32, 12 + (var36 / 2) + var33, 16777215, 0);
					else
						var1.method1016("Click to switch", var32 + (var39 / 2), 12 + (var36 / 2) + var33, 16777215, 0);
				} else
					PacketDecoder1.aClass109_Sub21_Sub14_Sub1_690 = Class105.method410(Class28.aClass104_Sub1_265, "sl_button",
							"");

			try {
				final Graphics var28 = Class109_Sub21_Sub10.aCanvas1472.getGraphics();
				Class44.aClass8_453.method50(var28, 0, 0, (byte) 1);
			} catch (final Exception var30) {
				Class109_Sub21_Sub10.aCanvas1472.repaint();
			}

		}
	}

	public static int method902(final CharSequence var0, final int var1) {
		return Class50.method252(var0, var1, true);
	}

	static void method903(final int var0, final int var1, final int var2, final boolean var3, final int var4,
			final boolean var5) {
		if (var0 < var1) {
			final int var8 = (var1 + var0) / 2;
			int var6 = var0;
			final Class46 var10 = Class46.aClass46Array485[var8];
			Class46.aClass46Array485[var8] = Class46.aClass46Array485[var1];
			Class46.aClass46Array485[var1] = var10;

			for (int var9 = var0; var9 < var1; ++var9)
				if (Class27.method123(Class46.aClass46Array485[var9], var10, var2, var3, var4, var5) <= 0) {
					final Class46 var7 = Class46.aClass46Array485[var9];
					Class46.aClass46Array485[var9] = Class46.aClass46Array485[var6];
					Class46.aClass46Array485[var6++] = var7;
				}

			Class46.aClass46Array485[var1] = Class46.aClass46Array485[var6];
			Class46.aClass46Array485[var6] = var10;
			method903(var0, var6 - 1, var2, var3, var4, var5);
			method903(1 + var6, var1, var2, var3, var4, var5);
		}

	}
}
