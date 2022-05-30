package ReplitExercises;

public class ReverseStrinq {

    public static void main(String[] args) {


        String str = "Reverse this";
        String reversed= "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed+=str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reversed);


    }


}
/*
    public static String reversed(String str){


        String reversed= "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed+=str.charAt(i);
        }

        return reversed;
    }
 */
