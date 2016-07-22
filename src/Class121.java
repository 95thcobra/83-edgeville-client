import java.util.Iterator;

public class Class121 implements Iterable {
	public Class109_Sub21 aClass109_Sub21_846 = new Class109_Sub21();

	public void method442(final Class109_Sub21 var1) {
		if (var1.aClass109_Sub21_1280 != null)
			var1.method658();

		var1.aClass109_Sub21_1280 = aClass109_Sub21_846.aClass109_Sub21_1280;
		var1.aClass109_Sub21_1279 = aClass109_Sub21_846;
		var1.aClass109_Sub21_1280.aClass109_Sub21_1279 = var1;
		var1.aClass109_Sub21_1279.aClass109_Sub21_1280 = var1;
	}

	public void method443() {
		while (aClass109_Sub21_846.aClass109_Sub21_1279 != aClass109_Sub21_846)
			aClass109_Sub21_846.aClass109_Sub21_1279.method658();

	}

	@Override
	public Iterator iterator() {
		return new Class118(this);
	}

	public Class121() {
		aClass109_Sub21_846.aClass109_Sub21_1279 = aClass109_Sub21_846;
		aClass109_Sub21_846.aClass109_Sub21_1280 = aClass109_Sub21_846;
	}
}
