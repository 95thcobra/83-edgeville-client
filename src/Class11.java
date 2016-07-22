public class Class11 {
	Class18[] aClass18Array105 = new Class18[10];
	int anInt106;
	int anInt107;

	public static Class11 method58(final Class104 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method387(var1, var2);
		return var3 == null ? null : new Class11(new DataBuffer(var3));
	}

	public Class109_Sub3_Sub1 method59() {
		final byte[] var1 = method60();
		return new Class109_Sub3_Sub1(22050, var1, (22050 * anInt106) / 1000, (22050 * anInt107) / 1000);
	}

	Class11(final DataBuffer var1) {
		for (int var2 = 0; var2 < 10; ++var2) {
			final int var3 = var1.method564();
			if (var3 != 0) {
				--var1.position;
				aClass18Array105[var2] = new Class18();
				aClass18Array105[var2].method87(var1);
			}
		}

		anInt106 = var1.method566();
		anInt107 = var1.method566();
	}

	final byte[] method60() {
		int var1 = 0;

		int var3;
		for (var3 = 0; var3 < 10; ++var3)
			if ((aClass18Array105[var3] != null)
					&& ((aClass18Array105[var3].anInt170 + aClass18Array105[var3].anInt171) > var1))
				var1 = aClass18Array105[var3].anInt170 + aClass18Array105[var3].anInt171;

		if (var1 == 0)
			return new byte[0];
		else {
			var3 = (22050 * var1) / 1000;
			final byte[] var9 = new byte[var3];

			for (int var4 = 0; var4 < 10; ++var4)
				if (aClass18Array105[var4] != null) {
					final int var7 = (aClass18Array105[var4].anInt170 * 22050) / 1000;
					final int var6 = (aClass18Array105[var4].anInt171 * 22050) / 1000;
					final int[] var8 = aClass18Array105[var4].method86(var7, aClass18Array105[var4].anInt170);

					for (int var5 = 0; var5 < var7; ++var5) {
						int var2 = var9[var5 + var6] + (var8[var5] >> 8);
						if (((var2 + 128) & -256) != 0)
							var2 = (var2 >> 31) ^ 127;

						var9[var5 + var6] = (byte) var2;
					}
				}

			return var9;
		}
	}

	public final int method61() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2)
			if ((aClass18Array105[var2] != null) && ((aClass18Array105[var2].anInt171 / 20) < var1))
				var1 = aClass18Array105[var2].anInt171 / 20;

		if ((anInt106 < anInt107) && ((anInt106 / 20) < var1))
			var1 = anInt106 / 20;

		if ((var1 != 9999999) && (var1 != 0)) {
			for (var2 = 0; var2 < 10; ++var2)
				if (aClass18Array105[var2] != null)
					aClass18Array105[var2].anInt171 -= var1 * 20;

			if (anInt106 < anInt107) {
				anInt106 -= var1 * 20;
				anInt107 -= var1 * 20;
			}

			return var1;
		} else
			return 0;
	}
}
