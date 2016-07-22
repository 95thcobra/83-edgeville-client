public class Class109_Sub7 extends Class109 {
	int anInt967;
	String aString968;
	String aString969;
	static byte[][][] aByteArrayArrayArray970;
	byte aByte971;

	static final void method524(final boolean var0) {
		client.aBool2141 = var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var9;
		int var10;
		int var11;
		if (!client.aBool2141) {
			var2 = client.aClass109_Sub14_Sub1_2211.method592();
			var3 = (client.anInt2012 - client.aClass109_Sub14_Sub1_2211.position) / 16;
			Class53.anIntArrayArray534 = new int[var3][4];

			for (var4 = 0; var4 < var3; ++var4)
				for (var1 = 0; var1 < 4; ++var1)
					Class53.anIntArrayArray534[var4][var1] = client.aClass109_Sub14_Sub1_2211.method568();

			var4 = client.aClass109_Sub14_Sub1_2211.method591();
			var1 = client.aClass109_Sub14_Sub1_2211.method608();
			var5 = client.aClass109_Sub14_Sub1_2211.method559();
			var6 = client.aClass109_Sub14_Sub1_2211.method592();
			Class109_Sub21_Sub9.anIntArray1422 = new int[var3];
			Class109_Sub21_Sub15_Sub5.anIntArray1813 = new int[var3];
			Class109_Sub21_Sub5.anIntArray1384 = new int[var3];
			Class109_Sub9.aByteArrayArray1006 = new byte[var3][];
			Class50.aByteArrayArray514 = new byte[var3][];
			boolean var8 = false;
			if ((((var5 / 8) == 48) || ((var5 / 8) == 49)) && ((var6 / 8) == 48))
				var8 = true;

			if (((var5 / 8) == 48) && ((var6 / 8) == 148))
				var8 = true;

			var3 = 0;

			for (var9 = (var5 - 6) / 8; var9 <= ((var5 + 6) / 8); ++var9)
				for (var10 = (var6 - 6) / 8; var10 <= ((var6 + 6) / 8); ++var10) {
					var11 = (var9 << 8) + var10;
					if (!var8 || ((var10 != 49) && (var10 != 149) && (var10 != 147) && (var9 != 50)
							&& ((var9 != 49) || (var10 != 47)))) {
						Class109_Sub21_Sub9.anIntArray1422[var3] = var11;
						Class109_Sub21_Sub15_Sub5.anIntArray1813[var3] = Class109_Sub12.aClass104_Sub1_1042
								.method396("m" + var9 + "_" + var10);
						Class109_Sub21_Sub5.anIntArray1384[var3] = Class109_Sub12.aClass104_Sub1_1042
								.method396("l" + var9 + "_" + var10);
						++var3;
					}
				}

			Class2.method19(var5, var6, var1, var2, var4);
		} else {
			client.aClass109_Sub14_Sub1_2211.method843();

			for (var2 = 0; var2 < 4; ++var2)
				for (var3 = 0; var3 < 13; ++var3)
					for (var4 = 0; var4 < 13; ++var4) {
						var1 = client.aClass109_Sub14_Sub1_2211.method844(1);
						if (var1 == 1)
							client.anIntArrayArrayArray1996[var2][var3][var4] = client.aClass109_Sub14_Sub1_2211
									.method844(26);
						else
							client.anIntArrayArrayArray1996[var2][var3][var4] = -1;
					}

			client.aClass109_Sub14_Sub1_2211.method845();
			var2 = (client.anInt2012 - client.aClass109_Sub14_Sub1_2211.position) / 16;
			Class53.anIntArrayArray534 = new int[var2][4];

			for (var3 = 0; var3 < var2; ++var3)
				for (var4 = 0; var4 < 4; ++var4)
					Class53.anIntArrayArray534[var3][var4] = client.aClass109_Sub14_Sub1_2211.method599();

			var3 = client.aClass109_Sub14_Sub1_2211.method559();
			var4 = client.aClass109_Sub14_Sub1_2211.method564();
			var1 = client.aClass109_Sub14_Sub1_2211.method559();
			var5 = client.aClass109_Sub14_Sub1_2211.method559();
			var6 = client.aClass109_Sub14_Sub1_2211.method566();
			Class109_Sub21_Sub9.anIntArray1422 = new int[var2];
			Class109_Sub21_Sub15_Sub5.anIntArray1813 = new int[var2];
			Class109_Sub21_Sub5.anIntArray1384 = new int[var2];
			Class109_Sub9.aByteArrayArray1006 = new byte[var2][];
			Class50.aByteArrayArray514 = new byte[var2][];
			var2 = 0;

			for (int var16 = 0; var16 < 4; ++var16)
				for (var9 = 0; var9 < 13; ++var9)
					for (var10 = 0; var10 < 13; ++var10) {
						var11 = client.anIntArrayArrayArray1996[var16][var9][var10];
						if (var11 != -1) {
							final int var13 = (var11 >> 14) & 1023;
							final int var14 = (var11 >> 3) & 2047;
							int var12 = ((var13 / 8) << 8) + (var14 / 8);

							int var7;
							for (var7 = 0; var7 < var2; ++var7)
								if (Class109_Sub21_Sub9.anIntArray1422[var7] == var12) {
									var12 = -1;
									break;
								}

							if (var12 != -1) {
								Class109_Sub21_Sub9.anIntArray1422[var2] = var12;
								var7 = (var12 >> 8) & 255;
								final int var15 = var12 & 255;
								Class109_Sub21_Sub15_Sub5.anIntArray1813[var2] = Class109_Sub12.aClass104_Sub1_1042
										.method396("m" + var7 + "_" + var15);
								Class109_Sub21_Sub5.anIntArray1384[var2] = Class109_Sub12.aClass104_Sub1_1042
										.method396("l" + var7 + "_" + var15);
								++var2;
							}
						}
					}

			Class2.method19(var1, var6, var4, var3, var5);
		}

	}

	static char method525(final char var0) {
		switch (var0) {
		case '\u0020':
		case '\u002d':
		case '\u005f':
		case '\u00a0':
			return '\u005f';
		case '\u0023':
		case '\u005b':
		case '\u005d':
			return var0;
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return '\u0061';
		case '\u00c7':
		case '\u00e7':
			return '\u0063';
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return '\u0065';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return '\u0069';
		case '\u00d1':
		case '\u00f1':
			return '\u006e';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return '\u006f';
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return '\u0075';
		case '\u00df':
			return '\u0062';
		case '\u00ff':
		case '\u0178':
			return '\u0079';
		default:
			return Character.toLowerCase(var0);
		}
	}
}
