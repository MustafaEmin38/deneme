package day19passbyvaluemethodoverloading;

public class MethodOverLoading01Tekrar {//int lerde sorulur. asiri yukleme demektir.
    public static void main(String[] args) {//method signature=> method ismi ve parametrelerden olusur.
        //Java methodlari isim ve parametrelerinden tanir
        //methodoverloading ayni isimle farkli islemler yapabilen method olusturmak demek.Ayni class ta yapilir
        //yani bir tane isim var yaninda degisen sey sadece parametreler olmali.(variable name bakmaz, data type bakar)
        //isim ve parametrelerin tipi(data type) ayniysa java ya gore bu iki method aynidir==>method signature
        //method overloading te return type-acc modifier-static/non-static lik-method body nin etkisi yoktur.

        add(3,5);


    }//main
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

}//class

    /*______İnterviewlerde cikabilir
    1. Method overloading yaparken ismi degistirilmez.
    2. Method overloading yaparken parametreler degistirilir
        a. Parametreleri degistirirken, parametrelerin data type i degistirilebilir(int i double yapma gibi )
        b. Parametleri degistirirken parametrelerin sayisi degistirilebilir{(int a, int b) >>> (int a, int b, int c)}
        c. Parametre degistirirken, parametrelerin data type lari farkli ise yerleri degistirilebilir
    3. Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir.
    bu yuzden isim ve parametre "Method Signature" oalrak adlandirilir.
    4.Method Overloading olustururken return type i degistirmenin hicbir etkisi yoktur.
      Method Overloading olustururken acces modifier i degistirmenin hicbir etkisi yoktur.
      Method Overloading olustururken methodu static yada non-static yapmanin hicbir etkisi yoktur.
      Method Overloading olustururken body i degistirmenin hicbir etkisi yoktur.

    5. "private" methodlar overload edilebilir. Cunku method overloading sadece bir class icinde olur
        private olmak ise baska classlara gidildiginde problem olusturur.

    6. static methodlar overload edilebilir.(static>>class a ait, class a monteli)
        overolading yapmak icin (method ismini degistirmeden) method signature yi degistiririz
        dolayisiyla signature degistiginde yeni bir method olusturmus oluruz, bu nedenle static olmasi birseyi degistirmez
        String name="Ali Can";
        static String name="Ali Can"; ==> Ali Can siradan biri iken simdi gokteki ay gibi oldu.
        stattic yaptiginiz object/variable/method tum objectler icin ortak mal oldu
        yapilan tum degisiklikler gorunur hale geldi. (static olunca Ali Can-->Ali Cin bunu herkes gorur, ortak mal oldu)
     */

// çoklu satiri yorum satiri olarak almak istiyorsak ctrl ile secip / il e yoruma aliriz
//methodlarin kodlarini gormek icin mehhodu yazar uzerine gelir ctrl ye basariz
