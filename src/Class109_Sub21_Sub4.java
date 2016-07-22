public class Class109_Sub21_Sub4 extends Class109_Sub21 {
	static Class104 aClass104_1322;
	public static int anInt1323;
	static Class109_Sub21_Sub14_Sub2[] aClass109_Sub21_Sub14_Sub2Array1332;
	static int anInt1333;
	static Class109_Sub21_Sub14_Sub4_Sub1 aClass109_Sub21_Sub14_Sub4_Sub1_1334;
	static Class104 aClass104_1335;
	public int anInt1325 = -1;
	int[] anIntArray1326;
	public boolean aBool1321 = false;
	short[] aShortArray1331;
	short[] aShortArray1329;
	short[] aShortArray1328;
	short[] aShortArray1327;
	public static Class120 aClass120_1324 = new Class120(64);
	int[] anIntArray1330 = new int[] { -1, -1, -1, -1, -1 };

	void method677(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			anInt1325 = var1.method564();
		else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.method564();
				anIntArray1326 = new int[var3];

				for (var4 = 0; var4 < var3; ++var4)
					anIntArray1326[var4] = var1.method566();
			} else if (var2 == 3)
				aBool1321 = true;
			else if (var2 == 40) {
				var3 = var1.method564();
				aShortArray1331 = new short[var3];
				aShortArray1329 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1331[var4] = (short) var1.method566();
					aShortArray1329[var4] = (short) var1.method566();
				}
			} else if (var2 == 41) {
				var3 = var1.method564();
				aShortArray1328 = new short[var3];
				aShortArray1327 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1328[var4] = (short) var1.method566();
					aShortArray1327[var4] = (short) var1.method566();
				}
			} else if ((var2 >= 60) && (var2 < 70))
				anIntArray1330[var2 - 60] = var1.method566();
		}

	}

	public Class109_Sub21_Sub15_Sub7 method678() {
		final Class109_Sub21_Sub15_Sub7[] var1 = new Class109_Sub21_Sub15_Sub7[5];
		int var5 = 0;

		for (int var2 = 0; var2 < 5; ++var2)
			if (anIntArray1330[var2] != -1)
				var1[var5++] = Class109_Sub21_Sub15_Sub7.method984(aClass104_1322, anIntArray1330[var2], 0);

		final Class109_Sub21_Sub15_Sub7 var3 = new Class109_Sub21_Sub15_Sub7(var1, var5);
		int var4;
		if (null != aShortArray1331)
			for (var4 = 0; var4 < aShortArray1331.length; ++var4)
				var3.method1002(aShortArray1331[var4], aShortArray1329[var4]);

		if (null != aShortArray1328)
			for (var4 = 0; var4 < aShortArray1328.length; ++var4)
				var3.method1001(aShortArray1328[var4], aShortArray1327[var4]);

		return var3;
	}

	public boolean method679() {
		if (null == anIntArray1326)
			return true;
		else {
			boolean var1 = true;

			for (int var2 = 0; var2 < anIntArray1326.length; ++var2)
				if (!aClass104_1322.method389(anIntArray1326[var2], 0))
					var1 = false;

			return var1;
		}
	}

	public Class109_Sub21_Sub15_Sub7 method680() {
		if (null == anIntArray1326)
			return null;
		else {
			final Class109_Sub21_Sub15_Sub7[] var2 = new Class109_Sub21_Sub15_Sub7[anIntArray1326.length];

			for (int var1 = 0; var1 < anIntArray1326.length; ++var1)
				var2[var1] = Class109_Sub21_Sub15_Sub7.method984(aClass104_1322, anIntArray1326[var1], 0);

			Class109_Sub21_Sub15_Sub7 var4;
			if (var2.length == 1)
				var4 = var2[0];
			else
				var4 = new Class109_Sub21_Sub15_Sub7(var2, var2.length);

			int var3;
			if (null != aShortArray1331)
				for (var3 = 0; var3 < aShortArray1331.length; ++var3)
					var4.method1002(aShortArray1331[var3], aShortArray1329[var3]);

			if (aShortArray1328 != null)
				for (var3 = 0; var3 < aShortArray1328.length; ++var3)
					var4.method1001(aShortArray1328[var3], aShortArray1327[var3]);

			return var4;
		}
	}

	public boolean method681() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2)
			if ((anIntArray1330[var2] != -1) && !aClass104_1322.method389(anIntArray1330[var2], 0))
				var1 = false;

		return var1;
	}

	void method682(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method564();
			if (var2 == 0)
				return;

			method677(var1, var2);
		}
	}

	static void method683(final int var0, final String var1, final String var2, final String var3) {
		Class31 var4 = (Class31) Class35.aMap332.get(Integer.valueOf(var0));
		if (null == var4) {
			var4 = new Class31();
			Class35.aMap332.put(Integer.valueOf(var0), var4);
		}

		final Class109_Sub21_Sub9 var5 = var4.method136(var0, var1, var2, var3);
		Class35.aClass125_331.method446(var5, var5.anInt1419);
		Class35.aClass121_333.method442(var5);
		client.anInt2160 = client.anInt2131;
	}
}
