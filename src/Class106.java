public class Class106 {
	public static int[] anIntArray799;
	public static int[] anIntArray800 = new int[32];
	public static int[] anIntArray797;
	public static int[] anIntArray798;

	static {
		int var1 = 2;

		for (int var0 = 0; var0 < 32; ++var0) {
			anIntArray800[var0] = var1 - 1;
			var1 += var1;
		}

		anIntArray797 = new int[2000];
		anIntArray798 = new int[2000];
	}
}
