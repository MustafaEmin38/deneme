package day22arraylistsdatetime;

import java.awt.event.MouseAdapter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01Tekrar {
    public static void main(String[] args) {

        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrent=LocalDate.now();
        System.out.println(myCurrent);//2023-06-11

        //Tarihten istedigimiz bir bileseni nasil aliriz?
        int monthValue=myCurrent.getMonthValue();
        System.out.println(monthValue);//6

        int yearValue=myCurrent.getYear();
        System.out.println(yearValue);//2023

        int dayValue=myCurrent.getDayOfMonth();
        System.out.println(dayValue);//11

        //Month bir Enum dir.
        //Enum java da sabit degerleri (Ay isimleri, Gun isimleri, Ulkedeki sehir isimleri) depolamak icin kullanilir
        Month monthName=myCurrent.getMonth();
        System.out.println(monthName);//JUNE

        DayOfWeek dayName=myCurrent.getDayOfWeek();//DayOfWeek de bir enum dir.
        System.out.println(dayName);//SUNDAY

        //ileriki tarihe nasil gidilir?
        LocalDate plusDay=myCurrent.plusDays(3);
        System.out.println(plusDay);//2023-06-14

        LocalDate plusMonth=myCurrent.plusMonths(3);
        System.out.println(plusMonth);// 2023-09-11

        LocalDate plusYear=myCurrent.plusYears(3);
        System.out.println(plusYear);// 2026-06-11

        LocalDate plusDate=myCurrent.plusYears(5).plusMonths(5).plusDays(5);
        System.out.println(plusDate);//2028-11-16

        //gecmis tarihe nasil gidilir?
        LocalDate minusDate=myCurrent.minusDays(10).minusMonths(10).minusYears(10);
        System.out.println(minusDate);//2012-08-01

        //Spesific bir tarih objesi nasil olusturulur?
        LocalDate married=LocalDate.of(2013,06,22);
        System.out.println(married);//2013-06-22

        //Bir tarihin baska bir tarihten sonra olup olmadigini nasil kontrol ederiz?
        LocalDate birth=LocalDate.of(2016,11,12);
        boolean result=married.isBefore(birth);
        System.out.println(result);//true

        //Bir tarihin baska bir tarihten once olup olmadigini nasil kontrol ederiz?
        System.out.println(married.isAfter(birth));//false

        //Bir tarihin baska bir tarihe esit olup olmadigini nasil kontrol ederiz?
        System.out.println(married.isEqual(birth));//false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yil,ay,gun sirasiyla bir tarih giriniz");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();

        LocalDate userDate=LocalDate.of(year,month,day);
        if (userDate.isBefore(LocalDate.now())){
            System.out.println(userDate+ " Gecersiz tarih girdiniz");
        }else {
            System.out.println("Zamani girebilirsiniz");
        }



    }//main
}//class
