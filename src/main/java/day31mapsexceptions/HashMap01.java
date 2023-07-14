package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        //HashMap arkasinda calisan mekanizma nasil?===>>> int de cikabilir
        HashMap<String, String> captials = new HashMap<>();
        captials.put("USA", "Washington");
        captials.get("USA");
        captials.put("Italy","Roma");
        captials.put("Turkiye","Ankara");
        captials.get("Turkiye");
        captials.put("Italy","Floransa");
        System.out.println(captials.hashCode());

        /*
        1.HashMap seklinde bir kod yazdgimizda Java arka planda bir kova olusturur, bunlara bucket denir
        2.Bucketlar 0 dan 15 (dahil)e kadar indexlenir(toplam16).
        3.Java yazdigimiz kodlarda her key icin bir hashcode uretir,bu hashcode mod 16 ile index e donusturulur
          ve o key o index e yerlestirilir.
        4.Bir index e birden fazla eleman eklenebilir
        5.java bucket lar icinde LinkedList yapisi kullanir.
        6.Indexte birden fazla entry olduysa onlari node yapisi gibi birbirine baglar.
        7.Bir entry cagrildiginda, onun index ine gider,hash coduna gore hangisi oldugunu bilir ve alir gelir.
        8.LinkedList yapisi geregi search islemi yapmada basarisiz oldugundan java, search islemni kolaylastirmak icin
          entry ler 12 olunca yeni bir bucket tanimlar ve index mod 32ye gore yapilir


         */
    }//main
}//class
