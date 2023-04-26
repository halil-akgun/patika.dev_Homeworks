package java101;

import java.util.*;

/*
Ödev
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
 */
public class Java41_FindMaxMin {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        TreeSet<Integer> set = new TreeSet<>(Arrays.stream(arr).boxed().toList());
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + set.lower(num));
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + set.higher(num));
    }
}
