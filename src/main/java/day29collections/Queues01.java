package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> depo=new LinkedList<>();
        depo.add("Egg");
        depo.add("Milk");
        depo.add("Chesee");
        depo.add("Meat");
        System.out.println(depo);//[Egg, Milk, Chesee, Meat]

        depo.remove();
        System.out.println(depo);//[Milk, Chesee, Meat]

        System.out.println(depo.peek());//Milk
        System.out.println(depo.poll());//Milk
        System.out.println(depo);//[Chesee, Meat]
        System.out.println(depo.element());//Chesee

        depo.clear();
        System.out.println(depo.poll());//null
       // System.out.println(depo.remove());//exception(hata verdi)
       // System.out.println(depo.element());//exception(hata verdi)
        System.out.println(depo.peek());//null


    }//main
}//class
