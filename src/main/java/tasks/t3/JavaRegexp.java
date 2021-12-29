package tasks.t3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexp {
    public static void main(String[] args) {
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        javaSubstring(text);
    }
    static void javaSubstring(String text) {
        String regexp = "Java\\s+\\d{1,2}";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
