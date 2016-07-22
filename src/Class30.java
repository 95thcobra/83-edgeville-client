public final class Class30 {
	int anInt270;
	int anInt273;
	byte[] aByteArray274;
	int anInt276;
	int anInt277;
	int anInt279;
	int anInt280;
	byte aByte281;
	int anInt282;
	byte[] aByteArray283;
	int anInt284;
	int anInt286;
	int anInt290;
	int anInt295;
	int anInt305;
	int anInt306;
	int anInt292 = 4096;
	int anInt271 = 16;
	int anInt288 = 258;
	int anInt275 = 6;
	int anInt272 = 50;
	int anInt285 = 18002;
	int anInt289 = 0;
	int anInt278 = 0;
	int[] anIntArray287 = new int[256];
	int[] anIntArray291 = new int[257];
	boolean[] aBoolArray293 = new boolean[256];
	boolean[] aBoolArray294 = new boolean[16];
	byte[] aByteArray307 = new byte[256];
	byte[] aByteArray296 = new byte[4096];
	int[] anIntArray297 = new int[16];
	byte[] aByteArray298 = new byte[18002];
	byte[] aByteArray299 = new byte[18002];
	byte[][] aByteArrayArray300 = new byte[6][258];
	int[][] anIntArrayArray301 = new int[6][258];
	int[][] anIntArrayArray302 = new int[6][258];
	int[][] anIntArrayArray303 = new int[6][258];
	int[] anIntArray304 = new int[6];

	static final void method133(final int var0, final int var1) {
		if ((client.anInt2045 >= 2) || (client.anInt2196 != 0) || client.aBool2171) {
			String var3;
			if ((client.anInt2196 == 1) && (client.anInt2045 < 2))
				var3 = "Use" + " " + client.aString2122 + " " + "->";
			else if (client.aBool2171 && (client.anInt2045 < 2))
				var3 = client.aString2126 + " " + client.aString2127 + " " + "->";
			else {
				final int var2 = client.anInt2045 - 1;
				String var4;
				if (client.aStringArray2123[var2].length() > 0)
					var4 = client.aStringArray1975[var2] + " " + client.aStringArray2123[var2];
				else
					var4 = client.aStringArray1975[var2];

				var3 = var4;
			}

			if (client.anInt2045 > 2)
				var3 = var3 + Class109_Sub11.method544(16777215) + " " + '\u002f' + " " + (client.anInt2045 - 2)
						+ " more options";

			Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1021(var3, 4 + var0, var1 + 15, 16777215, 0,
					client.anInt1979 / 1000);
		}
	}

	static final String method134(final int var0, final int var1) {
		final int var2 = var1 - var0;
		return var2 < -9 ? Class109_Sub11.method544(16711680)
				: (var2 < -6 ? Class109_Sub11.method544(16723968)
						: (var2 < -3 ? Class109_Sub11.method544(16740352)
								: (var2 < 0 ? Class109_Sub11.method544(16756736)
										: (var2 > 9 ? Class109_Sub11.method544('\uff00')
												: (var2 > 6 ? Class109_Sub11.method544(4259584)
														: (var2 > 3 ? Class109_Sub11.method544(8453888)
																: (var2 > 0 ? Class109_Sub11.method544(12648192)
																		: Class109_Sub11.method544(16776960))))))));
	}
}
