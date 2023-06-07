package day04scannerwrapper;

import java.util.Scanner;

public class MyTekrar_Scanner01 {
    public static void main(String[] args) {
        //Ornek : kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdirin

        //1. adim: Scanner class tan bir object olustur
        Scanner inputData = new Scanner(System.in);

        //2.adim : Kullniciya ne istedigimize dair mesaj verin
        System.out.println("Ilk isminizi giriniz:");

        //next() methodu kullanicidan tek kelimelik string almak icin kullanilir
        //3. adim : Uygun methodu kullnarak kullnicinin verdigi data yi memory e yerlestir
        String ilkIsim = inputData.next();

        System.out.println("Soy isminizi giriniz:");

        String soyIsim = inputData.next();

        System.out.println(ilkIsim + "  "+  soyIsim);// ali can


    }
}
