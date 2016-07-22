public final class Class37 {
	int anInt339;
	int anInt340;
	int anInt341;
	int anInt342;
	int anInt343;
	int anInt344;
	int anInt345;
	int anInt346;
	int anInt347;
	int anInt348;
	int anInt349;
	int anInt350;
	int anInt351;
	int anInt352;
	int anInt353;
	int anInt354;
	int anInt355;
	protected static Class57 aClass57_356;
	int anInt357;
	static Class109_Sub21_Sub14_Sub2[] aClass109_Sub21_Sub14_Sub2Array358;

	static final void method162(final Class109_Sub21_Sub15_Sub3 var0) {
		if (var0.anInt1697 > client.anInt1979)
			Class68.method306(var0);
		else if (var0.anInt1698 >= client.anInt1979)
			Class50.method250(var0);
		else
			Class109_Sub21_Sub18.method851(var0);

		if ((var0.anInt1710 < 128) || (var0.anInt1653 < 128) || (var0.anInt1710 >= 13184)
				|| (var0.anInt1653 >= 13184)) {
			var0.anInt1683 = -1;
			var0.anInt1688 = -1;
			var0.anInt1697 = 0;
			var0.anInt1698 = 0;
			var0.anInt1710 = (var0.anIntArray1655[0] * 128) + (var0.anInt1656 * 64);
			var0.anInt1653 = (var0.anInt1656 * 64) + (128 * var0.anIntArray1706[0]);
			var0.method899();
		}

		if ((Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590 == var0) && ((var0.anInt1710 < 1536)
				|| (var0.anInt1653 < 1536) || (var0.anInt1710 >= 11776) || (var0.anInt1653 >= 11776))) {
			var0.anInt1683 = -1;
			var0.anInt1688 = -1;
			var0.anInt1697 = 0;
			var0.anInt1698 = 0;
			var0.anInt1710 = (var0.anInt1656 * 64) + (var0.anIntArray1655[0] * 128);
			var0.anInt1653 = (var0.anInt1656 * 64) + (128 * var0.anIntArray1706[0]);
			var0.method899();
		}

		Class109_Sub21_Sub12.method750(var0);
		var0.aBool1704 = false;
		Class109_Sub21_Sub7 var1;
		if (var0.anInt1663 != -1) {
			var1 = Class109_Sub21_Sub18.method849(var0.anInt1663, 717782855);
			if ((var1 != null) && (var1.anIntArray1401 != null)) {
				++var0.anInt1707;
				if ((var0.anInt1681 < var1.anIntArray1401.length)
						&& (var0.anInt1707 > var1.anIntArray1396[var0.anInt1681])) {
					var0.anInt1707 = 1;
					++var0.anInt1681;
					Class109_Sub12.method547(var1, var0.anInt1681, var0.anInt1710, var0.anInt1653);
				}

				if (var0.anInt1681 >= var1.anIntArray1401.length) {
					var0.anInt1707 = 0;
					var0.anInt1681 = 0;
					Class109_Sub12.method547(var1, var0.anInt1681, var0.anInt1710, var0.anInt1653);
				}
			} else
				var0.anInt1663 = -1;
		}

		if ((var0.anInt1688 != -1) && (client.anInt1979 >= var0.anInt1691)) {
			if (var0.anInt1676 < 0)
				var0.anInt1676 = 0;

			final int var3 = Class35.method154(var0.anInt1688).anInt1483;
			if (var3 != -1) {
				final Class109_Sub21_Sub7 var2 = Class109_Sub21_Sub18.method849(var3, -655880715);
				if ((var2 != null) && (null != var2.anIntArray1401)) {
					++var0.anInt1701;
					if ((var0.anInt1676 < var2.anIntArray1401.length)
							&& (var0.anInt1701 > var2.anIntArray1396[var0.anInt1676])) {
						var0.anInt1701 = 1;
						++var0.anInt1676;
						Class109_Sub12.method547(var2, var0.anInt1676, var0.anInt1710, var0.anInt1653);
					}

					if ((var0.anInt1676 >= var2.anIntArray1401.length)
							&& ((var0.anInt1676 < 0) || (var0.anInt1676 >= var2.anIntArray1401.length)))
						var0.anInt1688 = -1;
				} else
					var0.anInt1688 = -1;
			} else
				var0.anInt1688 = -1;
		}

		if ((var0.anInt1683 != -1) && (var0.anInt1689 <= 1)) {
			var1 = Class109_Sub21_Sub18.method849(var0.anInt1683, -192732935);
			if ((var1.anInt1398 == 1) && (var0.anInt1709 > 0) && (var0.anInt1697 <= client.anInt1979)
					&& (var0.anInt1698 < client.anInt1979)) {
				var0.anInt1689 = 1;
				return;
			}
		}

		if ((var0.anInt1683 != -1) && (var0.anInt1689 == 0)) {
			var1 = Class109_Sub21_Sub18.method849(var0.anInt1683, 1852365275);
			if ((null != var1) && (var1.anIntArray1401 != null)) {
				++var0.anInt1685;
				if ((var0.anInt1684 < var1.anIntArray1401.length)
						&& (var0.anInt1685 > var1.anIntArray1396[var0.anInt1684])) {
					var0.anInt1685 = 1;
					++var0.anInt1684;
					Class109_Sub12.method547(var1, var0.anInt1684, var0.anInt1710, var0.anInt1653);
				}

				if (var0.anInt1684 >= var1.anIntArray1401.length) {
					var0.anInt1684 -= var1.anInt1395;
					++var0.anInt1687;
					if (var0.anInt1687 >= var1.anInt1405)
						var0.anInt1683 = -1;
					else if ((var0.anInt1684 >= 0) && (var0.anInt1684 < var1.anIntArray1401.length))
						Class109_Sub12.method547(var1, var0.anInt1684, var0.anInt1710, var0.anInt1653);
					else
						var0.anInt1683 = -1;
				}

				var0.aBool1704 = var1.aBool1400;
			} else
				var0.anInt1683 = -1;
		}

		if (var0.anInt1689 > 0)
			--var0.anInt1689;

	}

	static void method163(final int var0) {
		final Class109_Sub12 var1 = (Class109_Sub12) Class109_Sub12.aClass116_1043.method429(var0);
		if (null != var1)
			for (int var2 = 0; var2 < var1.anIntArray1040.length; ++var2) {
				var1.anIntArray1040[var2] = -1;
				var1.anIntArray1041[var2] = 0;
			}
	}
}
