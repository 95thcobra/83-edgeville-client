public class Class109_Sub9 extends Class109 {
	Class109_Sub20 aClass109_Sub20_996;
	Object[] anObjectArray997;
	static String aString998;
	Class109_Sub20 aClass109_Sub20_999;
	int anInt1000;
	int anInt1001;
	int anInt1002;
	int anInt1003;
	int anInt1004;
	String aString1005;
	static byte[][] aByteArrayArray1006;
	int anInt1007;
	boolean aBool1008;

	public static byte[] method529(final Object var0, final boolean var1) {
		if (var0 == null)
			return null;
		else if (var0 instanceof byte[]) {
			final byte[] var3 = ((byte[]) var0);
			return var1 ? Class57_Sub2.method628(var3) : var3;
		} else if (var0 instanceof Class59) {
			final Class59 var2 = (Class59) var0;
			return var2.method272((byte) 10);
		} else
			throw new IllegalArgumentException();
	}

	static final void method530(final String var0) {
		if (null != var0) {
			final String var1 = Class6.method39(var0, Class95.aClass113_708);
			if (var1 != null)
				for (int var3 = 0; var3 < client.anInt2237; ++var3) {
					final Class33 var5 = client.aClass33Array2239[var3];
					final String var2 = var5.aString317;
					final String var4 = Class6.method39(var2, Class95.aClass113_708);
					boolean var6;
					if ((var0 != null) && (var2 != null)) {
						if (!var0.startsWith("#") && !var2.startsWith("#"))
							var6 = var1.equals(var4);
						else
							var6 = var0.equals(var2);
					} else
						var6 = false;

					if (var6) {
						--client.anInt2237;

						for (int var7 = var3; var7 < client.anInt2237; ++var7)
							client.aClass33Array2239[var7] = client.aClass33Array2239[1 + var7];

						client.anInt2161 = client.anInt2131;
						client.secureBuffer.method840(49);
						client.secureBuffer.writeByte(Class32.method140(var0));
						client.secureBuffer.writeString(var0);
						break;
					}
				}
		}
	}

	static void method531() {
		int var1;
		if (client.anInt1978 == 0) {
			Class2.aClass42_17 = new Class42(4, 104, 104, Class27.anIntArrayArrayArray251);

			for (var1 = 0; var1 < 4; ++var1)
				client.aClass138Array2159[var1] = new Class138(104, 104);

			Class21.aClass109_Sub21_Sub14_Sub2_201 = new Class109_Sub21_Sub14_Sub2(512, 512);
			Class5.aString62 = "Starting game engine...";
			Class5.anInt61 = 5;
			client.anInt1978 = 20;
		} else {
			int var2;
			int var4;
			int var5;
			int var7;
			if (client.anInt1978 == 20) {
				final int[] var21 = new int[9];

				for (var4 = 0; var4 < 9; ++var4) {
					var5 = 15 + (var4 * 32) + 128;
					var7 = (var5 * 3) + 600;
					var2 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var5];
					var21[var4] = (var7 * var2) >> 16;
				}

				Class42.method217(var21, 500, 800, 512, 334);
				Class5.aString62 = "Prepared visibility map";
				Class5.anInt61 = 10;
				client.anInt1978 = 30;
			} else if (client.anInt1978 == 30) {
				Class44.aClass104_Sub1_456 = Class114.method425(0, false, true, true);
				Class65.aClass104_Sub1_576 = Class114.method425(1, false, true, true);
				Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847 = Class114.method425(2, true, false, true);
				Class34.aClass104_Sub1_326 = Class114.method425(3, false, true, true);
				Class70.aClass104_Sub1_594 = Class114.method425(4, false, true, true);
				Class109_Sub12.aClass104_Sub1_1042 = Class114.method425(5, true, true, true);
				Class46.aClass104_Sub1_486 = Class114.method425(6, true, true, false);
				Class109_Sub16.aClass104_Sub1_1097 = Class114.method425(7, false, true, true);
				Class28.aClass104_Sub1_265 = Class114.method425(8, false, true, true);
				Class109_Sub21_Sub9.aClass104_Sub1_1418 = Class114.method425(9, false, true, true);
				Class39.aClass104_Sub1_369 = Class114.method425(10, false, true, true);
				Class123.aClass104_Sub1_850 = Class114.method425(11, false, true, true);
				Class115.aClass104_Sub1_829 = Class114.method425(12, false, true, true);
				Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812 = Class114.method425(13, true, false, true);
				Class27.aClass104_Sub1_255 = Class114.method425(14, false, true, false);
				Class1.aClass104_Sub1_1 = Class114.method425(15, false, true, true);
				Class5.aString62 = "Connecting to update server";
				Class5.anInt61 = 20;
				client.anInt1978 = 40;
			} else if (client.anInt1978 == 40) {
				final byte var23 = 0;
				var1 = var23 + ((Class44.aClass104_Sub1_456.method637() * 4) / 100);
				var1 += (Class65.aClass104_Sub1_576.method637() * 4) / 100;
				var1 += (Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847.method637() * 2) / 100;
				var1 += (Class34.aClass104_Sub1_326.method637() * 2) / 100;
				var1 += (Class70.aClass104_Sub1_594.method637() * 6) / 100;
				var1 += (Class109_Sub12.aClass104_Sub1_1042.method637() * 4) / 100;
				var1 += (Class46.aClass104_Sub1_486.method637() * 2) / 100;
				var1 += (Class109_Sub16.aClass104_Sub1_1097.method637() * 60) / 100;
				var1 += (Class28.aClass104_Sub1_265.method637() * 2) / 100;
				var1 += (Class109_Sub21_Sub9.aClass104_Sub1_1418.method637() * 2) / 100;
				var1 += (Class39.aClass104_Sub1_369.method637() * 2) / 100;
				var1 += (Class123.aClass104_Sub1_850.method637() * 2) / 100;
				var1 += (Class115.aClass104_Sub1_829.method637() * 2) / 100;
				var1 += (Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812.method637() * 2) / 100;
				var1 += (Class27.aClass104_Sub1_255.method637() * 2) / 100;
				var1 += (Class1.aClass104_Sub1_1.method637() * 2) / 100;
				if (var1 != 100) {
					if (var1 != 0)
						Class5.aString62 = "Checking for updates - " + var1 + "%";

					Class5.anInt61 = 30;
				} else {
					Class5.aString62 = "Loaded update list";
					Class5.anInt61 = 30;
					client.anInt1978 = 45;
				}
			} else {
				Class104_Sub1 var0;
				Class104_Sub1 var9;
				Class104_Sub1 var10;
				if (client.anInt1978 == 45) {
					Class109_Sub10.method537(22050, !client.aBool2065, 2);
					final Class109_Sub4_Sub3 var20 = new Class109_Sub4_Sub3();
					var20.method860(9, 128);
					Class102.aClass4_757 = DataBuffer.method565(Class109_Sub21_Sub11.aClass71_1495,
							Class109_Sub21_Sub10.aCanvas1472, 0, 22050);
					Class102.aClass4_757.method21(var20);
					var10 = Class1.aClass104_Sub1_1;
					var0 = Class27.aClass104_Sub1_255;
					var9 = Class70.aClass104_Sub1_594;
					Class93.aClass104_702 = var10;
					Class93.aClass104_700 = var0;
					Class93.aClass104_699 = var9;
					Class93.aClass109_Sub4_Sub3_701 = var20;
					Class54.aClass4_535 = DataBuffer.method565(Class109_Sub21_Sub11.aClass71_1495,
							Class109_Sub21_Sub10.aCanvas1472, 1, 2048);
					Class6.aClass109_Sub4_Sub1_81 = new Class109_Sub4_Sub1();
					Class54.aClass4_535.method21(Class6.aClass109_Sub4_Sub1_81);
					Class49.aClass7_510 = new Class7(22050, Class122.anInt848);
					Class5.aString62 = "Prepared sound engine";
					Class5.anInt61 = 35;
					client.anInt1978 = 50;
				} else {
					int var3;
					if (client.anInt1978 == 50) {
						var1 = 0;
						Class109_Sub21_Sub14_Sub4_Sub1 var22;
						if (null == client.aClass109_Sub21_Sub14_Sub4_Sub1_2021) {
							var0 = Class28.aClass104_Sub1_265;
							var9 = Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812;
							var2 = var0.method396("p11_full");
							var3 = var0.method397(var2, "");
							var22 = Class7.method45(var0, var9, var2, var3);
							client.aClass109_Sub21_Sub14_Sub4_Sub1_2021 = var22;
						} else
							++var1;

						if (null == Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503) {
							var0 = Class28.aClass104_Sub1_265;
							var9 = Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812;
							var2 = var0.method396("p12_full");
							var3 = var0.method397(var2, "");
							var22 = Class7.method45(var0, var9, var2, var3);
							Class109_Sub21_Sub12.aClass109_Sub21_Sub14_Sub4_Sub1_1503 = var22;
						} else
							++var1;

						if (null == Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334) {
							var0 = Class28.aClass104_Sub1_265;
							var9 = Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812;
							var2 = var0.method396("b12_full");
							var3 = var0.method397(var2, "");
							var22 = Class7.method45(var0, var9, var2, var3);
							Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334 = var22;
						} else
							++var1;

						if (var1 < 3) {
							Class5.aString62 = "Loading fonts - " + ((100 * var1) / 3) + "%";
							Class5.anInt61 = 40;
						} else {
							Class109_Sub21_Sub2.myMachine = new Class109_Sub15(true);
							Class5.aString62 = "Loaded fonts";
							Class5.anInt61 = 40;
							client.anInt1978 = 60;
						}
					} else if (client.anInt1978 == 60) {
						var10 = Class39.aClass104_Sub1_369;
						var0 = Class28.aClass104_Sub1_265;
						var7 = 0;
						if (var10.method398("title.jpg", ""))
							++var7;

						if (var0.method398("logo", ""))
							++var7;

						if (var0.method398("titlebox", ""))
							++var7;

						if (var0.method398("titlebutton", ""))
							++var7;

						if (var0.method398("runes", ""))
							++var7;

						if (var0.method398("title_mute", ""))
							++var7;

						if (var0.method399("options_radio_buttons,0"))
							++var7;

						if (var0.method399("options_radio_buttons,2"))
							++var7;

						var0.method398("sl_back", "");
						var0.method398("sl_flags", "");
						var0.method398("sl_arrows", "");
						var0.method398("sl_stars", "");
						var0.method398("sl_button", "");
						final byte var17 = 8;
						if (var7 < var17) {
							Class5.aString62 = "Loading title screen - " + ((var7 * 100) / var17) + "%";
							Class5.anInt61 = 50;
						} else {
							Class5.aString62 = "Loaded title screen";
							Class5.anInt61 = 50;
							Class82.method343(5);
							client.anInt1978 = 70;
						}
					} else if (client.anInt1978 == 70) {
						if (!Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847.method391()) {
							Class5.aString62 = "Loading config - "
									+ Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847.method643() + "%";
							Class5.anInt61 = 60;
						} else {
							final Class104_Sub1 var19 = Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847;
							Class109_Sub21_Sub3.aClass104_1312 = var19;
							Class109_Sub21_Sub13.method764(Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847, -2031953831);
							PacketDecoder1.method354(Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847,
									Class109_Sub16.aClass104_Sub1_1097);
							Class4.method36(Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847,
									Class109_Sub16.aClass104_Sub1_1097, client.aBool2065);
							var10 = Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847;
							var0 = Class109_Sub16.aClass104_Sub1_1097;
							Class109_Sub21_Sub13.aClass104_1524 = var10;
							Class109_Sub21_Sub13.aClass104_1509 = var0;
							Class109_Sub21_Sub15_Sub6.method983(Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847,
									Class109_Sub16.aClass104_Sub1_1097, client.aBool1974,
									client.aClass109_Sub21_Sub14_Sub4_Sub1_2021);
							var9 = Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847;
							final Class104_Sub1 var14 = Class44.aClass104_Sub1_456;
							final Class104_Sub1 var11 = Class65.aClass104_Sub1_576;
							Class109_Sub21_Sub7.aClass104_1394 = var9;
							Class109_Sub21_Sub7.aClass104_1391 = var14;
							Class56.aClass104_543 = var11;
							final Class104_Sub1 var8 = Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847;
							final Class104_Sub1 var15 = Class109_Sub16.aClass104_Sub1_1097;
							Class109_Sub21_Sub11.aClass104_1481 = var8;
							Class109_Sub21_Sub11.aClass104_1479 = var15;
							final Class104_Sub1 var12 = Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847;
							Class129.aClass104_864 = var12;
							Class109_Sub21_Sub5.method694(Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847);
							Class27.method126(Class34.aClass104_Sub1_326, Class109_Sub16.aClass104_Sub1_1097,
									Class28.aClass104_Sub1_265, Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812);
							final Class104_Sub1 var16 = Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847;
							Class47.aClass104_493 = var16;
							final Class104_Sub1 var13 = Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847;
							Class109_Sub21_Sub12.aClass104_1506 = var13;
							Class5.aString62 = "Loaded config";
							Class5.anInt61 = 60;
							client.anInt1978 = 80;
						}
					} else if (client.anInt1978 != 80) {
						if (client.anInt1978 == 90) {
							if (!Class109_Sub21_Sub9.aClass104_Sub1_1418.method391()) {
								Class5.aString62 = "Loading textures - "
										+ Class109_Sub21_Sub9.aClass104_Sub1_1418.method643() + "%";
								Class5.anInt61 = 90;
							} else {
								final Class20 var18 = new Class20(Class109_Sub21_Sub9.aClass104_Sub1_1418,
										Class28.aClass104_Sub1_265, 20, 0.8D, client.aBool2065 ? 64 : 128);
								Class109_Sub21_Sub14_Sub3.method972(var18);
								Class109_Sub21_Sub14_Sub3.method965(0.8D);
								Class5.aString62 = "Loaded textures";
								Class5.anInt61 = 90;
								client.anInt1978 = 110;
							}
						} else if (client.anInt1978 == 110) {
							client.aClass41_2059 = new Class41();
							Class109_Sub21_Sub11.aClass71_1495.method314(client.aClass41_2059, 10);
							Class5.aString62 = "Loaded input handler";
							Class5.anInt61 = 94;
							client.anInt1978 = 120;
						} else if (client.anInt1978 == 120) {
							if (!Class39.aClass104_Sub1_369.method398("huffman", "")) {
								Class5.aString62 = "Loading wordpack - " + 0 + "%";
								Class5.anInt61 = 96;
							} else {
								final Class67 var6 = new Class67(Class39.aClass104_Sub1_369.method402("huffman", ""));
								Class133.aClass67_879 = var6;
								Class5.aString62 = "Loaded wordpack";
								Class5.anInt61 = 96;
								client.anInt1978 = 130;
							}
						} else if (client.anInt1978 == 130) {
							if (!Class34.aClass104_Sub1_326.method391()) {
								Class5.aString62 = "Loading interfaces - "
										+ ((Class34.aClass104_Sub1_326.method643() * 4) / 5) + "%";
								Class5.anInt61 = 100;
							} else if (!Class115.aClass104_Sub1_829.method391()) {
								Class5.aString62 = "Loading interfaces - "
										+ (80 + (Class115.aClass104_Sub1_829.method643() / 6)) + "%";
								Class5.anInt61 = 100;
							} else if (!Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812.method391()) {
								Class5.aString62 = "Loading interfaces - "
										+ (96 + (Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812.method643() / 20)) + "%";
								Class5.anInt61 = 100;
							} else {
								Class5.aString62 = "Loaded interfaces";
								Class5.anInt61 = 100;
								client.anInt1978 = 140;
							}
						} else if (client.anInt1978 == 140)
							Class82.method343(10);
					} else {
						var1 = 0;
						if (Class109_Sub21_Sub7.aClass109_Sub21_Sub14_Sub2_1408 == null)
							Class109_Sub21_Sub7.aClass109_Sub21_Sub14_Sub2_1408 = Class46
									.method233(Class28.aClass104_Sub1_265, "compass", "");
						else
							++var1;

						if (Class54.aClass109_Sub21_Sub14_Sub2_539 == null)
							Class54.aClass109_Sub21_Sub14_Sub2_539 = Class46.method233(Class28.aClass104_Sub1_265,
									"mapedge", "");
						else
							++var1;

						if (null == Class87.aClass109_Sub21_Sub14_Sub1Array668)
							Class87.aClass109_Sub21_Sub14_Sub1Array668 = Class50.method251(Class28.aClass104_Sub1_265,
									"mapscene", "");
						else
							++var1;

						if (Class77.aClass109_Sub21_Sub14_Sub2Array615 == null)
							Class77.aClass109_Sub21_Sub14_Sub2Array615 = Class55.method265(Class28.aClass104_Sub1_265,
									"mapfunction", "");
						else
							++var1;

						if (Class37.aClass109_Sub21_Sub14_Sub2Array358 == null)
							Class37.aClass109_Sub21_Sub14_Sub2Array358 = Class55.method265(Class28.aClass104_Sub1_265,
									"hitmarks", "");
						else
							++var1;

						if (null == Class38.aClass109_Sub21_Sub14_Sub2Array359)
							Class38.aClass109_Sub21_Sub14_Sub2Array359 = Class55.method265(Class28.aClass104_Sub1_265,
									"headicons_pk", "");
						else
							++var1;

						if (null == Class24.aClass109_Sub21_Sub14_Sub2Array221)
							Class24.aClass109_Sub21_Sub14_Sub2Array221 = Class55.method265(Class28.aClass104_Sub1_265,
									"headicons_prayer", "");
						else
							++var1;

						if (null == Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub2Array1332)
							Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub2Array1332 = Class55
									.method265(Class28.aClass104_Sub1_265, "headicons_hint", "");
						else
							++var1;

						if (null == PacketDecoder1.aClass109_Sub21_Sub14_Sub2Array691)
							PacketDecoder1.aClass109_Sub21_Sub14_Sub2Array691 = Class55.method265(Class28.aClass104_Sub1_265,
									"mapmarker", "");
						else
							++var1;

						if (null == client.aClass109_Sub21_Sub14_Sub2Array2098)
							client.aClass109_Sub21_Sub14_Sub2Array2098 = Class55.method265(Class28.aClass104_Sub1_265,
									"cross", "");
						else
							++var1;

						if (Class84.aClass109_Sub21_Sub14_Sub2Array657 == null)
							Class84.aClass109_Sub21_Sub14_Sub2Array657 = Class55.method265(Class28.aClass104_Sub1_265,
									"mapdots", "");
						else
							++var1;

						if (Class109_Sub21_Sub16.aClass109_Sub21_Sub14_Sub1Array1577 == null)
							Class109_Sub21_Sub16.aClass109_Sub21_Sub14_Sub1Array1577 = Class50
									.method251(Class28.aClass104_Sub1_265, "scrollbar", "");
						else
							++var1;

						if (null == Class109_Sub21_Sub15_Sub3_Sub2.aClass109_Sub21_Sub14_Sub1Array1943)
							Class109_Sub21_Sub15_Sub3_Sub2.aClass109_Sub21_Sub14_Sub1Array1943 = Class50
									.method251(Class28.aClass104_Sub1_265, "mod_icons", "");
						else
							++var1;

						if (var1 < 13) {
							Class5.aString62 = "Loading sprites - " + ((var1 * 100) / 13) + "%";
							Class5.anInt61 = 70;
						} else {
							Class109_Sub21_Sub14_Sub4.aClass109_Sub21_Sub14_Sub1Array1910 = Class109_Sub21_Sub15_Sub3_Sub2.aClass109_Sub21_Sub14_Sub1Array1943;
							Class54.aClass109_Sub21_Sub14_Sub2_539.method910();
							var4 = (int) (Math.random() * 21.0D) - 10;
							var5 = (int) (Math.random() * 21.0D) - 10;
							var7 = (int) (Math.random() * 21.0D) - 10;
							var2 = (int) (Math.random() * 41.0D) - 20;

							for (var3 = 0; var3 < Class77.aClass109_Sub21_Sub14_Sub2Array615.length; ++var3)
								Class77.aClass109_Sub21_Sub14_Sub2Array615[var3].method909(var2 + var4, var2 + var5,
										var7 + var2);

							Class87.aClass109_Sub21_Sub14_Sub1Array668[0].method907(var2 + var4, var2 + var5,
									var2 + var7);
							Class5.aString62 = "Loaded sprites";
							Class5.anInt61 = 70;
							client.anInt1978 = 90;
						}
					}
				}
			}
		}
	}

	public static void method532() {
		try {
			if (Class93.anInt703 == 1) {
				int var0 = Class93.aClass109_Sub4_Sub3_701.method855();
				if ((var0 > 0) && Class93.aClass109_Sub4_Sub3_701.method859()) {
					var0 -= Class54.anInt538;
					if (var0 < 0)
						var0 = 0;

					Class93.aClass109_Sub4_Sub3_701.method852(var0);
					return;
				}

				Class93.aClass109_Sub4_Sub3_701.method858();
				Class93.aClass109_Sub4_Sub3_701.method856();
				if (Class27.aClass104_260 != null)
					Class93.anInt703 = 2;
				else
					Class93.anInt703 = 0;

				Class66.aClass109_Sub19_580 = null;
				Class31.aClass17_309 = null;
			}
		} catch (final Exception var2) {
			var2.printStackTrace();
			Class93.aClass109_Sub4_Sub3_701.method858();
			Class93.anInt703 = 0;
			Class66.aClass109_Sub19_580 = null;
			Class31.aClass17_309 = null;
			Class27.aClass104_260 = null;
		}

	}
}
