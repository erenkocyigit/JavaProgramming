package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Britgitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("F")){
              //  employeeMap.replace(entry.getKey(), "Female");
                entry.setValue("Female");
            }
            if (entry.getValue().equalsIgnoreCase("M")){
                //  employeeMap.replace(entry.getKey(), "Female");
                entry.setValue("Male");
            }
        }
        System.out.println(employeeMap);

        System.out.println("-0-----------------------------------------------");

        //display the names of all female employees

        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            if (eachPair.getValue().equalsIgnoreCase("Female")){
                System.out.println(eachPair.getKey() );
            }
        }




/*

        for (String key : employeeMap.keySet()) {
            if (employeeMap.get(key).equalsIgnoreCase("m")) {
                employeeMap.replace(key,"Male"  );
            }
            if (employeeMap.get(key).equalsIgnoreCase("f")) {
                employeeMap.replace(key,"Female"  );
            }
        }
        System.out.println(employeeMap);




 */

    }
}
