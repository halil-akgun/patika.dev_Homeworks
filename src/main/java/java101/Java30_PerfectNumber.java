package java101;

import java.util.Scanner;

public class Java30_PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        isPerfectNumber(scanner.nextInt());
    }

    static void isPerfectNumber(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) sum += i;
        }
        if (a == sum) System.out.println(a + " is a perfect number.");
        else System.out.println(a + " is not a perfect number.");
    }
}
