package day10_NestedIf;

public class GradeReport2 {
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

        String result1 = (grade <= 0 && grade >= 100) ? (grade >= 90) ? "Excellent" : (grade >= 80) ? "Great"
                : (grade >= 70) ? "Good" : (grade >= 60) ? "Passed" : "Failed" : "Invalid Score";

        System.out.println("result1 = " + result1);

        System.out.println("=====================");

        String result2 = "";

        if (grade <= 0 && grade >= 100) {
          result2=  (grade >= 90) ? "Excellent" : (grade >= 80) ? "Great" : (grade >= 70) ? "Good" : (grade >= 60) ? "Passed" : "Failed" ;

        }
        else {
            result2 = "Invalid Score";
        }

    }
}
