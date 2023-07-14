package day35lambda;

import java.util.stream.IntStream;

public class Lambda03Tkr {
    public static void main(String[] args) {
        int sonuc=getSumOfEvensBetweenTwoInt(13,7);
        System.out.println(sonuc);//30
        int sonuc2=getSumOfEvensBetweenTwoInt2(15,8);
        System.out.println(sonuc2);//36

    }//main

    //12) Size verilen iki tamsayi arasindaki tum cift sayilarin
    // toplamini veren methodu olusturunuz.
    //1.way
    public static int getSumOfEvensBetweenTwoInt(int a, int b){
        //range(a,b); de b>a olursa sorun yok ama a>b olursa hata verir o ned kod tamiri yaptik=> if(a>b) ise swap value
        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.
                range(a+1,b).
                filter(t->t%2==0).
                reduce(Math::addExact).
                getAsInt();
    }
    //2.way
    public static int getSumOfEvensBetweenTwoInt2(int a, int b){
            if (a>b){
                int temp=a;
                a=b;
                b=temp;
            }
            return IntStream.//IntStream de hazir methodlar vardir. sum(); onlardan biri, bize toplam verir
                    range(a+1,b).
                    filter(UtilsTkr::isNumberEven).//method reference ile Utils class tan cift sayi kontrolu yaptik
                    sum();//bize int dondurur bu ned get() kullanmaya gerek kalmaz
        }

}//class
