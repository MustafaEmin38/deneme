package day08stringmanipulationmemoryusageifstatement;

public class stringmani01tekrar {
    public static void main(String[] args) {
        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol length() methodu ile cozum  ==>(kova var ama su yok 0 dır. Kova da yok su zaten yok null dır)
        String str = "";
        boolean karakterVarmi=str.length()==0;
        System.out.println("sonuc1/1.yol= "+karakterVarmi);

        //2.yol tavsiye edilir
        //Java eger bir konuda method olusturmussa, o methodu kullanmak en iyisidir.
        //is.Empty() hiçlik kontrolü yapar.Bu methodda karakter de space de olmamalidir.İkisi de yoksa true verir
        //Bir space bile olsa false döndürür.
        boolean karakterVarmi2=str.isEmpty();
        System.out.println("sonuc1/2.yol= "+karakterVarmi2);


        //Ornek 2:Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz
        String t = " ";
        //1. yol
        boolean spaceDisinda=t.replace(" ","").length()==0;
        System.out.println("sonuc2/1.yol= "+spaceDisinda);

        //2. yol
        boolean spaceDisinda2=t.replace(" ","").isEmpty();
        System.out.println("sonuc2/2yol= "+spaceDisinda2);

        //3. yol
        //is.Blank() bosluk değil karakter kontrolü yapar.Karakter yoksa true, varsa false verir.
        //Space varsa da true dondurur.
        boolean spaceDisinda3=t.isBlank();
        System.out.println("sonuc2/3yol= "+spaceDisinda3);

        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic birsey icin true verir
        //isEmpty() methodu sadece hic birsey icin true verir.

        //Ornek 3: Bir string de a, i, e characterlerinin ilk gorunumlerinin (metinde ilk gectigi yerin indexi) indexleri
        // toplamini ekrana yazdiriniz.
        // "Java is easy to learn" ==>   1 + 5 + 8 ==> 14
        //  0123456789.....index
        String r = "Java is easy to learn";
        int indA=r.indexOf('a');
        System.out.println(indA);
        int indI=r.indexOf('i');
        System.out.println(indI);
        int intE=r.indexOf('e');
        System.out.println(intE);
        System.out.println(indA+indI+intE);



        //Ornek 4: Bir string deki "Java" kelime sinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        //  "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz
        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int indJava=u.indexOf("Java");
        System.out.println(indJava);

        //indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder.
        int jVarmi=u.indexOf('j');
        System.out.println(jVarmi);


        //Ornek 5:  Bir string de a, i, e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //          0123456789
        String v = "Java is easy to learn";
        int aSon=v.lastIndexOf('a');
        System.out.println(aSon);
        int iSon=v.lastIndexOf('i');
        System.out.println(iSon);
        int eSon=v.lastIndexOf('e');
        System.out.println(eSon);
        System.out.println(aSon+iSon+eSon);



        //Note : lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir.


    }//main
}//Class
