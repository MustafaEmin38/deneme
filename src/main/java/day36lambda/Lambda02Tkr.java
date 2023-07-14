package day36lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02Tkr {
    public static void main(String[] args) throws IOException {

        //Example 1: Verilen text file icindeki text i console a yazdiran kodu yaziniz
        Files.
                lines(Paths.get("src/main/java/day36lambda/LambdaTextFileTkr.txt")).//bu adrese gitti ve texti stream icinde satir satir verdi
                forEach(System.out::println);//stream icinde verdigi icin direkt forEach kullandik ve console bastik

        //Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.
        Files.
                lines(Paths.get("src/main/java/day36lambda/LambdaTextFileTkr.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //Example 3: Verilen text file icindeki text lerde "get" kelimesi olup olmadigini kontrol eden code u yaziniz
        boolean result1=
                Files.
                lines(Paths.get("src/main/java/day36lambda/LambdaTextFileTkr.txt")).
                anyMatch(t->t.contains("get"));//true icine parametre girdigimiz icin method reference yapamayiz, istersek Utils de method yapariz

        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words=Files.
                lines(Paths.get("src/main/java/day36lambda/LambdaTextFileTkr.txt")).//stream icinde satir satir text i verdi
                map(t->t.replaceAll("\\p{Punct}","").//tum nokt isaretleini sildi
                split(" ")).//kelime kelime kontorl icin bosluklardan boldu ve Array verdi
                flatMap(Arrays::stream).//Array icindeki kelimeri aldi ve kelimeleri stream icinde bize verdi
                distinct().//farkli kelimeleri aldi
                collect(Collectors.toList());//list icine koydu
        System.out.println(words);

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        Long numOfLetters=Files.
                lines(Paths.get("src/main/java/day36lambda/LambdaTextFileTkr.txt")).
                map(t->t.replaceAll("[^a-zA-Z]", "")).//harf sayisini bulmak icin harf disinda her seyi sildi
                map(t->t.split("")).//tek tek harf kalsin diye hiclikten boldu
                flatMap(Arrays::stream).
                count();
        System.out.println(numOfLetters);//1216

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
        //           icinde return eden kodu yaziniz.
        List<String> letters=Files.
                lines(Paths.get("src/main/java/day36lambda/LambdaTextFileTkr.txt")).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).//stream i alf olarak siraladi sonra comp classina gitti ve ters cevirdi
                collect(Collectors.toList());
        System.out.println(letters);






    }//main
}//class

// Files classi; icindeki methodlarla  file okumamizi saglayan bir classtir, static tir=>Files . yazinca methodlar cikar
// lines(); methodu satir satir file daki text i alir, streamin icinde bize verir.
//          kullanirken icine Path yazmamizi ister. Path bir class ve bize adres verir
//          lines icine Paths yazarim sonra get(); methoduyla icine text in adresini girerim
//forEach(System.out::println); texti yazdirmak icin lines tan sonra forEach kullanilr.
//          icine "System" (class), sonra "out" sonra da "::println" yazariz ve methodla console a basariz
//          en son lines uzerine tiklar ve addExc yapariz
//flatMap(Arrays::stream); flat duz demek, Array in duvarlarini dumduz etti:)) Array olan bir datayi stream e cevirir
// count();//lambda da kendinden sonra method kullanilmasina izin vermeyen bazi methodlar vardir=> Terminal Method denir. count bir term method
