package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

       Eger calisan kadin ise;

         60 yasindan buyukse "Emekli Olabilir "yazdirin

       Eger calisan erkek ise;

        65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz    */

       Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        int yas=scan.nextInt();
        System.out.println("Lutfen cinsiyetinizi belirtiniz:");
        String cinsiyet=scan.next();


        if (yas<0 || yas>120){
            System.out.println("Uygun aralikta bir deger yaziniz");
        } else if (cinsiyet.equalsIgnoreCase("kadin")){
            if (yas>60){
                System.out.println("Emekli olabilir.");
            }else {
                System.out.println("Calismaya devam etmelidir");
            }
        } else if (cinsiyet.equalsIgnoreCase("Erkek")){
            if(yas>65){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Calismaya devam etmelidir");
            }
        } else {
            System.out.println("Uygun bir deger yaziniz");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz..");
        String gender = input.next();

        System.out.println("Yasinizi giriniz..");
        int age = input.nextInt();

        if(age<0 || age>120){

            System.out.println("Lutfen yasi 0 ile 120 arasinda giriniz");

        }else if(gender.equalsIgnoreCase("Kadin")){

            if(age>60){
                System.out.println("Emekli olabilir..");
            }else{
                System.out.println("Calismali..");
            }
        }else if(gender.equalsIgnoreCase("Erkek")){
            if(age>65){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Kesinlikle calismali...");
            }
        }else{
            System.out.println("Tanimli degil..");
        }

        //tanimli olmayan bi cinsiyet degeri girerse yasi girmeden uyarı versek daha iyi olazmı




    }
}