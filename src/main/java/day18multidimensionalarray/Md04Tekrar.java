package day18multidimensionalarray;

public class Md04Tekrar {
    public static void main(String[] args) {
        //Ornek: Bir integer multidimensional arraydeki en k ve  en b elemanin toplamini bulunuz
    int ages[][]={{9,11},{8},{17,37}};

    int kucuk=ages[0][0];
    int buyuk=ages[0][0];

    for (int [] w: ages){
        for (int k: w){
             kucuk=Math.min(k,kucuk);
             buyuk=Math.max(k,buyuk);
        }
    }
        System.out.println(kucuk+buyuk);

    }
}
