package day14loops;

public class Loops01Tekrar {
    public static void main(String[] args) {
        //Ornek: Bir stringi ters ceviren kodu yaziniz
        //"Java"==> "avaJ"
        //1.Yol:
        String s="Java";
        String sTers="";

        for (int i= s.length()-1; i>=0; i--){
            sTers=sTers+s.substring(i,i+1);
        }
        System.out.print(sTers);
        System.out.println("");


        //2.Yol:
        String t="Reyyan";
        String tTers="";

        for (int i=t.length()-1; i>=0; i--){

            tTers=tTers + t.charAt(i);
        }
        System.out.println(tTers);

        //Ornek 2 Size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz
        //         ey edip adanada pide ye , nalan, kucuk, ada
        //Logic : String i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise Palindrome dur.

        String k="Ey edip adanada pide ye";
        String kT="";

        for (int i = k.length()-1 ; i>=0 ; i--) {
            kT=kT+k.charAt(i);
        }
        System.out.println(kT);
        if (k.equalsIgnoreCase(kT)){
            System.out.println("palindrome string");
        }else {
            System.out.println("not palindrome string");
        }

    }//Main
}//Class
