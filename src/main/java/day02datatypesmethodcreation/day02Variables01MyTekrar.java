package day02datatypesmethodcreation;

public class day02Variables01MyTekrar {
    public static void main(String[] args) {

        //Örnek 1: Şehir ismi için bir variable oluşturun ve önce "Ankara" sonra da "Izmir" sonra "Trabzon" değerlerini atayıp ekrana yazdırın.
        String cityName = "Ankara";
        System.out.println(cityName);
        System.out.println("cityName = " + cityName);
        cityName = "Izmir";
        cityName = "Trabzon";
        System.out.println(cityName);
        System.out.println("cityName = " + cityName);
        
        String myCityName = "kayseri";
        System.out.println(myCityName);
        System.out.println("myCityName = " + myCityName);

        //Örnek 2: Şehir plaka kodu için bir variable oluşturun önce 34 sonrada 35 değeri atayıp console yazdırın.
        int plakaKodu = 34;
        System.out.println(plakaKodu);
        plakaKodu = 35;
        System.out.println(plakaKodu);
        System.out.println("plakaKodu = " + plakaKodu);

        //Örnek 3: Başarılı mı? sorusu için bir variable oluşturun ve önce "false" sonra da "true" değeri atayıp ekrana yazdırın
        boolean isSuccessful = false;
        System.out.println(isSuccessful);
        isSuccessful = true;
        System.out.println(isSuccessful);
        System.out.println("isSuccessful = " + isSuccessful);


    }
}
