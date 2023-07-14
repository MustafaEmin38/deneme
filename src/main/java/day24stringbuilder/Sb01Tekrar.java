package day24stringbuilder;

public class Sb01Tekrar {
    public static void main(String[] args) {
            //Mutable
        //StringBuilder kullanarak string uretmenin 1. yolu:
        StringBuilder newString=new StringBuilder("I love Java. ");
        System.out.println(newString);//I love Java.

        newString.append("My love Java");
        System.out.println(newString);//I love Java. My love Java

        //StringBuilder kullanarak string uretmenin 2. yolu:
        StringBuilder newString2= new StringBuilder();
        System.out.println(newString2.length());//0

        newString2.append("Learn Java earn money.");
        System.out.println(newString2);//Learn Java earn money.

        System.out.println(newString2.length());//22
        System.out.println(newString2.capacity());//34
        //capaciyt i java bize 16 verir. biz 16 asarsak her seferinde (capacity*2)+2 kadar capacity verir

        newString2.append("Win dollar, earn dollar");
        System.out.println(newString2);//Learn Java earn money.Win dollar, earn dollar
        System.out.println(newString2.length());//45
        System.out.println(newString2.capacity());//70

        //Defualt capacity i nasil degistirebiliriz?
        StringBuilder newString3= new StringBuilder(3);
        newString3.append("Ali");
        System.out.println(newString3.length());//3
        System.out.println(newString3.capacity());//3

    }//main
}//class
