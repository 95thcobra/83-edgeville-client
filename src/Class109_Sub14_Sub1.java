import java.awt.Component;

public final class Class109_Sub14_Sub1 extends DataBuffer {
	IsaacCipher isaacCipher;
	static int[] anIntArray1591 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383,
			32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863,
			134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	int anInt1592;

	public void method840(final int var1) {
		data[++position - 1] = (byte) (var1 + isaacCipher.method279());
	}

	public void method841(final int[] var1) {
		isaacCipher = new IsaacCipher(var1);
	}

	public int method842() {
		return (data[++position - 1] - isaacCipher.method279()) & 255;
	}

	public void method843() {
		anInt1592 = position * 8;
	}

	public int method844(int var1) {
		int var2 = anInt1592 >> 3;
		int var4 = 8 - (anInt1592 & 7);
		int var3 = 0;

		for (anInt1592 += var1; var1 > var4; var4 = 8) {
			var3 += (data[var2++] & anIntArray1591[var4]) << (var1 - var4);
			var1 -= var4;
		}

		if (var1 == var4)
			var3 += data[var2] & anIntArray1591[var4];
		else
			var3 += (data[var2] >> (var4 - var1)) & anIntArray1591[var1];

		return var3;
	}

	public void method845() {
		position = (anInt1592 + 7) / 8;
	}

	public int method846(final int var1) {
		return (8 * var1) - anInt1592;
	}

	public Class109_Sub14_Sub1(final int var1) {
		super(var1);
	}

	public static void method847(final Component var0) {
		var0.removeMouseListener(Class81.aClass81_644);
		var0.removeMouseMotionListener(Class81.aClass81_644);
		var0.removeFocusListener(Class81.aClass81_644);
		Class81.anInt633 = 0;
	}
}
