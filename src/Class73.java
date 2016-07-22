import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class73 {
	public static void method327(final Applet var0, final String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	public static Object method328(final Applet var0, final String var1, final Object[] var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2);
	}
}
