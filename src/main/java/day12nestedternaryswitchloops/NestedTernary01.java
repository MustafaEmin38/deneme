package day12nestedternaryswitchloops;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
               1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil */
       /*int yil= 1988;
       String sonuc= yil%100==0? (yil%400==0 ? "Leap year": "Not leap") : (yil%4==0 ? "Leap year" : "Not leap ");
       System.out.println(sonuc);

         int year=2023;
       String result = year%100==0  ?  (year%400==0  ?  "Leap"  :  "Not Leap" )  : (year%4==0  ?  "Leap"   :  "Not Leap"  )  ;
        System.out.println(result);*/

        int sene=1966;
         String snc=sene%100==0? (sene%400==0?"Artik yildir":"Artik yil degildir" ): (sene%4==0? "Artik yildir":"Artil yil degildir");
        System.out.println(snc);



    }//Main
}//Class
