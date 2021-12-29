package tasks.t1;

public class Fibbonachi {
    public static void main(String[] args) {
        fibbonachiSequence(10);
    }

    static void fibbonachiSequence(int n) {
        int num1 = 1;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i < n + 1; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
