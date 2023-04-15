package java101;

import java.util.Scanner;

/*
Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryo:
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
 */
public class Java34_RecursivePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int num = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int pow = scanner.nextInt();
        System.out.println("Result: " + calculatePower(num, pow));
    }

    static int calculatePower(int num, int pow) {
        if (pow > 1) num = calculatePower(num, --pow) * num;
        return num;
    }
}
