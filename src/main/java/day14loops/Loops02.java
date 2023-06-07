package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ornek 1: 5 ten 8 e kadar tam sayilarin toplamini veren kodu yaziniz
        // 5+6+7+8 ==>26
        int sum=0;  //belli islemler icin bazen sepet olustururuz ve isleme gore icine deger atariz
                    //sorudaki toplami(sonucu) koyacagimiz icin bu sepete genelde"sum" ismi verilir.
                    //Ve etksiz eleman old icin deger olarak 0 atadik. icinde 3 olsa sonuc 29 olurdu

        for( int i=5 ; i<9 ; i++){
            sum=sum+i;
            //  System.out.println("loop ici =>"+sum);
        }
        System.out.println(sum);

        //Ornek 2: 7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        //7*8*9
        int multiply=1;

        for(int i=7 ; i<10; i++){
            multiply=multiply*i;
        }
        System.out.println(multiply);

        //Ornek 3: Verilen bir tam sayinin rakamlarinin toplamini veren kodu yaziniz
        // 578 ==> 5+7+8 = 20

        int toplam=0;
        int num= -578; //i<0 oldugu icin Match.abs yapariz
        num=Math.abs(num);

        for (int i=num ; i>0 ; i=i/10){

            toplam=toplam+i%10;

        }
        System.out.println(toplam);

    }//Main
}//Class
