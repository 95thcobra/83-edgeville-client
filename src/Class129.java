import java.util.Comparator;

final class Class129 implements Comparator {
	public static Class104 aClass104_864;

	int method463(final Class114 var1, final Class114 var2) {
		return var1.anInt826 < var2.anInt826 ? -1 : (var1.anInt826 == var2.anInt826 ? 0 : 1);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method463((Class114) var1, (Class114) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}
}
