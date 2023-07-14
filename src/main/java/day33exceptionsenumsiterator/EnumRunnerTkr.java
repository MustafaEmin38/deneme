package day33exceptionsenumsiterator;

public class EnumRunnerTkr {
    public static void main(String[] args) {
        Cities ankara=Cities.ANKARA;// Cities sepetine koyduk cunku ANKARA bir Cities bir enum object idir
        System.out.println(ankara);//ANKARA    //ama cityName ve postalCode bir string cunku cift tirnakli

        String adanaCityName=Cities.ADANA.getCityName();
        System.out.println(adanaCityName);

        System.out.println("Cities.ANKARA.getPlateCode() = " + Cities.ANKARA.getPlateCode());
    }
}
