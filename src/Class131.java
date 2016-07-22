import java.util.Comparator;

final class Class131 implements Comparator {
	int method472(final Class114 var1, final Class114 var2) {
		return var1.aLong824 < var2.aLong824 ? -1 : (var1.aLong824 == var2.aLong824 ? 0 : 1);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method472((Class114) var1, (Class114) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}
}
