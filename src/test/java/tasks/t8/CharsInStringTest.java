package tasks.t8;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CharsInStringTest {
    @Test
    void test() {
        Map<Character, Integer> map = CharsInString.charactersCount("test test test");
        Map<Character, Integer> mapTest = new HashMap<>();
        mapTest.put('t', 6);
        mapTest.put('e', 3);
        mapTest.put('s', 3);
        assertEquals(mapTest, map);
    }
}
