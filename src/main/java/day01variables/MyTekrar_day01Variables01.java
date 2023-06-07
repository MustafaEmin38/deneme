package day01variables;

public class MyTekrar_day01Variables01 {
    public static void main(String[] args) {
        //primitive data types
       char hayattaUgurluRakamim = '3';
       boolean willIWin = true;
       byte sinifIcinIdealOgrenciSayisi =20;
       short karasarSandikSecmenSayi = 485;
       int ilkMaasimKacPara = 1634;
       long humanCellNumber = 12345467889L;
       float shirtPrice = 399.99F;
       double weightOfCell = 0.123456789;

       //non-primitive data types "String"
        String hayalimdekiUlke = "Amerika";
        System.out.println("hayalimdekiUlke = " + hayalimdekiUlke);

       //Ornek : mayıs ayı kredi kartı borcum icin variable olusturup console a yazdir
        double reyyaninPollyPocket = 179.99;
        int furySsd = 250;
        System.out.println("reyyaninPollyPocket= " + reyyaninPollyPocket);
        System.out.println("furySsd= " + furySsd);
        //Ornek : ülke ve şehir isimleri için iki variable oluşturun ve bunları yazdırın
            String countryName =  "Turkiye";
            String cityName = "Amasya";
        System.out.println("countryName = " + countryName);
        System.out.println("cityName = " + cityName);

        //Ornek :iki tamsayı türünde variable oluşturup toplamını yazdırın.
        int sayi1 = 343;
        int sayi2 = 265;
        int toplam = sayi1 + sayi2;
        System.out.println("toplam = " + toplam);


    }//main
}//class
