import java.util.Iterator;

public class Class127 implements Iterator {
	Class109 aClass109_862;
	int anInt861;
	Class109 aClass109_860 = null;
	Class125 aClass125_859;

	void method459() {
		aClass109_862 = aClass125_859.aClass109Array855[0].aClass109_803;
		anInt861 = 1;
		aClass109_860 = null;
	}

	Class127(final Class125 var1) {
		aClass125_859 = var1;
		method459();
	}

	@Override
	public boolean hasNext() {
		if (aClass109_862 != aClass125_859.aClass109Array855[anInt861 - 1])
			return true;
		else {
			while (anInt861 < aClass125_859.anInt856) {
				if (aClass125_859.aClass109Array855[anInt861++].aClass109_803 != aClass125_859.aClass109Array855[anInt861
						- 1]) {
					aClass109_862 = aClass125_859.aClass109Array855[anInt861 - 1].aClass109_803;
					return true;
				}

				aClass109_862 = aClass125_859.aClass109Array855[anInt861 - 1];
			}

			return false;
		}
	}

	@Override
	public void remove() {
		if (aClass109_860 == null)
			throw new IllegalStateException();
		else {
			aClass109_860.method413();
			aClass109_860 = null;
		}
	}

	@Override
	public Object next() {
		Class109 var1;
		if (aClass109_862 != aClass125_859.aClass109Array855[anInt861 - 1]) {
			var1 = aClass109_862;
			aClass109_862 = var1.aClass109_803;
			aClass109_860 = var1;
			return var1;
		} else {
			do {
				if (anInt861 >= aClass125_859.anInt856)
					return null;

				var1 = aClass125_859.aClass109Array855[anInt861++].aClass109_803;
			} while (var1 == aClass125_859.aClass109Array855[anInt861 - 1]);

			aClass109_862 = var1.aClass109_803;
			aClass109_860 = var1;
			return var1;
		}
	}
}
