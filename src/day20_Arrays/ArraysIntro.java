package day20_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {

    public static void main(String[] args) {

        String[] myGroups = new String[5];
        myGroups[0] = "Gunay";
        myGroups[1]="Neira";
        myGroups[2]="Suat";
        myGroups[4]="Hulya";



        System.out.println(Arrays.toString(myGroups));

        System.out.println("------------------------------------------------------");

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 12;
        if (number < 1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);




    }
}
