package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        // Ornek : Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a) Alanin hesaplayıiniz
        //b) Cevresini hesaplayiniz
        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz");
        double shortSide = input.nextDouble();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz");
        double longSide = input.nextDouble();

        System.out.println("Alan ="+(shortSide*longSide));

        System.out.println("Cevre ="+(2*shortSide + 2*longSide));

        Scanner data = new Scanner(System.in);
        System.out.println("dikdortgenin kisa kenari");
        byte kisaKenar=data.nextByte();
        System.out.println("dikdortgenin uzun kenari");
        byte uzunKenar=data.nextByte();
        System.out.println("a)alan="+(kisaKenar*uzunKenar));
        System.out.println("b)cevre="+(2*(kisaKenar+uzunKenar)));


    }//main method
}//class
