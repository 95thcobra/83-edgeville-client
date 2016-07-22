import java.awt.datatransfer.Clipboard;

public class Class109_Sub21_Sub9 extends Class109_Sub21 {
	static Clipboard aClipboard1416;
	static Class104_Sub1 aClass104_Sub1_1418;
	static int anInt1420;
	static int[] anIntArray1422;
	int anInt1419 = Class109_Sub21_Sub2.method668();
	int anInt1414;
	int anInt1415;
	String aString1421;
	String aString1413;
	String aString1417;

	void method719(final int var1, final String var2, final String var3, final String var4) {
		anInt1419 = Class109_Sub21_Sub2.method668();
		anInt1414 = client.anInt1979;
		anInt1415 = var1;
		aString1421 = var2;
		aString1413 = var3;
		aString1417 = var4;
	}

	public static String method720(final int var0) {
		return ((var0 >> 24) & 255) + "." + ((var0 >> 16) & 255) + "." + ((var0 >> 8) & 255) + "." + (var0 & 255);
	}

	static final void method721(final DataBuffer var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6) {
		int var7;
		if ((var2 >= 0) && (var2 < 104) && (var3 >= 0) && (var3 < 104)) {
			Class27.aByteArrayArrayArray243[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.method564();
				if (var7 == 0) {
					if (var1 == 0)
						Class27.anIntArrayArrayArray251[0][var2][var3] = -Class23.method102(var4 + 932731 + var2,
								556238 + var3 + var5) * 8;
					else
						Class27.anIntArrayArrayArray251[var1][var2][var3] = Class27.anIntArrayArrayArray251[var1
								- 1][var2][var3] - 240;
					break;
				}

				if (var7 == 1) {
					int var8 = var0.method564();
					if (var8 == 1)
						var8 = 0;

					if (var1 == 0)
						Class27.anIntArrayArrayArray251[0][var2][var3] = -var8 * 8;
					else
						Class27.anIntArrayArrayArray251[var1][var2][var3] = Class27.anIntArrayArrayArray251[var1
								- 1][var2][var3] - (8 * var8);
					break;
				}

				if (var7 <= 49) {
					Class27.aByteArrayArrayArray246[var1][var2][var3] = var0.method612();
					Class55.aByteArrayArrayArray541[var1][var2][var3] = (byte) ((var7 - 2) / 4);
					Class109_Sub7.aByteArrayArrayArray970[var1][var2][var3] = (byte) (((var7 - 2) + var6) & 3);
				} else if (var7 <= 81)
					Class27.aByteArrayArrayArray243[var1][var2][var3] = (byte) (var7 - 49);
				else
					Class66.aByteArrayArrayArray577[var1][var2][var3] = (byte) (var7 - 81);
			}
		} else
			while (true) {
				var7 = var0.method564();
				if (var7 == 0)
					break;

				if (var7 == 1) {
					var0.method564();
					break;
				}

				if (var7 <= 49)
					var0.method564();
			}

	}

	static void method722() {
		Class5.aString67 = Class5.aString67.trim();
		if (Class5.aString67.length() == 0)
			Class99.method368("Please enter your username.", "If you created your account after November",
					"2010, this will be the creation email address.");
		else {
			final long var0 = DataBuffer.method619();
			int var2;
			if (0L == var0)
				var2 = 5;
			else
				var2 = Class97.method366(var0, Class5.aString67);

			switch (var2) {
			case 2:
				Class99.method368("", "Page has opened in a new window.", "(Please check your popup blocker.)");
				Class5.anInt63 = 6;
				break;
			case 3:
				Class99.method368("", "Error connecting to server.", "");
				break;
			case 4:
				Class99.method368("The part of the website you are trying", "to connect to is offline at the moment.",
						"Please try again later.");
				break;
			case 5:
				Class99.method368("Sorry, there was an error trying to", "log you in to this part of the website.",
						"Please try again later.");
				break;
			case 6:
				Class99.method368("", "Error connecting to server.", "");
				break;
			case 7:
				Class99.method368("You must enter a valid login to proceed. For accounts",
						"created after 24th November 2010, please use your",
						"email address. Otherwise please use your username.");
			}

		}
	}

	Class109_Sub21_Sub9(final int var1, final String var2, final String var3, final String var4) {
		anInt1414 = client.anInt1979;
		anInt1415 = var1;
		aString1421 = var2;
		aString1413 = var3;
		aString1417 = var4;
	}

	public static boolean method723(final char var0) {
		return ((var0 >= 48) && (var0 <= 57)) || ((var0 >= 65) && (var0 <= 90)) || ((var0 >= 97) && (var0 <= 122));
	}

	public static String method724(final byte[] var0, final int var1, final int var2) {
		final char[] var3 = new char[var2];
		int var4 = 0;

		for (int var6 = 0; var6 < var2; ++var6) {
			int var5 = var0[var1 + var6] & 255;
			if (var5 != 0) {
				if ((var5 >= 128) && (var5 < 160)) {
					char var7 = Class88.aCharArray672[var5 - 128];
					if (var7 == 0)
						var7 = 63;

					var5 = var7;
				}

				var3[var4++] = (char) var5;
			}
		}

		return new String(var3, 0, var4);
	}
}
