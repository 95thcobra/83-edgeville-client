public class Class9 {
	public static int[] anIntArray92;
	public static int[] anIntArray93;
	public static int[] anIntArray94;
	static int anInt95;
	public static int anInt96;
	public static byte[][] aByteArrayArray97;

	static void method53(final Class109_Sub20[] var0, final Class109_Sub20 var1, final boolean var2) {
		final int var4 = var1.anInt1170 != 0 ? var1.anInt1170 : var1.anInt1162;
		final int var3 = var1.anInt1171 != 0 ? var1.anInt1171 : var1.anInt1163;
		Class109_Sub21_Sub16.method836(var0, var1.anInt1148, var4, var3, var2);
		if (null != var1.aClass109_Sub20Array1272)
			Class109_Sub21_Sub16.method836(var1.aClass109_Sub20Array1272, var1.anInt1148, var4, var3, var2);

		final Class109_Sub13 var5 = (Class109_Sub13) client.aClass116_2129.method429(var1.anInt1148);
		if (var5 != null) {
			final int var6 = var5.anInt1050;
			if (Class108.method412(var6))
				Class109_Sub21_Sub16.method836(Class109_Sub20.aClass109_Sub20ArrayArray1150[var6], -1, var4, var3,
						var2);
		}

		if (var1.anInt1151 == 1337)
			;

	}

	static char method54(final char var0) {
		return (var0 != 181) && (var0 != 402) ? Character.toTitleCase(var0) : var0;
	}

	public static boolean method55(final int var0) {
		return ((var0 >> 30) & 1) != 0;
	}

	static final void method56(final byte[] var0, final int var1, final int var2, final Class42 var3,
			final Class138[] var4) {
		final DataBuffer var5 = new DataBuffer(var0);
		int var15 = -1;

		while (true) {
			final int var6 = var5.method574();
			if (var6 == 0)
				return;

			var15 += var6;
			int var8 = 0;

			while (true) {
				final int var9 = var5.method574();
				if (var9 == 0)
					break;

				var8 += var9 - 1;
				final int var10 = var8 & 63;
				final int var17 = (var8 >> 6) & 63;
				final int var12 = var8 >> 12;
				final int var13 = var5.method564();
				final int var14 = var13 >> 2;
				final int var19 = var13 & 3;
				final int var18 = var17 + var1;
				final int var16 = var2 + var10;
				if ((var18 > 0) && (var16 > 0) && (var18 < 103) && (var16 < 103)) {
					int var7 = var12;
					if ((Class27.aByteArrayArrayArray243[1][var18][var16] & 2) == 2)
						var7 = var12 - 1;

					Class138 var11 = null;
					if (var7 >= 0)
						var11 = var4[var7];

					Class24.method105(var12, var18, var16, var15, var19, var14, var3, var11);
				}
			}
		}
	}
}
