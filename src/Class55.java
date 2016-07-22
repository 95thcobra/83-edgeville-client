public class Class55 {
	static byte[][][] aByteArrayArrayArray541;

	public static int method263() {
		return ++Class81.anInt631 - 1;
	}

	public static boolean method264(final int var0) {
		return ((var0 >> 31) & 1) != 0;
	}

	public static Class109_Sub21_Sub14_Sub2[] method265(final Class104 var0, final String var1, final String var2) {
		final int var3 = var0.method396(var1);
		final int var4 = var0.method397(var3, var2);
		return Class84.method347(var0, var3, var4);
	}

	static final void method266(final Class109_Sub20 var0, final int var1, final int var2) {
		if ((client.anInt2206 == 0) || (client.anInt2206 == 3))
			if ((Class81.anInt643 == 1) || (!Class3.aBool22 && (Class81.anInt643 == 4))) {
				final Class109_Sub21_Sub19 var3 = var0.method651();
				if (var3 == null)
					return;

				int var8 = Class81.anInt645 - var1;
				int var4 = Class81.anInt639 - var2;
				if (var3.method887(var8, var4)) {
					var8 -= var3.anInt1633 / 2;
					var4 -= var3.anInt1631 / 2;
					final int var5 = (client.anInt2038 + client.anInt2052) & 2047;
					int var6 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var5];
					int var7 = Class109_Sub21_Sub14_Sub3.anIntArray1836[var5];
					var6 = (var6 * (256 + client.anInt2040)) >> 8;
					var7 = ((client.anInt2040 + 256) * var7) >> 8;
					final int var9 = ((var4 * var6) + (var8 * var7)) >> 11;
					final int var10 = ((var7 * var4) - (var6 * var8)) >> 11;
					final int var11 = (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 + var9) >> 7;
					final int var12 = (Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653
							- var10) >> 7;
					client.secureBuffer.method840(161);
					client.secureBuffer.writeByte(18);
					client.secureBuffer.writeShort(var12 + Class113.anInt822);
					client.secureBuffer.method590(var11 + Class41.anInt375);
					client.secureBuffer
							.method610(Class63.aBoolArray562[82] ? (Class63.aBoolArray562[81] ? 2 : 1) : 0);
					client.secureBuffer.writeByte(var8);
					client.secureBuffer.writeByte(var4);
					client.secureBuffer.writeShort(client.anInt2052);
					client.secureBuffer.writeByte(57);
					client.secureBuffer.writeByte(client.anInt2038);
					client.secureBuffer.writeByte(client.anInt2040);
					client.secureBuffer.writeByte(89);
					client.secureBuffer
							.writeShort(Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710);
					client.secureBuffer
							.writeShort(Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653);
					client.secureBuffer.writeByte(63);
					client.anInt2204 = var11;
					client.anInt2205 = var12;
				}
			}
	}
}
