package day14loops;

import java.util.Scanner;

public class Loops03Tekrar {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
         9 - 14 ==> 10  12  14     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangic degeri icin bir sayi giriniz");
        int basla=scan.nextInt();
        System.out.println("Bitis degeri icin bir sayi giriniz");
        int bitis=scan.nextInt();

        if (basla < bitis) {
            for (int i = basla; i <= bitis ; i++) {
                if(i%2==0){
                    System.out.print(i+"/");
                }
            }
        }else {
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
        }
        System.out.println("");


        //Ornek 2:ınterview sorusu
        //Hic sayi kullanmadan 1 den 100e kadar olan sayilari yazdiriniz
        int d='d';

        for (int i='d'/'d'; i<='d'; i++){
            System.out.print(i+"*");
        }








    }//Main
}//Class
