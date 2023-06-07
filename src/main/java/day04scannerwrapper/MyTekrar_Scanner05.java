package day04scannerwrapper;

import java.util.Scanner;

public class MyTekrar_Scanner05 {
    public static void main(String[] args) {

        //Ornek: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz
        Scanner inputData = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi yaziniz");
        int besBasSayi = inputData.nextInt();

        //bir sayinin son rakamini alabilmek icino sayiyi 10 a bolup kalani almaliyiz
        // % ==> modulus operator.Solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
        //dolaysiyle %10 her zaman bize birler basmaginda bulunan sayiyi verir.
        //bir tam sayiyi bir tam sayiya bolerseniz, java sonucu kesinlikle tam sayi yapar.
        //java bu durumda yuvarlama yapmaz, ondalik kismi iptal eder.
        //dolaysiyla bir tam sayiyi 10 abolersek birler basamagini silmis oluruz.

        //son rakami al.
        int birlerBas = besBasSayi%10;
        //sayı kucult
        besBasSayi = besBasSayi/10;

        //sondan ikinci rakami al
        int onlarBas = besBasSayi%10;
        //sayı kucult
        besBasSayi = besBasSayi/10;

        //sondan ucuncu rakami al
        int yuzlerBas = besBasSayi%10;
        //sayı kucult
        besBasSayi = besBasSayi/10;

        //sondan dorduncu rakami al
        int binlerBas = besBasSayi%10;
        //sayı kucult
        besBasSayi = besBasSayi/10;

        //sondan besinci rakami al
        int onBinlerBas = besBasSayi%10;
        //son rakam old. icin kucultmeye gerek yok

        System.out.println("cozum = "+ (onBinlerBas+binlerBas+onlarBas+birlerBas));
        //38671 icin cozum:19
        //56582 icin cozum:21

        //Homework 1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        double ilkSayi = input.nextDouble();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        double ikinciSayi = input.nextDouble();

        System.out.println("Lutfen ucuncu sayiyi giriniz");
        double ucuncuSayi = input.nextDouble();

        System.out.println("Ortalama = " + (ilkSayi+ikinciSayi+ucuncuSayi)/3 );

        // Homework 2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        Scanner data = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli sayi giriniz");

        int kabulEdilenSayi = data.nextInt();

        int ilkRakam = kabulEdilenSayi%10;
        kabulEdilenSayi = kabulEdilenSayi/10;

        int ikinciRakam = kabulEdilenSayi%10;
        kabulEdilenSayi = kabulEdilenSayi/10;

        int ucuncuRakam = kabulEdilenSayi%10;

        System.out.println("Sonuc =" + (ilkRakam+ikinciRakam+ucuncuRakam));















    }//main method
}//class
