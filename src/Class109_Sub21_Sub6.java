import java.io.File;

public class Class109_Sub21_Sub6 extends Class109_Sub21 {
	static File aFile1388;
	static int anInt1389;
	public int anInt1387 = 0;
	public static Class120 aClass120_1386 = new Class120(64);

	void method700(final DataBuffer var1, final int var2) {
		if (var2 == 2)
			anInt1387 = var1.method566();

	}

	public void method701(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method564();
			if (var2 == 0)
				return;

			method700(var1, var2);
		}
	}

	public static int method702(final int var0, final int var1, int var2) {
		var2 &= 3;
		return var2 == 0 ? var1 : (var2 == 1 ? 7 - var0 : (var2 == 2 ? 7 - var1 : var0));
	}
}
