package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02Tekrar {
    public static void main(String[] args) {

        ArrayList<Integer> ages1= new ArrayList<>();
        ages1.add(5);
        ages1.add(7);
        ages1.add(3);

        ArrayList<Integer> ages2= new ArrayList<>();
        ages2.add(3);
        ages2.add(7);
        ages2.add(5);

        boolean r1=ages1.equals(ages2);
        System.out.println(r1);// false

        Collections.sort(ages1);
        Collections.sort(ages2);
        boolean r2=ages1.equals(ages2);
        System.out.println(r2);// true

        ArrayList<String> car=new ArrayList<>();
        car.add("Audi");
        car.add("Bmw");
        car.add("Opel");
        car.add("Audi");
        car.add("Skoda");
        car.add("Bmw");
        System.out.println(car);// [Audi, Bmw, Opel, Audi, Skoda, Bmw]

        System.out.println(car.remove("Bmw"));// true
        System.out.println(car.remove("Audi"));// true
        System.out.println(car);// [Opel, Audi, Skoda, Bmw]

        System.out.println(car.remove(2));// Skoda
        System.out.println(car.remove(2));// Bmw
        System.out.println(car);// [Opel, Audi]


        //Ornek: Bir integer List olusturun ve 12 elemanini  Listden siliniz
        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(15);
        nums.add(11);
        nums.add(19);
        nums.add(17);
        System.out.println(nums);// [12, 15, 11, 19, 17]

        //System.out.println(nums.remove("12"));//false>>>hata verdi cunku 12 yi index kabul etti
        //System.out.println(nums);//[12, 15, 11, 19, 17]

        //1.way ==> sepete koyarak sil(ama sepet wrapper olmali)
        Integer sepeteKoy=12;
        System.out.println(nums.remove(sepeteKoy));//true
        System.out.println(nums);// [15, 11, 19, 17]

        //2.way ==>Sayinin bir int degil Integer oldugunu belirterek sildik(Autoboxing)>>>sayidan once aciklamaya cast denir
        nums.remove((Integer)15);
        System.out.println(nums);//[11, 19, 17]

        //3.way ==> valueOf() methoduyla sildik>>> icine "int" girer "Integer" cikar
        nums.remove(Integer.valueOf(11));
        System.out.println(nums);// [19, 17]

        //4.way ==> remove() method unun icine kendimiz index vererek sildik, 19un ilk gorundugu yer
        nums.remove(nums.indexOf(19));
        System.out.println(nums);// [17]

        //Bir ArrayList teki bir elemanin tum gorunumlerini nasil sileriz?
        ArrayList<Integer> sayi1= new ArrayList<>();
        sayi1.add(100);
        sayi1.add(111);
        sayi1.add(222);
        sayi1.add(325);
        System.out.println(sayi1);//[100, 111, 222, 325]

        ArrayList<Integer> sayi2= new ArrayList<>();
        sayi2.add(100);
        sayi2.add(222);
        sayi2.add(325);
        System.out.println(sayi2);//[100, 222, 325]

        sayi1.removeAll(sayi2);
        System.out.println(sayi1);//[111]

    }//main
}//class
