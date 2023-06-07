package day05concatinationoperatorstypecasting;

public class MyTekrar_Concatination {
    public static void main(String[] args) {
        //Ornek 1:Bir string ve iki integer variable olusturun. String degeri ile Integer larin toplamini console a yazdirin.
        String ev ="Amasya";
        int a = 10;
        int b = 11;
        System.out.println(ev+a+b);//Amasya1011 =>soldan saga old icin:[(Amasya+10=Amasya10)+11]= Amasya1011
        System.out.println(ev +( a + b )); // Amasya21
        System.out.println( ev + a * b ); // Amasya110
        System.out.println(a + b + ev );// 21Amasya
        System.out.println(a + ev + b);// 10Amasya11

        String il ="Kayseri";
        int num1 = 5;
        int num2 = 10;
        System.out.println(il+num1+num2);// Kayseri510
        System.out.println(il+(num1+num2));// Kayseri15
        System.out.println( il + num1 * num2 ); // Kayseri50
        System.out.println(num1 + num2 + il );// 15Kayseri
        System.out.println(num1 + il + num2);// 5Kayseri10

        //Java da "+" sembolu iki sayi arasinda kullanilirsa toplama islemi olur.
        //Java da "+" sembolu iki string veya bir string bir sayi arasinda kullanilirsa "concatination" islemi olur
        //"concatination" birlestirme yapar.
        //Note : concatination islemlerinde java matematikteki islem onceligi kurallarini uygular.

        /*
        Matematikte islem onceligi:
        1. uslu sayilar
        2. parantez ici islemler
        3. carpma ve bolmeler
        4. toplama ve cıkarmalar yapilir
        5.Ayni oncelikli olanlarda soldan saga baslanir
         */

        //Ornek 2: Size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz
        String passat = "830";
        String focus = "450";
        System.out.println(passat+focus); //830450 (concatination)

        //Ornek 2 yi Integer.valueOf ile yapalim
        //Integer.valueOf() ==> string degerleri (yani "2300") integer (2300) a cevirir.
        //ama basında Integer olmak zorunda tabiiiiii
        int toplamFiyat = Integer.valueOf(passat)+Integer.valueOf(focus);
        System.out.println(toplamFiyat);

        String airfryer = "6000";
        String okka = "735";
        System.out.println(airfryer+okka);

        int toplam = Integer.valueOf(airfryer)+Integer.valueOf(okka);
        System.out.println(toplam);

        //Ornek 3: Size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz.
        String kurs = "$1350";
        String hediyeKurs = "$200";
        int totalPrice = Integer.valueOf(kurs) + Integer.valueOf(hediyeKurs);
        System.out.println(totalPrice);

        //Note : valueOf() methodu tum karakterleri rakam olan string leri sayiya cevirir
        //Eger valueOf() methodu kullanilirken string in icine rakam olmayan bi karakter koyarsaniz hata alirsiniz.
        //valeOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir

    }//main method
}//class
