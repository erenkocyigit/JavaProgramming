package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        String result = "";

        int grade = 90;

        if (grade <= 0 && grade >= 100) {
            if (grade >= 90 && grade <= 100) {
                result = "Excellent";
            } else if (grade >= 80) {
                result = "Great";
            } else if (grade >= 70) {
                result = "Good";
            } else if (grade >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "Invalid";
        }

        System.out.println("=====================");


    }
}
