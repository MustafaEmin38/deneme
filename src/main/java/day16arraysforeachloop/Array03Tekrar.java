package day16arraysforeachloop;

import java.util.Arrays;

public class Array03Tekrar {
    public static void main(String[] args) {
        //Ornek 1: ınteger bir array olusturunuz. Icine 6 tane eleman yerlestiriniz bu elemanlarin en kucugu ile
        // en buyugunun toplamını ekrana yazdiriniz
        int notes[]=new int[6];
        notes[0]=88;
        notes[1]=56;
        notes[2]=75;
        notes[3]=98;
        notes[4]=43;
        notes[5]=49;
        System.out.println(Arrays.toString(notes));//[88, 56, 75, 98, 43, 49]

        //1.yol ==> sort() method u  >>> Arrays.sort.(notes) => kucukten buyuge dogru siralar
        Arrays.sort(notes);
        System.out.println(Arrays.toString(notes));//siralanmis halini yazdiralim [43, 49, 56, 75, 88, 98]
        System.out.println("En k + En b toplamı = "+(notes[0] + notes[notes.length - 1]));// 43+98=141

        //2.yol ==> min() ve max() method u
        int enK=notes[5];//notes[5] yerine [0] da olur. min method u (enK,w) arasinda kiyas yapar kucugu secer.
        int enB=notes[3];

        for (int w : notes) {
            enK=Math.min(enK,w);//43
            enB=Math.max(enB,w);//98
        }
        System.out.println(enK+enB);//143

        //Ornek 2: String bir array olusturunuz 6 eleman ekleyiniz, sari dan onceki elemanlari yaziriniz
        String renkler[] = new String[6];
        renkler [0]="mavi";
        renkler [1]="kirmizi";
        renkler [2]="yesil";
        renkler [3]="mor";
        renkler [4]="sari";
        renkler [5]="siyah";


        for (String w:renkler) {

            if(w.equals("sari")){
                break;
            }System.out.print(w+"/");
        }


    }//main
}//class
