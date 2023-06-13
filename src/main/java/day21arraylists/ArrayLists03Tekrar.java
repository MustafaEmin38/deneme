package day21arraylists;

import java.util.List;

public class ArrayLists03Tekrar {
    public static void main(String[] args) {
        //Kisa yoldan bir list nasil olusturulur?
        List<Integer> plakaCodes=List.of(38,16,05,06,42,58);
        System.out.println(plakaCodes);// [38, 16, 5, 6, 42, 58]

//        plakaCodes.remove(0);
//        System.out.println(plakaCodes);==> List.of() method u degisiklige izin vermez

        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumunun index ini verir.
        int index1=plakaCodes.indexOf(38);
        System.out.println(index1);//0

        //lastIndexOf(aranan karakter) methodu aranan karakterin son gorunumun index ini verir.
        int index2=plakaCodes.indexOf(38);
        System.out.println(index2);//0






    }
}
