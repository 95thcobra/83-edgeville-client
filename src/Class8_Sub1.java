import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class8_Sub1 extends Class8 {
	Component aComponent902;

	@Override
	public final void method50(final Graphics var1, final int var2, final int var3, final byte var4) {
		var1.drawImage(anImage88, var2, var3, aComponent902);
	}

	@Override
	public final void method49(final Graphics var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		final Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage88, 0, 0, aComponent902);
		var1.setClip(var7);
	}

	@Override
	final void method48(final int var1, final int var2, final Component var3, final int var4) {
		anInt90 = var1;
		anInt87 = var2;
		anIntArray91 = new int[1 + (var2 * var1)];
		final DataBufferInt var7 = new DataBufferInt(anIntArray91, anIntArray91.length);
		final DirectColorModel var5 = new DirectColorModel(32, 16711680, '\uff00', 255);
		final WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(anInt90, anInt87),
				var7, (Point) null);
		anImage88 = new BufferedImage(var5, var6, false, new Hashtable());
		aComponent902 = var3;
		method51();
	}
}
