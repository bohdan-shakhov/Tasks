package tasks.t12;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class OptimizedCharsInString {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        File file = new File("src/main/java/tasks/t12/1.txt");
        charactersCount(file);
        long after = System.currentTimeMillis();

        System.out.println((after - before) / Math.pow(10.0, 3.0) + " sec");
    }

    private static Map<Character, Long> charactersCount(File file) {
        Map<Character, Long> map = new HashMap<>();
        try (FileReader fileReader = new FileReader(file.getPath())) {
            StreamTokenizer st = new StreamTokenizer(fileReader);
            st.resetSyntax();
            int token;
            char current;
            while ((token = st.nextToken()) != StreamTokenizer.TT_EOF) {
                current = (char) token;
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
