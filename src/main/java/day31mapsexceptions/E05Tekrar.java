package day31mapsexceptions;

public class E05Tekrar {
    public static void main(String[] args) {
        int a=12;
        int b=1;
        String s="Java";
        getCharFromString(s,a,b);

    }//main

    public static void getCharFromString(String s,int a,int b){

        try {
            int idx = a / b ;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }

        /*
        try kisminda birden fazla exception olusturma ihtimali olan kod varsa coklu catch kullanabilirsiniz
        coklu catch kullandiginizda exception classlar arasinda parent-child iliskisi yoksa catch lerin sirasi onemli degildir.
        Ama koddaki siralamaya uymak tavsiye edilir

        Coklu catch kullandiginzda exception classlar arasinda parent-child iliskisi varsa catch lerin sirasi onemlidir,
        child olan class ustte olmalidir

         */

    }



}//class
