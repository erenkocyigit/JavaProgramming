package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("John",123000);
        map.put("Anthony",100000);
        map.put("Jimmy",115000);
        map.put("James",110000);
        map.put("Jalil",145000);
        map.put("Conor",85000);
        map.put("Josh",117000);
        map.put("Cory",118000);
        map.put("Anderson",123000);
        map.put("Steven",135000);

        //who has the max salary
        String name1 = "";
        String name2= "";

        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue()>maxSalary){
                maxSalary= each.getValue();
                name1 = each.getKey();
            }
        }
        System.out.println(maxSalary);
        System.out.println(name1);

        //who has the min salary
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue()<minSalary){
                minSalary= each.getValue();
                name2 = each.getKey();
            }
        }
        System.out.println(minSalary);
        System.out.println(name2);





    }
}
