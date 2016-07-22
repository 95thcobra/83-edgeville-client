import java.applet.Applet;
import java.awt.Component;
import java.net.URL;

import netscape.javascript.JSObject;

public final class Class27 {
	static byte[][][] aByteArrayArrayArray246;
	static Class104_Sub1 aClass104_Sub1_255;
	static int[] anIntArray256;
	static byte[][][] aByteArrayArrayArray257;
	static Class109_Sub20[] aClass109_Sub20Array258;
	static int anInt259;
	static int anInt261;
	static int[][][] anIntArrayArrayArray251 = new int[4][105][105];
	static byte[][][] aByteArrayArrayArray243 = new byte[4][104][104];
	static int anInt245 = 99;
	static int[] anIntArray248 = new int[] { 1, 2, 4, 8 };
	static int[] anIntArray249 = new int[] { 16, 32, 64, 128 };
	static int[] anIntArray250 = new int[] { 1, 0, -1, 0 };
	static int[] anIntArray247 = new int[] { 0, -1, 0, 1 };
	static int[] anIntArray252 = new int[] { 1, -1, -1, 1 };
	static int[] anIntArray253 = new int[] { -1, -1, 1, 1 };
	static int anInt254 = (int) (Math.random() * 17.0D) - 8;
	static int anInt244 = (int) (Math.random() * 33.0D) - 16;
	public static Class104 aClass104_260;

	public static boolean method121(final Class104 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method387(var1, var2);
		if (var3 == null)
			return false;
		else {
			Class109_Sub4_Sub4.method885(var3);
			return true;
		}
	}

	static void method122(final Component var0, final Class104 var1, final Class104 var2, final boolean var3,
			final int var4) {
		if (Class5.aBool72) {
			if (var4 == 4)
				Class5.anInt63 = 4;

		} else {
			Class5.anInt63 = var4;
			Class109_Sub21_Sub14.method783();
			final byte[] var6 = var1.method402("title.jpg", "");
			Class49.aClass109_Sub21_Sub14_Sub2_511 = new Class109_Sub21_Sub14_Sub2(var6, var0);
			Class8_Sub2.aClass109_Sub21_Sub14_Sub2_904 = Class49.aClass109_Sub21_Sub14_Sub2_511.method927();
			Class5.aClass109_Sub21_Sub14_Sub1_52 = Class105.method410(var2, "logo", "");
			Class5.aClass109_Sub21_Sub14_Sub1_59 = Class105.method410(var2, "titlebox", "");
			Class5.aClass109_Sub21_Sub14_Sub1_49 = Class105.method410(var2, "titlebutton", "");
			Class78.aClass109_Sub21_Sub14_Sub1Array626 = Class50.method251(var2, "runes", "");
			Class5.aClass109_Sub21_Sub14_Sub1Array53 = Class50.method251(var2, "title_mute", "");
			Class5.aClass109_Sub21_Sub14_Sub1_54 = Class105.method410(var2, "options_radio_buttons,0", "");
			Class33.aClass109_Sub21_Sub14_Sub1_324 = Class105.method410(var2, "options_radio_buttons,2", "");
			Class68.anIntArray587 = new int[256];

			int var5;
			for (var5 = 0; var5 < 64; ++var5)
				Class68.anIntArray587[var5] = var5 * 262144;

			for (var5 = 0; var5 < 64; ++var5)
				Class68.anIntArray587[var5 + 64] = 16711680 + (1024 * var5);

			for (var5 = 0; var5 < 64; ++var5)
				Class68.anIntArray587[var5 + 128] = (var5 * 4) + 16776960;

			for (var5 = 0; var5 < 64; ++var5)
				Class68.anIntArray587[192 + var5] = 16777215;

			Class109_Sub21_Sub15_Sub1.anIntArray1639 = new int[256];

			for (var5 = 0; var5 < 64; ++var5)
				Class109_Sub21_Sub15_Sub1.anIntArray1639[var5] = var5 * 1024;

			for (var5 = 0; var5 < 64; ++var5)
				Class109_Sub21_Sub15_Sub1.anIntArray1639[var5 + 64] = '\uff00' + (var5 * 4);

			for (var5 = 0; var5 < 64; ++var5)
				Class109_Sub21_Sub15_Sub1.anIntArray1639[var5 + 128] = (var5 * 262144) + '\uffff';

			for (var5 = 0; var5 < 64; ++var5)
				Class109_Sub21_Sub15_Sub1.anIntArray1639[192 + var5] = 16777215;

			IsaacCipher.anIntArray560 = new int[256];

			for (var5 = 0; var5 < 64; ++var5)
				IsaacCipher.anIntArray560[var5] = 4 * var5;

			for (var5 = 0; var5 < 64; ++var5)
				IsaacCipher.anIntArray560[64 + var5] = 255 + (262144 * var5);

			for (var5 = 0; var5 < 64; ++var5)
				IsaacCipher.anIntArray560[128 + var5] = (var5 * 1024) + 16711935;

			for (var5 = 0; var5 < 64; ++var5)
				IsaacCipher.anIntArray560[var5 + 192] = 16777215;

			Class109_Sub13.anIntArray1047 = new int[256];
			Class3.anIntArray25 = new int['\u8000'];
			Class109_Sub8.anIntArray995 = new int['\u8000'];
			Class80.method333((Class109_Sub21_Sub14_Sub1) null);
			Class109_Sub10.anIntArray1024 = new int['\u8000'];
			Class29.anIntArray268 = new int['\u8000'];
			if (var3) {
				Class5.aString67 = "";
				Class5.aString68 = "";
			}

			Class109_Sub21_Sub6.anInt1389 = 0;
			Class40.aString370 = "";
			Class5.aBool70 = true;
			Class5.aBool73 = false;
			if (!Class50.aClass21_513.aBool195) {
				final Class104_Sub1 var7 = Class46.aClass104_Sub1_486;
				final int var8 = var7.method396("scape main");
				final int var9 = var7.method397(var8, "");
				Class93.anInt703 = 1;
				aClass104_260 = var7;
				Class75.anInt613 = var8;
				Class109_Sub21_Sub15_Sub3_Sub1.anInt1926 = var9;
				Class79.anInt628 = 255;
				Class25.aBool224 = false;
				Class54.anInt538 = 2;
			} else {
				Class93.anInt703 = 1;
				aClass104_260 = null;
				Class75.anInt613 = -1;
				Class109_Sub21_Sub15_Sub3_Sub1.anInt1926 = -1;
				Class79.anInt628 = 0;
				Class25.aBool224 = false;
				Class54.anInt538 = 2;
			}

			Class109_Sub21_Sub15_Sub2.method893(false);
			Class5.aBool72 = true;
			Class5.anInt48 = (LoginEncoder.anInt524 - client.anInt2185) / 2;
			Class5.anInt71 = 202 + Class5.anInt48;
			Class49.aClass109_Sub21_Sub14_Sub2_511.method914(Class5.anInt48, 0);
			Class8_Sub2.aClass109_Sub21_Sub14_Sub2_904.method914(382 + Class5.anInt48, 0);
			Class5.aClass109_Sub21_Sub14_Sub1_52
					.method905((382 + Class5.anInt48) - (Class5.aClass109_Sub21_Sub14_Sub1_52.anInt1713 / 2), 18);
		}
	}

	static int method123(final Class46 var0, final Class46 var1, final int var2, final boolean var3, final int var4,
			final boolean var5) {
		final int var6 = Class109_Sub20.method657(var0, var1, var2, var3);
		if (var6 != 0)
			return var3 ? -var6 : var6;
		else if (var4 == -1)
			return 0;
		else {
			final int var7 = Class109_Sub20.method657(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	public static void method124() {
		final Class81 var0 = Class81.aClass81_644;
		synchronized (var0) {
			Class81.anInt636 = Class81.anInt633;
			Class81.anInt637 = Class81.anInt634;
			Class81.anInt638 = Class81.anInt635;
			Class81.anInt643 = Class81.anInt646;
			Class81.anInt645 = Class81.anInt640;
			Class81.anInt639 = Class81.anInt641;
			Class81.aLong632 = Class81.aLong642;
			Class81.anInt646 = 0;
		}
	}

	static boolean method125(final String var0, final int var1, final String var2) {
		if (var1 == 0)
			try {
				if (!Class69.aString592.startsWith("win"))
					throw new Exception();
				else if (!var0.startsWith("http://") && !var0.startsWith("https://"))
					throw new Exception();
				else {
					final String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4)
						if (var11.indexOf(var0.charAt(var4)) == -1)
							throw new Exception();

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (final Throwable var5) {
				return false;
			}
		else if (var1 == 1)
			try {
				final Object var10 = Class73.method328(Class69.anApplet593, var2,
						new Object[] { (new URL(Class69.anApplet593.getCodeBase(), var0)).toString() });
				return null != var10;
			} catch (final Throwable var6) {
				return false;
			}
		else if (var1 == 2)
			try {
				Class69.anApplet593.getAppletContext().showDocument(new URL(Class69.anApplet593.getCodeBase(), var0),
						"_blank");
				return true;
			} catch (final Exception var7) {
				return false;
			}
		else if (var1 == 3) {
			try {
				final Applet var3 = Class69.anApplet593;
				JSObject.getWindow(var3).call("loggedout", (Object[]) null);
			} catch (final Throwable var9) {
				;
			}

			try {
				Class69.anApplet593.getAppletContext().showDocument(new URL(Class69.anApplet593.getCodeBase(), var0),
						"_top");
				return true;
			} catch (final Exception var8) {
				return false;
			}
		} else
			throw new IllegalArgumentException();
	}

	public static void method126(final Class104 var0, final Class104 var1, final Class104 var2, final Class104 var3) {
		Class109_Sub20.aClass104_1269 = var0;
		Class109_Sub20.aClass104_1140 = var1;
		Class109_Sub21_Sub2.aClass104_1306 = var2;
		Class52.aClass104_527 = var3;
		Class109_Sub20.aClass109_Sub20ArrayArray1150 = new Class109_Sub20[Class109_Sub20.aClass104_1269.method403()][];
		Class112.aBoolArray810 = new boolean[Class109_Sub20.aClass104_1269.method403()];
	}
}
