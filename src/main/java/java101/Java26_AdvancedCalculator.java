package java101;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java26_AdvancedCalculator {

    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public static void main(String[] args) {
        boolean isContinue;
        do {
            isContinue = false;
            try {
                menu();
            } catch (Exception e) {
                System.out.println("Incorrect operation.");
                scanner.nextLine();
                isContinue = true;
            }
        } while (isContinue);

    }

    static void menu() {
        System.out.println("""
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Exponent Calculation
                6- Factorial Calculation
                7- Mod Calculation
                8- Rectangular Area and Perimeter Calculation
                0- Exit""");
        int process;
        do {
            System.out.print("Choose a process: ");
            process = scanner.nextInt();
            switch (process) {
                case 1:
                    add();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangular();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (process != 0);
    }

    static void add() {
        System.out.println("Enter the numbers you want to sum, enter 0 to finish.");
        double sum = 0;
        double num;
        do {
            num = scanner.nextDouble();
            sum += num;
        } while (num != 0);
        System.out.println(decimalFormat.format(sum));
    }

    static void subtraction() {
        System.out.println("Enter the numbers you want to subtract, enter 0 to finish.");
        double subtract = 0;
        double num;
        do {
            num = scanner.nextDouble();
            if (subtract == 0) {
                subtract = num;
                continue;
            }
            subtract -= num;
        } while (num != 0);
        System.out.println(decimalFormat.format(subtract));
    }

    static void multiplication() {
        System.out.println("Enter the numbers you want to multiply, enter 0 to finish.");
        double multiply = 1;
        double num;
        do {
            num = scanner.nextDouble();
            if (num == 0) break;
            multiply *= num;
        } while (true);
        System.out.println(decimalFormat.format(multiply));
    }

    static void division() {
        System.out.println("Enter the numbers you want to divide, enter 0 to finish.");
        double divide = 1;
        double num;
        do {
            num = scanner.nextDouble();
            if (num == 0) break;
            if (divide == 1) {
                divide = num;
                continue;
            }
            divide /= num;
        } while (true);
        System.out.println(decimalFormat.format(divide));
    }

    static void power() {
        System.out.println("Enter the base number first, then the power number.");
        double base = scanner.nextDouble();
        double power = scanner.nextDouble();
        System.out.println(decimalFormat.format(Math.pow(base, power)));
    }

    static void factorial() {
        System.out.println("enter a POSITIVE number you want to find the factorial of");
        int num = scanner.nextInt();
        int factorial;
        if (num == 1) factorial = 1;
        else if (num > 0) {
            factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
        } else throw new RuntimeException();
        System.out.println(factorial);
    }

    static void mod() {
        System.out.println("Enter two numbers.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a % b);
    }

    static void rectangular() {
        System.out.println("Enter two numbers.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Perimeter of the rectangle: " + (2 * (a + b)));
        System.out.println("Area of the rectangle     : " + (a * b));
    }
}
