package day16arraysforeachloop;

public class Array02Tekrar {
    public static void main(String[] args) {
        //Ornek 1 :  String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile
        // son elemanin icerdigi karakter sayilari toplamini ekrana yazdirin
        String arr[]=new String[5];
        arr[0]="Mercedes";
        arr[1]="Audi";
        arr[2]="Bmw";
        arr[3]="Wolkswagen";
        arr[4]="Skoda";

        System.out.println(arr[0].length()+arr[arr.length-1].length());//13

        //Ornek 2: String bir array olusturun, icine 5 tane eleman ekleyin
        //tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin

        String computerNames[] =new String[5];
        computerNames [0]="asus";
        computerNames [1]="lenovo";
        computerNames [2]="toshiba";
        computerNames [3]="apple";
        computerNames [4]="acer";

        //1.yol
        int cpuNamesTotal=0;

        for (int i = 0; i < computerNames.length; i++) {

            cpuNamesTotal+=computerNames[i].length();

        }System.out.println(cpuNamesTotal);//26

        //2.yol
        int cpuTotal = 0;

        for ( String w  : computerNames      ) {
            cpuTotal=cpuTotal+w.length();

        }
        System.out.println(cpuTotal);//26

        //Ornek 3: Notlar adinda Integer bir array olusturun icine 6 tane not yerlestiriniz ve not ortalamasini ekrana yazdiriniz
        int notes[]=new int[6];
        notes [0]=63;
        notes [1]=22;
        notes [2]=24;
        notes [3]=65;
        notes [4]=88;
        notes [5]=46;

        int total=0;
        for (int w: notes) {
            total=total+w;
        }
        System.out.println(total / notes.length);

        int toplam=0;
        for (int i = 0; i < notes.length; i++) {
            toplam=toplam+notes[i];
        }
        System.out.println(toplam/notes.length);


    }//main
}//class
