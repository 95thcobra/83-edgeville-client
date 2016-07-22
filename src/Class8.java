import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

public abstract class Class8 {
	int anInt87;
	public Image anImage88;
	static int anInt89;
	public int anInt90;
	public int[] anIntArray91;

	public static int method47(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return 1 + var0;
	}

	abstract void method48(int var1, int var2, Component var3, int var4);

	public abstract void method49(Graphics var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void method50(Graphics var1, int var2, int var3, byte var4);

	public final void method51() {
		Class109_Sub21_Sub14.method777(anIntArray91, anInt90, anInt87);
	}

	public static boolean method52() {
		final long var0 = Class109_Sub21_Sub15.method829(483140491);
		int var2 = (int) (var0 - Class102.aLong745);
		Class102.aLong745 = var0;
		if (var2 > 200)
			var2 = 200;

		Class102.anInt746 += var2;
		if ((Class102.anInt754 == 0) && (Class102.anInt760 == 0) && (Class102.anInt761 == 0)
				&& (Class102.anInt765 == 0))
			return true;
		else if (null == Class87.aClass82_669)
			return false;
		else
			try {
				if (Class102.anInt746 > 30000)
					throw new IOException();
				else {
					Class109_Sub21_Sub18 var3;
					DataBuffer var4;
					while ((Class102.anInt760 < 20) && (Class102.anInt765 > 0)) {
						var3 = (Class109_Sub21_Sub18) Class102.aClass116_758.method432();
						var4 = new DataBuffer(4);
						var4.writeByte(1);
						var4.writeTriByte((int) var3.aLong802);
						Class87.aClass82_669.method342(var4.data, 0, 4);
						Class102.aClass116_748.method430(var3, var3.aLong802);
						--Class102.anInt765;
						++Class102.anInt760;
					}

					while ((Class102.anInt754 < 20) && (Class102.anInt761 > 0)) {
						var3 = (Class109_Sub21_Sub18) Class102.aClass111_750.method419();
						var4 = new DataBuffer(4);
						var4.writeByte(0);
						var4.writeTriByte((int) var3.aLong802);
						Class87.aClass82_669.method342(var4.data, 0, 4);
						var3.method658();
						Class102.aClass116_753.method430(var3, var3.aLong802);
						--Class102.anInt761;
						++Class102.anInt754;
					}

					for (int var5 = 0; var5 < 100; ++var5) {
						final int var6 = Class87.aClass82_669.method340();
						if (var6 < 0)
							throw new IOException();

						if (var6 == 0)
							break;

						Class102.anInt746 = 0;
						byte var7 = 0;
						if (null == Class88.aClass109_Sub21_Sub18_671)
							var7 = 8;
						else if (Class102.anInt752 == 0)
							var7 = 1;

						int var8;
						int var9;
						int var10;
						int var12;
						if (var7 > 0) {
							var8 = var7 - Class102.aClass109_Sub14_756.position;
							if (var8 > var6)
								var8 = var6;

							Class87.aClass82_669.method341(Class102.aClass109_Sub14_756.data,
									Class102.aClass109_Sub14_756.position, var8);
							if (Class102.aByte762 != 0)
								for (var9 = 0; var9 < var8; ++var9)
									Class102.aClass109_Sub14_756.data[var9
											+ Class102.aClass109_Sub14_756.position] ^= Class102.aByte762;

							Class102.aClass109_Sub14_756.position += var8;
							if (Class102.aClass109_Sub14_756.position < var7)
								break;

							if (Class88.aClass109_Sub21_Sub18_671 == null) {
								Class102.aClass109_Sub14_756.position = 0;
								var9 = Class102.aClass109_Sub14_756.method564();
								var10 = Class102.aClass109_Sub14_756.method566();
								final int var11 = Class102.aClass109_Sub14_756.method564();
								var12 = Class102.aClass109_Sub14_756.method568();
								final long var13 = var10 + (var9 << 16);
								Class109_Sub21_Sub18 var15 = (Class109_Sub21_Sub18) Class102.aClass116_748
										.method429(var13);
								Class102.aBool755 = true;
								if (null == var15) {
									var15 = (Class109_Sub21_Sub18) Class102.aClass116_753.method429(var13);
									Class102.aBool755 = false;
								}

								if (var15 == null)
									throw new IOException();

								final int var16 = var11 == 0 ? 5 : 9;
								Class88.aClass109_Sub21_Sub18_671 = var15;
								Class102.aClass109_Sub14_747 = new DataBuffer(
										Class88.aClass109_Sub21_Sub18_671.aByte1599 + var12 + var16);
								Class102.aClass109_Sub14_747.writeByte(var11);
								Class102.aClass109_Sub14_747.writeInt(var12);
								Class102.anInt752 = 8;
								Class102.aClass109_Sub14_756.position = 0;
							} else if (Class102.anInt752 == 0)
								if (Class102.aClass109_Sub14_756.data[0] == -1) {
									Class102.anInt752 = 1;
									Class102.aClass109_Sub14_756.position = 0;
								} else
									Class88.aClass109_Sub21_Sub18_671 = null;
						} else {
							var8 = Class102.aClass109_Sub14_747.data.length
									- Class88.aClass109_Sub21_Sub18_671.aByte1599;
							var9 = 512 - Class102.anInt752;
							if (var9 > (var8 - Class102.aClass109_Sub14_747.position))
								var9 = var8 - Class102.aClass109_Sub14_747.position;

							if (var9 > var6)
								var9 = var6;

							Class87.aClass82_669.method341(Class102.aClass109_Sub14_747.data,
									Class102.aClass109_Sub14_747.position, var9);
							if (Class102.aByte762 != 0)
								for (var10 = 0; var10 < var9; ++var10)
									Class102.aClass109_Sub14_747.data[var10
											+ Class102.aClass109_Sub14_747.position] ^= Class102.aByte762;

							Class102.aClass109_Sub14_747.position += var9;
							Class102.anInt752 += var9;
							if (Class102.aClass109_Sub14_747.position == var8) {
								if (Class88.aClass109_Sub21_Sub18_671.aLong802 == 16711935L) {
									Class102.aClass109_Sub14_763 = Class102.aClass109_Sub14_747;

									for (var10 = 0; var10 < 256; ++var10) {
										final Class104_Sub1 var17 = Class102.aClass104_Sub1Array749[var10];
										if (var17 != null) {
											Class102.aClass109_Sub14_763.position = (8 * var10) + 5;
											var12 = Class102.aClass109_Sub14_763.method568();
											final int var18 = Class102.aClass109_Sub14_763.method568();
											var17.method641(var12, var18);
										}
									}
								} else {
									Class102.aCRC32_759.reset();
									Class102.aCRC32_759.update(Class102.aClass109_Sub14_747.data, 0, var8);
									var10 = (int) Class102.aCRC32_759.getValue();
									if (var10 != Class88.aClass109_Sub21_Sub18_671.anInt1598) {
										try {
											Class87.aClass82_669.method338();
										} catch (final Exception var20) {
											;
										}

										++Class102.anInt744;
										Class87.aClass82_669 = null;
										Class102.aByte762 = (byte) ((int) ((Math.random() * 255.0D) + 1.0D));
										return false;
									}

									Class102.anInt744 = 0;
									Class102.anInt764 = 0;
									Class88.aClass109_Sub21_Sub18_671.aClass104_Sub1_1600.method638(
											(int) (Class88.aClass109_Sub21_Sub18_671.aLong802 & 65535L),
											Class102.aClass109_Sub14_747.data,
											16711680L == (Class88.aClass109_Sub21_Sub18_671.aLong802 & 16711680L),
											Class102.aBool755);
								}

								Class88.aClass109_Sub21_Sub18_671.method413();
								if (Class102.aBool755)
									--Class102.anInt760;
								else
									--Class102.anInt754;

								Class102.anInt752 = 0;
								Class88.aClass109_Sub21_Sub18_671 = null;
								Class102.aClass109_Sub14_747 = null;
							} else {
								if (Class102.anInt752 != 512)
									break;

								Class102.anInt752 = 0;
							}
						}
					}

					return true;
				}
			} catch (final IOException var21) {
				try {
					Class87.aClass82_669.method338();
				} catch (final Exception var19) {
					;
				}

				++Class102.anInt764;
				Class87.aClass82_669 = null;
				return false;
			}
	}
}
