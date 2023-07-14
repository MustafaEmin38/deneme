package day30maps;//map ler farklidir collection degildir
                    //map deyince aklimiza sozluk gelmeli

import java.util.*;

public class HashMap01 {//hash arka planda data saklamak icin yapilmis bir concept
    public static void main(String[] args) {//Entry= key+value (herbir eleman)==>tamami EntrySet
                                            //key; tekrarsiz(unique)    Value;tekrarli
        /*
        1)  Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2)  key kismi tekrarsiz, value kismi tekrarli olabilir
        3)  Map lerdeki her bir elemana Entry denir, tamamina ise EntrySet denir
        4)  Entry ler tekrarsiz oldugu icin EntrySet  denilir
        5)  Key ve value lar ayri ayri data typelarinda olabilirler
        6)  Map ler collection degildir, farkli bir yapidir
        7)  HashMap ler entry leri rastgele siralar bu nedenle en hizli map tir
         */

        //Map nasil olusturulur? (HashMap de HashSet gibi rastgele sirala)
        HashMap<String, Integer> countryPopulation = new HashMap<>();//herzamn sol taraf key, sag taraf value
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}

        //get() methodu key ile calisir ve value kismini verir.
        int usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation);//400000000

        //Butun keyleri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]


        //Butun value lari nasil alabiliriz?
        Collection<Integer> values= countryPopulation.values();
        System.out.println(values);//[18000000, 400000000, 83000000, 83000000, 3000000]

        //Ornek 1: countryPopulation map indeki ulkelerin nufuslarinin ortalamasi kactir?
        Collection<Integer> value= countryPopulation.values();

        int sum=0;

        for ( Integer w : value   ) {
            sum=sum+w;
        }
        System.out.println(sum/value.size());//117400000

        //enytrySet() mapteki entry leri kalip halinde alip bize Set in icine koyarak verir
        //Loop lar map ler ile kullanilamaz bunun icin entrySet methodunu kullaniriz. tek amac looplarla kullanabilmek
        Set<Map.Entry<String,Integer>> entries=countryPopulation.entrySet();//map; collection a donustu. Set ler bir collction dir
        System.out.println(entries);//[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]
        //<Map.Entry<String,Integer> ==>bu map in icindeki entry ler bu set in elemanidir

        //Ornek 2: countryPopulation Map indeki ulkelerin isimlerinin karakter sayisi ile nufuslarin toplamini bulunuz

        int toplam=0;                        //[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]
        for ( Map.Entry<String,Integer> w  : entries ) {// burda ikili ol aldik, kalip halinde koyduk==> key + value beraber
            toplam=toplam+w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);//587000033

    }//main
}//class

