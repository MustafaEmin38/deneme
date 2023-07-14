package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01Tekrar {
    public static void main(String[] args) {
        /*
        Oueue objecti olusturmak icin ya LinkedList ya da PriorityOueue kullanilir

        Queue objecti ne amacla kullanilir?
        -ilk girenin ilk cikmasi gereken yerlerde Queue kullanilir. Buna FIFO denir(First in, first out)
        (siramatik uyg olan banka,hastane veya ilk gelen urunun ilk satilmasi gereken market gibi yerlerde)

         */

        Queue<String> depo=new LinkedList<>();//buraya Queue{} koyamayiz cunku Queue bir interface dir.
                                            // const classlardan secilir, kalibimiz LinkedList
        depo.add("Egg");
        depo.add("Milk");
        depo.add("Cheese");
        depo.add("Meat");
        System.out.println(depo);//[Egg, Milk, Cheese, Meat] ==> insertion order la verdi

        depo.remove();//ilk elemani verir ama siler
        System.out.println(depo);//[Milk, Cheese, Meat]

        System.out.println(depo.peek());//Milk
        System.out.println(depo.poll());//Milk
        System.out.println(depo);//[Cheese, Meat]
        System.out.println(depo.element());//Cheese

        depo.clear();//hepsini sildik
        System.out.println(depo.poll());//depo bos old icin null verdi
        //System.out.println(depo.remove());//depo bos old icin hata verdi, exception
        //System.out.println(depo.element());//depo bos old icin hata verdi, exception
        System.out.println(depo.peek());//null




    }
}
