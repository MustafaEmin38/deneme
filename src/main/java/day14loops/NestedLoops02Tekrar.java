package day14loops;

import java.util.Scanner;

public class NestedLoops02Tekrar {
    public static void main(String[] args) {
        /*              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int row=input.nextInt();

        System.out.println("Lutfen sutun sayisini giriniz");
        int column=input.nextInt();


        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= column; j++) {

                System.out.print("x  ");
            }
            System.out.println("");
        }

        for (int i = 1; i<=10 ; i++) {

            for (int j = 1; j <= 10 ; j++) {
                System.out.print("$ ");
            }
            System.out.println("");
        }


    }//Main
}//Class
