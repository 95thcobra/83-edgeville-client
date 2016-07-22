import java.io.File;
import java.util.Comparator;

final class Class112 implements Comparator {
	static int[][] anIntArrayArray808;
	static File aFile809;
	static boolean[] aBoolArray810;

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}

	int method421(final Class114 var1, final Class114 var2) {
		return var1.method426().compareTo(var2.method426());
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method421((Class114) var1, (Class114) var2);
	}

	static void method422(final int var0, final int var1) {
		client.secureBuffer.method840(3);
		client.secureBuffer.method601(var1);
		client.secureBuffer.method596(var0);
	}

	public static Class109_Sub20 method423(final int var0, final int var1) {
		final Class109_Sub20 var2 = Class83.method345(var0);
		return var1 == -1 ? var2
				: ((null != var2) && (var2.aClass109_Sub20Array1272 != null)
						&& (var1 < var2.aClass109_Sub20Array1272.length) ? var2.aClass109_Sub20Array1272[var1] : null);
	}
}
