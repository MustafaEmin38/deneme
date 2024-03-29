package day29collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {//FIFO ==> first in first out
    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();
        line.add("Egg");
        line.add("Milk");
        line.add("Cheese");
        line.add("Meat");

        System.out.println(line);//[Cheese, Meat, Egg, Milk]

        /*
        Queue bir interface dir, bu yuzden constructor i yoktur, dolayisiyla object olustururken new keywordunden
        sonra Queue yazamayiz. Data tyei Queue olan bir object olusturmak icin
            1)LinkedList veya 2) PriorityQueue classlari kullanilabilir
        Queue olustururken constructor olarak PriorityQueue kullanirsaniz elemanlari kendi belirleyeceginiz kurala gore siralama
        hakkiniz olur
         */

        //Deque ==> Doouble Ended Queue(=iki uclu queue)
        //Deque daki add(), get(), peek(), poll()... methodlari first-last sekinde iki uclu sekilde sunulur
        Deque<String> d = new LinkedList<>();//LİnkList ler ekleme sirasina gore yazdirir.(insertion order)
        d.add("Egg");
        d.add("Milk");
        d.add("Cheese");
        d.add("Meat");

        System.out.println(d);//[Egg, Milk, Cheese, Meat]


    }
}