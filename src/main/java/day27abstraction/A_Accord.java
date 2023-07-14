package day27abstraction;

public class A_Accord implements A_Ac,A_Engine,A_Security{
    @Override
    public void cool() {
        System.out.println("Accord cools super");

    }
}//class
