import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas {
	/**
	 *
	 */
	private static final long serialVersionUID = 259260264275860140L;
	public static int anInt1594;
	static int anInt1596;
	static int anInt1597;
	Component aComponent1595;

	@Override
	public final void update(final Graphics var1) {
		aComponent1595.update(var1);
	}

	@Override
	public final void paint(final Graphics var1) {
		aComponent1595.paint(var1);
	}

	Canvas_Sub1(final Component var1) {
		aComponent1595 = var1;
	}

	static final void method848(final Class109_Sub21_Sub15_Sub3_Sub2 var0, final int var1, final int var2,
			final int var3) {
		if (var0 != Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590)
			if (client.anInt2045 < 400) {
				String var4;
				if (var0.anInt1933 == 0)
					var4 = var0.aString1931
							+ Class30.method134(var0.anInt1932,
									Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1932)
							+ " " + " (" + "level-" + var0.anInt1932 + ")";
				else
					var4 = var0.aString1931 + " " + " (" + "skill-" + var0.anInt1933 + ")";

				int var5;
				if (client.anInt2196 == 1)
					Class65.method291("Use",
							client.aString2122 + " " + "->" + " " + Class109_Sub11.method544(16777215) + var4, 14, var1,
							var2, var3);
				else if (client.aBool2171) {
					if ((anInt1596 & 8) == 8)
						Class65.method291(client.aString2126,
								client.aString2127 + " " + "->" + " " + Class109_Sub11.method544(16777215) + var4, 15,
								var1, var2, var3);
				} else
					for (var5 = 7; var5 >= 0; --var5)
						if (client.aStringArray2151[var5] != null) {
							short var6 = 0;
							if (client.aStringArray2151[var5].equalsIgnoreCase("Attack")) {
								if ((client.aClass49_2176 == Class49.aClass49_507)
										|| ((Class49.aClass49_508 == client.aClass49_2176)
												&& (var0.anInt1932 > Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1932)))
									var6 = 2000;

								if ((Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1945 != 0)
										&& (var0.anInt1945 != 0))
									if (var0.anInt1945 == Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1945)
										var6 = 2000;
									else
										var6 = 0;
							} else if (client.aBoolArray1990[var5])
								var6 = 2000;

							final int var8 = var6 + client.anIntArray2096[var5];
							Class65.method291(client.aStringArray2151[var5], Class109_Sub11.method544(16777215) + var4,
									var8, var1, var2, var3);
						}

				for (var5 = 0; var5 < client.anInt2045; ++var5)
					if (client.anIntArray2113[var5] == 23) {
						client.aStringArray2123[var5] = Class109_Sub11.method544(16777215) + var4;
						break;
					}

			}
	}
}
