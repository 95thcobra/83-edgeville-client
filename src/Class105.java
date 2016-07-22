import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class105 implements Runnable {
	public static int anInt794 = 0;
	public static Class126 aClass126_793 = new Class126();
	public static Class126 aClass126_795 = new Class126();
	public static Object anObject796 = new Object();

	@Override
	public void run() {
		try {
			while (true) {
				Class126 var1 = aClass126_793;
				Class109_Sub17 var2;
				synchronized (var1) {
					var2 = (Class109_Sub17) aClass126_793.method458();
				}

				Object var14;
				if (var2 != null) {
					if (var2.anInt1101 == 0) {
						var2.aClass68_1099.method304((int) var2.aLong802, var2.aByteArray1100,
								var2.aByteArray1100.length);
						var1 = aClass126_793;
						synchronized (var1) {
							var2.method413();
						}
					} else if (var2.anInt1101 == 1) {
						var2.aByteArray1100 = var2.aClass68_1099.method303((int) var2.aLong802, (byte) -122);
						var1 = aClass126_793;
						synchronized (var1) {
							aClass126_795.method450(var2);
						}
					}

					var14 = anObject796;
					synchronized (var14) {
						if (anInt794 <= 1) {
							anInt794 = 0;
							anObject796.notifyAll();
							return;
						}

						anInt794 = 600;
					}
				} else {
					Class94.method356(100L);
					var14 = anObject796;
					synchronized (var14) {
						if (anInt794 <= 1) {
							anInt794 = 0;
							anObject796.notifyAll();
							return;
						}

						--anInt794;
					}
				}
			}
		} catch (final Exception var13) {
			Class47.method237((String) null, var13);
		}
	}

	public static Class109_Sub21_Sub14_Sub1 method410(final Class104 var0, final String var1, final String var2) {
		final int var3 = var0.method396(var1);
		final int var6 = var0.method397(var3, var2);
		Class109_Sub21_Sub14_Sub1 var5;
		if (!Class27.method121(var0, var3, var6))
			var5 = null;
		else {
			final Class109_Sub21_Sub14_Sub1 var4 = new Class109_Sub21_Sub14_Sub1();
			var4.anInt1712 = Canvas_Sub1.anInt1594;
			var4.anInt1716 = Class9.anInt96;
			var4.anInt1715 = Class9.anIntArray92[0];
			var4.anInt1717 = Class9.anIntArray93[0];
			var4.anInt1713 = Class106.anIntArray799[0];
			var4.anInt1714 = Class9.anIntArray94[0];
			var4.anIntArray1718 = Class35.anIntArray336;
			var4.aByteArray1711 = Class9.aByteArrayArray97[0];
			Class109_Sub21_Sub5.method696();
			var5 = var4;
		}

		return var5;
	}

	public static void method411(final DataBuffer var0) {
		final Class109_Sub23 var1 = new Class109_Sub23();
		var1.anInt1283 = var0.method564();
		var1.anInt1288 = var0.method568();
		var1.anIntArray1282 = new int[var1.anInt1283];
		var1.anIntArray1285 = new int[var1.anInt1283];
		var1.aFieldArray1286 = new Field[var1.anInt1283];
		var1.anIntArray1289 = new int[var1.anInt1283];
		var1.aMethodArray1287 = new Method[var1.anInt1283];
		var1.aByteArrayArrayArray1284 = new byte[var1.anInt1283][][];

		for (int var2 = 0; var2 < var1.anInt1283; ++var2)
			try {
				final int var3 = var0.method564();
				String var4;
				String var5;
				int var6;
				if ((var3 != 0) && (var3 != 1) && (var3 != 2)) {
					if ((var3 == 3) || (var3 == 4)) {
						var4 = var0.method602();
						var5 = var0.method602();
						var6 = var0.method564();
						final String[] var7 = new String[var6];

						for (int var8 = 0; var8 < var6; ++var8)
							var7[var8] = var0.method602();

						final String var9 = var0.method602();
						final byte[][] var10 = new byte[var6][];
						int var12;
						if (var3 == 3)
							for (int var11 = 0; var11 < var6; ++var11) {
								var12 = var0.method568();
								var10[var11] = new byte[var12];
								var0.method561(var10[var11], 0, var12);
							}

						var1.anIntArray1282[var2] = var3;
						final Class[] var13 = new Class[var6];

						for (var12 = 0; var12 < var6; ++var12)
							var13[var12] = Class83.method346(var7[var12]);

						final Class var14 = Class83.method346(var9);
						if (Class83.method346(var4).getClassLoader() == null)
							throw new SecurityException();

						final Method[] var15 = Class83.method346(var4).getDeclaredMethods();
						final Method[] var16 = var15;

						for (final Method var18 : var16) {
							if (var18.getName().equals(var5)) {
								final Class[] var19 = var18.getParameterTypes();
								if (var19.length == var13.length) {
									boolean var20 = true;

									for (int var21 = 0; var21 < var13.length; ++var21)
										if (var19[var21] != var13[var21]) {
											var20 = false;
											break;
										}

									if (var20 && (var14 == var18.getReturnType()))
										var1.aMethodArray1287[var2] = var18;
								}
							}
						}

						var1.aByteArrayArrayArray1284[var2] = var10;
					}
				} else {
					var4 = var0.method602();
					var5 = var0.method602();
					var6 = 0;
					if (var3 == 1)
						var6 = var0.method568();

					var1.anIntArray1282[var2] = var3;
					var1.anIntArray1289[var2] = var6;
					if (Class83.method346(var4).getClassLoader() == null)
						throw new SecurityException();

					var1.aFieldArray1286[var2] = Class83.method346(var4).getDeclaredField(var5);
				}
			} catch (final ClassNotFoundException var23) {
				var1.anIntArray1285[var2] = -1;
			} catch (final SecurityException var24) {
				var1.anIntArray1285[var2] = -2;
			} catch (final NullPointerException var25) {
				var1.anIntArray1285[var2] = -3;
			} catch (final Exception var26) {
				var1.anIntArray1285[var2] = -4;
			} catch (final Throwable var27) {
				var1.anIntArray1285[var2] = -5;
			}

		Class123.aClass128_849.method462(var1);
	}
}
