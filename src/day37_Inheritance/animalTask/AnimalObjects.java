package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex","Husky",'M',1,"Small");

        System.out.println(dog1);
        dog1.bark();
        //dog1.scratch();

        Cat cat1 = new Cat("Love","Siamese",'F',2,"Large");

        System.out.println(cat1);
        cat1.scratch();
        //cat1.bark();

        Parrot parrot1 = new Parrot("King","Macaw",'M',3,"Small");

        System.out.println(parrot1);
        parrot1.sing();
        //parrot1.bark();

    }



}
