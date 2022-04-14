package day22_MultiDimensionalArray;

public class task3 {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D.length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();

        }


    }
}
