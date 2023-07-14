package day25inheritance;

public class Animal {
    //OOP nin 4 temel consept i var
    // 1.Inheritance ==> Miras alma.
       /*
       Ozellikleri bir classtan diger classlara alan bir kavramdir, Bunun javadaki karsiligi sudur:
       Siz bir class olusturacaksiniz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin
       bir cogunu kapsiyor, o zaman direkt yeni olusturdugunuz classi ozelliklerini kullanmak istediginiz
       classa  child yapariz

         Inhertiance in faydalari
         1) Code tekrarlarindan kurtuluruz
         2) Code tamiri (maintenance) kolay olur
         3) Child classlari daha atomic yapmis oluruz

        =>Bir class i baska bir classin child classi yapmak icin "extends" keyword kullanilir.
        Ilk yazilan class child, ikinci yazilan class parent (veya super) olur,
        =>Child class objectleri Parent Class dan method ve variablellari kullanabilirler
        ==> Parent class object leri child class tan method  kullanamazlar

        ==>Javada bir classin sadece 1 tane parent i olabilir. Coklu parent a "Multiple Inheritance" derler
        tekli parent a "Single Inheritance" derler. Java Multiple Inheritance i desteklemez
        Java Single Inheritance kullanir

        ==> Apartman seklindeki inheritance yapisina "Multilevel Inheritance" denir
        Java "Multilevel Inheritance" yi destekler

        ==> Object class her class in parentidir. Java da Object Class haric her class in parent i vardir
            Java da parent i olmayan tek class Object Class tir(object class tum class larin paren ti)

        ==> Java da parent dan  child a olan iliskilere "HAS-A RalationShip" denir
        ==> Java da child dan parent a olan iliskilere "IS-A RalationShip" denir

        ==> Java da her class in bir tane default consructor i vardir. Bu default constructor
        class in icinde gorunmez cunku constructor "Object Class in icindedir



        */


    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }



}
