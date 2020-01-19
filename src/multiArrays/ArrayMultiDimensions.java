package multiArrays;

public class ArrayMultiDimensions {
    public static void main(String[] args) {
        int[][] arr =
                {{44, 62, 12, 51, 33},
                        {33, 66, 54, 12, 25},
                        {65, 78, 56, 42, 22},
                        {14, 12, 15, 16, 14}
                };
        System.out.println(arr[2][1]);
        System.out.println(arr[2][1]);
   for (int i= 0 ;i<arr.length;i++ ){
       for (int j = 0 ; i<arr.length ;i++){
           System.out.println(arr[i][j] + "|t");
       }
       System.out.println();
   }
    }
}