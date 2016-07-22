public class Class109_Sub21_Sub13 extends Class109_Sub21 {
	public static Class104 aClass104_1509;
	public int anInt1512;
	public static Class104 aClass104_1524;
	static int anInt1544;
	int[] anIntArray1515;
	public String aString1528 = "null";
	public int anInt1514 = 1;
	public int anInt1517 = -1;
	public int anInt1520 = -1;
	public int anInt1529 = -1;
	public int anInt1519 = -1;
	public int anInt1521 = -1;
	public int anInt1522 = -1;
	public int anInt1543 = -1;
	short[] aShortArray1546;
	short[] aShortArray1525;
	short[] aShortArray1526;
	short[] aShortArray1527;
	int[] anIntArray1536;
	public boolean aBool1539 = true;
	public int anInt1530 = -1;
	int anInt1531 = 128;
	int anInt1532 = 128;
	public boolean aBool1540 = false;
	int anInt1534 = 0;
	int anInt1538 = 0;
	public int anInt1533 = -1;
	public int anInt1537 = 32;
	int anInt1518 = -1;
	public boolean aBool1541 = true;
	int anInt1523 = -1;
	public boolean aBool1542 = true;
	public int[] anIntArray1516;
	public boolean aBool1513 = false;
	public int anInt1535 = 30;
	public static Class120 aClass120_1510 = new Class120(64);
	public static Class120 aClass120_1511 = new Class120(50);
	public String[] aStringArray1545 = new String[5];

	static Class109_Sub16 method757(final Class104 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method392(var1);
		return var3 == null ? null : new Class109_Sub16(var3);
	}

	void method758() {
	}

	void method759(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method564();
			if (var2 == 0)
				return;

			method760(var1, var2);
		}
	}

	void method760(final DataBuffer var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.method564();
			anIntArray1515 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1515[var4] = var1.readShort();
		} else if (var2 == 2)
			aString1528 = var1.method602();
		else if (var2 == 12)
			anInt1514 = var1.method564();
		else if (var2 == 13)
			anInt1517 = var1.readShort();
		else if (var2 == 14)
			anInt1520 = var1.readShort();
		else if (var2 == 15)
			anInt1529 = var1.readShort();
		else if (var2 == 16)
			anInt1519 = var1.readShort();
		else if (var2 == 17) {
			anInt1520 = var1.readShort();
			anInt1521 = var1.readShort();
			anInt1522 = var1.readShort();
			anInt1543 = var1.readShort();
		} else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1545[var2 - 30] = var1.method602();
			if (aStringArray1545[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1545[var2 - 30] = null;
		} else if (var2 == 40) {
			var3 = var1.method564();
			aShortArray1546 = new short[var3];
			aShortArray1525 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1546[var4] = (short) var1.readShort();
				aShortArray1525[var4] = (short) var1.readShort();
			}
		} else if (var2 == 41) {
			var3 = var1.method564();
			aShortArray1526 = new short[var3];
			aShortArray1527 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1526[var4] = (short) var1.readShort();
				aShortArray1527[var4] = (short) var1.readShort();
			}
		} else if (var2 == 60) {
			var3 = var1.method564();
			anIntArray1536 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1536[var4] = var1.readShort();
		} else if (var2 == 93)
			aBool1539 = false;
		else if (var2 == 95)
			anInt1530 = var1.readShort();
		else if (var2 == 97)
			anInt1531 = var1.readShort();
		else if (var2 == 98)
			anInt1532 = var1.readShort();
		else if (var2 == 99)
			aBool1540 = true;
		else if (var2 == 100)
			anInt1534 = var1.method612();
		else if (var2 == 101)
			anInt1538 = var1.method612() * 5;
		else if (var2 == 102)
			anInt1533 = var1.readShort();
		else if (var2 == 103)
			anInt1537 = var1.readShort();
		else if (var2 == 106) {
			anInt1518 = var1.readShort();
			if (anInt1518 == '\uffff')
				anInt1518 = -1;

			anInt1523 = var1.readShort();
			if (anInt1523 == '\uffff')
				anInt1523 = -1;

			var3 = var1.method564();
			anIntArray1516 = new int[1 + var3];

			for (var4 = 0; var4 <= var3; ++var4) {
				anIntArray1516[var4] = var1.readShort();
				if (anIntArray1516[var4] == '\uffff')
					anIntArray1516[var4] = -1;
			}
		} else if (var2 == 107)
			aBool1541 = false;
		else if (var2 == 109)
			aBool1542 = false;
		else if (var2 == 111)
			aBool1513 = true;
		else if (var2 == 112)
			anInt1535 = var1.method564();

	}

	public final Class109_Sub21_Sub15_Sub4 method761(final Class109_Sub21_Sub7 var1, final int var2,
			final Class109_Sub21_Sub7 var3, final int var4) {
		if (null != anIntArray1516) {
			final Class109_Sub21_Sub13 var12 = method763();
			return null == var12 ? null : var12.method761(var1, var2, var3, var4);
		} else {
			Class109_Sub21_Sub15_Sub4 var7 = (Class109_Sub21_Sub15_Sub4) aClass120_1511.method438(anInt1512);
			if (null == var7) {
				boolean var8 = false;

				for (int var9 = 0; var9 < anIntArray1515.length; ++var9)
					if (!aClass104_1509.method389(anIntArray1515[var9], 0))
						var8 = true;

				if (var8)
					return null;

				final Class109_Sub21_Sub15_Sub7[] var10 = new Class109_Sub21_Sub15_Sub7[anIntArray1515.length];

				int var6;
				for (var6 = 0; var6 < anIntArray1515.length; ++var6)
					var10[var6] = Class109_Sub21_Sub15_Sub7.method984(aClass104_1509, anIntArray1515[var6], 0);

				Class109_Sub21_Sub15_Sub7 var11;
				if (var10.length == 1)
					var11 = var10[0];
				else
					var11 = new Class109_Sub21_Sub15_Sub7(var10, var10.length);

				if (aShortArray1546 != null)
					for (var6 = 0; var6 < aShortArray1546.length; ++var6)
						var11.method1002(aShortArray1546[var6], aShortArray1525[var6]);

				if (aShortArray1526 != null)
					for (var6 = 0; var6 < aShortArray1526.length; ++var6)
						var11.method1001(aShortArray1526[var6], aShortArray1527[var6]);

				var7 = var11.method1000(anInt1534 + 64, 850 + anInt1538, -30, -50, -30);
				aClass120_1511.method440(var7, anInt1512);
			}

			Class109_Sub21_Sub15_Sub4 var5;
			if ((null != var1) && (var3 != null))
				var5 = var1.method708(var7, var2, var3, var4);
			else if (var1 != null)
				var5 = var1.method706(var7, var2);
			else if (null != var3)
				var5 = var3.method706(var7, var4);
			else
				var5 = var7.method952(true);

			if ((anInt1531 != 128) || (anInt1532 != 128))
				var5.method946(anInt1531, anInt1532, anInt1531);

			return var5;
		}
	}

	public final Class109_Sub21_Sub15_Sub7 method762() {
		if (anIntArray1516 != null) {
			final Class109_Sub21_Sub13 var1 = method763();
			return null == var1 ? null : var1.method762();
		} else if (anIntArray1536 == null)
			return null;
		else {
			boolean var4 = false;

			for (int var5 = 0; var5 < anIntArray1536.length; ++var5)
				if (!aClass104_1509.method389(anIntArray1536[var5], 0))
					var4 = true;

			if (var4)
				return null;
			else {
				final Class109_Sub21_Sub15_Sub7[] var7 = new Class109_Sub21_Sub15_Sub7[anIntArray1536.length];

				for (int var6 = 0; var6 < anIntArray1536.length; ++var6)
					var7[var6] = Class109_Sub21_Sub15_Sub7.method984(aClass104_1509, anIntArray1536[var6], 0);

				Class109_Sub21_Sub15_Sub7 var2;
				if (var7.length == 1)
					var2 = var7[0];
				else
					var2 = new Class109_Sub21_Sub15_Sub7(var7, var7.length);

				int var3;
				if (aShortArray1546 != null)
					for (var3 = 0; var3 < aShortArray1546.length; ++var3)
						var2.method1002(aShortArray1546[var3], aShortArray1525[var3]);

				if (aShortArray1526 != null)
					for (var3 = 0; var3 < aShortArray1526.length; ++var3)
						var2.method1001(aShortArray1526[var3], aShortArray1527[var3]);

				return var2;
			}
		}
	}

	public final Class109_Sub21_Sub13 method763() {
		int var1 = -1;
		if (anInt1518 != -1)
			var1 = Class44.method230(anInt1518, (byte) -127);
		else if (anInt1523 != -1)
			var1 = Class106.anIntArray798[anInt1523];

		return (var1 >= 0) && (var1 < anIntArray1516.length) && (anIntArray1516[var1] != -1)
				? Class122.method444(anIntArray1516[var1]) : null;
	}

	public static void method764(final Class104 var0, final int var1) {
		Class109_Sub21_Sub1.aClass104_1294 = var0;
	}

	public boolean method765() {
		if (anIntArray1516 == null)
			return true;
		else {
			int var1 = -1;
			if (anInt1518 != -1)
				var1 = Class44.method230(anInt1518, (byte) -113);
			else if (anInt1523 != -1)
				var1 = Class106.anIntArray798[anInt1523];

			return (var1 >= 0) && (var1 < anIntArray1516.length) && (anIntArray1516[var1] != -1);
		}
	}

	static final void method766(final boolean var0) {
		final int var1 = client.anInt2128;
		final int var3 = LoginEncoder.anInt524;
		final int var2 = Class109_Sub21_Sub15_Sub5.anInt1815;
		if (Class108.method412(var1))
			Class109_Sub21_Sub16.method836(Class109_Sub20.aClass109_Sub20ArrayArray1150[var1], -1, var3, var2, var0);

	}

	static final void method767() {
		final int var0 = client.gameBuffer.method844(8);
		int var2;
		if (var0 < client.anInt2087)
			for (var2 = var0; var2 < client.anInt2087; ++var2)
				client.anIntArray2095[++client.anInt2028 - 1] = client.anIntArray2134[var2];

		if (var0 > client.anInt2087)
			throw new RuntimeException("");
		else {
			client.anInt2087 = 0;

			for (var2 = 0; var2 < var0; ++var2) {
				final int var3 = client.anIntArray2134[var2];
				final Class109_Sub21_Sub15_Sub3_Sub2 var1 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var3];
				final int var6 = client.gameBuffer.method844(1);
				if (var6 == 0) {
					client.anIntArray2134[++client.anInt2087 - 1] = var3;
					var1.anInt1700 = client.anInt1979;
				} else {
					final int var4 = client.gameBuffer.method844(2);
					if (var4 == 0) {
						client.anIntArray2134[++client.anInt2087 - 1] = var3;
						var1.anInt1700 = client.anInt1979;
						client.anIntArray2186[++client.anInt2089 - 1] = var3;
					} else {
						int var5;
						int var7;
						if (var4 == 1) {
							client.anIntArray2134[++client.anInt2087 - 1] = var3;
							var1.anInt1700 = client.anInt1979;
							var7 = client.gameBuffer.method844(3);
							var1.method896(var7, false);
							var5 = client.gameBuffer.method844(1);
							if (var5 == 1)
								client.anIntArray2186[++client.anInt2089 - 1] = var3;
						} else if (var4 == 2) {
							client.anIntArray2134[++client.anInt2087 - 1] = var3;
							var1.anInt1700 = client.anInt1979;
							var7 = client.gameBuffer.method844(3);
							var1.method896(var7, true);
							var5 = client.gameBuffer.method844(3);
							var1.method896(var5, true);
							final int var8 = client.gameBuffer.method844(1);
							if (var8 == 1)
								client.anIntArray2186[++client.anInt2089 - 1] = var3;
						} else if (var4 == 3)
							client.anIntArray2095[++client.anInt2028 - 1] = var3;
					}
				}
			}

		}
	}
}
