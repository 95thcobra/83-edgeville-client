public class Class36 {
	String aString337;
	String aString338;

	static final void method159(final Class2 var0, final int var1, final int var2) {
		Class91.method355(var0.anInt16, var0.anInt12, var0.anInt13, var0.anInt14, var0.aString15, var0.aString15, var1,
				var2);
	}

	public static boolean method160(final CharSequence var0) {
		boolean var1 = false;
		boolean var2 = false;
		int var8 = 0;
		final int var5 = var0.length();
		int var6 = 0;

		boolean var3;
		while (true) {
			if (var6 >= var5) {
				var3 = var2;
				break;
			}

			label94: {
				final char var4 = var0.charAt(var6);
				if (var6 == 0) {
					if (var4 == 45) {
						var1 = true;
						break label94;
					}

					if (var4 == 43)
						break label94;
				}

				int var9;
				if ((var4 >= 48) && (var4 <= 57))
					var9 = var4 - 48;
				else if ((var4 >= 65) && (var4 <= 90))
					var9 = var4 - 55;
				else {
					if ((var4 < 97) || (var4 > 122)) {
						var3 = false;
						break;
					}

					var9 = var4 - 87;
				}

				if (var9 >= 10) {
					var3 = false;
					break;
				}

				if (var1)
					var9 = -var9;

				final int var7 = var9 + (var8 * 10);
				if (var8 != (var7 / 10)) {
					var3 = false;
					break;
				}

				var8 = var7;
				var2 = true;
			}

			++var6;
		}

		return var3;
	}

	public static int method161(final boolean var0, final boolean var1) {
		final byte var2 = 0;
		final int var3 = var2 + Class102.anInt765 + Class102.anInt760;
		return var3;
	}
}
