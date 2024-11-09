public class HarshadNumberChecker {
    public static void main(String[] args) {
        int number = 18; 

     
        int sumOfDigits = 0;
        int temp = number;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (number % sumOfDigits == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }
}
