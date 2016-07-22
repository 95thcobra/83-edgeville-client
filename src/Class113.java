public class Class113 {
	protected static boolean aBool816;
	static int anInt822;
	public int anInt820;
	String aString811;
	public static Class113 aClass113_813 = new Class113(6, 0, "", "");
	static Class113 aClass113_812 = new Class113(1, 1, "", "");
	static Class113 aClass113_819 = new Class113(4, 2, "", "");
	static Class113 aClass113_814 = new Class113(7, 3, "", "");
	static Class113 aClass113_815 = new Class113(8, 4, "", "");
	static Class113 aClass113_821 = new Class113(3, 5, "", "");
	static Class113 aClass113_817 = new Class113(0, 6, "", "");
	static Class113 aClass113_823 = new Class113(2, 7, "", "");
	public static Class113 aClass113_818;

	Class113(final int var1, final int var2, final String var3, final String var4) {
		anInt820 = var1;
		aString811 = var4;
	}

	Class113(final int var1, final int var2, final String var3, final String var4, final boolean var5,
			final Class113[] var6) {
		anInt820 = var1;
		aString811 = var4;
	}

	@Override
	public String toString() {
		return aString811;
	}

	static {
		aClass113_818 = new Class113(5, -1, "", "", true,
				new Class113[] { aClass113_813, aClass113_812, aClass113_819, aClass113_815, aClass113_814 });
	}
}
