package lv.proofit.gwtext.common.serialization.date;

import java.util.Date;

public interface DateTimeFormatter {
	String PATTERN = "yyyy-MM-dd HH:mm:ss.S";

	String format(Date date);

	Date parse(String dateString);
}