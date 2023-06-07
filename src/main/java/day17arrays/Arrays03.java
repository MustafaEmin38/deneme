package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        String names[]={"K","C","R","A","S"};
        String el="R";

        //1.way:
        int counter=0;
        for (String w:names){
            if(w.equals(el)){
                counter++;
                break;//kod mantigi acisindan bu logic onemli>sayma yapmiyorum "var mı yok mu kontrolu" yapiyorum. bulunca biraksin java yorulmasin
            }
        }
        if (counter>0){
            System.out.println("Array has  "+el);
        }else {
            System.out.println("Array does not have "+el);
        }

        //2.way : binarySearch(): hizli calisir
        /*
        1.binarySearch() method unu sort() kullanmadan kullanmayiz, cunku binarySearch mantigi sirali elemanlar icin gecerlidir
        2.binarySearch() method u var olan elemanlar icin size o ele manin index ini verir
        3.binarySearch method undan aldiginiz index 0 veya 0 dan buyukse bu o eleman array de var demektir
        4.binarySearch method u olmayan elemanlar icin negatif tam sayi degeri verir
        "-" isaretinin anlami o eleman yok demektir.
        "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir
         */
        //2.way : binarySearch():
        Arrays.sort(names);
        int result=Arrays.binarySearch(names,el);

        if (result<0){
            System.out.println("Array does not have"+el);
        }else {
            System.out.println("Array has "+el);
        }
        System.out.println(Arrays.toString(names));//[A, C, K, R, S]

        int num1= Arrays.binarySearch(names,"A");
        System.out.println(num1);//0 ==> var hem de indexi sifirdir


        int num2= Arrays.binarySearch(names,"K");
        System.out.println(num2);//2 ==> var hem de indexi ikidir

        int num3= Arrays.binarySearch(names,"U");
        System.out.println(num3);//-6 ==> "-" bu eleman yok demek
        //6 ise olsaydi Altinci eleman olurdu



    }//main
}//class
