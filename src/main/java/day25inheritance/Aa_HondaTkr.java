package day25inheritance;

public class Aa_HondaTkr extends Aa_CarTkr {
    public Aa_HondaTkr(){

        //super(); her consructorin ilk satirinda default ol super keywordu vardir ama gorunmez. super; parent i ifade eder, () const if eder
        //super(); ==> beni bir ust parent in const irina gotur demek
        System.out.println("3. olarak Honda yazilacak, cunku o bir child...");

        System.out.println("this.model = " + this.model);
        System.out.println("this.km = " + this.km);
        System.out.println("super.model = " + super.model);
        System.out.println("super.km = " + super.km);

    }
    public Aa_HondaTkr(String make, int year){
        super();
        System.out.println("Honda 2");
    }
    //___________________________________________________>1.gun

    public String model="Civic";
    public int km=10000;
}//class
