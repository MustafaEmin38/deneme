package day04scannerwrapper;

import java.util.Scanner;

public class MyTekrar_Scanner04 {
    public static void main(String[] args) {
        //Ornek: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a) Alanini hesaplayiniz
        //b) Cevresini hesaplayiniz.

        Scanner inputData = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini yaziniz");
        double kisaKenar = inputData.nextDouble();

        System.out.println("Dikdortgenin uzun kenarini yaziniz");
        double uzunKenar = inputData.nextDouble();

        System.out.println("Alan :"+ (kisaKenar*uzunKenar));
        System.out.println("Cevre :" + (2*(kisaKenar+uzunKenar)));
    }//main method
}//class
