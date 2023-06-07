package day10ifstatements;

import java.util.Scanner;

public class NestedIf01 {//nested icice gecmis demek
    public static void main(String[] args) {
        /*
      Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenardan buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgen olusturmak icin uc tane uzunluk yaziniz");
        double x=Math.abs(scan.nextDouble());
        double y=Math.abs(scan.nextDouble());
        double z=Math.abs(scan.nextDouble());

        boolean ucgenMi= x+y>z && z>Math.abs(x-y)&&
                         x+z>y && y>Math.abs(x-z)&&
                         y+z>x && x>Math.abs(y-z);
        if (ucgenMi){
            if(x==y && y==z && x==z){
                System.out.println("Eskenar ucgendir");
            }else {
                System.out.println("Ucgen ama eskenar ucgen degildir");
            }
        }else {
            System.out.println("Ucgen degildir");
        }


        /*Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin uc tane uzunluk giriniz..");
        double a=Math.abs(input.nextDouble());
        double b=Math.abs(input.nextDouble());
        double c=Math.abs(input.nextDouble());

        boolean ucgenmi= a+b>c && c>Math.abs(a-b) &&
                         a+c>b && b>Math.abs(a-c) &&
                         b+c>a && a>Math.abs(b-c);


        if (ucgenmi){
            if (a==b && b==c && a==c){
            System.out.println("Ucgen hem de eskenar ucgen");
        }else {
                System.out.println("Ucgen ama eskenar degil");
            }

        }*/




    }//Main
}//Class
