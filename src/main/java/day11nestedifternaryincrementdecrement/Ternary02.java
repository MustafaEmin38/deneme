package day11nestedifternaryincrementdecrement;
public class Ternary02 {
    public static void main(String[] args) {
        //Ornek 1;
        int a = 10;
        int b = 20;

        int r1 = b < a ? a++ : ++b;//==> b=21 r=21 a=10
        System.out.println(r1);//21
        System.out.println(a);//10
        System.out.println(b);//21

        //* Ornek 1;
        int x = 35;
        int y = 12;

        int z = y < x ? x++ : ++y;
        System.out.println(z);//35
        System.out.println(x);//36
        System.out.println(y);//12


        //Ornek 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //   -4 ==> -1*4   4==>4  0==>0
        int c=4;
        int r2= c<0 ? -1*c : c;
        System.out.println(r2);  //4

        //* Ornek 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        int k=-17;
        int mutlakDeger=k<0? k*-1:k;
        System.out.println(mutlakDeger);//

        //Ornek 3: İki sayinin isareti ayni ise bu sayilari carpan isaretleri farkli ise
        //"farkli isaretli sayilari carpamıyorum" mesaji veren kodu yaziniz
        int m= 5;
        int n= -6;
        Object r3= (m>0 && n>0) || (m<0 && n<0) ? m*n : "farkli isaretli sayilari carpamıyorum";
        System.out.println(r3);

        //* Ornek 3: İki sayinin isareti ayni ise bu sayilari carpın isaretleri farkli ise
        //"farkli isaretli sayilari carpamıyorum" mesaji veren kodu yaziniz
        int s= 5;
        int t=-7;
        Object cozum =s<0 && t<0 || s>0 && t>0 ? s*t : "farkli isaretli sayilari carpamıyorum";
        System.out.println(cozum);
        Object czm =s*t>0 ? s*t : "farkli isaretli sayilari carpamıyorum";
        System.out.println(czm);


        //Ornek 4: Size verilen sayinin 3 basamaklı olup olmadigini kontrol eden kodu yaziniz.
        int p= -313;
        p=Math.abs(p);

        String r4=p>99 && p<1000  ?  "uc basamaklidir" : "uc basamakli degildir";
        System.out.println(r4);

        //* Ornek 4: Size verilen sayinin 3 basamaklı olup olmadigini kontrol eden kodu yaziniz.
        int q=-102;
        String w=q>99 && q<1000 || q>-1000 && q<-99 ? "uc basamaklidir" : "uc basamakli degidir";
        System.out.println(w);

        int ww=Math.abs(q);
        String www=ww>99 && ww<1000 ? "uc basamaklidir" : "uc bamakli degildir";
        System.out.println(www);


    }//Main
}//Class