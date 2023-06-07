package day07stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String t = "Ali 13 yasindadir!...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz

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
           10)Sadece space karakteri ==> [ ]
              Sadece space karakteri ==> \\s
              Sadece space karakteri haric ==> \\S

              Sadece rakamlar ==> \\d
              rakamlar haric ==> \\D

         */
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

        String x1=t.replaceAll("[0-9]","&");
        System.out.println(x1);//Ali && yasindadir!...

        //Ornek 2: t stringindeki tum rakamlari ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[0-9a-zA-Z]","!");
        System.out.println(t2);//  !!! !! !!!!!!!!!!!...

        String x2=t.replaceAll("[0-9a-zA-Z]","%");
        System.out.println(x2);//%%% %% %%%%%%%%%%!...

        //Ornek 3: t stringindeki tum sesli harleri ? ne ceviriniz.
       String t3 =  t.replaceAll("[aeiouAEIOU]","?");
       System.out.println(t3);//  ?l? 13 y?s?nd?d?r!...

        String x3=t.replaceAll("[aeıouAEIOU]","#");
        System.out.println(x3);//#li 13 y#sind#dir!...

        //Ornek 4:  t stringindeki kucuk harfler disindaki tum karakterleri "<>" ceviriniz.
        String t4 =t.replaceAll("[^a-z]","<>");
        System.out.println(t4); // <>li<><><><>yasindadir<><><><>

        String x4=t.replaceAll("[^a-z]","><");
        System.out.println(x4);//><li><><><><yasindadir><><><><

        //Ornek 5: t stringindeki tum harfler disindaki tum karakterleri "$" a ceviriniz.($ yapmak icin \\$ koymaliyiz)
        String t5 =t.replaceAll("[^a-zA-Z]","\\$");
        System.out.println(t5);//  Ali$$$$yasindadir$$$$

        String x5 = t.replaceAll("[^a-zA-Z]","*");
        System.out.println(x5);//Ali****yasindadir****

        //Ornek 6: t stringindeki space ler disindaki tum karakterleri "*" ceviriniz
        String t6 = t.replaceAll("[\\S]","?");  // ==>  \\S veya [^ ]
        System.out.println(t6);//  ??? ?? ??????????????


        String x6=t.replaceAll("[^ ]","+");
        System.out.println(x6);//+++ ++ ++++++++++++++

        //Ornek 7: t stringdeki sesli harfler disindaki tum karakterleri & e cevir
        String t7 =t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7); //  A&i&&&&&a&i&&a&i&&&&&

        String x7=t.replaceAll("[^aeiouAEIOU]","%");
        System.out.println(x7);//A%i%%%%%a%i%%a%i%%%%%



    }//Main method
}//Class