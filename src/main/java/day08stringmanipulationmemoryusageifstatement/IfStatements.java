package day08stringmanipulationmemoryusageifstatement;

public class IfStatements {
    public static void main(String[] args) {
        //if statements
        //bazi kodlari bazi sartlara gore aktif edebilmek icin if statements kullanilir
        //if eger demek===> if cumlesi

        //ifyou study hard, you will learn Java==> english
        /*if(you study hard){
            you will learn Java   ===> Java
        }
        */

        //Ornek 1: Sayi pozitif ise ekrana pozitif yazdirin.
        int num=13;
        if (num>0){
            System.out.println(num+"===>pozitiftir");
        }
        //ornek 2 : sayı -1 ile 10 arasında ise ekrana rakam yazdırın
        int n =10;
        if (n>-1 && n<10) {
            System.out.println("Rakam");
        }

        int number= 15;
        if(number>0){
            System.out.println(number +" ==>pozitif sayi");
        }



    }//main
}//Class
