package tasks.t10;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class InDiffOfDate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter month: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter day of month: ");
        int day = Integer.parseInt(scanner.nextLine());

        GregorianCalendar date = new GregorianCalendar(year, month, day);
        isBetween(date);

    }

    static void isBetween(GregorianCalendar date) {
        GregorianCalendar firstDate = new GregorianCalendar(2000, 1, 1);
        GregorianCalendar secondDate = new GregorianCalendar(2020, 12, 31);
        if (date.getTimeInMillis() >= firstDate.getTimeInMillis()
                && date.getTimeInMillis() <= secondDate.getTimeInMillis())
            System.out.println("your date between 2000 and 2020");
        else
            System.out.println("your date NOT between 2000 and 2020");
    }
}
