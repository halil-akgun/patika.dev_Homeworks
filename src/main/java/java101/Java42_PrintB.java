package java101;

/*
     Print B to console
 */
public class Java42_PrintB {
    public static void main(String[] args) {

        String[][] letterB = new String[9][6];
        System.out.println();
        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {

                if (i == 0 || i == 4 || i == 8) {

                    if (letterB[i].length - 1 == j) letterB[i][j] = "  ";

                    else letterB[i][j] = "* ";

                } else if (j == 0 || j == 5) letterB[i][j] = "* ";

                else letterB[i][j] = "  ";
            }
        }
        for (String[] w : letterB) {
            for (String s : w) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
