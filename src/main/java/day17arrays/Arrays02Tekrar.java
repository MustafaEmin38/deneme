package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02Tekrar {
    public static void main(String[] args) {
        //Ornek 1: Kullanicinin coklu data yi bir array e yerlestirebilmesi ve istedigi zaman durdurabilmesi
        // icin gereken kodu yaziniz
        /*
        1.Kullanicidan data alabilmek icin scanner object olustur
        2. coklu data yi yerlestirmek icin bir array olusturmaliyiz
        3.Array olusturabilmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4.loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kek yapmak icin gereken malzeme sayisini giriniz");
        int malzemeSayisi=scan.nextInt();

        System.out.println("Islemi durdurmak istediginizde 'q' ya basiniz!");

        String kek[]=new String[malzemeSayisi];

        for (int i = 0; i < kek.length; i++) {
            System.out.println(i+1+". malzemeyi yaziniz");
            String malzemeSepeti=scan.next();

            if (malzemeSepeti.equalsIgnoreCase("q")){
                break;
            }else {
                kek[i]=malzemeSepeti;
            }
        }System.out.println(Arrays.toString(kek));

    }//main
}//class
