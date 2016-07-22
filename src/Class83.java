public class Class83 {
	public static Class109_Sub20 method345(final int var0) {
		final int var1 = var0 >> 16;
		final int var3 = var0 & '\uffff';
		if ((Class109_Sub20.aClass109_Sub20ArrayArray1150[var1] == null)
				|| (null == Class109_Sub20.aClass109_Sub20ArrayArray1150[var1][var3])) {
			final boolean var2 = Class108.method412(var1);
			if (!var2)
				return null;
		}

		return Class109_Sub20.aClass109_Sub20ArrayArray1150[var1][var3];
	}

	static Class method346(final String var0) throws ClassNotFoundException {
		return var0.equals("B") ? Byte.TYPE
				: (var0.equals("I") ? Integer.TYPE
						: (var0.equals("S") ? Short.TYPE
								: (var0.equals("J") ? Long.TYPE
										: (var0.equals("Z") ? Boolean.TYPE
												: (var0.equals("F") ? Float.TYPE
														: (var0.equals("D") ? Double.TYPE
																: (var0.equals("C") ? Character.TYPE
																		: (var0.equals("void") ? Void.TYPE
																				: Class.forName(var0)))))))));
	}
}
