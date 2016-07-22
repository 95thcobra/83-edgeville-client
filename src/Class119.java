public class Class119 {
	Class110 aClass110_839 = new Class110();
	Class110 aClass110_840;

	public Class119() {
		aClass110_839.aClass110_805 = aClass110_839;
		aClass110_839.aClass110_806 = aClass110_839;
	}

	public Class110 method435() {
		final Class110 var1 = aClass110_840;
		if (var1 == aClass110_839) {
			aClass110_840 = null;
			return null;
		} else {
			aClass110_840 = var1.aClass110_805;
			return var1;
		}
	}

	public void method436(final Class110 var1) {
		if (var1.aClass110_806 != null)
			var1.method415();

		var1.aClass110_806 = aClass110_839.aClass110_806;
		var1.aClass110_805 = aClass110_839;
		var1.aClass110_806.aClass110_805 = var1;
		var1.aClass110_805.aClass110_806 = var1;
	}

	public Class110 method437() {
		final Class110 var1 = aClass110_839.aClass110_805;
		if (var1 == aClass110_839) {
			aClass110_840 = null;
			return null;
		} else {
			aClass110_840 = var1.aClass110_805;
			return var1;
		}
	}
}
