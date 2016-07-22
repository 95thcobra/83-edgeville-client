public class Class109_Sub5 extends Class109 {
	static byte[] aByteArray946;
	static int anInt935;
	static int anInt948;
	int anInt942;
	int anInt930;
	int anInt931;
	int anInt937;
	boolean aBool933;
	byte[][] aByteArrayArray949;
	static boolean aBool940 = false;
	float[] aFloatArray934;
	static float[] aFloatArray950;
	int anInt956;
	int anInt929;
	boolean aBool947;
	byte[] aByteArray959;
	int anInt945;
	int anInt961;
	static int anInt960;
	static int anInt938;
	static Class16[] aClass16Array932;
	static Class13[] aClass13Array928;
	static Class10[] aClass10Array941;
	static Class12[] aClass12Array939;
	static boolean[] aBoolArray943;
	static int[] anIntArray944;
	static float[] aFloatArray951;
	static float[] aFloatArray952;
	static float[] aFloatArray953;
	static int[] anIntArray957;
	static float[] aFloatArray954;
	static float[] aFloatArray955;
	static float[] aFloatArray936;
	static int[] anIntArray958;

	static void method511(final byte[] var0, final int var1) {
		aByteArray946 = var0;
		anInt935 = var1;
		anInt948 = 0;
	}

	static int method512() {
		final int var0 = (aByteArray946[anInt935] >> anInt948) & 1;
		++anInt948;
		anInt935 += anInt948 >> 3;
		anInt948 &= 7;
		return var0;
	}

	static int method513(int var0) {
		int var1 = 0;

		int var2;
		int var3;
		for (var2 = 0; var0 >= (8 - anInt948); var0 -= var3) {
			var3 = 8 - anInt948;
			final int var4 = (1 << var3) - 1;
			var1 += ((aByteArray946[anInt935] >> anInt948) & var4) << var2;
			anInt948 = 0;
			++anInt935;
			var2 += var3;
		}

		if (var0 > 0) {
			var3 = (1 << var0) - 1;
			var1 += ((aByteArray946[anInt935] >> anInt948) & var3) << var2;
			anInt948 += var0;
		}

		return var1;
	}

	void method514(final byte[] var1) {
		final DataBuffer var2 = new DataBuffer(var1);
		anInt942 = var2.readInt();
		anInt930 = var2.readInt();
		anInt931 = var2.readInt();
		anInt937 = var2.readInt();
		if (anInt937 < 0) {
			anInt937 = ~anInt937;
			aBool933 = true;
		}

		final int var6 = var2.readInt();
		aByteArrayArray949 = new byte[var6][];

		for (int var7 = 0; var7 < var6; ++var7) {
			int var5 = 0;

			int var3;
			do {
				var3 = var2.method564();
				var5 += var3;
			} while (var3 >= 255);

			final byte[] var4 = new byte[var5];
			var2.method561(var4, 0, var5);
			aByteArrayArray949[var7] = var4;
		}

	}

	static boolean method515(final Class104 var0) {
		if (!aBool940) {
			final byte[] var1 = var0.method387(0, 0);
			if (var1 == null)
				return false;

			method519(var1);
			aBool940 = true;
		}

		return true;
	}

	static float method516(final int var0) {
		int var1 = var0 & 2097151;
		final int var3 = var0 & Integer.MIN_VALUE;
		final int var2 = (var0 & 2145386496) >> 21;
		if (var3 != 0)
			var1 = -var1;

		return (float) (var1 * Math.pow(2.0D, var2 - 788));
	}

	float[] method517(final int var1) {
		method511(aByteArrayArray949[var1], 0);
		method512();
		final int var6 = method513(Class3.method20(anIntArray944.length - 1));
		final boolean var7 = aBoolArray943[var6];
		final int var2 = var7 ? anInt938 : anInt960;
		boolean var17 = false;
		boolean var10 = false;
		if (var7) {
			var17 = method512() != 0;
			var10 = method512() != 0;
		}

		final int var16 = var2 >> 1;
		int var18;
		int var20;
		int var21;
		if (var7 && !var17) {
			var18 = (var2 >> 2) - (anInt960 >> 2);
			var20 = (var2 >> 2) + (anInt960 >> 2);
			var21 = anInt960 >> 1;
		} else {
			var18 = 0;
			var20 = var16;
			var21 = var2 >> 1;
		}

		int var22;
		int var23;
		int var24;
		if (var7 && !var10) {
			var22 = var2 - (var2 >> 2) - (anInt960 >> 2);
			var23 = (var2 - (var2 >> 2)) + (anInt960 >> 2);
			var24 = anInt960 >> 1;
		} else {
			var22 = var16;
			var23 = var2;
			var24 = var2 >> 1;
		}

		final Class12 var25 = aClass12Array939[anIntArray944[var6]];
		final int var26 = var25.anInt110;
		int var3 = var25.anIntArray109[var26];
		final boolean var27 = !aClass13Array928[var3].method63();
		final boolean var51 = var27;

		for (var3 = 0; var3 < var25.anInt108; ++var3) {
			final Class10 var30 = aClass10Array941[var25.anIntArray111[var3]];
			final float[] var29 = aFloatArray950;
			var30.method57(var29, var2 >> 1, var51);
		}

		int var28;
		if (!var27) {
			var3 = var25.anInt110;
			var28 = var25.anIntArray109[var3];
			aClass13Array928[var28].method67(aFloatArray950, var2 >> 1);
		}

		int var19;
		if (var27)
			for (var3 = var2 >> 1; var3 < var2; ++var3)
				aFloatArray950[var3] = 0.0F;
		else {
			var3 = var2 >> 1;
			var28 = var2 >> 2;
			var19 = var2 >> 3;
			final float[] var11 = aFloatArray950;

			int var32;
			for (var32 = 0; var32 < var3; ++var32)
				var11[var32] *= 0.5F;

			for (var32 = var3; var32 < var2; ++var32)
				var11[var32] = -var11[var2 - var32 - 1];

			final float[] var39 = var7 ? aFloatArray954 : aFloatArray951;
			final float[] var40 = var7 ? aFloatArray955 : aFloatArray952;
			final float[] var44 = var7 ? aFloatArray936 : aFloatArray953;
			final int[] var41 = var7 ? anIntArray958 : anIntArray957;

			float var4;
			float var5;
			float var8;
			float var9;
			int var12;
			for (var12 = 0; var12 < var28; ++var12) {
				var4 = var11[4 * var12] - var11[var2 - (4 * var12) - 1];
				var8 = var11[(4 * var12) + 2] - var11[var2 - (4 * var12) - 3];
				var5 = var39[2 * var12];
				var9 = var39[(2 * var12) + 1];
				var11[var2 - (4 * var12) - 1] = (var4 * var5) - (var8 * var9);
				var11[var2 - (4 * var12) - 3] = (var4 * var9) + (var8 * var5);
			}

			float var13;
			float var33;
			for (var12 = 0; var12 < var19; ++var12) {
				var4 = var11[var3 + 3 + (4 * var12)];
				var8 = var11[var3 + 1 + (4 * var12)];
				var5 = var11[(4 * var12) + 3];
				var9 = var11[(4 * var12) + 1];
				var11[var3 + 3 + (4 * var12)] = var4 + var5;
				var11[var3 + 1 + (4 * var12)] = var8 + var9;
				var13 = var39[var3 - 4 - (4 * var12)];
				var33 = var39[var3 - 3 - (4 * var12)];
				var11[(4 * var12) + 3] = ((var4 - var5) * var13) - ((var8 - var9) * var33);
				var11[(4 * var12) + 1] = ((var8 - var9) * var13) + ((var4 - var5) * var33);
			}

			var12 = Class3.method20(var2 - 1);

			int var45;
			int var46;
			int var47;
			int var48;
			for (var45 = 0; var45 < (var12 - 3); ++var45) {
				var47 = var2 >> (var45 + 2);
				var46 = 8 << var45;

				for (var48 = 0; var48 < (2 << var45); ++var48) {
					final int var49 = var2 - (var47 * 2 * var48);
					final int var53 = var2 - (var47 * ((2 * var48) + 1));

					for (int var42 = 0; var42 < (var2 >> (var45 + 4)); ++var42) {
						final int var14 = 4 * var42;
						final float var36 = var11[var49 - 1 - var14];
						final float var15 = var11[var49 - 3 - var14];
						final float var37 = var11[var53 - 1 - var14];
						final float var34 = var11[var53 - 3 - var14];
						var11[var49 - 1 - var14] = var36 + var37;
						var11[var49 - 3 - var14] = var15 + var34;
						final float var35 = var39[var42 * var46];
						final float var38 = var39[(var42 * var46) + 1];
						var11[var53 - 1 - var14] = ((var36 - var37) * var35) - ((var15 - var34) * var38);
						var11[var53 - 3 - var14] = ((var15 - var34) * var35) + ((var36 - var37) * var38);
					}
				}
			}

			for (var45 = 1; var45 < (var19 - 1); ++var45) {
				var47 = var41[var45];
				if (var45 < var47) {
					var46 = 8 * var45;
					var48 = 8 * var47;
					var13 = var11[var46 + 1];
					var11[var46 + 1] = var11[var48 + 1];
					var11[var48 + 1] = var13;
					var13 = var11[var46 + 3];
					var11[var46 + 3] = var11[var48 + 3];
					var11[var48 + 3] = var13;
					var13 = var11[var46 + 5];
					var11[var46 + 5] = var11[var48 + 5];
					var11[var48 + 5] = var13;
					var13 = var11[var46 + 7];
					var11[var46 + 7] = var11[var48 + 7];
					var11[var48 + 7] = var13;
				}
			}

			for (var45 = 0; var45 < var3; ++var45)
				var11[var45] = var11[(2 * var45) + 1];

			for (var45 = 0; var45 < var19; ++var45) {
				var11[var2 - 1 - (2 * var45)] = var11[4 * var45];
				var11[var2 - 2 - (2 * var45)] = var11[(4 * var45) + 1];
				var11[var2 - var28 - 1 - (2 * var45)] = var11[(4 * var45) + 2];
				var11[var2 - var28 - 2 - (2 * var45)] = var11[(4 * var45) + 3];
			}

			for (var45 = 0; var45 < var19; ++var45) {
				var8 = var44[2 * var45];
				var5 = var44[(2 * var45) + 1];
				var9 = var11[var3 + (2 * var45)];
				var13 = var11[var3 + (2 * var45) + 1];
				var33 = var11[var2 - 2 - (2 * var45)];
				final float var54 = var11[var2 - 1 - (2 * var45)];
				float var50 = (var5 * (var9 - var33)) + (var8 * (var13 + var54));
				var11[var3 + (2 * var45)] = (var9 + var33 + var50) * 0.5F;
				var11[var2 - 2 - (2 * var45)] = ((var9 + var33) - var50) * 0.5F;
				var50 = (var5 * (var13 + var54)) - (var8 * (var9 - var33));
				var11[var3 + (2 * var45) + 1] = ((var13 - var54) + var50) * 0.5F;
				var11[var2 - 1 - (2 * var45)] = (-var13 + var54 + var50) * 0.5F;
			}

			for (var45 = 0; var45 < var28; ++var45) {
				var11[var45] = (var11[(2 * var45) + var3] * var40[2 * var45])
						+ (var11[(2 * var45) + 1 + var3] * var40[(2 * var45) + 1]);
				var11[var3 - 1 - var45] = (var11[(2 * var45) + var3] * var40[(2 * var45) + 1])
						- (var11[(2 * var45) + 1 + var3] * var40[2 * var45]);
			}

			for (var45 = 0; var45 < var28; ++var45)
				var11[(var2 - var28) + var45] = -var11[var45];

			for (var45 = 0; var45 < var28; ++var45)
				var11[var45] = var11[var28 + var45];

			for (var45 = 0; var45 < var28; ++var45)
				var11[var28 + var45] = -var11[var28 - var45 - 1];

			for (var45 = 0; var45 < var28; ++var45)
				var11[var3 + var45] = var11[var2 - var45 - 1];

			for (var45 = var18; var45 < var20; ++var45) {
				var8 = (float) Math.sin((((var45 - var18) + 0.5D) / var21) * 0.5D * 3.141592653589793D);
				aFloatArray950[var45] *= (float) Math.sin(1.5707963267948966D * var8 * var8);
			}

			for (var45 = var22; var45 < var23; ++var45) {
				var8 = (float) Math
						.sin(((((var45 - var22) + 0.5D) / var24) * 0.5D * 3.141592653589793D) + 1.5707963267948966D);
				aFloatArray950[var45] *= (float) Math.sin(1.5707963267948966D * var8 * var8);
			}
		}

		float[] var31 = null;
		if (anInt956 > 0) {
			var28 = (anInt956 + var2) >> 2;
			var31 = new float[var28];
			int var43;
			if (!aBool947)
				for (var19 = 0; var19 < anInt929; ++var19) {
					var43 = (anInt956 >> 1) + var19;
					var31[var19] += aFloatArray934[var43];
				}

			if (!var27)
				for (var19 = var18; var19 < (var2 >> 1); ++var19) {
					var43 = (var31.length - (var2 >> 1)) + var19;
					var31[var43] += aFloatArray950[var19];
				}
		}

		final float[] var52 = aFloatArray934;
		aFloatArray934 = aFloatArray950;
		aFloatArray950 = var52;
		anInt956 = var2;
		anInt929 = var23 - (var2 >> 1);
		aBool947 = var27;
		return var31;
	}

	Class109_Sub5(final byte[] var1) {
		method514(var1);
	}

	Class109_Sub3_Sub1 method518(final int[] var1) {
		if ((var1 != null) && (var1[0] <= 0))
			return null;
		else {
			if (aByteArray959 == null) {
				anInt956 = 0;
				aFloatArray934 = new float[anInt938];
				aByteArray959 = new byte[anInt930];
				anInt945 = 0;
				anInt961 = 0;
			}

			for (; anInt961 < aByteArrayArray949.length; ++anInt961) {
				if ((var1 != null) && (var1[0] <= 0))
					return null;

				final float[] var2 = method517(anInt961);
				if (var2 != null) {
					int var6 = anInt945;
					int var3 = var2.length;
					if (var3 > (anInt930 - var6))
						var3 = anInt930 - var6;

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = (int) (128.0F + (var2[var4] * 128.0F));
						if ((var5 & -256) != 0)
							var5 = ~var5 >> 31;

						aByteArray959[var6++] = (byte) (var5 - 128);
					}

					if (var1 != null)
						var1[0] -= var6 - anInt945;

					anInt945 = var6;
				}
			}

			aFloatArray934 = null;
			final byte[] var7 = aByteArray959;
			aByteArray959 = null;
			return new Class109_Sub3_Sub1(anInt942, var7, anInt931, anInt937, aBool933);
		}
	}

	static void method519(final byte[] var0) {
		method511(var0, 0);
		anInt960 = 1 << method513(4);
		anInt938 = 1 << method513(4);
		aFloatArray950 = new float[anInt938];

		int var1;
		int var2;
		int var3;
		int var5;
		int var9;
		for (var3 = 0; var3 < 2; ++var3) {
			var2 = var3 != 0 ? anInt938 : anInt960;
			var1 = var2 >> 1;
			var5 = var2 >> 2;
			var9 = var2 >> 3;
			final float[] var10 = new float[var1];

			for (int var11 = 0; var11 < var5; ++var11) {
				var10[2 * var11] = (float) Math.cos((4 * var11 * 3.141592653589793D) / var2);
				var10[(2 * var11) + 1] = -((float) Math.sin((4 * var11 * 3.141592653589793D) / var2));
			}

			final float[] var7 = new float[var1];

			for (int var4 = 0; var4 < var5; ++var4) {
				var7[2 * var4] = (float) Math.cos((((2 * var4) + 1) * 3.141592653589793D) / (2 * var2));
				var7[(2 * var4) + 1] = (float) Math.sin((((2 * var4) + 1) * 3.141592653589793D) / (2 * var2));
			}

			final float[] var12 = new float[var5];

			for (int var8 = 0; var8 < var9; ++var8) {
				var12[2 * var8] = (float) Math.cos((((4 * var8) + 2) * 3.141592653589793D) / var2);
				var12[(2 * var8) + 1] = -((float) Math.sin((((4 * var8) + 2) * 3.141592653589793D) / var2));
			}

			final int[] var15 = new int[var9];
			final int var13 = Class3.method20(var9 - 1);

			for (int var14 = 0; var14 < var9; ++var14)
				var15[var14] = Class109_Sub21_Sub12.method754(var14, var13);

			if (var3 != 0) {
				aFloatArray954 = var10;
				aFloatArray955 = var7;
				aFloatArray936 = var12;
				anIntArray958 = var15;
			} else {
				aFloatArray951 = var10;
				aFloatArray952 = var7;
				aFloatArray953 = var12;
				anIntArray957 = var15;
			}
		}

		var3 = method513(8) + 1;
		aClass16Array932 = new Class16[var3];

		for (var2 = 0; var2 < var3; ++var2)
			aClass16Array932[var2] = new Class16();

		var2 = method513(6) + 1;

		for (var1 = 0; var1 < var2; ++var1)
			method513(16);

		var2 = method513(6) + 1;
		aClass13Array928 = new Class13[var2];

		for (var1 = 0; var1 < var2; ++var1)
			aClass13Array928[var1] = new Class13();

		var1 = method513(6) + 1;
		aClass10Array941 = new Class10[var1];

		for (var5 = 0; var5 < var1; ++var5)
			aClass10Array941[var5] = new Class10();

		var5 = method513(6) + 1;
		aClass12Array939 = new Class12[var5];

		for (var9 = 0; var9 < var5; ++var9)
			aClass12Array939[var9] = new Class12();

		var9 = method513(6) + 1;
		aBoolArray943 = new boolean[var9];
		anIntArray944 = new int[var9];

		for (int var6 = 0; var6 < var9; ++var6) {
			aBoolArray943[var6] = method512() != 0;
			method513(16);
			method513(16);
			anIntArray944[var6] = method513(8);
		}

	}

	static Class109_Sub5 method520(final Class104 var0, final int var1, final int var2) {
		if (!method515(var0)) {
			var0.method389(var1, var2);
			return null;
		} else {
			final byte[] var3 = var0.method387(var1, var2);
			return var3 == null ? null : new Class109_Sub5(var3);
		}
	}
}
