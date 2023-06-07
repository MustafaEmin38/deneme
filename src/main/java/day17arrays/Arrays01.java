package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Array leri kisa yoldan nasil olusturabiliriz?
        int arr[] ={63,7,312,8,4};
        System.out.println(Arrays.toString(arr));

        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.
        int sayac=0;

        for ( int w:arr) {
            if(w%2==0){
                sayac++;
        }
        }
        System.out.println("Array de "+sayac+" adet cift sayi "+(arr.length-sayac)+" adet tek sayi vardir");

        //Ornek 2: Size verilen bir String array deki isimlerden 5 karakterden az karakter icerenleri console a yazdiriniz
        String stdNames[]=new String[5];
        stdNames[0]="Ajda";
        stdNames[1]="Ayhan";
        stdNames[2]="Tom";
        stdNames[3]="Cuneyt";
        stdNames[4]="Filiz";

        for ( String w: stdNames ) {
            if (w.length()<5){
                System.out.println(w);
            }
        }
        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan isimler
        // haric diger isimleri console a yazdiriniz.
        //Note 1: sort() sayisal data type larini kucukten buyuge siralar (ascending order)
        //Note 2: sort() methodu string data type larini alfabetik olarak siralar (alfabetical order)
        //Note 3:ascending order+alfabetical order ==> Naturel order
        //Note 4: sort () methodu array elemanlarini Naturel order a gore siralar
        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Cuneyt, Filiz, Tom]
        for (String w: stdNames){
            if (w.startsWith("F")){
                continue;//asagi devam etmez,basa doner
            }
            System.out.println(w);
        }
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        System.out.println(arr1.equals(arr2));
    }//main
}//class
