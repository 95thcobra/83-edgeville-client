import java.awt.Canvas;
import java.awt.Color;
import java.awt.FontMetrics;

public final class Class26 {
	static int anInt226;
	int anInt227;
	int anInt228;
	int anInt229;
	public Class109_Sub21_Sub15 aClass109_Sub21_Sub15_230;
	int anInt231;
	int anInt232;
	int anInt233;
	int anInt234;
	int anInt235;
	int anInt236;
	int anInt237;
	int anInt239;
	protected static FontMetrics aFontMetrics240;
	protected static int anInt241;
	public int anInt238 = 0;
	int anInt242 = 0;

	static void method115(final Applet_Sub1 var0) {
		if (Class5.aBool73)
			Class47.method242(var0);
		else {
			if (((Class81.anInt643 == 1) || (!Class3.aBool22 && (Class81.anInt643 == 4)))
					&& (Class81.anInt645 >= ((765 + Class5.anInt48) - 50)) && (Class81.anInt639 >= 453)) {
				Class50.aClass21_513.aBool195 = !Class50.aClass21_513.aBool195;
				Class7.method46(-840141801);
				if (!Class50.aClass21_513.aBool195)
					Class5.method37(Class46.aClass104_Sub1_486, "scape main", "", 255, false);
				else
					Class70.method310();
			}

			if (client.anInt2180 != 5) {
				++Class5.anInt60;
				if ((client.anInt2180 == 10) || (client.anInt2180 == 11)) {
					int var6;
					if (client.anInt2051 == 0) {
						if ((Class81.anInt643 == 1) || (!Class3.aBool22 && (Class81.anInt643 == 4))) {
							var6 = 5 + Class5.anInt48;
							final short var5 = 463;
							final byte var2 = 100;
							final byte var4 = 35;
							if ((Class81.anInt645 >= var6) && (Class81.anInt645 <= (var6 + var2))
									&& (Class81.anInt639 >= var5) && (Class81.anInt639 <= (var5 + var4))) {
								if (Class109_Sub13.method550('\uff00'))
									Class5.aBool73 = true;

								return;
							}
						}

						if ((null != Class109_Sub21_Sub19.aClass44_1635) && Class109_Sub13.method550('\uff00'))
							Class5.aBool73 = true;
					}

					var6 = Class81.anInt643;
					final int var13 = Class81.anInt645;
					final int var9 = Class81.anInt639;
					if (!Class3.aBool22 && (var6 == 4))
						var6 = 1;

					short var7;
					int var12;
					if (Class5.anInt63 == 0) {
						var12 = (Class5.anInt71 + 180) - 80;
						var7 = 291;
						if ((var6 == 1) && (var13 >= (var12 - 75)) && (var13 <= (var12 + 75)) && (var9 >= (var7 - 20))
								&& (var9 <= (var7 + 20)))
							Class109_Sub21_Sub15_Sub6.method979(Class109_Sub21_Sub15_Sub1.method890("secure", true)
									+ "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);

						var12 = Class5.anInt71 + 180 + 80;
						if ((var6 == 1) && (var13 >= (var12 - 75)) && (var13 <= (var12 + 75)) && (var9 >= (var7 - 20))
								&& (var9 <= (var7 + 20)))
							if ((client.anInt1971 & 4) != 0) {
								if ((client.anInt1971 & 1024) != 0) {
									Class5.aString64 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Class5.aString65 = "Players can attack each other almost everywhere";
									Class5.aString66 = "and the Protect Item prayer won\'t work.";
								} else {
									Class5.aString64 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Class5.aString65 = "Players can attack each other";
									Class5.aString66 = "almost everywhere.";
								}

								Class5.anInt63 = 1;
								Class5.anInt76 = 0;
							} else if ((client.anInt1971 & 1024) != 0) {
								Class5.aString64 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Class5.aString65 = "The Protect Item prayer will";
								Class5.aString66 = "not work on this world.";
								Class5.anInt63 = 1;
								Class5.anInt76 = 0;
							} else {
								Class5.aString64 = "";
								Class5.aString65 = "Enter your username/email & password.";
								Class5.aString66 = "";
								Class5.anInt63 = 2;
								Class5.anInt76 = 0;
							}
					} else if (Class5.anInt63 != 1) {
						short var14;
						if (Class5.anInt63 == 2) {
							var14 = 231;
							var12 = var14 + 30;
							if ((var6 == 1) && (var9 >= (var12 - 15)) && (var9 < var12))
								Class5.anInt76 = 0;

							var12 += 15;
							if ((var6 == 1) && (var9 >= (var12 - 15)) && (var9 < var12))
								Class5.anInt76 = 1;

							var12 += 15;
							var14 = 361;
							if ((var6 == 1) && (var9 >= (var14 - 15)) && (var9 < var14)) {
								Class99.method368("Please enter your username.",
										"If you created your account after November",
										"2010, this will be the creation email address.");
								Class5.anInt63 = 5;
								return;
							}

							int var15 = (180 + Class5.anInt71) - 80;
							final short var3 = 321;
							if ((var6 == 1) && (var13 >= (var15 - 75)) && (var13 <= (75 + var15))
									&& (var9 >= (var3 - 20)) && (var9 <= (20 + var3))) {
								Class5.aString67 = Class5.aString67.trim();
								if (Class5.aString67.length() == 0) {
									Class99.method368("", "Please enter your username/email address.", "");
									return;
								}

								if (Class5.aString68.length() == 0) {
									Class99.method368("", "Please enter your password.", "");
									return;
								}

								Class99.method368("", "Connecting to server...", "");
								Class5.aClass92_69 = Class50.aClass21_513.aLinkedHashMap199
										.containsKey(Integer.valueOf(Class44.method226(Class5.aString67)))
												? Class92.aClass92_694 : Class92.aClass92_697;
								Class82.method343(20);
								return;
							}

							var15 = 180 + Class5.anInt71 + 80;
							if ((var6 == 1) && (var13 >= (var15 - 75)) && (var13 <= (75 + var15))
									&& (var9 >= (var3 - 20)) && (var9 <= (var3 + 20))) {
								Class5.anInt63 = 0;
								Class5.aString67 = "";
								Class5.aString68 = "";
								Class109_Sub21_Sub6.anInt1389 = 0;
								Class40.aString370 = "";
								Class5.aBool70 = true;
							}

							while (true) {
								while (Class53.method259()) {
									boolean var1 = false;

									for (int var8 = 0; var8 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
											.length(); ++var8)
										if (Class66.aChar578 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
												.charAt(var8)) {
											var1 = true;
											break;
										}

									if (Class3.anInt23 == 13) {
										Class5.anInt63 = 0;
										Class5.aString67 = "";
										Class5.aString68 = "";
										Class109_Sub21_Sub6.anInt1389 = 0;
										Class40.aString370 = "";
										Class5.aBool70 = true;
									} else if (Class5.anInt76 == 0) {
										if ((Class3.anInt23 == 85) && (Class5.aString67.length() > 0))
											Class5.aString67 = Class5.aString67.substring(0,
													Class5.aString67.length() - 1);

										if ((Class3.anInt23 == 84) || (Class3.anInt23 == 80))
											Class5.anInt76 = 1;

										if (var1 && (Class5.aString67.length() < 320))
											Class5.aString67 = Class5.aString67 + Class66.aChar578;
									} else if (Class5.anInt76 == 1) {
										if ((Class3.anInt23 == 85) && (Class5.aString68.length() > 0))
											Class5.aString68 = Class5.aString68.substring(0,
													Class5.aString68.length() - 1);

										if ((Class3.anInt23 == 84) || (Class3.anInt23 == 80))
											Class5.anInt76 = 0;

										if (Class3.anInt23 == 84) {
											Class5.aString67 = Class5.aString67.trim();
											if (Class5.aString67.length() == 0) {
												Class99.method368("", "Please enter your username/email address.", "");
												return;
											}

											if (Class5.aString68.length() == 0) {
												Class99.method368("", "Please enter your password.", "");
												return;
											}

											Class99.method368("", "Connecting to server...", "");
											Class5.aClass92_69 = Class50.aClass21_513.aLinkedHashMap199
													.containsKey(Integer.valueOf(Class44.method226(Class5.aString67)))
															? Class92.aClass92_694 : Class92.aClass92_697;
											Class82.method343(20);
											return;
										}

										if (var1 && (Class5.aString68.length() < 20))
											Class5.aString68 = Class5.aString68 + Class66.aChar578;
									}
								}

								return;
							}
						} else {
							int var10;
							boolean var11;
							if (Class5.anInt63 == 4) {
								var12 = (180 + Class5.anInt71) - 80;
								var7 = 321;
								if ((var6 == 1) && (var13 >= (var12 - 75)) && (var13 <= (var12 + 75))
										&& (var9 >= (var7 - 20)) && (var9 <= (var7 + 20))) {
									Class40.aString370.trim();
									if (Class40.aString370.length() != 6) {
										Class99.method368("", "Please enter a 6-digin PIN.", "");
										return;
									}

									Class109_Sub21_Sub6.anInt1389 = Integer.parseInt(Class40.aString370);
									Class40.aString370 = "";
									Class5.aClass92_69 = Class5.aBool70 ? Class92.aClass92_693 : Class92.aClass92_695;
									Class99.method368("", "Connecting to server...", "");
									Class82.method343(20);
									return;
								}

								if ((var6 == 1) && (var13 >= ((Class5.anInt71 + 180) - 9))
										&& (var13 <= (130 + Class5.anInt71 + 180)) && (var9 >= 263) && (var9 <= 296))
									Class5.aBool70 = !Class5.aBool70;

								if ((var6 == 1) && (var13 >= ((Class5.anInt71 + 180) - 34))
										&& (var13 <= (180 + Class5.anInt71 + 34)) && (var9 >= 351) && (var9 <= 363))
									Class109_Sub21_Sub15_Sub6
											.method979(Class109_Sub21_Sub15_Sub1.method890("secure", true)
													+ "m=totp-authenticator/disableTOTPRequest", true, false);

								var12 = 80 + Class5.anInt71 + 180;
								if ((var6 == 1) && (var13 >= (var12 - 75)) && (var13 <= (75 + var12))
										&& (var9 >= (var7 - 20)) && (var9 <= (var7 + 20))) {
									Class5.anInt63 = 0;
									Class5.aString67 = "";
									Class5.aString68 = "";
									Class109_Sub21_Sub6.anInt1389 = 0;
									Class40.aString370 = "";
								}

								while (Class53.method259()) {
									var11 = false;

									for (var10 = 0; var10 < "1234567890".length(); ++var10)
										if (Class66.aChar578 == "1234567890".charAt(var10)) {
											var11 = true;
											break;
										}

									if (Class3.anInt23 == 13) {
										Class5.anInt63 = 0;
										Class5.aString67 = "";
										Class5.aString68 = "";
										Class109_Sub21_Sub6.anInt1389 = 0;
										Class40.aString370 = "";
									} else {
										if ((Class3.anInt23 == 85) && (Class40.aString370.length() > 0))
											Class40.aString370 = Class40.aString370.substring(0,
													Class40.aString370.length() - 1);

										if (Class3.anInt23 == 84) {
											Class40.aString370.trim();
											if (Class40.aString370.length() != 6) {
												Class99.method368("", "Please enter a 6-digin PIN.", "");
												return;
											}

											Class109_Sub21_Sub6.anInt1389 = Integer.parseInt(Class40.aString370);
											Class40.aString370 = "";
											Class5.aClass92_69 = Class5.aBool70 ? Class92.aClass92_693
													: Class92.aClass92_695;
											Class99.method368("", "Connecting to server...", "");
											Class82.method343(20);
											return;
										}

										if (var11 && (Class40.aString370.length() < 6))
											Class40.aString370 = Class40.aString370 + Class66.aChar578;
									}
								}
							} else if (Class5.anInt63 == 5) {
								var12 = (180 + Class5.anInt71) - 80;
								var7 = 321;
								if ((var6 == 1) && (var13 >= (var12 - 75)) && (var13 <= (75 + var12))
										&& (var9 >= (var7 - 20)) && (var9 <= (20 + var7))) {
									Class109_Sub21_Sub9.method722();
									return;
								}

								var12 = 80 + Class5.anInt71 + 180;
								if ((var6 == 1) && (var13 >= (var12 - 75)) && (var13 <= (75 + var12))
										&& (var9 >= (var7 - 20)) && (var9 <= (var7 + 20))) {
									Class5.aString64 = "";
									Class5.aString65 = "Enter your username/email & password.";
									Class5.aString66 = "";
									Class5.anInt63 = 2;
									Class5.anInt76 = 0;
									Class5.aString68 = "";
								}

								while (Class53.method259()) {
									var11 = false;

									for (var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
											.length(); ++var10)
										if (Class66.aChar578 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
												.charAt(var10)) {
											var11 = true;
											break;
										}

									if (Class3.anInt23 == 13) {
										Class5.aString64 = "";
										Class5.aString65 = "Enter your username/email & password.";
										Class5.aString66 = "";
										Class5.anInt63 = 2;
										Class5.anInt76 = 0;
										Class5.aString68 = "";
									} else {
										if ((Class3.anInt23 == 85) && (Class5.aString67.length() > 0))
											Class5.aString67 = Class5.aString67.substring(0,
													Class5.aString67.length() - 1);

										if (Class3.anInt23 == 84) {
											Class109_Sub21_Sub9.method722();
											return;
										}

										if (var11 && (Class5.aString67.length() < 320))
											Class5.aString67 = Class5.aString67 + Class66.aChar578;
									}
								}
							} else if (Class5.anInt63 == 6)
								while (true) {
									do
										if (!Class53.method259()) {
											var14 = 321;
											if ((var6 == 1) && (var9 >= (var14 - 20)) && (var9 <= (20 + var14))) {
												Class5.aString64 = "";
												Class5.aString65 = "Enter your username/email & password.";
												Class5.aString66 = "";
												Class5.anInt63 = 2;
												Class5.anInt76 = 0;
												Class5.aString68 = "";
											}

											return;
										}
									while ((Class3.anInt23 != 84) && (Class3.anInt23 != 13));

									Class5.aString64 = "";
									Class5.aString65 = "Enter your username/email & password.";
									Class5.aString66 = "";
									Class5.anInt63 = 2;
									Class5.anInt76 = 0;
									Class5.aString68 = "";
								}
						}
					} else {
						while (Class53.method259())
							if (Class3.anInt23 == 84) {
								Class5.aString64 = "";
								Class5.aString65 = "Enter your username/email & password.";
								Class5.aString66 = "";
								Class5.anInt63 = 2;
								Class5.anInt76 = 0;
							} else if (Class3.anInt23 == 13)
								Class5.anInt63 = 0;

						var12 = (180 + Class5.anInt71) - 80;
						var7 = 321;
						if ((var6 == 1) && (var13 >= (var12 - 75)) && (var13 <= (var12 + 75)) && (var9 >= (var7 - 20))
								&& (var9 <= (20 + var7))) {
							Class5.aString64 = "";
							Class5.aString65 = "Enter your username/email & password.";
							Class5.aString66 = "";
							Class5.anInt63 = 2;
							Class5.anInt76 = 0;
						}

						var12 = 180 + Class5.anInt71 + 80;
						if ((var6 == 1) && (var13 >= (var12 - 75)) && (var13 <= (75 + var12)) && (var9 >= (var7 - 20))
								&& (var9 <= (20 + var7)))
							Class5.anInt63 = 0;
					}

				}
			}
		}
	}

	static final int method116(final int var0, final int var1) {
		final int var2 = Class109_Sub20.method656(var0 - 1, var1 - 1) + Class109_Sub20.method656(var0 + 1, var1 - 1)
				+ Class109_Sub20.method656(var0 - 1, 1 + var1) + Class109_Sub20.method656(1 + var0, 1 + var1);
		final int var4 = Class109_Sub20.method656(var0 - 1, var1) + Class109_Sub20.method656(1 + var0, var1)
				+ Class109_Sub20.method656(var0, var1 - 1) + Class109_Sub20.method656(var0, 1 + var1);
		final int var3 = Class109_Sub20.method656(var0, var1);
		return (var3 / 4) + (var2 / 16) + (var4 / 8);
	}

	static final void method117(final boolean var0) {
		for (int var1 = 0; var1 < client.anInt2007; ++var1) {
			final Class109_Sub21_Sub15_Sub3_Sub1 var2 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[client.anIntArray2175[var1]];
			int var5 = (client.anIntArray2175[var1] << 14) + 536870912;
			if ((null != var2) && var2.method897(1995428054) && (var2.aClass109_Sub21_Sub13_1925.aBool1540 == var0)
					&& var2.aClass109_Sub21_Sub13_1925.method765()) {
				final int var3 = var2.anInt1710 >> 7;
				final int var4 = var2.anInt1653 >> 7;
				if ((var3 >= 0) && (var3 < 104) && (var4 >= 0) && (var4 < 104)) {
					if ((var2.anInt1656 == 1) && ((var2.anInt1710 & 127) == 64) && ((var2.anInt1653 & 127) == 64)) {
						if (client.anInt2070 == client.anIntArrayArray2069[var3][var4])
							continue;

						client.anIntArrayArray2069[var3][var4] = client.anInt2070;
					}

					if (!var2.aClass109_Sub21_Sub13_1925.aBool1541)
						var5 -= Integer.MIN_VALUE;

					Class2.aClass42_17.method186(Class77.anInt616, var2.anInt1710, var2.anInt1653,
							Class41.method174(((var2.anInt1656 * 64) - 64) + var2.anInt1710,
									((var2.anInt1656 * 64) - 64) + var2.anInt1653, Class77.anInt616),
							((var2.anInt1656 * 64) - 64) + 60, var2, var2.anInt1654, var5, var2.aBool1704);
				}
			}
		}

	}

	static void method118(final int var0, final Class68 var1, final Class104_Sub1 var2) {
		byte[] var3 = null;
		final Class126 var4 = Class105.aClass126_793;
		synchronized (var4) {
			for (Class109_Sub17 var5 = (Class109_Sub17) Class105.aClass126_793
					.method458(); null != var5; var5 = (Class109_Sub17) Class105.aClass126_793.method449())
				if ((var5.aLong802 == var0) && (var1 == var5.aClass68_1099) && (var5.anInt1101 == 0)) {
					var3 = var5.aByteArray1100;
					break;
				}
		}

		if (var3 != null)
			var2.method639(var1, var0, var3, true);
		else {
			final byte[] var8 = var1.method303(var0, (byte) -104);
			var2.method639(var1, var0, var8, true);
		}
	}

	static void method119() {
		Class66.method295(Class109_Sub21_Sub10.aCanvas1472);
		Class109_Sub14_Sub1.method847(Class109_Sub21_Sub10.aCanvas1472);
		if (null != Class109_Sub21_Sub1.aClass66_1297)
			Class109_Sub21_Sub1.aClass66_1297.method294(Class109_Sub21_Sub10.aCanvas1472, (byte) -28);

		client.aclient1968.method1045();
		Class109_Sub21_Sub10.aCanvas1472.setBackground(Color.black);
		final Canvas var1 = Class109_Sub21_Sub10.aCanvas1472;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(Class63.aClass63_573);
		var1.addFocusListener(Class63.aClass63_573);
		final Canvas var0 = Class109_Sub21_Sub10.aCanvas1472;
		var0.addMouseListener(Class81.aClass81_644);
		var0.addMouseMotionListener(Class81.aClass81_644);
		var0.addFocusListener(Class81.aClass81_644);
		if (null != Class109_Sub21_Sub1.aClass66_1297)
			Class109_Sub21_Sub1.aClass66_1297.method293(Class109_Sub21_Sub10.aCanvas1472, (byte) 47);

		if (client.anInt2128 != -1)
			Class109_Sub21_Sub13.method766(false);

		Applet_Sub1.aBool1952 = true;
	}

	static void method120() {
		final Object var0 = Class105.anObject796;
		synchronized (var0) {
			if (Class105.anInt794 == 0)
				Class109_Sub21_Sub11.aClass71_1495.method314(new Class105(), 5);

			Class105.anInt794 = 600;
		}
	}
}
