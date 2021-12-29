package tasks.t8;

import java.util.HashMap;
import java.util.Map;

public class CharsInString {
    public static void main(String[] args) {

        String text = "test test test";
        Map<Character, Integer> map = charactersCount(text);
        System.out.println(map);
    }

    static Map<Character, Integer> charactersCount(String text) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = text.toCharArray();

        for (char character : chars) {
            if (character == ' ') {
                continue;
            }
            if (!map.containsKey(character)) {
                map.put(character, 0);
            }
            map.put(character, map.get(character) + 1);
        }
        return map;
    }
}
