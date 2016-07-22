import java.awt.Container;
import java.awt.Insets;

public class Class109_Sub4_Sub4 extends Class109_Sub4 {
	Class126 aClass126_1628 = new Class126();
	Class109_Sub4_Sub1 aClass109_Sub4_Sub1_1630 = new Class109_Sub4_Sub1();
	Class109_Sub4_Sub3 aClass109_Sub4_Sub3_1629;

	Class109_Sub4_Sub4(final Class109_Sub4_Sub3 var1) {
		aClass109_Sub4_Sub3_1629 = var1;
	}

	@Override
	protected int method506() {
		return 0;
	}

	@Override
	protected void method508(final int[] var1, final int var2, final int var3) {
		aClass109_Sub4_Sub1_1630.method508(var1, var2, var3);

		for (Class109_Sub18 var4 = (Class109_Sub18) aClass126_1628
				.method458(); var4 != null; var4 = (Class109_Sub18) aClass126_1628.method449())
			if (!aClass109_Sub4_Sub3_1629.method878(var4)) {
				int var5 = var2;
				int var6 = var3;

				do {
					if (var6 <= var4.anInt1123) {
						method883(var4, var1, var5, var6, var5 + var6);
						var4.anInt1123 -= var6;
						break;
					}

					method883(var4, var1, var5, var4.anInt1123, var6 + var5);
					var5 += var4.anInt1123;
					var6 -= var4.anInt1123;
				} while (!aClass109_Sub4_Sub3_1629.method875(var4, var1, var5, var6));
			}

	}

	@Override
	protected void method510(final int var1) {
		aClass109_Sub4_Sub1_1630.method510(var1);

		for (Class109_Sub18 var2 = (Class109_Sub18) aClass126_1628
				.method458(); var2 != null; var2 = (Class109_Sub18) aClass126_1628.method449())
			if (!aClass109_Sub4_Sub3_1629.method878(var2)) {
				int var3 = var1;

				do {
					if (var3 <= var2.anInt1123) {
						method884(var2, var3);
						var2.anInt1123 -= var3;
						break;
					}

					method884(var2, var2.anInt1123);
					var3 -= var2.anInt1123;
				} while (!aClass109_Sub4_Sub3_1629.method875(var2, (int[]) null, 0, var3));
			}

	}

	void method883(final Class109_Sub18 var1, final int[] var2, int var3, int var4, final int var5) {
		if (((aClass109_Sub4_Sub3_1629.anIntArray1614[var1.anInt1116] & 4) != 0) && (var1.anInt1120 < 0)) {
			final int var6 = aClass109_Sub4_Sub3_1629.anIntArray1619[var1.anInt1116] / Class122.anInt848;

			while (true) {
				final int var9 = ((1048575 + var6) - var1.anInt1108) / var6;
				if (var9 > var4) {
					var1.anInt1108 += var4 * var6;
					break;
				}

				var1.aClass109_Sub4_Sub2_1122.method508(var2, var3, var9);
				var3 += var9;
				var4 -= var9;
				var1.anInt1108 += (var6 * var9) - 1048576;
				int var8 = Class122.anInt848 / 100;
				final int var7 = 262144 / var6;
				if (var7 < var8)
					var8 = var7;

				final Class109_Sub4_Sub2 var10 = var1.aClass109_Sub4_Sub2_1122;
				if (aClass109_Sub4_Sub3_1629.anIntArray1617[var1.anInt1116] == 0)
					var1.aClass109_Sub4_Sub2_1122 = Class109_Sub4_Sub2.method817(var1.aClass109_Sub3_Sub1_1106,
							var10.method798(), var10.method792(), var10.method793());
				else {
					var1.aClass109_Sub4_Sub2_1122 = Class109_Sub4_Sub2.method817(var1.aClass109_Sub3_Sub1_1106,
							var10.method798(), 0, var10.method793());
					aClass109_Sub4_Sub3_1629.method864(var1,
							var1.aClass109_Sub16_1105.aShortArray1091[var1.anInt1109] < 0);
					var1.aClass109_Sub4_Sub2_1122.method795(var8, var10.method792());
				}

				if (var1.aClass109_Sub16_1105.aShortArray1091[var1.anInt1109] < 0)
					var1.aClass109_Sub4_Sub2_1122.method789(-1);

				var10.method797(var8);
				var10.method508(var2, var3, var5 - var3);
				if (var10.method816())
					aClass109_Sub4_Sub1_1630.method743(var10);
			}
		}

		var1.aClass109_Sub4_Sub2_1122.method508(var2, var3, var4);
	}

	void method884(final Class109_Sub18 var1, int var2) {
		if (((aClass109_Sub4_Sub3_1629.anIntArray1614[var1.anInt1116] & 4) != 0) && (var1.anInt1120 < 0)) {
			final int var3 = aClass109_Sub4_Sub3_1629.anIntArray1619[var1.anInt1116] / Class122.anInt848;
			final int var4 = ((var3 + 1048575) - var1.anInt1108) / var3;
			var1.anInt1108 = ((var2 * var3) + var1.anInt1108) & 1048575;
			if (var4 <= var2) {
				if (aClass109_Sub4_Sub3_1629.anIntArray1617[var1.anInt1116] == 0)
					var1.aClass109_Sub4_Sub2_1122 = Class109_Sub4_Sub2.method817(var1.aClass109_Sub3_Sub1_1106,
							var1.aClass109_Sub4_Sub2_1122.method798(), var1.aClass109_Sub4_Sub2_1122.method792(),
							var1.aClass109_Sub4_Sub2_1122.method793());
				else {
					var1.aClass109_Sub4_Sub2_1122 = Class109_Sub4_Sub2.method817(var1.aClass109_Sub3_Sub1_1106,
							var1.aClass109_Sub4_Sub2_1122.method798(), 0, var1.aClass109_Sub4_Sub2_1122.method793());
					aClass109_Sub4_Sub3_1629.method864(var1,
							var1.aClass109_Sub16_1105.aShortArray1091[var1.anInt1109] < 0);
				}

				if (var1.aClass109_Sub16_1105.aShortArray1091[var1.anInt1109] < 0)
					var1.aClass109_Sub4_Sub2_1122.method789(-1);

				var2 = var1.anInt1108 / var3;
			}
		}

		var1.aClass109_Sub4_Sub2_1122.method510(var2);
	}

	@Override
	protected Class109_Sub4 method509() {
		final Class109_Sub18 var1 = (Class109_Sub18) aClass126_1628.method458();
		return null == var1 ? null
				: (var1.aClass109_Sub4_Sub2_1122 != null ? var1.aClass109_Sub4_Sub2_1122 : method505());
	}

	@Override
	protected Class109_Sub4 method505() {
		Class109_Sub18 var1;
		do {
			var1 = (Class109_Sub18) aClass126_1628.method449();
			if (null == var1)
				return null;
		} while (var1.aClass109_Sub4_Sub2_1122 == null);

		return var1.aClass109_Sub4_Sub2_1122;
	}

	static void method885(final byte[] var0) {
		final DataBuffer var1 = new DataBuffer(var0);
		var1.position = var0.length - 2;
		Class9.anInt95 = var1.method566();
		Class9.anIntArray92 = new int[Class9.anInt95];
		Class9.anIntArray93 = new int[Class9.anInt95];
		Class106.anIntArray799 = new int[Class9.anInt95];
		Class9.anIntArray94 = new int[Class9.anInt95];
		Class9.aByteArrayArray97 = new byte[Class9.anInt95][];
		var1.position = var0.length - 7 - (Class9.anInt95 * 8);
		Canvas_Sub1.anInt1594 = var1.method566();
		Class9.anInt96 = var1.method566();
		final int var4 = (var1.method564() & 255) + 1;

		int var2;
		for (var2 = 0; var2 < Class9.anInt95; ++var2)
			Class9.anIntArray92[var2] = var1.method566();

		for (var2 = 0; var2 < Class9.anInt95; ++var2)
			Class9.anIntArray93[var2] = var1.method566();

		for (var2 = 0; var2 < Class9.anInt95; ++var2)
			Class106.anIntArray799[var2] = var1.method566();

		for (var2 = 0; var2 < Class9.anInt95; ++var2)
			Class9.anIntArray94[var2] = var1.method566();

		var1.position = var0.length - 7 - (Class9.anInt95 * 8) - ((var4 - 1) * 3);
		Class35.anIntArray336 = new int[var4];

		for (var2 = 1; var2 < var4; ++var2) {
			Class35.anIntArray336[var2] = var1.method567();
			if (Class35.anIntArray336[var2] == 0)
				Class35.anIntArray336[var2] = 1;
		}

		var1.position = 0;

		for (var2 = 0; var2 < Class9.anInt95; ++var2) {
			final int var9 = Class106.anIntArray799[var2];
			final int var3 = Class9.anIntArray94[var2];
			final int var10 = var9 * var3;
			final byte[] var6 = new byte[var10];
			Class9.aByteArrayArray97[var2] = var6;
			final int var8 = var1.method564();
			int var5;
			if (var8 == 0)
				for (var5 = 0; var5 < var10; ++var5)
					var6[var5] = var1.method612();
			else if (var8 == 1)
				for (var5 = 0; var5 < var9; ++var5)
					for (int var7 = 0; var7 < var3; ++var7)
						var6[var5 + (var9 * var7)] = var1.method612();
		}

	}

	static void method886() {
		final client var0 = client.aclient1968;
		synchronized (var0) {
			final Container var1 = client.aclient1968.method1051();
			if (var1 != null) {
				Class70.anInt595 = Math.max(var1.getSize().width, Class48.anInt504);
				Class109_Sub21_Sub15.anInt1574 = Math.max(var1.getSize().height, Class47.anInt494);
				Insets var2;
				if (var1 == Class109_Sub21_Sub17.aFrame1587) {
					var2 = Class109_Sub21_Sub17.aFrame1587.getInsets();
					Class70.anInt595 -= var2.left + var2.right;
					Class109_Sub21_Sub15.anInt1574 -= var2.bottom + var2.top;
				}

				if (Class70.anInt595 <= 0)
					Class70.anInt595 = 1;

				if (Class109_Sub21_Sub15.anInt1574 <= 0)
					Class109_Sub21_Sub15.anInt1574 = 1;

				if (Class58.method271() == 1) {
					LoginEncoder.anInt524 = client.anInt2185;
					Class109_Sub21_Sub15_Sub5.anInt1815 = client.anInt2231;
				} else {
					LoginEncoder.anInt524 = Math.min(Class70.anInt595, 7680);
					Class109_Sub21_Sub15_Sub5.anInt1815 = Math.min(Class109_Sub21_Sub15.anInt1574, 2160);
				}

				Applet_Sub1.anInt1963 = (Class70.anInt595 - LoginEncoder.anInt524) / 2;
				Applet_Sub1.anInt1957 = 0;
				Class109_Sub21_Sub10.aCanvas1472.setSize(LoginEncoder.anInt524, Class109_Sub21_Sub15_Sub5.anInt1815);
				Class44.aClass8_453 = Class63.method288(LoginEncoder.anInt524, Class109_Sub21_Sub15_Sub5.anInt1815,
						Class109_Sub21_Sub10.aCanvas1472);
				if (var1 == Class109_Sub21_Sub17.aFrame1587) {
					var2 = Class109_Sub21_Sub17.aFrame1587.getInsets();
					Class109_Sub21_Sub10.aCanvas1472.setLocation(Applet_Sub1.anInt1963 + var2.left,
							var2.top + Applet_Sub1.anInt1957);
				} else
					Class109_Sub21_Sub10.aCanvas1472.setLocation(Applet_Sub1.anInt1963, Applet_Sub1.anInt1957);

				Class33.method146();
				if (client.anInt2128 != -1)
					Class109_Sub21_Sub13.method766(true);

				Class54.method261();
			}
		}
	}
}
