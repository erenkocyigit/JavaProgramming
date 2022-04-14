package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(5);
        ageOfPerson(1995);

    }

    public static void oddOrEven(int number) {

        if (number % 2 == 0){
            System.out.println(number + " is even number.");
        }else {
            System.out.println(number + " is odd number.");
        }

    }

    public static void ageOfPerson(int birthYear){

        int age = 2022 - birthYear;
        System.out.println("Your age is: " + age);

    }

    public static void  printNumbers(int x, int y){

    }
}
