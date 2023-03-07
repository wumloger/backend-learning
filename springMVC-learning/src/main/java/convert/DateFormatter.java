package convert;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formattable;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {
    String dateParttern = "yyyy-MM-dd HH:mm:ss";
    @Override
    public Date parse(String source, Locale locale) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateParttern);
        return simpleDateFormat.parse(source);
    }

    @Override
    public String print(Date date, Locale locale) {
        return new SimpleDateFormat().format(date);
    }
}
