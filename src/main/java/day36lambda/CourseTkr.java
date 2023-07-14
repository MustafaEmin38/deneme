package day36lambda;

public class CourseTkr {
    /*
    1. icinde private variable lar
    2. parametreli ve parametresiz constructor lar
    3. getter lar
    4. setter lar
    5. toString methodu barindiran classlara POJO CLASS denir(Plained Old Java Object=basit-temel bagimsiz bir java sinifi)

     */
    //private variables(object imde olmasini/gormeyi istedigim ozellikler)______________________________________________________________________________________________________________________
    private String season;
   private String courseName;
   private int avarageScore;
   private int numberOfStudents;



    //parametresiz constructor(object i olusturmak icin const olmasi gerek)______________________________________________________________________________________________________________________
    public CourseTkr() {
    }


    //parametreli constructor(object i olusturmak icin const olmasi gerek)______________________________________________________________________________________________________________________
    public CourseTkr(String season, String courseName, int avarageScore, int numberOfStudents) {
        this.season = season;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOfStudents = numberOfStudents;
    }


//private old icin baska clasttan gorunmez,gorulmeyi ve okunmayi saglasin diye getter yaptik______________________________________________________________________________________________________________________

    public String getSeason() {
        return season;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }



    //private old icin baska clasttan degistirilemez, degistirmek icin setter yaptik______________________________________________________________________________________________________________________
    public void setSeason(String season) {
        this.season = season;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }



    //baska class ta da tum object i yazdirmak icin toString yaptik______________________________________________________________________________________________________________________
    @Override
    public String toString() {
        return "CourseTkr{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }




}//class
