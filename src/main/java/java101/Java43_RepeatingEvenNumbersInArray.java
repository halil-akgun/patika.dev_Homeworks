package java101;

import java.util.HashSet;
import java.util.Set;

/*
    Program to Find Repeating Even Numbers in a Array
 */
public class Java43_RepeatingEvenNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4, 1, 2, 3, 5, 6, 8, 8};
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] % 2 == 0) result.add(arr[i]);
            }
        }
        System.out.println(result);
    }
}
