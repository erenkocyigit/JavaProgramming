package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void world(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
    }
    public static void cydeo(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello cydeo");
        }
    }
    public static void oneToTenEvenNumbers(){
        for (int i = 1; i <= 10 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        world();
        cydeo();
        oneToTenEvenNumbers();
    }
}
