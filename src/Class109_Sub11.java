import java.io.File;
import java.io.IOException;

public final class Class109_Sub11 extends Class109 {
	int anInt1026;
	int anInt1027;
	int anInt1028;
	int anInt1029;
	int anInt1030;
	int anInt1031;
	int anInt1032;
	int anInt1033;
	static int anInt1036;
	int anInt1037;
	int anInt1038;
	int anInt1034 = 0;
	int anInt1035 = -1;

	static boolean method541(final String var0) {
		if (null == var0)
			return false;
		else {
			final String var2 = Class6.method39(var0, Class95.aClass113_708);

			for (int var1 = 0; var1 < client.anInt2132; ++var1) {
				final Class36 var3 = client.aClass36Array2242[var1];
				if (var2.equalsIgnoreCase(Class6.method39(var3.aString338, Class95.aClass113_708)))
					return true;

				if (var2.equalsIgnoreCase(Class6.method39(var3.aString337, Class95.aClass113_708)))
					return true;
			}

			return false;
		}
	}

	static String method542(final Class109_Sub20 var0, final int var1) {
		return !Class25.method114(Class52.method256(var0), var1) && (var0.anObjectArray1245 == null) ? null
				: ((null != var0.aStringArray1219) && (var0.aStringArray1219.length > var1)
						&& (var0.aStringArray1219[var1] != null) && (var0.aStringArray1219[var1].trim().length() != 0)
								? var0.aStringArray1219[var1] : null);
	}

	public static void method543(final String var0, final String var1, final int var2, final int var3)
			throws IOException {
		Class85.anInt660 = var3;
		Class56.anInt544 = var2;

		try {
			Class39.aString367 = System.getProperty("os.name");
		} catch (final Exception var27) {
			Class39.aString367 = "Unknown";
		}

		Class77.aString621 = Class39.aString367.toLowerCase();

		try {
			Class77.aString622 = System.getProperty("user.home");
			if (Class77.aString622 != null)
				Class77.aString622 = Class77.aString622 + "/";
		} catch (final Exception var26) {
			;
		}

		try {
			if (Class77.aString621.startsWith("win")) {
				if (Class77.aString622 == null)
					Class77.aString622 = System.getenv("USERPROFILE");
			} else if (null == Class77.aString622)
				Class77.aString622 = System.getenv("HOME");

			if (null != Class77.aString622)
				Class77.aString622 = Class77.aString622 + "/";
		} catch (final Exception var25) {
			;
		}

		if (Class77.aString622 == null)
			Class77.aString622 = "~/";

		Class66.aStringArray579 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/",
				Class77.aString622, "/tmp/", "" };
		Class77.aStringArray620 = new String[] { ".jagex_cache_" + Class56.anInt544,
				".file_store_" + Class56.anInt544 };
		int var5 = 0;

		label240: while (var5 < 4) {
			final String var6 = var5 == 0 ? "" : "" + var5;
			Class112.aFile809 = new File(Class77.aString622, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			File var32;
			if (Class112.aFile809.exists()) {
				try {
					final Class132 var10 = new Class132(Class112.aFile809, "rw", 10000L);

					DataBuffer var11;
					int var12;
					for (var11 = new DataBuffer((int) var10
							.method476()); var11.position < var11.data.length; var11.position += var12) {
						var12 = var10.method477(var11.data, var11.position,
								var11.data.length - var11.position);
						if (var12 == -1)
							throw new IOException();
					}

					var11.position = 0;
					var12 = var11.method564();
					if ((var12 < 1) || (var12 > 3))
						throw new IOException("" + var12);

					int var13 = 0;
					if (var12 > 1)
						var13 = var11.method564();

					if (var12 <= 2) {
						var7 = var11.method571();
						if (var13 == 1)
							var8 = var11.method571();
					} else {
						var7 = var11.method572();
						if (var13 == 1)
							var8 = var11.method572();
					}

					var10.method475();
				} catch (final IOException var29) {
					var29.printStackTrace();
				}

				if (null != var7) {
					var32 = new File(var7);
					if (!var32.exists())
						var7 = null;
				}

				if (null != var7) {
					var32 = new File(var7, "test.dat");
					if (!Class109_Sub21_Sub3.method674(var32, true))
						var7 = null;
				}
			}

			if ((var7 == null) && (var5 == 0))
				label214: for (int var14 = 0; var14 < Class77.aStringArray620.length; ++var14)
					for (int var15 = 0; var15 < Class66.aStringArray579.length; ++var15) {
						final File var16 = new File(Class66.aStringArray579[var15] + Class77.aStringArray620[var14]
								+ File.separatorChar + var0 + File.separatorChar);
						if (var16.exists() && Class109_Sub21_Sub3.method674(new File(var16, "test.dat"), true)) {
							var7 = var16.toString();
							var9 = true;
							break label214;
						}
					}

			if (var7 == null) {
				var7 = Class77.aString622 + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0
						+ File.separatorChar + var1 + File.separatorChar;
				var9 = true;
			}

			if (null != var8) {
				final File var31 = new File(var8);
				var32 = new File(var7);

				try {
					final File[] var34 = var31.listFiles();
					final File[] var17 = var34;

					for (final File var19 : var17) {
						final File var20 = new File(var32, var19.getName());
						final boolean var21 = var19.renameTo(var20);
						if (!var21)
							throw new IOException();
					}
				} catch (final Exception var28) {
					var28.printStackTrace();
				}

				var9 = true;
			}

			if (var9)
				Class109_Sub21_Sub15_Sub2.method892(new File(var7), (File) null);

			final File var22 = new File(var7);
			Class109_Sub21_Sub6.aFile1388 = var22;
			if (!Class109_Sub21_Sub6.aFile1388.exists())
				Class109_Sub21_Sub6.aFile1388.mkdirs();

			final File[] var30 = Class109_Sub21_Sub6.aFile1388.listFiles();
			if (null != var30) {
				final File[] var33 = var30;

				for (int var23 = 0; var23 < var33.length; ++var23) {
					final File var24 = var33[var23];
					if (!Class109_Sub21_Sub3.method674(var24, false)) {
						++var5;
						continue label240;
					}
				}
			}
			break;
		}

		Class38.method168(Class109_Sub21_Sub6.aFile1388);
		Class109_Sub8.method527();
		Class77.aClass130_617 = new Class130(new Class132(Class53.method258("main_file_cache.dat2"), "rw", 1048576000L),
				5200, 0);
		Class77.aClass130_618 = new Class130(new Class132(Class53.method258("main_file_cache.idx255"), "rw", 1048576L),
				6000, 0);
		Class77.aClass130Array619 = new Class130[Class85.anInt660];

		for (var5 = 0; var5 < Class85.anInt660; ++var5)
			Class77.aClass130Array619[var5] = new Class130(
					new Class132(Class53.method258("main_file_cache.idx" + var5), "rw", 1048576L), 6000, 0);

	}

	static String method544(final int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
