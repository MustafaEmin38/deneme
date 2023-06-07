package day05concatinationoperatorstypecasting;

public class MyTekrar_TypeCasting {
    /*
    Numeric primitive data type larinin birbirine donusturulmesine "Type Casting" denir.
    Numeric (sayisal) Data type lar:  byte  -  short - int - long - float - double
     */
    //Note 1: Kucuk data type larini buyuk data type larina cevirmeyi java otomatik ol. yapar.
    //Bu isleme "AutoWidening" (otomatik genisletme) denir}

    //Note 2: Buyuk data type larini kucuk data type larina cevirmek riskli bir istir java bu riskli isi otomaik ol yapmaz
    // Bu islemi kod yazanlardan bekler
    //Bu isleme "ExplicitNarrowing" (Aciktan Daraltma) denir

    public static void main(String[] args) {
        //byte data type ini int data type ina cevirniz
        byte age = 13;
        int ageInt = age;// AutoWidening

        short boy = 161;
        int boyInt = boy;

        //Int data type ini short data type ina ceviriniz.
        int weight = 312;
        short weightShort = (short)weight; //Explicit Narrowing

        double hucreAgirligi = 0.215453;
        float hucreAgirligiFloat = (float) hucreAgirligi;
    }//main
}// Class

