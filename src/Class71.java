import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class71 implements Runnable {
	Interface2 anInterface2_598;
	Class86 aClass86_599 = null;
	Class86 aClass86_600 = null;
	boolean aBool601 = false;
	public static String aString597;
	public EventQueue anEventQueue602;
	Thread aThread603;

	final Class86 method311(final int var1, final int var2, final int var3, final Object var4) {
		final Class86 var5 = new Class86();
		var5.anInt665 = var1;
		var5.anInt666 = var2;
		var5.anObject667 = var4;
		synchronized (this) {
			if (aClass86_600 != null) {
				aClass86_600.aClass86_663 = var5;
				aClass86_600 = var5;
			} else
				aClass86_600 = aClass86_599 = var5;

			notify();
			return var5;
		}
	}

	public final Class86 method312(final int var1) {
		return method311(3, var1, 0, (Object) null);
	}

	public final Class86 method313(final String var1, final int var2) {
		return method311(1, var2, 0, var1);
	}

	public final Class86 method314(final Runnable var1, final int var2) {
		return method311(2, var2, 0, var1);
	}

	static void method315(final Class109_Sub20 var0) {
		if (client.anInt2174 == var0.anInt1246)
			client.aBoolArray2116[var0.anInt1172] = true;

	}

	public final Class86 method316(final URL var1) {
		return method311(4, 0, 0, var1);
	}

	Class71() {
		aString597 = "Unknown";
		Class135.aString886 = "1.1";

		try {
			aString597 = System.getProperty("java.vendor");
			Class135.aString886 = System.getProperty("java.version");
		} catch (final Exception var3) {
			;
		}

		try {
			anEventQueue602 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (final Throwable var2) {
			;
		}

		aBool601 = false;
		aThread603 = new Thread(this);
		aThread603.setPriority(10);
		aThread603.setDaemon(true);
		aThread603.start();
	}

	final void method317() {
		synchronized (this) {
			aBool601 = true;
			notifyAll();
		}

		try {
			aThread603.join();
		} catch (final InterruptedException var3) {
			;
		}

	}

	@Override
	public final void run() {
		while (true) {
			Class86 var2;
			synchronized (this) {
				while (true) {
					if (aBool601)
						return;

					if (aClass86_599 != null) {
						var2 = aClass86_599;
						aClass86_599 = aClass86_599.aClass86_663;
						if (aClass86_599 == null)
							aClass86_600 = null;
						break;
					}

					try {
						this.wait();
					} catch (final InterruptedException var8) {
						;
					}
				}
			}

			try {
				final int var5 = var2.anInt665;
				if (var5 == 1)
					var2.anObject662 = new Socket(InetAddress.getByName((String) var2.anObject667), var2.anInt666);
				else if (var5 == 2) {
					final Thread var3 = new Thread((Runnable) var2.anObject667);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var2.anInt666);
					var2.anObject662 = var3;
				} else if (var5 == 4)
					var2.anObject662 = new DataInputStream(((URL) var2.anObject667).openStream());
				else if (var5 == 3) {
					final String var10 = ((var2.anInt666 >> 24) & 255) + "." + ((var2.anInt666 >> 16) & 255) + "."
							+ ((var2.anInt666 >> 8) & 255) + "." + (var2.anInt666 & 255);
					var2.anObject662 = InetAddress.getByName(var10).getHostName();
				}

				var2.anInt664 = 1;
			} catch (final ThreadDeath var6) {
				throw var6;
			} catch (final Throwable var7) {
				var2.anInt664 = 2;
			}
		}
	}

	public final Interface2 method318() {
		return anInterface2_598;
	}
}
