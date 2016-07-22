public class Class15 {
	int anInt137 = 2;
	int[] anIntArray141 = new int[2];
	int[] anIntArray135 = new int[2];
	int anInt138;
	int anInt139;
	int anInt140;
	int anInt134;
	int anInt142;
	int anInt132;
	int anInt133;
	int anInt136;

	final void method74(final DataBuffer var1) {
		anInt137 = var1.method564();
		anIntArray141 = new int[anInt137];
		anIntArray135 = new int[anInt137];

		for (int var2 = 0; var2 < anInt137; ++var2) {
			anIntArray141[var2] = var1.method566();
			anIntArray135[var2] = var1.method566();
		}

	}

	final void method75() {
		anInt138 = 0;
		anInt139 = 0;
		anInt140 = 0;
		anInt134 = 0;
		anInt142 = 0;
	}

	final int method76(final int var1) {
		if (anInt142 >= anInt138) {
			anInt134 = anIntArray135[anInt139++] << 15;
			if (anInt139 >= anInt137)
				anInt139 = anInt137 - 1;

			anInt138 = (int) ((anIntArray141[anInt139] / 65536.0D) * var1);
			if (anInt138 > anInt142)
				anInt140 = ((anIntArray135[anInt139] << 15) - anInt134) / (anInt138 - anInt142);
		}

		anInt134 += anInt140;
		++anInt142;
		return (anInt134 - anInt140) >> 15;
	}

	final void method77(final DataBuffer var1) {
		anInt132 = var1.method564();
		anInt133 = var1.method568();
		anInt136 = var1.method568();
		method74(var1);
	}

	Class15() {
		anIntArray141[0] = 0;
		anIntArray141[1] = '\uffff';
		anIntArray135[0] = 0;
		anIntArray135[1] = '\uffff';
	}
}
