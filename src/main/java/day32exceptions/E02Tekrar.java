package day32exceptions;

public class E02Tekrar {
    public static void main(String[] args) {

        //Birbirine donusturulemeyecek data type larini donusturmekte israr ederseniz Java ClassCastException atar
        try {
            Object obj = 70;
            String  str = (String) obj;//explicit narrowing yaptik ama hata verdi
            System.out.println(str);
        } catch (ClassCastException e) {

            System.err.println("Her data type i her data type ina ceviremezsiniz");
            //console da hata kodunu okumayi kolaylastirmak icin out yerine err yazilabilir(sout yerine serr yazabiliriz)
        }
    }
}
