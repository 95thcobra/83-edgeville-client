import java.util.Date;

public class Class33 {
	String aString317;
	String aString318;
	int anInt319;
	int anInt320;
	boolean aBool321;
	static int[][][] anIntArrayArrayArray322;
	static int anInt323;
	static Class109_Sub21_Sub14_Sub1 aClass109_Sub21_Sub14_Sub1_324;
	boolean aBool325;

	static final int method143(final Class109_Sub20 var0, final int var1) {
		if ((null != var0.anIntArrayArray1224) && (var1 < var0.anIntArrayArray1224.length))
			try {
				final int[] var2 = var0.anIntArrayArray1224[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					final int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0)
						return var3;

					if (var6 == 1)
						var7 = client.anIntArray2105[var2[var4++]];

					if (var6 == 2)
						var7 = client.anIntArray2106[var2[var4++]];

					if (var6 == 3)
						var7 = client.anIntArray2107[var2[var4++]];

					int var9;
					Class109_Sub20 var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = Class83.method345(var9);
						var11 = var2[var4++];
						if ((var11 != -1) && (!Class109_Sub23.method660(var11).aBool1367 || client.aBool1974))
							for (var12 = 0; var12 < var10.anIntArray1149.length; ++var12)
								if ((var11 + 1) == var10.anIntArray1149[var12])
									var7 += var10.anIntArray1264[var12];
					}

					if (var6 == 5)
						var7 = Class106.anIntArray798[var2[var4++]];

					if (var6 == 6)
						var7 = Class91.anIntArray689[client.anIntArray2106[var2[var4++]] - 1];

					if (var6 == 7)
						var7 = (Class106.anIntArray798[var2[var4++]] * 100) / '\ub71b';

					if (var6 == 8)
						var7 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1932;

					if (var6 == 9)
						for (var9 = 0; var9 < 25; ++var9)
							if (Class91.aBoolArray688[var9])
								var7 += client.anIntArray2106[var9];

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = Class83.method345(var9);
						var11 = var2[var4++];
						if ((var11 != -1) && (!Class109_Sub23.method660(var11).aBool1367 || client.aBool1974))
							for (var12 = 0; var12 < var10.anIntArray1149.length; ++var12)
								if ((var11 + 1) == var10.anIntArray1149[var12]) {
									var7 = 999999999;
									break;
								}
					}

					if (var6 == 11)
						var7 = client.anInt2133;

					if (var6 == 12)
						var7 = client.anInt2103;

					if (var6 == 13) {
						var9 = Class106.anIntArray798[var2[var4++]];
						final int var13 = var2[var4++];
						var7 = (var9 & (1 << var13)) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = Class44.method230(var9, (byte) -102);
					}

					if (var6 == 15)
						var8 = 1;

					if (var6 == 16)
						var8 = 2;

					if (var6 == 17)
						var8 = 3;

					if (var6 == 18)
						var7 = Class41.anInt375
								+ (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 >> 7);

					if (var6 == 19)
						var7 = Class113.anInt822
								+ (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 >> 7);

					if (var6 == 20)
						var7 = var2[var4++];

					if (var8 == 0) {
						if (var5 == 0)
							var3 += var7;

						if (var5 == 1)
							var3 -= var7;

						if ((var5 == 2) && (var7 != 0))
							var3 /= var7;

						if (var5 == 3)
							var3 *= var7;

						var5 = 0;
					} else
						var5 = var8;
				}
			} catch (final Exception var14) {
				return -1;
			}
		else
			return -2;
	}

	static void method144(final int var0) {
		if (var0 == -3)
			Class99.method368("Connection timed out.", "Please try using a different world.", "");
		else if (var0 == -2)
			Class99.method368("", "Error connecting to server.", "");
		else if (var0 == -1)
			Class99.method368("No response from server.", "Please try using a different world.", "");
		else if (var0 == 3)
			Class99.method368("", "Invalid username/email or password.", "");
		else if (var0 == 4)
			Class99.method368("Your account has been disabled.", "Please check your message-centre for details.", "");
		else if (var0 == 5)
			Class99.method368("Your account is already logged in.", "Try again in 60 secs...", "");
		else if (var0 == 6)
			Class99.method368("RuneScape has been updated!", "Please reload this page.", "");
		else if (var0 == 7)
			Class99.method368("This world is full.", "Please use a different world.", "");
		else if (var0 == 8)
			Class99.method368("Unable to connect.", "Login server offline.", "");
		else if (var0 == 9)
			Class99.method368("Login limit exceeded.", "Too many connections from your address.", "");
		else if (var0 == 10)
			Class99.method368("Unable to connect.", "Bad session id.", "");
		else if (var0 == 11)
			Class99.method368("We suspect someone knows your password.",
					"Press \'change your password\' on front page.", "");
		else if (var0 == 12)
			Class99.method368("You need a members account to login to this world.",
					"Please subscribe, or use a different world.", "");
		else if (var0 == 13)
			Class99.method368("Could not complete login.", "Please try using a different world.", "");
		else if (var0 == 14)
			Class99.method368("The server is being updated.", "Please wait 1 minute and try again.", "");
		else if (var0 == 16)
			Class99.method368("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		else if (var0 == 17)
			Class99.method368("You are standing in a members-only area.",
					"To play on this world move to a free area first", "");
		else if (var0 == 18)
			Class99.method368("Account locked as we suspect it has been stolen.",
					"Press \'recover a locked account\' on front page.", "");
		else if (var0 == 19)
			Class99.method368("This world is running a closed Beta.", "Sorry invited players only.",
					"Please use a different world.");
		else if (var0 == 20)
			Class99.method368("Invalid loginserver requested.", "Please try using a different world.", "");
		else if (var0 == 22)
			Class99.method368("Malformed login packet.", "Please try again.", "");
		else if (var0 == 23)
			Class99.method368("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		else if (var0 == 24)
			Class99.method368("Error loading your profile.", "Please contact customer support.", "");
		else if (var0 == 25)
			Class99.method368("Unexpected loginserver response.", "Please try using a different world.", "");
		else if (var0 == 26)
			Class99.method368("This computers address has been blocked", "as it was used to break our rules.", "");
		else if (var0 == 27)
			Class99.method368("", "Service unavailable.", "");
		else if (var0 == 31)
			Class99.method368("Your account must have a displayname set", "in order to play the game.  Please set it",
					"via the website, or the main game.");
		else if (var0 == 32)
			Class99.method368("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort",
					"this out by visiting the billing system.");
		else if (var0 == 37)
			Class99.method368("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		else if (var0 == 38)
			Class99.method368("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		else if (var0 == 55)
			Class99.method368("Sorry, but your account is not eligible to",
					"play this version of the game.  Please try", "playing the main game instead!");
		else {
			if (var0 == 56) {
				Class99.method368("Enter the 6-digit code generated by your", "authenticator app.", "");
				Class82.method343(11);
				return;
			}

			if (var0 == 57) {
				Class99.method368("The code you entered was incorrect.", "Please try again.", "");
				Class82.method343(11);
				return;
			}

			Class99.method368("Unexpected server response", "Please try using a different world.", "");
		}

		Class82.method343(10);
	}

	static final void method145(final Class109_Sub20 var0, final int var1, final int var2) {
		final Class109_Sub21_Sub19 var3 = var0.method651();
		if (var3 != null)
			if (client.anInt2206 < 3)
				Class109_Sub21_Sub7.aClass109_Sub21_Sub14_Sub2_1408.method929(var1, var2, var3.anInt1633,
						var3.anInt1631, 25, 25, client.anInt2052, 256, var3.anIntArray1636, var3.anIntArray1632);
			else
				Class109_Sub21_Sub14.method781(var1, var2, 0, var3.anIntArray1636, var3.anIntArray1632);
	}

	static void method146() {
		int var0 = LoginEncoder.anInt524;
		int var1 = Class109_Sub21_Sub15_Sub5.anInt1815;
		if (Class70.anInt595 < var0)
			var0 = Class70.anInt595;

		if (Class109_Sub21_Sub15.anInt1574 < var1)
			var1 = Class109_Sub21_Sub15.anInt1574;

		if (Class50.aClass21_513 != null)
			try {
				Class73.method328(client.aclient1968, "resize", new Object[] { Integer.valueOf(Class58.method271()) });
			} catch (final Throwable var3) {
				;
			}

	}

	public static String method147(final long var0) {
		Class32.aCalendar315.setTime(new Date(var0));
		final int var3 = Class32.aCalendar315.get(7);
		final int var2 = Class32.aCalendar315.get(5);
		final int var4 = Class32.aCalendar315.get(2);
		final int var8 = Class32.aCalendar315.get(1);
		final int var6 = Class32.aCalendar315.get(11);
		final int var7 = Class32.aCalendar315.get(12);
		final int var5 = Class32.aCalendar315.get(13);
		return Class32.aStringArray313[var3 - 1] + ", " + (var2 / 10) + (var2 % 10) + "-"
				+ Class32.aStringArrayArray314[0][var4] + "-" + var8 + " " + (var6 / 10) + (var6 % 10) + ":"
				+ (var7 / 10) + (var7 % 10) + ":" + (var5 / 10) + (var5 % 10) + " GMT";
	}

	public static Class109_Sub21_Sub14_Sub1 method148(final Class104 var0, final int var1) {
		final byte[] var2 = var0.method392(var1);
		boolean var3;
		if (var2 == null)
			var3 = false;
		else {
			Class109_Sub4_Sub4.method885(var2);
			var3 = true;
		}

		if (!var3)
			return null;
		else {
			final Class109_Sub21_Sub14_Sub1 var4 = new Class109_Sub21_Sub14_Sub1();
			var4.anInt1712 = Canvas_Sub1.anInt1594;
			var4.anInt1716 = Class9.anInt96;
			var4.anInt1715 = Class9.anIntArray92[0];
			var4.anInt1717 = Class9.anIntArray93[0];
			var4.anInt1713 = Class106.anIntArray799[0];
			var4.anInt1714 = Class9.anIntArray94[0];
			var4.anIntArray1718 = Class35.anIntArray336;
			var4.aByteArray1711 = Class9.aByteArrayArray97[0];
			Class109_Sub21_Sub5.method696();
			return var4;
		}
	}

	public static void method149() {
		Class109_Sub20.aClass120_1141.method439();
		Class109_Sub20.aClass120_1142.method439();
		Class109_Sub20.aClass120_1143.method439();
		Class109_Sub20.aClass120_1144.method439();
	}

	static Class109_Sub21_Sub17 method150(final int var0) {
		final Class109_Sub21_Sub17 var1 = (Class109_Sub21_Sub17) Class109_Sub21_Sub7.aClass120_1393.method438(var0);
		if (null != var1)
			return var1;
		else {
			final Class104 var2 = Class109_Sub21_Sub7.aClass104_1391;
			final Class104 var3 = Class56.aClass104_543;
			boolean var4 = true;
			final int[] var5 = var2.method393(var0);

			for (final int element : var5) {
				final byte[] var7 = var2.method405(var0, element);
				if (null == var7)
					var4 = false;
				else {
					final int var8 = ((var7[0] & 255) << 8) | (var7[1] & 255);
					final byte[] var9 = var3.method405(var8, 0);
					if (var9 == null)
						var4 = false;
				}
			}

			Class109_Sub21_Sub17 var10;
			if (!var4)
				var10 = null;
			else
				try {
					var10 = new Class109_Sub21_Sub17(var2, var3, var0, false);
				} catch (final Exception var12) {
					var10 = null;
				}

			return var10;
		}
	}

	public static Interface4 method151(final Interface4[] var0, final int var1) {
		final Interface4[] var2 = var0;

		for (final Interface4 var4 : var2) {
			if (var1 == var4.method11(2125989447))
				return var4;
		}

		return null;
	}

	static final void method152(final Class109_Sub11 var0) {
		int var1 = 0;
		int var4 = -1;
		int var3 = 0;
		int var2 = 0;
		if (var0.anInt1027 == 0)
			var1 = Class2.aClass42_17.method197(var0.anInt1038, var0.anInt1028, var0.anInt1029);

		if (var0.anInt1027 == 1)
			var1 = Class2.aClass42_17.method198(var0.anInt1038, var0.anInt1028, var0.anInt1029);

		if (var0.anInt1027 == 2)
			var1 = Class2.aClass42_17.method199(var0.anInt1038, var0.anInt1028, var0.anInt1029);

		if (var0.anInt1027 == 3)
			var1 = Class2.aClass42_17.method211(var0.anInt1038, var0.anInt1028, var0.anInt1029);

		if (var1 != 0) {
			final int var5 = Class2.aClass42_17.method223(var0.anInt1038, var0.anInt1028, var0.anInt1029, var1);
			var4 = (var1 >> 14) & 32767;
			var3 = var5 & 31;
			var2 = (var5 >> 6) & 3;
		}

		var0.anInt1030 = var4;
		var0.anInt1033 = var3;
		var0.anInt1031 = var2;
	}

	static final void method153(final Class109_Sub20[] var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6, final int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			final Class109_Sub20 var10 = var0[var8];
			if ((null != var10)
					&& (!var10.aBool1146 || (var10.anInt1229 == 0) || var10.aBool1255 || (Class52.method256(var10) != 0)
							|| (client.aClass109_Sub20_2142 == var10) || (var10.anInt1151 == 1338))
					&& (var10.anInt1166 == var1) && (!var10.aBool1146 || !Class104.method408(var10))) {
				final int var11 = var6 + var10.anInt1160;
				final int var12 = var7 + var10.anInt1161;
				int var13;
				int var14;
				int var15;
				int var16;
				int var18;
				int var19;
				int var20;
				int var23;
				if (var10.anInt1229 == 2) {
					var13 = var2;
					var14 = var3;
					var15 = var4;
					var16 = var5;
				} else if (var10.anInt1229 == 9) {
					var18 = var11;
					var23 = var12;
					var20 = var10.anInt1162 + var11;
					var19 = var10.anInt1163 + var12;
					if (var20 < var11) {
						var18 = var20;
						var20 = var11;
					}

					if (var19 < var12) {
						var23 = var19;
						var19 = var12;
					}

					++var20;
					++var19;
					var13 = var18 > var2 ? var18 : var2;
					var14 = var23 > var3 ? var23 : var3;
					var15 = var20 < var4 ? var20 : var4;
					var16 = var19 < var5 ? var19 : var5;
				} else {
					var18 = var10.anInt1162 + var11;
					var23 = var12 + var10.anInt1163;
					var13 = var11 > var2 ? var11 : var2;
					var14 = var12 > var3 ? var12 : var3;
					var15 = var18 < var4 ? var18 : var4;
					var16 = var23 < var5 ? var23 : var5;
				}

				if (var10 == client.aClass109_Sub20_2082) {
					client.aBool2149 = true;
					client.anInt2115 = var11;
					client.anInt2017 = var12;
				}

				if (!var10.aBool1146 || ((var13 < var15) && (var14 < var16))) {
					var18 = Class81.anInt637;
					var23 = Class81.anInt638;
					if (Class81.anInt643 != 0) {
						var18 = Class81.anInt645;
						var23 = Class81.anInt639;
					}

					int var17;
					int var26;
					int var27;
					if (var10.anInt1151 == 1337) {
						if (!client.aBool2029 && !client.aBool2109 && (var18 >= var13) && (var23 >= var14)
								&& (var18 < var15) && (var23 < var16)) {
							if ((client.anInt2196 == 0) && !client.aBool2171)
								Class65.method291("Walk here", "", 23, 0, var18 - var13, var23 - var14);

							var20 = -1;
							var19 = -1;

							int var41;
							for (var41 = 0; var41 < Class109_Sub21_Sub15_Sub4.anInt1782; ++var41) {
								var17 = Class109_Sub21_Sub15_Sub4.anIntArray1772[var41];
								var26 = var17 & 127;
								var27 = (var17 >> 7) & 127;
								final int var30 = (var17 >> 29) & 3;
								final int var31 = (var17 >> 14) & 32767;
								if (var19 != var17) {
									var19 = var17;
									if ((var30 == 2) && (Class2.aClass42_17.method223(Class77.anInt616, var26, var27,
											var17) >= 0)) {
										Class109_Sub21_Sub10 var22 = Class28.method128(var31);
										if (var22.anIntArray1464 != null)
											var22 = var22.method732();

										if (var22 == null)
											continue;

										if (client.anInt2196 == 1)
											Class65.method291("Use",
													client.aString2122 + " " + "->" + " "
															+ Class109_Sub11.method544('\uffff') + var22.aString1434,
													1, var17, var26, var27);
										else if (client.aBool2171) {
											if ((Canvas_Sub1.anInt1596 & 4) == 4)
												Class65.method291(client.aString2126,
														client.aString2127 + " " + "->" + " "
																+ Class109_Sub11.method544('\uffff')
																+ var22.aString1434,
														2, var17, var26, var27);
										} else {
											String[] var24 = var22.aStringArray1426;
											if (client.aBool2139)
												var24 = Class80.method334(var24);

											if (null != var24)
												for (int var25 = 4; var25 >= 0; --var25)
													if (var24[var25] != null) {
														short var33 = 0;
														if (var25 == 0)
															var33 = 3;

														if (var25 == 1)
															var33 = 4;

														if (var25 == 2)
															var33 = 5;

														if (var25 == 3)
															var33 = 6;

														if (var25 == 4)
															var33 = 1001;

														Class65.method291(var24[var25],
																Class109_Sub11.method544('\uffff') + var22.aString1434,
																var33, var17, var26, var27);
													}

											Class65.method291("Examine",
													Class109_Sub11.method544('\uffff') + var22.aString1434, 1002,
													var22.anInt1431 << 14, var26, var27);
										}
									}

									Class109_Sub21_Sub15_Sub3_Sub1 var29;
									int var32;
									Class109_Sub21_Sub15_Sub3_Sub2 var47;
									if (var30 == 1) {
										final Class109_Sub21_Sub15_Sub3_Sub1 var42 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var31];
										if (var42 == null)
											continue;

										if ((var42.aClass109_Sub21_Sub13_1925.anInt1514 == 1)
												&& ((var42.anInt1710 & 127) == 64) && ((var42.anInt1653 & 127) == 64)) {
											for (var32 = 0; var32 < client.anInt2007; ++var32) {
												var29 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[client.anIntArray2175[var32]];
												if ((var29 != null) && (var29 != var42)
														&& (var29.aClass109_Sub21_Sub13_1925.anInt1514 == 1)
														&& (var42.anInt1710 == var29.anInt1710)
														&& (var42.anInt1653 == var29.anInt1653))
													Class76.method329(var29.aClass109_Sub21_Sub13_1925,
															client.anIntArray2175[var32], var26, var27);
											}

											for (var32 = 0; var32 < client.anInt2087; ++var32) {
												var47 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[client.anIntArray2134[var32]];
												if ((null != var47) && (var47.anInt1710 == var42.anInt1710)
														&& (var47.anInt1653 == var42.anInt1653))
													Canvas_Sub1.method848(var47, client.anIntArray2134[var32], var26,
															var27);
											}
										}

										Class76.method329(var42.aClass109_Sub21_Sub13_1925, var31, var26, var27);
									}

									if (var30 == 0) {
										final Class109_Sub21_Sub15_Sub3_Sub2 var43 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var31];
										if (null == var43)
											continue;

										if (((var43.anInt1710 & 127) == 64) && ((var43.anInt1653 & 127) == 64)) {
											for (var32 = 0; var32 < client.anInt2007; ++var32) {
												var29 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[client.anIntArray2175[var32]];
												if ((null != var29) && (var29.aClass109_Sub21_Sub13_1925.anInt1514 == 1)
														&& (var43.anInt1710 == var29.anInt1710)
														&& (var29.anInt1653 == var43.anInt1653))
													Class76.method329(var29.aClass109_Sub21_Sub13_1925,
															client.anIntArray2175[var32], var26, var27);
											}

											for (var32 = 0; var32 < client.anInt2087; ++var32) {
												var47 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[client.anIntArray2134[var32]];
												if ((var47 != null) && (var47 != var43)
														&& (var43.anInt1710 == var47.anInt1710)
														&& (var43.anInt1653 == var47.anInt1653))
													Canvas_Sub1.method848(var47, client.anIntArray2134[var32], var26,
															var27);
											}
										}

										if (var31 != client.anInt2100)
											Canvas_Sub1.method848(var43, var31, var26, var27);
										else
											var20 = var17;
									}

									if (var30 == 3) {
										final Class126 var44 = client.aClass126ArrayArrayArray2121[Class77.anInt616][var26][var27];
										if (null != var44)
											for (Class109_Sub21_Sub15_Sub1 var45 = (Class109_Sub21_Sub15_Sub1) var44
													.method455(); var45 != null; var45 = (Class109_Sub21_Sub15_Sub1) var44
															.method457()) {
												final Class109_Sub21_Sub5 var48 = Class109_Sub23
														.method660(var45.anInt1638);
												if (client.anInt2196 == 1)
													Class65.method291("Use", client.aString2122 + " " + "->" + " "
															+ Class109_Sub11.method544(16748608) + var48.aString1372,
															16, var45.anInt1638, var26, var27);
												else if (client.aBool2171) {
													if ((Canvas_Sub1.anInt1596 & 1) == 1)
														Class65.method291(client.aString2126,
																client.aString2127 + " " + "->" + " "
																		+ Class109_Sub11.method544(16748608)
																		+ var48.aString1372,
																17, var45.anInt1638, var26, var27);
												} else {
													String[] var34 = var48.aStringArray1339;
													if (client.aBool2139)
														var34 = Class80.method334(var34);

													for (int var35 = 4; var35 >= 0; --var35)
														if ((var34 != null) && (var34[var35] != null)) {
															byte var36 = 0;
															if (var35 == 0)
																var36 = 18;

															if (var35 == 1)
																var36 = 19;

															if (var35 == 2)
																var36 = 20;

															if (var35 == 3)
																var36 = 21;

															if (var35 == 4)
																var36 = 22;

															Class65.method291(var34[var35],
																	Class109_Sub11.method544(16748608)
																			+ var48.aString1372,
																	var36, var45.anInt1638, var26, var27);
														} else if (var35 == 2)
															Class65.method291("Take",
																	Class109_Sub11.method544(16748608)
																			+ var48.aString1372,
																	20, var45.anInt1638, var26, var27);

													Class65.method291("Examine",
															Class109_Sub11.method544(16748608) + var48.aString1372,
															1004, var45.anInt1638, var26, var27);
												}
											}
									}
								}
							}

							if (var20 != -1) {
								var41 = var20 & 127;
								var17 = (var20 >> 7) & 127;
								final Class109_Sub21_Sub15_Sub3_Sub2 var46 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[client.anInt2100];
								Canvas_Sub1.method848(var46, client.anInt2100, var41, var17);
							}
						}
					} else if (var10.anInt1151 == 1338)
						Class55.method266(var10, var11, var12);
					else {
						if (!client.aBool2109 && (var18 >= var13) && (var23 >= var14) && (var18 < var15)
								&& (var23 < var16))
							Class53.method260(var10, var18 - var11, var23 - var12);

						if (var10.anInt1229 == 0) {
							if (!var10.aBool1146 && Class104.method408(var10)
									&& (var10 != Class109_Sub13.aClass109_Sub20_1052))
								continue;

							method153(var0, var10.anInt1148, var13, var14, var15, var16, var11 - var10.anInt1168,
									var12 - var10.anInt1169);
							if (var10.aClass109_Sub20Array1272 != null)
								method153(var10.aClass109_Sub20Array1272, var10.anInt1148, var13, var14, var15, var16,
										var11 - var10.anInt1168, var12 - var10.anInt1169);

							final Class109_Sub13 var37 = (Class109_Sub13) client.aClass116_2129
									.method429(var10.anInt1148);
							if (var37 != null) {
								if ((var37.anInt1045 == 0) && (Class81.anInt637 >= var13) && (Class81.anInt638 >= var14)
										&& (Class81.anInt637 < var15) && (Class81.anInt638 < var16) && !client.aBool2109
										&& !client.aBool2138) {
									client.aStringArray1975[0] = "Cancel";
									client.aStringArray2123[0] = "";
									client.anIntArray2113[0] = 1006;
									client.anInt2045 = 1;
								}

								Class20.method95(var37.anInt1050, var13, var14, var15, var16, var11, var12);
							}
						}

						if (var10.aBool1146) {
							if (var10.aBool1223 && (Class81.anInt637 >= var13) && (Class81.anInt638 >= var14)
									&& (Class81.anInt637 < var15) && (Class81.anInt638 < var16)) {
								for (Class109_Sub9 var49 = (Class109_Sub9) client.aClass126_2169
										.method458(); var49 != null; var49 = (Class109_Sub9) client.aClass126_2169
												.method449())
									if (var49.aBool1008) {
										var49.method413();
										var49.aClass109_Sub20_996.aBool1156 = false;
									}

								if (Class26.anInt226 == 0) {
									client.aClass109_Sub20_2082 = null;
									client.aClass109_Sub20_2142 = null;
								}

								if (!client.aBool2109) {
									client.aStringArray1975[0] = "Cancel";
									client.aStringArray2123[0] = "";
									client.anIntArray2113[0] = 1006;
									client.anInt2045 = 1;
								}
							}

							boolean var40;
							if ((Class81.anInt637 >= var13) && (Class81.anInt638 >= var14) && (Class81.anInt637 < var15)
									&& (Class81.anInt638 < var16))
								var40 = true;
							else
								var40 = false;

							boolean var39 = false;
							if (((Class81.anInt636 == 1) || (!Class3.aBool22 && (Class81.anInt636 == 4))) && var40)
								var39 = true;

							boolean var21 = false;
							if (((Class81.anInt643 == 1) || (!Class3.aBool22 && (Class81.anInt643 == 4)))
									&& (Class81.anInt645 >= var13) && (Class81.anInt639 >= var14)
									&& (Class81.anInt645 < var15) && (Class81.anInt639 < var16))
								var21 = true;

							if (var21)
								Class99.method367(var10, Class81.anInt645 - var11, Class81.anInt639 - var12);

							if ((null != client.aClass109_Sub20_2082) && (var10 != client.aClass109_Sub20_2082) && var40
									&& Class47.method241(Class52.method256(var10)))
								client.aClass109_Sub20_2108 = var10;

							if (client.aClass109_Sub20_2142 == var10) {
								client.aBool2048 = true;
								client.anInt2219 = var11;
								client.anInt2167 = var12;
							}

							if (var10.aBool1255) {
								Class109_Sub9 var9;
								if (var40 && (client.anInt2168 != 0) && (var10.anObjectArray1216 != null)) {
									var9 = new Class109_Sub9();
									var9.aBool1008 = true;
									var9.aClass109_Sub20_996 = var10;
									var9.anInt1000 = client.anInt2168;
									var9.anObjectArray997 = var10.anObjectArray1216;
									client.aClass126_2169.method450(var9);
								}

								if ((client.aClass109_Sub20_2082 != null) || (null != Class21.aClass109_Sub20_202)
										|| client.aBool2109) {
									var21 = false;
									var39 = false;
									var40 = false;
								}

								if (!var10.aBool1200 && var21) {
									var10.aBool1200 = true;
									if (var10.anObjectArray1227 != null) {
										var9 = new Class109_Sub9();
										var9.aBool1008 = true;
										var9.aClass109_Sub20_996 = var10;
										var9.anInt1002 = Class81.anInt645 - var11;
										var9.anInt1000 = Class81.anInt639 - var12;
										var9.anObjectArray997 = var10.anObjectArray1227;
										client.aClass126_2169.method450(var9);
									}
								}

								if (var10.aBool1200 && var39 && (null != var10.anObjectArray1228)) {
									var9 = new Class109_Sub9();
									var9.aBool1008 = true;
									var9.aClass109_Sub20_996 = var10;
									var9.anInt1002 = Class81.anInt637 - var11;
									var9.anInt1000 = Class81.anInt638 - var12;
									var9.anObjectArray997 = var10.anObjectArray1228;
									client.aClass126_2169.method450(var9);
								}

								if (var10.aBool1200 && !var39) {
									var10.aBool1200 = false;
									if (var10.anObjectArray1195 != null) {
										var9 = new Class109_Sub9();
										var9.aBool1008 = true;
										var9.aClass109_Sub20_996 = var10;
										var9.anInt1002 = Class81.anInt637 - var11;
										var9.anInt1000 = Class81.anInt638 - var12;
										var9.anObjectArray997 = var10.anObjectArray1195;
										client.aClass126_2088.method450(var9);
									}
								}

								if (var39 && (null != var10.anObjectArray1230)) {
									var9 = new Class109_Sub9();
									var9.aBool1008 = true;
									var9.aClass109_Sub20_996 = var10;
									var9.anInt1002 = Class81.anInt637 - var11;
									var9.anInt1000 = Class81.anInt638 - var12;
									var9.anObjectArray997 = var10.anObjectArray1230;
									client.aClass126_2169.method450(var9);
								}

								if (!var10.aBool1156 && var40) {
									var10.aBool1156 = true;
									if (var10.anObjectArray1277 != null) {
										var9 = new Class109_Sub9();
										var9.aBool1008 = true;
										var9.aClass109_Sub20_996 = var10;
										var9.anInt1002 = Class81.anInt637 - var11;
										var9.anInt1000 = Class81.anInt638 - var12;
										var9.anObjectArray997 = var10.anObjectArray1277;
										client.aClass126_2169.method450(var9);
									}
								}

								if (var10.aBool1156 && var40 && (null != var10.anObjectArray1232)) {
									var9 = new Class109_Sub9();
									var9.aBool1008 = true;
									var9.aClass109_Sub20_996 = var10;
									var9.anInt1002 = Class81.anInt637 - var11;
									var9.anInt1000 = Class81.anInt638 - var12;
									var9.anObjectArray997 = var10.anObjectArray1232;
									client.aClass126_2169.method450(var9);
								}

								if (var10.aBool1156 && !var40) {
									var10.aBool1156 = false;
									if (var10.anObjectArray1233 != null) {
										var9 = new Class109_Sub9();
										var9.aBool1008 = true;
										var9.aClass109_Sub20_996 = var10;
										var9.anInt1002 = Class81.anInt637 - var11;
										var9.anInt1000 = Class81.anInt638 - var12;
										var9.anObjectArray997 = var10.anObjectArray1233;
										client.aClass126_2088.method450(var9);
									}
								}

								if (null != var10.anObjectArray1138) {
									var9 = new Class109_Sub9();
									var9.aClass109_Sub20_996 = var10;
									var9.anObjectArray997 = var10.anObjectArray1138;
									client.aClass126_2170.method450(var9);
								}

								Class109_Sub9 var38;
								if ((null != var10.anObjectArray1238) && (client.anInt2041 > var10.anInt1239)) {
									if ((null != var10.anIntArray1231) && ((client.anInt2041 - var10.anInt1239) <= 32))
										label1079: for (var17 = var10.anInt1239; var17 < client.anInt2041; ++var17) {
											var26 = client.anIntArray1992[var17 & 31];

											for (var27 = 0; var27 < var10.anIntArray1231.length; ++var27)
												if (var26 == var10.anIntArray1231[var27]) {
													var38 = new Class109_Sub9();
													var38.aClass109_Sub20_996 = var10;
													var38.anObjectArray997 = var10.anObjectArray1238;
													client.aClass126_2169.method450(var38);
													break label1079;
												}
										}
									else {
										var9 = new Class109_Sub9();
										var9.aClass109_Sub20_996 = var10;
										var9.anObjectArray997 = var10.anObjectArray1238;
										client.aClass126_2169.method450(var9);
									}

									var10.anInt1239 = client.anInt2041;
								}

								if ((var10.anObjectArray1196 != null) && (client.anInt2145 > var10.anInt1278)) {
									if ((var10.anIntArray1211 != null) && ((client.anInt2145 - var10.anInt1278) <= 32))
										label1055: for (var17 = var10.anInt1278; var17 < client.anInt2145; ++var17) {
											var26 = client.anIntArray2156[var17 & 31];

											for (var27 = 0; var27 < var10.anIntArray1211.length; ++var27)
												if (var26 == var10.anIntArray1211[var27]) {
													var38 = new Class109_Sub9();
													var38.aClass109_Sub20_996 = var10;
													var38.anObjectArray997 = var10.anObjectArray1196;
													client.aClass126_2169.method450(var38);
													break label1055;
												}
										}
									else {
										var9 = new Class109_Sub9();
										var9.aClass109_Sub20_996 = var10;
										var9.anObjectArray997 = var10.anObjectArray1196;
										client.aClass126_2169.method450(var9);
									}

									var10.anInt1278 = client.anInt2145;
								}

								if ((var10.anObjectArray1242 != null) && (client.anInt2224 > var10.anInt1165)) {
									if ((var10.anIntArray1243 != null) && ((client.anInt2224 - var10.anInt1165) <= 32))
										label1031: for (var17 = var10.anInt1165; var17 < client.anInt2224; ++var17) {
											var26 = client.anIntArray2146[var17 & 31];

											for (var27 = 0; var27 < var10.anIntArray1243.length; ++var27)
												if (var10.anIntArray1243[var27] == var26) {
													var38 = new Class109_Sub9();
													var38.aClass109_Sub20_996 = var10;
													var38.anObjectArray997 = var10.anObjectArray1242;
													client.aClass126_2169.method450(var38);
													break label1031;
												}
										}
									else {
										var9 = new Class109_Sub9();
										var9.aClass109_Sub20_996 = var10;
										var9.anObjectArray997 = var10.anObjectArray1242;
										client.aClass126_2169.method450(var9);
									}

									var10.anInt1165 = client.anInt2224;
								}

								if ((client.anInt2160 > var10.anInt1217) && (var10.anObjectArray1247 != null)) {
									var9 = new Class109_Sub9();
									var9.aClass109_Sub20_996 = var10;
									var9.anObjectArray997 = var10.anObjectArray1247;
									client.aClass126_2169.method450(var9);
								}

								if ((client.anInt2161 > var10.anInt1217) && (null != var10.anObjectArray1249)) {
									var9 = new Class109_Sub9();
									var9.aClass109_Sub20_996 = var10;
									var9.anObjectArray997 = var10.anObjectArray1249;
									client.aClass126_2169.method450(var9);
								}

								if ((client.anInt2162 > var10.anInt1217) && (null != var10.anObjectArray1173)) {
									var9 = new Class109_Sub9();
									var9.aClass109_Sub20_996 = var10;
									var9.anObjectArray997 = var10.anObjectArray1173;
									client.aClass126_2169.method450(var9);
								}

								if ((client.anInt2163 > var10.anInt1217) && (null != var10.anObjectArray1270)) {
									var9 = new Class109_Sub9();
									var9.aClass109_Sub20_996 = var10;
									var9.anObjectArray997 = var10.anObjectArray1270;
									client.aClass126_2169.method450(var9);
								}

								if ((client.anInt2061 > var10.anInt1217) && (var10.anObjectArray1256 != null)) {
									var9 = new Class109_Sub9();
									var9.aClass109_Sub20_996 = var10;
									var9.anObjectArray997 = var10.anObjectArray1256;
									client.aClass126_2169.method450(var9);
								}

								if ((client.anInt2165 > var10.anInt1217) && (var10.anObjectArray1251 != null)) {
									var9 = new Class109_Sub9();
									var9.aClass109_Sub20_996 = var10;
									var9.anObjectArray997 = var10.anObjectArray1251;
									client.aClass126_2169.method450(var9);
								}

								var10.anInt1217 = client.anInt2131;
								if (null != var10.anObjectArray1197)
									for (var17 = 0; var17 < client.anInt2193; ++var17) {
										final Class109_Sub9 var28 = new Class109_Sub9();
										var28.aClass109_Sub20_996 = var10;
										var28.anInt1003 = client.anIntArray2195[var17];
										var28.anInt1004 = client.anIntArray2194[var17];
										var28.anObjectArray997 = var10.anObjectArray1197;
										client.aClass126_2169.method450(var28);
									}
							}
						}

						if (!var10.aBool1146 && (null == client.aClass109_Sub20_2082)
								&& (null == Class21.aClass109_Sub20_202) && !client.aBool2109) {
							if (((var10.anInt1260 >= 0) || (var10.anInt1174 != 0)) && (Class81.anInt637 >= var13)
									&& (Class81.anInt638 >= var14) && (Class81.anInt637 < var15)
									&& (Class81.anInt638 < var16))
								if (var10.anInt1260 >= 0)
									Class109_Sub13.aClass109_Sub20_1052 = var0[var10.anInt1260];
								else
									Class109_Sub13.aClass109_Sub20_1052 = var10;

							if ((var10.anInt1229 == 8) && (Class81.anInt637 >= var13) && (Class81.anInt638 >= var14)
									&& (Class81.anInt637 < var15) && (Class81.anInt638 < var16))
								Class109_Sub21_Sub15_Sub6.aClass109_Sub20_1837 = var10;

							if (var10.anInt1171 > var10.anInt1163)
								Class109_Sub21_Sub8.method716(var10, var11 + var10.anInt1162, var12, var10.anInt1163,
										var10.anInt1171, Class81.anInt637, Class81.anInt638);
						}
					}
				}
			}
		}

	}
}
