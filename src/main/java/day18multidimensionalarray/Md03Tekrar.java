package day18multidimensionalarray;

import java.util.Arrays;

public class Md03Tekrar {
    public static void main(String[] args) {
        //Ornek : iki boyutlu bir array i tek boyutlu bi array e ceviriniz
        int numbers[][]={{5,4},{2,3,2}};//==>{5,4,2,3,2}

        //1. step: iki boyutlu array de kac eleman oldugunu bulan kodu yazmaliyiz
        //2. step: Tek boyutlu arrayi iki boyutlu array in eleman sayisini kullanarak olusturmaliyiz
        //3. step: iki boyutlu array deki elemanlari tek boyutlu array e transfer etmeliyiz


        //1. step: iki boyutlu array de kac eleman oldugunu bulan kodu yazmaliyiz
        int elemanSayisi=0;
        for (int [] w : numbers){
            elemanSayisi+=w.length;
        }
        System.out.println("eleman sayisi=  "+elemanSayisi);//5


        //2. step: Tek boyutlu arrayi iki boyutlu array in eleman sayisini kullanarak olusturmaliyiz
        int yeniNum[]=new int[elemanSayisi];


        //3. step: iki boyutlu array deki elemanlari tek boyutlu array e transfer etmeliyiz
        int index=0;

        for (int [] w: numbers){
            for ( int k:w){
                yeniNum[index]=k;
                index++;
            }
        }
        System.out.println(Arrays.toString(yeniNum));// [5, 4, 2, 3, 2]




    }//main
}
