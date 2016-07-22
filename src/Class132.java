import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class132 {
	long aLong878;
	RandomAccessFile aRandomAccessFile877;
	long aLong876;

	final void method473(final long var1) throws IOException {
		aRandomAccessFile877.seek(var1);
		aLong878 = var1;
	}

	public final void method474(final byte[] var1, final int var2, final int var3) throws IOException {
		if ((var3 + aLong878) > aLong876) {
			aRandomAccessFile877.seek(aLong876 + 1L);
			aRandomAccessFile877.write(1);
			throw new EOFException();
		} else {
			aRandomAccessFile877.write(var1, var2, var3);
			aLong878 += var3;
		}
	}

	public final void method475() throws IOException {
		if (aRandomAccessFile877 != null) {
			aRandomAccessFile877.close();
			aRandomAccessFile877 = null;
		}

	}

	public final long method476() throws IOException {
		return aRandomAccessFile877.length();
	}

	public Class132(final File var1, final String var2, long var3) throws IOException {
		if (var3 == -1L)
			var3 = Long.MAX_VALUE;

		if (var1.length() >= var3)
			var1.delete();

		aRandomAccessFile877 = new RandomAccessFile(var1, var2);
		aLong876 = var3;
		aLong878 = 0L;
		final int var5 = aRandomAccessFile877.read();
		if ((var5 != -1) && !var2.equals("r")) {
			aRandomAccessFile877.seek(0L);
			aRandomAccessFile877.write(var5);
		}

		aRandomAccessFile877.seek(0L);
	}

	@Override
	protected void finalize() throws Throwable {
		if (null != aRandomAccessFile877) {
			System.out.println("");
			method475();
		}

	}

	public final int method477(final byte[] var1, final int var2, final int var3) throws IOException {
		final int var4 = aRandomAccessFile877.read(var1, var2, var3);
		if (var4 > 0)
			aLong878 += var4;

		return var4;
	}
}
