package tasks.t4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Word {
    public static void main(String[] args) {
        String text = "fffff ab hfhfhf abc fa 1234 jkjk";
        System.out.println(specialWord(text));
    }

    static String specialWord(String text) {
        String[] words = text.split(" ");
        String result = words[0];
        int resultSize = new HashSet<>(Arrays.asList(words[0].split(""))).size();

        for (String word : words) {
            Set<String> set = new HashSet<>(Arrays.asList(word.split("")));
            if (set.size() < resultSize) {
                result = word;
                resultSize = set.size();
            }
        }
        return result;
    }
}
