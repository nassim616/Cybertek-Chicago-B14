package arrays;
//
import java.util.Arrays;
//
public class SortBiggestAndSmallestNum {
   public static void main(String[] args) {
//
////        3) Given an array with the value of: 31, 20, 25, 20, 3, 48, 26, 12
////        Print out the biggest and smallest values in the array
//
////
       int []arr = { 31 , 20 , 25 , 20 , 3, 48 , 26 , 12 };
           Arrays.sort(arr);
      System.out.println("biggest number " + arr [ arr.length-1]);
       System.out.println("smallest number " + arr [0]);
   }
}
