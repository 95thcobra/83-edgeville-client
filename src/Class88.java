import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class88 {
	static int anInt670;
	public static Class109_Sub21_Sub18 aClass109_Sub21_Sub18_671;
	public static char[] aCharArray672 = new char[] { '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026',
			'\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000',
			'\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122',
			'\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178' };

	public static void method352(final int var0) {
		if (var0 != -1)
			if (Class112.aBoolArray810[var0]) {
				Class109_Sub20.aClass104_1269.method388(var0);
				if (null != Class109_Sub20.aClass109_Sub20ArrayArray1150[var0]) {
					boolean var2 = true;

					for (int var1 = 0; var1 < Class109_Sub20.aClass109_Sub20ArrayArray1150[var0].length; ++var1)
						if (null != Class109_Sub20.aClass109_Sub20ArrayArray1150[var0][var1])
							if (Class109_Sub20.aClass109_Sub20ArrayArray1150[var0][var1].anInt1229 != 2)
								Class109_Sub20.aClass109_Sub20ArrayArray1150[var0][var1] = null;
							else
								var2 = false;

					if (var2)
						Class109_Sub20.aClass109_Sub20ArrayArray1150[var0] = null;

					Class112.aBoolArray810[var0] = false;
				}
			}
	}

	public static void method353(final Class109_Sub14_Sub1 var0) {
		final Class109_Sub23 var1 = (Class109_Sub23) Class123.aClass128_849.method460();
		if (null != var1) {
			final int var2 = var0.position;
			var0.writeInt(var1.anInt1288);

			for (int var3 = 0; var3 < var1.anInt1283; ++var3)
				if (var1.anIntArray1285[var3] != 0)
					var0.writeByte(var1.anIntArray1285[var3]);
				else
					try {
						final int var4 = var1.anIntArray1282[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.aFieldArray1286[var3];
							var6 = var5.getInt((Object) null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.aFieldArray1286[var3];
							var5.setInt((Object) null, var1.anIntArray1289[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.aFieldArray1286[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.aMethodArray1287[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.aMethodArray1287[var3];
							final byte[][] var7 = var1.aByteArrayArrayArray1284[var3];
							final Object[] var8 = new Object[var7.length];

							for (int var9 = 0; var9 < var7.length; ++var9) {
								final ObjectInputStream var10 = new ObjectInputStream(
										new ByteArrayInputStream(var7[var9]));
								var8[var9] = var10.readObject();
							}

							final Object var11 = var25.invoke((Object) null, var8);
							if (null == var11)
								var0.writeByte(0);
							else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.method586(((Number) var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeString((String) var11);
							} else
								var0.writeByte(4);
						}
					} catch (final ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (final InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (final StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (final OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (final IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (final IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (final InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (final SecurityException var20) {
						var0.writeByte(-17);
					} catch (final IOException var21) {
						var0.writeByte(-18);
					} catch (final NullPointerException var22) {
						var0.writeByte(-19);
					} catch (final Exception var23) {
						var0.writeByte(-20);
					} catch (final Throwable var24) {
						var0.writeByte(-21);
					}

			var0.method580(var2);
			var1.method413();
		}
	}
}
