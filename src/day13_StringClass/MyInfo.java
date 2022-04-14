package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your gender");
        String gender = scan.next();

        scan.nextLine();
        System.out.println("Enter your full name ");
        String fullName = scan.nextLine();



    }
}
