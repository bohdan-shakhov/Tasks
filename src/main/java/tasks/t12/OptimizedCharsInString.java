package tasks.t12;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimizedCharsInString {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        File file = new File("src/main/java/tasks/t12/1.txt");
        Map<Character, Long> map = charactersCount(file);
        System.out.println(map);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    static Map<Character, Long> charactersCount(File file) {
        Map<Character, Long> map = new HashMap<>();
        try {
            FileInputStream fis = new FileInputStream(file.getPath());
            char current;
            while (fis.available() > 0) {
                current = (char) fis.read();
                    if (!Character.isLetter(current)) {
                        continue;
                    }
                    if (!map.containsKey(current)) {
                        map.put(current, 0L);
                    }
                    map.put(current, map.get(current) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
