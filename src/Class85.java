public class Class85 {
	static int anInt660;
	static char[] aCharArray659 = new char[64];
	static char[] aCharArray661;
	static int[] anIntArray658;

	static {
		int var0;
		for (var0 = 0; var0 < 26; ++var0)
			aCharArray659[var0] = (char) (65 + var0);

		for (var0 = 26; var0 < 52; ++var0)
			aCharArray659[var0] = (char) ((97 + var0) - 26);

		for (var0 = 52; var0 < 62; ++var0)
			aCharArray659[var0] = (char) ((var0 + 48) - 52);

		aCharArray659[62] = 43;
		aCharArray659[63] = 47;
		aCharArray661 = new char[64];

		for (var0 = 0; var0 < 26; ++var0)
			aCharArray661[var0] = (char) (var0 + 65);

		for (var0 = 26; var0 < 52; ++var0)
			aCharArray661[var0] = (char) ((97 + var0) - 26);

		for (var0 = 52; var0 < 62; ++var0)
			aCharArray661[var0] = (char) ((48 + var0) - 52);

		aCharArray661[62] = 42;
		aCharArray661[63] = 45;
		anIntArray658 = new int[128];

		for (var0 = 0; var0 < anIntArray658.length; ++var0)
			anIntArray658[var0] = -1;

		for (var0 = 65; var0 <= 90; ++var0)
			anIntArray658[var0] = var0 - 65;

		for (var0 = 97; var0 <= 122; ++var0)
			anIntArray658[var0] = (var0 - 97) + 26;

		for (var0 = 48; var0 <= 57; ++var0)
			anIntArray658[var0] = 52 + (var0 - 48);

		final int[] var1 = anIntArray658;
		anIntArray658[43] = 62;
		var1[42] = 62;
		final int[] var2 = anIntArray658;
		anIntArray658[47] = 63;
		var2[45] = 63;
	}

	static Class109_Sub20 method348(final Class109_Sub20 var0) {
		Class109_Sub20 var1 = var0;
		final int var6 = Class52.method256(var0);
		final int var7 = (var6 >> 17) & 7;
		final int var4 = var7;
		Class109_Sub20 var2;
		if (var7 == 0)
			var2 = null;
		else {
			int var3 = 0;

			while (true) {
				if (var3 >= var4) {
					var2 = var1;
					break;
				}

				var1 = Class83.method345(var1.anInt1166);
				if (var1 == null) {
					var2 = null;
					break;
				}

				++var3;
			}
		}

		Class109_Sub20 var5 = var2;
		if (null == var2)
			var5 = var0.aClass109_Sub20_1139;

		return var5;
	}

	static void method349(final Class109_Sub20 var0, final int var1, final int var2) {
		if (var0.anInt1152 == 0)
			var0.anInt1160 = var0.anInt1210;
		else if (var0.anInt1152 == 1)
			var0.anInt1160 = ((var1 - var0.anInt1162) / 2) + var0.anInt1210;
		else if (var0.anInt1152 == 2)
			var0.anInt1160 = var1 - var0.anInt1162 - var0.anInt1210;
		else if (var0.anInt1152 == 3)
			var0.anInt1160 = (var1 * var0.anInt1210) >> 14;
		else if (var0.anInt1152 == 4)
			var0.anInt1160 = ((var1 - var0.anInt1162) / 2) + ((var0.anInt1210 * var1) >> 14);
		else
			var0.anInt1160 = var1 - var0.anInt1162 - ((var0.anInt1210 * var1) >> 14);

		if (var0.anInt1153 == 0)
			var0.anInt1161 = var0.anInt1157;
		else if (var0.anInt1153 == 1)
			var0.anInt1161 = var0.anInt1157 + ((var2 - var0.anInt1163) / 2);
		else if (var0.anInt1153 == 2)
			var0.anInt1161 = var2 - var0.anInt1163 - var0.anInt1157;
		else if (var0.anInt1153 == 3)
			var0.anInt1161 = (var2 * var0.anInt1157) >> 14;
		else if (var0.anInt1153 == 4)
			var0.anInt1161 = ((var2 * var0.anInt1157) >> 14) + ((var2 - var0.anInt1163) / 2);
		else
			var0.anInt1161 = var2 - var0.anInt1163 - ((var2 * var0.anInt1157) >> 14);

		if (client.aBool2138 && (var0.anInt1229 == 0)) {
			if (var0.anInt1160 < 0)
				var0.anInt1160 = 0;
			else if ((var0.anInt1162 + var0.anInt1160) > var1)
				var0.anInt1160 = var1 - var0.anInt1162;

			if (var0.anInt1161 < 0)
				var0.anInt1161 = 0;
			else if ((var0.anInt1161 + var0.anInt1163) > var2)
				var0.anInt1161 = var2 - var0.anInt1163;
		}

	}
}
