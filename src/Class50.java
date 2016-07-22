public class Class50 {
	static Class21 aClass21_513;
	static byte[][] aByteArrayArray514;

	public static void method249(final boolean var0) {
		if (Class109_Sub17.aBool1103 != var0) {
			IsaacCipher.method282();
			Class109_Sub17.aBool1103 = var0;
		}

	}

	static final void method250(final Class109_Sub21_Sub15_Sub3 var0) {
		if ((var0.anInt1698 == client.anInt1979) || (var0.anInt1683 == -1) || (var0.anInt1689 != 0)
				|| ((1 + var0.anInt1685) > Class109_Sub21_Sub18.method849(var0.anInt1683,
						1312158803).anIntArray1396[var0.anInt1684])) {
			final int var2 = var0.anInt1698 - var0.anInt1697;
			final int var3 = client.anInt1979 - var0.anInt1697;
			final int var1 = (var0.anInt1693 * 128) + (var0.anInt1656 * 64);
			final int var4 = (var0.anInt1656 * 64) + (var0.anInt1695 * 128);
			final int var6 = (var0.anInt1694 * 128) + (var0.anInt1656 * 64);
			final int var5 = (var0.anInt1690 * 128) + (var0.anInt1656 * 64);
			var0.anInt1710 = ((var6 * var3) + (var1 * (var2 - var3))) / var2;
			var0.anInt1653 = ((var4 * (var2 - var3)) + (var5 * var3)) / var2;
		}

		var0.anInt1708 = 0;
		if (var0.anInt1699 == 0)
			var0.anInt1680 = 1024;

		if (var0.anInt1699 == 1)
			var0.anInt1680 = 1536;

		if (var0.anInt1699 == 2)
			var0.anInt1680 = 0;

		if (var0.anInt1699 == 3)
			var0.anInt1680 = 512;

		var0.anInt1654 = var0.anInt1680;
	}

	public static Class109_Sub21_Sub14_Sub1[] method251(final Class104 var0, final String var1, final String var2) {
		final int var3 = var0.method396(var1);
		final int var4 = var0.method397(var3, var2);
		return Class6.method40(var0, var3, var4);
	}

	public static int method252(final CharSequence var0, final int var1, final boolean var2) {
		if ((var1 >= 2) && (var1 <= 36)) {
			boolean var4 = false;
			boolean var9 = false;
			int var5 = 0;
			final int var7 = var0.length();

			for (int var6 = 0; var6 < var7; ++var6) {
				final char var3 = var0.charAt(var6);
				if (var6 == 0) {
					if (var3 == 45) {
						var4 = true;
						continue;
					}

					if (var3 == 43)
						continue;
				}

				int var10;
				if ((var3 >= 48) && (var3 <= 57))
					var10 = var3 - 48;
				else if ((var3 >= 65) && (var3 <= 90))
					var10 = var3 - 55;
				else {
					if ((var3 < 97) || (var3 > 122))
						throw new NumberFormatException();

					var10 = var3 - 87;
				}

				if (var10 >= var1)
					throw new NumberFormatException();

				if (var4)
					var10 = -var10;

				final int var8 = (var1 * var5) + var10;
				if ((var8 / var1) != var5)
					throw new NumberFormatException();

				var5 = var8;
				var9 = true;
			}

			if (!var9)
				throw new NumberFormatException();
			else
				return var5;
		} else
			throw new IllegalArgumentException("");
	}
}
