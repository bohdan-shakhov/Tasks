package tasks.t10;

import java.util.GregorianCalendar;

public class InDiffOfDate {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar(2000, 1, 1);
        isBetween(date);
    }

    static boolean isBetween(GregorianCalendar date) {
        GregorianCalendar firstDate = new GregorianCalendar(2000, 1, 1);
        GregorianCalendar secondDate = new GregorianCalendar(2020, 12, 31);
        return date.getTimeInMillis() >= firstDate.getTimeInMillis()
                && date.getTimeInMillis() <= secondDate.getTimeInMillis();
    }
}
