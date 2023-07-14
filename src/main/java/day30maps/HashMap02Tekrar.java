package day30maps;

import java.util.HashMap;

public class HashMap02Tekrar {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Gulce",30);
        stdAges.put("Abdullah",39);
        stdAges.put("Benna",33);
        stdAges.put("Hasan",30);
        stdAges.put("Suleyman",33);

        System.out.println(stdAges);//{Suleyman=33, Hasan=30, Abdullah=39, Gulce=30, Benna=33}

        //Key i tekrarli kullandigimizda hata vermez. en son verilen entry nin degerini kabul eder
        //Bu yontem value guncellemede kullanilabilir, buna "overrwrite" denir.
        stdAges.put("Abdullah",24);
        System.out.println(stdAges);//{Suleyman=33, Hasan=30, Abdullah=24, Gulce=30, Benna=33}

        //relace method u value lari, key ler kullanarak update etmeye yarar
        stdAges.replace("Abdullah", 39);
        System.out.println(stdAges);//{Suleyman=33, Hasan=30, Abdullah=39, Gulce=30, Benna=33}

       //replace("Gulce",30,33); methodu map icinde key ve value kismi eslesirse guncelleme yapar.
        stdAges.replace("Gulce",30,33);
        System.out.println(stdAges);//{Suleyman=33, Hasan=30, Abdullah=39, Gulce=33, Benna=33}

        //putIfAbsent("Reyyan",6); methodu mapte key olarak "Reyyan" yoksa ekleme yapar, varsa eklemez.
        stdAges.putIfAbsent("Reyyan",6);
        System.out.println(stdAges);//{Suleyman=33, Hasan=30, Reyyan=6, Abdullah=39, Gulce=33, Benna=33}

        //get() ve getOrDefault() methodu;eger aranan eleman mapte varsa ayni value yu verir
        System.out.println(stdAges.get("Reyyan"));//6
        System.out.println(stdAges.getOrDefault("Reyyan", 2));

        // eger eleman mapte yoksa get() method u null verir
        // getOrDefault() methodu key i null, value yu bizim yazdigimiz degeri verir
        System.out.println(stdAges.getOrDefault("Hifa", 2));

        //containsKey(); methodu key lerin icinde Reyyan olup olmadigini kontrol eder.sonuc olarak true/false dondurur
        System.out.println(stdAges.containsKey("Reyyan"));//true
        //containsValue(); methodu key lerin icinde 66 olup olmadigini kontrol eder.sonuc olarak true/false dondurur
        System.out.println(stdAges.containsValue(66));//false

        //remove("Reyyan"); key kullanarak entry i silmeye yarar
        stdAges.remove("Reyyan");
        System.out.println(stdAges);//{Suleyman=33, Hasan=30, Abdullah=39, Gulce=33, Benna=33}

        //remove("Abdullah",39); hem key hem value kontrolu yapar, ikisi eslesirse siler
        stdAges.remove("Abdullah",39);
        System.out.println(stdAges);//{Suleyman=33, Hasan=30, Gulce=33, Benna=33}

    }
}
