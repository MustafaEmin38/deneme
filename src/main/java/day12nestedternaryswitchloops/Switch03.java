package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03 {public static void main(String[] args) {
    //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz
    Scanner input= new Scanner(System.in);
    System.out.println("Iki sayi giriniz");
    double a=input.nextDouble();
    double b=input.nextDouble();

    System.out.println("Yapilacak islemi giriniz. +, -, *, /, % birini seciniz");
    char opr=input.next().charAt(0);

    switch (opr){
        case '+':
            System.out.println(a + " + " + b + " = " + (a + b));
            break;
        case '-':
            System.out.println(a + " - " + b + " = " + (a - b));
            break;
        case '*':
            System.out.println(a + " * " + b + " = " + (a * b));
            break;
        case '/':
            System.out.println(a + " / " + b + " = " + (a / b));
            break;
        case '%':
            System.out.println(a + " % " + b + " = " + (a * b/100));
            break;
        default:
            System.out.println("Bu islem tanimlanmamistir");

    }

    //* Example 1: Kulanicidan alinan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz
    Scanner scan = new Scanner(System.in);
    System.out.println("Lutfen iki sayi giriniz");
    double num1=scan.nextDouble();
    double num2=scan.nextDouble();
    System.out.println("Lutfen yapmak istediginiz islemi seciniz");
    char islem=scan.next().charAt(0);

    switch (islem){
        case '+':
            System.out.println(num1+num2);
            break;
        case '-':
            System.out.println(num1-num2);
            break;
        case '*':
            System.out.println(num1*num2);
            break;
        case '/':
            System.out.println(num1/num2);
            break;
        case '%':
            System.out.println(num1+" % "+num2+" = "+(num1*num2/100));
            break;}



}//Main
}//Class
