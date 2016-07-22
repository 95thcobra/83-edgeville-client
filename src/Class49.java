import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class Class49 implements Interface4 {
	static Class7 aClass7_510;
	static Class109_Sub21_Sub14_Sub2 aClass109_Sub21_Sub14_Sub2_511;
	static Class49 aClass49_508 = new Class49(0);
	static Class49 aClass49_507 = new Class49(1);
	static Class49 aClass49_512 = new Class49(2);
	int anInt509;

	@Override
	public int method11(final int var1) {
		return anInt509;
	}

	static void method248(final String var0, final boolean var1, final String var2, final boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE))
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (final Exception var5) {
					;
				}

			if (Class69.aString592.startsWith("win") && !var3) {
				Class27.method125(var0, 0, "openjs");
				return;
			}

			if (Class69.aString592.startsWith("mac")) {
				Class27.method125(var0, 1, var2);
				return;
			}

			Class27.method125(var0, 2, "openjs");
		} else
			Class69.method309(var0, 3);

	}

	Class49(final int var1) {
		anInt509 = var1;
	}
}
