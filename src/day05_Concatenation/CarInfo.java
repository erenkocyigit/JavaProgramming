package day05_Concatenation;

public class CarInfo {

    public static void main(String[] args) {

        String year = "2012",
                make = "Volkswagen",
                model = "Golf",
                miles = "120000",
                color = "Grey",
                price = "6900";

        String CarInfo = year + " " + make + " " + model + ", " + miles + " miles," + color + "," + "$" + price;
        System.out.println(CarInfo);


    }
}
