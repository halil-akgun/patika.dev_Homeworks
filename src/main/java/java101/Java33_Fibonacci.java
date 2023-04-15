package java101;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

Fibonacci dizisi, 0'dan başlar ve sonsuza kadar gider. Her sayi, bir önceki sayi toplanır.
Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

10 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
 */
public class Java33_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        List<Integer> fibonacciSeries = new ArrayList<>();
        fibonacciSeries.add(0);
        fibonacciSeries.add(1);
        for (int i = 2; i < numberOfElements; i++) {
            fibonacciSeries.add(fibonacciSeries.get(i - 2) + fibonacciSeries.get(i - 1));
        }
        System.out.print(numberOfElements + " Elemanlı Fibonacci Serisi : ");
        fibonacciSeries.forEach(t -> System.out.print(t + " "));
    }
}
