package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class stringmani02tekrar {
    public static void main(String[] args) {
        //Ornek 1:  Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //      abc@gmail.com   ===> gmail

        String a = "abc@gmail.com";
        String b ="şdklfjgn@hotmail.com";
        String c ="lasbhlasıkugjfbhl@yahoo.com";
        int baslama=a.indexOf('@')+1;
        int bitme=a.indexOf('.');
        String baslaBitir=a.substring(baslama,bitme);
        System.out.println(baslaBitir);

        int bas=b.indexOf('@')+1;
        int bit=b.indexOf(".");
        String basBit=b.substring(bas,bit);
        System.out.println(basBit);
        int bass =c.indexOf('@')+1;
        int bitt =c.indexOf('.');
        String yaz=c.substring(bass,bitt);
        System.out.println(yaz);


        //Ornek 2:Verilen iki string in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String h = "ali Can";
        String i = "Ali Can";
      boolean lk=h.equals(i);
      boolean lkhk=h.equalsIgnoreCase(i);
        System.out.println(lk);
        System.out.println("lkhk = " + lkhk);

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s == t);//false
        System.out.println(s.equals(t));//false
        System.out.println(s == r);//false
        System.out.println(s.equals(r));//true

        /*Homework
    1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
    console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz

         */
        String nufus = "Turkiye nufusu 2030'da 89.000.000 olacaktır";


        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        String adim1=nufus.replaceAll("[0-9]","");
        int adim2=adim1.length();
        System.out.println("Rakam olmayan karakter sayisi = " + adim2);//32

        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
        String cevap2 =nufus.substring(0,1).toLowerCase()+nufus.substring(1,nufus.length()-1).toUpperCase()+nufus.substring(nufus.length()-1).toLowerCase();
        System.out.println("Cevap 2 = "+cevap2);

       //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
        int asciiFirst=nufus.charAt(0);//84
        int asciiSecond=nufus.charAt(nufus.length()-1);//114
        System.out.println("Ascii degerler toplami = "+(asciiFirst+asciiSecond));//198

        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle
        // diger harflerini kucuk harflerle console a yazdirin
        String cityName = "Londra";
        String cityName2 = cityName.substring(0,1).toUpperCase()+cityName.substring(1,cityName.length()).toLowerCase();
        System.out.println("Cevap 4 cityName = " + cityName2);

        //5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        //        a)En az 6 character olsun
        //        b)En az bir tane buyuk harf olsun
        //        c)En az bir tane kucuk harf olsun
        //        d)En az bir tane rakam olsun

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kurallara gore bir sifre giriniz : ");
        String sifre=input.nextLine();
        boolean s1 =sifre.length()>5;
        System.out.println(s1);
        boolean s2=sifre.replaceAll("[^A-Z]","").length()>0;
        System.out.println(s2);
        boolean s3 = sifre.replaceAll("[^a-z]","").length()>0;
        System.out.println(s3);
        boolean s4= sifre.replaceAll("[^0-9]","").length()>0;
        System.out.println(s4);

        // Java  ==> AV
        String str = "mustafa";
        int sonIndex = str.length()-1;
        System.out.println(sonIndex);
        String sonuc = str.substring(1,sonIndex).toUpperCase();
        System.out.println(sonuc);

        int sonIdx=nufus.length()-1;
        String snc =nufus.substring(0,1).toLowerCase()+nufus.substring(1,sonIdx).toUpperCase()+nufus.substring(nufus.length()-1).toLowerCase();
        System.out.println(snc);
        System.out.println("alicam");

        System.out.println("Ali");
        System.out.println("Can");









    }//Main
}//Class
