package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("max","husky",'M',"Small",2,"black");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();


        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',"small",3,"brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        //cat.bark();
        //cat.hunt();
        cat.scratch();


        Tiger tiger = new Tiger();
        tiger.setInfo("sher","Bengal",'M',"Large",3,"red");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();


    }
}
