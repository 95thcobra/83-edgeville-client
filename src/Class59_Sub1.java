import java.nio.ByteBuffer;

public class Class59_Sub1 extends Class59 {
	ByteBuffer aByteBuffer1053;

	@Override
	void method274(final byte[] var1, final byte var2) {
		aByteBuffer1053 = ByteBuffer.allocateDirect(var1.length);
		aByteBuffer1053.position(0);
		aByteBuffer1053.put(var1);
	}

	@Override
	byte[] method272(final byte var1) {
		final byte[] var2 = new byte[aByteBuffer1053.capacity()];
		aByteBuffer1053.position(0);
		aByteBuffer1053.get(var2);
		return var2;
	}
}
