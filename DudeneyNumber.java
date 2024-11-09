public class DudeneyNumber {
    public static void main(String[] args) {
        int num = 512;
        if (isDudeney(num)) {
            System.out.println(num + " is a Dudeney Number");
        } else {
            System.out.println(num + " is not a Dudeney Number");
        }
    }

    static boolean isDudeney(int n) {
        int sum = sumOfDigits(n);
        int cubeRoot = (int) Math.round(Math.cbrt(n));
        return sum == cubeRoot;
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
