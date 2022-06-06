package day52_Map_FunctionalInterface;

// lambda : () -> {}

public class Test {

    public static void main(String[] args) {

        // function 1 : create a function that can display a number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even number");
            } else {
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);


        // function 2 : create a function that can check if a person is eligible to buy smoke

        MyFirstFunctionalInterface eligibleToBuyAlcohol;
        eligibleToBuyAlcohol = (age) -> {
          if (age >=21){
              System.out.println("Eligible");
          }else {
              System.out.println("Not eligible");
          }
        };
        eligibleToBuyAlcohol.apply(100);


        // function 3 : create a function that can display the cube of a number

        MyFirstFunctionalInterface printCube;

        printCube = (n) -> {
            System.out.println(n*n*n);
        };
        printCube.apply(4);

        //function 4 : create a function that can check if a number is evenly divisible by 3&5

        MyFirstFunctionalInterface divisibleBy3And5= n -> {
          if (n%15==0){
              System.out.println(n + " is divisible by 3 and 5");
          }else{
              System.out.println(n + " is not divisible");
          }
        };

        divisibleBy3And5.apply(30);

    }

}
