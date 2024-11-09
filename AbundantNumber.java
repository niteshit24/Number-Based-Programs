public class AbundantNumber {
    public static void main(String[] args) {
        for (int num = 1; num <= 9999; num++) {
            int sumOfDivisors = 0;

            for (int divisor = 1; divisor <= num / 2; divisor++) {
                if (num % divisor == 0) {
                    sumOfDivisors += divisor;
                }
            }

            if (sumOfDivisors > num) {
                System.out.println(num + " is an Abundant Number!");
            }
        }
    }
}
