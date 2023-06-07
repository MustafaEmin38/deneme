package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //Swap :Yer değiştirmek (interview de sorulur)
        //1.kap Patates 2.Kap Domates ==> 1.Kap Domates 2.kap Patates


        //1.YOL
        int a = 12;
        int b = 5; //Swap tan sonra ==> a=5, ve b=12;
        int temp = 0;
        /* hoca bunu derste çözmüştü, comment ledim ve aynisini asagida ben cozdüm
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        //1. adim
        temp =a;
        //2. adim
        a=b;
        //3.adim
        b = temp;
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        */

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        temp= a;
        a =b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //* 1.yol
        int x =12;
        int y =102;
        int bos= 0;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        /* hoca bunu derste çözmüştü, comment ledim ve aynisini asagida ben cozdüm
        bos =x;
        x=y;
        y=bos;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        */
        bos=x;
        x=y;
        y=bos;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //2.YOL (interview de daha cok bu sorulur, analitik düşünme sorulur)
        int elma=12;
        int armut=5;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma = elma + armut;  //  12+5=17
        armut = elma - armut; //  17-5=12
        elma = elma - armut;  //  17-12=5

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        //* 2.Yol:
        int k = 50;
        int m = 20;
        /* hoca bunu derste çözmüştü, comment ledim ve aynisini asagida ben cozdüm
        System.out.println("k = " + k);
        System.out.println("m = " + m);

        k = k+m;
        m = k-m;
        k = k-m;
        System.out.println("k = " + k);
        System.out.println("m = " + m);
         */

        System.out.println("k = " + k);
        System.out.println("m = " + m);

        k=k+m; //50+20=70
        m=k-m; //70-20=50
        k=k-m; //70-50=20
        System.out.println("k = " + k);
        System.out.println("m = " + m);
    }//main
}//class
