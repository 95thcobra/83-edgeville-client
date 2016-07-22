public class Class109_Sub21_Sub18 extends Class109_Sub21 {
	int anInt1598;
	byte aByte1599;
	Class104_Sub1 aClass104_Sub1_1600;

	public static Class109_Sub21_Sub7 method849(final int var0, final int var1) {
		Class109_Sub21_Sub7 var2 = (Class109_Sub21_Sub7) Class109_Sub21_Sub7.aClass120_1392.method438(var0);
		if (var2 != null)
			return var2;
		else {
			final byte[] var3 = Class109_Sub21_Sub7.aClass104_1394.method387(12, var0);
			var2 = new Class109_Sub21_Sub7();
			if (var3 != null)
				var2.method703(new DataBuffer(var3));

			var2.method705();
			Class109_Sub21_Sub7.aClass120_1392.method440(var2, var0);
			return var2;
		}
	}

	public static boolean method850(final int var0, final byte var1) {
		return (var0 & 1) != 0;
	}

	static final void method851(final Class109_Sub21_Sub15_Sub3 var0) {
		var0.anInt1663 = var0.anInt1657;
		if (var0.anInt1705 == 0)
			var0.anInt1708 = 0;
		else {
			if ((var0.anInt1683 != -1) && (var0.anInt1689 == 0)) {
				final Class109_Sub21_Sub7 var5 = method849(var0.anInt1683, 1110886595);
				if ((var0.anInt1709 > 0) && (var5.anInt1398 == 0)) {
					++var0.anInt1708;
					return;
				}

				if ((var0.anInt1709 <= 0) && (var5.anInt1406 == 0)) {
					++var0.anInt1708;
					return;
				}
			}

			final int var3 = var0.anInt1710;
			final int var1 = var0.anInt1653;
			final int var4 = (var0.anIntArray1655[var0.anInt1705 - 1] * 128) + (var0.anInt1656 * 64);
			final int var2 = (128 * var0.anIntArray1706[var0.anInt1705 - 1]) + (var0.anInt1656 * 64);
			if (((var4 - var3) <= 256) && ((var4 - var3) >= -256) && ((var2 - var1) <= 256)
					&& ((var2 - var1) >= -256)) {
				if (var3 < var4) {
					if (var1 < var2)
						var0.anInt1680 = 1280;
					else if (var1 > var2)
						var0.anInt1680 = 1792;
					else
						var0.anInt1680 = 1536;
				} else if (var3 > var4) {
					if (var1 < var2)
						var0.anInt1680 = 768;
					else if (var1 > var2)
						var0.anInt1680 = 256;
					else
						var0.anInt1680 = 512;
				} else if (var1 < var2)
					var0.anInt1680 = 1024;
				else if (var1 > var2)
					var0.anInt1680 = 0;

				int var7 = (var0.anInt1680 - var0.anInt1654) & 2047;
				if (var7 > 1024)
					var7 -= 2048;

				int var9 = var0.anInt1661;
				if ((var7 >= -256) && (var7 <= 256))
					var9 = var0.anInt1660;
				else if ((var7 >= 256) && (var7 < 768))
					var9 = var0.anInt1696;
				else if ((var7 >= -768) && (var7 <= -256))
					var9 = var0.anInt1678;

				if (var9 == -1)
					var9 = var0.anInt1660;

				var0.anInt1663 = var9;
				int var6 = 4;
				boolean var8 = true;
				if (var0 instanceof Class109_Sub21_Sub15_Sub3_Sub1)
					var8 = ((Class109_Sub21_Sub15_Sub3_Sub1) var0).aClass109_Sub21_Sub13_1925.aBool1542;

				if (var8) {
					if ((var0.anInt1680 != var0.anInt1654) && (var0.anInt1677 == -1) && (var0.anInt1686 != 0))
						var6 = 2;

					if (var0.anInt1705 > 2)
						var6 = 6;

					if (var0.anInt1705 > 3)
						var6 = 8;

					if ((var0.anInt1708 > 0) && (var0.anInt1705 > 1)) {
						var6 = 8;
						--var0.anInt1708;
					}
				} else {
					if (var0.anInt1705 > 1)
						var6 = 6;

					if (var0.anInt1705 > 2)
						var6 = 8;

					if ((var0.anInt1708 > 0) && (var0.anInt1705 > 1)) {
						var6 = 8;
						--var0.anInt1708;
					}
				}

				if (var0.aBoolArray1682[var0.anInt1705 - 1])
					var6 <<= 1;

				if ((var6 >= 8) && (var0.anInt1663 == var0.anInt1660) && (var0.anInt1679 != -1))
					var0.anInt1663 = var0.anInt1679;

				if (var3 < var4) {
					var0.anInt1710 += var6;
					if (var0.anInt1710 > var4)
						var0.anInt1710 = var4;
				} else if (var3 > var4) {
					var0.anInt1710 -= var6;
					if (var0.anInt1710 < var4)
						var0.anInt1710 = var4;
				}

				if (var1 < var2) {
					var0.anInt1653 += var6;
					if (var0.anInt1653 > var2)
						var0.anInt1653 = var2;
				} else if (var1 > var2) {
					var0.anInt1653 -= var6;
					if (var0.anInt1653 < var2)
						var0.anInt1653 = var2;
				}

				if ((var0.anInt1710 == var4) && (var0.anInt1653 == var2)) {
					--var0.anInt1705;
					if (var0.anInt1709 > 0)
						--var0.anInt1709;
				}

			} else {
				var0.anInt1710 = var4;
				var0.anInt1653 = var2;
			}
		}
	}
}
