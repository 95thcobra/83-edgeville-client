public abstract class Class109_Sub21_Sub15 extends Class109_Sub21 {
	protected static int anInt1574;
	static int anInt1575;
	public int anInt1576 = 1000;

	protected Class109_Sub21_Sub15_Sub4 method827(final byte var1) {
		return null;
	}

	void method828(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9) {
		final Class109_Sub21_Sub15_Sub4 var10 = method827((byte) 65);
		if (null != var10) {
			anInt1576 = var10.anInt1576;
			var10.method828(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	public static synchronized long method829(final int var0) {
		final long var1 = System.currentTimeMillis();
		if (var1 < Class56.aLong542)
			Class56.aLong545 += Class56.aLong542 - var1;

		Class56.aLong542 = var1;
		return Class56.aLong545 + var1;
	}

	static void method830(final byte var0) {
		if (Class5.aBool72) {
			Class5.aClass109_Sub21_Sub14_Sub1_59 = null;
			Class5.aClass109_Sub21_Sub14_Sub1_49 = null;
			Class78.aClass109_Sub21_Sub14_Sub1Array626 = null;
			Class49.aClass109_Sub21_Sub14_Sub2_511 = null;
			Class8_Sub2.aClass109_Sub21_Sub14_Sub2_904 = null;
			Class5.aClass109_Sub21_Sub14_Sub1_52 = null;
			Class5.aClass109_Sub21_Sub14_Sub1Array53 = null;
			Class5.aClass109_Sub21_Sub14_Sub1_54 = null;
			Class33.aClass109_Sub21_Sub14_Sub1_324 = null;
			Class3.aClass109_Sub21_Sub14_Sub2Array27 = null;
			Class31.aClass109_Sub21_Sub14_Sub1Array312 = null;
			Class21.aClass109_Sub21_Sub14_Sub1Array197 = null;
			Class5.aClass109_Sub21_Sub14_Sub1Array51 = null;
			Class91.aClass109_Sub21_Sub14_Sub1_690 = null;
			Class68.anIntArray587 = null;
			Class109_Sub21_Sub15_Sub1.anIntArray1639 = null;
			IsaacCipher.anIntArray560 = null;
			Class109_Sub13.anIntArray1047 = null;
			Class3.anIntArray25 = null;
			Class109_Sub8.anIntArray995 = null;
			Class109_Sub10.anIntArray1024 = null;
			Class29.anIntArray268 = null;
			Class93.anInt703 = 1;
			Class27.aClass104_260 = null;
			Class75.anInt613 = -1;
			Class109_Sub21_Sub15_Sub3_Sub1.anInt1926 = -1;
			Class79.anInt628 = 0;
			Class25.aBool224 = false;
			Class54.anInt538 = 2;
			Class109_Sub21_Sub15_Sub2.method893(true);
			Class5.aBool72 = false;
		}
	}

	static void method831(final int var0, final String var1) {
		boolean var2 = false;

		for (int var3 = 0; var3 < client.anInt2087; ++var3) {
			final Class109_Sub21_Sub15_Sub3_Sub2 var4 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[client.anIntArray2134[var3]];
			if ((var4 != null) && (var4.aString1931 != null) && var4.aString1931.equalsIgnoreCase(var1)) {
				if (var0 == 1) {
					client.secureBuffer.method840(250);
					client.secureBuffer.method583(0);
					client.secureBuffer.method590(client.anIntArray2134[var3]);
				} else if (var0 == 4) {
					client.secureBuffer.method840(111);
					client.secureBuffer.method589(client.anIntArray2134[var3]);
					client.secureBuffer.method582(0);
				} else if (var0 == 6) {
					client.secureBuffer.method840(28);
					client.secureBuffer.method583(0);
					client.secureBuffer.method589(client.anIntArray2134[var3]);
				} else if (var0 == 7) {
					client.secureBuffer.method840(137);
					client.secureBuffer.writeShort(client.anIntArray2134[var3]);
					client.secureBuffer.method583(0);
				}

				var2 = true;
				break;
			}
		}

		if (!var2)
			Applet_Sub1.method1053(4, "", "Unable to find " + var1);

	}

	static Class49[] method832(final int var0) {
		return new Class49[] { Class49.aClass49_512, Class49.aClass49_507, Class49.aClass49_508 };
	}
}
