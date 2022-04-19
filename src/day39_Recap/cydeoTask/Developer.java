package day39_Recap.cydeoTask;

public class Developer extends Employee {

    public void fixingBugs(){
        System.out.println(getJobTitle() + " " + getName() + " is fixing the bug");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is working with bugs");
    }

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }
}
