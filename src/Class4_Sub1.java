import java.awt.Component;

public class Class4_Sub1 extends Class4 {
	static Interface2 anInterface2_901;
	int anInt900;

	@Override
	void method35(final Component var1) throws Exception {
		anInterface2_901.method3(var1, Class122.anInt848, Class31.aBool308);
	}

	@Override
	void method27(final int var1) throws Exception {
		if (var1 > '\u8000')
			throw new IllegalArgumentException();
		else {
			anInterface2_901.method1();
		}
	}

	@Override
	int method28() {
		return anInterface2_901.method5();
	}

	@Override
	void method30() {
		anInterface2_901.method4();
	}

	Class4_Sub1(final Class71 var1, final int var2) {
		anInterface2_901 = var1.method318();
		anInt900 = var2;
	}

	@Override
	void method22() {
		anInterface2_901.method6();
	}

	@Override
	void method31() {
		anInterface2_901.method2(anInt900, anIntArray31);
	}
}
