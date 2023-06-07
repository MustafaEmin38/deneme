package day19passbyvaluemethodoverloading;

public class PassByValue02Tekrar {
    public static void main(String[] args) {
        String name="Tom Hanks";

        System.out.println(addTitle("Dr", name));//Dr Tom Hanks (methodla kopya string in basina "Dr" ekledik)

        System.out.println(name);//Tom Hanks (orj deger koruma altinda)

        name=addTitle("Dr",name);//burda orijinal degeri degistirmek istedik ve bir guncelleme yaptik, artik name degisti
        System.out.println(name);//Dr Tom Hanks


    }//main

    public static String addTitle(String title, String name){
       name = title+" "+name;
       return  name;
    }
}//class
