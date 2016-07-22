import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
	/**
	 *
	 */
	private static final long serialVersionUID = 5240608919430463550L;
	static boolean aBool1953 = false;
	static int anInt1955 = 1;
	static int anInt1962 = 500;
	protected static int anInt1956 = 0;
	protected static volatile boolean aBool1961 = true;
	static long aLong1951 = 0L;
	protected static volatile boolean aBool1964 = false;
	static volatile long aLong1960 = 0L;
	static volatile boolean aBool1965 = true;
	static int anInt1950 = 0;
	static Applet_Sub1 anApplet_Sub1_1966 = null;
	boolean aBool1959;
	static int anInt1954 = 20;
	protected static long[] aLongArray1949 = new long[32];
	protected static long[] aLongArray1958 = new long[32];
	protected static int anInt1963 = 0;
	protected static int anInt1957 = 0;
	protected static boolean aBool1952 = false;

	final synchronized void method1040() {
		if (!aBool1953) {
			aBool1953 = true;

			try {
				Class109_Sub21_Sub10.aCanvas1472.removeFocusListener(this);
			} catch (final Exception var5) {
				;
			}

			try {
				method1049((byte) -26);
			} catch (final Exception var4) {
				;
			}

			if (Class109_Sub21_Sub17.aFrame1587 != null)
				try {
					System.exit(0);
				} catch (final Throwable var3) {
					;
				}

			if (null != Class109_Sub21_Sub11.aClass71_1495)
				try {
					Class109_Sub21_Sub11.aClass71_1495.method317();
				} catch (final Exception var2) {
					;
				}

			method1055((byte) 22);
		}
	}

	protected final boolean method1041() {
		String var1 = getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (!var1.equals("mechscape.com") && !var1.endsWith(".mechscape.com")) {
					if (var1.endsWith("127.0.0.1"))
						return true;
					else {
						while ((var1.length() > 0) && (var1.charAt(var1.length() - 1) >= 48)
								&& (var1.charAt(var1.length() - 1) <= 57))
							var1 = var1.substring(0, var1.length() - 1);

						if (var1.endsWith("192.168.1."))
							return true;
						else {
							method1050("invalidhost");
							return false;
						}
					}
				} else
					return true;
			} else
				return true;
		} else
			return true;
	}

	@Override
	public void run() {
		try {
			int var3;
			if (Class71.aString597 != null) {
				final String var1 = Class71.aString597.toLowerCase();
				if ((var1.indexOf("sun") != -1) || (var1.indexOf("apple") != -1)) {
					final String var2 = Class135.aString886;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")
							|| var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4")
							|| var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.")
							|| var2.equals("1.6.0")) {
						method1050("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						for (var3 = 6; var3 < var2.length(); ++var3) {
							final char var4 = var2.charAt(var3);
							final boolean var5 = (var4 >= 48) && (var4 <= 57);
							if (!var5)
								break;
						}

						final String var6 = var2.substring(6, var3);
						if (Class36.method160(var6)) {
							final int var11 = Class50.method252(var6, 10, true);
							if (var11 < 10) {
								method1050("wrongjava");
								return;
							}
						}
					}

					anInt1955 = 5;
				}
			}

			setFocusCycleRoot(true);
			method1045();
			method1044(-2056811690);
			Class37.aClass57_356 = Class68.method307(1409530204);

			label79: while (true) {
				Class71 var9;
				Canvas var10;
				do {
					if ((0L != aLong1951) && (Class109_Sub21_Sub15.method829(1607190145) >= aLong1951))
						break label79;

					Class26.anInt241 = Class37.aClass57_356.method270(anInt1954, anInt1955, (byte) 90);

					for (int var7 = 0; var7 < Class26.anInt241; ++var7)
						method1042();

					method1043();
					var9 = Class109_Sub21_Sub11.aClass71_1495;
					var10 = Class109_Sub21_Sub10.aCanvas1472;
				} while (var9.anEventQueue602 == null);

				for (var3 = 0; (var3 < 50) && (var9.anEventQueue602.peekEvent() != null); ++var3)
					Class94.method356(1L);

				if (var10 != null)
					var9.anEventQueue602.postEvent(new ActionEvent(var10, 1001, "dummy"));
			}
		} catch (final Exception var8) {
			Class47.method237((String) null, var8);
			method1050("crash");
		}

		method1040();
	}

	void method1042() {
		final long var1 = Class109_Sub21_Sub15.method829(1657100523);
		final long var3 = aLongArray1958[Class44.anInt455];
		aLongArray1958[Class44.anInt455] = var1;
		Class44.anInt455 = (1 + Class44.anInt455) & 31;
		if ((var3 != 0L) && (var1 > var3))
			;

		synchronized (this) {
			Class113.aBool816 = aBool1965;
		}

		method1047(-1931633531);
	}

	void method1043() {
		final Container var1 = method1051();
		final long var4 = Class109_Sub21_Sub15.method829(63311482);
		final long var2 = aLongArray1949[Class57.anInt546];
		aLongArray1949[Class57.anInt546] = var4;
		Class57.anInt546 = (1 + Class57.anInt546) & 31;
		if ((var2 != 0L) && (var4 > var2)) {
			final int var7 = (int) (var4 - var2);
			anInt1956 = ((var7 >> 1) + 32000) / var7;
		}

		if ((++anInt1962 - 1) > 50) {
			anInt1962 -= 50;
			aBool1961 = true;
			Class109_Sub21_Sub10.aCanvas1472.setSize(LoginEncoder.anInt524, Class109_Sub21_Sub15_Sub5.anInt1815);
			Class109_Sub21_Sub10.aCanvas1472.setVisible(true);
			if (var1 == Class109_Sub21_Sub17.aFrame1587) {
				final Insets var6 = Class109_Sub21_Sub17.aFrame1587.getInsets();
				Class109_Sub21_Sub10.aCanvas1472.setLocation(var6.left + anInt1963, anInt1957 + var6.top);
			} else
				Class109_Sub21_Sub10.aCanvas1472.setLocation(anInt1963, anInt1957);
		}

		method1048(1310786141);
	}

	protected abstract void method1044(int var1);

	@Override
	public void stop() {
		if ((anApplet_Sub1_1966 == this) && !aBool1953)
			aLong1951 = Class109_Sub21_Sub15.method829(837913890) + 4000L;
	}

	@Override
	public void start() {
		if ((this == anApplet_Sub1_1966) && !aBool1953)
			aLong1951 = 0L;
	}

	@Override
	public final void update(final Graphics var1) {
		paint(var1);
	}

	@Override
	public final synchronized void paint(final Graphics var1) {
		if ((this == anApplet_Sub1_1966) && !aBool1953) {
			aBool1961 = true;
			if ((Class135.aString886 != null) && Class135.aString886.startsWith("1.5")
					&& ((Class109_Sub21_Sub15.method829(1747386793) - aLong1960) > 1000L)) {
				final Rectangle var2 = var1.getClipBounds();
				if ((var2 == null)
						|| ((var2.width >= LoginEncoder.anInt524) && (var2.height >= Class109_Sub21_Sub15_Sub5.anInt1815)))
					aBool1964 = true;
			}

		}
	}

	protected final synchronized void method1045() {
		final Container var1 = method1051();
		if (Class109_Sub21_Sub10.aCanvas1472 != null) {
			Class109_Sub21_Sub10.aCanvas1472.removeFocusListener(this);
			var1.remove(Class109_Sub21_Sub10.aCanvas1472);
		}

		LoginEncoder.anInt524 = Math.max(var1.getWidth(), Class48.anInt504);
		Class109_Sub21_Sub15_Sub5.anInt1815 = Math.max(var1.getHeight(), Class47.anInt494);
		Insets var2;
		if (Class109_Sub21_Sub17.aFrame1587 != null) {
			var2 = Class109_Sub21_Sub17.aFrame1587.getInsets();
			LoginEncoder.anInt524 -= var2.left + var2.right;
			Class109_Sub21_Sub15_Sub5.anInt1815 -= var2.bottom + var2.top;
		}

		Class109_Sub21_Sub10.aCanvas1472 = new Canvas_Sub1(this);
		var1.add(Class109_Sub21_Sub10.aCanvas1472);
		Class109_Sub21_Sub10.aCanvas1472.setSize(LoginEncoder.anInt524, Class109_Sub21_Sub15_Sub5.anInt1815);
		Class109_Sub21_Sub10.aCanvas1472.setVisible(true);
		if (var1 == Class109_Sub21_Sub17.aFrame1587) {
			var2 = Class109_Sub21_Sub17.aFrame1587.getInsets();
			Class109_Sub21_Sub10.aCanvas1472.setLocation(var2.left + anInt1963, var2.top + anInt1957);
		} else
			Class109_Sub21_Sub10.aCanvas1472.setLocation(anInt1963, anInt1957);

		Class109_Sub21_Sub10.aCanvas1472.addFocusListener(this);
		Class109_Sub21_Sub10.aCanvas1472.requestFocus();
		aBool1961 = true;
		final Class8 var3 = Class63.method288(LoginEncoder.anInt524, Class109_Sub21_Sub15_Sub5.anInt1815,
				Class109_Sub21_Sub10.aCanvas1472);
		if (Class44.aClass8_453 != null)
			Class44.aClass8_453.method50(var3.anImage88.getGraphics(), 0, 0, (byte) 1);

		Class44.aClass8_453 = var3;
		aBool1964 = false;
		aLong1960 = Class109_Sub21_Sub15.method829(160487414);
	}

	@Override
	public final void focusLost(final FocusEvent var1) {
		aBool1965 = false;
	}

	@Override
	public final void windowClosed(final WindowEvent var1) {
	}

	@Override
	public final void windowClosing(final WindowEvent var1) {
		destroy();
	}

	@Override
	public final void windowDeactivated(final WindowEvent var1) {
	}

	@Override
	public final void windowDeiconified(final WindowEvent var1) {
	}

	protected final void method1046(final int var1, final int var2, final int var3) {
		try {
			if (null != anApplet_Sub1_1966) {
				++anInt1950;
				if (anInt1950 >= 3) {
					method1050("alreadyloaded");
					return;
				}

				getAppletContext().showDocument(getDocumentBase(), "_self");
				return;
			}

			anApplet_Sub1_1966 = this;
			LoginEncoder.anInt524 = var1;
			Class109_Sub21_Sub15_Sub5.anInt1815 = var2;
			RuntimeException_Sub1.anInt1899 = var3;
			RuntimeException_Sub1.anApplet1895 = this;
			if (Class109_Sub21_Sub11.aClass71_1495 == null)
				Class109_Sub21_Sub11.aClass71_1495 = new Class71();

			Class109_Sub21_Sub11.aClass71_1495.method314(this, 1);
		} catch (final Exception var5) {
			Class47.method237((String) null, var5);
			method1050("crash");
		}

	}

	@Override
	public abstract void init();

	protected abstract void method1047(int var1);

	protected abstract void method1048(int var1);

	protected abstract void method1049(byte var1);

	protected void method1050(final String var1) {
		if (!aBool1959) {
			aBool1959 = true;
			System.out.println("error_game_" + var1);

			try {
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (final Exception var3) {
				;
			}

		}
	}

	protected Container method1051() {
		return null != Class109_Sub21_Sub17.aFrame1587 ? Class109_Sub21_Sub17.aFrame1587 : this;
	}

	protected Dimension method1052() {
		final Container var1 = method1051();
		int var4 = Math.max(var1.getWidth(), Class48.anInt504);
		int var2 = Math.max(var1.getHeight(), Class47.anInt494);
		if (null != Class109_Sub21_Sub17.aFrame1587) {
			final Insets var3 = Class109_Sub21_Sub17.aFrame1587.getInsets();
			var4 -= var3.left + var3.right;
			var2 -= var3.top + var3.bottom;
		}

		return new Dimension(var4, var2);
	}

	@Override
	public final void focusGained(final FocusEvent var1) {
		aBool1965 = true;
		aBool1961 = true;
	}

	@Override
	public final void windowIconified(final WindowEvent var1) {
	}

	@Override
	public final void windowOpened(final WindowEvent var1) {
	}

	static void method1053(final int var0, final String var1, final String var2) {
		Class109_Sub21_Sub4.method683(var0, var1, var2, (String) null);
	}

	@Override
	public final void windowActivated(final WindowEvent var1) {
	}

	static boolean method1054(final String var0, final boolean var1) {
		if (var0 == null)
			return false;
		else {
			final String var2 = Class6.method39(var0, Class95.aClass113_708);

			for (int var3 = 0; var3 < client.anInt2237; ++var3)
				if (var2.equalsIgnoreCase(
						Class6.method39(client.aClass33Array2239[var3].aString317, Class95.aClass113_708))
						&& (!var1 || (client.aClass33Array2239[var3].anInt319 != 0)))
					return true;

			if (var2.equalsIgnoreCase(Class6.method39(
					Class109_Sub21_Sub17.aClass109_Sub21_Sub15_Sub3_Sub2_1590.aString1931, Class95.aClass113_708)))
				return true;
			else
				return false;
		}
	}

	protected abstract void method1055(byte var1);

	@Override
	public void destroy() {
		if ((this == anApplet_Sub1_1966) && !aBool1953) {
			aLong1951 = Class109_Sub21_Sub15.method829(1197008032);
			Class94.method356(5000L);
			method1040();
		}
	}

	static final void method1056(final int var0, final int var1, final int var2, final int var3,
			final Class109_Sub21_Sub14_Sub2 var4, final Class109_Sub21_Sub19 var5) {
		final int var6 = (var3 * var3) + (var2 * var2);
		if ((var6 > 4225) && (var6 < 90000)) {
			final int var13 = (client.anInt2038 + client.anInt2052) & 2047;
			int var11 = Class109_Sub21_Sub14_Sub3.anIntArray1835[var13];
			int var10 = Class109_Sub21_Sub14_Sub3.anIntArray1836[var13];
			var11 = (var11 * 256) / (256 + client.anInt2040);
			var10 = (var10 * 256) / (256 + client.anInt2040);
			final int var12 = ((var2 * var10) + (var11 * var3)) >> 16;
			final int var14 = ((var3 * var10) - (var11 * var2)) >> 16;
			final double var7 = Math.atan2(var12, var14);
			final int var9 = (int) (Math.sin(var7) * 63.0D);
			final int var15 = (int) (Math.cos(var7) * 57.0D);
			Class54.aClass109_Sub21_Sub14_Sub2_539.method924((var0 + 94 + var9 + 4) - 10, (83 + var1) - var15 - 20, 20,
					20, 15, 15, var7, 256);
		} else
			Class109_Sub23.method659(var0, var1, var2, var3, var4, var5);

	}

	static final void method1057(final int var0) {
		if (var0 >= 0) {
			final int var2 = client.anIntArray2111[var0];
			final int var3 = client.anIntArray2112[var0];
			final int var5 = client.anIntArray2113[var0];
			final int var4 = client.anIntArray2114[var0];
			final String var6 = client.aStringArray1975[var0];
			final String var1 = client.aStringArray2123[var0];
			Class91.method355(var2, var3, var5, var4, var6, var1, Class81.anInt645, Class81.anInt639);
		}
	}
}
