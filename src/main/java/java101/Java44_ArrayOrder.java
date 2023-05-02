package java101;

import java.util.Arrays;
import java.util.Scanner;

/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99
 */
public class Java44_ArrayOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[length];
        System.out.println("Dizinin boyutu : " + length);
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 1; i <= length; i++) {
            System.out.print(i + ". Elemanı : ");
            arr[i - 1] = scanner.nextInt();
            scanner.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Siralama : " + Arrays.toString(arr));
    }
}
