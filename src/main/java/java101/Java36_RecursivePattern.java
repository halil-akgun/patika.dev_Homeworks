package java101;

import java.util.Scanner;

/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16 Çıktısı : 16 11 6 1 -4 1 6 11 16
N Sayısı : 10 Çıktısı : 10 5 0 5 10
 */
public class Java36_RecursivePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        recursivePattern(n);
    }

    private static boolean loop = true;
    private static int n;

    private static void recursivePattern(int a) {
        if (n < 1 && a == n) {
            System.out.println("Enter a positive number");
            return;
        }
        System.out.print(a + " ");
        if (a > 0 && loop) {
            recursivePattern(a - 5);
        } else {
            loop = false;
            if (n != a) recursivePattern(a + 5);
        }
    }
}
