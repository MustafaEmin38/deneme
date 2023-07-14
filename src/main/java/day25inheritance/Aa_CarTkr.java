package day25inheritance;

public class Aa_CarTkr extends Aa_VehicleTkr {
    public Aa_CarTkr(){
            super();
        System.out.println("Car yazilacak, cunku Honda nin parent i...");
    }

    public Aa_CarTkr(String make){

        System.out.println("Car 2");
    }
    //________________________________________

    public String model="Accord";
    public int km=20000;



}//class
