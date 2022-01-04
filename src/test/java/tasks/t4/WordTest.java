package tasks.t4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    @Test
    void test() {
        String text = "fffff ab hfhfhf abc fa 1234 jkjk";
        String expected = "fffff";
        String actual = Word.specialWord(text);
        assertEquals(expected, actual);
    }

    @Test
    void testEmptyString() {
        String text = "";
        String expected = "";
        String actual = Word.specialWord(text);
        assertEquals(expected, actual);
    }

    @Test
    void testForNull() {
        String text = null;
        assertThrows(NullPointerException.class, () -> Word.specialWord(text));
    }
}
