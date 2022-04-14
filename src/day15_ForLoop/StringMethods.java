package day15_ForLoop;

import java.sql.Struct;

public class StringMethods {

    public static void main(String[] args) {

        String str = "";

        boolean r = str.isEmpty();
        System.out.println(r);

        String str1 =  "   ";
        boolean s = str1.isBlank();
        System.out.println(s);

        System.out.println("-------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


        System.out.println("-------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 =  sentence.toLowerCase().contains("java");


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("-------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
