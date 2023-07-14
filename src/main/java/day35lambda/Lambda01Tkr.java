package day35lambda;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01Tkr {
    public static void main(String[] args) {
        List<String> myNames = new ArrayList<>(Arrays.asList("Ece","Can","Omer","Deniz","Meltem","Ali"));

        printElementsExceptStartsWithE(myNames);
        System.out.println();
        printDistinctElementsLengthLessThanFive(myNames);
        System.out.println();
        List<String> newList=getElementsLengthMoreThanFiveWithUpperCaseInList(myNames);
        System.out.println(newList);//[MELTEM]
        System.out.println();
        printElementsLengthLessThanFiveDistinctToLowerCaseInNaturalOrder(myNames);
        System.out.println();
        printElementsLengthLessThanFiveDistinctToLowerCaseInNaturalOrder2(myNames);
        printElementsUniqueSortedToUpperCase(myNames);
        printElementsUniqueSortedToUpperCase2(myNames);
        System.out.println();
        printElementsUniqueToLowerCaseSortWithLength(myNames);
        printElementsUniqueToLowerCaseSortWithLength2(myNames);




    }//main
    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.
    public static void printElementsExceptStartsWithE(List<String> myNames){
        myNames.
                stream().
                filter(t->!t.startsWith("E")).
                forEach(t-> System.out.print(t+" "));//Can Omer Deniz Meltem Ali
    }
    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.
    public static void printDistinctElementsLengthLessThanFive(List<String> myNames){
        myNames.
                stream().
                distinct().
                filter(t->t.length()<5).
                forEach(t-> System.out.print(t+" "));//Ece Can Omer Ali
    }
    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method'u olusturunuz.
    //1.way
    public static List<String> getElementsLengthMoreThanFiveWithUpperCaseInList(List<String> myNames){
      return myNames.
              stream().//burdan
              filter(t->t.length()>5).
              map(t->t.toUpperCase()).//buraya kadar stream
              collect(Collectors.toList());//artik list //[MELTEM]
    }
    //2.way==> method reference tavsiye edilir
    public static List<String> getElementsLengthMoreThanFiveWithUpperCaseInList2(List<String> myNames){
        return myNames.
                stream().//burdan
                filter(t->t.length()>5).
                map(String::toUpperCase).//buraya kadar stream
                collect(Collectors.toList());//artik list //[MELTEM]
    }

    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak
    // kucuk harflerle natural order da console'a yazdiran method'u olusturunuz.
    //1.way
    public static void printElementsLengthLessThanFiveDistinctToLowerCaseInNaturalOrder(List<String> myNames){
        myNames.
                stream().
                distinct().
                filter(t->t.length()<5).
                map(t->t.toLowerCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));//ali can ece omer
    }
    //2.way
    public static void printElementsLengthLessThanFiveDistinctToLowerCaseInNaturalOrder2(List<String> myNames) {
        myNames.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                map(String::toLowerCase).
                sorted().
                forEach(UtilsTkr::printInTheSameLineWithSpace);//ali can ece omer
    }

    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    //1.way
    public static void printElementsUniqueSortedToUpperCase(List<String> myNames){
        myNames.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));//ALİ CAN DENİZ ECE MELTEM OMER
    }
    //2.way
    public static void printElementsUniqueSortedToUpperCase2(List<String> myNames){
        myNames.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(UtilsTkr::printInTheSameLineWithSpace);//ALİ CAN DENİZ ECE MELTEM OMER
    }
    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore
    // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    //1.way
    public static void printElementsUniqueToLowerCaseSortWithLength(List<String> myNames){
        myNames.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));//Ece Can Ali Omer Deniz Meltem
    }
    //2.way ==> Tam bir best practice, cunku hic kod yazmadik. hep hazir method kullandik
    public static void printElementsUniqueToLowerCaseSortWithLength2(List<String> myNames){
        myNames.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(UtilsTkr::printInTheSameLineWithSpace);//Ece Can Ali Omer Deniz Meltem
    }






    }//class
//  *collect(Collectors.toList()); methodu stream deki elemanlari tekrar list icine koyar ve bize verir. collect>toplamak
//  *sorted(Comparator.comparing(t->t.length()))
//          >>>sirala ama siralarken,karsilatiriciyi kullanarak sana verdigim  gore ozel yontemi kullanarak yap
//   Comparator=>hazir bir interface.icinde karsilastimak icin ozel methodlar var.comparator>karsilastirici comparing>karsilastirirken
//  *ClassName:: methodName==> method reference tir. Lambda Expressions a gore BestPractice budur