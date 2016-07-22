import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class63 implements KeyListener, FocusListener {
	public static volatile int anInt574 = 0;
	public static int anInt566 = 0;
	public static int anInt564 = 0;
	public static Class63 aClass63_573 = new Class63();
	public static boolean[] aBoolArray562 = new boolean[112];
	public static int[] anIntArray569 = new int[128];
	public static int anInt567 = 0;
	static char[] aCharArray572 = new char[128];
	static int[] anIntArray570 = new int[128];
	public static int[] anIntArray575 = new int[128];
	public static int anInt568 = 0;
	public static int anInt571 = 0;
	public static int anInt563 = 0;
	public static int[] anIntArray565 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81,
			82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1,
			-1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34,
			51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228,
			231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
			-1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@Override
	public final synchronized void keyReleased(final KeyEvent var1) {
		if (null != aClass63_573) {
			anInt574 = 0;
			int var2 = var1.getKeyCode();
			if ((var2 >= 0) && (var2 < anIntArray565.length))
				var2 = anIntArray565[var2] & -129;
			else
				var2 = -1;

			if ((anInt566 >= 0) && (var2 >= 0)) {
				anIntArray569[anInt566] = ~var2;
				anInt566 = (anInt566 + 1) & 127;
				if (anInt567 == anInt566)
					anInt566 = -1;
			}
		}

		var1.consume();
	}

	@Override
	public final void keyTyped(final KeyEvent var1) {
		if (null != aClass63_573) {
			final char var2 = var1.getKeyChar();
			if ((var2 != 0) && (var2 != '\uffff')) {
				boolean var6;
				if (((var2 <= 0) || (var2 >= 128)) && ((var2 < 160) || (var2 > 255)))
					label69: {
						if (var2 != 0) {
							final char[] var3 = Class88.aCharArray672;

							for (int var4 = 0; var4 < var3.length; ++var4) {
								final char var5 = var3[var4];
								if (var2 == var5) {
									var6 = true;
									break label69;
								}
							}
						}

						var6 = false;
					}
				else
					var6 = true;

				if (var6) {
					final int var7 = (anInt564 + 1) & 127;
					if (var7 != anInt571) {
						anIntArray570[anInt564] = -1;
						aCharArray572[anInt564] = var2;
						anInt564 = var7;
					}
				}
			}
		}

		var1.consume();
	}

	@Override
	public final void focusGained(final FocusEvent var1) {
	}

	@Override
	public final synchronized void focusLost(final FocusEvent var1) {
		if (aClass63_573 != null)
			anInt566 = -1;

	}

	public static Class8 method288(final int var0, final int var1, final Component var2) {
		try {
			final Class8_Sub1 var3 = new Class8_Sub1();
			var3.method48(var0, var1, var2, 1824708337);
			return var3;
		} catch (final Throwable var5) {
			final Class8_Sub2 var4 = new Class8_Sub2();
			var4.method48(var0, var1, var2, 1751916211);
			return var4;
		}
	}

	@Override
	public final synchronized void keyPressed(final KeyEvent var1) {
		if (aClass63_573 != null) {
			anInt574 = 0;
			int var2 = var1.getKeyCode();
			if ((var2 >= 0) && (var2 < anIntArray565.length)) {
				var2 = anIntArray565[var2];
				if ((var2 & 128) != 0)
					var2 = -1;
			} else
				var2 = -1;

			if ((anInt566 >= 0) && (var2 >= 0)) {
				anIntArray569[anInt566] = var2;
				anInt566 = (anInt566 + 1) & 127;
				if (anInt566 == anInt567)
					anInt566 = -1;
			}

			int var3;
			if (var2 >= 0) {
				var3 = (1 + anInt564) & 127;
				if (anInt571 != var3) {
					anIntArray570[anInt564] = var2;
					aCharArray572[anInt564] = 0;
					anInt564 = var3;
				}
			}

			var3 = var1.getModifiers();
			if (((var3 & 10) != 0) || (var2 == 85) || (var2 == 10))
				var1.consume();
		}

	}
}
