package tasks.t1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibbonachiTest {
    @Test
    void testWithNormalN() {
        long[] arr = new long[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        assertArrayEquals(arr, Fibbonachi.fibbonachiSequence(10));
    }

    @Test
    void testWithBigPositiveN() {
        long expected = 14930352L;
        long[] longs = Fibbonachi.fibbonachiSequence(100);
        long actual = longs[35];
        assertEquals(expected, actual);
    }

    @Test
    void testWitnNEqulsToZero() {
        assertThrows(IllegalStateException.class, () -> Fibbonachi.fibbonachiSequence(0));
    }

    @Test
    void testWithNegativeN() {
        assertThrows(IllegalStateException.class, () -> Fibbonachi.fibbonachiSequence(-100));
    }
}
