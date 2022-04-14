package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {


    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("--------------------------------------");
        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);


        System.out.println("--------------------------------------");

        String word = "madam";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("--------------------------------------");

        int count = 0;
        String[] names = {"Anna","Java","Python","racecar","mom","cyde"};
        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);

        String s2 = "aaaabbbbbhashdhasdaavvvvvv";

        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);
    }
}
