package day23datetimevarargs;

public class Varargs02Tekrar {
    public static void main(String[] args) {
//Example 2: Verilen isimlerini ilk harflerin console'a yazdiran method'u olusturunuz.
        //           Ali Can ==> AC    Kemal Han ==> KH

        firstLettterPrint("Mustafa Emin Baltat", "Amasya Hacilar Meydani");


    }//main

    public static void firstLettterPrint(String...a){

        String letter="";

        for (String i : a) {
            letter=letter+i.charAt(0)+i.split(" ")[1].charAt(0)+i.split(" ")[2].charAt(0);
            System.out.println(letter);

            letter="";

        }
    }

}//class
