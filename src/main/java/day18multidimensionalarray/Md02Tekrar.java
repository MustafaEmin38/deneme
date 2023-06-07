package day18multidimensionalarray;

import java.util.Arrays;

public class Md02Tekrar {
    public static void main(String[] args) {
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        //Ornek 1: Yukaridaki students arrayinde icinde "h" harfi olan isimleri console a yazdiriniz
        for(String[] w : students){
            for (String k: w){
                if (k.contains("h")){
                    System.out.print(k+" "); //Ayhan Beyhan Seyhan Ceyhan Kayahan
            }
            }
        }
        System.out.println();

        //Ornek 2: Bir integer multidimensional array olusturunuz tum elemanlarin carpimini hesaplayiniz
        int number[][]={{12,2},{3},{8,5}};

        int carpim=1;
        for (int [] w : number){
            for (int k : w ){
                carpim=carpim*k;
            }
        }
        System.out .println("Tum elemanlari carpinca : "+carpim+" elde ederiz.");


    }//main
}//class
