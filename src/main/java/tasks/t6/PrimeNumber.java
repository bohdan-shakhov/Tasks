package tasks.t6;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return (n > 1);
    }
}
