package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Ornek : Kullanicidan adresini aliniz ve ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz:");

        //nextLine() method u kullanici dan cok kelimeli string almak ici kullanilir
        String adress = input.nextLine();

        System.out.println(adress);

        Scanner data = new Scanner(System.in);
        System.out.println("lutfen adres yaziniz");
        String adres = data.nextLine();
        System.out.println(adres);




    }//main method
}//class
