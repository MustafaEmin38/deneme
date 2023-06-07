package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        /*
        Ornek:
        Asagidaki kurallara gore kullanicinin girdigi password  kontrol ediniz
        1) En az 8 karakter olsun
        2) Space karakteri passwordde olmasin
        3) En az bir buyuk harf olsun
        4) En az bir kucuk harf olsun
        5) En az bir rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //1) En az 8 karakter olsun
        boolean first = pwd.length()>7;
        System.out.println("first = "+first);

        //  2) Space karakteri passwordde olmasin
        boolean second = !pwd.contains(" "); // olmasin diye istedigimiz icin ! (not) koyduk==> icermesin demis olduk
        System.out.println("second = " + second);

        // 3) En az bir buyuk harf olsun

        //NOte: Buyuk harf olmayanlari sil
        //  kalan karakter sayisina bak
        //  karakter sayisi 0 ise buyuk harf yok demektir
        //  sifirdan buyukse buyuk harf var demektir.
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0; //Methodlari ayni satirda yanyana kullanmaya "method chain
        System.out.println("third =" + third);

        // 4) En az bir kucuk harf olsun
        boolean forth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("forth = " + forth);

        //5) En az bir rakam olsun
        boolean fifth=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("fifth = " + fifth);

        System.out.println(("Password gecerli mi?" + (first && second && third && forth && fifth)));


    }//Main method
}//Class
