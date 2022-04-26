package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

        Honda honda = new Honda("Civic","White",2011,14000);
        Audi audi = new Audi("A4","Black",2014,20000);
        Tesla tesla = new Tesla("Model 3", "Black",2017,21000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Baby Blue");

        honda.setPrice(1000);
        tesla.setPrice(13000);
        audi.setPrice(12000);


        System.out.println("----------------------------");



        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);




    }

}
