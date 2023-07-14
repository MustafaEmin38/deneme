package day29collections;

import java.util.HashSet;
import java.util.SortedMap;
import java.util.TreeSet;

public class Sets02Tekrar {
    public static void main(String[] args) {// ==>  interview da sorulabilir
        //Ornek: Ogrenci email adreslerini natural order da siralanmis olarak depolayiniz.

        long t1=System.nanoTime();
        //1.way
        TreeSet<String> emails=new TreeSet<>();//Natural order la yerlestirdi, o ned. cok yavas
        emails.add("a@gmail.com");
        emails.add("v@gmail.com");
        emails.add("c@gmail.com");
        emails.add("k@gmail.com");
        emails.add("m@gmail.com");
        emails.add("z@gmail.com");
        emails.add("e@gmail.com");
        emails.add("p@gmail.com");
        emails.add("n@gmail.com");
        emails.add("d@gmail.com");
        emails.add("t@gmail.com");

        System.out.println(emails);//[a@gmail.com, c@gmail.com, d@gmail.com, e@gmail.com, k@gmail.com, m@gmail.com, n@gmail.com, p@gmail.com, t@gmail.com, v@gmail.com, z@gmail.com]
        long t2=System.nanoTime();

        //2.way
        HashSet<String> emailsHs=new HashSet<>();//Rastgele yerlestirdi, o ned. superfast
        emailsHs.add("a@gmail.com");
        emailsHs.add("v@gmail.com");
        emailsHs.add("c@gmail.com");
        emailsHs.add("k@gmail.com");
        emailsHs.add("m@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("e@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("n@gmail.com");
        emailsHs.add("d@gmail.com");
        emailsHs.add("t@gmail.com");

        TreeSet<String> emailsHsTs=new TreeSet<>(emailsHs);//HashSet le superfast yerlestirilmis ama Natural Order olmayan
                                                           // emailsHs yi, tipki sort la siralar gibi TreeSet siralattik.
        System.out.println(emailsHsTs);
        long t3=System.nanoTime();

        System.out.println("TreeSet : "+(t2-t1));//TreeSet : 1944900
        System.out.println("HashSet : "+(t3-t2));//HashSet : 198800  ==> arada 10 kat fark var





    }
}
