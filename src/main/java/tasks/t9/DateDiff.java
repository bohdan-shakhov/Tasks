package tasks.t9;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateDiff {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2000, Month.MAY, 2);
        LocalDate secondDate = LocalDate.of(2003, Month.JUNE, 3);

        System.out.println(dateComparison(firstDate, secondDate));
    }

    private static StringBuilder dateComparison(LocalDate firstDate, LocalDate secondDate) {
        StringBuilder result = new StringBuilder();
        Period period = Period.between(firstDate, secondDate);
        long years = Math.abs(period.getYears());
        long months = Math.abs(period.getMonths());
        long days = Math.abs(period.getDays());

        if ((years % 100 > 5 && years % 100 < 21) || years == 0) {
            result.append(years + " лет ");
        } else if (years % 10 == 1) {
            result.append(years + " год ");
        } else if (years % 10 > 1 && years < 5) {
            result.append(years + " года ");
        }

        if ((months % 100 > 4 && months % 100 < 21) || months == 0) {
            result.append(months + " месяцев ");
        } else if (months % 10 == 1) {
            result.append(months + " месяц ");
        } else if (months % 10 > 1 && months < 5) {
            result.append(months + " месяца ");
        }

        if (days % 100 > 1 && days % 100 < 5) {
            result.append(days + " дня ");
        } else if (days % 10 == 1) {
            result.append(days + " день ");
        } else {
            result.append(days + " дней ");
        }
        return result;
    }
}
