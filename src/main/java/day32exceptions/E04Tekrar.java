package day32exceptions;

import java.io.FileInputStream;//io ==> input output
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04Tekrar {

        /*
        Exception lar 2 ye ayrilir
        1. Run time Exception lar =>calisma zamaninda, console da ortaya cikan exception.
           Run yapana kadar her sey normal gorunur, run yapinca exception verir.
           Run time Exception lara Unchecked Exception da denir
        Ornekler:
        *StringIndexOutOfBoundsException
        *NullPointerException
        *ArithmeticException
        *NumberFormatException
        *ArrayIndexOutOfBoundsException

        2. Compile time Exception => run yapmadan, daha kod yazarken ortaya cikan exception
        kod yazarken kirmizi alt cizgiseklinde alinan Exception lardir.
        *FileNotFoundException, *IOException compile time exception lara ornektir
        Compile Time Exception lara Checked Exception da denir

         */
        //FileInputStream
        //file lara ulasmak, gidip file dan data almak icin javanin olusturdugu class
        //yazacagimiz kodla file a ulasip oradaki yaziyi okuyup console a yazdiracagiz
        public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/fileTekrar.txt");

        /*
        *FileInputStream classindan object olusturdugumuzda CompileTimeExc verir.Const da () icine file adresini yazariz
        *Exception devam eder, more actions a gideriz.Sunulan seceneklerden main method signature a "Add exc..." seceriz.(throws ekler)
        *Bu handle yi sectigimizde "verdigim adreste dosyayi bulamazsan calismayi durdur ve bana exc firlat" demis oluruz.
        *"throws" cogul old icin pesine birden fazla exc ekleyebiliriz(basina new koyamayiz)

        * throw ile throws keywordleri arasindaki fark nedir?==>throw 1 exceptiona izin veriyo, throws birden fazla
        throw ile throws keywordleri arasindaki fark nedir?
        1) throw  method body si icinde throws ise method parantezinden hemen sonra kullanilir
        2) throw method body si icinde istenilen yerde istenildigi kadar kullanilir
            throws ise method parantezinden hemen sonra sadece bir kere kullanilabilir
        3) throw dan sonra new keyword ve constructor kullanilarak obje olusturulur
            throws dan sonra sadece Exception class ismi yazilir
        4) throw belli sartlar icin Exception firlatmada kullanilir
           throws ise bir methodun belli bir Exception u firlatabilecegini belirtmek icin kullanilir
         */

            int k = 0;

            while((k=fis.read()) !=-1 ){// txt adresine gidip tek tek karakteri alir ascii degerini verir(ilk J)___krk yoksa -1 verir


                System.out.print((char) k);// (char)>> ascii degeri karaktere cevirir
            }
            //fis objectinden read methodunu cagirdik.CTE verdi.more actions a gideriz. method signature a "Add exc..." seceriz.
            //onceden ekledigimiz "throws FileNotFoundException" IOException a donusur.cunku IO parent tir digeri childdir.

    }
}
