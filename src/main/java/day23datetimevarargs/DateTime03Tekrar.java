package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03Tekrar {
    public static void main(String[] args) {
        LocalDateTime localTime=LocalDateTime.now();
        System.out.println(localTime);//2023-06-12T15:25:01.698560200

        DateTimeFormatter kalip=DateTimeFormatter.ofPattern("MMMM/dd/yyyy HH:mm:ss");//burasi cok flexible.istedigin hale getirebilirsn
        String localFormat=kalip.format(localTime);
        System.out.println(localFormat);//Haziran/12/2023 15:25:01



    }//main
}//class
