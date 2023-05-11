package java101;

import java.util.Arrays;

/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin
transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği),
A^T (A üzeri T) ile gösterilir.

Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.

Senaryo:

Matris:
2    3    4
5    6    4
Transpoze:
2    5
3    6
4    4

Matris:
{2, 3, 4, 9},
{2, 3, 4, 8},
{5, 6, 4, 1}
Transpoze:
[2, 2, 5],
[3, 3, 6],
[4, 4, 4],
[9, 8, 1]
 */
public class Java46_ArrayTranspose {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 9},
                {2, 3, 4, 8},
                {5, 6, 4, 1}
        };
        System.out.println(Arrays.deepToString(transposeMatris(arr)));
    }

    static int[][] transposeMatris(int[][] arr) {
        int[][] result = new int[arr[0].length][arr.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[i][j] = arr[j][i];
            }
        }
        return result;
    }
}
