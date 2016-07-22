public class Class109_Sub21_Sub1 extends Class109_Sub21 {
	static Class104 aClass104_1294;
	static Class109_Sub21_Sub14_Sub4_Sub1 aClass109_Sub21_Sub14_Sub4_Sub1_1296;
	static Class66 aClass66_1297;
	static int anInt1298;
	int anInt1299 = 0;
	public int anInt1300;
	public int anInt1295;
	public int anInt1291;
	public int anInt1293;
	public static Class120 aClass120_1292 = new Class120(64);

	void method661() {
		method664(anInt1299);
	}

	void method662(final DataBuffer var1, final int var2) {
		while (true) {
			final int var3 = var1.method564();
			if (var3 == 0)
				return;

			method663(var1, var3);
		}
	}

	void method663(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			anInt1299 = var1.method567();

	}

	void method664(final int var1) {
		final double var2 = ((var1 >> 16) & 255) / 256.0D;
		final double var12 = ((var1 >> 8) & 255) / 256.0D;
		final double var14 = (var1 & 255) / 256.0D;
		double var6 = var2;
		if (var12 < var2)
			var6 = var12;

		if (var14 < var6)
			var6 = var14;

		double var4 = var2;
		if (var12 > var2)
			var4 = var12;

		if (var14 > var4)
			var4 = var14;

		double var16 = 0.0D;
		double var8 = 0.0D;
		final double var10 = (var4 + var6) / 2.0D;
		if (var4 != var6) {
			if (var10 < 0.5D)
				var8 = (var4 - var6) / (var4 + var6);

			if (var10 >= 0.5D)
				var8 = (var4 - var6) / (2.0D - var4 - var6);

			if (var2 == var4)
				var16 = (var12 - var14) / (var4 - var6);
			else if (var4 == var12)
				var16 = ((var14 - var2) / (var4 - var6)) + 2.0D;
			else if (var14 == var4)
				var16 = 4.0D + ((var2 - var12) / (var4 - var6));
		}

		var16 /= 6.0D;
		anInt1300 = (int) (var8 * 256.0D);
		anInt1295 = (int) (var10 * 256.0D);
		if (anInt1300 < 0)
			anInt1300 = 0;
		else if (anInt1300 > 255)
			anInt1300 = 255;

		if (anInt1295 < 0)
			anInt1295 = 0;
		else if (anInt1295 > 255)
			anInt1295 = 255;

		if (var10 > 0.5D)
			anInt1291 = (int) (512.0D * (1.0D - var10) * var8);
		else
			anInt1291 = (int) (var8 * var10 * 512.0D);

		if (anInt1291 < 1)
			anInt1291 = 1;

		anInt1293 = (int) (var16 * anInt1291);
	}
}
