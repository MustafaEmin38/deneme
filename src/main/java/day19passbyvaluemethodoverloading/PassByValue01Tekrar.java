package day19passbyvaluemethodoverloading;

public class PassByValue01Tekrar {
    public static void main(String[] args) {
        //Pass By Value: Kurali ve syntex i olan somut bir sey degil, bu java nin programlama dili olarak karar verdigi bir consept
        //Note: Java "pass by value" sayesinde variable larin orijinal degerlerini korur

        int shirtPrice=100;

        // java methoda gonderirken orijinal degeri degil kopyasini gonderir ve degisen deger kopya deger olur.
        discount("student",shirtPrice);//asagidaki method icinden/switchten buraya 90 geldi

        System.out.println(discount("student",shirtPrice));//90
        System.out.println(discount("veteran",shirtPrice));//80
        System.out.println(discount("senior",shirtPrice));//95

        //normalde discount methodu ile indirim yaptik ama buradaki deger hala orijinal
        System.out.println(shirtPrice);//100

        shirtPrice=discount("veteran", shirtPrice);//java esnek bir dildir, guncelleme ve degisim yapilabilir
        System.out.println("shirtPrice kampanya " + shirtPrice);//80 kampanya ile artik fiyatimiz 80 oldu

    }//main

    //Discount Methodunu olusturalim
                            //type: student  price: 100 (kopya deger)
    public static int discount(String type, int price){//type: kisi tipi
        switch (type){
            case "student":
                price=price-10;//kopya 100 >>> 90 oldu
                break;
            case "veteran":
                price=price-20;
                break;
            case "senior":
                price=price-5;
                break;
            default:
                price=price;//burda fiyat normal vatandasa indirimli olmadigi icin price= price dedik.
        }
        return price;//bu methodun cagrildigi yere bu degeri geri dondur dedik
    }

    /*
    Pass By Value : ==> deger kopyalanir ve methoda yollanir. kopyalanan deger işlenir ve degisir
    1. Java "pass by value" kullanir
    2. Yani; java methodlarin orijinal degeri degistirmesine musaade etmez
    3. Java method lara deger yollarken orijinal degerin kopyasini olusturur ve o kopyayi method a yollar.
       Method kopya deger uzerinde degisiklik yapar, boylece orijinal deger korunmus olur.
       (cocugun eline istedigi tablo vermeyiz, resim defteri veririz... karalasin degistirsin...)
    4. Java esnek bir dildir, istersek yazdigimiz kod ile orijinal degerin degismesini de temin edebiliriz
    Bakiniz line 20

    Pass By Reference :==> adres kopyalanir ve methoda yollanir. kopyalanan adresten orj degere gidilir ve orj deger degisir,islenir
            (Fotokopi (kopya) olsa da adres hazinenin yerini gosterir ve orj degere ulasilir)
    1. Pass By Reference ta method a adres yolanir.
    2. Reference adres demektir. Adres yollaninca method adresi kulanarak orijinal degere ulasir ve orijinal degeri degistirir
     BU yuzden "C#" (si şarp)gibi Pass By Reference kullanan dillerde method variable in orijinal degerini degistirir.

     */

}//class
