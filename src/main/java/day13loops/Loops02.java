package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ornek 1: 21 den 180 kadar hem 2 hem 3 ile tam bolunebilen tam sayilari ekrana yazdiran kodu yaziniz.
        for (int i=21  ; i<181 ; i++){
            if (i%2==0 && i%3==0){
                System.out.print(i+" ");
            }}
        System.out.println("");// console duzgun olsn diye bunu koydum,soruyla ilgisi yok

        //* Ornek 1: 21 den 180 kadar hem 2 hem 3 ile tam bolunebilen tam sayilari ekrana yazdiran kodu yaziniz.
        for ( int i=21  ; i<181  ; i++  ) {
            if ( i%2==0 && i%3==0 ) {
                System.out.print(i+"/");
            }
        }
       System.out.println("");// console duzgun olsn diye bunu koydum,soruyla ilgisi yok

        //Ornek 2: Size verilen, kucuk harfle yazilmis stringin; index i cift sayi olan karakterlerini buyuk harfe donusturunuz
        // ankara ==> A-K-R
        // 012345

        /*String s= "ankara";
                   // i <= s.length()-1 de olur ama uzun olur, alttaki tavsiye edilir
        for(int i=0 ; i< s.length() ; i++){
           String ch= s.substring(i,i+1);
           if(i%2==0){
            System.out.println(ch.toUpperCase());
           }
        }*/


        //* Ornek 2: Size verilen, kucuk harfle yazilmis stringin; index i cift sayi olan karakterlerini buyuk harfe donusturunuz
        // ankara ==> A-K-R
        // 012345
        String k="ankara";
        for(int i=0 ; i<k.length() ; i++){

            String krkt=k.substring(i,i+1);
           if (i%2==0){
               System.out.println(krkt.toUpperCase());
           }
        }
        System.out.println("");// console duzgun olsn diye bunu koydum,soruyla ilgisi yok

        //* Ornek 2 plus: Size verilen,buyuk harfle yazilmis stringin; index i tek sayi olan karakterlerini kucuk harfe donusturunuz
        String plus="REYYAN"; //tek karakterler ==> 1.E>e 3.Y>y 5.N>n

        for ( int i=0 ; i<plus.length() ; i++){
            String tekTekSec=plus.substring(i,i+1);
            if (i%2==1){
                System.out.println(tekTekSec.toLowerCase());
            }
        }
        System.out.println("");// console duzgun olsn diye bunu koydum,soruyla ilgisi yok

        /*
        //Ornek 3: Verilen bir String de ilk a harfinden onceki tum characterleri console a yazdiriniz
        // "I love Java"  ==>  "I love J"
        String s1 = "Tramway";

        for(int i=0;i<s1.length() ;  i++ ){

            char ch =s1.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }*/

        //* Ornek 3: Verilen bir String de ilk a harfinden onceki tum characterleri console a yazdiriniz
        // "I love Java"  ==>  "I love J"
        String k1 = "Tramway";
        /*for (int i=0 ; i<k1.length() ; i++){

            if(k1.charAt(i)=='a'){    ==> k1.charAt(i) kodunu iki kere yazdik daha clean olsn diye asagida duzenleyelim
                break;}
                System.out.println(k1.charAt(i));
        }*/
        for(int i=0 ; i<k1.length() ; i++){
            char ch=k1.charAt(i);
            if(ch=='a'){  //burda break; kodu kirar ve bizi loop disina cikarir.buraya kadar yazilanlar konsola basilir
                break;
            }
            System.out.print(ch);
        }
        System.out.println("");// console duzgun olsn diye bunu koydum,soruyla ilgisi yok

        /*
        //Ornek 4: Verilen  bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz..
        //      "Germany" ==> yn

        String t = "Germany";

        for( int i =t.length()-1; i>=0  ;i-- ){

            if(t.charAt(i)=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }*/
        //* Ornek 4: Verilen  bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz..
        //      "Germany" ==> yn
        String t = "Germany";
        for (int i=t.length()-1 ; i>=0 ; i--){
            if(t.charAt(i)=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }
        System.out.println();

        //* Ornek 4plus: Verilen  bir string de son 'U' dan sonraki tum characterleri ters sirada yazdiriniz.
        String w= "United States";
        for (int i=w.length()-1; i>=0 ; i--){
            if (w.charAt(i)=='U'){
                break;
            }
            System.out.print(w.charAt(i));
        }

    }//Main
}//Class
