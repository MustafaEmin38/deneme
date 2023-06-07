package day17arrays;

import java.util.Arrays;

public class Arrays05Tekrar {
    public static void main(String[] args) {
        //ınt sorusu
        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]
        int a[]={0,2,3,0,12,0};//[0, 2, 3, 0, 12, 0]
        int b[]=new int[a.length];

        int index=0;

        for( int w : a ){
             if (w!=0){
                  b[index]=w;
                  index++;
             }
        }
        System.out.println(Arrays.toString(b));//[2, 3, 12, 0, 0, 0]


    }//main
}//class
