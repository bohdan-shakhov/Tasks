package tasks.t9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDiff {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2000, 5, 2);
        LocalDate secondDate = LocalDate.of(2002, 7, 30);

        long years = ChronoUnit.YEARS.between(firstDate, secondDate);
        long monthes = ChronoUnit.MONTHS.between(firstDate, secondDate);
        long days = ChronoUnit.DAYS.between(firstDate, secondDate);

        if ((years % 100 > 5 && years % 100 < 21) || years == 0) {
            System.out.print(years + " лет ");
        } else if (years % 10 == 1) {
            System.out.print(years + " год ");
        } else if (years % 10 > 1 && years < 5) {
            System.out.print(years + " года ");
        }

        long month = monthes - years * 12;
        if ((month % 100 > 4 && month % 100 < 21) || month == 0) {
            System.out.print(month + " месяцев ");
        } else if (month % 10 == 1) {
            System.out.print(month + " месяц ");
        } else if (month % 10 > 1 && month < 5) {
            System.out.print(month + " месяца ");
        }

        long day = days - (days - month * 30);
        if ((day % 100 > 1 && day % 100 < 5) || day == 0) {
            System.out.print(day + " дня");
        } else if (day % 10 == 1) {
            System.out.print(day + " день");
        } else {
            System.out.print(day + " дней ");
        }
    }
}
