public final class Class48 {
	Class109_Sub21_Sub15 aClass109_Sub21_Sub15_496;
	int anInt497;
	int anInt498;
	Class109_Sub21_Sub15 aClass109_Sub21_Sub15_499;
	Class109_Sub21_Sub15 aClass109_Sub21_Sub15_500;
	static Class52 aClass52_501;
	int anInt502;
	int anInt503;
	protected static int anInt504;
	int anInt505;
	static Class82 aClass82_506;

	public static String method245(final DataBuffer var0) {
		String var4;
		try {
			int var1 = var0.method574();
			if (var1 > 32767)
				var1 = 32767;

			final byte[] var2 = new byte[var1];
			var0.position += Class133.aClass67_879.method299(var0.data, var0.position, var2, 0, var1);
			final String var3 = Class109_Sub21_Sub9.method724(var2, 0, var1);
			var4 = var3;
		} catch (final Exception var6) {
			var4 = "Cabbage";
		}

		return var4;
	}

	static final void method246(final byte[] var0, final int var1, final int var2, final int var3, final int var4,
			final Class138[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6)
			for (var8 = 0; var8 < 64; ++var8)
				for (var7 = 0; var7 < 64; ++var7)
					if (((var1 + var8) > 0) && ((var8 + var1) < 103) && ((var7 + var2) > 0) && ((var2 + var7) < 103))
						var5[var6].anIntArrayArray892[var8 + var1][var2 + var7] &= -16777217;

		final DataBuffer var9 = new DataBuffer(var0);

		for (var8 = 0; var8 < 4; ++var8)
			for (var7 = 0; var7 < 64; ++var7)
				for (int var10 = 0; var10 < 64; ++var10)
					Class109_Sub21_Sub9.method721(var9, var8, var1 + var7, var10 + var2, var3, var4, 0);

	}

	public static void method247() {
		try {
			Class77.aClass130_617.method464();

			for (int var0 = 0; var0 < Class85.anInt660; ++var0)
				Class77.aClass130Array619[var0].method464();

			Class77.aClass130_618.method464();
			Class77.aClass130_623.method464();
		} catch (final Exception var2) {
			;
		}

	}
}
