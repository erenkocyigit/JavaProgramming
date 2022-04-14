package day18_NestedLoop;

import java.util.Scanner;

public class LoginBreakContinue_Mine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your username : ");
            String username = scan.next();
            System.out.println("Enter your password :");
            String password = scan.next();
            if ( username.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Login Succesfully.");
                break;
            }else if (i == 2){
                System.err.println("Locked");
            }else {
                System.out.println("Something went wrong please re-enter  ");
            }

            
        }


    }
}
