package day03methodobjectcreationscanner;

import static day02datatypesmethodcreation.SabahTekrari01.carpma;

public class day03MethodCreation01MyTekrar {
    public static void main(String[] args) {
      kupHesapla(5.0);
        System.out.println(kupHesapla(5.0));
        System.out.println("kupSonuc = " +kupHesapla(5.0));

        double kup = getCube(5);
        System.out.println("kup = " + kup);

    print("benim adim Mustafa");

        //Method olusturmada 2.yol:==> bu bir intellij ozelligidir/kısayoludur.
        //  Ornek 2: Girilen bi kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
        //  main method icinde iken method da kullanilacak olan variable ı olustururuz
        String  motto= "Inan,Guven,Calis,Basar!";
        //Method ismini ve parametre leri yazariz(boyle bir method yoktu yeni olusturduk)
        //kirmizi kismin (ekranaYazdir) üzerinde bekleyip create method a tiklariz, intellij otomatik ol. bir method olusturur
        //daha sonra kendi istegimize göre duzenleriz.(public/privite veya static/void)
        ekranaYazdir(motto);

        //Ornek 3. Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz
        int x = 8;
        int y = 9;
        carpmaSonucu (x,y);

        //Ornek 4. Verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz.
        int a = 12;
        karesiniHesapla (a);

        //Homework 1) cozum:
        int yaricap = 2;
        cemberCevre (yaricap);

        //Homework 2) cozum:
        int daireYaricapi = 3;
        daireAlan (daireYaricapi);


        //HATA VEREN METHOD "Bir ornek daha"
    }//main method

    private static void daireAlan(int daireYaricapi) {
        System.out.println(3*daireYaricapi*daireYaricapi);
    }

    private static void cemberCevre(int yaricap) {
        System.out.println(2*3*yaricap);
    }

    private static void karesiniHesapla(int a) {
        System.out.println(a*a);
    }

    private static void carpmaSonucu(int x, int y) {
        System.out.println(x*y);
    }


    private static void ekranaYazdir(String motto) {
        System.out.println(motto);
    }

    //Ornek 1: Verilen bir ondalik sayının kupunu hesaplayan bir method olusturup kullanınız.
    public static double kupHesapla(double a){
        return a*a*a;
    }
    static double getCube(double a){
        return a*a*a;
    }
    //Note: Access modifier ı "default" yapmak isterseniz access modifier ı (default u)yazmayınız


    // Ornek 2: Girilen bi kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void print(String str){
        System.out.println(str);
    }
    //Note: Eger bir method yeni bir data uretmiyor ise return type ı void olur
    //method un return type ı "void" ise method body icine return keyword u(void)yazılmaz.

    //Bir ornek daha: ekrana "Canim kizim Reyyan" yazdiran bir method olustur ve kullan
   /* private static void print(String str){
        System.out.println(str);
    } ==> bu örnekte, örnek 2 deki "print(Sting str)" kullandım ve hata verdi
    */

    //Homework 1) Cemberin cevresini hesaplayan methodu olusturunuz ve kullanınınız

    //Homework 2) Dairenin alanini hesaplayan methodu olusturunuz ve kullanınınız

}//class
