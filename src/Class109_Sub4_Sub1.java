public class Class109_Sub4_Sub1 extends Class109_Sub4 {
	int anInt1476 = -1;
	int anInt1477 = 0;
	Class126 aClass126_1474 = new Class126();
	Class126 aClass126_1475 = new Class126();

	public final synchronized void method739(final Class109_Sub4 var1) {
		var1.method413();
	}

	void method740() {
		if (anInt1477 > 0) {
			for (Class109_Sub1 var1 = (Class109_Sub1) aClass126_1475
					.method458(); var1 != null; var1 = (Class109_Sub1) aClass126_1475.method449())
				var1.anInt907 -= anInt1477;

			anInt1476 -= anInt1477;
			anInt1477 = 0;
		}

	}

	void method741(Class109 var1, final Class109_Sub1 var2) {
		while ((var1 != aClass126_1475.aClass109_857) && (((Class109_Sub1) var1).anInt907 <= var2.anInt907))
			var1 = var1.aClass109_803;

		Class126.method452(var2, var1);
		anInt1476 = ((Class109_Sub1) aClass126_1475.aClass109_857.aClass109_803).anInt907;
	}

	void method742(final Class109_Sub1 var1) {
		var1.method413();
		var1.method499();
		final Class109 var2 = aClass126_1475.aClass109_857.aClass109_803;
		if (var2 == aClass126_1475.aClass109_857)
			anInt1476 = -1;
		else
			anInt1476 = ((Class109_Sub1) var2).anInt907;

	}

	@Override
	protected int method506() {
		return 0;
	}

	@Override
	public final synchronized void method508(final int[] var1, int var2, int var3) {
		do {
			if (anInt1476 < 0) {
				method744(var1, var2, var3);
				return;
			}

			if ((anInt1477 + var3) < anInt1476) {
				anInt1477 += var3;
				method744(var1, var2, var3);
				return;
			}

			final int var4 = anInt1476 - anInt1477;
			method744(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			anInt1477 += var4;
			method740();
			final Class109_Sub1 var5 = (Class109_Sub1) aClass126_1475.method458();
			synchronized (var5) {
				final int var7 = var5.method500(this);
				if (var7 < 0) {
					var5.anInt907 = 0;
					method742(var5);
				} else {
					var5.anInt907 = var7;
					method741(var5.aClass109_803, var5);
				}
			}
		} while (var3 != 0);

	}

	@Override
	public final synchronized void method510(int var1) {
		do {
			if (anInt1476 < 0) {
				method745(var1);
				return;
			}

			if ((anInt1477 + var1) < anInt1476) {
				anInt1477 += var1;
				method745(var1);
				return;
			}

			final int var2 = anInt1476 - anInt1477;
			method745(var2);
			var1 -= var2;
			anInt1477 += var2;
			method740();
			final Class109_Sub1 var3 = (Class109_Sub1) aClass126_1475.method458();
			synchronized (var3) {
				final int var5 = var3.method500(this);
				if (var5 < 0) {
					var3.anInt907 = 0;
					method742(var3);
				} else {
					var3.anInt907 = var5;
					method741(var3.aClass109_803, var3);
				}
			}
		} while (var1 != 0);

	}

	@Override
	protected Class109_Sub4 method509() {
		return (Class109_Sub4) aClass126_1474.method458();
	}

	public final synchronized void method743(final Class109_Sub4 var1) {
		aClass126_1474.method451(var1);
	}

	void method744(final int[] var1, final int var2, final int var3) {
		for (Class109_Sub4 var4 = (Class109_Sub4) aClass126_1474
				.method458(); var4 != null; var4 = (Class109_Sub4) aClass126_1474.method449())
			var4.method504(var1, var2, var3);

	}

	void method745(final int var1) {
		for (Class109_Sub4 var2 = (Class109_Sub4) aClass126_1474
				.method458(); var2 != null; var2 = (Class109_Sub4) aClass126_1474.method449())
			var2.method510(var1);

	}

	@Override
	protected Class109_Sub4 method505() {
		return (Class109_Sub4) aClass126_1474.method449();
	}
}
