package tasks.t12;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class OptimizedCharsInStringTest {
    @Test
    void test() {
        File file = new File("src/test/java/tasks/t12/test.txt");
        Map<Character, Long> map = OptimizedCharsInString.charactersCount(file);
        Map<Character, Long> mapTest = new HashMap<>();
        mapTest.put('t', 6L);
        mapTest.put('e', 3L);
        mapTest.put('s', 3L);
        assertEquals(mapTest, map);
    }
}
