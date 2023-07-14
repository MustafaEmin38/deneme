package day31mapsexceptions;

public class E03Tekrar {
    public static void main(String[] args) {

        String s="Java";
        getCharFromString(s,2);//v

        String t="Java";
        getCharFromString(s,4);//
    }//main

    //String lerde var olmayan index kullanildiginda java StringIndexOutOfBoundsException atar
    private static void getCharFromString(String s, int idx) {

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullanim hatasi yaptiniz..."+e.getMessage());//Olamayan index kullanim hatasi yaptiniz...String index out of range: 4

            System.out.println(e.getCause());//null ==> tanimli olsaydi hatanin sebebini verecekti
            e.printStackTrace();
            System.out.println("kod calismaya devam etti");
            /*
            java.lang.StringIndexOutOfBoundsException: String index out of range: 4
	            at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
	            at java.base/java.lang.String.charAt(String.java:693)
	            at day31mapsexceptions.E03Tekrar.getCharFromString(E03Tekrar.java:17)
	            at day31mapsexceptions.E03Tekrar.main(E03Tekrar.java:10)
             */
        }
    }
}//class


        /*method icindeki; try catch icine almak istedigimiz kodlari 3 sekilde içine aliriz
            1. high lighted yapip ctrl+alt+t ye basarsak
            2. high lighted yapip en ustte "code" ye tiklayip try catch i secersek
            3. kod bittiginde . ya basip try secersek try icine alir
         */