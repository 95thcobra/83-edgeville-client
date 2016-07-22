import java.awt.Component;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;

public class DataBuffer extends Class109 {
	public int position;
	static int[] anIntArray1056 = new int[256];
	public byte[] data;

	public void writeByte(final int var1) {
		data[++position - 1] = (byte) var1;
	}

	public void writeShort(final int var1) {
		data[++position - 1] = (byte) (var1 >> 8);
		data[++position - 1] = (byte) var1;
	}

	public void method554(final byte[] var1, final int var2, final int var3) {
		for (int var4 = (var3 + var2) - 1; var4 >= var2; --var4)
			var1[var4] = (byte) (data[++position - 1] - 128);

	}

	public void writeInt(final int var1) {
		data[++position - 1] = (byte) (var1 >> 24);
		data[++position - 1] = (byte) (var1 >> 16);
		data[++position - 1] = (byte) (var1 >> 8);
		data[++position - 1] = (byte) var1;
	}

	public void method556(final long var1) {
		data[++position - 1] = (byte) ((int) (var1 >> 40));
		data[++position - 1] = (byte) ((int) (var1 >> 32));
		data[++position - 1] = (byte) ((int) (var1 >> 24));
		data[++position - 1] = (byte) ((int) (var1 >> 16));
		data[++position - 1] = (byte) ((int) (var1 >> 8));
		data[++position - 1] = (byte) ((int) var1);
	}

	public void writeString(final String var1) {
		final int var2 = var1.indexOf(0);
		if (var2 >= 0)
			throw new IllegalArgumentException("");
		else {
			position += Class57_Sub2.method627(var1, 0, var1.length(), data, position);
			data[++position - 1] = 0;
		}
	}

	public void method558(final String var1) {
		final int var2 = var1.indexOf(0);
		if (var2 >= 0)
			throw new IllegalArgumentException("");
		else {
			data[++position - 1] = 0;
			position += Class57_Sub2.method627(var1, 0, var1.length(), data, position);
			data[++position - 1] = 0;
		}
	}

	public int method559() {
		position += 2;
		return ((data[position - 1] - 128) & 255) + ((data[position - 2] & 255) << 8);
	}

	public void method560(final int var1) {
		data[position - var1 - 4] = (byte) (var1 >> 24);
		data[position - var1 - 3] = (byte) (var1 >> 16);
		data[position - var1 - 2] = (byte) (var1 >> 8);
		data[position - var1 - 1] = (byte) var1;
	}

	public void method561(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var2 + var3); ++var4)
			var1[var4] = data[++position - 1];

	}

	public void method562(final int var1) {
		data[position - var1 - 1] = (byte) var1;
	}

	public void method563(final int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0)
						writeByte((var1 >>> 28) | 128);

					writeByte((var1 >>> 21) | 128);
				}

				writeByte((var1 >>> 14) | 128);
			}

			writeByte((var1 >>> 7) | 128);
		}

		writeByte(var1 & 127);
	}

	public int method564() {
		return data[++position - 1] & 255;
	}

	public static final Class4 method565(final Class71 var0, final Component var1, final int var2, int var3) {
		if (Class122.anInt848 == 0)
			throw new IllegalStateException();
		else if ((var2 >= 0) && (var2 < 2)) {
			if (var3 < 256)
				var3 = 256;

			try {
				final Class4_Sub2 var7 = new Class4_Sub2();
				var7.anIntArray31 = new int[(Class31.aBool308 ? 2 : 1) * 256];
				var7.anInt35 = var3;
				var7.method35(var1);
				var7.anInt34 = (var3 & -1024) + 1024;
				if (var7.anInt34 > 16384)
					var7.anInt34 = 16384;

				var7.method27(var7.anInt34);
				if ((Class4.anInt43 > 0) && (null == Class4.aClass6_36)) {
					Class4.aClass6_36 = new Class6();
					Class4.aClass6_36.aClass71_79 = var0;
					var0.method314(Class4.aClass6_36, Class4.anInt43);
				}

				if (Class4.aClass6_36 != null) {
					if (null != Class4.aClass6_36.aClass4Array78[var2])
						throw new IllegalArgumentException();

					Class4.aClass6_36.aClass4Array78[var2] = var7;
				}

				return var7;
			} catch (final Throwable var6) {
				try {
					final Class4_Sub1 var4 = new Class4_Sub1(var0, var2);
					var4.anIntArray31 = new int[(Class31.aBool308 ? 2 : 1) * 256];
					var4.anInt35 = var3;
					var4.method35(var1);
					var4.anInt34 = 16384;
					var4.method27(var4.anInt34);
					if ((Class4.anInt43 > 0) && (null == Class4.aClass6_36)) {
						Class4.aClass6_36 = new Class6();
						Class4.aClass6_36.aClass71_79 = var0;
						var0.method314(Class4.aClass6_36, Class4.anInt43);
					}

					if (null != Class4.aClass6_36) {
						if (null != Class4.aClass6_36.aClass4Array78[var2])
							throw new IllegalArgumentException();

						Class4.aClass6_36.aClass4Array78[var2] = var4;
					}

					return var4;
				} catch (final Throwable var5) {
					return new Class4();
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	public int method566() {
		position += 2;
		return (data[position - 1] & 255) + ((data[position - 2] & 255) << 8);
	}

	public int method567() {
		position += 3;
		return (data[position - 1] & 255) + ((data[position - 2] & 255) << 8)
				+ ((data[position - 3] & 255) << 16);
	}

	public int method568() {
		position += 4;
		return ((data[position - 4] & 255) << 24) + ((data[position - 3] & 255) << 16)
				+ ((data[position - 2] & 255) << 8) + (data[position - 1] & 255);
	}

	public void writeTriByte(final int var1) {
		data[++position - 1] = (byte) (var1 >> 16);
		data[++position - 1] = (byte) (var1 >> 8);
		data[++position - 1] = (byte) var1;
	}

	public String method570() {
		if (data[position] == 0) {
			++position;
			return null;
		} else
			return method602();
	}

	public String method571() {
		final byte var1 = data[++position - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var2 = position;

			while (data[++position - 1] != 0)
				;

			final int var3 = position - var2 - 1;
			return var3 == 0 ? "" : Class109_Sub21_Sub9.method724(data, var2, var3);
		}
	}

	public String method572() {
		final byte var1 = data[++position - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var2 = method615();
			if ((position + var2) > data.length)
				throw new IllegalStateException("");
			else {
				final String var3 = Class109_Sub21_Sub2.method670(data, position, var2);
				position += var2;
				return var3;
			}
		}
	}

	public int method573() {
		final int var1 = data[position] & 255;
		return var1 < 128 ? method564() - 64 : method566() - '\uc000';
	}

	public int method574() {
		final int var1 = data[position] & 255;
		return var1 < 128 ? method564() : method566() - '\u8000';
	}

	public int method575() {
		position += 2;
		int var1 = ((data[position - 2] & 255) << 8) + (data[position - 1] & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void method576(final int[] var1) {
		final int var2 = position / 8;
		position = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			int var8 = method568();
			int var3 = method568();
			int var6 = 0;
			final int var7 = -1640531527;

			for (int var5 = 32; var5-- > 0; var3 += (((var8 << 4) ^ (var8 >>> 5)) + var8)
					^ (var1[(var6 >>> 11) & 3] + var6)) {
				var8 += (((var3 << 4) ^ (var3 >>> 5)) + var3) ^ (var6 + var1[var6 & 3]);
				var6 += var7;
			}

			position -= 8;
			writeInt(var8);
			writeInt(var3);
		}

	}

	public void method577(final int[] var1) {
		final int var2 = position / 8;
		position = 0;

		for (int var8 = 0; var8 < var2; ++var8) {
			int var6 = method568();
			int var7 = method568();
			int var3 = -957401312;
			final int var4 = -1640531527;

			for (int var5 = 32; var5-- > 0; var6 -= (((var7 << 4) ^ (var7 >>> 5)) + var7) ^ (var3 + var1[var3 & 3])) {
				var7 -= (var6 + ((var6 << 4) ^ (var6 >>> 5))) ^ (var3 + var1[(var3 >>> 11) & 3]);
				var3 -= var4;
			}

			position -= 8;
			writeInt(var6);
			writeInt(var7);
		}

	}

	public void method578(final int[] var1, final int var2, final int var3) {
		if (!Loader.RSA_ENABLED) {
			return;
		}
		final int var4 = position;
		position = var2;
		final int var6 = (var3 - var2) / 8;

		for (int var5 = 0; var5 < var6; ++var5) {
			int var10 = method568();
			int var9 = method568();
			int var7 = 0;
			final int var8 = -1640531527;

			for (int var11 = 32; var11-- > 0; var9 += (((var10 << 4) ^ (var10 >>> 5)) + var10)
					^ (var7 + var1[(var7 >>> 11) & 3])) {
				var10 += (((var9 << 4) ^ (var9 >>> 5)) + var9) ^ (var7 + var1[var7 & 3]);
				var7 += var8;
			}

			position -= 8;
			writeInt(var10);
			writeInt(var9);
		}

		position = var4;
	}

	public void doRsa(final BigInteger var1, final BigInteger var2) {
		if (!Loader.RSA_ENABLED)
			return;
		final int var3 = position;
		position = 0;
		final byte[] var4 = new byte[var3];
		method561(var4, 0, var3);
		final BigInteger var5 = new BigInteger(var4);
		final BigInteger var6 = var5.modPow(var1, var2);
		final byte[] var7 = var6.toByteArray();
		position = 0;
		writeShort(var7.length);
		writeBytes(var7, 0, var7.length);
	}

	public int method580(final int var1) {
		final byte[] var2 = data;
		final int var6 = position;
		int var3 = -1;

		for (int var5 = var1; var5 < var6; ++var5)
			var3 = (var3 >>> 8) ^ anIntArray1056[(var3 ^ var2[var5]) & 255];

		var3 = ~var3;
		writeInt(var3);
		return var3;
	}

	public boolean method581() {
		position -= 4;
		final byte[] var5 = data;
		final int var2 = position;
		int var4 = -1;

		int var1;
		for (var1 = 0; var1 < var2; ++var1)
			var4 = (var4 >>> 8) ^ anIntArray1056[(var4 ^ var5[var1]) & 255];

		var4 = ~var4;
		var1 = method568();
		return var1 == var4;
	}

	public void method582(final int var1) {
		data[++position - 1] = (byte) (0 - var1);
	}

	public void method583(final int var1) {
		data[++position - 1] = (byte) (128 - var1);
	}

	public int method584() {
		return (data[++position - 1] - 128) & 255;
	}

	public int method585() {
		return (128 - data[++position - 1]) & 255;
	}

	public void method586(final long var1) {
		data[++position - 1] = (byte) ((int) (var1 >> 56));
		data[++position - 1] = (byte) ((int) (var1 >> 48));
		data[++position - 1] = (byte) ((int) (var1 >> 40));
		data[++position - 1] = (byte) ((int) (var1 >> 32));
		data[++position - 1] = (byte) ((int) (var1 >> 24));
		data[++position - 1] = (byte) ((int) (var1 >> 16));
		data[++position - 1] = (byte) ((int) (var1 >> 8));
		data[++position - 1] = (byte) ((int) var1);
	}

	public byte method587() {
		return (byte) (128 - data[++position - 1]);
	}

	public void method588(final int var1) {
		data[++position - 1] = (byte) var1;
		data[++position - 1] = (byte) (var1 >> 8);
		data[++position - 1] = (byte) (var1 >> 16);
		data[++position - 1] = (byte) (var1 >> 24);
	}

	public void method589(final int var1) {
		data[++position - 1] = (byte) (var1 >> 8);
		data[++position - 1] = (byte) (128 + var1);
	}

	public void method590(final int var1) {
		data[++position - 1] = (byte) (128 + var1);
		data[++position - 1] = (byte) (var1 >> 8);
	}

	public int method591() {
		position += 2;
		return ((data[position - 1] & 255) << 8) + (data[position - 2] & 255);
	}

	public int method592() {
		position += 2;
		return ((data[position - 2] - 128) & 255) + ((data[position - 1] & 255) << 8);
	}

	public int method593() {
		position += 2;
		int var1 = ((data[position - 2] & 255) << 8) + ((data[position - 1] - 128) & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public int method594() {
		position += 2;
		int var1 = ((data[position - 1] & 255) << 8) + ((data[position - 2] - 128) & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void method595(final int var1) {
		data[++position - 1] = (byte) (var1 >> 8);
		data[++position - 1] = (byte) (var1 >> 16);
		data[++position - 1] = (byte) var1;
	}

	public void method596(final int var1) {
		data[++position - 1] = (byte) (var1 >> 8);
		data[++position - 1] = (byte) var1;
		data[++position - 1] = (byte) (var1 >> 24);
		data[++position - 1] = (byte) (var1 >> 16);
	}

	public void method597(final int var1) {
		data[++position - 1] = (byte) (var1 >> 16);
		data[++position - 1] = (byte) (var1 >> 24);
		data[++position - 1] = (byte) var1;
		data[++position - 1] = (byte) (var1 >> 8);
	}

	public int method598() {
		return data[position] < 0 ? method568() & Integer.MAX_VALUE : method566();
	}

	public int method599() {
		position += 4;
		return (data[position - 3] & 255) + ((data[position - 2] & 255) << 24)
				+ ((data[position - 1] & 255) << 16) + ((data[position - 4] & 255) << 8);
	}

	public void method600(final byte[] var1, final int var2, final int var3) {
		for (int var4 = (var3 + var2) - 1; var4 >= var2; --var4)
			var1[var4] = data[++position - 1];

	}

	static {
		for (int var0 = 0; var0 < 256; ++var0) {
			int var2 = var0;

			for (int var1 = 0; var1 < 8; ++var1)
				if ((var2 & 1) == 1)
					var2 = (var2 >>> 1) ^ -306674912;
				else
					var2 >>>= 1;

			anIntArray1056[var0] = var2;
		}

	}

	public void method601(final int var1) {
		data[++position - 1] = (byte) var1;
		data[++position - 1] = (byte) (var1 >> 8);
	}

	public String method602() {
		final int var1 = position;

		while (data[++position - 1] != 0)
			;

		final int var2 = position - var1 - 1;
		return var2 == 0 ? "" : Class109_Sub21_Sub9.method724(data, var1, var2);
	}

	public void writeBytes(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var2 + var3); ++var4)
			data[++position - 1] = var1[var4];

	}

	public byte method604() {
		return (byte) (data[++position - 1] - 128);
	}

	public void method605(final int var1) {
		data[position - var1 - 2] = (byte) (var1 >> 8);
		data[position - var1 - 1] = (byte) var1;
	}

	public void method606(final int[] var1, final int var2, final int var3) {
		final int var4 = position;
		position = var2;
		final int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var8 = method568();
			int var7 = method568();
			int var9 = -957401312;
			final int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 -= (var7 + ((var7 << 4) ^ (var7 >>> 5))) ^ (var1[var9 & 3] + var9)) {
				var7 -= (var8 + ((var8 << 4) ^ (var8 >>> 5))) ^ (var1[(var9 >>> 11) & 3] + var9);
				var9 -= var10;
			}

			position -= 8;
			writeInt(var8);
			writeInt(var7);
		}

		position = var4;
	}

	public DataBuffer(final int var1) {
		data = Class60.method276(var1);
		position = 0;
	}

	public void method607(final CharSequence var1) {
		final int var2 = var1.length();
		int var9 = 0;

		int var7;
		for (var7 = 0; var7 < var2; ++var7) {
			final char var8 = var1.charAt(var7);
			if (var8 <= 127)
				++var9;
			else if (var8 <= 2047)
				var9 += 2;
			else
				var9 += 3;
		}

		data[++position - 1] = 0;
		method563(var9);
		var9 = position;
		final byte[] var3 = data;
		final int var10 = position;
		final int var11 = var1.length();
		int var12 = var10;

		for (int var5 = 0; var5 < var11; ++var5) {
			final char var6 = var1.charAt(var5);
			if (var6 <= 127)
				var3[var12++] = (byte) var6;
			else if (var6 <= 2047) {
				var3[var12++] = (byte) (192 | (var6 >> 6));
				var3[var12++] = (byte) (128 | (var6 & 63));
			} else {
				var3[var12++] = (byte) (224 | (var6 >> 12));
				var3[var12++] = (byte) (128 | ((var6 >> 6) & 63));
				var3[var12++] = (byte) (128 | (var6 & 63));
			}
		}

		var7 = var12 - var10;
		position = var9 + var7;
	}

	public int method608() {
		return (0 - data[++position - 1]) & 255;
	}

	public void method609(final int var1) {
		if ((var1 >= 0) && (var1 < 128))
			writeByte(var1);
		else if ((var1 >= 0) && (var1 < '\u8000'))
			writeShort('\u8000' + var1);
		else
			throw new IllegalArgumentException();
	}

	public DataBuffer(final byte[] var1) {
		data = var1;
		position = 0;
	}

	public void method610(final int var1) {
		data[++position - 1] = (byte) (var1 + 128);
	}

	public int method611() {
		position += 4;
		return ((data[position - 4] & 255) << 16) + ((data[position - 3] & 255) << 24)
				+ ((data[position - 1] & 255) << 8) + (data[position - 2] & 255);
	}

	public byte method612() {
		return data[++position - 1];
	}

	public long method613() {
		final long var1 = method568() & 4294967295L;
		final long var3 = method568() & 4294967295L;
		return (var1 << 32) + var3;
	}

	public int method614() {
		position += 4;
		return (data[position - 4] & 255) + ((data[position - 3] & 255) << 8)
				+ ((data[position - 1] & 255) << 24) + ((data[position - 2] & 255) << 16);
	}

	public int method615() {
		byte var1 = data[++position - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = data[++position - 1])
			var2 = (var2 | (var1 & 127)) << 7;

		return var2 | var1;
	}

	public byte method616() {
		return (byte) (0 - data[++position - 1]);
	}

	static final boolean method617(final Class109_Sub20 var0) {
		final int var1 = var0.anInt1151;
		if (var1 == 205) {
			client.anInt2016 = 250;
			return true;
		} else {
			int var2;
			int var3;
			if ((var1 >= 300) && (var1 <= 313)) {
				var3 = (var1 - 300) / 2;
				var2 = var1 & 1;
				client.aClass96_2243.method358(var3, var2 == 1);
			}

			if ((var1 >= 314) && (var1 <= 323)) {
				var3 = (var1 - 314) / 2;
				var2 = var1 & 1;
				client.aClass96_2243.method359(var3, var2 == 1);
			}

			if (var1 == 324)
				client.aClass96_2243.method360(false);

			if (var1 == 325)
				client.aClass96_2243.method360(true);

			if (var1 == 326) {
				client.secureBuffer.method840(233);
				client.aClass96_2243.method361(client.secureBuffer);
				return true;
			} else
				return false;
		}
	}

	static final void method618(final Class42 var0, final Class138[] var1) {
		int var2;
		int var3;
		int var6;
		int var45;
		for (var2 = 0; var2 < 4; ++var2)
			for (var3 = 0; var3 < 104; ++var3)
				for (var6 = 0; var6 < 104; ++var6)
					if ((Class27.aByteArrayArrayArray243[var2][var3][var6] & 1) == 1) {
						var45 = var2;
						if ((Class27.aByteArrayArrayArray243[1][var3][var6] & 2) == 2)
							var45 = var2 - 1;

						if (var45 >= 0)
							var1[var45].method491(var3, var6);
					}

		Class27.anInt254 += (int) (Math.random() * 5.0D) - 2;
		if (Class27.anInt254 < -8)
			Class27.anInt254 = -8;

		if (Class27.anInt254 > 8)
			Class27.anInt254 = 8;

		Class27.anInt244 += (int) (Math.random() * 5.0D) - 2;
		if (Class27.anInt244 < -16)
			Class27.anInt244 = -16;

		if (Class27.anInt244 > 16)
			Class27.anInt244 = 16;

		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var19;
		int var20;
		int var21;
		int var22;
		for (var2 = 0; var2 < 4; ++var2) {
			final byte[][] var7 = Class27.aByteArrayArrayArray257[var2];
			var8 = (int) Math.sqrt(5100.0D);
			var5 = (var8 * 768) >> 8;

			int var4;
			int var23;
			for (var10 = 1; var10 < 103; ++var10)
				for (var9 = 1; var9 < 103; ++var9) {
					var11 = Class27.anIntArrayArrayArray251[var2][var9 + 1][var10]
							- Class27.anIntArrayArrayArray251[var2][var9 - 1][var10];
					var19 = Class27.anIntArrayArrayArray251[var2][var9][var10 + 1]
							- Class27.anIntArrayArrayArray251[var2][var9][var10 - 1];
					var20 = (int) Math.sqrt((var19 * var19) + 65536 + (var11 * var11));
					var21 = (var11 << 8) / var20;
					var12 = 65536 / var20;
					var22 = (var19 << 8) / var20;
					var23 = 96 + (((-50 * var22) + (var21 * -50) + (var12 * -10)) / var5);
					var4 = (var7[var9][var10] >> 1) + (var7[var9][1 + var10] >> 3) + (var7[var9 + 1][var10] >> 3)
							+ (var7[var9 - 1][var10] >> 2) + (var7[var9][var10 - 1] >> 2);
					Class112.anIntArrayArray808[var9][var10] = var23 - var4;
				}

			for (var10 = 0; var10 < 104; ++var10) {
				Class109_Sub21_Sub15_Sub3_Sub1.anIntArray1923[var10] = 0;
				Class27.anIntArray256[var10] = 0;
				Class7.anIntArray83[var10] = 0;
				Class47.anIntArray495[var10] = 0;
				Class7.anIntArray86[var10] = 0;
			}

			for (var10 = -5; var10 < 109; ++var10) {
				for (var9 = 0; var9 < 104; ++var9) {
					var11 = var10 + 5;
					if ((var11 >= 0) && (var11 < 104)) {
						var19 = Class66.aByteArrayArrayArray577[var2][var11][var9] & 255;
						if (var19 > 0) {
							final Class109_Sub21_Sub1 var24 = Class109_Sub6.method522(var19 - 1);
							Class109_Sub21_Sub15_Sub3_Sub1.anIntArray1923[var9] += var24.anInt1293;
							Class27.anIntArray256[var9] += var24.anInt1300;
							Class7.anIntArray83[var9] += var24.anInt1295;
							Class47.anIntArray495[var9] += var24.anInt1291;
							++Class7.anIntArray86[var9];
						}
					}

					var19 = var10 - 5;
					if ((var19 >= 0) && (var19 < 104)) {
						var20 = Class66.aByteArrayArrayArray577[var2][var19][var9] & 255;
						if (var20 > 0) {
							final Class109_Sub21_Sub1 var40 = Class109_Sub6.method522(var20 - 1);
							Class109_Sub21_Sub15_Sub3_Sub1.anIntArray1923[var9] -= var40.anInt1293;
							Class27.anIntArray256[var9] -= var40.anInt1300;
							Class7.anIntArray83[var9] -= var40.anInt1295;
							Class47.anIntArray495[var9] -= var40.anInt1291;
							--Class7.anIntArray86[var9];
						}
					}
				}

				if ((var10 >= 1) && (var10 < 103)) {
					var9 = 0;
					var11 = 0;
					var19 = 0;
					var20 = 0;
					var21 = 0;

					for (var12 = -5; var12 < 109; ++var12) {
						var22 = 5 + var12;
						if ((var22 >= 0) && (var22 < 104)) {
							var9 += Class109_Sub21_Sub15_Sub3_Sub1.anIntArray1923[var22];
							var11 += Class27.anIntArray256[var22];
							var19 += Class7.anIntArray83[var22];
							var20 += Class47.anIntArray495[var22];
							var21 += Class7.anIntArray86[var22];
						}

						var23 = var12 - 5;
						if ((var23 >= 0) && (var23 < 104)) {
							var9 -= Class109_Sub21_Sub15_Sub3_Sub1.anIntArray1923[var23];
							var11 -= Class27.anIntArray256[var23];
							var19 -= Class7.anIntArray83[var23];
							var20 -= Class47.anIntArray495[var23];
							var21 -= Class7.anIntArray86[var23];
						}

						if ((var12 >= 1) && (var12 < 103)) {
							if (client.aBool2065 && ((Class27.aByteArrayArrayArray243[0][var10][var12] & 2) == 0)) {
								if ((Class27.aByteArrayArrayArray243[var2][var10][var12] & 16) != 0)
									continue;

								if ((Class27.aByteArrayArrayArray243[var2][var10][var12] & 8) != 0)
									var4 = 0;
								else if ((var2 > 0) && ((Class27.aByteArrayArrayArray243[1][var10][var12] & 2) != 0))
									var4 = var2 - 1;
								else
									var4 = var2;

								if (var4 != client.anInt2022)
									continue;
							}

							if (var2 < Class27.anInt245)
								Class27.anInt245 = var2;

							var4 = Class66.aByteArrayArrayArray577[var2][var10][var12] & 255;
							final int var43 = Class27.aByteArrayArrayArray246[var2][var10][var12] & 255;
							if ((var4 > 0) || (var43 > 0)) {
								final int var30 = Class27.anIntArrayArrayArray251[var2][var10][var12];
								final int var31 = Class27.anIntArrayArrayArray251[var2][1 + var10][var12];
								final int var32 = Class27.anIntArrayArrayArray251[var2][1 + var10][1 + var12];
								final int var33 = Class27.anIntArrayArrayArray251[var2][var10][1 + var12];
								final int var13 = Class112.anIntArrayArray808[var10][var12];
								final int var35 = Class112.anIntArrayArray808[1 + var10][var12];
								final int var36 = Class112.anIntArrayArray808[1 + var10][1 + var12];
								final int var37 = Class112.anIntArrayArray808[var10][var12 + 1];
								int var34 = -1;
								int var42 = -1;
								int var25;
								int var38;
								int var46;
								if (var4 > 0) {
									var38 = (var9 * 256) / var20;
									var46 = var11 / var21;
									var25 = var19 / var21;
									var34 = Class24.method111(var38, var46, var25);
									var38 = (Class27.anInt254 + var38) & 255;
									var25 += Class27.anInt244;
									if (var25 < 0)
										var25 = 0;
									else if (var25 > 255)
										var25 = 255;

									var42 = Class24.method111(var38, var46, var25);
								}

								Class109_Sub21_Sub3 var26;
								if (var2 > 0) {
									boolean var53 = true;
									if ((var4 == 0) && (Class55.aByteArrayArrayArray541[var2][var10][var12] != 0))
										var53 = false;

									if (var43 > 0) {
										var25 = var43 - 1;
										var26 = (Class109_Sub21_Sub3) Class109_Sub21_Sub3.aClass120_1308
												.method438(var25);
										Class109_Sub21_Sub3 var47;
										if (null != var26)
											var47 = var26;
										else {
											final byte[] var39 = Class109_Sub21_Sub3.aClass104_1312.method387(4, var25);
											var26 = new Class109_Sub21_Sub3();
											if (var39 != null)
												var26.method672(new DataBuffer(var39), var25);

											var26.method671();
											Class109_Sub21_Sub3.aClass120_1308.method440(var26, var25);
											var47 = var26;
										}

										if (!var47.aBool1310)
											var53 = false;
									}

									if (var53 && (var31 == var30) && (var32 == var30) && (var33 == var30))
										Class33.anIntArrayArrayArray322[var2][var10][var12] |= 2340;
								}

								var38 = 0;
								if (var42 != -1)
									var38 = Class109_Sub21_Sub14_Sub3.anIntArray1832[Class109_Sub21_Sub15_Sub1
											.method889(var42, 96)];

								if (var43 == 0)
									var0.method216(var2, var10, var12, 0, 0, -1, var30, var31, var32, var33,
											Class109_Sub21_Sub15_Sub1.method889(var34, var13),
											Class109_Sub21_Sub15_Sub1.method889(var34, var35),
											Class109_Sub21_Sub15_Sub1.method889(var34, var36),
											Class109_Sub21_Sub15_Sub1.method889(var34, var37), 0, 0, 0, 0, var38, 0);
								else {
									var46 = Class55.aByteArrayArrayArray541[var2][var10][var12] + 1;
									final byte var52 = Class109_Sub7.aByteArrayArrayArray970[var2][var10][var12];
									final int var48 = var43 - 1;
									Class109_Sub21_Sub3 var28 = (Class109_Sub21_Sub3) Class109_Sub21_Sub3.aClass120_1308
											.method438(var48);
									if (var28 != null)
										var26 = var28;
									else {
										final byte[] var49 = Class109_Sub21_Sub3.aClass104_1312.method387(4, var48);
										var28 = new Class109_Sub21_Sub3();
										if (var49 != null)
											var28.method672(new DataBuffer(var49), var48);

										var28.method671();
										Class109_Sub21_Sub3.aClass120_1308.method440(var28, var48);
										var26 = var28;
									}

									int var17 = var26.anInt1319;
									int var18;
									int var27;
									int var29;
									int var41;
									if (var17 >= 0) {
										var18 = Class109_Sub21_Sub14_Sub3.anInterface3_1833.method7(var17, -759323297);
										var29 = -1;
									} else if (var26.anInt1309 == 16711935) {
										var29 = -2;
										var17 = -1;
										var18 = -2;
									} else {
										var29 = Class24.method111(var26.anInt1313, var26.anInt1314, var26.anInt1315);
										var27 = (Class27.anInt254 + var26.anInt1313) & 255;
										var41 = var26.anInt1315 + Class27.anInt244;
										if (var41 < 0)
											var41 = 0;
										else if (var41 > 255)
											var41 = 255;

										var18 = Class24.method111(var27, var26.anInt1314, var41);
									}

									var27 = 0;
									if (var18 != -2)
										var27 = Class109_Sub21_Sub14_Sub3.anIntArray1832[Class109_Sub21_Sub8
												.method714(var18, 96)];

									if (var26.anInt1318 != -1) {
										var41 = (Class27.anInt254 + var26.anInt1316) & 255;
										int var44 = var26.anInt1311 + Class27.anInt244;
										if (var44 < 0)
											var44 = 0;
										else if (var44 > 255)
											var44 = 255;

										var18 = Class24.method111(var41, var26.anInt1317, var44);
										var27 = Class109_Sub21_Sub14_Sub3.anIntArray1832[Class109_Sub21_Sub8
												.method714(var18, 96)];
									}

									var0.method216(var2, var10, var12, var46, var52, var17, var30, var31, var32, var33,
											Class109_Sub21_Sub15_Sub1.method889(var34, var13),
											Class109_Sub21_Sub15_Sub1.method889(var34, var35),
											Class109_Sub21_Sub15_Sub1.method889(var34, var36),
											Class109_Sub21_Sub15_Sub1.method889(var34, var37),
											Class109_Sub21_Sub8.method714(var29, var13),
											Class109_Sub21_Sub8.method714(var29, var35),
											Class109_Sub21_Sub8.method714(var29, var36),
											Class109_Sub21_Sub8.method714(var29, var37), var38, var27);
								}
							}
						}
					}
				}
			}

			for (var10 = 1; var10 < 103; ++var10)
				for (var9 = 1; var9 < 103; ++var9) {
					if ((Class27.aByteArrayArrayArray243[var2][var9][var10] & 8) != 0)
						var12 = 0;
					else if ((var2 > 0) && ((Class27.aByteArrayArrayArray243[1][var9][var10] & 2) != 0))
						var12 = var2 - 1;
					else
						var12 = var2;

					var0.method180(var2, var9, var10, var12);
				}

			Class66.aByteArrayArrayArray577[var2] = null;
			Class27.aByteArrayArrayArray246[var2] = null;
			Class55.aByteArrayArrayArray541[var2] = null;
			Class109_Sub7.aByteArrayArrayArray970[var2] = null;
			Class27.aByteArrayArrayArray257[var2] = null;
		}

		var0.method201(-50, -10, -50);

		for (var2 = 0; var2 < 104; ++var2)
			for (var3 = 0; var3 < 104; ++var3)
				if ((Class27.aByteArrayArrayArray243[1][var2][var3] & 2) == 2)
					var0.method218(var2, var3);

		var2 = 1;
		var3 = 2;
		var6 = 4;

		for (var45 = 0; var45 < 4; ++var45) {
			if (var45 > 0) {
				var2 <<= 3;
				var3 <<= 3;
				var6 <<= 3;
			}

			for (int var14 = 0; var14 <= var45; ++var14)
				for (int var16 = 0; var16 <= 104; ++var16)
					for (int var15 = 0; var15 <= 104; ++var15) {
						short var51;
						if ((Class33.anIntArrayArrayArray322[var14][var15][var16] & var2) != 0) {
							var8 = var16;
							var5 = var16;
							var10 = var14;

							for (var9 = var14; (var8 > 0)
									&& ((Class33.anIntArrayArrayArray322[var14][var15][var8 - 1] & var2) != 0); --var8)
								;

							while ((var5 < 104)
									&& ((Class33.anIntArrayArrayArray322[var14][var15][1 + var5] & var2) != 0))
								++var5;

							label570: while (var10 > 0) {
								for (var11 = var8; var11 <= var5; ++var11)
									if ((Class33.anIntArrayArrayArray322[var10 - 1][var15][var11] & var2) == 0)
										break label570;

								--var10;
							}

							label559: while (var9 < var45) {
								for (var11 = var8; var11 <= var5; ++var11)
									if ((Class33.anIntArrayArrayArray322[var9 + 1][var15][var11] & var2) == 0)
										break label559;

								++var9;
							}

							var11 = (1 + (var5 - var8)) * ((1 + var9) - var10);
							if (var11 >= 8) {
								var51 = 240;
								var20 = Class27.anIntArrayArrayArray251[var9][var15][var8] - var51;
								var21 = Class27.anIntArrayArrayArray251[var10][var15][var8];
								Class42.method179(var45, 1, 128 * var15, var15 * 128, 128 * var8, 128 + (var5 * 128),
										var20, var21);

								for (var12 = var10; var12 <= var9; ++var12)
									for (var22 = var8; var22 <= var5; ++var22)
										Class33.anIntArrayArrayArray322[var12][var15][var22] &= ~var2;
							}
						}

						if ((Class33.anIntArrayArrayArray322[var14][var15][var16] & var3) != 0) {
							var8 = var15;
							var5 = var15;
							var10 = var14;

							for (var9 = var14; (var8 > 0)
									&& ((Class33.anIntArrayArrayArray322[var14][var8 - 1][var16] & var3) != 0); --var8)
								;

							while ((var5 < 104)
									&& ((Class33.anIntArrayArrayArray322[var14][1 + var5][var16] & var3) != 0))
								++var5;

							label623: while (var10 > 0) {
								for (var11 = var8; var11 <= var5; ++var11)
									if ((Class33.anIntArrayArrayArray322[var10 - 1][var11][var16] & var3) == 0)
										break label623;

								--var10;
							}

							label612: while (var9 < var45) {
								for (var11 = var8; var11 <= var5; ++var11)
									if ((Class33.anIntArrayArrayArray322[1 + var9][var11][var16] & var3) == 0)
										break label612;

								++var9;
							}

							var11 = ((1 + var9) - var10) * (1 + (var5 - var8));
							if (var11 >= 8) {
								var51 = 240;
								var20 = Class27.anIntArrayArrayArray251[var9][var8][var16] - var51;
								var21 = Class27.anIntArrayArrayArray251[var10][var8][var16];
								Class42.method179(var45, 2, 128 * var8, 128 + (128 * var5), 128 * var16, var16 * 128,
										var20, var21);

								for (var12 = var10; var12 <= var9; ++var12)
									for (var22 = var8; var22 <= var5; ++var22)
										Class33.anIntArrayArrayArray322[var12][var22][var16] &= ~var3;
							}
						}

						if ((Class33.anIntArrayArrayArray322[var14][var15][var16] & var6) != 0) {
							var8 = var15;
							var5 = var15;
							var10 = var16;

							for (var9 = var16; (var10 > 0) && ((Class33.anIntArrayArrayArray322[var14][var15][var10 - 1]
									& var6) != 0); --var10)
								;

							while ((var9 < 104)
									&& ((Class33.anIntArrayArrayArray322[var14][var15][var9 + 1] & var6) != 0))
								++var9;

							label676: while (var8 > 0) {
								for (var11 = var10; var11 <= var9; ++var11)
									if ((Class33.anIntArrayArrayArray322[var14][var8 - 1][var11] & var6) == 0)
										break label676;

								--var8;
							}

							label665: while (var5 < 104) {
								for (var11 = var10; var11 <= var9; ++var11)
									if ((Class33.anIntArrayArrayArray322[var14][var5 + 1][var11] & var6) == 0)
										break label665;

								++var5;
							}

							if ((((var5 - var8) + 1) * (1 + (var9 - var10))) >= 4) {
								var11 = Class27.anIntArrayArrayArray251[var14][var8][var10];
								Class42.method179(var45, 4, var8 * 128, (var5 * 128) + 128, var10 * 128,
										(128 * var9) + 128, var11, var11);

								for (var19 = var8; var19 <= var5; ++var19)
									for (var20 = var10; var20 <= var9; ++var20)
										Class33.anIntArrayArrayArray322[var14][var19][var20] &= ~var6;
							}
						}
					}
		}

	}

	static long method619() {
		try {
			final URL var0 = new URL(
					Class109_Sub21_Sub15_Sub1.method890("services", false) + "m=accountappeal/login.ws");
			final URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			final OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			final InputStream var3 = var1.getInputStream();
			final DataBuffer var4 = new DataBuffer(new byte[1000]);

			do {
				final int var5 = var3.read(var4.data, var4.position, 1000 - var4.position);
				if (var5 == -1) {
					var4.position = 0;
					final long var6 = var4.method613();
					return var6;
				}

				var4.position += var5;
			} while (var4.position < 1000);

			return 0L;
		} catch (final Exception var8) {
			return 0L;
		}
	}
}
