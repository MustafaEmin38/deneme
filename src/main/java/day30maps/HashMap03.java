package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        //Tum noktalama isaretlerinden temizledik
        String s = "I like you, like like!";
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);//I like you like like

        //Kelimelerinin gorunum sayisini bulacagimiz icin stringi kelimelere bolduk
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        //words arrayindeki kelimeler birer birer Map de var mi yok mu diye kontrol edecegiz
        //words arrayindeki kelimeler Map de yoksa, Map e value su 1 olarak koy diyecegiz
        //words arrayindeki kelimeler Map de varsa, Map e varolan value su 1 artirilarak ekle diyecegiz

        HashMap<String, Integer> occ = new HashMap<>();//bos bir hashmap olusturduk
        System.out.println(occ);// {}

        for (String w : words) {
            Integer numOfOccurance = occ.get(w);
            if(numOfOccurance==null){
                occ.put(w,1);
            }else {
                occ.replace(w,numOfOccurance+1);
            }
        }
        System.out.println(occ);//{like=3, I=1, you=1}


        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
        String k="Hello Henry!";

        k=k.replaceAll("\\p{Punct}","").replaceAll(" ","");
        System.out.println(k);

        String letters[]=k.split("");
        System.out.println(Arrays.toString(letters));

        HashMap<String,Integer> apperance=new HashMap<>();

        for (String w: letters){
            Integer numOfApparance=apperance.get(w);
            if (numOfApparance==null){
                apperance.put(w,1);
            }else {
                apperance.replace(w,numOfApparance+1);
            }
        }
        System.out.println(apperance);


    }
}