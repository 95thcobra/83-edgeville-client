public abstract class Class104 {
	static long aLong790;
	public int anInt786;
	int anInt785;
	int[] anIntArray792;
	int[] anIntArray791;
	int[] anIntArray778;
	int[] anIntArray779;
	int[][] anIntArrayArray784;
	Object[] anObjectArray783;
	Object[][] anObjectArrayArray775;
	int[] anIntArray776;
	Class117 aClass117_780;
	int[][] anIntArrayArray787;
	Class117[] aClass117Array782;
	static Class62 aClass62_788 = new Class62();
	static int anInt789 = 0;
	boolean aBool777;
	boolean aBool781;

	void method385(final byte[] var1) {
		anInt786 = Class38.method170(var1, var1.length);
		final DataBuffer var2 = new DataBuffer(Class29.method131(var1));
		final int var4 = var2.method564();
		if ((var4 >= 5) && (var4 <= 7)) {
			if (var4 >= 6)
				var2.readInt();

			final int var3 = var2.method564();
			if (var4 >= 7)
				anInt785 = var2.method598();
			else
				anInt785 = var2.readShort();

			int var10 = 0;
			int var8 = -1;
			anIntArray792 = new int[anInt785];
			int var9;
			if (var4 >= 7)
				for (var9 = 0; var9 < anInt785; ++var9) {
					anIntArray792[var9] = var10 += var2.method598();
					if (anIntArray792[var9] > var8)
						var8 = anIntArray792[var9];
				}
			else
				for (var9 = 0; var9 < anInt785; ++var9) {
					anIntArray792[var9] = var10 += var2.readShort();
					if (anIntArray792[var9] > var8)
						var8 = anIntArray792[var9];
				}

			anIntArray791 = new int[var8 + 1];
			anIntArray778 = new int[var8 + 1];
			anIntArray779 = new int[1 + var8];
			anIntArrayArray784 = new int[1 + var8][];
			anObjectArray783 = new Object[1 + var8];
			anObjectArrayArray775 = new Object[1 + var8][];
			if (var3 != 0) {
				anIntArray776 = new int[var8 + 1];

				for (var9 = 0; var9 < anInt785; ++var9)
					anIntArray776[anIntArray792[var9]] = var2.readInt();

				aClass117_780 = new Class117(anIntArray776);
			}

			for (var9 = 0; var9 < anInt785; ++var9)
				anIntArray791[anIntArray792[var9]] = var2.readInt();

			for (var9 = 0; var9 < anInt785; ++var9)
				anIntArray778[anIntArray792[var9]] = var2.readInt();

			for (var9 = 0; var9 < anInt785; ++var9)
				anIntArray779[anIntArray792[var9]] = var2.readShort();

			int var5;
			int var6;
			int var7;
			int var11;
			int var12;
			if (var4 >= 7)
				for (var9 = 0; var9 < anInt785; ++var9) {
					var5 = anIntArray792[var9];
					var6 = anIntArray779[var5];
					var10 = 0;
					var7 = -1;
					anIntArrayArray784[var5] = new int[var6];

					for (var12 = 0; var12 < var6; ++var12) {
						var11 = anIntArrayArray784[var5][var12] = var10 += var2.method598();
						if (var11 > var7)
							var7 = var11;
					}

					anObjectArrayArray775[var5] = new Object[var7 + 1];
				}
			else
				for (var9 = 0; var9 < anInt785; ++var9) {
					var5 = anIntArray792[var9];
					var6 = anIntArray779[var5];
					var10 = 0;
					var7 = -1;
					anIntArrayArray784[var5] = new int[var6];

					for (var12 = 0; var12 < var6; ++var12) {
						var11 = anIntArrayArray784[var5][var12] = var10 += var2.readShort();
						if (var11 > var7)
							var7 = var11;
					}

					anObjectArrayArray775[var5] = new Object[1 + var7];
				}

			if (var3 != 0) {
				anIntArrayArray787 = new int[var8 + 1][];
				aClass117Array782 = new Class117[var8 + 1];

				for (var9 = 0; var9 < anInt785; ++var9) {
					var5 = anIntArray792[var9];
					var6 = anIntArray779[var5];
					anIntArrayArray787[var5] = new int[anObjectArrayArray775[var5].length];

					for (var7 = 0; var7 < var6; ++var7)
						anIntArrayArray787[var5][anIntArrayArray784[var5][var7]] = var2.readInt();

					aClass117Array782[var5] = new Class117(anIntArrayArray787[var5]);
				}
			}

		} else
			throw new RuntimeException("");
	}

	void method386(final int var1, final byte var2) {
	}

	public byte[] method387(final int var1, final int var2) {
		return method390(var1, var2, (int[]) null);
	}

	public void method388(final int var1) {
		for (int var2 = 0; var2 < anObjectArrayArray775[var1].length; ++var2)
			anObjectArrayArray775[var1][var2] = null;

	}

	public boolean method389(final int var1, final int var2) {
		if ((var1 >= 0) && (var1 < anObjectArrayArray775.length) && (null != anObjectArrayArray775[var1]) && (var2 >= 0)
				&& (var2 < anObjectArrayArray775[var1].length)) {
			if (anObjectArrayArray775[var1][var2] != null)
				return true;
			else if (anObjectArray783[var1] != null)
				return true;
			else {
				method404(var1, 1999686886);
				return null != anObjectArray783[var1];
			}
		} else
			return false;
	}

	public byte[] method390(final int var1, final int var2, final int[] var3) {
		if ((var1 >= 0) && (var1 < anObjectArrayArray775.length) && (null != anObjectArrayArray775[var1]) && (var2 >= 0)
				&& (var2 < anObjectArrayArray775[var1].length)) {
			if (null == anObjectArrayArray775[var1][var2]) {
				boolean var4 = method395(var1, var3);
				if (!var4) {
					method404(var1, 1702682848);
					var4 = method395(var1, var3);
					if (!var4)
						return null;
				}
			}

			final byte[] var5 = Class109_Sub9.method529(anObjectArrayArray775[var1][var2], false);
			if (aBool781)
				anObjectArrayArray775[var1][var2] = null;

			return var5;
		} else
			return null;
	}

	public boolean method391() {
		boolean var1 = true;

		for (final int var3 : anIntArray792) {
			if (null == anObjectArray783[var3]) {
				method404(var3, 756450414);
				if (null == anObjectArray783[var3])
					var1 = false;
			}
		}

		return var1;
	}

	public byte[] method392(final int var1) {
		if (anObjectArrayArray775.length == 1)
			return method387(0, var1);
		else if (anObjectArrayArray775[var1].length == 1)
			return method387(var1, 0);
		else
			throw new RuntimeException();
	}

	public int[] method393(final int var1) {
		return anIntArrayArray784[var1];
	}

	public void method394() {
		for (int var1 = 0; var1 < anObjectArrayArray775.length; ++var1)
			if (anObjectArrayArray775[var1] != null)
				for (int var2 = 0; var2 < anObjectArrayArray775[var1].length; ++var2)
					anObjectArrayArray775[var1][var2] = null;

	}

	boolean method395(final int var1, final int[] var2) {
		if (null == anObjectArray783[var1])
			return false;
		else {
			final int var3 = anIntArray779[var1];
			final int[] var4 = anIntArrayArray784[var1];
			final Object[] var5 = anObjectArrayArray775[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; ++var7)
				if (var5[var4[var7]] == null) {
					var6 = false;
					break;
				}

			if (var6)
				return true;
			else {
				byte[] var8;
				if ((var2 == null) || ((var2[0] == 0) && (var2[1] == 0) && (var2[2] == 0) && (var2[3] == 0)))
					var8 = Class109_Sub9.method529(anObjectArray783[var1], false);
				else {
					var8 = Class109_Sub9.method529(anObjectArray783[var1], true);
					final DataBuffer var9 = new DataBuffer(var8);
					var9.method606(var2, 5, var9.data.length);
				}

				final byte[] var20 = Class29.method131(var8);
				if (aBool777)
					anObjectArray783[var1] = null;

				if (var3 > 1) {
					int var10 = var20.length;
					--var10;
					final int var11 = var20[var10] & 255;
					var10 -= 4 * var3 * var11;
					final DataBuffer var12 = new DataBuffer(var20);
					final int[] var13 = new int[var3];
					var12.position = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var3; ++var16) {
							var15 += var12.readInt();
							var13[var16] += var15;
						}
					}

					final byte[][] var17 = new byte[var3][];

					for (var15 = 0; var15 < var3; ++var15) {
						var17[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.position = var10;
					var15 = 0;

					for (var16 = 0; var16 < var11; ++var16) {
						int var18 = 0;

						for (int var19 = 0; var19 < var3; ++var19) {
							var18 += var12.readInt();
							System.arraycopy(var20, var15, var17[var19], var13[var19], var18);
							var13[var19] += var18;
							var15 += var18;
						}
					}

					for (var16 = 0; var16 < var3; ++var16)
						if (!aBool781)
							var5[var4[var16]] = Class21.method101(var17[var16], false);
						else
							var5[var4[var16]] = var17[var16];
				} else if (!aBool781)
					var5[var4[0]] = Class21.method101(var20, false);
				else
					var5[var4[0]] = var20;

				return true;
			}
		}
	}

	public int method396(String var1) {
		var1 = var1.toLowerCase();
		return aClass117_780.method434(Class109_Sub21_Sub12.method756(var1));
	}

	public int method397(final int var1, String var2) {
		var2 = var2.toLowerCase();
		return aClass117Array782[var1].method434(Class109_Sub21_Sub12.method756(var2));
	}

	public boolean method398(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		final int var3 = aClass117_780.method434(Class109_Sub21_Sub12.method756(var1));
		final int var4 = aClass117Array782[var3].method434(Class109_Sub21_Sub12.method756(var2));
		return method389(var3, var4);
	}

	public boolean method399(final String var1) {
		final int var2 = method396("");
		return var2 != -1 ? method398("", var1) : method398(var1, "");
	}

	public void method400(String var1) {
		var1 = var1.toLowerCase();
		final int var2 = aClass117_780.method434(Class109_Sub21_Sub12.method756(var1));
		if (var2 >= 0)
			method386(var2, (byte) 100);
	}

	public int method401(final int var1) {
		return anObjectArrayArray775[var1].length;
	}

	public byte[] method402(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		final int var3 = aClass117_780.method434(Class109_Sub21_Sub12.method756(var1));
		final int var4 = aClass117Array782[var3].method434(Class109_Sub21_Sub12.method756(var2));
		return method387(var3, var4);
	}

	public int method403() {
		return anObjectArrayArray775.length;
	}

	void method404(final int var1, final int var2) {
	}

	public byte[] method405(final int var1, final int var2) {
		if ((var1 >= 0) && (var1 < anObjectArrayArray775.length) && (anObjectArrayArray775[var1] != null) && (var2 >= 0)
				&& (var2 < anObjectArrayArray775[var1].length)) {
			if (anObjectArrayArray775[var1][var2] == null) {
				boolean var4 = method395(var1, (int[]) null);
				if (!var4) {
					method404(var1, 1681218395);
					var4 = method395(var1, (int[]) null);
					if (!var4)
						return null;
				}
			}

			final byte[] var3 = Class109_Sub9.method529(anObjectArrayArray775[var1][var2], false);
			return var3;
		} else
			return null;
	}

	Class104(final boolean var1, final boolean var2) {
		aBool777 = var1;
		aBool781 = var2;
	}

	public byte[] method406(final int var1) {
		if (anObjectArrayArray775.length == 1)
			return method405(0, var1);
		else if (anObjectArrayArray775[var1].length == 1)
			return method405(var1, 0);
		else
			throw new RuntimeException();
	}

	public boolean method407(final int var1) {
		if (anObjectArray783[var1] != null)
			return true;
		else {
			method404(var1, -701605731);
			return null != anObjectArray783[var1];
		}
	}

	static boolean method408(final Class109_Sub20 var0) {
		if (client.aBool2138) {
			if (Class52.method256(var0) != 0)
				return false;

			if (var0.anInt1229 == 0)
				return false;
		}

		return var0.aBool1167;
	}

	static final boolean method409(final char var0) {
		return (var0 == 160) || (var0 == 32) || (var0 == 95) || (var0 == 45);
	}
}
