import java.awt.Frame;

public class Class109_Sub21_Sub17 extends Class109_Sub21 {
	protected static Frame aFrame1587;
	static int anInt1589;
	static Class109_Sub21_Sub15_Sub3_Sub2 aClass109_Sub21_Sub15_Sub3_Sub2_1590;
	Class43[] aClass43Array1588;

	public Class109_Sub21_Sub17(final Class104 var1, final Class104 var2, final int var3, final boolean var4) {
		final Class126 var6 = new Class126();
		final int var13 = var1.method401(var3);
		aClass43Array1588 = new Class43[var13];
		final int[] var9 = var1.method393(var3);

		for (int var10 = 0; var10 < var9.length; ++var10) {
			final byte[] var11 = var1.method387(var3, var9[var10]);
			Class109_Sub6 var12 = null;
			final int var7 = ((var11[0] & 255) << 8) | (var11[1] & 255);

			for (Class109_Sub6 var5 = (Class109_Sub6) var6.method458(); var5 != null; var5 = (Class109_Sub6) var6
					.method449())
				if (var7 == var5.anInt965) {
					var12 = var5;
					break;
				}

			if (null == var12) {
				final byte[] var8 = var2.method405(var7, 0);
				var12 = new Class109_Sub6(var7, var8);
				var6.method450(var12);
			}

			aClass43Array1588[var9[var10]] = new Class43(var11, var12);
		}

	}

	public boolean method837(final int var1) {
		return aClass43Array1588[var1].aBool444;
	}

	static Class109_Sub21_Sub9 method838(final int var0) {
		return (Class109_Sub21_Sub9) Class35.aClass125_331.method448(var0);
	}

	static final void method839() {
		client.gameBuffer.method843();
		final int var0 = client.gameBuffer.method844(8);
		int var1;
		if (var0 < client.anInt2007)
			for (var1 = var0; var1 < client.anInt2007; ++var1)
				client.anIntArray2095[++client.anInt2028 - 1] = client.anIntArray2175[var1];

		if (var0 > client.anInt2007)
			throw new RuntimeException("");
		else {
			client.anInt2007 = 0;

			for (var1 = 0; var1 < var0; ++var1) {
				final int var2 = client.anIntArray2175[var1];
				final Class109_Sub21_Sub15_Sub3_Sub1 var5 = client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var2];
				final int var6 = client.gameBuffer.method844(1);
				if (var6 == 0) {
					client.anIntArray2175[++client.anInt2007 - 1] = var2;
					var5.anInt1700 = client.anInt1979;
				} else {
					final int var4 = client.gameBuffer.method844(2);
					if (var4 == 0) {
						client.anIntArray2175[++client.anInt2007 - 1] = var2;
						var5.anInt1700 = client.anInt1979;
						client.anIntArray2186[++client.anInt2089 - 1] = var2;
					} else {
						int var3;
						int var7;
						if (var4 == 1) {
							client.anIntArray2175[++client.anInt2007 - 1] = var2;
							var5.anInt1700 = client.anInt1979;
							var7 = client.gameBuffer.method844(3);
							var5.method896(var7, false);
							var3 = client.gameBuffer.method844(1);
							if (var3 == 1)
								client.anIntArray2186[++client.anInt2089 - 1] = var2;
						} else if (var4 == 2) {
							client.anIntArray2175[++client.anInt2007 - 1] = var2;
							var5.anInt1700 = client.anInt1979;
							var7 = client.gameBuffer.method844(3);
							var5.method896(var7, true);
							var3 = client.gameBuffer.method844(3);
							var5.method896(var3, true);
							final int var8 = client.gameBuffer.method844(1);
							if (var8 == 1)
								client.anIntArray2186[++client.anInt2089 - 1] = var2;
						} else if (var4 == 3)
							client.anIntArray2095[++client.anInt2028 - 1] = var2;
					}
				}
			}

		}
	}
}
