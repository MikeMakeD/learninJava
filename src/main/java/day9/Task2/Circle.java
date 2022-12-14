package day9.Task2;

public class Circle extends Figure{
    private double radius;

    public Circle(int radius,String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return Math.PI*radius;
    }
}
