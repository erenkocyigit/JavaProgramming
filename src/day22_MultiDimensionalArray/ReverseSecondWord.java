package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] word = sentence.split(" ");

        String reverse = "";

        for (int i = word[1].length()-1; i>=0 ; i--){
            reverse += word[1].charAt(i);
        }
        System.out.println(reverse);

        //sentence = sentence.replaceFirst(word[1], reverse);
        word[1]= reverse;
        System.out.println(Arrays.toString(word));
        for (String words : word) {
            System.out.print(words+" ");
        }

    }
}
