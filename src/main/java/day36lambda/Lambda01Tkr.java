package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda01Tkr {
    public static void main(String[] args) {
        //bazi object ler olusturalim-> kendi olusturdugumuz obj uzerinde manipulasyon yapacaz
        Course courseTurkishDay = new Course("Summer","Turkish Day",97,128);
        Course courseTurkishNight = new Course("Winter","Turkish Night",98,155);
        Course courseEnglishDay = new Course("Spring","English Day",95,132);
        Course courseEnglishNight = new Course("Winter","English Night",93,144);

        List<Course> courseList = new ArrayList<>();//String/Integer bir classti/data type idi.Course da bir class old icin data type a onu yazdim

        courseList.add(courseTurkishDay);// course obj lerimden olusan bir list im var, bunlar artik bir course obj si
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);

        //1) Tum "avarageScore" larin 91 den buyuk olup olmadigini kontrol eden kodu yaziniz=> özl testerlar icin onemli-cok kullanacagiz
        boolean result1=
                courseList.
                stream().
                allMatch(t->t.getAvarageScore()>91);
        System.out.println(result1);//true

        //2) Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol ede kodu yaziniz=> özl testerlar
        boolean result2=
                courseList.
                stream().
                anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result2);//true

        //3) Kurs donemleri icinde "Fall" doneminin hic bulunmadigini kontrol eden kodu yaziniz.
        boolean result3=
                courseList.
                stream().
                noneMatch(t->t.getSeason().contains("Fall"));//+hic mi yok? -hic yok! => o zamn true
        System.out.println(result3);////true

        //4) Avarage score u en yuksek olan kursun ismini console a yazdiran kodu yaziniz
        String  name1=
                courseList.//list i eline al
                stream().//stream e cevir
                sorted(Comparator.comparing(Course::getAvarageScore).reversed()).//objleri averajlarina gore buyukten kucuge sirala
                findFirst().//ilkini yani en b averajlı obj al (return ettigi data Optional<Course>)
                get().//Optional<Course> u Course a (yukarida yazdigimiz sekil) cevir
                getCourseName();//bı obj deki Course name i al
        System.out.println(name1);//Turkish Night

        //5) Tum course object lerini avarage score gore kucukten buyuge diziniz ve ilk kisi haric liste halinde yazdiriniz
        List<Course> myList=
                courseList.
                stream().
                sorted(Comparator.comparing(Course::getAvarageScore)).
                skip(2).//siralanan obj lerin ilk ikisini atlar
                collect(Collectors.toList());//obj leri list icinde toplar
        System.out.println(myList);//[Course{season='Summer', courseName='Turkish Day', avarageScore=97, numberOfStudents=128},
                                  //  Course{season='Winter', courseName='Turkish Night', avarageScore=98, numberOfStudents=155}]

        //6) Tum course objectlerinin avarage score larina gore kucukten buyuge diziniz ve ilk ucunu liste halinde console a yazidiriniz
        List<Course> myList2=
                courseList.
                stream().
                sorted(Comparator.comparing(Course::getAvarageScore)).
                limit(3).//ilk ucunu almaya yarayan method
                collect(Collectors.toList());
        System.out.println(myList2);

        //7) Kursta bulunan ogrenci sayilarina gore buyukten kucuge sirali bir sekilde listin icinde veren kodu yaziniz
        List<Course> myList3=
                courseList.
                stream().
                sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).
                collect(Collectors.toList());
        System.out.println(myList3);

        //8 Kursta bulunan ingilizce bolumlerinin sayisini veren kodu yaziniz
        Long numEnglish=
                courseList.
                        stream().
                        filter(t -> t.getCourseName().contains("English")).
                        count();// streamde bulunan oge sayisini verir ama LONG dondurur
        System.out.println(numEnglish);//2

        //9 Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz
        List<Course> mylist4=
                courseList.
                        stream().
                        filter(t->t.getNumberOfStudents()<140).
                        collect(Collectors.toList());
        System.out.println(mylist4);

    }//main
}//class
/*
     *AllMatch : Verilen sarta gore stream icindeki tum elemanlarin bu sarta uymasi durumunda true verecektir(boolean verir)
                 bir tane bile sart saglamaz ise sonuc false olur
     *AnyMatch : Verilen sarta gore stream icindeki herhangi bir elemanin bu sarta uymasi durumunda true verecektir
                 bir tane bile sart saglasa ise sonuc true olur
     *NoneMatch : Verilen sarta gore stream icindeki hicbir elemanin sarti saglamamasi durumunda true verecektir
                 bir tane bile sart saglasa ise sonuc false olur. adi ustunde=>none match hicbir eslesme saglamamali
     *4.soru=>   sorted(Comparator.comparing(Course::getAvarageScore).reversed())
                 git> Course obj lerimin avarage score lara bak, karsilastir ve sirala, sonra ters cevir
     *skip(2);   kendinden once siralanan obj leri (burda ilk ikisi) atlar,siradakinden devam eder
     *limit(3);  kendinden once siralanan obj lerin ilk ucunu alir, devamini almaz(burda ilk 3 obj)
     *count();  kullanildigi yerdeki stream de kac oge varsa onun sayisini verir AMA Long dondurur.
     *
     *
     *
 */