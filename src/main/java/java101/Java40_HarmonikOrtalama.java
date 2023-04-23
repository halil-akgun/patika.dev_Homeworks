package java101;

/*
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
 */
public class Java40_HarmonikOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicSum = 0;
        for (int w : numbers) {
            harmonicSum += 1.0 / w;
        }
        System.out.printf("Harmonic Average: %.2f", numbers.length / harmonicSum);
    }
}
