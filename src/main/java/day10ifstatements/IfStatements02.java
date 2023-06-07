package day10ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....
        //tum kritik degerler onemlidir test edilmesi gerekir, ınterview de çıkar
        /*Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz..");
        byte num = input.nextByte();

        if(num==1){
            System.out.println("Sunday");
        } else if (num==2) {
            System.out.println("Monday");
        } else if (num==3) {
            System.out.println("Tuesday");
        }else if (num==4) {
            System.out.println("Wednesday");
        }else if (num==5) {
            System.out.println("Thursday");
        }else if (num==6) {
            System.out.println("Friday");
        }else if (num==7) {
            System.out.println("Saturday");
        }else{
            System.out.println("Hatali giris yaptiniz. Lutfen 1 ile 7 arasinda bir sayi giriniz..");
        }*/

        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz:");
        byte sayi=scan.nextByte();

        if (sayi==1) {
            System.out.println("sunday");
        } else if (sayi==2) {
            System.out.println("monday");
        } else if (sayi==3) {
            System.out.println("tuesday");
        } else if (sayi==4) {
            System.out.println("wednesday");
        } else if (sayi==5) {
            System.out.println("thursday");
        } else if (sayi==6) {
            System.out.println("friday");
        }else if (sayi==7){
            System.out.println("saturday");
        }else {
            System.out.println("Hatali giris yaptiniz, lutfen 1-7 arasi bir rakam giriniz");
        }

    }//main
}//class
