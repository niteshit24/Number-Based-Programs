public class TechNumber {
    public static void main(String[] args) {
        for (int num = 10; num <= 99; num++) {
            int tensDigit = num / 10;
            int onesDigit = num % 10;

            int sumOfDigits = tensDigit + onesDigit;
            int squaredSum = sumOfDigits * sumOfDigits;

            if (squaredSum == num) {
                System.out.println(num + " is a Tech Number.");
            }
        }
    }
}
