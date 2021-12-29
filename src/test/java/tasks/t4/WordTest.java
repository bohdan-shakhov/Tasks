package tasks.t4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordTest {
    @Test
    void test() {
        String text = "fffff ab hfhfhf abc fa 1234 jkjk";
        String s = Word.specialWord(text);
        assertEquals("fffff", s);
    }
}
