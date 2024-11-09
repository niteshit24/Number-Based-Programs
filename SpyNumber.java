public class SpyNumber {
    public static void main(String[] args) {
        for (int num = 10; num <= 99; num++) {
            int tensDigit = num / 10;
            int onesDigit = num % 10;

            int sumOfDigits = tensDigit + onesDigit;
            int productOfDigits = tensDigit * onesDigit;

            if (sumOfDigits == productOfDigits) {
                System.out.println(num + " is a Spy Number.");
            }
        }
    }
}
