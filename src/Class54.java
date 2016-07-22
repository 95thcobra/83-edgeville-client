import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.util.Hashtable;

public class Class54 {
	static Class4 aClass4_535;
	static File aFile536;
	public static int anInt538;
	static Class109_Sub21_Sub14_Sub2 aClass109_Sub21_Sub14_Sub2_539;
	static boolean aBool537 = false;
	static Hashtable aHashtable540 = new Hashtable(16);

	static void method261() {
		final int var0 = Applet_Sub1.anInt1963;
		final int var1 = Applet_Sub1.anInt1957;
		final int var2 = Class70.anInt595 - LoginEncoder.anInt524 - var0;
		final int var3 = Class109_Sub21_Sub15.anInt1574 - Class109_Sub21_Sub15_Sub5.anInt1815 - var1;
		if ((var0 > 0) || (var2 > 0) || (var1 > 0) || (var3 > 0))
			try {
				final Container var4 = client.aclient1968.method1051();
				int var5 = 0;
				int var6 = 0;
				if (Class109_Sub21_Sub17.aFrame1587 == var4) {
					final Insets var7 = Class109_Sub21_Sub17.aFrame1587.getInsets();
					var5 = var7.left;
					var6 = var7.top;
				}

				final Graphics var9 = var4.getGraphics();
				var9.setColor(Color.black);
				if (var0 > 0)
					var9.fillRect(var5, var6, var0, Class109_Sub21_Sub15.anInt1574);

				if (var1 > 0)
					var9.fillRect(var5, var6, Class70.anInt595, var1);

				if (var2 > 0)
					var9.fillRect((Class70.anInt595 + var5) - var2, var6, var2, Class109_Sub21_Sub15.anInt1574);

				if (var3 > 0)
					var9.fillRect(var5, (Class109_Sub21_Sub15.anInt1574 + var6) - var3, Class70.anInt595, var3);
			} catch (final Exception var8) {
				;
			}

	}

	public static Class109_Sub21_Sub8 method262(final int var0) {
		Class109_Sub21_Sub8 var1 = (Class109_Sub21_Sub8) Class109_Sub21_Sub8.aClass120_1412.method438(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class129.aClass104_864.method387(14, var0);
			var1 = new Class109_Sub21_Sub8();
			if (null != var2)
				var1.method715(new DataBuffer(var2));

			Class109_Sub21_Sub8.aClass120_1412.method440(var1, var0);
			return var1;
		}
	}
}
