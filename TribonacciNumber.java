public class TribonacciNumber {
    public static void main(String[] args) {
        int n = 10; 

        int[] tribonacci = new int[n];
        tribonacci[0] = 0;
        tribonacci[1] = 1;
        tribonacci[2] = 1;

        for (int i = 3; i < n; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        System.out.println("Tribonacci Sequence:");
        for (int term : tribonacci) {
            System.out.print(term + " ");
        }
    }
}
