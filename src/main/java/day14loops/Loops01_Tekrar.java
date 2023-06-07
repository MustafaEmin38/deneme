package day14loops;

public class Loops01_Tekrar {
    public static void main(String[] args) {
        //Ornek: Bir stringi ters ceviren kodu yaziniz
        //"Java"==> "avaJ"
        String j="Java";
        //1.yol
        for (int i = j.length()-1; i>=0 ; i--) {
            System.out.print(j.charAt(i));
        }

        System.out.println("");

        String ters="";
        for (int i = j.length()-1 ; i >=0; i--) {
            ters=ters+j.substring(i,i+1);
            System.out.print(ters);
        }

    }//main
}//class
