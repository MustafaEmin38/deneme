package day25inheritance;

public class Aa_VehicleTkr {

    public Aa_VehicleTkr(){
        System.out.println("Vehicle 1 yazilacak, cunku car in parent i...");
    }/*
    1. Runner icinde child classtan bir object olusturdugunuzda Constructor parent class ta baslatilir ve alta dogru calisir
    (bir method static degilse onu object uzerinden kullaniriz:vehicle-motor(){}>car-fren(){})>honda-klima(){})
    (vehicle objecti olusturulur> car duser. car la kaplanir>honda ya duser ve honda olarak kaplanir.
    icinde genetik olarak vehicle ve car geni tasir)
    2) Child Classtaki constructor dan Parent Classtaki constructor a gidebilmek icin
    super() kullanilir
    3) Parent classta birden fazla constructor varsa istenilen constructor
    constructor super() ifadesinin parantezi icine yazilan parametereler yardimi ile secilebilir
    4) Ayni Class icindeki constructorlari secmek icin this() kullanilir
    Ayni classta birden fazla constructor varsa istenilen constructor
    this() ifadesinin parantezi icine yazilan parametereler yardimi ile secilebilir
    5) super() ifadesini yazmak istege baglidir, yazmasanizda java sanki super() varmis
    gibi davranir. Ama kodunuzu daha okunur kilmak icin yazabilirsiniz
    6) super() ve this() ifadeleri constructor icinde herzaman ilk satirda olmalidir
    7) Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir. (Bakiniz 6.)
    8) Inheritance da variable lari ve methodlari bir classtan cagirmak icin this veya super kullanilir
    this ayni class icindeki variable lari veya methodlari cagirmak icin kullanilir
    super parent class icindeki variable lari veya methodlari cagirmak icin kullanilir


    */
    public Aa_VehicleTkr( int price){
        System.out.println("Vehicle 2 yazilir");
    }
}//class
