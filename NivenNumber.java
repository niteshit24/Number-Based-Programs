public class NivenNumber {
    public static void main(String[] args) {
        int num = 18;
        if (isNiven(num)) {
            System.out.println(num + " is a Niven Number");
        } else {
            System.out.println(num + " is not a Niven Number");
        }
    }

    static boolean isNiven(int n) {
        int sum = sumOfDigits(n);
        return n % sum == 0;
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
