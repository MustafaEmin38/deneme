package day13loops;

public class Loops03Tekrar {
    public static void main(String[] args) {
         //Ornek 1 : Verilen bir string de kucuk harfleri console a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
        String some="Pwd12?Ab";
        System.out.println(some.replaceAll("[a-z]", ""));


        for (int i=0;i<some.length()-1;i++){
            char krk=some.charAt(i);
            if(krk>='a'&& krk<='z'){
                continue;
            }System.out.print(krk);
        }


    }//main
}//class
