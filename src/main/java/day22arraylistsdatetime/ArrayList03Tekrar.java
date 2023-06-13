package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class ArrayList03Tekrar {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin
    */

        List<String> letter=new ArrayList<>();
        letter.add("Q");
        letter.add("L");
        letter.add("S");
        letter.add("A");
        letter.add("J");
        letter.add("P");

        Scanner input=new Scanner(System.in);

        /*
        1.way ==>isteneni yaptigimiz çözüm
        System.out.println("Please enter a letter");
        String userLetter=input.next().toUpperCase().substring(0,1);

        if(letter.contains(userLetter)){

            letter.set(letter.indexOf(userLetter),"Buldum!");
        }else {
            letter.add(userLetter);
        }
        System.out.println(letter);*/


        /*
        2.way ==> do loop ile çözüm

        int counter=0;
        do {
            System.out.println("Please enter a letter");
            String userLetter=input.next().toUpperCase().substring(0,1);

            if(letter.contains(userLetter)){

                letter.set(letter.indexOf(userLetter),"Buldum!");
            }else {
                letter.add(userLetter);
            }
            System.out.println(letter);

            counter++;
        }while (counter<3);//sartimi while in icine koyarak çozdum =>counter 3 ten az old surece calis
        */

        /*
        3. way ==> do loop ile cozum
        int counter=0;
        do {
            if (counter==3){//counter 3e esit olunca kir
                break;
            }
            System.out.println("Please enter a letter");
            String userLetter=input.next().toUpperCase().substring(0,1);

            if(letter.contains(userLetter)){

                letter.set(letter.indexOf(userLetter),"Buldum!");
            }else {
                letter.add(userLetter);
            }
            System.out.println(letter);

            counter++;
        }while (true);//sonsuz loop yaptim ama bunu yukarida if le kirdim

         */


        //4.way ==> do loop ile cozum
        int counter=0;
        int live=3;
        do {
            if (counter==live){// oyuncuya 3 can verdim. counter can a esit olunca oyunu bitirdim
            System.out.println("Game Over!");
                break;
            }

            System.out.println("Please enter a letter");
            String userLetter=input.next().toUpperCase().substring(0,1);

            if(letter.contains(userLetter)){

                letter.set(letter.indexOf(userLetter),"Buldum!");
            }else {
                letter.add(userLetter);
            }
            System.out.println(letter);

            counter++;
        }while (true); //sonsuz loop yaptim ama bunu yukaride if le kirdim







    }//main
}//class
