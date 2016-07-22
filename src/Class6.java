import java.awt.event.ActionEvent;

public class Class6 implements Runnable {
	Class71 aClass71_79;
	static Class109_Sub4_Sub1 aClass109_Sub4_Sub1_81;
	volatile boolean aBool80 = false;
	volatile Class4[] aClass4Array78 = new Class4[2];
	volatile boolean aBool77 = false;

	static String method38(final Class109_Sub20 var0) {
		return Class109_Sub6.method521(Class52.method256(var0)) == 0 ? null
				: ((var0.aString1276 != null) && (var0.aString1276.trim().length() != 0) ? var0.aString1276 : null);
	}

	@Override
	public void run() {
		aBool80 = true;

		try {
			try {
				while (!aBool77) {
					Class4 var2;
					for (int var1 = 0; var1 < 2; ++var1) {
						var2 = aClass4Array78[var1];
						if (null != var2)
							var2.method34();
					}

					Class94.method356(10L);
					final Class71 var3 = aClass71_79;
					var2 = null;
					if (null != var3.anEventQueue602) {
						for (int var4 = 0; (var4 < 50) && (var3.anEventQueue602.peekEvent() != null); ++var4)
							Class94.method356(1L);

						if (null != var2)
							var3.anEventQueue602.postEvent(new ActionEvent(var2, 1001, "dummy"));
					}
				}
			} catch (final Exception var8) {
				Class47.method237((String) null, var8);
				aBool80 = false;
				return;
			}

			aBool80 = false;
		} finally {
			aBool80 = false;
		}
	}

	public static String method39(final CharSequence var0, final Class113 var1) {
		if (null == var0)
			return null;
		else {
			int var7 = 0;

			int var6;
			for (var6 = var0.length(); (var7 < var6) && Class104.method409(var0.charAt(var7)); ++var7)
				;

			while ((var6 > var7) && Class104.method409(var0.charAt(var6 - 1)))
				--var6;

			final int var4 = var6 - var7;
			if (var4 >= 1) {
				byte var10;
				if (null == var1)
					var10 = 12;
				else
					switch (var1.anInt820) {
					case 3:
						var10 = 20;
						break;
					default:
						var10 = 12;
					}

				if (var4 <= var10) {
					final StringBuilder var11 = new StringBuilder(var4);

					for (int var14 = var7; var14 < var6; ++var14) {
						final char var8 = var0.charAt(var14);
						boolean var12;
						if (Character.isISOControl(var8))
							var12 = false;
						else if (Class109_Sub21_Sub9.method723(var8))
							var12 = true;
						else {
							char[] var3 = Class78.aCharArray627;
							int var2 = 0;

							label94: while (true) {
								char var13;
								if (var2 >= var3.length) {
									var3 = Class78.aCharArray625;

									for (var2 = 0; var2 < var3.length; ++var2) {
										var13 = var3[var2];
										if (var8 == var13) {
											var12 = true;
											break label94;
										}
									}

									var12 = false;
									break;
								}

								var13 = var3[var2];
								if (var8 == var13) {
									var12 = true;
									break;
								}

								++var2;
							}
						}

						if (var12) {
							final char var9 = Class109_Sub7.method525(var8);
							if (var9 != 0)
								var11.append(var9);
						}
					}

					if (var11.length() == 0)
						return null;

					return var11.toString();
				}
			}

			return null;
		}
	}

	static Class109_Sub21_Sub14_Sub1[] method40(final Class104 var0, final int var1, final int var2) {
		return !Class27.method121(var0, var1, var2) ? null : Class109_Sub21_Sub10.method737();
	}

	static void method41() {
		for (Class109_Sub10 var0 = (Class109_Sub10) Class109_Sub10.aClass126_1020
				.method458(); null != var0; var0 = (Class109_Sub10) Class109_Sub10.aClass126_1020.method449()) {
			if (var0.aClass109_Sub4_Sub2_1010 != null) {
				aClass109_Sub4_Sub1_81.method739(var0.aClass109_Sub4_Sub2_1010);
				var0.aClass109_Sub4_Sub2_1010 = null;
			}

			if (null != var0.aClass109_Sub4_Sub2_1022) {
				aClass109_Sub4_Sub1_81.method739(var0.aClass109_Sub4_Sub2_1022);
				var0.aClass109_Sub4_Sub2_1022 = null;
			}
		}

		Class109_Sub10.aClass126_1020.method456();
	}
}
