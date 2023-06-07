package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek: Kullanicidan alinan bi sayinin tek mi çift mi oldugunu konsola yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num=input.nextInt();

        //1.Yol
        if(num%2==0){
            System.out.println("Cift sayi...");   //=========> kontrol edilen conditional sayisi 2
        }
        if(num%2!=0){
            System.out.println("Tek sayi...");
        }

        //2.Yol==> kontrol edilen conditional sayisi az oldugundan dolayi tavsiye edilir
        //else: aksi takdirde demek
        //if else de sadece bir blok çalışır

        if(num%2==0){
            System.out.println("Cift sayi...");  //=========> kontrol edilen conditional sayisi 1
        }else{
            System.out.println("Tek sayidir");
        }

    }//Main
}//Class
