package day26polymorphism;

import java.util.Scanner;

public class AnimalTekrar {//public final class AnimalTekrar; class lar final edildigi zaman artik kisirlasmistir childi olmaz, override edilemez

    /*
    1) parent class taki methodu child class icinde ozellestirerek kullanmaya overriding yapmak denir
    2) Overriding te method signature a dokunulmaz(method signature= method ismi+parametreler)
    3) Overriding te amac zaten body degistirmek, o degisebilir.method signature a dokunamayiz o ayni kalir.
       access modifier da ise degisim yapilabilir ama bir sartla; child parent i kisitlayamaz
       NOTE:Private method lar override edilemezler
    4) Child class daki methodun access modifieri parent class daki override edilmis(Overriden Method) methodun access
       modifier indan dar olamaz.Aynisi olabilir ya da daha genis olabilir
    5) Child class ta override edilen methodun return type ile parent taki method un return type i arasinda "Is A RelationShip"
       varsa (parent-child iliskisi) return type degistirilebilir. Yani arada extends varsa; parent class adi da olur, child class adi da olur
    6) Method un return type i primitive ise Overriding yaparken return type degistirilemez.Cunku return type ya ayni olur
       veya parent tan secilir. Cunku primitive ler arasinda Parent-Child iliskisi olmadigindan aynisi olmak zorundadir
    7) Child da override edilen methodun rteturn typei ile parent methodun return type i arasinda IS A Relationship yoksa return type
       DEGİSTİRİLEMEZ. Mesela;
       Integer wrapper classi ile Long wrapper classi arasinda IS A Relationship yoktur, o yuzden degistirilemez
    8) Methodun return type i void ise Overriding yaparken return type degistirilemez.
    9) static methodlar override edilemezler. Cunku static methodlar tum childlar icin ortak methodlardir. Bir child bir ortak methodu
       degistirdiginde diger child lar bundan olumsuz etkilenebilir.Bu yuzden java static methodlarin override edilmesine musade etmez
       (gokteki ayi kimse kendine gore degistiremez)
    10) final method lar override edilemezler. final methodlarin body si degistirilemez ama override ederken method body degistiririz
        bu yuzden java final methodlarin override edilmesine izin vermez.
            a) final keywordunu variable lar ile kullanabiliriz
                i) eger variable final ise mutlaka deger atanmalidir
                ii)ilk atanan deger degistirilemez
            b) final keywordunu method lar ile kullanabiliriz
                i) method final ise body si degistirilemez
                ii) degistirilemeyince de override yapmak mumkun olmaz
            c)  final keywordunu class lar ile kullanabiliriz
                i) class final ise child i olamaz
      final keywordu konunca artik o variable,method degistirilemez. nokta konmustur
      public final class AnimalTekrar{} bu class artik kisirdir, childi olmaz, hata verir

       Polymorphism = Method overloading + Method overriding
     */
    public void eat() {
        //Parent taki override edilmis eat() methoduna Overriden Method denir(gecersiz kilinmis)
        System.out.println("Animals eat...");
    }

    protected void drink() {
        System.out.println("Animals drink...");
    }

    public AnimalTekrar create() {//bu methodun return type i AnimalTekrar dir.
        // cunku String nasil hem bir class hem bir data type ise burda da AnimalTekrar
        // hem bir class hem de bir data type tir.(her class urettigi object nin kalibir)
        return new AnimalTekrar();// burda method icinde yeni bir kullanim var. AnimalTekrar isimli bir object olusturduk
        //Scanner input=new Scanner(); demiyoruz da "new AnimalTekrar();" diyoruz

    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    final double pi = 3.14;// artik bu sayi sabit degismez
    final int mySchoolNum = 343;//artik sabitledim degismez

    public final double circleArea(double r) {
        return 3.14 * r * r;
    }


}//class
