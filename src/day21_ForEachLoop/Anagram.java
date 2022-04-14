package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        char[] each1 = str1.toCharArray();
        char[] each2 = str2.toCharArray();

        Arrays.sort(each1);
        Arrays.sort(each2);

        System.out.println(Arrays.toString(each1));
        System.out.println(Arrays.toString(each2));

        if (Arrays.equals(each1,each2)){
            System.out.println("anagram");
        }else{
            System.out.println("fuck off");
        }







    }
}
