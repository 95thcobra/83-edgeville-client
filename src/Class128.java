import java.util.Iterator;

public class Class128 implements Iterable {
	Class109 aClass109_863 = new Class109();

	@Override
	public Iterator iterator() {
		return new Class124(this);
	}

	public Class109 method460() {
		return method461((Class109) null);
	}

	Class109 method461(final Class109 var1) {
		Class109 var2;
		if (var1 == null)
			var2 = aClass109_863.aClass109_803;
		else
			var2 = var1;

		return var2 == aClass109_863 ? null : var2;
	}

	public Class128() {
		aClass109_863.aClass109_803 = aClass109_863;
		aClass109_863.aClass109_804 = aClass109_863;
	}

	public void method462(final Class109 var1) {
		if (var1.aClass109_804 != null)
			var1.method413();

		var1.aClass109_804 = aClass109_863.aClass109_804;
		var1.aClass109_803 = aClass109_863;
		var1.aClass109_804.aClass109_803 = var1;
		var1.aClass109_803.aClass109_804 = var1;
	}
}
