package day05concatinationoperatorstypecasting;

public class MyTekrar_Operators {

        /*
        1) +,-,*,/ islemleri javada matematikte kullanildigi gibi kullanilir
        Note 1: int / int ==> int olur.
        Note 2: double / int ==> double
        Cunku; java da matematiksel islemlerde farkli data type lari kullanilirsa sonuc her zaman buyuk data type indadir.

        2) java da "Logical Operator"lar vardir. ANd ve OR islemleri Logical Operatorlardir.
            i)AND (&&) isleminde true alabilmek icin her sey true olmalidir.
              AND islemi "perfectionist"tir.
              AND isleminde bir tane false sonucu false yapar.(cay geldi kahve gelmedi)

            ii)OR (||) isleminde bir tane true sonucu true yapmaya yeter.
               OR isleminde sonucun false olmasi icin her seyin false olmasi gerekir
               OR islemi "polyanna" gibidir.

             iii) NOT (!) ==> operator true olani false yapar
                  !true ==> false
                  !false ==> true
                  !!ture ==> true

        3)Comparison (Karsilastirma) Operators
        < ,   > ,  <= ,   >= ,  == ,   !=
        Note : Karsilastirma operatorlarini kullandiginizda kesinlikle boolean (true veya false) alirsiniz

        Note: Biz AND islemi icin && kullaniriz ama & kullanim da gecerlidir
            Farklari nedir?
               && kullanim ilk defa false oldugunda diğerlerini kontrol etmez dolaysiyle hizli calisir
               cunku "and" isleminde ilk ifade false ise digerlerinin ne oldugunun bi onemi yoktur.sonuc false olur
               & kullanim ilk ifade ne olursa olsun digerlerini kontrol eder ve dolaysiyle yavas calisir
               bu yuzden biz hep && kullaniriz

         */
        public static void main(String[] args) {

            boolean first = 3<5; //true
            boolean second = 2+3 !=5; //false
            boolean third = 2+3*5 >=19; //false

            System.out.println(first + " - "  + second + " - " + third); //true - false - false
            System.out.println(first && second); //false
            System.out.println(first || second || third); //true


            boolean bir = 4<8; //true
            boolean iki = 2+5 !=7; //false
            boolean uc = 3+5*2 >=14; //false

            System.out.println( bir +" "+ iki+" "+ uc); //true false false
            System.out.println(bir&&iki); //false
            System.out.println(bir||iki); //true

    }//main method
}//class
