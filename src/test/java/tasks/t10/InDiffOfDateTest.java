package tasks.t10;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class InDiffOfDateTest {
    @Test
    void testPositiveCase() {
        LocalDateTime botDate = LocalDateTime.of(2000, Month.MAY, 31,6, 31);
        LocalDateTime midDate = LocalDateTime.of(2000, Month.JUNE, 1, 3, 10);
        LocalDateTime upDate = LocalDateTime.of(2000, Month.JUNE, 2, 10, 1);

        assertTrue(InDiffOfDate.isBetween(botDate, upDate, midDate));
    }

    @Test
    void testNegativeCase() {
        LocalDateTime botDate = LocalDateTime.of(2000, Month.MAY, 31,6, 31);
        LocalDateTime midDate = LocalDateTime.of(2001, Month.JUNE, 1, 3, 10);
        LocalDateTime upDate = LocalDateTime.of(2000, Month.JUNE, 2, 10, 1);

        assertFalse(InDiffOfDate.isBetween(botDate, upDate, midDate));
    }

    @Test
    void testNull() {
        LocalDateTime botDate = null;
        LocalDateTime midDate = LocalDateTime.of(2001, Month.JUNE, 1, 3, 10);
        LocalDateTime upDate = LocalDateTime.of(2000, Month.JUNE, 2, 10, 1);

        assertThrows(NullPointerException.class, () -> InDiffOfDate.isBetween(botDate, midDate, upDate));
    }
}
