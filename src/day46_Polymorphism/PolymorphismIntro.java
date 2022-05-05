package day46_Polymorphism;

import day01_JavaIntro.Test;
import day37_Inheritance.animalTask.Animal;
import day37_Inheritance.animalTask.Dog;
import day39_Recap.cydeoTask.*;
import day44_Abstraction.Playable;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Rectangle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double b2 = 5.5;

        Boolean r1 = true;

        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer", 155000);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000 );

        ArrayList<Employee> cydeoEmployees = new ArrayList<>();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);

        System.out.println("----------------------------");

        Employee employee = new Teacher("Angel",28,'F',22,"English Teacher",85000 );
        employee.work();

        Animal animal = new Dog("max","Husky",'F',3,"Small");
        animal.eat();
        animal.drink();

        Playable animal2 = new day44_Abstraction.Dog("ASD","ddd",'F',3  ,"Small","black");
        System.out.println(animal2.isFriendly);
        animal2.play();

        Animal animal3 = new Animal("max","Husky",'F',3,"Small");

        Shape shape = new Circle(5);
        shape.area();

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;






    }


}
