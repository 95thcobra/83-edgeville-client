public final class Class23 {
	int anInt215;
	int anInt216;
	public Class109_Sub21_Sub15 aClass109_Sub21_Sub15_217;
	public int anInt218;
	int anInt219;
	int anInt220;

	static final int method102(final int var0, final int var1) {
		int var2 = (RuntimeException_Sub1.method1007('\ub135' + var0, var1 + 91923, 4) - 128)
				+ ((RuntimeException_Sub1.method1007(var0 + 10294, var1 + '\u93bd', 2) - 128) >> 1)
				+ ((RuntimeException_Sub1.method1007(var0, var1, 1) - 128) >> 2);
		var2 = 35 + (int) (var2 * 0.3D);
		if (var2 < 10)
			var2 = 10;
		else if (var2 > 60)
			var2 = 60;

		return var2;
	}

	static final void method103() {
		for (int var0 = 0; var0 < client.anInt2089; ++var0) {
			final int var1 = client.anIntArray2186[var0];
			final Class109_Sub21_Sub15_Sub3_Sub2 var2 = client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var1];
			int var5 = client.aClass109_Sub14_Sub1_2211.method564();
			if ((var5 & 128) != 0)
				var5 += client.aClass109_Sub14_Sub1_2211.method564() << 8;

			int var7;
			int var8;
			if ((var5 & 512) != 0) {
				var7 = client.aClass109_Sub14_Sub1_2211.method591();
				var8 = client.aClass109_Sub14_Sub1_2211.method564();
				var2.method898(var7, var8, client.anInt1979);
				var2.anInt1674 = 300 + client.anInt1979;
				var2.anInt1675 = client.aClass109_Sub14_Sub1_2211.method608();
				var2.anInt1662 = client.aClass109_Sub14_Sub1_2211.method608();
			}

			if ((var5 & 16) != 0) {
				var7 = client.aClass109_Sub14_Sub1_2211.method591();
				final Class89 var3 = (Class89) Class33.method151(Class109_Sub21_Sub15_Sub6.method980(),
						client.aClass109_Sub14_Sub1_2211.method608());
				final boolean var9 = client.aClass109_Sub14_Sub1_2211.method584() == 1;
				final int var10 = client.aClass109_Sub14_Sub1_2211.method608();
				final int var11 = client.aClass109_Sub14_Sub1_2211.position;
				if ((null != var2.aString1931) && (var2.aClass96_1929 != null)) {
					boolean var6 = false;
					if (var3.aBool674 && Class109_Sub11.method541(var2.aString1931))
						var6 = true;

					if (!var6 && (client.anInt2085 == 0) && !var2.aBool1928) {
						client.aClass109_Sub14_2031.position = 0;
						client.aClass109_Sub14_Sub1_2211.method554(client.aClass109_Sub14_2031.data, 0,
								var10);
						client.aClass109_Sub14_2031.position = 0;
						final String var12 = Class109_Sub21_Sub14_Sub4
								.method1013(Class35.method158(Class48.method245(client.aClass109_Sub14_2031)));
						var2.aString1702 = var12.trim();
						var2.anInt1669 = var7 >> 8;
						var2.anInt1670 = var7 & 255;
						var2.anInt1668 = 150;
						var2.aBool1666 = var9;
						var2.aBool1667 = (var2 != Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590)
								&& var3.aBool674 && ("" != client.aString2190)
								&& (var12.toLowerCase().indexOf(client.aString2190) == -1);
						int var13;
						if (var3.aBool680)
							var13 = var9 ? 91 : 1;
						else
							var13 = var9 ? 90 : 2;

						if (var3.anInt678 != -1) {
							final int var4 = var3.anInt678;
							final String var15 = "<img=" + var4 + ">";
							Applet_Sub1.method1053(var13, var15 + var2.aString1931, var12);
						} else
							Applet_Sub1.method1053(var13, var2.aString1931, var12);
					}
				}

				client.aClass109_Sub14_Sub1_2211.position = var10 + var11;
			}

			if ((var5 & 8) != 0) {
				var7 = client.aClass109_Sub14_Sub1_2211.method591();
				var8 = client.aClass109_Sub14_Sub1_2211.method564();
				var2.method898(var7, var8, client.anInt1979);
				var2.anInt1674 = client.anInt1979 + 300;
				var2.anInt1675 = client.aClass109_Sub14_Sub1_2211.method585();
				var2.anInt1662 = client.aClass109_Sub14_Sub1_2211.method564();
			}

			if ((var5 & 4) != 0) {
				var7 = client.aClass109_Sub14_Sub1_2211.method566();
				if (var7 == '\uffff')
					var7 = -1;

				var8 = client.aClass109_Sub14_Sub1_2211.method585();
				Class19.method89(var2, var7, var8);
			}

			if ((var5 & 64) != 0) {
				var2.aString1702 = client.aClass109_Sub14_Sub1_2211.method602();
				if (var2.aString1702.charAt(0) == 126) {
					var2.aString1702 = var2.aString1702.substring(1);
					Applet_Sub1.method1053(2, var2.aString1931, var2.aString1702);
				} else if (var2 == Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590)
					Applet_Sub1.method1053(2, var2.aString1931, var2.aString1702);

				var2.aBool1666 = false;
				var2.anInt1669 = 0;
				var2.anInt1670 = 0;
				var2.anInt1668 = 150;
			}

			if ((var5 & 1024) != 0) {
				var2.anInt1688 = client.aClass109_Sub14_Sub1_2211.method566();
				var7 = client.aClass109_Sub14_Sub1_2211.method568();
				var2.anInt1692 = var7 >> 16;
				var2.anInt1691 = (var7 & '\uffff') + client.anInt1979;
				var2.anInt1676 = 0;
				var2.anInt1701 = 0;
				if (var2.anInt1691 > client.anInt1979)
					var2.anInt1676 = -1;

				if (var2.anInt1688 == '\uffff')
					var2.anInt1688 = -1;
			}

			if ((var5 & 1) != 0) {
				var7 = client.aClass109_Sub14_Sub1_2211.method608();
				final byte[] var17 = new byte[var7];
				final DataBuffer var16 = new DataBuffer(var17);
				client.aClass109_Sub14_Sub1_2211.method600(var17, 0, var7);
				client.aClass109_Sub14Array2091[var1] = var16;
				var2.method1037(var16);
			}

			if ((var5 & 2) != 0) {
				var2.anInt1677 = client.aClass109_Sub14_Sub1_2211.method559();
				if (var2.anInt1677 == '\uffff')
					var2.anInt1677 = -1;
			}

			if ((var5 & 32) != 0) {
				var2.anInt1664 = client.aClass109_Sub14_Sub1_2211.method559();
				var2.anInt1665 = client.aClass109_Sub14_Sub1_2211.method559();
			}

			if ((var5 & 256) != 0) {
				var2.anInt1693 = client.aClass109_Sub14_Sub1_2211.method608();
				var2.anInt1695 = client.aClass109_Sub14_Sub1_2211.method608();
				var2.anInt1694 = client.aClass109_Sub14_Sub1_2211.method608();
				var2.anInt1690 = client.aClass109_Sub14_Sub1_2211.method608();
				var2.anInt1697 = client.aClass109_Sub14_Sub1_2211.method592() + client.anInt1979;
				var2.anInt1698 = client.aClass109_Sub14_Sub1_2211.method559() + client.anInt1979;
				var2.anInt1699 = client.aClass109_Sub14_Sub1_2211.method584();
				var2.anInt1705 = 1;
				var2.anInt1709 = 0;
			}
		}

	}
}
