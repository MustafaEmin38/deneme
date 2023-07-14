package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01Tekrar {//Hash: benzersiz data olusturma teknigi,arka planda data saklamak icin yapilmis bir concept
                              //Map deyince aklimiza "sozluk" gelecek. (key=value =>entry, tamamina EntrySet denir)
    public static void main(String[] args) {//Entry= key+value (herbir eleman)==>tamami EntrySet
                                            //key; tekrarsiz(unique)    Value;tekrarli
        /*
        1. Map lerde key+value seklinde bir kullanim vardir
        2. key>tekrarsiz value>tekrarli/tekrarli kisimdir
        3. Map lerde her bir elemana (key+value) entry denir, tekrarsiz old icin de hepsine EntrySet denir
        4. key ve value ayni data type da olabilir farkli da olabilir
        5. Map ler collection degil farkli bir yapidir.
        6. HashMap ler entry leri rastgele siralar bu nedenle en hizli map tir

         */

        //Map ler nasil olusturulur? (HashMap de HashSet gibi rastgele siralama yapar)
        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}

        // get() methodu key ile calisir, bize value dondurur.
        int usaPopulation=countryPopulation.get("USA");
        System.out.println(usaPopulation);//400000000

        // Butun keyleri nasil aliriz? ==>tekrarsiz datalari koymak icin "Set" yapisi kullanilir, Set in data type i ise String dir
        Set<String> keys=countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        // Butun value lari nasil aliriz?
        Collection<Integer> value=countryPopulation.values();//Collection lar tekrarli data tutabildigi icin Collection icine konur
        System.out.println(value);//[18000000, 400000000, 83000000, 83000000, 3000000]

        //Ornek 1: countryPopulation map indeki ulkelerin nufuslarinin ortalamasi kactir?
        //1.way
        Collection<Integer> values=countryPopulation.values();
        int sum=0;

        for ( Integer w: values) {
            sum+=w;
        }
        System.out.println(sum / values.size());//117400000

        // 2.way==>entrySet() methodu ozel bir method. Amac Map leri Loop larla kullanmak(Map, Collection a donusur)
        // Bu methodla;java Map leri Loop larla kullanalim diye; Map teki entry leri kalip halinde alir ve Set in icine koyar
        Set<Map.Entry<String,Integer> > entries=countryPopulation.entrySet();//map; collection a donustu. Set ler bir collction dir
        //<Map.Entry<String,Integer> ==>burda Set in elemanlari entry dir.Hangi entry "<Map.Entry" yani map in icindeki entry ler.
        //Map in icindeki entry ler bizim elemanimiz. bunlari da Set in icine koyuyoruz.Bu map in key leri String, value lari Integer
        System.out.println(entries);//[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]
        //EntrySet buraya collection olarak geldi. Nasil anladik? yukarida {} ile veridi, burda [] ile verdi

        //Ornek 2: countryPopulation Map indeki ulkelerin isimlerinin karakter sayisi ile nufuslarin toplamini bulunuz

        int toplam=0;                   //[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]
        for (Map.Entry<String,Integer> w: entries) { // w sepetimde artik key+value var
            toplam+=w.getKey().length()+w.getValue();

        }
        System.out.println(toplam);//587000033


    }
}
