import java.awt.Canvas;

public class Class109_Sub21_Sub10 extends Class109_Sub21 {
	static Class104 aClass104_1425;
	public int anInt1431;
	public static Canvas aCanvas1472;
	static Class104 aClass104_1473;
	public int anInt1424 = -1;
	public int anInt1463 = -1;
	public String aString1434 = "null";
	int[] anIntArray1433;
	int[] anIntArray1432;
	public int anInt1440 = 1;
	public int anInt1435 = 1;
	public int anInt1438 = 2;
	public boolean aBool1450 = true;
	int anInt1460 = -1;
	boolean aBool1444 = false;
	public boolean aBool1445 = false;
	public int anInt1446 = -1;
	public int anInt1448 = 16;
	int anInt1437 = 0;
	int anInt1441 = 0;
	short[] aShortArray1430;
	short[] aShortArray1436;
	short[] aShortArray1468;
	short[] aShortArray1442;
	public int anInt1451 = -1;
	boolean aBool1453 = false;
	public boolean aBool1443 = true;
	int anInt1455 = 128;
	int anInt1467 = 128;
	int anInt1457 = 128;
	public int anInt1452 = -1;
	int anInt1458 = 0;
	int anInt1459 = 0;
	int anInt1439 = 0;
	public boolean aBool1461 = false;
	boolean aBool1462 = false;
	int anInt1465 = -1;
	public int anInt1447 = -1;
	public int anInt1449 = 0;
	int anInt1466 = -1;
	public int anInt1469 = 0;
	public int anInt1470 = 0;
	public int[] anIntArray1471;
	public int[] anIntArray1464;
	static boolean aBool1456 = false;
	public static Class120 aClass120_1454 = new Class120(64);
	public static Class120 aClass120_1427 = new Class120(500);
	public static Class120 aClass120_1428 = new Class120(30);
	public static Class120 aClass120_1429 = new Class120(30);
	static Class109_Sub21_Sub15_Sub7[] aClass109_Sub21_Sub15_Sub7Array1423 = new Class109_Sub21_Sub15_Sub7[4];
	public String[] aStringArray1426 = new String[5];

	void method725() {
		if (anInt1424 == -1) {
			anInt1424 = 0;
			if ((anIntArray1432 != null) && ((null == anIntArray1433) || (anIntArray1433[0] == 10)))
				anInt1424 = 1;

			for (int var1 = 0; var1 < 5; ++var1)
				if (null != aStringArray1426[var1])
					anInt1424 = 1;
		}

		if (anInt1463 == -1)
			anInt1463 = anInt1438 != 0 ? 1 : 0;

	}

	void method726(final DataBuffer var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.method564();
			if (var3 > 0)
				if ((anIntArray1432 != null) && !aBool1456)
					var1.position += var3 * 3;
				else {
					anIntArray1433 = new int[var3];
					anIntArray1432 = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						anIntArray1432[var4] = var1.method566();
						anIntArray1433[var4] = var1.method564();
					}
				}
		} else if (var2 == 2)
			aString1434 = var1.method602();
		else if (var2 == 5) {
			var3 = var1.method564();
			if (var3 > 0)
				if ((anIntArray1432 != null) && !aBool1456)
					var1.position += 2 * var3;
				else {
					anIntArray1433 = null;
					anIntArray1432 = new int[var3];

					for (var4 = 0; var4 < var3; ++var4)
						anIntArray1432[var4] = var1.method566();
				}
		} else if (var2 == 14)
			anInt1440 = var1.method564();
		else if (var2 == 15)
			anInt1435 = var1.method564();
		else if (var2 == 17) {
			anInt1438 = 0;
			aBool1450 = false;
		} else if (var2 == 18)
			aBool1450 = false;
		else if (var2 == 19)
			anInt1424 = var1.method564();
		else if (var2 == 21)
			anInt1460 = 0;
		else if (var2 == 22)
			aBool1444 = true;
		else if (var2 == 23)
			aBool1445 = true;
		else if (var2 == 24) {
			anInt1446 = var1.method566();
			if (anInt1446 == '\uffff')
				anInt1446 = -1;
		} else if (var2 == 27)
			anInt1438 = 1;
		else if (var2 == 28)
			anInt1448 = var1.method564();
		else if (var2 == 29)
			anInt1437 = var1.method612();
		else if (var2 == 39)
			anInt1441 = var1.method612() * 25;
		else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1426[var2 - 30] = var1.method602();
			if (aStringArray1426[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1426[var2 - 30] = null;
		} else if (var2 == 40) {
			var3 = var1.method564();
			aShortArray1430 = new short[var3];
			aShortArray1436 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1430[var4] = (short) var1.method566();
				aShortArray1436[var4] = (short) var1.method566();
			}
		} else if (var2 == 41) {
			var3 = var1.method564();
			aShortArray1468 = new short[var3];
			aShortArray1442 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1468[var4] = (short) var1.method566();
				aShortArray1442[var4] = (short) var1.method566();
			}
		} else if (var2 == 60)
			anInt1451 = var1.method566();
		else if (var2 == 62)
			aBool1453 = true;
		else if (var2 == 64)
			aBool1443 = false;
		else if (var2 == 65)
			anInt1455 = var1.method566();
		else if (var2 == 66)
			anInt1467 = var1.method566();
		else if (var2 == 67)
			anInt1457 = var1.method566();
		else if (var2 == 68)
			anInt1452 = var1.method566();
		else if (var2 == 69)
			var1.method564();
		else if (var2 == 70)
			anInt1458 = var1.method575();
		else if (var2 == 71)
			anInt1459 = var1.method575();
		else if (var2 == 72)
			anInt1439 = var1.method575();
		else if (var2 == 73)
			aBool1461 = true;
		else if (var2 == 74)
			aBool1462 = true;
		else if (var2 == 75)
			anInt1463 = var1.method564();
		else if (var2 == 77) {
			anInt1465 = var1.method566();
			if (anInt1465 == '\uffff')
				anInt1465 = -1;

			anInt1466 = var1.method566();
			if (anInt1466 == '\uffff')
				anInt1466 = -1;

			var3 = var1.method564();
			anIntArray1464 = new int[1 + var3];

			for (var4 = 0; var4 <= var3; ++var4) {
				anIntArray1464[var4] = var1.method566();
				if (anIntArray1464[var4] == '\uffff')
					anIntArray1464[var4] = -1;
			}
		} else if (var2 == 78) {
			anInt1447 = var1.method566();
			anInt1449 = var1.method564();
		} else if (var2 == 79) {
			anInt1469 = var1.method566();
			anInt1470 = var1.method566();
			anInt1449 = var1.method564();
			var3 = var1.method564();
			anIntArray1471 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1471[var4] = var1.method566();
		} else if (var2 == 81)
			anInt1460 = var1.method564() * 256;

	}

	public final boolean method727(final int var1) {
		if (null != anIntArray1433) {
			for (int var4 = 0; var4 < anIntArray1433.length; ++var4)
				if (var1 == anIntArray1433[var4])
					return aClass104_1425.method389(anIntArray1432[var4] & '\uffff', 0);

			return true;
		} else if (anIntArray1432 == null)
			return true;
		else if (var1 != 10)
			return true;
		else {
			boolean var2 = true;

			for (final int element : anIntArray1432)
				var2 &= aClass104_1425.method389(element & '\uffff', 0);

			return var2;
		}
	}

	public final Class109_Sub21_Sub15_Sub4 method728(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6, final Class109_Sub21_Sub7 var7, final int var8) {
		long var10;
		if (anIntArray1433 == null)
			var10 = (anInt1431 << 10) + var2;
		else
			var10 = (anInt1431 << 10) + (var1 << 3) + var2;

		Class109_Sub21_Sub15_Sub4 var9 = (Class109_Sub21_Sub15_Sub4) aClass120_1429.method438(var10);
		if (var9 == null) {
			final Class109_Sub21_Sub15_Sub7 var12 = method729(var1, var2);
			if (null == var12)
				return null;

			var9 = var12.method1000(64 + anInt1437, 768 + anInt1441, -50, -10, -50);
			aClass120_1429.method440(var9, var10);
		}

		if ((null == var7) && (anInt1460 == -1))
			return var9;
		else {
			if (null != var7)
				var9 = var7.method707(var9, var8, var2);
			else
				var9 = var9.method952(true);

			if (anInt1460 >= 0)
				var9 = var9.method934(var3, var4, var5, var6, false, anInt1460);

			return var9;
		}
	}

	final Class109_Sub21_Sub15_Sub7 method729(final int var1, int var2) {
		Class109_Sub21_Sub15_Sub7 var3 = null;
		int var5;
		boolean var6;
		int var7;
		if (null == anIntArray1433) {
			if (var1 != 10)
				return null;

			if (null == anIntArray1432)
				return null;

			var6 = aBool1453;
			if ((var1 == 2) && (var2 > 3))
				var6 = !var6;

			var7 = anIntArray1432.length;

			for (int var4 = 0; var4 < var7; ++var4) {
				var5 = anIntArray1432[var4];
				if (var6)
					var5 += 65536;

				var3 = (Class109_Sub21_Sub15_Sub7) aClass120_1427.method438(var5);
				if (var3 == null) {
					var3 = Class109_Sub21_Sub15_Sub7.method984(aClass104_1425, var5 & '\uffff', 0);
					if (var3 == null)
						return null;

					if (var6)
						var3.method1005();

					aClass120_1427.method440(var3, var5);
				}

				if (var7 > 1)
					aClass109_Sub21_Sub15_Sub7Array1423[var4] = var3;
			}

			if (var7 > 1)
				var3 = new Class109_Sub21_Sub15_Sub7(aClass109_Sub21_Sub15_Sub7Array1423, var7);
		} else {
			int var10 = -1;

			for (var7 = 0; var7 < anIntArray1433.length; ++var7)
				if (anIntArray1433[var7] == var1) {
					var10 = var7;
					break;
				}

			if (var10 == -1)
				return null;

			var7 = anIntArray1432[var10];
			final boolean var9 = aBool1453 ^ (var2 > 3);
			if (var9)
				var7 += 65536;

			var3 = (Class109_Sub21_Sub15_Sub7) aClass120_1427.method438(var7);
			if (null == var3) {
				var3 = Class109_Sub21_Sub15_Sub7.method984(aClass104_1425, var7 & '\uffff', 0);
				if (var3 == null)
					return null;

				if (var9)
					var3.method1005();

				aClass120_1427.method440(var3, var7);
			}
		}

		if ((anInt1455 == 128) && (anInt1467 == 128) && (anInt1457 == 128))
			var6 = false;
		else
			var6 = true;

		boolean var11;
		if ((anInt1458 == 0) && (anInt1459 == 0) && (anInt1439 == 0))
			var11 = false;
		else
			var11 = true;

		final Class109_Sub21_Sub15_Sub7 var8 = new Class109_Sub21_Sub15_Sub7(var3, (var2 == 0) && !var6 && !var11,
				aShortArray1430 == null, null == aShortArray1468, true);
		if ((var1 == 4) && (var2 > 3)) {
			var8.method986(256);
			var8.method992(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1)
			var8.method989();
		else if (var2 == 2)
			var8.method990();
		else if (var2 == 3)
			var8.method991();

		if (aShortArray1430 != null)
			for (var5 = 0; var5 < aShortArray1430.length; ++var5)
				var8.method1002(aShortArray1430[var5], aShortArray1436[var5]);

		if (aShortArray1468 != null)
			for (var5 = 0; var5 < aShortArray1468.length; ++var5)
				var8.method1001(aShortArray1468[var5], aShortArray1442[var5]);

		if (var6)
			var8.method993(anInt1455, anInt1467, anInt1457);

		if (var11)
			var8.method992(anInt1458, anInt1459, anInt1439);

		return var8;
	}

	public boolean method730() {
		if (anIntArray1464 == null)
			return (anInt1447 != -1) || (anIntArray1471 != null);
		else {
			for (final int element : anIntArray1464)
				if (element != -1) {
					final Class109_Sub21_Sub10 var2 = Class28.method128(element);
					if ((var2.anInt1447 != -1) || (var2.anIntArray1471 != null))
						return true;
				}

			return false;
		}
	}

	void method731(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method564();
			if (var2 == 0)
				return;

			method726(var1, var2);
		}
	}

	public final Class109_Sub21_Sub10 method732() {
		int var1 = -1;
		if (anInt1465 != -1)
			var1 = Class44.method230(anInt1465, (byte) -14);
		else if (anInt1466 != -1)
			var1 = Class106.anIntArray798[anInt1466];

		return (var1 >= 0) && (var1 < anIntArray1464.length) && (anIntArray1464[var1] != -1)
				? Class28.method128(anIntArray1464[var1]) : null;
	}

	public final Class109_Sub21_Sub15 method733(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6) {
		long var8;
		if (anIntArray1433 == null)
			var8 = (anInt1431 << 10) + var2;
		else
			var8 = (var1 << 3) + (anInt1431 << 10) + var2;

		Object var7 = aClass120_1428.method438(var8);
		if (null == var7) {
			final Class109_Sub21_Sub15_Sub7 var10 = method729(var1, var2);
			if (var10 == null)
				return null;

			if (!aBool1444)
				var7 = var10.method1000(64 + anInt1437, anInt1441 + 768, -50, -10, -50);
			else {
				var10.aShort1882 = (short) (64 + anInt1437);
				var10.aShort1883 = (short) (768 + anInt1441);
				var10.method994();
				var7 = var10;
			}

			aClass120_1428.method440((Class109_Sub21) var7, var8);
		}

		if (aBool1444)
			var7 = ((Class109_Sub21_Sub15_Sub7) var7).method987();

		if (anInt1460 >= 0)
			if (var7 instanceof Class109_Sub21_Sub15_Sub4)
				var7 = ((Class109_Sub21_Sub15_Sub4) var7).method934(var3, var4, var5, var6, true, anInt1460);
			else if (var7 instanceof Class109_Sub21_Sub15_Sub7)
				var7 = ((Class109_Sub21_Sub15_Sub7) var7).method988(var3, var4, var5, var6, true, anInt1460);

		return (Class109_Sub21_Sub15) var7;
	}

	public final Class109_Sub21_Sub15_Sub4 method734(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6) {
		long var7;
		if (null == anIntArray1433)
			var7 = (anInt1431 << 10) + var2;
		else
			var7 = var2 + (var1 << 3) + (anInt1431 << 10);

		Class109_Sub21_Sub15_Sub4 var9 = (Class109_Sub21_Sub15_Sub4) aClass120_1429.method438(var7);
		if (var9 == null) {
			final Class109_Sub21_Sub15_Sub7 var10 = method729(var1, var2);
			if (var10 == null)
				return null;

			var9 = var10.method1000(anInt1437 + 64, anInt1441 + 768, -50, -10, -50);
			aClass120_1429.method440(var9, var7);
		}

		if (anInt1460 >= 0)
			var9 = var9.method934(var3, var4, var5, var6, true, anInt1460);

		return var9;
	}

	public final boolean method735() {
		if (null == anIntArray1432)
			return true;
		else {
			boolean var1 = true;

			for (final int element : anIntArray1432)
				var1 &= aClass104_1425.method389(element & '\uffff', 0);

			return var1;
		}
	}

	static final void method736(int var0, int var1, int var2, int var3, final boolean var4) {
		if (var2 < 1)
			var2 = 1;

		if (var3 < 1)
			var3 = 1;

		int var6 = var3 - 334;
		if (var6 < 0)
			var6 = 0;
		else if (var6 > 100)
			var6 = 100;

		int var8 = (((client.aShort2066 - client.aShort2147) * var6) / 100) + client.aShort2147;
		final int var7 = (var3 * var8 * 512) / (334 * var2);
		int var5;
		int var9;
		short var14;
		if (var7 < client.aShort2230) {
			var14 = client.aShort2230;
			var8 = (334 * var2 * var14) / (512 * var3);
			if (var8 > client.aShort2229) {
				var8 = client.aShort2229;
				var9 = (var8 * var3 * 512) / (var14 * 334);
				var5 = (var2 - var9) / 2;
				if (var4) {
					Class109_Sub21_Sub14.method786();
					Class109_Sub21_Sub14.method773(var0, var1, var5, var3, -16777216);
					Class109_Sub21_Sub14.method773((var2 + var0) - var5, var1, var5, var3, -16777216);
				}

				var0 += var5;
				var2 -= var5 * 2;
			}
		} else if (var7 > client.aShort2094) {
			var14 = client.aShort2094;
			var8 = (var2 * var14 * 334) / (512 * var3);
			if (var8 < client.aShort1998) {
				var8 = client.aShort1998;
				var9 = (334 * var14 * var2) / (512 * var8);
				var5 = (var3 - var9) / 2;
				if (var4) {
					Class109_Sub21_Sub14.method786();
					Class109_Sub21_Sub14.method773(var0, var1, var2, var5, -16777216);
					Class109_Sub21_Sub14.method773(var0, (var3 + var1) - var5, var2, var5, -16777216);
				}

				var1 += var5;
				var3 -= var5 * 2;
			}
		}

		client.anInt2236 = ((var8 * var3) / 334) << 1;
		if ((var2 != client.anInt2234) || (var3 != client.anInt2101)) {
			final int[] var10 = new int[9];

			for (var5 = 0; var5 < 9; ++var5) {
				final int var11 = 15 + 128 + (var5 * 32);
				final int var13 = (var11 * 3) + 600;
				final int var12 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var11];
				var10[var5] = (var12 * var13) >> 16;
			}

			Class42.method217(var10, 500, 800, var2, var3);
		}

		client.anInt2232 = var0;
		client.anInt2097 = var1;
		client.anInt2234 = var2;
		client.anInt2101 = var3;
	}

	static Class109_Sub21_Sub14_Sub1[] method737() {
		final Class109_Sub21_Sub14_Sub1[] var0 = new Class109_Sub21_Sub14_Sub1[Class9.anInt95];

		for (int var2 = 0; var2 < Class9.anInt95; ++var2) {
			final Class109_Sub21_Sub14_Sub1 var1 = var0[var2] = new Class109_Sub21_Sub14_Sub1();
			var1.anInt1712 = Canvas_Sub1.anInt1594;
			var1.anInt1716 = Class9.anInt96;
			var1.anInt1715 = Class9.anIntArray92[var2];
			var1.anInt1717 = Class9.anIntArray93[var2];
			var1.anInt1713 = Class106.anIntArray799[var2];
			var1.anInt1714 = Class9.anIntArray94[var2];
			var1.anIntArray1718 = Class35.anIntArray336;
			var1.aByteArray1711 = Class9.aByteArrayArray97[var2];
		}

		Class109_Sub21_Sub5.method696();
		return var0;
	}

	public static Class90 method738(final int var0) {
		final Class90[] var1 = Class41.method175();

		for (final Class90 var3 : var1) {
			if (var0 == var3.anInt684)
				return var3;
		}

		return null;
	}
}
