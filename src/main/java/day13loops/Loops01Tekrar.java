package day13loops;

public class Loops01Tekrar {
    public static void main(String[] args) {
    // for loop
    // for ( basl degeri ; calisma sarti  ;  inc/dec) {
    //       calisacak kodlar    }
    // Ornek 1: Ekrana 5 kere "Hi" yazdirin.

        for ( int i=1; i<6; i++){
            System.out.println("Hi");
        }

        //Ornek 2: 11 den 14 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=11;i<15;i++){
            System.out.print(i+"/");
        }
        System.out.println("");
        //Ornek 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz
        for (int i = 40; i >22 ; i--) {
            if (i%2==0){
                System.out.print(i+"*");
            }
        }
        System.out.println("");

        //Ornek 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz
        for (int i = 18; i < 57; i++) {
            if (i%2!=0){
                System.out.print(i+"-");
            }
        }
        System.out.println("");


    }//main
}//class

