public class Class20 implements Interface3 {
	static int anInt188;
	static int anInt193;
	int anInt187 = 0;
	double aDouble191 = 1.0D;
	Class126 aClass126_185 = new Class126();
	int anInt189 = 128;
	Class104 aClass104_190;
	int anInt186;
	Class109_Sub2[] aClass109_Sub2Array192;

	static boolean method90(final int var0) {
		return (var0 == 57) || (var0 == 58) || (var0 == 1007) || (var0 == 25) || (var0 == 30);
	}

	@Override
	public int[] method10(final int var1, final int var2) {
		final Class109_Sub2 var3 = aClass109_Sub2Array192[var1];
		if (null != var3) {
			if (null != var3.anIntArray916) {
				aClass126_185.method451(var3);
				var3.aBool917 = true;
				return var3.anIntArray916;
			}

			final boolean var5 = var3.method501(aDouble191, anInt189, aClass104_190);
			if (var5) {
				if (anInt187 == 0) {
					final Class109_Sub2 var4 = (Class109_Sub2) aClass126_185.method454();
					var4.method502();
				} else
					--anInt187;

				aClass126_185.method451(var3);
				var3.aBool917 = true;
				return var3.anIntArray916;
			}
		}

		return null;
	}

	@Override
	public int method7(final int var1, final int var2) {
		return null != aClass109_Sub2Array192[var1] ? aClass109_Sub2Array192[var1].anInt909 : 0;
	}

	@Override
	public boolean method8(final int var1, final short var2) {
		return aClass109_Sub2Array192[var1].aBool910;
	}

	@Override
	public boolean method9(final int var1, final int var2) {
		return anInt189 == 64;
	}

	public void method91(final double var1) {
		aDouble191 = var1;
		method93();
	}

	public void method92(final int var1) {
		for (final Class109_Sub2 element : aClass109_Sub2Array192) {
			final Class109_Sub2 var3 = element;
			if ((null != var3) && (var3.anInt914 != 0) && var3.aBool917) {
				var3.method503(var1);
				var3.aBool917 = false;
			}
		}

	}

	public Class20(final Class104 var1, final Class104 var2, final int var3, final double var4, final int var6) {
		aClass104_190 = var2;
		anInt186 = var3;
		anInt187 = anInt186;
		aDouble191 = var4;
		anInt189 = var6;
		final int[] var7 = var1.method393(0);
		final int var10 = var7.length;
		aClass109_Sub2Array192 = new Class109_Sub2[var1.method401(0)];

		for (int var8 = 0; var8 < var10; ++var8) {
			final DataBuffer var9 = new DataBuffer(var1.method387(0, var7[var8]));
			aClass109_Sub2Array192[var7[var8]] = new Class109_Sub2(var9);
		}

	}

	public void method93() {
		for (final Class109_Sub2 element : aClass109_Sub2Array192)
			if (null != element)
				element.method502();

		aClass126_185 = new Class126();
		anInt187 = anInt186;
	}

	static int method94(final int var0, final int var1, final int var2) {
		final Class109_Sub12 var3 = (Class109_Sub12) Class109_Sub12.aClass116_1043.method429(var0);
		return null == var3 ? 0 : ((var1 >= 0) && (var1 < var3.anIntArray1041.length) ? var3.anIntArray1041[var1] : 0);
	}

	static final void method95(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6) {
		if (Class108.method412(var0))
			Class33.method153(Class109_Sub20.aClass109_Sub20ArrayArray1150[var0], -1, var1, var2, var3, var4, var5,
					var6);
	}

	static final void method96(final int var0, final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < client.anInt2173; ++var4)
			if (((client.anIntArray2222[var4] + client.anIntArray2241[var4]) > var0)
					&& (client.anIntArray2241[var4] < (var0 + var2))
					&& ((client.anIntArray2181[var4] + client.anIntArray2179[var4]) > var1)
					&& (client.anIntArray2179[var4] < (var3 + var1)))
				client.aBoolArray2002[var4] = true;

	}
}
