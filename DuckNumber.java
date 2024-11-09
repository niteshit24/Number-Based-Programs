public class DuckNumber {
    public static void main(String[] args) {
        for (int num = 10; num <= 99; num++) {
            int tensDigit = num / 10;
            int onesDigit = num % 10;

            if (onesDigit == 0 && tensDigit != 0) {
                System.out.println(num + " is a Duck Number.");
            }
        }
    }
}
