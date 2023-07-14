package day24stringbuilder;

public class Sb02Tekrar {
    public static void main(String[] args) {

        StringBuilder strBuilder=new StringBuilder("Java, Java,Java...");
        strBuilder.reverse();
        System.out.println(strBuilder);//...avaJ,avaJ ,avaJ

        strBuilder.deleteCharAt(6);
        System.out.println(strBuilder);//...ava,avaJ ,avaJ

        strBuilder.delete(0,5);
        System.out.println(strBuilder);//a,avaJ ,avaJ

        strBuilder.replace(3,5,"_$$$_");//ilk index dahil sonuncu haric sildi. yerine benim girdigim str yi koydu
        System.out.println(strBuilder);//a,a_$$$_J ,avaJ

        strBuilder.insert(0,"XXX");
        System.out.println(strBuilder);

        StringBuilder a=new StringBuilder("Avva");
        StringBuilder b=new StringBuilder("Javva");

        int r1=a.compareTo(b);
        System.out.println(r1);//-9 a stringi b den 9 harf onde

        //StringBuilder nasil string e cevrilir?
        String newStr=a.toString().toUpperCase();
        System.out.println(newStr);

        //String nasil string builder a cevrilir?
        StringBuilder newStrBuilder= new StringBuilder(newStr);
        System.out.println(newStrBuilder);



    }//main
}//class
