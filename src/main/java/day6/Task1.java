package day6;

public class Task1 {
    public static void main(String[] args) {
        Automobile auto = new Automobile();
        Motorbike moto = new Motorbike();
        auto.info();
        moto.info();
        auto.setYearRelease(2022);
        moto.setYearRelease(2022);
        System.out.println(moto.yearDifference(2010));
        System.out.println(auto.yearDifference(2010));
    }
}
