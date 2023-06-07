package day06swapvaluesstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";
        String k = "Ogren Javayi kazan parayi";
        //Ornek 1: "s" string inin "money" ile bitip bitmedigini kontrol ediniz
        /*boolean isEnd = s.endsWith("money");//true
        System.out.println(isEnd);
         */
        boolean endMoney=s.endsWith("money");
        System.out.println("endMoney = " + endMoney);
        //* Ornek 1: "k" string inin "parayi" ile bitip bitmedigini kontrol ediniz
        boolean isEndParayi = k.endsWith("parayi");
        System.out.println(isEndParayi);//true

        //Ornek 2: "s" string indeki "money" kelimesini "dollar" kelimesine ceviriniz.
        /*String s1 = s.replace("money", "dollar");
        System.out.println(s1);//Learn Java earn dollar
         */
        String cevirDollar=s.replace("money","dollar");
        System.out.println("cevirDollar = " + cevirDollar);
        //* Ornek 2: "k" string indeki "parayi" kelimesini "dollar" kelimesine ceviriniz.
        String change1 = k.replace("parayi", "dollar");
        System.out.println(change1);

        //Ornek 3: "s" string indeki "earn" kelimesini "win" kelimesine ceviriniz.
        /*String s2 = s.replace("earn", "win");
        System.out.println(s2); //Lwin Java win money
        */
        String cevirWin=s.replace("earn","win");
        System.out.println("cevirWin = " + cevirWin);
        //* Ornek 3: "k" string indeki "ayi" kelimesini "money" kelimesine ceviriniz.
        String change2 = k.replace("ayi", "money");
        System.out.println(change2);

        // Ornek 4: "s" string indeki "a" harflerini "*" a ceviriniz
        /*
        String s3 = s.replace('a', '*');
        System.out.println(s3);//Le*rn J*v* e*rn money
         */
        String cevirYildiz=s.replace("a","*");
        System.out.println("cevirYildiz = " + cevirYildiz);
        //* Ornek 4: "k" string indeki "a" harflerini "*" a ceviriniz
        String change3 = k.replace("a", "*");
        System.out.println(change3);

        //Ornek 5: "s" string indeki "n" harflerini "xxx" a ceviriniz
        /*String s4 = s.replace("n", "xxx");
        System.out.println(s4); //Learxxx Java earxxx moxxxey
        */
        String cevirXxx=s.replace("n","xxx");
        System.out.println("cevirXxx = " + cevirXxx);
        //* Ornek 5: "k" string indeki "n" harflerini "xxx" a ceviriniz
        String change4 = k.replace("n", "xxx");
        System.out.println(change4);

        //Ornek 6: "s" string indeki "e" harflerini siliniz//char da hiçlik yok silmek icin string seçmeliyiz
        /*String s5 = s.replace("e", "");
        System.out.println(s5);//Larn Java arn mony
        */
        String silE=s.replace("e","");
        System.out.println("silE = " + silE);
        //* Ornek 6: "k" string indeki "a" harflerini siliniz
        String change5 = k.replace("a", "");
        System.out.println(change5);


        String t = "Ali 13 yasindadir!...";
        String es = "Esim 34 yasinda!...";
        //Ornek7: "t" stringindeki tum rakamlari "*" ceviriniz

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir
        /*
                        Meshur Regex
           1)Tum  rakamlar ==> [0-9]
           2)Tum kucuk harfler==> [a-z]
           3)Tum buyuk harfler==> [A-Z]
           4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
           5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
           6)Tum noktalama isaretleri==>\\p{Punct}
           7)Tum sesli harfler ==> [aeiouAEIOU]
             Tum x,q,w harfleri     ==> [xqw]

           8)Kucuk harflerden farkli tum characterler ==>[^a-z]
           9)Tum harflerden farkli tum characterler ==>  [^a-zA-Z]
         */

        /*String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...
        */

        String cevirYildiza=t.replaceAll("[0-9]","*");
        System.out.println("cevirYildiza = " + cevirYildiza);

        String es1 = es.replaceAll("[0-9]", "*");
        System.out.println(es1);
    }//main
}//class
