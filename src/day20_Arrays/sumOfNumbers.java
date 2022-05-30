package day20_Arrays;

public class sumOfNumbers {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        System.out.println("sum = " + sum);

    }
}
/*    public static void main(String[] args) {

        System.out.println("Enter the required size of the array :: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0; i<size; i++){
            myArray[i] = s.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Elements of the array are: "+ Arrays.toString(myArray));
        System.out.println("Sum of the elements of the array ::"+sum);
    }
}

 */
