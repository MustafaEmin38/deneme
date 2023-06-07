package day15loops;

public class WhileLoop01Tekrar {
    public static void main(String[] args) {

        //for kalıbı
        // for( baslangc degeri ; çalışma şartı ;  artş azalış){
        // calışacak kodlar}

        //while kalıbı

        //baslangc degeri
        //while (çalışma şartı){
        //  çalışacak kodlar
        //  artş azalış
        // }

        //Ornek 1: 3 den 6 ya kadar tamsayilari console a yazdirin
        //1. yol : for loop
        for (int i = 3; i <7 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");

        //2. yol:
        int i=3;
        while (i<7){
            System.out.print(i+"*");
            i++;
        }
        System.out.println();

        // Ornek 2: 23 den 12 ye kadar cift tamsayilari console a yazdiriniz

        int k=23;
        while (k>11){
            if (k%2==0){
                System.out.print(k+"/");
            }
            k--;
        }
        System.out.println();

        // Ornek 3: 6 dan 19 a kadar tek tamsayilari console a yazdiriniz
        int p= 6;
        while (p<20){
            if (p%2!=0){
                System.out.print(p+"*");
            }
            p++;
        }
        System.out.println();

    }//Main

}//Class
