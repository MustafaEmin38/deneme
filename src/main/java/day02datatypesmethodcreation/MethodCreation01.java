package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Javada method nasıl oluşturulur?

    1) main method un dışında class ın içinde oluşturulur
    2)Access modifier  + return type  + method ismi + ()  + {}

    Oluşturulan method lar nasıl kullanılır?
    1) Method u oluşturmak methodu çalıştırmak için yeterli değildir. Kullanılmak istenen
    method main methodun içinden kullanılır.
    2)Method un ismi  +  () yazın
       varsa işlem yapacağınız dataları parantezin içine koyun
       bu işlem method call (method çağırma) olarak adlandırılır.
    3) methodun ismi + parametreler ===> method signature
     */
    public static void main(String[] args) {
       int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(4,5);
        System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));

        System.out.println(dikdortgeninAlani(4,5));

        System.out.println(dikdortgeninCevresi (6,8));

        int snc= cemberCevre(2,3);
        System.out.println(snc);


    }//main method

    // Örnek 1: toplama işlemi yapan bir method oluşturun ve  kullanınız
    public static int toplamaYap(int a, int b){// bu kısımda method kapsamında kullanılmasını ve işlenmesini istediğimiz data ları declare ederiz
        return a+b;
        // return demek bu method un çağrıldığı yere bu değeri return et demek
        // main method statik old. için main method içinde kullanacağımız method static olmalıdır.
    }

    //Örnek 2: iki sayıyı çarpma işlemi yapan bi method oluşturun ve kullanın.
    protected static long multiply (int a, int b){

        return a*b;
    }

    // Örnek 3: verilen 3 sayıdan ilk ikisini çarpan ve üçüncü sayı ile sonucu toplayan methodu oluşturun ve kullanın
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){

        return a*b+c;
    }

    //Homewok
    //1)Dikdörtgenin alanını hesaplayan methodu oluşturun ve kullanın
    public static long dikdortgeninAlani (int a, int b){

        return a*b;
    }

    //2)Dikdörtgenin çevresini hesaplayan methodu oluşturun ve kullanın
        protected static int dikdortgeninCevresi (int a, int b){

        return (a+b)*2;
        }

        //cemberin cevresini hesaplayan bir method yaz ve kullan.
    public static int cemberCevre(int r, int pi){
       return  2*pi*r;
    }
}//class
