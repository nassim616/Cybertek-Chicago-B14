package arrays;

//
//
public class ArrayOfBiggestNumber {
   public static void main(String[] args) {
//
////        Given numbers of 3,30,14,6,50,20
////        Find and print the biggest number
////
    int[] arr = {345,3, 30, 2,14, 6, 50, 20};
      int max = arr[0];
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
        max= arr[i];
         }
     }
     System.out.println(max);
  }
}
//      int arr [] = {7,23,45,67,123,12,23};
//      Arrays.sort(arr);
//      System.out.println(arr[arr.length-1]);
//   }



