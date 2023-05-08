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
        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
        myCar.dur();
        myCar.hareket();

        CarMyTekrar benimArabam = new CarMyTekrar();
        System.out.println("benimArabam.model = " + benimArabam.model);
        System.out.println("benimArabam.fiyat = " + benimArabam.fiyat);
        benimArabam.hareket();
        benimArabam.dur();

        Student aliCan = new Student();
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.grade = " + aliCan.grade);
        System.out.println("aliCan.adress = " + aliCan.adress);
        aliCan.study();
        aliCan.feed();

        StudentMyTekrar aliCem = new StudentMyTekrar();
        System.out.println("aliCem.name = " + aliCem.name);
        System.out.println("aliCem.sinif = " + aliCem.sinif);
        System.out.println("aliCem.adres = " + aliCem.adres);
        aliCem.study();
        aliCem.feed();

        //homework
        //icinde isim ve yas varibale lari ile teach methodu bulunan bir Teacher objecti olusturun ve obje uzerinde bu ozellikleri kullaninin

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