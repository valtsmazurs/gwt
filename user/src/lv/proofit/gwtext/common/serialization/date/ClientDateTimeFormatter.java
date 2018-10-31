package lv.proofit.gwtext.common.serialization.date;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;

class ClientDateTimeFormatter implements DateTimeFormatter {

	@Override
	public String format(Date date) {
		return DateTimeFormat.getFormat(PATTERN).format(date);
	}

	@Override
	public Date parse(String dateString) {
		return DateTimeFormat.getFormat(PATTERN).parse(dateString);
	}
}