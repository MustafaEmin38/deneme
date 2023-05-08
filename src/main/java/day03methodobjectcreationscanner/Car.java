package day03methodobjectcreationscanner;

public class Car {//BU ASAMADA MAİN METHOD KOYMUYORUZ, CUNKU SU ANDA SADECE BIR KALIP URETİYORUZ.
                // MAİN METHOD HER OBJECT/HER CLASS A KONMAZ. CUNKU MOTOR SADECE 1 TANE OLUR.

    //Variable lar olusturalim(pasif ozl koyalim)

    public String model = "Tesla";
    public int fiyat =20000;
    //Variable olusturdum ama basina access mod.(pulic) koydum.daha once koymamıstık
    //Access mod koymadigimiz da java otomatikmen kendisi "default" koyar,biz simdi public istedik.

    //Method lari olusturalim (aktif ozl koyalim)
    //Note: "return type" void oldugunda method icinde "return" keywordu kullanilmaz
    public void hareket(){
        System.out.println("Tesla cok hizli hareket eder..");
    }
    public void dur(){
        System.out.println("Cok guvenli bir sekilde durur..");
    }

}//class
