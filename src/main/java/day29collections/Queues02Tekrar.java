package day29collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02Tekrar {
    public static void main(String[] args) {
        Queue<String> line = new PriorityQueue<>();//2. Queue olust seklimiz PriorityQueue<>(); classindan
        //objectler kalibinin ozelliklerini (class) tasir.burda kalibim PriorityQueue<>();
        line.add("Egg");
        line.add("Milk");
        line.add("Cheese");
        line.add("Meat");

        System.out.println(line);//[Cheese, Meat, Egg, Milk]==> insertion order la vermedi. PriorityQueue<>() mantiginda siraladi
         /*
        Queue bir interface dir, bu yuzden constructor i yoktur, dolayisiyla object olustururken new keywordunden
        sonra Queue yazamayiz. Data typei Queue olan bir object olusturmak icin
            1)LinkedList veya 2) PriorityQueue classlari kullanilabilir
        Queue olustururken constructor olarak PriorityQueue kullanirsaniz elemanlari kendi belirleyeceginiz kurala gore siralama
        hakkiniz olur
         */


        //Deque ==> Double ended queue (iki uclu queue).
        //Deque daki add(), get(), peek(), poll()... methodlari first-last sekinde iki uclu sekilde sunulur
        // interface old icin const i yok.O ned const secmemiz gerekir. Onu da LinkedList seceriz.Cunku deque interface nin childi LinkedList.
        // Hem ilk elemanla hem son elemanla calisma imkani verir. Kalip bu methodlar ona gore.
        Deque<String> d=new LinkedList<>();
        d.add("Egg");
        d.add("Milk");
        d.add("Cheese");
        d.add("Meat");
        System.out.println(d);//[Egg, Milk, Cheese, Meat]==> insertion order la yerlestirdi cunku const LinkedList.

        /*collections lari bilmek mantigini bilmektir.30. session son 5dk
        ***Eger amacimiz bir class tan object olusturmak degilse,
        * amacimiz onun child olan classlarinda belli seyleri zorunlu yapmak ise( to do list gibi)
        * kategorizasyon yapmak ise
        * sablon olusturmak ise o zaman interface kullaniriz.
          interface ler: 1.List int: İstedign kadar eleman ekle; hem de unique degil flexible
                                    i. LinkedList: Uzmanligi eleman ekleme cikarma, index yok bu yuzden search yapmada basarisiz
                                    ii.ArrayList: Uzmanligi search islemleri, index var.Ama ekleme cikarma da basarisiz
                         2.Queue int: Mantik FIFO; ilk giren ilk cikar. dolaysiyla method lar ona gore.
                         3.Set int: Uzmaligi tekrarsiz data tutmak, kaliplar ona gore
                                    i.  HashSet: Superfast. rastgele yerlestirir bu ned cok hizlidir
                                    ii. LinkedHashSet: Daha duzenli yerlestirir.Insertion order
                                    iii.TreeSet: Natural order gore yerlestirir, bu ned cok yavas dolaysiyle pek tercih edilmez
         */



    }
}
