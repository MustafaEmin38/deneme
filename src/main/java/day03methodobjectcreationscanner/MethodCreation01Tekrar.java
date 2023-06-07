package day03methodobjectcreationscanner;

import static day02datatypesmethodcreation.SabahTekrari01.carpma;

public class MethodCreation01Tekrar {
    public static void main(String[] args) {
        // ornek 1:
        double sonuc= kupHesapla(2.5);
        System.out.println("kup sonuc = "+sonuc);
        System.out.println(kupHesapla(2.5));

        //ornek 2:
         String myCar="Focus";
         yazdir(myCar);

         //ornek 3:
        String str="java easy";
        ekranaYaz(str);

        // ornek 4:
        int sayi=5;
        karesiniAl(sayi);

        //Ornek 5: Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz
        int x=5;
        int y=8;
        doMultiply(x,y);

        //Ornek 6: Dairenin alanini bulan method yazip kullaniniz
        double r=3;
        double pi=3.14;
        daireninAlani(r,pi);
        System.out.println(daireninAlani(r,pi));



    }//main

    // Ornek 6:
    static double daireninAlani(double r, double pi) {
        return pi*r*r;
    }

    //Ornek 5:
    public static void doMultiply(int x, int y) {
        System.out.println(x*y);
    }


    // ornek 4
    public static int karesiniAl(int sayi) {
        return sayi*sayi;
    }

    // ornek 3:
    private static void ekranaYaz(String str) {
        System.out.println(str);
    }

    //Ornek 1: Verilen bir ondalik sayının kupunu hesaplayan bir method olusturup kullanınız.
    public static double kupHesapla(double a){
        return a*a*a;
    }
    //Ornek 2: Girilen bi kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void  yazdir(String myCar){
        System.out.println(myCar);
    }


}//class
