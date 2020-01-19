package multiArrays;

public class twoDArrayMethod {
    public static void main(String[] args) {

//     Sample values: {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}}
//
//     Create a method that will return the biggest numbers from a 2D array
//
        int arr [] [] = {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};
        System.out.println(biggestNumberFrom2DArray(arr));
    }

    public static int biggestNumberFrom2DArray(int [] [] twoDarr) {
     int biggest = twoDarr[0] [0];
     for (int i = 1 ; i < twoDarr.length; i++){
         for (int j = 0 ; j < twoDarr[i].length ; j++){
             if (twoDarr[i] [j] > biggest){
                 biggest = twoDarr[i] [j];
             }
         }
     }
   return biggest;

 }


}
