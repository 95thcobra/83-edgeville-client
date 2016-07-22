import java.awt.Component;

public class Class4 {
	int anInt35;
	static int anInt43;
	static Class82 aClass82_47;
	Class109_Sub4 aClass109_Sub4_32;
	boolean aBool42 = true;
	long aLong37 = 0L;
	int anInt46 = 0;
	long aLong44 = Class109_Sub21_Sub15.method829(845666397);
	int anInt33 = 32;
	int anInt38 = 0;
	int anInt39 = 0;
	int anInt40 = 0;
	long aLong41 = 0L;
	Class109_Sub4[] aClass109_Sub4Array45 = new Class109_Sub4[8];
	Class109_Sub4[] aClass109_Sub4Array29 = new Class109_Sub4[8];
	int[] anIntArray31;
	static Class6 aClass6_36;
	int anInt34;
	int anInt30;

	public final synchronized void method21(final Class109_Sub4 var1) {
		aClass109_Sub4_32 = var1;
	}

	void method22() {
	}

	public final synchronized void method23() {
		aBool42 = true;

		try {
			method30();
		} catch (final Exception var2) {
			method22();
			aLong37 = Class109_Sub21_Sub15.method829(475457325) + 2000L;
		}

	}

	final void method24(final int var1) {
		anInt46 -= var1;
		if (anInt46 < 0)
			anInt46 = 0;

		if (aClass109_Sub4_32 != null)
			aClass109_Sub4_32.method510(var1);

	}

	final void method25(final int[] var1, final int var2) {
		int var3 = var2;
		if (Class31.aBool308)
			var3 = var2 << 1;

		Class64.method289(var1, 0, var3);
		anInt46 -= var2;
		if ((null != aClass109_Sub4_32) && (anInt46 <= 0)) {
			anInt46 += Class122.anInt848 >> 4;
			Class109_Sub21_Sub5.method697(aClass109_Sub4_32);
			method26(aClass109_Sub4_32, aClass109_Sub4_32.method507());
			int var13 = 0;
			int var4 = 255;

			Class109_Sub4 var8;
			int var11;
			label142: for (var11 = 7; var4 != 0; --var11) {
				int var5;
				int var12;
				if (var11 < 0) {
					var5 = var11 & 3;
					var12 = -(var11 >> 2);
				} else {
					var5 = var11;
					var12 = 0;
				}

				for (int var14 = (var4 >>> var5) & 286331153; var14 != 0; var14 >>>= 4) {
					if ((var14 & 1) != 0) {
						var4 &= ~(1 << var5);
						var8 = null;
						Class109_Sub4 var7 = aClass109_Sub4Array45[var5];

						label136: while (true)
							while (true) {
								if (null == var7)
									break label136;

								final Class109_Sub3 var16 = var7.aClass109_Sub3_926;
								if ((var16 != null) && (var16.anInt919 > var12)) {
									var4 |= 1 << var5;
									var8 = var7;
									var7 = var7.aClass109_Sub4_925;
								} else {
									var7.aBool927 = true;
									final int var10 = var7.method506();
									var13 += var10;
									if (var16 != null)
										var16.anInt919 += var10;

									if (var13 >= anInt33)
										break label142;

									Class109_Sub4 var15 = var7.method509();
									if (null != var15)
										for (final int var17 = var7.anInt924; var15 != null; var15 = var7.method505())
											method26(var15, (var17 * var15.method507()) >> 8);

									final Class109_Sub4 var9 = var7.aClass109_Sub4_925;
									var7.aClass109_Sub4_925 = null;
									if (var8 == null)
										aClass109_Sub4Array45[var5] = var9;
									else
										var8.aClass109_Sub4_925 = var9;

									if (var9 == null)
										aClass109_Sub4Array29[var5] = var8;

									var7 = var9;
								}
							}
					}

					var5 += 4;
					++var12;
				}
			}

			for (var11 = 0; var11 < 8; ++var11) {
				Class109_Sub4 var6 = aClass109_Sub4Array45[var11];
				final Class109_Sub4[] var18 = aClass109_Sub4Array45;
				aClass109_Sub4Array29[var11] = null;

				for (var18[var11] = null; null != var6; var6 = var8) {
					var8 = var6.aClass109_Sub4_925;
					var6.aClass109_Sub4_925 = null;
				}
			}
		}

		if (anInt46 < 0)
			anInt46 = 0;

		if (aClass109_Sub4_32 != null)
			aClass109_Sub4_32.method508(var1, 0, var2);

		aLong44 = Class109_Sub21_Sub15.method829(-339882833);
	}

	final void method26(final Class109_Sub4 var1, final int var2) {
		final int var3 = var2 >> 5;
		final Class109_Sub4 var4 = aClass109_Sub4Array29[var3];
		if (var4 == null)
			aClass109_Sub4Array45[var3] = var1;
		else
			var4.aClass109_Sub4_925 = var1;

		aClass109_Sub4Array29[var3] = var1;
		var1.anInt924 = var2;
	}

	void method27(final int var1) throws Exception {
	}

	int method28() throws Exception {
		return anInt34;
	}

	public final void method29() {
		aBool42 = true;
	}

	void method30() throws Exception {
	}

	void method31() throws Exception {
	}

	public final synchronized void method32() {
		if (aClass6_36 != null) {
			boolean var2 = true;

			for (int var1 = 0; var1 < 2; ++var1) {
				if (this == aClass6_36.aClass4Array78[var1])
					aClass6_36.aClass4Array78[var1] = null;

				if (null != aClass6_36.aClass4Array78[var1])
					var2 = false;
			}

			if (var2) {
				aClass6_36.aBool77 = true;

				while (aClass6_36.aBool80)
					Class94.method356(50L);

				aClass6_36 = null;
			}
		}

		method22();
		anIntArray31 = null;
	}

	static final void method33() {
		if (client.anInt2076 == 1)
			client.aClass109_Sub21_Sub14_Sub2Array2098[client.anInt2137 / 100].method919(client.anInt2073 - 8,
					client.anInt2074 - 8);

		if (client.anInt2076 == 2)
			client.aClass109_Sub21_Sub14_Sub2Array2098[4 + (client.anInt2137 / 100)].method919(client.anInt2073 - 8,
					client.anInt2074 - 8);

		Class25.method112();
	}

	public final synchronized void method34() {
		if (anIntArray31 != null) {
			long var1 = Class109_Sub21_Sub15.method829(2084754372);

			try {
				if (aLong37 != 0L) {
					if (var1 < aLong37)
						return;

					method27(anInt34);
					aLong37 = 0L;
					aBool42 = true;
				}

				int var3 = method28();
				if ((anInt40 - var3) > anInt38)
					anInt38 = anInt40 - var3;

				int var4 = anInt30 + anInt35;
				if ((var4 + 256) > 16384)
					var4 = 16128;

				if ((256 + var4) > anInt34) {
					anInt34 += 1024;
					if (anInt34 > 16384)
						anInt34 = 16384;

					method22();
					method27(anInt34);
					var3 = 0;
					aBool42 = true;
					if ((var4 + 256) > anInt34) {
						var4 = anInt34 - 256;
						anInt30 = var4 - anInt35;
					}
				}

				while (var3 < var4) {
					method25(anIntArray31, 256);
					method31();
					var3 += 256;
				}

				if (var1 > aLong41) {
					if (!aBool42) {
						if ((anInt38 == 0) && (anInt39 == 0)) {
							method22();
							aLong37 = var1 + 2000L;
							return;
						}

						anInt30 = Math.min(anInt39, anInt38);
						anInt39 = anInt38;
					} else
						aBool42 = false;

					anInt38 = 0;
					aLong41 = var1 + 2000L;
				}

				anInt40 = var3;
			} catch (final Exception var7) {
				method22();
				aLong37 = 2000L + var1;
			}

			try {
				if (var1 > (aLong44 + 500000L))
					var1 = aLong44;

				while (var1 > (aLong44 + 5000L)) {
					method24(256);
					aLong44 += 256000 / Class122.anInt848;
				}
			} catch (final Exception var6) {
				aLong44 = var1;
			}

		}
	}

	void method35(final Component var1) throws Exception {
	}

	public static void method36(final Class104 var0, final Class104 var1, final boolean var2) {
		Class109_Sub21_Sub10.aClass104_1473 = var0;
		Class109_Sub21_Sub10.aClass104_1425 = var1;
		Class109_Sub21_Sub10.aBool1456 = var2;
	}
}
