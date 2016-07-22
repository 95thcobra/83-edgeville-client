import java.util.Comparator;

final class Class115 implements Comparator {
	static Class104_Sub1 aClass104_Sub1_829;

	int method427(final Class114 var1, final Class114 var2) {
		return var1.aClass134_828.anInt882 < var2.aClass134_828.anInt882 ? -1
				: (var2.aClass134_828.anInt882 == var1.aClass134_828.anInt882 ? 0 : 1);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method427((Class114) var1, (Class114) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}

	public static int method428(final CharSequence var0, final CharSequence var1, final int var2) {
		final int var3 = var0.length();
		final int var10 = var1.length();
		int var5 = 0;
		int var9 = 0;
		byte var7 = 0;
		byte var8 = 0;

		while (((var5 - var7) < var3) || ((var9 - var8) < var10)) {
			if ((var5 - var7) >= var3)
				return -1;

			if ((var9 - var8) >= var10)
				return 1;

			char var11;
			if (var7 != 0) {
				var11 = (char) var7;
			} else
				var11 = var0.charAt(var5++);

			char var4;
			if (var8 != 0) {
				var4 = (char) var8;
			} else
				var4 = var1.charAt(var9++);

			byte var6;
			if (var11 == 198)
				var6 = 69;
			else if (var11 == 230)
				var6 = 101;
			else if (var11 == 223)
				var6 = 115;
			else if (var11 == 338)
				var6 = 69;
			else if (var11 == 339)
				var6 = 101;
			else
				var6 = 0;

			var7 = var6;
			byte var12;
			if (var4 == 198)
				var12 = 69;
			else if (var4 == 230)
				var12 = 101;
			else if (var4 == 223)
				var12 = 115;
			else if (var4 == 338)
				var12 = 69;
			else if (var4 == 339)
				var12 = 101;
			else
				var12 = 0;

			var8 = var12;
			var11 = Class109_Sub10.method539(var11);
			var4 = Class109_Sub10.method539(var4);
			if ((var4 != var11) && (Character.toUpperCase(var11) != Character.toUpperCase(var4))) {
				var11 = Character.toLowerCase(var11);
				var4 = Character.toLowerCase(var4);
				if (var11 != var4)
					return Class31.method139(var11) - Class31.method139(var4);
			}
		}

		final int var19 = Math.min(var3, var10);

		int var14;
		char var20;
		for (var14 = 0; var14 < var19; ++var14) {
			char var16 = var0.charAt(var14);
			var20 = var1.charAt(var14);
			if ((var20 != var16) && (Character.toUpperCase(var16) != Character.toUpperCase(var20))) {
				var16 = Character.toLowerCase(var16);
				var20 = Character.toLowerCase(var20);
				if (var20 != var16)
					return Class31.method139(var16) - Class31.method139(var20);
			}
		}

		var14 = var3 - var10;
		if (var14 != 0)
			return var14;
		else {
			for (int var18 = 0; var18 < var19; ++var18) {
				var20 = var0.charAt(var18);
				final char var13 = var1.charAt(var18);
				if (var13 != var20)
					return Class31.method139(var20) - Class31.method139(var13);
			}

			return 0;
		}
	}
}
