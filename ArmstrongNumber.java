public class ArmstrongNumber {
    public static void main(String[] args) {
        for (int num = 1; num <= 9999; num++) {
            int originalNum = num;
            int numDigits = String.valueOf(num).length();
            int sumOfPowers = 0;

            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sumOfPowers += Math.pow(digit, numDigits);
                temp /= 10;
            }

            if (sumOfPowers == originalNum) {
                System.out.println(originalNum + " is an Armstrong Number!");
            }
        }
    }
}
