public class Class77 {
	static Class109_Sub21_Sub14_Sub2[] aClass109_Sub21_Sub14_Sub2Array615;
	static int anInt616;
	public static Class130[] aClass130Array619;
	static String[] aStringArray620;
	public static String aString621;
	static String aString622;
	static int anInt624;
	static Class130 aClass130_623 = null;
	public static Class130 aClass130_617 = null;
	public static Class130 aClass130_618 = null;

	static final void method330(final int var0, final int var1) {
		int var2 = Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1010("Choose Option");

		int var4;
		for (var4 = 0; var4 < client.anInt2045; ++var4) {
			final Class109_Sub21_Sub14_Sub4_Sub1 var5 = Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334;
			String var7;
			if (client.aStringArray2123[var4].length() > 0)
				var7 = client.aStringArray1975[var4] + " " + client.aStringArray2123[var4];
			else
				var7 = client.aStringArray1975[var4];

			final int var3 = var5.method1010(var7);
			if (var3 > var2)
				var2 = var3;
		}

		var2 += 8;
		var4 = 22 + (client.anInt2045 * 15);
		int var6 = var0 - (var2 / 2);
		if ((var2 + var6) > LoginEncoder.anInt524)
			var6 = LoginEncoder.anInt524 - var2;

		if (var6 < 0)
			var6 = 0;

		int var8 = var1;
		if ((var1 + var4) > Class109_Sub21_Sub15_Sub5.anInt1815)
			var8 = Class109_Sub21_Sub15_Sub5.anInt1815 - var4;

		if (var8 < 0)
			var8 = 0;

		client.aBool2109 = true;
		Class109_Sub18.anInt1125 = var6;
		Class70.anInt596 = var8;
		Class79.anInt629 = var2;
		Class88.anInt670 = 22 + (client.anInt2045 * 15);
	}

	public static int method331(final int var0, final int var1) {
		final int var2 = var0 >>> 31;
		return ((var2 + var0) / var1) - var2;
	}
}
