package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03Tekrar {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        //I=1, like=3, you=1 ==>bizden istenen cozumde key ve value var.o zamn map ile cozum yapacagiz
        String s="I like you, like like!";

        //String imizi tum noktalama isaretlerinden temizledik
        s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);//I like you like like

        //Kelimelerinin gorunum sayisini bulacagimiz icin stringi kelimelere bolduk
        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        //Cozum olarak key ve value istendigi icin key-value koyacagimiz bos bir HashMap olusturuyoruz
        HashMap<String, Integer> yeniMap=new HashMap<>();

        int sayac=0;
        for (String w: words) {
            Integer mapGorunum=yeniMap.get(w);
            System.out.println(mapGorunum);

            if (mapGorunum==null){
                yeniMap.put(w,1);
            }else {
                yeniMap.replace(w,mapGorunum+1);
            }
        } System.out.println(yeniMap);//{like=3, I=1, you=1}


        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String k="Hello Henry!";

        k=k.replaceAll("\\p{Punct}","").replaceAll(" ","");
        System.out.println(k);

        String letters[]=k.split("");
        System.out.println(Arrays.toString(letters));//[H, e, l, l, o, H, e, n, r, y]

        HashMap<String, Integer> lettersMap=new HashMap<>();

                            //[H, e, l, l, o, H, e, n, r, y]
        for (String w: letters) {

            Integer lettersGorunum=lettersMap.get(w);

            if (lettersGorunum==null){
                lettersMap.put(w,1);
            }else {
                lettersMap.replace(w,lettersGorunum+1);
            }
        }
        System.out.println(lettersMap);


    }
}
