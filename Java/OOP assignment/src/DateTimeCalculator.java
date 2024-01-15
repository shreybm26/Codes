import datetime.DateUtils;
import java.text.ParseException;

public class DateTimeCalculator {
    public static void main(String[] args) {
        try {
            String date1 = "2023-10-15";
            String date2 = "2023-10-20";

            int daysDifference = DateUtils.calculateDateDifferenceInDays(date1, date2);
            System.out.println("Days difference between " + date1 + " and " + date2 + ": " + daysDifference + " days");

            String formattedDate = DateUtils.formatDate(date1, "dd/MM/yyyy");
            System.out.println("Formatted date: " + formattedDate);
        } catch (ParseException e) {
            System.out.println("Error parsing dates: " + e.getMessage());
        }
    }
}
