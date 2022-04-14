package ReplitExercises;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //CODE HERE:
        boolean even = number % 2 == 0;
        boolean odd = !even;

        if (even) {
            System.out.println(number + " is even");
        }
        if (odd) {
            System.out.println(number + " is odd");
        }


    }
}
