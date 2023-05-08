package day02datatypesmethodcreation;

public class day02Variables02MyTekrar {
    /*Java da iki tip data type vardır:
    1) primitive data type
        char, booleon, byte, short, int, long, float, double
    2)non-primitive data types:
    String...
     */

    /*
    Note 1: Primitive data types ları java olusturmustur, biz olusturamayız.
    Note 2: Primitive data type ların isimlerini yazarken sadece kucuk harf kullaniriz.
    Note 3: Primitive data type ları memory de farklı boyutlarda yer kaplar
    Note 4: Primitive data type ların memory de kapladığı boyutu bizim atadığımız degerlerler olusturur
     */

    /*Non-primitive data type lar (uretilen her bir class aynı zamanda bir non-primitive data type dır)
    Ornegin String non-primitive bi data type tır.
     *uretilen her bir class ayni zamanda nono-primitive data type tır.
     bu nedenle non primitive data type lar sinirsiz sayidadir diyebiliriz.
     *Non-primitive data type ların isimleri büyük harfle baslar(ayni zmanda class ya ondan)
     *Non-primitive ler icin java memory de buyulugune gore degisen boyutlarda yer ayirir.
     */

    public static void main(String[] args) {
        //ornek 1:ulke ismi icin bir variable olusturun ve bir deger atayıp console a yazdirin.
        String ulkeIsmi = "Germany";
        System.out.println("ulkeIsmi = " + ulkeIsmi);

        /*Primitive ve Non-primitive data type lar arasindaki farklar nelerdir
        1. "primitive"ler sadece bizim atadigimiz degeri içerir.
            "non-primitive"ler bizim atadigimiz degeri ve method lari icerir.
        2. primitive ler kucuk harfle baslar, non-primitive ler buyuk harfle baslar
        3. "primitive" leri java uretmistir ve 8 tanedir
            "non-primitive"leri java developerlar uretir snirsiz sayidadir.
        4. "primitive" ler data type larina göre sabit boyutta bellek kullanir
            "non-primitive"ler icin java, memory de buyukluklerine gore yer ayirir
         */
    }
}
