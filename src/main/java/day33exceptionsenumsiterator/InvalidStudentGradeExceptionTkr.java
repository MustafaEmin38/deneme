package day33exceptionsenumsiterator;
public class InvalidStudentGradeExceptionTkr extends Exception{
    /*
    -Bu class i olusturmamizdaki amac kendi exception imizi olusturmak.
    -Java; mesela bir yas degerinin veya ogrenci notunun negatif olmamasi gerektigini bilemez.Bu onun icin sadece bir variable dir.
    -İste boyle durumlarda biz kendi exc olusturur ve neg degere set koyariz ve uyg nin lastigini patlatiriz.
    -Bu tur class lara "Custom Exception Class" denir. (Custom kisiye ozel)
    -InvalidStudentGradeException(GecersizOgrenciNotuException)=>Naming Convention dir,best practice tir;
        ismi okuyan kisi bu konuda bir fikir sahibi olur
    -Exception classlarin sonu her zaman Exception olarak biter =>Naming Convention dir, best practice tir
    -Bu normal bir class,biz bunu bir exception classi haline getirecegiz=>extend ile ozelliklerini kullanmak istedigimiz class a child yapacagiz
    -InvalidStudentGradeExceptionTkr extends Exception=> bu sekilde Exception class inin ozelliklerini kullanacagiz
    -Classimizn CompileTimeExc classi olmasini istiyorsak extends Exception yapariz.(RunTimeExc farkli)
    -Nasil ki;"FileNotFoundExc" bu class in bir child iysa benim olusturdugum class da ayni derecede Exc clasinin child idir.

    -
     */

    public InvalidStudentGradeExceptionTkr(String message)//Exc clas indan istifade etmek icin bu const i olustururuz
    {super(message);

        /*
        1) Custom Exception Class olusturmak icin Exception Class a extend etmeliyiz
            Exception Class'a extend ederek olusturdugumuz Custom Exception "Compile Time Exception" olur
            Eger Runtime Exception uretmek istersek RuntimeException Class'a extend etmeliyiz

        2) Custom Exception Class olustururken constructor olusturmaliyiz ve bu constructor parent taki constructor'i cagirmalidir
            Bu constructor mesaj verecek veya vermeyecek sekilde olusturulabilir

        3)  Custom Exception Class olusturdugunuzda ismin sonunda Exception kelimesini kullanmalisiniz.

         */
    }

}
