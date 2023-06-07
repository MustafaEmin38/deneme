package day02datatypesmethodcreation;

public class MyTekrar_day02MethodCreation01 {

    /*
    JAVADA METHOD NASİL OLUSTURULUR?
    1. method tabi ki class in icin de ama main methodun disinda olusturulur.
    2. Access modifier + Return type + Name + () + {}

    Olusturulan method lar nasil kullanilir?
    1. Methodu olusturmak methodu calistirmak icin yeterli degildir.
       Kullanmak istedigimiz method, main method un icinden calistirilir
    2. Method un ismi + ( ) yaz
        varsa islem yapacagın datalari parantezin icine koy.
        (bu islem method call(method cagirma) ol. adlandirilir)
    3. method ismi + parametreler ==> method signature
     */
    public static void main(String[] args) {
      int  bolmeninSonucu = bolmeYap (8,2);
        System.out.println("bolmeninSonucu = " + bolmeninSonucu);


      double capmaninSonucu = carpmaYap (5.5, 2);
        System.out.println("capmaninSonucu = " + capmaninSonucu);

       int ilkIkiyiCarpUcuncuyuEkleSonuc = ilkIkiyiCarpUcuncuyuEkle(3,5,10);
        System.out.println(ilkIkiyiCarpUcuncuyuEkleSonuc);
        System.out.println(ilkIkiyiCarpUcuncuyuEkle(3,5,10));
        System.out.println("ilkIkiyiCarpUcuncuyuEkleSonuc = " + ilkIkiyiCarpUcuncuyuEkleSonuc);



        System.out.println(dikdortgenAlan (10,15));
        System.out.println("sonuc = "+dikdortgenAlan(10,15));

        int sonuc = dikdortgeninCevresi(12,84);
        System.out.println(sonuc);
        System.out.println(dikdortgeninCevresi(12, 84));
        System.out.println("sonuc = "+ dikdortgeninCevresi(12, 84));

      }//main method


    //Örnek 1. bolme islemi yapan bir method olustur ve kullan
    public static int bolmeYap (int a, int b) {
        return a/b;
    }

    //Ornek 2. iki sayiyi carpan yapan bir method olustur ve kullan
    protected static double carpmaYap (double a, int b){
    return a*b;
    }

    // Örnek 3: verilen 3 sayıdan ilk ikisini çarpan ve üçüncü sayı ile sonucu toplayan methodu oluşturun ve kullanın
       public static int ilkIkiyiCarpUcuncuyuEkle (int a, int b, int c){
        return (a*b)+c;
       }

       //Homework 1. Dikdortgenin alanini hesaplayan methodu olustur ve kullan.
    public static int dikdortgenAlan (int a, int b){
        return a*b;
    }

    //Homework 2. Dikdörtgenin çevresini hesaplayan methodu oluşturun ve kullanın
    public static int dikdortgeninCevresi (int a, int b){
        return a*b;
    }


}//class
