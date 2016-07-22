import java.io.EOFException;
import java.io.IOException;

public class Class130 {
	long aLong872;
	int anInt868;
	long aLong865;
	long aLong874 = -1L;
	long aLong873;
	long aLong870 = -1L;
	int anInt871 = 0;
	long aLong866;
	Class132 aClass132_867;
	byte[] aByteArray875;
	byte[] aByteArray869;

	public void method464() throws IOException {
		method469();
		aClass132_867.method475();
	}

	public void method465(final long var1) throws IOException {
		if (var1 < 0L)
			throw new IOException("");
		else
			aLong872 = var1;
	}

	public long method466() {
		return aLong866;
	}

	public void method467(final byte[] var1) throws IOException {
		method471(var1, 0, var1.length);
	}

	void method468() throws IOException {
		anInt868 = 0;
		if (aLong872 != aLong865) {
			aClass132_867.method473(aLong872);
			aLong865 = aLong872;
		}

		int var1;
		for (aLong874 = aLong872; anInt868 < aByteArray875.length; anInt868 += var1) {
			var1 = aClass132_867.method477(aByteArray875, anInt868, aByteArray875.length - anInt868);
			if (var1 == -1)
				break;

			aLong865 += var1;
		}

	}

	void method469() throws IOException {
		if (-1L != aLong870) {
			if (aLong865 != aLong870) {
				aClass132_867.method473(aLong870);
				aLong865 = aLong870;
			}

			aClass132_867.method474(aByteArray869, 0, anInt871);
			aLong865 += 879850891L * anInt871 * -1520399837;
			if (aLong865 > aLong873)
				aLong873 = aLong865;

			long var1 = -1L;
			long var3 = -1L;
			if ((aLong870 >= aLong874) && (aLong870 < (anInt868 + aLong874)))
				var1 = aLong870;
			else if ((aLong874 >= aLong870) && (aLong874 < (anInt871 + aLong870)))
				var1 = aLong874;

			if (((aLong870 + anInt871) > aLong874) && ((aLong870 + anInt871) <= (anInt868 + aLong874)))
				var3 = anInt871 + aLong870;
			else if (((anInt868 + aLong874) > aLong870) && ((anInt868 + aLong874) <= (aLong870 + anInt871)))
				var3 = anInt868 + aLong874;

			if ((var1 > -1L) && (var3 > var1)) {
				final int var5 = (int) (var3 - var1);
				System.arraycopy(aByteArray869, (int) (var1 - aLong870), aByteArray875, (int) (var1 - aLong874), var5);
			}

			aLong870 = -1L;
			anInt871 = 0;
		}

	}

	public void method470(final byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((var3 + aLong872) > aLong866)
				aLong866 = aLong872 + var3;

			if ((-1L != aLong870) && ((aLong872 < aLong870) || (aLong872 > (aLong870 + anInt871))))
				method469();

			if ((aLong870 != -1L) && ((aLong872 + var3) > (aByteArray869.length + aLong870))) {
				final int var4 = (int) (aByteArray869.length - (aLong872 - aLong870));
				System.arraycopy(var1, var2, aByteArray869, (int) (aLong872 - aLong870), var4);
				aLong872 += var4;
				var2 += var4;
				var3 -= var4;
				anInt871 = aByteArray869.length;
				method469();
			}

			if (var3 <= aByteArray869.length) {
				if (var3 > 0) {
					if (aLong870 == -1L)
						aLong870 = aLong872;

					System.arraycopy(var1, var2, aByteArray869, (int) (aLong872 - aLong870), var3);
					aLong872 += var3;
					if ((aLong872 - aLong870) > anInt871)
						anInt871 = (int) (aLong872 - aLong870);

				}
			} else {
				if (aLong865 != aLong872) {
					aClass132_867.method473(aLong872);
					aLong865 = aLong872;
				}

				aClass132_867.method474(var1, var2, var3);
				aLong865 += var3;
				if (aLong865 > aLong873)
					aLong873 = aLong865;

				long var5 = -1L;
				long var7 = -1L;
				if ((aLong872 >= aLong874) && (aLong872 < (aLong874 + anInt868)))
					var5 = aLong872;
				else if ((aLong874 >= aLong872) && (aLong874 < (aLong872 + var3)))
					var5 = aLong874;

				if (((var3 + aLong872) > aLong874) && ((var3 + aLong872) <= (aLong874 + anInt868)))
					var7 = aLong872 + var3;
				else if (((anInt868 + aLong874) > aLong872) && ((aLong874 + anInt868) <= (var3 + aLong872)))
					var7 = aLong874 + anInt868;

				if ((var5 > -1L) && (var7 > var5)) {
					final int var9 = (int) (var7 - var5);
					System.arraycopy(var1, (int) ((var5 + var2) - aLong872), aByteArray875, (int) (var5 - aLong874),
							var9);
				}

				aLong872 += var3;
			}
		} catch (final IOException var11) {
			aLong865 = -1L;
			throw var11;
		}
	}

	public void method471(final byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((var2 + var3) > var1.length)
				throw new ArrayIndexOutOfBoundsException((var3 + var2) - var1.length);

			if ((aLong870 != -1L) && (aLong872 >= aLong870) && ((var3 + aLong872) <= (anInt871 + aLong870))) {
				System.arraycopy(aByteArray869, (int) (aLong872 - aLong870), var1, var2, var3);
				aLong872 += var3;
				return;
			}

			final long var4 = aLong872;
			final int var7 = var3;
			int var8;
			if ((aLong872 >= aLong874) && (aLong872 < (aLong874 + anInt868))) {
				var8 = (int) (anInt868 - (aLong872 - aLong874));
				if (var8 > var3)
					var8 = var3;

				System.arraycopy(aByteArray875, (int) (aLong872 - aLong874), var1, var2, var8);
				aLong872 += var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > aByteArray875.length) {
				aClass132_867.method473(aLong872);

				for (aLong865 = aLong872; var3 > 0; var3 -= var8) {
					var8 = aClass132_867.method477(var1, var2, var3);
					if (var8 == -1)
						break;

					aLong865 += var8;
					aLong872 += var8;
					var2 += var8;
				}
			} else if (var3 > 0) {
				method468();
				var8 = var3;
				if (var3 > anInt868)
					var8 = anInt868;

				System.arraycopy(aByteArray875, 0, var1, var2, var8);
				var2 += var8;
				var3 -= var8;
				aLong872 += var8;
			}

			if (aLong870 != -1L) {
				if ((aLong870 > aLong872) && (var3 > 0)) {
					var8 = (int) (aLong870 - aLong872) + var2;
					if (var8 > (var2 + var3))
						var8 = var2 + var3;

					while (var2 < var8) {
						var1[var2++] = 0;
						--var3;
						++aLong872;
					}
				}

				long var9 = -1L;
				long var11 = -1L;
				if ((aLong870 >= var4) && (aLong870 < (var4 + var7)))
					var9 = aLong870;
				else if ((var4 >= aLong870) && (var4 < (aLong870 + anInt871)))
					var9 = var4;

				if (((aLong870 + anInt871) > var4) && ((aLong870 + anInt871) <= (var4 + var7)))
					var11 = anInt871 + aLong870;
				else if (((var4 + var7) > aLong870) && ((var7 + var4) <= (anInt871 + aLong870)))
					var11 = var4 + var7;

				if ((var9 > -1L) && (var11 > var9)) {
					final int var13 = (int) (var11 - var9);
					System.arraycopy(aByteArray869, (int) (var9 - aLong870), var1, var2 + (int) (var9 - var4), var13);
					if (var11 > aLong872) {
						var3 = (int) (var3 - (var11 - aLong872));
						aLong872 = var11;
					}
				}
			}
		} catch (final IOException var15) {
			aLong865 = -1L;
			throw var15;
		}

		if (var3 > 0)
			throw new EOFException();
	}

	public Class130(final Class132 var1, final int var2, final int var3) throws IOException {
		aClass132_867 = var1;
		aLong866 = aLong873 = var1.method476();
		aByteArray875 = new byte[var2];
		aByteArray869 = new byte[var3];
		aLong872 = 0L;
	}
}
