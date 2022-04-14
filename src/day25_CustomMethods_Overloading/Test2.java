package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

import java.awt.*;
import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("----------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("----------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("----------------------------");

        String[] arr4 = {"David","Elvire","aaa","Biural"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("----------------------------");

        int[] n1 = {1,2,3,4,5,6};
        int max1 = ArraysUtility.max(n1);
        System.out.println(max1);

        System.out.println("----------------------------");

        double[] n2 = {2.3,4.3,3.4,6.7,5.4};
        double max2 = ArraysUtility.max(n2);
        System.out.println(max2);

        System.out.println("----------------------------");

        int[] a1 = {1,2,3,4,5,6,7};
        boolean r1=  ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);

        System.out.println("----------------------------");

        double[] a2 ={1.1,2.2,3.3,4.4,5.5};
        boolean r2 = ArraysUtility.contains(a2,2.2);
        System.out.println("r2 = " + r2);

        System.out.println("----------------------------");

        char[] a3= {'a','B','C'};
        boolean r3 = ArraysUtility.contains(a3,'C');
        System.out.println("r3 = " + r3);

        System.out.println("----------------------------");

        String[] a4= {"AAAA","BBBBBB","CCCC"};
        boolean r4 = ArraysUtility.contains(a4,"CCCC");

    }
}
