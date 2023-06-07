package day04scannerwrapper;

public class MyTekrar_WrapperClass {
    public static void main(String[] args) {
        //primitive ile non-primitive arasindaki en buyuk fark==> METHOD (interwiew de bizden bunu duymak isterler)
        //primitive :      char   boolean   byte  short  int     long  float  double
        //WrapperClass: Character Boolean  Byte   Short  Integer Long  Float  Double

        //Wrapper Class lar non-primitive dir. o nedenle memory de cok yer kaplarlar
        //dolaysiyla wrappre class ı cok tercih etmeyiz, ama bilmek iyidir.

        //n yazip nokta koyarsaniz hiç method goremzsizniz cunku primitive ler method icermez
        int n = 12;
        //m yazip nokta koyarsaniz bircok method gorursunuz cunku wrapper class lar method icerir
        Integer m = 12;

        char ismiminIlkHarfi = 'm';         //primitive olan byte
        Character ismiminIkinciHarfi = 'u'; //Wrapper Class olan byte

        //Ornek 1: short data type nin minimmum ve max degerlerini kod yazarak  bulunuz.
        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        //Ornek 2: ınt data type nin min degeri ile byte data type nin max degerinin toplamini bulunuz
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("sonuc = " + (byteMax + intMin));//-2147483521

        //Ornek 3: Primitive int i Wrapper Integer a ceviriniz. (Buna auto boxing denir)
        //Bu soru interview de sorulabilir

        int num = 12;
        Integer wrapperNum = num;

        //Ornek 4: Wrapper Byte ı primitive byte a ceviriniz. (Unboxing)
        Byte k = 12;
        System.out.println(k);
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Ornek 5: Primitive char i Wrapper Character e ceviriniz.(Autoboxing)
        char ugurluSayim = '3';
        Character wrapperChar = ugurluSayim;
        System.out.println(wrapperChar);

        //Ornek 6: Wrapper Boolean ı primitive boolean a ceviriniz(Unboxing)
        Boolean isSuccessful = true;
        boolean isSuccessfulPrimitive = isSuccessful;
        System.out.println(isSuccessful);

    }//main method
}//class
