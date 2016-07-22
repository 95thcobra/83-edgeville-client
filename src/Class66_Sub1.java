import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class66_Sub1 extends Class66 implements MouseWheelListener {
	int anInt1082 = 0;

	@Override
	public void method293(final Component var1, final byte var2) {
		var1.addMouseWheelListener(this);
	}

	@Override
	public synchronized int method297(final byte var1) {
		final int var2 = anInt1082;
		anInt1082 = 0;
		return var2;
	}

	@Override
	public synchronized void mouseWheelMoved(final MouseWheelEvent var1) {
		anInt1082 += var1.getWheelRotation();
	}

	@Override
	public void method294(final Component var1, final byte var2) {
		var1.removeMouseWheelListener(this);
	}
}
