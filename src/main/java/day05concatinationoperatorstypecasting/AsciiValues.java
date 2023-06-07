package day05concatinationoperatorstypecasting;

public class AsciiValues {
    public static void main(String[] args) {
        /*
        java da her karakterin sayisal bir degeri vardir.
        Bu degerler ASCII degerler olarak adlandirilir
        Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir
         */
        char a = 'a';
        System.out.println(a);//a

        char buyukZ = 'Z';
        System.out.println("buyukZ = " + buyukZ);

        //Herhangi bir character in ASCII degerini bulmak icin o karakteri "int" data type inda bir variable icine koyariz
        //byte da olur(yani tam sayi kavanozuna koymak gerekir)
        int intA = 'a';
        System.out.println(intA); //97

        int w = 'w';
        System.out.println("w ascii value = " + w);

        byte unlem = '!';
        System.out.println(unlem);//33

        byte modulus = '%';
        System.out.println("modulus ascii value = " + modulus);

        char c1 = 'K';
        char c2 = '?';
        System.out.println(c1+c2);//138

        char m ='m';
        char e ='e';
        char b ='b';
        System.out.println("meb ascii toplam = "+(m+e+b));
        //Java da eger char lari matematiksel islemlerde kullanirsaniz, java char larin ASCII degerlerini kullanir

    }//main
}//class
