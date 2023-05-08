package day03methodobjectcreationscanner;
public class CarMyTekrar {
    //Asagida kalibimi hazirladim.şimdi de obje yi olusturmam lazım. object de pasif özl (variable) ve aktif ozl (method) olurdu.
    //Olusturdugum ozelligi object de görmem icin onu kaliba koymam gerek.Bu nedenle de once

    //Variable lar olusturuyorum(pasif ozl)
    public String model = "AlfaRomeo";
    public int fiyat = 2000000;

    //Method lar olusturuyorum(aktif ozl)
    //Note: Return type "void" oldugunda method icinde "return keywordu(void)" kullanilmaz.
    //Static koymadık cünkü bu methodu(aktif ozl) main method dan cagırmayacagim
    public void hareket (){
        System.out.println("AlfaRomeo cok hizli hareket eder..");
    }
    public void dur(){
        System.out.println("AlfaRomeonun durus mesafesi cok kisadir..");
    }
}//Class ==> kalıbımı hazırladım
