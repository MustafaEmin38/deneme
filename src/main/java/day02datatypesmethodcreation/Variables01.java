package day02datatypesmethodcreation;

public class Variables01 {

    public static void main(String[] args) {
        //Örnek 1: Şehir ismi için bir variable olluşturun ve önce "Ankara" sonra da "Izmir" değerlerini atayıp ekrana yazdırın.
        String cityName = "Ankara";
        System.out.println(cityName);

        cityName = "Izmir";
        System.out.println(cityName);

        cityName = "Istanbul";
        System.out.println(cityName);

        /* String koyarak cityName adında bi sepet oluşturduk içine önce Ankara, sonra Izmir, sonra Istanbul koyduk.
        yeni sepet oluşturmadğımız-aynı sepeti kullandığımız için öncekileri sildi en son Istanbul kaldı.
        */

        //Örnek 2: Şehir plaka kodu için bir variable oluşturun önce 34 sonrada 35 değeri atayıp console yazdırın.
        byte plakaKodu = 34;
        System.out.println(plakaKodu);

        plakaKodu = 35;
        System.out.println(plakaKodu);

        //Örnek 3: Başarılı mı? sorusu için bir variable oluşturun ve önce "false" sonra da "true" değeri atayıp ekrana yazdırın
        boolean isSuccessful = false;
        System.out.println(isSuccessful);

        isSuccessful = true;
        System.out.println(isSuccessful);









    }


}
