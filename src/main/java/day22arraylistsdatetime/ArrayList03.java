package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {//int sorulmuş bir sorudur
    /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin
    */
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");


        Scanner input=new Scanner(System.in);

        int counter=0;
        int live=3;
        do {
            if (counter==live){
                System.out.println("Game Over");
                break;
            }
            System.out.println("Please enter a letter");
            String letter=input.next().toUpperCase().substring(0,1);

            if(myList.contains(letter)){//Kullanicinin girdigi harf list'te var ise
                myList.set(myList.indexOf(letter), "Buldum!");//mylist e bak letter in ilk gorunumunu bana ver
            }else {
                myList.add(letter);
            }
            System.out.println(myList);

            counter++;
        }while (true);//do loop icine if(counter==live) koymadan,true yerine counter<3 de koysak aynisi olur


    }//main
}//class
