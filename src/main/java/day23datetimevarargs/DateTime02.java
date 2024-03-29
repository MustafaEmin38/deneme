package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
    //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);// 21:01:49.900122300

        //Anlik zamanda bilesenler nasil alinir?
        int hour= myCurrentTime.getHour();
        System.out.println(hour);

        int minute= myCurrentTime.getMinute();
        System.out.println(minute);

        int second= myCurrentTime.getSecond();
        System.out.println(second);

        int nano= myCurrentTime.getNano();
        System.out.println(nano);

        //Gelecek ve gecmise nasil gidilir?
        LocalTime next=myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        /*
        DateTime class ta kullanilan tarih saat formatlari
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemi
        hh : mm a==> 12 li saat sistemi AM, PM gosterilir
        HH : mm : ss ==> 24 lu saat sistemi-saniye de verir
        HH : MM ==> yanlis format, MM aylar icin kullanilir
        "mm" minute demektir. "MM" month demektir

        dd-MM-yyyy ==> gun ay yil (int verir yani rakam)
        MMM ==> Aug (String-ilk 3 harf verir)
        MMMM ==> August (String-tamamini verir)
         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date formati nasil degistirilir?
        LocalDate myDate = LocalDate.of(2023, 8, 13);
        System.out.println(myDate);//2023-08-13

        //Tarihi AY/GUN/YİL sekline ceviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedMydate = dtf2.format(myDate);
        System.out.println(formattedMydate);

        //Tarihi GUN/AY isminin ilk uc harfi / YIL sekline ceviriniz 13/Aug/23

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMM/yy");
        System.out.println(dtf3);
        String formattedMydate2=dtf3.format(myDate);
        System.out.println(formattedMydate2);

        //Tarihi GUN/AY isminin ilk uc harfi / YIL sekline ceviriniz 13/August/2023
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMydate3=dtf4.format(myDate);
        System.out.println(formattedMydate3);

        //Baska bir zamna dilimindeki tarih ve zamani nasil alabiliriz?
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam da ayin kaci?
        LocalDate dateInAmsterdam=LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyo da saat kac?
        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //Amsterdam da saat kac?
        LocalTime timeInAmsterdam=LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);


    }//main
}//class
