package day26polymorphism;

public class StudentTekrar {
    //Encapsulation==> kapsulleme(variable ve methodlari class a alarak yapilir)
    /*
    Encapsulation nedir? Data Hiding (veri saklama)
    -data sadece gorulsun ama degisiklik yapilamasin
    -sadece degisiklik yapilsin ama hic gorulmesin/yapan kisi baskasina gosteremesin

    iki sey icin encapsulation yapilir 1. datayi saklamak/korumak/ gizliliğini sağlamak
                                       2. sade bir gorunum elde etmek (kafa karisikligini engellemek> araba ornegi)
    Data nasil saklanir?
    Access modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm.Boylece datayi saklarim.
    Encapsulation yaptigimiz datayi istersek diger clas lardan okuyabiliriz
    Nasil okuruz?
    getmethod olusturarak encapsule edilmis datanin degerini okuyabiliriz
    1)get methodlar public olur
    2)get methodun return typei okudugu methodun return typei ile ayni olur
    3)get method bir boolean variable icin olusturulduysa ismi is ile baslar
        ornek => isSuccesful()

     */

    private String stdId="AC123546";// private yaptm kapsulledim(encapsulate). baska classlardan gorunmez hale geldi

    public String stdName="Ali Can";
    public  int age=13;
    private double notOrt=3.13;
    private boolean succesful=false;



    public String getStdId() {//acc mod oto ol. "public" oldu, cunku zaten  erisime acmak icin get yaptik .
                             //return tyoe String geldi, cunku zaten stdId String, yani ne ise o kalmak zorunda
                             // tum get methodlari get ile baslar, sonra return edecegi seyin adi eklenir. baska da olur ama
                             // best practice bunu gerektirir(naming covention)
                             // () ici bos cunku sadece okumasini istiyorum, dondurecegi bir sey yok
        return stdId;// cagrildigi yere bu datayi return et
    }


    public double getNotOrt() {//ali can in not ort gizlidir ama sadece okunabilsin degistirilmesin der e-okul.
                               //private ile gizleriz get ile de okunabilir hale getiririz, ama degistirilemez
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }
    /*
    Encapsulation yaptigimiz data yi istersek diger class lardan nasil degistirebiliriz?
    "set method" olusturarak Encapsulate edilmis datanin degerini degistirebilirz
    1) set methodlar hep public olur
    2) set methodlar in return typei hep void olur
    3) set methodlar parametre kullanir,parametrenin data typei variable ile ayni olur

    NOTE: set method kullanarak var olan object uzerinde degisiklikler yaparak o object i sanki
    yeni bir object mis gibi kullanabilirz

    NOTE 2: get methodlarin diger adi getter, set methodlarin diger adi setter dir
            getter ve setter larin ikisine birden "Java Beans" denir(fasulye)
     */

    public void setStdId(String stdId) {//public==>baska package den ulasabilmek/gorunur yapmak icin
        this.stdId = stdId;             //void==>bana bir sey dondursun istemiyorum, sadece verdigimle degistirsin.
                                        // o yuzden set method larin return type her zaman void olur(yeni bir sey uretmez)
                    //setStdId==> yapilan isle ilgili old icin her zaman basina "set" gelir.(set-ayarla,degistir)
                    //(String stdId)==> parantez ici bos degil cunku olmasini istedigimiz yeni degeri gireriz
    }               //this.stdId = stdId; ben disaridan yeni stdId yi yaziyorum, = ile soldaki this std ye atiyor

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }

}//class
