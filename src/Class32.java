import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

public class Class32 {
	protected static String aString316;
	static String[][] aStringArrayArray314 = new String[][] {
			{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" },
			{ "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };
	static String[] aStringArray313 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	static Calendar aCalendar315;

	static {
		Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
		aCalendar315 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	public static int method140(final String var0) {
		return var0.length() + 1;
	}

	public static String method141(long var0) {
		if ((var0 > 0L) && (var0 < 6582952005840035281L)) {
			if ((var0 % 37L) == 0L)
				return null;
			else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L)
					++var2;

				final StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					final long var6 = var0;
					var0 /= 37L;
					var5.append(Class80.aCharArray630[(int) (var6 - (var0 * 37L))]);
				}

				return var5.reverse().toString();
			}
		} else
			return null;
	}

	static final void method142(final boolean var0) {
		Class52.method255();
		++client.anInt2009;
		if ((client.anInt2009 >= 50) || var0) {
			client.anInt2009 = 0;
			if (!client.aBool2020 && (Class48.aClass82_506 != null)) {
				client.secureBuffer.method840(132);

				try {
					Class48.aClass82_506.method342(client.secureBuffer.data, 0,
							client.secureBuffer.position);
					client.secureBuffer.position = 0;
				} catch (final IOException var2) {
					client.aBool2020 = true;
				}
			}

		}
	}
}
