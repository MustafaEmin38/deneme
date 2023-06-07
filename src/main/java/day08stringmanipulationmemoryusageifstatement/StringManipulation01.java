package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol length() methodu ile cozum  ==>(kova var ama su yok 0 dır. Kova da yok, su zaten yok null dır)
        String str = "";
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? " + result1);//String bos mu? true
        boolean karakterVarmi=str.length()==0;
        System.out.println("sonuc1/1.yol= "+karakterVarmi);//sonuc1/1.yol= true

        //2.yol tavsiye edilir
        //Java eger bir konuda method olusturmussa, o methodu kullanmak en iyisidir.
        //is.Empty() hiçlik kontrolü yapar.Bu methodda karakter de space de olmamalidir.İkisi de yoksa true verir
        //Bir space bile olsa false döndürür.
        boolean result2 = str.isEmpty();
        System.out.println("is Empty ? " + result2);//is Empty ? true
        boolean karakterVarmi2=str.isEmpty();
        System.out.println("sonuc1/2.yol= "+karakterVarmi2);//true


        //Ornek 2:Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz
        String t = " ";
        //1. yol
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println(result3);//true
        boolean spaceDisinda=t.replace(" ","").length()==0;
        System.out.println("sonuc2/1.yol= "+spaceDisinda);//true

        //2. yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);//true
        boolean spaceDisinda2=t.replace(" ","").isEmpty();
        System.out.println("sonuc2/2yol= "+spaceDisinda2);//true

        //3. yol
        //is.Blank() bosluk değil karakter kontrolü yapar.Karakter yoksa true, varsa false verir.
        //Space varsa da true dondurur.
        boolean result5 = t.isBlank();
        System.out.println(result5);
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
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println(idxA + idxE + idxI);//14

        int indA=r.indexOf('a');
        System.out.println(indA);//1
        int indI=r.indexOf('i');
        System.out.println(indI);//5
        int intE=r.indexOf('e');
        System.out.println(intE);//8
        System.out.println(indA+indI+intE);//14

        //Ornek 4: Bir string deki "Java" kelime sinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        //  "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz
        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        int indJava=u.indexOf("Java");
        System.out.println(indJava);//3


        //indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder
        int idxjava = u.indexOf("java");
        System.out.println(idxjava);//-1

        int jVarmi=u.indexOf('j');
        System.out.println(jVarmi);//-1

        //Ornek 5:  Bir string de a, i, e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //          0123456789
        String v = "Java is easy to learn";

        int idxOfa=v.lastIndexOf('a');
        System.out.println(idxOfa);//18

        int idxOfe=v.lastIndexOf('e');
        System.out.println(idxOfe);//17

        int idxOfi=v.lastIndexOf('i');
        System.out.println(idxOfi);//5

        System.out.println(idxOfa+idxOfe+idxOfi);//40

        int aSon=v.lastIndexOf('a');
        System.out.println(aSon);//18
        int iSon=v.lastIndexOf('i');
        System.out.println(iSon);//17
        int eSon=v.lastIndexOf('e');
        System.out.println(eSon);//5
        System.out.println(aSon+iSon+eSon);//40

        //Note : lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir.

    }//main
}//class