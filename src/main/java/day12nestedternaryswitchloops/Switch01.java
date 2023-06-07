package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Note: Java da kodlarimizi yazarken nested yapilardan mumkun oldugunca uzak durmaliyiz
        // cunku bu tarz yapilar uygulamayi yavaslatir.(Time Consuming)
        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7

        //1. Yol if else cozumu

        String dayName = "MONday";

        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        }else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        }else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        }else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        }else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        }else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        }else{
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }

        //2. yol switch

        switch (dayName.toLowerCase()){
            case "sunday" :
                System.out.println(1);
                break;
            case "monday" :
                System.out.println(2);
                break;
            case "tuesday" :
                System.out.println(3);
                break;
            case "wednesday" :
                System.out.println(4);
                break;
            case "thursday" :
                System.out.println(5);
                break;
            case "friday" :
                System.out.println(6);
                break;
            case "saturday" :
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli gun ismi giriniz");
        }
        //2 senaryo varsa Ternary
        //3 ve daha cok senaryo varsa Switch tavsiye edilir
        //Nested yapılari Java sevmez cunku ZAMAN i somurur

        //* Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi yaziniz");
        String gunAdi=scan.next();

        //1.yol-if ile cozum
        if (gunAdi.equalsIgnoreCase("sunday")) {
            System.out.println("1");
        } else if (gunAdi.equalsIgnoreCase("monday")) {
            System.out.println("2");
        }else if (gunAdi.equalsIgnoreCase("tuesday")) {
            System.out.println("3");
        }else if (gunAdi.equalsIgnoreCase("wednesday")) {
            System.out.println("4");
        }else if (gunAdi.equalsIgnoreCase("thursday")) {
            System.out.println("5");
        }else if (gunAdi.equalsIgnoreCase("friday")) {
            System.out.println("6");
        }else if (gunAdi.equalsIgnoreCase("saturday")) {
            System.out.println("7");
        } else {
            System.out.println("Hatali girdin emmiiii:))");
        }

        //2.yok-switch ile cozum
        switch (gunAdi.toLowerCase()){
            case "sunday":
                System.out.println("1");
                break;
            case "monday":
                System.out.println("2");
                break;
            case "tuesday":
                System.out.println("3");
                break;
            case "wednesday":
                System.out.println("4");
                break;
            case "thursday":
                System.out.println("5");
                break;
            case "friday":
                System.out.println("6");
                break;
            case "saturday":
                System.out.println("7");
                break;
            default:
                System.out.println("Gecerli bir gun adi giriniz");}
    }//Main
}//Class
