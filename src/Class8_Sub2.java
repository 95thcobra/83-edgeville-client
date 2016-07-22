import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.Hashtable;

public final class Class8_Sub2 extends Class8 implements ImageProducer, ImageObserver {
	static Class109_Sub21_Sub14_Sub2 aClass109_Sub21_Sub14_Sub2_904;
	static int anInt905;
	ColorModel aColorModel906;
	ImageConsumer anImageConsumer903;

	@Override
	final void method48(final int var1, final int var2, final Component var3, final int var4) {
		anInt90 = var1;
		anInt87 = var2;
		anIntArray91 = new int[(var1 * var2) + 1];
		aColorModel906 = new DirectColorModel(32, 16711680, '\uff00', 255);
		anImage88 = var3.createImage(this);
		method495();
		var3.prepareImage(anImage88, this);
		method495();
		var3.prepareImage(anImage88, this);
		method495();
		var3.prepareImage(anImage88, this);
		method51();
	}

	@Override
	public final void method50(final Graphics var1, final int var2, final int var3, final byte var4) {
		method495();
		var1.drawImage(anImage88, var2, var3, this);
	}

	@Override
	public synchronized void removeConsumer(final ImageConsumer var1) {
		if (var1 == anImageConsumer903)
			anImageConsumer903 = null;

	}

	@Override
	public final void method49(final Graphics var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		method496(var2, var3, var4, var5);
		final Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage88, 0, 0, this);
		var1.setClip(var7);
	}

	@Override
	public synchronized boolean isConsumer(final ImageConsumer var1) {
		return anImageConsumer903 == var1;
	}

	synchronized void method495() {
		if (anImageConsumer903 != null) {
			anImageConsumer903.setPixels(0, 0, anInt90, anInt87, aColorModel906, anIntArray91, 0, anInt90);
			anImageConsumer903.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate(final Image var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		return true;
	}

	@Override
	public synchronized void addConsumer(final ImageConsumer var1) {
		anImageConsumer903 = var1;
		var1.setDimensions(anInt90, anInt87);
		var1.setProperties((Hashtable) null);
		var1.setColorModel(aColorModel906);
		var1.setHints(14);
	}

	@Override
	public void startProduction(final ImageConsumer var1) {
		addConsumer(var1);
	}

	@Override
	public void requestTopDownLeftRightResend(final ImageConsumer var1) {
	}

	synchronized void method496(final int var1, final int var2, final int var3, final int var4) {
		if (null != anImageConsumer903) {
			anImageConsumer903.setPixels(var1, var2, var3, var4, aColorModel906, anIntArray91, (var2 * anInt90) + var1,
					anInt90);
			anImageConsumer903.imageComplete(2);
		}
	}

	public static void writeRandomDat(final DataBuffer var0) {
		final byte[] var1 = new byte[24];

		try {
			Class77.aClass130_623.method465(0L);
			Class77.aClass130_623.method467(var1);

			int var2;
			for (var2 = 0; (var2 < 24) && (var1[var2] == 0); ++var2)
				;

			if (var2 >= 24)
				throw new IOException();
		} catch (final Exception var5) {
			for (int var4 = 0; var4 < 24; ++var4)
				var1[var4] = -1;
		}

		var0.writeBytes(var1, 0, 24);
	}

	public static String method498(final CharSequence var0) {
		final int var1 = var0.length();
		final StringBuilder var4 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			final char var2 = var0.charAt(var3);
			if (((var2 < 97) || (var2 > 122)) && ((var2 < 65) || (var2 > 90)) && ((var2 < 48) || (var2 > 57))
					&& (var2 != 46) && (var2 != 45) && (var2 != 42) && (var2 != 95)) {
				if (var2 == 32)
					var4.append('\u002b');
				else {
					final byte var6 = Class109_Sub15.method624(var2);
					var4.append('\u0025');
					int var5 = (var6 >> 4) & 15;
					if (var5 >= 10)
						var4.append((char) (55 + var5));
					else
						var4.append((char) (var5 + 48));

					var5 = var6 & 15;
					if (var5 >= 10)
						var4.append((char) (var5 + 55));
					else
						var4.append((char) (var5 + 48));
				}
			} else
				var4.append(var2);
		}

		return var4.toString();
	}
}
