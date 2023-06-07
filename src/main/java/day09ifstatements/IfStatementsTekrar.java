package day09ifstatements;

import java.util.Scanner;

public class IfStatementsTekrar {
    public static void main(String[] args) {

        //Ornek 1: Sayi pozitif ise ekrana pozitif yazdirin
        int sayi1=15;
        if(sayi1>0){
            System.out.println("sayi pozitiftir");
        }
        int num1=5;
        if (num1>0){
            System.out.println("sayi pozitiftir");
        }

        //ornek 2 : sayı -1 ile 10 arasında ise ekrana rakam yazdırın
        int sayi2 =9;
        if(sayi2>=-1 && sayi2<10){
            System.out.println("Rakam...");
        }

        //Ornek1: Sayi 3 basamakli ise ekrana "Sayi 3 basamaklidir!" yazdirin.
        int sayi3 = -123;
        int sayi=Math.abs(sayi3);

        if (sayi>99 && sayi<1000){
            System.out.println("Sayi 3 basamaklidir");
        }

        int num3= -789;
        int num=Math.abs(num3);
        if (num>99 && num<1000){
            System.out.println("Sayi 3 basamklidir");
        }

        //Ornek 2: Bir stringdeki tekrarsiz karakterleri ekrana yazdiriniz (INTERVİEW SORUSUDUR)
        String str1="baby";

        char ch0=str1.charAt(0);
        if ( str1.indexOf(ch0)==str1.lastIndexOf(ch0) ){
            System.out.println(ch0);
        }

        char ch1=str1.charAt(1);
        if (str1.indexOf(ch1)==str1.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2= str1.charAt(2);
        if (str1.indexOf(ch2)==str1.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3=str1.charAt(3);
        if (str1.indexOf(ch3)==str1.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        //Ornek: Kullanicidan alinan bi sayinin tek mi çift mi oldugunu konsola yazdiriniz
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi yaziniz : ");
        int userNum =input.nextInt();
        //1.yol

        if (userNum%2==0){
            System.out.println("Cift sayidir");
        }
        if (userNum%2!=0){
            System.out.println("Tek sayidir");
        }
        //2.yol
        if (userNum%2==0){
            System.out.println("Cift sayidir");
        } else {
            System.out.println("Tek sayidir");
        }

        //Ornek: Verilen karakter buyuk ise ekrana "Buyuk harf" yazdirin
        //kucuk harf ise ekrana "Kucuk harf" yazdirin

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Lutfen bir karakter yaziniz:");
        char ch = inputUser.next().charAt(0);

        //1.yol
        if (ch >='A' && ch <= 'Z'){
            System.out.println("Buyuk harftir");
        }
        if (ch>='a' && ch<='z'){
            System.out.println("Kucuk harftir");
        }
        //2.yol
        if (ch>='A' && ch <= 'Z'){
            System.out.println("Buyuk harftir");
        }else if(ch>='a' && ch<='z') {
            System.out.println("Kucuk harftir");
        }else {
            System.out.println("Harf degildir");
        }

        System.out.println('a'+'b');
        String s1 = "Java Kolaydır";
        System.out.println(s1.toUpperCase());








    }//main
}//Class

