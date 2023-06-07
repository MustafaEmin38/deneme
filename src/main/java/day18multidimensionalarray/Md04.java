package day18multidimensionalarray;

import java.util.Scanner;

public class Md04 {
    public static void main(String[] args) {
        //Ornek: Bir integer multidimensional arraydeki en k ve  en b elemanin toplamini bulunuz
        int ages[][] = {{15,4},{12,43,21}};//==> 4 + 43= 47

        int small = ages[0][0];
        int big = ages[0][0];

        for(int[] w: ages){
            for (int k: w){
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small+big);

        int num = 1;
        while(num<1) {
            System.out.print(num + " *");
            num++;
        }

        for(int i=1; i<=5; i++) {

            for(int j=(5-i); j>1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }



        int bas = 3;
        int bit = 5;
        int carpim = 1;
        int toplam = 0;


        if(bas<=bit) {
            for(int i=bas; i<=bit; i++) {



                toplam = toplam + i;
            }

        } else {
            for(int i=bas; i>=bit; i--) {
                carpim = carpim * i;
            }
        }
        System.out.print(carpim);
        System.out.println(toplam);



    }//main
}//class
