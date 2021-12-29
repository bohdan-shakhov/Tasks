package tasks.t5;

public class ReverseString {
    public static void main(String[] args) {
        String text = "test";
        System.out.println(reverseString(text));
    }

    static String reverseString(String text) {
        String reversedString = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedString += text.charAt(i);
        }
        return reversedString;
    }
}
