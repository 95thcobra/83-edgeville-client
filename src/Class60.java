public class Class60 {
	static int anInt548 = 0;
	static int anInt553 = 0;
	static int anInt549 = 0;
	static byte[][] aByteArrayArray550 = new byte[1000][];
	static byte[][] aByteArrayArray551 = new byte[250][];
	static byte[][] aByteArrayArray552 = new byte[50][];

	static synchronized byte[] method276(final int var0) {
		byte[] var1;
		if ((var0 == 100) && (anInt548 > 0)) {
			var1 = aByteArrayArray550[--anInt548];
			aByteArrayArray550[anInt548] = null;
			return var1;
		} else if ((var0 == 5000) && (anInt553 > 0)) {
			var1 = aByteArrayArray551[--anInt553];
			aByteArrayArray551[anInt553] = null;
			return var1;
		} else if ((var0 == 30000) && (anInt549 > 0)) {
			var1 = aByteArrayArray552[--anInt549];
			aByteArrayArray552[anInt549] = null;
			return var1;
		} else
			return new byte[var0];
	}

	static final int method277(final int var0, final int var1, final int var2) {
		final int var3 = 256 - var2;
		return ((((var2 * (var1 & 16711935)) + (var3 * (var0 & 16711935))) & -16711936)
				+ (((var3 * (var0 & '\uff00')) + ((var1 & '\uff00') * var2)) & 16711680)) >> 8;
	}

	static Class46 method278() {
		Class46.anInt482 = 0;
		return Class81.method337();
	}
}
