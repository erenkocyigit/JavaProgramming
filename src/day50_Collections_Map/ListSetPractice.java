package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);

        List<Integer> list = new ArrayList<>(set);

        List<String> names1 = null   ;

        System.out.println("-----------------------------------");

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));

        ((Stack)chars).pop();

        System.out.println("chars = " + chars);

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("Kamel","jamel","asddd","Eren","Bety"));

        ((LinkedList<String>) names).poll();
    }

}
