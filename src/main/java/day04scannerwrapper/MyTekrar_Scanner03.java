package day04scannerwrapper;

import java.util.Scanner;

public class MyTekrar_Scanner03 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonucunu ekrana yazdiran kodu yaziniz

        Scanner inputData = new Scanner(System.in);

        System.out.println("Lütfen iki sayi yaziniz");

        double sayi1 = inputData.nextDouble();
        double sayi2 = inputData.nextDouble();

        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);

    }//main method
}//class
