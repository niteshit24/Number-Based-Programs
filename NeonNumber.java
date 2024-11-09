public class NeonNumber {
    public static void main(String[] args) {
        for (int num = 1; num <= 9999; num++) {
            int square = num * num;
            int sumOfDigits = 0;

            // Calculate the sum of digits in the squared result
            int temp = square;
            while (temp > 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }

            if (sumOfDigits == num) {
                System.out.println(num + " is a Neon Number!");
            }
        }
    }
}
