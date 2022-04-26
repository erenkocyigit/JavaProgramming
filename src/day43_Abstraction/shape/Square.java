package day43_Abstraction.shape;

public class Square extends Shape {

    private double s;

    public Square(String name, double s) {
        super(name);
        setS(s);
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    @Override
    public double area() {
        return s*s ;
    }

    @Override
    public double perimeter() {
        return 4*s;
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + s +
                "/ area= " + area() +
                "/ perimeter= " + perimeter() +

                '}';
    }
}
