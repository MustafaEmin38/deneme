package day10ifstatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //Example:  Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz
       /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num=input.nextInt();

        if (num>0){
            System.out.println("Pozitiftir..");
        } else if ( num<0) {
            System.out.println("Negatiftir.");
        }else {
            System.out.println("Notr");
        }
*/
        //* Example:  Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi>0){
            System.out.println("bu poz bir sayidir");
        } else if (sayi<0) {
            System.out.println("bu negatif bir sayidir");
        } else  {
            System.out.println("bu sayi nort dur");

        }

    }//main
}//class
