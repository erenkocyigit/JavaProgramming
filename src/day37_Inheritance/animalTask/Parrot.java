package day37_Inheritance.animalTask;

public class Parrot extends Animal {

    public Parrot(String name, String breed, char gender, int age, String size) {
        super(name, breed, gender, age, size);
    }

    public void sing(){
        System.out.println(name + " is singing");
    }
}
