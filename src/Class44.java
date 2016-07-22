import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class44 {
	public static short[] aShortArray452;
	public static Class8 aClass8_453;
	static int anInt455;
	static Class104_Sub1 aClass104_Sub1_456;
	byte[] aByteArray447 = new byte[4];
	Class86 aClass86_454;
	int anInt445;
	long aLong451;
	DataInputStream aDataInputStream446;
	int anInt448;
	byte[] aByteArray449;
	int anInt450;

	public static int method226(final CharSequence var0) {
		final int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3)
			var2 = ((var2 << 5) - var2) + var0.charAt(var3);

		return var2;
	}

	static void method227() {
		for (Class109_Sub13 var0 = (Class109_Sub13) client.aClass116_2129
				.method432(); var0 != null; var0 = (Class109_Sub13) client.aClass116_2129.method433()) {
			final int var1 = var0.anInt1050;
			if (Class108.method412(var1)) {
				boolean var2 = true;
				final Class109_Sub20[] var3 = Class109_Sub20.aClass109_Sub20ArrayArray1150[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4)
					if (null != var3[var4]) {
						var2 = var3[var4].aBool1146;
						break;
					}

				if (!var2) {
					var4 = (int) var0.aLong802;
					final Class109_Sub20 var5 = Class83.method345(var4);
					if (var5 != null)
						Class71.method315(var5);
				}
			}
		}

	}

	static final void method228(final Class3 var0) {
		if ((client.anInt2204 == (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 >> 7))
				&& (client.anInt2205 == (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 >> 7)))
			client.anInt2204 = 0;

		int var2 = client.anInt2087;
		if ((var0 == Class3.aClass3_19) || (Class3.aClass3_24 == var0))
			var2 = 1;

		for (int var3 = 0; var3 < var2; ++var3) {
			Class109_Sub21_Sub15_Sub3_Sub2 var1;
			int var5;
			if (Class3.aClass3_19 == var0) {
				var1 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590;
				var5 = 33538048;
			} else if (var0 == Class3.aClass3_24) {
				var1 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[client.anInt2100];
				var5 = client.anInt2100 << 14;
			} else {
				var1 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[client.anIntArray2134[var3]];
				var5 = client.anIntArray2134[var3] << 14;
				if ((Class3.aClass3_21 == var0) && (client.anInt2100 == client.anIntArray2134[var3]))
					continue;
			}

			if ((var1 != null) && var1.method897(1877662443) && !var1.aBool1928) {
				var1.aBool1941 = false;
				if (((client.aBool2065 && (client.anInt2087 > 50)) || (client.anInt2087 > 200))
						&& (var0 != Class3.aClass3_19) && (var1.anInt1657 == var1.anInt1663))
					var1.aBool1941 = true;

				final int var4 = var1.anInt1710 >> 7;
				final int var6 = var1.anInt1653 >> 7;
				if ((var4 >= 0) && (var4 < 104) && (var6 >= 0) && (var6 < 104))
					if ((null != var1.aClass109_Sub21_Sub15_Sub4_1940) && (client.anInt1979 >= var1.anInt1935)
							&& (client.anInt1979 < var1.anInt1948)) {
						var1.aBool1941 = false;
						var1.anInt1934 = Class41.method174(var1.anInt1710, var1.anInt1653, Class77.anInt616);
						Class2.aClass42_17.method187(Class77.anInt616, var1.anInt1710, var1.anInt1653, var1.anInt1934,
								60, var1, var1.anInt1654, var5, var1.anInt1947, var1.anInt1938, var1.anInt1936,
								var1.anInt1944);
					} else {
						if (((var1.anInt1710 & 127) == 64) && ((var1.anInt1653 & 127) == 64)) {
							if (client.anInt2070 == client.anIntArrayArray2069[var4][var6])
								continue;

							client.anIntArrayArray2069[var4][var6] = client.anInt2070;
						}

						var1.anInt1934 = Class41.method174(var1.anInt1710, var1.anInt1653, Class77.anInt616);
						Class2.aClass42_17.method186(Class77.anInt616, var1.anInt1710, var1.anInt1653, var1.anInt1934,
								60, var1, var1.anInt1654, var5, var1.aBool1704);
					}
			}
		}

	}

	Class44(final Class71 var1, final URL var2) {
		aClass86_454 = var1.method316(var2);
		anInt445 = 0;
		aLong451 = Class109_Sub21_Sub15.method829(1185888817) + 30000L;
	}

	byte[] method229(final int var1) throws IOException {
		if (Class109_Sub21_Sub15.method829(398816454) > aLong451)
			throw new IOException();
		else {
			if (anInt445 == 0) {
				if (aClass86_454.anInt664 == 2)
					throw new IOException();

				if (aClass86_454.anInt664 == 1) {
					aDataInputStream446 = (DataInputStream) aClass86_454.anObject662;
					anInt445 = 1;
				}
			}

			int var3;
			if (anInt445 == 1) {
				var3 = aDataInputStream446.available();
				if (var3 > 0) {
					if ((var3 + anInt448) > 4)
						var3 = 4 - anInt448;

					anInt448 += aDataInputStream446.read(aByteArray447, anInt448, var3);
					if (anInt448 == 4) {
						final int var2 = (new DataBuffer(aByteArray447)).readInt();
						aByteArray449 = new byte[var2];
						anInt445 = 2;
					}
				}
			}

			if (anInt445 == 2) {
				var3 = aDataInputStream446.available();
				if (var3 > 0) {
					if ((var3 + anInt450) > aByteArray449.length)
						var3 = aByteArray449.length - anInt450;

					anInt450 += aDataInputStream446.read(aByteArray449, anInt450, var3);
					if (anInt450 == aByteArray449.length)
						return aByteArray449;
				}
			}

			return null;
		}
	}

	public static int method230(final int var0, final byte var1) {
		final Class109_Sub21_Sub8 var2 = Class54.method262(var0);
		final int var3 = var2.anInt1409;
		final int var4 = var2.anInt1410;
		final int var6 = var2.anInt1411;
		final int var5 = Class106.anIntArray800[var6 - var4];
		return (Class106.anIntArray798[var3] >> var4) & var5;
	}

	static final void method231(final int var0, final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < client.anInt2173; ++var4)
			if (((client.anIntArray2241[var4] + client.anIntArray2222[var4]) > var0)
					&& (client.anIntArray2241[var4] < (var2 + var0))
					&& ((client.anIntArray2179[var4] + client.anIntArray2181[var4]) > var1)
					&& (client.anIntArray2179[var4] < (var3 + var1)))
				client.aBoolArray2116[var4] = true;

	}
}
