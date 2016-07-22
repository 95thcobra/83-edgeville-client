public class Class109_Sub2 extends Class109 {
	boolean aBool917 = false;
	int anInt909;
	boolean aBool910;
	int[] anIntArray913;
	int[] anIntArray911;
	int[] anIntArray908;
	int[] anIntArray915;
	int anInt914;
	int anInt912;
	int[] anIntArray916;
	static int[] anIntArray918;

	Class109_Sub2(final DataBuffer var1) {
		anInt909 = var1.readShort();
		aBool910 = var1.method564() == 1;
		final int var2 = var1.method564();
		if ((var2 >= 1) && (var2 <= 4)) {
			anIntArray913 = new int[var2];

			int var3;
			for (var3 = 0; var3 < var2; ++var3)
				anIntArray913[var3] = var1.readShort();

			if (var2 > 1) {
				anIntArray911 = new int[var2 - 1];

				for (var3 = 0; var3 < (var2 - 1); ++var3)
					anIntArray911[var3] = var1.method564();
			}

			if (var2 > 1) {
				anIntArray908 = new int[var2 - 1];

				for (var3 = 0; var3 < (var2 - 1); ++var3)
					anIntArray908[var3] = var1.method564();
			}

			anIntArray915 = new int[var2];

			for (var3 = 0; var3 < var2; ++var3)
				anIntArray915[var3] = var1.readInt();

			anInt914 = var1.method564();
			anInt912 = var1.method564();
			anIntArray916 = null;
		} else
			throw new RuntimeException();
	}

	boolean method501(final double var1, final int var3, final Class104 var4) {
		int var5;
		for (var5 = 0; var5 < anIntArray913.length; ++var5)
			if (var4.method406(anIntArray913[var5]) == null)
				return false;

		var5 = var3 * var3;
		anIntArray916 = new int[var5];

		for (int var7 = 0; var7 < anIntArray913.length; ++var7) {
			final Class109_Sub21_Sub14_Sub1 var9 = Class33.method148(var4, anIntArray913[var7]);
			var9.method904();
			final byte[] var12 = var9.aByteArray1711;
			final int[] var10 = var9.anIntArray1718;
			final int var8 = anIntArray915[var7];
			if ((var8 & -16777216) == 16777216)
				;

			if ((var8 & -16777216) == 33554432)
				;

			int var6;
			int var11;
			int var13;
			int var14;
			if ((var8 & -16777216) == 50331648) {
				var14 = var8 & 16711935;
				var11 = (var8 >> 8) & 255;

				for (var13 = 0; var13 < var10.length; ++var13) {
					var6 = var10[var13];
					if ((var6 & '\uffff') == (var6 >> 8)) {
						var6 &= 255;
						var10[var13] = (((var14 * var6) >> 8) & 16711935) | ((var11 * var6) & '\uff00');
					}
				}
			}

			for (var14 = 0; var14 < var10.length; ++var14)
				var10[var14] = Class109_Sub21_Sub14_Sub3.method963(var10[var14], var1);

			if (var7 == 0)
				var14 = 0;
			else
				var14 = anIntArray911[var7 - 1];

			if (var7 == 0)
				;

			if (var14 == 0)
				if (var9.anInt1713 == var3)
					for (var11 = 0; var11 < var5; ++var11)
						anIntArray916[var11] = var10[var12[var11] & 255];
				else if ((var9.anInt1713 == 64) && (var3 == 128)) {
					var11 = 0;

					for (var13 = 0; var13 < var3; ++var13)
						for (var6 = 0; var6 < var3; ++var6)
							anIntArray916[var11++] = var10[var12[(var6 >> 1) + ((var13 >> 1) << 6)] & 255];
				} else {
					if ((var9.anInt1713 != 128) || (var3 != 64))
						throw new RuntimeException();

					var11 = 0;

					for (var13 = 0; var13 < var3; ++var13)
						for (var6 = 0; var6 < var3; ++var6)
							anIntArray916[var11++] = var10[var12[(var6 << 1) + (var13 << 1 << 7)] & 255];
				}

			if (var14 == 1)
				;

			if (var14 == 2)
				;

			if (var14 == 3)
				;
		}

		return true;
	}

	void method502() {
		anIntArray916 = null;
	}

	void method503(final int var1) {
		if (anIntArray916 != null) {
			int var2;
			int var3;
			int[] var4;
			short var5;
			int var6;
			int var7;
			int var8;
			if ((anInt914 == 1) || (anInt914 == 3)) {
				if ((anIntArray918 == null) || (anIntArray918.length < anIntArray916.length))
					anIntArray918 = new int[anIntArray916.length];

				if (anIntArray916.length == 4096)
					var5 = 64;
				else
					var5 = 128;

				var3 = anIntArray916.length;
				var6 = var5 * var1 * anInt912;
				var7 = var3 - 1;
				if (anInt914 == 1)
					var6 = -var6;

				for (var2 = 0; var2 < var3; ++var2) {
					var8 = (var2 + var6) & var7;
					anIntArray918[var2] = anIntArray916[var8];
				}

				var4 = anIntArray916;
				anIntArray916 = anIntArray918;
				anIntArray918 = var4;
			}

			if ((anInt914 == 2) || (anInt914 == 4)) {
				if ((anIntArray918 == null) || (anIntArray918.length < anIntArray916.length))
					anIntArray918 = new int[anIntArray916.length];

				if (anIntArray916.length == 4096)
					var5 = 64;
				else
					var5 = 128;

				var3 = anIntArray916.length;
				var6 = var1 * anInt912;
				var7 = var5 - 1;
				if (anInt914 == 2)
					var6 = -var6;

				for (var2 = 0; var2 < var3; var2 += var5)
					for (var8 = 0; var8 < var5; ++var8) {
						final int var9 = var2 + var8;
						final int var10 = var2 + ((var8 + var6) & var7);
						anIntArray918[var9] = anIntArray916[var10];
					}

				var4 = anIntArray916;
				anIntArray916 = anIntArray918;
				anIntArray918 = var4;
			}

		}
	}
}
