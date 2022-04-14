package day32_Constructor;

public class Test {

    public Test(){
        System.out.println("A");
    }

    public Test(int a){
        this();
        System.out.println("B"  );
    }

    public Test(double a){
        this(5);
        System.out.println("C");
    }

    public static void main(String[] args) {
        new Test(5);
    }


}
