package day27abstraction;

public interface A_Ac {

    public void cool();

    /*
    1)Bir interface i bir class in parent i yapmak icin "implements" keyword unu kullaniriz(extends>inheritance idi)
    2)java, parent lar class oldugunda multiple parent a musade etmez ama biz
     bazen multiple parenta ihtiyac duyariz.
    Bu ihtiyaci gidermek icin java interface adinda yeni bir yapi olusturdu
    Bu yapi sayesinde bir class icin coklu interafec parent olusturulabilir
    3) interfacelerin icine concrete method konulamaz, cunku concrete methodlarda body vardir ve
    body o methodun isi nasil yapacagini belirtir. isin nasil yapilacagi bir cok detay icerir ve bu chlid
    classlarda kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken isi soyleyip
     nasil yapilacagini childa birakirsaniz chil classin kafa karisikligini engellemis olursunuz(Ali Cana oku diyen
     teyze-dayi-amcalar var ama biri hukuk biri tip biri muh derse kafa karisir.kendi secerse sorun yok )
     4) interfacelerdeki tum methodlar otomatik olara public dir, abstracttir, static degildir
     5)interfaceler concrete method iceremezler dolayisyla interface icindeki hicbir sey istege bagli degildir
    hersey child classlar icin mecburidir. Bu yuzden interfacelere" to-do list " de denir


     */
}
