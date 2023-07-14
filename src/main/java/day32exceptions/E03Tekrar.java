package day32exceptions;

public class E03Tekrar {
    public static void main(String[] args) {
        /*
    throw keyword bir methodun body si icinde;
    istedigimiz yerde, istedigimiz kosullar icin istedigimiz kadar Exception atmamizi saglar

    throw keyword yazildiktan sonra bir exception class objecti olusturulur

    Exception class constructor inin parantezi icine istediginiz Exception mesajini yazabilirsiniz
     */

        //asagida method body de exception firlattik ve app i kitledik. burda da exception i handle edecez
        try {
            printAge(-63);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());//serr icine "e.getMessage()" yazarak direkt asagida yazdigimiz mesaji vermesini istedik
        }
    }//main




    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");// exception i biz olusturdugumuz icin teknik mesaji biz verdik
        }else {
            System.out.println(age);
        }
    }



/*
    Note:  Bazen javanin bilmedigi ozel durumlar olabilir. Mesela yas degeri negatif olmaz ama java bunu bilmez.
           Yas neg yazilirsa ne yapmasi gerektigini ona biz soyleriz
           burda java ya diyoruz ki; yas neg olursa app i durdur exception i firlat
           *throw new IllegalArgumentException("Age cannot be negative");
           *new ==> sifirdan yeni bir object olusturur
           *IllegalArgumentException(); ==> hangi obj yi uretir? yaninda hangi  const varsa o class tan obj uretir
           *"Age cannot be negative"  ==> nasil bir const? String parametreli bir const

 */

    //handle yaparken senaryoya gore istersek "try catch" kullaniriz, istersek throw exception atariz
    //try catch le; bir hata durumunda cozum uretiriz, her seye ragmen devam etmesini saglariz
    //throw la; lastikleri patlatiriz. ^_^ uygulamanin calismasini durdururuz.
    //handle her yerde kullanilabilir. ister main icinde ister disinda...
}//class
