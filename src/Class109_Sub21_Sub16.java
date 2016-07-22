public class Class109_Sub21_Sub16 extends Class109_Sub21 {
	static Class109_Sub21_Sub14_Sub1[] aClass109_Sub21_Sub14_Sub1Array1577;
	int[] anIntArray1578;
	String[] aStringArray1579;
	int anInt1580;
	int anInt1581;
	int anInt1582;
	int anInt1584;
	int[] anIntArray1585;
	public static short[][] aShortArrayArray1586;
	static Class120 aClass120_1583 = new Class120(128);

	protected static final void method833() {
		Class109_Sub10.anImage1025 = null;
		Class29.aFont269 = null;
		Class26.aFontMetrics240 = null;
	}

	public static Class109_Sub21_Sub4 method834(final int var0) {
		Class109_Sub21_Sub4 var1 = (Class109_Sub21_Sub4) Class109_Sub21_Sub4.aClass120_1324.method438(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class109_Sub21_Sub4.aClass104_1335.method387(3, var0);
			var1 = new Class109_Sub21_Sub4();
			if (var2 != null)
				var1.method682(new DataBuffer(var2));

			Class109_Sub21_Sub4.aClass120_1324.method440(var1, var0);
			return var1;
		}
	}

	public static void method835(final DataBuffer var0, final int var1) {
		if (Class77.aClass130_623 != null)
			try {
				Class77.aClass130_623.method465(0L);
				Class77.aClass130_623.method470(var0.data, var1, 24);
			} catch (final Exception var3) {
				;
			}

	}

	static void method836(final Class109_Sub20[] var0, final int var1, final int var2, final int var3,
			final boolean var4) {
		for (final Class109_Sub20 element : var0) {
			final Class109_Sub20 var6 = element;
			if ((var6 != null) && (var1 == var6.anInt1166)) {
				Class110_Sub1.method494(var6, var2, var3, var4);
				Class85.method349(var6, var2, var3);
				if (var6.anInt1168 > (var6.anInt1170 - var6.anInt1162))
					var6.anInt1168 = var6.anInt1170 - var6.anInt1162;

				if (var6.anInt1168 < 0)
					var6.anInt1168 = 0;

				if (var6.anInt1169 > (var6.anInt1171 - var6.anInt1163))
					var6.anInt1169 = var6.anInt1171 - var6.anInt1163;

				if (var6.anInt1169 < 0)
					var6.anInt1169 = 0;

				if (var6.anInt1229 == 0)
					Class9.method53(var0, var6, var4);
			}
		}

	}
}
