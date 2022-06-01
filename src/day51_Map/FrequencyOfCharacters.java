package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
//write a program that can return the freq of chars
    //not: must use map


    public static void main(String[] args) {


        String str = "bbcccaaaaa";

        String[] arr = str.split("");


        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            result.put(each,frequency );
        }
        System.out.println(result);



    }

}
