import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class97 {
	static final int method366(final long var0, final String var2) {
		final Random var3 = new Random();
		final DataBuffer var4 = new DataBuffer(128);
		final DataBuffer var5 = new DataBuffer(128);
		final int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (var0 >> 32), (int) var0 };
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7)
			var4.writeInt(var3.nextInt());

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.method586(var0);
		var4.method586(0L);

		for (var7 = 0; var7 < 4; ++var7)
			var4.writeInt(var3.nextInt());

		var4.doRsa(Class29.aBigInteger267, Class29.aBigInteger266);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7)
			var5.writeInt(var3.nextInt());

		var5.method586(var3.nextLong());
		var5.method556(var3.nextLong());
		Class8_Sub2.writeRandomDat(var5);
		var5.method586(var3.nextLong());
		var5.doRsa(Class29.aBigInteger267, Class29.aBigInteger266);
		var7 = Class32.method140(var2);
		if ((var7 % 8) != 0)
			var7 += 8 - (var7 % 8);

		final DataBuffer var8 = new DataBuffer(var7);
		var8.writeString(var2);
		var8.position = var7;
		var8.method576(var6);
		DataBuffer var9 = new DataBuffer(var8.position + var5.position + var4.position + 5);
		var9.writeByte(2);
		var9.writeByte(var4.position);
		var9.writeBytes(var4.data, 0, var4.position);
		var9.writeByte(var5.position);
		var9.writeBytes(var5.data, 0, var5.position);
		var9.writeShort(var8.position);
		var9.writeBytes(var8.data, 0, var8.position);
		final byte[] var10 = var9.data;
		final String var11 = Class56.method267(var10, 0, var10.length);
		final String var12 = var11;

		try {
			final URL var13 = new URL(
					Class109_Sub21_Sub15_Sub1.method890("services", false) + "m=accountappeal/login.ws");
			final URLConnection var14 = var13.openConnection();
			var14.setDoInput(true);
			var14.setDoOutput(true);
			var14.setConnectTimeout(5000);
			final OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
			var15.write(
					"data2=" + Class8_Sub2.method498(var12) + "&dest=" + Class8_Sub2.method498("passwordchoice.ws"));
			var15.flush();
			final InputStream var16 = var14.getInputStream();
			var9 = new DataBuffer(new byte[1000]);

			do {
				final int var17 = var16.read(var9.data, var9.position, 1000 - var9.position);
				if (var17 == -1) {
					var15.close();
					var16.close();
					String var18 = new String(var9.data);
					if (var18.startsWith("OFFLINE"))
						return 4;
					else if (var18.startsWith("WRONG"))
						return 7;
					else if (var18.startsWith("RELOAD"))
						return 3;
					else if (var18.startsWith("Not permitted for social network accounts."))
						return 6;
					else {
						var9.method577(var6);

						while ((var9.position > 0) && (var9.data[var9.position - 1] == 0))
							--var9.position;

						var18 = new String(var9.data, 0, var9.position);
						boolean var19;
						if (var18 == null)
							var19 = false;
						else
							label72: {
								try {
									new URL(var18);
								} catch (final MalformedURLException var21) {
									var19 = false;
									break label72;
								}

								var19 = true;
							}

						if (var19) {
							Class109_Sub21_Sub15_Sub6.method979(var18, true, false);
							return 2;
						} else
							return 5;
					}
				}

				var9.position += var17;
			} while (var9.position < 1000);

			return 5;
		} catch (final Throwable var22) {
			var22.printStackTrace();
			return 5;
		}
	}
}
