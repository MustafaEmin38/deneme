package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01Tekrar {

    public static void main(String[] args) {
        //Ornek 1: Bir liste teki tekrarisz elemanlari console a yazdirin
        List<String> names=List.of("Ela","Ali","Ece","Su","Can");

        for (String w:names){
            if(names.indexOf(w)==names.lastIndexOf(w)){
                System.out.print(w+" ");// Ela Ali Ece Su Can
            }
        }
        System.out.println();

        //Ornek 2: Bir list te tekrarli eleman olup olmadigini gosteren kodu yaziniz.

        List<String> names2=List.of("Ela","Ali","Ece","Su","Can","Ela","Su");
        int counter=0;
        for (String w:names2){
            if(names2.indexOf(w)!=names2.lastIndexOf(w)){
                counter++;
            }
        }
        System.out.println(counter);//4

        if (counter==0){
            System.out.println("All elements are unique in the list");
        }else {
            System.out.println("At least one element unique in the list");
        }

        //Ornek 3: Bir list te tekrarli eleman olup olmadigini gosteren kodu yaziniz.
        List<Integer> number=new ArrayList<>();
        number.add(5);
        number.add(3);
        number.add(5);
        number.add(2);
        number.add(3);

        int sayac=0;

        for (int w: number) {
            if (number.indexOf(w) != number.lastIndexOf(w)) {
                sayac++;
            }
        }
        System.out.println(sayac);//4

        if (sayac == 0) {
            System.out.println("Tekrarli eleman yok");
        } else {
            System.out.println("En az bir tane tekrarli eleman var");

        }






    }//main
}//class
