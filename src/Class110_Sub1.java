public class Class110_Sub1 extends Class110 {
	int anInt899 = (int) (Class109_Sub21_Sub15.method829(1375066840) / 1000L);
	String aString897;
	short aShort898;

	Class110_Sub1(final String var1, final int var2) {
		aString897 = var1;
		aShort898 = (short) var2;
	}

	static void method494(final Class109_Sub20 var0, final int var1, final int var2, final boolean var3) {
		final int var4 = var0.anInt1162;
		final int var6 = var0.anInt1163;
		if (var0.anInt1154 == 0)
			var0.anInt1162 = var0.anInt1274;
		else if (var0.anInt1154 == 1)
			var0.anInt1162 = var1 - var0.anInt1274;
		else if (var0.anInt1154 == 2)
			var0.anInt1162 = (var0.anInt1274 * var1) >> 14;

		if (var0.anInt1225 == 0)
			var0.anInt1163 = var0.anInt1241;
		else if (var0.anInt1225 == 1)
			var0.anInt1163 = var2 - var0.anInt1241;
		else if (var0.anInt1225 == 2)
			var0.anInt1163 = (var0.anInt1241 * var2) >> 14;

		if (var0.anInt1154 == 4)
			var0.anInt1162 = (var0.anInt1159 * var0.anInt1163) / var0.anInt1248;

		if (var0.anInt1225 == 4)
			var0.anInt1163 = (var0.anInt1162 * var0.anInt1248) / var0.anInt1159;

		if (client.aBool2138 && (var0.anInt1229 == 0))
			if ((var0.anInt1163 < 5) && (var0.anInt1162 < 5)) {
				var0.anInt1163 = 5;
				var0.anInt1162 = 5;
			} else {
				if (var0.anInt1163 <= 0)
					var0.anInt1163 = 5;

				if (var0.anInt1162 <= 0)
					var0.anInt1162 = 5;
			}

		if (var0.anInt1151 == 1337)
			client.aClass109_Sub20_2150 = var0;

		if (var3 && (null != var0.anObjectArray1254) && ((var0.anInt1162 != var4) || (var6 != var0.anInt1163))) {
			final Class109_Sub9 var5 = new Class109_Sub9();
			var5.aClass109_Sub20_996 = var0;
			var5.anObjectArray997 = var0.anObjectArray1254;
			client.aClass126_2169.method450(var5);
		}

	}
}
