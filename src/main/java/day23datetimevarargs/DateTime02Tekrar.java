package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02Tekrar {
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?
        LocalTime nowTime=LocalTime.now();
        System.out.println(nowTime);//22:43:02.812616200

        //Anlik zamanda bilesenler nasil alinir?
        int hour=nowTime.getHour();
        System.out.println(hour);//23

        System.out.println(nowTime.getMinute());//11
        System.out.println(nowTime.getSecond());//5
        System.out.println(nowTime.getNano());//62802740

        //Gelecek ve gecmise nasil gidilir?
        LocalTime plusHour=nowTime.plusHours(2);
        System.out.println(plusHour);//01:14:56.613175300

        LocalTime nextTime=nowTime.plusHours(12).plusMinutes(12).plusSeconds(12);
        System.out.println(nextTime);//11:29:04.026365400


        //Zaman formati nasil degistirilir?
        /*
        DateTime class ta kullanilan tarih saat formatlari
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemi
        hh : mm a==> 12 li saat sistemi AM, PM gosterilir
        HH : mm : ss ==> 24 lu saat sistemi
        HH : MM ==> yanlis format, MM aylar icin kullanilir
        "mm" minute demektir. "MM" month demektir

        dd-MM-yyyy ==> gun ay yil (int verir)
        MMM ==> Aug (String-ilk 3 harf verir)
        MMMM ==> August (String-tamamini verir)
         */

        DateTimeFormatter kalip1=DateTimeFormatter.ofPattern("HH:mm");
        String nowTimeKalip1=kalip1.format(nowTime);
        System.out.println(nowTimeKalip1);//23:35

        //Date formati nasil degistirilir?
        //Kendim uydurdum
//        DateTimeFormatter kalip2=DateTimeFormatter.ofPattern("dd*MMMM*yyyy");
//        String nowDateKalip2=kalip2.format(LocalDate.now());
//        System.out.println(nowDateKalip2);//11*Haziran*2023

        //Date formati nasil degistirilir?
        LocalDate myDate=LocalDate.of(2025,5,15);
        System.out.println(myDate);//2025-05-15

        //Tarihi AY/GUN/YİL sekline ceviriniz
        DateTimeFormatter kalip2=DateTimeFormatter.ofPattern("MM/dd/yyy");
        String myDateKalip2=kalip2.format(myDate);
        System.out.println(myDateKalip2);//05/15/2025

        //Tarihi GUN/AY isminin ilk uc harfi / YIL sekline ceviriniz 13/Aug/23
        DateTimeFormatter kalip3=DateTimeFormatter.ofPattern("dd/MMM/yy");
        String myDateKalip3=kalip3.format(myDate);
        System.out.println(myDateKalip3);//15/May/25

        //Tarihi GUN/AY isminin ilk uc harfi / YIL sekline ceviriniz 13/August/2023
        DateTimeFormatter kalip4=DateTimeFormatter.ofPattern("dd/MMM/yyy");
        String myDateKalip4=kalip4.format(myDate);
        System.out.println(myDateKalip4);//15/May/2025

        //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz?
        LocalDate berlinDate=LocalDate.now(ZoneId.of("Europe/Berlin"));
        System.out.println(berlinDate);//2023-06-12
        LocalTime berlinTime=LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(berlinTime);//14:07:24.757395300

        LocalDate sydneyDate=LocalDate.now(ZoneId.of("Australia/Sydney"));
        System.out.println(sydneyDate);//2023-06-12
        LocalTime sydneyTime=LocalTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(sydneyTime);//22:15:01.672654100







    }//main
}//class
