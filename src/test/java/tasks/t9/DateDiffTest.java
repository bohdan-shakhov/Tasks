package tasks.t9;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class DateDiffTest {
    @Test
    void testWhenDateEquals() {
        LocalDate firstDate = LocalDate.of(2000, Month.MAY, 2);
        LocalDate secondDate = LocalDate.of(2000, Month.MAY, 2);

        StringBuilder builder = new StringBuilder("0 лет 0 месяцев 0 дней");

        assertTrue(builder.toString().equals(DateDiff.dateComparison(firstDate, secondDate).toString()));
    }

    @Test
    void testWhenFirstDateLater() {
        LocalDate firstDate = LocalDate.of(2000, Month.MAY, 3);
        LocalDate secondDate = LocalDate.of(2000, Month.MAY, 2);

        StringBuilder builder = new StringBuilder("0 лет 0 месяцев 1 день");

        assertTrue(builder.toString().equals(DateDiff.dateComparison(firstDate, secondDate).toString()));
    }

    @Test
    void testWhenSecondDateLater() {
        LocalDate firstDate = LocalDate.of(2000, Month.MAY, 3);
        LocalDate secondDate = LocalDate.of(2000, Month.MAY, 4);

        StringBuilder builder = new StringBuilder("0 лет 0 месяцев 1 день");

        assertTrue(builder.toString().equals(DateDiff.dateComparison(firstDate, secondDate).toString()));
    }
}
