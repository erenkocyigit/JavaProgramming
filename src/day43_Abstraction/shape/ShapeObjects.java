package day43_Abstraction.shape;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle("Sorkil",3);
        Rectangle rectangle = new Rectangle("Rektengil", 3,5);
        Square square = new Square("Sikueyr",4);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        circle.setRadius(50);
        rectangle.setWidth(40);
        rectangle.setLength(60);
        square.setS(55);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

    }

}
