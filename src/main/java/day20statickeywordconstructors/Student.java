package day20statickeywordconstructors;

public class Student {
    /*
    1. static variable (pasif ozl) veya static method (aktif ozl)lar (class member) tum objectler icin ortak elemandir(gokteki ay)
    2. static class member lar uzerinde yapilan tum degisiklikler tum object leri etkiler
    3. static class member lar Class a, non-static class memberlar objectlere monte edilir
    Mesela; bir class dan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur
    ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulurlar.
    4. static class member lara ulasmak icin object olusturmaya gerek duyulmaz,
    ama non-static class member lara ulasmak icin object olusturmak sarttir
    5. static variable larin diger adi "Class variable" dir.
        Non-static variable larin diger adi "Instance Variable" veya "Object Variable" dir
     */
    // String stdName="Tom Hanks"; bu bir instance variable dir, non-static tir.
    public static String stdName="Tom Hanks"; //bu static bir variable dir,gokteki ay :))

    public int age = 13;

    public static void staticMethod(){
        System.out.println("Ben static methodum");
    }

    public void nonStaticMethod(){
        System.out.println("Ben static olmayan methodum");
    }


}