package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02Tekrar {
    public static void main(String[] args) {
        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(17);
        nums.add(19);
        nums.add(6);
        nums.add(13);

        Collections.sort(nums);//6-12-13-17-19

        int minFark=nums.get(1)-nums.get(0);

        for  (int i=1 ; i<nums.size() ; i++) {

            minFark=Math.min(minFark, nums.get(i)-nums.get(i-1));
        };
        System.out.println(minFark);//1

        for (int i=1 ; i<nums.size() ; i++){

            if (minFark==nums.get(i)-nums.get(i-1)){
                System.out.println(nums.get(i)+" and "+nums.get(i-1));//13 and 12
            }
        }



    }//main
}//class
