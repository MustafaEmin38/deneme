package day03methodobjectcreationscanner;

public class Runner {//olusturdugum Car kalibini calıstırmak icin icinde main method olan bir Runner (calistirici) ekledim

    public static void main(String[] args) {
        //Object nasil olusturulur?
        //Burda once javaya bu object icin hangi kalibi kullanacagimizi (class i) soylemeliyiz
        //Class ismi + Object ismi + Assigmnet operator + "new" keywordu + Consructor
        //    Car          myCar           =                new               Car();
        //Constructor java da objeleri olusturmak icin kullanılan ozel bir method dur.(bakkal amcamız)
        //"new" keyword u sifirdan yeni bir object olusturmak icin kullanilir.

        Car myCar = new Car();
        System.out.println("myCar.model = " + myCar.model);
        System.out.println("myCar.fiyat = " + myCar.fiyat);
        myCar.hareket();
        myCar.dur();

        CarMyTekrar benimArabam = new CarMyTekrar();
        System.out.println("benimArabam.model = " + benimArabam.model);
        System.out.println("benimArabam.fiyat = " + benimArabam.fiyat);
        benimArabam.hareket();
        benimArabam.dur();

       Student myStudent = new Student();
        System.out.println("myStudent.name = " + myStudent.name);
        System.out.println("myStudent.grade = " + myStudent.grade);
        System.out.println("myStudent.adress = " + myStudent.adress);
        myStudent.study();
        myStudent.feed();

    StudentMyTekrar canimOgrencim = new StudentMyTekrar();
        System.out.println("canimOgrencim.name = " + canimOgrencim.name);
        System.out.println("canimOgrencim.sinif = " + canimOgrencim.sinif);
        System.out.println("canimOgrencim.adres = " + canimOgrencim.adres);
        canimOgrencim.study();
        canimOgrencim.feed();

        //homework
        //icinde isim ve yas varibale lari ile teach methodu bulunan bir Teacher objecti olusturun
        // ve obje uzerinde bu ozellikleri kullaninin

        TeacherHomework idealTeacher = new TeacherHomework();
        System.out.println("idealTeacher.name = " + idealTeacher.name);
        System.out.println("idealTeacher.school = " + idealTeacher.school);
        System.out.println("idealTeacher.age = " + idealTeacher.age);
        System.out.println("idealTeacher.boy = " + idealTeacher.boy);
        System.out.println("idealTeacher.character = " + idealTeacher.character);
        idealTeacher.aliskanlik();
        idealTeacher.teach();
        idealTeacher.travel();

    }//main.method

}//class