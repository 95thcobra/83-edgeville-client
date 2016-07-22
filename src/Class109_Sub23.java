import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class109_Sub23 extends Class109 {
	int[] anIntArray1282;
	int anInt1283;
	byte[][][] aByteArrayArrayArray1284;
	int[] anIntArray1285;
	Field[] aFieldArray1286;
	Method[] aMethodArray1287;
	int anInt1288;
	int[] anIntArray1289;

	static final void method659(final int var0, final int var1, final int var2, final int var3,
			final Class109_Sub21_Sub14_Sub2 var4, final Class109_Sub21_Sub19 var5) {
		if (var4 != null) {
			final int var11 = (client.anInt2052 + client.anInt2038) & 2047;
			final int var9 = (var3 * var3) + (var2 * var2);
			if (var9 <= 6400) {
				int var10 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var11];
				int var8 = Class109_Sub21_Sub14_Sub3.anIntArray1836[var11];
				var10 = (256 * var10) / (client.anInt2040 + 256);
				var8 = (256 * var8) / (256 + client.anInt2040);
				final int var6 = ((var10 * var3) + (var2 * var8)) >> 16;
				final int var7 = ((var8 * var3) - (var2 * var10)) >> 16;
				if (var9 > 2500)
					var4.method923(((var5.anInt1633 / 2) + var6) - (var4.anInt1724 / 2),
							(var5.anInt1631 / 2) - var7 - (var4.anInt1719 / 2), var0, var1, var5.anInt1633,
							var5.anInt1631, var5.anIntArray1636, var5.anIntArray1632);
				else
					var4.method919((var0 + (var5.anInt1633 / 2) + var6) - (var4.anInt1724 / 2),
							(var1 + (var5.anInt1631 / 2)) - var7 - (var4.anInt1719 / 2));

			}
		}
	}

	public static Class109_Sub21_Sub5 method660(final int var0) {
		Class109_Sub21_Sub5 var1 = (Class109_Sub21_Sub5) Class109_Sub21_Sub5.aClass120_1341.method438(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class109_Sub21_Sub5.aClass104_1338.method387(10, var0);
			var1 = new Class109_Sub21_Sub5();
			var1.anInt1344 = var0;
			if (var2 != null)
				var1.method685(new DataBuffer(var2));

			var1.method684();
			if (var1.anInt1376 != -1)
				var1.method692(method660(var1.anInt1376), method660(var1.anInt1356));

			if (var1.anInt1383 != -1)
				var1.method687(method660(var1.anInt1383), method660(var1.anInt1382));

			if (!Class109_Sub17.aBool1103 && var1.aBool1367) {
				var1.aString1372 = "Members object";
				var1.aBool1381 = false;
				var1.aStringArray1339 = null;
				var1.aStringArray1361 = null;
				var1.anInt1380 = 0;
			}

			Class109_Sub21_Sub5.aClass120_1341.method440(var1, var0);
			return var1;
		}
	}
}
