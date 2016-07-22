public final class Class72 {
	static Class30 aClass30_604 = new Class30();

	static void method319(final Class30 var0) {
		int var17 = 0;
		int[] var18 = null;
		int[] var20 = null;
		int[] var19 = null;
		var0.anInt295 = 1;
		if (Class92.anIntArray698 == null)
			Class92.anIntArray698 = new int[var0.anInt295 * 100000];

		boolean var2 = true;

		while (true) {
			while (var2) {
				byte var21 = method322(var0);
				if (var21 == 23)
					return;

				var21 = method322(var0);
				var21 = method322(var0);
				var21 = method322(var0);
				var21 = method322(var0);
				var21 = method322(var0);
				var21 = method322(var0);
				var21 = method322(var0);
				var21 = method322(var0);
				var21 = method322(var0);
				var21 = method323(var0);
				if (var21 != 0)
					;

				var0.anInt286 = 0;
				var21 = method322(var0);
				var0.anInt286 = (var0.anInt286 << 8) | (var21 & 255);
				var21 = method322(var0);
				var0.anInt286 = (var0.anInt286 << 8) | (var21 & 255);
				var21 = method322(var0);
				var0.anInt286 = (var0.anInt286 << 8) | (var21 & 255);

				int var36;
				for (var36 = 0; var36 < 16; ++var36) {
					var21 = method323(var0);
					if (var21 == 1)
						var0.aBoolArray294[var36] = true;
					else
						var0.aBoolArray294[var36] = false;
				}

				for (var36 = 0; var36 < 256; ++var36)
					var0.aBoolArray293[var36] = false;

				int var40;
				for (var36 = 0; var36 < 16; ++var36)
					if (var0.aBoolArray294[var36])
						for (var40 = 0; var40 < 16; ++var40) {
							var21 = method323(var0);
							if (var21 == 1)
								var0.aBoolArray293[(var36 * 16) + var40] = true;
						}

				method325(var0);
				final int var49 = var0.anInt306 + 2;
				final int var38 = method324(3, var0);
				final int var55 = method324(15, var0);

				for (var36 = 0; var36 < var55; ++var36) {
					var40 = 0;

					while (true) {
						var21 = method323(var0);
						if (var21 == 0) {
							var0.aByteArray299[var36] = (byte) var40;
							break;
						}

						++var40;
					}
				}

				final byte[] var22 = new byte[6];

				byte var7;
				for (var7 = 0; var7 < var38; var22[var7] = var7++)
					;

				for (var36 = 0; var36 < var55; ++var36) {
					var7 = var0.aByteArray299[var36];

					byte var5;
					for (var5 = var22[var7]; var7 > 0; --var7)
						var22[var7] = var22[var7 - 1];

					var22[0] = var5;
					var0.aByteArray298[var36] = var5;
				}

				int var37;
				for (var37 = 0; var37 < var38; ++var37) {
					int var42 = method324(5, var0);

					for (var36 = 0; var36 < var49; ++var36)
						while (true) {
							var21 = method323(var0);
							if (var21 == 0) {
								var0.aByteArrayArray300[var37][var36] = (byte) var42;
								break;
							}

							var21 = method323(var0);
							if (var21 == 0)
								++var42;
							else
								--var42;
						}
				}

				for (var37 = 0; var37 < var38; ++var37) {
					byte var33 = 32;
					byte var26 = 0;

					for (var36 = 0; var36 < var49; ++var36) {
						if (var0.aByteArrayArray300[var37][var36] > var26)
							var26 = var0.aByteArrayArray300[var37][var36];

						if (var0.aByteArrayArray300[var37][var36] < var33)
							var33 = var0.aByteArrayArray300[var37][var36];
					}

					method326(var0.anIntArrayArray301[var37], var0.anIntArrayArray302[var37],
							var0.anIntArrayArray303[var37], var0.aByteArrayArray300[var37], var33, var26, var49);
					var0.anIntArray304[var37] = var33;
				}

				final int var54 = var0.anInt306 + 1;
				int var50 = -1;
				byte var51 = 0;

				for (var36 = 0; var36 <= 255; ++var36)
					var0.anIntArray287[var36] = 0;

				int var41 = 4095;

				int var31;
				int var39;
				for (var31 = 15; var31 >= 0; --var31) {
					for (var39 = 15; var39 >= 0; --var39) {
						var0.aByteArray296[var41] = (byte) ((var31 * 16) + var39);
						--var41;
					}

					var0.anIntArray297[var31] = var41 + 1;
				}

				int var53 = 0;
				byte var48;
				if (var51 == 0) {
					++var50;
					var51 = 50;
					var48 = var0.aByteArray298[var50];
					var17 = var0.anIntArray304[var48];
					var18 = var0.anIntArrayArray301[var48];
					var19 = var0.anIntArrayArray303[var48];
					var20 = var0.anIntArrayArray302[var48];
				}

				int var52 = var51 - 1;
				int var45 = var17;

				int var46;
				byte var47;
				for (var46 = method324(var17, var0); var46 > var18[var45]; var46 = (var46 << 1) | var47) {
					++var45;
					var47 = method323(var0);
				}

				int var56 = var19[var46 - var20[var45]];

				while (true) {
					while (var56 != var54)
						if ((var56 != 0) && (var56 != 1)) {
							int var9 = var56 - 1;
							int var8;
							if (var9 < 16) {
								var8 = var0.anIntArray297[0];

								for (var21 = var0.aByteArray296[var8 + var9]; var9 > 3; var9 -= 4) {
									final int var34 = var8 + var9;
									var0.aByteArray296[var34] = var0.aByteArray296[var34 - 1];
									var0.aByteArray296[var34 - 1] = var0.aByteArray296[var34 - 2];
									var0.aByteArray296[var34 - 2] = var0.aByteArray296[var34 - 3];
									var0.aByteArray296[var34 - 3] = var0.aByteArray296[var34 - 4];
								}

								while (var9 > 0) {
									var0.aByteArray296[var8 + var9] = var0.aByteArray296[(var8 + var9) - 1];
									--var9;
								}

								var0.aByteArray296[var8] = var21;
							} else {
								int var28 = var9 / 16;
								final int var35 = var9 % 16;
								var8 = var0.anIntArray297[var28] + var35;

								for (var21 = var0.aByteArray296[var8]; var8 > var0.anIntArray297[var28]; --var8)
									var0.aByteArray296[var8] = var0.aByteArray296[var8 - 1];

								++var0.anIntArray297[var28];

								while (var28 > 0) {
									--var0.anIntArray297[var28];
									var0.aByteArray296[var0.anIntArray297[var28]] = var0.aByteArray296[(var0.anIntArray297[var28
											- 1] + 16) - 1];
									--var28;
								}

								--var0.anIntArray297[0];
								var0.aByteArray296[var0.anIntArray297[0]] = var21;
								if (var0.anIntArray297[0] == 0) {
									var41 = 4095;

									for (var31 = 15; var31 >= 0; --var31) {
										for (var39 = 15; var39 >= 0; --var39) {
											var0.aByteArray296[var41] = var0.aByteArray296[var0.anIntArray297[var31]
													+ var39];
											--var41;
										}

										var0.anIntArray297[var31] = var41 + 1;
									}
								}
							}

							++var0.anIntArray287[var0.aByteArray307[var21 & 255] & 255];
							Class92.anIntArray698[var53] = var0.aByteArray307[var21 & 255] & 255;
							++var53;
							if (var52 == 0) {
								++var50;
								var52 = 50;
								var48 = var0.aByteArray298[var50];
								var17 = var0.anIntArray304[var48];
								var18 = var0.anIntArrayArray301[var48];
								var19 = var0.anIntArrayArray303[var48];
								var20 = var0.anIntArrayArray302[var48];
							}

							--var52;
							var45 = var17;

							for (var46 = method324(var17, var0); var46 > var18[var45]; var46 = (var46 << 1) | var47) {
								++var45;
								var47 = method323(var0);
							}

							var56 = var19[var46 - var20[var45]];
						} else {
							int var43 = -1;
							int var44 = 1;

							do {
								if (var56 == 0)
									var43 += var44;
								else if (var56 == 1)
									var43 += 2 * var44;

								var44 *= 2;
								if (var52 == 0) {
									++var50;
									var52 = 50;
									var48 = var0.aByteArray298[var50];
									var17 = var0.anIntArray304[var48];
									var18 = var0.anIntArrayArray301[var48];
									var19 = var0.anIntArrayArray303[var48];
									var20 = var0.anIntArrayArray302[var48];
								}

								--var52;
								var45 = var17;

								for (var46 = method324(var17, var0); var46 > var18[var45]; var46 = (var46 << 1)
										| var47) {
									++var45;
									var47 = method323(var0);
								}

								var56 = var19[var46 - var20[var45]];
							} while ((var56 == 0) || (var56 == 1));

							++var43;
							var21 = var0.aByteArray307[var0.aByteArray296[var0.anIntArray297[0]] & 255];

							for (var0.anIntArray287[var21 & 255] += var43; var43 > 0; --var43) {
								Class92.anIntArray698[var53] = var21 & 255;
								++var53;
							}
						}

					var0.anInt282 = 0;
					var0.aByte281 = 0;
					var0.anIntArray291[0] = 0;

					for (var36 = 1; var36 <= 256; ++var36)
						var0.anIntArray291[var36] = var0.anIntArray287[var36 - 1];

					for (var36 = 1; var36 <= 256; ++var36)
						var0.anIntArray291[var36] += var0.anIntArray291[var36 - 1];

					for (var36 = 0; var36 < var53; ++var36) {
						var21 = (byte) (Class92.anIntArray698[var36] & 255);
						Class92.anIntArray698[var0.anIntArray291[var21 & 255]] |= var36 << 8;
						++var0.anIntArray291[var21 & 255];
					}

					var0.anInt279 = Class92.anIntArray698[var0.anInt286] >> 8;
					var0.anInt290 = 0;
					var0.anInt279 = Class92.anIntArray698[var0.anInt279];
					var0.anInt273 = (byte) (var0.anInt279 & 255);
					var0.anInt279 >>= 8;
					++var0.anInt290;
					var0.anInt305 = var53;
					method320(var0);
					if ((var0.anInt290 == (var0.anInt305 + 1)) && (var0.anInt282 == 0)) {
						var2 = true;
						break;
					}

					var2 = false;
					break;
				}
			}

			return;
		}
	}

	static void method320(final Class30 var0) {
		byte var1 = var0.aByte281;
		int var6 = var0.anInt282;
		int var4 = var0.anInt290;
		int var5 = var0.anInt273;
		final int[] var12 = Class92.anIntArray698;
		int var13 = var0.anInt279;
		final byte[] var7 = var0.aByteArray283;
		int var8 = var0.anInt278;
		int var3 = var0.anInt277;
		final int var9 = var0.anInt305 + 1;

		label115: while (true) {
			if (var6 > 0)
				while (true) {
					if (var3 == 0)
						break label115;

					if (var6 == 1) {
						if (var3 == 0) {
							var6 = 1;
							break label115;
						}

						var7[var8] = var1;
						++var8;
						--var3;
						break;
					}

					var7[var8] = var1;
					--var6;
					++var8;
					--var3;
				}

			boolean var10 = true;

			byte var14;
			while (var10) {
				var10 = false;
				if (var4 == var9) {
					var6 = 0;
					break label115;
				}

				var1 = (byte) var5;
				var13 = var12[var13];
				var14 = (byte) (var13 & 255);
				var13 >>= 8;
				++var4;
				if (var14 != var5) {
					var5 = var14;
					if (var3 == 0) {
						var6 = 1;
						break label115;
					}

					var7[var8] = var1;
					++var8;
					--var3;
					var10 = true;
				} else if (var4 == var9) {
					if (var3 == 0) {
						var6 = 1;
						break label115;
					}

					var7[var8] = var1;
					++var8;
					--var3;
					var10 = true;
				}
			}

			var6 = 2;
			var13 = var12[var13];
			var14 = (byte) (var13 & 255);
			var13 >>= 8;
			++var4;
			if (var4 != var9)
				if (var14 != var5)
					var5 = var14;
				else {
					var6 = 3;
					var13 = var12[var13];
					var14 = (byte) (var13 & 255);
					var13 >>= 8;
					++var4;
					if (var4 != var9)
						if (var14 != var5)
							var5 = var14;
						else {
							var13 = var12[var13];
							var14 = (byte) (var13 & 255);
							var13 >>= 8;
							++var4;
							var6 = (var14 & 255) + 4;
							var13 = var12[var13];
							var5 = (byte) (var13 & 255);
							var13 >>= 8;
							++var4;
						}
				}
		}

		final int var11 = var0.anInt280;
		var0.anInt280 += var3 - var3;
		if (var0.anInt280 < var11)
			;

		var0.aByte281 = var1;
		var0.anInt282 = var6;
		var0.anInt290 = var4;
		var0.anInt273 = var5;
		Class92.anIntArray698 = var12;
		var0.anInt279 = var13;
		var0.aByteArray283 = var7;
		var0.anInt278 = var8;
		var0.anInt277 = var3;
	}

	public static int method321(final byte[] var0, int var1, final byte[] var2, final int var3, final int var4) {
		final Class30 var5 = aClass30_604;
		synchronized (var5) {
			aClass30_604.aByteArray274 = var2;
			aClass30_604.anInt289 = var4;
			aClass30_604.aByteArray283 = var0;
			aClass30_604.anInt278 = 0;
			aClass30_604.anInt277 = var1;
			aClass30_604.anInt284 = 0;
			aClass30_604.anInt270 = 0;
			aClass30_604.anInt276 = 0;
			aClass30_604.anInt280 = 0;
			method319(aClass30_604);
			var1 -= aClass30_604.anInt277;
			aClass30_604.aByteArray274 = null;
			aClass30_604.aByteArray283 = null;
			return var1;
		}
	}

	static byte method322(final Class30 var0) {
		return (byte) method324(8, var0);
	}

	static byte method323(final Class30 var0) {
		return (byte) method324(1, var0);
	}

	static int method324(final int var0, final Class30 var1) {
		while (var1.anInt284 < var0) {
			var1.anInt270 = (var1.anInt270 << 8) | (var1.aByteArray274[var1.anInt289] & 255);
			var1.anInt284 += 8;
			++var1.anInt289;
			++var1.anInt276;
			if (var1.anInt276 == 0)
				;
		}

		final int var2 = (var1.anInt270 >> (var1.anInt284 - var0)) & ((1 << var0) - 1);
		var1.anInt284 -= var0;
		return var2;
	}

	static void method325(final Class30 var0) {
		var0.anInt306 = 0;

		for (int var1 = 0; var1 < 256; ++var1)
			if (var0.aBoolArray293[var1]) {
				var0.aByteArray307[var0.anInt306] = (byte) var1;
				++var0.anInt306;
			}

	}

	static void method326(final int[] var0, final int[] var1, final int[] var2, final byte[] var3, final int var4,
			final int var5, final int var6) {
		int var7 = 0;

		int var8;
		for (var8 = var4; var8 <= var5; ++var8)
			for (int var9 = 0; var9 < var6; ++var9)
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}

		for (var8 = 0; var8 < 23; ++var8)
			var1[var8] = 0;

		for (var8 = 0; var8 < var6; ++var8)
			++var1[var3[var8] + 1];

		for (var8 = 1; var8 < 23; ++var8)
			var1[var8] += var1[var8 - 1];

		for (var8 = 0; var8 < 23; ++var8)
			var0[var8] = 0;

		int var10 = 0;

		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8)
			var1[var8] = ((var0[var8 - 1] + 1) << 1) - var1[var8];

	}
}
