package ReplitExercises;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        //your code here
        if (num > 0) {
            System.out.println("positive");
        }
        if (num < 0) {
            System.out.println("negative");
        }
        if (num == 0) {
            System.out.println("zero");
        }


    }
}
