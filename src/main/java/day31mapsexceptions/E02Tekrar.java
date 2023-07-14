package day31mapsexceptions;

public class E02Tekrar {
    public static void main(String[] args) {
        String s="1234";
        convertStringToInt(s);

        String t="123a";
        convertStringToInt(t);

    }//main

    //Icinde rakamlar disinda character olan bir string i sayiya cevirmek isterseniz NumberFormatException alirsiniz
    public static void convertStringToInt(String s){
        try{
            Integer intS = Integer.valueOf(s);
            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("Bir String in sayiya donusturulebilmesi icin rakam disinda karakter icermemesi gerekir");
            System.out.println(e.getMessage());//Log da bulunan teknik mesaji bu sekilde kullaniciya verdik
        }


    }

}//class
