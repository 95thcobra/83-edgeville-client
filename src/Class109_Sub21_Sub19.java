public class Class109_Sub21_Sub19 extends Class109_Sub21 {
	static Class44 aClass44_1635;
	public int anInt1633;
	public int anInt1631;
	public int[] anIntArray1632;
	public int[] anIntArray1636;
	int anInt1634;

	public boolean method887(final int var1, final int var2) {
		if ((var2 >= 0) && (var2 < anIntArray1636.length)) {
			final int var3 = anIntArray1636[var2];
			if ((var1 >= var3) && (var1 <= (var3 + anIntArray1632[var2])))
				return true;
		}

		return false;
	}

	Class109_Sub21_Sub19(final int var1, final int var2, final int[] var3, final int[] var4, final int var5) {
		anInt1633 = var1;
		anInt1631 = var2;
		anIntArray1632 = var3;
		anIntArray1636 = var4;
		anInt1634 = var5;
	}

	static final void method888(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7, final int var8) {
		Class109_Sub11 var9 = null;

		for (Class109_Sub11 var10 = (Class109_Sub11) client.aClass126_2102
				.method458(); null != var10; var10 = (Class109_Sub11) client.aClass126_2102.method449())
			if ((var10.anInt1038 == var0) && (var1 == var10.anInt1028) && (var10.anInt1029 == var2)
					&& (var3 == var10.anInt1027)) {
				var9 = var10;
				break;
			}

		if (null == var9) {
			var9 = new Class109_Sub11();
			var9.anInt1038 = var0;
			var9.anInt1027 = var3;
			var9.anInt1028 = var1;
			var9.anInt1029 = var2;
			Class33.method152(var9);
			client.aClass126_2102.method450(var9);
		}

		var9.anInt1032 = var4;
		var9.anInt1026 = var5;
		var9.anInt1037 = var6;
		var9.anInt1034 = var7;
		var9.anInt1035 = var8;
	}
}
