package day24_CustomMethods_Return;

import java.util.Locale;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("Cydeo", "School");

        System.out.println("-------------------------------");

        domain("m.erenkocyigit@gmail.com");

        System.out.println("-------------------------------");

        String[] emails = {"asdasd@gmail.com", "jim@hanii.com", "beti@hotmail.com", "babayari@cydeo.com  "};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("-------------------------------");

        nameOfTheMonth(11);

        System.out.println("-------------------------------");

        nameOfTheDay(2);

        System.out.println("-------------------------------");

        daysInMonth(12);
    }

    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }

    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    public static void nameOfTheMonth(int number) {

        String name = "";

        if (number >= 1 && number <= 12) {

            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "June" :
                    (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";
        } else {
            name = "Invalid.";

        }
        System.out.println("Month name = " + name);
    }

    public static void nameOfTheDay(int number){
        String name = "";

        if (number>=0 && number<=7){
            name = (number == 1) ? "Monday" :(number == 2) ? "Tuesday" : (number == 3)? "Wednesday" : (number == 4)? "Thursday" : (number == 5)? "Friday" : (number ==6)? "Saturday" :"Sunday";
        }else{
            name = "Invalid.";
        }
        System.out.println("Day name = " + name);

    }

    public static void daysInMonth(int number){

        int daysNumber = 0;

        if (number >= 1 && number <=12){

            daysNumber = (number == 1)? 31: (number ==2)? 30: (number ==3 )? 29: (number ==4)? 31: (number==5)? 29:(number == 6)? 31: (number ==7)? 30: (number ==8 )? 29: (number ==9)? 31: (number==10)? 29
                    :(number==11)? 31:31;

        }else{
            System.out.println("Invalid");
        }
        System.out.println("daysNumber = " + daysNumber);

    }

}
