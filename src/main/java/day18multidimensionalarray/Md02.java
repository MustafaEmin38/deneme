package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        //Ornek 1: Yukaridaki students arrayinde icinde "m" harfi olan isimleri console a yazdiriniz

        for (String[] w :students){//students tan w ye w den k ya boşaltıyourz

            for (String k :w) {
                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }
        //Ornek 2:Bir int multidimensional array olusturunuz tum elemanlarin carpimini hesaplayiniz
        int nums[][]={{5,4},{2,3,2},{7}};
        int sonuc=1;
        for (int [] w:nums){
            for (int k:w){
                sonuc=sonuc*k;
            }
        }
        System.out.println(sonuc);
    }//main
}//class