package day31mapsexceptions;

import java.util.Hashtable;

public class Hashtable01 {
    public static void main(String[] args) {//multithread ve thread safe ayni seydir-ayni anda birden fazla is yapabilmek
        //synchronisation==> multitheread lerde mantikli siralmama yapmak demek tir

        /*
    HashMap ile Hashtable arasindaki fark nedir?
      1)HahMap thread-safe ve synchronized degildir.Hashtable thread-safe ve synchronized'tir
      2)HashMap bir tane null key e ve istediginiz kadar null value a müsaade eder
      ama Hashtable key lerde ve value larda null kullanilmasina müsaade etmez.
      3)HashMap hizlidir , Hastable HashMap lere göre yavastir

      Note: HashMap ve Hashtable ikisi de entry leri rastgele siralar
 */
        Hashtable<String, Integer> stdAges = new Hashtable<>();
        stdAges.put("Mustafa",41);
        stdAges.put("Seda",30);
        stdAges.put("Ekim",22);
        stdAges.put("Ali Can",18);
        // stdAges.put(null,15);
        // stdAges.put("mehmet",null);
        System.out.println(stdAges);//{Ekim=22, Ali Can=18, Mustafa=41, Seda=30}






    }//main
}//class
