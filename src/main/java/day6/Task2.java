package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbuss",1994,32,3000 );
        airplane.setLength(34);
        airplane.setWeight(2500);
        airplane.fillUp(1000);
        airplane.fillUp(500);
        airplane.info();
    }
}
