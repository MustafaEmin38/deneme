package day10ifstatements;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

    //Homework
    //1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
    //ve kullaniciya uygun mesaj veren kodu yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu yaziniz");
        String password=scan.next();

         if (password.equals("pwd123!")){
             System.out.println("Tebrikler,passwordunuzu duogru yazdiniz");
         }else {
             System.out.println("Hatali giris yaptiniz,lutfen kontrol ediniz");
         }


    //2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
    //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi yaziniz:");
        String name=input.next();

        if (name.equalsIgnoreCase("Pazar")) {
            System.out.println("1.gun");
        } else if (name.equalsIgnoreCase("Pazartesi")) {
            System.out.println("2.gun");
        } else if (name.equalsIgnoreCase("Sali")) {
            System.out.println("3.gun");
        } else if (name.equalsIgnoreCase("Carsamba")) {
            System.out.println("4.gun");
        } else if (name.equalsIgnoreCase("Persembe")) {
            System.out.println("5.gun");
        } else if (name.equalsIgnoreCase("Cuma")) {
            System.out.println("6.gun");
        } else if (name.equalsIgnoreCase("Cumartesi")) {
            System.out.println("7.gun");
        } else {
            System.out.println("Hatali giris yaptiniz");
        }


        //3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
        //  1==> January, 2 ==> February .....
        Scanner inPut = new Scanner(System.in);
        System.out.println("1-12 arasinda bir ay sayisi yaziniz");
        byte monthNum = inPut.nextByte();
        if (monthNum == 1) {
            System.out.println("January");
        } else if (monthNum == 2) {
            System.out.println("February");
        } else if (monthNum == 3) {
            System.out.println("March");
        } else if (monthNum == 4) {
            System.out.println("April");
        } else if (monthNum == 5) {
            System.out.println("May");
        } else if (monthNum == 6) {
            System.out.println("June");
        } else if (monthNum == 7) {
            System.out.println("July");
        } else if (monthNum == 8) {
            System.out.println("August");
        } else if (monthNum == 9) {
            System.out.println("September");
        } else if (monthNum == 10) {
            System.out.println("October");
        } else if (monthNum == 11) {
            System.out.println("November");
        } else if (monthNum == 12) {
            System.out.println("December");
        } else {
            System.out.println("Hatali giris yaptiniz");
        }

    }//main
}//class
