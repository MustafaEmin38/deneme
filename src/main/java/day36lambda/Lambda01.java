package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer","Turkish Day",97,128);
        Course courseTurkishNight = new Course("Winter","Turkish Night",98,155);
        Course courseEnglishDay = new Course("Spring","English Day",95,132);
        Course courseEnglishNight = new Course("Winter","English Night",93,144);

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);

        //1) Tum "avarageScore" larin 91 den buyuk olup olmadigini kontrol eden kodu yaziniz=> özl testerlar
        boolean result1=courseList.stream().allMatch(t->t.getAvarageScore()>91);
        System.out.println(result1);//true

        //AllMatch : Verilen sarta gore stream icindeki tum elemanlarin bu sarta uymasi durumunda true verecektir
        // bir tane bile sart saglamaz ise sonuc false olur

        //2) Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol ede kodu yaziniz=> özl testerlar
        boolean result2=courseList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result2);//true
        //AnyMatch : Verilen sarta gore stream icindeki herhangi bir elemanin bu sarta uymasi durumunda true verecektir
        // bir tane bile sart saglasa ise sonuc true olur

        //3) Kurs donemleri icinde "Fall" doneminin hic bulunmadigini kontrol eden kodu yaziniz.
        boolean result3=courseList.stream().noneMatch(t->t.getSeason().contains("Fall"));
        System.out.println(result3);//true

        //NoneMatch : Verilen sarta gore stream icindeki hicbir elemanin sarti saglamamasi durumunda true verecektir
        // bir tane bile sart saglasa ise sonuc false olur. adi ustunde=>none match hicbir eslesme saglamamali

        //4) Avarage score u en yuksek olan kursun ismini console a yazdiran kodu yaziniz
         String name1=courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(name1);//Turkish Night

        //5) Tum course object lerini avarage score gore kucukten buyuge diziniz ve ilk kisi haric liste halinde yazdiriniz
        List<Course> myList= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).collect(Collectors.toList());
        System.out.println(myList);//[Course{season='Summer', courseName='Turkish Day', avarageScore=97, numberOfStudents=128}, Course{season='Winter', courseName='Turkish Night', avarageScore=98, numberOfStudents=155}]

        //6) Tum course objectlerinin avarage score larina gore kucukten buyuge diziniz ve ilk ucunu liste halinde console a yazidiriniz
        List<Course> myList2= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).limit(3).collect(Collectors.toList());
        System.out.println(myList2);//[Course{season='Winter', courseName='English Night', avarageScore=93, numberOfStudents=144}, Course{season='Spring', courseName='English Day', avarageScore=95, numberOfStudents=132}, Course{season='Summer', courseName='Turkish Day', avarageScore=97, numberOfStudents=128}]

        //7) Kursta bulunan ogrenci sayilarina gore buyukten kucuge sirali bier skilde listin icinde veren kodu yaziniz
        List<Course> myList3= courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).collect(Collectors.toList());
        System.out.println(myList3);

        //8 Kursta bulunan ingilizce bolumlerinin sayisini veren kodu yaziniz
        long ingilizceBolumSayisi= courseList.stream().filter(t->t.getCourseName().contains("English")).count();
        System.out.println(ingilizceBolumSayisi);

        //9 Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz
        List<Course> myList4= courseList.stream().filter(t->t.getNumberOfStudents()<140).collect(Collectors.toList());
        System.out.println(myList4);




    }//main
}//class
