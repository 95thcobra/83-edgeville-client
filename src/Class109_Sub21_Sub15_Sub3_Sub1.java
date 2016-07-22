public final class Class109_Sub21_Sub15_Sub3_Sub1 extends Class109_Sub21_Sub15_Sub3 {
	static int[] anIntArray1923;
	static Class136 aClass136_1924;
	Class109_Sub21_Sub13 aClass109_Sub21_Sub13_1925;
	public static int anInt1926;
	static int anInt1927;

	@Override
	protected final Class109_Sub21_Sub15_Sub4 method827(final byte var1) {
		if (null == aClass109_Sub21_Sub13_1925)
			return null;
		else {
			final Class109_Sub21_Sub7 var2 = (anInt1683 != -1) && (anInt1689 == 0)
					? Class109_Sub21_Sub18.method849(anInt1683, 692771099) : null;
			final Class109_Sub21_Sub7 var3 = (anInt1663 == -1) || ((anInt1657 == anInt1663) && (var2 != null)) ? null
					: Class109_Sub21_Sub18.method849(anInt1663, -584294078);
			Class109_Sub21_Sub15_Sub4 var4 = aClass109_Sub21_Sub13_1925.method761(var2, anInt1684, var3, anInt1681);
			if (null == var4)
				return null;
			else {
				var4.method937();
				anInt1652 = var4.anInt1576;
				if ((anInt1688 != -1) && (anInt1676 != -1)) {
					final Class109_Sub21_Sub15_Sub4 var5 = Class35.method154(anInt1688).method748(anInt1676);
					if (var5 != null) {
						var5.method935(0, -anInt1692, 0);
						final Class109_Sub21_Sub15_Sub4[] var6 = new Class109_Sub21_Sub15_Sub4[] { var4, var5 };
						var4 = new Class109_Sub21_Sub15_Sub4(var6, 2);
					}
				}

				if (aClass109_Sub21_Sub13_1925.anInt1514 == 1)
					var4.aBool1754 = true;

				return var4;
			}
		}
	}

	@Override
	final boolean method897(final int var1) {
		return aClass109_Sub21_Sub13_1925 != null;
	}

	static final void method1035(final int var0, final int var1) {
		final Class126 var2 = client.aClass126ArrayArrayArray2121[Class77.anInt616][var0][var1];
		if (null == var2)
			Class2.aClass42_17.method221(Class77.anInt616, var0, var1);
		else {
			long var5 = -99999999L;
			Class109_Sub21_Sub15_Sub1 var8 = null;

			Class109_Sub21_Sub15_Sub1 var7;
			for (var7 = (Class109_Sub21_Sub15_Sub1) var2
					.method458(); var7 != null; var7 = (Class109_Sub21_Sub15_Sub1) var2.method449()) {
				final Class109_Sub21_Sub5 var9 = Class109_Sub23.method660(var7.anInt1638);
				long var3 = var9.anInt1358;
				if (var9.anInt1378 == 1)
					var3 *= 1 + var7.anInt1637;

				if (var3 > var5) {
					var5 = var3;
					var8 = var7;
				}
			}

			if (null == var8)
				Class2.aClass42_17.method221(Class77.anInt616, var0, var1);
			else {
				var2.method451(var8);
				Class109_Sub21_Sub15_Sub1 var12 = null;
				Class109_Sub21_Sub15_Sub1 var10 = null;

				for (var7 = (Class109_Sub21_Sub15_Sub1) var2
						.method458(); var7 != null; var7 = (Class109_Sub21_Sub15_Sub1) var2.method449())
					if (var7.anInt1638 != var8.anInt1638) {
						if (var12 == null)
							var12 = var7;

						if ((var12.anInt1638 != var7.anInt1638) && (null == var10))
							var10 = var7;
					}

				final int var11 = (var1 << 7) + var0 + 1610612736;
				Class2.aClass42_17.method178(Class77.anInt616, var0, var1,
						Class41.method174((128 * var0) + 64, (128 * var1) + 64, Class77.anInt616), var8, var11, var12,
						var10);
			}
		}
	}

	public static void method1036() {
		Class109_Sub21_Sub5.aClass120_1343.method439();
	}
}
