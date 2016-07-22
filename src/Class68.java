import java.io.EOFException;
import java.io.IOException;

public final class Class68 {
	static short[] aShortArray585;
	static int[] anIntArray587;
	Class130 aClass130_586 = null;
	Class130 aClass130_591 = null;
	int anInt589 = '\ufde8';
	int anInt588;
	static byte[] aByteArray590 = new byte[520];

	public byte[] method303(final int var1, final byte var2) {
		final Class130 var3 = aClass130_586;
		synchronized (var3) {
			try {
				if (aClass130_591.method466() < 6 + (6 * var1))
					return null;
				else {
					aClass130_591.method465(var1 * 6);
					aClass130_591.method471(aByteArray590, 0, 6);
					final int var4 = (aByteArray590[2] & 255) + ((aByteArray590[0] & 255) << 16)
							+ ((aByteArray590[1] & 255) << 8);
					int var5 = (aByteArray590[5] & 255) + ((aByteArray590[4] & 255) << 8)
							+ ((aByteArray590[3] & 255) << 16);
					if ((var4 >= 0) && (var4 <= anInt589)) {
						if ((var5 > 0) && (var5 <= (aClass130_586.method466() / 520L))) {
							final byte[] var6 = new byte[var4];
							int var7 = 0;
							int var8 = 0;

							while (var7 < var4) {
								if (var5 == 0)
									return null;

								aClass130_586.method465(var5 * 520);
								int var9 = var4 - var7;
								if (var9 > 512)
									var9 = 512;

								aClass130_586.method471(aByteArray590, 0, var9 + 8);
								final int var10 = ((aByteArray590[0] & 255) << 8) + (aByteArray590[1] & 255);
								final int var11 = (aByteArray590[3] & 255) + ((aByteArray590[2] & 255) << 8);
								final int var12 = (aByteArray590[6] & 255) + ((aByteArray590[5] & 255) << 8)
										+ ((aByteArray590[4] & 255) << 16);
								final int var13 = aByteArray590[7] & 255;
								if ((var1 == var10) && (var8 == var11) && (var13 == anInt588)) {
									if ((var12 >= 0) && (var12 <= (aClass130_586.method466() / 520L))) {
										for (int var14 = 0; var14 < var9; ++var14)
											var6[var7++] = aByteArray590[8 + var14];

										var5 = var12;
										++var8;
										continue;
									}

									return null;
								}

								return null;
							}

							final byte[] var10000 = var6;
							return var10000;
						} else
							return null;
					} else
						return null;
				}
			} catch (final IOException var17) {
				return null;
			}
		}
	}

	public boolean method304(final int var1, final byte[] var2, final int var3) {
		final Class130 var4 = aClass130_586;
		synchronized (var4) {
			if ((var3 >= 0) && (var3 <= anInt589)) {
				boolean var5 = method305(var1, var2, var3, true);
				if (!var5)
					var5 = method305(var1, var2, var3, false);

				return var5;
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class68(final int var1, final Class130 var2, final Class130 var3, final int var4) {
		anInt588 = var1;
		aClass130_586 = var2;
		aClass130_591 = var3;
		anInt589 = var4;
	}

	boolean method305(final int var1, final byte[] var2, final int var3, boolean var4) {
		final Class130 var5 = aClass130_586;
		synchronized (var5) {
			try {
				int var6;
				if (var4) {
					if (aClass130_591.method466() < (var1 * 6) + 6)
						return false;

					aClass130_591.method465(6 * var1);
					aClass130_591.method471(aByteArray590, 0, 6);
					var6 = (aByteArray590[5] & 255) + ((aByteArray590[4] & 255) << 8)
							+ ((aByteArray590[3] & 255) << 16);
					if ((var6 <= 0) || (var6 > (aClass130_586.method466() / 520L)))
						return false;
				} else {
					var6 = (int) ((aClass130_586.method466() + 519L) / 520L);
					if (var6 == 0)
						var6 = 1;
				}

				aByteArray590[0] = (byte) (var3 >> 16);
				aByteArray590[1] = (byte) (var3 >> 8);
				aByteArray590[2] = (byte) var3;
				aByteArray590[3] = (byte) (var6 >> 16);
				aByteArray590[4] = (byte) (var6 >> 8);
				aByteArray590[5] = (byte) var6;
				aClass130_591.method465(6 * var1);
				aClass130_591.method470(aByteArray590, 0, 6);
				int var7 = 0;
				int var8 = 0;

				while (true) {
					if (var7 < var3)
						label120: {
							int var9 = 0;
							int var11;
							if (var4) {
								aClass130_586.method465(520 * var6);

								try {
									aClass130_586.method471(aByteArray590, 0, 8);
								} catch (final EOFException var16) {
									break label120;
								}

								var11 = (aByteArray590[1] & 255) + ((aByteArray590[0] & 255) << 8);
								final int var12 = (aByteArray590[3] & 255) + ((aByteArray590[2] & 255) << 8);
								var9 = ((aByteArray590[4] & 255) << 16) + ((aByteArray590[5] & 255) << 8)
										+ (aByteArray590[6] & 255);
								final int var13 = aByteArray590[7] & 255;
								if ((var11 != var1) || (var8 != var12) || (anInt588 != var13))
									return false;

								if ((var9 < 0) || (var9 > (aClass130_586.method466() / 520L)))
									return false;
							}

							if (var9 == 0) {
								var4 = false;
								var9 = (int) ((aClass130_586.method466() + 519L) / 520L);
								if (var9 == 0)
									++var9;

								if (var6 == var9)
									++var9;
							}

							if ((var3 - var7) <= 512)
								var9 = 0;

							aByteArray590[0] = (byte) (var1 >> 8);
							aByteArray590[1] = (byte) var1;
							aByteArray590[2] = (byte) (var8 >> 8);
							aByteArray590[3] = (byte) var8;
							aByteArray590[4] = (byte) (var9 >> 16);
							aByteArray590[5] = (byte) (var9 >> 8);
							aByteArray590[6] = (byte) var9;
							aByteArray590[7] = (byte) anInt588;
							aClass130_586.method465(var6 * 520);
							aClass130_586.method470(aByteArray590, 0, 8);
							var11 = var3 - var7;
							if (var11 > 512)
								var11 = 512;

							aClass130_586.method470(var2, var7, var11);
							var7 += var11;
							var6 = var9;
							++var8;
							continue;
						}

					final boolean var10000 = true;
					return var10000;
				}
			} catch (final IOException var17) {
				return false;
			}
		}
	}

	static final void method306(final Class109_Sub21_Sub15_Sub3 var0) {
		final int var1 = var0.anInt1697 - client.anInt1979;
		final int var3 = (var0.anInt1693 * 128) + (var0.anInt1656 * 64);
		final int var2 = (var0.anInt1695 * 128) + (var0.anInt1656 * 64);
		var0.anInt1710 += (var3 - var0.anInt1710) / var1;
		var0.anInt1653 += (var2 - var0.anInt1653) / var1;
		var0.anInt1708 = 0;
		if (var0.anInt1699 == 0)
			var0.anInt1680 = 1024;

		if (var0.anInt1699 == 1)
			var0.anInt1680 = 1536;

		if (var0.anInt1699 == 2)
			var0.anInt1680 = 0;

		if (var0.anInt1699 == 3)
			var0.anInt1680 = 512;

	}

	static Class57 method307(final int var0) {
		try {
			return new Class57_Sub1();
		} catch (final Throwable var2) {
			return new Class57_Sub2();
		}
	}
}
