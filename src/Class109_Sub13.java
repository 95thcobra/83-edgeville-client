import java.net.URL;
import java.util.Date;

public class Class109_Sub13 extends Class109 {
	int anInt1045;
	static int[] anIntArray1047;
	static int anInt1048;
	static Class86 aClass86_1049;
	int anInt1050;
	static Class86 aClass86_1051;
	static Class109_Sub20 aClass109_Sub20_1052;
	boolean aBool1046 = false;

	static Class109_Sub21_Sub16 method548(final int var0, final int var1) {
		Class109_Sub21_Sub16 var2 = (Class109_Sub21_Sub16) Class109_Sub21_Sub16.aClass120_1583.method438(var0);
		if (var2 != null)
			return var2;
		else {
			final byte[] var4 = Class115.aClass104_Sub1_829.method387(var0, 0);
			if (var4 == null)
				return null;
			else {
				var2 = new Class109_Sub21_Sub16();
				final DataBuffer var5 = new DataBuffer(var4);
				var5.position = var5.data.length - 12;
				final int var6 = var5.readInt();
				var2.anInt1584 = var5.readShort();
				var2.anInt1581 = var5.readShort();
				var2.anInt1580 = var5.readShort();
				var2.anInt1582 = var5.readShort();
				var5.position = 0;
				var5.method570();
				var2.anIntArray1578 = new int[var6];
				var2.anIntArray1585 = new int[var6];
				var2.aStringArray1579 = new String[var6];

				int var3;
				for (int var7 = 0; var5.position < (var5.data.length
						- 12); var2.anIntArray1578[var7++] = var3) {
					var3 = var5.readShort();
					if (var3 == 3)
						var2.aStringArray1579[var7] = var5.method602();
					else if ((var3 < 100) && (var3 != 21) && (var3 != 38) && (var3 != 39))
						var2.anIntArray1585[var7] = var5.readInt();
					else
						var2.anIntArray1585[var7] = var5.method564();
				}

				Class109_Sub21_Sub16.aClass120_1583.method440(var2, var0);
				return var2;
			}
		}
	}

	static String method549(String var0, final Class109_Sub20 var1) {
		if (var0.indexOf("%") != -1) {
			int var5;
			for (var5 = 1; var5 <= 5; ++var5)
				while (true) {
					final int var4 = var0.indexOf("%" + var5);
					if (var4 == -1)
						break;

					final String var2 = var0.substring(0, var4);
					final int var7 = Class33.method143(var1, var5 - 1);
					String var3;
					if (var7 < 999999999)
						var3 = Integer.toString(var7);
					else
						var3 = "*";

					var0 = var2 + var3 + var0.substring(var4 + 2);
				}

			while (true) {
				var5 = var0.indexOf("%dns");
				if (var5 == -1)
					break;

				String var6 = "";
				if (null != client.aClass86_1997) {
					var6 = Class109_Sub21_Sub9.method720(client.aClass86_1997.anInt666);
					if (null != client.aClass86_1997.anObject662)
						var6 = (String) client.aClass86_1997.anObject662;
				}

				var0 = var0.substring(0, var5) + var6 + var0.substring(4 + var5);
			}
		}

		return var0;
	}

	static boolean method550(final int var0) {
		try {
			if (null == Class109_Sub21_Sub19.aClass44_1635)
				Class109_Sub21_Sub19.aClass44_1635 = new Class44(Class109_Sub21_Sub11.aClass71_1495,
						new URL(Class109_Sub12.aString1039));
			else {
				final byte[] var1 = Class109_Sub21_Sub19.aClass44_1635.method229(-914418587);
				if (var1 != null) {
					final DataBuffer var2 = new DataBuffer(var1);
					Class46.anInt481 = var2.readShort();
					Class46.aClass46Array485 = new Class46[Class46.anInt481];

					Class46 var4;
					for (int var3 = 0; var3 < Class46.anInt481; var4.anInt491 = var3++) {
						var4 = Class46.aClass46Array485[var3] = new Class46();
						var4.anInt492 = var2.readShort();
						var4.anInt480 = var2.readInt();
						var4.aString487 = var2.method602();
						var4.aString488 = var2.method602();
						var4.anInt489 = var2.method564();
						var4.anInt479 = var2.method575();
					}

					Class109_Sub21_Sub8.method717(Class46.aClass46Array485, 0, Class46.aClass46Array485.length - 1,
							Class46.anIntArray484, Class46.anIntArray483);
					Class109_Sub21_Sub19.aClass44_1635 = null;
					return true;
				}
			}
		} catch (final Exception var5) {
			var5.printStackTrace();
			Class109_Sub21_Sub19.aClass44_1635 = null;
		}

		return false;
	}

	static void method551(final Class109_Sub9 var0, final int var1) {
		final Object[] var2 = var0.anObjectArray997;
		final int var3 = ((Integer) var2[0]).intValue();
		Class109_Sub21_Sub16 var4 = method548(var3, 680367189);
		if (var4 != null) {
			int var5 = 0;
			int var6 = 0;
			int var7 = -1;
			int[] var8 = var4.anIntArray1578;
			int[] var9 = var4.anIntArray1585;
			final byte var10 = -1;
			Class1.anInt6 = 0;

			int var13;
			try {
				Class1.anIntArray10 = new int[var4.anInt1584];
				int var11 = 0;
				Class109_Sub21_Sub15_Sub1.aStringArray1640 = new String[var4.anInt1581];
				int var12 = 0;

				int var14;
				String var15;
				for (var13 = 1; var13 < var2.length; ++var13)
					if (var2[var13] instanceof Integer) {
						var14 = ((Integer) var2[var13]).intValue();
						if (var14 == -2147483647)
							var14 = var0.anInt1002;

						if (var14 == -2147483646)
							var14 = var0.anInt1000;

						if (var14 == -2147483645)
							var14 = null != var0.aClass109_Sub20_996 ? var0.aClass109_Sub20_996.anInt1148 : -1;

						if (var14 == -2147483644)
							var14 = var0.anInt1001;

						if (var14 == -2147483643)
							var14 = var0.aClass109_Sub20_996 != null ? var0.aClass109_Sub20_996.anInt1147 : -1;

						if (var14 == -2147483642)
							var14 = null != var0.aClass109_Sub20_999 ? var0.aClass109_Sub20_999.anInt1148 : -1;

						if (var14 == -2147483641)
							var14 = var0.aClass109_Sub20_999 != null ? var0.aClass109_Sub20_999.anInt1147 : -1;

						if (var14 == -2147483640)
							var14 = var0.anInt1003;

						if (var14 == -2147483639)
							var14 = var0.anInt1004;

						Class1.anIntArray10[var11++] = var14;
					} else if (var2[var13] instanceof String) {
						var15 = (String) var2[var13];
						if (var15.equals("event_opbase"))
							var15 = var0.aString1005;

						Class109_Sub21_Sub15_Sub1.aStringArray1640[var12++] = var15;
					}

				var13 = 0;
				Class1.anInt2 = var0.anInt1007;

				label3505: while (true) {
					++var13;
					if (var13 > var1)
						throw new RuntimeException();

					++var7;
					int var46 = var8[var7];
					int var16;
					int var10001;
					int var18;
					int var19;
					int var20;
					int var21;
					int var28;
					int[] var49;
					String var64;
					String[] var69;
					String var71;
					String var73;
					byte var75;
					String var76;
					if (var46 < 100) {
						if (var46 == 0) {
							Class1.anIntArray4[var5++] = var9[var7];
							continue;
						}

						if (var46 == 1) {
							var14 = var9[var7];
							Class1.anIntArray4[var5++] = Class106.anIntArray798[var14];
							continue;
						}

						if (var46 == 2) {
							var14 = var9[var7];
							--var5;
							Class106.anIntArray798[var14] = Class1.anIntArray4[var5];
							Class47.method244(var14);
							continue;
						}

						if (var46 == 3) {
							Class1.aStringArray5[var6++] = var4.aStringArray1579[var7];
							continue;
						}

						if (var46 == 6) {
							var7 += var9[var7];
							continue;
						}

						if (var46 == 7) {
							var5 -= 2;
							if (Class1.anIntArray4[var5] != Class1.anIntArray4[1 + var5])
								var7 += var9[var7];
							continue;
						}

						if (var46 == 8) {
							var5 -= 2;
							if (Class1.anIntArray4[var5 + 1] == Class1.anIntArray4[var5])
								var7 += var9[var7];
							continue;
						}

						if (var46 == 9) {
							var5 -= 2;
							if (Class1.anIntArray4[var5] < Class1.anIntArray4[1 + var5])
								var7 += var9[var7];
							continue;
						}

						if (var46 == 10) {
							var5 -= 2;
							if (Class1.anIntArray4[var5] > Class1.anIntArray4[1 + var5])
								var7 += var9[var7];
							continue;
						}

						if (var46 == 21) {
							if (Class1.anInt6 == 0)
								return;

							final Class34 var47 = Class1.aClass34Array7[--Class1.anInt6];
							var4 = var47.aClass109_Sub21_Sub16_330;
							var8 = var4.anIntArray1578;
							var9 = var4.anIntArray1585;
							var7 = var47.anInt327;
							Class1.anIntArray10 = var47.anIntArray329;
							Class109_Sub21_Sub15_Sub1.aStringArray1640 = var47.aStringArray328;
							continue;
						}

						if (var46 == 25) {
							var14 = var9[var7];
							Class1.anIntArray4[var5++] = Class44.method230(var14, (byte) -63);
							continue;
						}

						if (var46 == 27) {
							var14 = var9[var7];
							--var5;
							var16 = Class1.anIntArray4[var5];
							final Class109_Sub21_Sub8 var98 = Class54.method262(var14);
							var18 = var98.anInt1409;
							var19 = var98.anInt1410;
							var20 = var98.anInt1411;
							var21 = Class106.anIntArray800[var20 - var19];
							if ((var16 < 0) || (var16 > var21))
								var16 = 0;

							var21 <<= var19;
							Class106.anIntArray798[var18] = (Class106.anIntArray798[var18] & ~var21)
									| ((var16 << var19) & var21);
							continue;
						}

						if (var46 == 31) {
							var5 -= 2;
							if (Class1.anIntArray4[var5] <= Class1.anIntArray4[var5 + 1])
								var7 += var9[var7];
							continue;
						}

						if (var46 == 32) {
							var5 -= 2;
							if (Class1.anIntArray4[var5] >= Class1.anIntArray4[1 + var5])
								var7 += var9[var7];
							continue;
						}

						if (var46 == 33) {
							Class1.anIntArray4[var5++] = Class1.anIntArray10[var9[var7]];
							continue;
						}

						if (var46 == 34) {
							var10001 = var9[var7];
							--var5;
							Class1.anIntArray10[var10001] = Class1.anIntArray4[var5];
							continue;
						}

						if (var46 == 35) {
							Class1.aStringArray5[var6++] = Class109_Sub21_Sub15_Sub1.aStringArray1640[var9[var7]];
							continue;
						}

						if (var46 == 36) {
							var10001 = var9[var7];
							--var6;
							Class109_Sub21_Sub15_Sub1.aStringArray1640[var10001] = Class1.aStringArray5[var6];
							continue;
						}

						if (var46 == 37) {
							var14 = var9[var7];
							var6 -= var14;
							final String[] var96 = Class1.aStringArray5;
							if (var14 == 0)
								var71 = "";
							else if (var14 == 1) {
								var64 = var96[var6];
								if (var64 == null)
									var71 = "null";
								else
									var71 = var64.toString();
							} else {
								var18 = var14 + var6;
								var19 = 0;

								for (var20 = var6; var20 < var18; ++var20) {
									var76 = var96[var20];
									if (var76 == null)
										var19 += 4;
									else
										var19 += var76.length();
								}

								final StringBuilder var97 = new StringBuilder(var19);

								for (var21 = var6; var21 < var18; ++var21) {
									var73 = var96[var21];
									if (null == var73)
										var97.append("null");
									else
										var97.append(var73);
								}

								var71 = var97.toString();
							}

							Class1.aStringArray5[var6++] = var71;
							continue;
						}

						if (var46 == 38) {
							--var5;
							continue;
						}

						if (var46 == 39) {
							--var6;
							continue;
						}

						if (var46 == 40) {
							var14 = var9[var7];
							final Class109_Sub21_Sub16 var112 = method548(var14, -1302316175);
							var49 = new int[var112.anInt1584];
							var69 = new String[var112.anInt1581];

							for (var19 = 0; var19 < var112.anInt1580; ++var19)
								var49[var19] = Class1.anIntArray4[(var5 - var112.anInt1580) + var19];

							for (var19 = 0; var19 < var112.anInt1582; ++var19)
								var69[var19] = Class1.aStringArray5[(var6 - var112.anInt1582) + var19];

							var5 -= var112.anInt1580;
							var6 -= var112.anInt1582;
							final Class34 var110 = new Class34();
							var110.aClass109_Sub21_Sub16_330 = var4;
							var110.anInt327 = var7;
							var110.anIntArray329 = Class1.anIntArray10;
							var110.aStringArray328 = Class109_Sub21_Sub15_Sub1.aStringArray1640;
							Class1.aClass34Array7[++Class1.anInt6 - 1] = var110;
							var4 = var112;
							var8 = var112.anIntArray1578;
							var9 = var112.anIntArray1585;
							var7 = -1;
							Class1.anIntArray10 = var49;
							Class109_Sub21_Sub15_Sub1.aStringArray1640 = var69;
							continue;
						}

						if (var46 == 42) {
							Class1.anIntArray4[var5++] = client.anIntArray2166[var9[var7]];
							continue;
						}

						if (var46 == 43) {
							var10001 = var9[var7];
							--var5;
							client.anIntArray2166[var10001] = Class1.anIntArray4[var5];
							continue;
						}

						if (var46 == 44) {
							var14 = var9[var7] >> 16;
							var16 = var9[var7] & '\uffff';
							--var5;
							var28 = Class1.anIntArray4[var5];
							if ((var28 >= 0) && (var28 <= 5000)) {
								Class1.anIntArray11[var14] = var28;
								var75 = -1;
								if (var16 == 105)
									var75 = 0;

								var19 = 0;

								while (true) {
									if (var19 >= var28)
										continue label3505;

									Class1.anIntArrayArray3[var14][var19] = var75;
									++var19;
								}
							}

							throw new RuntimeException();
						}

						if (var46 == 45) {
							var14 = var9[var7];
							--var5;
							var16 = Class1.anIntArray4[var5];
							if ((var16 >= 0) && (var16 < Class1.anIntArray11[var14])) {
								Class1.anIntArray4[var5++] = Class1.anIntArrayArray3[var14][var16];
								continue;
							}

							throw new RuntimeException();
						}

						if (var46 == 46) {
							var14 = var9[var7];
							var5 -= 2;
							var16 = Class1.anIntArray4[var5];
							if ((var16 >= 0) && (var16 < Class1.anIntArray11[var14])) {
								Class1.anIntArrayArray3[var14][var16] = Class1.anIntArray4[var5 + 1];
								continue;
							}

							throw new RuntimeException();
						}

						if (var46 == 47) {
							var15 = client.aStringArray2060[var9[var7]];
							if (null == var15)
								var15 = "null";

							Class1.aStringArray5[var6++] = var15;
							continue;
						}

						if (var46 == 48) {
							var10001 = var9[var7];
							--var6;
							client.aStringArray2060[var10001] = Class1.aStringArray5[var6];
							continue;
						}
					}

					boolean var53;
					if (var9[var7] == 1)
						var53 = true;
					else
						var53 = false;

					Class109_Sub20 var22;
					Class109_Sub20 var23;
					boolean var54;
					Class109_Sub20 var77;
					Class109_Sub20 var80;
					boolean var90;
					if (var46 < 1000) {
						if (var46 == 100) {
							var5 -= 3;
							var16 = Class1.anIntArray4[var5];
							var28 = Class1.anIntArray4[1 + var5];
							var18 = Class1.anIntArray4[2 + var5];
							if (var28 == 0)
								throw new RuntimeException();

							var80 = Class83.method345(var16);
							if (var80.aClass109_Sub20Array1272 == null)
								var80.aClass109_Sub20Array1272 = new Class109_Sub20[1 + var18];

							if (var80.aClass109_Sub20Array1272.length <= var18) {
								final Class109_Sub20[] var92 = new Class109_Sub20[1 + var18];

								for (var21 = 0; var21 < var80.aClass109_Sub20Array1272.length; ++var21)
									var92[var21] = var80.aClass109_Sub20Array1272[var21];

								var80.aClass109_Sub20Array1272 = var92;
							}

							if ((var18 > 0) && (null == var80.aClass109_Sub20Array1272[var18 - 1]))
								throw new RuntimeException("" + (var18 - 1));

							final Class109_Sub20 var94 = new Class109_Sub20();
							var94.anInt1229 = var28;
							var10001 = var80.anInt1148;
							var94.anInt1148 = var80.anInt1148 * -560181405;
							var94.anInt1166 = var10001;
							var94.anInt1147 = var18;
							var94.aBool1146 = true;
							var80.aClass109_Sub20Array1272[var18] = var94;
							if (var53)
								Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650 = var94;
							else
								Class3.aClass109_Sub20_26 = var94;

							Class71.method315(var80);
							continue;
						}

						if (var46 == 101) {
							var22 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650 : Class3.aClass109_Sub20_26;
							var77 = Class83.method345(var22.anInt1148);
							var77.aClass109_Sub20Array1272[var22.anInt1147] = null;
							Class71.method315(var77);
							continue;
						}

						if (var46 == 102) {
							--var5;
							var22 = Class83.method345(Class1.anIntArray4[var5]);
							var22.aClass109_Sub20Array1272 = null;
							Class71.method315(var22);
							continue;
						}

						if (var46 == 200) {
							var5 -= 2;
							var16 = Class1.anIntArray4[var5];
							var28 = Class1.anIntArray4[var5 + 1];
							var23 = Class112.method423(var16, var28);
							if ((null != var23) && (var28 != -1)) {
								Class1.anIntArray4[var5++] = 1;
								if (var53)
									Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650 = var23;
								else
									Class3.aClass109_Sub20_26 = var23;
								continue;
							}

							Class1.anIntArray4[var5++] = 0;
							continue;
						}

						if (var46 == 201) {
							--var5;
							var22 = Class83.method345(Class1.anIntArray4[var5]);
							if (null != var22) {
								Class1.anIntArray4[var5++] = 1;
								if (var53)
									Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650 = var22;
								else
									Class3.aClass109_Sub20_26 = var22;
							} else
								Class1.anIntArray4[var5++] = 0;
							continue;
						}
					} else {
						boolean var57;
						if (((var46 >= 1000) && (var46 < 1100)) || ((var46 >= 2000) && (var46 < 2100))) {
							var16 = -1;
							if (var46 >= 2000) {
								var46 -= 1000;
								--var5;
								var16 = Class1.anIntArray4[var5];
								var77 = Class83.method345(var16);
							} else
								var77 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
										: Class3.aClass109_Sub20_26;

							if (var46 == 1000) {
								var5 -= 4;
								var77.anInt1210 = Class1.anIntArray4[var5];
								var77.anInt1157 = Class1.anIntArray4[1 + var5];
								var77.anInt1152 = Class1.anIntArray4[2 + var5];
								var77.anInt1153 = Class1.anIntArray4[3 + var5];
								Class71.method315(var77);
								Class53.method257(var77);
								if ((var16 != -1) && (var77.anInt1229 == 0))
									Class9.method53(Class109_Sub20.aClass109_Sub20ArrayArray1150[var16 >> 16], var77,
											false);
								continue;
							}

							if (var46 == 1001) {
								var5 -= 4;
								var77.anInt1274 = Class1.anIntArray4[var5];
								var77.anInt1241 = Class1.anIntArray4[var5 + 1];
								var77.anInt1154 = Class1.anIntArray4[var5 + 2];
								var77.anInt1225 = Class1.anIntArray4[var5 + 3];
								Class71.method315(var77);
								Class53.method257(var77);
								if ((var16 != -1) && (var77.anInt1229 == 0))
									Class9.method53(Class109_Sub20.aClass109_Sub20ArrayArray1150[var16 >> 16], var77,
											false);
								continue;
							}

							if (var46 == 1003) {
								--var5;
								var57 = Class1.anIntArray4[var5] == 1;
								if (var77.aBool1167 != var57) {
									var77.aBool1167 = var57;
									Class71.method315(var77);
								}
								continue;
							}

							if (var46 == 1005) {
								--var5;
								var77.aBool1223 = Class1.anIntArray4[var5] == 1;
								continue;
							}
						} else if (((var46 >= 1100) && (var46 < 1200)) || ((var46 >= 2100) && (var46 < 2200))) {
							var28 = -1;
							if (var46 >= 2000) {
								var46 -= 1000;
								--var5;
								var28 = Class1.anIntArray4[var5];
								var22 = Class83.method345(var28);
							} else
								var22 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
										: Class3.aClass109_Sub20_26;

							if (var46 == 1100) {
								var5 -= 2;
								var22.anInt1168 = Class1.anIntArray4[var5];
								if (var22.anInt1168 > (var22.anInt1170 - var22.anInt1162))
									var22.anInt1168 = var22.anInt1170 - var22.anInt1162;

								if (var22.anInt1168 < 0)
									var22.anInt1168 = 0;

								var22.anInt1169 = Class1.anIntArray4[var5 + 1];
								if (var22.anInt1169 > (var22.anInt1171 - var22.anInt1163))
									var22.anInt1169 = var22.anInt1171 - var22.anInt1163;

								if (var22.anInt1169 < 0)
									var22.anInt1169 = 0;

								Class71.method315(var22);
								continue;
							}

							if (var46 == 1101) {
								--var5;
								var22.anInt1220 = Class1.anIntArray4[var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1102) {
								--var5;
								var22.aBool1176 = Class1.anIntArray4[var5] == 1;
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1103) {
								--var5;
								var22.anInt1177 = Class1.anIntArray4[var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1104) {
								--var5;
								var22.anInt1257 = Class1.anIntArray4[var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1105) {
								--var5;
								var22.anInt1164 = Class1.anIntArray4[var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1106) {
								--var5;
								var22.anInt1182 = Class1.anIntArray4[var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1107) {
								--var5;
								var22.aBool1183 = Class1.anIntArray4[var5] == 1;
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1108) {
								var22.anInt1188 = 1;
								--var5;
								var22.anInt1189 = Class1.anIntArray4[var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1109) {
								var5 -= 6;
								var22.anInt1194 = Class1.anIntArray4[var5];
								var22.anInt1244 = Class1.anIntArray4[1 + var5];
								var22.anInt1273 = Class1.anIntArray4[2 + var5];
								var22.anInt1193 = Class1.anIntArray4[var5 + 3];
								var22.anInt1198 = Class1.anIntArray4[4 + var5];
								var22.anInt1199 = Class1.anIntArray4[5 + var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1110) {
								--var5;
								var18 = Class1.anIntArray4[var5];
								if (var18 != var22.anInt1192) {
									var22.anInt1192 = var18;
									var22.anInt1267 = 0;
									var22.anInt1268 = 0;
									Class71.method315(var22);
								}
								continue;
							}

							if (var46 == 1111) {
								--var5;
								var22.aBool1271 = Class1.anIntArray4[var5] == 1;
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1112) {
								--var6;
								var64 = Class1.aStringArray5[var6];
								if (!var64.equals(var22.aString1205)) {
									var22.aString1205 = var64;
									Class71.method315(var22);
								}
								continue;
							}

							if (var46 == 1113) {
								--var5;
								var22.anInt1204 = Class1.anIntArray4[var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1114) {
								var5 -= 3;
								var22.anInt1208 = Class1.anIntArray4[var5];
								var22.anInt1209 = Class1.anIntArray4[var5 + 1];
								var22.anInt1207 = Class1.anIntArray4[2 + var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1115) {
								--var5;
								var22.aBool1250 = Class1.anIntArray4[var5] == 1;
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1116) {
								--var5;
								var22.anInt1184 = Class1.anIntArray4[var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1117) {
								--var5;
								var22.anInt1185 = Class1.anIntArray4[var5];
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1118) {
								--var5;
								var22.aBool1186 = Class1.anIntArray4[var5] == 1;
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1119) {
								--var5;
								var22.aBool1187 = Class1.anIntArray4[var5] == 1;
								Class71.method315(var22);
								continue;
							}

							if (var46 == 1120) {
								var5 -= 2;
								var22.anInt1170 = Class1.anIntArray4[var5];
								var22.anInt1171 = Class1.anIntArray4[1 + var5];
								Class71.method315(var22);
								if ((var28 != -1) && (var22.anInt1229 == 0))
									Class9.method53(Class109_Sub20.aClass109_Sub20ArrayArray1150[var28 >> 16], var22,
											false);
								continue;
							}

							if (var46 == 1121) {
								Class112.method422(var22.anInt1148, var22.anInt1147);
								client.aClass109_Sub20_2044 = var22;
								Class71.method315(var22);
								continue;
							}
						} else if (((var46 < 1200) || (var46 >= 1300)) && ((var46 < 2200) || (var46 >= 2300))) {
							if (((var46 >= 1300) && (var46 < 1400)) || ((var46 >= 2300) && (var46 < 2400))) {
								if (var46 >= 2000) {
									var46 -= 1000;
									--var5;
									var22 = Class83.method345(Class1.anIntArray4[var5]);
								} else
									var22 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
											: Class3.aClass109_Sub20_26;

								if (var46 == 1300) {
									--var5;
									var28 = Class1.anIntArray4[var5] - 1;
									if ((var28 >= 0) && (var28 <= 9)) {
										--var6;
										var22.method652(var28, Class1.aStringArray5[var6]);
										continue;
									}

									--var6;
									continue;
								}

								if (var46 == 1301) {
									var5 -= 2;
									var28 = Class1.anIntArray4[var5];
									var18 = Class1.anIntArray4[var5 + 1];
									var22.aClass109_Sub20_1139 = Class112.method423(var28, var18);
									continue;
								}

								if (var46 == 1302) {
									--var5;
									var22.aBool1275 = Class1.anIntArray4[var5] == 1;
									continue;
								}

								if (var46 == 1303) {
									--var5;
									var22.anInt1221 = Class1.anIntArray4[var5];
									continue;
								}

								if (var46 == 1304) {
									--var5;
									var22.anInt1222 = Class1.anIntArray4[var5];
									continue;
								}

								if (var46 == 1305) {
									--var6;
									var22.aString1218 = Class1.aStringArray5[var6];
									continue;
								}

								if (var46 == 1306) {
									--var6;
									var22.aString1276 = Class1.aStringArray5[var6];
									continue;
								}

								if (var46 == 1307) {
									var22.aStringArray1219 = null;
									continue;
								}
							} else {
								String var48;
								int[] var56;
								if (((var46 >= 1400) && (var46 < 1500)) || ((var46 >= 2400) && (var46 < 2500))) {
									if (var46 >= 2000) {
										var46 -= 1000;
										--var5;
										var22 = Class83.method345(Class1.anIntArray4[var5]);
									} else
										var22 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
												: Class3.aClass109_Sub20_26;

									--var6;
									var48 = Class1.aStringArray5[var6];
									var56 = null;
									if ((var48.length() > 0) && (var48.charAt(var48.length() - 1) == 89)) {
										--var5;
										var19 = Class1.anIntArray4[var5];
										if (var19 > 0)
											for (var56 = new int[var19]; var19-- > 0; var56[var19] = Class1.anIntArray4[var5])
												--var5;

										var48 = var48.substring(0, var48.length() - 1);
									}

									Object[] var107 = new Object[var48.length() + 1];

									for (var20 = var107.length - 1; var20 >= 1; --var20)
										if (var48.charAt(var20 - 1) == 115) {
											--var6;
											var107[var20] = Class1.aStringArray5[var6];
										} else {
											--var5;
											var107[var20] = new Integer(Class1.anIntArray4[var5]);
										}

									--var5;
									var20 = Class1.anIntArray4[var5];
									if (var20 != -1)
										var107[0] = new Integer(var20);
									else
										var107 = null;

									if (var46 == 1400)
										var22.anObjectArray1227 = var107;

									if (var46 == 1401)
										var22.anObjectArray1230 = var107;

									if (var46 == 1402)
										var22.anObjectArray1195 = var107;

									if (var46 == 1403)
										var22.anObjectArray1277 = var107;

									if (var46 == 1404)
										var22.anObjectArray1233 = var107;

									if (var46 == 1405)
										var22.anObjectArray1202 = var107;

									if (var46 == 1406)
										var22.anObjectArray1237 = var107;

									if (var46 == 1407) {
										var22.anObjectArray1238 = var107;
										var22.anIntArray1231 = var56;
									}

									if (var46 == 1408)
										var22.anObjectArray1138 = var107;

									if (var46 == 1409)
										var22.anObjectArray1245 = var107;

									if (var46 == 1410)
										var22.anObjectArray1235 = var107;

									if (var46 == 1411)
										var22.anObjectArray1228 = var107;

									if (var46 == 1412)
										var22.anObjectArray1232 = var107;

									if (var46 == 1414) {
										var22.anObjectArray1196 = var107;
										var22.anIntArray1211 = var56;
									}

									if (var46 == 1415) {
										var22.anObjectArray1242 = var107;
										var22.anIntArray1243 = var56;
									}

									if (var46 == 1416)
										var22.anObjectArray1236 = var107;

									if (var46 == 1417)
										var22.anObjectArray1216 = var107;

									if (var46 == 1418)
										var22.anObjectArray1247 = var107;

									if (var46 == 1419)
										var22.anObjectArray1197 = var107;

									if (var46 == 1420)
										var22.anObjectArray1249 = var107;

									if (var46 == 1421)
										var22.anObjectArray1173 = var107;

									if (var46 == 1422)
										var22.anObjectArray1251 = var107;

									if (var46 == 1423)
										var22.anObjectArray1252 = var107;

									if (var46 == 1424)
										var22.anObjectArray1178 = var107;

									if (var46 == 1425)
										var22.anObjectArray1270 = var107;

									if (var46 == 1426)
										var22.anObjectArray1256 = var107;

									if (var46 == 1427)
										var22.anObjectArray1254 = var107;

									var22.aBool1255 = true;
									continue;
								}

								if (var46 < 1600) {
									var22 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
											: Class3.aClass109_Sub20_26;
									if (var46 == 1500) {
										Class1.anIntArray4[var5++] = var22.anInt1160;
										continue;
									}

									if (var46 == 1501) {
										Class1.anIntArray4[var5++] = var22.anInt1161;
										continue;
									}

									if (var46 == 1502) {
										Class1.anIntArray4[var5++] = var22.anInt1162;
										continue;
									}

									if (var46 == 1503) {
										Class1.anIntArray4[var5++] = var22.anInt1163;
										continue;
									}

									if (var46 == 1504) {
										Class1.anIntArray4[var5++] = var22.aBool1167 ? 1 : 0;
										continue;
									}

									if (var46 == 1505) {
										Class1.anIntArray4[var5++] = var22.anInt1166;
										continue;
									}
								} else if (var46 < 1700) {
									var22 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
											: Class3.aClass109_Sub20_26;
									if (var46 == 1600) {
										Class1.anIntArray4[var5++] = var22.anInt1168;
										continue;
									}

									if (var46 == 1601) {
										Class1.anIntArray4[var5++] = var22.anInt1169;
										continue;
									}

									if (var46 == 1602) {
										Class1.aStringArray5[var6++] = var22.aString1205;
										continue;
									}

									if (var46 == 1603) {
										Class1.anIntArray4[var5++] = var22.anInt1170;
										continue;
									}

									if (var46 == 1604) {
										Class1.anIntArray4[var5++] = var22.anInt1171;
										continue;
									}

									if (var46 == 1605) {
										Class1.anIntArray4[var5++] = var22.anInt1199;
										continue;
									}

									if (var46 == 1606) {
										Class1.anIntArray4[var5++] = var22.anInt1273;
										continue;
									}

									if (var46 == 1607) {
										Class1.anIntArray4[var5++] = var22.anInt1198;
										continue;
									}

									if (var46 == 1608) {
										Class1.anIntArray4[var5++] = var22.anInt1193;
										continue;
									}

									if (var46 == 1609) {
										Class1.anIntArray4[var5++] = var22.anInt1177;
										continue;
									}
								} else if (var46 < 1800) {
									var22 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
											: Class3.aClass109_Sub20_26;
									if (var46 == 1700) {
										Class1.anIntArray4[var5++] = var22.anInt1265;
										continue;
									}

									if (var46 == 1701) {
										if (var22.anInt1265 != -1)
											Class1.anIntArray4[var5++] = var22.anInt1266;
										else
											Class1.anIntArray4[var5++] = 0;
										continue;
									}

									if (var46 == 1702) {
										Class1.anIntArray4[var5++] = var22.anInt1147;
										continue;
									}
								} else if (var46 < 1900) {
									var22 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
											: Class3.aClass109_Sub20_26;
									if (var46 == 1800) {
										Class1.anIntArray4[var5++] = Class109_Sub6.method521(Class52.method256(var22));
										continue;
									}

									if (var46 == 1801) {
										--var5;
										var28 = Class1.anIntArray4[var5];
										--var28;
										if ((var22.aStringArray1219 != null) && (var28 < var22.aStringArray1219.length)
												&& (null != var22.aStringArray1219[var28])) {
											Class1.aStringArray5[var6++] = var22.aStringArray1219[var28];
											continue;
										}

										Class1.aStringArray5[var6++] = "";
										continue;
									}

									if (var46 == 1802) {
										if (var22.aString1218 == null)
											Class1.aStringArray5[var6++] = "";
										else
											Class1.aStringArray5[var6++] = var22.aString1218;
										continue;
									}
								} else if (((var46 >= 1900) && (var46 < 2000)) || ((var46 >= 2900) && (var46 < 3000))) {
									if (var46 >= 2000) {
										var46 -= 1000;
										--var5;
										var22 = Class83.method345(Class1.anIntArray4[var5]);
									} else
										var22 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
												: Class3.aClass109_Sub20_26;

									if (var46 == 1927) {
										if (Class1.anInt2 >= 10)
											throw new RuntimeException();

										if (var22.anObjectArray1254 == null)
											return;

										final Class109_Sub9 var67 = new Class109_Sub9();
										var67.aClass109_Sub20_996 = var22;
										var67.anObjectArray997 = var22.anObjectArray1254;
										var67.anInt1007 = 1 + Class1.anInt2;
										client.aClass126_2169.method450(var0);
										continue;
									}
								} else if (var46 < 2600) {
									--var5;
									var22 = Class83.method345(Class1.anIntArray4[var5]);
									if (var46 == 2500) {
										Class1.anIntArray4[var5++] = var22.anInt1160;
										continue;
									}

									if (var46 == 2501) {
										Class1.anIntArray4[var5++] = var22.anInt1161;
										continue;
									}

									if (var46 == 2502) {
										Class1.anIntArray4[var5++] = var22.anInt1162;
										continue;
									}

									if (var46 == 2503) {
										Class1.anIntArray4[var5++] = var22.anInt1163;
										continue;
									}

									if (var46 == 2504) {
										Class1.anIntArray4[var5++] = var22.aBool1167 ? 1 : 0;
										continue;
									}

									if (var46 == 2505) {
										Class1.anIntArray4[var5++] = var22.anInt1166;
										continue;
									}
								} else if (var46 < 2700) {
									--var5;
									var22 = Class83.method345(Class1.anIntArray4[var5]);
									if (var46 == 2600) {
										Class1.anIntArray4[var5++] = var22.anInt1168;
										continue;
									}

									if (var46 == 2601) {
										Class1.anIntArray4[var5++] = var22.anInt1169;
										continue;
									}

									if (var46 == 2602) {
										Class1.aStringArray5[var6++] = var22.aString1205;
										continue;
									}

									if (var46 == 2603) {
										Class1.anIntArray4[var5++] = var22.anInt1170;
										continue;
									}

									if (var46 == 2604) {
										Class1.anIntArray4[var5++] = var22.anInt1171;
										continue;
									}

									if (var46 == 2605) {
										Class1.anIntArray4[var5++] = var22.anInt1199;
										continue;
									}

									if (var46 == 2606) {
										Class1.anIntArray4[var5++] = var22.anInt1273;
										continue;
									}

									if (var46 == 2607) {
										Class1.anIntArray4[var5++] = var22.anInt1198;
										continue;
									}

									if (var46 == 2608) {
										Class1.anIntArray4[var5++] = var22.anInt1193;
										continue;
									}

									if (var46 == 2609) {
										Class1.anIntArray4[var5++] = var22.anInt1177;
										continue;
									}
								} else if (var46 < 2800) {
									if (var46 == 2700) {
										--var5;
										var22 = Class83.method345(Class1.anIntArray4[var5]);
										Class1.anIntArray4[var5++] = var22.anInt1265;
										continue;
									}

									if (var46 == 2701) {
										--var5;
										var22 = Class83.method345(Class1.anIntArray4[var5]);
										if (var22.anInt1265 != -1)
											Class1.anIntArray4[var5++] = var22.anInt1266;
										else
											Class1.anIntArray4[var5++] = 0;
										continue;
									}

									if (var46 == 2702) {
										--var5;
										var16 = Class1.anIntArray4[var5];
										final Class109_Sub13 var17 = (Class109_Sub13) client.aClass116_2129
												.method429(var16);
										if (null != var17)
											Class1.anIntArray4[var5++] = 1;
										else
											Class1.anIntArray4[var5++] = 0;
										continue;
									}

									if (var46 == 2706) {
										Class1.anIntArray4[var5++] = client.anInt2128;
										continue;
									}
								} else if (var46 < 2900) {
									--var5;
									var22 = Class83.method345(Class1.anIntArray4[var5]);
									if (var46 == 2800) {
										Class1.anIntArray4[var5++] = Class109_Sub6.method521(Class52.method256(var22));
										continue;
									}

									if (var46 == 2801) {
										--var5;
										var28 = Class1.anIntArray4[var5];
										--var28;
										if ((null != var22.aStringArray1219) && (var28 < var22.aStringArray1219.length)
												&& (null != var22.aStringArray1219[var28])) {
											Class1.aStringArray5[var6++] = var22.aStringArray1219[var28];
											continue;
										}

										Class1.aStringArray5[var6++] = "";
										continue;
									}

									if (var46 == 2802) {
										if (var22.aString1218 == null)
											Class1.aStringArray5[var6++] = "";
										else
											Class1.aStringArray5[var6++] = var22.aString1218;
										continue;
									}
								} else if (var46 < 3200) {
									if (var46 == 3100) {
										--var6;
										var71 = Class1.aStringArray5[var6];
										Applet_Sub1.method1053(0, "", var71);
										continue;
									}

									if (var46 == 3101) {
										var5 -= 2;
										Class19.method89(Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590,
												Class1.anIntArray4[var5], Class1.anIntArray4[var5 + 1]);
										continue;
									}

									if (var46 == 3103) {
										client.secureBuffer.method840(199);

										for (Class109_Sub13 var79 = (Class109_Sub13) client.aClass116_2129
												.method432(); null != var79; var79 = (Class109_Sub13) client.aClass116_2129
														.method433())
											if ((var79.anInt1045 == 0) || (var79.anInt1045 == 3))
												client.method1064(var79, true);

										if (null != client.aClass109_Sub20_2044) {
											Class71.method315(client.aClass109_Sub20_2044);
											client.aClass109_Sub20_2044 = null;
										}
										continue;
									}

									if (var46 == 3104) {
										--var6;
										var71 = Class1.aStringArray5[var6];
										var28 = 0;
										if (Class36.method160(var71)) {
											var18 = Class50.method252(var71, 10, true);
											var28 = var18;
										}

										client.secureBuffer.method840(64);
										client.secureBuffer.writeInt(var28);
										continue;
									}

									if (var46 == 3105) {
										--var6;
										var71 = Class1.aStringArray5[var6];
										client.secureBuffer.method840(2);
										client.secureBuffer.writeByte(var71.length() + 1);
										client.secureBuffer.writeString(var71);
										continue;
									}

									if (var46 == 3106) {
										--var6;
										var71 = Class1.aStringArray5[var6];
										client.secureBuffer.method840(157);
										client.secureBuffer.writeByte(var71.length() + 1);
										client.secureBuffer.writeString(var71);
										continue;
									}

									if (var46 == 3107) {
										--var5;
										var16 = Class1.anIntArray4[var5];
										--var6;
										var48 = Class1.aStringArray5[var6];
										Class109_Sub21_Sub15.method831(var16, var48);
										continue;
									}

									if (var46 == 3108) {
										var5 -= 3;
										var16 = Class1.anIntArray4[var5];
										var28 = Class1.anIntArray4[var5 + 1];
										var18 = Class1.anIntArray4[2 + var5];
										var80 = Class83.method345(var18);
										Class99.method367(var80, var16, var28);
										continue;
									}

									if (var46 == 3109) {
										var5 -= 2;
										var16 = Class1.anIntArray4[var5];
										var28 = Class1.anIntArray4[var5 + 1];
										var23 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
												: Class3.aClass109_Sub20_26;
										Class99.method367(var23, var16, var28);
										continue;
									}

									if (var46 == 3110) {
										--var5;
										Class3.aBool22 = Class1.anIntArray4[var5] == 1;
										continue;
									}

									if (var46 == 3111) {
										Class1.anIntArray4[var5++] = Class50.aClass21_513.aBool194 ? 1 : 0;
										continue;
									}

									if (var46 == 3112) {
										--var5;
										Class50.aClass21_513.aBool194 = Class1.anIntArray4[var5] == 1;
										Class7.method46(-840141801);
										continue;
									}

									if (var46 == 3113) {
										--var6;
										var71 = Class1.aStringArray5[var6];
										--var5;
										var90 = Class1.anIntArray4[var5] == 1;
										Class109_Sub21_Sub15_Sub6.method979(var71, var90, false);
										continue;
									}

									if (var46 == 3115) {
										--var5;
										var16 = Class1.anIntArray4[var5];
										client.secureBuffer.method840(206);
										client.secureBuffer.writeShort(var16);
										continue;
									}
								} else if (var46 < 3300) {
									if (var46 == 3200) {
										var5 -= 3;
										var16 = Class1.anIntArray4[var5];
										var28 = Class1.anIntArray4[var5 + 1];
										var18 = Class1.anIntArray4[var5 + 2];
										if ((client.anInt2210 != 0) && (var28 != 0) && (client.anInt2212 < 50)) {
											client.anIntArray2213[client.anInt2212] = var16;
											client.anIntArray2214[client.anInt2212] = var28;
											client.anIntArray2248[client.anInt2212] = var18;
											client.aClass11Array2217[client.anInt2212] = null;
											client.anIntArray2216[client.anInt2212] = 0;
											++client.anInt2212;
										}
										continue;
									}

									if (var46 == 3201) {
										--var5;
										Class82.method344(Class1.anIntArray4[var5]);
										continue;
									}

									if (var46 == 3202) {
										var5 -= 2;
										var16 = Class1.anIntArray4[var5];
										if ((client.anInt2207 != 0) && (var16 != -1)) {
											Class104_Sub1.method644(Class123.aClass104_Sub1_850, var16, 0,
													client.anInt2207, false);
											client.aBool2209 = true;
										}
										continue;
									}
								} else {
									int var29;
									int var30;
									byte[] var61;
									if (var46 < 3400) {
										if (var46 == 3300) {
											Class1.anIntArray4[var5++] = client.anInt1979;
											continue;
										}

										if (var46 == 3301) {
											var5 -= 2;
											var16 = Class1.anIntArray4[var5];
											var28 = Class1.anIntArray4[1 + var5];
											Class1.anIntArray4[var5++] = Class69.method308(var16, var28);
											continue;
										}

										if (var46 == 3302) {
											var5 -= 2;
											var16 = Class1.anIntArray4[var5];
											var28 = Class1.anIntArray4[var5 + 1];
											Class1.anIntArray4[var5++] = Class20.method94(var16, var28, -1057386778);
											continue;
										}

										Class109_Sub12 var24;
										if (var46 == 3303) {
											var5 -= 2;
											var16 = Class1.anIntArray4[var5];
											var28 = Class1.anIntArray4[1 + var5];
											var56 = Class1.anIntArray4;
											var19 = var5++;
											var24 = (Class109_Sub12) Class109_Sub12.aClass116_1043.method429(var16);
											if (null == var24)
												var20 = 0;
											else if (var28 == -1)
												var20 = 0;
											else {
												var29 = 0;

												for (var30 = 0; var30 < var24.anIntArray1041.length; ++var30)
													if (var24.anIntArray1040[var30] == var28)
														var29 += var24.anIntArray1041[var30];

												var20 = var29;
											}

											var56[var19] = var20;
											continue;
										}

										if (var46 == 3304) {
											--var5;
											var16 = Class1.anIntArray4[var5];
											var49 = Class1.anIntArray4;
											var18 = var5++;
											Class109_Sub21_Sub6 var25 = (Class109_Sub21_Sub6) Class109_Sub21_Sub6.aClass120_1386
													.method438(var16);
											Class109_Sub21_Sub6 var82;
											if (null != var25)
												var82 = var25;
											else {
												var61 = Class47.aClass104_493.method387(5, var16);
												var25 = new Class109_Sub21_Sub6();
												if (null != var61)
													var25.method701(new DataBuffer(var61));

												Class109_Sub21_Sub6.aClass120_1386.method440(var25, var16);
												var82 = var25;
											}

											var49[var18] = var82.anInt1387;
											continue;
										}

										if (var46 == 3305) {
											--var5;
											var16 = Class1.anIntArray4[var5];
											Class1.anIntArray4[var5++] = client.anIntArray2105[var16];
											continue;
										}

										if (var46 == 3306) {
											--var5;
											var16 = Class1.anIntArray4[var5];
											Class1.anIntArray4[var5++] = client.anIntArray2106[var16];
											continue;
										}

										if (var46 == 3307) {
											--var5;
											var16 = Class1.anIntArray4[var5];
											Class1.anIntArray4[var5++] = client.anIntArray2107[var16];
											continue;
										}

										if (var46 == 3308) {
											var16 = Class77.anInt616;
											var28 = (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 >> 7)
													+ Class41.anInt375;
											var18 = (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 >> 7)
													+ Class113.anInt822;
											Class1.anIntArray4[var5++] = (var28 << 14) + (var16 << 28) + var18;
											continue;
										}

										if (var46 == 3309) {
											--var5;
											var16 = Class1.anIntArray4[var5];
											Class1.anIntArray4[var5++] = (var16 >> 14) & 16383;
											continue;
										}

										if (var46 == 3310) {
											--var5;
											var16 = Class1.anIntArray4[var5];
											Class1.anIntArray4[var5++] = var16 >> 28;
											continue;
										}

										if (var46 == 3311) {
											--var5;
											var16 = Class1.anIntArray4[var5];
											Class1.anIntArray4[var5++] = var16 & 16383;
											continue;
										}

										if (var46 == 3312) {
											Class1.anIntArray4[var5++] = client.aBool1974 ? 1 : 0;
											continue;
										}

										if (var46 == 3313) {
											var5 -= 2;
											var16 = '\u8000' + Class1.anIntArray4[var5];
											var28 = Class1.anIntArray4[1 + var5];
											Class1.anIntArray4[var5++] = Class69.method308(var16, var28);
											continue;
										}

										if (var46 == 3314) {
											var5 -= 2;
											var16 = '\u8000' + Class1.anIntArray4[var5];
											var28 = Class1.anIntArray4[1 + var5];
											Class1.anIntArray4[var5++] = Class20.method94(var16, var28, -1741891583);
											continue;
										}

										if (var46 == 3315) {
											var5 -= 2;
											var16 = '\u8000' + Class1.anIntArray4[var5];
											var28 = Class1.anIntArray4[var5 + 1];
											var56 = Class1.anIntArray4;
											var19 = var5++;
											var24 = (Class109_Sub12) Class109_Sub12.aClass116_1043.method429(var16);
											if (null == var24)
												var20 = 0;
											else if (var28 == -1)
												var20 = 0;
											else {
												var29 = 0;

												for (var30 = 0; var30 < var24.anIntArray1041.length; ++var30)
													if (var28 == var24.anIntArray1040[var30])
														var29 += var24.anIntArray1041[var30];

												var20 = var29;
											}

											var56[var19] = var20;
											continue;
										}

										if (var46 == 3316) {
											if (client.anInt2135 >= 2)
												Class1.anIntArray4[var5++] = client.anInt2135;
											else
												Class1.anIntArray4[var5++] = 0;
											continue;
										}

										if (var46 == 3317) {
											Class1.anIntArray4[var5++] = client.anInt1987;
											continue;
										}

										if (var46 == 3318) {
											Class1.anIntArray4[var5++] = client.anInt1970;
											continue;
										}

										if (var46 == 3321) {
											Class1.anIntArray4[var5++] = client.anInt2133;
											continue;
										}

										if (var46 == 3322) {
											Class1.anIntArray4[var5++] = client.anInt2103;
											continue;
										}

										if (var46 == 3323) {
											if (client.aBool1983)
												Class1.anIntArray4[var5++] = 1;
											else
												Class1.anIntArray4[var5++] = 0;
											continue;
										}

										if (var46 == 3324) {
											Class1.anIntArray4[var5++] = client.anInt1971;
											continue;
										}
									} else if (var46 < 3500) {
										if (var46 == 3400) {
											var5 -= 2;
											var16 = Class1.anIntArray4[var5];
											var28 = Class1.anIntArray4[var5 + 1];
											Class109_Sub21_Sub12 var86 = (Class109_Sub21_Sub12) Class109_Sub21_Sub12.aClass120_1498
													.method438(var16);
											Class109_Sub21_Sub12 var58;
											if (null != var86)
												var58 = var86;
											else {
												final byte[] var74 = Class109_Sub21_Sub12.aClass104_1506.method387(8,
														var16);
												var86 = new Class109_Sub21_Sub12();
												if (null != var74)
													var86.method751(new DataBuffer(var74));

												Class109_Sub21_Sub12.aClass120_1498.method440(var86, var16);
												var58 = var86;
											}

											var86 = var58;
											if (var58.aChar1500 != 115)
												;

											for (var20 = 0; var20 < var86.anInt1508; ++var20)
												if (var86.anIntArray1504[var20] == var28) {
													Class1.aStringArray5[var6++] = var86.aStringArray1505[var20];
													var86 = null;
													break;
												}

											if (var86 != null)
												Class1.aStringArray5[var6++] = var86.aString1501;
											continue;
										}

										if (var46 == 3408) {
											var5 -= 4;
											var16 = Class1.anIntArray4[var5];
											var28 = Class1.anIntArray4[var5 + 1];
											var18 = Class1.anIntArray4[var5 + 2];
											var19 = Class1.anIntArray4[3 + var5];
											Class109_Sub21_Sub12 var63 = (Class109_Sub21_Sub12) Class109_Sub21_Sub12.aClass120_1498
													.method438(var18);
											Class109_Sub21_Sub12 var68;
											if (null != var63)
												var68 = var63;
											else {
												final byte[] var26 = Class109_Sub21_Sub12.aClass104_1506.method387(8,
														var18);
												var63 = new Class109_Sub21_Sub12();
												if (var26 != null)
													var63.method751(new DataBuffer(var26));

												Class109_Sub21_Sub12.aClass120_1498.method440(var63, var18);
												var68 = var63;
											}

											var63 = var68;
											if ((var68.aChar1499 == var16) && (var28 == var68.aChar1500)) {
												for (var29 = 0; var29 < var63.anInt1508; ++var29)
													if (var63.anIntArray1504[var29] == var19) {
														if (var28 == 115)
															Class1.aStringArray5[var6++] = var63.aStringArray1505[var29];
														else
															Class1.anIntArray4[var5++] = var63.anIntArray1497[var29];

														var63 = null;
														break;
													}

												if (var63 != null)
													if (var28 == 115)
														Class1.aStringArray5[var6++] = var63.aString1501;
													else
														Class1.anIntArray4[var5++] = var63.anInt1502;
												continue;
											}

											if (var28 == 115)
												Class1.aStringArray5[var6++] = "null";
											else
												Class1.anIntArray4[var5++] = 0;
											continue;
										}
									} else {
										int var32;
										if (var46 < 3700) {
											if (var46 == 3600) {
												if (client.anInt2238 == 0)
													Class1.anIntArray4[var5++] = -2;
												else if (client.anInt2238 == 1)
													Class1.anIntArray4[var5++] = -1;
												else
													Class1.anIntArray4[var5++] = client.anInt2237;
												continue;
											}

											if (var46 == 3601) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												if ((client.anInt2238 == 2) && (var16 < client.anInt2237)) {
													Class1.aStringArray5[var6++] = client.aClass33Array2239[var16].aString317;
													Class1.aStringArray5[var6++] = client.aClass33Array2239[var16].aString318;
													continue;
												}

												Class1.aStringArray5[var6++] = "";
												Class1.aStringArray5[var6++] = "";
												continue;
											}

											if (var46 == 3602) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												if ((client.anInt2238 == 2) && (var16 < client.anInt2237)) {
													Class1.anIntArray4[var5++] = client.aClass33Array2239[var16].anInt319;
													continue;
												}

												Class1.anIntArray4[var5++] = 0;
												continue;
											}

											if (var46 == 3603) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												if ((client.anInt2238 == 2) && (var16 < client.anInt2237)) {
													Class1.anIntArray4[var5++] = client.aClass33Array2239[var16].anInt320;
													continue;
												}

												Class1.anIntArray4[var5++] = 0;
												continue;
											}

											if (var46 == 3604) {
												--var6;
												var71 = Class1.aStringArray5[var6];
												--var5;
												var28 = Class1.anIntArray4[var5];
												Class109_Sub21_Sub15_Sub5.method959(var71, var28);
												continue;
											}

											if (var46 == 3605) {
												--var6;
												var71 = Class1.aStringArray5[var6];
												Class109_Sub21_Sub15_Sub6.method978(var71);
												continue;
											}

											if (var46 == 3606) {
												--var6;
												var71 = Class1.aStringArray5[var6];
												Class109_Sub9.method530(var71);
												continue;
											}

											String var78;
											Class36 var95;
											if (var46 == 3607) {
												--var6;
												var71 = Class1.aStringArray5[var6];
												if (var71 == null)
													continue;

												if (((client.anInt2132 < 100) || (client.anInt2154 == 1))
														&& (client.anInt2132 < 400)) {
													var48 = Class6.method39(var71, Class95.aClass113_708);
													if (null == var48)
														continue;

													for (var18 = 0; var18 < client.anInt2132; ++var18) {
														var95 = client.aClass36Array2242[var18];
														var78 = Class6.method39(var95.aString338,
																Class95.aClass113_708);
														if ((var78 != null) && var78.equals(var48)) {
															Applet_Sub1.method1053(31, "",
																	var71 + " is already on your ignore list");
															continue label3505;
														}

														if (null != var95.aString337) {
															var76 = Class6.method39(var95.aString337,
																	Class95.aClass113_708);
															if ((null != var76) && var76.equals(var48)) {
																Applet_Sub1.method1053(31, "",
																		var71 + " is already on your ignore list");
																continue label3505;
															}
														}
													}

													for (var18 = 0; var18 < client.anInt2237; ++var18) {
														final Class33 var101 = client.aClass33Array2239[var18];
														var78 = Class6.method39(var101.aString317,
																Class95.aClass113_708);
														if ((var78 != null) && var78.equals(var48)) {
															Applet_Sub1.method1053(31, "", "Please remove " + var71
																	+ " from your friend list first");
															continue label3505;
														}

														if (null != var101.aString318) {
															var76 = Class6.method39(var101.aString318,
																	Class95.aClass113_708);
															if ((null != var76) && var76.equals(var48)) {
																Applet_Sub1.method1053(31, "", "Please remove " + var71
																		+ " from your friend list first");
																continue label3505;
															}
														}
													}

													if (Class6.method39(
															Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aString1931,
															Class95.aClass113_708).equals(var48))
														Applet_Sub1.method1053(31, "",
																"You can\'t add yourself to your own ignore list");
													else {
														client.secureBuffer.method840(179);
														final Class109_Sub14_Sub1 var66 = client.secureBuffer;
														var19 = var71.length() + 1;
														var66.writeByte(var19);
														client.secureBuffer.writeString(var71);
													}
													continue;
												}

												Applet_Sub1.method1053(31, "",
														"Your ignore list is full. Max of 100 for free users, and 400 for members");
												continue;
											}

											if (var46 == 3608) {
												--var6;
												var71 = Class1.aStringArray5[var6];
												if (var71 == null)
													continue;

												var48 = Class6.method39(var71, Class95.aClass113_708);
												if (var48 == null)
													continue;

												var18 = 0;

												while (true) {
													if (var18 >= client.anInt2132)
														continue label3505;

													var95 = client.aClass36Array2242[var18];
													var78 = var95.aString338;
													var76 = Class6.method39(var78, Class95.aClass113_708);
													boolean var99;
													if ((null != var71) && (var78 != null)) {
														if (!var71.startsWith("#") && !var78.startsWith("#"))
															var99 = var48.equals(var76);
														else
															var99 = var71.equals(var78);
													} else
														var99 = false;

													if (var99) {
														--client.anInt2132;

														for (var30 = var18; var30 < client.anInt2132; ++var30)
															client.aClass36Array2242[var30] = client.aClass36Array2242[1
																	+ var30];

														client.anInt2161 = client.anInt2131;
														client.secureBuffer.method840(180);
														final Class109_Sub14_Sub1 var31 = client.secureBuffer;
														var32 = var71.length() + 1;
														var31.writeByte(var32);
														client.secureBuffer.writeString(var71);
														continue label3505;
													}

													++var18;
												}
											}

											if (var46 == 3609) {
												--var6;
												var71 = Class1.aStringArray5[var6];
												final Class89[] var51 = Class109_Sub21_Sub15_Sub6.method980();

												for (var18 = 0; var18 < var51.length; ++var18) {
													final Class89 var93 = var51[var18];
													if (var93.anInt678 != -1) {
														var29 = var93.anInt678;
														var76 = "<img=" + var29 + ">";
														if (var71.startsWith(var76)) {
															var71 = var71.substring(
																	6 + Integer.toString(var93.anInt678).length());
															break;
														}
													}
												}

												Class1.anIntArray4[var5++] = Applet_Sub1.method1054(var71, false) ? 1
														: 0;
												continue;
											}

											if (var46 == 3611) {
												if (client.aString2015 != null)
													Class1.aStringArray5[var6++] = Class38
															.method164(client.aString2015);
												else
													Class1.aStringArray5[var6++] = "";
												continue;
											}

											if (var46 == 3612) {
												if (null != client.aString2015)
													Class1.anIntArray4[var5++] = Class109_Sub21_Sub17.anInt1589;
												else
													Class1.anIntArray4[var5++] = 0;
												continue;
											}

											if (var46 == 3613) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												if ((client.aString2015 != null)
														&& (var16 < Class109_Sub21_Sub17.anInt1589)) {
													Class1.aStringArray5[var6++] = Class53.aClass109_Sub7Array532[var16].aString969;
													continue;
												}

												Class1.aStringArray5[var6++] = "";
												continue;
											}

											if (var46 == 3614) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												if ((null != client.aString2015)
														&& (var16 < Class109_Sub21_Sub17.anInt1589)) {
													Class1.anIntArray4[var5++] = Class53.aClass109_Sub7Array532[var16].anInt967;
													continue;
												}

												Class1.anIntArray4[var5++] = 0;
												continue;
											}

											if (var46 == 3615) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												if ((null != client.aString2015)
														&& (var16 < Class109_Sub21_Sub17.anInt1589)) {
													Class1.anIntArray4[var5++] = Class53.aClass109_Sub7Array532[var16].aByte971;
													continue;
												}

												Class1.anIntArray4[var5++] = 0;
												continue;
											}

											if (var46 == 3616) {
												Class1.anIntArray4[var5++] = Class109_Sub12.aByte1044;
												continue;
											}

											if (var46 == 3617) {
												--var6;
												var71 = Class1.aStringArray5[var6];
												Class102.method369(var71);
												continue;
											}

											if (var46 == 3618) {
												Class1.anIntArray4[var5++] = Class109_Sub21_Sub11.aByte1494;
												continue;
											}

											if (var46 == 3619) {
												--var6;
												var71 = Class1.aStringArray5[var6];
												if (!var71.equals("")) {
													client.secureBuffer.method840(241);
													final Class109_Sub14_Sub1 var50 = client.secureBuffer;
													var18 = var71.length() + 1;
													var50.writeByte(var18);
													client.secureBuffer.writeString(var71);
												}
												continue;
											}

											if (var46 == 3620) {
												client.secureBuffer.method840(241);
												client.secureBuffer.writeByte(0);
												continue;
											}

											if (var46 == 3621) {
												if (client.anInt2238 == 0)
													Class1.anIntArray4[var5++] = -1;
												else
													Class1.anIntArray4[var5++] = client.anInt2132;
												continue;
											}

											if (var46 == 3622) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												if ((client.anInt2238 != 0) && (var16 < client.anInt2132)) {
													Class1.aStringArray5[var6++] = client.aClass36Array2242[var16].aString338;
													Class1.aStringArray5[var6++] = client.aClass36Array2242[var16].aString337;
													continue;
												}

												Class1.aStringArray5[var6++] = "";
												Class1.aStringArray5[var6++] = "";
												continue;
											}

											if (var46 == 3623) {
												label3224: {
													--var6;
													var71 = Class1.aStringArray5[var6];
													var64 = "<img=0>";
													if (!var71.startsWith(var64)) {
														var78 = "<img=1>";
														if (!var71.startsWith(var78))
															break label3224;
													}

													var71 = var71.substring(7);
												}

												Class1.anIntArray4[var5++] = Class109_Sub11.method541(var71) ? 1 : 0;
												continue;
											}

											if (var46 == 3624) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												if ((null != Class53.aClass109_Sub7Array532)
														&& (var16 < Class109_Sub21_Sub17.anInt1589)
														&& Class53.aClass109_Sub7Array532[var16].aString969
																.equalsIgnoreCase(
																		Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aString1931)) {
													Class1.anIntArray4[var5++] = 1;
													continue;
												}

												Class1.anIntArray4[var5++] = 0;
												continue;
											}

											if (var46 == 3625) {
												if (client.aString2198 != null)
													Class1.aStringArray5[var6++] = Class38
															.method164(client.aString2198);
												else
													Class1.aStringArray5[var6++] = "";
												continue;
											}
										} else if (var46 < 4000) {
											if (var46 == 3903) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												Class1.anIntArray4[var5++] = client.aClass134Array2246[var16]
														.method480();
												continue;
											}

											if (var46 == 3904) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												Class1.anIntArray4[var5++] = client.aClass134Array2246[var16].anInt885;
												continue;
											}

											if (var46 == 3905) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												Class1.anIntArray4[var5++] = client.aClass134Array2246[var16].anInt882;
												continue;
											}

											if (var46 == 3906) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												Class1.anIntArray4[var5++] = client.aClass134Array2246[var16].anInt880;
												continue;
											}

											if (var46 == 3907) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												Class1.anIntArray4[var5++] = client.aClass134Array2246[var16].anInt884;
												continue;
											}

											if (var46 == 3908) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												Class1.anIntArray4[var5++] = client.aClass134Array2246[var16].anInt883;
												continue;
											}

											if (var46 == 3910) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var28 = client.aClass134Array2246[var16].method481();
												Class1.anIntArray4[var5++] = var28 == 0 ? 1 : 0;
												continue;
											}

											if (var46 == 3911) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var28 = client.aClass134Array2246[var16].method481();
												Class1.anIntArray4[var5++] = var28 == 2 ? 1 : 0;
												continue;
											}

											if (var46 == 3912) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var28 = client.aClass134Array2246[var16].method481();
												Class1.anIntArray4[var5++] = var28 == 5 ? 1 : 0;
												continue;
											}

											if (var46 == 3913) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var28 = client.aClass134Array2246[var16].method481();
												Class1.anIntArray4[var5++] = var28 == 1 ? 1 : 0;
												continue;
											}

											boolean var87;
											if (var46 == 3914) {
												--var5;
												var87 = Class1.anIntArray4[var5] == 1;
												if (Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924 != null)
													Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924
															.method482(Class136.aComparator890, var87);
												continue;
											}

											if (var46 == 3915) {
												--var5;
												var87 = Class1.anIntArray4[var5] == 1;
												if (Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924 != null)
													Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924
															.method482(Class136.aComparator889, var87);
												continue;
											}

											if (var46 == 3916) {
												var5 -= 2;
												var87 = Class1.anIntArray4[var5] == 1;
												var90 = Class1.anIntArray4[var5 + 1] == 1;
												if (Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924 != null)
													Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924
															.method482(new Class40(var90), var87);
												continue;
											}

											if (var46 == 3917) {
												--var5;
												var87 = Class1.anIntArray4[var5] == 1;
												if (null != Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924)
													Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924
															.method482(Class136.aComparator891, var87);
												continue;
											}

											if (var46 == 3918) {
												--var5;
												var87 = Class1.anIntArray4[var5] == 1;
												if (null != Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924)
													Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924
															.method482(Class136.aComparator888, var87);
												continue;
											}

											if (var46 == 3919) {
												Class1.anIntArray4[var5++] = Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924 == null
														? 0
														: Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924.aList887.size();
												continue;
											}

											Class114 var52;
											if (var46 == 3920) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var52 = (Class114) Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924.aList887
														.get(var16);
												Class1.anIntArray4[var5++] = var52.anInt826;
												continue;
											}

											if (var46 == 3921) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var52 = (Class114) Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924.aList887
														.get(var16);
												Class1.aStringArray5[var6++] = var52.method426();
												continue;
											}

											if (var46 == 3922) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var52 = (Class114) Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924.aList887
														.get(var16);
												Class1.aStringArray5[var6++] = var52.method424();
												continue;
											}

											if (var46 == 3923) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var52 = (Class114) Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924.aList887
														.get(var16);
												final long var33 = Class109_Sub21_Sub15.method829(737502684)
														- Class104.aLong790 - var52.aLong824;
												var20 = (int) (var33 / 3600000L);
												var21 = (int) ((var33 - var20 * 3600000) / 60000L);
												var29 = (int) ((var33 - 3600000 * var20 - var21 * '\uea60') / 1000L);
												final String var100 = var20 + ":" + (var21 / 10) + (var21 % 10) + ":"
														+ (var29 / 10) + (var29 % 10);
												Class1.aStringArray5[var6++] = var100;
												continue;
											}

											if (var46 == 3924) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var52 = (Class114) Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924.aList887
														.get(var16);
												Class1.anIntArray4[var5++] = var52.aClass134_828.anInt880;
												continue;
											}

											if (var46 == 3925) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var52 = (Class114) Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924.aList887
														.get(var16);
												Class1.anIntArray4[var5++] = var52.aClass134_828.anInt882;
												continue;
											}

											if (var46 == 3926) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												var52 = (Class114) Class109_Sub21_Sub15_Sub3_Sub1.aClass136_1924.aList887
														.get(var16);
												Class1.anIntArray4[var5++] = var52.aClass134_828.anInt885;
												continue;
											}
										} else if (var46 < 4100) {
											if (var46 == 4000) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[1 + var5];
												Class1.anIntArray4[var5++] = var16 + var28;
												continue;
											}

											if (var46 == 4001) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[1 + var5];
												Class1.anIntArray4[var5++] = var16 - var28;
												continue;
											}

											if (var46 == 4002) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[var5 + 1];
												Class1.anIntArray4[var5++] = var16 * var28;
												continue;
											}

											if (var46 == 4003) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[1 + var5];
												Class1.anIntArray4[var5++] = var16 / var28;
												continue;
											}

											if (var46 == 4004) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												Class1.anIntArray4[var5++] = (int) (Math.random() * var16);
												continue;
											}

											if (var46 == 4005) {
												--var5;
												var16 = Class1.anIntArray4[var5];
												Class1.anIntArray4[var5++] = (int) (Math.random() * (1 + var16));
												continue;
											}

											if (var46 == 4006) {
												var5 -= 5;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[var5 + 1];
												var18 = Class1.anIntArray4[2 + var5];
												var19 = Class1.anIntArray4[var5 + 3];
												var20 = Class1.anIntArray4[4 + var5];
												Class1.anIntArray4[var5++] = (((var20 - var18) * (var28 - var16))
														/ (var19 - var18)) + var16;
												continue;
											}

											if (var46 == 4007) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[var5 + 1];
												Class1.anIntArray4[var5++] = ((var16 * var28) / 100) + var16;
												continue;
											}

											if (var46 == 4008) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[1 + var5];
												Class1.anIntArray4[var5++] = var16 | (1 << var28);
												continue;
											}

											if (var46 == 4009) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[1 + var5];
												Class1.anIntArray4[var5++] = var16 & (-1 - (1 << var28));
												continue;
											}

											if (var46 == 4010) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[1 + var5];
												Class1.anIntArray4[var5++] = (var16 & (1 << var28)) != 0 ? 1 : 0;
												continue;
											}

											if (var46 == 4011) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[1 + var5];
												Class1.anIntArray4[var5++] = var16 % var28;
												continue;
											}

											if (var46 == 4012) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[var5 + 1];
												if (var16 == 0)
													Class1.anIntArray4[var5++] = 0;
												else
													Class1.anIntArray4[var5++] = (int) Math.pow(var16, var28);
												continue;
											}

											if (var46 == 4013) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[1 + var5];
												if (var16 == 0)
													Class1.anIntArray4[var5++] = 0;
												else if (var28 == 0)
													Class1.anIntArray4[var5++] = Integer.MAX_VALUE;
												else
													Class1.anIntArray4[var5++] = (int) Math.pow(var16, 1.0D / var28);
												continue;
											}

											if (var46 == 4014) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[var5 + 1];
												Class1.anIntArray4[var5++] = var16 & var28;
												continue;
											}

											if (var46 == 4015) {
												var5 -= 2;
												var16 = Class1.anIntArray4[var5];
												var28 = Class1.anIntArray4[1 + var5];
												Class1.anIntArray4[var5++] = var16 | var28;
												continue;
											}
										} else {
											int var35;
											if (var46 < 4200) {
												if (var46 == 4100) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													--var5;
													var28 = Class1.anIntArray4[var5];
													Class1.aStringArray5[var6++] = var71 + var28;
													continue;
												}

												if (var46 == 4101) {
													var6 -= 2;
													var71 = Class1.aStringArray5[var6];
													var48 = Class1.aStringArray5[var6 + 1];
													Class1.aStringArray5[var6++] = var71 + var48;
													continue;
												}

												if (var46 == 4102) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													--var5;
													var28 = Class1.anIntArray4[var5];
													var69 = Class1.aStringArray5;
													var19 = var6++;
													if (var28 < 0)
														var76 = Integer.toString(var28);
													else {
														var30 = var28;
														if (var28 < 0)
															var73 = Integer.toString(var28, 10);
														else {
															var32 = 2;

															for (var35 = var28 / 10; var35 != 0; ++var32)
																var35 /= 10;

															final char[] var36 = new char[var32];
															var36[0] = 43;

															for (int var37 = var32 - 1; var37 > 0; --var37) {
																final int var38 = var30;
																var30 /= 10;
																final int var39 = var38 - (10 * var30);
																if (var39 >= 10)
																	var36[var37] = (char) (87 + var39);
																else
																	var36[var37] = (char) (48 + var39);
															}

															var73 = new String(var36);
														}

														var76 = var73;
													}

													var69[var19] = var71 + var76;
													continue;
												}

												if (var46 == 4103) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													Class1.aStringArray5[var6++] = var71.toLowerCase();
													continue;
												}

												if (var46 == 4104) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													final long var40 = 86400000L * (var16 + 11745L);
													Class1.aCalendar8.setTime(new Date(var40));
													var19 = Class1.aCalendar8.get(5);
													var20 = Class1.aCalendar8.get(2);
													var21 = Class1.aCalendar8.get(1);
													Class1.aStringArray5[var6++] = var19 + "-"
															+ Class1.aStringArray9[var20] + "-" + var21;
													continue;
												}

												if (var46 == 4105) {
													var6 -= 2;
													var71 = Class1.aStringArray5[var6];
													var48 = Class1.aStringArray5[1 + var6];
													if ((null != Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aClass96_1929)
															&& Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aClass96_1929.aBool717) {
														Class1.aStringArray5[var6++] = var48;
														continue;
													}

													Class1.aStringArray5[var6++] = var71;
													continue;
												}

												if (var46 == 4106) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													Class1.aStringArray5[var6++] = Integer.toString(var16);
													continue;
												}

												if (var46 == 4107) {
													var6 -= 2;
													final int[] var108 = Class1.anIntArray4;
													var28 = var5++;
													var19 = Class115.method428(Class1.aStringArray5[var6],
															Class1.aStringArray5[var6 + 1], client.anInt2051);
													if (var19 > 0)
														var75 = 1;
													else if (var19 < 0)
														var75 = -1;
													else
														var75 = 0;

													var108[var28] = var75;
													continue;
												}

												Class109_Sub21_Sub14_Sub4_Sub1 var85;
												byte[] var102;
												if (var46 == 4108) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													var5 -= 2;
													var28 = Class1.anIntArray4[var5];
													var18 = Class1.anIntArray4[var5 + 1];
													var102 = Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812
															.method387(var18, 0);
													var85 = new Class109_Sub21_Sub14_Sub4_Sub1(var102);
													Class1.anIntArray4[var5++] = var85.method1012(var71, var28);
													continue;
												}

												if (var46 == 4109) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													var5 -= 2;
													var28 = Class1.anIntArray4[var5];
													var18 = Class1.anIntArray4[1 + var5];
													var102 = Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812
															.method387(var18, 0);
													var85 = new Class109_Sub21_Sub14_Sub4_Sub1(var102);
													Class1.anIntArray4[var5++] = var85.method1011(var71, var28);
													continue;
												}

												if (var46 == 4110) {
													var6 -= 2;
													var71 = Class1.aStringArray5[var6];
													var48 = Class1.aStringArray5[var6 + 1];
													--var5;
													if (Class1.anIntArray4[var5] == 1)
														Class1.aStringArray5[var6++] = var71;
													else
														Class1.aStringArray5[var6++] = var48;
													continue;
												}

												if (var46 == 4111) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													Class1.aStringArray5[var6++] = Class109_Sub21_Sub14_Sub4
															.method1013(var71);
													continue;
												}

												if (var46 == 4112) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													--var5;
													var28 = Class1.anIntArray4[var5];
													Class1.aStringArray5[var6++] = var71 + (char) var28;
													continue;
												}

												if (var46 == 4113) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													Class1.anIntArray4[var5++] = Class79.method332((char) var16) ? 1
															: 0;
													continue;
												}

												if (var46 == 4114) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													Class1.anIntArray4[var5++] = Class109_Sub21_Sub9
															.method723((char) var16) ? 1 : 0;
													continue;
												}

												char var60;
												if (var46 == 4115) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													var49 = Class1.anIntArray4;
													var18 = var5++;
													var60 = (char) var16;
													var54 = ((var60 >= 65) && (var60 <= 90))
															|| ((var60 >= 97) && (var60 <= 122));
													var49[var18] = var54 ? 1 : 0;
													continue;
												}

												if (var46 == 4116) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													var49 = Class1.anIntArray4;
													var18 = var5++;
													var60 = (char) var16;
													var54 = (var60 >= 48) && (var60 <= 57);
													var49[var18] = var54 ? 1 : 0;
													continue;
												}

												if (var46 == 4117) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													if (null != var71)
														Class1.anIntArray4[var5++] = var71.length();
													else
														Class1.anIntArray4[var5++] = 0;
													continue;
												}

												if (var46 == 4118) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													var5 -= 2;
													var28 = Class1.anIntArray4[var5];
													var18 = Class1.anIntArray4[var5 + 1];
													Class1.aStringArray5[var6++] = var71.substring(var28, var18);
													continue;
												}

												if (var46 == 4119) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													final StringBuilder var55 = new StringBuilder(var71.length());
													var57 = false;

													for (var19 = 0; var19 < var71.length(); ++var19) {
														var60 = var71.charAt(var19);
														if (var60 == 60)
															var57 = true;
														else if (var60 == 62)
															var57 = false;
														else if (!var57)
															var55.append(var60);
													}

													Class1.aStringArray5[var6++] = var55.toString();
													continue;
												}

												if (var46 == 4120) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													--var5;
													var28 = Class1.anIntArray4[var5];
													Class1.anIntArray4[var5++] = var71.indexOf(var28);
													continue;
												}

												if (var46 == 4121) {
													var6 -= 2;
													var71 = Class1.aStringArray5[var6];
													var48 = Class1.aStringArray5[1 + var6];
													--var5;
													var18 = Class1.anIntArray4[var5];
													Class1.anIntArray4[var5++] = var71.indexOf(var48, var18);
													continue;
												}
											} else if (var46 < 4300) {
												if (var46 == 4200) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													Class1.aStringArray5[var6++] = Class109_Sub23
															.method660(var16).aString1372;
													continue;
												}

												Class109_Sub21_Sub5 var72;
												if (var46 == 4201) {
													var5 -= 2;
													var16 = Class1.anIntArray4[var5];
													var28 = Class1.anIntArray4[var5 + 1];
													var72 = Class109_Sub23.method660(var16);
													if ((var28 >= 1) && (var28 <= 5)
															&& (null != var72.aStringArray1339[var28 - 1])) {
														Class1.aStringArray5[var6++] = var72.aStringArray1339[var28
																- 1];
														continue;
													}

													Class1.aStringArray5[var6++] = "";
													continue;
												}

												if (var46 == 4202) {
													var5 -= 2;
													var16 = Class1.anIntArray4[var5];
													var28 = Class1.anIntArray4[1 + var5];
													var72 = Class109_Sub23.method660(var16);
													if ((var28 >= 1) && (var28 <= 5)
															&& (null != var72.aStringArray1361[var28 - 1])) {
														Class1.aStringArray5[var6++] = var72.aStringArray1361[var28
																- 1];
														continue;
													}

													Class1.aStringArray5[var6++] = "";
													continue;
												}

												if (var46 == 4203) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													Class1.anIntArray4[var5++] = Class109_Sub23
															.method660(var16).anInt1358;
													continue;
												}

												if (var46 == 4204) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													Class1.anIntArray4[var5++] = Class109_Sub23
															.method660(var16).anInt1378 == 1 ? 1 : 0;
													continue;
												}

												Class109_Sub21_Sub5 var59;
												if (var46 == 4205) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													var59 = Class109_Sub23.method660(var16);
													if ((var59.anInt1376 == -1) && (var59.anInt1356 >= 0)) {
														Class1.anIntArray4[var5++] = var59.anInt1356;
														continue;
													}

													Class1.anIntArray4[var5++] = var16;
													continue;
												}

												if (var46 == 4206) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													var59 = Class109_Sub23.method660(var16);
													if ((var59.anInt1376 >= 0) && (var59.anInt1356 >= 0)) {
														Class1.anIntArray4[var5++] = var59.anInt1356;
														continue;
													}

													Class1.anIntArray4[var5++] = var16;
													continue;
												}

												if (var46 == 4207) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													Class1.anIntArray4[var5++] = Class109_Sub23
															.method660(var16).aBool1367 ? 1 : 0;
													continue;
												}

												if (var46 == 4210) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													--var5;
													var28 = Class1.anIntArray4[var5];
													var54 = var28 == 1;
													var64 = var71.toLowerCase();
													short[] var89 = new short[16];
													var21 = 0;
													var29 = 0;

													while (true) {
														if (var29 >= Class109_Sub21_Sub5.anInt1340) {
															Class68.aShortArray585 = var89;
															Class109_Sub16.anInt1089 = 0;
															Class109_Sub21_Sub12.anInt1507 = var21;
															final String[] var81 = new String[Class109_Sub21_Sub12.anInt1507];

															for (var30 = 0; var30 < Class109_Sub21_Sub12.anInt1507; ++var30)
																var81[var30] = Class109_Sub23
																		.method660(var89[var30]).aString1372;

															final short[] var104 = Class68.aShortArray585;
															Class109_Sub21_Sub5.method698(var81, var104, 0,
																	var81.length - 1);
															break;
														}

														final Class109_Sub21_Sub5 var103 = Class109_Sub23
																.method660(var29);
														if ((!var54 || var103.aBool1381) && (var103.anInt1376 == -1)
																&& (var103.aString1372.toLowerCase()
																		.indexOf(var64) != -1)) {
															if (var21 >= 250) {
																Class109_Sub21_Sub12.anInt1507 = -1;
																Class68.aShortArray585 = null;
																break;
															}

															if (var21 >= var89.length) {
																final short[] var42 = new short[var89.length * 2];

																for (var35 = 0; var35 < var21; ++var35)
																	var42[var35] = var89[var35];

																var89 = var42;
															}

															var89[var21++] = (short) var29;
														}

														++var29;
													}

													Class1.anIntArray4[var5++] = Class109_Sub21_Sub12.anInt1507;
													continue;
												}

												if (var46 == 4211) {
													if ((null != Class68.aShortArray585)
															&& (Class109_Sub16.anInt1089 < Class109_Sub21_Sub12.anInt1507)) {
														Class1.anIntArray4[var5++] = Class68.aShortArray585[++Class109_Sub16.anInt1089
																- 1] & '\uffff';
														continue;
													}

													Class1.anIntArray4[var5++] = -1;
													continue;
												}

												if (var46 == 4212) {
													Class109_Sub16.anInt1089 = 0;
													continue;
												}
											} else if (var46 < 5100) {
												if (var46 == 5000) {
													Class1.anIntArray4[var5++] = client.anInt2008;
													continue;
												}

												if (var46 == 5001) {
													var5 -= 3;
													client.anInt2008 = Class1.anIntArray4[var5];
													Class48.aClass52_501 = Class2
															.method17(Class1.anIntArray4[var5 + 1]);
													if (null == Class48.aClass52_501)
														Class48.aClass52_501 = Class52.aClass52_529;

													client.anInt2189 = Class1.anIntArray4[2 + var5];
													client.secureBuffer.method840(51);
													client.secureBuffer.writeByte(client.anInt2008);
													client.secureBuffer
															.writeByte(Class48.aClass52_501.anInt526);
													client.secureBuffer.writeByte(client.anInt2189);
													continue;
												}

												if (var46 == 5002) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													var5 -= 2;
													var28 = Class1.anIntArray4[var5];
													var18 = Class1.anIntArray4[var5 + 1];
													client.secureBuffer.method840(40);
													client.secureBuffer
															.writeByte(Class32.method140(var71) + 2);
													client.secureBuffer.writeString(var71);
													client.secureBuffer.writeByte(var28 - 1);
													client.secureBuffer.writeByte(var18);
													continue;
												}

												if (var46 == 5003) {
													var5 -= 2;
													var16 = Class1.anIntArray4[var5];
													var28 = Class1.anIntArray4[var5 + 1];
													final Class31 var106 = (Class31) Class35.aMap332
															.get(Integer.valueOf(var16));
													final Class109_Sub21_Sub9 var83 = var106.method137(var28);
													if (var83 != null) {
														Class1.anIntArray4[var5++] = var83.anInt1419;
														Class1.anIntArray4[var5++] = var83.anInt1414;
														Class1.aStringArray5[var6++] = var83.aString1421 != null
																? var83.aString1421 : "";
														Class1.aStringArray5[var6++] = var83.aString1413 != null
																? var83.aString1413 : "";
														Class1.aStringArray5[var6++] = var83.aString1417 != null
																? var83.aString1417 : "";
													} else {
														Class1.anIntArray4[var5++] = -1;
														Class1.anIntArray4[var5++] = 0;
														Class1.aStringArray5[var6++] = "";
														Class1.aStringArray5[var6++] = "";
														Class1.aStringArray5[var6++] = "";
													}
													continue;
												}

												if (var46 == 5004) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													final Class109_Sub21_Sub9 var65 = Class109_Sub21_Sub17
															.method838(var16);
													if (var65 != null) {
														Class1.anIntArray4[var5++] = var65.anInt1415;
														Class1.anIntArray4[var5++] = var65.anInt1414;
														Class1.aStringArray5[var6++] = var65.aString1421 != null
																? var65.aString1421 : "";
														Class1.aStringArray5[var6++] = var65.aString1413 != null
																? var65.aString1413 : "";
														Class1.aStringArray5[var6++] = var65.aString1417 != null
																? var65.aString1417 : "";
													} else {
														Class1.anIntArray4[var5++] = -1;
														Class1.anIntArray4[var5++] = 0;
														Class1.aStringArray5[var6++] = "";
														Class1.aStringArray5[var6++] = "";
														Class1.aStringArray5[var6++] = "";
													}
													continue;
												}

												if (var46 == 5005) {
													if (Class48.aClass52_501 == null)
														Class1.anIntArray4[var5++] = -1;
													else
														Class1.anIntArray4[var5++] = Class48.aClass52_501.anInt526;
													continue;
												}

												if (var46 == 5008) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													--var5;
													var28 = Class1.anIntArray4[var5];
													var64 = var71.toLowerCase();
													byte var62 = 0;
													if (var64.startsWith("yellow:")) {
														var62 = 0;
														var71 = var71.substring("yellow:".length());
													} else if (var64.startsWith("red:")) {
														var62 = 1;
														var71 = var71.substring("red:".length());
													} else if (var64.startsWith("green:")) {
														var62 = 2;
														var71 = var71.substring("green:".length());
													} else if (var64.startsWith("cyan:")) {
														var62 = 3;
														var71 = var71.substring("cyan:".length());
													} else if (var64.startsWith("purple:")) {
														var62 = 4;
														var71 = var71.substring("purple:".length());
													} else if (var64.startsWith("white:")) {
														var62 = 5;
														var71 = var71.substring("white:".length());
													} else if (var64.startsWith("flash1:")) {
														var62 = 6;
														var71 = var71.substring("flash1:".length());
													} else if (var64.startsWith("flash2:")) {
														var62 = 7;
														var71 = var71.substring("flash2:".length());
													} else if (var64.startsWith("flash3:")) {
														var62 = 8;
														var71 = var71.substring("flash3:".length());
													} else if (var64.startsWith("glow1:")) {
														var62 = 9;
														var71 = var71.substring("glow1:".length());
													} else if (var64.startsWith("glow2:")) {
														var62 = 10;
														var71 = var71.substring("glow2:".length());
													} else if (var64.startsWith("glow3:")) {
														var62 = 11;
														var71 = var71.substring("glow3:".length());
													} else if (client.anInt2051 != 0)
														if (var64.startsWith("yellow:")) {
															var62 = 0;
															var71 = var71.substring("yellow:".length());
														} else if (var64.startsWith("red:")) {
															var62 = 1;
															var71 = var71.substring("red:".length());
														} else if (var64.startsWith("green:")) {
															var62 = 2;
															var71 = var71.substring("green:".length());
														} else if (var64.startsWith("cyan:")) {
															var62 = 3;
															var71 = var71.substring("cyan:".length());
														} else if (var64.startsWith("purple:")) {
															var62 = 4;
															var71 = var71.substring("purple:".length());
														} else if (var64.startsWith("white:")) {
															var62 = 5;
															var71 = var71.substring("white:".length());
														} else if (var64.startsWith("flash1:")) {
															var62 = 6;
															var71 = var71.substring("flash1:".length());
														} else if (var64.startsWith("flash2:")) {
															var62 = 7;
															var71 = var71.substring("flash2:".length());
														} else if (var64.startsWith("flash3:")) {
															var62 = 8;
															var71 = var71.substring("flash3:".length());
														} else if (var64.startsWith("glow1:")) {
															var62 = 9;
															var71 = var71.substring("glow1:".length());
														} else if (var64.startsWith("glow2:")) {
															var62 = 10;
															var71 = var71.substring("glow2:".length());
														} else if (var64.startsWith("glow3:")) {
															var62 = 11;
															var71 = var71.substring("glow3:".length());
														}

													var64 = var71.toLowerCase();
													byte var70 = 0;
													if (var64.startsWith("wave:")) {
														var70 = 1;
														var71 = var71.substring("wave:".length());
													} else if (var64.startsWith("wave2:")) {
														var70 = 2;
														var71 = var71.substring("wave2:".length());
													} else if (var64.startsWith("shake:")) {
														var70 = 3;
														var71 = var71.substring("shake:".length());
													} else if (var64.startsWith("scroll:")) {
														var70 = 4;
														var71 = var71.substring("scroll:".length());
													} else if (var64.startsWith("slide:")) {
														var70 = 5;
														var71 = var71.substring("slide:".length());
													} else if (client.anInt2051 != 0)
														if (var64.startsWith("wave:")) {
															var70 = 1;
															var71 = var71.substring("wave:".length());
														} else if (var64.startsWith("wave2:")) {
															var70 = 2;
															var71 = var71.substring("wave2:".length());
														} else if (var64.startsWith("shake:")) {
															var70 = 3;
															var71 = var71.substring("shake:".length());
														} else if (var64.startsWith("scroll:")) {
															var70 = 4;
															var71 = var71.substring("scroll:".length());
														} else if (var64.startsWith("slide:")) {
															var70 = 5;
															var71 = var71.substring("slide:".length());
														}

													client.secureBuffer.method840(55);
													client.secureBuffer.writeByte(0);
													var21 = client.secureBuffer.position;
													client.secureBuffer.writeByte(var28);
													client.secureBuffer.writeByte(var62);
													client.secureBuffer.writeByte(var70);
													final Class109_Sub14_Sub1 var84 = client.secureBuffer;
													var30 = var84.position;
													final byte[] var109 = Class28.method127(var71);
													var84.method609(var109.length);
													var84.position += Class133.aClass67_879.method301(var109, 0,
															var109.length, var84.data, var84.position);
													client.secureBuffer.method562(
															client.secureBuffer.position - var21);
													continue;
												}

												if (var46 == 5009) {
													var6 -= 2;
													var71 = Class1.aStringArray5[var6];
													var48 = Class1.aStringArray5[1 + var6];
													client.secureBuffer.method840(171);
													client.secureBuffer.writeShort(0);
													var18 = client.secureBuffer.position;
													client.secureBuffer.writeString(var71);
													final Class109_Sub14_Sub1 var105 = client.secureBuffer;
													var20 = var105.position;
													var61 = Class28.method127(var48);
													var105.method609(var61.length);
													var105.position += Class133.aClass67_879.method301(var61, 0,
															var61.length, var105.data, var105.position);
													client.secureBuffer.method605(
															client.secureBuffer.position - var18);
													continue;
												}

												if (var46 == 5015) {
													if ((Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590 != null)
															&& (null != Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aString1931))
														var71 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aString1931;
													else
														var71 = "";

													Class1.aStringArray5[var6++] = var71;
													continue;
												}

												if (var46 == 5016) {
													Class1.anIntArray4[var5++] = client.anInt2189;
													continue;
												}

												if (var46 == 5017) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													Class1.anIntArray4[var5++] = Class59.method273(var16);
													continue;
												}

												if (var46 == 5018) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													var49 = Class1.anIntArray4;
													var18 = var5++;
													final Class109_Sub21_Sub9 var91 = (Class109_Sub21_Sub9) Class35.aClass125_331
															.method448(var16);
													if (var91 == null)
														var19 = -1;
													else if (var91.aClass109_Sub21_1279 == Class35.aClass121_333.aClass109_Sub21_846)
														var19 = -1;
													else
														var19 = ((Class109_Sub21_Sub9) var91.aClass109_Sub21_1279).anInt1419;

													var49[var18] = var19;
													continue;
												}

												if (var46 == 5019) {
													--var5;
													var16 = Class1.anIntArray4[var5];
													Class1.anIntArray4[var5++] = Class24.method109(var16);
													continue;
												}

												if (var46 == 5020) {
													--var6;
													var71 = Class1.aStringArray5[var6];
													Class66.method298(var71);
													continue;
												}

												if (var46 == 5021) {
													--var6;
													client.aString2190 = Class1.aStringArray5[var6].toLowerCase()
															.trim();
													continue;
												}

												if (var46 == 5022) {
													Class1.aStringArray5[var6++] = client.aString2190;
													continue;
												}
											}
										}
									}
								}
							}
						} else {
							if (var46 >= 2000) {
								var46 -= 1000;
								--var5;
								var22 = Class83.method345(Class1.anIntArray4[var5]);
							} else
								var22 = var53 ? Class109_Sub21_Sub15_Sub2.aClass109_Sub20_1650
										: Class3.aClass109_Sub20_26;

							Class71.method315(var22);
							if ((var46 == 1200) || (var46 == 1205) || (var46 == 1212)) {
								var5 -= 2;
								var28 = Class1.anIntArray4[var5];
								var18 = Class1.anIntArray4[1 + var5];
								var22.anInt1265 = var28;
								var22.anInt1266 = var18;
								final Class109_Sub21_Sub5 var27 = Class109_Sub23.method660(var28);
								var22.anInt1273 = var27.anInt1352;
								var22.anInt1193 = var27.anInt1353;
								var22.anInt1198 = var27.anInt1354;
								var22.anInt1194 = var27.anInt1355;
								var22.anInt1244 = var27.anInt1346;
								var22.anInt1199 = var27.anInt1351;
								if (var46 == 1205)
									var22.anInt1203 = 0;
								else if ((var46 == 1212) | (var27.anInt1378 == 1))
									var22.anInt1203 = 1;
								else
									var22.anInt1203 = 2;

								if (var22.anInt1240 > 0)
									var22.anInt1199 = (var22.anInt1199 * 32) / var22.anInt1240;
								else if (var22.anInt1274 > 0)
									var22.anInt1199 = (var22.anInt1199 * 32) / var22.anInt1274;
								continue;
							}

							if (var46 == 1201) {
								var22.anInt1188 = 2;
								--var5;
								var22.anInt1189 = Class1.anIntArray4[var5];
								continue;
							}

							if (var46 == 1202) {
								var22.anInt1188 = 3;
								var22.anInt1189 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aClass96_1929
										.method364();
								continue;
							}
						}
					}

					if (var46 < 5400) {
						if (var46 == 5306) {
							Class1.anIntArray4[var5++] = Class58.method271();
							continue;
						}

						if (var46 == 5307) {
							--var5;
							var16 = Class1.anIntArray4[var5];
							if ((var16 == 1) || (var16 == 2))
								Class109_Sub12.method545(var16);
							continue;
						}

						if (var46 == 5308) {
							Class1.anIntArray4[var5++] = Class50.aClass21_513.anInt200;
							continue;
						}

						if (var46 == 5309) {
							--var5;
							var16 = Class1.anIntArray4[var5];
							if ((var16 == 1) || (var16 == 2)) {
								Class50.aClass21_513.anInt200 = var16;
								Class7.method46(-840141801);
							}
							continue;
						}
					}

					if ((var46 < 5600) && (var46 == 5504)) {
						var5 -= 2;
						var16 = Class1.anIntArray4[var5];
						var28 = Class1.anIntArray4[var5 + 1];
						if (!client.aBool2218) {
							client.anInt1991 = var16;
							client.anInt2052 = var28;
						}
					} else {
						if (var46 < 6300) {
							if (var46 == 6200) {
								var5 -= 2;
								client.aShort2147 = (short) Class1.anIntArray4[var5];
								if (client.aShort2147 <= 0)
									client.aShort2147 = 256;

								client.aShort2066 = (short) Class1.anIntArray4[1 + var5];
								if (client.aShort2066 <= 0)
									client.aShort2066 = 205;
								continue;
							}

							if (var46 == 6201) {
								var5 -= 2;
								client.aShort2226 = (short) Class1.anIntArray4[var5];
								if (client.aShort2226 <= 0)
									client.aShort2226 = 256;

								client.aShort2227 = (short) Class1.anIntArray4[var5 + 1];
								if (client.aShort2227 <= 0)
									client.aShort2227 = 320;
								continue;
							}

							if (var46 == 6202) {
								var5 -= 4;
								client.aShort1998 = (short) Class1.anIntArray4[var5];
								if (client.aShort1998 <= 0)
									client.aShort1998 = 1;

								client.aShort2229 = (short) Class1.anIntArray4[var5 + 1];
								if (client.aShort2229 <= 0)
									client.aShort2229 = 32767;
								else if (client.aShort2229 < client.aShort1998)
									client.aShort2229 = client.aShort1998;

								client.aShort2230 = (short) Class1.anIntArray4[var5 + 2];
								if (client.aShort2230 <= 0)
									client.aShort2230 = 1;

								client.aShort2094 = (short) Class1.anIntArray4[3 + var5];
								if (client.aShort2094 <= 0)
									client.aShort2094 = 32767;
								else if (client.aShort2094 < client.aShort2230)
									client.aShort2094 = client.aShort2230;
								continue;
							}

							if (var46 == 6203) {
								if (client.aClass109_Sub20_2150 != null) {
									Class109_Sub21_Sub10.method736(0, 0, client.aClass109_Sub20_2150.anInt1162,
											client.aClass109_Sub20_2150.anInt1163, false);
									Class1.anIntArray4[var5++] = client.anInt2234;
									Class1.anIntArray4[var5++] = client.anInt2101;
								} else {
									Class1.anIntArray4[var5++] = -1;
									Class1.anIntArray4[var5++] = -1;
								}
								continue;
							}

							if (var46 == 6204) {
								Class1.anIntArray4[var5++] = client.aShort2226;
								Class1.anIntArray4[var5++] = client.aShort2227;
								continue;
							}

							if (var46 == 6205) {
								Class1.anIntArray4[var5++] = client.aShort2147;
								Class1.anIntArray4[var5++] = client.aShort2066;
								continue;
							}
						}

						if (var46 < 6600) {
							if (var46 == 6500) {
								Class1.anIntArray4[var5++] = method550('\uff00') ? 1 : 0;
								continue;
							}

							Class46 var111;
							if (var46 == 6501) {
								var111 = Class60.method278();
								if (var111 != null) {
									Class1.anIntArray4[var5++] = var111.anInt492;
									Class1.anIntArray4[var5++] = var111.anInt480;
									Class1.aStringArray5[var6++] = var111.aString488;
									Class1.anIntArray4[var5++] = var111.anInt489;
									Class1.anIntArray4[var5++] = var111.anInt479;
									Class1.aStringArray5[var6++] = var111.aString487;
								} else {
									Class1.anIntArray4[var5++] = -1;
									Class1.anIntArray4[var5++] = 0;
									Class1.aStringArray5[var6++] = "";
									Class1.anIntArray4[var5++] = 0;
									Class1.anIntArray4[var5++] = 0;
									Class1.aStringArray5[var6++] = "";
								}
								continue;
							}

							if (var46 == 6502) {
								var111 = Class81.method337();
								if (null != var111) {
									Class1.anIntArray4[var5++] = var111.anInt492;
									Class1.anIntArray4[var5++] = var111.anInt480;
									Class1.aStringArray5[var6++] = var111.aString488;
									Class1.anIntArray4[var5++] = var111.anInt489;
									Class1.anIntArray4[var5++] = var111.anInt479;
									Class1.aStringArray5[var6++] = var111.aString487;
								} else {
									Class1.anIntArray4[var5++] = -1;
									Class1.anIntArray4[var5++] = 0;
									Class1.aStringArray5[var6++] = "";
									Class1.anIntArray4[var5++] = 0;
									Class1.anIntArray4[var5++] = 0;
									Class1.aStringArray5[var6++] = "";
								}
								continue;
							}

							Class46 var88;
							if (var46 == 6506) {
								--var5;
								var16 = Class1.anIntArray4[var5];
								var88 = null;

								for (var18 = 0; var18 < Class46.anInt481; ++var18)
									if (Class46.aClass46Array485[var18].anInt492 == var16) {
										var88 = Class46.aClass46Array485[var18];
										break;
									}

								if (var88 != null) {
									Class1.anIntArray4[var5++] = var88.anInt492;
									Class1.anIntArray4[var5++] = var88.anInt480;
									Class1.aStringArray5[var6++] = var88.aString488;
									Class1.anIntArray4[var5++] = var88.anInt489;
									Class1.anIntArray4[var5++] = var88.anInt479;
									Class1.aStringArray5[var6++] = var88.aString487;
								} else {
									Class1.anIntArray4[var5++] = -1;
									Class1.anIntArray4[var5++] = 0;
									Class1.aStringArray5[var6++] = "";
									Class1.anIntArray4[var5++] = 0;
									Class1.anIntArray4[var5++] = 0;
									Class1.aStringArray5[var6++] = "";
								}
								continue;
							}

							if (var46 == 6507) {
								var5 -= 4;
								var16 = Class1.anIntArray4[var5];
								var90 = Class1.anIntArray4[1 + var5] == 1;
								var18 = Class1.anIntArray4[2 + var5];
								var54 = Class1.anIntArray4[var5 + 3] == 1;
								Class109_Sub21_Sub12.method755(var16, var90, var18, var54);
								continue;
							}

							if (var46 == 6511) {
								--var5;
								var16 = Class1.anIntArray4[var5];
								if ((var16 >= 0) && (var16 < Class46.anInt481)) {
									var88 = Class46.aClass46Array485[var16];
									Class1.anIntArray4[var5++] = var88.anInt492;
									Class1.anIntArray4[var5++] = var88.anInt480;
									Class1.aStringArray5[var6++] = var88.aString488;
									Class1.anIntArray4[var5++] = var88.anInt489;
									Class1.anIntArray4[var5++] = var88.anInt479;
									Class1.aStringArray5[var6++] = var88.aString487;
									continue;
								}

								Class1.anIntArray4[var5++] = -1;
								Class1.anIntArray4[var5++] = 0;
								Class1.aStringArray5[var6++] = "";
								Class1.anIntArray4[var5++] = 0;
								Class1.anIntArray4[var5++] = 0;
								Class1.aStringArray5[var6++] = "";
								continue;
							}
						}

						throw new IllegalStateException();
					}
				}
			} catch (final Exception var45) {
				final StringBuilder var44 = new StringBuilder(30);
				var44.append("").append(var4.aLong802).append(" ");

				for (var13 = Class1.anInt6 - 1; var13 >= 0; --var13)
					var44.append("").append(Class1.aClass34Array7[var13].aClass109_Sub21_Sub16_330.aLong802)
							.append(" ");

				var44.append("").append(var10);
				Class47.method237(var44.toString(), var45);
			}
		}
	}
}
