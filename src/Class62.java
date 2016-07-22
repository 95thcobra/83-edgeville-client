import java.util.zip.Inflater;

public class Class62 {
	Inflater anInflater561;

	public static Class66 method283() {
		try {
			return new Class66_Sub1();
		} catch (final Throwable var1) {
			return null;
		}
	}

	Class62(final int var1, final int var2, final int var3) {
	}

	public Class62() {
		this(-1, 1000000, 1000000);
	}

	public void method284(final DataBuffer var1, final byte[] var2) {
		if ((var1.data[var1.position] == 31) && (var1.data[var1.position + 1] == -117)) {
			if (anInflater561 == null)
				anInflater561 = new Inflater(true);

			try {
				anInflater561.setInput(var1.data, var1.position + 10,
						var1.data.length - (8 + var1.position + 10));
				anInflater561.inflate(var2);
			} catch (final Exception var4) {
				anInflater561.reset();
				throw new RuntimeException("");
			}

			anInflater561.reset();
		} else
			throw new RuntimeException("");
	}

	static void method285() {
		Class66.aByteArrayArrayArray577 = null;
		Class27.aByteArrayArrayArray246 = null;
		Class55.aByteArrayArrayArray541 = null;
		Class109_Sub7.aByteArrayArrayArray970 = null;
		Class33.anIntArrayArrayArray322 = null;
		Class27.aByteArrayArrayArray257 = null;
		Class112.anIntArrayArray808 = null;
		Class109_Sub21_Sub15_Sub3_Sub1.anIntArray1923 = null;
		Class27.anIntArray256 = null;
		Class7.anIntArray83 = null;
		Class47.anIntArray495 = null;
		Class7.anIntArray86 = null;
	}

	static int method286(final int var0, final int var1) {
		final long var2 = var1 + (var0 << 16);
		return (Class88.aClass109_Sub21_Sub18_671 != null) && (var2 == Class88.aClass109_Sub21_Sub18_671.aLong802) ? 1
				+ ((Class102.aClass109_Sub14_747.position * 99) / (Class102.aClass109_Sub14_747.data.length
						- Class88.aClass109_Sub21_Sub18_671.aByte1599))
				: 0;
	}

	static void method287(final int var0, final int var1) {
		Class36.method159(Class35.aClass2_334, var0, var1);
		Class35.aClass2_334 = null;
	}
}
