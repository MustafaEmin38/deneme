package day18multidimensionalarray;

import java.util.Arrays;

public class Md01Tekrar {
    public static void main(String[] args) {

        //Bir Array in elemanlari Array ise bu Array ler Multidimensional Array dir

        //Multidimensional Array nasil olusturulur?
        String ogrenci[][]=new String[3][2];
        System.out.println(Arrays.deepToString(ogrenci)); //[[null, null], [null, null], [null, null]]

        //MultiDimensional Array lere eleman nasil eklenir?
        ogrenci[2][1]="Ali";
        ogrenci[2][0]="Can";
        ogrenci[1][1]="Deniz";
        ogrenci[1][0]="Kaan";
        ogrenci[0][0]="Zelis";
        ogrenci[0][1]="Emel";

        //Multidimensional arrayleri console a yazdirmak icin "toString()" methodu degil
        //"deepToString()" methodunu kullanmaliyiz
        System.out.println(Arrays.deepToString(ogrenci));// [[Zelis, Emel], [Kaan, Deniz], [Can, Ali]

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir.
        //Deniz
        System.out.println(ogrenci[1][1]); //Deniz

        //Multidimensional Array icindeki array nasil yazdirilir?
        System.out.println(ogrenci[1]);//[Ljava.lang.String;@7e0ea639
        System.out.println(Arrays.deepToString(ogrenci[1]));// [Kaan, Deniz]

        //Kisa yoldan Multidimensional array nasil olusturulur?
        String ogretmen[][]={{"kaya","lale"},{"kemal","cem"},{"ada","bugra","halil"},{"nurettin"},{"hatice","zeynep","elif"}};

        //Ornek 1: Yukaridaki ogretmen arrayinde toplam kac tane isim oldugunu bulunuz
        // collection veya array uzerinde islem yapacaksak bize for each loop yeter.

        int total=0;
        for (String [] w: ogretmen){
            total+=w.length;
        }
        System.out.println(total);//11



    }//main
}//class
