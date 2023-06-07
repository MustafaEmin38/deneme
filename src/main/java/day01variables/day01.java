package day01variables;

public class day01 {

    public static void main(String[] args) {


        //variable nasıl oluşturulur
        // data type + variable name + assignment operator + variable değeri  +  noktalı virgül
        int age = 13;

        /*
        Javada temelde iki tip data vardır
                1. primitive data type:
                    char, boolean, byte, short, int, long, float, double
                2. non-primitive data type:
                    string
         */

        // Örnek 1: öğrenci ismi için variable oluşturup değer olarak Ali Can atayınız.
        String OgrenciIsmi = "Ali Can";

        //Örnek 2: char data tipinde bir ismin ilk harfi olarak bi variable oluşturunuz ve bir değer atayınız
        char isminIlkHarfi ='A';

        //Örnek 3: booleon data tipinde emekli misin sorusu için bir variable oluşturun ve false değerini atayın.
        boolean isRetired = false;

        //Örnek 4: byte data tipinde öğrenci yaşı için bir variable oluşturunuz ve değer atayınız
        byte ogrenciYasi = 13;

        //Örnek 5: Site nüfusu için bir variable oluşturup değer atayınız.
        short siteNufusu = 3000;

        //örnek 6: ülke nüfusları için bir variable oluşturup değer ataması yapınız.
        int ulkeNufusu = 1687567;

        // Örnek 7: insan vücudundaki hücre sayısı için variable oluşturup değer ataması yapınız.

        long cellNumberInHumanBody = 121444L;
        long weightOfSun = 126413;
        // son yazılanı int kabul etti L koymaya gerek kalmadı

        //Örnek 8: Gömlek ve ayakkabı fiyatları için iki tane variable olşturun
        float shirtPrice = 189.99F;
        float shoesPrice = 1299.99F;


        //Örnek 9: Hücre ağırlığı ve Amip in ağırlığı için ikitane variable oluşturunuz.
        double weightOfCell = 0.12113;
        double weightOfAmip = 0.00001233;

        //Örnek 10: Öğrenci notları için iki adet variable oluşturun ve toplamlarını ekrana yazdırınız.
        byte note1 = 88;
        byte note2 = 75;

        System.out.println(note1);
        System.out.println(note2);


        //Homework
        /*
        1) 3 farklı data türünde variable oluşturun ve bunları farklı satırlarda yazdırın.

        2) ülke ve şehir isimleri için iki variable oluşturun ve bunları yazdırın.


        3) iki tamsayı türünde variable oluşturup toplamını yazdırın.
         */

        //Homework 1.

    double piNumber = 3.14;
    float kiziminKiyafeti = 159.9F;
    short goynucekNufus = 2100;

    System.out.println(piNumber);
    System.out.println(kiziminKiyafeti);
    System.out.println(goynucekNufus);

    //Homework 2.
        String cityMemleket = "Kayseri";
        String myCountry = "Turkiye";

        System.out.println(cityMemleket);
        System.out.println(myCountry);

        //Homework 3.
        int sayi1=100;
        int sayi2=343;
        System.out.println(sayi1+sayi2);


        //merhaba
        //ilk değişiklik yaptım
        //bunlar da 2. değşişikliklerim
        
        //bunlar da internette yaptıklarım

    }

}
