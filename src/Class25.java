import java.math.BigInteger;

public class Class25 {
	public static boolean aBool224;
	static BigInteger aBigInteger223 = new BigInteger("10001", 16);
	static BigInteger aBigInteger225 = new BigInteger(
			"b0ff4517e425e64339e935dee9bd13a46fbe5492a7f8a255129abdacb603308d4e8ead77cc83310e14b034b6cc0dab3b128e2cea550dce86cb749ffffabc98e4eaba1d11d960b7f904dcc2e1b3b380f5c133ffd0a39d3fa8073f2ae9c8aa86301873c3e99e89567d14f73cf7c64cb6bc1e6247cf037f921e0aff30663bd716fd",
			16);

	static final void method112() {
		client.anInt2085 = 0;
		final int var0 = Class41.anInt375 + (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 >> 7);
		final int var1 = Class113.anInt822 + (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653 >> 7);
		if ((var0 >= 3053) && (var0 <= 3156) && (var1 >= 3056) && (var1 <= 3136))
			client.anInt2085 = 1;

		if ((var0 >= 3072) && (var0 <= 3118) && (var1 >= 9492) && (var1 <= 9535))
			client.anInt2085 = 1;

		if ((client.anInt2085 == 1) && (var0 >= 3139) && (var0 <= 3199) && (var1 >= 3008) && (var1 <= 3062))
			client.anInt2085 = 0;

	}

	static final Class109_Sub13 openInterface(final int var0, final int var1, final int var2) {
		final Class109_Sub13 var3 = new Class109_Sub13();
		var3.anInt1050 = var1;
		var3.anInt1045 = var2;
		client.aClass116_2129.method430(var3, var0);
		int var5;
		if (Class108.method412(var1)) {
			final Class109_Sub20[] var4 = Class109_Sub20.aClass109_Sub20ArrayArray1150[var1];

			for (var5 = 0; var5 < var4.length; ++var5) {
				final Class109_Sub20 var6 = var4[var5];
				if (null != var6) {
					var6.anInt1267 = 0;
					var6.anInt1268 = 0;
				}
			}
		}

		final Class109_Sub20 var7 = Class83.method345(var0);
		Class71.method315(var7);
		if (client.aClass109_Sub20_2044 != null) {
			Class71.method315(client.aClass109_Sub20_2044);
			client.aClass109_Sub20_2044 = null;
		}

		Class109_Sub21_Sub15_Sub3.method900();
		Class9.method53(Class109_Sub20.aClass109_Sub20ArrayArray1150[var0 >> 16], var7, false);
		Class87.method351(var1);
		if (client.anInt2128 != -1) {
			var5 = client.anInt2128;
			if (Class108.method412(var5))
				Class56.method268(Class109_Sub20.aClass109_Sub20ArrayArray1150[var5], 1);
		}

		return var3;
	}

	public static boolean method114(final int var0, final int var1) {
		return ((var0 >> (1 + var1)) & 1) != 0;
	}
}
