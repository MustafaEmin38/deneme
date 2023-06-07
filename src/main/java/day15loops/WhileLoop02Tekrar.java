package day15loops;

import java.util.Scanner;

public class WhileLoop02Tekrar {
    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console a yazdiran kodu yaziniz
        /*      3==> 3x1=3
                     3x2=6
                     3x3=9
                     3x4=12...
                     3x10=30
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Carpim tablosu olusturmak icin bir sayi giriniz");
        int sayi=scan.nextInt();

        int k=1;
        while (k<11){
            System.out.println(sayi+"x"+k+"="+(sayi*k));

            k++;
        }

        //Example 2: Verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz.
        // Java ===>J*a*v*a*

        System.out.println("Bır kelime yaz ben hallederim");
        String word=scan.next();//Buisolacak!!!
        String newWord="";

        int w=0;
        while (w<word.length()){
            newWord =newWord+word.charAt(w)+"*";

            w++;
        }
        System.out.println(newWord);

        //Example 3:Meshur int sorusu: Bir string deki tekrarsiz karakterleri console a yazdiriniz

        String intr="interview";
        String tekrarsiz="";

        int i=0;
        while (i<intr.length()){
            char krt=intr.charAt(i);

            if(intr.indexOf(krt)==intr.lastIndexOf(krt)){
                tekrarsiz=tekrarsiz+krt;
            }
            i++;
        }
        System.out.println(tekrarsiz);


    }//Main
}//Class
