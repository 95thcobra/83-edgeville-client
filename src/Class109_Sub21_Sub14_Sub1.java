public final class Class109_Sub21_Sub14_Sub1 extends Class109_Sub21_Sub14 {
	public int anInt1712;
	public int anInt1716;
	public int[] anIntArray1718;
	public byte[] aByteArray1711;
	public int anInt1713;
	public int anInt1714;
	public int anInt1715;
	public int anInt1717;

	public void method904() {
		if ((anInt1713 != anInt1712) || (anInt1714 != anInt1716)) {
			final byte[] var1 = new byte[anInt1712 * anInt1716];
			int var3 = 0;

			for (int var2 = 0; var2 < anInt1714; ++var2)
				for (int var4 = 0; var4 < anInt1713; ++var4)
					var1[var4 + anInt1715 + ((var2 + anInt1717) * anInt1712)] = aByteArray1711[var3++];

			aByteArray1711 = var1;
			anInt1713 = anInt1712;
			anInt1714 = anInt1716;
			anInt1715 = 0;
			anInt1717 = 0;
		}
	}

	public void method905(int var1, int var2) {
		var1 += anInt1715;
		var2 += anInt1717;
		int var6 = var1 + (var2 * anInt1553);
		int var5 = 0;
		int var7 = anInt1714;
		int var3 = anInt1713;
		int var8 = anInt1553 - var3;
		int var9 = 0;
		int var4;
		if (var2 < anInt1555) {
			var4 = anInt1555 - var2;
			var7 -= var4;
			var2 = anInt1555;
			var5 += var4 * var3;
			var6 += var4 * anInt1553;
		}

		if ((var2 + var7) > anInt1556)
			var7 -= (var2 + var7) - anInt1556;

		if (var1 < anInt1557) {
			var4 = anInt1557 - var1;
			var3 -= var4;
			var1 = anInt1557;
			var5 += var4;
			var6 += var4;
			var9 += var4;
			var8 += var4;
		}

		if ((var1 + var3) > anInt1552) {
			var4 = (var1 + var3) - anInt1552;
			var3 -= var4;
			var9 += var4;
			var8 += var4;
		}

		if ((var3 > 0) && (var7 > 0))
			method906(anIntArray1558, aByteArray1711, anIntArray1718, var5, var6, var3, var7, var8, var9);
	}

	static void method906(final int[] var0, final byte[] var1, final int[] var2, int var3, int var4, int var5,
			final int var6, final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var11 = -var6; var11 < 0; ++var11) {
			byte var10;
			int var12;
			for (var12 = var9; var12 < 0; ++var12) {
				var10 = var1[var3++];
				if (var10 != 0)
					var0[var4++] = var2[var10 & 255];
				else
					++var4;

				var10 = var1[var3++];
				if (var10 != 0)
					var0[var4++] = var2[var10 & 255];
				else
					++var4;

				var10 = var1[var3++];
				if (var10 != 0)
					var0[var4++] = var2[var10 & 255];
				else
					++var4;

				var10 = var1[var3++];
				if (var10 != 0)
					var0[var4++] = var2[var10 & 255];
				else
					++var4;
			}

			for (var12 = var5; var12 < 0; ++var12) {
				var10 = var1[var3++];
				if (var10 != 0)
					var0[var4++] = var2[var10 & 255];
				else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method907(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anIntArray1718.length; ++var4) {
			int var6 = (anIntArray1718[var4] >> 16) & 255;
			var6 += var1;
			if (var6 < 0)
				var6 = 0;
			else if (var6 > 255)
				var6 = 255;

			int var7 = (anIntArray1718[var4] >> 8) & 255;
			var7 += var2;
			if (var7 < 0)
				var7 = 0;
			else if (var7 > 255)
				var7 = 255;

			int var5 = anIntArray1718[var4] & 255;
			var5 += var3;
			if (var5 < 0)
				var5 = 0;
			else if (var5 > 255)
				var5 = 255;

			anIntArray1718[var4] = (var6 << 16) + (var7 << 8) + var5;
		}

	}
}
