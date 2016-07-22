public class Class109_Sub21_Sub2 extends Class109_Sub21 {
	static int anInt1303;
	static Class104 aClass104_1304;
	static Class109_Sub15 myMachine;
	static Class104 aClass104_1306;
	static int anInt1307;
	public static Class120 aClass120_1302 = new Class120(64);
	public int anInt1301 = 0;

	void method665(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method564();
			if (var2 == 0)
				return;

			method666(var1, var2);
		}
	}

	void method666(final DataBuffer var1, final int var2) {
		if (var2 == 5)
			anInt1301 = var1.method566();

	}

	public static boolean method667() {
		final Class109_Sub23 var0 = (Class109_Sub23) Class123.aClass128_849.method460();
		return var0 != null;
	}

	static int method668() {
		return ++Class35.anInt335 - 1;
	}

	static final void method669() {
		Class71.method315(client.aClass109_Sub20_2082);
		++Class26.anInt226;
		if (client.aBool2149 && client.aBool2048) {
			int var3 = Class81.anInt637;
			int var6 = Class81.anInt638;
			var3 -= client.anInt2143;
			var6 -= client.anInt2144;
			if (var3 < client.anInt2219)
				var3 = client.anInt2219;

			if ((client.aClass109_Sub20_2082.anInt1162 + var3) > (client.aClass109_Sub20_2142.anInt1162
					+ client.anInt2219))
				var3 = (client.anInt2219 + client.aClass109_Sub20_2142.anInt1162)
						- client.aClass109_Sub20_2082.anInt1162;

			if (var6 < client.anInt2167)
				var6 = client.anInt2167;

			if ((var6 + client.aClass109_Sub20_2082.anInt1163) > (client.aClass109_Sub20_2142.anInt1163
					+ client.anInt2167))
				var6 = (client.aClass109_Sub20_2142.anInt1163 + client.anInt2167)
						- client.aClass109_Sub20_2082.anInt1163;

			final int var7 = var3 - client.anInt2115;
			final int var11 = var6 - client.anInt2017;
			final int var8 = client.aClass109_Sub20_2082.anInt1221;
			if ((Class26.anInt226 > client.aClass109_Sub20_2082.anInt1222)
					&& ((var7 > var8) || (var7 < -var8) || (var11 > var8) || (var11 < -var8)))
				client.aBool2152 = true;

			final int var2 = client.aClass109_Sub20_2142.anInt1168 + (var3 - client.anInt2219);
			final int var9 = (var6 - client.anInt2167) + client.aClass109_Sub20_2142.anInt1169;
			Class109_Sub9 var0;
			if ((client.aClass109_Sub20_2082.anObjectArray1202 != null) && client.aBool2152) {
				var0 = new Class109_Sub9();
				var0.aClass109_Sub20_996 = client.aClass109_Sub20_2082;
				var0.anInt1002 = var2;
				var0.anInt1000 = var9;
				var0.anObjectArray997 = client.aClass109_Sub20_2082.anObjectArray1202;
				Class109_Sub13.method551(var0, 200000);
			}

			if (Class81.anInt636 == 0) {
				if (client.aBool2152) {
					if (null != client.aClass109_Sub20_2082.anObjectArray1235) {
						var0 = new Class109_Sub9();
						var0.aClass109_Sub20_996 = client.aClass109_Sub20_2082;
						var0.anInt1002 = var2;
						var0.anInt1000 = var9;
						var0.aClass109_Sub20_999 = client.aClass109_Sub20_2108;
						var0.anObjectArray997 = client.aClass109_Sub20_2082.anObjectArray1235;
						Class109_Sub13.method551(var0, 200000);
					}

					if (null != client.aClass109_Sub20_2108) {
						Class109_Sub20 var1 = client.aClass109_Sub20_2082;
						final int var10 = Class52.method256(var1);
						final int var4 = (var10 >> 17) & 7;
						final int var5 = var4;
						if (var4 == 0)
							var0 = null;
						else {
							int var12 = 0;

							while (true) {
								if (var12 >= var5)
									break;

								var1 = Class83.method345(var1.anInt1166);
								if (null == var1) {
									var0 = null;
									break;
								}

								++var12;
							}
						}
					}
				} else if (((client.anInt2136 == 1) || Class109_Sub17.method631(client.anInt2045 - 1))
						&& (client.anInt2045 > 2))
					Class77.method330(client.anInt2143 + client.anInt2115, client.anInt2144 + client.anInt2017);
				else if (client.anInt2045 > 0)
					Class62.method287(client.anInt2115 + client.anInt2143, client.anInt2017 + client.anInt2144);

				client.aClass109_Sub20_2082 = null;
			}

		} else if (Class26.anInt226 > 1)
			client.aClass109_Sub20_2082 = null;
	}

	public static String method670(final byte[] var0, final int var1, final int var2) {
		final char[] var3 = new char[var2];
		int var5 = 0;
		int var6 = var1;

		int var4;
		for (final int var8 = var1 + var2; var6 < var8; var3[var5++] = (char) var4) {
			final int var7 = var0[var6++] & 255;
			if (var7 < 128) {
				if (var7 == 0)
					var4 = '\ufffd';
				else
					var4 = var7;
			} else if (var7 < 192)
				var4 = '\ufffd';
			else if (var7 < 224) {
				if ((var6 < var8) && ((var0[var6] & 192) == 128)) {
					var4 = ((var7 & 31) << 6) | (var0[var6++] & 63);
					if (var4 < 128)
						var4 = '\ufffd';
				} else
					var4 = '\ufffd';
			} else if (var7 < 240) {
				if (((var6 + 1) < var8) && ((var0[var6] & 192) == 128) && ((var0[var6 + 1] & 192) == 128)) {
					var4 = ((var7 & 15) << 12) | ((var0[var6++] & 63) << 6) | (var0[var6++] & 63);
					if (var4 < 2048)
						var4 = '\ufffd';
				} else
					var4 = '\ufffd';
			} else if (var7 < 248) {
				if (((var6 + 2) < var8) && ((var0[var6] & 192) == 128) && ((var0[var6 + 1] & 192) == 128)
						&& ((var0[2 + var6] & 192) == 128)) {
					var4 = ((var7 & 7) << 18) | ((var0[var6++] & 63) << 12) | ((var0[var6++] & 63) << 6)
							| (var0[var6++] & 63);
					if ((var4 >= 65536) && (var4 <= 1114111))
						var4 = '\ufffd';
					else
						var4 = '\ufffd';
				} else
					var4 = '\ufffd';
			} else
				var4 = '\ufffd';
		}

		return new String(var3, 0, var5);
	}
}
