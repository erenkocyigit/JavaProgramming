package day31_Constructor.scrumTask;

import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {


        //testers
        Tester tester1 = new Tester("Layan", 11, "QA", 110000);
        Tester tester2 = new Tester("Ali", 43, "QA", 140000);
        Tester tester3 = new Tester("Alex", 44, "QA", 135000);
        Tester tester4 = new Tester("Lala", 23, "QA", 110000);

        Tester[] testers = {tester2,tester3,tester4};

        //developer

        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2 = new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4 = new Developer("Olga", 21, "Senior Developer", 125000);

        Developer[] developers = {developer2,developer3,developer4};

        //1 scrum team object
        ScrumTeam scrum = new ScrumTeam("Nigara","Huseyin","Neira",14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("------------------------------------------------");

        for (Tester eachTester : scrum.testersList ){
            System.out.println(eachTester.name + " " + eachTester.salary);
        }

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name + " " +eachDeveloper.salary);
        }

        System.out.println("------------------------------------------------");

        scrum.removeTester(23);

        System.out.println(scrum);

        scrum.removeDeveloper(22);

        System.out.println(scrum);




    }


}
