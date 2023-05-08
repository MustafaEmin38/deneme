package day02datatypesmethodcreation;

public class SabahTekrari01 {

    public static void main(String[] args) {

   int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);


   int carpim =carpma (8,5);
        System.out.println(carpim);

        long recent = multiply(123456789, 987654321);
        System.out.println(recent);

      double bolum = bolme (60, 5);
        System.out.println(bolum);

       int kalan = cikarma (18,58);
        System.out.println(kalan);

        long netSonuc = ilkIkiyiCarpUcuncuyuEkle (5,8,3);
        System.out.println(netSonuc);

    }//main


    //    Örnek 1: toplama işlemi yapan bir method oluşturun ve  kullanınız

    public static int toplamaYap(int a, int b){
        return a+b;
    }
    ///örnek 2: carpma işlemi yapan bir method oluşturun ve yazdırın
    public static int carpma (int a, int b) {
        return a*b;
    }

    private static long multiply (long a, long b){
        return a*b;
    }
   //örnek 3: böme işlemi yapan bi method oluştur ve yazdır.
    private static double bolme (int a, int b) {
        return  a/b;
    }
    //Örnek 4: cıkarma işlemi yapan bir method oluştur ve yazdır.
    protected static int cikarma (int a,int b){
        return a-b;
    }

    //Örnek 3: verilen 3 sayıdan ilk ikisini çarpan ve üçüncü sayı ile sonucu toplayan methodu oluşturun ve kullanın
    public static long ilkIkiyiCarpUcuncuyuEkle (int a, int b, int c){
        return a*b+c;
    }

}//>>class
