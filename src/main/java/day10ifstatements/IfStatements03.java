package day10ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //* Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        //January==>1  , February==>2
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi yaziniz:");
        String nameMonth=scan.next();

        if (nameMonth.equalsIgnoreCase("January")) {
            System.out.println("1.month");
        } else if (nameMonth.equalsIgnoreCase("February")) {
            System.out.println("2.month");
        } else if (nameMonth.equalsIgnoreCase("March")) {
            System.out.println("3.month");
        } else if (nameMonth.equalsIgnoreCase("April")) {
            System.out.println("4.month");
        } else if (nameMonth.equalsIgnoreCase("May")) {
            System.out.println("5.month");
        } else if (nameMonth.equalsIgnoreCase("June")) {
            System.out.println("6.month");
        } else if (nameMonth.equalsIgnoreCase("July")) {
            System.out.println("7.month");
        } else if (nameMonth.equalsIgnoreCase("August")) {
            System.out.println("8.month");
        } else if (nameMonth.equalsIgnoreCase("September")) {
            System.out.println("9.month");
        } else if (nameMonth.equalsIgnoreCase("October")) {
            System.out.println("10.month");
        } else if (nameMonth.equalsIgnoreCase("November")) {
            System.out.println("11.month");
        } else if (nameMonth.equalsIgnoreCase("December")) {
            System.out.println("12.month");
        } else {
            System.out.println("Invalid month name,please check  ");
        }
        /*
        //Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        //January==>1  , February==>2

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay ismi giriniz...");
        String monthName=input.next();

        if (monthName.equals("January"))
        {
            System.out.println(1);
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println(2);

        }else if (monthName.equalsIgnoreCase("March")) {
            System.out.println(3);

        }else if (monthName.equalsIgnoreCase("April")) {
            System.out.println(4);

        }else if (monthName.equalsIgnoreCase("May")) {
            System.out.println(5);

        }else if (monthName.equalsIgnoreCase("June")) {
            System.out.println(6);

        }else if (monthName.equalsIgnoreCase("July")) {
            System.out.println(7);

        }else if (monthName.equalsIgnoreCase("August")) {
            System.out.println(8);

        }else if (monthName.equalsIgnoreCase("September")) {
            System.out.println(9);

        }else if (monthName.equalsIgnoreCase("October")) {
            System.out.println(10);

        }else if (monthName.equalsIgnoreCase("November")) {
            System.out.println(11);

        }else if (monthName.equalsIgnoreCase("December")) {
            System.out.println(12);

        }else {
            System.out.println("Invalid month name");
        }


         */

    }//main
}//class
