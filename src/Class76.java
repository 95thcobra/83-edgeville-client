public class Class76 {
	static final void method329(Class109_Sub21_Sub13 var0, final int var1, final int var2, final int var3) {
		if (client.anInt2045 < 400) {
			if (var0.anIntArray1516 != null)
				var0 = var0.method763();

			if (var0 != null)
				if (var0.aBool1541)
					if (!var0.aBool1513 || (client.anInt2235 == var1)) {
						String var7 = var0.aString1528;
						if (var0.anInt1530 != 0)
							var7 = var7
									+ Class30.method134(var0.anInt1530,
											Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1932)
									+ " " + " (" + "level-" + var0.anInt1530 + ")";

						if (client.anInt2196 == 1)
							Class65.method291("Use",
									client.aString2122 + " " + "->" + " " + Class109_Sub11.method544(16776960) + var7,
									7, var1, var2, var3);
						else if (client.aBool2171) {
							if ((Canvas_Sub1.anInt1596 & 2) == 2)
								Class65.method291(client.aString2126, client.aString2127 + " " + "->" + " "
										+ Class109_Sub11.method544(16776960) + var7, 8, var1, var2, var3);
						} else {
							String[] var5 = var0.aStringArray1545;
							if (client.aBool2139)
								var5 = Class80.method334(var5);

							int var6;
							if (var5 != null)
								for (var6 = 4; var6 >= 0; --var6)
									if ((null != var5[var6]) && !var5[var6].equalsIgnoreCase("Attack")) {
										byte var4 = 0;
										if (var6 == 0)
											var4 = 9;

										if (var6 == 1)
											var4 = 10;

										if (var6 == 2)
											var4 = 11;

										if (var6 == 3)
											var4 = 12;

										if (var6 == 4)
											var4 = 13;

										Class65.method291(var5[var6], Class109_Sub11.method544(16776960) + var7, var4,
												var1, var2, var3);
									}

							if (null != var5)
								for (var6 = 4; var6 >= 0; --var6)
									if ((var5[var6] != null) && var5[var6].equalsIgnoreCase("Attack")) {
										short var9 = 0;
										if ((client.aClass49_2176 == Class49.aClass49_507)
												|| ((Class49.aClass49_508 == client.aClass49_2176)
														&& (var0.anInt1530 > Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1932)))
											var9 = 2000;

										int var8 = 0;
										if (var6 == 0)
											var8 = 9 + var9;

										if (var6 == 1)
											var8 = var9 + 10;

										if (var6 == 2)
											var8 = 11 + var9;

										if (var6 == 3)
											var8 = 12 + var9;

										if (var6 == 4)
											var8 = var9 + 13;

										Class65.method291(var5[var6], Class109_Sub11.method544(16776960) + var7, var8,
												var1, var2, var3);
									}

							Class65.method291("Examine", Class109_Sub11.method544(16776960) + var7, 1003, var1, var2,
									var3);
						}

					}
		}
	}
}
