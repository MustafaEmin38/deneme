package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ornek : Kullanicidan ilk ismini ve soy ismini alip ayni satirda ekrana yazdiriniz.

        //1.adim: Scanner class tan bir object olustur.
        Scanner input = new Scanner(System.in);

        //2. adim :Kullaniciya ne istediğimize dair mesaj veriniz.
        System.out.println("Ilk isminizi giriniz :");

        //next() method u kullanicidan "tek kelimeli string" almak icin kullanilir
        //3. adim : Uygun method u kullanarak kullanıcının verdigi data yı memory e yerlestiriniz
        String firstName = input.next();

        System.out.println("Soy isminizi giriniz :");

        String lastName = input.next();

        System.out.println(firstName+" "+lastName); //ali can

        Scanner data = new Scanner(System.in);
        System.out.println("ilk adinizi yaziniz");
        String ilkAd = data.next();
        System.out.println("Soy ad yaziniz");
        String soyAd=data.next();
        System.out.println(ilkAd+" "+soyAd);

    }//main method
}//class
