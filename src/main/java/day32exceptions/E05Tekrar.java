package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05Tekrar {
        //E04 ile ayni cozumu yapacagiz ama bu defa "Add exc" degil "Surround with try catch" ile cozecegiz
        public static void main(String[] args) {

            try {

                FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");
                int k = 0;
                while ((k = fis.read()) != -1) {
                    System.out.print((char) k);
                }

            } catch (FileNotFoundException e) {//child old icin FileNotF.. yukari yazdik IO asagi yazdik
                System.err.println(e.getMessage());

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            /*
        1) FileNotFoundException ve IOException Compile Time Exceptionlardir, yani code yazarken hata aliriz
        2) FileNotFoundException path(path=> adres demek) in dogrulugu ve dosyanin varligi ile ilgilidir
            IOException tum input ve output islemleri ile ilgliidir
        3)  IOException class FileNotFoundException classin parentidir
            istenirse FileNotFoundException yerine IOException da kullanilabilir
        4) IOException Class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte
             IOException altta kullanilmalidir
         */
    }
}