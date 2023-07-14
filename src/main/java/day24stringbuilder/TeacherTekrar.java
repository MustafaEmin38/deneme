package day24stringbuilder;

public class TeacherTekrar {
    /* Access Modifier lar 4 tanedir
    1. Public
    2. Protected
    3. Default (acc. mod. default sectigimizde, yazmamıza gerek yok cunku yazmayinca zaten java acc. mod. default kabul eder)
    4. Private

    //Genisten dar a dogru
     public>protected>default>private

     // public : her class tan kullanilabilir
     // protected: kendi package i ve baska package lardaki child larindan kullanilabilir
     // default : sadece kendi package indan kullanilabilir, baska package lardan kullanilamaz
     // private: sadece kendi class ida kullanilanbilir

     //Note: protected-default farki
            protected>> baska package lardan kullanilamaz ama baska package lardaki child lardan da kullanilabilir
            default>> sadece kendi package i icinden kullanilabilir, baska package lardan kullanilamaz

     */

    public String name="Ali Can";//her yerden kull.

    protected String city="Amasya";//kendi package ve baska package daki child lardan kull

    int age = 35;//sadece kendi package indan kull

    private String married="Single";// sadece kendi class indan kull

}
