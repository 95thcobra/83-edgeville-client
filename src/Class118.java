import java.util.Iterator;

public class Class118 implements Iterator {
	Class109_Sub21 aClass109_Sub21_836;
	Class109_Sub21 aClass109_Sub21_838 = null;
	Class121 aClass121_837;

	@Override
	public Object next() {
		Class109_Sub21 var1 = aClass109_Sub21_836;
		if (var1 == aClass121_837.aClass109_Sub21_846) {
			var1 = null;
			aClass109_Sub21_836 = null;
		} else
			aClass109_Sub21_836 = var1.aClass109_Sub21_1279;

		aClass109_Sub21_838 = var1;
		return var1;
	}

	@Override
	public boolean hasNext() {
		return aClass109_Sub21_836 != aClass121_837.aClass109_Sub21_846;
	}

	@Override
	public void remove() {
		if (aClass109_Sub21_838 == null)
			throw new IllegalStateException();
		else {
			aClass109_Sub21_838.method658();
			aClass109_Sub21_838 = null;
		}
	}

	Class118(final Class121 var1) {
		aClass121_837 = var1;
		aClass109_Sub21_836 = aClass121_837.aClass109_Sub21_846.aClass109_Sub21_1279;
		aClass109_Sub21_838 = null;
	}
}
