package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] b) {

        String str = "Cat Cat Dog Dog";

        int  frequency = 0 ;

        for (int i = 0; i < str.length()-2; i++) {
            String eachSub = str.substring(i,i+3);

            if (eachSub.equals("Cat")){
                frequency++;
            }
        }
        System.out.println(frequency);

    }
}

