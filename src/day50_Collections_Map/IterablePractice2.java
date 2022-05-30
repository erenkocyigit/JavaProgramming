package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","ahmed","aHmEd","Ercon","Daniel","Mustafa","Mohammed","Ahmed","ahmed","Yuliaa","Chris"       ));

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equalsIgnoreCase("ahmed")){
                iterator.remove();
            }

        }
        System.out.println(names);



        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed","ahmed","aHmEd","Ercon","Daniel","Mustafa","Mohammed","Ahmed","ahmed","Yuliaa","Chris"       ));

        for (Iterator<String> i=names2.iterator() ; i.hasNext() ; )  {
            if (i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }
        System.out.println(names2);

        System.out.println("-=------------------------------------------");


        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList("Ahmed","ahmed","aHmEd","Ercon","Daniel","Mustafa","Mohammed","Ahmed","ahmed","Yuliaa","Chris"       ));

        names3.removeIf(each -> each.equalsIgnoreCase("ahmed"));

        System.out.println(names3);




    }




}
