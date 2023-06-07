package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03Tekrar {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz
        Scanner input= new Scanner(System.in);
        System.out.println("Islem yapacaginiz 1. sayiyi giriniz:");
        double sayi1=input.nextDouble();
        System.out.println("Islem yapacaginiz 2. sayiyi giriniz:");
        double sayi2=input.nextDouble();
        System.out.println("Yapmak istediginiz islemi seciniz \n   +\n   -\n   *\n   /\n   %");
        char islem=input.next().charAt(0);

        switch (islem){
            case '+':
                System.out.println(sayi1+"+"+sayi2+"="+(sayi1+sayi2));
                break;
            case '-':
                System.out.println(sayi1+"-"+sayi2+"="+(sayi1-sayi2));
                break;
            case '*':
                System.out.println(sayi1+"*"+sayi2+"="+(sayi1*sayi2));
                break;
            case '/':
                System.out.println(sayi1+"/"+sayi2+"="+(sayi1/sayi2));
                break;
            case '%':
                System.out.println(sayi1+"%"+sayi2+"="+(sayi1*sayi2/100));
                break;
            default:
                System.out.println("Hatali giris...");
        }


    }//main
}//class
