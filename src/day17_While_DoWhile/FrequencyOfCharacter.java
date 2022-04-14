package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { // i : indexes if str
            char eachChar = str.charAt(i);
            if (eachChar == ch){
                frequency++;
            }
        }
        System.out.println(frequency); //if given char ch is matching with the eachChar , then ch is appeared in the string

    }
}
