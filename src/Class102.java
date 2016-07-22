import java.util.zip.CRC32;

public class Class102 {
	public static long aLong745;
	public static DataBuffer aClass109_Sub14_747;
	static boolean aBool755;
	static Class4 aClass4_757;
	static DataBuffer aClass109_Sub14_763;
	public static int anInt746 = 0;
	public static Class116 aClass116_758 = new Class116(4096);
	public static int anInt765 = 0;
	public static Class116 aClass116_748 = new Class116(32);
	public static int anInt760 = 0;
	public static Class111 aClass111_750 = new Class111();
	public static Class116 aClass116_751 = new Class116(4096);
	public static int anInt761 = 0;
	public static Class116 aClass116_753 = new Class116(4096);
	public static int anInt754 = 0;
	public static DataBuffer aClass109_Sub14_756 = new DataBuffer(8);
	public static int anInt752 = 0;
	static CRC32 aCRC32_759 = new CRC32();
	static Class104_Sub1[] aClass104_Sub1Array749 = new Class104_Sub1[256];
	public static byte aByte762 = 0;
	public static int anInt744 = 0;
	public static int anInt764 = 0;

	static final void method369(final String var0) {
		if (null != Class53.aClass109_Sub7Array532) {
			client.secureBuffer.method840(204);
			client.secureBuffer.writeByte(Class32.method140(var0));
			client.secureBuffer.writeString(var0);
		}
	}
}
