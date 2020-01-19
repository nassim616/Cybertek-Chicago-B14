package multiArrays;

import java.util.Arrays;

public class sumDiagonal2DArray {
    public static void main(String[] args) {
//
//    Create a method that will take 2d array and return the difference between the sum of
//    the diagonals

        int[][] nums = Random2DArray.methodeName(4, 4);
//        System.out.println(Arrays.deepToString(nums));
        printArray(nums);
        System.out.println(differenceOfSum(nums));
    }

    public static void printArray(int[][] a) {
        for (int[] arr : a) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int differenceOfSum(int[][] arr) {
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            sumOne += arr[i][i];
            sumTwo += arr[j][i]; //arr[arr.length-1-i][i]
        }
        return Math.abs(sumOne - sumTwo);

    }
}








