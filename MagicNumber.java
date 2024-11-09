public class MagicNumber {
    public static void main(String[] args) {
        for (int num = 1; num <= 9999; num++) {
            int originalNum = num;
            int sumOfDigits = num;

            while (sumOfDigits >= 10) {
                int tempSum = 0;
                while (sumOfDigits > 0) {
                    tempSum += sumOfDigits % 10;
                    sumOfDigits /= 10;
                }
                sumOfDigits = tempSum;
            }

            if (sumOfDigits == 1) {
                System.out.println(originalNum + " is a Magic Number!");
            }
        }
    }
}
