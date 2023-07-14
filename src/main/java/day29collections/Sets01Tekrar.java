package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01Tekrar {
    public static void main(String[] args) {//Collection lardan Set ler> coklu data tutmak icin
        /* 1) Set ler => "unique data" lar depolamak icin kull.
           2) Set class uc tenedir;
                a) HashSet Class
                 -"Hash" benzersiz bir id olusturma teknigidir (Hashing Technique)
                 -Rastgele yerlestirir
                 -Bu nedenle cok hizlidir "superfast" tir.
                 -HashSet ler "null" i bir eleman olarak kabul eder

                b) LinkedHashSet Class
                 -Elemanlari verdigimiz siraya gore yerlestirir(insertion order)
                 - Bu nedenle HashSet ten yavas

                c) TreeSet Class
                 -Elemanlari "Natural order" a gore yerlestirir
                 -Bu nedenle en yavas/cooook yavas set> Mumkun oldugunca kallanmayiz

    */

        HashSet<String > hs = new HashSet<>();//tekrarsiz-string-coklu datalari cok hizli tutabilecegim bir yapi
        hs.add("Ali");
        hs.add("Ece");
        hs.add("Can");
        hs.add("Eda");
        hs.add("Cem");
        hs.add(null);
        System.out.println(hs);//[null, Can, Eda, Ece, Cem, Ali]==> rastgele siraladi-firlatti

        hs.add("Cem");//var olan elemani eklersek hata vermez ama 2.kez eklemez.
        System.out.println(hs);//[null, Can, Eda, Ece, Cem, Ali]

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(28);
        lhs.add(36);
        lhs.add(-12);
        lhs.add(null);//Integer bir Wrapper dir ve non-primitivedir ve classtir. Bu ned null eklendi
        System.out.println(lhs);//[7, 28, 36, -12, null] => insertion order la ekledi

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(7);
        ls.add(119);
        ls.add(37);
        ls.add(73);
        ls.add(88);

        lhs.retainAll(ls);//retainall u uyguladigim object degisti, digeri ayni(retain=saklamak/tutmak)
        System.out.println(lhs);//[7] =>lhs deki ortak olani yazdi, gerisini sildi
        System.out.println(ls);//[7, 119, 37, 73, 88] => ls degismedi-ayni.

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('A');
        ts.add('Z');
        ts.add('L');
        ts.add('B');
        ts.add('T');
        ts.add('U');
        ts.add('V');
        ts.add('E');
        //ts.add(null); ==> TreeSet lere null eklenmez
        System.out.println(ts);//[A, B, E, L, T, U, V, Z] => natural order a gore siraladi

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('B'));//A =>verilen eleman olan B den bir onceki elemani verir
        System.out.println(ts.lower('C'));//B =>verilen eleman olan C nin yerine gelir ondan bir onceki elemani verir
        System.out.println(ts.lower('A'));//null

        System.out.println(ts.higher('L'));//T =>verilen eleman olan L den bir sonraki elemani verir
        System.out.println(ts.higher('P'));//T =>verilen eleman olan P nin yerine gelir ondan bir sonraki elemani verir
        System.out.println(ts.headSet('L'));//[A, B, E] => verilen eleman olan L ye kadar olan elemanlari bastan verir
        System.out.println(ts.headSet('L',true));//[A, B, E, L] => true yazinca L de dahil olur

        System.out.println(ts.tailSet('T'));//[T, U, V, Z] => T dahil sonuna kadar olan elemanlari verir
        System.out.println(ts.tailSet('T', false));//[U, V, Z] => false yazinca T yi haric tutar

        System.out.println(ts.ceiling('T'));//T ceiling=tavan => varsa yazilan elemani verir
        System.out.println(ts.ceiling('O'));//T yoksa yazilan elemanin yerine gider, en yakin tavanda kim varsa onu verir

        System.out.println(ts.floor('B'));//B floor=taban => varsa yazilan elemani verir
        System.out.println(ts.floor('D'));//B yoksa yazilan elemanin yerine gider, en yakin tabanda kim varsa onu verir

        System.out.println(ts.subSet('B', 'T'));//[B, E, L] ==> substring gibi, ilk index dahil son index haric, aradakileri yazdirir
        System.out.println(ts.subSet('B', false, 'T', true));//[E, L, T]


    }
}
