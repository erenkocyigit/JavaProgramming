package day43_Abstraction.shape;

public class Circle extends Shape {

    private static double pi = 3.14;
    private double radius;

    public static double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;

    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius= " + radius +
                "/ area= " + area() +
                "/ perimeter= " + perimeter() +
                '}';
    }
}
