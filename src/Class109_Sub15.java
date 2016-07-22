public class Class109_Sub15 extends Class109 {
	int anInt1061;
	int anInt1062;
	int anInt1067;
	int anInt1071;
	int anInt1076;
	int anInt1077;
	String aString1072;
	String aString1073;
	String aString1074;
	String aString1075;
	int[] anIntArray1080 = new int[3];
	int anInt1060;
	boolean aBool1066;
	int anInt1064;
	int anInt1065;
	int anInt1058;
	int anInt1059;
	int anInt1078;
	boolean aBool1063;
	int anInt1068;
	int anInt1069;
	int anInt1070;
	String aString1081;
	String aString1079;

	void method620() {
		if (aString1072.length() > 40)
			aString1072 = aString1072.substring(0, 40);

		if (aString1073.length() > 40)
			aString1073 = aString1073.substring(0, 40);

		if (aString1074.length() > 10)
			aString1074 = aString1074.substring(0, 10);

		if (aString1075.length() > 10)
			aString1075 = aString1075.substring(0, 10);

	}

	public int method621() {
		final byte var1 = 38;
		int var2 = var1 + Class24.method104(aString1072);
		var2 += Class24.method104(aString1073);
		var2 += Class24.method104(aString1074);
		var2 += Class24.method104(aString1075);
		var2 += Class24.method104(aString1081);
		var2 += Class24.method104(aString1079);
		return var2;
	}

	public Class109_Sub15(final boolean var1) {
		if (Class77.aString621.startsWith("win"))
			anInt1060 = 1;
		else if (Class77.aString621.startsWith("mac"))
			anInt1060 = 2;
		else if (Class77.aString621.startsWith("linux"))
			anInt1060 = 3;
		else
			anInt1060 = 4;

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (final Exception var13) {
			var2 = "";
		}

		String var4;
		try {
			var4 = System.getProperty("os.version").toLowerCase();
		} catch (final Exception var12) {
			var4 = "";
		}

		String var3 = "Unknown";
		String var5 = "1.1";

		try {
			var3 = System.getProperty("java.vendor");
			var5 = System.getProperty("java.version");
		} catch (final Exception var11) {
			;
		}

		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64"))
			aBool1066 = false;
		else
			aBool1066 = true;

		if (anInt1060 == 1) {
			if (var4.indexOf("4.0") != -1)
				anInt1064 = 1;
			else if (var4.indexOf("4.1") != -1)
				anInt1064 = 2;
			else if (var4.indexOf("4.9") != -1)
				anInt1064 = 3;
			else if (var4.indexOf("5.0") != -1)
				anInt1064 = 4;
			else if (var4.indexOf("5.1") != -1)
				anInt1064 = 5;
			else if (var4.indexOf("5.2") != -1)
				anInt1064 = 8;
			else if (var4.indexOf("6.0") != -1)
				anInt1064 = 6;
			else if (var4.indexOf("6.1") != -1)
				anInt1064 = 7;
			else if (var4.indexOf("6.2") != -1)
				anInt1064 = 9;
			else if (var4.indexOf("6.3") != -1)
				anInt1064 = 10;
		} else if (anInt1060 == 2)
			if (var4.indexOf("10.4") != -1)
				anInt1064 = 20;
			else if (var4.indexOf("10.5") != -1)
				anInt1064 = 21;
			else if (var4.indexOf("10.6") != -1)
				anInt1064 = 22;
			else if (var4.indexOf("10.7") != -1)
				anInt1064 = 23;
			else if (var4.indexOf("10.8") != -1)
				anInt1064 = 24;
			else if (var4.indexOf("10.9") != -1)
				anInt1064 = 25;
			else if (var4.indexOf("10.10") != -1)
				anInt1064 = 26;

		if (var3.toLowerCase().indexOf("sun") != -1)
			anInt1065 = 1;
		else if (var3.toLowerCase().indexOf("microsoft") != -1)
			anInt1065 = 2;
		else if (var3.toLowerCase().indexOf("apple") != -1)
			anInt1065 = 3;
		else if (var3.toLowerCase().indexOf("oracle") != -1)
			anInt1065 = 5;
		else
			anInt1065 = 4;

		int var7 = 2;
		int var8 = 0;

		char var9;
		try {
			while (var7 < var5.length()) {
				var9 = var5.charAt(var7);
				if ((var9 < 48) || (var9 > 57))
					break;

				var8 = (var9 - 48) + (var8 * 10);
				++var7;
			}
		} catch (final Exception var16) {
			;
		}

		anInt1058 = var8;
		var7 = var5.indexOf(46, 2) + 1;
		var8 = 0;

		try {
			while (var7 < var5.length()) {
				var9 = var5.charAt(var7);
				if ((var9 < 48) || (var9 > 57))
					break;

				var8 = (10 * var8) + (var9 - 48);
				++var7;
			}
		} catch (final Exception var15) {
			;
		}

		anInt1059 = var8;
		var7 = var5.indexOf(95, 4) + 1;
		var8 = 0;

		try {
			while (var7 < var5.length()) {
				var9 = var5.charAt(var7);
				if ((var9 < 48) || (var9 > 57))
					break;

				var8 = (var8 * 10) + (var9 - 48);
				++var7;
			}
		} catch (final Exception var14) {
			;
		}

		anInt1078 = var8;
		aBool1063 = false;
		anInt1068 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		if (anInt1058 > 3)
			anInt1069 = Runtime.getRuntime().availableProcessors();
		else
			anInt1069 = 0;

		anInt1070 = 0;
		if (null == aString1072)
			aString1072 = "";

		if (null == aString1073)
			aString1073 = "";

		if (aString1074 == null)
			aString1074 = "";

		if (null == aString1075)
			aString1075 = "";

		if (null == aString1081)
			aString1081 = "";

		if (aString1079 == null)
			aString1079 = "";

		method620();
	}

	public void writeToBuffer(final DataBuffer var1) {
		var1.writeByte(6);
		var1.writeByte(anInt1060);
		var1.writeByte(aBool1066 ? 1 : 0);
		var1.writeByte(anInt1064);
		var1.writeByte(anInt1065);
		var1.writeByte(anInt1058);
		var1.writeByte(anInt1059);
		var1.writeByte(anInt1078);
		var1.writeByte(aBool1063 ? 1 : 0);
		var1.writeShort(anInt1068);
		var1.writeByte(anInt1069);
		var1.writeTriByte(anInt1070);
		var1.writeShort(anInt1071);
		var1.method558(aString1072);
		var1.method558(aString1073);
		var1.method558(aString1074);
		var1.method558(aString1075);
		var1.writeByte(anInt1062);
		var1.writeShort(anInt1076);
		var1.method558(aString1081);
		var1.method558(aString1079);
		var1.writeByte(anInt1077);
		var1.writeByte(anInt1061);

		for (final int element : anIntArray1080)
			var1.writeInt(element);

		var1.writeInt(anInt1067);
	}

	public static int method623(final int var0, final int var1, int var2) {
		var2 &= 3;
		return var2 == 0 ? var0 : (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 : 7 - var1));
	}

	public static byte method624(final char var0) {
		byte var1;
		if (((var0 <= 0) || (var0 >= 128)) && ((var0 < 160) || (var0 > 255))) {
			if (var0 == 8364)
				var1 = -128;
			else if (var0 == 8218)
				var1 = -126;
			else if (var0 == 402)
				var1 = -125;
			else if (var0 == 8222)
				var1 = -124;
			else if (var0 == 8230)
				var1 = -123;
			else if (var0 == 8224)
				var1 = -122;
			else if (var0 == 8225)
				var1 = -121;
			else if (var0 == 710)
				var1 = -120;
			else if (var0 == 8240)
				var1 = -119;
			else if (var0 == 352)
				var1 = -118;
			else if (var0 == 8249)
				var1 = -117;
			else if (var0 == 338)
				var1 = -116;
			else if (var0 == 381)
				var1 = -114;
			else if (var0 == 8216)
				var1 = -111;
			else if (var0 == 8217)
				var1 = -110;
			else if (var0 == 8220)
				var1 = -109;
			else if (var0 == 8221)
				var1 = -108;
			else if (var0 == 8226)
				var1 = -107;
			else if (var0 == 8211)
				var1 = -106;
			else if (var0 == 8212)
				var1 = -105;
			else if (var0 == 732)
				var1 = -104;
			else if (var0 == 8482)
				var1 = -103;
			else if (var0 == 353)
				var1 = -102;
			else if (var0 == 8250)
				var1 = -101;
			else if (var0 == 339)
				var1 = -100;
			else if (var0 == 382)
				var1 = -98;
			else if (var0 == 376)
				var1 = -97;
			else
				var1 = 63;
		} else
			var1 = (byte) var0;

		return var1;
	}
}
