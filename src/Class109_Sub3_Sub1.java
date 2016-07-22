public class Class109_Sub3_Sub1 extends Class109_Sub3 {
	public int anInt1549;
	public byte[] aByteArray1550;
	public int anInt1548;
	int anInt1547;
	public boolean aBool1551;

	Class109_Sub3_Sub1(final int var1, final byte[] var2, final int var3, final int var4, final boolean var5) {
		anInt1549 = var1;
		aByteArray1550 = var2;
		anInt1548 = var3;
		anInt1547 = var4;
		aBool1551 = var5;
	}

	Class109_Sub3_Sub1(final int var1, final byte[] var2, final int var3, final int var4) {
		anInt1549 = var1;
		aByteArray1550 = var2;
		anInt1548 = var3;
		anInt1547 = var4;
	}

	public Class109_Sub3_Sub1 method768(final Class7 var1) {
		aByteArray1550 = var1.method42(aByteArray1550);
		anInt1549 = var1.method43(anInt1549);
		if (anInt1548 == anInt1547)
			anInt1548 = anInt1547 = var1.method44(anInt1548, 1188203183);
		else {
			anInt1548 = var1.method44(anInt1548, 126004931);
			anInt1547 = var1.method44(anInt1547, 2146591462);
			if (anInt1548 == anInt1547)
				--anInt1548;
		}

		return this;
	}
}
