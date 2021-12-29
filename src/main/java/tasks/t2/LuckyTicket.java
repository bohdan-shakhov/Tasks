package tasks.t2;

public class LuckyTicket {
    public static void main(String[] args) {
        luckyTickets();
    }

    static void luckyTickets() {
        for (int k = 000001; k <= 999999; k++) {
            int number1 = k / 100000;
            int number2 = (k % 100000) / 10000;
            int number3 = (k % 10000) / 1000;
            int number4 = (k % 1000) / 100;
            int number5 = (k % 100) / 10;
            int number6 = k % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                System.out.println(k);
            }
        }
    }
}

