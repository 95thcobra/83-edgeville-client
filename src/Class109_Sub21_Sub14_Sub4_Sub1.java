public final class Class109_Sub21_Sub14_Sub4_Sub1 extends Class109_Sub21_Sub14_Sub4 {
	@Override
	final void method1020(final byte[] var1, int var2, int var3, int var4, int var5, final int var6) {
		int var7 = var2 + (var3 * anInt1553);
		int var11 = anInt1553 - var4;
		int var8 = 0;
		int var10 = 0;
		int var9;
		if (var3 < anInt1555) {
			var9 = anInt1555 - var3;
			var5 -= var9;
			var3 = anInt1555;
			var10 += var9 * var4;
			var7 += var9 * anInt1553;
		}

		if ((var3 + var5) > anInt1556)
			var5 -= (var3 + var5) - anInt1556;

		if (var2 < anInt1557) {
			var9 = anInt1557 - var2;
			var4 -= var9;
			var2 = anInt1557;
			var10 += var9;
			var7 += var9;
			var8 += var9;
			var11 += var9;
		}

		if ((var2 + var4) > anInt1552) {
			var9 = (var2 + var4) - anInt1552;
			var4 -= var9;
			var8 += var9;
			var11 += var9;
		}

		if ((var4 > 0) && (var5 > 0))
			method1028(anIntArray1558, var1, var6, var10, var7, var4, var5, var11, var8);
	}

	@Override
	final void method1030(final byte[] var1, int var2, int var3, int var4, int var5, final int var6, final int var7) {
		int var8 = var2 + (var3 * anInt1553);
		int var12 = anInt1553 - var4;
		int var11 = 0;
		int var10 = 0;
		int var9;
		if (var3 < anInt1555) {
			var9 = anInt1555 - var3;
			var5 -= var9;
			var3 = anInt1555;
			var10 += var9 * var4;
			var8 += var9 * anInt1553;
		}

		if ((var3 + var5) > anInt1556)
			var5 -= (var3 + var5) - anInt1556;

		if (var2 < anInt1557) {
			var9 = anInt1557 - var2;
			var4 -= var9;
			var2 = anInt1557;
			var10 += var9;
			var8 += var9;
			var11 += var9;
			var12 += var9;
		}

		if ((var2 + var4) > anInt1552) {
			var9 = (var2 + var4) - anInt1552;
			var4 -= var9;
			var11 += var9;
			var12 += var9;
		}

		if ((var4 > 0) && (var5 > 0))
			method1026(anIntArray1558, var1, var6, var10, var8, var4, var5, var12, var11, var7);
	}

	public Class109_Sub21_Sub14_Sub4_Sub1(final byte[] var1) {
		super(var1);
	}

	public Class109_Sub21_Sub14_Sub4_Sub1(final byte[] var1, final int[] var2, final int[] var3, final int[] var4,
			final int[] var5, final int[] var6, final byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}
}
