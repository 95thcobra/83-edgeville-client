public class Class109_Sub21_Sub5 extends Class109_Sub21 {
	static Class104 aClass104_1338;
	public static int anInt1340;
	public int anInt1344;
	static Class104 aClass104_1379;
	static int[] anIntArray1384;
	int anInt1345;
	public int anInt1351 = 2000;
	public int anInt1352 = 0;
	public int anInt1353 = 0;
	public int anInt1354 = 0;
	public int anInt1355 = 0;
	public int anInt1346 = 0;
	short[] aShortArray1347;
	short[] aShortArray1348;
	short[] aShortArray1349;
	short[] aShortArray1350;
	public String aString1372 = "null";
	public boolean aBool1367 = false;
	public int anInt1378 = 0;
	int anInt1362 = -1;
	int anInt1337 = -1;
	int anInt1336 = -1;
	int anInt1365 = -1;
	int anInt1374 = -1;
	int anInt1368 = -1;
	int anInt1369 = -1;
	int anInt1370 = -1;
	int anInt1371 = -1;
	int anInt1385 = -1;
	public int anInt1380 = 0;
	public String[] aStringArray1339 = new String[] { null, null, "Take", null, null };
	public String[] aStringArray1361 = new String[] { null, null, null, null, "Drop" };
	public int anInt1358 = 1;
	static Class120 aClass120_1341 = new Class120(64);
	static Class120 aClass120_1342 = new Class120(50);
	static Class120 aClass120_1343 = new Class120(200);
	int anInt1364 = 0;
	int anInt1366 = 0;
	public boolean aBool1381 = false;
	public int anInt1356 = -1;
	public int anInt1376 = -1;
	int anInt1359 = 128;
	int[] anIntArray1373;
	int[] anIntArray1360;
	int anInt1375 = 128;
	int anInt1377 = 128;
	public int anInt1363 = 0;
	public int anInt1357 = 0;
	int anInt1382 = -1;
	int anInt1383 = -1;

	void method684() {
	}

	void method685(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method564();
			if (var2 == 0)
				return;

			method693(var1, var2);
		}
	}

	public final Class109_Sub21_Sub15_Sub7 method686(final boolean var1) {
		int var2 = anInt1369;
		int var4 = anInt1370;
		if (var1) {
			var2 = anInt1371;
			var4 = anInt1385;
		}

		if (var2 == -1)
			return null;
		else {
			Class109_Sub21_Sub15_Sub7 var5 = Class109_Sub21_Sub15_Sub7.method984(aClass104_1379, var2, 0);
			if (var4 != -1) {
				final Class109_Sub21_Sub15_Sub7 var6 = Class109_Sub21_Sub15_Sub7.method984(aClass104_1379, var4, 0);
				final Class109_Sub21_Sub15_Sub7[] var7 = new Class109_Sub21_Sub15_Sub7[] { var5, var6 };
				var5 = new Class109_Sub21_Sub15_Sub7(var7, 2);
			}

			int var3;
			if (aShortArray1347 != null)
				for (var3 = 0; var3 < aShortArray1347.length; ++var3)
					var5.method1002(aShortArray1347[var3], aShortArray1348[var3]);

			if (aShortArray1349 != null)
				for (var3 = 0; var3 < aShortArray1349.length; ++var3)
					var5.method1001(aShortArray1349[var3], aShortArray1350[var3]);

			return var5;
		}
	}

	void method687(final Class109_Sub21_Sub5 var1, final Class109_Sub21_Sub5 var2) {
		anInt1345 = var1.anInt1345;
		anInt1351 = var1.anInt1351;
		anInt1352 = var1.anInt1352;
		anInt1353 = var1.anInt1353;
		anInt1354 = var1.anInt1354;
		anInt1355 = var1.anInt1355;
		anInt1346 = var1.anInt1346;
		aShortArray1347 = var2.aShortArray1347;
		aShortArray1348 = var2.aShortArray1348;
		aShortArray1349 = var2.aShortArray1349;
		aShortArray1350 = var2.aShortArray1350;
		aString1372 = var2.aString1372;
		aBool1367 = var2.aBool1367;
		anInt1378 = var2.anInt1378;
		anInt1362 = var2.anInt1362;
		anInt1337 = var2.anInt1337;
		anInt1336 = var2.anInt1336;
		anInt1365 = var2.anInt1365;
		anInt1374 = var2.anInt1374;
		anInt1368 = var2.anInt1368;
		anInt1369 = var2.anInt1369;
		anInt1370 = var2.anInt1370;
		anInt1371 = var2.anInt1371;
		anInt1385 = var2.anInt1385;
		anInt1380 = var2.anInt1380;
		aStringArray1339 = var2.aStringArray1339;
		aStringArray1361 = new String[5];
		if (var2.aStringArray1361 != null)
			for (int var3 = 0; var3 < 4; ++var3)
				aStringArray1361[var3] = var2.aStringArray1361[var3];

		aStringArray1361[4] = "Discard";
		anInt1358 = 0;
	}

	public final Class109_Sub21_Sub15_Sub7 method688(final int var1) {
		int var2;
		if ((null != anIntArray1373) && (var1 > 1)) {
			int var3 = -1;

			for (var2 = 0; var2 < 10; ++var2)
				if ((var1 >= anIntArray1360[var2]) && (anIntArray1360[var2] != 0))
					var3 = anIntArray1373[var2];

			if (var3 != -1)
				return Class109_Sub23.method660(var3).method688(1);
		}

		final Class109_Sub21_Sub15_Sub7 var4 = Class109_Sub21_Sub15_Sub7.method984(aClass104_1379, anInt1345, 0);
		if (var4 == null)
			return null;
		else {
			if ((anInt1359 != 128) || (anInt1375 != 128) || (anInt1377 != 128))
				var4.method993(anInt1359, anInt1375, anInt1377);

			if (aShortArray1347 != null)
				for (var2 = 0; var2 < aShortArray1347.length; ++var2)
					var4.method1002(aShortArray1347[var2], aShortArray1348[var2]);

			if (null != aShortArray1349)
				for (var2 = 0; var2 < aShortArray1349.length; ++var2)
					var4.method1001(aShortArray1349[var2], aShortArray1350[var2]);

			return var4;
		}
	}

	public final Class109_Sub21_Sub15_Sub4 method689(final int var1) {
		if ((anIntArray1373 != null) && (var1 > 1)) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4)
				if ((var1 >= anIntArray1360[var4]) && (anIntArray1360[var4] != 0))
					var3 = anIntArray1373[var4];

			if (var3 != -1)
				return Class109_Sub23.method660(var3).method689(1);
		}

		Class109_Sub21_Sub15_Sub4 var2 = (Class109_Sub21_Sub15_Sub4) aClass120_1342.method438(anInt1344);
		if (null != var2)
			return var2;
		else {
			final Class109_Sub21_Sub15_Sub7 var5 = Class109_Sub21_Sub15_Sub7.method984(aClass104_1379, anInt1345, 0);
			if (var5 == null)
				return null;
			else {
				if ((anInt1359 != 128) || (anInt1375 != 128) || (anInt1377 != 128))
					var5.method993(anInt1359, anInt1375, anInt1377);

				int var6;
				if (null != aShortArray1347)
					for (var6 = 0; var6 < aShortArray1347.length; ++var6)
						var5.method1002(aShortArray1347[var6], aShortArray1348[var6]);

				if (null != aShortArray1349)
					for (var6 = 0; var6 < aShortArray1349.length; ++var6)
						var5.method1001(aShortArray1349[var6], aShortArray1350[var6]);

				var2 = var5.method1000(64 + anInt1363, 768 + anInt1357, -50, -10, -50);
				var2.aBool1754 = true;
				aClass120_1342.method440(var2, anInt1344);
				return var2;
			}
		}
	}

	public Class109_Sub21_Sub5 method690(final int var1) {
		if ((anIntArray1373 != null) && (var1 > 1)) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3)
				if ((var1 >= anIntArray1360[var3]) && (anIntArray1360[var3] != 0))
					var2 = anIntArray1373[var3];

			if (var2 != -1)
				return Class109_Sub23.method660(var2);
		}

		return this;
	}

	public final boolean method691(final boolean var1) {
		int var2 = anInt1369;
		int var4 = anInt1370;
		if (var1) {
			var2 = anInt1371;
			var4 = anInt1385;
		}

		if (var2 == -1)
			return true;
		else {
			boolean var3 = true;
			if (!aClass104_1379.method389(var2, 0))
				var3 = false;

			if ((var4 != -1) && !aClass104_1379.method389(var4, 0))
				var3 = false;

			return var3;
		}
	}

	void method692(final Class109_Sub21_Sub5 var1, final Class109_Sub21_Sub5 var2) {
		anInt1345 = var1.anInt1345;
		anInt1351 = var1.anInt1351;
		anInt1352 = var1.anInt1352;
		anInt1353 = var1.anInt1353;
		anInt1354 = var1.anInt1354;
		anInt1355 = var1.anInt1355;
		anInt1346 = var1.anInt1346;
		aShortArray1347 = var1.aShortArray1347;
		aShortArray1348 = var1.aShortArray1348;
		aShortArray1349 = var1.aShortArray1349;
		aShortArray1350 = var1.aShortArray1350;
		aString1372 = var2.aString1372;
		aBool1367 = var2.aBool1367;
		anInt1358 = var2.anInt1358;
		anInt1378 = 1;
	}

	void method693(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			anInt1345 = var1.readShort();
		else if (var2 == 2)
			aString1372 = var1.method602();
		else if (var2 == 4)
			anInt1351 = var1.readShort();
		else if (var2 == 5)
			anInt1352 = var1.readShort();
		else if (var2 == 6)
			anInt1353 = var1.readShort();
		else if (var2 == 7) {
			anInt1355 = var1.readShort();
			if (anInt1355 > 32767)
				anInt1355 -= 65536;
		} else if (var2 == 8) {
			anInt1346 = var1.readShort();
			if (anInt1346 > 32767)
				anInt1346 -= 65536;
		} else if (var2 == 11)
			anInt1378 = 1;
		else if (var2 == 12)
			anInt1358 = var1.readInt();
		else if (var2 == 16)
			aBool1367 = true;
		else if (var2 == 23) {
			anInt1362 = var1.readShort();
			anInt1364 = var1.method564();
		} else if (var2 == 24)
			anInt1337 = var1.readShort();
		else if (var2 == 25) {
			anInt1365 = var1.readShort();
			anInt1366 = var1.method564();
		} else if (var2 == 26)
			anInt1374 = var1.readShort();
		else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1339[var2 - 30] = var1.method602();
			if (aStringArray1339[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1339[var2 - 30] = null;
		} else if ((var2 >= 35) && (var2 < 40))
			aStringArray1361[var2 - 35] = var1.method602();
		else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.method564();
				aShortArray1347 = new short[var3];
				aShortArray1348 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1347[var4] = (short) var1.readShort();
					aShortArray1348[var4] = (short) var1.readShort();
				}
			} else if (var2 == 41) {
				var3 = var1.method564();
				aShortArray1349 = new short[var3];
				aShortArray1350 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1349[var4] = (short) var1.readShort();
					aShortArray1350[var4] = (short) var1.readShort();
				}
			} else if (var2 == 65)
				aBool1381 = true;
			else if (var2 == 78)
				anInt1336 = var1.readShort();
			else if (var2 == 79)
				anInt1368 = var1.readShort();
			else if (var2 == 90)
				anInt1369 = var1.readShort();
			else if (var2 == 91)
				anInt1371 = var1.readShort();
			else if (var2 == 92)
				anInt1370 = var1.readShort();
			else if (var2 == 93)
				anInt1385 = var1.readShort();
			else if (var2 == 95)
				anInt1354 = var1.readShort();
			else if (var2 == 97)
				anInt1356 = var1.readShort();
			else if (var2 == 98)
				anInt1376 = var1.readShort();
			else if ((var2 >= 100) && (var2 < 110)) {
				if (null == anIntArray1373) {
					anIntArray1373 = new int[10];
					anIntArray1360 = new int[10];
				}

				anIntArray1373[var2 - 100] = var1.readShort();
				anIntArray1360[var2 - 100] = var1.readShort();
			} else if (var2 == 110)
				anInt1359 = var1.readShort();
			else if (var2 == 111)
				anInt1375 = var1.readShort();
			else if (var2 == 112)
				anInt1377 = var1.readShort();
			else if (var2 == 113)
				anInt1363 = var1.method612();
			else if (var2 == 114)
				anInt1357 = var1.method612() * 5;
			else if (var2 == 115)
				anInt1380 = var1.method564();
			else if (var2 == 139)
				anInt1382 = var1.readShort();
			else if (var2 == 140)
				anInt1383 = var1.readShort();
		}

	}

	public static void method694(final Class104 var0) {
		Class109_Sub21_Sub2.aClass104_1304 = var0;
		Class122.anInt847 = Class109_Sub21_Sub2.aClass104_1304.method401(16);
	}

	public final Class109_Sub21_Sub15_Sub7 method695(final boolean var1) {
		int var2 = anInt1362;
		int var6 = anInt1337;
		int var3 = anInt1336;
		if (var1) {
			var2 = anInt1365;
			var6 = anInt1374;
			var3 = anInt1368;
		}

		if (var2 == -1)
			return null;
		else {
			Class109_Sub21_Sub15_Sub7 var5 = Class109_Sub21_Sub15_Sub7.method984(aClass104_1379, var2, 0);
			if (var6 != -1) {
				final Class109_Sub21_Sub15_Sub7 var8 = Class109_Sub21_Sub15_Sub7.method984(aClass104_1379, var6, 0);
				if (var3 != -1) {
					final Class109_Sub21_Sub15_Sub7 var4 = Class109_Sub21_Sub15_Sub7.method984(aClass104_1379, var3, 0);
					final Class109_Sub21_Sub15_Sub7[] var9 = new Class109_Sub21_Sub15_Sub7[] { var5, var8, var4 };
					var5 = new Class109_Sub21_Sub15_Sub7(var9, 3);
				} else {
					final Class109_Sub21_Sub15_Sub7[] var10 = new Class109_Sub21_Sub15_Sub7[] { var5, var8 };
					var5 = new Class109_Sub21_Sub15_Sub7(var10, 2);
				}
			}

			if (!var1 && (anInt1364 != 0))
				var5.method992(0, anInt1364, 0);

			if (var1 && (anInt1366 != 0))
				var5.method992(0, anInt1366, 0);

			int var7;
			if (aShortArray1347 != null)
				for (var7 = 0; var7 < aShortArray1347.length; ++var7)
					var5.method1002(aShortArray1347[var7], aShortArray1348[var7]);

			if (aShortArray1349 != null)
				for (var7 = 0; var7 < aShortArray1349.length; ++var7)
					var5.method1001(aShortArray1349[var7], aShortArray1350[var7]);

			return var5;
		}
	}

	public static void method696() {
		Class9.anIntArray92 = null;
		Class9.anIntArray93 = null;
		Class106.anIntArray799 = null;
		Class9.anIntArray94 = null;
		Class35.anIntArray336 = null;
		Class9.aByteArrayArray97 = null;
	}

	static final void method697(final Class109_Sub4 var0) {
		var0.aBool927 = false;
		if (var0.aClass109_Sub3_926 != null)
			var0.aClass109_Sub3_926.anInt919 = 0;

		for (Class109_Sub4 var1 = var0.method509(); null != var1; var1 = var0.method505())
			method697(var1);

	}

	public static void method698(final String[] var0, final short[] var1, final int var2, final int var3) {
		if (var2 < var3) {
			final int var4 = (var3 + var2) / 2;
			int var5 = var2;
			final String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			final short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8)
				if ((null == var6) || ((var0[var8] != null) && (var0[var8].compareTo(var6) < (var8 & 1)))) {
					final String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					final short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method698(var0, var1, var2, var5 - 1);
			method698(var0, var1, 1 + var5, var3);
		}

	}

	public final boolean method699(final boolean var1) {
		int var2 = anInt1362;
		int var4 = anInt1337;
		int var3 = anInt1336;
		if (var1) {
			var2 = anInt1365;
			var4 = anInt1374;
			var3 = anInt1368;
		}

		if (var2 == -1)
			return true;
		else {
			boolean var5 = true;
			if (!aClass104_1379.method389(var2, 0))
				var5 = false;

			if ((var4 != -1) && !aClass104_1379.method389(var4, 0))
				var5 = false;

			if ((var3 != -1) && !aClass104_1379.method389(var3, 0))
				var5 = false;

			return var5;
		}
	}
}
