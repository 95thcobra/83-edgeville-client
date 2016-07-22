public class Class103 {
	int anInt773;
	int anInt771;
	int[] anIntArray767;
	long aLong772;
	int[] anIntArray768;
	int[] anIntArray769;
	int[] anIntArray770;
	DataBuffer aClass109_Sub14_766 = new DataBuffer((byte[]) null);
	static byte[] aByteArray774 = new byte[] { (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0,
			(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
			(byte) 0 };

	int method370() {
		return anIntArray768.length;
	}

	void method371(final byte[] var1) {
		aClass109_Sub14_766.data = var1;
		aClass109_Sub14_766.position = 10;
		final int var3 = aClass109_Sub14_766.readShort();
		anInt773 = aClass109_Sub14_766.readShort();
		anInt771 = 500000;
		anIntArray767 = new int[var3];

		int var2;
		int var5;
		for (var2 = 0; var2 < var3; aClass109_Sub14_766.position += var5) {
			final int var4 = aClass109_Sub14_766.readInt();
			var5 = aClass109_Sub14_766.readInt();
			if (var4 == 1297379947) {
				anIntArray767[var2] = aClass109_Sub14_766.position;
				++var2;
			}
		}

		aLong772 = 0L;
		anIntArray768 = new int[var3];

		for (var2 = 0; var2 < var3; ++var2)
			anIntArray768[var2] = anIntArray767[var2];

		anIntArray769 = new int[var3];
		anIntArray770 = new int[var3];
	}

	void method372() {
		aClass109_Sub14_766.data = null;
		anIntArray767 = null;
		anIntArray768 = null;
		anIntArray769 = null;
		anIntArray770 = null;
	}

	void method373() {
		aClass109_Sub14_766.position = -1;
	}

	void method374(final int var1) {
		aClass109_Sub14_766.position = anIntArray768[var1];
	}

	Class103() {
	}

	int method375(final int var1) {
		final int var2 = method382(var1);
		return var2;
	}

	void method376(final int var1) {
		final int var2 = aClass109_Sub14_766.method615();
		anIntArray769[var1] += var2;
	}

	int method377(final int var1, final int var2) {
		int var4;
		if (var2 == 255) {
			final int var7 = aClass109_Sub14_766.method564();
			var4 = aClass109_Sub14_766.method615();
			if (var7 == 47) {
				aClass109_Sub14_766.position += var4;
				return 1;
			} else if (var7 == 81) {
				final int var5 = aClass109_Sub14_766.method567();
				var4 -= 3;
				final int var6 = anIntArray769[var1];
				aLong772 += (long) var6 * (long) (anInt771 - var5);
				anInt771 = var5;
				aClass109_Sub14_766.position += var4;
				return 2;
			} else {
				aClass109_Sub14_766.position += var4;
				return 3;
			}
		} else {
			final byte var3 = aByteArray774[var2 - 128];
			var4 = var2;
			if (var3 >= 1)
				var4 = var2 | (aClass109_Sub14_766.method564() << 8);

			if (var3 >= 2)
				var4 |= aClass109_Sub14_766.method564() << 16;

			return var4;
		}
	}

	long method378(final int var1) {
		return aLong772 + ((long) var1 * (long) anInt771);
	}

	int method379() {
		final int var1 = anIntArray768.length;
		int var4 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var2 = 0; var2 < var1; ++var2)
			if ((anIntArray768[var2] >= 0) && (anIntArray769[var2] < var3)) {
				var4 = var2;
				var3 = anIntArray769[var2];
			}

		return var4;
	}

	boolean method380() {
		final int var1 = anIntArray768.length;

		for (int var2 = 0; var2 < var1; ++var2)
			if (anIntArray768[var2] >= 0)
				return false;

		return true;
	}

	void method381(final long var1) {
		aLong772 = var1;
		final int var4 = anIntArray768.length;

		for (int var3 = 0; var3 < var4; ++var3) {
			anIntArray769[var3] = 0;
			anIntArray770[var3] = 0;
			aClass109_Sub14_766.position = anIntArray767[var3];
			method376(var3);
			anIntArray768[var3] = aClass109_Sub14_766.position;
		}

	}

	int method382(final int var1) {
		final byte var2 = aClass109_Sub14_766.data[aClass109_Sub14_766.position];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			anIntArray770[var1] = var5;
			++aClass109_Sub14_766.position;
		} else
			var5 = anIntArray770[var1];

		if ((var5 != 240) && (var5 != 247))
			return method377(var1, var5);
		else {
			final int var4 = aClass109_Sub14_766.method615();
			if ((var5 == 247) && (var4 > 0)) {
				final int var3 = aClass109_Sub14_766.data[aClass109_Sub14_766.position] & 255;
				if (((var3 >= 241) && (var3 <= 243)) || (var3 == 246) || (var3 == 248)
						|| ((var3 >= 250) && (var3 <= 252)) || (var3 == 254)) {
					++aClass109_Sub14_766.position;
					anIntArray770[var1] = var3;
					return method377(var1, var3);
				}
			}

			aClass109_Sub14_766.position += var4;
			return 0;
		}
	}

	boolean method383() {
		return aClass109_Sub14_766.data != null;
	}

	void method384(final int var1) {
		anIntArray768[var1] = aClass109_Sub14_766.position;
	}

	Class103(final byte[] var1) {
		method371(var1);
	}
}
