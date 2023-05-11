package java101;

import java.util.Scanner;

/*
We are making a "Number Guessing Game" in Java in which we want the user
to guess a number randomly chosen by the program between 0-100.
 */
public class Java47_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hiddenNumber = (int) (Math.random() * 101);
        int right = 5;
        int select;
        boolean isWrong = false;

        while (true) {
            System.out.print("enter your guess: ");
            select = scanner.nextInt();

            if (select < 0 || select > 100) {
                if (isWrong) {
                    System.out.println("Please enter a number between 0-100. Your remaining right: " + (--right));
                    continue;
                }
                System.out.println("Please enter a number between 0-100. Next time your right will be reduced");
                isWrong = true;
                continue;
            }
            right--;
            if (hiddenNumber == select) {
                System.out.println("*************** CONGRATULATIONS ***************");
                System.out.println("******************* YOU WON *******************");
                break;
            } else {
                if (select > hiddenNumber) {
                    System.out.println("Wrong guess. Your guess is bigger than the hidden number.");
                    System.out.println("Your remaining right: " + right);
                } else {
                    System.out.println("Wrong guess. Your guess is smaller than the hidden number.");
                    System.out.println("Your remaining right: " + right);
                }
            }
            if (right == 0) {
                System.out.println("******************* YOU LOST *******************");
                break;
            }
        }
        System.out.println("Hidden Number was: " + hiddenNumber);
    }
}
