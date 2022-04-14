package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 25,
                b = 20,
                c = 30;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);
        boolean cIsMedian = (c > b && c < a) || (c > a && c < b);

        if (aIsMedian){
            System.out.println("a is median");
        }
        if (bIsMedian){
            System.out.println("b is median");
        }
        if (cIsMedian){
            System.out.println("c is median");
        }

    }
}
