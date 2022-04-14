package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};
        int max = numbers[0];
        int min = numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min=numbers[i];
            }

        }

        System.out.println(max);
        System.out.println(min );

    }
}
