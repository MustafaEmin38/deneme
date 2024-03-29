package day35lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        //removeIfLengthGreaterThanFive(myList);burda silme yaptik ve list degisti baska methodlarla calicagimiz icin // aldik
        //removeIfElementsStartsWithZOrEndsWithf(myList);
        removeIfElementsStartsWithZOrEndsWithf2(myList);
        System.out.println(getSumFromSevenToSeventy());//2464
        System.out.println(getMultiplicationFromThreeToNine());
        int multiplication1=getMultiplicationFromThreeToNine();
        System.out.println(multiplication1);
        System.out.println(getMultiplicationFromThreeToNine2());
        System.out.println(getFactorial(0));


    }//main

    //7) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    public static void removeIfLengthGreaterThanFive(List<String> myList){
        myList.removeIf(t->t.length()>5);//kosula bagli bir silme yapacaksak stream e cevirmeden java direkt list uzerinden yapar==>removeIf
        System.out.println(myList);//[Ali, Elif, Yusuf, Elif]>> hala list old icin koseli parantez,stream e cevirmedik
    }

    //8  ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.
    //1.way
    public static void removeIfElementsStartsWithZOrEndsWithf(List<String> myList){
        myList.removeIf(t->t.charAt(0)=='Z' || t.charAt(t.length()-1)=='f');
        System.out.println(myList);
    }
    //2.way
    public static void removeIfElementsStartsWithZOrEndsWithf2(List<String> myList){
        myList.removeIf(t->t.startsWith("Z") || t.endsWith("f"));
        System.out.println(myList);//[Ali, Mustafa]
    }

    //9) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    //baslangic ve bitisi belli olan degerler icin java yani bir yapi olusturmus
    public static int getSumFromSevenToSeventy(){
        return IntStream.// java Integerlardan olusan bir stream-akıs olusturdu, list e gerek kalmadi ve problem degil
                rangeClosed(7,70).//ikiside dahil-aralik belirler
                reduce(Math::addExact).//method reference kullandik
                getAsInt(); //oncesinde identity kullanmadigimiz icin optinal integer verdi ondan kurtulmak icin get...

    }
    //10)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //1.way
    public static int getMultiplicationFromThreeToNine(){
        return IntStream.
                rangeClosed(3,9).
                reduce(Math::multiplyExact).
                getAsInt();//181440
    }
    //2.way
    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.
                range(3, 10).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //11)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){
        if(x==0){

            return 1;

        } else if (x<0) {

            System.out.println("Faktoriel islemi negatif sayilarla yapilamaz");
            return -1;

        }else {
            return IntStream.
                    rangeClosed(1,x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
     //x icin-5 girersek hata verrir,rangeClosed da 2.sayi 1.sayidan kucuk olamaz ya esit ya buyuk olur
        //rangeClosed()'da ikinci sayi birinci sayidan kucuk olamaz.
        //ikinci sayi, ya birinci sayiya esit olur ya da birinci sayidan buyuk olur
    }




}//class

    //removeIf() methodu, bir koleksiyondan belirli bir koşulu sağlayan öğeleri kaldırmak için kullanılan bir methoddur,streamden sonra kullanilmaz
//IntStream --> integer'lari yukaridan asagiya dizer. Ama hangi araligi istedigini vermemiz gerekiyor. kisacasi
//              integer'lardan bir stream olusturuyor