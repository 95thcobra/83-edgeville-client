public class Class108 {
	public static boolean method412(final int var0) {
		if (Class112.aBoolArray810[var0])
			return true;
		else if (!Class109_Sub20.aClass104_1269.method407(var0))
			return false;
		else {
			final int var3 = Class109_Sub20.aClass104_1269.method401(var0);
			if (var3 == 0) {
				Class112.aBoolArray810[var0] = true;
				return true;
			} else {
				if (Class109_Sub20.aClass109_Sub20ArrayArray1150[var0] == null)
					Class109_Sub20.aClass109_Sub20ArrayArray1150[var0] = new Class109_Sub20[var3];

				for (int var1 = 0; var1 < var3; ++var1)
					if (null == Class109_Sub20.aClass109_Sub20ArrayArray1150[var0][var1]) {
						final byte[] var2 = Class109_Sub20.aClass104_1269.method387(var0, var1);
						if (null != var2) {
							Class109_Sub20.aClass109_Sub20ArrayArray1150[var0][var1] = new Class109_Sub20();
							Class109_Sub20.aClass109_Sub20ArrayArray1150[var0][var1].anInt1148 = var1 + (var0 << 16);
							if (var2[0] == -1)
								Class109_Sub20.aClass109_Sub20ArrayArray1150[var0][var1]
										.method654(new DataBuffer(var2));
							else
								Class109_Sub20.aClass109_Sub20ArrayArray1150[var0][var1]
										.method645(new DataBuffer(var2));
						}
					}

				Class112.aBoolArray810[var0] = true;
				return true;
			}
		}
	}
}
