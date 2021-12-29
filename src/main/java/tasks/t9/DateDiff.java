package tasks.t9;

import java.time.LocalDate;
import java.time.Period;

public class DateDiff {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2000, 5, 31);
        LocalDate secondDate = LocalDate.of(2009, 3, 6);
        Period diff = Period.between(firstDate, secondDate);
        System.out.printf("%d лет %d месяцев %d дней",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}
