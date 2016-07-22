public class Class109_Sub18 extends Class109 {
	int anInt1104;
	int anInt1107;
	int anInt1108;
	int anInt1109;
	int anInt1110;
	int anInt1112;
	int anInt1113;
	int anInt1114;
	int anInt1115;
	int anInt1116;
	int anInt1117;
	int anInt1118;
	int anInt1119;
	int anInt1120;
	int anInt1121;
	int anInt1123;
	int anInt1124;
	static int anInt1125;
	Class109_Sub16 aClass109_Sub16_1105;
	Class109_Sub3_Sub1 aClass109_Sub3_Sub1_1106;
	Class101 aClass101_1111;
	Class109_Sub4_Sub2 aClass109_Sub4_Sub2_1122;

	static final void method632(int var0, int var1, final int var2) {
		if ((var0 >= 128) && (var1 >= 128) && (var0 <= 13056) && (var1 <= 13056)) {
			int var6 = Class41.method174(var0, var1, Class77.anInt616) - var2;
			var0 -= Class109_Sub13.anInt1048;
			var6 -= Class24.anInt222;
			var1 -= Class109_Sub21_Sub9.anInt1420;
			final int var8 = Class109_Sub21_Sub14_Sub3.anIntArray1835[Class46.anInt490];
			final int var7 = Class109_Sub21_Sub14_Sub3.anIntArray1836[Class46.anInt490];
			final int var4 = Class109_Sub21_Sub14_Sub3.anIntArray1835[Class109_Sub21_Sub1.anInt1298];
			final int var3 = Class109_Sub21_Sub14_Sub3.anIntArray1836[Class109_Sub21_Sub1.anInt1298];
			int var5 = ((var3 * var0) + (var1 * var4)) >> 16;
			var1 = ((var1 * var3) - (var4 * var0)) >> 16;
			var0 = var5;
			var5 = ((var7 * var6) - (var8 * var1)) >> 16;
			var1 = ((var7 * var1) + (var6 * var8)) >> 16;
			if (var1 >= 50) {
				client.anInt2071 = ((var0 * client.anInt2236) / var1) + (client.anInt2234 / 2);
				client.anInt1988 = (client.anInt2101 / 2) + ((client.anInt2236 * var5) / var1);
			} else {
				client.anInt2071 = -1;
				client.anInt1988 = -1;
			}

		} else {
			client.anInt2071 = -1;
			client.anInt1988 = -1;
		}
	}

	void method633() {
		aClass109_Sub16_1105 = null;
		aClass109_Sub3_Sub1_1106 = null;
		aClass101_1111 = null;
		aClass109_Sub4_Sub2_1122 = null;
	}
}
