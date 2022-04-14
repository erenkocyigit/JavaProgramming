package day20_Arrays;

import java.util.Scanner;

public class ArrayMonths {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number from 1-12 :");
        int monthNumber = scan.nextInt();

        String[] months = {"January","February","March","April","May","June","July","August","September","October","Novermber","December"};

        for (int i = 0 ; i<months.length;i++){
            System.out.println(months[i]);
        }


    }
}
