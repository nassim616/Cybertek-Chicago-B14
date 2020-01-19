package multiArrays;

import java.util.Arrays;
import java.util.Random;

public class Random2DArray {
    public static void main(String[] args) {


//
//        Create a method that will generate a random 2D int array. Take two parameters.
//            The first one for how many 1D arrays you want,
//             and second how many elements each 1D array should have

        System.out.println(Arrays.deepToString(methodeName(8, 5)));


    }

    public static int[][] methodeName(int num, int num2) {

        int[][] arr = new int[num][num2];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = random.nextInt(50);
            }

        }
        return arr;
    }
}