package day23datetimevarargs;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class DateTime01Tekrar {
    public static void main(String[] args) {
        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yil,ay,gun sirasiyla bir tarih giriniz");
        int yil=scan.nextInt();
        int ay=scan.nextInt();
        int gun=scan.nextInt();

        LocalDate userDate=LocalDate.of(yil,ay,gun);
        if (userDate.isBefore(LocalDate.now())){
            System.out.println("Gecersiz tarih girdiniz");
        }else {
            System.out.println("Zamani girebilirsiniz");
        }

        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Lutfen yil,ay,gun sirasiyla bir tarih giriniz");
        int y=scan.nextInt();
        int a=scan.nextInt();
        int g=scan.nextInt();

        LocalDate kullTarih=LocalDate.of(y,a,g);
        System.out.println(kullTarih.getDayOfWeek());


    }//main
}//class
