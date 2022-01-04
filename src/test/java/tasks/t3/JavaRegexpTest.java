package tasks.t3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaRegexpTest {
    List<String> list;

    @Test
    void testPositiveCase() {
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        list = JavaRegexp.javaSubstring(text);

        String expected = "Java5";
        String actual = list.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeCase() {
        String text = "asdfjsadfhkj gsadfjdfhkjlfhdlk;fjkl;sgjfd gjkjhdf akjnb fmnxczbv ,kljfhd lkjfh lkjfhd";
        list = JavaRegexp.javaSubstring(text);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }
}
