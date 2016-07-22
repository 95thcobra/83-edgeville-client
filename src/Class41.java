public class Class41 implements Runnable {
	static String aString371;
	static int anInt375;
	boolean aBool377 = true;
	Object anObject372 = new Object();
	int anInt373 = 0;
	int[] anIntArray376 = new int[500];
	int[] anIntArray374 = new int[500];

	static final void method173() {
		Class87.method350();
		Class109_Sub21_Sub1.aClass120_1292.method439();
		Class109_Sub21_Sub4.aClass120_1324.method439();
		Class109_Sub21_Sub10.aClass120_1454.method439();
		Class109_Sub21_Sub10.aClass120_1427.method439();
		Class109_Sub21_Sub10.aClass120_1428.method439();
		Class109_Sub21_Sub10.aClass120_1429.method439();
		Class109_Sub21_Sub13.aClass120_1510.method439();
		Class109_Sub21_Sub13.aClass120_1511.method439();
		IsaacCipher.method282();
		Class109_Sub21_Sub7.aClass120_1392.method439();
		Class109_Sub21_Sub7.aClass120_1393.method439();
		Class109_Sub21_Sub11.aClass120_1484.method439();
		Class109_Sub21_Sub11.aClass120_1485.method439();
		Class109_Sub21_Sub8.aClass120_1412.method439();
		Class109_Sub21_Sub2.aClass120_1302.method439();
		Class96.aClass120_709.method439();
		Class33.method149();
		((Class20) Class109_Sub21_Sub14_Sub3.anInterface3_1833).method93();
		Class109_Sub21_Sub16.aClass120_1583.method439();
		Class44.aClass104_Sub1_456.method394();
		Class65.aClass104_Sub1_576.method394();
		Class34.aClass104_Sub1_326.method394();
		Class70.aClass104_Sub1_594.method394();
		Class109_Sub12.aClass104_Sub1_1042.method394();
		Class46.aClass104_Sub1_486.method394();
		Class109_Sub16.aClass104_Sub1_1097.method394();
		Class28.aClass104_Sub1_265.method394();
		Class109_Sub21_Sub9.aClass104_Sub1_1418.method394();
		Class39.aClass104_Sub1_369.method394();
		Class123.aClass104_Sub1_850.method394();
		Class115.aClass104_Sub1_829.method394();
	}

	static final int method174(final int var0, final int var1, final int var2) {
		final int var3 = var0 >> 7;
		final int var5 = var1 >> 7;
		if ((var3 >= 0) && (var5 >= 0) && (var3 <= 103) && (var5 <= 103)) {
			int var4 = var2;
			if ((var2 < 3) && ((Class27.aByteArrayArrayArray243[1][var3][var5] & 2) == 2))
				var4 = var2 + 1;

			final int var6 = var0 & 127;
			final int var8 = var1 & 127;
			final int var9 = ((Class27.anIntArrayArrayArray251[var4][var3][var5] * (128 - var6))
					+ (var6 * Class27.anIntArrayArrayArray251[var4][1 + var3][var5])) >> 7;
			final int var7 = ((Class27.anIntArrayArrayArray251[var4][var3][1 + var5] * (128 - var6))
					+ (var6 * Class27.anIntArrayArrayArray251[var4][var3 + 1][1 + var5])) >> 7;
			return ((var8 * var7) + (var9 * (128 - var8))) >> 7;
		} else
			return 0;
	}

	static Class90[] method175() {
		return new Class90[] { Class90.aClass90_682, Class90.aClass90_685, Class90.aClass90_686, Class90.aClass90_683 };
	}

	@Override
	public void run() {
		for (; aBool377; Class94.method356(50L)) {
			final Object var1 = anObject372;
			synchronized (var1) {
				if (anInt373 < 500) {
					anIntArray376[anInt373] = Class81.anInt637;
					anIntArray374[anInt373] = Class81.anInt638;
					++anInt373;
				}
			}
		}

	}
}
