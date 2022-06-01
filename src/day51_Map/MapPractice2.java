package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Anthony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Jalil", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 123000);
        map.put("Steven", 135000);

        //who has the max salary
        String name1 = "";
        String name2 = "";

        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue() > maxSalary) {
                maxSalary = each.getValue();
                name1 = each.getKey();
            }
        }
        System.out.println(maxSalary);
        System.out.println(name1);

        //who has the min salary
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue() < minSalary) {
                minSalary = each.getValue();
                name2 = each.getKey();
            }
        }
        System.out.println(minSalary);
        System.out.println(name2);


        //how many employees has the salary between 120k~150k?

        int salaryBetween120_150 = 0;

        for (Integer each : map.values()) {
            if (each >= 120000 && each <= 150000) {
                salaryBetween120_150++;
            }
        }
        System.out.println(salaryBetween120_150);

        System.out.println("---------------------------------------------------------------------------------------------");
        //display the names of the employees who are making less than 118k?
        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            if (pairs.getValue() < 118000) {
                System.out.println(pairs.getKey());
            }
        }

        System.out.println("---------------------------------------------------------------------------------------------");

        //increase the salary of each employee by 10k uf the current salary of employee is less than 120K

        for (Map.Entry<String, Integer> pairs  : map.entrySet()) {
            if (pairs.getValue()<120000){
                pairs.setValue(pairs.getValue()+10000   );
            }
        }
        System.out.println(map);


    }
}
