package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static day34lambda.Lambda01.getMinValue;

public class Lambda01Tkr {//interview lerde lambda bildigini goster
    public static void main(String[] args) {
        /*
        1. Lambda "Functional Programming"tir, digeri "Structured Programming" idi.
        2. "Functional Programming" te "Ne yapilacak" (What to do) uzerine yogunlasilir
            -Function=> method demektir. Burda hazir methodlari alip kod yazariz, methodun arka planiyla ilgilenmeyiz
           "Structured Programming" te "Nasil yapilacak" (How to do) uzerine yogunlasilir
           -Structured=> yapisal demektir. Kullanacagimiz methodlarin arkasinda nasil bir yapi var biliriz,bazen kendimiz yazariz
           *Bu sayede sadece problemi cozmeye odaklaniriz,detaylara takilmayiz *Bize hiz kazandirir. *Hatasiz kod yazmamamizi saglar
        3. Functional Programming java 8 ile kullanilmaya  baslandi
        4. Functional Programming; Collectionlar(set, list,queue) ve Arraylerde kullanilir.Map lerle kullanilmaz ama map.entrySet le kullanilabilir
         */

        List<Integer> myNums= new ArrayList<>();

        myNums.add(34);
        myNums.add(17);
        myNums.add(29);
        myNums.add(13);
        myNums.add(58);
        myNums.add(63);
        myNums.add(5);
        myNums.add(13);


        printElements1(myNums);
        System.out.println();
        printElements2(myNums);
        System.out.println();
        printEvenElements1(myNums);
        System.out.println();
        printEvenElements2(myNums);
        System.out.println();
        printSqareOfOddElements1(myNums);
        System.out.println();
        printCubeOfDistinctOddElements(myNums);
        System.out.println();
        printSumOfSquaresDistinctEvenElements(myNums);
        System.out.println();
        printProductOfSquaresDistinctEvenElements(myNums);
        System.out.println();
        getMaxValue1(myNums);
        System.out.println();
        getMaxValue2(myNums);
        getMaxValue3(myNums);
        getMaxValue4(myNums);
        getMinValue1(myNums);
        getMinValue2(myNums);
        getMinValue3(myNums);
        getMinValue4(myNums);
        getMinValue(myNums);
        getMinGreaterThanSevenEven(myNums);







    }//main

    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Structured == Yapisal)
    public static void printElements1 (List<Integer> myNums){
        for (Integer w: myNums) {
            System.out.print(w+" ");//34 17 29 13 58 63 5 13
        }
    }
    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Functional)=> sadece methodlarin kullanildigi.yapisal kodun kullanilmadigi
    public static void printElements2(List<Integer> myNums){
        myNums.
                stream().//myNums artik List degil bir stream yani yuk asagi akis
                forEach(t-> System.out.print(t+" "));//34 17 29 13 58 63 5 13
    }               //"t->"=>lambda expression,"->"=>error sign(burda t eski w)

    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1(List<Integer> myNums){
        for (Integer w : myNums) {
            if(w%2==0){
                System.out.print(w+" ");//34 58
            }
        }
    }
    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Functional)
    public static void printEvenElements2(List<Integer> myNums) {
        myNums.
                stream().
                filter(t->t%2==0).//sadece cift elemanlari
                forEach(t-> System.out.print(t+" "));//34 58
    }
    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printSqareOfOddElements1(List<Integer> myNums){//SqareOfOddElements=>tek elemanlarin karesini
        myNums.
                stream().//list i streame cevir
                filter(t->t%2!=0).// filtrele, tek sayilari kullan
                map(t->t*t).//tek sayilarin her birinin karesini al
                forEach(t-> System.out.print(t+" "));// her birini console a yaz 289 841 169 3969 25 169
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfDistinctOddElements(List<Integer> myNums){//oddElement>tek elemanlarin, distinct>farklilar
        myNums.
                stream().
                distinct().//tekrarsiz olanlari sec demek.Artik ilk index son index birb esit mi demiyoruz=>functionaaaaal :))
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));//4913 24389 2197 250047 125
    }
    //7)Bir list'teki "tekrarsiz" "CIFT "
    // ELEMANLARIN "karelerinin" "toplamını" hesaplayan method oluşturun
    public static void printSumOfSquaresDistinctEvenElements(List<Integer> myNums){//Distinct>farklilar Even>cift
        Integer sumNums=
                myNums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(0,(t,u)->t+u);
        System.out.println("sumNums = " + sumNums);//sumNums = 4520
    }
    //8) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun
    public static void printProductOfSquaresDistinctEvenElements(List<Integer> myNums){//reduction
        Integer product =
                myNums.
                        stream().
                        distinct().
                        filter(t->t%2==0).
                        map(t->t*t).
                        reduce(1,(t,u)->t*u);
        System.out.println("product = " + product);//product = 3888784
    }
    //9) Verilen List'teki "maksimum degeri" bulmak icin bir method olusturun
    //1.way
    public static void getMaxValue1(List<Integer> myNums) {
        Integer enBuyuk =//34 17 29 13 58 63 5 13
                myNums.
                        stream().
                        distinct().
                        reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(enBuyuk);//63
    }
        //2.way
        public static void getMaxValue2 (List < Integer > myNums) {
        Integer enBuyuk=
                myNums.
                stream().
                distinct().
                reduce(myNums.get(0), (t, u) -> t > u ? t : u);
            System.out.println(enBuyuk);//63
        }
        //3.way
        public static void getMaxValue3 (List < Integer > myNums) {
            Integer enBuyuk=
                myNums.
                stream().
                distinct().
                sorted().//5 13 17 29 34 58 63
                reduce((t,u)->u).//identity yoksa t ilk degeri streamden alir, u da 2.degeri streamden alir
                get();//reduce() methodunu bu sekilde(identity olmadan) kullanirsak;bize Optional<Integer> verir
                      //ya sonuna get() koyar Integer dondurmesini saglariz yada data typei Optional<Integer> yapariz
            System.out.println(enBuyuk);//63
        }
        //4.way==> hepsinden en best practice ^_^
        public static void getMaxValue4 (List < Integer > myNums) {
            Integer enBuyuk =
                    myNums.//myNums i eline al
                    stream().//streame cevir
                    distinct().//tekrarsizlari al
                    reduce(Math::max).//coklu datayi teke indir ama Math e git max i kullan ve enB sec(:: method reference)
                    get();//Optional<Integer> i Integer ea cevir
            System.out.println(enBuyuk);//63
        }
    //10) Verilen List teki "minimum degeri" bulmak icin bir method olusturun
    //1.way
    public static void getMinValue1(List < Integer > myNums){
        Integer enKucuk=
                myNums.
                stream().
                distinct().
                reduce((t, u) -> t > u ? u : t).
                get();
        System.out.println(enKucuk);//5
    }
    //2.way
    public static void getMinValue2(List < Integer > myNums){
        Integer enKucuk=
                myNums.
                        stream().
                        distinct().
                        sorted(Comparator.reverseOrder()).//Comparator (interface tir).sadece karsilastirma yapmak icin methodlar icerir
                        reduce((t,u)->u).//t,u dan hep u yu sec                   //reverseOrder() tersten sirala> buyukten kucuge
                        get();
        System.out.println(enKucuk);//5
    }
    //3.yol
    public static void getMinValue3(List < Integer > myNums) {
        Integer enKucuk =
                myNums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t, u) -> t).
                        get();
        System.out.println(enKucuk);//5
    }
    //4.way
    public static void getMinValue4(List < Integer > myNums) {
        Integer enKucuk =
                myNums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t, u) -> Math.min(t,u)).
                        get();
        System.out.println(enKucuk);//5
    }

    //11)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGreaterThanSevenEven(List < Integer > myNums){
        Integer min=
                myNums.
                        stream().
                        filter(t->t>7 && t%2==0).
                        sorted().
                        reduce((t,u)->t).
                        get();
        System.out.println(min);//34
    }






}//class
//  *stream() methodu listteki elemanlari yukaridan asagi akis haline getirir. Hafizada yer tutmaz.Bir data type tir
//  *forEach() methodu streamdeki her elemani alir ve icine yazdigimiz methou her bir elemana uygular
//  *"t->"=>lambda expression,"->"=>error sign(burda t bizim eski w) t-> her bir t icin bunu yap =>...
//  *filter() methodu stream icerisinde belirli datalari cekmek icin kullanilir
//  *map() methodu stream de bulunan her bir elemanda degisiklik yapilacagi zaman kullanilir.
//  *distinct(); methodu tekrarsiz olanlari sec demek.stream den sonra kullanmak Java'yi yormamak icin best practice.
//  *reduce(); bir stream de birden fazla elemandan tek bir sonuc cikacaksa reduce kullaniriz,coku teke indirgeme(reduction)
//  *reduce(0,(t,u)->t+u);   0=identity etkisiz eleman yazilir,
//                           t baslangic degerini identity den alir, sonraki degerlerini action dan(islem sonucu) alir
//                           u>her degerini stream den alir
//                           t identity olmadiginda degerini streamden alir u da streamdeki diger degeri alir
//  *reduce() methodunu bu sekilde(identity olmadan) kullanirsak;bize Optional<Integer> verir
//            ya sonuna get() koyar Integer dondurmesini saglariz yada data typei Optional<Integer> yapariz
//  *Optional<Integer> bazi durumlarda koddan null return eder ama data type buna izn vermez. o zamn NullPointerException
//           hatasi aliriz. Java bu ihtimale karsi onlem olarak Optional<Integer> data type getirdi (java8). get() koyarsak
//           Optional<Integer> a gerek kalmadan Integer ile devam ederiz
// *Comparator.reverseOrder() methodu sorted yapilan verileri ters cevirir.
