package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");

        int number = input.nextInt();

        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz
        // % => modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        // dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir
        //bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar
        //java  bu durumda yuvarlama yapmaz, ondalik kismi iptal eder
        //dolayisiyle bir tamsayiyi 10 a bolersek birler basamagini silmis oluruz

        //son rakami al
        int birlerBasamagi= number%10;
        //sayi kucult
        number = number/10;

        //sondan ikinci rakami al
        int sondanIkinci= number%10;
        //sayi kucult
        number = number/10;

        //sondan ucuncu rakami al
        int sondanUcuncu = number%10;
        //sayi kucult
        number = number/10;

        //sondan dorduncu rakami al
        int sondanDorduncu = number%10;
        //sayi kucult
        number = number/10;

        //sondan besinci rakami al
        int sondanBesinci = number%10;
        //son rakam old icin kucultmeye gerek yok.

        System.out.println(sondanBesinci+sondanDorduncu+birlerBasamagi+sondanIkinci);

        Scanner data = new Scanner(System.in);

        //Homework 1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz

        Scanner inputData = new Scanner(System.in);
        System.out.println("1. sayiyi yaziniz");
        double sayi1 = inputData.nextDouble();
        System.out.println("2. sayiyi yaziniz");
        double sayi2 = inputData.nextDouble();
        System.out.println("3.sayiyi yaziniz");
        double sayi3 = inputData.nextDouble();
        System.out.println("Ortalama = " + (sayi1+sayi2+sayi3)/3);


        Scanner inputSayi = new Scanner(System.in);
        System.out.println("Lutfen 1.sayiyi giriniz: ");
        byte say1= inputSayi.nextByte();
        System.out.println("Lutfen 2. sayiyi giriniz:");
        byte say2=inputSayi.nextByte();
        System.out.println("Lutfen 3.sayiyi giriniz:");
        byte say3= inputSayi.nextByte();
        System.out.println("ortalama= "+((say1+say2+say3)/3));

        // Homework 2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz

        Scanner dataBase = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi yaziniz");
        int receivedNumber = data.nextInt();
        int sonBasamak = receivedNumber%10;
        receivedNumber = receivedNumber/10;
        int sondanIkinciBas = receivedNumber%10;
        receivedNumber = receivedNumber/10;
        int sondanUcuncuBas = receivedNumber%10;
        System.out.println(sonBasamak+sondanIkinciBas+sondanUcuncuBas);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi yaziniz:"); //265
        int sayimiz = scan.nextInt(); //265
        int ilkRakam = sayimiz%10; //5
        int sayimiz2 = sayimiz/10; //26
        int ikinciRakam = sayimiz2%10; //6
        int ucuncuRakam = sayimiz2/10; //2
        System.out.println("Rakamlar Toplami : "+(ilkRakam+ikinciRakam+ucuncuRakam));


    }//main method
}//class
