package day08_IfStatements;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        int month = 4;
        boolean _31days = month == 1 || month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12 ;
        boolean _30days = month == 4 || month == 6 ||month == 9 ||month == 11 ;
        boolean _28days = month == 2;


        if (_31days ) {
            System.out.println("31 days");
        }
        if (_30days ) {
            System.out.println("28 days");
        }
        if (_28days ) {
            System.out.println("28 days");
        }


    }
}
