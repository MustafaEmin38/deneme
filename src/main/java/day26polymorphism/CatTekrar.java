package day26polymorphism;

public class CatTekrar extends AnimalTekrar{
    public void meow(){
        System.out.println("Cats meow...");
    }
    //Override annotation (notasyon) Override kurallarinin java tarafindan kontrol edilmesini saglar
    @Override//gecersiz kilmak demek>> parent daki eat gecersiz oldu
    public void eat(){
        //Child daki override edilmis eat() methoduna Overriding Method(override eden-gecersiz kilan>etken) denir
        System.out.println("Cats eat...");
    }

    @Override
    protected void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public AnimalTekrar create() {
        return new CatTekrar();
    }

    @Override
    public int add(int a, int b) {//int primitive old icin parent-child iliskisi olamaz ve return type degistirilemez
        return a+b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {//wrapper larda parent-child iliskisi yoktur dolaysiyle return type degistirilemez
        return a*b;
    }

    // public final double circleArea(double r){    ==> yorumu kaldirinca hata verir override edilemez
    //     return 3.14*r*r;
    // }

}//class
