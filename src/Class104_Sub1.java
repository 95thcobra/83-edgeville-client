import java.util.zip.CRC32;

public class Class104_Sub1 extends Class104 {
	volatile boolean aBool1131 = false;
	boolean aBool1132 = false;
	int anInt1134 = -1;
	Class68 aClass68_1137;
	Class68 aClass68_1129;
	int anInt1130;
	int anInt1135;
	int anInt1128;
	static CRC32 aCRC32_1136 = new CRC32();
	volatile boolean[] aBoolArray1133;

	public int method637() {
		if (aBool1131)
			return 100;
		else if (anObjectArray783 != null)
			return 99;
		else {
			int var1 = Class62.method286(255, anInt1130);
			if (var1 >= 100)
				var1 = 99;

			return var1;
		}
	}

	public Class104_Sub1(final Class68 var1, final Class68 var2, final int var3, final boolean var4, final boolean var5,
			final boolean var6) {
		super(var4, var5);
		aClass68_1137 = var1;
		aClass68_1129 = var2;
		anInt1130 = var3;
		aBool1132 = var6;
		final int var9 = anInt1130;
		if (Class102.aClass109_Sub14_763 != null) {
			Class102.aClass109_Sub14_763.position = 5 + (var9 * 8);
			final int var7 = Class102.aClass109_Sub14_763.method568();
			final int var8 = Class102.aClass109_Sub14_763.method568();
			method641(var7, var8);
		} else {
			Class109_Sub8.method526((Class104_Sub1) null, 255, 255, 0, (byte) 0, true);
			Class102.aClass104_Sub1Array749[var9] = this;
		}

	}

	@Override
	void method404(final int var1, final int var2) {
		if ((null != aClass68_1137) && (aBoolArray1133 != null) && aBoolArray1133[var1])
			Class26.method118(var1, aClass68_1137, this);
		else
			Class109_Sub8.method526(this, anInt1130, var1, anIntArray791[var1], (byte) 2, true);

	}

	void method638(final int var1, final byte[] var2, final boolean var3, final boolean var4) {
		if (var3) {
			if (aBool1131)
				throw new RuntimeException();

			if (null != aClass68_1129)
				Class109_Sub12.method546(anInt1130, var2, aClass68_1129);

			method385(var2);
			method642();
		} else {
			var2[var2.length - 2] = (byte) (anIntArray778[var1] >> 8);
			var2[var2.length - 1] = (byte) anIntArray778[var1];
			if (aClass68_1137 != null) {
				Class109_Sub12.method546(var1, var2, aClass68_1137);
				aBoolArray1133[var1] = true;
			}

			if (var4)
				anObjectArray783[var1] = Class21.method101(var2, false);
		}

	}

	public void method639(final Class68 var1, final int var2, final byte[] var3, final boolean var4) {
		int var5;
		if (aClass68_1129 == var1) {
			if (aBool1131)
				throw new RuntimeException();
			else if (null == var3)
				Class109_Sub8.method526(this, 255, anInt1130, anInt1135, (byte) 0, true);
			else {
				aCRC32_1136.reset();
				aCRC32_1136.update(var3, 0, var3.length);
				var5 = (int) aCRC32_1136.getValue();
				final DataBuffer var8 = new DataBuffer(Class29.method131(var3));
				final int var7 = var8.method564();
				if ((var7 != 5) && (var7 != 6))
					throw new RuntimeException(var7 + "," + anInt1130 + "," + var2);
				else {
					int var6 = 0;
					if (var7 >= 6)
						var6 = var8.method568();

					if ((anInt1135 != var5) || (var6 != anInt1128))
						Class109_Sub8.method526(this, 255, anInt1130, anInt1135, (byte) 0, true);
					else {
						method385(var3);
						method642();
					}
				}
			}
		} else {
			if (!var4 && (var2 == anInt1134))
				aBool1131 = true;

			if ((var3 != null) && (var3.length > 2)) {
				aCRC32_1136.reset();
				aCRC32_1136.update(var3, 0, var3.length - 2);
				var5 = (int) aCRC32_1136.getValue();
				final int var9 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
				if ((anIntArray791[var2] == var5) && (anIntArray778[var2] == var9)) {
					aBoolArray1133[var2] = true;
					if (var4)
						anObjectArray783[var2] = Class21.method101(var3, false);

				} else {
					aBoolArray1133[var2] = false;
					if (aBool1132 || var4)
						Class109_Sub8.method526(this, anInt1130, var2, anIntArray791[var2], (byte) 2, var4);

				}
			} else {
				aBoolArray1133[var2] = false;
				if (aBool1132 || var4)
					Class109_Sub8.method526(this, anInt1130, var2, anIntArray791[var2], (byte) 2, var4);

			}
		}
	}

	@Override
	void method386(final int var1, final byte var2) {
		final int var3 = anInt1130;
		final long var4 = (var3 << 16) + var1;
		final Class109_Sub21_Sub18 var6 = (Class109_Sub21_Sub18) Class102.aClass116_751.method429(var4);
		if (var6 != null)
			Class102.aClass111_750.method417(var6);

	}

	int method640(final int var1) {
		return anObjectArray783[var1] != null ? 100 : (aBoolArray1133[var1] ? 100 : Class62.method286(anInt1130, var1));
	}

	void method641(final int var1, final int var2) {
		anInt1135 = var1;
		anInt1128 = var2;
		if (null != aClass68_1129)
			Class26.method118(anInt1130, aClass68_1129, this);
		else
			Class109_Sub8.method526(this, 255, anInt1130, anInt1135, (byte) 0, true);

	}

	void method642() {
		aBoolArray1133 = new boolean[anObjectArray783.length];

		int var1;
		for (var1 = 0; var1 < aBoolArray1133.length; ++var1)
			aBoolArray1133[var1] = false;

		if (null == aClass68_1137)
			aBool1131 = true;
		else {
			anInt1134 = -1;

			for (var1 = 0; var1 < aBoolArray1133.length; ++var1)
				if (anIntArray779[var1] > 0) {
					final Class68 var2 = aClass68_1137;
					final Class109_Sub17 var4 = new Class109_Sub17();
					var4.anInt1101 = 1;
					var4.aLong802 = var1;
					var4.aClass68_1099 = var2;
					var4.aClass104_Sub1_1102 = this;
					final Class126 var5 = Class105.aClass126_793;
					synchronized (var5) {
						Class105.aClass126_793.method450(var4);
					}

					Class26.method120();
					anInt1134 = var1;
				}

			if (anInt1134 == -1)
				aBool1131 = true;

		}
	}

	public int method643() {
		int var1 = 0;
		int var3 = 0;

		int var2;
		for (var2 = 0; var2 < anObjectArray783.length; ++var2)
			if (anIntArray779[var2] > 0) {
				var1 += 100;
				var3 += method640(var2);
			}

		if (var1 == 0)
			return 100;
		else {
			var2 = (100 * var3) / var1;
			return var2;
		}
	}

	public static void method644(final Class104 var0, final int var1, final int var2, final int var3,
			final boolean var4) {
		Class93.anInt703 = 1;
		Class27.aClass104_260 = var0;
		Class75.anInt613 = var1;
		Class109_Sub21_Sub15_Sub3_Sub1.anInt1926 = var2;
		Class79.anInt628 = var3;
		Class25.aBool224 = var4;
		Class54.anInt538 = 10000;
	}
}
