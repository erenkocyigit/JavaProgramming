package ReplitExercises;

import java.util.Scanner;

public class UpperBound {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a value");
        int upperBound = scan.nextInt();

        int sum = 0;
        boolean check = true;

        for (; check;){
            if (upperBound>=1){
                for (int i = 1 ; i<= upperBound ; i ++){
                    sum+=i;
                }
                check   =false;
            }else{
                System.out.println("please give again");
                upperBound =scan.nextInt();
                check =true ;
            }
        }
        System.out.println("sum = " + sum);


    }
}
