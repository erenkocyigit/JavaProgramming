package day47_Polymorphism;

import day37_Inheritance.animalTask.Animal;
import day37_Inheritance.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Shape shape = (Shape) new Circle(4); //upcasting

        Animal animal = new Dog("Max","Husky",'F',3,"Small");



    }
}
