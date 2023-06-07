package day09ifstatements;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        //Ornek 2: Bir stringdeki tekrarsiz karakterleri ekrana yazdiriniz (INTERVİEW SORUSUDUR)
        String str1="baby";

        char ch0=str1.charAt(0);
        if (str1.indexOf(ch0)==str1.lastIndexOf(ch0)){
            System.out.println(ch0);}

        char ch1=str1.charAt(1);
        if (str1.indexOf(ch1)==str1.lastIndexOf(ch1)){
            System.out.println(ch1);}

        char ch2=str1.charAt(2);
        if (str1.indexOf(ch2)==str1.lastIndexOf(ch2)){
            System.out.println(ch2);}

        char ch3=str1.charAt(3);
        if (str1.indexOf(ch3)==str1.lastIndexOf(ch3)){
            System.out.println(ch3);}



        //Ornek: Verilen karakter buyuk ise ekrana "Buyuk harf" yazdirin
        Scanner scann= new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char  karakter=scann.next().charAt(0);

        if(karakter>='A'&& karakter<'Z'){
            System.out.println(karakter);
        } else if (karakter>='a'&& karakter<='z') {
            System.out.println("yazdiginiz karakter kucuk harftir");
        } else {
            System.out.println("yazdiginiz karakter harf degildir");
        }


        //Ornek: Kullanicidan alinan bi sayinin tek mi çift mi oldugunu konsola yazdiriniz
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int  numU=scan.nextInt();

        if (numU%2==0){
            System.out.println(numU+"==>busayi cifttir arkadas");
        }
        if (numU%2!=0){
            System.out.println("sati tektir");
        }

        if (numU%2==0){
            System.out.println("sayi cift");
        }else {
            System.out.println("sayi tektir");
        }

        //Ornek1: Sayi 3 basamakli ise ekrana "Sayi 3 basamaklidir!" yazdirin.
        int numUser = -562;
        numUser=Math.abs(numUser);
        if (numUser>99&& numUser<1000){
            System.out.println("sayi 3 basamaklidir");
        }

        //Q05 Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
        //Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        Scanner inputData=new Scanner(System.in);
        System.out.println("Lutfen uc kelimeden olusan isminizi yaziniz");
        String isimKullanici=inputData.nextLine();
        char ilkHarf=isimKullanici.toUpperCase().charAt(0);
        char ikinciHarf=isimKullanici.toUpperCase().split(" ")[1].charAt(0);
        char ucuncuHarf=isimKullanici.toUpperCase().split(" ")[2].charAt(0);
        System.out.println(""+ilkHarf+"."+ikinciHarf+"."+ucuncuHarf);



        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String isim= scan.nextLine();
        char ilkİsim=isim.toUpperCase().charAt(0);
        char ikincİisim=isim.toUpperCase().split(" ")[1].charAt(0);
        char ucuncuİsim=isim.toUpperCase().split(" ")[2].charAt(0);
        System.out.println(""+ilkİsim+"."+ikincİisim+"."+ucuncuİsim+".");
        */



       // Q04 Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        //  ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        Scanner kullanici= new Scanner(System.in);
        System.out.println("Lutfen adınızı ve soyadinizi yaziniz:");
        String name= kullanici.nextLine();
        String isim1=name.split(" ")[0];
        System.out.println(isim1);
        String soyisim=name.split(" ")[1];
        System.out.println(soyisim);

        //  Q03 TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sehir ismi giriniz");
        String sehir = input.nextLine();
        boolean s = sehir.contains(" ");
        System.out.println(s);


    }
}
