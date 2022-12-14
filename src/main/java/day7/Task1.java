package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a11 = new Airplane("самолет 1",1990,26,12);
        Airplane a22 = new Airplane("самолет 2",1990,23,12);
        Airplane.compareAirplane(a11,a22);
    }
}