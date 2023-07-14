package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String > myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementExceptStartsWithE(myList);
        System.out.println();
        printDistinctElLengthLessThanFive(myList);
        System.out.println();
        List<String> newList=getElementLengthMoreThanFiveWithUpperCase(myList);
        System.out.println(newList);
        printElementLengthLessThanFiveUniqueWithLowerCase(myList);
        System.out.println();
        printElementsUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElementsUniqueLowerCaseSortWithLength(myList);
        System.out.println();

    }//main
    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.

    public static void printElementExceptStartsWithE(List<String > myList){
        myList.
                stream().
                filter(t->!t.startsWith("E")).//String te kullandigim methodlari rahatlikla kullanabilirim
                forEach(t-> System.out.print(t+" "));//Ali Yusuf Zeynep Mustafa
    }

    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.
    public static void printDistinctElLengthLessThanFive(List<String > myList){
        myList.
                stream().
                distinct().// tekrarsiz
                filter(t->t.length()<5). //character sayisi 5 den az
                forEach(t-> System.out.print(t+" "));//Ali Elif
    }

    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method'u olusturunuz.
    public static List<String> getElementLengthMoreThanFiveWithUpperCase(List<String> myList){
       return myList.stream().
                filter(t->t.length()>5).
                map(t->t.toUpperCase()).
                collect(Collectors.toList());//[ZEYNEP, MUSTAFA]
    }

    //tavsiye edilir
    public static List<String> getElementLengthMoreThanFiveWithUpperCase2(List<String> myList){
        return myList.stream().
                filter(t->t.length()>5).
                map(String::toUpperCase).
                collect(Collectors.toList());//[ZEYNEP, MUSTAFA]
    }

    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak
    // kucuk harflerle natural order da console'a yazdiran method'u olusturunuz.
    public static void printElementLengthLessThanFiveUniqueWithLowerCase(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                map(t->t.toLowerCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));//ali elif
    }
    public static void printElementLengthLessThanFiveUniqueWithLowerCase2(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                map(String::toLowerCase).//map methodunu ama String classa git hazir methodu al
                sorted().
                forEach(Utils::printInTheSameLineWithSpace);//kendi utils imden kendi methodumu alip kullandim,BEST PRACTİCE
    }
    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    public static void printElementsUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));//ALİ ELİF MUSTAFA YUSUF ZEYNEP
    }

    public static void printElementsUniqueToUpperCaseSorted2(List<String> myList){
        myList.
                stream().
                distinct().
                map(String::toUpperCase).//Lambda expression best practice degil bunu kullan
                sorted().
                forEach(Utils::printInTheSameLineWithSpace);//sout u kendi utils imden yaptim
    }
    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore
    // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void printElementsUniqueLowerCaseSortWithLength(List<String> myList){
        myList.stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).//sirala ama kurala gore>kural; uzunluklarina gore
                forEach(t-> System.out.print(t+" "));//ali elif yusuf zeynep mustafa
    }
    //method reference kullanma tavsiye edilir>> Class Name :: method=>method reference bu sekilde kullanilir

    public static void printElementsUniqueLowerCaseSortWithLength2(List<String> myList){
        myList.stream().
                distinct().
                map(String::toLowerCase).// Class Name :: method=>method reference
                sorted(Comparator.comparing(String::length)).//sirala ama kurala gore>kural; uzunluklarina gore
                forEach(Utils::printInTheSameLineWithSpace);//ali elif yusuf zeynep mustafa
    }
}//class





// collect(Collectors.toList())  methodu bir streamdeki elemanlari list icerisine koyup verir.
/*
    collect() metodu, Collectors sınıfının birçok farklı metoduyla birlikte kullanılır.
    Bu metotlar, çeşitli toplama işlemleri gerçekleştirmek için kullanılabilir. Örneğin:
    Collectors.toList(): Akıştaki öğeleri bir List koleksiyonuna toplar.
    Collectors.toSet(): Akıştaki öğeleri bir Set koleksiyonuna toplar.
    Collectors.toMap(): Akıştaki öğeleri bir Map koleksiyonuna toplar. Bu metot, anahtar-değer çiftleri üzerinde işlemler yapmanızı sağlar.
    Collectors.joining(): Akıştaki öğeleri birleştirerek tek bir dize oluşturur.
    Collectors.groupingBy(): Akıştaki öğeleri belirli bir ölçüte göre gruplar.
 */
//siralamanin kuralini siz belirliyorsaniz sorted parantezi icerisine "Comparator.comparing" kullanilir