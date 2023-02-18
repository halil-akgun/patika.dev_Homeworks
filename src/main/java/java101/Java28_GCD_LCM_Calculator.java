package java101;

import java.util.Scanner;

public class Java28_GCD_LCM_Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("***************************************************************************");
        System.out.println("*** The Greatest Common Divisor (GCD) & The Least Common Multiple (LCM) ***");
        System.out.println("******************************  Calculator  *******************************");
        System.out.println("""
                1- The Greatest Common Divisor (GCD)
                2- The Least Common Multiple (LCM)""");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> calculateGCD();
            case 2 -> calculateLCM();
            default -> System.out.println("Invalid choice!");
        }
    }

    static void calculateGCD() {
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("GCD of " + a + " & " + b + " is  ==>  " + i);
                break;
            }
        }
    }

    static void calculateLCM() {
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        for (int i = b; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("LCM of " + a + " & " + b + " is  ==>  " + i);
                break;
            }
        }
    }
}
