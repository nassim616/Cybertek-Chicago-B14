package arrays;

import java.util.Arrays;

public class ArrayBinarySearchEx {
    public static void main(String[] args) {

//        int [] nums = {2,5,7,14};
//        System.out.println("index of 2 is : " + Arrays.binarySearch(nums,1));
//        System.out.println("index of 2 is : " + Arrays.binarySearch(nums,2));
//        System.out.println("index of 7 is : " + Arrays.binarySearch(nums,7));
//        System.out.println("index of 9 is : " + Arrays.binarySearch(nums,9));


        int[] arr = {45, 23, 6, -3, 66};

        int[] nums = {45, 23, 6, -3, 66};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums, -3));
    }
}