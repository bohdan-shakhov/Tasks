package tasks.t1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibbonachiTest {
    @Test
    void test() {
        int[] arr = Fibbonachi.fibbonachiSequence(10);

        assertEquals(1, arr[0]);
        assertEquals(55, arr[9]);
        assertArrayEquals(arr, Fibbonachi.fibbonachiSequence(10));
    }
}
