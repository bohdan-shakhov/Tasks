package tasks.t10;

import java.time.LocalDateTime;
import java.time.Month;

public class InDiffOfDate {
    public static void main(String[] args) {
        LocalDateTime botDate = LocalDateTime.of(2000, Month.MAY, 31,6, 31);
        LocalDateTime midDate = LocalDateTime.of(2000, Month.JUNE, 1, 3, 10);
        LocalDateTime upDate = LocalDateTime.of(2000, Month.JUNE, 2, 10, 1);

        isBetween(botDate, upDate, midDate);
    }

    static boolean isBetween(LocalDateTime botDate, LocalDateTime upDate, LocalDateTime midDate) {
        return botDate.isBefore(midDate) && upDate.isAfter(midDate);
    }
}
