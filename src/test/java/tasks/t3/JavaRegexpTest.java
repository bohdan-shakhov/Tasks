package tasks.t3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class JavaRegexpTest {
    @Test
    void test() {
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        ArrayList<String> list = JavaRegexp.javaSubstring(text);

        assertEquals("Java  5", list.get(0));
    }
}
