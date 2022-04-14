package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Ferrari"," 458 Italia","Red",2013,195000);
        System.out.println(car1);
        car1.drive();


        Car car2 = new Car();
        car2.setInfo("Lamborghini", "Aventador","Black",2013,100000);
        System.out.println(car2);
        car2.stop();


        Car car3 = new Car();
        car3.setInfo("Ford","Mustang", "Grey",2013,14000);
        System.out.println(car3);
        car3.start();

        //Car[] cars = {car1,car2,car3};
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));


        for (Car each : carsList){
            System.out.println(each.brand + " : " + each.price);
        }

        carsList.removeIf(p -> p.brand.equals("Ferrari") && p.year>= 2005 && p.year <=2019    ) ;
        carsList.removeIf(p -> p.brand.equals("Lamborghini") && p.year>=1995 && p.year<=2000  );




    }

}
