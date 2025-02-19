package Math;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class NumberofDaysBetweenTwoDates1360 {

    public int daysBetweenDates(String date1, String date2) {
        int res;
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}
