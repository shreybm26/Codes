package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateUtils {
    public static int calculateDateDifferenceInDays(String dateStr1, String dateStr2) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = dateFormat.parse(dateStr1);
        Date date2 = dateFormat.parse(dateStr2);

        long diffInMilliseconds = Math.abs(date1.getTime() - date2.getTime());
        long diffInDays = diffInMilliseconds / (24 * 60 * 60 * 1000);

        return (int) diffInDays;
    }

    public static String formatDate(String dateStr, String targetFormat) throws ParseException {
        SimpleDateFormat sourceDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sourceDateFormat.parse(dateStr);
        SimpleDateFormat targetDateFormat = new SimpleDateFormat(targetFormat);
        return targetDateFormat.format(date);
    }
}
