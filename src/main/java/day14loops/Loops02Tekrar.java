package day14loops;

public class Loops02Tekrar {
    public static void main(String[] args) {
        //Ornek 1: 5 ten 8 e kadar tam sayilarin toplamini veren kodu yaziniz
        // 5+6+7+8 ==>26
        int sum=0;
        for (int i = 5; i<9 ; i++) {
            sum=sum+i;
        }
        System.out.println("toplam = "+sum);

        //Ornek 2: 7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        //7*8*9
        int multiply=1;
        for (int i = 7; i < 10 ; i++) {
            multiply=multiply*i;
        }
        System.out.println("carpim = "+multiply);

        //Ornek 3: Verilen bir tam sayinin rakamlarinin toplamini veren kodu yaziniz
        // 578 ==> 5+7+8 = 20
        int sayi=-343;
        sayi=Math.abs(sayi);
        int total=0;

        for (int i = sayi; i>0 ; i=i/10) {
            total=total+i%10;
        }
        System.out.println("Rakamlar toplami = "+total);


    }//Main
}//Class
