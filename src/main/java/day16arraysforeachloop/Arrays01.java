package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a=13;
        //Bu yapinin icinde sadece bir tane data depolanabilir.
        //Ama biz kod yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        //Bir yapinin icinde coklu data depolayabilmek icin java Array yapisini olusturmustur.
        //Array lerde atadigimiz data type neyse o kullanilabilir==>String gibi

        //Array nasil olusturulur?
        String stdNames[] =new String[5];  //==> array syntex i
        //Array lar console a nasil yazdirilir
        System.out.println(stdNames);//sadece "adres" yazdirir
        //toString() methodunu kullanmadan sadece array ismi ile yazdiririsaniz java o array in adresini yazdirir
        System.out.println(Arrays.toString(stdNames));//Arrays.toString() yaptık icine array ismi koyduk,sonra sout"null"

        /*
        Array lar diger collectionlardan cok cok daha hizlidir.(superfast denir)
        Array lar diger collection lardan daha az memory kullanirlar
         */

        //Array e eleman ekleme nasil yapilir*
        stdNames[2]="Benna";
        stdNames[3]="Abdullah";
        stdNames[4]="Recep";
        stdNames[0]="Ekim";
        stdNames[1]="Mustafa";

        System.out.println(Arrays.toString(stdNames));// [Ekim, Mustafa, Benna, Abdullah, Recep]

        //Array den spesific bir elemani nasil aliriz?
        System.out.println(stdNames[4]);// Recep
        System.out.println(stdNames[1]);// Mustafa
        System.out.println(stdNames[0]);// Ekim

        //Ornek 1:Array deki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz
        //length()==>String lerde parantezli (cunku method tur), array lerde ise (parantezsiz) yazilir(cunku method degil)
        //  0       1       2       3         4 => index leri
        //[Ekim, Mustafa, Benna, Abdullah, Recep]

        for (int i=0 ; i<stdNames.length ; i++) {

            System.out.println(stdNames[i] + "!");

        }


    }//Main
}//Class
