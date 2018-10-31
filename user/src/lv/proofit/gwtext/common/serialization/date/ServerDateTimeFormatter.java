package lv.proofit.gwtext.common.serialization.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gwt.core.shared.GwtIncompatible;

class ServerDateTimeFormatter implements DateTimeFormatter {

	private static final String DEPENDENCY_NOT_AVAILABLE_ON_CLIENT_SIDE = "Server side class. SimpleDateFormat is not available on client side.";

	@Override
	@GwtIncompatible(DEPENDENCY_NOT_AVAILABLE_ON_CLIENT_SIDE)
	public String format(Date date) {
		return new SimpleDateFormat(PATTERN).format(date);
	}

	@Override
	@GwtIncompatible(DEPENDENCY_NOT_AVAILABLE_ON_CLIENT_SIDE)
	public Date parse(String dateString) throws DateParseException {
		try {
			return new SimpleDateFormat(PATTERN).parse(dateString);
		} catch (ParseException e) {
			throw new DateParseException(e);
		}
	}

}