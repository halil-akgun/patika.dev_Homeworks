package java101;

public class Java32_PrimeNumbersFrom1to100 {
    public static void main(String[] args) {
        boolean isPrime;
        for (int i = 2; i <= 100; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
    }
}
