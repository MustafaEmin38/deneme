package day20statickeywordconstructors;

public class Baby {


    String adi="Ece";
    int yas=3;
    String memleket="Mugla";

    public Baby(String adi, int yas, String memleket) {
        this.adi = adi;
        this.yas = yas;
        this.memleket=memleket;
        System.out.println();
    }

    public Baby(String adi, int yas) {
        this.adi = adi;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "adi='" + adi + '\'' +
                ", yas=" + yas +
                ", memleket='" + memleket + '\'' +
                '}';
    }
}


