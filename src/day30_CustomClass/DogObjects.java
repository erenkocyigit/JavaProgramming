package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Kiki";
        dog1.breed = "Kangal";
        dog1.age = 3;
        dog1.gender = 'F';
        dog1.size = "11";
        dog1.color ="White";


        Dog dog2 = new Dog();

        dog2.name = "Lili";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'F';
        dog2.size = "Large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Fifi","german shepard",2,'M',"lARGE","Black");




        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();


        Dog dog4 = new Dog();
        dog4.setInfo("Gogo","Husky",3,'M',"Extra Large","Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sullt","Pit bull",6,'M',"Large","Black");

        System.out.println("-----------------------------------------");

        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};
        ArrayList<Dog> dogsList = new ArrayList<>(Arrays.asList(dogs));

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        for (Dog each : dogs) {
            if (each.gender == 'F'){
                femaleDogs.add(each);
            }
        }
        System.out.println(femaleDogs);


        ArrayList<Dog> maleDogs =new ArrayList<>(dogsList);
        maleDogs.removeIf(p-> p.gender == 'F'    );
        System.out.println(maleDogs);

    }


}
