package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {

    public static void main(String[] args) {
        //Ornek: Verilen karakter buyuk ise ekrana "Buyuk harf" yazdirin
        //kucuk harf ise ekrana "Kucuk harf" yazdirin
        //if else if in en buyuk avantajı dogruyu bulunca baska kodlari çaliştirmamasidir
        //if her zaman boolean return eder

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz..");
        char ch = input.next().charAt(0);


        //1. Yol
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf..");
        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harf");
        }

        //2.yol
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf..");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harf");
        } else {
            System.out.println("Harf degil");
        }



    }//main
}//class
