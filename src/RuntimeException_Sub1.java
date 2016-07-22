import java.applet.Applet;

public class RuntimeException_Sub1 extends RuntimeException {
	/**
	 *
	 */
	private static final long serialVersionUID = 8418657632689640462L;
	static Applet anApplet1895;
	Throwable aThrowable1896;
	public static String aString1897;
	String aString1898;
	static int anInt1899;
	static Class90 aClass90_1900;

	static final int method1007(final int var0, final int var1, final int var2) {
		final int var3 = var0 / var2;
		final int var6 = var0 & (var2 - 1);
		final int var8 = var1 / var2;
		final int var9 = var1 & (var2 - 1);
		final int var10 = Class26.method116(var3, var8);
		final int var11 = Class26.method116(1 + var3, var8);
		final int var4 = Class26.method116(var3, 1 + var8);
		final int var5 = Class26.method116(1 + var3, 1 + var8);
		final int var12 = Class2.method18(var10, var11, var6, var2);
		final int var7 = Class2.method18(var4, var5, var6, var2);
		return Class2.method18(var12, var7, var9, var2);
	}
}
