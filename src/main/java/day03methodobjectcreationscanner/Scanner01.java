package day03methodobjectcreationscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Scanner Class:Java tarafından "UTIL LIBRARY" icerisinde, kullanicidan data almak icin olusturulmus hazir bir class tir.
        //Bu özl ten yararlanmak icin bu classtan bir object olusturmam gerekiyor
        //1.Adim: Scanner class tan object olustur
        Scanner input = new Scanner(System.in);
        //bu object i yazinca yukaridaki "import java.util.Scanner;" geldi.
        //BU "Java nin util kutuphanesinden scanner class import edildi" demek.
        //Parantez icine "System.in" yazariz. bu da "dısaridan sisteme girdi yap." demek.

        //2.Adim:Kullaniciya ne istedigimize dair mesaj veririz.
        System.out.println("Lutfen yasinizi giriniz : ");

        //3. Adim: Uygun methodu kullanarak kullanicinin verdigi data yi memory e yerlestiriniz
        byte age = input.nextByte();
        System.out.println("age = " + age);


       /*
        1.adim: Scanner class tan object olustur
        Scanner input = new Scanner(System.in);
        2.Adim:Kullaniciya ne istedigimize dair mesaj veririz.
        System.out.println("Lutfen yasinizi giriniz = ");
        3. Adim: Uygun methodu kullanarak kullanicinin verdigi data yi memory e yerlestiriniz
        byte age =  input.nextByte();
        System.out.println("age = " + age);
        */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi yaziniz");
        byte yas=input.nextByte();
        System.out.println("yas = " + yas);
        */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("dogum tarihiniz");
        byte year = input.nextByte();
        System.out.println("year = " + year);
        */

        /*
        Scanner dataBase = new Scanner(System.in);
        System.out.println("evlilik yılınız kaç:");
        int year = dataBase.nextInt();
        System.out.println("year = " + year);
        */


    }//main method
}//class