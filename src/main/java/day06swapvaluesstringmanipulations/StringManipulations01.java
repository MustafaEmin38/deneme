package day06swapvaluesstringmanipulations;

import java.lang.management.MemoryUsage;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type tır ve ayni zamanda bir class tır
        String s = "Java is easy";

        String k = "Mustafa Bal";
        //          012345678910

        //Ornek1 : "s" Stringindeki tum karakterleri buyuk harf yapiniz
        /*
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY
        */
        String sUpper = s.toUpperCase();
        System.out.println("sUpper = " + sUpper);

        //* Ornek 1:"k" Stringindeki tum karakterleri buyuk harf yapiniz
        String kUpper = k.toUpperCase();
        System.out.println(kUpper);//MUSTAFA BAL

        //Ornek 2: "s" Stringindeki tum karakterleri kucuk harf yapiniz
        /*
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy
        */
        String sLower=s.toLowerCase();
        System.out.println("sLower = " + sLower);

        //* Ornek 2: "k" Stringindeki tum karakterleri kucuk harf yapiniz
        String kLower = k.toLowerCase();
        System.out.println(kLower);//mustafa bal

        //Ornek 3: "s" Stringindeki ilk karakteri aliniz
        /*char firstChar = s.charAt(0);
        System.out.println(firstChar);//J
         */
        char firstS=s.charAt(0);
        System.out.println("firstS = " + firstS);


        //* Ornek 3: "k" Stringindeki ilk karakteri aliniz
       char firstK =k.charAt(0);
        System.out.println(firstK);//M

        //Ornek 4: "s" Stringindeki bastan ikinci ve sondan ikinci karakteri yazdiriniz
        /*
        char secondChar = s.charAt(1);
        System.out.println(secondChar);//a

        char tenthChar = s.charAt(10);
        System.out.println(tenthChar);//s

        System.out.println("" + secondChar+tenthChar);//as
        */
        char secondS=s.charAt(1);
        System.out.println("secondS = " + secondS);//a
        char tenthS=s.charAt(10);
        System.out.println("tenthS = " + tenthS);//s
        System.out.println(""+secondS+tenthS);//as

        //* Ornek 4: "k" Stringindeki bastan ikinci ve sondan ikinci karakteri yazdiriniz
        char secondK = k.charAt(1);
        System.out.println(secondK);//u
        char secondLastK = k.charAt(9);
        System.out.println(secondLastK);//a
        System.out.println(""+secondK+secondLastK);//ua==> basına "" String (hiclik stringi) koyunca concatination yaptı.

        //Ornek 5: "s" stringinde bulunan karakter sayisini bulunuz
        /*
        int sLength = s.length();
        System.out.println(sLength);//12
        */
        int sLength=s.length();
        System.out.println("sLength = " + sLength);

        //* Ornek 5: "k" stringinde bulunan karakter sayisini bulunuz
        int lengthK = k.length();
        System.out.println(lengthK);//11

        //Ornek 6: "s" stringindeki ilk 4 karakteri aliniz
        // s.substring(0,4); ==> bu kullanimda ilk index dahildir, ikinici index harictir
        /*
        String sub1 = s.substring(0,4);
        System.out.println(sub1);//Java
        */
        String ilk4=s.substring(0,4);
        System.out.println("ilk4 = " + ilk4);

        //* Ornek 6: "k" stringindeki ilk 4 karakteri aliniz
        String subIlkDort = k.substring(0,4);
        System.out.println(subIlkDort);//Must

        //Ornek 7: "s" stringindeki "is" kelimesini yaziniz
        /*
        String sub2 = s.substring(5,7);
        System.out.println(sub2);//is
        */
        String isKelimesi=s.substring(5,7);
        System.out.println("isKelimesi = " + isKelimesi);

        //* Ornek 7: "k" stringindeki "Mustafa" kelimesini yaziniz
        String subMustafa = k.substring(0,7);
        System.out.println(subMustafa);//Mustafa

        // Ornek 8: "s" stringindeki "easy" kelimesini yaziniz
        /*
        String sub3 = s.substring(8,12);
        System.out.println(sub3);//easy
        */
        String easyKelimesi=s.substring(8,12);
        System.out.println("easyKelimesi = " + easyKelimesi);

        //* Ornek 8: "k" stringindeki "Bal" kelimesini yaziniz
        String subBal = k.substring(8,11);
        System.out.println(subBal);//Bal

        //Ornek 8_2.yol:
        /*
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy
        */
        String easyKelimesi2=s.substring(8);
        System.out.println("easyKelimesi2 = " + easyKelimesi2);

        //* Ornek 8_2.yol:
        String subBal2 = k.substring(8);
        System.out.println(subBal2);//Bal

        //Ornek 9:  "s" stringinde "money" kelimesinin var olup olmadıgını kontrol ediniz
        /*
        boolean isExist =s.contains("money");
        System.out.println(isExist);//false
        */
        boolean moneyVarMi=s.contains("money");
        System.out.println("moneyVarMi = " + moneyVarMi);

        //* Ornek 9:  "k" stringinde "dal" kelimesinin var olup olmadıgını kontrol ediniz
        boolean isExistDal = k.contains("dal");
        System.out.println(isExistDal);//false

        //Ornek 10: "s" stringinin nin belli bir harfle ya da harflerle baslayip baslamadigini kontrol ediniz
        /*
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true
        */
        boolean javaStart=s.startsWith("Java");
        System.out.println("javaStart = " + javaStart);
        //* Ornek 10: "k" stringinin nin belli bir harfle ya da harflerle baslayip baslamadigini kontrol ediniz
        boolean isStart1 = k.startsWith("Mus");
        System.out.println(isStart1);//true

        //Ornek 11:"s" stringin in 5.index dahil olmak kaydiyle bu index ten itibaren "i" karakteri
        //ile baslayip baslamadigini kontrol ediniz
        /*
        boolean isStart2 =s.startsWith("i", 5);
        System.out.println(isStart2);//true
        */
        boolean i5Start=s.startsWith("i",5);
        System.out.println("i5Start = " + i5Start);

        //* Ornek 11:"k" stringin in 5.index dahil olmak kaydiyle bu index ten itibaren "i" karakteri
        //ile baslayip baslamadigini kontrol ediniz
        boolean isStart3 = k.startsWith("f",5);
        System.out.println(isStart3);

        //Bir String variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri konsolda buyuk harfle yazdiriniz,
                String w= "Günes topla benim icin";
        String s1=w.substring(0,1).toLowerCase()+w.substring(1,w.length()-1).toUpperCase()+w.substring(w.length()-1).toLowerCase();
        System.out.println("s1 = " + s1);

        String esc="Her sey cok guzel olacak";
        String esc1= esc.substring(0,1).toLowerCase()+esc.substring(1,esc.length()-1).toUpperCase()+esc.substring(esc.length()-1).toLowerCase();
        System.out.println(esc1);


    }//Main
}//Class
