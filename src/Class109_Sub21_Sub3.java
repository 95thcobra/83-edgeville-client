import java.io.File;
import java.io.RandomAccessFile;

public class Class109_Sub21_Sub3 extends Class109_Sub21 {
	public static Class104 aClass104_1312;
	static Class68 aClass68_1320;
	public int anInt1316;
	public int anInt1317;
	public int anInt1311;
	public int anInt1309 = 0;
	public int anInt1319 = -1;
	public boolean aBool1310 = true;
	public int anInt1318 = -1;
	public static Class120 aClass120_1308 = new Class120(64);
	public int anInt1313;
	public int anInt1314;
	public int anInt1315;

	public void method671() {
		if (anInt1318 != -1) {
			method673(anInt1318);
			anInt1316 = anInt1313;
			anInt1317 = anInt1314;
			anInt1311 = anInt1315;
		}

		method673(anInt1309);
	}

	public void method672(final DataBuffer var1, final int var2) {
		while (true) {
			final int var3 = var1.method564();
			if (var3 == 0)
				return;

			method675(var1, var3);
		}
	}

	void method673(final int var1) {
		final double var2 = ((var1 >> 16) & 255) / 256.0D;
		final double var4 = ((var1 >> 8) & 255) / 256.0D;
		final double var10 = (var1 & 255) / 256.0D;
		double var6 = var2;
		if (var4 < var2)
			var6 = var4;

		if (var10 < var6)
			var6 = var10;

		double var8 = var2;
		if (var4 > var2)
			var8 = var4;

		if (var10 > var8)
			var8 = var10;

		double var12 = 0.0D;
		double var14 = 0.0D;
		final double var16 = (var6 + var8) / 2.0D;
		if (var8 != var6) {
			if (var16 < 0.5D)
				var14 = (var8 - var6) / (var6 + var8);

			if (var16 >= 0.5D)
				var14 = (var8 - var6) / (2.0D - var8 - var6);

			if (var8 == var2)
				var12 = (var4 - var10) / (var8 - var6);
			else if (var4 == var8)
				var12 = ((var10 - var2) / (var8 - var6)) + 2.0D;
			else if (var8 == var10)
				var12 = 4.0D + ((var2 - var4) / (var8 - var6));
		}

		var12 /= 6.0D;
		anInt1313 = (int) (var12 * 256.0D);
		anInt1314 = (int) (256.0D * var14);
		anInt1315 = (int) (var16 * 256.0D);
		if (anInt1314 < 0)
			anInt1314 = 0;
		else if (anInt1314 > 255)
			anInt1314 = 255;

		if (anInt1315 < 0)
			anInt1315 = 0;
		else if (anInt1315 > 255)
			anInt1315 = 255;

	}

	static boolean method674(final File var0, final boolean var1) {
		try {
			final RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			final int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1)
				var0.delete();

			return true;
		} catch (final Exception var4) {
			return false;
		}
	}

	void method675(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			anInt1309 = var1.method567();
		else if (var2 == 2)
			anInt1319 = var1.method564();
		else if (var2 == 5)
			aBool1310 = false;
		else if (var2 == 7)
			anInt1318 = var1.method567();
		else if (var2 == 8)
			;

	}

	static final void method676() {
		boolean var0 = false;

		while (!var0) {
			var0 = true;

			for (int var1 = 0; var1 < (client.anInt2045 - 1); ++var1)
				if ((client.anIntArray2113[var1] < 1000) && (client.anIntArray2113[1 + var1] > 1000)) {
					final String var4 = client.aStringArray2123[var1];
					client.aStringArray2123[var1] = client.aStringArray2123[1 + var1];
					client.aStringArray2123[var1 + 1] = var4;
					final String var3 = client.aStringArray1975[var1];
					client.aStringArray1975[var1] = client.aStringArray1975[var1 + 1];
					client.aStringArray1975[1 + var1] = var3;
					int var2 = client.anIntArray2113[var1];
					client.anIntArray2113[var1] = client.anIntArray2113[var1 + 1];
					client.anIntArray2113[1 + var1] = var2;
					var2 = client.anIntArray2111[var1];
					client.anIntArray2111[var1] = client.anIntArray2111[var1 + 1];
					client.anIntArray2111[1 + var1] = var2;
					var2 = client.anIntArray2112[var1];
					client.anIntArray2112[var1] = client.anIntArray2112[1 + var1];
					client.anIntArray2112[var1 + 1] = var2;
					var2 = client.anIntArray2114[var1];
					client.anIntArray2114[var1] = client.anIntArray2114[var1 + 1];
					client.anIntArray2114[var1 + 1] = var2;
					var0 = false;
				}
		}

	}
}
