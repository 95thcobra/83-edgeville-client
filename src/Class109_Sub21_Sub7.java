public class Class109_Sub21_Sub7 extends Class109_Sub21 {
	public static Class104 aClass104_1391;
	public static Class104 aClass104_1394;
	static Class109_Sub21_Sub14_Sub2 aClass109_Sub21_Sub14_Sub2_1408;
	public int[] anIntArray1396;
	public int anInt1395 = -1;
	int[] anIntArray1399;
	public int[] anIntArray1401;
	public boolean aBool1400 = false;
	public int anInt1390 = 5;
	public int anInt1402 = -1;
	public int anInt1403 = -1;
	public int anInt1405 = 99;
	public int anInt1398 = -1;
	public int anInt1406 = -1;
	public int anInt1404 = 2;
	int[] anIntArray1407;
	public int[] anIntArray1397;
	public static Class120 aClass120_1392 = new Class120(64);
	public static Class120 aClass120_1393 = new Class120(100);

	void method703(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method564();
			if (var2 == 0)
				return;

			method704(var1, var2);
		}
	}

	void method704(final DataBuffer var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var4 = var1.method566();
			anIntArray1396 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1396[var3] = var1.method566();

			anIntArray1401 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1401[var3] = var1.method566();

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1401[var3] += var1.method566() << 16;
		} else if (var2 == 2)
			anInt1395 = var1.method566();
		else if (var2 == 3) {
			var4 = var1.method564();
			anIntArray1399 = new int[1 + var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1399[var3] = var1.method564();

			anIntArray1399[var4] = 9999999;
		} else if (var2 == 4)
			aBool1400 = true;
		else if (var2 == 5)
			anInt1390 = var1.method564();
		else if (var2 == 6)
			anInt1402 = var1.method566();
		else if (var2 == 7)
			anInt1403 = var1.method566();
		else if (var2 == 8)
			anInt1405 = var1.method564();
		else if (var2 == 9)
			anInt1398 = var1.method564();
		else if (var2 == 10)
			anInt1406 = var1.method564();
		else if (var2 == 11)
			anInt1404 = var1.method564();
		else if (var2 == 12) {
			var4 = var1.method564();
			anIntArray1407 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1407[var3] = var1.method566();

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1407[var3] += var1.method566() << 16;
		} else if (var2 == 13) {
			var4 = var1.method564();
			anIntArray1397 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1397[var3] = var1.method567();
		}

	}

	void method705() {
		if (anInt1398 == -1)
			if (null != anIntArray1399)
				anInt1398 = 2;
			else
				anInt1398 = 0;

		if (anInt1406 == -1)
			if (anIntArray1399 != null)
				anInt1406 = 2;
			else
				anInt1406 = 0;

	}

	public Class109_Sub21_Sub15_Sub4 method706(final Class109_Sub21_Sub15_Sub4 var1, int var2) {
		var2 = anIntArray1401[var2];
		final Class109_Sub21_Sub17 var4 = Class33.method150(var2 >> 16);
		var2 &= '\uffff';
		if (null == var4)
			return var1.method952(true);
		else {
			final Class109_Sub21_Sub15_Sub4 var3 = var1.method952(!var4.method837(var2));
			var3.method953(var4, var2);
			return var3;
		}
	}

	Class109_Sub21_Sub15_Sub4 method707(final Class109_Sub21_Sub15_Sub4 var1, int var2, int var3) {
		var2 = anIntArray1401[var2];
		final Class109_Sub21_Sub17 var5 = Class33.method150(var2 >> 16);
		var2 &= '\uffff';
		if (var5 == null)
			return var1.method952(true);
		else {
			final Class109_Sub21_Sub15_Sub4 var4 = var1.method952(!var5.method837(var2));
			var3 &= 3;
			if (var3 == 1)
				var4.method945();
			else if (var3 == 2)
				var4.method943();
			else if (var3 == 3)
				var4.method942();

			var4.method953(var5, var2);
			if (var3 == 1)
				var4.method942();
			else if (var3 == 2)
				var4.method943();
			else if (var3 == 3)
				var4.method945();

			return var4;
		}
	}

	public Class109_Sub21_Sub15_Sub4 method708(final Class109_Sub21_Sub15_Sub4 var1, int var2,
			final Class109_Sub21_Sub7 var3, int var4) {
		var2 = anIntArray1401[var2];
		final Class109_Sub21_Sub17 var5 = Class33.method150(var2 >> 16);
		var2 &= '\uffff';
		if (null == var5)
			return var3.method706(var1, var4);
		else {
			var4 = var3.anIntArray1401[var4];
			final Class109_Sub21_Sub17 var6 = Class33.method150(var4 >> 16);
			var4 &= '\uffff';
			Class109_Sub21_Sub15_Sub4 var7;
			if (var6 == null) {
				var7 = var1.method952(!var5.method837(var2));
				var7.method953(var5, var2);
				return var7;
			} else {
				var7 = var1.method952(!var5.method837(var2) & !var6.method837(var4));
				var7.method940(var5, var2, var6, var4, anIntArray1399);
				return var7;
			}
		}
	}

	public Class109_Sub21_Sub15_Sub4 method709(final Class109_Sub21_Sub15_Sub4 var1, final int var2) {
		int var3 = anIntArray1401[var2];
		final Class109_Sub21_Sub17 var5 = Class33.method150(var3 >> 16);
		var3 &= '\uffff';
		if (var5 == null)
			return var1.method952(true);
		else {
			Class109_Sub21_Sub17 var6 = null;
			int var7 = 0;
			if ((anIntArray1407 != null) && (var2 < anIntArray1407.length)) {
				var7 = anIntArray1407[var2];
				var6 = Class33.method150(var7 >> 16);
				var7 &= '\uffff';
			}

			Class109_Sub21_Sub15_Sub4 var4;
			if ((var6 != null) && (var7 != '\uffff')) {
				var4 = var1.method952(!var5.method837(var3) & !var6.method837(var7));
				var4.method953(var5, var3);
				var4.method953(var6, var7);
				return var4;
			} else {
				var4 = var1.method952(!var5.method837(var3));
				var4.method953(var5, var3);
				return var4;
			}
		}
	}

	Class109_Sub21_Sub15_Sub4 method710(final Class109_Sub21_Sub15_Sub4 var1, int var2) {
		var2 = anIntArray1401[var2];
		final Class109_Sub21_Sub17 var4 = Class33.method150(var2 >> 16);
		var2 &= '\uffff';
		if (null == var4)
			return var1.method954(true);
		else {
			final Class109_Sub21_Sub15_Sub4 var3 = var1.method954(!var4.method837(var2));
			var3.method953(var4, var2);
			return var3;
		}
	}

	public static Class109_Sub21_Sub2 method711(final int var0) {
		Class109_Sub21_Sub2 var1 = (Class109_Sub21_Sub2) Class109_Sub21_Sub2.aClass120_1302.method438(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class109_Sub21_Sub2.aClass104_1304.method387(16, var0);
			var1 = new Class109_Sub21_Sub2();
			if (null != var2)
				var1.method665(new DataBuffer(var2));

			Class109_Sub21_Sub2.aClass120_1302.method440(var1, var0);
			return var1;
		}
	}
}
