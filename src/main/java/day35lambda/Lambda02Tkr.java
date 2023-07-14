package day35lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02Tkr {
    public static void main(String[] args) {

        List<String> myNames = new ArrayList<>(Arrays.asList("Ece","Can","Omer","Deniz","Meltem","Ali"));

        //removeIfLengthGreaterThanFive(myNames);silme yaptik,list degisti cunku list ler mutable, baska methodlarla calicagimiz icin // aldik
        removeIfElementsStartsWithMorEndsWithz(myNames);
        removeIfElementsStartsWithMorEndsWithz2(myNames);


        int sum=getSumFromSevenToSeventy();
        System.out.println(sum);//2464
        int product=getMultiplicationFromThreeToNine();
        System.out.println(product);//181440
        int product2=getMultiplicationFromThreeToNine2();
        System.out.println(product2);//181440
        System.out.println(getFactorial(4));//24


    }//main
    //7) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    public static void removeIfLengthGreaterThanFive(List<String> myNames){
        myNames.removeIf(t->t.length()>5);
        System.out.println(myNames);//[Ece, Can, Omer, Deniz, Ali] bana list dondurdu
    }
    //8) 'M' ile başlayan yada 'z' ile biten elemanları silen bir method oluşturun.
    //1.way
    public static void removeIfElementsStartsWithMorEndsWithz(List<String> myNames){
        myNames.removeIf(t->t.charAt(0)=='M' || t.charAt(t.length()-1)=='z');
        System.out.println(myNames);//[Ece, Can, Omer, Ali]
    }
    //2.way
    public static void removeIfElementsStartsWithMorEndsWithz2(List<String> myNames){
        myNames.removeIf(t->t.startsWith("M") || t.endsWith("z"));
        System.out.println(myNames);//[Ece, Can, Omer, Ali]
    }
    //9) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    //IntStream; integer degerleri stream icinde yukaridan asagiya bir akis seklinde stream formatinda bize veren bir inretface
    //range(); Intstream den gelen degerlerin nerde baslayip nerde bittigini belirtmek icin kullanilen method
    //range(); baslangic dahil bitis haric // rangeClosed(); baslangic da dahil bitis de dahil
    public static int getSumFromSevenToSeventy(){
        return IntStream.//integer degerleri stream icinde bana ver(-2milyardan +2miyara tum int ler)
                rangeClosed(7,70).//ama 7den basla 70 de dahil olacak sekilde sinirla
                reduce(Math::addExact).//gelen sayilarin hepsini Math classindaki toplama methoduyla topla
                getAsInt();//Optional.Integer i normal int e cevirmek icin simdi de getAsInt() kullan
    }
    //10)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //1.way
    public static int getMultiplicationFromThreeToNine(){
        return IntStream.
                rangeClosed(3,9).
                reduce(Math::multiplyExact).
                getAsInt();//181440 carpma sonucunda sayi cok buyuk cikacaksa LongStream secilir
    }
    //2.way
    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.
                range(3, 10).
                reduce(Math::multiplyExact).
                getAsInt();
    }
    //11)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.==> interview sorusudur
    public static int getFactorial(int a){//poz olmayan deger girme ihtimaline binaen if kurduk.rangeClosed da 2.sayi 1.den kucuk olamaz
        if (a == 0) {
            return 1;
        } else if (a < 0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;//return type method da int old icin;if body de her kosulda mutlaka bir deger return etmek gerek yoksa hata verir.o ned burada -1 return ettik
        } else {
            return IntStream.
                    rangeClosed(1, a).//a>=1 => bu method ta her zaman ikinci sayi birinci sayidan buyuk veya esit olmali, yoksa hata verir
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
        }










}//class
    //  * removeIf() methodu belli bir sarta gore eleman silmeye yarar.
    //      Listi stream e cevirmeden direkt List uzerinden kullanilir cunku stream lerle ilgili degil Collections lara ait bir method
//IntStream; integer degerleri stream icinde yukaridan asagiya bir akis seklinde stream formatinda bize veren bir inretface
//range(); Intstream den gelen degerlerin nerde baslayip nerde bittigini belirtmek icin kullanilen method
//range(); baslangic dahil bitis haric // rangeClosed(); baslangic da dahil bitis de dahil
//getAsInt(); Optional.Integer i normal int e cevirmek icin simdi de getAsInt() kullaniriz