package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
        String[] earlyBirds= Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBirds));


        System.out.println("--------------------------------------");

        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2,6);

        System.out.println(Arrays.toString(ch2));

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        int[] result = Arrays.copyOfRange(scores,3,8);

        System.out.println(Arrays.toString(result));



    }
}
