package day05concatinationoperatorstypecasting;

public class MyTekrar_AsciiValues {
    public static void main(String[] args) {
         /*
        java da her karakterin sayisal bir degeri vardir.
        Bu degerler ASCII degerler olarak adlandirilir
        Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir
         */
        char a = 'a';
        System.out.println(a);

        //Herhangi bir character in ASCII degerini bulmak icin o karakteri "int" data type inda bir variable icine koyariz
            //byte da olur(yani tam sayi kavanozuna koymak gerekir)
        int intA = 'a';
        System.out.println(intA); //97

        char x = 'x';
        int xKactir = x;
        System.out.println(xKactir); //120

        byte unlem = '!';
        System.out.println(unlem);//33

        char c1 = 'K';
        char c2 = '?';
        System.out.println(c1+c2); //138
        //Java da eger char lari matematiksel islemlerde kullanirsaniz, java char larin ASCII degerlerini kullanir

    }//Main
}//Class
