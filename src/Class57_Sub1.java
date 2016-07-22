public class Class57_Sub1 extends Class57 {
	long aLong1057 = System.nanoTime();

	@Override
	public void method269(final int var1) {
		aLong1057 = System.nanoTime();
	}

	@Override
	int method270(final int var1, final int var2, final byte var3) {
		final long var4 = 1000000L * var2;
		long var6 = aLong1057 - System.nanoTime();
		if (var6 < var4)
			var6 = var4;

		Class94.method356(var6 / 1000000L);
		final long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; (var10 < 10) && ((var10 < 1) || (aLong1057 < var8)); aLong1057 += var1 * 1000000L)
			++var10;

		if (aLong1057 < var8)
			aLong1057 = var8;

		return var10;
	}
}
