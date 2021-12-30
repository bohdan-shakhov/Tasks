package tasks.t10;

import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class InDiffOfDateTest {
    @Test
    void test() {
        GregorianCalendar dateTrue = new GregorianCalendar(2000, 1, 1);
        boolean needTrue = InDiffOfDate.isBetween(dateTrue);

        GregorianCalendar dateFalse = new GregorianCalendar(1999, 1, 1);
        boolean needFalse = InDiffOfDate.isBetween(dateFalse);

        assertTrue(needTrue);
        assertFalse(needFalse);
    }
}
