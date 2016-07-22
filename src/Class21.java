import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class21 {
	static int anInt196;
	static Class109_Sub21_Sub14_Sub1[] aClass109_Sub21_Sub14_Sub1Array197;
	static Class109_Sub21_Sub14_Sub2 aClass109_Sub21_Sub14_Sub2_201;
	static int anInt203;
	int anInt200 = 1;
	LinkedHashMap aLinkedHashMap199 = new LinkedHashMap();
	boolean aBool194;
	boolean aBool195;
	static int anInt198 = 4;
	static Class109_Sub20 aClass109_Sub20_202;

	void method97(final boolean var1) {
	}

	Class21(final DataBuffer var1) {
		if ((null != var1) && (var1.data != null)) {
			final int var4 = var1.method564();
			if ((var4 >= 0) && (var4 <= anInt198)) {
				if (var1.method564() == 1)
					aBool194 = true;

				if (var4 > 1)
					aBool195 = var1.method564() == 1;

				if (var4 > 3)
					anInt200 = var1.method564();

				if (var4 > 2) {
					final int var6 = var1.method564();

					for (int var5 = 0; var5 < var6; ++var5) {
						final int var2 = var1.method568();
						final int var3 = var1.method568();
						aLinkedHashMap199.put(Integer.valueOf(var2), Integer.valueOf(var3));
					}
				}
			} else
				method97(true);
		} else
			method97(true);

	}

	Class21() {
		method97(true);
	}

	DataBuffer method98() {
		final DataBuffer var1 = new DataBuffer(100);
		var1.writeByte(anInt198);
		var1.writeByte(aBool194 ? 1 : 0);
		var1.writeByte(aBool195 ? 1 : 0);
		var1.writeByte(anInt200);
		var1.writeByte(aLinkedHashMap199.size());
		final Iterator var2 = aLinkedHashMap199.entrySet().iterator();

		while (var2.hasNext()) {
			final Entry var3 = (Entry) var2.next();
			var1.writeInt(((Integer) var3.getKey()).intValue());
			var1.writeInt(((Integer) var3.getValue()).intValue());
		}

		return var1;
	}

	static final void method99() {
		Class109_Sub21_Sub3.method676();
		if (null == aClass109_Sub20_202)
			if (null == client.aClass109_Sub20_2082) {
				int var2 = Class81.anInt643;
				int var0;
				int var1;
				int var3;
				if (client.aBool2109) {
					if ((var2 != 1) && (Class3.aBool22 || (var2 != 4))) {
						var1 = Class81.anInt637;
						var3 = Class81.anInt638;
						if ((var1 < (Class109_Sub18.anInt1125 - 10))
								|| (var1 > (10 + Class79.anInt629 + Class109_Sub18.anInt1125))
								|| (var3 < (Class70.anInt596 - 10))
								|| (var3 > (10 + Class70.anInt596 + Class88.anInt670))) {
							client.aBool2109 = false;
							Class44.method231(Class109_Sub18.anInt1125, Class70.anInt596, Class79.anInt629,
									Class88.anInt670);
						}
					}

					if ((var2 == 1) || (!Class3.aBool22 && (var2 == 4))) {
						var1 = Class109_Sub18.anInt1125;
						var3 = Class70.anInt596;
						var0 = Class79.anInt629;
						final int var4 = Class81.anInt645;
						final int var5 = Class81.anInt639;
						int var6 = -1;

						for (int var7 = 0; var7 < client.anInt2045; ++var7) {
							final int var8 = 31 + var3 + ((client.anInt2045 - 1 - var7) * 15);
							if ((var4 > var1) && (var4 < (var1 + var0)) && (var5 > (var8 - 13)) && (var5 < (3 + var8)))
								var6 = var7;
						}

						if (var6 != -1)
							Applet_Sub1.method1057(var6);

						client.aBool2109 = false;
						Class44.method231(Class109_Sub18.anInt1125, Class70.anInt596, Class79.anInt629,
								Class88.anInt670);
					}
				} else {
					if (((var2 == 1) || (!Class3.aBool22 && (var2 == 4))) && (client.anInt2045 > 0)) {
						var1 = client.anIntArray2113[client.anInt2045 - 1];
						if ((var1 == 39) || (var1 == 40) || (var1 == 41) || (var1 == 42) || (var1 == 43) || (var1 == 33)
								|| (var1 == 34) || (var1 == 35) || (var1 == 36) || (var1 == 37) || (var1 == 38)
								|| (var1 == 1005)) {
							var3 = client.anIntArray2111[client.anInt2045 - 1];
							var0 = client.anIntArray2112[client.anInt2045 - 1];
							final Class109_Sub20 var9 = Class83.method345(var0);
							if (Class24.method106(Class52.method256(var9))
									|| Class28.method129(Class52.method256(var9))) {
								if ((null != aClass109_Sub20_202) && !client.aBool2083 && (client.anInt2136 != 1)
										&& !Class109_Sub17.method631(client.anInt2045 - 1) && (client.anInt2045 > 0))
									Class62.method287(client.anInt2080, client.anInt2081);

								client.aBool2083 = false;
								client.anInt2084 = 0;
								if (null != aClass109_Sub20_202)
									Class71.method315(aClass109_Sub20_202);

								aClass109_Sub20_202 = Class83.method345(var0);
								client.anInt2079 = var3;
								client.anInt2080 = Class81.anInt645;
								client.anInt2081 = Class81.anInt639;
								if (client.anInt2045 > 0)
									Class38.method169(client.anInt2045 - 1);

								Class71.method315(aClass109_Sub20_202);
								return;
							}
						}
					}

					if (((var2 == 1) || (!Class3.aBool22 && (var2 == 4)))
							&& (((client.anInt2136 == 1) && (client.anInt2045 > 2))
									|| Class109_Sub17.method631(client.anInt2045 - 1)))
						var2 = 2;

					if (((var2 == 1) || (!Class3.aBool22 && (var2 == 4))) && (client.anInt2045 > 0))
						Applet_Sub1.method1057(client.anInt2045 - 1);

					if ((var2 == 2) && (client.anInt2045 > 0))
						Class77.method330(Class81.anInt645, Class81.anInt639);
				}

			}
	}

	static void method100() {
		client.secureBuffer.method840(129);
		client.secureBuffer.writeByte(Class58.method271());
		client.secureBuffer.writeShort(LoginEncoder.anInt524);
		client.secureBuffer.writeShort(Class109_Sub21_Sub15_Sub5.anInt1815);
	}

	public static Object method101(final byte[] var0, final boolean var1) {
		if (null == var0)
			return null;
		else {
			if ((var0.length > 136) && !Class59.aBool547)
				try {
					final Class59_Sub1 var2 = new Class59_Sub1();
					var2.method274(var0, (byte) 67);
					return var2;
				} catch (final Throwable var3) {
					Class59.aBool547 = true;
				}

			return var0;
		}
	}
}
