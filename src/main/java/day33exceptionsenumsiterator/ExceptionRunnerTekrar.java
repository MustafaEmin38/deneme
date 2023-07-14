package day33exceptionsenumsiterator;

public class ExceptionRunnerTekrar {
    /*
    Garbage Collector memory i temiz tutmak icin surekli memoryi tarar ve silinmesi gerekenleri siler
    Garbage Collector silmeden once silecegi datalari finalize eder sonra siler.

    ***int sorusu=> final-finally-finalize arasindaki farklar nelerdir?
    -final; variable-class-method =>ucuyle de kullanabiliriz.kisirlastirma yapar
    -finally; her halükarda calisacak kod demek
    -finalize;Garbage Collector silmeden once silecegi datalari toparlar; baska baglantisi var mi,kullaniliyor mu, acik mi bakar sonra siler
     */
    public static void main(String[] args) throws InvalidStudentGradeExceptionTkr {

        getStudentGrade(50);//50
        //getStudentGrade(-50);//InvalidNumberException

        getTheNumberOfStudents(50);
        getTheNumberOfStudents(-50);//InvalidNumberException

    }//main

    public static void getTheNumberOfStudents(int numOfStudents){
        if (numOfStudents<0){
            try {
                throw new InvalidNumberExceptionTkr("Student number cannot be negative");//Inv classindan obj olustur ve onu firlat
                                                                                    // run time old icin kirmizi yanmadi, run yapinca cikacak
            } catch (InvalidNumberExceptionTkr e) {
                System.err.println(e.getMessage());
            }
        }else {
            System.out.println(numOfStudents);
        }
    }


    //Exception almak icin method olustururuz
    //Method olusturup if body icine aliriz. hata firlatsin diye "throw new Inv..." mesaj veririz.
    //Son olarak kirmizi sikayeti kesmek icin more actions yaparz;
    //Best practice "try-catch" yapmaktir. bir kere try-catch yaparsak baska yerlerde surekli(method sign yanina) throws yapmak zorunda kalmayiz
    //biz diger yontemi kullanacagiz
    public static void getStudentGrade(int grade) throws InvalidStudentGradeExceptionTkr {
        if (grade<0 || grade>100){
            throw new InvalidStudentGradeExceptionTkr("Studen's grades cannot be less than zero or greater than 100");
        }else {
            System.out.println(grade);
        }
    }

}//class
