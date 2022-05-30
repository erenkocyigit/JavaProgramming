package day51_Map;

import day32_Constructor.Car;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Anthony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Jalil", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cory", 145000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        //displays the names of all employees who has the maximum salaries


        //who has max salary
        /*
        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue() > maxSalary) {
                maxSalary = each.getValue();
                name1 = each.getKey();
            }
        }

         */

        int maxSalary = Collections.max(map.values());

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() == maxSalary){
                System.out.println(pair.getKey());
            }
        }


    }
}
