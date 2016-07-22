import java.awt.Font;
import java.math.BigInteger;

public class Class29 {
	static int[] anIntArray268;
	protected static Font aFont269;
	static BigInteger aBigInteger267 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
	static BigInteger aBigInteger266 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	static final void method130() {
		int var3;
		if (client.anInt2128 != -1) {
			var3 = client.anInt2128;
			if (Class108.method412(var3))
				Class38.method165(Class109_Sub20.aClass109_Sub20ArrayArray1150[var3], -1);
		}

		for (var3 = 0; var3 < client.anInt2173; ++var3) {
			if (client.aBoolArray2116[var3])
				client.aBoolArray2002[var3] = true;

			client.aBoolArray2220[var3] = client.aBoolArray2116[var3];
			client.aBoolArray2116[var3] = false;
		}

		client.anInt2174 = client.anInt1979;
		client.anInt2117 = -1;
		client.anInt2118 = -1;
		Class100.aClass109_Sub20_734 = null;
		int var2;
		int var7;
		int var8;
		if (client.anInt2128 != -1) {
			client.anInt2173 = 0;
			var3 = client.anInt2128;
			var2 = LoginEncoder.anInt524;
			var7 = Class109_Sub21_Sub15_Sub5.anInt1815;
			if (!Class108.method412(var3))
				for (var8 = 0; var8 < 100; ++var8)
					client.aBoolArray2116[var8] = true;
			else {
				Class27.aClass109_Sub20Array258 = null;
				Class109_Sub10.method538(Class109_Sub20.aClass109_Sub20ArrayArray1150[var3], -1, 0, 0, var2, var7, 0, 0, -1);
				if (Class27.aClass109_Sub20Array258 != null) {
					Class109_Sub10.method538(Class27.aClass109_Sub20Array258, -1412584499, 0, 0, var2, var7, Class21.anInt203, Class27.anInt261, -1);
					Class27.aClass109_Sub20Array258 = null;
				}
			}
		}

		Class109_Sub21_Sub14.method786();
		if (!client.aBool2109) {
			if (client.anInt2117 != -1)
				Class30.method133(client.anInt2117, client.anInt2118);
		} else
			Class66.method296();

		if (client.anInt2182 == 3)
			for (var3 = 0; var3 < client.anInt2173; ++var3)
				if (client.aBoolArray2220[var3])
					Class109_Sub21_Sub14.method772(client.anIntArray2241[var3], client.anIntArray2179[var3], client.anIntArray2222[var3], client.anIntArray2181[var3], 16711935, 128);
				else if (client.aBoolArray2002[var3])
					Class109_Sub21_Sub14.method772(client.anIntArray2241[var3], client.anIntArray2179[var3], client.anIntArray2222[var3], client.anIntArray2181[var3], 16711680, 128);

		var3 = Class77.anInt616;
		var2 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710;
		var7 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653;
		var8 = client.anInt2043;

		for (Class109_Sub10 var0 = (Class109_Sub10) Class109_Sub10.aClass126_1020.method458(); var0 != null; var0 = (Class109_Sub10) Class109_Sub10.aClass126_1020.method449())
			if ((var0.anInt1016 != -1) || (var0.anIntArray1015 != null)) {
				int var6 = 0;
				if (var2 > var0.anInt1013)
					var6 += var2 - var0.anInt1013;
				else if (var2 < var0.anInt1011)
					var6 += var0.anInt1011 - var2;

				if (var7 > var0.anInt1017)
					var6 += var7 - var0.anInt1017;
				else if (var7 < var0.anInt1012)
					var6 += var0.anInt1012 - var7;

				if (((var6 - 64) <= var0.anInt1019) && (client.anInt2199 != 0) && (var0.anInt1014 == var3)) {
					var6 -= 64;
					if (var6 < 0)
						var6 = 0;

					final int var1 = ((var0.anInt1019 - var6) * client.anInt2199) / var0.anInt1019;
					if (var0.aClass109_Sub4_Sub2_1010 == null) {
						if (var0.anInt1016 >= 0) {
							final Class11 var9 = Class11.method58(Class70.aClass104_Sub1_594, var0.anInt1016, 0);
							if (null != var9) {
								final Class109_Sub3_Sub1 var10 = var9.method59().method768(Class49.aClass7_510);
								final Class109_Sub4_Sub2 var4 = Class109_Sub4_Sub2.method787(var10, 100, var1);
								var4.method789(-1);
								Class6.aClass109_Sub4_Sub1_81.method743(var4);
								var0.aClass109_Sub4_Sub2_1010 = var4;
							}
						}
					} else
						var0.aClass109_Sub4_Sub2_1010.method790(var1);

					if (null == var0.aClass109_Sub4_Sub2_1022) {
						if ((var0.anIntArray1015 != null) && ((var0.anInt1021 -= var8) <= 0)) {
							final int var11 = (int) (Math.random() * var0.anIntArray1015.length);
							final Class11 var13 = Class11.method58(Class70.aClass104_Sub1_594, var0.anIntArray1015[var11], 0);
							if (var13 != null) {
								final Class109_Sub3_Sub1 var12 = var13.method59().method768(Class49.aClass7_510);
								final Class109_Sub4_Sub2 var5 = Class109_Sub4_Sub2.method787(var12, 100, var1);
								var5.method789(0);
								Class6.aClass109_Sub4_Sub1_81.method743(var5);
								var0.aClass109_Sub4_Sub2_1022 = var5;
								var0.anInt1021 = var0.anInt1018 + (int) (Math.random() * (var0.anInt1009 - var0.anInt1018));
							}
						}
					} else {
						var0.aClass109_Sub4_Sub2_1022.method790(var1);
						if (!var0.aClass109_Sub4_Sub2_1022.method414())
							var0.aClass109_Sub4_Sub2_1022 = null;
					}
				} else {
					if (var0.aClass109_Sub4_Sub2_1010 != null) {
						Class6.aClass109_Sub4_Sub1_81.method739(var0.aClass109_Sub4_Sub2_1010);
						var0.aClass109_Sub4_Sub2_1010 = null;
					}

					if (var0.aClass109_Sub4_Sub2_1022 != null) {
						Class6.aClass109_Sub4_Sub1_81.method739(var0.aClass109_Sub4_Sub2_1022);
						var0.aClass109_Sub4_Sub2_1022 = null;
					}
				}
			}

		client.anInt2043 = 0;
	}

	static final byte[] method131(final byte[] var0) {
		final DataBuffer var1 = new DataBuffer(var0);
		final int var4 = var1.method564();
		final int var2 = var1.readInt();
		if ((var2 >= 0) && ((Class104.anInt789 == 0) || (var2 <= Class104.anInt789))) {
			if (var4 == 0) {
				final byte[] var6 = new byte[var2];
				var1.method561(var6, 0, var2);
				return var6;
			} else {
				final int var3 = var1.readInt();

				// Xtea crashpatch
				if (var3 > 1_000_000) {
					System.err.println("XTEA error caught!");
					return new byte[100];
				}

				if ((var3 < 0) || ((Class104.anInt789 != 0) && (var3 > Class104.anInt789))) {
					System.err.println("XTEA error! Returning empty array.");
					return new byte[100];
					//throw new RuntimeException();
				} else {
					final byte[] var5 = new byte[var3];
					if (var4 == 1)
						Class72.method321(var5, var3, var0, var2, 9);
					else
						Class104.aClass62_788.method284(var1, var5);

					return var5;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	static final void method132(final int var0, final int var1, final int var2, final int var3) {
		for (int var4 = var1; var4 <= (var3 + var1); ++var4)
			for (int var5 = var0; var5 <= (var0 + var2); ++var5)
				if ((var5 >= 0) && (var5 < 104) && (var4 >= 0) && (var4 < 104)) {
					Class27.aByteArrayArrayArray257[0][var5][var4] = 127;
					if ((var5 == var0) && (var5 > 0))
						Class27.anIntArrayArrayArray251[0][var5][var4] = Class27.anIntArrayArrayArray251[0][var5 - 1][var4];

					if ((var5 == (var2 + var0)) && (var5 < 103))
						Class27.anIntArrayArrayArray251[0][var5][var4] = Class27.anIntArrayArrayArray251[0][1 + var5][var4];

					if ((var1 == var4) && (var4 > 0))
						Class27.anIntArrayArrayArray251[0][var5][var4] = Class27.anIntArrayArrayArray251[0][var5][var4 - 1];

					if ((var4 == (var1 + var3)) && (var4 < 103))
						Class27.anIntArrayArrayArray251[0][var5][var4] = Class27.anIntArrayArrayArray251[0][var5][1 + var4];
				}

	}
}
