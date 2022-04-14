package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Eren Kocyigit",
                buildingNumber = "16",
                streetName = "Grundhaldenweg",
                city = "Welzheim",
                state = "Germany",
                zipCode = "73642";

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipCode;
        System.out.println(address);


    }
}
