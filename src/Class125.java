import java.util.Iterator;

public final class Class125 implements Iterable {
	Class109 aClass109_854;
	int anInt856;
	Class109[] aClass109Array855;

	@Override
	public Iterator iterator() {
		return new Class127(this);
	}

	public void method446(final Class109 var1, final long var2) {
		if (var1.aClass109_804 != null)
			var1.method413();

		final Class109 var4 = aClass109Array855[(int) (var2 & anInt856 - 1)];
		var1.aClass109_804 = var4.aClass109_804;
		var1.aClass109_803 = var4;
		var1.aClass109_804.aClass109_803 = var1;
		var1.aClass109_803.aClass109_804 = var1;
		var1.aLong802 = var2;
	}

	public void method447() {
		for (int var1 = 0; var1 < anInt856; ++var1) {
			final Class109 var2 = aClass109Array855[var1];

			while (true) {
				final Class109 var3 = var2.aClass109_803;
				if (var3 == var2)
					break;

				var3.method413();
			}
		}

		aClass109_854 = null;
	}

	public Class109 method448(final long var1) {
		final Class109 var3 = aClass109Array855[(int) (var1 & anInt856 - 1)];

		for (aClass109_854 = var3.aClass109_803; aClass109_854 != var3; aClass109_854 = aClass109_854.aClass109_803)
			if (aClass109_854.aLong802 == var1) {
				final Class109 var4 = aClass109_854;
				aClass109_854 = aClass109_854.aClass109_803;
				return var4;
			}

		aClass109_854 = null;
		return null;
	}

	public Class125(final int var1) {
		anInt856 = var1;
		aClass109Array855 = new Class109[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			final Class109 var3 = aClass109Array855[var2] = new Class109();
			var3.aClass109_803 = var3;
			var3.aClass109_804 = var3;
		}

	}
}
