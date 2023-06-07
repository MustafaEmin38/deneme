package day16arraysforeachloop;

import java.util.Arrays;

public class Array01Tekrar {
    public static void main(String[] args) {
        //Cig koftede kullanilacak malzemeler...
        String cigKofteMalz[] = new String[8];
        cigKofteMalz [0]= "bulgur";
        cigKofteMalz [1]= "zeytinyagi";
        cigKofteMalz [2]= "isot";
        cigKofteMalz [3]= "pulbiber";
        cigKofteMalz [4]= "karabiber";
        cigKofteMalz [5]= "domates";
        cigKofteMalz [6]= "salca";
        cigKofteMalz [7]= "limon";

        System.out.println(Arrays.toString(cigKofteMalz));
        //[bulgur, zeytinyagi, isot, pulbiber, karabiber, domates, salca, limon]

        //spesific 3 eleman yazdir
        System.out.println(cigKofteMalz[0]);
        System.out.println(cigKofteMalz[5]);
        System.out.println(cigKofteMalz[7]);

        //Ornek 1:Array deki her elemanin basina "*" isareti koyarak ekrana yazdiriniz
        for (int i = 0; i < cigKofteMalz.length ; i++) {

            System.out.println("  *" + cigKofteMalz[i]);
        }

    }//main
}//class
