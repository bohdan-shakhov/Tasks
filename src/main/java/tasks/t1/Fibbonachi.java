package tasks.t1;

public class Fibbonachi {
    public static void main(String[] args) {
        fibbonachiSequence(10);
    }

    static int[] fibbonachiSequence(int n) {
        int[] fnums = new int[n];
        int num1 = 1;
        int num2 = 1;
        fnums[0] = num1;
        fnums[1] = num2;
        int num3;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i < n + 1; i++) {
            num3 = num1 + num2;
            fnums[i - 1] = num3;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
        return fnums;
    }
}
