package day43_Abstraction.shape;

public abstract class Shape {


    private String name;

    protected Shape(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Name is empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
