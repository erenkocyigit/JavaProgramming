package day43_Abstraction.shape;

public class Square extends Shape {

    private double s;

    protected Square(String name) {
        super(name);
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




}
