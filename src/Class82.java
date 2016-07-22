import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Class82 implements Runnable {
	boolean aBool649 = false;
	Class86 aClass86_653;
	boolean aBool656 = false;
	byte[] aByteArray650;
	int anInt655 = 0;
	int anInt654 = 0;
	Class71 aClass71_651;
	Socket aSocket652;
	InputStream anInputStream647;
	OutputStream anOutputStream648;

	public void method338() {
		if (!aBool649) {
			synchronized (this) {
				aBool649 = true;
				notifyAll();
			}

			if (null != aClass86_653) {
				while (aClass86_653.anInt664 == 0)
					Class94.method356(1L);

				if (aClass86_653.anInt664 == 1)
					try {
						((Thread) aClass86_653.anObject662).join();
					} catch (final InterruptedException var3) {
						;
					}
			}

			aClass86_653 = null;
		}
	}

	public int method339() throws IOException {
		return aBool649 ? 0 : anInputStream647.read();
	}

	public int method340() throws IOException {
		return aBool649 ? 0 : anInputStream647.available();
	}

	public void method341(final byte[] var1, int var2, int var3) throws IOException {
		if (!aBool649)
			while (var3 > 0) {
				final int var4 = anInputStream647.read(var1, var2, var3);
				if (var4 <= 0)
					throw new EOFException();

				var2 += var4;
				var3 -= var4;
			}
	}

	public void method342(final byte[] var1, final int var2, final int var3) throws IOException {
		if (!aBool649)
			if (aBool656) {
				aBool656 = false;
				throw new IOException();
			} else {
				if (aByteArray650 == null)
					aByteArray650 = new byte[5000];

				synchronized (this) {
					for (int var5 = 0; var5 < var3; ++var5) {
						aByteArray650[anInt655] = var1[var2 + var5];
						anInt655 = (anInt655 + 1) % 5000;
						if (anInt655 == ((4900 + anInt654) % 5000))
							throw new IOException();
					}

					if (aClass86_653 == null)
						aClass86_653 = aClass71_651.method314(this, 3);

					notifyAll();
				}
			}
	}

	@Override
	public void run() {
		try {
			while (true) {
				label81: {
					int var3;
					int var4;
					synchronized (this) {
						if (anInt654 == anInt655) {
							if (aBool649)
								break label81;

							try {
								this.wait();
							} catch (final InterruptedException var10) {
								;
							}
						}

						var3 = anInt654;
						if (anInt655 >= anInt654)
							var4 = anInt655 - anInt654;
						else
							var4 = 5000 - anInt654;
					}

					if (var4 <= 0)
						continue;

					try {
						anOutputStream648.write(aByteArray650, var3, var4);
					} catch (final IOException var9) {
						aBool656 = true;
					}

					anInt654 = (var4 + anInt654) % 5000;

					try {
						if (anInt655 == anInt654)
							anOutputStream648.flush();
					} catch (final IOException var8) {
						aBool656 = true;
					}
					continue;
				}

				try {
					if (anInputStream647 != null)
						anInputStream647.close();

					if (null != anOutputStream648)
						anOutputStream648.close();

					if (null != aSocket652)
						aSocket652.close();
				} catch (final IOException var7) {
					;
				}

				aByteArray650 = null;
				break;
			}
		} catch (final Exception var12) {
			Class47.method237((String) null, var12);
		}

	}

	@Override
	protected void finalize() {
		method338();
	}

	static void method343(final int var0) {
		if (var0 != client.anInt2180) {
			if (client.anInt2180 == 0)
				Class109_Sub21_Sub16.method833();

			if ((var0 == 20) || (var0 == 40) || (var0 == 45)) {
				client.loginStage = 0;
				client.anInt2177 = 0;
				client.anInt2004 = 0;
			}

			if ((var0 != 20) && (var0 != 40) && (Class109_Sub6.aClass82_962 != null)) {
				Class109_Sub6.aClass82_962.method338();
				Class109_Sub6.aClass82_962 = null;
			}

			if (client.anInt2180 == 25) {
				client.anInt2027 = 0;
				client.anInt2023 = 0;
				client.anInt2024 = 1;
				client.anInt2025 = 0;
				client.anInt2026 = 1;
			}

			if ((var0 != 5) && (var0 != 10)) {
				if (var0 == 20)
					Class27.method122(Class109_Sub21_Sub10.aCanvas1472, Class39.aClass104_Sub1_369,
							Class28.aClass104_Sub1_265, true, client.anInt2180 == 11 ? 4 : 0);
				else if (var0 == 11)
					Class27.method122(Class109_Sub21_Sub10.aCanvas1472, Class39.aClass104_Sub1_369,
							Class28.aClass104_Sub1_265, false, 4);
				else
					Class109_Sub21_Sub15.method830((byte) 126);
			} else
				Class27.method122(Class109_Sub21_Sub10.aCanvas1472, Class39.aClass104_Sub1_369,
						Class28.aClass104_Sub1_265, true, 0);

			client.anInt2180 = var0;
		}
	}

	public Class82(final Socket var1, final Class71 var2) throws IOException {
		aClass71_651 = var2;
		aSocket652 = var1;
		aSocket652.setSoTimeout(30000);
		aSocket652.setTcpNoDelay(true);
		anInputStream647 = aSocket652.getInputStream();
		anOutputStream648 = aSocket652.getOutputStream();
	}

	static void method344(final int var0) {
		if ((var0 == -1) && !client.aBool2209)
			Class70.method310();
		else if ((var0 != -1) && (var0 != client.anInt2208) && (client.anInt2207 != 0) && !client.aBool2209) {
			final Class104_Sub1 var1 = Class46.aClass104_Sub1_486;
			final int var2 = client.anInt2207;
			Class93.anInt703 = 1;
			Class27.aClass104_260 = var1;
			Class75.anInt613 = var0;
			Class109_Sub21_Sub15_Sub3_Sub1.anInt1926 = 0;
			Class79.anInt628 = var2;
			Class25.aBool224 = false;
			Class54.anInt538 = 2;
		}

		client.anInt2208 = var0;
	}
}
