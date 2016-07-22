public class Class109_Sub19 extends Class109 {
	byte[] aByteArray1127;
	Class116 aClass116_1126;

	public static Class109_Sub19 method634(final Class104 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method387(var1, var2);
		return var3 == null ? null : new Class109_Sub19(new DataBuffer(var3));
	}

	Class109_Sub19(final DataBuffer var1) {
		var1.position = var1.data.length - 3;
		final int var4 = var1.method564();
		final int var5 = var1.readShort();
		int var2 = 14 + (var4 * 10);
		var1.position = 0;
		int var29 = 0;
		int var8 = 0;
		int var9 = 0;
		int var23 = 0;
		int var27 = 0;
		int var12 = 0;
		int var28 = 0;
		int var14 = 0;

		int var3;
		int var18;
		int var19;
		for (var3 = 0; var3 < var4; ++var3) {
			var18 = -1;

			while (true) {
				var19 = var1.method564();
				if (var19 != var18)
					++var2;

				var18 = var19 & 15;
				if (var19 == 7)
					break;

				if (var19 == 23)
					++var29;
				else if (var18 == 0)
					++var9;
				else if (var18 == 1)
					++var23;
				else if (var18 == 2)
					++var8;
				else if (var18 == 3)
					++var27;
				else if (var18 == 4)
					++var12;
				else if (var18 == 5)
					++var28;
				else {
					if (var18 != 6)
						throw new RuntimeException();

					++var14;
				}
			}
		}

		var2 += 5 * var29;
		var2 += 2 * (var9 + var23 + var8 + var27 + var28);
		var2 += var12 + var14;
		var3 = var1.position;
		var18 = var4 + var29 + var8 + var9 + var23 + var27 + var12 + var28 + var14;

		for (var19 = 0; var19 < var18; ++var19)
			var1.method615();

		var2 += var1.position - var3;
		var19 = var1.position;
		int var32 = 0;
		int var33 = 0;
		int var34 = 0;
		int var40 = 0;
		int var13 = 0;
		int var35 = 0;
		int var36 = 0;
		int var7 = 0;
		int var37 = 0;
		int var41 = 0;
		int var38 = 0;
		int var39 = 0;
		int var10 = 0;

		int var17;
		for (var17 = 0; var17 < var8; ++var17) {
			var10 = (var10 + var1.method564()) & 127;
			if ((var10 != 0) && (var10 != 32)) {
				if (var10 == 1)
					++var32;
				else if (var10 == 33)
					++var33;
				else if (var10 == 7)
					++var34;
				else if (var10 == 39)
					++var40;
				else if (var10 == 10)
					++var13;
				else if (var10 == 42)
					++var35;
				else if (var10 == 99)
					++var36;
				else if (var10 == 98)
					++var7;
				else if (var10 == 101)
					++var37;
				else if (var10 == 100)
					++var41;
				else if ((var10 != 64) && (var10 != 65) && (var10 != 120) && (var10 != 121) && (var10 != 123))
					++var39;
				else
					++var38;
			} else
				++var14;
		}

		var17 = 0;
		int var58 = var1.position;
		var1.position += var38;
		int var11 = var1.position;
		var1.position += var28;
		int var16 = var1.position;
		var1.position += var12;
		int var45 = var1.position;
		var1.position += var27;
		int var46 = var1.position;
		var1.position += var32;
		int var47 = var1.position;
		var1.position += var34;
		int var49 = var1.position;
		var1.position += var13;
		int var25 = var1.position;
		var1.position += var9 + var23 + var28;
		int var48 = var1.position;
		var1.position += var9;
		int var42 = var1.position;
		var1.position += var39;
		int var50 = var1.position;
		var1.position += var23;
		int var65 = var1.position;
		var1.position += var33;
		int var24 = var1.position;
		var1.position += var40;
		int var26 = var1.position;
		var1.position += var35;
		int var55 = var1.position;
		var1.position += var14;
		int var52 = var1.position;
		var1.position += var27;
		int var56 = var1.position;
		var1.position += var36;
		int var57 = var1.position;
		var1.position += var7;
		int var21 = var1.position;
		var1.position += var37;
		int var30 = var1.position;
		var1.position += var41;
		int var61 = var1.position;
		var1.position += var29 * 3;
		aByteArray1127 = new byte[var2];
		final DataBuffer var31 = new DataBuffer(aByteArray1127);
		var31.writeInt(1297377380);
		var31.writeInt(6);
		var31.writeShort(var4 > 1 ? 1 : 0);
		var31.writeShort(var4);
		var31.writeShort(var5);
		var1.position = var3;
		int var53 = 0;
		int var20 = 0;
		int var62 = 0;
		int var59 = 0;
		int var51 = 0;
		int var15 = 0;
		int var66 = 0;
		final int[] var43 = new int[128];
		var10 = 0;

		label354: for (int var63 = 0; var63 < var4; ++var63) {
			var31.writeInt(1297379947);
			var31.position += 4;
			final int var64 = var31.position;
			int var44 = -1;

			while (true)
				while (true) {
					final int var54 = var1.method615();
					var31.method563(var54);
					final int var60 = var1.data[var17++] & 255;
					final boolean var6 = var60 != var44;
					var44 = var60 & 15;
					if (var60 == 7) {
						if (var6)
							var31.writeByte(255);

						var31.writeByte(47);
						var31.writeByte(0);
						var31.method560(var31.position - var64);
						continue label354;
					}

					if (var60 == 23) {
						if (var6)
							var31.writeByte(255);

						var31.writeByte(81);
						var31.writeByte(3);
						var31.writeByte(var1.data[var61++]);
						var31.writeByte(var1.data[var61++]);
						var31.writeByte(var1.data[var61++]);
					} else {
						var53 ^= var60 >> 4;
						if (var44 == 0) {
							if (var6)
								var31.writeByte(144 + var53);

							var20 += var1.data[var25++];
							var62 += var1.data[var48++];
							var31.writeByte(var20 & 127);
							var31.writeByte(var62 & 127);
						} else if (var44 == 1) {
							if (var6)
								var31.writeByte(128 + var53);

							var20 += var1.data[var25++];
							var59 += var1.data[var50++];
							var31.writeByte(var20 & 127);
							var31.writeByte(var59 & 127);
						} else if (var44 == 2) {
							if (var6)
								var31.writeByte(176 + var53);

							var10 = (var10 + var1.data[var19++]) & 127;
							var31.writeByte(var10);
							byte var22;
							if ((var10 != 0) && (var10 != 32)) {
								if (var10 == 1)
									var22 = var1.data[var46++];
								else if (var10 == 33)
									var22 = var1.data[var65++];
								else if (var10 == 7)
									var22 = var1.data[var47++];
								else if (var10 == 39)
									var22 = var1.data[var24++];
								else if (var10 == 10)
									var22 = var1.data[var49++];
								else if (var10 == 42)
									var22 = var1.data[var26++];
								else if (var10 == 99)
									var22 = var1.data[var56++];
								else if (var10 == 98)
									var22 = var1.data[var57++];
								else if (var10 == 101)
									var22 = var1.data[var21++];
								else if (var10 == 100)
									var22 = var1.data[var30++];
								else if ((var10 != 64) && (var10 != 65) && (var10 != 120) && (var10 != 121)
										&& (var10 != 123))
									var22 = var1.data[var42++];
								else
									var22 = var1.data[var58++];
							} else
								var22 = var1.data[var55++];

							final int var67 = var22 + var43[var10];
							var43[var10] = var67;
							var31.writeByte(var67 & 127);
						} else if (var44 == 3) {
							if (var6)
								var31.writeByte(224 + var53);

							var51 += var1.data[var52++];
							var51 += var1.data[var45++] << 7;
							var31.writeByte(var51 & 127);
							var31.writeByte((var51 >> 7) & 127);
						} else if (var44 == 4) {
							if (var6)
								var31.writeByte(208 + var53);

							var15 += var1.data[var16++];
							var31.writeByte(var15 & 127);
						} else if (var44 == 5) {
							if (var6)
								var31.writeByte(160 + var53);

							var20 += var1.data[var25++];
							var66 += var1.data[var11++];
							var31.writeByte(var20 & 127);
							var31.writeByte(var66 & 127);
						} else {
							if (var44 != 6)
								throw new RuntimeException();

							if (var6)
								var31.writeByte(192 + var53);

							var31.writeByte(var1.data[var55++]);
						}
					}
				}
		}

	}

	void method635() {
		aClass116_1126 = null;
	}

	void method636() {
		if (aClass116_1126 == null) {
			aClass116_1126 = new Class116(16);
			final int[] var1 = new int[16];
			final int[] var3 = new int[16];
			var3[9] = 128;
			var1[9] = 128;
			final Class103 var4 = new Class103(aByteArray1127);
			final int var5 = var4.method370();

			int var6;
			for (var6 = 0; var6 < var5; ++var6) {
				var4.method374(var6);
				var4.method376(var6);
				var4.method384(var6);
			}

			label76: do
				while (true) {
					var6 = var4.method379();
					final int var9 = var4.anIntArray769[var6];

					while (var4.anIntArray769[var6] == var9) {
						var4.method374(var6);
						final int var8 = var4.method375(var6);
						if (var8 == 1) {
							var4.method373();
							var4.method384(var6);
							continue label76;
						}

						final int var7 = var8 & 240;
						int var12;
						int var13;
						int var14;
						if (var7 == 176) {
							var12 = var8 & 15;
							var14 = (var8 >> 8) & 127;
							var13 = (var8 >> 16) & 127;
							if (var14 == 0)
								var1[var12] = (var1[var12] & -2080769) + (var13 << 14);

							if (var14 == 32)
								var1[var12] = (var1[var12] & -16257) + (var13 << 7);
						}

						if (var7 == 192) {
							var12 = var8 & 15;
							var14 = (var8 >> 8) & 127;
							var3[var12] = var1[var12] + var14;
						}

						if (var7 == 144) {
							var12 = var8 & 15;
							var14 = (var8 >> 8) & 127;
							var13 = (var8 >> 16) & 127;
							if (var13 > 0) {
								final int var11 = var3[var12];
								Class109_Sub22 var10 = (Class109_Sub22) aClass116_1126.method429(var11);
								if (var10 == null) {
									var10 = new Class109_Sub22(new byte[128]);
									aClass116_1126.method430(var10, var11);
								}

								var10.aByteArray1281[var14] = 1;
							}
						}

						var4.method376(var6);
						var4.method384(var6);
					}
				}
			while (!var4.method380());

		}
	}
}
