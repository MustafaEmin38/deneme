package day29collections;

import java.util.LinkedList;

public class LinkedList01Tekrar {
    public static void main(String[] args) {
        LinkedList<String> k=new LinkedList<>();
        k.add("Elif");
        k.add("Ali");
        k.add("Buse");
        k.add("Sude");
        k.add("Can");
        k.add("Cem");
        k.add("Can");
        k.add(1,"Tuna");
        k.addLast("Su");;
        k.addFirst("Eren");
        System.out.println(k);//[Eren, Elif, Tuna, Ali, Buse, Sude, Can, Cem, Can, Su]

       // System.out.println(k.remove());//Eren
       // k.remove("Ali");
       // System.out.println(k);//[Elif, Tuna, Buse, Sude, Can, Cem, Can, Su]

       // System.out.println(k.remove(2));//Buse

       // k.removeLastOccurrence("Can");
       // System.out.println(k);//[Elif, Tuna, Sude, Can, Cem, Su]

       // k.removeFirstOccurrence("Can");
       // System.out.println(k);

        String r=k.peek();//ilk node verir.Listten silmez.List bossa "null" verir
        System.out.println(r);//Eren
        System.out.println(k);//[Eren, Elif, Tuna, Ali, Buse, Sude, Can, Cem, Can, Su]

        String r1=k.poll();///ilk node verir.Listten siler.List bossa "null" verir
        System.out.println(r1);//Eren
        System.out.println(k);//[Elif, Tuna, Ali, Buse, Sude, Can, Cem, Can, Su]

        String r2=k.element();//ilk node verir.Listten silmez.List bossa hata verir
        System.out.println(r2);//Elif
        System.out.println(k);//[Elif, Tuna, Ali, Buse, Sude, Can, Cem, Can, Su]

        String r3=k.pop();//ilk node verir.Listten siler.List bossa hata verir
        System.out.println(r3);//Elif
        System.out.println(k);//[Tuna, Ali, Buse, Sude, Can, Cem, Can, Su]


    }
}
