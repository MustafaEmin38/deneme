package day32exceptions;

import java.io.FileInputStream;//input output
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {

       /*exception lar ikiye ayrılır
    1) Run button una bastiktan sonra console da alinan Exceptionlara "Runtime Exception" denir
        ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException,
        StringIndexOutOfBoundsException.... RunTime Exception lara ornektir
        Runtime Exceptionlara Unchecked Exception da denir

    2) Code yazarken kirmizi alt cizgi seklinde alinan Exception lar da vardir, bunlara da "Compile Time Exception" denir
        FileNotFoundException, IOException compile time exception lara ornektir
        Compile Time Exception lara Checked Exception da denir

        throw ile throws keywordleri arasindaki fark nedir?==>throw 1 exeptiona izin veriyo, throws birden fazla
        throw ile throws keywordleri arasindaki fark nedir?
        1) throw  method body si icinde throws ise method parantezinden hemen sonra kullanilir
        2) throw method body si icinde istenilen yerde istenildigi kadar kullanilir
            throws ise method parantezinden hemen sonra sadece bir kere kullanilabilir
        3) throw dan sonra new keyword ve constructor kullanilarak obje olusturulur
            throws dan sonra sadece Exception class ismi yazilir
        4) throw belli sartlar icin Exception firlatmada kullanilir
           throws ise bir methodun belli bir Exception u firlatabilecegini belirtmek icin kullanilir



     */
        public static void main (String[]args) throws IOException, FileNotFoundException {//IO>> parent FileNot>> chilh

            FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");

            int k=0;

            while ((k=fis.read())!=-1){// txt adresine gidip karakteri alir ascii degerini verir(ilk J)___krk yoksa -1 verir
                System.out.print( (char) k);// (char)>> ascii degeri karaktere cevirir
            }

        }//main


    }