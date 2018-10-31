package lv.proofit.gwtext.common.serialization.date;

import com.google.gwt.core.client.GWT;

public final class DateTimeFormatterFactory {

	public static DateTimeFormatter get() {
		if (GWT.isClient()) {
			return new ClientDateTimeFormatter();
		} else {
			return new ServerDateTimeFormatter();
		}
	}

}