public final class Class111 {
	Class109_Sub21 aClass109_Sub21_807 = new Class109_Sub21();

	public void method416(final Class109_Sub21 var1) {
		if (var1.aClass109_Sub21_1280 != null)
			var1.method658();

		var1.aClass109_Sub21_1280 = aClass109_Sub21_807.aClass109_Sub21_1280;
		var1.aClass109_Sub21_1279 = aClass109_Sub21_807;
		var1.aClass109_Sub21_1280.aClass109_Sub21_1279 = var1;
		var1.aClass109_Sub21_1279.aClass109_Sub21_1280 = var1;
	}

	public void method417(final Class109_Sub21 var1) {
		if (var1.aClass109_Sub21_1280 != null)
			var1.method658();

		var1.aClass109_Sub21_1280 = aClass109_Sub21_807;
		var1.aClass109_Sub21_1279 = aClass109_Sub21_807.aClass109_Sub21_1279;
		var1.aClass109_Sub21_1280.aClass109_Sub21_1279 = var1;
		var1.aClass109_Sub21_1279.aClass109_Sub21_1280 = var1;
	}

	Class109_Sub21 method418() {
		final Class109_Sub21 var1 = aClass109_Sub21_807.aClass109_Sub21_1279;
		if (var1 == aClass109_Sub21_807)
			return null;
		else {
			var1.method658();
			return var1;
		}
	}

	public Class109_Sub21 method419() {
		final Class109_Sub21 var1 = aClass109_Sub21_807.aClass109_Sub21_1279;
		return var1 == aClass109_Sub21_807 ? null : var1;
	}

	void method420() {
		while (true) {
			final Class109_Sub21 var1 = aClass109_Sub21_807.aClass109_Sub21_1279;
			if (var1 == aClass109_Sub21_807)
				return;

			var1.method658();
		}
	}

	public Class111() {
		aClass109_Sub21_807.aClass109_Sub21_1279 = aClass109_Sub21_807;
		aClass109_Sub21_807.aClass109_Sub21_1280 = aClass109_Sub21_807;
	}
}
