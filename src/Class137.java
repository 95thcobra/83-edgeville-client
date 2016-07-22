public abstract class Class137 {
	static final void method483(final boolean var0) {
		client.anInt2028 = 0;
		client.anInt2089 = 0;
		Class109_Sub21_Sub17.method839();
		Class57_Sub2.method625(var0);
		Class24.method107();

		int var1;
		for (var1 = 0; var1 < client.anInt2028; ++var1) {
			final int var2 = client.anIntArray2095[var1];
			if (client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var2].anInt1700 != client.anInt1979) {
				client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var2].aClass109_Sub21_Sub13_1925 = null;
				client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var2] = null;
			}
		}

		if (client.gameBuffer.position != client.anInt2012)
			throw new RuntimeException(client.gameBuffer.position + "," + client.anInt2012);
		else
			for (var1 = 0; var1 < client.anInt2007; ++var1)
				if (client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[client.anIntArray2175[var1]] == null)
					throw new RuntimeException(var1 + "," + client.anInt2007);
	}
}
