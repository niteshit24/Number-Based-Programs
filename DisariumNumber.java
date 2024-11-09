public class DisariumNumber {
    public static void main(String[] args) {
        for (int num = 1; num <= 9999; num++) {
            int originalNum = num;
            int sumOfPowers = 0;
            int position = 1;

            while (num > 0) {
                int digit = num % 10;
                sumOfPowers += Math.pow(digit, position);
                num /= 10;
                position++;
            }

            if (sumOfPowers == originalNum) {
                System.out.println(originalNum + " is a Disarium Number.");
            }
        }
    }
}
