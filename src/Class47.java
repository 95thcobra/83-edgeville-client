import java.io.DataInputStream;
import java.net.URL;

public class Class47 {
	public static Class104 aClass104_493;
	protected static int anInt494;
	static int[] anIntArray495;

	public static void method237(final String var0, final Throwable var1) {
		try {
			String var2 = "";
			if (null != var1)
				var2 = Class109_Sub21_Sub15_Sub6.method981(var1);

			if (var0 != null) {
				if (var1 != null)
					var2 = var2 + " | ";

				var2 = var2 + var0;
			}

			System.out.println("Error: " + var2);
			var2 = var2.replace('\u003a', '\u002e');
			var2 = var2.replace('\u0040', '\u005f');
			var2 = var2.replace('\u0026', '\u005f');
			var2 = var2.replace('\u0023', '\u005f');
			if (null == RuntimeException_Sub1.anApplet1895)
				return;

			final URL var3 = new URL(RuntimeException_Sub1.anApplet1895.getCodeBase(),
					"clienterror.ws?c=" + RuntimeException_Sub1.anInt1899 + "&u=" + RuntimeException_Sub1.aString1897
							+ "&v1=" + Class71.aString597 + "&v2=" + Class135.aString886 + "&e=" + var2);
			final DataInputStream var4 = new DataInputStream(var3.openStream());
			var4.read();
			var4.close();
		} catch (final Exception var5) {
			;
		}

	}

	static final void method238() {
		for (Class109_Sub21_Sub15_Sub2 var0 = (Class109_Sub21_Sub15_Sub2) client.aClass126_2104
				.method458(); var0 != null; var0 = (Class109_Sub21_Sub15_Sub2) client.aClass126_2104.method449())
			if ((var0.anInt1643 == Class77.anInt616) && !var0.aBool1641) {
				if (client.anInt1979 >= var0.anInt1642) {
					var0.method891(client.anInt2043);
					if (var0.aBool1641)
						var0.method413();
					else
						Class2.aClass42_17.method186(var0.anInt1643, var0.anInt1644, var0.anInt1645, var0.anInt1646, 60,
								var0, 0, -1, false);
				}
			} else
				var0.method413();

	}

	static final void method239() {
		for (int var0 = 0; var0 < client.anInt2007; ++var0) {
			final int var1 = client.anIntArray2175[var0];
			final Class109_Sub21_Sub15_Sub3_Sub1 var2 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var1];
			if (null != var2) {
				Class37.method162(var2);
			}
		}

	}

	protected static final void method240() {
		Class37.aClass57_356.method269(1608466889);

		int var0;
		for (var0 = 0; var0 < 32; ++var0)
			Applet_Sub1.aLongArray1949[var0] = 0L;

		for (var0 = 0; var0 < 32; ++var0)
			Applet_Sub1.aLongArray1958[var0] = 0L;

		Class26.anInt241 = 0;
	}

	public static boolean method241(final int var0) {
		return ((var0 >> 20) & 1) != 0;
	}

	static void method242(final Applet_Sub1 var0) {
		if ((Class81.anInt643 == 1) || (!Class3.aBool22 && (Class81.anInt643 == 4))) {
			final int var1 = Class5.anInt48 + 280;
			if ((Class81.anInt645 >= var1) && (Class81.anInt645 <= (14 + var1)) && (Class81.anInt639 >= 4)
					&& (Class81.anInt639 <= 18)) {
				Class24.method108(0, 0);
				return;
			}

			if ((Class81.anInt645 >= (var1 + 15)) && (Class81.anInt645 <= (var1 + 80)) && (Class81.anInt639 >= 4)
					&& (Class81.anInt639 <= 18)) {
				Class24.method108(0, 1);
				return;
			}

			final int var3 = Class5.anInt48 + 390;
			if ((Class81.anInt645 >= var3) && (Class81.anInt645 <= (14 + var3)) && (Class81.anInt639 >= 4)
					&& (Class81.anInt639 <= 18)) {
				Class24.method108(1, 0);
				return;
			}

			if ((Class81.anInt645 >= (15 + var3)) && (Class81.anInt645 <= (80 + var3)) && (Class81.anInt639 >= 4)
					&& (Class81.anInt639 <= 18)) {
				Class24.method108(1, 1);
				return;
			}

			final int var4 = Class5.anInt48 + 500;
			if ((Class81.anInt645 >= var4) && (Class81.anInt645 <= (14 + var4)) && (Class81.anInt639 >= 4)
					&& (Class81.anInt639 <= 18)) {
				Class24.method108(2, 0);
				return;
			}

			if ((Class81.anInt645 >= (var4 + 15)) && (Class81.anInt645 <= (80 + var4)) && (Class81.anInt639 >= 4)
					&& (Class81.anInt639 <= 18)) {
				Class24.method108(2, 1);
				return;
			}

			final int var5 = Class5.anInt48 + 610;
			if ((Class81.anInt645 >= var5) && (Class81.anInt645 <= (var5 + 14)) && (Class81.anInt639 >= 4)
					&& (Class81.anInt639 <= 18)) {
				Class24.method108(3, 0);
				return;
			}

			if ((Class81.anInt645 >= (15 + var5)) && (Class81.anInt645 <= (80 + var5)) && (Class81.anInt639 >= 4)
					&& (Class81.anInt639 <= 18)) {
				Class24.method108(3, 1);
				return;
			}

			if ((Class81.anInt645 >= (708 + Class5.anInt48)) && (Class81.anInt639 >= 4)
					&& (Class81.anInt645 <= (50 + 708 + Class5.anInt48)) && (Class81.anInt639 <= 20)) {
				Class5.aBool73 = false;
				Class49.aClass109_Sub21_Sub14_Sub2_511.method914(Class5.anInt48, 0);
				Class8_Sub2.aClass109_Sub21_Sub14_Sub2_904.method914(Class5.anInt48 + 382, 0);
				Class5.aClass109_Sub21_Sub14_Sub1_52
						.method905((382 + Class5.anInt48) - (Class5.aClass109_Sub21_Sub14_Sub1_52.anInt1713 / 2), 18);
				return;
			}

			if (Class5.anInt75 != -1) {
				final Class46 var2 = Class46.aClass46Array485[Class5.anInt75];
				if (var2.method234() != client.aBool1974) {
					client.aBool1974 = var2.method234();
					Class50.method249(var2.method234());
				}

				Class109_Sub9.aString998 = var2.aString487;
				client.anInt1970 = var2.anInt492;
				client.anInt1971 = var2.anInt480;
				Class20.anInt188 = client.anInt1972 == 0 ? '\uaa4a' : var2.anInt492 + '\u9c40';
				Class2.anInt18 = client.anInt1972 == 0 ? 443 : var2.anInt492 + '\uc350';
				Class33.anInt323 = Class20.anInt188;
				Class5.aBool73 = false;
				Class49.aClass109_Sub21_Sub14_Sub2_511.method914(Class5.anInt48, 0);
				Class8_Sub2.aClass109_Sub21_Sub14_Sub2_904.method914(382 + Class5.anInt48, 0);
				Class5.aClass109_Sub21_Sub14_Sub1_52
						.method905((382 + Class5.anInt48) - (Class5.aClass109_Sub21_Sub14_Sub1_52.anInt1713 / 2), 18);
				return;
			}
		}

	}

	static final void method243(final Class109_Sub20 var0, final int var1, final int var2, final int var3) {
		Class52.method255();
		final Class109_Sub21_Sub19 var6 = var0.method651();
		if (var6 != null) {
			Class109_Sub21_Sub14.method785(var1, var2, var6.anInt1633 + var1, var6.anInt1631 + var2);
			if ((client.anInt2206 != 2) && (client.anInt2206 != 5)) {
				final int var4 = (client.anInt2052 + client.anInt2038) & 2047;
				final int var9 = 48 + (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 / 32);
				final int var10 = 464 - (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 / 32);
				Class21.aClass109_Sub21_Sub14_Sub2_201.method929(var1, var2, var6.anInt1633, var6.anInt1631, var9,
						var10, var4, client.anInt2040 + 256, var6.anIntArray1636, var6.anIntArray1632);

				int var7;
				int var8;
				int var14;
				for (var14 = 0; var14 < client.anInt2000; ++var14) {
					var7 = ((client.anIntArray2201[var14] * 4) + 2)
							- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 / 32);
					var8 = (2 + (client.anIntArray2202[var14] * 4))
							- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 / 32);
					Class109_Sub23.method659(var1, var2, var7, var8, client.aClass109_Sub21_Sub14_Sub2Array2203[var14],
							var6);
				}

				int var13;
				int var15;
				for (var14 = 0; var14 < 104; ++var14)
					for (var7 = 0; var7 < 104; ++var7) {
						final Class126 var5 = client.aClass126ArrayArrayArray2121[Class77.anInt616][var14][var7];
						if (var5 != null) {
							var13 = (2 + (4 * var14))
									- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 / 32);
							var15 = ((var7 * 4) + 2)
									- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 / 32);
							Class109_Sub23.method659(var1, var2, var13, var15,
									Class84.aClass109_Sub21_Sub14_Sub2Array657[0], var6);
						}
					}

				for (var14 = 0; var14 < client.anInt2007; ++var14) {
					final Class109_Sub21_Sub15_Sub3_Sub1 var12 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[client.anIntArray2175[var14]];
					if ((null != var12) && var12.method897(1256188780)) {
						Class109_Sub21_Sub13 var18 = var12.aClass109_Sub21_Sub13_1925;
						if ((var18 != null) && (var18.anIntArray1516 != null))
							var18 = var18.method763();

						if ((var18 != null) && var18.aBool1539 && var18.aBool1541) {
							var13 = (var12.anInt1710 / 32)
									- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 / 32);
							var15 = (var12.anInt1653 / 32)
									- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 / 32);
							Class109_Sub23.method659(var1, var2, var13, var15,
									Class84.aClass109_Sub21_Sub14_Sub2Array657[1], var6);
						}
					}
				}

				for (var14 = 0; var14 < client.anInt2087; ++var14) {
					final Class109_Sub21_Sub15_Sub3_Sub2 var19 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[client.anIntArray2134[var14]];
					if ((null != var19) && var19.method897(1232624884) && !var19.aBool1928) {
						var8 = (var19.anInt1710 / 32)
								- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 / 32);
						var13 = (var19.anInt1653 / 32)
								- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 / 32);
						boolean var20 = false;
						if (Applet_Sub1.method1054(var19.aString1931, true))
							var20 = true;

						boolean var11 = false;

						for (int var17 = 0; var17 < Class109_Sub21_Sub17.anInt1589; ++var17)
							if (var19.aString1931.equals(Class53.aClass109_Sub7Array532[var17].aString969)) {
								var11 = true;
								break;
							}

						boolean var22 = false;
						if ((Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1945 != 0)
								&& (var19.anInt1945 != 0)
								&& (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1945 == var19.anInt1945))
							var22 = true;

						if (var20)
							Class109_Sub23.method659(var1, var2, var8, var13,
									Class84.aClass109_Sub21_Sub14_Sub2Array657[3], var6);
						else if (var22)
							Class109_Sub23.method659(var1, var2, var8, var13,
									Class84.aClass109_Sub21_Sub14_Sub2Array657[4], var6);
						else if (var11)
							Class109_Sub23.method659(var1, var2, var8, var13,
									Class84.aClass109_Sub21_Sub14_Sub2Array657[5], var6);
						else
							Class109_Sub23.method659(var1, var2, var8, var13,
									Class84.aClass109_Sub21_Sub14_Sub2Array657[2], var6);
					}
				}

				if ((client.anInt2158 != 0) && ((client.anInt1979 % 20) < 10)) {
					if ((client.anInt2158 == 1) && (client.anInt1989 >= 0)
							&& (client.anInt1989 < client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006.length)) {
						final Class109_Sub21_Sub15_Sub3_Sub1 var16 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[client.anInt1989];
						if (null != var16) {
							var7 = (var16.anInt1710 / 32)
									- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 / 32);
							var8 = (var16.anInt1653 / 32)
									- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 / 32);
							Applet_Sub1.method1056(var1, var2, var7, var8,
									PacketDecoder1.aClass109_Sub21_Sub14_Sub2Array691[1], var6);
						}
					}

					if (client.anInt2158 == 2) {
						var14 = (((client.anInt2054 * 4) - (Class41.anInt375 * 4)) + 2)
								- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 / 32);
						var7 = (2 + ((client.anInt2223 * 4) - (Class113.anInt822 * 4)))
								- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 / 32);
						Applet_Sub1.method1056(var1, var2, var14, var7, PacketDecoder1.aClass109_Sub21_Sub14_Sub2Array691[1],
								var6);
					}

					if ((client.anInt2158 == 10) && (client.anInt2140 >= 0)
							&& (client.anInt2140 < client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086.length)) {
						final Class109_Sub21_Sub15_Sub3_Sub2 var21 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[client.anInt2140];
						if (var21 != null) {
							var7 = (var21.anInt1710 / 32)
									- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 / 32);
							var8 = (var21.anInt1653 / 32)
									- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 / 32);
							Applet_Sub1.method1056(var1, var2, var7, var8,
									PacketDecoder1.aClass109_Sub21_Sub14_Sub2Array691[1], var6);
						}
					}
				}

				if (client.anInt2204 != 0) {
					var14 = (2 + (client.anInt2204 * 4))
							- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 / 32);
					var7 = (2 + (client.anInt2205 * 4))
							- (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 / 32);
					Class109_Sub23.method659(var1, var2, var14, var7, PacketDecoder1.aClass109_Sub21_Sub14_Sub2Array691[0],
							var6);
				}

				if (!Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aBool1928)
					Class109_Sub21_Sub14.method773((var1 + (var6.anInt1633 / 2)) - 1, (var2 + (var6.anInt1631 / 2)) - 1,
							3, 3, 16777215);
			} else
				Class109_Sub21_Sub14.method781(var1, var2, 0, var6.anIntArray1636, var6.anIntArray1632);

			client.aBoolArray2002[var3] = true;
		}
	}

	static final void method244(final int var0) {
		Class44.method227();

		for (Class109_Sub10 var2 = (Class109_Sub10) Class109_Sub10.aClass126_1020
				.method458(); var2 != null; var2 = (Class109_Sub10) Class109_Sub10.aClass126_1020.method449())
			if (var2.aClass109_Sub21_Sub10_1023 != null)
				var2.method533();

		final int var4 = Class109_Sub21_Sub7.method711(var0).anInt1301;
		if (var4 != 0) {
			final int var1 = Class106.anIntArray798[var0];
			if (var4 == 1) {
				if (var1 == 1) {
					Class109_Sub21_Sub14_Sub3.method965(0.9D);
					((Class20) Class109_Sub21_Sub14_Sub3.anInterface3_1833).method91(0.9D);
				}

				if (var1 == 2) {
					Class109_Sub21_Sub14_Sub3.method965(0.8D);
					((Class20) Class109_Sub21_Sub14_Sub3.anInterface3_1833).method91(0.8D);
				}

				if (var1 == 3) {
					Class109_Sub21_Sub14_Sub3.method965(0.7D);
					((Class20) Class109_Sub21_Sub14_Sub3.anInterface3_1833).method91(0.7D);
				}

				if (var1 == 4) {
					Class109_Sub21_Sub14_Sub3.method965(0.6D);
					((Class20) Class109_Sub21_Sub14_Sub3.anInterface3_1833).method91(0.6D);
				}

				Class109_Sub21_Sub15_Sub3_Sub1.method1036();
			}

			if (var4 == 3) {
				short var3 = 0;
				if (var1 == 0)
					var3 = 255;

				if (var1 == 1)
					var3 = 192;

				if (var1 == 2)
					var3 = 128;

				if (var1 == 3)
					var3 = 64;

				if (var1 == 4)
					var3 = 0;

				if (client.anInt2207 != var3) {
					if ((client.anInt2207 == 0) && (client.anInt2208 != -1)) {
						Class104_Sub1.method644(Class46.aClass104_Sub1_486, client.anInt2208, 0, var3, false);
						client.aBool2209 = false;
					} else if (var3 == 0) {
						Class70.method310();
						client.aBool2209 = false;
					} else if (Class93.anInt703 != 0)
						Class79.anInt628 = var3;
					else
						Class93.aClass109_Sub4_Sub3_701.method852(var3);

					client.anInt2207 = var3;
				}
			}

			if (var4 == 4) {
				if (var1 == 0)
					client.anInt2210 = 127;

				if (var1 == 1)
					client.anInt2210 = 96;

				if (var1 == 2)
					client.anInt2210 = 64;

				if (var1 == 3)
					client.anInt2210 = 32;

				if (var1 == 4)
					client.anInt2210 = 0;
			}

			if (var4 == 5)
				client.anInt2136 = var1;

			if (var4 == 6)
				client.anInt2130 = var1;

			if (var4 == 9)
				client.anInt1981 = var1;

			if (var4 == 10) {
				if (var1 == 0)
					client.anInt2199 = 127;

				if (var1 == 1)
					client.anInt2199 = 96;

				if (var1 == 2)
					client.anInt2199 = 64;

				if (var1 == 3)
					client.anInt2199 = 32;

				if (var1 == 4)
					client.anInt2199 = 0;
			}

			if (var4 == 17)
				client.anInt2235 = var1 & '\uffff';

			if (var4 == 18) {
				client.aClass49_2176 = (Class49) Class33.method151(Class109_Sub21_Sub15.method832(-189240855), var1);
				if (client.aClass49_2176 == null)
					client.aClass49_2176 = Class49.aClass49_508;
			}

			if (var4 == 19)
				if (var1 == -1)
					client.anInt2100 = -1;
				else
					client.anInt2100 = var1 & 2047;

		}
	}
}
