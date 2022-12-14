package day9.Task2;

public class Triangle extends Figure{
    private double leg1;
    private double leg2;
    private double hypotenuse;

    public Triangle(double leg1,double leg2,double hypotenuse,String color) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double area() {
        return (leg1*leg2)/2;
    }

    @Override
    public double perimeter() {
        return leg2+leg1+hypotenuse;
    }
}
