package day17arrays;

import java.util.Arrays;

public class Arrays01Tekrar {
    public static void main(String[] args) {
        //Array leri kisa yoldan nasil olusturabiliriz?
        int numbers[]={25,46,78,96,35};
        System.out.println(Arrays.toString(numbers));


        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.
        int sayac=0;
        for (int w:numbers) {
            if (w%2==0){
                sayac++;
            }
        }
        System.out.println(sayac+" cift sayi ve "+(numbers.length-sayac)+" tek sayi vardir");

        //Ornek 2: Size verilen bir String array deki isimlerden 5 karakterden az karakter icerenleri console a yazdiriniz

       String kek[]=new String[5];
       kek[0]="un";
       kek[1]="sut";
       kek[2]="yumurta";
       kek[3]="seker";
       kek[4]="kakao";

       for (String w:kek){
           if(w.length()<5) {
               System.out.print(w+"/");
           }
       }
        System.out.println("");

        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan isimler
        // haric diger isimleri console a yazdiriniz.
        String names []= new String[6];
       names [0]="Ali";
       names [1]="Kaan";
       names [2]="Fusun";
       names [3]="Cemre";
       names [4]="Reyyan";
       names [5]="Yusuf";
       Arrays.sort(names);
       System.out.println(Arrays.toString(names));
        for(String w : names){
            if (w.startsWith("F")) {
                continue;
            }System.out.print(w+" ");
        }


    }//main
}//class
