import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

import netscape.javascript.JSObject;

public final class LoginEncoder {
	int anInt515;
	int anInt517;
	int anInt518;
	public Class109_Sub21_Sub15 aClass109_Sub21_Sub15_519;
	int anInt520;
	int anInt521;
	public Class109_Sub21_Sub15 aClass109_Sub21_Sub15_523;
	public static int anInt524;
	static int anInt525;
	public int anInt516 = 0;
	int anInt522 = 0;

	static final void method253() {
		try {
			if (client.loginStage == 0) {
				if (null != Class48.aClass82_506) {
					Class48.aClass82_506.method338();
					Class48.aClass82_506 = null;
				}

				Class109_Sub13.aClass86_1049 = null;
				client.aBool2020 = false;
				client.anInt2177 = 0;
				client.loginStage = 1;
			}

			if (client.loginStage == 1) {
				if (Class109_Sub13.aClass86_1049 == null)
					Class109_Sub13.aClass86_1049 = Class109_Sub21_Sub11.aClass71_1495.method313(Class109_Sub9.aString998, Class33.anInt323);

				if (Class109_Sub13.aClass86_1049.anInt664 == 2)
					throw new IOException();

				if (Class109_Sub13.aClass86_1049.anInt664 == 1) {
					Class48.aClass82_506 = new Class82((Socket) Class109_Sub13.aClass86_1049.anObject662, Class109_Sub21_Sub11.aClass71_1495);
					Class109_Sub13.aClass86_1049 = null;
					client.loginStage = 2;
				}
			}

			if (client.loginStage == 2) {
				client.secureBuffer.position = 0;
				client.secureBuffer.writeByte(14);
				Class48.aClass82_506.method342(client.secureBuffer.data, 0, 1);
				client.aClass109_Sub14_Sub1_2211.position = 0;
				client.loginStage = 3;
			}

			int var0;
			if (client.loginStage == 3) {
				if (Class102.aClass4_757 != null)
					Class102.aClass4_757.method29();

				if (Class54.aClass4_535 != null)
					Class54.aClass4_535.method29();

				var0 = Class48.aClass82_506.method339();
				if (null != Class102.aClass4_757)
					Class102.aClass4_757.method29();

				if (null != Class54.aClass4_535)
					Class54.aClass4_535.method29();

				if (var0 != 0) {
					Class33.method144(var0);
					return;
				}

				client.aClass109_Sub14_Sub1_2211.position = 0;
				client.loginStage = 5;
			}

			int var2;
			int var3;
			if (client.loginStage == 5) {
				final int[] isaacSeed = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				client.secureBuffer.position = 0;
				client.secureBuffer.writeByte(1);
				client.secureBuffer.writeByte(Class5.aClass92_69.method11(1420979718));
				client.secureBuffer.writeInt(isaacSeed[0]);
				client.secureBuffer.writeInt(isaacSeed[1]);
				client.secureBuffer.writeInt(isaacSeed[2]);
				client.secureBuffer.writeInt(isaacSeed[3]);
				switch (Class5.aClass92_69.anInt692) {
				case 0:
				case 2:
					client.secureBuffer.writeTriByte(Class109_Sub21_Sub6.anInt1389);
					client.secureBuffer.position += 5;
					break;
				case 1:
					client.secureBuffer.writeInt(((Integer) Class50.aClass21_513.aLinkedHashMap199.get(Integer.valueOf(Class44.method226(Class5.aString67)))).intValue());
					client.secureBuffer.position += 4;
					break;
				case 3:
					client.secureBuffer.position += 8;
				}

				client.secureBuffer.writeString(Class5.aString68);
				client.secureBuffer.doRsa(Class25.aBigInteger223, Class25.aBigInteger225);

				client.loginBuffer.position = 0;
				if (client.anInt2180 == 40)
					client.loginBuffer.writeByte(18);
				else
					client.loginBuffer.writeByte(16);

				client.loginBuffer.writeShort(0);
				var2 = client.loginBuffer.position;
				
				client.loginBuffer.writeInt(83);
				client.loginBuffer.writeBytes(client.secureBuffer.data, 0, client.secureBuffer.position);
				
				var3 = client.loginBuffer.position;
				client.loginBuffer.writeString(Class5.aString67);
				client.loginBuffer.writeByte(((client.aBool2184 ? 1 : 0) << 1) | (client.aBool2065 ? 1 : 0));
				client.loginBuffer.writeShort(anInt524);
				client.loginBuffer.writeShort(Class109_Sub21_Sub15_Sub5.anInt1815);
				Class8_Sub2.writeRandomDat(client.loginBuffer);
				client.loginBuffer.writeString(Class41.aString371);
				client.loginBuffer.writeInt(Class53.anInt533);
				
				final DataBuffer machineInfo = new DataBuffer(Class109_Sub21_Sub2.myMachine.method621());
				Class109_Sub21_Sub2.myMachine.writeToBuffer(machineInfo);
				client.loginBuffer.writeBytes(machineInfo.data, 0, machineInfo.data.length);
				
				client.loginBuffer.writeByte(Class109_Sub21_Sub2.anInt1303);
				client.loginBuffer.writeInt(Class44.aClass104_Sub1_456.anInt786);
				client.loginBuffer.writeInt(Class65.aClass104_Sub1_576.anInt786);
				client.loginBuffer.writeInt(Class109_Sub21_Sub15_Sub6.aClass104_Sub1_1847.anInt786);
				client.loginBuffer.writeInt(Class34.aClass104_Sub1_326.anInt786);
				client.loginBuffer.writeInt(Class70.aClass104_Sub1_594.anInt786);
				client.loginBuffer.writeInt(Class109_Sub12.aClass104_Sub1_1042.anInt786);
				client.loginBuffer.writeInt(Class46.aClass104_Sub1_486.anInt786);
				client.loginBuffer.writeInt(Class109_Sub16.aClass104_Sub1_1097.anInt786);
				client.loginBuffer.writeInt(Class28.aClass104_Sub1_265.anInt786);
				client.loginBuffer.writeInt(Class109_Sub21_Sub9.aClass104_Sub1_1418.anInt786);
				client.loginBuffer.writeInt(Class39.aClass104_Sub1_369.anInt786);
				client.loginBuffer.writeInt(Class123.aClass104_Sub1_850.anInt786);
				client.loginBuffer.writeInt(Class115.aClass104_Sub1_829.anInt786);
				client.loginBuffer.writeInt(Class109_Sub21_Sub15_Sub5.aClass104_Sub1_1812.anInt786);
				client.loginBuffer.writeInt(Class27.aClass104_Sub1_255.anInt786);
				client.loginBuffer.writeInt(Class1.aClass104_Sub1_1.anInt786);
				
				client.loginBuffer.method578(isaacSeed, var3, client.loginBuffer.position);
				
				client.loginBuffer.method605(client.loginBuffer.position - var2);
				Class48.aClass82_506.method342(client.loginBuffer.data, 0, client.loginBuffer.position);
				client.secureBuffer.method841(isaacSeed);

				for (int var5 = 0; var5 < 4; ++var5)
					isaacSeed[var5] += 50;

				client.aClass109_Sub14_Sub1_2211.method841(isaacSeed);
				client.loginStage = 6;
			}

			if ((client.loginStage == 6) && (Class48.aClass82_506.method340() > 0)) {
				var0 = Class48.aClass82_506.method339();
				if ((var0 == 21) && (client.anInt2180 == 20))
					client.loginStage = 7;
				else if (var0 == 2)
					client.loginStage = 9;
				else {
					if ((var0 == 15) && (client.anInt2180 == 40)) {
						client.secureBuffer.position = 0;
						client.aClass109_Sub14_Sub1_2211.position = 0;
						client.anInt2013 = -1;
						client.anInt2153 = 1;
						client.anInt2018 = -1;
						client.anInt2019 = -1;
						client.anInt2012 = 0;
						client.anInt2014 = 0;
						client.anInt1987 = 0;
						client.anInt2045 = 0;
						client.aBool2109 = false;
						client.anInt2206 = 0;
						client.anInt2204 = 0;

						for (var2 = 0; var2 < client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086.length; ++var2)
							if (client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var2] != null)
								client.aClass109_Sub21_Sub15_Sub3_Sub2Array2086[var2].anInt1677 = -1;

						for (var2 = 0; var2 < client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006.length; ++var2)
							if (client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var2] != null)
								client.aClass109_Sub21_Sub15_Sub3_Sub1Array2006[var2].anInt1677 = -1;

						Class66.method292();
						Class82.method343(30);

						for (var2 = 0; var2 < 100; ++var2)
							client.aBoolArray2116[var2] = true;

						Class21.method100();
						return;
					}

					if ((var0 != 23) || (client.anInt2004 >= 1)) {
						Class33.method144(var0);
						return;
					}

					++client.anInt2004;
					client.loginStage = 0;
				}
			}

			if ((client.loginStage == 7) && (Class48.aClass82_506.method340() > 0)) {
				client.anInt2005 = (Class48.aClass82_506.method339() + 3) * 60;
				client.loginStage = 8;
			}

			if (client.loginStage == 8) {
				client.anInt2177 = 0;
				Class99.method368("You have only just left another world.", "Your profile will be transferred in:", (client.anInt2005 / 60) + " seconds.");
				if (--client.anInt2005 <= 0)
					client.loginStage = 0;

			} else {
				if ((client.loginStage == 9) && (Class48.aClass82_506.method340() >= 13)) {
					final boolean var10 = Class48.aClass82_506.method339() == 1;
					Class48.aClass82_506.method341(client.aClass109_Sub14_Sub1_2211.data, 0, 4);
					client.aClass109_Sub14_Sub1_2211.position = 0;
					if (var10) {
						var2 = client.aClass109_Sub14_Sub1_2211.method842() << 24;
						var2 |= client.aClass109_Sub14_Sub1_2211.method842() << 16;
						var2 |= client.aClass109_Sub14_Sub1_2211.method842() << 8;
						var2 |= client.aClass109_Sub14_Sub1_2211.method842();
						var3 = Class44.method226(Class5.aString67);
						if ((Class50.aClass21_513.aLinkedHashMap199.size() >= 10) && !Class50.aClass21_513.aLinkedHashMap199.containsKey(Integer.valueOf(var3))) {
							final Iterator var12 = Class50.aClass21_513.aLinkedHashMap199.entrySet().iterator();
							var12.next();
							var12.remove();
						}

						Class50.aClass21_513.aLinkedHashMap199.put(Integer.valueOf(var3), Integer.valueOf(var2));
						Class7.method46(-840141801);
					}

					client.anInt2135 = Class48.aClass82_506.method339();
					client.aBool1983 = Class48.aClass82_506.method339() == 1;
					client.anInt2092 = Class48.aClass82_506.method339();
					client.anInt2092 <<= 8;
					client.anInt2092 += Class48.aClass82_506.method339();
					client.anInt2154 = Class48.aClass82_506.method339();
					Class48.aClass82_506.method341(client.aClass109_Sub14_Sub1_2211.data, 0, 1);
					client.aClass109_Sub14_Sub1_2211.position = 0;
					client.anInt2013 = client.aClass109_Sub14_Sub1_2211.method842();
					Class48.aClass82_506.method341(client.aClass109_Sub14_Sub1_2211.data, 0, 2);
					client.aClass109_Sub14_Sub1_2211.position = 0;
					client.anInt2012 = client.aClass109_Sub14_Sub1_2211.method566();
					client var6;
					if (client.anInt2154 == 1)
						try {
							var6 = client.aclient1968;
							JSObject.getWindow(var6).call("zap", (Object[]) null);
						} catch (final Throwable var8) {
							;
						}
					else
						try {
							var6 = client.aclient1968;
							JSObject.getWindow(var6).call("unzap", (Object[]) null);
						} catch (final Throwable var7) {
							;
						}

					client.loginStage = 10;
				}

				if (client.loginStage == 10) {
					if (Class48.aClass82_506.method340() >= client.anInt2012) {
						client.aClass109_Sub14_Sub1_2211.position = 0;
						Class48.aClass82_506.method341(client.aClass109_Sub14_Sub1_2211.data, 0, client.anInt2012);
						Class109_Sub21_Sub15_Sub3_Sub2.method1038();
						Class109_Sub21_Sub11.anInt1493 = -1;
						Class109_Sub7.method524(false);
						client.anInt2013 = -1;
					}

				} else {
					++client.anInt2177;
					if (client.anInt2177 > 2000)
						if (client.anInt2004 < 1) {
							if (Class33.anInt323 == Class20.anInt188)
								Class33.anInt323 = Class2.anInt18;
							else
								Class33.anInt323 = Class20.anInt188;

							++client.anInt2004;
							client.loginStage = 0;
						} else
							Class33.method144(-3);
				}
			}
		} catch (final IOException var9) {
			if (client.anInt2004 < 1) {
				if (Class20.anInt188 == Class33.anInt323)
					Class33.anInt323 = Class2.anInt18;
				else
					Class33.anInt323 = Class20.anInt188;

				++client.anInt2004;
				client.loginStage = 0;
			} else
				Class33.method144(-2);
		}
	}
}
