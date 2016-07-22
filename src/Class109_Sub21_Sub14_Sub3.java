public class Class109_Sub21_Sub14_Sub3 extends Class109_Sub21_Sub14 {
	static int anInt1823;
	static int anInt1824;
	static int anInt1834;
	static int anInt1816;
	static int anInt1829;
	static int anInt1830;
	static boolean aBool1820 = false;
	static int anInt1827;
	static int anInt1826;
	static int[] anIntArray1821 = new int[1024];
	static boolean aBool1817 = false;
	static boolean aBool1828 = false;
	public static boolean aBool1818 = true;
	static int anInt1819 = 0;
	public static int anInt1822 = 512;
	public static int[] anIntArray1832 = new int[65536];
	static int[] anIntArray1825 = new int[512];
	static int[] anIntArray1831 = new int[2048];
	public static int[] anIntArray1835 = new int[2048];
	public static int[] anIntArray1836 = new int[2048];
	public static Interface3 anInterface3_1833;

	public static final void method960() {
		anInt1823 = anInt1827 / 2;
		anInt1824 = anInt1826 / 2;
		anInt1834 = -anInt1823;
		anInt1816 = anInt1827 - anInt1823;
		anInt1829 = -anInt1824;
		anInt1830 = anInt1826 - anInt1824;
	}

	public static final void method961(final int var0, final int var1) {
		final int var2 = anIntArray1821[0];
		final int var3 = var2 / anInt1553;
		final int var4 = var2 - (var3 * anInt1553);
		anInt1823 = var0 - var4;
		anInt1824 = var1 - var3;
		anInt1834 = -anInt1823;
		anInt1816 = anInt1827 - anInt1823;
		anInt1829 = -anInt1824;
		anInt1830 = anInt1826 - anInt1824;
	}

	static final void method962(double var0, final int var2, final int var3) {
		var0 += (Math.random() * 0.03D) - 0.015D;
		int var32 = var2 * 128;

		for (int var6 = var2; var6 < var3; ++var6) {
			final double var7 = ((var6 >> 3) / 64.0D) + 0.0078125D;
			final double var9 = ((var6 & 7) / 8.0D) + 0.0625D;

			for (int var11 = 0; var11 < 128; ++var11) {
				final double var12 = var11 / 128.0D;
				double var14 = var12;
				double var16 = var12;
				double var18 = var12;
				if (var9 != 0.0D) {
					double var22;
					if (var12 < 0.5D)
						var22 = var12 * (1.0D + var9);
					else
						var22 = (var12 + var9) - (var12 * var9);

					final double var24 = (2.0D * var12) - var22;
					double var20 = var7 + 0.3333333333333333D;
					if (var20 > 1.0D)
						--var20;

					double var30 = var7 - 0.3333333333333333D;
					if (var30 < 0.0D)
						++var30;

					if ((6.0D * var20) < 1.0D)
						var14 = var24 + ((var22 - var24) * 6.0D * var20);
					else if ((2.0D * var20) < 1.0D)
						var14 = var22;
					else if ((3.0D * var20) < 2.0D)
						var14 = var24 + ((var22 - var24) * (0.6666666666666666D - var20) * 6.0D);
					else
						var14 = var24;

					if ((6.0D * var7) < 1.0D)
						var16 = var24 + ((var22 - var24) * 6.0D * var7);
					else if ((2.0D * var7) < 1.0D)
						var16 = var22;
					else if ((3.0D * var7) < 2.0D)
						var16 = var24 + ((var22 - var24) * (0.6666666666666666D - var7) * 6.0D);
					else
						var16 = var24;

					if ((6.0D * var30) < 1.0D)
						var18 = var24 + ((var22 - var24) * 6.0D * var30);
					else if ((2.0D * var30) < 1.0D)
						var18 = var22;
					else if ((3.0D * var30) < 2.0D)
						var18 = var24 + ((var22 - var24) * (0.6666666666666666D - var30) * 6.0D);
					else
						var18 = var24;
				}

				final int var27 = (int) (var14 * 256.0D);
				final int var28 = (int) (var16 * 256.0D);
				final int var29 = (int) (var18 * 256.0D);
				int var26 = (var27 << 16) + (var28 << 8) + var29;
				var26 = method963(var26, var0);
				if (var26 == 0)
					var26 = 1;

				anIntArray1832[var32++] = var26;
			}
		}

	}

	static int method963(final int var0, final double var1) {
		double var3 = (var0 >> 16) / 256.0D;
		double var8 = ((var0 >> 8) & 255) / 256.0D;
		double var5 = (var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var8 = Math.pow(var8, var1);
		var5 = Math.pow(var5, var1);
		final int var7 = (int) (var3 * 256.0D);
		final int var11 = (int) (var8 * 256.0D);
		final int var10 = (int) (var5 * 256.0D);
		return (var7 << 16) + (var11 << 8) + var10;
	}

	public static void method964(final int var0, final int var1, final int var2) {
		aBool1820 = (var0 < 0) || (var0 > anInt1827) || (var1 < 0) || (var1 > anInt1827) || (var2 < 0)
				|| (var2 > anInt1827);
	}

	public static final void method965(final double var0) {
		method962(var0, 0, 512);
	}

	static final void method966(final int[] var0, int var1, int var2, int var3, int var4, int var5, int var6,
			int var7) {
		if (aBool1820) {
			if (var5 > anInt1827)
				var5 = anInt1827;

			if (var4 < 0)
				var4 = 0;
		}

		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			if (aBool1818) {
				var3 = (var5 - var4) >> 2;
				var7 <<= 2;
				if (anInt1819 == 0) {
					if (var3 > 0)
						do {
							var2 = anIntArray1832[var6 >> 8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);

					var3 = (var5 - var4) & 3;
					if (var3 > 0) {
						var2 = anIntArray1832[var6 >> 8];

						do {
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}
				} else {
					var9 = anInt1819;
					var8 = 256 - anInt1819;
					if (var3 > 0)
						do {
							var2 = anIntArray1832[var6 >> 8];
							var6 += var7;
							var2 = ((((var2 & 16711935) * var8) >> 8) & 16711935)
									+ ((((var2 & '\uff00') * var8) >> 8) & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((((var10 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var10 & '\uff00') * var9) >> 8) & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((((var10 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var10 & '\uff00') * var9) >> 8) & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((((var10 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var10 & '\uff00') * var9) >> 8) & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((((var10 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var10 & '\uff00') * var9) >> 8) & '\uff00');
							--var3;
						} while (var3 > 0);

					var3 = (var5 - var4) & 3;
					if (var3 > 0) {
						var2 = anIntArray1832[var6 >> 8];
						var2 = ((((var2 & 16711935) * var8) >> 8) & 16711935)
								+ ((((var2 & '\uff00') * var8) >> 8) & '\uff00');

						do {
							var10 = var0[var1];
							var0[var1++] = var2 + ((((var10 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var10 & '\uff00') * var9) >> 8) & '\uff00');
							--var3;
						} while (var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4;
				if (anInt1819 == 0)
					do {
						var0[var1++] = anIntArray1832[var6 >> 8];
						var6 += var7;
						--var3;
					} while (var3 > 0);
				else {
					var9 = anInt1819;
					var8 = 256 - anInt1819;

					do {
						var2 = anIntArray1832[var6 >> 8];
						var6 += var7;
						var2 = ((((var2 & 16711935) * var8) >> 8) & 16711935)
								+ ((((var2 & '\uff00') * var8) >> 8) & '\uff00');
						var10 = var0[var1];
						var0[var1++] = var2 + ((((var10 & 16711935) * var9) >> 8) & 16711935)
								+ ((((var10 & '\uff00') * var9) >> 8) & '\uff00');
						--var3;
					} while (var3 > 0);
				}

			}
		}
	}

	public static final void method967(int var0, int var1, int var2, int var3, int var4, int var5, final int var6) {
		int var7 = 0;
		if (var1 != var0)
			var7 = ((var4 - var3) << 14) / (var1 - var0);

		int var8 = 0;
		if (var2 != var1)
			var8 = ((var5 - var4) << 14) / (var2 - var1);

		int var9 = 0;
		if (var2 != var0)
			var9 = ((var3 - var5) << 14) / (var0 - var2);

		if ((var0 <= var1) && (var0 <= var2)) {
			if (var0 < anInt1826) {
				if (var1 > anInt1826)
					var1 = anInt1826;

				if (var2 > anInt1826)
					var2 = anInt1826;

				if (var1 < var2) {
					var5 = var3 <<= 14;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if (((var0 != var1) && (var9 < var7)) || ((var0 == var1) && (var9 > var8))) {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1821[var0];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method968(anIntArray1558, var0, var6, 0, var5 >> 14, var4 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += anInt1553;
								}

							method968(anIntArray1558, var0, var6, 0, var5 >> 14, var3 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += anInt1553;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1821[var0];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method968(anIntArray1558, var0, var6, 0, var4 >> 14, var5 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += anInt1553;
								}

							method968(anIntArray1558, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += anInt1553;
						}
					}
				} else {
					var4 = var3 <<= 14;
					if (var0 < 0) {
						var4 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}

					if (((var0 == var2) || (var9 >= var7)) && ((var0 != var2) || (var8 <= var7))) {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1821[var0];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method968(anIntArray1558, var0, var6, 0, var3 >> 14, var5 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += anInt1553;
								}

							method968(anIntArray1558, var0, var6, 0, var3 >> 14, var4 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += anInt1553;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1821[var0];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method968(anIntArray1558, var0, var6, 0, var5 >> 14, var3 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += anInt1553;
								}

							method968(anIntArray1558, var0, var6, 0, var4 >> 14, var3 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += anInt1553;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < anInt1826) {
				if (var2 > anInt1826)
					var2 = anInt1826;

				if (var0 > anInt1826)
					var0 = anInt1826;

				if (var2 < var0) {
					var3 = var4 <<= 14;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if (((var1 != var2) && (var7 < var8)) || ((var1 == var2) && (var7 > var9))) {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1821[var1];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method968(anIntArray1558, var1, var6, 0, var3 >> 14, var5 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += anInt1553;
								}

							method968(anIntArray1558, var1, var6, 0, var3 >> 14, var4 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += anInt1553;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1821[var1];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method968(anIntArray1558, var1, var6, 0, var5 >> 14, var3 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += anInt1553;
								}

							method968(anIntArray1558, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += anInt1553;
						}
					}
				} else {
					var5 = var4 <<= 14;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var9 * var0;
						var0 = 0;
					}

					if (var7 < var8) {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1821[var1];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method968(anIntArray1558, var1, var6, 0, var3 >> 14, var4 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += anInt1553;
								}

							method968(anIntArray1558, var1, var6, 0, var5 >> 14, var4 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += anInt1553;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1821[var1];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method968(anIntArray1558, var1, var6, 0, var4 >> 14, var3 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += anInt1553;
								}

							method968(anIntArray1558, var1, var6, 0, var4 >> 14, var5 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += anInt1553;
						}
					}
				}
			}
		} else if (var2 < anInt1826) {
			if (var0 > anInt1826)
				var0 = anInt1826;

			if (var1 > anInt1826)
				var1 = anInt1826;

			if (var0 < var1) {
				var4 = var5 <<= 14;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 14;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1821[var2];

					while (true) {
						--var0;
						if (var0 < 0)
							while (true) {
								--var1;
								if (var1 < 0)
									return;

								method968(anIntArray1558, var2, var6, 0, var4 >> 14, var3 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += anInt1553;
							}

						method968(anIntArray1558, var2, var6, 0, var4 >> 14, var5 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += anInt1553;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1821[var2];

					while (true) {
						--var0;
						if (var0 < 0)
							while (true) {
								--var1;
								if (var1 < 0)
									return;

								method968(anIntArray1558, var2, var6, 0, var3 >> 14, var4 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += anInt1553;
							}

						method968(anIntArray1558, var2, var6, 0, var5 >> 14, var4 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += anInt1553;
					}
				}
			} else {
				var3 = var5 <<= 14;
				if (var2 < 0) {
					var3 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var4 <<= 14;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}

				if (var8 < var9) {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1821[var2];

					while (true) {
						--var1;
						if (var1 < 0)
							while (true) {
								--var0;
								if (var0 < 0)
									return;

								method968(anIntArray1558, var2, var6, 0, var4 >> 14, var5 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += anInt1553;
							}

						method968(anIntArray1558, var2, var6, 0, var3 >> 14, var5 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += anInt1553;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1821[var2];

					while (true) {
						--var1;
						if (var1 < 0)
							while (true) {
								--var0;
								if (var0 < 0)
									return;

								method968(anIntArray1558, var2, var6, 0, var5 >> 14, var4 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += anInt1553;
							}

						method968(anIntArray1558, var2, var6, 0, var5 >> 14, var3 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += anInt1553;
					}
				}
			}
		}
	}

	static final void method968(final int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (aBool1820) {
			if (var5 > anInt1827)
				var5 = anInt1827;

			if (var4 < 0)
				var4 = 0;
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = (var5 - var4) >> 2;
			if (anInt1819 != 0) {
				if (anInt1819 == 254)
					while (true) {
						--var3;
						if (var3 < 0) {
							var3 = (var5 - var4) & 3;

							while (true) {
								--var3;
								if (var3 < 0)
									return;

								var0[var1++] = var0[var1];
							}
						}

						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
					}
				else {
					final int var7 = anInt1819;
					final int var8 = 256 - anInt1819;
					var2 = ((((var2 & 16711935) * var8) >> 8) & 16711935)
							+ ((((var2 & '\uff00') * var8) >> 8) & '\uff00');

					while (true) {
						--var3;
						int var6;
						if (var3 < 0) {
							var3 = (var5 - var4) & 3;

							while (true) {
								--var3;
								if (var3 < 0)
									return;

								var6 = var0[var1];
								var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
										+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
							}
						}

						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
					}
				}
			} else
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = (var5 - var4) & 3;

						while (true) {
							--var3;
							if (var3 < 0)
								return;

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
		}
	}

	static final void method969(final int var0, final int var1, final int var2, final int var3) {
		anInt1827 = var2 - var0;
		anInt1826 = var3 - var1;
		method960();
		if (anIntArray1821.length < anInt1826)
			anIntArray1821 = new int[Class8.method47(anInt1826)];

		int var5 = (var1 * anInt1553) + var0;

		for (int var4 = 0; var4 < anInt1826; ++var4) {
			anIntArray1821[var4] = var5;
			var5 += anInt1553;
		}

	}

	static final void method970(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, final int var9, int var10, int var11, final int var12, int var13, int var14, final int var15,
			int var16, int var17, final int var18) {
		final int[] var19 = anInterface3_1833.method10(var18, 2055813669);
		int var20;
		if (var19 == null) {
			var20 = anInterface3_1833.method7(var18, -124544907);
			method974(var0, var1, var2, var3, var4, var5, method977(var20, var6), method977(var20, var7),
					method977(var20, var8));
		} else {
			aBool1817 = anInterface3_1833.method9(var18, 1160830629);
			aBool1828 = anInterface3_1833.method8(var18, (short) 23000);
			var20 = var4 - var3;
			final int var22 = var1 - var0;
			final int var23 = var5 - var3;
			final int var24 = var2 - var0;
			final int var25 = var7 - var6;
			final int var26 = var8 - var6;
			int var21 = 0;
			if (var1 != var0)
				var21 = ((var4 - var3) << 14) / (var1 - var0);

			int var27 = 0;
			if (var2 != var1)
				var27 = ((var5 - var4) << 14) / (var2 - var1);

			int var28 = 0;
			if (var2 != var0)
				var28 = ((var3 - var5) << 14) / (var0 - var2);

			final int var34 = (var20 * var24) - (var23 * var22);
			if (var34 != 0) {
				final int var35 = (((var25 * var24) - (var26 * var22)) << 9) / var34;
				final int var36 = (((var26 * var20) - (var25 * var23)) << 9) / var34;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var29 = ((var11 * var12) - (var14 * var9)) << 14;
				final int var40 = (int) (((long) ((var14 * var15) - (var17 * var12)) << 14) / anInt1822);
				final int var30 = (int) (((long) ((var17 * var9) - (var11 * var15)) << 14) / anInt1822);
				int var32 = ((var10 * var12) - (var13 * var9)) << 14;
				final int var41 = (int) (((long) ((var13 * var15) - (var16 * var12)) << 14) / anInt1822);
				final int var33 = (int) (((long) ((var16 * var9) - (var10 * var15)) << 14) / anInt1822);
				int var39 = ((var13 * var11) - (var10 * var14)) << 14;
				final int var37 = (int) (((long) ((var16 * var14) - (var13 * var17)) << 14) / anInt1822);
				final int var38 = (int) (((long) ((var10 * var17) - (var16 * var11)) << 14) / anInt1822);
				int var31;
				if ((var0 <= var1) && (var0 <= var2)) {
					if (var0 < anInt1826) {
						if (var1 > anInt1826)
							var1 = anInt1826;

						if (var2 > anInt1826)
							var2 = anInt1826;

						var6 = ((var6 << 9) - (var35 * var3)) + var35;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var28 * var0;
								var3 -= var21 * var0;
								var6 -= var36 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var27 * var1;
								var1 = 0;
							}

							var31 = var0 - anInt1824;
							var29 += var30 * var31;
							var32 += var33 * var31;
							var39 += var38 * var31;
							if (((var0 != var1) && (var28 < var21)) || ((var0 == var1) && (var28 > var27))) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1821[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method971(anIntArray1558, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6,
													var35, var29, var32, var39, var40, var41, var37);
											var5 += var28;
											var4 += var27;
											var6 += var36;
											var0 += anInt1553;
											var29 += var30;
											var32 += var33;
											var39 += var38;
										}

									method971(anIntArray1558, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var35,
											var29, var32, var39, var40, var41, var37);
									var5 += var28;
									var3 += var21;
									var6 += var36;
									var0 += anInt1553;
									var29 += var30;
									var32 += var33;
									var39 += var38;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1821[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method971(anIntArray1558, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6,
													var35, var29, var32, var39, var40, var41, var37);
											var5 += var28;
											var4 += var27;
											var6 += var36;
											var0 += anInt1553;
											var29 += var30;
											var32 += var33;
											var39 += var38;
										}

									method971(anIntArray1558, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var35,
											var29, var32, var39, var40, var41, var37);
									var5 += var28;
									var3 += var21;
									var6 += var36;
									var0 += anInt1553;
									var29 += var30;
									var32 += var33;
									var39 += var38;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var28 * var0;
								var3 -= var21 * var0;
								var6 -= var36 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var27 * var2;
								var2 = 0;
							}

							var31 = var0 - anInt1824;
							var29 += var30 * var31;
							var32 += var33 * var31;
							var39 += var38 * var31;
							if (((var0 != var2) && (var28 < var21)) || ((var0 == var2) && (var27 > var21))) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1821[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method971(anIntArray1558, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6,
													var35, var29, var32, var39, var40, var41, var37);
											var5 += var27;
											var3 += var21;
											var6 += var36;
											var0 += anInt1553;
											var29 += var30;
											var32 += var33;
											var39 += var38;
										}

									method971(anIntArray1558, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var35,
											var29, var32, var39, var40, var41, var37);
									var4 += var28;
									var3 += var21;
									var6 += var36;
									var0 += anInt1553;
									var29 += var30;
									var32 += var33;
									var39 += var38;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1821[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method971(anIntArray1558, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6,
													var35, var29, var32, var39, var40, var41, var37);
											var5 += var27;
											var3 += var21;
											var6 += var36;
											var0 += anInt1553;
											var29 += var30;
											var32 += var33;
											var39 += var38;
										}

									method971(anIntArray1558, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var35,
											var29, var32, var39, var40, var41, var37);
									var4 += var28;
									var3 += var21;
									var6 += var36;
									var0 += anInt1553;
									var29 += var30;
									var32 += var33;
									var39 += var38;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt1826) {
						if (var2 > anInt1826)
							var2 = anInt1826;

						if (var0 > anInt1826)
							var0 = anInt1826;

						var7 = ((var7 << 9) - (var35 * var4)) + var35;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var21 * var1;
								var4 -= var27 * var1;
								var7 -= var36 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var28 * var2;
								var2 = 0;
							}

							var31 = var1 - anInt1824;
							var29 += var30 * var31;
							var32 += var33 * var31;
							var39 += var38 * var31;
							if (((var1 != var2) && (var21 < var27)) || ((var1 == var2) && (var21 > var28))) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1821[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method971(anIntArray1558, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7,
													var35, var29, var32, var39, var40, var41, var37);
											var3 += var21;
											var5 += var28;
											var7 += var36;
											var1 += anInt1553;
											var29 += var30;
											var32 += var33;
											var39 += var38;
										}

									method971(anIntArray1558, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var35,
											var29, var32, var39, var40, var41, var37);
									var3 += var21;
									var4 += var27;
									var7 += var36;
									var1 += anInt1553;
									var29 += var30;
									var32 += var33;
									var39 += var38;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1821[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method971(anIntArray1558, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7,
													var35, var29, var32, var39, var40, var41, var37);
											var3 += var21;
											var5 += var28;
											var7 += var36;
											var1 += anInt1553;
											var29 += var30;
											var32 += var33;
											var39 += var38;
										}

									method971(anIntArray1558, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var35,
											var29, var32, var39, var40, var41, var37);
									var3 += var21;
									var4 += var27;
									var7 += var36;
									var1 += anInt1553;
									var29 += var30;
									var32 += var33;
									var39 += var38;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var21 * var1;
								var4 -= var27 * var1;
								var7 -= var36 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var28 * var0;
								var0 = 0;
							}

							var31 = var1 - anInt1824;
							var29 += var30 * var31;
							var32 += var33 * var31;
							var39 += var38 * var31;
							if (var21 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1821[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method971(anIntArray1558, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7,
													var35, var29, var32, var39, var40, var41, var37);
											var3 += var28;
											var4 += var27;
											var7 += var36;
											var1 += anInt1553;
											var29 += var30;
											var32 += var33;
											var39 += var38;
										}

									method971(anIntArray1558, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var35,
											var29, var32, var39, var40, var41, var37);
									var5 += var21;
									var4 += var27;
									var7 += var36;
									var1 += anInt1553;
									var29 += var30;
									var32 += var33;
									var39 += var38;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1821[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method971(anIntArray1558, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7,
													var35, var29, var32, var39, var40, var41, var37);
											var3 += var28;
											var4 += var27;
											var7 += var36;
											var1 += anInt1553;
											var29 += var30;
											var32 += var33;
											var39 += var38;
										}

									method971(anIntArray1558, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var35,
											var29, var32, var39, var40, var41, var37);
									var5 += var21;
									var4 += var27;
									var7 += var36;
									var1 += anInt1553;
									var29 += var30;
									var32 += var33;
									var39 += var38;
								}
							}
						}
					}
				} else if (var2 < anInt1826) {
					if (var0 > anInt1826)
						var0 = anInt1826;

					if (var1 > anInt1826)
						var1 = anInt1826;

					var8 = ((var8 << 9) - (var35 * var5)) + var35;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var36 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var21 * var0;
							var0 = 0;
						}

						var31 = var2 - anInt1824;
						var29 += var30 * var31;
						var32 += var33 * var31;
						var39 += var38 * var31;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1821[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method971(anIntArray1558, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8,
												var35, var29, var32, var39, var40, var41, var37);
										var4 += var27;
										var3 += var21;
										var8 += var36;
										var2 += anInt1553;
										var29 += var30;
										var32 += var33;
										var39 += var38;
									}

								method971(anIntArray1558, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var35, var29,
										var32, var39, var40, var41, var37);
								var4 += var27;
								var5 += var28;
								var8 += var36;
								var2 += anInt1553;
								var29 += var30;
								var32 += var33;
								var39 += var38;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1821[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method971(anIntArray1558, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8,
												var35, var29, var32, var39, var40, var41, var37);
										var4 += var27;
										var3 += var21;
										var8 += var36;
										var2 += anInt1553;
										var29 += var30;
										var32 += var33;
										var39 += var38;
									}

								method971(anIntArray1558, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var35, var29,
										var32, var39, var40, var41, var37);
								var4 += var27;
								var5 += var28;
								var8 += var36;
								var2 += anInt1553;
								var29 += var30;
								var32 += var33;
								var39 += var38;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var36 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var21 * var1;
							var1 = 0;
						}

						var31 = var2 - anInt1824;
						var29 += var30 * var31;
						var32 += var33 * var31;
						var39 += var38 * var31;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1821[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method971(anIntArray1558, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8,
												var35, var29, var32, var39, var40, var41, var37);
										var4 += var21;
										var5 += var28;
										var8 += var36;
										var2 += anInt1553;
										var29 += var30;
										var32 += var33;
										var39 += var38;
									}

								method971(anIntArray1558, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var35, var29,
										var32, var39, var40, var41, var37);
								var3 += var27;
								var5 += var28;
								var8 += var36;
								var2 += anInt1553;
								var29 += var30;
								var32 += var33;
								var39 += var38;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1821[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method971(anIntArray1558, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8,
												var35, var29, var32, var39, var40, var41, var37);
										var4 += var21;
										var5 += var28;
										var8 += var36;
										var2 += anInt1553;
										var29 += var30;
										var32 += var33;
										var39 += var38;
									}

								method971(anIntArray1558, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var35, var29,
										var32, var39, var40, var41, var37);
								var3 += var27;
								var5 += var28;
								var8 += var36;
								var2 += anInt1553;
								var29 += var30;
								var32 += var33;
								var39 += var38;
							}
						}
					}
				}
			}
		}
	}

	static final void method971(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, int var10, int var11, final int var12, final int var13, final int var14) {
		if (aBool1820) {
			if (var6 > anInt1827)
				var6 = anInt1827;

			if (var5 < 0)
				var5 = 0;
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var16 = var6 - var5;
			int var15;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (aBool1817) {
				var18 = var5 - anInt1823;
				var9 += var12 * var18;
				var10 += var13 * var18;
				var11 += var14 * var18;
				var19 = var11 >> 12;
				if (var19 != 0) {
					var20 = var9 / var19;
					var21 = var10 / var19;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var9 += var12 * var16;
				var10 += var13 * var16;
				var11 += var14 * var16;
				var19 = var11 >> 12;
				if (var19 != 0) {
					var22 = var9 / var19;
					var23 = var10 / var19;
				} else {
					var22 = 0;
					var23 = 0;
				}

				var2 = (var20 << 20) + var21;
				var17 = (((var22 - var20) / var16) << 20) + ((var23 - var21) / var16);
				var16 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (aBool1828) {
					if (var16 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var7 += var8;
							var15 = var7 >> 8;
							--var16;
						} while (var16 > 0);

					var16 = (var6 - var5) & 7;
					if (var16 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							--var16;
						} while (var16 > 0);
				} else {
					if (var16 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							var7 += var8;
							var15 = var7 >> 8;
							--var16;
						} while (var16 > 0);

					var16 = (var6 - var5) & 7;
					if (var16 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							--var16;
						} while (var16 > 0);
				}
			} else {
				var18 = var5 - anInt1823;
				var9 += var12 * var18;
				var10 += var13 * var18;
				var11 += var14 * var18;
				var19 = var11 >> 14;
				if (var19 != 0) {
					var20 = var9 / var19;
					var21 = var10 / var19;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var9 += var12 * var16;
				var10 += var13 * var16;
				var11 += var14 * var16;
				var19 = var11 >> 14;
				if (var19 != 0) {
					var22 = var9 / var19;
					var23 = var10 / var19;
				} else {
					var22 = 0;
					var23 = 0;
				}

				var2 = (var20 << 18) + var21;
				var17 = (((var22 - var20) / var16) << 18) + ((var23 - var21) / var16);
				var16 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (aBool1828) {
					if (var16 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							var7 += var8;
							var15 = var7 >> 8;
							--var16;
						} while (var16 > 0);

					var16 = (var6 - var5) & 7;
					if (var16 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var15) & -16711936)
									+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;
							var2 += var17;
							--var16;
						} while (var16 > 0);
				} else {
					if (var16 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							var7 += var8;
							var15 = var7 >> 8;
							--var16;
						} while (var16 > 0);

					var16 = (var6 - var5) & 7;
					if (var16 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var15) & -16711936)
										+ (((var3 & '\uff00') * var15) & 16711680)) >> 8;

							++var4;
							var2 += var17;
							--var16;
						} while (var16 > 0);
				}
			}

		}
	}

	static {
		int var0;
		for (var0 = 1; var0 < 512; ++var0)
			anIntArray1825[var0] = '\u8000' / var0;

		for (var0 = 1; var0 < 2048; ++var0)
			anIntArray1831[var0] = 65536 / var0;

		for (var0 = 0; var0 < 2048; ++var0) {
			anIntArray1835[var0] = (int) (65536.0D * Math.sin(var0 * 0.0030679615D));
			anIntArray1836[var0] = (int) (65536.0D * Math.cos(var0 * 0.0030679615D));
		}

	}

	public static final void method972(final Interface3 var0) {
		anInterface3_1833 = var0;
	}

	public static final void method973() {
		method969(anInt1557, anInt1555, anInt1552, anInt1556);
	}

	Class109_Sub21_Sub14_Sub3() throws Throwable {
		throw new Error();
	}

	static final void method974(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		final int var9 = var4 - var3;
		final int var16 = var1 - var0;
		final int var11 = var5 - var3;
		final int var12 = var2 - var0;
		final int var17 = var7 - var6;
		final int var13 = var8 - var6;
		int var15;
		if (var2 != var1)
			var15 = ((var5 - var4) << 14) / (var2 - var1);
		else
			var15 = 0;

		int var14;
		if (var1 != var0)
			var14 = (var9 << 14) / var16;
		else
			var14 = 0;

		int var20;
		if (var2 != var0)
			var20 = (var11 << 14) / var12;
		else
			var20 = 0;

		final int var19 = (var9 * var12) - (var11 * var16);
		if (var19 != 0) {
			final int var18 = (((var17 * var12) - (var13 * var16)) << 8) / var19;
			final int var10 = (((var13 * var9) - (var17 * var11)) << 8) / var19;
			if ((var0 <= var1) && (var0 <= var2)) {
				if (var0 < anInt1826) {
					if (var1 > anInt1826)
						var1 = anInt1826;

					if (var2 > anInt1826)
						var2 = anInt1826;

					var6 = ((var6 << 8) - (var18 * var3)) + var18;
					if (var1 < var2) {
						var5 = var3 <<= 14;
						if (var0 < 0) {
							var5 -= var20 * var0;
							var3 -= var14 * var0;
							var6 -= var10 * var0;
							var0 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var15 * var1;
							var1 = 0;
						}

						if (((var0 != var1) && (var20 < var14)) || ((var0 == var1) && (var20 > var15))) {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1821[var0];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method966(anIntArray1558, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var18);
										var5 += var20;
										var4 += var15;
										var6 += var10;
										var0 += anInt1553;
									}

								method966(anIntArray1558, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var18);
								var5 += var20;
								var3 += var14;
								var6 += var10;
								var0 += anInt1553;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1821[var0];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method966(anIntArray1558, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var18);
										var5 += var20;
										var4 += var15;
										var6 += var10;
										var0 += anInt1553;
									}

								method966(anIntArray1558, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var18);
								var5 += var20;
								var3 += var14;
								var6 += var10;
								var0 += anInt1553;
							}
						}
					} else {
						var4 = var3 <<= 14;
						if (var0 < 0) {
							var4 -= var20 * var0;
							var3 -= var14 * var0;
							var6 -= var10 * var0;
							var0 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var15 * var2;
							var2 = 0;
						}

						if (((var0 == var2) || (var20 >= var14)) && ((var0 != var2) || (var15 <= var14))) {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray1821[var0];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method966(anIntArray1558, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var18);
										var5 += var15;
										var3 += var14;
										var6 += var10;
										var0 += anInt1553;
									}

								method966(anIntArray1558, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var18);
								var4 += var20;
								var3 += var14;
								var6 += var10;
								var0 += anInt1553;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray1821[var0];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method966(anIntArray1558, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var18);
										var5 += var15;
										var3 += var14;
										var6 += var10;
										var0 += anInt1553;
									}

								method966(anIntArray1558, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var18);
								var4 += var20;
								var3 += var14;
								var6 += var10;
								var0 += anInt1553;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < anInt1826) {
					if (var2 > anInt1826)
						var2 = anInt1826;

					if (var0 > anInt1826)
						var0 = anInt1826;

					var7 = ((var7 << 8) - (var18 * var4)) + var18;
					if (var2 < var0) {
						var3 = var4 <<= 14;
						if (var1 < 0) {
							var3 -= var14 * var1;
							var4 -= var15 * var1;
							var7 -= var10 * var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var20 * var2;
							var2 = 0;
						}

						if (((var1 != var2) && (var14 < var15)) || ((var1 == var2) && (var14 > var20))) {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1821[var1];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method966(anIntArray1558, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var18);
										var3 += var14;
										var5 += var20;
										var7 += var10;
										var1 += anInt1553;
									}

								method966(anIntArray1558, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var18);
								var3 += var14;
								var4 += var15;
								var7 += var10;
								var1 += anInt1553;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1821[var1];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method966(anIntArray1558, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var18);
										var3 += var14;
										var5 += var20;
										var7 += var10;
										var1 += anInt1553;
									}

								method966(anIntArray1558, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var18);
								var3 += var14;
								var4 += var15;
								var7 += var10;
								var1 += anInt1553;
							}
						}
					} else {
						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var14 * var1;
							var4 -= var15 * var1;
							var7 -= var10 * var1;
							var1 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var20 * var0;
							var0 = 0;
						}

						if (var14 < var15) {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray1821[var1];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method966(anIntArray1558, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var18);
										var3 += var20;
										var4 += var15;
										var7 += var10;
										var1 += anInt1553;
									}

								method966(anIntArray1558, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var18);
								var5 += var14;
								var4 += var15;
								var7 += var10;
								var1 += anInt1553;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray1821[var1];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method966(anIntArray1558, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var18);
										var3 += var20;
										var4 += var15;
										var7 += var10;
										var1 += anInt1553;
									}

								method966(anIntArray1558, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var18);
								var5 += var14;
								var4 += var15;
								var7 += var10;
								var1 += anInt1553;
							}
						}
					}
				}
			} else if (var2 < anInt1826) {
				if (var0 > anInt1826)
					var0 = anInt1826;

				if (var1 > anInt1826)
					var1 = anInt1826;

				var8 = ((var8 << 8) - (var18 * var5)) + var18;
				if (var0 < var1) {
					var4 = var5 <<= 14;
					if (var2 < 0) {
						var4 -= var15 * var2;
						var5 -= var20 * var2;
						var8 -= var10 * var2;
						var2 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var14 * var0;
						var0 = 0;
					}

					if (var15 < var20) {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1821[var2];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method966(anIntArray1558, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var18);
									var4 += var15;
									var3 += var14;
									var8 += var10;
									var2 += anInt1553;
								}

							method966(anIntArray1558, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var18);
							var4 += var15;
							var5 += var20;
							var8 += var10;
							var2 += anInt1553;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1821[var2];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method966(anIntArray1558, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var18);
									var4 += var15;
									var3 += var14;
									var8 += var10;
									var2 += anInt1553;
								}

							method966(anIntArray1558, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var18);
							var4 += var15;
							var5 += var20;
							var8 += var10;
							var2 += anInt1553;
						}
					}
				} else {
					var3 = var5 <<= 14;
					if (var2 < 0) {
						var3 -= var15 * var2;
						var5 -= var20 * var2;
						var8 -= var10 * var2;
						var2 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var14 * var1;
						var1 = 0;
					}

					if (var15 < var20) {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray1821[var2];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method966(anIntArray1558, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var18);
									var4 += var14;
									var5 += var20;
									var8 += var10;
									var2 += anInt1553;
								}

							method966(anIntArray1558, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var18);
							var3 += var15;
							var5 += var20;
							var8 += var10;
							var2 += anInt1553;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray1821[var2];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method966(anIntArray1558, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var18);
									var4 += var14;
									var5 += var20;
									var8 += var10;
									var2 += anInt1553;
								}

							method966(anIntArray1558, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var18);
							var3 += var15;
							var5 += var20;
							var8 += var10;
							var2 += anInt1553;
						}
					}
				}
			}
		}
	}

	static final void method975(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, int var10, int var11, final int var12, final int var13, final int var14) {
		if (aBool1820) {
			if (var6 > anInt1827)
				var6 = anInt1827;

			if (var5 < 0)
				var5 = 0;
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var18 = var6 - var5;
			int var15;
			int var16;
			int var17;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (aBool1817) {
				var19 = var5 - anInt1823;
				var9 += (var12 >> 3) * var19;
				var10 += (var13 >> 3) * var19;
				var11 += (var14 >> 3) * var19;
				var16 = var11 >> 12;
				if (var16 != 0) {
					var15 = var9 / var16;
					var21 = var10 / var16;
					if (var15 < 0)
						var15 = 0;
					else if (var15 > 4032)
						var15 = 4032;
				} else {
					var15 = 0;
					var21 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var16 = var11 >> 12;
				if (var16 != 0) {
					var17 = var9 / var16;
					var22 = var10 / var16;
					if (var17 < 0)
						var17 = 0;
					else if (var17 > 4032)
						var17 = 4032;
				} else {
					var17 = 0;
					var22 = 0;
				}

				var2 = (var15 << 20) + var21;
				var20 = (((var17 - var15) >> 3) << 20) + ((var22 - var21) >> 3);
				var18 >>= 3;
				var8 <<= 3;
				var23 = var7 >> 8;
				if (aBool1828) {
					if (var18 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var15 = var17;
							var21 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 12;
							if (var16 != 0) {
								var17 = var9 / var16;
								var22 = var10 / var16;
								if (var17 < 0)
									var17 = 0;
								else if (var17 > 4032)
									var17 = 4032;
							} else {
								var17 = 0;
								var22 = 0;
							}

							var2 = (var15 << 20) + var21;
							var20 = (((var17 - var15) >> 3) << 20) + ((var22 - var21) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var18;
						} while (var18 > 0);

					var18 = (var6 - var5) & 7;
					if (var18 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							--var18;
						} while (var18 > 0);
				} else {
					if (var18 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var15 = var17;
							var21 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 12;
							if (var16 != 0) {
								var17 = var9 / var16;
								var22 = var10 / var16;
								if (var17 < 0)
									var17 = 0;
								else if (var17 > 4032)
									var17 = 4032;
							} else {
								var17 = 0;
								var22 = 0;
							}

							var2 = (var15 << 20) + var21;
							var20 = (((var17 - var15) >> 3) << 20) + ((var22 - var21) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var18;
						} while (var18 > 0);

					var18 = (var6 - var5) & 7;
					if (var18 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							--var18;
						} while (var18 > 0);
				}
			} else {
				var19 = var5 - anInt1823;
				var9 += (var12 >> 3) * var19;
				var10 += (var13 >> 3) * var19;
				var11 += (var14 >> 3) * var19;
				var16 = var11 >> 14;
				if (var16 != 0) {
					var15 = var9 / var16;
					var21 = var10 / var16;
					if (var15 < 0)
						var15 = 0;
					else if (var15 > 16256)
						var15 = 16256;
				} else {
					var15 = 0;
					var21 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var16 = var11 >> 14;
				if (var16 != 0) {
					var17 = var9 / var16;
					var22 = var10 / var16;
					if (var17 < 0)
						var17 = 0;
					else if (var17 > 16256)
						var17 = 16256;
				} else {
					var17 = 0;
					var22 = 0;
				}

				var2 = (var15 << 18) + var21;
				var20 = (((var17 - var15) >> 3) << 18) + ((var22 - var21) >> 3);
				var18 >>= 3;
				var8 <<= 3;
				var23 = var7 >> 8;
				if (aBool1828) {
					if (var18 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var15 = var17;
							var21 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 14;
							if (var16 != 0) {
								var17 = var9 / var16;
								var22 = var10 / var16;
								if (var17 < 0)
									var17 = 0;
								else if (var17 > 16256)
									var17 = 16256;
							} else {
								var17 = 0;
								var22 = 0;
							}

							var2 = (var15 << 18) + var21;
							var20 = (((var17 - var15) >> 3) << 18) + ((var22 - var21) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var18;
						} while (var18 > 0);

					var18 = (var6 - var5) & 7;
					if (var18 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var20;
							--var18;
						} while (var18 > 0);
				} else {
					if (var18 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var15 = var17;
							var21 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 14;
							if (var16 != 0) {
								var17 = var9 / var16;
								var22 = var10 / var16;
								if (var17 < 0)
									var17 = 0;
								else if (var17 > 16256)
									var17 = 16256;
							} else {
								var17 = 0;
								var22 = 0;
							}

							var2 = (var15 << 18) + var21;
							var20 = (((var17 - var15) >> 3) << 18) + ((var22 - var21) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var18;
						} while (var18 > 0);

					var18 = (var6 - var5) & 7;
					if (var18 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							--var18;
						} while (var18 > 0);
				}
			}

		}
	}

	static final void method976(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, final int var9, int var10, int var11, final int var12, int var13, int var14, final int var15,
			int var16, int var17, final int var18) {
		final int[] var19 = anInterface3_1833.method10(var18, 1281917278);
		int var20;
		if (var19 == null) {
			var20 = anInterface3_1833.method7(var18, 311521226);
			method974(var0, var1, var2, var3, var4, var5, method977(var20, var6), method977(var20, var7),
					method977(var20, var8));
		} else {
			aBool1817 = anInterface3_1833.method9(var18, 1513319491);
			aBool1828 = anInterface3_1833.method8(var18, (short) 16091);
			var20 = var4 - var3;
			final int var22 = var1 - var0;
			final int var23 = var5 - var3;
			final int var24 = var2 - var0;
			final int var38 = var7 - var6;
			final int var25 = var8 - var6;
			int var26 = 0;
			if (var1 != var0)
				var26 = ((var4 - var3) << 14) / (var1 - var0);

			int var34 = 0;
			if (var2 != var1)
				var34 = ((var5 - var4) << 14) / (var2 - var1);

			int var35 = 0;
			if (var2 != var0)
				var35 = ((var3 - var5) << 14) / (var0 - var2);

			final int var37 = (var20 * var24) - (var23 * var22);
			if (var37 != 0) {
				final int var27 = (((var38 * var24) - (var25 * var22)) << 9) / var37;
				final int var21 = (((var25 * var20) - (var38 * var23)) << 9) / var37;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var28 = ((var11 * var12) - (var14 * var9)) << 14;
				final int var31 = (int) (((long) ((var14 * var15) - (var17 * var12)) << 3 << 14) / anInt1822);
				final int var36 = (int) (((long) ((var17 * var9) - (var11 * var15)) << 14) / anInt1822);
				int var29 = ((var10 * var12) - (var13 * var9)) << 14;
				final int var32 = (int) (((long) ((var13 * var15) - (var16 * var12)) << 3 << 14) / anInt1822);
				final int var41 = (int) (((long) ((var16 * var9) - (var10 * var15)) << 14) / anInt1822);
				int var30 = ((var13 * var11) - (var10 * var14)) << 14;
				final int var33 = (int) (((long) ((var16 * var14) - (var13 * var17)) << 3 << 14) / anInt1822);
				final int var39 = (int) (((long) ((var10 * var17) - (var16 * var11)) << 14) / anInt1822);
				int var40;
				if ((var0 <= var1) && (var0 <= var2)) {
					if (var0 < anInt1826) {
						if (var1 > anInt1826)
							var1 = anInt1826;

						if (var2 > anInt1826)
							var2 = anInt1826;

						var6 = ((var6 << 9) - (var27 * var3)) + var27;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var35 * var0;
								var3 -= var26 * var0;
								var6 -= var21 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var34 * var1;
								var1 = 0;
							}

							var40 = var0 - anInt1824;
							var28 += var36 * var40;
							var29 += var41 * var40;
							var30 += var39 * var40;
							if (((var0 != var1) && (var35 < var26)) || ((var0 == var1) && (var35 > var34))) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1821[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method975(anIntArray1558, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6,
													var27, var28, var29, var30, var31, var32, var33);
											var5 += var35;
											var4 += var34;
											var6 += var21;
											var0 += anInt1553;
											var28 += var36;
											var29 += var41;
											var30 += var39;
										}

									method975(anIntArray1558, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var27,
											var28, var29, var30, var31, var32, var33);
									var5 += var35;
									var3 += var26;
									var6 += var21;
									var0 += anInt1553;
									var28 += var36;
									var29 += var41;
									var30 += var39;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1821[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method975(anIntArray1558, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6,
													var27, var28, var29, var30, var31, var32, var33);
											var5 += var35;
											var4 += var34;
											var6 += var21;
											var0 += anInt1553;
											var28 += var36;
											var29 += var41;
											var30 += var39;
										}

									method975(anIntArray1558, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var27,
											var28, var29, var30, var31, var32, var33);
									var5 += var35;
									var3 += var26;
									var6 += var21;
									var0 += anInt1553;
									var28 += var36;
									var29 += var41;
									var30 += var39;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var35 * var0;
								var3 -= var26 * var0;
								var6 -= var21 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var34 * var2;
								var2 = 0;
							}

							var40 = var0 - anInt1824;
							var28 += var36 * var40;
							var29 += var41 * var40;
							var30 += var39 * var40;
							if (((var0 == var2) || (var35 >= var26)) && ((var0 != var2) || (var34 <= var26))) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1821[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method975(anIntArray1558, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6,
													var27, var28, var29, var30, var31, var32, var33);
											var5 += var34;
											var3 += var26;
											var6 += var21;
											var0 += anInt1553;
											var28 += var36;
											var29 += var41;
											var30 += var39;
										}

									method975(anIntArray1558, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var27,
											var28, var29, var30, var31, var32, var33);
									var4 += var35;
									var3 += var26;
									var6 += var21;
									var0 += anInt1553;
									var28 += var36;
									var29 += var41;
									var30 += var39;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1821[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method975(anIntArray1558, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6,
													var27, var28, var29, var30, var31, var32, var33);
											var5 += var34;
											var3 += var26;
											var6 += var21;
											var0 += anInt1553;
											var28 += var36;
											var29 += var41;
											var30 += var39;
										}

									method975(anIntArray1558, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var27,
											var28, var29, var30, var31, var32, var33);
									var4 += var35;
									var3 += var26;
									var6 += var21;
									var0 += anInt1553;
									var28 += var36;
									var29 += var41;
									var30 += var39;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt1826) {
						if (var2 > anInt1826)
							var2 = anInt1826;

						if (var0 > anInt1826)
							var0 = anInt1826;

						var7 = ((var7 << 9) - (var27 * var4)) + var27;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var26 * var1;
								var4 -= var34 * var1;
								var7 -= var21 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var35 * var2;
								var2 = 0;
							}

							var40 = var1 - anInt1824;
							var28 += var36 * var40;
							var29 += var41 * var40;
							var30 += var39 * var40;
							if (((var1 != var2) && (var26 < var34)) || ((var1 == var2) && (var26 > var35))) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1821[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method975(anIntArray1558, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7,
													var27, var28, var29, var30, var31, var32, var33);
											var3 += var26;
											var5 += var35;
											var7 += var21;
											var1 += anInt1553;
											var28 += var36;
											var29 += var41;
											var30 += var39;
										}

									method975(anIntArray1558, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var27,
											var28, var29, var30, var31, var32, var33);
									var3 += var26;
									var4 += var34;
									var7 += var21;
									var1 += anInt1553;
									var28 += var36;
									var29 += var41;
									var30 += var39;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1821[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method975(anIntArray1558, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7,
													var27, var28, var29, var30, var31, var32, var33);
											var3 += var26;
											var5 += var35;
											var7 += var21;
											var1 += anInt1553;
											var28 += var36;
											var29 += var41;
											var30 += var39;
										}

									method975(anIntArray1558, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var27,
											var28, var29, var30, var31, var32, var33);
									var3 += var26;
									var4 += var34;
									var7 += var21;
									var1 += anInt1553;
									var28 += var36;
									var29 += var41;
									var30 += var39;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var26 * var1;
								var4 -= var34 * var1;
								var7 -= var21 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var35 * var0;
								var0 = 0;
							}

							var40 = var1 - anInt1824;
							var28 += var36 * var40;
							var29 += var41 * var40;
							var30 += var39 * var40;
							if (var26 < var34) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1821[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method975(anIntArray1558, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7,
													var27, var28, var29, var30, var31, var32, var33);
											var3 += var35;
											var4 += var34;
											var7 += var21;
											var1 += anInt1553;
											var28 += var36;
											var29 += var41;
											var30 += var39;
										}

									method975(anIntArray1558, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var27,
											var28, var29, var30, var31, var32, var33);
									var5 += var26;
									var4 += var34;
									var7 += var21;
									var1 += anInt1553;
									var28 += var36;
									var29 += var41;
									var30 += var39;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1821[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method975(anIntArray1558, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7,
													var27, var28, var29, var30, var31, var32, var33);
											var3 += var35;
											var4 += var34;
											var7 += var21;
											var1 += anInt1553;
											var28 += var36;
											var29 += var41;
											var30 += var39;
										}

									method975(anIntArray1558, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var27,
											var28, var29, var30, var31, var32, var33);
									var5 += var26;
									var4 += var34;
									var7 += var21;
									var1 += anInt1553;
									var28 += var36;
									var29 += var41;
									var30 += var39;
								}
							}
						}
					}
				} else if (var2 < anInt1826) {
					if (var0 > anInt1826)
						var0 = anInt1826;

					if (var1 > anInt1826)
						var1 = anInt1826;

					var8 = ((var8 << 9) - (var27 * var5)) + var27;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var34 * var2;
							var5 -= var35 * var2;
							var8 -= var21 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var26 * var0;
							var0 = 0;
						}

						var40 = var2 - anInt1824;
						var28 += var36 * var40;
						var29 += var41 * var40;
						var30 += var39 * var40;
						if (var34 < var35) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1821[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method975(anIntArray1558, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8,
												var27, var28, var29, var30, var31, var32, var33);
										var4 += var34;
										var3 += var26;
										var8 += var21;
										var2 += anInt1553;
										var28 += var36;
										var29 += var41;
										var30 += var39;
									}

								method975(anIntArray1558, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var27, var28,
										var29, var30, var31, var32, var33);
								var4 += var34;
								var5 += var35;
								var8 += var21;
								var2 += anInt1553;
								var28 += var36;
								var29 += var41;
								var30 += var39;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1821[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method975(anIntArray1558, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8,
												var27, var28, var29, var30, var31, var32, var33);
										var4 += var34;
										var3 += var26;
										var8 += var21;
										var2 += anInt1553;
										var28 += var36;
										var29 += var41;
										var30 += var39;
									}

								method975(anIntArray1558, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var27, var28,
										var29, var30, var31, var32, var33);
								var4 += var34;
								var5 += var35;
								var8 += var21;
								var2 += anInt1553;
								var28 += var36;
								var29 += var41;
								var30 += var39;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var34 * var2;
							var5 -= var35 * var2;
							var8 -= var21 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var26 * var1;
							var1 = 0;
						}

						var40 = var2 - anInt1824;
						var28 += var36 * var40;
						var29 += var41 * var40;
						var30 += var39 * var40;
						if (var34 < var35) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1821[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method975(anIntArray1558, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8,
												var27, var28, var29, var30, var31, var32, var33);
										var4 += var26;
										var5 += var35;
										var8 += var21;
										var2 += anInt1553;
										var28 += var36;
										var29 += var41;
										var30 += var39;
									}

								method975(anIntArray1558, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var27, var28,
										var29, var30, var31, var32, var33);
								var3 += var34;
								var5 += var35;
								var8 += var21;
								var2 += anInt1553;
								var28 += var36;
								var29 += var41;
								var30 += var39;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1821[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method975(anIntArray1558, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8,
												var27, var28, var29, var30, var31, var32, var33);
										var4 += var26;
										var5 += var35;
										var8 += var21;
										var2 += anInt1553;
										var28 += var36;
										var29 += var41;
										var30 += var39;
									}

								method975(anIntArray1558, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var27, var28,
										var29, var30, var31, var32, var33);
								var3 += var34;
								var5 += var35;
								var8 += var21;
								var2 += anInt1553;
								var28 += var36;
								var29 += var41;
								var30 += var39;
							}
						}
					}
				}
			}
		}
	}

	static final int method977(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}
}
