package java101;

import java.util.Scanner;

/*
Number of Lines: 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
 */
public class Java31_InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        for (int i = numberOfLines; i > 0; i--) {
            for (int j = 0; j < numberOfLines - i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
