package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        // Ornek 1: Bir string in basinda ve sonunda space karakteri varsa siliniz.
        // "   Ali Can   "==> "Ali Can"
        String s = "   Ali Can   ";
        System.out.println(s);
        // trim() method u bi string in basinda ve sonundaki space karakterlerini siler aradaki space lere dokunmaz.

        /*
        String sTrimed = s.trim();
        System.out.println(sTrimed);
        */
        String k =s.trim();
        System.out.println(k);//Ali Can

        //Ornek 2: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //String tv = "$456.99"; String laptop = "$875.99";  ==>456.99+875.99 = 1332.98
        String tv = "$456.99";
        String laptop = "$875.99";

        /*
        String tv2=tv.replace("$","");
        System.out.println(tv2);
        String laptop2=laptop.replace("$","");
        System.out.println(laptop2);
        double totalPrice=Double.valueOf(tv2) + Double.valueOf(laptop2); //valueOf ile String i double a cevirdi. "" kaldırdı
        System.out.println(totalPrice);
        */
        String tvNoDollar=tv.replace("$","");
        String laptopNoDollar=laptop.replace("$","");
        double toplamFiyat= Double.valueOf(tvNoDollar)+Double.valueOf(laptopNoDollar);
        System.out.println("toplamFiyat = " + toplamFiyat);//toplamFiyat = 1332.98

        //Ornek 3: Verilen ismin ilk isminin ilk harfini ve son isminin ilk harfini ekrana yazdiriniz
        //"  Ali Can  "==> AC
        String name = "   ali cAN  ";
        //split () method u, bir stringi istedigimiz karakterden parcalamaya yarar,o
       char ilkKarakter = name.trim().toUpperCase().charAt(0);
       System.out.println(ilkKarakter);//A
       char ikinciKarakter = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(ikinciKarakter);//C
        System.out.println(""+ilkKarakter+ikinciKarakter);//AC

        /*
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A
        char last =name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);//C
        System.out.println(""+first+last);//AC
         */


    }//Main Method
}//Class
