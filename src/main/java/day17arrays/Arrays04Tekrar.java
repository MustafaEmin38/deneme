package day17arrays;

import java.util.Arrays;

public class Arrays04Tekrar {
    public static void main(String[] args) {
        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String cumle="Learn Java earn money";
        String kelimes[]=cumle.split(" ");//split() methodu bize array return eder
        System.out.println(Arrays.toString(kelimes));//[Learn, Java, earn, money]
        System.out.println("kelimes.length = " + kelimes.length);//4

        //Ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren gosteren kodu yaziniz
        String sentence="Learn Java earn money";
        String arrSt[]=sentence.replaceAll("[^a-zA-Z]","").split("");
        System.out.println("arrSt harfleri = " + Arrays.toString(arrSt));//[L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println("arrSt.length = " + arrSt.length);//18


    }//main
}//class   30,05,2023 saat 02,08
