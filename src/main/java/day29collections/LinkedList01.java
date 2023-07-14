package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

//        s.remove(3);
//        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Niyazi, Bilal, Abdullah, Nuriye]
//
//        s.remove();
//        System.out.println(s);//[Orhan, Bunyamin, Niyazi, Bilal, Abdullah, Nuriye]

//        s.remove("Orhan");
//        System.out.println(s);//[Nuriye, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

//        s.removeFirstOccurrence("Nuriye");
//        System.out.println(s);

//        s.removeLastOccurrence("Nuriye");
//        System.out.println(s);

        /* peek() method u
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
        Retrieve(alıp gelmek)
        List in ilk elemanini "alir gelir" fakat silmez
        List in ilk elemanini verir, List bos sa nulll verir
         */

        String r1 = s.peek();//ilk node u silmeden verir. ( copy + paste)
        System.out.println(r1);//Nuriye
        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]


        /* poll() methodu
        Retrieves and removes the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
        List in ilk elemanini alir gelir ve listten siler
        List in ilk elemanini verir, List bos sa nulll verir
         */

        String r2 = s.poll();//ilk node u size verir ve listten siler (cut + paste)
        System.out.println(r2);//Nuriye
        System.out.println(s);//[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        /* element()methodu
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
        Throws:NoSuchElementException – if this list is empty
        List in ilk elemanini alir gelir, ama List ten silmez
        List te eleman varsa ilk elemani verir List bossa hata verir

        Note: peek() ile element() ikiside size ilk elemani silmeden verir.
        Ama peek() list bos oldugunda size null verir. element() ise hata verir
         */

        String r3 = s.element();
        System.out.println(r3);//Orhan
        System.out.println(s);//[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]


        /* pop() methodu
        poll() ile pop() methodlari ikiside ilk elemani siler ve size verir.
        Ama poll() list bos oldugunda size null verir. pop() hata verir
         */
        String r4 = s.pop();
        System.out.println(r4);//Orhan
        System.out.println(s);//[Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

    }//main
}//class