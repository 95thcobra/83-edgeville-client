import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class109_Sub8 extends Class109 {
	Class38 aClass38_972;
	Class109_Sub8 aClass109_Sub8_974;
	Class45 aClass45_977;
	LoginEncoder aClass51_978;
	Class22 aClass22_979;
	Class23 aClass23_980;
	boolean aBool981;
	int anInt982;
	int anInt983;
	Class48 aClass48_984;
	int anInt986;
	boolean aBool988;
	int anInt989;
	boolean aBool991;
	int anInt992;
	int anInt993;
	static int[] anIntArray995;
	Class26[] aClass26Array987 = new Class26[5];
	int[] anIntArray990 = new int[5];
	int anInt985 = 0;
	int anInt976;
	int anInt975;
	int anInt973;
	int anInt994;

	Class109_Sub8(final int var1, final int var2, final int var3) {
		anInt976 = var1 * -2098477277;
		anInt975 = var1;
		anInt973 = var2;
		anInt994 = var3;
	}

	static void method526(final Class104_Sub1 var0, final int var1, final int var2, final int var3, final byte var4,
			final boolean var5) {
		final long var6 = (var1 << 16) + var2;
		Class109_Sub21_Sub18 var8 = (Class109_Sub21_Sub18) Class102.aClass116_758.method429(var6);
		if (var8 == null) {
			var8 = (Class109_Sub21_Sub18) Class102.aClass116_748.method429(var6);
			if (null == var8) {
				var8 = (Class109_Sub21_Sub18) Class102.aClass116_751.method429(var6);
				if (null != var8) {
					if (var5) {
						var8.method658();
						Class102.aClass116_758.method430(var8, var6);
						--Class102.anInt761;
						++Class102.anInt765;
					}

				} else {
					if (!var5) {
						var8 = (Class109_Sub21_Sub18) Class102.aClass116_753.method429(var6);
						if (null != var8)
							return;
					}

					var8 = new Class109_Sub21_Sub18();
					var8.aClass104_Sub1_1600 = var0;
					var8.anInt1598 = var3;
					var8.aByte1599 = var4;
					if (var5) {
						Class102.aClass116_758.method430(var8, var6);
						++Class102.anInt765;
					} else {
						Class102.aClass111_750.method416(var8);
						Class102.aClass116_751.method430(var8, var6);
						++Class102.anInt761;
					}

				}
			}
		}
	}

	static void method527() {
		try {
			final File var0 = new File(Class77.aString622, "random.dat");
			int var2;
			if (var0.exists())
				Class77.aClass130_623 = new Class130(new Class132(var0, "rw", 25L), 24, 0);
			else
				label38: for (int var1 = 0; var1 < Class77.aStringArray620.length; ++var1)
					for (var2 = 0; var2 < Class66.aStringArray579.length; ++var2) {
						final File var3 = new File(Class66.aStringArray579[var2] + Class77.aStringArray620[var1]
								+ File.separatorChar + "random.dat");
						if (var3.exists()) {
							Class77.aClass130_623 = new Class130(new Class132(var3, "rw", 25L), 24, 0);
							break label38;
						}
					}

			if (null == Class77.aClass130_623) {
				final RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				Class77.aClass130_623 = new Class130(new Class132(var0, "rw", 25L), 24, 0);
			}
		} catch (final IOException var5) {
			;
		}

	}

	static void method528() {
		Class27.anInt245 = 99;
		Class66.aByteArrayArrayArray577 = new byte[4][104][104];
		Class27.aByteArrayArrayArray246 = new byte[4][104][104];
		Class55.aByteArrayArrayArray541 = new byte[4][104][104];
		Class109_Sub7.aByteArrayArrayArray970 = new byte[4][104][104];
		Class33.anIntArrayArrayArray322 = new int[4][105][105];
		Class27.aByteArrayArrayArray257 = new byte[4][105][105];
		Class112.anIntArrayArray808 = new int[105][105];
		Class109_Sub21_Sub15_Sub3_Sub1.anIntArray1923 = new int[104];
		Class27.anIntArray256 = new int[104];
		Class7.anIntArray83 = new int[104];
		Class47.anIntArray495 = new int[104];
		Class7.anIntArray86 = new int[104];
	}
}
