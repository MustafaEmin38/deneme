package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December
        Scanner input= new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Gecerli ay numarasi veriniz..");
        }
        /*
        Note: "switch" condition parantezi icinde String-int-byte-short-char kullanilabilir
        Note: "switch" condition parantezi icinde boolean-long-float-double kullanilamaz
        switch özet:****** /*
        Switch case deyimi işlev bakımından if deyimine çok benzemektedir.
        Çok sayıda if işlem blokları kullanfığımızda programın okunurluğu azalacak ve
        programı izlemek zorlasacaktır. Programınızın bir değeri birçok değerle
        karsılaştırmak gerektiğinden switch komutu kullanacağız. Switch seceneği ile
        değişkenin durumuna göre birçok durum içerisinden bir tanesi gerceklestirilir
        İstersek de if deyimi ile Switch case yi birlikte kullanabiliriz
        Switch in yaptıgı iş kısaca ifadenin değerini sırayla sabitlerle karsılararak ve her satır
        çok sayıda kosul içeren durumlarda switch kullanmak if e göre programınızın daha hızlı çalışma
        bunun haricinde iki  koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor                                                                                                                                  *** Switch de long double float ve boolean kullanılamaz****
         */

        //* Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasi giriniz");
        int ayNo=scan.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("Febuary");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Gecerli bir giris yapmadiniz");
        }



    }//Main
}//Class
