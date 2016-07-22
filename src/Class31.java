public class Class31 {
	static boolean aBool308;
	public static Class17 aClass17_309;
	static Class109_Sub21_Sub14_Sub1[] aClass109_Sub21_Sub14_Sub1Array312;
	int anInt310;
	Class109_Sub21_Sub9[] aClass109_Sub21_Sub9Array311 = new Class109_Sub21_Sub9[100];

	static final void method135() {
		final int var0 = Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1710 + client.anInt2037;
		final int var4 = client.anInt2033 + Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.anInt1653;
		if (((Class19.anInt182 - var0) < -500) || ((Class19.anInt182 - var0) > 500)
				|| ((Class109_Sub21_Sub15.anInt1575 - var4) < -500)
				|| ((Class109_Sub21_Sub15.anInt1575 - var4) > 500)) {
			Class19.anInt182 = var0;
			Class109_Sub21_Sub15.anInt1575 = var4;
		}

		if (Class19.anInt182 != var0)
			Class19.anInt182 += (var0 - Class19.anInt182) / 16;

		if (Class109_Sub21_Sub15.anInt1575 != var4)
			Class109_Sub21_Sub15.anInt1575 += (var4 - Class109_Sub21_Sub15.anInt1575) / 16;

		int var2;
		int var7;
		if ((Class81.anInt636 == 4) && Class3.aBool22) {
			var2 = Class81.anInt638 - client.anInt2247;
			client.anInt2164 = var2 * 2;
			client.anInt2247 = (var2 != -1) && (var2 != 1) ? (Class81.anInt638 + client.anInt2247) / 2
					: Class81.anInt638;
			var7 = client.anInt2055 - Class81.anInt637;
			client.anInt2053 = var7 * 2;
			client.anInt2055 = (var7 != -1) && (var7 != 1) ? (client.anInt2055 + Class81.anInt637) / 2
					: Class81.anInt637;
		} else {
			if (Class63.aBoolArray562[96])
				client.anInt2053 += (-24 - client.anInt2053) / 2;
			else if (Class63.aBoolArray562[97])
				client.anInt2053 += (24 - client.anInt2053) / 2;
			else
				client.anInt2053 /= 2;

			if (Class63.aBoolArray562[98])
				client.anInt2164 += (12 - client.anInt2164) / 2;
			else if (Class63.aBoolArray562[99])
				client.anInt2164 += (-12 - client.anInt2164) / 2;
			else
				client.anInt2164 /= 2;

			client.anInt2247 = Class81.anInt638;
			client.anInt2055 = Class81.anInt637;
		}

		client.anInt2052 = ((client.anInt2053 / 2) + client.anInt2052) & 2047;
		client.anInt1991 += client.anInt2164 / 2;
		if (client.anInt1991 < 128)
			client.anInt1991 = 128;

		if (client.anInt1991 > 383)
			client.anInt1991 = 383;

		var2 = Class19.anInt182 >> 7;
		var7 = Class109_Sub21_Sub15.anInt1575 >> 7;
		final int var6 = Class41.method174(Class19.anInt182, Class109_Sub21_Sub15.anInt1575, Class77.anInt616);
		int var9 = 0;
		int var1;
		if ((var2 > 3) && (var7 > 3) && (var2 < 100) && (var7 < 100))
			for (var1 = var2 - 4; var1 <= (4 + var2); ++var1)
				for (int var5 = var7 - 4; var5 <= (var7 + 4); ++var5) {
					int var3 = Class77.anInt616;
					if ((var3 < 3) && ((Class27.aByteArrayArrayArray243[1][var1][var5] & 2) == 2))
						++var3;

					final int var8 = var6 - Class27.anIntArrayArrayArray251[var3][var1][var5];
					if (var8 > var9)
						var9 = var8;
				}

		var1 = var9 * 192;
		if (var1 > 98048)
			var1 = 98048;

		if (var1 < '\u8000')
			var1 = '\u8000';

		if (var1 > client.anInt2058)
			client.anInt2058 += (var1 - client.anInt2058) / 24;
		else if (var1 < client.anInt2058)
			client.anInt2058 += (var1 - client.anInt2058) / 80;

	}

	Class109_Sub21_Sub9 method136(final int var1, final String var2, final String var3, final String var4) {
		Class109_Sub21_Sub9 var5 = aClass109_Sub21_Sub9Array311[99];

		for (int var6 = anInt310; var6 > 0; --var6)
			if (var6 != 100)
				aClass109_Sub21_Sub9Array311[var6] = aClass109_Sub21_Sub9Array311[var6 - 1];

		if (null == var5)
			var5 = new Class109_Sub21_Sub9(var1, var2, var4, var3);
		else {
			var5.method413();
			var5.method658();
			var5.method719(var1, var2, var4, var3);
		}

		aClass109_Sub21_Sub9Array311[0] = var5;
		if (anInt310 < 100)
			++anInt310;

		return var5;
	}

	Class109_Sub21_Sub9 method137(final int var1) {
		return (var1 >= 0) && (var1 < anInt310) ? aClass109_Sub21_Sub9Array311[var1] : null;
	}

	int method138() {
		return anInt310;
	}

	static int method139(char var0) {
		int var1 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var1 = 1 + (var0 << 4);
		}

		return var1;
	}
}
