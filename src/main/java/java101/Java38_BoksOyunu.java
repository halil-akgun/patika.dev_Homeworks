package java101;

import java101.java38_BoksOyunu.Fighter;
import java101.java38_BoksOyunu.Ring;

public class Java38_BoksOyunu {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 50);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 50);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}
/*
Boks Maçı
Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.

Ödev
Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.


    *****   i only added randomHit() method into Ring.class   *****
 */