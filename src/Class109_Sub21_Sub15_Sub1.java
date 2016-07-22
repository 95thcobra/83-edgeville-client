public final class Class109_Sub21_Sub15_Sub1 extends Class109_Sub21_Sub15 {
	int anInt1637;
	int anInt1638;
	static int[] anIntArray1639;
	static String[] aStringArray1640;

	@Override
	protected final Class109_Sub21_Sub15_Sub4 method827(final byte var1) {
		return Class109_Sub23.method660(anInt1638).method689(anInt1637);
	}

	static final int method889(final int var0, int var1) {
		if (var0 == -1)
			return 12345678;
		else {
			var1 = ((var0 & 127) * var1) / 128;
			if (var1 < 2)
				var1 = 2;
			else if (var1 > 126)
				var1 = 126;

			return var1 + (var0 & '\uff80');
		}
	}

	static String method890(String var0, final boolean var1) {
		final String var3 = var1 ? "https://" : "http://";
		if (client.anInt1972 == 1)
			var0 = var0 + "-wtrc";
		else if (client.anInt1972 == 2)
			var0 = var0 + "-wtqa";
		else if (client.anInt1972 == 3)
			var0 = var0 + "-wtwip";
		else if (client.anInt1972 == 5)
			var0 = var0 + "-wti";
		else if (client.anInt1972 == 4)
			var0 = "local";

		String var4 = "";
		if (Class41.aString371 != null)
			var4 = "/p=" + Class41.aString371;

		final String var2 = "runescape.com";
		return var3 + var0 + "." + var2 + "/l=" + client.anInt2051 + "/a=" + Class53.anInt533 + var4 + "/";
	}
}
