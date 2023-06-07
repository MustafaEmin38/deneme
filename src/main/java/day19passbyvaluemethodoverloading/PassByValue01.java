package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //NOte: Java "pass by value" sayesinde avriable lerin orijinal degerlerini korur.
        int shirtPrice=100;

        //java methoda gonderirken orijinal degeri degil kopyasini gonderir ve degisen deger kopya deger olur
        discount("student",shirtPrice);
        System.out.println(discount("student",shirtPrice));//90
        System.out.println(discount("veteran",shirtPrice));//80
        System.out.println(discount("senior",shirtPrice));//95

        //Normalde discount methodu ile indirim yaptık ama buradaki deger hala orijinal
        System.out.println(shirtPrice);//100

        shirtPrice = discount("veteran", shirtPrice);
        System.out.println("shirtprice kampanya "+shirtPrice);

    }//Main
    //Discount Methodunu olusturalim
    public static int discount(String type, int price) {
        switch (type) {       //ucten fazla tip icin switch
            case "student":
                price = price - 10;
                break;
            case "veteran":
                price = price - 20;
                break;
            case "senior":
                price = price - 5;
                break;
            default:
                price = price;
        }
        return price;
    }
}//Class
/*
        Pass By Value===> olabilr
        1. Java "Pass By Value" kullanır
        2. Yani; java mnethodlarin orijinal degeri degistirmesine musaade etmez.==> cocuga verilen tablo ornegi
        3.Java methodlara deger yollarken orijinal degerin kopyasini olusturur ve o kopyayi methoda yollar.
            Method kopya deger uzerinde degisiklik yapar boylece orijinal deger korunmus olur.
        4.Java esnek bir dildir, istersek yazdigimiz kod ile orijinal degerin degismesini de temin edebilirz
        Bakiniz line16

        Pass By Reference:
        1. Pass By Reference da methoda reference yollanır
        2. Reference adres demektir.Adres yollaninca method adresi kullanarak orijinal degere ulasir ve orijinal degeri degistirir
        Bu yuzden "C#" gibi Pass By Reference kullnan dillerde method variable in orijinal degerini degistirir.(C#>> si plus)

 */