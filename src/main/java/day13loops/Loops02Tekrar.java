package day13loops;

public class Loops02Tekrar {
    public static void main(String[] args) {
        //Ornek 1: 21 den 180 kadar hem 2 hem 3 ile tam bolunebilen tam sayilari ekrana yazdiran kodu yaziniz.
        for (int i = 21; i < 181; i++) {
            if (i%2==0 && i%3==0){
                System.out.print(i+"/");
            }
        }
        System.out.println("");
        //Ornek 2: Size verilen, kucuk harfle yazilmis stringin; index i cift sayi olan karakterlerini buyuk harfe donusturunuz
        // ankara ==> A-K-R
        // 012345
        String city="barcelona";
        //           012345678
        for (int i = 0; i < city.length(); i++) {

            String cityCh=city.toUpperCase().substring(i, i + 1);

            if (i % 2 == 0) {
                System.out.print(cityCh);//BREOA
            }
        }
        System.out.println("");

        //Ornek 3: Verilen bir String de ilk a harfinden onceki tum characterleri console a yazdiriniz
        // "I love Java"  ==>  "I love J"
        String jv="I love Java";

        for (int i=0;i<jv.length();i++){
            char java=jv.charAt(i);
            if (java=='a'){
                break;
            }
            System.out.print(java);
        }
        System.out.println("");
        //Ornek 4: Verilen  bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz..
        //      "Germany" ==> yn
        String k="Germany";
        for (int i = k.length()-1; i >=0 ; i--) {
            char kk=k.charAt(i);
            if (kk=='a'){
                break;
            }
            System.out.print(kk);
        }
        System.out.println("");

        //* Ornek 4plus: Verilen  bir string de son 'U' dan sonraki tum characterleri ters sirada yazdiriniz.
        String st="United States Of America";
        for (int i = st.length()-1 ; i >=0 ; i--) {
            if(st.charAt(i)=='U'){
                break;
            }
            System.out.print(st.charAt(i));


        }



    }//main
}//class
