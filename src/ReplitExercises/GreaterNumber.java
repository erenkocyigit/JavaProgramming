package ReplitExercises;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        //WRITE YOUR CODE HERE:
        if (a > b) {
            System.out.println(a + " is greater");
        }
        if (b > a) {
            System.out.println(b + " is greater");
        }

    }
}
