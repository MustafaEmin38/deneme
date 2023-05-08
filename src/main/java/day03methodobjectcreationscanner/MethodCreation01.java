package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {
        double kup = getCube(5);
        System.out.println("kup = " + kup);

        print("Java  is easy");

        //Method olusturmak icin 2.yol:
        //Ornek 2 ikinci yol: Girilen bi kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
        //main method icinde iken method ta kullanilacak olan variable lari olusturunuz.
        String str = "TechproEdu";
        //method ismi ve parametreleri yazariz
        //kirmizi kismin üzerinde bekleyip create method a tiklariz, intellij otomatik olarak bir method olusturur
        //daha sonra kendi istegimize gore dizayn ederiz
        printConsole(str);

        //Ornek 3: Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz
        int a =3;
        int b =5;
        carpmaYap(a,b);

        //Ornek 4: Verilen bir tam sayinin karesini hesaplayip console a yazdiran bir method olusturup kullaniniz
        int sayi=5;
        karesiniAl(sayi);

        //homework 1 cozum:
        int r = 2;
        cemberinCevresiniBul(r);
        //homework 2 cozum:
        int x = 4;
        daireninAlaniniBul(x);

        System.out.println("1.yol = " + getCube(5));
        getCubeYazdirabilen(5);

    }//main method

    private static void daireninAlaniniBul(int x) {
        System.out.println(3*x*x);
    }
    private static void cemberinCevresiniBul(int r) {
        System.out.println(2*3*r);
    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi*sayi);
    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    public static void printConsole(String str) {
        System.out.println(str);
    }

    //Ornek 1: Verilen bir ondalik sayının kupunu hesaplayan bir method olusturup kullanınız.
     static double getCube (double a){
        return a*a*a;
    }
    static double getCubeYazdirabilen(double a){
        System.out.println("a*a*a 2.yol = " + a * a * a);
        return a*a*a;
    }
    //Note : Access modifier i default yapmak isterseniz access modifier i YAZMAYINIZ.

    //Ornek 2: Girilen bi kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
        public static void print(String str){
            System.out.println(str);
        }
        //Eger bir method yeni data uretmiyor ise return type i void olur
        //methodun return type i void ise method body icinde return keyword u yazilmaz.

    //Homework 1) Cemberin cevresini hesaplayan methodu olusturunuz ve kullanınınız

    //Homework 2) Dairenin alanini hesaplayan methodu olusturunuz ve kullanınınız

}//class
