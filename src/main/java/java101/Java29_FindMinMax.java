package java101;

import java.util.Arrays;
import java.util.Scanner;

public class Java29_FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int quantity = scanner.nextInt();
        int[] numbers = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter " + (i + 1) + ". number: ");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("min number: " + numbers[0]);
        System.out.println("max number: " + numbers[numbers.length - 1]);
    }
}
