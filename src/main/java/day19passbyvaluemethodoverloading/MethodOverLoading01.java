package day19passbyvaluemethodoverloading;

public class MethodOverLoading01 {//==> interviewlerde sorulabilir
    public static void main(String[] args) {

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
    /*over loading ınt te cıkabilir, çokça sorulur
        1.Method Overloading yaparken ismi degistirilmez(singature degistir ama ismi degstrmeden)
        2.Method Overloading yaparken parametreler degistirilir
            a. Parametreleri degistirirken, parametrelerin data type lari degistirilebilir
            b. Parametreleri degistirirken, parametrelerin sayisi degistirilebilir
            c. Parametreleri degistirirken, parametrelerin daa type lari farkli ise yerleri degistirilebilir
        3.Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir.
        Bu yuzden ismi ve parametre method signature olarak adlandirilir(isim ve parametre mehodu unic hale getirir)
        4.Method Overloading olustururken return type degistirmenin hicbir etkisi yoktur
            Method Overloading olustururken acces modifier i degistirmenin hicbir etkisi yoktur
            Method Overloading olustururken method u static veya non-static yapmanin hicbir etkisi yoktur
            Method Overloading olustururken body i degistirmenin hicbir etkisi yoktur

    */
     /*
    1) Method Overloading yaparken ismi degistirilmez.
    2) Method Overloading yaparken parametreler degistirilir
        a) Parametreleri degistirirken , parametrelerin data type lari degistirilebilir
        b) Parametreler degistirirken, parametrelerin sayisi degistirilebilir
        c) Parametre degistirirken, parametrelerin data typelari farkli ise yerleri degistirilebilir
    3) Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir
    bu yüzden ismi ve parametre "Method signature" olarak adlandirilir.

    4) Method Overloading olustururken return type i degistirmenin hicbir etkisi yoktur
    Method Overloading olustururken access modifier i degistirmenin hicbir etkisi yoktur
    Method Overloading olustururken method u static yada non-static yapmanin hicbir etkisi yoktur
    Method Overloading olustururken bodyi degistirmenin hicbir etkisi yoktur

    5) "private" methodlar overload edilebilir. Cunku method overloading sadece bir class icinde olur
    private olmak ise baska classlara gidildiginde problem olusturur.

    6) static methodlar overload edilebilir,
    overloading yapmak icin (method ismini degistirmeden) method signature i degistiririz,
    dolayisiyla signature degistiginde yeni bir method olusturmus oluruz, bu nedenle static olmasi birseyi degistirmez
     */
}//class
