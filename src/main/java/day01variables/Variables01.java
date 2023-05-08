package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        // bu comment satırıdır. java bunu okumaz, kendimize veya başkalarına açıklama satırıdır
        /*
        java bu satırı da okumaz, çoklu satırlar için bu işaret kullanılır. istersen roman yaz :))

         */

        //Variable (prog içinde bazı data ları koymak için memory de oluştdğmz sepet) nasıl oluşturulur
        //Data type   +  variable name  + Assignment operator (atama operatörü)  + Variable değeri + noktalı virgül => kalıp
        int                 age                 =                                       13                  ;

        //java cümlesi => statement
        //Dilbigisindeki nokta ne ise javadaki ";" aynı şeydir. yani statement in bittiğini gösterir.
        //Eğer variable declaration yapar, Assigment yapmazsanız java kendi default değerlerini koyar.
        // Default değer sayılar için sıfırdır.
        //Java da "=" assigment operator dur. ve java bu operatoru gördüğü zaman önce sağ tarafı çalıştırır
        //ve sağdaki değeri alır soldaki kutuya (kavanoz, konteyner) koyar. (reserved area ==>teknik tabiri bu)
        //Javada eşittir demek "==" matematikte "="; javada "=="
        //Data type + Varible name ==> Variable declaration
        // Assignment  operator (=) + Varible değeri ==> Assignment

        /*
        Javada temelde iki tip data type vardır
                1. primitive data type:
                    char, boolean, byte, short, int, long, float, double
                2. non-primitive data type:
                    string
         */

        // Örnek 1: öğrenci ismi için variable oluşturup değer olarak Ali Can atayınız.
        //Data type   +  variable name  + Assignment operator (atama operatörü)  + Variable değeri + noktalı virgül
        String             ogrenciAdi           =                                       "Ali Can"         ;

        //Stringlere verilen değerler daima çift "..." tırnak içinde yazılmalıdır.
        // Stringler için "dafault value" (==>varyılan değer) null dır.

        /*
        string bir variable oluşturduğumuzda çoğu zaman ona bi değer atarız. Atama yapmazsak, java o variable a
        varsayılan değer olarak null koyar
        -null demek 0 demek değildir. 0 da coding te bi değerdir. null hiçlik demektir.
        -içinde variable ya da method bulunmayan boş bir obje demektir.
        -{}==> eleman yok {0}==> elemanı 0

         */

        //char data type
        //TEK karakterler için kullanılır. Sayı, sembol ya da harf farketmez.
        // örneğin ==> A,x,?,5....
        //Örnek 2: char data tipinde bir ismin ilk harfi olarak bi variable oluşturunuz ve bir değer atayınız
        char isminIlkHarfi ='A';

        //Note: char data type inda değerler daima tek tırnak içinde yazılmalıdır.
        char anaSinifiOgrenciYaslari = '5';

        //booleon data type:
        //booleon lar sadece iki farklı değer alablir; true (doğru) ya da false (yanlış)
        //o yüzden isimlendirme yapılırken ingilizce olarak mi? soru eki anlamında başına is konur
        //Örnek 3: booleon data tipinde emekli misin sorusu için bir variable oluşturun ve false değerini atayın.
        boolean isRetired = false;
        //emekli mi diye sorduk

        //byte data type
        //tam sayılar için kullanılır, hafızada 1 byte yer kaplar
        //byte : -128 den +127 e (dahil) kadar tamsayı değerleri için kullanılır

        //Örnek 4: byte data tipinde öğrenci yaşı için bir variable oluşturunuz ve değer atayınız
        byte ogrenciYasi = 18;

        //short data type:
        //tam sayılar için kullanılır, hafızada 2 byte yer kaplar
        //short : -32768 den +32767 e (dahil) kadar tamsayı değerleri için kullanılır

        //Örnek 5: Site nüfusu için bir variable oluşturup değer atayınız.
        short siteNufusu = 1300;

        //int data type
        //tam sayılar için kullanılır, hafızada 4 byte yer kaplar
        //int : -2,147,483,648 ile 2,147,483,647 (dahil) kadar tamsayı değerleri için kullanılır

        //örnek 6: ülke nüfusları için bir variable oluşturup değer ataması yapınız.
        int ulkeNufusu = 1487557123;

        //long data type:
        //tam sayılar için kullanılır, hafızada 8 byte yer kaplar
        //long : -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 (dahil) kadar tamsayı değerleri için kullanılır

        // Örnek 7: insan vücudundaki hücre sayısı için variable oluşturup değer ataması yapınız.

        //Note : Bir değer long ise sonuna "L" veya "l" konulur.
        long cellNumberInHumanBody = 1124443167675231243L;

        //Eğer long a atadığınız değer int lerin aralığında ise sonuna L koymaya gerek yok
        //long dememize rağmen sonuna L koymazsak, eğer int aralığında ise java onu int kabul eder.
        long weightUfSun = 1234561112;

        //float data type: 4 byte yer kaplar
        //float virgüllü sayılar (decimal number==> ondalıklı sayılar) için kullanılır.(Fiyatlandırmalar 12.99)

        //Örnek 8: Gömlek ve ayakkabı fiyatları için iki tane variable olşturun

        //Java ondalıklı sayıları otomatik ol. double kabul eder.
        //siz data type nı float yazarsanız hata alırsınız, float olmasında ısrar ediyorsanız sonuna "F" , "f" koymalısınız
        float shirtPrice =12.99F;
        float shoesPrice =15.99f;

        //double data type: 8 byte yer kaplar
        //ondalıklı kısmı için daha fazla rakam alabilir. Hücre ağırlığı gibi bilimsel çalışmalarda kullanılabilir.

        //Örnek 9: Hücre ağırlığı ve Amip in ağırlığı için ikitane variable oluşturunuz.
        double weightCell = 0.00000000000013;
        double weightAmip = 0.00000000000003;

        //Örnek 10: Öğrenci notları için iki adet variable oluşturun ve toplamlarını ekrana yazdırınız.
        byte note1 = 50;
        byte note2 = 70;

        //System.out.println();  ekrana yazdırır.

        System.out.println(note1);
        System.out.println(note2);

        //System.out.println(); ekrana yazdırır ve pointer ı bir sonraki satıra koyar
        //System.out.print();   ekrana yazdırır ve pointer ı aynı satırda tutar


        //Homework
        /*
        1) 3 farklı data türünde variable oluşturun ve bunları farklı satırlarda yazdırın.
        2) ülke ve şehir isimleri için iki variable oluşturun ve bunları yazdırın.
        3) iki tamsayı türünde variable oluşturup toplamını yazdırın.
         */






        }







    }


