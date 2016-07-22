import java.awt.Component;

public abstract class Class66 {
	static byte[][][] aByteArrayArrayArray577;
	public static char aChar578;
	static String[] aStringArray579;
	public static Class109_Sub19 aClass109_Sub19_580;

	static void method292() {
		Class109_Sub12.aClass116_1043 = new Class116(32);
	}

	public abstract void method293(Component var1, byte var2);

	public abstract void method294(Component var1, byte var2);

	public static void method295(final Component var0) {
		var0.removeKeyListener(Class63.aClass63_573);
		var0.removeFocusListener(Class63.aClass63_573);
		Class63.anInt566 = -1;
	}

	static final void method296() {
		final int var0 = Class109_Sub18.anInt1125;
		final int var1 = Class70.anInt596;
		final int var2 = Class79.anInt629;
		final int var3 = Class88.anInt670;
		final int var4 = 6116423;
		Class109_Sub21_Sub14.method773(var0, var1, var2, var3, var4);
		Class109_Sub21_Sub14.method773(1 + var0, var1 + 1, var2 - 2, 16, 0);
		Class109_Sub21_Sub14.method775(var0 + 1, 18 + var1, var2 - 2, var3 - 19, 0);
		Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334.method1014("Choose Option", 3 + var0, var1 + 14, var4,
				-1);
		final int var8 = Class81.anInt637;
		final int var7 = Class81.anInt638;

		for (int var5 = 0; var5 < client.anInt2045; ++var5) {
			final int var6 = 31 + var1 + (15 * (client.anInt2045 - 1 - var5));
			int var10 = 16777215;
			if ((var8 > var0) && (var8 < (var2 + var0)) && (var7 > (var6 - 13)) && (var7 < (3 + var6)))
				var10 = 16776960;

			final Class109_Sub21_Sub14_Sub4_Sub1 var11 = Class109_Sub21_Sub4.aClass109_Sub21_Sub14_Sub4_Sub1_1334;
			String var9;
			if (client.aStringArray2123[var5].length() > 0)
				var9 = client.aStringArray1975[var5] + " " + client.aStringArray2123[var5];
			else
				var9 = client.aStringArray1975[var5];

			var11.method1014(var9, var0 + 3, var6, var10, 0);
		}

		Class20.method96(Class109_Sub18.anInt1125, Class70.anInt596, Class79.anInt629, Class88.anInt670);
	}

	public abstract int method297(byte var1);

	static final void method298(final String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			Class50.aClass21_513.aBool194 = !Class50.aClass21_513.aBool194;
			Class7.method46(-840141801);
			if (Class50.aClass21_513.aBool194)
				Applet_Sub1.method1053(99, "", "Roofs are now all hidden");
			else
				Applet_Sub1.method1053(99, "", "Roofs will only be removed selectively");
		}

		if (var0.equalsIgnoreCase("displayfps"))
			client.aBool1986 = !client.aBool1986;

		if (client.anInt2135 >= 2) {
			if (var0.equalsIgnoreCase("fpson"))
				client.aBool1986 = true;

			if (var0.equalsIgnoreCase("fpsoff"))
				client.aBool1986 = false;

			if (var0.equalsIgnoreCase("gc"))
				System.gc();

			if (var0.equalsIgnoreCase("clientdrop"))
				if (client.anInt2016 > 0)
					Class59.method275();
				else {
					Class82.method343(40);
					Class109_Sub6.aClass82_962 = Class48.aClass82_506;
					Class48.aClass82_506 = null;
				}

			if (var0.equalsIgnoreCase("errortest") && (client.anInt1972 == 2))
				throw new RuntimeException();
		}

		client.secureBuffer.method840(235);
		client.secureBuffer.writeByte(var0.length() + 1);
		client.secureBuffer.writeString(var0);
	}
}
