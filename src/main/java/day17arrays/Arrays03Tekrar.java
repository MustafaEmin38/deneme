package day17arrays;

import java.util.Arrays;

public class Arrays03Tekrar {
    public static void main(String[] args) {
        //Spesific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz

        String harfler[]={"K","L","A","R","G","P","T","E"};
        String harf="G";
        //1.yol==> for loop ile
        int sayac=0;
        for (String w:harfler) {
            if (w.equals(harf)){
                sayac++;
                break;
            }
        }
        if (sayac>0){
            System.out.println("Array has "+ harf);
        }else {
            System.out.println("Array does not have"+ harf);
        }

        //2.yol:==> binary ile

        Arrays.sort(harfler);
        int sonuc=Arrays.binarySearch(harfler,harf);
        if (sonuc>0) {
            System.out.println("Array has " + harf);
        }else {
            System.out.println("Array does not have" + harf);
        }
        System.out.println(Arrays.toString(harfler));//[A, E, G, K, L, P, R, T]

        int sonuc1=Arrays.binarySearch(harfler,"T");//harfler Array inde T elemani var mi? diye sordum.
        System.out.println(sonuc1);//7 basti. cunku vardir ve 7. index te oturur

        int sonuc2=Arrays.binarySearch(harfler,"X");
        System.out.println(sonuc2);//-9 basti. - yok demek. 9 eger olsaydi 9. sirada olurdu demek

        int sonuc3=Arrays.binarySearch(harfler,"P");
        System.out.println(sonuc3);//5 basti. cunku P va ve 5. index te


        //3.way: bu yolu kendim buldum
        if (Arrays.toString(harfler).contains("G")){
            System.out.println("Array has this letter");
        }else {
            System.out.println("Array not have.");
        }


    }//main
}//class
