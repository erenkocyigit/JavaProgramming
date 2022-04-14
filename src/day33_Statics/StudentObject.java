package day33_Statics;

import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

        Student student1= new Student("eren");
        Student student2= new Student("bet",'F');
        Student student3= new Student("gr",'m',25);
        Student student4= new Student("tb",'m',31);

        System.out.println(student1 == student2);

        Student[] students = {student1,student2,student3,student4};

        System.out.println(Arrays.toString(students));


    }


}
