package day12nestedternaryswitchloops;

public class Switch01Tekrar {
    public static void main(String[] args) {
        //Note: Java da kodlarimizi yazarken nested yapilardan mumkun oldugunca uzak durmaliyiz
        // cunku bu tarz yapilar uygulamayi yavaslatir.(Time Consuming)
        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7

        //1. Yol if else cozumu
        String day="monday";

        if (day.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        }else if (day.equalsIgnoreCase("Monday")){
            System.out.println(2);
        }else if (day.equalsIgnoreCase("Tuesday")){
            System.out.println(3);
        }else if (day.equalsIgnoreCase("Wednesday")){
            System.out.println(4);
        }else if (day.equalsIgnoreCase("Thursday")){
            System.out.println(5);
        }else if (day.equalsIgnoreCase("Friday")){
            System.out.println(6);
        }else if (day.equalsIgnoreCase("Saturday")){
            System.out.println(7);
        }else {
            System.out.println("Hatali giris yaptin dayuuuuu :))P");
        }

        //2.yol Switch
        switch (day.toLowerCase()) {
            case "sunday":
                System.out.println(1);
                break;
            case  "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Hatali giris yaptin dayuuu :)P");
        }




    }//main
}//class
