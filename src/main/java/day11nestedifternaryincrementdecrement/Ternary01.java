package day11nestedifternaryincrementdecrement;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {
        //Ternary Statement
        //Ornek 1: Sayi 10 dan kucuk ise console a "kucuk" yazdirin, degil ise "Kucuk degil" yazdirin
        //----------if else cozumu--------
        int num = 12;
        if (num < 10) {
            System.out.println("Kucuk");
        } else {
            System.out.println("Kucuk degil");
        }

        //-------Ternary Cozumu------
        //  Conditon    ?   Condition true ise calisir  :   Condition false ise calisir ;
        String sonuc = num < 10 ? "Kucuk" : "Kucuk degil";
        System.out.println(sonuc);

        //* Ornek 1: Sayi 10 dan kucuk ise console a "kucuk" yazdirin, degil ise "Kucuk degil" yazdirin
        int sayi=5;
        if(sayi<10){//if cozumu
            System.out.println("Kucuk");
        }else {
            System.out.println("Kucuk degil");
        }
        String sonc=sayi<10?"Kucuk":"Kucuk degil";//ternary cozumu
        System.out.println(sonc);

        //Ornek 2: Sayi cift ise console a "cift", tek ise "Tek" yazdirin
        //----------if else cozumu--------
        int k = 13;

        if (k % 2 == 0) {
            System.out.println("cift");
        } else {
            System.out.println("tek");
        }

        //----------Ternary cozumu--------
        String result = k % 2 == 0 ? "cift" : "tek";
        System.out.println(result);

        //* Ornek 2: Sayi cift ise console a "cift", tek ise "Tek" yazdirin
        int m=12;//if cozum
        if(m%2==0){
            System.out.println("cift");
        }else {
            System.out.println("tek");
        }

        String snc=m%2==0?"cift":"tek";//ternary cozum
        System.out.println(snc);

        //Ornek 3: Sayi 0 dan buyukse; ekrana "pozitif", degilse  "pozitif degil" yazdirin
        int a = -5;
        System.out.println(a > 0 ? "pozitiftir" : "pozitif degil");
        //* Ornek 3: Sayi 0 dan buyukse; ekrana "pozitif", degilse  "pozitif degil" yazdirin
        int b=785;
        String rslt=b>0?"Pozitif":"Pozitif degil";
        System.out.println(rslt);
        System.out.println(b>0?"Pozitif":"Pozitif degil");//ternary i sepete koymadan, sout icinde yazdirma sekli

        //Ornek 4: Kullanicidan iki sayi aliniz "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz..");

        double first = input.nextDouble();
        double second = input.nextDouble();

        //1. yol if else cozumu
        if (first < second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }

        //2. yol Ternary
        double result2 = first < second ? first : second;
        System.out.println(result2);

        //* Ornek 4: Kullanicidan iki sayi aliniz "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double birinci=scan.nextDouble();//3
        double ikinci=scan.nextDouble();//5

        if (birinci>ikinci){//1.yol: if cozumu
            System.out.println(ikinci);
        }else {
            System.out.println(birinci);
        }

        double sonuc2=birinci>ikinci?ikinci:birinci;//2.yol: ternary cozumu
        System.out.println(sonuc2);

        System.out.println(birinci>ikinci?ikinci:birinci);


    }//Main
}//Class
