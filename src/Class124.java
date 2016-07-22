import java.util.Iterator;

public class Class124 implements Iterator {
	Class109 aClass109_853 = null;
	Class128 aClass128_852;
	Class109 aClass109_851;

	Class124(final Class128 var1) {
		aClass128_852 = var1;
		aClass109_851 = aClass128_852.aClass109_863.aClass109_803;
		aClass109_853 = null;
	}

	@Override
	public Object next() {
		Class109 var1 = aClass109_851;
		if (var1 == aClass128_852.aClass109_863) {
			var1 = null;
			aClass109_851 = null;
		} else
			aClass109_851 = var1.aClass109_803;

		aClass109_853 = var1;
		return var1;
	}

	@Override
	public boolean hasNext() {
		return aClass109_851 != aClass128_852.aClass109_863;
	}

	@Override
	public void remove() {
		if (aClass109_853 == null)
			throw new IllegalStateException();
		else {
			aClass109_853.method413();
			aClass109_853 = null;
		}
	}
}
