package day23datetimevarargs;

public class Varargs01Tekrar {
    public static void main(String[] args) {

        //Toplama islemi yapan bir method olusturn
        System.out.println(add(2,3,4));


    }//main
    public static int add(int ... a){//buraya bir varargs daha koysam "int...b" gibi. unused code olur ve "compile time eror" verir
        int toplam=0;

            for ( int w : a ) {
                toplam=toplam+w;
            }
            return toplam;
 }

}//class
