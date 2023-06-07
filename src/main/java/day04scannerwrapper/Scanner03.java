package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Ornek : Kullanici dan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi giriniz");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber  +  secondNumber);
        System.out.println(firstNumber  -  secondNumber);
        System.out.println(firstNumber  *  secondNumber);
        System.out.println(firstNumber  /  secondNumber);

    Scanner data = new Scanner(System.in);
    System.out.println("Lutfen bir sayi yaziniz");
    byte ilkSayi=data.nextByte();
    System.out.println("Lutfen ikinci sayiyi giriniz");
    byte ikinciSayi = data.nextByte();
        System.out.println(ilkSayi+ikinciSayi);
        System.out.println(ilkSayi-ikinciSayi);
        System.out.println(ilkSayi*ikinciSayi);
        System.out.println(ilkSayi/ikinciSayi);
    }//main method
}//class
