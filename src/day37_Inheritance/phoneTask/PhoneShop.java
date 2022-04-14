package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "black" );
        Samsung samsung = new Samsung( "Galaxy","5 inches", 900,"black");
        Nokia nokia = new Nokia( "Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(12312312);
        iphone.faceTime(12312314);
        iphone.faceTime("jesus@gmail.com");

        System.out.println(" - -- --  - - -- - - -- - --");

        samsung.freeze();

        System.out.println(" - -- --  - - -- - - -- - --");

        nokia.selfDefense();

        System.out.println("---------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);


    }


}
