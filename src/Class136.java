import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class136 {
	public List aList887;
	public static Comparator aComparator891 = new Class131();
	public static Comparator aComparator889;
	public static Comparator aComparator890;
	public static Comparator aComparator888;

	public void method482(final Comparator var1, final boolean var2) {
		if (var2)
			Collections.sort(aList887, var1);
		else
			Collections.sort(aList887, Collections.reverseOrder(var1));

	}

	public Class136(final DataBuffer var1, final boolean var2) {
		final int var4 = var1.method566();
		final boolean var7 = var1.method564() == 1;
		byte var3;
		if (var7)
			var3 = 1;
		else
			var3 = 0;

		final int var6 = var1.method566();
		aList887 = new ArrayList(var6);

		for (int var5 = 0; var5 < var6; ++var5)
			aList887.add(new Class114(var1, var3, var4));

	}

	static {
		new Class129();
		aComparator889 = new Class115();
		aComparator890 = new Class112();
		aComparator888 = new Class122();
	}
}
