package day43_Abstraction.employee;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000);
        Developer developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 120000);
        Teacher teacher = new Teacher("Angel", 28, 'F', 22, "English Teacher", 65555);
        Driver driver = new Driver("John",35,'M',42,"Lyft Driver",75000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();


        System.out.println("---------------------------------------");

        developer.work();
        developer.sleep();
        //  developer.bugReport();
        developer.eat();
        developer.unitTest();

        System.out.println("---------------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();

        System.out.println("---------------------------------------");



    }


}
