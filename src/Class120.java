public final class Class120 {
	Class109_Sub21 aClass109_Sub21_844 = new Class109_Sub21();
	Class111 aClass111_845 = new Class111();
	int anInt841;
	int anInt843;
	Class116 aClass116_842;

	public Class120(final int var1) {
		anInt841 = var1;
		anInt843 = var1;

		int var2;
		for (var2 = 1; (var2 + var2) < var1; var2 += var2)
			;

		aClass116_842 = new Class116(var2);
	}

	public Class109_Sub21 method438(final long var1) {
		final Class109_Sub21 var3 = (Class109_Sub21) aClass116_842.method429(var1);
		if (var3 != null)
			aClass111_845.method416(var3);

		return var3;
	}

	public void method439() {
		aClass111_845.method420();
		aClass116_842.method431();
		aClass109_Sub21_844 = new Class109_Sub21();
		anInt843 = anInt841;
	}

	public void method440(final Class109_Sub21 var1, final long var2) {
		if (anInt843 == 0) {
			Class109_Sub21 var4 = aClass111_845.method418();
			var4.method413();
			var4.method658();
			if (var4 == aClass109_Sub21_844) {
				var4 = aClass111_845.method418();
				var4.method413();
				var4.method658();
			}
		} else
			--anInt843;

		aClass116_842.method430(var1, var2);
		aClass111_845.method416(var1);
	}

	public void method441(final long var1) {
		final Class109_Sub21 var3 = (Class109_Sub21) aClass116_842.method429(var1);
		if (var3 != null) {
			var3.method413();
			var3.method658();
			++anInt843;
		}

	}
}
