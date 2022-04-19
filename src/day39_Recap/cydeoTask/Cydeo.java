package day39_Recap.cydeoTask;

import day37_Inheritance.Test;

import java.awt.*;

public class Cydeo {


    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz",21,'M',213123,"Java Developer", 125000);

        Tester tester = new Tester("Olga", 26, 'F',2,"SDET", 110000);

        Teacher teacher = new Teacher("Daniel",32,'M',3,"Math Teacher", 100000);

        Student student = new Student("Suha",30,'M',7,"SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-----------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge());

        System.out.println("-----------------------------");

        developer.work();
        tester.work();
        teacher.work();

        System.out.println("-----------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("-----------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTicket();

        System.out.println("-----------------------------");

        student.eat();
        student.drink();
        student.sleep();




    }

}
