import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class Class109_Sub21_Sub14_Sub2 extends Class109_Sub21_Sub14 {
	public int[] anIntArray1722;
	public int anInt1724;
	public int anInt1720;
	public int anInt1719;
	public int anInt1725;
	public int anInt1721;
	public int anInt1723;

	public Class109_Sub21_Sub14_Sub2(final int var1, final int var2) {
		anIntArray1722 = new int[var1 * var2];
		anInt1720 = anInt1724 = var1;
		anInt1725 = anInt1719 = var2;
		anInt1721 = 0;
		anInt1723 = 0;
	}

	public void method908() {
		method777(anIntArray1722, anInt1720, anInt1725);
	}

	public void method909(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anIntArray1722.length; ++var4) {
			final int var6 = anIntArray1722[var4];
			if (var6 != 0) {
				int var8 = (var6 >> 16) & 255;
				var8 += var1;
				if (var8 < 1)
					var8 = 1;
				else if (var8 > 255)
					var8 = 255;

				int var7 = (var6 >> 8) & 255;
				var7 += var2;
				if (var7 < 1)
					var7 = 1;
				else if (var7 > 255)
					var7 = 255;

				int var5 = var6 & 255;
				var5 += var3;
				if (var5 < 1)
					var5 = 1;
				else if (var5 > 255)
					var5 = 255;

				anIntArray1722[var4] = (var8 << 16) + (var7 << 8) + var5;
			}
		}

	}

	public void method910() {
		if ((anInt1720 != anInt1724) || (anInt1725 != anInt1719)) {
			final int[] var2 = new int[anInt1724 * anInt1719];

			for (int var3 = 0; var3 < anInt1725; ++var3)
				for (int var1 = 0; var1 < anInt1720; ++var1)
					var2[((var3 + anInt1721) * anInt1724) + var1 + anInt1723] = anIntArray1722[(var3 * anInt1720)
							+ var1];

			anIntArray1722 = var2;
			anInt1720 = anInt1724;
			anInt1725 = anInt1719;
			anInt1723 = 0;
			anInt1721 = 0;
		}
	}

	public void method911() {
		final int[] var1 = new int[anInt1720 * anInt1725];
		int var2 = 0;

		for (int var3 = 0; var3 < anInt1725; ++var3)
			for (int var4 = anInt1720 - 1; var4 >= 0; --var4)
				var1[var2++] = anIntArray1722[var4 + (var3 * anInt1720)];

		anIntArray1722 = var1;
		anInt1723 = anInt1724 - anInt1720 - anInt1723;
	}

	public void method912() {
		final int[] var1 = new int[anInt1720 * anInt1725];
		int var4 = 0;

		for (int var2 = anInt1725 - 1; var2 >= 0; --var2)
			for (int var3 = 0; var3 < anInt1720; ++var3)
				var1[var4++] = anIntArray1722[var3 + (var2 * anInt1720)];

		anIntArray1722 = var1;
		anInt1721 = anInt1719 - anInt1725 - anInt1721;
	}

	public Class109_Sub21_Sub14_Sub2() {
	}

	public void method913(final int var1) {
		for (int var2 = anInt1725 - 1; var2 > 0; --var2) {
			final int var3 = var2 * anInt1720;

			for (int var4 = anInt1720 - 1; var4 > 0; --var4)
				if ((anIntArray1722[var4 + var3] == 0) && (anIntArray1722[(var4 + var3) - 1 - anInt1720] != 0))
					anIntArray1722[var4 + var3] = var1;
		}

	}

	public void method914(int var1, int var2) {
		var1 += anInt1723;
		var2 += anInt1721;
		int var5 = var1 + (var2 * anInt1553);
		int var9 = 0;
		int var7 = anInt1725;
		int var3 = anInt1720;
		int var8 = anInt1553 - var3;
		int var6 = 0;
		int var4;
		if (var2 < anInt1555) {
			var4 = anInt1555 - var2;
			var7 -= var4;
			var2 = anInt1555;
			var9 += var4 * var3;
			var5 += var4 * anInt1553;
		}

		if ((var2 + var7) > anInt1556)
			var7 -= (var2 + var7) - anInt1556;

		if (var1 < anInt1557) {
			var4 = anInt1557 - var1;
			var3 -= var4;
			var1 = anInt1557;
			var9 += var4;
			var5 += var4;
			var6 += var4;
			var8 += var4;
		}

		if ((var1 + var3) > anInt1552) {
			var4 = (var1 + var3) - anInt1552;
			var3 -= var4;
			var6 += var4;
			var8 += var4;
		}

		if ((var3 > 0) && (var7 > 0))
			method915(anIntArray1558, anIntArray1722, var9, var5, var3, var7, var8, var6);
	}

	static void method915(final int[] var0, final int[] var1, int var2, int var3, final int var4, final int var5,
			final int var6, final int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) {
			int var9;
			for (var9 = (var3 + var4) - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++])
				;

			var3 += var6;
			var2 += var7;
		}

	}

	static void method916(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method917(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11) {
		final int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			final int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0)
					var0[var5++] = var2;
				else
					++var5;

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	public void method918(int var1, int var2, final int var3, final int var4) {
		var1 += anInt1723;
		var2 += anInt1721;
		int var11 = var1 + (var2 * anInt1553);
		int var5 = 0;
		int var9 = anInt1725;
		int var7 = anInt1720;
		int var10 = anInt1553 - var7;
		int var8 = 0;
		int var6;
		if (var2 < anInt1555) {
			var6 = anInt1555 - var2;
			var9 -= var6;
			var2 = anInt1555;
			var5 += var6 * var7;
			var11 += var6 * anInt1553;
		}

		if ((var2 + var9) > anInt1556)
			var9 -= (var2 + var9) - anInt1556;

		if (var1 < anInt1557) {
			var6 = anInt1557 - var1;
			var7 -= var6;
			var1 = anInt1557;
			var5 += var6;
			var11 += var6;
			var8 += var6;
			var10 += var6;
		}

		if ((var1 + var7) > anInt1552) {
			var6 = (var1 + var7) - anInt1552;
			var7 -= var6;
			var8 += var6;
			var10 += var6;
		}

		if ((var7 > 0) && (var9 > 0))
			method933(anIntArray1558, anIntArray1722, 0, var5, var11, var7, var9, var10, var8, var3, var4);
	}

	public void method919(int var1, int var2) {
		var1 += anInt1723;
		var2 += anInt1721;
		int var3 = var1 + (var2 * anInt1553);
		int var4 = 0;
		int var9 = anInt1725;
		int var7 = anInt1720;
		int var8 = anInt1553 - var7;
		int var5 = 0;
		int var6;
		if (var2 < anInt1555) {
			var6 = anInt1555 - var2;
			var9 -= var6;
			var2 = anInt1555;
			var4 += var6 * var7;
			var3 += var6 * anInt1553;
		}

		if ((var2 + var9) > anInt1556)
			var9 -= (var2 + var9) - anInt1556;

		if (var1 < anInt1557) {
			var6 = anInt1557 - var1;
			var7 -= var6;
			var1 = anInt1557;
			var4 += var6;
			var3 += var6;
			var5 += var6;
			var8 += var6;
		}

		if ((var1 + var7) > anInt1552) {
			var6 = (var1 + var7) - anInt1552;
			var7 -= var6;
			var5 += var6;
			var8 += var6;
		}

		if ((var7 > 0) && (var9 > 0))
			method916(anIntArray1558, anIntArray1722, 0, var4, var3, var7, var9, var8, var5);
	}

	static void method920(final int[] var0, final int[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9) {
		final int var10 = 256 - var9;

		for (int var13 = -var6; var13 < 0; ++var13) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					final int var11 = var0[var4];
					var0[var4++] = (((((var2 & 16711935) * var9) + ((var11 & 16711935) * var10)) & -16711936)
							+ ((((var2 & '\uff00') * var9) + ((var11 & '\uff00') * var10)) & 16711680)) >> 8;
				} else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method921(int var1, int var2, int var3, int var4, final int var5) {
		if ((var3 > 0) && (var4 > 0)) {
			final int var6 = anInt1720;
			final int var15 = anInt1725;
			int var14 = 0;
			int var8 = 0;
			final int var11 = anInt1724;
			final int var13 = anInt1719;
			final int var12 = (var11 << 16) / var3;
			final int var10 = (var13 << 16) / var4;
			int var9;
			if (anInt1723 > 0) {
				var9 = (((anInt1723 << 16) + var12) - 1) / var12;
				var1 += var9;
				var14 += (var9 * var12) - (anInt1723 << 16);
			}

			if (anInt1721 > 0) {
				var9 = (((anInt1721 << 16) + var10) - 1) / var10;
				var2 += var9;
				var8 += (var9 * var10) - (anInt1721 << 16);
			}

			if (var6 < var11)
				var3 = ((((var6 << 16) - var14) + var12) - 1) / var12;

			if (var15 < var13)
				var4 = ((((var15 << 16) - var8) + var10) - 1) / var10;

			var9 = var1 + (var2 * anInt1553);
			int var16 = anInt1553 - var3;
			if ((var2 + var4) > anInt1556)
				var4 -= (var2 + var4) - anInt1556;

			int var7;
			if (var2 < anInt1555) {
				var7 = anInt1555 - var2;
				var4 -= var7;
				var9 += var7 * anInt1553;
				var8 += var10 * var7;
			}

			if ((var1 + var3) > anInt1552) {
				var7 = (var1 + var3) - anInt1552;
				var3 -= var7;
				var16 += var7;
			}

			if (var1 < anInt1557) {
				var7 = anInt1557 - var1;
				var3 -= var7;
				var9 += var7;
				var14 += var12 * var7;
				var16 += var7;
			}

			method922(anIntArray1558, anIntArray1722, 0, var14, var8, var9, var16, var3, var4, var12, var10, var6,
					var5);
		}
	}

	static void method922(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11, final int var12) {
		final int var13 = 256 - var12;
		final int var18 = var3;

		for (int var15 = -var8; var15 < 0; ++var15) {
			final int var16 = (var4 >> 16) * var11;

			for (int var14 = -var7; var14 < 0; ++var14) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					final int var17 = var0[var5];
					var0[var5++] = (((((var2 & 16711935) * var12) + ((var17 & 16711935) * var13)) & -16711936)
							+ ((((var2 & '\uff00') * var12) + ((var17 & '\uff00') * var13)) & 16711680)) >> 8;
				} else
					++var5;

				var3 += var9;
			}

			var4 += var10;
			var3 = var18;
			var5 += var6;
		}

	}

	public void method923(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int[] var7, final int[] var8) {
		final int var11 = var2 < 0 ? -var2 : 0;
		final int var15 = (var2 + anInt1725) <= var6 ? anInt1725 : var6 - var2;
		final int var13 = var1 < 0 ? -var1 : 0;
		if ((var1 + anInt1720) <= var5) {
		} else {
		}

		int var19 = var3 + var1 + var13 + ((var4 + var2 + var11) * anInt1553);
		int var12 = var2 + var11;

		for (int var17 = var11; var17 < var15; ++var17) {
			final int var16 = var7[var12];
			final int var18 = var8[var12++];
			int var20 = var19;
			int var14;
			if (var1 < var16) {
				var14 = var16 - var1;
				var20 = var19 + (var14 - var13);
			} else
				var14 = var13;

			int var10;
			if ((var1 + anInt1720) <= (var16 + var18))
				var10 = anInt1720;
			else
				var10 = (var16 + var18) - var1;

			for (int var9 = var14; var9 < var10; ++var9) {
				final int var21 = anIntArray1722[var9 + (var17 * anInt1720)];
				if (var21 != 0)
					anIntArray1558[var20++] = var21;
				else
					++var20;
			}

			var19 += anInt1553;
		}

	}

	public void method924(int var1, int var2, final int var3, final int var4, final int var5, final int var6,
			final double var7, final int var9) {
		try {
			final int var10 = -var3 / 2;
			final int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = (var12 * var9) >> 8;
			var13 = (var13 * var9) >> 8;
			int var14 = (var5 << 16) + (var11 * var12) + (var10 * var13);
			int var15 = (var6 << 16) + ((var11 * var13) - (var10 * var12));
			int var16 = var1 + (var2 * anInt1553);

			for (var2 = 0; var2 < var4; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; ++var1) {
					final int var20 = anIntArray1722[(var18 >> 16) + ((var19 >> 16) * anInt1720)];
					if (var20 != 0)
						anIntArray1558[var17++] = var20;
					else
						++var17;

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += anInt1553;
			}
		} catch (final Exception var22) {
			;
		}

	}

	void method925(int var1, int var2, final int var3, final int var4, final int var5, final int var6) {
		if (var6 != 0) {
			var1 -= anInt1723 << 4;
			var2 -= anInt1721 << 4;
			final double var11 = (var5 & '\uffff') * 9.587379924285257E-5D;
			final int var13 = (int) Math.floor((Math.sin(var11) * var6) + 0.5D);
			final int var14 = (int) Math.floor((Math.cos(var11) * var6) + 0.5D);
			final int var15 = (-var1 * var14) + (-var2 * var13);
			final int var16 = (-(-var1) * var13) + (-var2 * var14);
			final int var17 = (((anInt1720 << 4) - var1) * var14) + (-var2 * var13);
			final int var32 = (-((anInt1720 << 4) - var1) * var13) + (-var2 * var14);
			final int var26 = (-var1 * var14) + (((anInt1725 << 4) - var2) * var13);
			final int var20 = (-(-var1) * var13) + (((anInt1725 << 4) - var2) * var14);
			final int var28 = (((anInt1720 << 4) - var1) * var14) + (((anInt1725 << 4) - var2) * var13);
			final int var21 = (-((anInt1720 << 4) - var1) * var13) + (((anInt1725 << 4) - var2) * var14);
			int var22;
			int var23;
			if (var15 < var17) {
				var23 = var15;
				var22 = var17;
			} else {
				var23 = var17;
				var22 = var15;
			}

			if (var26 < var23)
				var23 = var26;

			if (var28 < var23)
				var23 = var28;

			if (var26 > var22)
				var22 = var26;

			if (var28 > var22)
				var22 = var28;

			int var30;
			int var33;
			if (var16 < var32) {
				var30 = var16;
				var33 = var32;
			} else {
				var30 = var32;
				var33 = var16;
			}

			if (var20 < var30)
				var30 = var20;

			if (var21 < var30)
				var30 = var21;

			if (var20 > var33)
				var33 = var20;

			if (var21 > var33)
				var33 = var21;

			var23 >>= 12;
			var22 = (var22 + 4095) >> 12;
			var30 >>= 12;
			var33 = (var33 + 4095) >> 12;
			var23 += var3;
			var22 += var3;
			var30 += var4;
			var33 += var4;
			var23 >>= 4;
			var22 = (var22 + 15) >> 4;
			var30 >>= 4;
			var33 = (var33 + 15) >> 4;
			if (var23 < anInt1557)
				var23 = anInt1557;

			if (var22 > anInt1552)
				var22 = anInt1552;

			if (var30 < anInt1555)
				var30 = anInt1555;

			if (var33 > anInt1556)
				var33 = anInt1556;

			var22 = var23 - var22;
			if (var22 < 0) {
				var33 = var30 - var33;
				if (var33 < 0) {
					int var7 = (var30 * anInt1553) + var23;
					final double var35 = 1.6777216E7D / var6;
					final int var29 = (int) Math.floor((Math.sin(var11) * var35) + 0.5D);
					final int var10 = (int) Math.floor((Math.cos(var11) * var35) + 0.5D);
					final int var34 = ((var23 << 4) + 8) - var3;
					final int var37 = ((var30 << 4) + 8) - var4;
					int var38 = (var1 << 8) - ((var37 * var29) >> 4);
					int var25 = (var2 << 8) + ((var37 * var10) >> 4);
					int var8;
					int var9;
					int var18;
					int var19;
					int var24;
					int var27;
					int var31;
					if (var10 == 0) {
						if (var29 == 0)
							for (var24 = var33; var24 < 0; var7 += anInt1553) {
								var8 = var7;
								var9 = var38;
								var18 = var25;
								var27 = var22;
								if ((var38 >= 0) && (var25 >= 0) && ((var38 - (anInt1720 << 12)) < 0)
										&& ((var25 - (anInt1725 << 12)) < 0))
									for (; var27 < 0; ++var27) {
										var31 = anIntArray1722[((var18 >> 12) * anInt1720) + (var9 >> 12)];
										if (var31 != 0)
											anIntArray1558[var8++] = var31;
										else
											++var8;
									}

								++var24;
							}
						else if (var29 < 0)
							for (var24 = var33; var24 < 0; var7 += anInt1553) {
								var8 = var7;
								var9 = var38;
								var18 = var25 + ((var34 * var29) >> 4);
								var27 = var22;
								if ((var38 >= 0) && ((var38 - (anInt1720 << 12)) < 0)) {
									if ((var19 = var18 - (anInt1725 << 12)) >= 0) {
										var19 = (var29 - var19) / var29;
										var27 = var22 + var19;
										var18 += var29 * var19;
										var8 = var7 + var19;
									}

									if ((var19 = (var18 - var29) / var29) > var27)
										var27 = var19;

									while (var27 < 0) {
										var31 = anIntArray1722[((var18 >> 12) * anInt1720) + (var9 >> 12)];
										if (var31 != 0)
											anIntArray1558[var8++] = var31;
										else
											++var8;

										var18 += var29;
										++var27;
									}
								}

								++var24;
								var38 -= var29;
							}
						else
							for (var24 = var33; var24 < 0; var7 += anInt1553) {
								var8 = var7;
								var9 = var38;
								var18 = var25 + ((var34 * var29) >> 4);
								var27 = var22;
								if ((var38 >= 0) && ((var38 - (anInt1720 << 12)) < 0)) {
									if (var18 < 0) {
										var19 = (var29 - 1 - var18) / var29;
										var27 = var22 + var19;
										var18 += var29 * var19;
										var8 = var7 + var19;
									}

									if ((var19 = ((1 + var18) - (anInt1725 << 12) - var29) / var29) > var27)
										var27 = var19;

									while (var27 < 0) {
										var31 = anIntArray1722[((var18 >> 12) * anInt1720) + (var9 >> 12)];
										if (var31 != 0)
											anIntArray1558[var8++] = var31;
										else
											++var8;

										var18 += var29;
										++var27;
									}
								}

								++var24;
								var38 -= var29;
							}
					} else if (var10 < 0) {
						if (var29 == 0)
							for (var24 = var33; var24 < 0; var7 += anInt1553) {
								var8 = var7;
								var9 = var38 + ((var34 * var10) >> 4);
								var18 = var25;
								var27 = var22;
								if ((var25 >= 0) && ((var25 - (anInt1725 << 12)) < 0)) {
									if ((var19 = var9 - (anInt1720 << 12)) >= 0) {
										var19 = (var10 - var19) / var10;
										var27 = var22 + var19;
										var9 += var10 * var19;
										var8 = var7 + var19;
									}

									if ((var19 = (var9 - var10) / var10) > var27)
										var27 = var19;

									while (var27 < 0) {
										var31 = anIntArray1722[((var18 >> 12) * anInt1720) + (var9 >> 12)];
										if (var31 != 0)
											anIntArray1558[var8++] = var31;
										else
											++var8;

										var9 += var10;
										++var27;
									}
								}

								++var24;
								var25 += var10;
							}
						else if (var29 < 0)
							for (var24 = var33; var24 < 0; var7 += anInt1553) {
								var8 = var7;
								var9 = var38 + ((var34 * var10) >> 4);
								var18 = var25 + ((var34 * var29) >> 4);
								var27 = var22;
								if ((var19 = var9 - (anInt1720 << 12)) >= 0) {
									var19 = (var10 - var19) / var10;
									var27 = var22 + var19;
									var9 += var10 * var19;
									var18 += var29 * var19;
									var8 = var7 + var19;
								}

								if ((var19 = (var9 - var10) / var10) > var27)
									var27 = var19;

								if ((var19 = var18 - (anInt1725 << 12)) >= 0) {
									var19 = (var29 - var19) / var29;
									var27 += var19;
									var9 += var10 * var19;
									var18 += var29 * var19;
									var8 += var19;
								}

								if ((var19 = (var18 - var29) / var29) > var27)
									var27 = var19;

								while (var27 < 0) {
									var31 = anIntArray1722[((var18 >> 12) * anInt1720) + (var9 >> 12)];
									if (var31 != 0)
										anIntArray1558[var8++] = var31;
									else
										++var8;

									var9 += var10;
									var18 += var29;
									++var27;
								}

								++var24;
								var38 -= var29;
								var25 += var10;
							}
						else
							for (var24 = var33; var24 < 0; var7 += anInt1553) {
								var8 = var7;
								var9 = var38 + ((var34 * var10) >> 4);
								var18 = var25 + ((var34 * var29) >> 4);
								var27 = var22;
								if ((var19 = var9 - (anInt1720 << 12)) >= 0) {
									var19 = (var10 - var19) / var10;
									var27 = var22 + var19;
									var9 += var10 * var19;
									var18 += var29 * var19;
									var8 = var7 + var19;
								}

								if ((var19 = (var9 - var10) / var10) > var27)
									var27 = var19;

								if (var18 < 0) {
									var19 = (var29 - 1 - var18) / var29;
									var27 += var19;
									var9 += var10 * var19;
									var18 += var29 * var19;
									var8 += var19;
								}

								if ((var19 = ((1 + var18) - (anInt1725 << 12) - var29) / var29) > var27)
									var27 = var19;

								while (var27 < 0) {
									var31 = anIntArray1722[((var18 >> 12) * anInt1720) + (var9 >> 12)];
									if (var31 != 0)
										anIntArray1558[var8++] = var31;
									else
										++var8;

									var9 += var10;
									var18 += var29;
									++var27;
								}

								++var24;
								var38 -= var29;
								var25 += var10;
							}
					} else if (var29 == 0)
						for (var24 = var33; var24 < 0; var7 += anInt1553) {
							var8 = var7;
							var9 = var38 + ((var34 * var10) >> 4);
							var18 = var25;
							var27 = var22;
							if ((var25 >= 0) && ((var25 - (anInt1725 << 12)) < 0)) {
								if (var9 < 0) {
									var19 = (var10 - 1 - var9) / var10;
									var27 = var22 + var19;
									var9 += var10 * var19;
									var8 = var7 + var19;
								}

								if ((var19 = ((1 + var9) - (anInt1720 << 12) - var10) / var10) > var27)
									var27 = var19;

								while (var27 < 0) {
									var31 = anIntArray1722[((var18 >> 12) * anInt1720) + (var9 >> 12)];
									if (var31 != 0)
										anIntArray1558[var8++] = var31;
									else
										++var8;

									var9 += var10;
									++var27;
								}
							}

							++var24;
							var25 += var10;
						}
					else if (var29 < 0)
						for (var24 = var33; var24 < 0; var7 += anInt1553) {
							var8 = var7;
							var9 = var38 + ((var34 * var10) >> 4);
							var18 = var25 + ((var34 * var29) >> 4);
							var27 = var22;
							if (var9 < 0) {
								var19 = (var10 - 1 - var9) / var10;
								var27 = var22 + var19;
								var9 += var10 * var19;
								var18 += var29 * var19;
								var8 = var7 + var19;
							}

							if ((var19 = ((1 + var9) - (anInt1720 << 12) - var10) / var10) > var27)
								var27 = var19;

							if ((var19 = var18 - (anInt1725 << 12)) >= 0) {
								var19 = (var29 - var19) / var29;
								var27 += var19;
								var9 += var10 * var19;
								var18 += var29 * var19;
								var8 += var19;
							}

							if ((var19 = (var18 - var29) / var29) > var27)
								var27 = var19;

							while (var27 < 0) {
								var31 = anIntArray1722[((var18 >> 12) * anInt1720) + (var9 >> 12)];
								if (var31 != 0)
									anIntArray1558[var8++] = var31;
								else
									++var8;

								var9 += var10;
								var18 += var29;
								++var27;
							}

							++var24;
							var38 -= var29;
							var25 += var10;
						}
					else
						for (var24 = var33; var24 < 0; var7 += anInt1553) {
							var8 = var7;
							var9 = var38 + ((var34 * var10) >> 4);
							var18 = var25 + ((var34 * var29) >> 4);
							var27 = var22;
							if (var9 < 0) {
								var19 = (var10 - 1 - var9) / var10;
								var27 = var22 + var19;
								var9 += var10 * var19;
								var18 += var29 * var19;
								var8 = var7 + var19;
							}

							if ((var19 = ((1 + var9) - (anInt1720 << 12) - var10) / var10) > var27)
								var27 = var19;

							if (var18 < 0) {
								var19 = (var29 - 1 - var18) / var29;
								var27 += var19;
								var9 += var10 * var19;
								var18 += var29 * var19;
								var8 += var19;
							}

							if ((var19 = ((1 + var18) - (anInt1725 << 12) - var29) / var29) > var27)
								var27 = var19;

							while (var27 < 0) {
								var31 = anIntArray1722[((var18 >> 12) * anInt1720) + (var9 >> 12)];
								if (var31 != 0)
									anIntArray1558[var8++] = var31;
								else
									++var8;

								var9 += var10;
								var18 += var29;
								++var27;
							}

							++var24;
							var38 -= var29;
							var25 += var10;
						}

				}
			}
		}
	}

	public void method926(final int var1) {
		final int[] var2 = new int[anInt1720 * anInt1725];
		int var3 = 0;

		for (int var5 = 0; var5 < anInt1725; ++var5)
			for (int var6 = 0; var6 < anInt1720; ++var6) {
				int var4 = anIntArray1722[var3];
				if (var4 == 0)
					if ((var6 > 0) && (anIntArray1722[var3 - 1] != 0))
						var4 = var1;
					else if ((var5 > 0) && (anIntArray1722[var3 - anInt1720] != 0))
						var4 = var1;
					else if ((var6 < (anInt1720 - 1)) && (anIntArray1722[var3 + 1] != 0))
						var4 = var1;
					else if ((var5 < (anInt1725 - 1)) && (anIntArray1722[var3 + anInt1720] != 0))
						var4 = var1;

				var2[var3++] = var4;
			}

		anIntArray1722 = var2;
	}

	public Class109_Sub21_Sub14_Sub2 method927() {
		final Class109_Sub21_Sub14_Sub2 var1 = new Class109_Sub21_Sub14_Sub2(anInt1720, anInt1725);
		var1.anInt1724 = anInt1724;
		var1.anInt1719 = anInt1719;
		var1.anInt1723 = anInt1724 - anInt1720 - anInt1723;
		var1.anInt1721 = anInt1721;

		for (int var3 = 0; var3 < anInt1725; ++var3)
			for (int var2 = 0; var2 < anInt1720; ++var2)
				var1.anIntArray1722[(var3 * anInt1720) + var2] = anIntArray1722[((var3 * anInt1720) + anInt1720) - 1
						- var2];

		return var1;
	}

	public void method928(int var1, int var2, int var3, int var4) {
		if ((var3 > 0) && (var4 > 0)) {
			final int var11 = anInt1720;
			final int var12 = anInt1725;
			int var7 = 0;
			int var8 = 0;
			final int var15 = anInt1724;
			final int var13 = anInt1719;
			final int var10 = (var15 << 16) / var3;
			final int var5 = (var13 << 16) / var4;
			int var6;
			if (anInt1723 > 0) {
				var6 = (((anInt1723 << 16) + var10) - 1) / var10;
				var1 += var6;
				var7 += (var6 * var10) - (anInt1723 << 16);
			}

			if (anInt1721 > 0) {
				var6 = (((anInt1721 << 16) + var5) - 1) / var5;
				var2 += var6;
				var8 += (var6 * var5) - (anInt1721 << 16);
			}

			if (var11 < var15)
				var3 = ((((var11 << 16) - var7) + var10) - 1) / var10;

			if (var12 < var13)
				var4 = ((((var12 << 16) - var8) + var5) - 1) / var5;

			var6 = var1 + (var2 * anInt1553);
			int var9 = anInt1553 - var3;
			if ((var2 + var4) > anInt1556)
				var4 -= (var2 + var4) - anInt1556;

			int var14;
			if (var2 < anInt1555) {
				var14 = anInt1555 - var2;
				var4 -= var14;
				var6 += var14 * anInt1553;
				var8 += var5 * var14;
			}

			if ((var1 + var3) > anInt1552) {
				var14 = (var1 + var3) - anInt1552;
				var3 -= var14;
				var9 += var14;
			}

			if (var1 < anInt1557) {
				var14 = anInt1557 - var1;
				var3 -= var14;
				var6 += var14;
				var7 += var10 * var14;
				var9 += var14;
			}

			method917(anIntArray1558, anIntArray1722, 0, var7, var8, var6, var9, var3, var4, var10, var5, var11);
		}
	}

	public void method929(int var1, int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int[] var9, final int[] var10) {
		try {
			final int var11 = -var3 / 2;
			final int var12 = -var4 / 2;
			int var13 = (int) (Math.sin(var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(var7 / 326.11D) * 65536.0D);
			var13 = (var13 * var8) >> 8;
			var14 = (var14 * var8) >> 8;
			int var15 = (var5 << 16) + (var12 * var13) + (var11 * var14);
			int var16 = (var6 << 16) + ((var12 * var14) - (var11 * var13));
			int var17 = var1 + (var2 * anInt1553);

			for (var2 = 0; var2 < var4; ++var2) {
				final int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + (var14 * var18);
				int var21 = var16 - (var13 * var18);

				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					anIntArray1558[var19++] = anIntArray1722[(var20 >> 16) + ((var21 >> 16) * anInt1720)];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += anInt1553;
			}
		} catch (final Exception var23) {
			;
		}

	}

	public void method930(final int var1, final int var2, final int var3, final int var4) {
		method925(anInt1724 << 3, anInt1719 << 3, var1 << 4, var2 << 4, var3, var4);
	}

	public Class109_Sub21_Sub14_Sub2(final byte[] var1, final Component var2) {
		try {
			final Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
			final MediaTracker var4 = new MediaTracker(var2);
			var4.addImage(var3, 0);
			var4.waitForAll();
			anInt1720 = var3.getWidth(var2);
			anInt1725 = var3.getHeight(var2);
			anInt1724 = anInt1720;
			anInt1719 = anInt1725;
			anInt1723 = 0;
			anInt1721 = 0;
			anIntArray1722 = new int[anInt1720 * anInt1725];
			final PixelGrabber var5 = new PixelGrabber(var3, 0, 0, anInt1720, anInt1725, anIntArray1722, 0, anInt1720);
			var5.grabPixels();
		} catch (final InterruptedException var6) {
			;
		}

	}

	public void method931(final int var1) {
		if ((anInt1720 != anInt1724) || (anInt1725 != anInt1719)) {
			int var4 = var1;
			if (var1 > anInt1723)
				var4 = anInt1723;

			int var6 = var1;
			if ((var1 + anInt1723 + anInt1720) > anInt1724)
				var6 = anInt1724 - anInt1723 - anInt1720;

			int var3 = var1;
			if (var1 > anInt1721)
				var3 = anInt1721;

			int var8 = var1;
			if ((var1 + anInt1721 + anInt1725) > anInt1719)
				var8 = anInt1719 - anInt1721 - anInt1725;

			final int var5 = anInt1720 + var4 + var6;
			final int var9 = anInt1725 + var3 + var8;
			final int[] var10 = new int[var5 * var9];

			for (int var2 = 0; var2 < anInt1725; ++var2)
				for (int var7 = 0; var7 < anInt1720; ++var7)
					var10[((var2 + var3) * var5) + var7 + var4] = anIntArray1722[(var2 * anInt1720) + var7];

			anIntArray1722 = var10;
			anInt1720 = var5;
			anInt1725 = var9;
			anInt1723 -= var4;
			anInt1721 -= var3;
		}
	}

	public void method932(int var1, int var2, final int var3) {
		var1 += anInt1723;
		var2 += anInt1721;
		int var5 = var1 + (var2 * anInt1553);
		int var6 = 0;
		int var4 = anInt1725;
		int var8 = anInt1720;
		int var9 = anInt1553 - var8;
		int var10 = 0;
		int var7;
		if (var2 < anInt1555) {
			var7 = anInt1555 - var2;
			var4 -= var7;
			var2 = anInt1555;
			var6 += var7 * var8;
			var5 += var7 * anInt1553;
		}

		if ((var2 + var4) > anInt1556)
			var4 -= (var2 + var4) - anInt1556;

		if (var1 < anInt1557) {
			var7 = anInt1557 - var1;
			var8 -= var7;
			var1 = anInt1557;
			var6 += var7;
			var5 += var7;
			var10 += var7;
			var9 += var7;
		}

		if ((var1 + var8) > anInt1552) {
			var7 = (var1 + var8) - anInt1552;
			var8 -= var7;
			var10 += var7;
			var9 += var7;
		}

		if ((var8 > 0) && (var4 > 0))
			method920(anIntArray1558, anIntArray1722, 0, var6, var5, var8, var4, var9, var10, var3);
	}

	static void method933(final int[] var0, final int[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, int var10) {
		final int var11 = 256 - var9;
		int var12 = ((var10 & 16711935) * var11) & -16711936;
		int var13 = ((var10 & '\uff00') * var11) & 16711680;
		var10 = (var12 | var13) >>> 8;

		for (int var14 = -var6; var14 < 0; ++var14) {
			for (int var15 = -var5; var15 < 0; ++var15) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = ((var2 & 16711935) * var9) & -16711936;
					var13 = ((var2 & '\uff00') * var9) & 16711680;
					var0[var4++] = ((var12 | var13) >>> 8) + var10;
				} else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}
}
