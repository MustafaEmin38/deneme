package day33exceptionsenumsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01Tkr {
    public static void main(String[] args) {
        /*

         */

        //Iterator olusturmak icin once List olusturmamiz gerekir
        List<String> myList = new ArrayList<>();
        myList.add("Audi");
        myList.add("Mercedes");
        myList.add("Bmw");
        myList.add("Opel");
        myList.add("Ford");
        System.out.println(myList);//[Audi, Mercedes, Bmw, Opel, Ford]

        //iterator(); methodu collection i iteratora donusturur.
        //Java iterator da Listten farkli olarak List in basina pointer koyar ve islemlerini ona gore yapar
        Iterator<String> myIterator = myList.iterator();//[Audi, Mercedes, Bmw, Opel, Ford]=>artik List degil bir iterator

        //iterator ile specific bir eleman nasil silinir?=>if icinde equals yapinca tek eleman if koymayinca hepsi silinir
        while (myIterator.hasNext()){//iterator un basina gelir ve pointer a "senden sonra eleman  var mi?"der.
                                    // varsa true yoksa false return eder
            String el=myIterator.next();//pointer i bir sonraki elemanin basina tasir ve üstünden atladigi elemani bize return eder
            if(el.equals("Audi")){
                myIterator.remove();//en son üstünden atladigimiz elemani siler (next in return ettigi)
            }
   }System.out.println(myList);// [Mercedes, Bmw, Opel, Ford]

        //ListIterator kullanimi
        List<String> yourList= new ArrayList<>();
        yourList.add("Audi");
        yourList.add("Mercedes");
        yourList.add("Bmw");
        System.out.println(yourList);//[Audi, Mercedes, Bmw]

        ListIterator<String> yourListItr = yourList.listIterator();//List i ListIterator a cevirir

        while (yourListItr.hasNext()){

            String el=yourListItr.next();
             yourListItr.set(el + "^_^");//set() methodu listi update islemi icin kullanilir
        }
        System.out.println(yourList);//[Audi^_^, Mercedes^_^, Bmw^_^]

        //ListIterator previous method kullanimi
        List<String> listP= new ArrayList<>();
        listP.add("Audi");
        listP.add("Mercedes");
        listP.add("Bmw");
        System.out.println(listP);//[Audi, Mercedes, Bmw]

        ListIterator<String> listItr = listP.listIterator();//[ Audi, Mercedes, Bmw]

        //Loop kullanarak pointer i en sona almaliyiz
        while (listItr.hasNext()){
            listItr.next();//pointer su anda Bmw nin bitiminde
        }

        while (listItr.hasPrevious()){//senden once eleman var mi diye sorar
            String el = listItr.previous();//pointer i sagdan sola atlatir, ustunden atladigi elemani bize verir
            System.out.println(el+" <==");

        }



}//main
}//class
