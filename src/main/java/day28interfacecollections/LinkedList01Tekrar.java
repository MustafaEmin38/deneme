package day28interfacecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01Tekrar {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>(); // bu olusturma seklimiz

        List<String> list2=new ArrayList<>(); //bu sekilde de olusturabildik. Cunku ArrayList; List in parent idir.

        /*
        1. ArrayList ler eleman ekleme ve silmede basarili degildir(index kullanirlar ve her islemde index i yenilerler)
            o yuzden ekleme-silme islemlerinde ArrayList tavsiye edilmez.(yavastir)
        2. LinkedList ler index kullanmadiklarindan node silme ve eklemede re-index yapilmasina gerek yoktur
            Bu da LinkedList leri eleman ekleme ve silmede cok basarili yapar
            Bu yuzden eleman ekleme-silme islemlerinde LinkedList tavsiye edilir
        3. ArrayList lerde search islemi kolay yapilir, cunku ArrayList index kullanir, index ler adres gibidir.
        4. LinkedList lerde search islemi zor yapilir cunku LİnkedList ler index kullanmaz, index kullanmayinca her aramada
            tum elemanlar en bastan kontro edilir, bu da cok fazla istir ve yavas calistirir
         */

        LinkedList<String> k=new LinkedList<>();
        k.add("Elif");
        k.add("Ali");
        k.add("Buse");
        k.add("Sude");
        k.add("Can");
        k.add("Cem");
        k.add(1,"Tuna");
        k.addLast("Su");;
        k.addFirst("Eren");
        System.out.println(k);//[Eren, Elif, Tuna, Ali, Buse, Sude, Can, Cem, Su]


    }
}
