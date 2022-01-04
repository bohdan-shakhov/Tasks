package tasks.t3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexp {
    public static void main(String[] args) {
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        ArrayList<String> javax = javaSubstring(text);
    }
    static ArrayList<String> javaSubstring(String text) {
        ArrayList<String> list = new ArrayList<>();
        String regexp = "Java\\s+\\d{1,2}";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String javax = matcher.group().replaceAll("[\\s]+", "");
            list.add(javax);
        }
        return list;
    }
}
