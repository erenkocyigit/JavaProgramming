package day45_Abstraction;

public interface PropertiesOfInterface {

    int a =1;
    static int b = 200;

/*
    public PropertiesOfInterface(int a){
        this.a=a;
    }
*/
    /*
    static {
        b = 100;
    }
*/
 /*   public void method1(){
        System.out.println("Instance method");
    }

  */
    public static void method2(){
        System.out.println("Static method");
    }
    public abstract void method3();

}
