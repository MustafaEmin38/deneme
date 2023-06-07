package day05concatinationoperatorstypecasting;

public class TypeCasting {
    /*
    Numeric primitive data type larinin birbirine donusturulmesine "Type Casting" denir.
    Numeric (sayisal) Data type lar:  byte  -  short - int - long - float - double
     */
    //Note 1: Kucuk data type larini buyuk data type larina cevirmeyi java otomatik ol. yapar.
    //Bu isleme "AutoWidening" (otomatik genisletme) denir

    //Note 2: Buyuk data type larini kucuk data type larina cevirmek riskli bir istir java bu riskli isi otomaik ol yapmaz
    // Bu islemi kod yazanlardan bekler
    //Bu isleme "ExplicitNarrowing" (Aciktan Daraltma) denir

    public static void main(String[] args) {
        //byte data type ini int data type ina cevirniz
        byte age = 13;
        int ageInt = age;//autowidening

        //* byte data type ini int data type ina cevirniz
        byte doorNumber = 14;
        int doorNumberIny = doorNumber;//autowidening

        byte a = 72;
        int aInt = a;

        //Int data type ini short data type ina ceviriniz.
        int weight = 312;
        short weightShort = (short)weight;//Explicit Narrowing

        //* Int data type ini short data type ina ceviriniz.
        int length = 1234;
        short lengthShort = (short) length;//Explicit Narrowing

        int b = 54321;
        short bShort = (short)b;

        //int data type ini flaot data type ina ceviriniz
        int population = 7000;
        System.out.println(population);//7000

        float populationFloat = population;
        System.out.println(populationFloat);//7000.0

        //* int data type ini flaot data type ina ceviriniz (autowidening)
        int price = 139;
        System.out.println(price);//139

        float priceFloat = (float)price;
        System.out.println(priceFloat);//139.0

        int c = 54321;
        System.out.println(c);
        float cFloat = c;
        System.out.println(cFloat);//54321.0

        //* double data type ni float a ceviriniz
        double cell = 0.456;
        float cellF = (float) cell;
        System.out.println(cellF);//0.456

        double d = 0.123456789;
        float dFloat = (float) d;
        System.out.println(dFloat);//0.123456789

        //double data typeini short data type ina ceviriniz
        double number = 12.99;
        System.out.println(number);//12.99
        short numberShort=(short) number;
        System.out.println(numberShort);//12

        double sayiD = 6.456;
        System.out.println(sayiD);
        short sayiS = (short) sayiD;
        System.out.println(sayiS);

        //* double data typeini short data type ina ceviriniz
        double priceD = 139.95;
        System.out.println(priceD);

        short priceShort = (short) priceD;
        System.out.println(priceShort);//139

        //Example
        short num =260;
        System.out.println(num);//260

        byte numByte = (byte) num;
        System.out.println(numByte);//4

        //Not
        //Donusum yaptigimiz sayi(260) donuseceginiz data type inin sinirlari disinda ise java kullandiginiz sayi ile
        // mod islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur

        //* Example
        int sayi = 323;
        System.out.println(sayi);

        byte sayiByte = (byte) sayi;
        System.out.println(sayiByte);//67


    }//main
}//class
