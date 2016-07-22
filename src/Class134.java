public class Class134 {
	byte aByte881;
	public int anInt885;
	public int anInt882;
	public int anInt880;
	public int anInt884;
	public int anInt883;

	public Class134(final DataBuffer var1, final boolean var2) {
		aByte881 = var1.method612();
		anInt885 = var1.readShort();
		anInt882 = var1.readInt();
		anInt880 = var1.readInt();
		anInt884 = var1.readInt();
		anInt883 = var1.readInt();
	}

	void method478(final int var1) {
		aByte881 &= -8;
		aByte881 = (byte) (aByte881 | (var1 & 7));
	}

	void method479(final int var1) {
		aByte881 &= -9;
		if (var1 == 1)
			aByte881 = (byte) (aByte881 | 8);

	}

	public int method480() {
		return (aByte881 & 8) == 8 ? 1 : 0;
	}

	public Class134() {
	}

	public int method481() {
		return aByte881 & 7;
	}
}
