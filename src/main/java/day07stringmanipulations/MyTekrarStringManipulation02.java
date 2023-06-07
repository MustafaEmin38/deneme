package day07stringmanipulations;

import java.util.Scanner;

public class MyTekrarStringManipulation02 {
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
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz:");
        String sifre=input.nextLine();

        //1) En az 8 karakter olsun
        boolean s1=sifre.length()>7;
        System.out.println("s1 = " + s1);

        //2) Space karakteri passwordde olmasin
        boolean s2=!sifre.contains("[ ]");
        System.out.println("s2 = " + s2);

        // 3) En az bir buyuk harf olsun
        boolean s3=sifre.replaceAll("[^A-Z]","").length()>0;
        System.out.println("s3 = " + s3);

        // 4) En az bir kucuk harf olsun
        boolean s4=sifre.replaceAll("[^a-z]","").length()>0;
        System.out.println("s4 = " + s4);

        //5) En az bir rakam olsun
        boolean s5=sifre.replaceAll("[^0-9]","").length()>0;
        System.out.println("s5 = " + s5);

        System.out.println("Sifre gecerli mi? = " +(s1 && s2 && s3 && s4 && s5));



    }//Main
}//Class
