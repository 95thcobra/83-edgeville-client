public class Class138 {
	int anInt893 = 0;
	int anInt894 = 0;
	int anInt895;
	int anInt896;
	public int[][] anIntArrayArray892;

	public void method484() {
		for (int var1 = 0; var1 < anInt895; ++var1)
			for (int var2 = 0; var2 < anInt896; ++var2)
				if ((var1 != 0) && (var2 != 0) && (var1 < (anInt895 - 5)) && (var2 < (anInt896 - 5)))
					anIntArrayArray892[var1][var2] = 16777216;
				else
					anIntArrayArray892[var1][var2] = 16777215;

	}

	public void method485(int var1, int var2, final int var3, final int var4, final boolean var5) {
		var1 -= anInt893;
		var2 -= anInt894;
		if (var3 == 0) {
			if (var4 == 0) {
				method488(var1, var2, 128);
				method488(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				method488(var1, var2, 2);
				method488(var1, 1 + var2, 32);
			}

			if (var4 == 2) {
				method488(var1, var2, 8);
				method488(1 + var1, var2, 128);
			}

			if (var4 == 3) {
				method488(var1, var2, 32);
				method488(var1, var2 - 1, 2);
			}
		}

		if ((var3 == 1) || (var3 == 3)) {
			if (var4 == 0) {
				method488(var1, var2, 1);
				method488(var1 - 1, 1 + var2, 16);
			}

			if (var4 == 1) {
				method488(var1, var2, 4);
				method488(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				method488(var1, var2, 16);
				method488(1 + var1, var2 - 1, 1);
			}

			if (var4 == 3) {
				method488(var1, var2, 64);
				method488(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method488(var1, var2, 130);
				method488(var1 - 1, var2, 8);
				method488(var1, 1 + var2, 32);
			}

			if (var4 == 1) {
				method488(var1, var2, 10);
				method488(var1, 1 + var2, 32);
				method488(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				method488(var1, var2, 40);
				method488(1 + var1, var2, 128);
				method488(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				method488(var1, var2, 160);
				method488(var1, var2 - 1, 2);
				method488(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method488(var1, var2, 65536);
					method488(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					method488(var1, var2, 1024);
					method488(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					method488(var1, var2, 4096);
					method488(1 + var1, var2, 65536);
				}

				if (var4 == 3) {
					method488(var1, var2, 16384);
					method488(var1, var2 - 1, 1024);
				}
			}

			if ((var3 == 1) || (var3 == 3)) {
				if (var4 == 0) {
					method488(var1, var2, 512);
					method488(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					method488(var1, var2, 2048);
					method488(var1 + 1, 1 + var2, '\u8000');
				}

				if (var4 == 2) {
					method488(var1, var2, 8192);
					method488(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					method488(var1, var2, '\u8000');
					method488(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method488(var1, var2, 66560);
					method488(var1 - 1, var2, 4096);
					method488(var1, 1 + var2, 16384);
				}

				if (var4 == 1) {
					method488(var1, var2, 5120);
					method488(var1, var2 + 1, 16384);
					method488(1 + var1, var2, 65536);
				}

				if (var4 == 2) {
					method488(var1, var2, 20480);
					method488(var1 + 1, var2, 65536);
					method488(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					method488(var1, var2, 81920);
					method488(var1, var2 - 1, 1024);
					method488(var1 - 1, var2, 4096);
				}
			}
		}

	}

	public void method486(int var1, int var2, final int var3, final int var4, final boolean var5) {
		int var6 = 256;
		if (var5)
			var6 += 131072;

		var1 -= anInt893;
		var2 -= anInt894;

		for (int var7 = var1; var7 < (var3 + var1); ++var7)
			if ((var7 >= 0) && (var7 < anInt895))
				for (int var8 = var2; var8 < (var2 + var4); ++var8)
					if ((var8 >= 0) && (var8 < anInt896))
						method488(var7, var8, var6);

	}

	public void method487(int var1, int var2) {
		var1 -= anInt893;
		var2 -= anInt894;
		anIntArrayArray892[var1][var2] |= 262144;
	}

	void method488(final int var1, final int var2, final int var3) {
		anIntArrayArray892[var1][var2] |= var3;
	}

	void method489(final int var1, final int var2, final int var3) {
		anIntArrayArray892[var1][var2] &= ~var3;
	}

	public void method490(int var1, int var2) {
		var1 -= anInt893;
		var2 -= anInt894;
		anIntArrayArray892[var1][var2] &= -262145;
	}

	public Class138(final int var1, final int var2) {
		anInt895 = var1;
		anInt896 = var2;
		anIntArrayArray892 = new int[anInt895][anInt896];
		method484();
	}

	public void method491(int var1, int var2) {
		var1 -= anInt893;
		var2 -= anInt894;
		anIntArrayArray892[var1][var2] |= 2097152;
	}

	public void method492(int var1, int var2, int var3, int var4, final int var5, final boolean var6) {
		int var7 = 256;
		if (var6)
			var7 += 131072;

		var1 -= anInt893;
		var2 -= anInt894;
		int var8;
		if ((var5 == 1) || (var5 == 3)) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < (var1 + var3); ++var8)
			if ((var8 >= 0) && (var8 < anInt895))
				for (int var9 = var2; var9 < (var4 + var2); ++var9)
					if ((var9 >= 0) && (var9 < anInt896))
						method489(var8, var9, var7);

	}

	public void method493(int var1, int var2, final int var3, final int var4, final boolean var5) {
		var1 -= anInt893;
		var2 -= anInt894;
		if (var3 == 0) {
			if (var4 == 0) {
				method489(var1, var2, 128);
				method489(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				method489(var1, var2, 2);
				method489(var1, 1 + var2, 32);
			}

			if (var4 == 2) {
				method489(var1, var2, 8);
				method489(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				method489(var1, var2, 32);
				method489(var1, var2 - 1, 2);
			}
		}

		if ((var3 == 1) || (var3 == 3)) {
			if (var4 == 0) {
				method489(var1, var2, 1);
				method489(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				method489(var1, var2, 4);
				method489(1 + var1, var2 + 1, 64);
			}

			if (var4 == 2) {
				method489(var1, var2, 16);
				method489(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				method489(var1, var2, 64);
				method489(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method489(var1, var2, 130);
				method489(var1 - 1, var2, 8);
				method489(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				method489(var1, var2, 10);
				method489(var1, 1 + var2, 32);
				method489(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				method489(var1, var2, 40);
				method489(1 + var1, var2, 128);
				method489(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				method489(var1, var2, 160);
				method489(var1, var2 - 1, 2);
				method489(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method489(var1, var2, 65536);
					method489(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					method489(var1, var2, 1024);
					method489(var1, 1 + var2, 16384);
				}

				if (var4 == 2) {
					method489(var1, var2, 4096);
					method489(1 + var1, var2, 65536);
				}

				if (var4 == 3) {
					method489(var1, var2, 16384);
					method489(var1, var2 - 1, 1024);
				}
			}

			if ((var3 == 1) || (var3 == 3)) {
				if (var4 == 0) {
					method489(var1, var2, 512);
					method489(var1 - 1, 1 + var2, 8192);
				}

				if (var4 == 1) {
					method489(var1, var2, 2048);
					method489(1 + var1, var2 + 1, '\u8000');
				}

				if (var4 == 2) {
					method489(var1, var2, 8192);
					method489(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					method489(var1, var2, '\u8000');
					method489(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method489(var1, var2, 66560);
					method489(var1 - 1, var2, 4096);
					method489(var1, 1 + var2, 16384);
				}

				if (var4 == 1) {
					method489(var1, var2, 5120);
					method489(var1, 1 + var2, 16384);
					method489(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					method489(var1, var2, 20480);
					method489(var1 + 1, var2, 65536);
					method489(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					method489(var1, var2, 81920);
					method489(var1, var2 - 1, 1024);
					method489(var1 - 1, var2, 4096);
				}
			}
		}

	}
}
