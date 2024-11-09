public class BouncyNumber {
    public static void main(String[] args) {
        int num = 132;
        if (isBouncy(num)) {
            System.out.println(num + " is a Bouncy Number");
        } else {
            System.out.println(num + " is not a Bouncy Number");
        }
    }

    static boolean isBouncy(int n) {
        boolean increasing = false, decreasing = false;
        int previousDigit = n % 10;
        n /= 10;
        while (n > 0) {
            int currentDigit = n % 10;
            if (currentDigit < previousDigit) increasing = true;
            if (currentDigit > previousDigit) decreasing = true;
            if (increasing && decreasing) return true;
            previousDigit = currentDigit;
            n /= 10;
        }
        return false;
    }
}
