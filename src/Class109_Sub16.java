public class Class109_Sub16 extends Class109 {
	static int anInt1089;
	static Class104_Sub1 aClass104_Sub1_1097;
	int[] anIntArray1095 = new int[128];
	Class109_Sub3_Sub1[] aClass109_Sub3_Sub1Array1090 = new Class109_Sub3_Sub1[128];
	short[] aShortArray1091 = new short[128];
	byte[] aByteArray1098 = new byte[128];
	byte[] aByteArray1096 = new byte[128];
	Class101[] aClass101Array1093 = new Class101[128];
	byte[] aByteArray1094 = new byte[128];
	int anInt1092;

	void method629() {
		anIntArray1095 = null;
	}

	Class109_Sub16(final byte[] var1) {
		final DataBuffer var5 = new DataBuffer(var1);

		int var6;
		for (var6 = 0; var5.data[var6 + var5.position] != 0; ++var6)
			;

		final byte[] var10 = new byte[var6];

		int var9;
		for (var9 = 0; var9 < var6; ++var9)
			var10[var9] = var5.method612();

		++var5.position;
		++var6;
		var9 = var5.position;
		var5.position += var6;

		int var14;
		for (var14 = 0; var5.data[var5.position + var14] != 0; ++var14)
			;

		final byte[] var17 = new byte[var14];

		int var16;
		for (var16 = 0; var16 < var14; ++var16)
			var17[var16] = var5.method612();

		++var5.position;
		++var14;
		var16 = var5.position;
		var5.position += var14;

		int var18;
		for (var18 = 0; var5.data[var18 + var5.position] != 0; ++var18)
			;

		final byte[] var19 = new byte[var18];

		for (int var20 = 0; var20 < var18; ++var20)
			var19[var20] = var5.method612();

		++var5.position;
		++var18;
		final byte[] var23 = new byte[var18];
		int var4;
		int var25;
		if (var18 > 1) {
			var23[1] = 1;
			int var24 = 1;
			var25 = 2;

			for (var4 = 2; var4 < var18; ++var4) {
				int var27 = var5.method564();
				if (var27 == 0)
					var24 = var25++;
				else {
					if (var27 <= var24)
						--var27;

					var24 = var27;
				}

				var23[var4] = (byte) var24;
			}
		} else
			var25 = var18;

		final Class101[] var30 = new Class101[var25];

		Class101 var2;
		for (var4 = 0; var4 < var30.length; ++var4) {
			var2 = var30[var4] = new Class101();
			int var31 = var5.method564();
			if (var31 > 0)
				var2.aByteArray737 = new byte[var31 * 2];

			var31 = var5.method564();
			if (var31 > 0) {
				var2.aByteArray736 = new byte[2 + (var31 * 2)];
				var2.aByteArray736[1] = 64;
			}
		}

		var4 = var5.method564();
		final byte[] var42 = var4 > 0 ? new byte[var4 * 2] : null;
		var4 = var5.method564();
		final byte[] var28 = var4 > 0 ? new byte[2 * var4] : null;

		int var22;
		for (var22 = 0; var5.data[var22 + var5.position] != 0; ++var22)
			;

		final byte[] var33 = new byte[var22];

		int var29;
		for (var29 = 0; var29 < var22; ++var29)
			var33[var29] = var5.method612();

		++var5.position;
		++var22;
		var29 = 0;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			var29 += var5.method564();
			aShortArray1091[var26] = (short) var29;
		}

		var29 = 0;

		for (var26 = 0; var26 < 128; ++var26) {
			var29 += var5.method564();
			aShortArray1091[var26] = (short) (aShortArray1091[var26] + (var29 << 8));
		}

		var26 = 0;
		int var32 = 0;
		int var37 = 0;

		int var36;
		for (var36 = 0; var36 < 128; ++var36) {
			if (var26 == 0) {
				if (var32 < var33.length)
					var26 = var33[var32++];
				else
					var26 = -1;

				var37 = var5.method615();
			}

			aShortArray1091[var36] = (short) (aShortArray1091[var36] + (((var37 - 1) & 2) << 14));
			anIntArray1095[var36] = var37;
			--var26;
		}

		var26 = 0;
		var32 = 0;
		var36 = 0;

		int var13;
		for (var13 = 0; var13 < 128; ++var13)
			if (anIntArray1095[var13] != 0) {
				if (var26 == 0) {
					if (var32 < var10.length)
						var26 = var10[var32++];
					else
						var26 = -1;

					var36 = var5.data[var9++] - 1;
				}

				aByteArray1094[var13] = (byte) var36;
				--var26;
			}

		var26 = 0;
		var32 = 0;
		var13 = 0;

		for (int var12 = 0; var12 < 128; ++var12)
			if (anIntArray1095[var12] != 0) {
				if (var26 == 0) {
					if (var32 < var17.length)
						var26 = var17[var32++];
					else
						var26 = -1;

					var13 = (var5.data[var16++] + 16) << 2;
				}

				aByteArray1096[var12] = (byte) var13;
				--var26;
			}

		var26 = 0;
		var32 = 0;
		Class101 var41 = null;

		int var15;
		for (var15 = 0; var15 < 128; ++var15)
			if (anIntArray1095[var15] != 0) {
				if (var26 == 0) {
					var41 = var30[var23[var32]];
					if (var32 < var19.length)
						var26 = var19[var32++];
					else
						var26 = -1;
				}

				aClass101Array1093[var15] = var41;
				--var26;
			}

		var26 = 0;
		var32 = 0;
		var15 = 0;

		int var8;
		for (var8 = 0; var8 < 128; ++var8) {
			if (var26 == 0) {
				if (var32 < var33.length)
					var26 = var33[var32++];
				else
					var26 = -1;

				if (anIntArray1095[var8] > 0)
					var15 = var5.method564() + 1;
			}

			aByteArray1098[var8] = (byte) var15;
			--var26;
		}

		anInt1092 = var5.method564() + 1;

		Class101 var11;
		int var21;
		for (var8 = 0; var8 < var25; ++var8) {
			var11 = var30[var8];
			if (null != var11.aByteArray737)
				for (var21 = 1; var21 < var11.aByteArray737.length; var21 += 2)
					var11.aByteArray737[var21] = var5.method612();

			if (var11.aByteArray736 != null)
				for (var21 = 3; var21 < (var11.aByteArray736.length - 2); var21 += 2)
					var11.aByteArray736[var21] = var5.method612();
		}

		if (var42 != null)
			for (var8 = 1; var8 < var42.length; var8 += 2)
				var42[var8] = var5.method612();

		if (var28 != null)
			for (var8 = 1; var8 < var28.length; var8 += 2)
				var28[var8] = var5.method612();

		for (var8 = 0; var8 < var25; ++var8) {
			var11 = var30[var8];
			if (var11.aByteArray736 != null) {
				var29 = 0;

				for (var21 = 2; var21 < var11.aByteArray736.length; var21 += 2) {
					var29 = var29 + 1 + var5.method564();
					var11.aByteArray736[var21] = (byte) var29;
				}
			}
		}

		for (var8 = 0; var8 < var25; ++var8) {
			var11 = var30[var8];
			if (null != var11.aByteArray737) {
				var29 = 0;

				for (var21 = 2; var21 < var11.aByteArray737.length; var21 += 2) {
					var29 = 1 + var29 + var5.method564();
					var11.aByteArray737[var21] = (byte) var29;
				}
			}
		}

		byte var7;
		int var34;
		int var35;
		int var38;
		int var44;
		byte var45;
		if (var42 != null) {
			var29 = var5.method564();
			var42[0] = (byte) var29;

			for (var8 = 2; var8 < var42.length; var8 += 2) {
				var29 = 1 + var29 + var5.method564();
				var42[var8] = (byte) var29;
			}

			var45 = var42[0];
			byte var3 = var42[1];

			for (var21 = 0; var21 < var45; ++var21)
				aByteArray1098[var21] = (byte) ((32 + (var3 * aByteArray1098[var21])) >> 6);

			for (var21 = 2; var21 < var42.length; var21 += 2) {
				var7 = var42[var21];
				final byte var39 = var42[var21 + 1];
				var34 = ((var7 - var45) / 2) + (var3 * (var7 - var45));

				for (var38 = var45; var38 < var7; ++var38) {
					var35 = Class77.method331(var34, var7 - var45);
					aByteArray1098[var38] = (byte) ((32 + (var35 * aByteArray1098[var38])) >> 6);
					var34 += var39 - var3;
				}

				var45 = var7;
				var3 = var39;
			}

			for (var44 = var45; var44 < 128; ++var44)
				aByteArray1098[var44] = (byte) ((32 + (aByteArray1098[var44] * var3)) >> 6);

			var2 = null;
		}

		if (null != var28) {
			var29 = var5.method564();
			var28[0] = (byte) var29;

			for (var8 = 2; var8 < var28.length; var8 += 2) {
				var29 = var29 + 1 + var5.method564();
				var28[var8] = (byte) var29;
			}

			var45 = var28[0];
			int var43 = var28[1] << 1;

			for (var21 = 0; var21 < var45; ++var21) {
				var44 = var43 + (aByteArray1096[var21] & 255);
				if (var44 < 0)
					var44 = 0;

				if (var44 > 128)
					var44 = 128;

				aByteArray1096[var21] = (byte) var44;
			}

			int var47;
			for (var21 = 2; var21 < var28.length; var21 += 2) {
				var7 = var28[var21];
				var47 = var28[1 + var21] << 1;
				var34 = ((var7 - var45) * var43) + ((var7 - var45) / 2);

				for (var38 = var45; var38 < var7; ++var38) {
					var35 = Class77.method331(var34, var7 - var45);
					int var40 = var35 + (aByteArray1096[var38] & 255);
					if (var40 < 0)
						var40 = 0;

					if (var40 > 128)
						var40 = 128;

					aByteArray1096[var38] = (byte) var40;
					var34 += var47 - var43;
				}

				var45 = var7;
				var43 = var47;
			}

			for (var44 = var45; var44 < 128; ++var44) {
				var47 = (aByteArray1096[var44] & 255) + var43;
				if (var47 < 0)
					var47 = 0;

				if (var47 > 128)
					var47 = 128;

				aByteArray1096[var44] = (byte) var47;
			}
		}

		for (var8 = 0; var8 < var25; ++var8)
			var30[var8].anInt740 = var5.method564();

		for (var8 = 0; var8 < var25; ++var8) {
			var11 = var30[var8];
			if (var11.aByteArray737 != null)
				var11.anInt735 = var5.method564();

			if (null != var11.aByteArray736)
				var11.anInt739 = var5.method564();

			if (var11.anInt740 > 0)
				var11.anInt742 = var5.method564();
		}

		for (var8 = 0; var8 < var25; ++var8)
			var30[var8].anInt738 = var5.method564();

		for (var8 = 0; var8 < var25; ++var8) {
			var11 = var30[var8];
			if (var11.anInt738 > 0)
				var11.anInt741 = var5.method564();
		}

		for (var8 = 0; var8 < var25; ++var8) {
			var11 = var30[var8];
			if (var11.anInt741 > 0)
				var11.anInt743 = var5.method564();
		}

	}

	boolean method630(final Class17 var1, final byte[] var2, final int[] var3) {
		boolean var4 = true;
		int var7 = 0;
		Class109_Sub3_Sub1 var6 = null;

		for (int var8 = 0; var8 < 128; ++var8)
			if ((null == var2) || (var2[var8] != 0)) {
				int var5 = anIntArray1095[var8];
				if (var5 != 0) {
					if (var7 != var5) {
						var7 = var5--;
						if ((var5 & 1) == 0)
							var6 = var1.method85(var5 >> 2, var3);
						else
							var6 = var1.method83(var5 >> 2, var3);

						if (null == var6)
							var4 = false;
					}

					if (var6 != null) {
						aClass109_Sub3_Sub1Array1090[var8] = var6;
						anIntArray1095[var8] = 0;
					}
				}
			}

		return var4;
	}
}
