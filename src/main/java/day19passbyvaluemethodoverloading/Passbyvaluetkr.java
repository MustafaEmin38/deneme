package day19passbyvaluemethodoverloading;

public class Passbyvaluetkr {
    public static void main(String[] args) {

        int shirtPrice=100;

        System.out.println(indirim("ogrenci", shirtPrice));//90
        System.out.println(indirim("gazi", shirtPrice));///80

        int yetiskin=indirim("yetiskin",shirtPrice);
        System.out.println(yetiskin);//95

        System.out.println(shirtPrice);//100

        String isim="Mustafa Emin Baltat";

        String yeniIsim=unvanEkle("QA Tester", isim);
        System.out.println(yeniIsim);


    }//main

    public static String unvanEkle(String unvan, String isim) {
        return unvan +" " +isim;
    }

    public static int indirim(String musteri, int fiyat) {

        switch (musteri){
            case "ogrenci":
                fiyat-=10;
                break;
            case "gazi":
                fiyat-=20;
                break;
            case "yetiskin":
                fiyat-=5;
                break;
            default:
                fiyat=fiyat;
        }
        return fiyat;
    }


}//class
