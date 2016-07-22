public final class Class116 {
	Class109 aClass109_832;
	Class109 aClass109_831;
	int anInt834 = 0;
	int anInt830;
	Class109[] aClass109Array833;

	public Class109 method429(final long var1) {
		final Class109 var3 = aClass109Array833[(int) (var1 & anInt830 - 1)];

		for (aClass109_832 = var3.aClass109_803; aClass109_832 != var3; aClass109_832 = aClass109_832.aClass109_803)
			if (aClass109_832.aLong802 == var1) {
				final Class109 var4 = aClass109_832;
				aClass109_832 = aClass109_832.aClass109_803;
				return var4;
			}

		aClass109_832 = null;
		return null;
	}

	public void method430(final Class109 var1, final long var2) {
		if (var1.aClass109_804 != null)
			var1.method413();

		final Class109 var4 = aClass109Array833[(int) (var2 & anInt830 - 1)];
		var1.aClass109_804 = var4.aClass109_804;
		var1.aClass109_803 = var4;
		var1.aClass109_804.aClass109_803 = var1;
		var1.aClass109_803.aClass109_804 = var1;
		var1.aLong802 = var2;
	}

	void method431() {
		for (int var1 = 0; var1 < anInt830; ++var1) {
			final Class109 var2 = aClass109Array833[var1];

			while (true) {
				final Class109 var3 = var2.aClass109_803;
				if (var3 == var2)
					break;

				var3.method413();
			}
		}

		aClass109_832 = null;
		aClass109_831 = null;
	}

	public Class109 method432() {
		anInt834 = 0;
		return method433();
	}

	public Class109 method433() {
		Class109 var1;
		if ((anInt834 > 0) && (aClass109_831 != aClass109Array833[anInt834 - 1])) {
			var1 = aClass109_831;
			aClass109_831 = var1.aClass109_803;
			return var1;
		} else {
			do {
				if (anInt834 >= anInt830)
					return null;

				var1 = aClass109Array833[anInt834++].aClass109_803;
			} while (var1 == aClass109Array833[anInt834 - 1]);

			aClass109_831 = var1.aClass109_803;
			return var1;
		}
	}

	public Class116(final int var1) {
		anInt830 = var1;
		aClass109Array833 = new Class109[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			final Class109 var2 = aClass109Array833[var3] = new Class109();
			var2.aClass109_803 = var2;
			var2.aClass109_804 = var2;
		}

	}
}
