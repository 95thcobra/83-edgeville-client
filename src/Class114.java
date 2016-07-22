public class Class114 {
	String aString825;
	String aString827;
	public int anInt826;
	public long aLong824;
	public Class134 aClass134_828;

	public String method424() {
		return aString827;
	}

	static Class104_Sub1 method425(final int var0, final boolean var1, final boolean var2, final boolean var3) {
		Class68 var4 = null;
		if (Class77.aClass130_617 != null)
			var4 = new Class68(var0, Class77.aClass130_617, Class77.aClass130Array619[var0], 1000000);

		return new Class104_Sub1(var4, Class109_Sub21_Sub3.aClass68_1320, var0, var1, var2, var3);
	}

	Class114(final DataBuffer var1, final byte var2, final int var3) {
		aString825 = var1.method602();
		aString827 = var1.method602();
		anInt826 = var1.readShort();
		aLong824 = var1.method613();
		final int var4 = var1.readInt();
		final int var5 = var1.readInt();
		aClass134_828 = new Class134();
		aClass134_828.method478(2);
		aClass134_828.method479(var2);
		aClass134_828.anInt882 = var4;
		aClass134_828.anInt880 = var5;
		aClass134_828.anInt884 = 0;
		aClass134_828.anInt883 = 0;
		aClass134_828.anInt885 = var3;
	}

	public String method426() {
		return aString825;
	}
}
