public class HarshadMagicNumber {
    public static void main(String[] args) {
        int num = 1729;
        if (isHarshad(num) && isMagic(sumOfDigits(num))) {
            System.out.println(num + " is a Harshad Magic Number");
        } else {
            System.out.println(num + " is not a Harshad Magic Number");
        }
    }

    static boolean isHarshad(int n) {
        int sum = sumOfDigits(n);
        return n % sum == 0;
    }

    static boolean isMagic(int n) {
        while (n >= 10) {
            n = sumOfDigits(n);
        }
        return n == 1;
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
