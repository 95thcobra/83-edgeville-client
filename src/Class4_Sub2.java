import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class4_Sub2 extends Class4 {
	AudioFormat anAudioFormat922;
	byte[] aByteArray923;
	SourceDataLine aSourceDataLine921;
	int anInt920;

	@Override
	void method35(final Component var1) {
		anAudioFormat922 = new AudioFormat(Class122.anInt848, 16, Class31.aBool308 ? 2 : 1, true, false);
		aByteArray923 = new byte[256 << (Class31.aBool308 ? 2 : 1)];
	}

	@Override
	void method22() {
		if (null != aSourceDataLine921) {
			aSourceDataLine921.close();
			aSourceDataLine921 = null;
		}

	}

	@Override
	void method27(final int var1) throws LineUnavailableException {
		try {
			final Info var2 = new Info(SourceDataLine.class, anAudioFormat922, var1 << (Class31.aBool308 ? 2 : 1));
			aSourceDataLine921 = (SourceDataLine) AudioSystem.getLine(var2);
			aSourceDataLine921.open();
			aSourceDataLine921.start();
			anInt920 = var1;
		} catch (final LineUnavailableException var3) {
			if (Class38.method166(var1) != 1)
				method27(Class8.method47(var1));
			else {
				aSourceDataLine921 = null;
				throw var3;
			}
		}
	}

	@Override
	int method28() {
		return anInt920 - (aSourceDataLine921.available() >> (Class31.aBool308 ? 2 : 1));
	}

	@Override
	void method31() {
		int var1 = 256;
		if (Class31.aBool308)
			var1 <<= 1;

		for (int var3 = 0; var3 < var1; ++var3) {
			int var2 = anIntArray31[var3];
			if (((8388608 + var2) & -16777216) != 0)
				var2 = 8388607 ^ (var2 >> 31);

			aByteArray923[2 * var3] = (byte) (var2 >> 8);
			aByteArray923[(var3 * 2) + 1] = (byte) (var2 >> 16);
		}

		aSourceDataLine921.write(aByteArray923, 0, var1 << 1);
	}

	@Override
	void method30() {
		aSourceDataLine921.flush();
	}
}
