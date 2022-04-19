package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square);

        square.setSide(20);

        System.out.println(square);

        System.out.println("-------------------------------");

        Rectangle rectangle = new Rectangle(20,40);
        System.out.println(rectangle);

        rectangle.setLength(30);
        System.out.println(rectangle.getLength());

        System.out.println(rectangle);



        System.out.println("-------------------------------");
        Circle circle = new Circle(2);
        System.out.println(circle);


    }

}
