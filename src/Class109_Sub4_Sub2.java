public class Class109_Sub4_Sub2 extends Class109_Sub4 {
	int anInt1561;
	int anInt1568;
	boolean aBool1572;
	int anInt1569;
	int anInt1559;
	int anInt1562;
	int anInt1573;
	int anInt1563;
	int anInt1564;
	int anInt1565;
	int anInt1566;
	int anInt1570;
	int anInt1571;
	int anInt1567;
	int anInt1560;

	@Override
	int method507() {
		int var1 = (anInt1563 * 3) >> 6;
		var1 = (var1 ^ (var1 >> 31)) + (var1 >>> 31);
		if (anInt1566 == 0)
			var1 -= (var1 * anInt1573) / (((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550.length << 8);
		else if (anInt1566 >= 0)
			var1 -= (var1 * anInt1561) / ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550.length;

		return var1 > 255 ? 255 : var1;
	}

	Class109_Sub4_Sub2(final Class109_Sub3_Sub1 var1, final int var2, final int var3) {
		aClass109_Sub3_926 = var1;
		anInt1561 = var1.anInt1548;
		anInt1568 = var1.anInt1547;
		aBool1572 = var1.aBool1551;
		anInt1569 = var2;
		anInt1559 = var3;
		anInt1562 = 8192;
		anInt1573 = 0;
		method788();
	}

	Class109_Sub4_Sub2(final Class109_Sub3_Sub1 var1, final int var2, final int var3, final int var4) {
		aClass109_Sub3_926 = var1;
		anInt1561 = var1.anInt1548;
		anInt1568 = var1.anInt1547;
		aBool1572 = var1.aBool1551;
		anInt1569 = var2;
		anInt1559 = var3;
		anInt1562 = var4;
		anInt1573 = 0;
		method788();
	}

	public static Class109_Sub4_Sub2 method787(final Class109_Sub3_Sub1 var0, final int var1, final int var2) {
		return (var0.aByteArray1550 != null) && (var0.aByteArray1550.length != 0) ? new Class109_Sub4_Sub2(var0,
				(int) ((var0.anInt1549 * 256L * var1) / (Class122.anInt848 * 100)), var2 << 6) : null;
	}

	void method788() {
		anInt1563 = anInt1559;
		anInt1564 = method803(anInt1559, anInt1562);
		anInt1565 = method822(anInt1559, anInt1562);
	}

	public synchronized void method789(final int var1) {
		anInt1566 = var1;
	}

	public synchronized void method790(final int var1) {
		method825(var1 << 6, method793());
	}

	synchronized void method791(final int var1) {
		method825(var1, method793());
	}

	public synchronized int method792() {
		return anInt1559 == Integer.MIN_VALUE ? 0 : anInt1559;
	}

	public synchronized int method793() {
		return anInt1562 < 0 ? -1 : anInt1562;
	}

	void method794() {
		if (anInt1570 != 0) {
			if (anInt1559 == Integer.MIN_VALUE)
				anInt1559 = 0;

			anInt1570 = 0;
			method788();
		}

	}

	public synchronized void method795(final int var1, final int var2) {
		method796(var1, var2, method793());
	}

	public synchronized void method796(int var1, final int var2, final int var3) {
		if (var1 == 0)
			method825(var2, var3);
		else {
			final int var6 = method803(var2, var3);
			final int var4 = method822(var2, var3);
			if ((anInt1564 == var6) && (anInt1565 == var4))
				anInt1570 = 0;
			else {
				int var5 = var2 - anInt1563;
				if ((anInt1563 - var2) > var5)
					var5 = anInt1563 - var2;

				if ((var6 - anInt1564) > var5)
					var5 = var6 - anInt1564;

				if ((anInt1564 - var6) > var5)
					var5 = anInt1564 - var6;

				if ((var4 - anInt1565) > var5)
					var5 = var4 - anInt1565;

				if ((anInt1565 - var4) > var5)
					var5 = anInt1565 - var4;

				if (var1 > var5)
					var1 = var5;

				anInt1570 = var1;
				anInt1559 = var2;
				anInt1562 = var3;
				anInt1571 = (var2 - anInt1563) / var1;
				anInt1567 = (var6 - anInt1564) / var1;
				anInt1560 = (var4 - anInt1565) / var1;
			}
		}
	}

	public synchronized void method797(int var1) {
		if (var1 == 0) {
			method791(0);
			method413();
		} else if ((anInt1564 == 0) && (anInt1565 == 0)) {
			anInt1570 = 0;
			anInt1559 = 0;
			anInt1563 = 0;
			method413();
		} else {
			int var2 = -anInt1563;
			if (anInt1563 > var2)
				var2 = anInt1563;

			if (-anInt1564 > var2)
				var2 = -anInt1564;

			if (anInt1564 > var2)
				var2 = anInt1564;

			if (-anInt1565 > var2)
				var2 = -anInt1565;

			if (anInt1565 > var2)
				var2 = anInt1565;

			if (var1 > var2)
				var1 = var2;

			anInt1570 = var1;
			anInt1559 = Integer.MIN_VALUE;
			anInt1571 = -anInt1563 / var1;
			anInt1567 = -anInt1564 / var1;
			anInt1560 = -anInt1565 / var1;
		}
	}

	public synchronized int method798() {
		return anInt1569 < 0 ? -anInt1569 : anInt1569;
	}

	public boolean method799() {
		return (anInt1573 < 0) || (anInt1573 >= (((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550.length << 8));
	}

	@Override
	protected Class109_Sub4 method509() {
		return null;
	}

	@Override
	protected Class109_Sub4 method505() {
		return null;
	}

	@Override
	protected int method506() {
		return (anInt1559 == 0) && (anInt1570 == 0) ? 0 : 1;
	}

	int method800(final int[] var1, int var2, final int var3, final int var4, final int var5) {
		while (true) {
			if (anInt1570 > 0) {
				int var6 = var2 + anInt1570;
				if (var6 > var4)
					var6 = var4;

				anInt1570 += var2;
				if ((anInt1569 == 256) && ((anInt1573 & 255) == 0)) {
					if (Class31.aBool308)
						var2 = method815(0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573,
								var2, anInt1564, anInt1565, anInt1567, anInt1560, 0, var6, var3, this);
					else
						var2 = method814(((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573,
								var2, anInt1563, anInt1571, 0, var6, var3, this);
				} else if (Class31.aBool308)
					var2 = method811(0, 0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573,
							var2, anInt1564, anInt1565, anInt1567, anInt1560, 0, var6, var3, this, anInt1569, var5);
				else
					var2 = method810(0, 0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573,
							var2, anInt1563, anInt1571, 0, var6, var3, this, anInt1569, var5);

				anInt1570 -= var2;
				if (anInt1570 != 0)
					return var2;

				if (!method823())
					continue;

				return var4;
			}

			if ((anInt1569 == 256) && ((anInt1573 & 255) == 0)) {
				if (Class31.aBool308)
					return method802(0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573, var2,
							anInt1564, anInt1565, 0, var4, var3, this);

				return method824(((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573, var2,
						anInt1563, 0, var4, var3, this);
			}

			if (Class31.aBool308)
				return method826(0, 0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573, var2,
						anInt1564, anInt1565, 0, var4, var3, this, anInt1569, var5);

			return method806(0, 0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573, var2,
					anInt1563, 0, var4, var3, this, anInt1569, var5);
		}
	}

	int method801(final int[] var1, int var2, final int var3, final int var4, final int var5) {
		while (true) {
			if (anInt1570 > 0) {
				int var6 = var2 + anInt1570;
				if (var6 > var4)
					var6 = var4;

				anInt1570 += var2;
				if ((anInt1569 == -256) && ((anInt1573 & 255) == 0)) {
					if (Class31.aBool308)
						var2 = method809(0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573,
								var2, anInt1564, anInt1565, anInt1567, anInt1560, 0, var6, var3, this);
					else
						var2 = method821(((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573,
								var2, anInt1563, anInt1571, 0, var6, var3, this);
				} else if (Class31.aBool308)
					var2 = method813(0, 0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573,
							var2, anInt1564, anInt1565, anInt1567, anInt1560, 0, var6, var3, this, anInt1569, var5);
				else
					var2 = method812(0, 0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573,
							var2, anInt1563, anInt1571, 0, var6, var3, this, anInt1569, var5);

				anInt1570 -= var2;
				if (anInt1570 != 0)
					return var2;

				if (!method823())
					continue;

				return var4;
			}

			if ((anInt1569 == -256) && ((anInt1573 & 255) == 0)) {
				if (Class31.aBool308)
					return method805(0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573, var2,
							anInt1564, anInt1565, 0, var4, var3, this);

				return method804(((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573, var2,
						anInt1563, 0, var4, var3, this);
			}

			if (Class31.aBool308)
				return method808(0, 0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573, var2,
						anInt1564, anInt1565, 0, var4, var3, this, anInt1569, var5);

			return method807(0, 0, ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550, var1, anInt1573, var2,
					anInt1563, 0, var4, var3, this, anInt1569, var5);
		}
	}

	static int method802(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, final int var8, int var9, final Class109_Sub4_Sub2 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = (var4 + var9) - var3) > var8)
			var7 = var8;

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt1573 = var3 << 8;
		return var4 >> 1;
	}

	static int method803(final int var0, final int var1) {
		return var1 < 0 ? var0 : (int) ((var0 * Math.sqrt((16384 - var1) * 1.220703125E-4D)) + 0.5D);
	}

	static int method804(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			int var7, final Class109_Sub4_Sub2 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = (var3 + var2) - (var7 - 1)) > var6)
			var5 = var6;

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4)
			var10001 = var3++;

		var8.anInt1573 = var2 << 8;
		return var3;
	}

	static int method805(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, final int var8, int var9, final Class109_Sub4_Sub2 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = (var4 + var3) - (var9 - 1)) > var8)
			var7 = var8;

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt1573 = var3 << 8;
		return var4 >> 1;
	}

	static int method806(final int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5,
			final int var6, int var7, final int var8, final int var9, final Class109_Sub4_Sub2 var10, final int var11,
			final int var12) {
		if ((var11 == 0) || ((var7 = var5 + ((((var9 - var4) + var11) - 257) / var11)) > var8))
			var7 = var8;

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var2[var1 + 1] - var13) * (var4 & 255))) * var6) >> 6;
			var4 += var11;
		}

		if ((var11 == 0) || ((var7 = var5 + ((((var9 - var4) + var11) - 1) / var11)) > var8))
			var7 = var8;

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var1 - var13) * (var4 & 255))) * var6) >> 6;
		}

		var10.anInt1573 = var4;
		return var5;
	}

	static int method807(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			int var7, final int var8, final int var9, final Class109_Sub4_Sub2 var10, final int var11,
			final int var12) {
		if ((var11 == 0) || ((var7 = var5 + ((((var9 + 256) - var4) + var11) / var11)) > var8))
			var7 = var8;

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			final byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var2[var1] - var13) * (var4 & 255))) * var6) >> 6;
			var4 += var11;
		}

		if ((var11 == 0) || ((var7 = var5 + (((var9 - var4) + var11) / var11)) > var8))
			var7 = var8;

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
		}

		var10.anInt1573 = var4;
		return var5;
	}

	static int method808(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			final int var7, int var8, final int var9, final int var10, final Class109_Sub4_Sub2 var11, final int var12,
			final int var13) {
		if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9))
			var8 = var9;

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			final byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + ((var2[var1] - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		if ((var12 == 0) || ((var8 = (var5 >> 1) + (((var10 - var4) + var12) / var12)) > var9))
			var8 = var9;

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + ((var2[var4 >> 8] - var1) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		var11.anInt1573 = var4;
		return var5 >> 1;
	}

	static int method809(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, final int var10, int var11, final Class109_Sub4_Sub2 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var4 + var3) - (var11 - 1)) > var10)
			var9 = var10;

		var12.anInt1563 += var12.anInt1571 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt1564 = var5 >> 2;
		var12.anInt1565 = var6 >> 2;
		var12.anInt1573 = var3 << 8;
		return var4 >> 1;
	}

	static int method810(final int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			final int var7, int var8, final int var9, final int var10, final Class109_Sub4_Sub2 var11, final int var12,
			final int var13) {
		var11.anInt1564 -= var11.anInt1567 * var5;
		var11.anInt1565 -= var11.anInt1560 * var5;
		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9))
			var8 = var9;

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var2[var1 + 1] - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
			var4 += var12;
		}

		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 1) / var12)) > var9))
			var8 = var9;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var1 - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
		}

		var11.anInt1564 += var11.anInt1567 * var5;
		var11.anInt1565 += var11.anInt1560 * var5;
		var11.anInt1563 = var6;
		var11.anInt1573 = var4;
		return var5;
	}

	static int method811(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			int var7, final int var8, final int var9, int var10, final int var11, final int var12,
			final Class109_Sub4_Sub2 var13, final int var14, final int var15) {
		var13.anInt1563 -= var13.anInt1571 * var5;
		if ((var14 == 0) || ((var10 = var5 + ((((var12 - var4) + var14) - 257) / var14)) > var11))
			var10 = var11;

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + ((var2[var1 + 1] - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		if ((var14 == 0) || ((var10 = (var5 >> 1) + ((((var12 - var4) + var14) - 1) / var14)) > var11))
			var10 = var11;

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + ((var1 - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt1563 += var13.anInt1571 * var5;
		var13.anInt1564 = var6;
		var13.anInt1565 = var7;
		var13.anInt1573 = var4;
		return var5;
	}

	static int method812(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			final int var7, int var8, final int var9, final int var10, final Class109_Sub4_Sub2 var11, final int var12,
			final int var13) {
		var11.anInt1564 -= var11.anInt1567 * var5;
		var11.anInt1565 -= var11.anInt1560 * var5;
		if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9))
			var8 = var9;

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			final byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var2[var1] - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
			var4 += var12;
		}

		if ((var12 == 0) || ((var8 = var5 + (((var10 - var4) + var12) / var12)) > var9))
			var8 = var9;

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
		}

		var11.anInt1564 += var11.anInt1567 * var5;
		var11.anInt1565 += var11.anInt1560 * var5;
		var11.anInt1563 = var6;
		var11.anInt1573 = var4;
		return var5;
	}

	static int method813(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			int var7, final int var8, final int var9, int var10, final int var11, final int var12,
			final Class109_Sub4_Sub2 var13, final int var14, final int var15) {
		var13.anInt1563 -= var13.anInt1571 * var5;
		if ((var14 == 0) || ((var10 = var5 + ((((var12 + 256) - var4) + var14) / var14)) > var11))
			var10 = var11;

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			final byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + ((var2[var1] - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		if ((var14 == 0) || ((var10 = (var5 >> 1) + (((var12 - var4) + var14) / var14)) > var11))
			var10 = var11;

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + ((var2[var4 >> 8] - var1) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt1563 += var13.anInt1571 * var5;
		var13.anInt1564 = var6;
		var13.anInt1565 = var7;
		var13.anInt1573 = var4;
		return var5;
	}

	static int method814(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			final int var7, int var8, final Class109_Sub4_Sub2 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var8) - var2) > var7)
			var6 = var7;

		var9.anInt1564 += var9.anInt1567 * (var6 - var3);
		var9.anInt1565 += var9.anInt1560 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.anInt1563 = var4 >> 2;
		var9.anInt1573 = var2 << 8;
		return var3;
	}

	static int method815(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, final int var10, int var11, final Class109_Sub4_Sub2 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var4 + var11) - var3) > var10)
			var9 = var10;

		var12.anInt1563 += var12.anInt1571 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt1564 = var5 >> 2;
		var12.anInt1565 = var6 >> 2;
		var12.anInt1573 = var3 << 8;
		return var4 >> 1;
	}

	public boolean method816() {
		return anInt1570 != 0;
	}

	public static Class109_Sub4_Sub2 method817(final Class109_Sub3_Sub1 var0, final int var1, final int var2,
			final int var3) {
		return (var0.aByteArray1550 != null) && (var0.aByteArray1550.length != 0)
				? new Class109_Sub4_Sub2(var0, var1, var2, var3) : null;
	}

	public synchronized void method818(final int var1) {
		if (anInt1569 < 0)
			anInt1569 = -var1;
		else
			anInt1569 = var1;

	}

	public synchronized void method819(final boolean var1) {
		anInt1569 = (anInt1569 ^ (anInt1569 >> 31)) + (anInt1569 >>> 31);
		anInt1569 = -anInt1569;
	}

	public synchronized void method820(int var1) {
		final int var2 = ((Class109_Sub3_Sub1) aClass109_Sub3_926).aByteArray1550.length << 8;
		if (var1 < -1)
			var1 = -1;

		if (var1 > var2)
			var1 = var2;

		anInt1573 = var1;
	}

	static int method821(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			final int var7, int var8, final Class109_Sub4_Sub2 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var2) - (var8 - 1)) > var7)
			var6 = var7;

		var9.anInt1564 += var9.anInt1567 * (var6 - var3);
		var9.anInt1565 += var9.anInt1560 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.anInt1563 = var4 >> 2;
		var9.anInt1573 = var2 << 8;
		return var3;
	}

	@Override
	public synchronized void method508(final int[] var1, final int var2, int var3) {
		if ((anInt1559 == 0) && (anInt1570 == 0))
			method510(var3);
		else {
			final Class109_Sub3_Sub1 var6 = (Class109_Sub3_Sub1) aClass109_Sub3_926;
			final int var4 = anInt1561 << 8;
			final int var5 = anInt1568 << 8;
			final int var7 = var6.aByteArray1550.length << 8;
			final int var8 = var5 - var4;
			if (var8 <= 0)
				anInt1566 = 0;

			int var10 = var2;
			var3 += var2;
			if (anInt1573 < 0) {
				if (anInt1569 <= 0) {
					method794();
					method413();
					return;
				}

				anInt1573 = 0;
			}

			if (anInt1573 >= var7) {
				if (anInt1569 >= 0) {
					method794();
					method413();
					return;
				}

				anInt1573 = var7 - 1;
			}

			if (anInt1566 < 0) {
				if (aBool1572) {
					if (anInt1569 < 0) {
						var10 = method801(var1, var2, var4, var3, var6.aByteArray1550[anInt1561]);
						if (anInt1573 >= var4)
							return;

						anInt1573 = (var4 + var4) - 1 - anInt1573;
						anInt1569 = -anInt1569;
					}

					while (true) {
						var10 = method800(var1, var10, var5, var3, var6.aByteArray1550[anInt1568 - 1]);
						if (anInt1573 < var5)
							return;

						anInt1573 = (var5 + var5) - 1 - anInt1573;
						anInt1569 = -anInt1569;
						var10 = method801(var1, var10, var4, var3, var6.aByteArray1550[anInt1561]);
						if (anInt1573 >= var4)
							return;

						anInt1573 = (var4 + var4) - 1 - anInt1573;
						anInt1569 = -anInt1569;
					}
				} else if (anInt1569 < 0)
					while (true) {
						var10 = method801(var1, var10, var4, var3, var6.aByteArray1550[anInt1568 - 1]);
						if (anInt1573 >= var4)
							return;

						anInt1573 = var5 - 1 - ((var5 - 1 - anInt1573) % var8);
					}
				else
					while (true) {
						var10 = method800(var1, var10, var5, var3, var6.aByteArray1550[anInt1561]);
						if (anInt1573 < var5)
							return;

						anInt1573 = var4 + ((anInt1573 - var4) % var8);
					}
			} else {
				if (anInt1566 > 0)
					if (aBool1572)
						label177: {
							if (anInt1569 < 0) {
								var10 = method801(var1, var2, var4, var3, var6.aByteArray1550[anInt1561]);
								if (anInt1573 >= var4)
									return;

								anInt1573 = (var4 + var4) - 1 - anInt1573;
								anInt1569 = -anInt1569;
								if (--anInt1566 == 0)
									break label177;
							}

							do {
								var10 = method800(var1, var10, var5, var3, var6.aByteArray1550[anInt1568 - 1]);
								if (anInt1573 < var5)
									return;

								anInt1573 = (var5 + var5) - 1 - anInt1573;
								anInt1569 = -anInt1569;
								if (--anInt1566 == 0)
									break;

								var10 = method801(var1, var10, var4, var3, var6.aByteArray1550[anInt1561]);
								if (anInt1573 >= var4)
									return;

								anInt1573 = (var4 + var4) - 1 - anInt1573;
								anInt1569 = -anInt1569;
							} while (--anInt1566 != 0);
						}
					else {
						int var9;
						if (anInt1569 < 0)
							while (true) {
								var10 = method801(var1, var10, var4, var3, var6.aByteArray1550[anInt1568 - 1]);
								if (anInt1573 >= var4)
									return;

								var9 = (var5 - 1 - anInt1573) / var8;
								if (var9 >= anInt1566) {
									anInt1573 += var8 * anInt1566;
									anInt1566 = 0;
									break;
								}

								anInt1573 += var8 * var9;
								anInt1566 -= var9;
							}
						else
							while (true) {
								var10 = method800(var1, var10, var5, var3, var6.aByteArray1550[anInt1561]);
								if (anInt1573 < var5)
									return;

								var9 = (anInt1573 - var4) / var8;
								if (var9 >= anInt1566) {
									anInt1573 -= var8 * anInt1566;
									anInt1566 = 0;
									break;
								}

								anInt1573 -= var8 * var9;
								anInt1566 -= var9;
							}
					}

				if (anInt1569 < 0) {
					method801(var1, var10, 0, var3, 0);
					if (anInt1573 < 0) {
						anInt1573 = -1;
						method794();
						method413();
					}
				} else {
					method800(var1, var10, var7, var3, 0);
					if (anInt1573 >= var7) {
						anInt1573 = var7;
						method794();
						method413();
					}
				}

			}
		}
	}

	static int method822(final int var0, final int var1) {
		return var1 < 0 ? -var0 : (int) ((var0 * Math.sqrt(var1 * 1.220703125E-4D)) + 0.5D);
	}

	boolean method823() {
		int var1 = anInt1559;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var2 = 0;
			var3 = 0;
			var1 = 0;
		} else {
			var3 = method803(var1, anInt1562);
			var2 = method822(var1, anInt1562);
		}

		if ((anInt1563 == var1) && (anInt1564 == var3) && (anInt1565 == var2)) {
			if (anInt1559 == Integer.MIN_VALUE) {
				anInt1559 = 0;
				anInt1565 = 0;
				anInt1564 = 0;
				anInt1563 = 0;
				method413();
				return true;
			} else {
				method788();
				return false;
			}
		} else {
			if (anInt1563 < var1) {
				anInt1571 = 1;
				anInt1570 = var1 - anInt1563;
			} else if (anInt1563 > var1) {
				anInt1571 = -1;
				anInt1570 = anInt1563 - var1;
			} else
				anInt1571 = 0;

			if (anInt1564 < var3) {
				anInt1567 = 1;
				if ((anInt1570 == 0) || (anInt1570 > (var3 - anInt1564)))
					anInt1570 = var3 - anInt1564;
			} else if (anInt1564 > var3) {
				anInt1567 = -1;
				if ((anInt1570 == 0) || (anInt1570 > (anInt1564 - var3)))
					anInt1570 = anInt1564 - var3;
			} else
				anInt1567 = 0;

			if (anInt1565 < var2) {
				anInt1560 = 1;
				if ((anInt1570 == 0) || (anInt1570 > (var2 - anInt1565)))
					anInt1570 = var2 - anInt1565;
			} else if (anInt1565 > var2) {
				anInt1560 = -1;
				if ((anInt1570 == 0) || (anInt1570 > (anInt1565 - var2)))
					anInt1570 = anInt1565 - var2;
			} else
				anInt1560 = 0;

			return false;
		}
	}

	@Override
	public synchronized void method510(int var1) {
		if (anInt1570 > 0)
			if (var1 >= anInt1570) {
				if (anInt1559 == Integer.MIN_VALUE) {
					anInt1559 = 0;
					anInt1565 = 0;
					anInt1564 = 0;
					anInt1563 = 0;
					method413();
					var1 = anInt1570;
				}

				anInt1570 = 0;
				method788();
			} else {
				anInt1563 += anInt1571 * var1;
				anInt1564 += anInt1567 * var1;
				anInt1565 += anInt1560 * var1;
				anInt1570 -= var1;
			}

		final Class109_Sub3_Sub1 var6 = (Class109_Sub3_Sub1) aClass109_Sub3_926;
		final int var4 = anInt1561 << 8;
		final int var3 = anInt1568 << 8;
		final int var2 = var6.aByteArray1550.length << 8;
		final int var5 = var3 - var4;
		if (var5 <= 0)
			anInt1566 = 0;

		if (anInt1573 < 0) {
			if (anInt1569 <= 0) {
				method794();
				method413();
				return;
			}

			anInt1573 = 0;
		}

		if (anInt1573 >= var2) {
			if (anInt1569 >= 0) {
				method794();
				method413();
				return;
			}

			anInt1573 = var2 - 1;
		}

		anInt1573 += anInt1569 * var1;
		if (anInt1566 < 0) {
			if (!aBool1572) {
				if (anInt1569 < 0) {
					if (anInt1573 >= var4)
						return;

					anInt1573 = var3 - 1 - ((var3 - 1 - anInt1573) % var5);
				} else {
					if (anInt1573 < var3)
						return;

					anInt1573 = var4 + ((anInt1573 - var4) % var5);
				}

			} else {
				if (anInt1569 < 0) {
					if (anInt1573 >= var4)
						return;

					anInt1573 = (var4 + var4) - 1 - anInt1573;
					anInt1569 = -anInt1569;
				}

				while (anInt1573 >= var3) {
					anInt1573 = (var3 + var3) - 1 - anInt1573;
					anInt1569 = -anInt1569;
					if (anInt1573 >= var4)
						return;

					anInt1573 = (var4 + var4) - 1 - anInt1573;
					anInt1569 = -anInt1569;
				}

			}
		} else {
			if (anInt1566 > 0)
				if (aBool1572)
					label171: {
						if (anInt1569 < 0) {
							if (anInt1573 >= var4)
								return;

							anInt1573 = (var4 + var4) - 1 - anInt1573;
							anInt1569 = -anInt1569;
							if (--anInt1566 == 0)
								break label171;
						}

						do {
							if (anInt1573 < var3)
								return;

							anInt1573 = (var3 + var3) - 1 - anInt1573;
							anInt1569 = -anInt1569;
							if (--anInt1566 == 0)
								break;

							if (anInt1573 >= var4)
								return;

							anInt1573 = (var4 + var4) - 1 - anInt1573;
							anInt1569 = -anInt1569;
						} while (--anInt1566 != 0);
					}
				else
					label203: {
						int var7;
						if (anInt1569 < 0) {
							if (anInt1573 >= var4)
								return;

							var7 = (var3 - 1 - anInt1573) / var5;
							if (var7 >= anInt1566) {
								anInt1573 += var5 * anInt1566;
								anInt1566 = 0;
								break label203;
							}

							anInt1573 += var5 * var7;
							anInt1566 -= var7;
						} else {
							if (anInt1573 < var3)
								return;

							var7 = (anInt1573 - var4) / var5;
							if (var7 >= anInt1566) {
								anInt1573 -= var5 * anInt1566;
								anInt1566 = 0;
								break label203;
							}

							anInt1573 -= var5 * var7;
							anInt1566 -= var7;
						}

						return;
					}

			if (anInt1569 < 0) {
				if (anInt1573 < 0) {
					anInt1573 = -1;
					method794();
					method413();
				}
			} else if (anInt1573 >= var2) {
				anInt1573 = var2;
				method794();
				method413();
			}

		}
	}

	static int method824(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			int var7, final Class109_Sub4_Sub2 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = (var3 + var7) - var2) > var6)
			var5 = var6;

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4)
			var10001 = var3++;

		var8.anInt1573 = var2 << 8;
		return var3;
	}

	synchronized void method825(final int var1, final int var2) {
		anInt1559 = var1;
		anInt1562 = var2;
		anInt1570 = 0;
		method788();
	}

	static int method826(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			final int var7, int var8, final int var9, final int var10, final Class109_Sub4_Sub2 var11, final int var12,
			final int var13) {
		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9))
			var8 = var9;

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + ((var2[var1 + 1] - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		if ((var12 == 0) || ((var8 = (var5 >> 1) + ((((var10 - var4) + var12) - 1) / var12)) > var9))
			var8 = var9;

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + ((var1 - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		var11.anInt1573 = var4;
		return var5 >> 1;
	}
}
