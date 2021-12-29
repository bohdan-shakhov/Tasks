package tasks.t6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {
    @Test
    void test() {
        boolean isPrime1 = PrimeNumber.isPrime(1);
        boolean isPrime4 = PrimeNumber.isPrime(4);
        boolean isPrime7 = PrimeNumber.isPrime(7);

        assertFalse(isPrime1);
        assertFalse(isPrime4);
        assertTrue(isPrime7);
    }
}
