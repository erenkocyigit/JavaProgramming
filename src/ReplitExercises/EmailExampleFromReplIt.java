package ReplitExercises;

import java.util.Locale;
import java.util.Scanner;

public class EmailExampleFromReplIt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter valid email: craig_federighi@apple.com");
        String email = input.next();

        int indexOf_ = email.indexOf("_");
        int indexOfAtSign = email.indexOf("@");
        int indexOfDot = email.indexOf(".");

        String firstName = email.substring(0,indexOf_);
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        String lastName = email.substring(indexOf_+1,indexOfAtSign);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        String domain = email.substring(indexOfAtSign+1,indexOfDot);


        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);




    }
}
/*
//Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
//
//        Example:
//        Input: craig_federighi@apple.com
//        Output:
//        First name: Craig
//        Last name: Federighi
//        Domain: apple
//
//
//
 */