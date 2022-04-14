package day31_Constructor;

public class Rectangle {


    public double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2* (length*width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", are=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}
