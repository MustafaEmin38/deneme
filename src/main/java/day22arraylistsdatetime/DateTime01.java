package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {//DateTime object i hemen hemen tum apk larda bulunur
    public static void main(String[] args) {
        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate=LocalDate.now();//ne zaman calisirsa o tarihi verir
        System.out.println(myCurrentDate);//2023-06-07  //currentDate=simdiki zaman demek>> naming convention

        //Tarihten istedigimiz bir bileseni nasil aliriz?
        int monthValue=myCurrentDate.getMonthValue();//6
        System.out.println(monthValue);

        int yearValue=myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue=myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//7

        //Month bir Enum dir. (simdilik enum bir depodur diyebiliriz)
        //Enum java da sabit degerleri (Ay isimleri, Gun isimleri, Ulkedeki sehir isimleri) depolamak icin kullanilir
        Month monthName=myCurrentDate.getMonth();
        System.out.println(monthName);//JUNE

        DayOfWeek dayName=myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY

        //ileriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(5).plusYears(5));//2028-11-12>method chain

        //gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(10).minusMonths(10).minusDays(10));//2012-07-28

        //Spesific bir tarih objesi nasil olusturulur?
        LocalDate date1=LocalDate.of(1980,8,10);
        LocalDate date2=LocalDate.of(1990,8,10);


        //Bir tarihin baska bir tarihten sonra olup olmadigini nasil kontrol ederiz?
        boolean r1=date1.isAfter(date2);//date1 sonra mi date2 den
        System.out.println(r1);//false

        //Bir tarihin baska bir tarihten once olup olmadigini nasil kontrol ederiz?
        boolean sonuc=date1.isBefore(date2);
        System.out.println(sonuc);//false

        //Bir tarihin baska bir tarihe esit olup olmadigini nasil kontrol ederiz?
        boolean sonuc2=date1.isEqual(date2);
        System.out.println(sonuc2);//false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in the given order");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();

        LocalDate givenDate=LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate+" invalid date");

        }else {
            System.out.println("Enter time for the ticket");

        }

    }//main
}//class
