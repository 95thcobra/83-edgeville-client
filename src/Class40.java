import java.util.Comparator;

final class Class40 implements Comparator {
	static String aString370;
	// $FF: synthetic field
	boolean val$preferOwnWorld;

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method171((Class114) var1, (Class114) var2);
	}

	Class40(final boolean var1) {
		val$preferOwnWorld = var1;
	}

	int method171(final Class114 var1, final Class114 var2) {
		if (var2.anInt826 == var1.anInt826)
			return 0;
		else {
			if (val$preferOwnWorld) {
				if (client.anInt1970 == var1.anInt826)
					return -1;

				if (client.anInt1970 == var2.anInt826)
					return 1;
			}

			return var1.anInt826 < var2.anInt826 ? -1 : 1;
		}
	}

	static final void method172(final byte[] var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7, final Class138[] var8) {
		int var12;
		for (int var9 = 0; var9 < 8; ++var9)
			for (var12 = 0; var12 < 8; ++var12)
				if (((var9 + var2) > 0) && ((var9 + var2) < 103) && ((var3 + var12) > 0) && ((var3 + var12) < 103))
					var8[var1].anIntArrayArray892[var9 + var2][var3 + var12] &= -16777217;

		final DataBuffer var13 = new DataBuffer(var0);

		for (var12 = 0; var12 < 4; ++var12)
			for (int var11 = 0; var11 < 64; ++var11)
				for (int var10 = 0; var10 < 64; ++var10)
					if ((var4 == var12) && (var11 >= var5) && (var11 < (var5 + 8)) && (var10 >= var6)
							&& (var10 < (var6 + 8)))
						Class109_Sub21_Sub9.method721(var13, var1,
								var2 + Class109_Sub15.method623(var11 & 7, var10 & 7, var7),
								var3 + Class109_Sub21_Sub6.method702(var11 & 7, var10 & 7, var7), 0, 0, var7);
					else
						Class109_Sub21_Sub9.method721(var13, 0, -1, -1, 0, 0, 0);

	}
}
