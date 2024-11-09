public class BuzzNumber {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if (num % 7 == 0 || num % 10 == 7) {
                System.out.println(num + " is a Buzz Number.");
            }
        }
    }
}
