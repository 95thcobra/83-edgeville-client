import java.io.File;
import java.io.RandomAccessFile;

public final class Class53 {
	static Class109_Sub7[] aClass109_Sub7Array532;
	static int anInt533;
	static int[][] anIntArrayArray534;

	static void method257(final Class109_Sub20 var0) {
		final Class109_Sub20 var1 = var0.anInt1166 == -1 ? null : Class83.method345(var0.anInt1166);
		int var2;
		int var3;
		if (null == var1) {
			var2 = LoginEncoder.anInt524;
			var3 = Class109_Sub21_Sub15_Sub5.anInt1815;
		} else {
			var2 = var1.anInt1162;
			var3 = var1.anInt1163;
		}

		Class110_Sub1.method494(var0, var2, var3, false);
		Class85.method349(var0, var2, var3);
	}

	static File method258(final String var0) {
		if (!Class54.aBool537)
			throw new RuntimeException("");
		else {
			final File var1 = (File) Class54.aHashtable540.get(var0);
			if (null != var1)
				return var1;
			else {
				final File var2 = new File(Class54.aFile536, var0);
				RandomAccessFile var3 = null;

				try {
					final File var4 = new File(var2.getParent());
					if (!var4.exists())
						throw new RuntimeException("");
					else {
						var3 = new RandomAccessFile(var2, "rw");
						final int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						Class54.aHashtable540.put(var0, var2);
						return var2;
					}
				} catch (final Exception var8) {
					try {
						if (null != var3) {
							var3.close();
							var3 = null;
						}
					} catch (final Exception var7) {
						;
					}

					throw new RuntimeException();
				}
			}
		}
	}

	public static final boolean method259() {
		final Class63 var0 = Class63.aClass63_573;
		synchronized (var0) {
			if (Class63.anInt571 == Class63.anInt563)
				return false;
			else {
				Class3.anInt23 = Class63.anIntArray570[Class63.anInt571];
				Class66.aChar578 = Class63.aCharArray572[Class63.anInt571];
				Class63.anInt571 = (Class63.anInt571 + 1) & 127;
				return true;
			}
		}
	}

	static final void method260(final Class109_Sub20 var0, final int var1, final int var2) {
		if (var0.anInt1263 == 1)
			Class65.method291(var0.aString1262, "", 24, 0, 0, var0.anInt1148);

		String var7;
		if ((var0.anInt1263 == 2) && !client.aBool2171) {
			var7 = Class6.method38(var0);
			if (null != var7)
				Class65.method291(var7, Class109_Sub11.method544('\uff00') + var0.aString1261, 25, 0, -1,
						var0.anInt1148);
		}

		if (var0.anInt1263 == 3)
			Class65.method291("Close", "", 26, 0, 0, var0.anInt1148);

		if (var0.anInt1263 == 4)
			Class65.method291(var0.aString1262, "", 28, 0, 0, var0.anInt1148);

		if (var0.anInt1263 == 5)
			Class65.method291(var0.aString1262, "", 29, 0, 0, var0.anInt1148);

		if ((var0.anInt1263 == 6) && (client.aClass109_Sub20_2044 == null))
			Class65.method291(var0.aString1262, "", 30, 0, -1, var0.anInt1148);

		int var6;
		int var9;
		if (var0.anInt1229 == 2) {
			var6 = 0;

			for (var9 = 0; var9 < var0.anInt1163; ++var9)
				for (int var10 = 0; var10 < var0.anInt1162; ++var10) {
					int var11 = (var0.anInt1234 + 32) * var10;
					int var12 = var9 * (var0.anInt1212 + 32);
					if (var6 < 20) {
						var11 += var0.anIntArray1213[var6];
						var12 += var0.anIntArray1214[var6];
					}

					if ((var1 >= var11) && (var2 >= var12) && (var1 < (var11 + 32)) && (var2 < (var12 + 32))) {
						client.anInt2225 = var6;
						Class100.aClass109_Sub20_734 = var0;
						if (var0.anIntArray1149[var6] > 0) {
							final Class109_Sub21_Sub5 var5 = Class109_Sub23.method660(var0.anIntArray1149[var6] - 1);
							if ((client.anInt2196 == 1) && Class9.method55(Class52.method256(var0))) {
								if ((var0.anInt1148 != Class77.anInt624) || (var6 != Class8_Sub2.anInt905))
									Class65.method291(
											"Use", client.aString2122 + " " + "->" + " "
													+ Class109_Sub11.method544(16748608) + var5.aString1372,
											31, var5.anInt1344, var6, var0.anInt1148);
							} else if (client.aBool2171 && Class9.method55(Class52.method256(var0))) {
								if ((Canvas_Sub1.anInt1596 & 16) == 16)
									Class65.method291(
											client.aString2126, client.aString2127 + " " + "->" + " "
													+ Class109_Sub11.method544(16748608) + var5.aString1372,
											32, var5.anInt1344, var6, var0.anInt1148);
							} else {
								String[] var3 = var5.aStringArray1361;
								if (client.aBool2139)
									var3 = Class80.method334(var3);

								int var4;
								byte var8;
								if (Class9.method55(Class52.method256(var0)))
									for (var4 = 4; var4 >= 3; --var4)
										if ((null != var3) && (var3[var4] != null)) {
											if (var4 == 3)
												var8 = 36;
											else
												var8 = 37;

											Class65.method291(var3[var4],
													Class109_Sub11.method544(16748608) + var5.aString1372, var8,
													var5.anInt1344, var6, var0.anInt1148);
										} else if (var4 == 4)
											Class65.method291("Drop",
													Class109_Sub11.method544(16748608) + var5.aString1372, 37,
													var5.anInt1344, var6, var0.anInt1148);

								if (Class55.method264(Class52.method256(var0)))
									Class65.method291("Use", Class109_Sub11.method544(16748608) + var5.aString1372, 38,
											var5.anInt1344, var6, var0.anInt1148);

								if (Class9.method55(Class52.method256(var0)) && (var3 != null))
									for (var4 = 2; var4 >= 0; --var4)
										if (null != var3[var4]) {
											var8 = 0;
											if (var4 == 0)
												var8 = 33;

											if (var4 == 1)
												var8 = 34;

											if (var4 == 2)
												var8 = 35;

											Class65.method291(var3[var4],
													Class109_Sub11.method544(16748608) + var5.aString1372, var8,
													var5.anInt1344, var6, var0.anInt1148);
										}

								var3 = var0.aStringArray1155;
								if (client.aBool2139)
									var3 = Class80.method334(var3);

								if (null != var3)
									for (var4 = 4; var4 >= 0; --var4)
										if (null != var3[var4]) {
											var8 = 0;
											if (var4 == 0)
												var8 = 39;

											if (var4 == 1)
												var8 = 40;

											if (var4 == 2)
												var8 = 41;

											if (var4 == 3)
												var8 = 42;

											if (var4 == 4)
												var8 = 43;

											Class65.method291(var3[var4],
													Class109_Sub11.method544(16748608) + var5.aString1372, var8,
													var5.anInt1344, var6, var0.anInt1148);
										}

								Class65.method291("Examine", Class109_Sub11.method544(16748608) + var5.aString1372,
										1005, var5.anInt1344, var6, var0.anInt1148);
							}
						}
					}

					++var6;
				}
		}

		if (var0.aBool1146)
			if (client.aBool2171) {
				var9 = Class52.method256(var0);
				final boolean var15 = ((var9 >> 21) & 1) != 0;
				if (var15 && ((Canvas_Sub1.anInt1596 & 32) == 32))
					Class65.method291(client.aString2126, client.aString2127 + " " + "->" + " " + var0.aString1218, 58,
							0, var0.anInt1147, var0.anInt1148);
			} else {
				for (var6 = 9; var6 >= 5; --var6) {
					final String var13 = Class109_Sub11.method542(var0, var6);
					if (null != var13)
						Class65.method291(var13, var0.aString1218, 1007, 1 + var6, var0.anInt1147, var0.anInt1148);
				}

				var7 = Class6.method38(var0);
				if (var7 != null)
					Class65.method291(var7, var0.aString1218, 25, 0, var0.anInt1147, var0.anInt1148);

				for (var9 = 4; var9 >= 0; --var9) {
					final String var14 = Class109_Sub11.method542(var0, var9);
					if (var14 != null)
						Class65.method291(var14, var0.aString1218, 57, 1 + var9, var0.anInt1147, var0.anInt1148);
				}

				if (Class109_Sub21_Sub18.method850(Class52.method256(var0), (byte) 28))
					Class65.method291("Continue", "", 30, 0, var0.anInt1147, var0.anInt1148);
			}

	}
}
