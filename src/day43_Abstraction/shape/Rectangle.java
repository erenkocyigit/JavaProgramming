package day43_Abstraction.shape;

public class Rectangle extends Shape{

    private double width,length;

    public Rectangle(String name, double width, double length) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return (2*(width*length));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "/ area= " + area() +
                "/ perimeter= " + perimeter() +
                '}';
    }
}
