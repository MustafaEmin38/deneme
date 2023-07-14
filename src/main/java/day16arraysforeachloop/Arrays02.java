package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1 :  String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile
        // son elemanin icerdigi karakter sayilari toplamini ekrana yazdirin


        String arr []= new String[5];//==> burdaki 5 ayni zamanda asagidaki [arr.length] imiz olur
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length() + arr[arr.length - 1].length());

        //Ornek 2: String bir array olusturun, icine 5 tane eleman ekleyin
        //tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin

        String brr []= new String[5];
        brr[0]="Miami";
        brr[1]="New York";
        brr[2]="Londra";
        brr[3]="Paris";
        brr[4]="Berlin";

        //1.yol for loop

        int totalChar=0;
        for (int i = 0; i < brr.length; i++) {
            totalChar=totalChar+brr[i].length();
        }
        System.out.println(totalChar);//30

        //2. yol for each loop( enhanced loop)
        //baslangic degeri, loop un calisma sarti ve increment/decrement kismini kendisi halleder
        //for each loop "Array" lerde ve "collection"larda kullanilir

        /*for each loop kalibi
        for ( DataType w (variableName) : arr/collection ){
            calisacak kodlar
        }

         */
        int sum=0;
        for (String w : brr){
            sum=sum+w.length();
        }
        System.out.println(sum);//30

        //Ornek 3: Notlar adinda Integer bir array olusturun icine 6 tane not yerlestiriniz ve not ortalamasini ekrana yazdiriniz
        int notlar []= new int[6];
        notlar[0]=50;
        notlar[1]=73;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;
        System.out.println(Arrays.toString(notlar));
        int toplam=0;
        for (int w: notlar){
            toplam=toplam+w;
        }
        System.out.println(toplam/notlar.length);

    }//main
}//class
