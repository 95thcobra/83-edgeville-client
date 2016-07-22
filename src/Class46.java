public class Class46 {
	int anInt479;
	int anInt480;
	static Class46[] aClass46Array485;
	static Class104_Sub1 aClass104_Sub1_486;
	String aString487;
	String aString488;
	int anInt489;
	static int anInt490;
	int anInt491;
	int anInt492;
	static int anInt481 = 0;
	static int anInt482 = 0;
	static int[] anIntArray483 = new int[] { 1, 1, 1, 1 };
	static int[] anIntArray484 = new int[] { 0, 1, 2, 3 };

	boolean method232() {
		return (8 & anInt480) != 0;
	}

	public static Class109_Sub21_Sub14_Sub2 method233(final Class104 var0, final String var1, final String var2) {
		final int var3 = var0.method396(var1);
		final int var4 = var0.method397(var3, var2);
		Class109_Sub21_Sub14_Sub2 var5;
		if (!Class27.method121(var0, var3, var4))
			var5 = null;
		else {
			final Class109_Sub21_Sub14_Sub2 var6 = new Class109_Sub21_Sub14_Sub2();
			var6.anInt1724 = Canvas_Sub1.anInt1594;
			var6.anInt1719 = Class9.anInt96;
			var6.anInt1723 = Class9.anIntArray92[0];
			var6.anInt1721 = Class9.anIntArray93[0];
			var6.anInt1720 = Class106.anIntArray799[0];
			var6.anInt1725 = Class9.anIntArray94[0];
			final int var9 = var6.anInt1725 * var6.anInt1720;
			final byte[] var10 = Class9.aByteArrayArray97[0];
			var6.anIntArray1722 = new int[var9];

			for (int var8 = 0; var8 < var9; ++var8)
				var6.anIntArray1722[var8] = Class35.anIntArray336[var10[var8] & 255];

			Class109_Sub21_Sub5.method696();
			var5 = var6;
		}

		return var5;
	}

	boolean method234() {
		return (1 & anInt480) != 0;
	}

	boolean method235() {
		return (2 & anInt480) != 0;
	}

	boolean method236() {
		return (4 & anInt480) != 0;
	}
}
