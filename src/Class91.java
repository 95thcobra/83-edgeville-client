public class Class91 {
	static Class109_Sub21_Sub14_Sub1 aClass109_Sub21_Sub14_Sub1_690;
	static Class109_Sub21_Sub14_Sub2[] aClass109_Sub21_Sub14_Sub2Array691;
	public static boolean[] aBoolArray688 = new boolean[] { true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
	public static int[] anIntArray689 = new int[99];

	public static void method354(final Class104 var0, final Class104 var1) {
		Class109_Sub21_Sub4.aClass104_1335 = var0;
		Class109_Sub21_Sub4.aClass104_1322 = var1;
		Class109_Sub21_Sub4.anInt1323 = Class109_Sub21_Sub4.aClass104_1335.method401(3);
	}

	static final void method355(final int var0, final int var1, int var2, final int var3, final String var4,
			final String var5, final int var6, final int var7) {
		if (var2 >= 2000)
			var2 -= 2000;

		if (var2 == 31) {
			client.secureBuffer.method840(176);
			client.secureBuffer.writeInt(var1);
			client.secureBuffer.writeShort(var3);
			client.secureBuffer.method596(Class77.anInt624);
			client.secureBuffer.method590(Class8_Sub2.anInt905);
			client.secureBuffer.method589(Class109_Sub21_Sub15_Sub3_Sub1.anInt1927);
			client.secureBuffer.method589(var0);
			client.anInt2077 = 0;
			Class39.aClass109_Sub20_368 = Class83.method345(var1);
			client.anInt2078 = var0;
		}

		if (var2 == 17) {
			client.anInt2073 = var6;
			client.anInt2074 = var7;
			client.anInt2076 = 2;
			client.anInt2137 = 0;
			client.anInt2204 = var0;
			client.anInt2205 = var1;
			client.secureBuffer.method840(74);
			client.secureBuffer.method582(Class63.aBoolArray562[82] ? 1 : 0);
			client.secureBuffer.writeInt(Class20.anInt193);
			client.secureBuffer.method601(client.anInt2124);
			client.secureBuffer.method601(Class41.anInt375 + var0);
			client.secureBuffer.writeShort(Class113.anInt822 + var1);
			client.secureBuffer.method589(var3);
		}

		Class109_Sub20 var10;
		int var11;
		if (var2 == 28) {
			client.secureBuffer.method840(78);
			client.secureBuffer.writeInt(var1);
			var10 = Class83.method345(var1);
			if ((var10.anIntArrayArray1224 != null) && (var10.anIntArrayArray1224[0][0] == 5)) {
				var11 = var10.anIntArrayArray1224[0][1];
				Class106.anIntArray798[var11] = 1 - Class106.anIntArray798[var11];
				Class47.method244(var11);
			}
		}

		Class109_Sub21_Sub15_Sub3_Sub1 var17;
		if (var2 == 8) {
			var17 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var3];
			if (null != var17) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(121);
				client.secureBuffer.method610(Class63.aBoolArray562[82] ? 1 : 0);
				client.secureBuffer.method588(Class20.anInt193);
				client.secureBuffer.method601(var3);
				client.secureBuffer.writeShort(client.anInt2124);
			}
		}

		Class109_Sub21_Sub15_Sub3_Sub2 var18;
		if (var2 == 51) {
			var18 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
			if (null != var18) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(144);
				client.secureBuffer.method589(var3);
				client.secureBuffer.writeByte(Class63.aBoolArray562[82] ? 1 : 0);
			}
		}

		if (var2 == 32) {
			client.secureBuffer.method840(44);
			client.secureBuffer.method597(var1);
			client.secureBuffer.writeShort(client.anInt2124);
			client.secureBuffer.method601(var0);
			client.secureBuffer.writeShort(var3);
			client.secureBuffer.method597(Class20.anInt193);
			client.anInt2077 = 0;
			Class39.aClass109_Sub20_368 = Class83.method345(var1);
			client.anInt2078 = var0;
		}

		if (var2 == 1004) {
			client.anInt2073 = var6;
			client.anInt2074 = var7;
			client.anInt2076 = 2;
			client.anInt2137 = 0;
			client.secureBuffer.method840(116);
			client.secureBuffer.method601(var3);
		}

		if ((var2 == 57) || (var2 == 1007)) {
			var10 = Class112.method423(var1, var0);
			if (var10 != null) {
				var11 = var10.anInt1265;
				final Class109_Sub20 var13 = Class112.method423(var1, var0);
				if (null != var13) {
					if (var13.anObjectArray1245 != null) {
						final Class109_Sub9 var9 = new Class109_Sub9();
						var9.aClass109_Sub20_996 = var13;
						var9.anInt1001 = var3;
						var9.aString1005 = var5;
						var9.anObjectArray997 = var13.anObjectArray1245;
						Class109_Sub13.method551(var9, 200000);
					}

					boolean var14 = true;
					if (var13.anInt1151 > 0)
						var14 = DataBuffer.method617(var13);

					if (var14 && Class25.method114(Class52.method256(var13), var3 - 1)) {
						if (var3 == 1) {
							client.secureBuffer.method840(255);
							client.secureBuffer.writeInt(var1);
							client.secureBuffer.writeShort(var0);
							client.secureBuffer.writeShort(var11);
						}

						if (var3 == 2) {
							client.secureBuffer.method840(149);
							client.secureBuffer.writeInt(var1);
							client.secureBuffer.writeShort(var0);
							client.secureBuffer.writeShort(var11);
						}

						if (var3 == 3) {
							client.secureBuffer.method840(194);
							client.secureBuffer.writeInt(var1);
							client.secureBuffer.writeShort(var0);
							client.secureBuffer.writeShort(var11);
						}

						if (var3 == 4) {
							client.secureBuffer.method840(159);
							client.secureBuffer.writeInt(var1);
							client.secureBuffer.writeShort(var0);
							client.secureBuffer.writeShort(var11);
						}

						if (var3 == 5) {
							client.secureBuffer.method840(148);
							client.secureBuffer.writeInt(var1);
							client.secureBuffer.writeShort(var0);
							client.secureBuffer.writeShort(var11);
						}

						if (var3 == 6) {
							client.secureBuffer.method840(0);
							client.secureBuffer.writeInt(var1);
							client.secureBuffer.writeShort(var0);
							client.secureBuffer.writeShort(var11);
						}

						if (var3 == 7) {
							client.secureBuffer.method840(245);
							client.secureBuffer.writeInt(var1);
							client.secureBuffer.writeShort(var0);
							client.secureBuffer.writeShort(var11);
						}

						if (var3 == 8) {
							client.secureBuffer.method840(77);
							client.secureBuffer.writeInt(var1);
							client.secureBuffer.writeShort(var0);
							client.secureBuffer.writeShort(var11);
						}

						if (var3 == 9) {
							client.secureBuffer.method840(153);
							client.secureBuffer.writeInt(var1);
							client.secureBuffer.writeShort(var0);
							client.secureBuffer.writeShort(var11);
						}

						if (var3 == 10) {
							client.secureBuffer.method840(46);
							client.secureBuffer.writeInt(var1);
							client.secureBuffer.writeShort(var0);
							client.secureBuffer.writeShort(var11);
						}
					}
				}
			}
		}

		if (var2 == 45) {
			var18 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
			if (var18 != null) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(39);
				client.secureBuffer.writeShort(var3);
				client.secureBuffer.writeByte(Class63.aBoolArray562[82] ? 1 : 0);
			}
		}

		if (var2 == 38) {
			client.method1062();
			var10 = Class83.method345(var1);
			client.anInt2196 = 1;
			Class8_Sub2.anInt905 = var0;
			Class77.anInt624 = var1;
			Class109_Sub21_Sub15_Sub3_Sub1.anInt1927 = var3;
			Class71.method315(var10);
			client.aString2122 = Class109_Sub11.method544(16748608) + Class109_Sub23.method660(var3).aString1372
					+ Class109_Sub11.method544(16777215);
			if (client.aString2122 == null)
				client.aString2122 = "null";

		} else {
			if (var2 == 1) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(238);
				client.secureBuffer.method589(var1 + Class113.anInt822);
				client.secureBuffer.writeShort(Class109_Sub21_Sub15_Sub3_Sub1.anInt1927);
				client.secureBuffer.method583(Class63.aBoolArray562[82] ? 1 : 0);
				client.secureBuffer.method589(var0 + Class41.anInt375);
				client.secureBuffer.method590((var3 >> 14) & 32767);
				client.secureBuffer.writeShort(Class8_Sub2.anInt905);
				client.secureBuffer.writeInt(Class77.anInt624);
			}

			if (var2 == 21) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(7);
				client.secureBuffer.method601(Class41.anInt375 + var0);
				client.secureBuffer.writeByte(Class63.aBoolArray562[82] ? 1 : 0);
				client.secureBuffer.method601(var1 + Class113.anInt822);
				client.secureBuffer.writeShort(var3);
			}

			if (var2 == 4) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(188);
				client.secureBuffer.method582(Class63.aBoolArray562[82] ? 1 : 0);
				client.secureBuffer.method601(Class41.anInt375 + var0);
				client.secureBuffer.method589(var1 + Class113.anInt822);
				client.secureBuffer.writeShort((var3 >> 14) & 32767);
			}

			if (var2 == 34) {
				client.secureBuffer.method840(32);
				client.secureBuffer.writeInt(var1);
				client.secureBuffer.method590(var3);
				client.secureBuffer.method601(var0);
				client.anInt2077 = 0;
				Class39.aClass109_Sub20_368 = Class83.method345(var1);
				client.anInt2078 = var0;
			}

			if (var2 == 14) {
				var18 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
				if (null != var18) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(170);
					client.secureBuffer.method589(Class8_Sub2.anInt905);
					client.secureBuffer.method597(Class77.anInt624);
					client.secureBuffer.method590(Class109_Sub21_Sub15_Sub3_Sub1.anInt1927);
					client.secureBuffer.method589(var3);
					client.secureBuffer.method610(Class63.aBoolArray562[82] ? 1 : 0);
				}
			}

			if (var2 == 22) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(1);
				client.secureBuffer.method590(Class41.anInt375 + var0);
				client.secureBuffer.writeShort(var1 + Class113.anInt822);
				client.secureBuffer.method589(var3);
				client.secureBuffer.method610(Class63.aBoolArray562[82] ? 1 : 0);
			}

			if (var2 == 42) {
				client.secureBuffer.method840(215);
				client.secureBuffer.method590(var0);
				client.secureBuffer.method588(var1);
				client.secureBuffer.writeShort(var3);
				client.anInt2077 = 0;
				Class39.aClass109_Sub20_368 = Class83.method345(var1);
				client.anInt2078 = var0;
			}

			if (var2 == 13) {
				var17 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var3];
				if (var17 != null) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(208);
					client.secureBuffer.writeShort(var3);
					client.secureBuffer.writeByte(Class63.aBoolArray562[82] ? 1 : 0);
				}
			}

			if (var2 == 1002) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.secureBuffer.method840(101);
				client.secureBuffer.method601((var3 >> 14) & 32767);
			}

			if (var2 == 1005) {
				var10 = Class83.method345(var1);
				if ((var10 != null) && (var10.anIntArray1264[var0] >= 100000))
					Applet_Sub1.method1053(27, "",
							var10.anIntArray1264[var0] + " x " + Class109_Sub23.method660(var3).aString1372);
				else {
					client.secureBuffer.method840(116);
					client.secureBuffer.method601(var3);
				}

				client.anInt2077 = 0;
				Class39.aClass109_Sub20_368 = Class83.method345(var1);
				client.anInt2078 = var0;
			}

			if (var2 == 46) {
				var18 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
				if (var18 != null) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(239);
					client.secureBuffer.method601(var3);
					client.secureBuffer.method582(Class63.aBoolArray562[82] ? 1 : 0);
				}
			}

			if (var2 == 24) {
				var10 = Class83.method345(var1);
				boolean var19 = true;
				if (var10.anInt1151 > 0)
					var19 = DataBuffer.method617(var10);

				if (var19) {
					client.secureBuffer.method840(78);
					client.secureBuffer.writeInt(var1);
				}
			}

			if (var2 == 18) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(249);
				client.secureBuffer.method589(Class41.anInt375 + var0);
				client.secureBuffer.writeByte(Class63.aBoolArray562[82] ? 1 : 0);
				client.secureBuffer.writeShort(Class113.anInt822 + var1);
				client.secureBuffer.method590(var3);
			}

			if (var2 == 11) {
				var17 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var3];
				if (var17 != null) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(52);
					client.secureBuffer.method601(var3);
					client.secureBuffer.method582(Class63.aBoolArray562[82] ? 1 : 0);
				}
			}

			if (var2 == 39) {
				client.secureBuffer.method840(114);
				client.secureBuffer.method596(var1);
				client.secureBuffer.method589(var3);
				client.secureBuffer.method590(var0);
				client.anInt2077 = 0;
				Class39.aClass109_Sub20_368 = Class83.method345(var1);
				client.anInt2078 = var0;
			}

			if (var2 == 29) {
				client.secureBuffer.method840(78);
				client.secureBuffer.writeInt(var1);
				var10 = Class83.method345(var1);
				if ((null != var10.anIntArrayArray1224) && (var10.anIntArrayArray1224[0][0] == 5)) {
					var11 = var10.anIntArrayArray1224[0][1];
					if (var10.anIntArray1259[0] != Class106.anIntArray798[var11]) {
						Class106.anIntArray798[var11] = var10.anIntArray1259[0];
						Class47.method244(var11);
					}
				}
			}

			if (var2 == 36) {
				client.secureBuffer.method840(73);
				client.secureBuffer.method588(var1);
				client.secureBuffer.method601(var0);
				client.secureBuffer.method590(var3);
				client.anInt2077 = 0;
				Class39.aClass109_Sub20_368 = Class83.method345(var1);
				client.anInt2078 = var0;
			}

			if (var2 == 10) {
				var17 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var3];
				if (null != var17) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(45);
					client.secureBuffer.method583(Class63.aBoolArray562[82] ? 1 : 0);
					client.secureBuffer.method589(var3);
				}
			}

			if (var2 == 40) {
				client.secureBuffer.method840(158);
				client.secureBuffer.method589(var3);
				client.secureBuffer.method589(var0);
				client.secureBuffer.writeInt(var1);
				client.anInt2077 = 0;
				Class39.aClass109_Sub20_368 = Class83.method345(var1);
				client.anInt2078 = var0;
			}

			if (var2 == 35) {
				client.secureBuffer.method840(72);
				client.secureBuffer.writeInt(var1);
				client.secureBuffer.writeShort(var0);
				client.secureBuffer.writeShort(var3);
				client.anInt2077 = 0;
				Class39.aClass109_Sub20_368 = Class83.method345(var1);
				client.anInt2078 = var0;
			}

			if (var2 == 19) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(165);
				client.secureBuffer.writeShort(var0 + Class41.anInt375);
				client.secureBuffer.method610(Class63.aBoolArray562[82] ? 1 : 0);
				client.secureBuffer.method589(var1 + Class113.anInt822);
				client.secureBuffer.method601(var3);
			}

			if (var2 == 47) {
				var18 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
				if (null != var18) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(111);
					client.secureBuffer.method589(var3);
					client.secureBuffer.method582(Class63.aBoolArray562[82] ? 1 : 0);
				}
			}

			if (var2 == 9) {
				var17 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var3];
				if (var17 != null) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(136);
					client.secureBuffer.method582(Class63.aBoolArray562[82] ? 1 : 0);
					client.secureBuffer.writeShort(var3);
				}
			}

			if (var2 == 12) {
				var17 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var3];
				if (null != var17) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(212);
					client.secureBuffer.method589(var3);
					client.secureBuffer.method583(Class63.aBoolArray562[82] ? 1 : 0);
				}
			}

			if (var2 == 7) {
				var17 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var3];
				if (null != var17) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(232);
					client.secureBuffer.writeInt(Class77.anInt624);
					client.secureBuffer.method590(Class109_Sub21_Sub15_Sub3_Sub1.anInt1927);
					client.secureBuffer.method582(Class63.aBoolArray562[82] ? 1 : 0);
					client.secureBuffer.method601(var3);
					client.secureBuffer.method590(Class8_Sub2.anInt905);
				}
			}

			if (var2 == 1003) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				var17 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var3];
				if (null != var17) {
					Class109_Sub21_Sub13 var8 = var17.aClass109_Sub21_Sub13_1925;
					if (var8.anIntArray1516 != null)
						var8 = var8.method763();

					if (var8 != null) {
						client.secureBuffer.method840(202);
						client.secureBuffer.method601(var8.anInt1512);
					}
				}
			}

			if (var2 == 37) {
				client.secureBuffer.method840(183);
				client.secureBuffer.method601(var3);
				client.secureBuffer.method601(var0);
				client.secureBuffer.writeInt(var1);
				client.anInt2077 = 0;
				Class39.aClass109_Sub20_368 = Class83.method345(var1);
				client.anInt2078 = var0;
			}

			if (var2 == 26) {
				client.secureBuffer.method840(199);

				for (Class109_Sub13 var20 = (Class109_Sub13) client.aClass116_2129
						.method432(); var20 != null; var20 = (Class109_Sub13) client.aClass116_2129.method433())
					if ((var20.anInt1045 == 0) || (var20.anInt1045 == 3))
						client.method1064(var20, true);

				if (client.aClass109_Sub20_2044 != null) {
					Class71.method315(client.aClass109_Sub20_2044);
					client.aClass109_Sub20_2044 = null;
				}
			}

			if (var2 == 43) {
				client.secureBuffer.method840(48);
				client.secureBuffer.method590(var3);
				client.secureBuffer.method596(var1);
				client.secureBuffer.method590(var0);
				client.anInt2077 = 0;
				Class39.aClass109_Sub20_368 = Class83.method345(var1);
				client.anInt2078 = var0;
			}

			if (var2 == 2) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(156);
				client.secureBuffer.method596(Class20.anInt193);
				client.secureBuffer.writeShort((var3 >> 14) & 32767);
				client.secureBuffer.method583(Class63.aBoolArray562[82] ? 1 : 0);
				client.secureBuffer.method589(var0 + Class41.anInt375);
				client.secureBuffer.method601(Class113.anInt822 + var1);
				client.secureBuffer.method601(client.anInt2124);
			}

			if (var2 == 1001) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(66);
				client.secureBuffer.method610(Class63.aBoolArray562[82] ? 1 : 0);
				client.secureBuffer.writeShort(var1 + Class113.anInt822);
				client.secureBuffer.method589((var3 >> 14) & 32767);
				client.secureBuffer.method601(var0 + Class41.anInt375);
			}

			if (var2 == 15) {
				var18 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
				if (null != var18) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(150);
					client.secureBuffer.writeShort(client.anInt2124);
					client.secureBuffer.writeByte(Class63.aBoolArray562[82] ? 1 : 0);
					client.secureBuffer.method588(Class20.anInt193);
					client.secureBuffer.method589(var3);
				}
			}

			if (var2 == 50) {
				var18 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
				if (var18 != null) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(137);
					client.secureBuffer.writeShort(var3);
					client.secureBuffer.method583(Class63.aBoolArray562[82] ? 1 : 0);
				}
			}

			if (var2 == 41) {
				client.secureBuffer.method840(122);
				client.secureBuffer.writeShort(var0);
				client.secureBuffer.method597(var1);
				client.secureBuffer.method590(var3);
				client.anInt2077 = 0;
				Class39.aClass109_Sub20_368 = Class83.method345(var1);
				client.anInt2078 = var0;
			}

			if (var2 == 44) {
				var18 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
				if (var18 != null) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(250);
					client.secureBuffer.method583(Class63.aBoolArray562[82] ? 1 : 0);
					client.secureBuffer.method590(var3);
				}
			}

			if (var2 == 23)
				Class2.aClass42_17.method205(Class77.anInt616, var0, var1);

			if (var2 == 6) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(184);
				client.secureBuffer.method589(var1 + Class113.anInt822);
				client.secureBuffer.method610(Class63.aBoolArray562[82] ? 1 : 0);
				client.secureBuffer.method589((var3 >> 14) & 32767);
				client.secureBuffer.method589(Class41.anInt375 + var0);
			}

			if (var2 == 3) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(166);
				client.secureBuffer.writeShort(var0 + Class41.anInt375);
				client.secureBuffer.writeShort(var1 + Class113.anInt822);
				client.secureBuffer.method583(Class63.aBoolArray562[82] ? 1 : 0);
				client.secureBuffer.method601((var3 >> 14) & 32767);
			}

			if (var2 == 49) {
				var18 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
				if (null != var18) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(28);
					client.secureBuffer.method583(Class63.aBoolArray562[82] ? 1 : 0);
					client.secureBuffer.method589(var3);
				}
			}

			if (var2 == 48) {
				var18 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
				if (var18 != null) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(65);
					client.secureBuffer.method601(var3);
					client.secureBuffer.method582(Class63.aBoolArray562[82] ? 1 : 0);
				}
			}

			if (var2 == 16) {
				client.anInt2073 = var6;
				client.anInt2074 = var7;
				client.anInt2076 = 2;
				client.anInt2137 = 0;
				client.anInt2204 = var0;
				client.anInt2205 = var1;
				client.secureBuffer.method840(62);
				client.secureBuffer.method597(Class77.anInt624);
				client.secureBuffer.method590(Class41.anInt375 + var0);
				client.secureBuffer.writeShort(var3);
				client.secureBuffer.method590(Class8_Sub2.anInt905);
				client.secureBuffer.writeShort(var1 + Class113.anInt822);
				client.secureBuffer.method590(Class109_Sub21_Sub15_Sub3_Sub1.anInt1927);
				client.secureBuffer.method582(Class63.aBoolArray562[82] ? 1 : 0);
			}

			if ((var2 == 30) && (null == client.aClass109_Sub20_2044)) {
				Class112.method422(var1, var0);
				client.aClass109_Sub20_2044 = Class112.method423(var1, var0);
				Class71.method315(client.aClass109_Sub20_2044);
			}

			if (var2 == 25) {
				var10 = Class112.method423(var1, var0);
				if (var10 != null) {
					client.method1062();
					var11 = Class109_Sub6.method521(Class52.method256(var10));
					final int var15 = var10.anInt1265;
					final Class109_Sub20 var16 = Class112.method423(var1, var0);
					if ((var16 != null) && (var16.anObjectArray1236 != null)) {
						final Class109_Sub9 var12 = new Class109_Sub9();
						var12.aClass109_Sub20_996 = var16;
						var12.anObjectArray997 = var16.anObjectArray1236;
						Class109_Sub13.method551(var12, 200000);
					}

					client.anInt2125 = var15;
					client.aBool2171 = true;
					Class20.anInt193 = var1;
					client.anInt2124 = var0;
					Canvas_Sub1.anInt1596 = var11;
					Class71.method315(var16);
					client.anInt2196 = 0;
					client.aString2126 = Class6.method38(var10);
					if (client.aString2126 == null)
						client.aString2126 = "Null";

					if (var10.aBool1146)
						client.aString2127 = var10.aString1218 + Class109_Sub11.method544(16777215);
					else
						client.aString2127 = Class109_Sub11.method544('\uff00') + var10.aString1261
								+ Class109_Sub11.method544(16777215);
				}

			} else {
				if (var2 == 33) {
					client.secureBuffer.method840(198);
					client.secureBuffer.method589(var3);
					client.secureBuffer.method596(var1);
					client.secureBuffer.writeShort(var0);
					client.anInt2077 = 0;
					Class39.aClass109_Sub20_368 = Class83.method345(var1);
					client.anInt2078 = var0;
				}

				if (var2 == 58) {
					var10 = Class112.method423(var1, var0);
					if (var10 != null) {
						client.secureBuffer.method840(224);
						client.secureBuffer.writeShort(var10.anInt1265);
						client.secureBuffer.method590(var0);
						client.secureBuffer.method596(Class20.anInt193);
						client.secureBuffer.method590(client.anInt2124);
						client.secureBuffer.method601(client.anInt2125);
						client.secureBuffer.writeInt(var1);
					}
				}

				if (var2 == 5) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(218);
					client.secureBuffer.method590((var3 >> 14) & 32767);
					client.secureBuffer.method589(Class41.anInt375 + var0);
					client.secureBuffer.writeByte(Class63.aBoolArray562[82] ? 1 : 0);
					client.secureBuffer.method590(Class113.anInt822 + var1);
				}

				if (var2 == 20) {
					client.anInt2073 = var6;
					client.anInt2074 = var7;
					client.anInt2076 = 2;
					client.anInt2137 = 0;
					client.anInt2204 = var0;
					client.anInt2205 = var1;
					client.secureBuffer.method840(5);
					client.secureBuffer.method589(var3);
					client.secureBuffer.method590(Class41.anInt375 + var0);
					client.secureBuffer.writeByte(Class63.aBoolArray562[82] ? 1 : 0);
					client.secureBuffer.writeShort(var1 + Class113.anInt822);
				}

				if (client.anInt2196 != 0) {
					client.anInt2196 = 0;
					Class71.method315(Class83.method345(Class77.anInt624));
				}

				if (client.aBool2171)
					client.method1062();

				if ((Class39.aClass109_Sub20_368 != null) && (client.anInt2077 == 0))
					Class71.method315(Class39.aClass109_Sub20_368);

			}
		}
	}

	static {
		int var1 = 0;

		for (int var0 = 0; var0 < 99; ++var0) {
			final int var3 = 1 + var0;
			final int var2 = (int) (var3 + (300.0D * Math.pow(2.0D, var3 / 7.0D)));
			var1 += var2;
			anIntArray689[var0] = var1 / 4;
		}

	}
}
