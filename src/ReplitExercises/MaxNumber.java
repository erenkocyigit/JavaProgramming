package ReplitExercises;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers ={1,3,4,56,7,1,1,2,3,5};

        int max = numbers[0];
        int min = numbers[0];


        for (int each : numbers) {
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);

        for (int each : numbers) {
            if (each<min){
                min=each;
            }
        }
        System.out.println(min);



    }
}
