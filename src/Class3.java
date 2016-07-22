public class Class3 {
	static boolean aBool22;
	public static int anInt23;
	static int[] anIntArray25;
	static Class109_Sub20 aClass109_Sub20_26;
	static Class109_Sub21_Sub14_Sub2[] aClass109_Sub21_Sub14_Sub2Array27;
	static int anInt28;
	static Class3 aClass3_19 = new Class3();
	static Class3 aClass3_24 = new Class3();
	static Class3 aClass3_20 = new Class3();
	static Class3 aClass3_21 = new Class3();

	public static int method20(int var0) {
		int var1 = 0;
		if ((var0 < 0) || (var0 >= 65536)) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}
}
