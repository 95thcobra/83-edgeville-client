import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class81 implements MouseListener, MouseMotionListener, FocusListener {
	public static volatile int anInt631 = 0;
	static volatile int anInt640 = 0;
	static volatile int anInt641 = 0;
	static volatile long aLong642 = 0L;
	static volatile int anInt646 = 0;
	static volatile int anInt633 = 0;
	static volatile int anInt634 = -1;
	static volatile int anInt635 = -1;
	public static Class81 aClass81_644 = new Class81();
	public static int anInt636 = 0;
	public static int anInt637 = 0;
	public static int anInt638 = 0;
	public static int anInt643 = 0;
	public static int anInt645 = 0;
	public static int anInt639 = 0;
	public static long aLong632 = 0L;

	@Override
	public final synchronized void mousePressed(final MouseEvent var1) {
		if (aClass81_644 != null) {
			anInt631 = 0;
			anInt640 = var1.getX();
			anInt641 = var1.getY();
			aLong642 = Class109_Sub21_Sub15.method829(483538387);
			if (var1.isAltDown()) {
				anInt646 = 4;
				anInt633 = 4;
			} else if (var1.isMetaDown()) {
				anInt646 = 2;
				anInt633 = 2;
			} else {
				anInt646 = 1;
				anInt633 = 1;
			}
		}

		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent var1) {
		if (aClass81_644 != null) {
			anInt631 = 0;
			anInt633 = 0;
		}

		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final void mouseClicked(final MouseEvent var1) {
		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final synchronized void mouseExited(final MouseEvent var1) {
		if (aClass81_644 != null) {
			anInt631 = 0;
			anInt634 = -1;
			anInt635 = -1;
		}

	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent var1) {
		if (aClass81_644 != null) {
			anInt631 = 0;
			anInt634 = var1.getX();
			anInt635 = var1.getY();
		}

	}

	@Override
	public final void focusGained(final FocusEvent var1) {
	}

	@Override
	public final synchronized void focusLost(final FocusEvent var1) {
		if (null != aClass81_644)
			anInt633 = 0;

	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent var1) {
		if (null != aClass81_644) {
			anInt631 = 0;
			anInt634 = var1.getX();
			anInt635 = var1.getY();
		}

	}

	public static Class98[] method336() {
		return new Class98[] { Class98.aClass98_728, Class98.aClass98_722, Class98.aClass98_729, Class98.aClass98_727,
				Class98.aClass98_721, Class98.aClass98_724, Class98.aClass98_725, Class98.aClass98_730,
				Class98.aClass98_732, Class98.aClass98_719, Class98.aClass98_723, Class98.aClass98_718,
				Class98.aClass98_720, Class98.aClass98_731, Class98.aClass98_726 };
	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent var1) {
		if (null != aClass81_644) {
			anInt631 = 0;
			anInt634 = var1.getX();
			anInt635 = var1.getY();
		}

	}

	static Class46 method337() {
		return Class46.anInt482 < Class46.anInt481 ? Class46.aClass46Array485[++Class46.anInt482 - 1] : null;
	}
}
