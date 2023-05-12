package java101;

import java.util.Scanner;

/*
Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.

Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

Örnek : abba , asa , kavak, kayak
 */
public class Java48_PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (isPalindrome(str)) System.out.println("\"" + str + "\" IS PALINDROME");
        else System.out.println("\"" + str + "\" IS NOT PALINDROME");
    }

    private static boolean isPalindrome(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        return reversedStr.toString().equalsIgnoreCase(str);
    }
}
