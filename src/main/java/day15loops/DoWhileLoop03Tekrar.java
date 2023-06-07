package day15loops;

import java.util.Scanner;

public class DoWhileLoop03Tekrar {

    public static void main(String[] args) {
         /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz */
        Scanner scan=new Scanner(System.in);
        String userName="admin";
        String  userPass="pwd123";

        int i=1;

        do {
            if (i==4){
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }
            System.out.println("Lutfen kullanici adi yaziniz");
            userName=scan.next();
            System.out.println("Lutfen kullanici sifresi yaziniz");
            userPass=scan.next();
            if (userName.equals("admin")&&userPass.equals("pwd123")){
                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            }
            i++;
        }while (i<=4);


    }//Main
}//Class
