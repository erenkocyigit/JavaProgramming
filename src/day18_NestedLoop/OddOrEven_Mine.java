package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven_Mine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("Please enter a number : ");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
            System.out.println("Would you like to continue ?");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Please give an invalid answer (yes,no)");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("yes")) {

            } else if (answer.equals("no")) {
                break;
            }


        }

    }
}
