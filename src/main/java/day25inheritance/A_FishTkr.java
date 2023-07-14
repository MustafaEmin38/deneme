package day25inheritance;

public class A_FishTkr {

    /* OOP Concepts
    1) Inheritance
    * Kod tekrarini engeller
    * Maintanence kolay olur
    * Child class lar atomic olur

    ***Bir class i baska bir class in child i yapmak icin; child class in class adindan sonra "extends" key word u yazilir
        ve ardindan Parent class in ismi yazilir

    !!!! Child class (sub class) object leri, parent class (super class) tan method ve variable lari kullanabilir
         ama parent class, child class tan method veya variable kullanamaz

    !!! Java da bir class in sadece 1 tane parent i olabilir.
        Java "Multiple Inheritance" i desteklemez, "Single Inheritance "i destekler

        *** Apartman seklindeki inheritance a "Multilevel Inheritance" denir, java bunu destekler.
        *** Object class her class in parent idir. Ama obejct class in bir parent i yoktur.
            yani tum class larin parent i var object class in yok.

    *** Javada parent dan child a olan iliskilere "HAS-A RELATIONSHIP" denir
    *** Javada child dan parent a olan iliskilere "IS-A RELATIONSHIP" denir

    *** Javada her class in bir tane "default constructor" ı vardir fakat bu "default constructor" class icinde gorunmez.
        cunku constructor object class icindedir.
     */

    public void solunum(){System.out.println("Baliklar solungac solunumu yapar");}

    public void cogalma(){System.out.println("Baliklar yumurtlayarak cogalir");}



}



