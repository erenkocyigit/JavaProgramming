package ReplitExercises;

public class Fibonacci {
    public static void main(String[] args) {

        int num1 = 0, num2 = 1;
        int sum;

        String series = "" + num1 + " " + num2 + " ";

        for (int i = 2; i < 6; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            series += sum + " ";
        }

        System.out.println("series = " + series);
        System.out.println("final number in the sequence is : " +num2 );

    }
}
