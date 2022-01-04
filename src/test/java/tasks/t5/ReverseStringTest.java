package tasks.t5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    void test() {
        String text = "test";
        String s = ReverseString.reverseString(text);
        assertEquals("tset", s);
    }

    @Test
    void testEmptyString() {
        String text = "";
        String expected = "";
        String actual = ReverseString.reverseString(text);
        assertEquals(expected, actual);
    }

    @Test
    void testForNull() {
        String text = null;
        assertThrows(NullPointerException.class, () -> ReverseString.reverseString(text));
    }
}
