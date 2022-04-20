package day42_Exceptions;

public class MorningWorkout {

    public static void main(String[] args) {

        System.out.println("Push up started");

        int pushup = 1;
        for (int i = 0; i < 30; i++,pushup++) {
            System.out.print("\rPush up :" + pushup);

            sleep(1.5);
        }

        System.out.println("\nPush up completed");

        System.out.println("Pull Up Started");

        int pullup = 1;
        for (int i = 0; i < 30; i++,pullup++) {
            System.out.print("\rPull up :" + pullup);

            sleep(2.5);
        }

        System.out.println("\nPull up completed");

    }


    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
