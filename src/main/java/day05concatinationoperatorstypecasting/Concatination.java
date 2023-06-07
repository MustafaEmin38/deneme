package day05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {
        //Ornek 1: Bir string ve iki integer variable olusturun. String degeri ile Integer larin toplamini console a yazdirin
        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b); //elma1011
        System.out.println(s +( a + b )); //elma21
        System.out.println( s + a * b ); //elma110
        System.out.println(a + b+ s );//21elma
        System.out.println(a+ s + b);//10elma11

        //Java da "+" sembolu iki sayi arasinda kullanilirsa toplama islemi olur
        //Java da "+" sembolu iki String veya bir string ve bir sayi arasinda kullnilirsa "concatination" islemi olur
        //"concatination" birlestirme yapar.
        //Note : "concatination" islemlerinde java matematikteki islem onceligi kurallarini kullanir.

        /*
        Matematikte islem onceligi
        1)once uslu sayilar
        2)Parantez ici islemler yapilir
        3)Carpma ve Bolmeler yapilir
        4)Toplama ve cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir
         */

        //Ornek 2: Size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz.
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);//23005200

        //Integer.valueOf() ==> string degerleri (yani "2300") integer (2300) a cevirir.
        //ama basında Integer olmak zorunda tabiiiiii
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Ornek 3:  Size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz.
        String tv = "$1100";
        String radio = "$300";

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);

        //Note: value of() tum karakterleri rakam olan stringleri sayilara cevirir
        //Eger value of() methodu kullanilirken string in icine rakam olmayan bi karakter koyarsaniz hata alirsiniz
        //value of methodu kullanilirken sadece rakam olan karakterler kullanilmalidir

    }//main
}//class
