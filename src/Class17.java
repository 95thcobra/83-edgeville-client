public class Class17 {
	static long aLong153;
	static int anInt154;
	Class116 aClass116_151 = new Class116(256);
	Class116 aClass116_149 = new Class116(256);
	Class104 aClass104_152;
	Class104 aClass104_150;

	Class109_Sub3_Sub1 method82(final int var1, final int var2, final int[] var3) {
		int var4 = var2 ^ (((var1 << 4) & '\uffff') | (var1 >>> 12));
		var4 |= var1 << 16;
		final long var6 = var4;
		Class109_Sub3_Sub1 var8 = (Class109_Sub3_Sub1) aClass116_149.method429(var6);
		if (null != var8)
			return var8;
		else if ((var3 != null) && (var3[0] <= 0))
			return null;
		else {
			final Class11 var5 = Class11.method58(aClass104_152, var1, var2);
			if (null == var5)
				return null;
			else {
				var8 = var5.method59();
				aClass116_149.method430(var8, var6);
				if (null != var3)
					var3[0] -= var8.aByteArray1550.length;

				return var8;
			}
		}
	}

	public Class17(final Class104 var1, final Class104 var2) {
		aClass104_152 = var1;
		aClass104_150 = var2;
	}

	public Class109_Sub3_Sub1 method83(final int var1, final int[] var2) {
		if (aClass104_150.method403() == 1)
			return method84(0, var1, var2);
		else if (aClass104_150.method401(var1) == 1)
			return method84(var1, 0, var2);
		else
			throw new RuntimeException();
	}

	Class109_Sub3_Sub1 method84(final int var1, final int var2, final int[] var3) {
		int var4 = var2 ^ (((var1 << 4) & '\uffff') | (var1 >>> 12));
		var4 |= var1 << 16;
		final long var7 = var4 ^ 4294967296L;
		Class109_Sub3_Sub1 var6 = (Class109_Sub3_Sub1) aClass116_149.method429(var7);
		if (null != var6)
			return var6;
		else if ((null != var3) && (var3[0] <= 0))
			return null;
		else {
			Class109_Sub5 var5 = (Class109_Sub5) aClass116_151.method429(var7);
			if (null == var5) {
				var5 = Class109_Sub5.method520(aClass104_150, var1, var2);
				if (var5 == null)
					return null;

				aClass116_151.method430(var5, var7);
			}

			var6 = var5.method518(var3);
			if (var6 == null)
				return null;
			else {
				var5.method413();
				aClass116_149.method430(var6, var7);
				return var6;
			}
		}
	}

	public Class109_Sub3_Sub1 method85(final int var1, final int[] var2) {
		if (aClass104_152.method403() == 1)
			return method82(0, var1, var2);
		else if (aClass104_152.method401(var1) == 1)
			return method82(var1, 0, var2);
		else
			throw new RuntimeException();
	}
}
