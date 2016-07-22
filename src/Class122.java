import java.util.Comparator;

final class Class122 implements Comparator {
	public static int anInt847;
	public static int anInt848;

	public static Class109_Sub21_Sub13 method444(final int var0) {
		Class109_Sub21_Sub13 var1 = (Class109_Sub21_Sub13) Class109_Sub21_Sub13.aClass120_1510.method438(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class109_Sub21_Sub13.aClass104_1524.method387(9, var0);
			var1 = new Class109_Sub21_Sub13();
			var1.anInt1512 = var0;
			if (var2 != null)
				var1.method759(new DataBuffer(var2));

			var1.method758();
			Class109_Sub21_Sub13.aClass120_1510.method440(var1, var0);
			return var1;
		}
	}

	int method445(final Class114 var1, final Class114 var2) {
		return var1.aClass134_828.anInt880 < var2.aClass134_828.anInt880 ? -1
				: (var1.aClass134_828.anInt880 == var2.aClass134_828.anInt880 ? 0 : 1);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method445((Class114) var1, (Class114) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}
}
