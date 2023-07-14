package day31mapsexceptions;

import java.util.Hashtable;

public class Hashtable01Tekrar {
    public static void main(String[] args) {
        //multithread ve thread safe ayni seydir-ayni anda birden fazla is yapabilmek(corba piserken salata yapmak)
        //synchronisation==> multithread lerde mantikli siralma yapmak demek tir
        /*
        1.En onemli fark: HashMap thread-safe ve synchronized degildir.Hashtable thread-safe ve synchronized dir
        2.HashMap bir tane null key e ve istediginiz kadar null value a müsaade eder
           ama Hashtable key lerde ve value larda null kullanilmasina müsaade etmez.
        3.HashMap hizlidir , Hastable HashMap lere göre yavastir
        Note:HashMap ve Hashtable larin ikisi de entry leri rastgele siralar

        Ne zamn Hashtable kullanmaliyiz?
        -Multithread ve synchronisation ihtiyacimiz oldugunda Hashtable kullaniriz
        -Key ve value larda null kullanmak yasaksa Hashtable kullanabiliriz
         */
        Hashtable<String,Integer> stdAges =new Hashtable<>();

        stdAges.put("Elif",41);
        stdAges.put("Ece",4);
        stdAges.put("Can",15);
        stdAges.put("Cem",35);
        //stdAges.put(null,15); ==> hata verdi
        //stdAges.put("Ali",null);  ==> hata verdi
        System.out.println(stdAges);//{Cem=35, Can=15, Ece=4, Elif=41}
    }
}
