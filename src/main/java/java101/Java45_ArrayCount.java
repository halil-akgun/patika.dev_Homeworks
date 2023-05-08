package java101;

import java.util.HashMap;
import java.util.Map;

/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */
public class Java45_ArrayCount {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        solution(arr);
    }

    private static void solution(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int w : arr) map.put(w, map.getOrDefault(w, 0) + 1);

        for (Map.Entry<Integer, Integer> w : map.entrySet())
            System.out.println(w.getKey() + " sayısı " + w.getValue() + " kere tekrar edildi.");
    }
}
