package day10ifstatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz        */
        /*Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin uc tane uzunluk giriniz..");

        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        boolean ucgenmi= a+b>c && c>Math.abs(a-b) &&
                         a+c>b && b>Math.abs(a-c) &&
                         b+c>a && a>Math.abs(b-c);

        if(a<=0 || b<=0 || c<=0){
            System.out.println("Gecerli kenar uzunlugu giriniz.");
        }else if (ucgenmi){

            if (a==b && b==c && a==c){//inner if
                System.out.println("Eskenar ucgen");
            }else if (a==b || b==c || a==c){
                System.out.println("ikizkenar ucgen");
            }else {
                System.out.println("Cesitkenar ucgen");
            }//nested if

        }else {
            System.out.println("Ucgen degil");//outter if
        }*/

        /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgen olusturmak icin uc kenar uzunlugu giriniz");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();

        boolean ucgenMi = a+b>c && c>a-b &&
                          b+c>a && a>b-c &&
                          a+c>b && b>a-c;

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("girilen veriler gecersiz.");
        } else if (ucgenMi) {

            if (a == b && b == c) {
                System.out.println("Eskenar ucgendir");
            } else if (a == b || a == c || b == c) {
                System.out.println("Ikizkenar ucgendir");
            } else {
                System.out.println("Cesitkenar ucgendir");
            }
        } else {
            System.out.println("Ucgen degil");
        }



    }//Main
}//Class
