import java.io.File;
import java.io.IOException;

public final class Class109_Sub21_Sub15_Sub2 extends Class109_Sub21_Sub15 {
	static Class109_Sub20 aClass109_Sub20_1650;
	int anInt1651 = 0;
	int anInt1648 = 0;
	boolean aBool1641 = false;
	int anInt1649;
	int anInt1643;
	int anInt1644;
	int anInt1645;
	int anInt1646;
	int anInt1642;
	Class109_Sub21_Sub7 aClass109_Sub21_Sub7_1647;

	final void method891(final int var1) {
		if (!aBool1641) {
			anInt1651 += var1;

			while (anInt1651 > aClass109_Sub21_Sub7_1647.anIntArray1396[anInt1648]) {
				anInt1651 -= aClass109_Sub21_Sub7_1647.anIntArray1396[anInt1648];
				++anInt1648;
				if (anInt1648 >= aClass109_Sub21_Sub7_1647.anIntArray1401.length) {
					aBool1641 = true;
					break;
				}
			}

		}
	}

	Class109_Sub21_Sub15_Sub2(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		anInt1649 = var1;
		anInt1643 = var2;
		anInt1644 = var3;
		anInt1645 = var4;
		anInt1646 = var5;
		anInt1642 = var6 + var7;
		final int var8 = Class35.method154(anInt1649).anInt1483;
		if (var8 != -1) {
			aBool1641 = false;
			aClass109_Sub21_Sub7_1647 = Class109_Sub21_Sub18.method849(var8, 941098862);
		} else
			aBool1641 = true;

	}

	static void method892(final File var0, final File var1) {
		try {
			final Class132 var2 = new Class132(Class112.aFile809, "rw", 10000L);
			final DataBuffer var3 = new DataBuffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.method607(var0.getPath());
			if (var1 != null)
				var3.method607(var1.getPath());

			var2.method474(var3.data, 0, var3.position);
			var2.method475();
		} catch (final IOException var4) {
			var4.printStackTrace();
		}

	}

	@Override
	protected final Class109_Sub21_Sub15_Sub4 method827(final byte var1) {
		final Class109_Sub21_Sub11 var2 = Class35.method154(anInt1649);
		Class109_Sub21_Sub15_Sub4 var3;
		if (!aBool1641)
			var3 = var2.method748(anInt1648);
		else
			var3 = var2.method748(-1);

		return null == var3 ? null : var3;
	}

	public static void method893(final boolean var0) {
		if (null != Class87.aClass82_669)
			try {
				final DataBuffer var1 = new DataBuffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeTriByte(0);
				Class87.aClass82_669.method342(var1.data, 0, 4);
			} catch (final IOException var4) {
				try {
					Class87.aClass82_669.method338();
				} catch (final Exception var3) {
					;
				}

				++Class102.anInt764;
				Class87.aClass82_669 = null;
			}
	}
}
