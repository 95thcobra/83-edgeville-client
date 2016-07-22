public class Class7 {
	static int[] anIntArray83;
	static int[] anIntArray86;
	int anInt82;
	int anInt84;
	int[][] anIntArrayArray85;

	public Class7(int var1, int var2) {
		if (var1 != var2) {
			final int var9 = Class109_Sub21_Sub15_Sub3_Sub2.method1039(var1, var2);
			var1 /= var9;
			var2 /= var9;
			anInt82 = var1;
			anInt84 = var2;
			anIntArrayArray85 = new int[var1][14];

			for (int var3 = 0; var3 < var1; ++var3) {
				final int[] var13 = anIntArrayArray85[var3];
				final double var5 = ((double) var3 / (double) var1) + 6.0D;
				int var4 = (int) Math.floor(1.0D + (var5 - 7.0D));
				if (var4 < 0)
					var4 = 0;

				int var10 = (int) Math.ceil(7.0D + var5);
				if (var10 > 14)
					var10 = 14;

				for (final double var11 = (double) var2 / (double) var1; var4 < var10; ++var4) {
					final double var7 = (var4 - var5) * 3.141592653589793D;
					double var14 = var11;
					if ((var7 < -1.0E-4D) || (var7 > 1.0E-4D))
						var14 = var11 * (Math.sin(var7) / var7);

					var14 *= 0.54D + (0.46D * Math.cos((var4 - var5) * 0.2243994752564138D));
					var13[var4] = (int) Math.floor((var14 * 65536.0D) + 0.5D);
				}
			}

		}
	}

	byte[] method42(byte[] var1) {
		if (anIntArrayArray85 != null) {
			final int var4 = 14 + (int) (((long) var1.length * (long) anInt84) / anInt82);
			final int[] var5 = new int[var4];
			int var2 = 0;
			int var8 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				final byte var7 = var1[var6];
				final int[] var9 = anIntArrayArray85[var8];

				int var3;
				for (var3 = 0; var3 < 14; ++var3)
					var5[var3 + var2] += var7 * var9[var3];

				var8 += anInt84;
				var3 = var8 / anInt82;
				var2 += var3;
				var8 -= anInt82 * var3;
			}

			var1 = new byte[var4];

			for (var6 = 0; var6 < var4; ++var6) {
				final int var10 = (var5[var6] + '\u8000') >> 16;
				if (var10 < -128)
					var1[var6] = -128;
				else if (var10 > 127)
					var1[var6] = 127;
				else
					var1[var6] = (byte) var10;
			}
		}

		return var1;
	}

	int method43(int var1) {
		if (null != anIntArrayArray85)
			var1 = (int) (((long) var1 * (long) anInt84) / anInt82);

		return var1;
	}

	int method44(int var1, final int var2) {
		if (null != anIntArrayArray85)
			var1 = 6 + (int) (((long) var1 * (long) anInt84) / anInt82);

		return var1;
	}

	public static Class109_Sub21_Sub14_Sub4_Sub1 method45(final Class104 var0, final Class104 var1, final int var2,
			final int var3) {
		if (!Class27.method121(var0, var2, var3))
			return null;
		else {
			final byte[] var5 = var1.method387(var2, var3);
			Class109_Sub21_Sub14_Sub4_Sub1 var4;
			if (null == var5)
				var4 = null;
			else {
				final Class109_Sub21_Sub14_Sub4_Sub1 var6 = new Class109_Sub21_Sub14_Sub4_Sub1(var5,
						Class9.anIntArray92, Class9.anIntArray93, Class106.anIntArray799, Class9.anIntArray94,
						Class35.anIntArray336, Class9.aByteArrayArray97);
				Class109_Sub21_Sub5.method696();
				var4 = var6;
			}

			return var4;
		}
	}

	static void method46(final int var0) {
		Class132 var1 = null;

		try {
			var1 = Class1.method12("", client.aClass74_1973.aString610, true);
			final DataBuffer var2 = Class50.aClass21_513.method98();
			var1.method474(var2.data, 0, var2.position);
		} catch (final Exception var4) {
			;
		}

		try {
			if (null != var1)
				var1.method475();
		} catch (final Exception var3) {
			;
		}

	}
}
