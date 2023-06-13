package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01Tekrar {
    public static void main(String[] args) {

        //Arary list olustur
        ArrayList<String> reyyanFriends = new ArrayList<>();
        System.out.println(reyyanFriends);// []

        //Arary list e eleman ekle
        reyyanFriends.add("Eymen");
        reyyanFriends.add("Elanur");
        reyyanFriends.add("Amine");
        reyyanFriends.add("Rihem");
        reyyanFriends.add("Serra");
        System.out.println(reyyanFriends);//[Eymen, Elanur, Amine, Rihem, Serra]

        //Arary list e spesific eleman ekle
        reyyanFriends.add(3,"Guven");
        reyyanFriends.add(5,"Ayse");
        System.out.println(reyyanFriends);// [Eymen, Elanur, Amine, Guven, Rihem, Ayse, Serra]

        //Arary list e coklu eleman ekle
        ArrayList<String> newFriends= new ArrayList<>();
        newFriends.add("Belinay");
        newFriends.add(0,"Hilal");
        newFriends.add("Yigit Efe");
        System.out.println(newFriends);// [Hilal, Belinay, Yigit Efe]

        reyyanFriends.addAll(newFriends);
        System.out.println(reyyanFriends);// [Eymen, Elanur, Amine, Guven, Rihem, Ayse, Serra, Hilal, Belinay, Yigit Efe]

        reyyanFriends.add(4,"Sarp");
        System.out.println(reyyanFriends);// [Eymen, Elanur, Amine, Guven, Sarp, Rihem, Ayse, Serra, Hilal, Belinay, Yigit Efe]

        //Arary list in eleman sayisini bul
        int reyyanFriendsNum=reyyanFriends.size();
        System.out.println(reyyanFriendsNum);// 11

        //Arary list in spesific bir elemani al
        String friend5=reyyanFriends.get(5);
        System.out.println(friend5);// Rihem

        //Arary list in spesific bir elemanini degistir
        reyyanFriends.set(1,"Umay");
        reyyanFriends.set(7,"Zeynep");
        System.out.println(reyyanFriends);// [Eymen, Umay, Amine, Guven, Sarp, Rihem, Ayse, Zeynep, Hilal, Belinay, Yigit Efe]

        //Arary list elemanlari sil
//        reyyanFriends.clear();
//        System.out.println(reyyanFriends);// []

        //Arary list te bir elemanin var olup olmadigini kontrol et
        boolean result1=reyyanFriends.contains("Eymen");
        System.out.println(result1);// true

        //Arary list in bos olup olmadigini kontrol et
        // 1. way:
        if (reyyanFriends.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least one element");// List has at least one element
        }

        reyyanFriends.clear();

        //2.way:
        if (reyyanFriends.isEmpty()){
            System.out.println("List is empty");// List is empty
        }else {
            System.out.println("List has at least one element");
        }

    }//main
}//class
