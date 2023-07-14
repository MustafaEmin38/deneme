package day35lambda;

import java.util.List;

public class UtilsTkr { //Faydali seyler demek. kullanisli methodlari bu class ta toplariz

    public static void printInTheSameLineWithSpace(Object obj){
    System.out.print(obj+" ");
    }

    // forEach(t-> System.out.print(t+" ")); method um icin Utils Class ta method olstururum
    //static => yaptim cunku class (Utils) ismiyle refere edecegim her yerden ulasilsin
    //(String str) veya baskasi=> olabilirdi ama int ler double lar vs her seyi yazabilmek,kisitlamamak icin Object obj yaptim

    public static boolean isNumberEven(int num){
       return num%2==0;

    }

}//class



        /* Functional Programming te mumkun mertebe Lambda Expressions kullanmaktan kacinmamiz gerekir.
        Cunku Lambda Expressions; Best Practice degildir.
        Peki Best Practice nedir?
        Functional Programming te mumkun mertebe Method Reference kullanmak Best Practice tir.
        Javanin olusturdugu hazir methodlari alip kullanmak Method reference tir.
        Ama o da yeterli gelmezse o zaman Utils Class kullanmak BestPractice tir.
        Java da elemanlari aralarinda bir bosluk koyarak yazdirma methodu yok zaten cok spesific olurdu.
        O ned cok sik kullandigimiz methodlari; elimizin altinda bulunsun, hizli sekilde kullanalim diye Utils Class kullaniriz


        */