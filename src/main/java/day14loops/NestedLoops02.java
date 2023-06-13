package day14loops;

import java.util.Scanner;

public class NestedLoops02 {
    public static void main(String[] args) {
         /*              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */

        Scanner input = new Scanner(System.in);

        System.out.println("Satir (row) sayisini giriniz..");
        int row = input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz..");
        int column = input.nextInt();


        for (int i = 1; i <= row; i++) {//dıstaki loop satirlar icin satir sayisi kadar calisir

            for (int k = 1; k <= column; k++) {//icteki loop yan yana yazdigindan sutunlar icin sutun sayisi kadar calisir

                System.out.print("x ");

            }
            System.out.println();     //ilk satir yanyana yazdirildiktan sonra pointeri bir sonraki satira almak icin

        }
        //Nested yapilari java da bizim gibi sevmez cunku bu yapilar "time consuming" tir.
        // Ozellikle nested for loop lar i mumkun mertebe kullanmayiz.Baska bir yontemi varsa nested loop olmadan cozeriz.
        //Inretview de sorulur diye ogrenmemmiz gerek, bunu yapan otekileri zaten yapar diye dusunurler
        // ve bilip bilmedigimizi ogrenmek adina sorarlar


    }//Main
}//Class
