public class Class84 {
	static Class109_Sub21_Sub14_Sub2[] aClass109_Sub21_Sub14_Sub2Array657;

	static Class109_Sub21_Sub14_Sub2[] method347(final Class104 var0, final int var1, final int var2) {
		if (!Class27.method121(var0, var1, var2))
			return null;
		else {
			final Class109_Sub21_Sub14_Sub2[] var7 = new Class109_Sub21_Sub14_Sub2[Class9.anInt95];

			for (int var6 = 0; var6 < Class9.anInt95; ++var6) {
				final Class109_Sub21_Sub14_Sub2 var3 = var7[var6] = new Class109_Sub21_Sub14_Sub2();
				var3.anInt1724 = Canvas_Sub1.anInt1594;
				var3.anInt1719 = Class9.anInt96;
				var3.anInt1723 = Class9.anIntArray92[var6];
				var3.anInt1721 = Class9.anIntArray93[var6];
				var3.anInt1720 = Class106.anIntArray799[var6];
				var3.anInt1725 = Class9.anIntArray94[var6];
				final int var8 = var3.anInt1720 * var3.anInt1725;
				final byte[] var5 = Class9.aByteArrayArray97[var6];
				var3.anIntArray1722 = new int[var8];

				for (int var4 = 0; var4 < var8; ++var4)
					var3.anIntArray1722[var4] = Class35.anIntArray336[var5[var4] & 255];
			}

			Class109_Sub21_Sub5.method696();
			return var7;
		}
	}
}
