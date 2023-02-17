package java101;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java27_ATMProject {
    private static final String userName = "Abdulfettah";
    private static final String password = "S***N";
    private static double balance = 33_333.33;
    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.println();
        System.out.println("************* JAVA BANK ATM *************");
        System.out.println("*************    WELCOME    *************\n");
        login();
    }

    static void login() {
        int right = 3;
        while (true) {
            right--;
            System.out.print("Your username: ");
            String user = scanner.next();
            System.out.print("Your password: ");
            String pwd = scanner.next();
            if (userName.equals(user) && password.equals(pwd)) {
                process();
                break;
            } else if (right == 0) {
                System.err.println("Your account has been blocked.");
                break;
            } else {
                System.out.println("Incorrect username or password. Try again.");
                System.out.println("Your remaining right: " + right);
            }
        }
    }

    static void process() {
        String select;
        while (true) {
            System.out.println("""
                    1- Deposit
                    2- Withdraw Money
                    3- Balance Inquiry
                    0- Log out""");
            System.out.print("Your choice: ");
            select = scanner.next();
            if (select.equals("0")) break;
            switch (select) {
                case "1" -> deposit();
                case "2" -> withdraw();
                case "3" -> inquiry();
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    static void deposit() {
        System.out.print("Amount you want to deposit: ");
        balance += scanner.nextDouble();
        System.out.println("Your balance: " + decimalFormat.format(balance));
    }

    static void withdraw() {
        System.out.print("Amount you want to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) System.err.println("Insufficient balance.");
        else balance -= amount;
        System.out.println("Your balance: " + decimalFormat.format(balance));
    }

    static void inquiry() {
        System.out.println("Your balance: " + decimalFormat.format(balance));
    }
}