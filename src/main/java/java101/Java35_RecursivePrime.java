package java101;

import java.util.Scanner;

/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

Senaryo
Sayı Giriniz : 22 22 sayısı ASAL değildir !
Sayı Giriniz : 2 2 sayısı ASALDIR !
 */
public class Java35_RecursivePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        if (isPrime(num)) System.out.println(num + " sayısı ASALDIR !");
        else System.out.println(num + " sayısı ASAL değildir !");
    }

    private static int num;

    private static boolean isPrime(int a) {
        if (a > 2) {
            if (num % --a == 0) return false;
            return isPrime(a);
        }
        return true;
    }
}
