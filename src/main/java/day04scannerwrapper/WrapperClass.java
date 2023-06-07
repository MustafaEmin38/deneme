package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive ile non-primitive arasindaki en buyuk fark==> METHOD (interwiew de bizden bunu duymak isterler)
        //primitive :     char -  boolean -  byte - short -   int -   long - float - double
        //Wrapper Class: Character-Boolean - Byte - Short - Integer - Long - Float - Double

        //Wrapper Class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //dolaysıyla sart degilse wrapper class kullanmayı tercih etmeyiz, ama boyle imkan oldugunu bilsek iyi olur.

        //n yazip nokta koyarsaniz hiç method goremezsiniz cunku primitive ler method icermez
        int n = 12;

        //m yazip nokta koyarsaniz bircok method gorursunuz cunku wrapper class lar method icerir
        Integer m = 12;

        byte p = 33;
        Byte r = 44;

        //Ornek 1: short data type nin minimmum ve max degerlerini kod yazarak  bulunuz.
        short maxShort= Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort); //maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);  //minShort = -32768

        //* Ornek: byte data type nin minimmum ve max degerlerini kod yazarak  bulunuz.
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("min byte:"+ byteMin);
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("max byte:"+ byteMax);


        //Ornek 2: int data type nin min. degeri ile byte data type nın max degererini toplayınz
        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt + maxByte);//-2147483521

        //Ornek 3:Primitive ınt i Wrapper Integer a ceviriniz.(bu cevirme islemine autoboxing denir)
        int num =12;
        Integer wrapperNum = num;

        int sayi1 = 345;
        Integer wrapperSayi1 = sayi1;

        //Ornek 4: Wrapper byte ı primitive byte a ceviriniz.(Unboxing denir)
        Byte k = 12;
        System.out.println(k);
        byte primitiveK = k;
        System.out.println(primitiveK);

        Byte wrapperByte = 125;
        System.out.println(wrapperByte);
        byte priByte = wrapperByte;
        System.out.println(priByte);

        //Ornek 5: primitive char ı Wrapper Character e ceviriniz(Autoboxing)
        char inital = 'm';
        Character initalWrapper = inital;

        char priChar = 'k';
        Character wrapperChar = priChar;

        //Ornek 6: Wrapper Boolean ı primitive boolean a ceviriniz.
        Boolean isOldWrapper = true;
        boolean isOldprimitive = isOldWrapper;

        Boolean wrapperBoolean = true;
        boolean priBoolean = wrapperBoolean;

    }//main method
}//class
