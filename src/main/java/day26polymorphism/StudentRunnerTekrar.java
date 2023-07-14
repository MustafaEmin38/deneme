package day26polymorphism;

public class StudentRunnerTekrar {
    public static void main(String[] args) {
        StudentTekrar s1=new StudentTekrar();
        System.out.println(s1.getStdId());//AC123546
        System.out.println(s1.getNotOrt());//3.13
        System.out.println(s1.isSuccesful());//false

        System.out.println("====================================================================================================");
        s1.setStdId("MU654321");
        s1.setNotOrt(4.99);//burda kalip(class) degil, object(s1) degisir
        s1.setSuccesful(true);
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());//4.99==> set degistirmek icin get gorunur yapmak icin
        System.out.println(s1.isSuccesful());

        System.out.println("====================================================================================================");
        s1.setStdId("VH012345");
        s1.setNotOrt(1.25);
        s1.setSuccesful(false);
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

        //burda 1 object var ama console da 3 ogrenci var. Encapsulation in diger faydasi da budur.
        // memory nin tasarruflu kullanimi


    }//main
}//class
