package ReplitExercises;

public class BasicLoopExercises {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i+=10) {
            System.out.print(i+ " ");

        }
        System.out.println();

        int z= 0;
        for (;z<=1000;){
            System.out.print(z+" ");
            z+=10;
        }
        //
        System.out.println();
        System.out.println("=============================");
        for (int i = 3; i < 130; i+=2) {
            System.out.print(i+" ");

        }

        System.out.println();
        int countOfEven = 0 ;
        for (int i = 5; i <= 50; i++) {
            if (i%2==0){
                ++countOfEven;
            }

        }
        System.out.println(countOfEven);

        int j=1;

        for (; j<=10 ; j++){
            System.out.println("12 x " + j + " = " + 12*j);
        }

    }
}
