package day04scannerwrapper;

import java.util.Scanner;

public class MyTekrar_Scanner02 {
    public static void main(String[] args) {
         //Ornek : Kullanicidan adresini aliniz ve yazdiriniz.
        Scanner inputData = new Scanner(System.in);

        System.out.println("Adresinizi yaziniz :");

        //nextLine() method u cok kelimeli string almak icin kullanilir
        String adress = inputData.nextLine();

        System.out.println("adress = " + adress);
    }//main method
}//class
