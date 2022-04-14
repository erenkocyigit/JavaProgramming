package day19_LoopPractices;

public class DuplicatedChars {
    public static void main(String[] args) {

        String str = "abbccdddee";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (each == ch) {
                    count++;
                }
            }
            if (count == 2) {
                if (result.contains(ch+"")){
                    continue;
                }
                result += ch + "";
            }

        }
        System.out.println(result);


    }
}
