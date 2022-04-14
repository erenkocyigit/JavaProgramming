package day24_CustomMethods_Return;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {
        nameOfTheMonth(50);



    }
    public static void nameOfTheMonth(int number) {

        if (number<1 || number >12){
            System.out.println("Invalid");
            return;
        }

        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "June" :
                (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";

        System.out.println("Month name = " + name);
    }
}
