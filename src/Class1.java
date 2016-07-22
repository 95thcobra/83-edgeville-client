import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Class1 {
	static Class104_Sub1 aClass104_Sub1_1;
	static int[] anIntArray10;
	static int[] anIntArray11 = new int[5];
	static int[][] anIntArrayArray3 = new int[5][5000];
	static int[] anIntArray4 = new int[1000];
	static String[] aStringArray5 = new String[1000];
	static int anInt6 = 0;
	static Class34[] aClass34Array7 = new Class34[50];
	static Calendar aCalendar8 = Calendar.getInstance();
	static String[] aStringArray9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
			"Nov", "Dec" };
	static int anInt2 = 0;

	public static Class132 method12(final String var0, final String var1, final boolean var2) {
		final File var3 = new File(Class109_Sub21_Sub6.aFile1388, "preferences" + var0 + ".dat");
		if (var3.exists())
			try {
				final Class132 var10 = new Class132(var3, "rw", 10000L);
				return var10;
			} catch (final IOException var9) {
				;
			}

		String var4 = "";
		if (Class56.anInt544 == 33)
			var4 = "_rc";
		else if (Class56.anInt544 == 34)
			var4 = "_wip";

		final File var5 = new File(Class77.aString622, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		Class132 var6;
		if (!var2 && var5.exists())
			try {
				var6 = new Class132(var5, "rw", 10000L);
				return var6;
			} catch (final IOException var8) {
				;
			}

		try {
			var6 = new Class132(var3, "rw", 10000L);
			return var6;
		} catch (final IOException var7) {
			throw new RuntimeException();
		}
	}

	static final boolean method13(final Class109_Sub20 var0) {
		if (null == var0.anIntArray1258)
			return false;
		else {
			for (int var1 = 0; var1 < var0.anIntArray1258.length; ++var1) {
				final int var2 = Class33.method143(var0, var1);
				final int var3 = var0.anIntArray1259[var1];
				if (var0.anIntArray1258[var1] == 2) {
					if (var2 >= var3)
						return false;
				} else if (var0.anIntArray1258[var1] == 3) {
					if (var2 <= var3)
						return false;
				} else if (var0.anIntArray1258[var1] == 4) {
					if (var3 == var2)
						return false;
				} else if (var3 != var2)
					return false;
			}

			return true;
		}
	}

	public static int method14(final int var0, final int var1, int var2, int var3, int var4, final int var5) {
		if ((var5 & 1) == 1) {
			final int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		return var2 == 0 ? var0 : (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1)));
	}

	public static void method15() {
		Class123.aClass128_849 = new Class128();
	}

	static void method16(final int var0, final int var1, final int var2, final Class109_Sub21_Sub10 var3,
			final int var4) {
		final Class109_Sub10 var5 = new Class109_Sub10();
		var5.anInt1014 = var0;
		var5.anInt1011 = var1 * 128;
		var5.anInt1012 = var2 * 128;
		int var7 = var3.anInt1440;
		int var6 = var3.anInt1435;
		if ((var4 == 1) || (var4 == 3)) {
			var7 = var3.anInt1435;
			var6 = var3.anInt1440;
		}

		var5.anInt1013 = (var1 + var7) * 128;
		var5.anInt1017 = (var2 + var6) * 128;
		var5.anInt1016 = var3.anInt1447;
		var5.anInt1019 = var3.anInt1449 * 128;
		var5.anInt1018 = var3.anInt1469;
		var5.anInt1009 = var3.anInt1470;
		var5.anIntArray1015 = var3.anIntArray1471;
		if (null != var3.anIntArray1464) {
			var5.aClass109_Sub21_Sub10_1023 = var3;
			var5.method533();
		}

		Class109_Sub10.aClass126_1020.method450(var5);
		if (var5.anIntArray1015 != null)
			var5.anInt1021 = var5.anInt1018 + (int) (Math.random() * (var5.anInt1009 - var5.anInt1018));

	}
}
