package day02datatypesmethodcreation;

public class Variables02 {
    /*
    Java da temelde iki tip data vardır.
    1)primitive data type
    char, booleon, byte, short, int, long, float, double
    2)non-primitive data type
       String.....
     */

    /*
    Note  1: Primitive data type larını java oluşturmuştur, biz oluşturamayız
    Note  2: Primitive data type larının isimlerinde sadece küçük harfler kullanılır.
    Note  3: Primitive data lar data type larına göre memory de farklı farklı yer kaplar.
    Note  4: Primitive data lar içlerinde sadece sizin atadığınız değeri barındırırlar.
     */


    /*
    Non-primitive Data Types (üretilen herbir class aynı zamanda bir non-primitive data type dır)
    Örneğin String non-primitive bir data typedir
    * üretilen her bir class aynı zamanda "non-primitive" data type dir
    bu yüzden non primitive data type lar sınırsız sayıdadır denileblir
    *Non-primitive Data Type ların isimleri büyük harfle başlar.
    (Çünkü üretilen her bir String aynı zamanda bir class tır. Class lar büyük harfle başlar)
    *Non-primitive ler için java memory de büyüklüğüne göre değişen boyutlarda yer ayırır

     */
    public static void main(String[] args) {
        // Örnek 1: Ülke ismi için bir variable oluşturun ve bir değer atayıp console a yazdırın.
        String ulkeIsmi = "Turkiye";
        System.out.println(ulkeIsmi);

        /*
        Soru   primitive ve non-primitiive data type ları arasındaki farklar nelerdir?
        1) "primitive" ler sadece bizim atadığımız değeri içerir
            "non-primitive" ler bizim atadığımız değeri ve methodları içerir
        2) primitive ler küçük harfle başlar non-primitive ler büyük harfle başlar.
        3) "primitive leri java üretmiştir ve 8 tanedir
            "non-primitive" leri java ve developer lar üreteblir, sınırsız sayıdadır.
        4) primitive" ler data type larına göre sabit boyutta bellek kullanırlar
            "non-primitive" ler için java memory de büyüklüğüne değişen boyutlarda bellek kullanabilirler.

         */



    }




}
