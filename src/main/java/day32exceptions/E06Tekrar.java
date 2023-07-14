package day32exceptions;

public class E06Tekrar {
    public static void main(String[] args) {
        /*
        1) Exception olsada olmasada calistirmamiz gereken kodlari finally block icine yazariz
        2) Database ile baglantiyi kesme isini yapan kodlar gibi kodlar her halukarda calistirilmalidir, bu tarz kodlari finally block icine koyariz
        3) try tek basina kullanilamaz, try + catch olabilir, try + cok catch olabilir
            try, catch block olmadan sadece finally block ilede kullanilabilir
            try ile coklu catch ve finally block kullanilabilir
        4) Exceptionlar disinda error diye adlandirdigimiz ve Handle edilemeyen problemler vardir.
           Application larda Memory nin dolmasi bir error dur
              Iki tür memory error vardir
               1)Stack Memory dolarsa "StackOverFlow Error" alirsiniz
               2)Heap Memory dolarsa "OutOfMemory Error" alirsiniz
               Error lar handle edilemez: Error meydana gelmisse error meydana gelmistir ^_^
         */

        int a = 12;
        int b = 6;
        int c[] = {3,6,9,12};
        getElementFromArray(c,a,b);

    }

    public static void getElementFromArray (int c[], int a, int b){
        try {
            int index = a / b;
            int element = c[index];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the Database");
        }
    }
}
