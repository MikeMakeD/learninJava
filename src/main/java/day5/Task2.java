package day5;


import java.awt.event.WindowFocusListener;

public class Task2 {
    public static void main(String[] args) {
    Motorbike bike = new Motorbike("mazda","green",1999);
    bike.info();
    }
}
class Motorbike{
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    private String model;
    private String color;
    private int yearRelease;

    public Motorbike(String model, String color, int yearRelease){
        this.model = model;
        this.color = color;
        this.yearRelease = yearRelease;
    }

    protected void info(){
        System.out.println(getColor());
        System.out.println(getModel());
        System.out.println(getYearRelease());
    }
}

